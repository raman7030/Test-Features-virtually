package p067l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.֫ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4278 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۚᩴܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f81889 = {2511, 2415, 2400, 2407, 2403, 2415, 2426, 2407, 2401, 2400, 8665, 14880, 14895, 14888, 14892, 14880, 14901, 14888, 14894, 14895, 14901, 14899, 14880, 14895, 14898, 14893, 14880, 14901, 14888, 14894, 14895, 14872, 6810, -7353, -7352, -7345, -7349, -7353, -7342, -7345, -7351, -7352, 3766, -29967, -29954, -29959, -29955, -29967, -29980, -29959, -29953, -29954};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ View f9497;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f9498;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ View f9499;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C12996 f9500;

    /* JADX WARN: Code duplicated, block: B:65:0x025d A[PHI: r2 r3 r17 r18
      0x025d: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r17v18 int) = (r17v4 int), (r17v7 int), (r17v19 int) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r18v26 int) = (r18v3 int), (r18v6 int), (r18v27 int) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (p067l.C1053.m56327() < 0) goto L12;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationRepeat(Animator animator) {
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55979;
        int i5;
        int i6;
        int iM55681;
        int i7;
        int i8;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short[] sArr = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = -1718457013;
        int i17 = C0989.f81920;
        int i18 = C0930.f81879;
        int iM559710 = (i18 - C0946.m55979("ۛ᩸")) * 75;
        int i19 = ((iM559710 ^ i17) * 31817) ^ 1432527587;
        int i20 = iM559710 ^ (-605509549);
        short[] sArr2 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 28383) >> 31));
            switch (i16) {
                case -1961599420:
                case 1227139671:
                    i9 = i9;
                    i2 = i10;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ۛ֫") + i17) * (-5);
                        i3 = ((iM55680 ^ i18) * 13605) ^ 1771776971;
                        i4 = 210657461;
                    } else {
                        iM55680 = C0946.m55979("ᩴܽ") ^ i18;
                        i3 = ((iM55680 ^ i17) * (-24551)) ^ (-746099376);
                        i4 = 1378572161;
                    }
                    i20 = iM55680 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case -1937825507:
                case 364647057:
                    i9 = i9;
                    i2 = i10;
                    c = ' ';
                    if (C0898.f81858 > 0) {
                        iM55680 = (C0946.m55979("֡᩹") ^ i18) * (-55);
                        i3 = ((iM55680 ^ i17) * (-26297)) ^ 1214728667;
                        i4 = -213453082;
                        i20 = iM55680 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    } else {
                        i9 = i9;
                        iM55979 = C0946.m55979("֫ۗ") ^ i18;
                        i5 = ((iM55979 ^ i17) * 12151) ^ (-1893665043);
                        i6 = -1787176176;
                        i20 = iM55979 ^ i6;
                        i19 = i5;
                        i10 = i2;
                    }
                    break;
                case -1877165666:
                case 92926190:
                    i2 = i10;
                    i12 = 388838961;
                    if (!C1048.f81963) {
                        i9 = i9;
                        iM55680 = (C0946.m55979("ܺܰ") ^ i17) * 37;
                        i3 = ((iM55680 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                        i20 = iM55680 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    } else {
                        iM55979 = C0873.m55680("ۘܽ") ^ i18;
                        i5 = ((iM55979 ^ i17) * (-27619)) ^ (-1804141829);
                        i6 = 623593773;
                        i20 = iM55979 ^ i6;
                        i19 = i5;
                        i10 = i2;
                    }
                    break;
                case -1797133328:
                case -462872093:
                    C1025.m56218(animator, C0930.m55893(sArr, i14, i15, i13));
                    break;
                case -1630493304:
                case -1011531187:
                    C0937.m55918();
                    break;
                case -1315730630:
                case 722452854:
                    C0930.m55885();
                    if (C1071.f81975 > 0) {
                        i9 = i9;
                        i2 = i10;
                        iM55680 = (C0873.m55680("ۢ۫") + i17) * (-31);
                        i3 = ((iM55680 ^ i18) * (-13519)) ^ 684500723;
                        i4 = -830701720;
                        i20 = iM55680 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    }
                    i9 = i9;
                    i2 = i10;
                    iM55680 = (C0946.m55979("ۛ֫") + i17) * (-5);
                    i3 = ((iM55680 ^ i18) * 13605) ^ 1771776971;
                    i4 = 210657461;
                    i20 = iM55680 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case -1266263855:
                case -1005281929:
                    i2 = i10;
                    i9 = s + s2;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("֫ۗ") ^ i18;
                        i5 = ((iM55979 ^ i17) * 12151) ^ (-1893665043);
                        i6 = -1787176176;
                    } else {
                        iM55979 = C0946.m55979("ۜܿ") ^ i18;
                        i5 = ((iM55979 ^ i17) * (-29085)) ^ (-1161440964);
                        i6 = 929474283;
                    }
                    i20 = iM55979 ^ i6;
                    i19 = i5;
                    i10 = i2;
                    break;
                case -1253457886:
                case 600389816:
                    C0845.m55584();
                    C0854.m55595();
                    i9 = i9;
                    i2 = i10;
                    iM55680 = (C0946.m55979("ۛ֫") + i17) * (-5);
                    i3 = ((iM55680 ^ i18) * 13605) ^ 1771776971;
                    i4 = 210657461;
                    i20 = iM55680 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case -1144779670:
                case 2123957932:
                    if (!C1048.f81963) {
                        i9 = i9;
                        i2 = i10;
                        iM55680 = (C0946.m55979("ܺܰ") ^ i17) * 37;
                        i3 = ((iM55680 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                        i20 = iM55680 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    }
                    iM55681 = C0946.m55979("ۗ᩺") ^ i18;
                    i7 = ((iM55681 ^ i17) * 21527) ^ (-1778505772);
                    i8 = 225753037;
                    i20 = iM55681 ^ i8;
                    i19 = i7;
                    i9 = i9;
                    break;
                case -894623792:
                case 744997860:
                    sArr = f81889;
                    if (C1044.m56286() <= 0) {
                        i14 = 33;
                        iM55681 = C0946.m55979("ۗ᩺") ^ i18;
                        i7 = ((iM55681 ^ i17) * 21527) ^ (-1778505772);
                        i8 = 225753037;
                        i20 = iM55681 ^ i8;
                        i19 = i7;
                        i9 = i9;
                    } else {
                        int iM55682 = C0873.m55680("֨ۙ") ^ i17;
                        i20 = iM55682 ^ 982941609;
                        i19 = ((iM55682 ^ i18) * 3573) ^ 1609861363;
                        i14 = 33;
                    }
                    break;
                case -810282225:
                case -760981908:
                    if (C0892.f81851) {
                        int iM559711 = (C0946.m55979("᩻ۨ") + i18) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i20 = iM559711 ^ 1860751714;
                        i19 = ((iM559711 ^ i17) * (-6887)) ^ 838205493;
                        i15 = 9;
                    } else {
                        i9 = i9;
                        i2 = i10;
                        i15 = 9;
                        iM55680 = (C0946.m55979("ܺܰ") ^ i17) * 37;
                        i3 = ((iM55680 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                        i20 = iM55680 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    }
                    break;
                case -468141777:
                case 1177570890:
                    i = 47111;
                    int iM559712 = C0946.m55979("ۜ۬") ^ i18;
                    int i21 = i;
                    i20 = iM559712 ^ (-468671050);
                    i19 = ((iM559712 ^ i17) * 29415) ^ (-1020192957);
                    i13 = i21;
                    break;
                case -122747705:
                case 1792870048:
                    i9 = i9;
                    i2 = i10;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("ܺܰ") ^ i17) * 37;
                        i3 = ((iM55680 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                    } else {
                        iM55680 = C0873.m55680("ۖ۠") ^ i17;
                        i3 = ((iM55680 ^ i18) * (-16209)) ^ (-1950746634);
                        i4 = 2117492249;
                    }
                    i20 = iM55680 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case 55137940:
                case 985864360:
                    C0894.m55769();
                    C0877.m55696();
                    break;
                case 101079832:
                case 857918940:
                    i9 = i9;
                    i2 = i10;
                    s = sArr2[c];
                    s2 = 19719;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("ۛ֫") + i17) * (-5);
                        i3 = ((iM55680 ^ i18) * 13605) ^ 1771776971;
                        i4 = 210657461;
                    } else {
                        iM55680 = C0946.m55979("᩺᩹") ^ i17;
                        i3 = ((iM55680 ^ i18) * (-29153)) ^ (-1010991420);
                        i4 = 825559263;
                    }
                    i20 = iM55680 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case 194442174:
                case 996948273:
                    int i22 = i11 + i12;
                    if ((i22 + i22) - i10 < 0) {
                        iM55979 = C0946.m55979("֡ۨ") ^ i17;
                        i2 = i10;
                        i5 = ((iM55979 ^ i18) * (-12265)) ^ 1250022895;
                        i6 = -1290657350;
                    } else {
                        i2 = i10;
                        iM55979 = (C0946.m55979("ܶ֨") ^ i18) * 85;
                        i5 = ((iM55979 ^ i17) * (-7123)) ^ (-1314972546);
                        i6 = -678281561;
                    }
                    i20 = iM55979 ^ i6;
                    i19 = i5;
                    i10 = i2;
                    break;
                case 433790206:
                case 1454809988:
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C0854.f81826 != 0) {
                        iM55681 = C0946.m55979("ۗ᩺") ^ i18;
                        i7 = ((iM55681 ^ i17) * 21527) ^ (-1778505772);
                        i8 = 225753037;
                    } else {
                        iM55681 = C0873.m55680("᩶ۧ") ^ i17;
                        i7 = ((iM55681 ^ i18) * 1059) ^ (-302808192);
                        i8 = -257420984;
                    }
                    i20 = iM55681 ^ i8;
                    i19 = i7;
                    i9 = i9;
                    break;
                case 1831592838:
                case 2090143038:
                    i9 = i9;
                    i2 = i10;
                    sArr2 = f81889;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("ۢ۫") + i17) * (-31);
                        i3 = ((iM55680 ^ i18) * (-13519)) ^ 684500723;
                        i4 = -830701720;
                    } else {
                        iM55680 = (i17 - C0946.m55979("ᩴۖ")) * (-19);
                        i3 = ((iM55680 ^ i18) * 30203) ^ 583471217;
                        i4 = 1121453196;
                    }
                    i20 = iM55680 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                default:
                    i = 58150;
                    int iM559713 = C0946.m55979("ۜ۬") ^ i18;
                    int i23 = i;
                    i20 = iM559713 ^ (-468671050);
                    i19 = ((iM559713 ^ i17) * 29415) ^ (-1020192957);
                    i13 = i23;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fa A[PHI: r1 r2 r3 r12 r13
      0x00fa: PHI (r1v6 android.view.View) = (r1v3 android.view.View), (r1v2 android.view.View), (r1v2 android.view.View) binds: [B:21:0x0088, B:32:0x00f8, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r2v6 android.view.ViewGroup$LayoutParams) = 
      (r2v3 android.view.ViewGroup$LayoutParams)
      (r2v2 android.view.ViewGroup$LayoutParams)
      (r2v2 android.view.ViewGroup$LayoutParams)
     binds: [B:21:0x0088, B:32:0x00f8, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r3v10 int) = (r3v3 int), (r3v2 int), (r3v2 int) binds: [B:21:0x0088, B:32:0x00f8, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r12v6 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:21:0x0088, B:32:0x00f8, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r13v6 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:21:0x0088, B:32:0x00f8, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01ab A[PHI: r8 r9 r14
      0x01ab: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:47:0x01a9, B:28:0x00d9, B:16:0x0071, B:14:0x006d, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:47:0x01a9, B:28:0x00d9, B:16:0x0071, B:14:0x006d, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:47:0x01a9, B:28:0x00d9, B:16:0x0071, B:14:0x006d, B:8:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01fc A[PHI: r5
      0x01fc: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:55:0x01fa, B:14:0x006d, B:11:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x022c A[PHI: r6 r7 r10 r19
      0x022c: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:59:0x022a, B:51:0x01de, B:43:0x0188, B:89:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:59:0x022a, B:51:0x01de, B:43:0x0188, B:89:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:59:0x022a, B:51:0x01de, B:43:0x0188, B:89:0x022c] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:59:0x022a, B:51:0x01de, B:43:0x0188, B:89:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x025d  */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int iM55979;
        int i;
        int i2;
        int i3 = C1012.f81938;
        int i4 = C1124.f82007;
        int iM55680 = (i4 - C0873.m55680("ᩳۢ")) * (-101);
        int i5 = ((iM55680 ^ i3) * 29747) ^ (-684671060);
        ViewGroup.LayoutParams layoutParamsM56344 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ (-1838943515);
        View view = null;
        int i7 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1665176556;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * 30707) >> 31));
            switch (i14) {
                case -2136045511:
                case 156905106:
                    layoutParamsM56344.height = i7;
                    view.setLayoutParams(layoutParamsM56344);
                    break;
                case -2048539388:
                case -968775874:
                    if (C1404.m56468()) {
                        iM55979 = (i4 - C0946.m55979("ܿܰ")) * (-35);
                        i = ((iM55979 ^ i3) * (-10065)) ^ (-1765451493);
                        i2 = 395864554;
                    } else {
                        iM55979 = C0873.m55680("᩺֨") ^ i3;
                        i = ((iM55979 ^ i4) * 20193) ^ (-1120310984);
                        i2 = 1267047225;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2045891516:
                case -1327064891:
                    C0946.m55980();
                    if (C1964.m56597() != 0) {
                        iM55979 = C0873.m55680("ܶ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM55979 = C0873.m55680("᩺֨") ^ i3;
                        i = ((iM55979 ^ i4) * 20193) ^ (-1120310984);
                        i2 = 1267047225;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2003768888:
                case 1785175848:
                    i11 = 35472;
                    iM55979 = (i3 - C0946.m55979("ۖ۟")) * (-125);
                    i = ((iM55979 ^ i4) * (-20559)) ^ 180489115;
                    i2 = 1847763982;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1907783674:
                case 1770845163:
                    C1028.m56247();
                    if (C0930.m55885() > 0) {
                        iM55979 = C0873.m55680("ܶ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM55979 = (C0873.m55680("ۤۧ") + i4) * (-107);
                        i = ((iM55979 ^ i3) * 13457) ^ 1642911568;
                        i2 = 534312924;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1630314401:
                case -1552364603:
                    i13 = 9;
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("ܶ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM55979 = C0873.m55680("ۘ֡") ^ i3;
                        i = ((iM55979 ^ i4) * (-16563)) ^ 1417195245;
                        i2 = -1330115624;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1129528496:
                case 1834542366:
                    s = sArr[c];
                    s2 = 16298;
                    if (C0898.f81858 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ܳۙ")) * (-81);
                        i = ((iM55979 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                    } else {
                        iM55979 = C0946.m55979("᩸᩻") ^ i3;
                        i = ((iM55979 ^ i4) * (-26539)) ^ (-507034360);
                        i2 = -1211996823;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -945504604:
                case -96381868:
                    sArr = f81889;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ܳۙ")) * (-81);
                        i = ((iM55979 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                    } else {
                        iM55979 = (C0873.m55680("᩷֫") ^ i3) * (-71);
                        i = ((iM55979 ^ i4) * (-22487)) ^ (-1888655133);
                        i2 = 731809310;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -833799834:
                case 47542594:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C0989.m56095() <= 0) {
                        iM55979 = C0873.m55680("ܶ۟") ^ i3;
                        i = ((iM55979 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۤܽ")) * 123;
                        i = ((iM55979 ^ i3) * (-5447)) ^ (-1153576201);
                        i2 = 582445946;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -677465144:
                case 1337560733:
                    view = this.f9497;
                    layoutParamsM56344 = C1071.m56344(view);
                    if (RunnableC1014.f81941 <= 0) {
                        i7 = -2;
                        iM55979 = (C0873.m55680("ۤۧ") + i4) * (-107);
                        i = ((iM55979 ^ i3) * 13457) ^ 1642911568;
                        i2 = 534312924;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559710 = (C0946.m55979("۫᩸") ^ i4) * 51;
                        i5 = ((iM559710 ^ i3) * 22709) ^ (-395020683);
                        i6 = iM559710 ^ 1262795676;
                        i7 = -2;
                    }
                    break;
                case -609941776:
                case 122903317:
                    i10 = 66406201;
                    if (C0930.f81879 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ܳۙ")) * (-81);
                        i = ((iM55979 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                    } else {
                        iM55979 = C0873.m55680("ܺۤ") ^ i3;
                        i = ((iM55979 ^ i4) * (-25369)) ^ (-1200424363);
                        i2 = -852120677;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -359921599:
                case -119176259:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i4 - C0946.m55979("ܿܰ")) * (-35);
                        i = ((iM55979 ^ i3) * (-10065)) ^ (-1765451493);
                        i2 = 395864554;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۚܽ")) * (-103);
                        i = ((iM55979 ^ i3) * 13123) ^ (-1514516540);
                        i2 = 1969950656;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -317026750:
                case 194660194:
                    c = '*';
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("᩺֨") ^ i3;
                        i = ((iM55979 ^ i4) * 20193) ^ (-1120310984);
                        i2 = 1267047225;
                    } else {
                        iM55979 = C0873.m55680("۠۟") ^ i4;
                        i = ((iM55979 ^ i3) * MLKEMEngine.KyberQ) ^ (-155318578);
                        i2 = 1369127160;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -78056045:
                case 1561345186:
                    sArr2 = f81889;
                    i12 = 43;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ۤۧ") + i4) * (-107);
                        i = ((iM55979 ^ i3) * 13457) ^ 1642911568;
                        i2 = 534312924;
                    } else {
                        iM55979 = C0873.m55680("᩻ᩳ") ^ i4;
                        i = ((iM55979 ^ i3) * 4257) ^ 1378391837;
                        i2 = 1313645770;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -23922049:
                case 193449654:
                    C0882.m55710();
                    iM55979 = C0873.m55680("ܶ۟") ^ i3;
                    i = ((iM55979 ^ i4) * (-23571)) ^ (-1427626467);
                    i2 = -544874484;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 95193401:
                case 666082666:
                    C1025.m56218(animator, C0955.m56029(sArr2, i12, i13, i11));
                    if (C0894.m55769() >= 0) {
                        iM55979 = (i3 - C0873.m55680("ܳۙ")) * (-81);
                        i = ((iM55979 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM559711 = (i4 - C0946.m55979("ܽۗ")) * 25;
                        i5 = ((iM559711 ^ i3) * 5979) ^ (-633597510);
                        i6 = iM559711 ^ 1710366024;
                    }
                    break;
                case 952761154:
                case 1935250777:
                    i11 = 41595;
                    iM55979 = (i3 - C0946.m55979("ۖ۟")) * (-125);
                    i = ((iM55979 ^ i4) * (-20559)) ^ 180489115;
                    i2 = 1847763982;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1590104447:
                case 2015434329:
                    if (i8 - (i9 + i10) > 0) {
                        iM55979 = (C0873.m55680("۟ܳ") ^ i4) * 3;
                        i = ((iM55979 ^ i3) * (-20745)) ^ 1446051564;
                        i2 = -9564565;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܽܺ")) * 87;
                        i = ((iM55979 ^ i4) * 3363) ^ (-1786811746);
                        i2 = -470033643;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    C1028.m56247();
                    C0882.m55710();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x015b A[PHI: r1 r8
      0x015b: PHI (r1v45 java.lang.String) = (r1v26 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:23:0x0089, B:9:0x0051, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r8v5 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:23:0x0089, B:9:0x0051, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0208 A[PHI: r3 r4 r5 r6 r16
      0x0208: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:58:0x0206, B:54:0x01e6, B:50:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:58:0x0206, B:54:0x01e6, B:50:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:58:0x0206, B:54:0x01e6, B:50:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v4 int) binds: [B:58:0x0206, B:54:0x01e6, B:50:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x0208: PHI (r16v8 java.lang.String) = (r16v6 java.lang.String), (r16v7 java.lang.String), (r16v9 java.lang.String) binds: [B:58:0x0206, B:54:0x01e6, B:50:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        String strM56016;
        int iM55680;
        int i;
        int i2;
        int i3 = C1017.f81942;
        int i4 = C1003.f81929;
        int iM55681 = (C0873.m55680("ܶ᩷") ^ i3) * (-55);
        int i5 = ((iM55681 ^ i4) * (-22585)) ^ 834798587;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ (-1379011939);
        String str = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 833371856;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-32557)) >> 31));
            switch (i13) {
                case -2132971144:
                case 2087691619:
                    RunnableC0871.m55661(animator, str);
                    this.f9500.f36568 = true;
                    break;
                case -1951930292:
                case 1095599039:
                    C1028.m56247();
                    if (C1003.f81929 <= 0) {
                        strM56016 = str;
                        iM55680 = C0946.m55979("ۘ۟") ^ i4;
                        i = ((iM55680 ^ i3) * 27315) ^ (-1665434923);
                        i2 = -554047580;
                        String str2 = strM56016;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        str = str2;
                    }
                    strM56016 = str;
                    iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                    i = ((iM55680 ^ i4) * 19415) ^ (-128574565);
                    i2 = -570057361;
                    String str3 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str3;
                    break;
                case -1935929046:
                case -1576912005:
                    strM56016 = C0949.m56016(sArr2, i11, i12, i10);
                    if (C0989.f81920 >= 0) {
                        str = strM56016;
                        iM55680 = C0946.m55979("۠ܺ") ^ i3;
                        strM56016 = str;
                        i = ((iM55680 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                        String str4 = strM56016;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        str = str4;
                    } else {
                        int iM55682 = C0873.m55680("᩸ۤ") ^ i4;
                        i5 = ((iM55682 ^ i3) * (-12165)) ^ (-2034954655);
                        str = strM56016;
                        i6 = iM55682 ^ (-1566109060);
                    }
                    break;
                case -1422681371:
                case 1605894130:
                    strM56016 = str;
                    i8 = 212139225;
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("ܺܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-22065)) ^ (-654490565);
                        i2 = -1777262865;
                    } else {
                        iM55680 = (C0873.m55680("᩶۬") ^ i4) * (-87);
                        i = ((iM55680 ^ i3) * 23985) ^ (-728035351);
                        i2 = -84532504;
                    }
                    String str5 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str5;
                    break;
                case -1298261530:
                case 1019214859:
                    strM56016 = str;
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                        i = ((iM55680 ^ i4) * 19415) ^ (-128574565);
                        i2 = -570057361;
                    } else {
                        iM55680 = (C0873.m55680("۬ᩳ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i4) * (-15581)) ^ (-523697368);
                        i2 = -1918040683;
                    }
                    String str6 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str6;
                    break;
                case -1275535001:
                case 1490886683:
                    sArr2 = f81889;
                    if (C1028.f81950 <= 0) {
                        strM56016 = str;
                        i11 = 1;
                        iM55680 = (C0946.m55979("ۛ֫") ^ i4) * (-49);
                        i = ((iM55680 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                        String str7 = strM56016;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        str = str7;
                    } else {
                        int iM55979 = C0946.m55979("ۙ۠") ^ i4;
                        i6 = iM55979 ^ (-880179691);
                        i5 = ((iM55979 ^ i3) * (-6849)) ^ (-1079224586);
                        i11 = 1;
                    }
                    break;
                case -1009628029:
                case 2985361:
                    i10 = 36859;
                    iM55680 = C0946.m55979("ܺۧ") ^ i3;
                    strM56016 = str;
                    i = ((iM55680 ^ i4) * 31873) ^ (-1047290061);
                    i2 = -1989883204;
                    String str8 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str8;
                    break;
                case -726350315:
                case 1283701243:
                    strM56016 = str;
                    c = 0;
                    if (C0892.f81851) {
                        iM55680 = (C0946.m55979("ܳۡ") + i3) * 99;
                        i = ((iM55680 ^ i4) * (-11667)) ^ (-1531410863);
                        i2 = 1568317625;
                    } else {
                        iM55680 = C0946.m55979("ܺܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-22065)) ^ (-654490565);
                        i2 = -1777262865;
                    }
                    String str9 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str9;
                    break;
                case -668248993:
                case 1644810742:
                    strM56016 = str;
                    s2 = 14565;
                    if (RunnableC0871.f81839 >= 0) {
                        str = strM56016;
                        iM55680 = C0946.m55979("۠ܺ") ^ i3;
                        strM56016 = str;
                        i = ((iM55680 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩸") ^ i3;
                        i = ((iM55680 ^ i4) * 30939) ^ 1703953727;
                        i2 = 810231260;
                    }
                    String str10 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str10;
                    break;
                case -504182968:
                case 1508153315:
                    strM56016 = str;
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) < 0) {
                        iM55680 = (i4 - C0946.m55979("᩻᩺")) * 25;
                        i = ((iM55680 ^ i3) * (-12875)) ^ (-1356449291);
                        i2 = 1571515504;
                    } else {
                        iM55680 = (C0873.m55680("ۧۜ") + i4) * (-91);
                        i = ((iM55680 ^ i3) * (-9629)) ^ (-1530561338);
                        i2 = -1522413508;
                    }
                    String str11 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str11;
                    break;
                case -370145958:
                case -82708329:
                    if (C0967.f81910 >= 0) {
                        strM56016 = str;
                        i12 = 9;
                        iM55680 = (C0946.m55979("ۛ֫") ^ i4) * (-49);
                        i = ((iM55680 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                        String str12 = strM56016;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        str = str12;
                    } else {
                        int iM559710 = (C0946.m55979("᩶ۗ") ^ i3) * 39;
                        i6 = iM559710 ^ 1365002806;
                        i5 = ((iM559710 ^ i4) * (-16321)) ^ (-2134390198);
                        i12 = 9;
                    }
                    break;
                case -180744056:
                case 1556211582:
                    strM56016 = str;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0946.m55979("ۛ֫") ^ i4) * (-49);
                        i = ((iM55680 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۢ֫")) * (-43);
                        i = ((iM55680 ^ i4) * 24517) ^ 2022944682;
                        i2 = -1372628797;
                    }
                    String str13 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str13;
                    break;
                case -58694453:
                case 1255306945:
                    C0873.m55678();
                    C0890.m55740();
                    strM56016 = str;
                    iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                    i = ((iM55680 ^ i4) * 19415) ^ (-128574565);
                    i2 = -570057361;
                    String str14 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str14;
                    break;
                case -46407603:
                case 1746985686:
                    strM56016 = str;
                    sArr = f81889;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ۘ۟") ^ i4;
                        i = ((iM55680 ^ i3) * 27315) ^ (-1665434923);
                        i2 = -554047580;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩶") ^ i4;
                        i = ((iM55680 ^ i3) * (-26919)) ^ 1320218154;
                        i2 = 1861884117;
                    }
                    String str15 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str15;
                    break;
                case 76484576:
                case 1202255333:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("۠ܺ") ^ i3;
                        strM56016 = str;
                        i = ((iM55680 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                    } else {
                        strM56016 = str;
                        iM55680 = (C0946.m55979("ۛ֫") ^ i4) * (-49);
                        i = ((iM55680 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                    }
                    String str16 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str16;
                    break;
                case 218340784:
                case 264219365:
                    C0955.m56025();
                    break;
                case 466535277:
                case 1180416730:
                    i10 = 2318;
                    iM55680 = C0946.m55979("ܺۧ") ^ i3;
                    strM56016 = str;
                    i = ((iM55680 ^ i4) * 31873) ^ (-1047290061);
                    i2 = -1989883204;
                    String str17 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str17;
                    break;
                case 1021433344:
                case 1200756913:
                    strM56016 = str;
                    s = sArr[c];
                    i7 = s * s;
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("ܺܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-22065)) ^ (-654490565);
                        i2 = -1777262865;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۙܽ")) * (-15);
                        i = ((iM55680 ^ i3) * (-26693)) ^ (-1636695859);
                        i2 = -1522052778;
                    }
                    String str18 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str18;
                    break;
                default:
                    if (C1964.m56597() != 0) {
                        strM56016 = str;
                        iM55680 = C0946.m55979("᩻ۛ") ^ i3;
                        i = ((iM55680 ^ i4) * 19415) ^ (-128574565);
                        i2 = -570057361;
                    } else {
                        iM55680 = C0946.m55979("۠ܺ") ^ i3;
                        strM56016 = str;
                        i = ((iM55680 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                    }
                    String str19 = strM56016;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    str = str19;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011f A[PHI: r7 r10
      0x011f: PHI (r7v4 float[]) = (r7v3 float[]), (r7v2 float[]) binds: [B:35:0x011d, B:23:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x011f: PHI (r10v3 android.animation.ObjectAnimator) = (r10v2 android.animation.ObjectAnimator), (r10v4 android.animation.ObjectAnimator) binds: [B:35:0x011d, B:23:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02bc A[PHI: r2 r18 r19
      0x02bc: PHI (r2v6 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:68:0x02ba, B:48:0x01c5, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r18v5 short[]) = (r18v3 short[]), (r18v2 short[]), (r18v2 short[]) binds: [B:68:0x02ba, B:48:0x01c5, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r19v5 char) = (r19v3 char), (r19v2 char), (r19v2 char) binds: [B:68:0x02ba, B:48:0x01c5, B:10:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        if (p067l.C0955.m56025() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r1 = p067l.C0946.m55979("ܽ᩻") ^ r21;
        r14 = ((r1 ^ r22) * (-20573)) ^ 1379251886;
        r24 = -2139921305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        if (p067l.C0894.f81854 < 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationEnd(Animator animator) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        C4278 c4278 = this;
        int i4 = C0930.f81879;
        int i5 = C1046.f81962;
        int iM559711 = (i5 - C0946.m55979("ܿܶ")) * (-15);
        int i6 = ((iM559711 ^ i4) * (-3251)) ^ 1850172701;
        View view = null;
        View view2 = null;
        float[] fArr = null;
        short[] sArr = null;
        int i7 = iM559711 ^ (-1477610579);
        String strM56462 = null;
        int i8 = 0;
        float fM56463 = 0.0f;
        float f = 0.0f;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s = 0;
        int i14 = 2100510012;
        int i15 = 0;
        short[] sArr2 = null;
        ObjectAnimator objectAnimatorM56066 = null;
        char c2 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * (-19471)) >> 31));
            switch (i14) {
                case -2101153400:
                case -1415857983:
                    int i16 = i12 + i13;
                    if ((i16 + i16) - i11 >= 0) {
                        iM55979 = (C0873.m55680("᩹ۛ") ^ i5) * (-51);
                        i = ((iM55979 ^ i4) * (-30057)) ^ (-1321926755);
                        i2 = 369925172;
                    } else {
                        iM55979 = C0873.m55680("ᩳۗ") ^ i4;
                        i = ((iM55979 ^ i5) * 25095) ^ 1998097237;
                        i2 = -1280535309;
                    }
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case -2003654205:
                case -1010622995:
                    if (C0863.f81833 > 0) {
                        int iM559712 = C0946.m55979("ܳۙ") ^ i4;
                        i7 = iM559712 ^ 815808616;
                        i6 = ((iM559712 ^ i5) * 13169) ^ (-412357852);
                        c4278 = this;
                    } else {
                        iM55979 = C0946.m55979("֫ۡ") ^ i5;
                        i = ((iM55979 ^ i4) * (-507)) ^ 136819758;
                        i2 = -645927538;
                        i7 = iM55979 ^ i2;
                        c4278 = this;
                        i6 = i;
                    }
                    break;
                case -1966365378:
                case 1975303:
                    fArr = new float[2];
                    if (C0892.m55749()) {
                        iM559710 = (C0873.m55680("۠᩺") ^ i4) * 59;
                        i = ((iM559710 ^ i5) * 731) ^ 1763217178;
                        i3 = -2089808477;
                    } else {
                        iM559710 = C0873.m55680("ᩴۜ") ^ i5;
                        i = ((iM559710 ^ i4) * 7413) ^ 681383459;
                        i3 = -564655732;
                    }
                    i7 = iM559710 ^ i3;
                    i6 = i;
                    break;
                case -1883848257:
                case -164068494:
                    C1929.m56553();
                    break;
                case -1659711551:
                case -915730041:
                    i9 = 60701;
                    iM55979 = (C0946.m55979("ᩳܿ") ^ i5) * 17;
                    i = ((iM55979 ^ i4) * 16347) ^ (-590163156);
                    i2 = -1608936605;
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case -1548912235:
                case 1246262105:
                    i9 = 14913;
                    iM55979 = (C0946.m55979("ᩳܿ") ^ i5) * 17;
                    i = ((iM55979 ^ i4) * 16347) ^ (-590163156);
                    i2 = -1608936605;
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case -1485209301:
                case 1668098392:
                    strM56462 = C1404.m56462(f81889, 11, 9, i9);
                    if (C1048.m56305() >= 0) {
                        iM55979 = C0946.m55979("֫ۡ") ^ i5;
                        i = ((iM55979 ^ i4) * (-507)) ^ 136819758;
                        i2 = -645927538;
                    } else {
                        iM55979 = (C0873.m55680("ۚۤ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i5) * (-16769)) ^ 1300964931;
                        i2 = -25403846;
                    }
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case -1397153266:
                case 1305540221:
                    sArr2 = f81889;
                    c = '\n';
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("֫ۡ") ^ i5;
                        i = ((iM55979 ^ i4) * (-507)) ^ 136819758;
                        i2 = -645927538;
                    } else {
                        iM55979 = (i4 - C0946.m55979("۟ܽ")) * 49;
                        i = ((iM55979 ^ i5) * 889) ^ (-1751099236);
                        i2 = -1560765301;
                    }
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case -1362165937:
                case 27653868:
                    C0877.m55696();
                    RunnableC1014.m56177();
                    iM55979 = C0946.m55979("֫ۡ") ^ i5;
                    i = ((iM55979 ^ i4) * (-507)) ^ 136819758;
                    i2 = -645927538;
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case -1267768101:
                case 505268120:
                    C0845.m55584();
                    break;
                case -1226265756:
                case 130740396:
                    fArr[c2] = f;
                    sArr = f81889;
                    i10 = 20;
                    if (!C0927.f81875) {
                        iM559710 = (C0873.m55680("᩶ۙ") ^ i4) * (-119);
                        i = ((iM559710 ^ i5) * 31031) ^ 1585299707;
                        i3 = 1939828703;
                        i7 = iM559710 ^ i3;
                        i6 = i;
                    } else {
                        int iM559713 = C0946.m55979("ܳۙ") ^ i4;
                        i7 = iM559713 ^ 815808616;
                        i6 = ((iM559713 ^ i5) * 13169) ^ (-412357852);
                        c4278 = this;
                    }
                    break;
                case -972914064:
                case -931460380:
                    C1964.m56585(objectAnimatorM56066);
                    c4278.f9500.f36568 = true;
                    break;
                case -891877620:
                case 1189076807:
                    fArr[0] = fM56463;
                    f = 0.0f;
                    c2 = 1;
                    if (RunnableC0871.f81839 < 0) {
                        iM559710 = C0946.m55979("ۤۡ") ^ i5;
                        i = ((iM559710 ^ i4) * 17511) ^ (-536794756);
                        i3 = -534647362;
                        i7 = iM559710 ^ i3;
                        i6 = i;
                    } else {
                        int iM559714 = C0946.m55979("ܳۙ") ^ i4;
                        i7 = iM559714 ^ 815808616;
                        i6 = ((iM559714 ^ i5) * 13169) ^ (-412357852);
                        c4278 = this;
                    }
                    break;
                case -710031066:
                case 1128429216:
                    C1025.m56218(animator, strM56462);
                    view = c4278.f9499;
                    i8 = 8;
                    if (C0930.f81879 > 0) {
                        iM55979 = (C0946.m55979("᩺᩻") + i5) * (-87);
                        i = ((iM55979 ^ i4) * 30537) ^ (-728397340);
                        i2 = 1931643545;
                        i7 = iM55979 ^ i2;
                        c4278 = this;
                        i6 = i;
                    } else {
                        int iM559715 = C0946.m55979("ܳۙ") ^ i4;
                        i7 = iM559715 ^ 815808616;
                        i6 = ((iM559715 ^ i5) * 13169) ^ (-412357852);
                        c4278 = this;
                    }
                    break;
                case -209844047:
                case -121787109:
                    C0898.m55802(view, i8);
                    view2 = c4278.f9498;
                    fM56463 = C1404.m56463(view2);
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM559710 = (C0873.m55680("۟۫") + i5) * (-23);
                        i = ((iM559710 ^ i4) * (-19933)) ^ (-1275544466);
                        i3 = 869366988;
                        i7 = iM559710 ^ i3;
                        i6 = i;
                    }
                    iM55979 = (C0946.m55979("᩸᩶") + i5) * C0254q.f1218h;
                    i = ((iM55979 ^ i4) * 16981) ^ 2119224850;
                    i2 = 903890177;
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case 335723530:
                case 341054782:
                    i11 = i15 * i15;
                    i12 = s * s;
                    i13 = 3272481;
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0946.m55979("᩸᩶") + i5) * C0254q.f1218h;
                        i = ((iM55979 ^ i4) * 16981) ^ 2119224850;
                        i2 = 903890177;
                    } else {
                        iM55979 = C0946.m55979("ۚᩴ") ^ i4;
                        i = ((iM55979 ^ i5) * (-15371)) ^ (-1263585714);
                        i2 = -1400930652;
                    }
                    i7 = iM55979 ^ i2;
                    c4278 = this;
                    i6 = i;
                    break;
                case 583075983:
                case 907847970:
                    objectAnimatorM56066 = C0967.m56066(view2, C0863.m55635(sArr, i10, 12, i9), fArr);
                    if (C0863.f81833 <= 0) {
                        iM559710 = C0873.m55680("ᩴۜ") ^ i5;
                        i = ((iM559710 ^ i4) * 7413) ^ 681383459;
                        i3 = -564655732;
                    } else {
                        iM559710 = C0873.m55680("ۖܿ") ^ i4;
                        i = ((iM559710 ^ i5) * 6277) ^ 2031720140;
                        i3 = -423186373;
                    }
                    i7 = iM559710 ^ i3;
                    i6 = i;
                    break;
                case 1195918856:
                case 1357710515:
                    short s2 = sArr2[c];
                    int i17 = s2 + 1809;
                    if (C1044.m56286() <= 0) {
                        s = s2;
                        i15 = i17;
                        iM55979 = (C0946.m55979("᩸᩶") + i5) * C0254q.f1218h;
                        i = ((iM55979 ^ i4) * 16981) ^ 2119224850;
                        i2 = 903890177;
                        i7 = iM55979 ^ i2;
                        c4278 = this;
                        i6 = i;
                    } else {
                        int iM55680 = (C0873.m55680("ۘۜ") + i5) * 63;
                        i6 = ((iM55680 ^ i4) * 19049) ^ 1805321775;
                        i15 = i17;
                        c4278 = this;
                        i7 = iM55680 ^ 1334239275;
                        s = s2;
                    }
                    break;
                default:
                    C1229.m56410();
                    break;
            }
            return;
        }
    }

    public C4278(View view, View view2, View view3, C12996 c12996) {
        int i = 225211555;
        int i2 = C0894.f81854;
        int i3 = C0845.f81821;
        int iM55680 = C0873.m55680("۫֡") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-7599)) ^ 1127210555;
        int i5 = -1164783380;
        while (true) {
            i = ((((i ^ i2) * (-8119)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1761305808:
                case -1505750073:
                    this.f9498 = view3;
                    this.f9500 = c12996;
                    return;
                case -1685612662:
                case 1080138117:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM55680 = C0946.m55979("᩺᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-9997)) ^ 1592967185;
                        i5 = -859236510;
                    }
                    break;
                case -1526454320:
                case 1523911147:
                    if (C0955.f81898) {
                        iM55680 = (C0946.m55979("ۘۜ") ^ i2) * (-45);
                        i4 = ((iM55680 ^ i3) * 16133) ^ (-1119150083);
                        i5 = 1256168492;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۢ") ^ i3) * (-33);
                        i4 = ((iM55680 ^ i2) * 10213) ^ 299036903;
                        i5 = 1889615027;
                    }
                    break;
                case -1445685550:
                case 516869240:
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM55680 = (C0946.m55979("ۧܶ") ^ i2) * (-79);
                        i4 = ((iM55680 ^ i3) * 24713) ^ 1955971354;
                        i5 = 399825891;
                    }
                    break;
                case -1371269342:
                case -190530285:
                    if (C1071.m56343() != 0) {
                        iM55680 = C0946.m55979("᩵᩸") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1439)) ^ (-523770003);
                        i5 = -1640939384;
                    } else {
                        iM55680 = C0873.m55680("۫ܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16899) ^ 1446916774;
                        i5 = 640464866;
                    }
                    break;
                case -1111676150:
                case 1797225211:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM55680 = C0946.m55979("ۚᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15099) ^ (-945362295);
                        i5 = 589598692;
                    }
                    break;
                case -917675596:
                case 1792898062:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("֡ۙ") + i3) * 29;
                        i4 = ((iM55680 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    } else {
                        iM55680 = (C0946.m55979("۬۬") + i3) * 87;
                        i4 = ((iM55680 ^ i2) * (-13067)) ^ (-256339442);
                        i5 = -1029245307;
                    }
                    break;
                case -805209094:
                case 3892712:
                    C0989.m56095();
                    if (C0894.m55769() < 0) {
                        iM55680 = C0946.m55979("᩵᩸") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1439)) ^ (-523770003);
                        i5 = -1640939384;
                    } else {
                        iM55680 = (C0873.m55680("֡ۙ") + i3) * 29;
                        i4 = ((iM55680 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    }
                    break;
                case -628525311:
                case 238133561:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0946.m55979("ۘۜ") ^ i2) * (-45);
                        i4 = ((iM55680 ^ i3) * 16133) ^ (-1119150083);
                        i5 = 1256168492;
                    } else {
                        iM55680 = C0873.m55680("᩸ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 15465) ^ 1743798209;
                        i5 = -408532474;
                    }
                    break;
                case -545162123:
                case -156056620:
                    if (C1048.m56305() < 0) {
                        iM55680 = C0946.m55979("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM55680 = (C0873.m55680("֡ۙ") + i3) * 29;
                        i4 = ((iM55680 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    }
                    break;
                case -426141067:
                case 1819866429:
                    C0866.m55645();
                    throw new RuntimeException();
                case -219285939:
                case 506839054:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("֡ۙ") + i3) * 29;
                        i4 = ((iM55680 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    } else {
                        iM55680 = C0873.m55680("᩹۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3937)) ^ (-755589007);
                        i5 = -967993575;
                    }
                    break;
                case 255079422:
                case 1178014129:
                    this.f9497 = view;
                    this.f9499 = view2;
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("۠ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩵᩻")) * (-99);
                        i4 = ((iM55680 ^ i3) * (-24441)) ^ 1571730239;
                        i5 = -287738553;
                    }
                    break;
                case 323619650:
                case 481963214:
                    ServiceConnectionC1013.m56157();
                    C0873.m55678();
                    iM55680 = (C0873.m55680("֡ۙ") + i3) * 29;
                    i4 = ((iM55680 ^ i2) * (-5315)) ^ (-1514854034);
                    i5 = 2018592258;
                    break;
                case 1102208304:
                case 1194351002:
                    if (C0927.f81875) {
                        iM55680 = (C0946.m55979("ۘۜ") ^ i2) * (-45);
                        i4 = ((iM55680 ^ i3) * 16133) ^ (-1119150083);
                        i5 = 1256168492;
                    } else {
                        iM55680 = (C0946.m55979("ۜܶ") ^ i3) * 7;
                        i4 = ((iM55680 ^ i2) * (-15469)) ^ 1901782093;
                        i5 = 2139944647;
                    }
                    break;
                default:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("᩵᩸") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1439)) ^ (-523770003);
                        i5 = -1640939384;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۨܶ")) * 37;
                        i4 = ((iM55680 ^ i3) * (-9207)) ^ (-1950550467);
                        i5 = -2036566284;
                    }
                    break;
            }
        }
    }
}
