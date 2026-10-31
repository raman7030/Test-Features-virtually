package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.֫ᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2009 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۚᩴܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f6710 = {2511, 2415, 2400, 2407, 2403, 2415, 2426, 2407, 2401, 2400, 8665, 14880, 14895, 14888, 14892, 14880, 14901, 14888, 14894, 14895, 14901, 14899, 14880, 14895, 14898, 14893, 14880, 14901, 14888, 14894, 14895, 14872, 6810, -7353, -7352, -7345, -7349, -7353, -7342, -7345, -7351, -7352, 3766, -29967, -29954, -29959, -29955, -29967, -29980, -29959, -29953, -29954};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f6711;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f6712;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f6713;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11182 f6714;

    /* JADX WARN: Code duplicated, block: B:65:0x025d A[PHI: r2 r3 r17 r18
      0x025d: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r17v18 int) = (r17v4 int), (r17v7 int), (r17v19 int) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x025d: PHI (r18v26 int) = (r18v3 int), (r18v6 int), (r18v27 int) binds: [B:64:0x025b, B:51:0x01cb, B:12:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (l.C4263.m12819() < 0) goto L12;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationRepeat(Animator animator) {
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        int iM2567;
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
        int i17 = C2958.f9394;
        int i18 = C1773.f6144;
        int iM6982 = (i18 - C2105.m6981("ۛ᩸")) * 75;
        int i19 = ((iM6982 ^ i17) * 31817) ^ 1432527587;
        int i20 = iM6982 ^ (-605509549);
        short[] sArr2 = null;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * 28383) >> 31));
            switch (i16) {
                case -1961599420:
                case 1227139671:
                    i9 = i9;
                    i2 = i10;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ۛ֫") + i17) * (-5);
                        i3 = ((iM2566 ^ i18) * 13605) ^ 1771776971;
                        i4 = 210657461;
                    } else {
                        iM2566 = C2105.m6981("ᩴܽ") ^ i18;
                        i3 = ((iM2566 ^ i17) * (-24551)) ^ (-746099376);
                        i4 = 1378572161;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case -1937825507:
                case 364647057:
                    i9 = i9;
                    i2 = i10;
                    c = ' ';
                    if (C1128.f4106 > 0) {
                        iM2566 = (C2105.m6981("֡᩹") ^ i18) * (-55);
                        i3 = ((iM2566 ^ i17) * (-26297)) ^ 1214728667;
                        i4 = -213453082;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    } else {
                        i9 = i9;
                        iM6981 = C2105.m6981("֫ۗ") ^ i18;
                        i5 = ((iM6981 ^ i17) * 12151) ^ (-1893665043);
                        i6 = -1787176176;
                        i20 = iM6981 ^ i6;
                        i19 = i5;
                        i10 = i2;
                    }
                    break;
                case -1877165666:
                case 92926190:
                    i2 = i10;
                    i12 = 388838961;
                    if (!C4159.f13567) {
                        i9 = i9;
                        iM2566 = (C2105.m6981("ܺܰ") ^ i17) * 37;
                        i3 = ((iM2566 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    } else {
                        iM6981 = C0630.m2566("ۘܽ") ^ i18;
                        i5 = ((iM6981 ^ i17) * (-27619)) ^ (-1804141829);
                        i6 = 623593773;
                        i20 = iM6981 ^ i6;
                        i19 = i5;
                        i10 = i2;
                    }
                    break;
                case -1797133328:
                case -462872093:
                    C3683.m11210(animator, C1773.m5917(sArr, i14, i15, i13));
                    break;
                case -1630493304:
                case -1011531187:
                    C1916.m6308();
                    break;
                case -1315730630:
                case 722452854:
                    C1773.m5908();
                    if (C4616.f14690 > 0) {
                        i9 = i9;
                        i2 = i10;
                        iM2566 = (C0630.m2566("ۢ۫") + i17) * (-31);
                        i3 = ((iM2566 ^ i18) * (-13519)) ^ 684500723;
                        i4 = -830701720;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    }
                    i9 = i9;
                    i2 = i10;
                    iM2566 = (C2105.m6981("ۛ֫") + i17) * (-5);
                    i3 = ((iM2566 ^ i18) * 13605) ^ 1771776971;
                    i4 = 210657461;
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case -1266263855:
                case -1005281929:
                    i2 = i10;
                    i9 = s + s2;
                    if (C0483.f2088 >= 0) {
                        iM6981 = C2105.m6981("֫ۗ") ^ i18;
                        i5 = ((iM6981 ^ i17) * 12151) ^ (-1893665043);
                        i6 = -1787176176;
                    } else {
                        iM6981 = C2105.m6981("ۜܿ") ^ i18;
                        i5 = ((iM6981 ^ i17) * (-29085)) ^ (-1161440964);
                        i6 = 929474283;
                    }
                    i20 = iM6981 ^ i6;
                    i19 = i5;
                    i10 = i2;
                    break;
                case -1253457886:
                case 600389816:
                    C0050.m940();
                    C0237.m1481();
                    i9 = i9;
                    i2 = i10;
                    iM2566 = (C2105.m6981("ۛ֫") + i17) * (-5);
                    i3 = ((iM2566 ^ i18) * 13605) ^ 1771776971;
                    i4 = 210657461;
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case -1144779670:
                case 2123957932:
                    if (!C4159.f13567) {
                        i9 = i9;
                        i2 = i10;
                        iM2566 = (C2105.m6981("ܺܰ") ^ i17) * 37;
                        i3 = ((iM2566 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    }
                    iM2567 = C2105.m6981("ۗ᩺") ^ i18;
                    i7 = ((iM2567 ^ i17) * 21527) ^ (-1778505772);
                    i8 = 225753037;
                    i20 = iM2567 ^ i8;
                    i19 = i7;
                    i9 = i9;
                    break;
                case -894623792:
                case 744997860:
                    sArr = f6710;
                    if (C4075.m12263() <= 0) {
                        i14 = 33;
                        iM2567 = C2105.m6981("ۗ᩺") ^ i18;
                        i7 = ((iM2567 ^ i17) * 21527) ^ (-1778505772);
                        i8 = 225753037;
                        i20 = iM2567 ^ i8;
                        i19 = i7;
                        i9 = i9;
                    } else {
                        int iM2568 = C0630.m2566("֨ۙ") ^ i17;
                        i20 = iM2568 ^ 982941609;
                        i19 = ((iM2568 ^ i18) * 3573) ^ 1609861363;
                        i14 = 33;
                    }
                    break;
                case -810282225:
                case -760981908:
                    if (C1005.f3721) {
                        int iM6983 = (C2105.m6981("᩻ۨ") + i18) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i20 = iM6983 ^ 1860751714;
                        i19 = ((iM6983 ^ i17) * (-6887)) ^ 838205493;
                        i15 = 9;
                    } else {
                        i9 = i9;
                        i2 = i10;
                        i15 = 9;
                        iM2566 = (C2105.m6981("ܺܰ") ^ i17) * 37;
                        i3 = ((iM2566 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                        i20 = iM2566 ^ i4;
                        i19 = i3;
                        i10 = i2;
                        i9 = i9;
                    }
                    break;
                case -468141777:
                case 1177570890:
                    i = 47111;
                    int iM6984 = C2105.m6981("ۜ۬") ^ i18;
                    int i21 = i;
                    i20 = iM6984 ^ (-468671050);
                    i19 = ((iM6984 ^ i17) * 29415) ^ (-1020192957);
                    i13 = i21;
                    break;
                case -122747705:
                case 1792870048:
                    i9 = i9;
                    i2 = i10;
                    if (C22628.f73083 <= 0) {
                        iM2566 = (C2105.m6981("ܺܰ") ^ i17) * 37;
                        i3 = ((iM2566 ^ i18) * (-14413)) ^ (-1066915995);
                        i4 = 1190996275;
                    } else {
                        iM2566 = C0630.m2566("ۖ۠") ^ i17;
                        i3 = ((iM2566 ^ i18) * (-16209)) ^ (-1950746634);
                        i4 = 2117492249;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case 55137940:
                case 985864360:
                    C1047.m3599();
                    C0714.m2805();
                    break;
                case 101079832:
                case 857918940:
                    i9 = i9;
                    i2 = i10;
                    s = sArr2[c];
                    s2 = 19719;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("ۛ֫") + i17) * (-5);
                        i3 = ((iM2566 ^ i18) * 13605) ^ 1771776971;
                        i4 = 210657461;
                    } else {
                        iM2566 = C2105.m6981("᩺᩹") ^ i17;
                        i3 = ((iM2566 ^ i18) * (-29153)) ^ (-1010991420);
                        i4 = 825559263;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                case 194442174:
                case 996948273:
                    int i22 = i11 + i12;
                    if ((i22 + i22) - i10 < 0) {
                        iM6981 = C2105.m6981("֡ۨ") ^ i17;
                        i2 = i10;
                        i5 = ((iM6981 ^ i18) * (-12265)) ^ 1250022895;
                        i6 = -1290657350;
                    } else {
                        i2 = i10;
                        iM6981 = (C2105.m6981("ܶ֨") ^ i18) * 85;
                        i5 = ((iM6981 ^ i17) * (-7123)) ^ (-1314972546);
                        i6 = -678281561;
                    }
                    i20 = iM6981 ^ i6;
                    i19 = i5;
                    i10 = i2;
                    break;
                case 433790206:
                case 1454809988:
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C0237.f1507 != 0) {
                        iM2567 = C2105.m6981("ۗ᩺") ^ i18;
                        i7 = ((iM2567 ^ i17) * 21527) ^ (-1778505772);
                        i8 = 225753037;
                    } else {
                        iM2567 = C0630.m2566("᩶ۧ") ^ i17;
                        i7 = ((iM2567 ^ i18) * 1059) ^ (-302808192);
                        i8 = -257420984;
                    }
                    i20 = iM2567 ^ i8;
                    i19 = i7;
                    i9 = i9;
                    break;
                case 1831592838:
                case 2090143038:
                    i9 = i9;
                    i2 = i10;
                    sArr2 = f6710;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("ۢ۫") + i17) * (-31);
                        i3 = ((iM2566 ^ i18) * (-13519)) ^ 684500723;
                        i4 = -830701720;
                    } else {
                        iM2566 = (i17 - C2105.m6981("ᩴۖ")) * (-19);
                        i3 = ((iM2566 ^ i18) * 30203) ^ 583471217;
                        i4 = 1121453196;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i3;
                    i10 = i2;
                    i9 = i9;
                    break;
                default:
                    i = 58150;
                    int iM6985 = C2105.m6981("ۜ۬") ^ i18;
                    int i23 = i;
                    i20 = iM6985 ^ (-468671050);
                    i19 = ((iM6985 ^ i17) * 29415) ^ (-1020192957);
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
        int iM6981;
        int i;
        int i2;
        int i3 = C3432.f10845;
        int i4 = C5695.f17556;
        int iM2566 = (i4 - C0630.m2566("ᩳۢ")) * (-101);
        int i5 = ((iM2566 ^ i3) * 29747) ^ (-684671060);
        ViewGroup.LayoutParams layoutParamsM13553 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ (-1838943515);
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
                    layoutParamsM13553.height = i7;
                    view.setLayoutParams(layoutParamsM13553);
                    break;
                case -2048539388:
                case -968775874:
                    if (C11340.m28031()) {
                        iM6981 = (i4 - C2105.m6981("ܿܰ")) * (-35);
                        i = ((iM6981 ^ i3) * (-10065)) ^ (-1765451493);
                        i2 = 395864554;
                    } else {
                        iM6981 = C0630.m2566("᩺֨") ^ i3;
                        i = ((iM6981 ^ i4) * 20193) ^ (-1120310984);
                        i2 = 1267047225;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2045891516:
                case -1327064891:
                    C2105.m6982();
                    if (C22628.m50615() != 0) {
                        iM6981 = C0630.m2566("ܶ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM6981 = C0630.m2566("᩺֨") ^ i3;
                        i = ((iM6981 ^ i4) * 20193) ^ (-1120310984);
                        i2 = 1267047225;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2003768888:
                case 1785175848:
                    i11 = 35472;
                    iM6981 = (i3 - C2105.m6981("ۖ۟")) * (-125);
                    i = ((iM6981 ^ i4) * (-20559)) ^ 180489115;
                    i2 = 1847763982;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1907783674:
                case 1770845163:
                    C3746.m11369();
                    if (C1773.m5908() > 0) {
                        iM6981 = C0630.m2566("ܶ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM6981 = (C0630.m2566("ۤۧ") + i4) * (-107);
                        i = ((iM6981 ^ i3) * 13457) ^ 1642911568;
                        i2 = 534312924;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1630314401:
                case -1552364603:
                    i13 = 9;
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("ܶ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM6981 = C0630.m2566("ۘ֡") ^ i3;
                        i = ((iM6981 ^ i4) * (-16563)) ^ 1417195245;
                        i2 = -1330115624;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1129528496:
                case 1834542366:
                    s = sArr[c];
                    s2 = 16298;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܳۙ")) * (-81);
                        i = ((iM6981 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                    } else {
                        iM6981 = C2105.m6981("᩸᩻") ^ i3;
                        i = ((iM6981 ^ i4) * (-26539)) ^ (-507034360);
                        i2 = -1211996823;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -945504604:
                case -96381868:
                    sArr = f6710;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܳۙ")) * (-81);
                        i = ((iM6981 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                    } else {
                        iM6981 = (C0630.m2566("᩷֫") ^ i3) * (-71);
                        i = ((iM6981 ^ i4) * (-22487)) ^ (-1888655133);
                        i2 = 731809310;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -833799834:
                case 47542594:
                    i8 = s * s2;
                    i9 = s * s;
                    if (C2958.m9034() <= 0) {
                        iM6981 = C0630.m2566("ܶ۟") ^ i3;
                        i = ((iM6981 ^ i4) * (-23571)) ^ (-1427626467);
                        i2 = -544874484;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۤܽ")) * 123;
                        i = ((iM6981 ^ i3) * (-5447)) ^ (-1153576201);
                        i2 = 582445946;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -677465144:
                case 1337560733:
                    view = this.f6711;
                    layoutParamsM13553 = C4616.m13553(view);
                    if (RunnableC3474.f10992 <= 0) {
                        i7 = -2;
                        iM6981 = (C0630.m2566("ۤۧ") + i4) * (-107);
                        i = ((iM6981 ^ i3) * 13457) ^ 1642911568;
                        i2 = 534312924;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6982 = (C2105.m6981("۫᩸") ^ i4) * 51;
                        i5 = ((iM6982 ^ i3) * 22709) ^ (-395020683);
                        i6 = iM6982 ^ 1262795676;
                        i7 = -2;
                    }
                    break;
                case -609941776:
                case 122903317:
                    i10 = 66406201;
                    if (C1773.f6144 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ܳۙ")) * (-81);
                        i = ((iM6981 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                    } else {
                        iM6981 = C0630.m2566("ܺۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-25369)) ^ (-1200424363);
                        i2 = -852120677;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -359921599:
                case -119176259:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ܿܰ")) * (-35);
                        i = ((iM6981 ^ i3) * (-10065)) ^ (-1765451493);
                        i2 = 395864554;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۚܽ")) * (-103);
                        i = ((iM6981 ^ i3) * 13123) ^ (-1514516540);
                        i2 = 1969950656;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -317026750:
                case 194660194:
                    c = '*';
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("᩺֨") ^ i3;
                        i = ((iM6981 ^ i4) * 20193) ^ (-1120310984);
                        i2 = 1267047225;
                    } else {
                        iM6981 = C0630.m2566("۠۟") ^ i4;
                        i = ((iM6981 ^ i3) * MLKEMEngine.KyberQ) ^ (-155318578);
                        i2 = 1369127160;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -78056045:
                case 1561345186:
                    sArr2 = f6710;
                    i12 = 43;
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C0630.m2566("ۤۧ") + i4) * (-107);
                        i = ((iM6981 ^ i3) * 13457) ^ 1642911568;
                        i2 = 534312924;
                    } else {
                        iM6981 = C0630.m2566("᩻ᩳ") ^ i4;
                        i = ((iM6981 ^ i3) * 4257) ^ 1378391837;
                        i2 = 1313645770;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -23922049:
                case 193449654:
                    C0798.m2998();
                    iM6981 = C0630.m2566("ܶ۟") ^ i3;
                    i = ((iM6981 ^ i4) * (-23571)) ^ (-1427626467);
                    i2 = -544874484;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 95193401:
                case 666082666:
                    C3683.m11210(animator, C2272.m7507(sArr2, i12, i13, i11));
                    if (C1047.m3599() >= 0) {
                        iM6981 = (i3 - C0630.m2566("ܳۙ")) * (-81);
                        i = ((iM6981 ^ i4) * 28653) ^ 1220215768;
                        i2 = -581237803;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM6983 = (i4 - C2105.m6981("ܽۗ")) * 25;
                        i5 = ((iM6983 ^ i3) * 5979) ^ (-633597510);
                        i6 = iM6983 ^ 1710366024;
                    }
                    break;
                case 952761154:
                case 1935250777:
                    i11 = 41595;
                    iM6981 = (i3 - C2105.m6981("ۖ۟")) * (-125);
                    i = ((iM6981 ^ i4) * (-20559)) ^ 180489115;
                    i2 = 1847763982;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1590104447:
                case 2015434329:
                    if (i8 - (i9 + i10) > 0) {
                        iM6981 = (C0630.m2566("۟ܳ") ^ i4) * 3;
                        i = ((iM6981 ^ i3) * (-20745)) ^ 1446051564;
                        i2 = -9564565;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܽܺ")) * 87;
                        i = ((iM6981 ^ i4) * 3363) ^ (-1786811746);
                        i2 = -470033643;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    C3746.m11369();
                    C0798.m2998();
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
        String strM7159;
        int iM2566;
        int i;
        int i2;
        int i3 = C3537.f11231;
        int i4 = C3245.f10203;
        int iM2567 = (C0630.m2566("ܶ᩷") ^ i3) * (-55);
        int i5 = ((iM2567 ^ i4) * (-22585)) ^ 834798587;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ (-1379011939);
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
                    RunnableC0588.m2430(animator, str);
                    this.f6714.f33568 = true;
                    break;
                case -1951930292:
                case 1095599039:
                    C3746.m11369();
                    if (C3245.f10203 <= 0) {
                        strM7159 = str;
                        iM2566 = C2105.m6981("ۘ۟") ^ i4;
                        i = ((iM2566 ^ i3) * 27315) ^ (-1665434923);
                        i2 = -554047580;
                        String str2 = strM7159;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        str = str2;
                    }
                    strM7159 = str;
                    iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                    i = ((iM2566 ^ i4) * 19415) ^ (-128574565);
                    i2 = -570057361;
                    String str3 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str3;
                    break;
                case -1935929046:
                case -1576912005:
                    strM7159 = C2167.m7159(sArr2, i11, i12, i10);
                    if (C2958.f9394 >= 0) {
                        str = strM7159;
                        iM2566 = C2105.m6981("۠ܺ") ^ i3;
                        strM7159 = str;
                        i = ((iM2566 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                        String str4 = strM7159;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        str = str4;
                    } else {
                        int iM2568 = C0630.m2566("᩸ۤ") ^ i4;
                        i5 = ((iM2568 ^ i3) * (-12165)) ^ (-2034954655);
                        str = strM7159;
                        i6 = iM2568 ^ (-1566109060);
                    }
                    break;
                case -1422681371:
                case 1605894130:
                    strM7159 = str;
                    i8 = 212139225;
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("ܺܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-22065)) ^ (-654490565);
                        i2 = -1777262865;
                    } else {
                        iM2566 = (C0630.m2566("᩶۬") ^ i4) * (-87);
                        i = ((iM2566 ^ i3) * 23985) ^ (-728035351);
                        i2 = -84532504;
                    }
                    String str5 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str5;
                    break;
                case -1298261530:
                case 1019214859:
                    strM7159 = str;
                    int i14 = i7 + i8;
                    i9 = i14 + i14;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                        i = ((iM2566 ^ i4) * 19415) ^ (-128574565);
                        i2 = -570057361;
                    } else {
                        iM2566 = (C0630.m2566("۬ᩳ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i4) * (-15581)) ^ (-523697368);
                        i2 = -1918040683;
                    }
                    String str6 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str6;
                    break;
                case -1275535001:
                case 1490886683:
                    sArr2 = f6710;
                    if (C3746.f11829 <= 0) {
                        strM7159 = str;
                        i11 = 1;
                        iM2566 = (C2105.m6981("ۛ֫") ^ i4) * (-49);
                        i = ((iM2566 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                        String str7 = strM7159;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        str = str7;
                    } else {
                        int iM6981 = C2105.m6981("ۙ۠") ^ i4;
                        i6 = iM6981 ^ (-880179691);
                        i5 = ((iM6981 ^ i3) * (-6849)) ^ (-1079224586);
                        i11 = 1;
                    }
                    break;
                case -1009628029:
                case 2985361:
                    i10 = 36859;
                    iM2566 = C2105.m6981("ܺۧ") ^ i3;
                    strM7159 = str;
                    i = ((iM2566 ^ i4) * 31873) ^ (-1047290061);
                    i2 = -1989883204;
                    String str8 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str8;
                    break;
                case -726350315:
                case 1283701243:
                    strM7159 = str;
                    c = 0;
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("ܳۡ") + i3) * 99;
                        i = ((iM2566 ^ i4) * (-11667)) ^ (-1531410863);
                        i2 = 1568317625;
                    } else {
                        iM2566 = C2105.m6981("ܺܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-22065)) ^ (-654490565);
                        i2 = -1777262865;
                    }
                    String str9 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str9;
                    break;
                case -668248993:
                case 1644810742:
                    strM7159 = str;
                    s2 = 14565;
                    if (RunnableC0588.f2309 >= 0) {
                        str = strM7159;
                        iM2566 = C2105.m6981("۠ܺ") ^ i3;
                        strM7159 = str;
                        i = ((iM2566 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩸") ^ i3;
                        i = ((iM2566 ^ i4) * 30939) ^ 1703953727;
                        i2 = 810231260;
                    }
                    String str10 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str10;
                    break;
                case -504182968:
                case 1508153315:
                    strM7159 = str;
                    int i15 = s + s2;
                    if (i9 - (i15 * i15) < 0) {
                        iM2566 = (i4 - C2105.m6981("᩻᩺")) * 25;
                        i = ((iM2566 ^ i3) * (-12875)) ^ (-1356449291);
                        i2 = 1571515504;
                    } else {
                        iM2566 = (C0630.m2566("ۧۜ") + i4) * (-91);
                        i = ((iM2566 ^ i3) * (-9629)) ^ (-1530561338);
                        i2 = -1522413508;
                    }
                    String str11 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str11;
                    break;
                case -370145958:
                case -82708329:
                    if (C2520.f8000 >= 0) {
                        strM7159 = str;
                        i12 = 9;
                        iM2566 = (C2105.m6981("ۛ֫") ^ i4) * (-49);
                        i = ((iM2566 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                        String str12 = strM7159;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        str = str12;
                    } else {
                        int iM6982 = (C2105.m6981("᩶ۗ") ^ i3) * 39;
                        i6 = iM6982 ^ 1365002806;
                        i5 = ((iM6982 ^ i4) * (-16321)) ^ (-2134390198);
                        i12 = 9;
                    }
                    break;
                case -180744056:
                case 1556211582:
                    strM7159 = str;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C2105.m6981("ۛ֫") ^ i4) * (-49);
                        i = ((iM2566 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۢ֫")) * (-43);
                        i = ((iM2566 ^ i4) * 24517) ^ 2022944682;
                        i2 = -1372628797;
                    }
                    String str13 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str13;
                    break;
                case -58694453:
                case 1255306945:
                    C0630.m2564();
                    C0964.m3413();
                    strM7159 = str;
                    iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                    i = ((iM2566 ^ i4) * 19415) ^ (-128574565);
                    i2 = -570057361;
                    String str14 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str14;
                    break;
                case -46407603:
                case 1746985686:
                    strM7159 = str;
                    sArr = f6710;
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ۘ۟") ^ i4;
                        i = ((iM2566 ^ i3) * 27315) ^ (-1665434923);
                        i2 = -554047580;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩶") ^ i4;
                        i = ((iM2566 ^ i3) * (-26919)) ^ 1320218154;
                        i2 = 1861884117;
                    }
                    String str15 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str15;
                    break;
                case 76484576:
                case 1202255333:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("۠ܺ") ^ i3;
                        strM7159 = str;
                        i = ((iM2566 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                    } else {
                        strM7159 = str;
                        iM2566 = (C2105.m6981("ۛ֫") ^ i4) * (-49);
                        i = ((iM2566 ^ i3) * 2625) ^ 273341489;
                        i2 = -735962864;
                    }
                    String str16 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str16;
                    break;
                case 218340784:
                case 264219365:
                    C2272.m7503();
                    break;
                case 466535277:
                case 1180416730:
                    i10 = 2318;
                    iM2566 = C2105.m6981("ܺۧ") ^ i3;
                    strM7159 = str;
                    i = ((iM2566 ^ i4) * 31873) ^ (-1047290061);
                    i2 = -1989883204;
                    String str17 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str17;
                    break;
                case 1021433344:
                case 1200756913:
                    strM7159 = str;
                    s = sArr[c];
                    i7 = s * s;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ܺܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-22065)) ^ (-654490565);
                        i2 = -1777262865;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۙܽ")) * (-15);
                        i = ((iM2566 ^ i3) * (-26693)) ^ (-1636695859);
                        i2 = -1522052778;
                    }
                    String str18 = strM7159;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    str = str18;
                    break;
                default:
                    if (C22628.m50615() != 0) {
                        strM7159 = str;
                        iM2566 = C2105.m6981("᩻ۛ") ^ i3;
                        i = ((iM2566 ^ i4) * 19415) ^ (-128574565);
                        i2 = -570057361;
                    } else {
                        iM2566 = C2105.m6981("۠ܺ") ^ i3;
                        strM7159 = str;
                        i = ((iM2566 ^ i4) * (-569)) ^ (-201668933);
                        i2 = -1863035985;
                    }
                    String str19 = strM7159;
                    i6 = iM2566 ^ i2;
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
    
        if (l.C2272.m7503() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r1 = l.C2105.m6981("ܽ᩻") ^ r21;
        r14 = ((r1 ^ r22) * (-20573)) ^ 1379251886;
        r24 = -2139921305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        if (l.C1047.f3863 < 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationEnd(Animator animator) {
        int iM6981;
        int i;
        int i2;
        int iM6982;
        int i3;
        C2009 c2009 = this;
        int i4 = C1773.f6144;
        int i5 = C4117.f13076;
        int iM6983 = (i5 - C2105.m6981("ܿܶ")) * (-15);
        int i6 = ((iM6983 ^ i4) * (-3251)) ^ 1850172701;
        View view = null;
        View view2 = null;
        float[] fArr = null;
        short[] sArr = null;
        int i7 = iM6983 ^ (-1477610579);
        String strM28025 = null;
        int i8 = 0;
        float fM28026 = 0.0f;
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
        ObjectAnimator objectAnimatorM8018 = null;
        char c2 = 0;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * (-19471)) >> 31));
            switch (i14) {
                case -2101153400:
                case -1415857983:
                    int i16 = i12 + i13;
                    if ((i16 + i16) - i11 >= 0) {
                        iM6981 = (C0630.m2566("᩹ۛ") ^ i5) * (-51);
                        i = ((iM6981 ^ i4) * (-30057)) ^ (-1321926755);
                        i2 = 369925172;
                    } else {
                        iM6981 = C0630.m2566("ᩳۗ") ^ i4;
                        i = ((iM6981 ^ i5) * 25095) ^ 1998097237;
                        i2 = -1280535309;
                    }
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case -2003654205:
                case -1010622995:
                    if (C0422.f1886 > 0) {
                        int iM6984 = C2105.m6981("ܳۙ") ^ i4;
                        i7 = iM6984 ^ 815808616;
                        i6 = ((iM6984 ^ i5) * 13169) ^ (-412357852);
                        c2009 = this;
                    } else {
                        iM6981 = C2105.m6981("֫ۡ") ^ i5;
                        i = ((iM6981 ^ i4) * (-507)) ^ 136819758;
                        i2 = -645927538;
                        i7 = iM6981 ^ i2;
                        c2009 = this;
                        i6 = i;
                    }
                    break;
                case -1966365378:
                case 1975303:
                    fArr = new float[2];
                    if (C1005.m3501()) {
                        iM6982 = (C0630.m2566("۠᩺") ^ i4) * 59;
                        i = ((iM6982 ^ i5) * 731) ^ 1763217178;
                        i3 = -2089808477;
                    } else {
                        iM6982 = C0630.m2566("ᩴۜ") ^ i5;
                        i = ((iM6982 ^ i4) * 7413) ^ 681383459;
                        i3 = -564655732;
                    }
                    i7 = iM6982 ^ i3;
                    i6 = i;
                    break;
                case -1883848257:
                case -164068494:
                    C21923.m49329();
                    break;
                case -1659711551:
                case -915730041:
                    i9 = 60701;
                    iM6981 = (C2105.m6981("ᩳܿ") ^ i5) * 17;
                    i = ((iM6981 ^ i4) * 16347) ^ (-590163156);
                    i2 = -1608936605;
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case -1548912235:
                case 1246262105:
                    i9 = 14913;
                    iM6981 = (C2105.m6981("ᩳܿ") ^ i5) * 17;
                    i = ((iM6981 ^ i4) * 16347) ^ (-590163156);
                    i2 = -1608936605;
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case -1485209301:
                case 1668098392:
                    strM28025 = C11340.m28025(f6710, 11, 9, i9);
                    if (C4159.m12565() >= 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i5;
                        i = ((iM6981 ^ i4) * (-507)) ^ 136819758;
                        i2 = -645927538;
                    } else {
                        iM6981 = (C0630.m2566("ۚۤ") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i5) * (-16769)) ^ 1300964931;
                        i2 = -25403846;
                    }
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case -1397153266:
                case 1305540221:
                    sArr2 = f6710;
                    c = '\n';
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("֫ۡ") ^ i5;
                        i = ((iM6981 ^ i4) * (-507)) ^ 136819758;
                        i2 = -645927538;
                    } else {
                        iM6981 = (i4 - C2105.m6981("۟ܽ")) * 49;
                        i = ((iM6981 ^ i5) * 889) ^ (-1751099236);
                        i2 = -1560765301;
                    }
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case -1362165937:
                case 27653868:
                    C0714.m2805();
                    RunnableC3474.m10630();
                    iM6981 = C2105.m6981("֫ۡ") ^ i5;
                    i = ((iM6981 ^ i4) * (-507)) ^ 136819758;
                    i2 = -645927538;
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case -1267768101:
                case 505268120:
                    C0050.m940();
                    break;
                case -1226265756:
                case 130740396:
                    fArr[c2] = f;
                    sArr = f6710;
                    i10 = 20;
                    if (!C1711.f5919) {
                        iM6982 = (C0630.m2566("᩶ۙ") ^ i4) * (-119);
                        i = ((iM6982 ^ i5) * 31031) ^ 1585299707;
                        i3 = 1939828703;
                        i7 = iM6982 ^ i3;
                        i6 = i;
                    } else {
                        int iM6985 = C2105.m6981("ܳۙ") ^ i4;
                        i7 = iM6985 ^ 815808616;
                        i6 = ((iM6985 ^ i5) * 13169) ^ (-412357852);
                        c2009 = this;
                    }
                    break;
                case -972914064:
                case -931460380:
                    C22628.m50603(objectAnimatorM8018);
                    c2009.f6714.f33568 = true;
                    break;
                case -891877620:
                case 1189076807:
                    fArr[0] = fM28026;
                    f = 0.0f;
                    c2 = 1;
                    if (RunnableC0588.f2309 < 0) {
                        iM6982 = C2105.m6981("ۤۡ") ^ i5;
                        i = ((iM6982 ^ i4) * 17511) ^ (-536794756);
                        i3 = -534647362;
                        i7 = iM6982 ^ i3;
                        i6 = i;
                    } else {
                        int iM6986 = C2105.m6981("ܳۙ") ^ i4;
                        i7 = iM6986 ^ 815808616;
                        i6 = ((iM6986 ^ i5) * 13169) ^ (-412357852);
                        c2009 = this;
                    }
                    break;
                case -710031066:
                case 1128429216:
                    C3683.m11210(animator, strM28025);
                    view = c2009.f6713;
                    i8 = 8;
                    if (C1773.f6144 > 0) {
                        iM6981 = (C2105.m6981("᩺᩻") + i5) * (-87);
                        i = ((iM6981 ^ i4) * 30537) ^ (-728397340);
                        i2 = 1931643545;
                        i7 = iM6981 ^ i2;
                        c2009 = this;
                        i6 = i;
                    } else {
                        int iM6987 = C2105.m6981("ܳۙ") ^ i4;
                        i7 = iM6987 ^ 815808616;
                        i6 = ((iM6987 ^ i5) * 13169) ^ (-412357852);
                        c2009 = this;
                    }
                    break;
                case -209844047:
                case -121787109:
                    C1128.m3853(view, i8);
                    view2 = c2009.f6712;
                    fM28026 = C11340.m28026(view2);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6982 = (C0630.m2566("۟۫") + i5) * (-23);
                        i = ((iM6982 ^ i4) * (-19933)) ^ (-1275544466);
                        i3 = 869366988;
                        i7 = iM6982 ^ i3;
                        i6 = i;
                    }
                    iM6981 = (C2105.m6981("᩸᩶") + i5) * q.h;
                    i = ((iM6981 ^ i4) * 16981) ^ 2119224850;
                    i2 = 903890177;
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case 335723530:
                case 341054782:
                    i11 = i15 * i15;
                    i12 = s * s;
                    i13 = 3272481;
                    if (C4117.m12364() != 0) {
                        iM6981 = (C2105.m6981("᩸᩶") + i5) * q.h;
                        i = ((iM6981 ^ i4) * 16981) ^ 2119224850;
                        i2 = 903890177;
                    } else {
                        iM6981 = C2105.m6981("ۚᩴ") ^ i4;
                        i = ((iM6981 ^ i5) * (-15371)) ^ (-1263585714);
                        i2 = -1400930652;
                    }
                    i7 = iM6981 ^ i2;
                    c2009 = this;
                    i6 = i;
                    break;
                case 583075983:
                case 907847970:
                    objectAnimatorM8018 = C2520.m8018(view2, C0422.m1955(sArr, i10, 12, i9), fArr);
                    if (C0422.f1886 <= 0) {
                        iM6982 = C0630.m2566("ᩴۜ") ^ i5;
                        i = ((iM6982 ^ i4) * 7413) ^ 681383459;
                        i3 = -564655732;
                    } else {
                        iM6982 = C0630.m2566("ۖܿ") ^ i4;
                        i = ((iM6982 ^ i5) * 6277) ^ 2031720140;
                        i3 = -423186373;
                    }
                    i7 = iM6982 ^ i3;
                    i6 = i;
                    break;
                case 1195918856:
                case 1357710515:
                    short s2 = sArr2[c];
                    int i17 = s2 + 1809;
                    if (C4075.m12263() <= 0) {
                        s = s2;
                        i15 = i17;
                        iM6981 = (C2105.m6981("᩸᩶") + i5) * q.h;
                        i = ((iM6981 ^ i4) * 16981) ^ 2119224850;
                        i2 = 903890177;
                        i7 = iM6981 ^ i2;
                        c2009 = this;
                        i6 = i;
                    } else {
                        int iM2566 = (C0630.m2566("ۘۜ") + i5) * 63;
                        i6 = ((iM2566 ^ i4) * 19049) ^ 1805321775;
                        i15 = i17;
                        c2009 = this;
                        i7 = iM2566 ^ 1334239275;
                        s = s2;
                    }
                    break;
                default:
                    C7811.m20844();
                    break;
            }
            return;
        }
    }

    public C2009(View view, View view2, View view3, C11182 c11182) {
        int i = 225211555;
        int i2 = C1047.f3863;
        int i3 = C0050.f910;
        int iM2566 = C0630.m2566("۫֡") ^ i3;
        int i4 = ((iM2566 ^ i2) * (-7599)) ^ 1127210555;
        int i5 = -1164783380;
        while (true) {
            i = ((((i ^ i2) * (-8119)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1761305808:
                case -1505750073:
                    this.f6712 = view3;
                    this.f6714 = c11182;
                    return;
                case -1685612662:
                case 1080138117:
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("۠ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM2566 = C2105.m6981("᩺᩵") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-9997)) ^ 1592967185;
                        i5 = -859236510;
                    }
                    break;
                case -1526454320:
                case 1523911147:
                    if (C2272.f7362) {
                        iM2566 = (C2105.m6981("ۘۜ") ^ i2) * (-45);
                        i4 = ((iM2566 ^ i3) * 16133) ^ (-1119150083);
                        i5 = 1256168492;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۢ") ^ i3) * (-33);
                        i4 = ((iM2566 ^ i2) * 10213) ^ 299036903;
                        i5 = 1889615027;
                    }
                    break;
                case -1445685550:
                case 516869240:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("۠ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM2566 = (C2105.m6981("ۧܶ") ^ i2) * (-79);
                        i4 = ((iM2566 ^ i3) * 24713) ^ 1955971354;
                        i5 = 399825891;
                    }
                    break;
                case -1371269342:
                case -190530285:
                    if (C4616.m13552() != 0) {
                        iM2566 = C2105.m6981("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1439)) ^ (-523770003);
                        i5 = -1640939384;
                    } else {
                        iM2566 = C0630.m2566("۫ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16899) ^ 1446916774;
                        i5 = 640464866;
                    }
                    break;
                case -1111676150:
                case 1797225211:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("۠ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM2566 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15099) ^ (-945362295);
                        i5 = 589598692;
                    }
                    break;
                case -917675596:
                case 1792898062:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("֡ۙ") + i3) * 29;
                        i4 = ((iM2566 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    } else {
                        iM2566 = (C2105.m6981("۬۬") + i3) * 87;
                        i4 = ((iM2566 ^ i2) * (-13067)) ^ (-256339442);
                        i5 = -1029245307;
                    }
                    break;
                case -805209094:
                case 3892712:
                    C2958.m9034();
                    if (C1047.m3599() < 0) {
                        iM2566 = C2105.m6981("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1439)) ^ (-523770003);
                        i5 = -1640939384;
                    } else {
                        iM2566 = (C0630.m2566("֡ۙ") + i3) * 29;
                        i4 = ((iM2566 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    }
                    break;
                case -628525311:
                case 238133561:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C2105.m6981("ۘۜ") ^ i2) * (-45);
                        i4 = ((iM2566 ^ i3) * 16133) ^ (-1119150083);
                        i5 = 1256168492;
                    } else {
                        iM2566 = C0630.m2566("᩸ۙ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 15465) ^ 1743798209;
                        i5 = -408532474;
                    }
                    break;
                case -545162123:
                case -156056620:
                    if (C4159.m12565() < 0) {
                        iM2566 = C2105.m6981("۠ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM2566 = (C0630.m2566("֡ۙ") + i3) * 29;
                        i4 = ((iM2566 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    }
                    break;
                case -426141067:
                case 1819866429:
                    C0483.m2121();
                    throw new RuntimeException();
                case -219285939:
                case 506839054:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C0630.m2566("֡ۙ") + i3) * 29;
                        i4 = ((iM2566 ^ i2) * (-5315)) ^ (-1514854034);
                        i5 = 2018592258;
                    } else {
                        iM2566 = C0630.m2566("᩹۫") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3937)) ^ (-755589007);
                        i5 = -967993575;
                    }
                    break;
                case 255079422:
                case 1178014129:
                    this.f6711 = view;
                    this.f6713 = view2;
                    if (C1504.f5354) {
                        iM2566 = C2105.m6981("۠ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4153)) ^ 425434496;
                        i5 = -1924940931;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩵᩻")) * (-99);
                        i4 = ((iM2566 ^ i3) * (-24441)) ^ 1571730239;
                        i5 = -287738553;
                    }
                    break;
                case 323619650:
                case 481963214:
                    ServiceConnectionC3453.m10564();
                    C0630.m2564();
                    iM2566 = (C0630.m2566("֡ۙ") + i3) * 29;
                    i4 = ((iM2566 ^ i2) * (-5315)) ^ (-1514854034);
                    i5 = 2018592258;
                    break;
                case 1102208304:
                case 1194351002:
                    if (C1711.f5919) {
                        iM2566 = (C2105.m6981("ۘۜ") ^ i2) * (-45);
                        i4 = ((iM2566 ^ i3) * 16133) ^ (-1119150083);
                        i5 = 1256168492;
                    } else {
                        iM2566 = (C2105.m6981("ۜܶ") ^ i3) * 7;
                        i4 = ((iM2566 ^ i2) * (-15469)) ^ 1901782093;
                        i5 = 2139944647;
                    }
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("᩵᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1439)) ^ (-523770003);
                        i5 = -1640939384;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۨܶ")) * 37;
                        i4 = ((iM2566 ^ i3) * (-9207)) ^ (-1950550467);
                        i5 = -2036566284;
                    }
                    break;
            }
        }
    }
}
