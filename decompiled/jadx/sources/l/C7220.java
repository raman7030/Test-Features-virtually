package l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C7220 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ܶۧ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f22104 = {8300, -640, -625, -632, -628, -640, -619, -632, -626, -625, 6942, -21548, -21541, -21540, -21544, -21548, -21567, -21540, -21542, -21541, -21548, -21543, -21563, -21539, -21548, 5698, -9398, -9403, -9406, -9402, -9398, -9377, -9406, -9404, -9403, 7388, -4581, -4588, -4589, -4585, -4581, -4594, -4589, -4587, -4588};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f22105;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f22106;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f22107;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11182 f22108;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f22109;

    /* JADX WARN: Code duplicated, block: B:59:0x0207 A[PHI: r5 r6 r7 r11 r16 r17
      0x0207: PHI (r5v4 int) = (r5v2 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int) binds: [B:44:0x016b, B:40:0x0148, B:10:0x0047, B:6:0x003c, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r6v4 int) = (r6v2 int), (r6v1 int), (r6v1 int), (r6v1 int), (r6v1 int) binds: [B:44:0x016b, B:40:0x0148, B:10:0x0047, B:6:0x003c, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r7v4 int) = (r7v1 int), (r7v2 int), (r7v1 int), (r7v1 int), (r7v1 int) binds: [B:44:0x016b, B:40:0x0148, B:10:0x0047, B:6:0x003c, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v1 int), (r11v1 int), (r11v5 int) binds: [B:44:0x016b, B:40:0x0148, B:10:0x0047, B:6:0x003c, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r16v4 short[]) = (r16v1 short[]), (r16v1 short[]), (r16v1 short[]), (r16v2 short[]), (r16v1 short[]) binds: [B:44:0x016b, B:40:0x0148, B:10:0x0047, B:6:0x003c, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r17v21 int) = (r17v8 int), (r17v9 int), (r17v17 int), (r17v19 int), (r17v22 int) binds: [B:44:0x016b, B:40:0x0148, B:10:0x0047, B:6:0x003c, B:26:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0238 A[PHI: r2 r3 r17
      0x0238: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:62:0x0236, B:52:0x01b3, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:62:0x0236, B:52:0x01b3, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0238: PHI (r17v16 int) = (r17v3 int), (r17v5 int), (r17v18 int) binds: [B:62:0x0236, B:52:0x01b3, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x026a A[PHI: r4 r17
      0x026a: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:66:0x0268, B:48:0x018e] A[DONT_GENERATE, DONT_INLINE]
      0x026a: PHI (r17v6 int) = (r17v2 int), (r17v7 int) binds: [B:66:0x0268, B:48:0x018e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (l.RunnableC1937.f6483 < 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationRepeat(Animator animator) {
        int i;
        int iM2566;
        int i2;
        int i3;
        int i4;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1019138655;
        int i13 = C0714.f2697;
        int i14 = RunnableC1937.f6483;
        int iM6981 = C2105.m6981("ۙ᩻") ^ i14;
        int i15 = ((iM6981 ^ i13) * 6953) ^ 2132234058;
        int i16 = iM6981 ^ (-644434066);
        short[] sArr2 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 10435) >> 31));
            switch (i12) {
                case -1965323688:
                case -582422830:
                    C3432.m10477();
                    C3746.m11369();
                    i = i9;
                    iM2566 = C2105.m6981("᩸ۗ") ^ i13;
                    i2 = ((iM2566 ^ i14) * (-3677)) ^ 1063290529;
                    i3 = -880362021;
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1918083337:
                case 2124371277:
                    if (C3746.f11829 <= 0) {
                        i = i9;
                        i11 = 9;
                        iM2566 = C2105.m6981("᩸ۗ") ^ i13;
                        i2 = ((iM2566 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                        i16 = iM2566 ^ i3;
                        i15 = i2;
                        i9 = i;
                    } else {
                        int iM2567 = C0630.m2566("֡۠") ^ i14;
                        i16 = iM2567 ^ 693330544;
                        i15 = ((iM2567 ^ i13) * (-1043)) ^ 105567826;
                        i11 = 9;
                    }
                    break;
                case -1826293040:
                case -1092554316:
                    i = i9;
                    i8 = 341288676;
                    if (C0630.m2564()) {
                        iM2566 = C2105.m6981("᩸ۗ") ^ i13;
                        i2 = ((iM2566 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                    } else {
                        iM2566 = C2105.m6981("ܶ֡") ^ i14;
                        i2 = ((iM2566 ^ i13) * 25349) ^ 784186763;
                        i3 = 158346167;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1735192138:
                case -1729505103:
                    i = i9;
                    int i17 = i7 + i8;
                    if (i6 - (i17 + i17) <= 0) {
                        iM2566 = (C0630.m2566("۫ۘ") ^ i14) * (-65);
                        i2 = ((iM2566 ^ i13) * (-29803)) ^ (-1240873839);
                        i3 = 709294506;
                    } else {
                        iM2566 = C2105.m6981("ۡܰ") ^ i13;
                        i2 = ((iM2566 ^ i14) * 21013) ^ 911515905;
                        i3 = -796884294;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1483932160:
                case 1170906265:
                    C0714.m2805();
                    C7106.m19120();
                    break;
                case -1470330746:
                case 1832033772:
                    i = i9;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ۤۧ") ^ i14;
                        i2 = ((iM2566 ^ i13) * (-17263)) ^ (-1001221181);
                        i3 = 1874419700;
                    } else {
                        iM2566 = (C0630.m2566("᩷ۨ") + i14) * (-115);
                        i2 = ((iM2566 ^ i13) * 893) ^ (-1198761887);
                        i3 = 937081829;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1428032400:
                case 1931342167:
                    i = i9;
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("᩸ۗ") ^ i13;
                        i2 = ((iM2566 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                    } else {
                        iM2566 = (C2105.m6981("ۤۨ") + i13) * (-21);
                        i2 = ((iM2566 ^ i14) * (-11705)) ^ (-1441905149);
                        i3 = -1068220901;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1293817885:
                case 798384810:
                    sArr = f22104;
                    i10 = 26;
                    if (C3746.m11369() >= 0) {
                        iM2566 = C0630.m2566("᩹۬") ^ i13;
                        i = i9;
                        i2 = ((iM2566 ^ i14) * (-30373)) ^ 597830854;
                        i3 = 77048790;
                    } else {
                        i = i9;
                        iM2566 = C0630.m2566("᩺᩵") ^ i14;
                        i2 = ((iM2566 ^ i13) * 27833) ^ 119855382;
                        i3 = -276839076;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1286572379:
                case 1313198825:
                    C4075.m12263();
                    if (C2520.f8000 < 0) {
                        i = i9;
                        iM2566 = C2105.m6981("ۤۧ") ^ i14;
                        i2 = ((iM2566 ^ i13) * (-17263)) ^ (-1001221181);
                        i3 = 1874419700;
                        i16 = iM2566 ^ i3;
                        i15 = i2;
                        i9 = i;
                    }
                    i = i9;
                    iM2566 = C2105.m6981("᩸ۗ") ^ i13;
                    i2 = ((iM2566 ^ i14) * (-3677)) ^ 1063290529;
                    i3 = -880362021;
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1196423163:
                case 1250481695:
                    C3683.m11210(animator, C2520.m8030(sArr, i10, i11, i9));
                    break;
                case -1023963293:
                case 1838915863:
                    i = i9;
                    s = sArr2[c];
                    s2 = 18474;
                    if (C0964.m3413()) {
                        iM2566 = (C2105.m6981("ᩳ᩵") ^ i14) * 39;
                        i2 = ((iM2566 ^ i13) * 215) ^ 42849548;
                        i3 = 56069307;
                    } else {
                        iM2566 = C2105.m6981("ۤۧ") ^ i14;
                        i2 = ((iM2566 ^ i13) * (-17263)) ^ (-1001221181);
                        i3 = 1874419700;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -777543183:
                case 1590641864:
                    i4 = 11248;
                    iM2566 = C0630.m2566("᩹᩸") ^ i13;
                    i = i4;
                    i2 = ((iM2566 ^ i14) * 4509) ^ (-1952192575);
                    i3 = 1018016481;
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -759425546:
                case -551904653:
                    i4 = 56107;
                    iM2566 = C0630.m2566("᩹᩸") ^ i13;
                    i = i4;
                    i2 = ((iM2566 ^ i14) * 4509) ^ (-1952192575);
                    i3 = 1018016481;
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -27632547:
                case 61763946:
                    C1420.m4913();
                    if (C2958.f9394 >= 0) {
                        i = i9;
                        iM2566 = (C2105.m6981("ۜۜ") + i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM2566 ^ i13) * (-5207)) ^ (-1390411791);
                        i3 = -1482510718;
                        i16 = iM2566 ^ i3;
                        i15 = i2;
                        i9 = i;
                    }
                    iM2566 = C0630.m2566("᩹۬") ^ i13;
                    i = i9;
                    i2 = ((iM2566 ^ i14) * (-30373)) ^ 597830854;
                    i3 = 77048790;
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 207038705:
                case 1215661702:
                    i = i9;
                    if (C0483.f2088 >= 0) {
                        iM2566 = (C0630.m2566("ۧܳ") + i13) * (-69);
                        i2 = ((iM2566 ^ i14) * (-31635)) ^ (-1396309559);
                        i3 = -365458502;
                    } else {
                        iM2566 = C0630.m2566("ۧۢ") ^ i13;
                        i2 = ((iM2566 ^ i14) * 31137) ^ (-2045588474);
                        i3 = 638799424;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 371738476:
                case 2091668032:
                    i = i9;
                    c = 25;
                    if (C7811.f24123 >= 0) {
                        iM2566 = (C2105.m6981("ۜۜ") + i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM2566 ^ i13) * (-5207)) ^ (-1390411791);
                        i3 = -1482510718;
                    } else {
                        iM2566 = (i13 - C0630.m2566("۬۬")) * (-63);
                        i2 = ((iM2566 ^ i14) * 32517) ^ (-1909664985);
                        i3 = -1759202230;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 775763228:
                case 979479875:
                    i = i9;
                    i5 = s + s2;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ۧܳ") + i13) * (-69);
                        i2 = ((iM2566 ^ i14) * (-31635)) ^ (-1396309559);
                        i3 = -365458502;
                    } else {
                        iM2566 = C0630.m2566("ܰۜ") ^ i13;
                        i2 = ((iM2566 ^ i14) * 25293) ^ (-1733462216);
                        i3 = -44953882;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 1426301174:
                case 1563995020:
                    break;
                default:
                    i = i9;
                    sArr2 = f22104;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C2105.m6981("᩸ۗ") ^ i13;
                        i2 = ((iM2566 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                    } else {
                        iM2566 = C2105.m6981("ۡۙ") ^ i14;
                        i2 = ((iM2566 ^ i13) * (-20913)) ^ (-863067475);
                        i3 = -2016721826;
                    }
                    i16 = iM2566 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00eb A[PHI: r5
      0x00eb: PHI (r5v5 android.view.View) = (r5v3 android.view.View), (r5v2 android.view.View), (r5v2 android.view.View) binds: [B:32:0x00e9, B:24:0x009a, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0228 A[PHI: r2 r4 r10 r11 r13
      0x0228: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String) binds: [B:49:0x01aa, B:14:0x0071, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r4v6 android.view.View) = (r4v2 android.view.View), (r4v5 android.view.View), (r4v2 android.view.View) binds: [B:49:0x01aa, B:14:0x0071, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r10v3 short) = (r10v2 short), (r10v2 short), (r10v4 short) binds: [B:49:0x01aa, B:14:0x0071, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:49:0x01aa, B:14:0x0071, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0228: PHI (r13v6 short[]) = (r13v2 short[]), (r13v5 short[]), (r13v2 short[]) binds: [B:49:0x01aa, B:14:0x0071, B:6:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (l.C3663.m11168() >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (l.C3746.f11829 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (l.C0964.m3413() != false) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationEnd(Animator animator) {
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        C7220 c7220 = this;
        int i4 = C1047.f3863;
        int i5 = C22628.f73083;
        int iM2568 = (C0630.m2566("᩸ᩴ") + i4) * 123;
        int i6 = ((iM2568 ^ i5) * (-11713)) ^ 1355151899;
        ViewGroup.LayoutParams layoutParamsM13553 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2568 ^ (-189074630);
        int iM3498 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 722631807;
        View view = null;
        View view2 = null;
        float[] fArr = null;
        String strM12578 = null;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * 14369) >> 31));
            switch (i12) {
                case -2143257102:
                case -857183738:
                    C1916.m6308();
                    break;
                case -2108432258:
                case -1335762339:
                    i10 = 20;
                    i11 = 5;
                    if (C1294.f4556 >= 0) {
                        iM2567 = (C0630.m2566("۫᩻") ^ i5) * (-75);
                        i = ((iM2567 ^ i4) * (-2437)) ^ (-1643847921);
                        i3 = 1388549506;
                    } else {
                        iM2567 = C0630.m2566("֨ܰ") ^ i4;
                        i = ((iM2567 ^ i5) * 24997) ^ 2046265240;
                        i3 = -803292593;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -1644178800:
                case 758969980:
                    view.setLayoutParams(layoutParamsM13553);
                    c7220.f22108.f33568 = true;
                    break;
                case -1564920968:
                case 732369116:
                    if ((55890576 + i8) - (s * 14952) < 0) {
                        iM2566 = C2105.m6981("ۗۤ") ^ i5;
                        i = ((iM2566 ^ i4) * (-8153)) ^ (-712135562);
                        i2 = -362704194;
                    } else {
                        iM2566 = (C0630.m2566("ۡܰ") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM2566 ^ i4) * (-15051)) ^ 128137474;
                        i2 = 2110479763;
                    }
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case -1415667354:
                case 994501299:
                    C3683.m11210(animator, strM12578);
                    fArr = new float[2];
                    if (C1420.f5096 <= 0) {
                        iM2566 = C2105.m6981("֨ۡ") ^ i4;
                        i = ((iM2566 ^ i5) * (-18401)) ^ 692743853;
                        i2 = 1403820632;
                        i7 = iM2566 ^ i2;
                        c7220 = this;
                        i6 = i;
                    } else {
                        int iM6981 = (i5 - C2105.m6981("ۨۤ")) * 85;
                        i7 = iM6981 ^ 1415912402;
                        i6 = ((iM6981 ^ i4) * 26435) ^ (-836777176);
                        c7220 = this;
                    }
                    break;
                case -1365320585:
                case -545108304:
                    i9 = 58817;
                    iM2566 = (C0630.m2566("ۚۡ") ^ i4) * 123;
                    i = ((iM2566 ^ i5) * (-15367)) ^ 1465113329;
                    i2 = 1050216793;
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case -1334644127:
                case -553940409:
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    view2 = c7220.f22109;
                    sArr2 = f22104;
                    if (C4117.f13076 > 0) {
                        iM2567 = C0630.m2566("ᩴᩳ") ^ i5;
                        i = ((iM2567 ^ i4) * 28665) ^ (-1480389522);
                        i3 = -1212962590;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = C0630.m2566("᩷ۨ") ^ i5;
                    i = ((iM2566 ^ i4) * 9221) ^ (-1962034438);
                    i2 = 146286240;
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case -1264432721:
                case 1029184274:
                    C22628.m50615();
                    C4117.m12364();
                    break;
                case -1172532422:
                case 251363261:
                    sArr = f22104;
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("ᩳۤ") + i4) * (-65);
                        i = ((iM2566 ^ i5) * (-137)) ^ 933670727;
                        i2 = -547562688;
                    } else {
                        iM2566 = (C0630.m2566("᩵֡") + i5) * 31;
                        i = ((iM2566 ^ i4) * 10949) ^ 1763860067;
                        i2 = -1976385897;
                    }
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case -1139822624:
                case 748433471:
                    C11340.m28031();
                    break;
                case -947140285:
                case 706289795:
                    strM12578 = C4159.m12578(f22104, 11, 9, i9);
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("᩷ۨ") ^ i5;
                        i = ((iM2566 ^ i4) * 9221) ^ (-1962034438);
                        i2 = 146286240;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩺ۧ")) * (-7);
                        i = ((iM2566 ^ i5) * (-32125)) ^ 2138724072;
                        i2 = -1974412614;
                    }
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case -556521208:
                case 2019487496:
                    C4117.m12364();
                    C1711.m5736();
                    iM2566 = C0630.m2566("᩷ۨ") ^ i5;
                    i = ((iM2566 ^ i4) * 9221) ^ (-1962034438);
                    i2 = 146286240;
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case -547298692:
                case 1566968238:
                    C21923.m49341(C5695.m16025(view2, C2167.m7159(sArr2, i10, i11, i9), fArr));
                    view = c7220.f22107;
                    if (C2167.f7158 >= 0) {
                        iM2567 = (C0630.m2566("᩷ۖ") + i5) * 71;
                        i = ((iM2567 ^ i4) * 10267) ^ (-1279909534);
                        i3 = -566204591;
                    } else {
                        iM2567 = (i5 - C0630.m2566("ۖ᩷")) * (-61);
                        i = ((iM2567 ^ i4) * (-31507)) ^ 1096362061;
                        i3 = 675230902;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case -510928924:
                case 536911655:
                    i9 = 43957;
                    iM2566 = (C0630.m2566("ۚۡ") ^ i4) * 123;
                    i = ((iM2566 ^ i5) * (-15367)) ^ 1465113329;
                    i2 = 1050216793;
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case 18816432:
                case 811428670:
                    layoutParamsM13553 = C4616.m13553(view);
                    iM3498 = C1005.m3498(view);
                    if (!C0382.m1848()) {
                        iM2567 = (C2105.m6981("ۤᩴ") ^ i4) * 115;
                        i = ((iM2567 ^ i5) * (-11735)) ^ 813150815;
                        i3 = -1241687826;
                        i7 = iM2567 ^ i3;
                        i6 = i;
                    }
                    iM2566 = (C0630.m2566("ᩳۤ") + i4) * (-65);
                    i = ((iM2566 ^ i5) * (-137)) ^ 933670727;
                    i2 = -547562688;
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case 167798674:
                case 950738357:
                    layoutParamsM13553.height = iM3498 / 5;
                    if (C2958.f9394 >= 0) {
                        iM2567 = (C0630.m2566("᩷ۖ") + i5) * 71;
                        i = ((iM2567 ^ i4) * 10267) ^ (-1279909534);
                        i3 = -566204591;
                    } else {
                        iM2567 = C0630.m2566("ᩳۜ") ^ i4;
                        i = ((iM2567 ^ i5) * 7119) ^ (-505185599);
                        i3 = 277146928;
                    }
                    i7 = iM2567 ^ i3;
                    i6 = i;
                    break;
                case 215182246:
                case 1283126909:
                    c = '\n';
                    if (C0382.f1805) {
                        iM2566 = C2105.m6981("ᩴۜ") ^ i4;
                        i = ((iM2566 ^ i5) * 10125) ^ 819675114;
                        i2 = 1653807079;
                    } else {
                        iM2566 = C2105.m6981("֨ۡ") ^ i4;
                        i = ((iM2566 ^ i5) * (-18401)) ^ 692743853;
                        i2 = 1403820632;
                    }
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
                case 324536064:
                case 1693810157:
                    break;
                default:
                    s = sArr[c];
                    i8 = s * s;
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("᩷ۨ") ^ i5;
                        i = ((iM2566 ^ i4) * 9221) ^ (-1962034438);
                        i2 = 146286240;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩺") ^ i4;
                        i = ((iM2566 ^ i5) * (-30719)) ^ 676077262;
                        i2 = 801233137;
                    }
                    i7 = iM2566 ^ i2;
                    c7220 = this;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0291 A[PHI: r2 r12 r13 r14 r18 r19 r20
      0x0291: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r18v16 char) = (r18v2 char), (r18v4 char), (r18v15 char), (r18v17 char) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r19v5 short[]) = (r19v3 short[]), (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r20v16 int) = (r20v0 int), (r20v2 int), (r20v15 int), (r20v17 int) binds: [B:16:0x0065, B:69:0x028f, B:40:0x014b, B:36:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int i8;
        int i9 = C2958.f9394;
        int i10 = C4616.f14690;
        int iM2568 = C0630.m2566("ۗܶ") ^ i10;
        int i11 = ((iM2568 ^ i9) * (-20957)) ^ (-826624236);
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = iM2568 ^ 1504419097;
        char c = 0;
        short s = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s2 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -258236393;
        View view = null;
        String strM5177 = null;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i9) * 3015) >> 31));
            switch (i19) {
                case -2134803962:
                case 379290517:
                    c = c;
                    i13 = i13;
                    C3683.m11210(animator, strM5177);
                    view = this.f22109;
                    if (view.getTag() == null) {
                        iM6981 = C2105.m6981("ۗۙ") ^ i10;
                        i = ((iM6981 ^ i9) * (-23525)) ^ 39177265;
                        i2 = -113884015;
                    } else {
                        iM6981 = C0630.m2566("ܿ֫") ^ i9;
                        i = ((iM6981 ^ i10) * (-17985)) ^ 2121882504;
                        i2 = 2143661604;
                    }
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1964535041:
                case -964363182:
                    C3746.m11360(view, 0);
                    C1294.m4370(view, 0.0f);
                    break;
                case -1842567040:
                case 2056653019:
                    C4616.m13552();
                    C3663.m11168();
                    int iM6982 = C2105.m6981("֫᩺") ^ i9;
                    i8 = ((iM6982 ^ i10) * 2147) ^ 160077910;
                    i12 = iM6982 ^ 1499045981;
                    i11 = i8;
                    break;
                case -1809080060:
                case 879005517:
                    c = c;
                    i13 = i13;
                    sArr = f22104;
                    if (C11340.m28031()) {
                        iM6981 = (i9 - C2105.m6981("۠ۚ")) * (-125);
                        i = ((iM6981 ^ i10) * 28211) ^ 2091964643;
                        i2 = -186574902;
                    } else {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i10;
                        i = ((iM6981 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                    }
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1504342526:
                case -52442533:
                    i16 = 60341;
                    iM6981 = C2105.m6981("᩻֡") ^ i9;
                    i = ((iM6981 ^ i10) * 32719) ^ 1441682048;
                    i2 = -378103465;
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1463516170:
                case 1833736069:
                    i16 = 61050;
                    iM6981 = C2105.m6981("᩻֡") ^ i9;
                    i = ((iM6981 ^ i10) * 32719) ^ 1441682048;
                    i2 = -378103465;
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1401179931:
                case 119517403:
                    RunnableC0588.m2441();
                    C3911.m11924();
                    break;
                case -1165509987:
                case -838890645:
                    i13 = i13;
                    c = '#';
                    if (C1504.m5179()) {
                        iM2567 = C0630.m2566("ܿۚ") ^ i9;
                        i6 = ((iM2567 ^ i10) * 28975) ^ 1384658444;
                        i7 = 889981986;
                    } else {
                        iM2567 = (C0630.m2566("ۚ۬") + i9) * 43;
                        i6 = ((iM2567 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                    }
                    i12 = iM2567 ^ i7;
                    i11 = i6;
                    i13 = i13;
                    break;
                case -1070714418:
                case 1411458774:
                    c = c;
                    s = sArr[c];
                    i13 = s * s;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("ۗܿ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-5263)) ^ (-1591904395);
                        i4 = 129623451;
                    } else {
                        iM2566 = C0630.m2566("᩷ۧ") ^ i10;
                        i3 = ((iM2566 ^ i9) * (-27355)) ^ 1642113698;
                        i4 = 532974775;
                    }
                    i5 = iM2566 ^ i4;
                    i11 = i3;
                    c = c;
                    i12 = i5;
                    break;
                case -750384715:
                case 1156077477:
                    c = c;
                    i13 = i13;
                    int i20 = i13 + i14;
                    i15 = i20 + i20;
                    s2 = 8839;
                    if (!C1005.m3501()) {
                        c = c;
                        iM2567 = (C0630.m2566("ۚ۬") + i9) * 43;
                        i6 = ((iM2567 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                        i12 = iM2567 ^ i7;
                        i11 = i6;
                        i13 = i13;
                    } else {
                        iM6981 = C0630.m2566("᩻֫") ^ i9;
                        i = ((iM6981 ^ i10) * (-7155)) ^ 677704137;
                        i2 = 363059517;
                        i5 = iM6981 ^ i2;
                        i11 = i;
                        c = c;
                        i13 = i13;
                        i12 = i5;
                    }
                    break;
                case -681881031:
                case 475494726:
                    c = c;
                    i13 = i13;
                    sArr2 = f22104;
                    i17 = 36;
                    i18 = 9;
                    if (C1047.m3599() >= 0) {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i10;
                        i = ((iM6981 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                    } else {
                        iM6981 = C0630.m2566("᩹ܳ") ^ i10;
                        i = ((iM6981 ^ i9) * (-23599)) ^ 1370074644;
                        i2 = 888188908;
                    }
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -655753835:
                case -544390989:
                    c = c;
                    C11182 c11182 = this.f22108;
                    if (RunnableC0588.f2309 < 0) {
                        C14855 c14855 = new C14855(c11182);
                        if (!C3663.f11553) {
                            i13 = i13;
                            new ViewOnClickListenerC5809(this.f22105, this.f22106, view, c14855);
                            C0964.m3404(view, view);
                            iM6981 = C0630.m2566("ܿ֫") ^ i9;
                            i = ((iM6981 ^ i10) * (-17985)) ^ 2121882504;
                            i2 = 2143661604;
                            i5 = iM6981 ^ i2;
                            i11 = i;
                            c = c;
                            i13 = i13;
                            i12 = i5;
                        } else {
                            int iM2569 = C0630.m2566("᩵᩸") ^ i9;
                            i8 = ((iM2569 ^ i10) * (-22653)) ^ 948197987;
                            c = c;
                            i12 = iM2569 ^ 827185349;
                            i11 = i8;
                        }
                    } else {
                        i13 = i13;
                        c = c;
                        iM2567 = (C0630.m2566("ۚ۬") + i9) * 43;
                        i6 = ((iM2567 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                        i12 = iM2567 ^ i7;
                        i11 = i6;
                        i13 = i13;
                    }
                    break;
                case -528336582:
                case 387032296:
                    c = c;
                    i13 = i13;
                    int i21 = s + s2;
                    if ((i21 * i21) - i15 <= 0) {
                        iM6981 = (i9 - C2105.m6981("ᩳܿ")) * (-61);
                        i = ((iM6981 ^ i10) * 2355) ^ 1511999616;
                        i2 = -96758780;
                    } else {
                        iM6981 = (C0630.m2566("᩹ۤ") ^ i10) * (-17);
                        i = ((iM6981 ^ i9) * 28061) ^ 1848110035;
                        i2 = -1855517602;
                    }
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -197767681:
                case 306727670:
                    c = c;
                    i13 = i13;
                    strM5177 = C1504.m5177(sArr2, i17, i18, i16);
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i10;
                        i = ((iM6981 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                    } else {
                        iM6981 = (C2105.m6981("۬ܰ") ^ i10) * 33;
                        i = ((iM6981 ^ i9) * (-32735)) ^ 62759648;
                        i2 = 2128222594;
                    }
                    i5 = iM6981 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -104839766:
                case 1070753470:
                    RunnableC1937.m6387();
                    if (C0798.f2919) {
                        int iM6983 = C2105.m6981("֫᩺") ^ i9;
                        i8 = ((iM6983 ^ i10) * 2147) ^ 160077910;
                        i12 = iM6983 ^ 1499045981;
                    } else {
                        c = c;
                        int iM25610 = C0630.m2566("᩵᩸") ^ i9;
                        i8 = ((iM25610 ^ i10) * (-22653)) ^ 948197987;
                        c = c;
                        i12 = iM25610 ^ 827185349;
                    }
                    i11 = i8;
                    break;
                case 365958346:
                case 2131794150:
                    c = c;
                    i13 = i13;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6981 = (i10 - C2105.m6981("ܺ۬")) * (-3);
                        i = ((iM6981 ^ i9) * 19549) ^ 297330708;
                        i2 = -1079273509;
                        i5 = iM6981 ^ i2;
                        i11 = i;
                        c = c;
                        i13 = i13;
                        i12 = i5;
                    }
                    i13 = i13;
                    iM2566 = C0630.m2566("ۗܿ") ^ i10;
                    i3 = ((iM2566 ^ i9) * (-5263)) ^ (-1591904395);
                    i4 = 129623451;
                    i5 = iM2566 ^ i4;
                    i11 = i3;
                    c = c;
                    i12 = i5;
                    break;
                case 553836563:
                case 1199728329:
                    if (RunnableC3474.f10992 <= 0) {
                        i13 = i13;
                        iM2567 = (C0630.m2566("ۚ۬") + i9) * 43;
                        i6 = ((iM2567 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                        i12 = iM2567 ^ i7;
                        i11 = i6;
                        i13 = i13;
                    } else {
                        int iM6984 = C2105.m6981("֫᩺") ^ i9;
                        i8 = ((iM6984 ^ i10) * 2147) ^ 160077910;
                        i12 = iM6984 ^ 1499045981;
                        i11 = i8;
                    }
                    break;
                case 964454695:
                case 1148185734:
                    c = c;
                    i13 = i13;
                    i14 = 78127921;
                    if (C3537.m10746() > 0) {
                        iM6981 = C0630.m2566("᩺ۙ") ^ i10;
                        i = ((iM6981 ^ i9) * (-21967)) ^ 951540568;
                        i2 = 1649455866;
                        i5 = iM6981 ^ i2;
                        i11 = i;
                        c = c;
                        i13 = i13;
                        i12 = i5;
                    }
                    i13 = i13;
                    iM2566 = C0630.m2566("ۗܿ") ^ i10;
                    i3 = ((iM2566 ^ i9) * (-5263)) ^ (-1591904395);
                    i4 = 129623451;
                    i5 = iM2566 ^ i4;
                    i11 = i3;
                    c = c;
                    i12 = i5;
                    break;
                default:
                    if (!C1005.f3721) {
                        int iM6985 = C2105.m6981("֫᩺") ^ i9;
                        i8 = ((iM6985 ^ i10) * 2147) ^ 160077910;
                        i12 = iM6985 ^ 1499045981;
                        i11 = i8;
                    } else {
                        c = c;
                        i13 = i13;
                        iM6981 = C0630.m2566("᩺ᩴ") ^ i10;
                        i = ((iM6981 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                        i5 = iM6981 ^ i2;
                        i11 = i;
                        c = c;
                        i13 = i13;
                        i12 = i5;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01f8 A[PHI: r6 r8 r10 r11 r16 r17
      0x01f8: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:51:0x01f6, B:43:0x01a9, B:32:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:51:0x01f6, B:43:0x01a9, B:32:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r10v3 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v4 short[]) binds: [B:51:0x01f6, B:43:0x01a9, B:32:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:51:0x01f6, B:43:0x01a9, B:32:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r16v16 int) = (r16v8 int), (r16v11 int), (r16v17 int) binds: [B:51:0x01f6, B:43:0x01a9, B:32:0x011c] A[DONT_GENERATE, DONT_INLINE]
      0x01f8: PHI (r17v19 java.lang.String) = (r17v11 java.lang.String), (r17v14 java.lang.String), (r17v20 java.lang.String) binds: [B:51:0x01f6, B:43:0x01a9, B:32:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0251 A[PHI: r3 r4 r5 r16 r17
      0x0251: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char) binds: [B:59:0x024f, B:55:0x022e, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short) binds: [B:59:0x024f, B:55:0x022e, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:59:0x024f, B:55:0x022e, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r16v21 int) = (r16v6 int), (r16v7 int), (r16v22 int) binds: [B:59:0x024f, B:55:0x022e, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r17v23 java.lang.String) = (r17v9 java.lang.String), (r17v10 java.lang.String), (r17v24 java.lang.String) binds: [B:59:0x024f, B:55:0x022e, B:15:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0288 A[PHI: r2 r7 r16 r17
      0x0288: PHI (r2v4 short[]) = (r2v2 short[]), (r2v3 short[]), (r2v2 short[]) binds: [B:67:0x02a9, B:63:0x0286, B:47:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:67:0x02a9, B:63:0x0286, B:47:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r16v9 int) = (r16v4 int), (r16v5 int), (r16v10 int) binds: [B:67:0x02a9, B:63:0x0286, B:47:0x01d0] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r17v12 java.lang.String) = (r17v7 java.lang.String), (r17v8 java.lang.String), (r17v13 java.lang.String) binds: [B:67:0x02a9, B:63:0x0286, B:47:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int iM2566;
        int i;
        int i2;
        int i3 = C7811.f24123;
        int i4 = C2958.f9394;
        int iM2567 = (C0630.m2566("ۜ֨") ^ i3) * (-91);
        int i5 = ((iM2567 ^ i4) * 13835) ^ (-464164567);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2567 ^ (-1084297782);
        String strM12252 = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1832024189;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i4) * (-7585)) >> 31));
            switch (i14) {
                case -2013233623:
                case 986934752:
                    C4263.m12819();
                    C4263.m12819();
                    break;
                case -1716097169:
                case 1610758030:
                    if (!C2272.f7362) {
                        i14 = i14;
                        iM2566 = (C0630.m2566("ܳܳ") ^ i4) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                        i13 = i14;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        strM12252 = strM12252;
                    } else {
                        int iM6981 = (C2105.m6981("ۡۜ") ^ i3) * (-81);
                        i6 = iM6981 ^ 990349261;
                        i5 = ((iM6981 ^ i4) * 6619) ^ 283680168;
                        i13 = i14;
                    }
                    break;
                case -1664324022:
                case 1425675383:
                    strM12252 = strM12252;
                    i14 = i14;
                    sArr2 = f22104;
                    i11 = 1;
                    if (C22628.f73083 <= 0) {
                        iM2566 = C0630.m2566("۠ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-22145)) ^ 277107155;
                        i2 = 1490910322;
                    } else {
                        iM2566 = C0630.m2566("ۨܶ") ^ i4;
                        i = ((iM2566 ^ i3) * 18355) ^ (-849608671);
                        i2 = -826758336;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -1625922180:
                case 789095071:
                    strM12252 = strM12252;
                    i14 = i14;
                    c = 0;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("᩶ۤ") ^ i3;
                        i = ((iM2566 ^ i4) * 17315) ^ 1953324891;
                        i2 = 675647750;
                    } else {
                        iM2566 = (C2105.m6981("ۧ᩹") ^ i3) * (-47);
                        i = ((iM2566 ^ i4) * 26687) ^ (-1347790073);
                        i2 = 1771838260;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -1596243902:
                case 1311916795:
                    if (C7811.m20844() == 0) {
                        strM12252 = strM12252;
                        i14 = i14;
                        iM2566 = C2105.m6981("᩶ۤ") ^ i3;
                        i = ((iM2566 ^ i4) * 17315) ^ 1953324891;
                        i2 = 675647750;
                        i13 = i14;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        strM12252 = strM12252;
                    } else {
                        int iM6982 = (C2105.m6981("ۡۜ") ^ i3) * (-81);
                        i6 = iM6982 ^ 990349261;
                        i5 = ((iM6982 ^ i4) * 6619) ^ 283680168;
                        i13 = i14;
                    }
                    break;
                case -1445681747:
                case 116582289:
                    strM12252 = strM12252;
                    i14 = i14;
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C1773.f6144 <= 0) {
                        strM12252 = strM12252;
                        iM2566 = (C0630.m2566("ܳܳ") ^ i4) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                    } else {
                        iM2566 = (C2105.m6981("ܶۙ") ^ i3) * 11;
                        i = ((iM2566 ^ i4) * (-7193)) ^ 800998337;
                        i2 = -940254197;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -1336544017:
                case 1152663568:
                    C2520.m8026();
                    int iM6983 = (C2105.m6981("ۡۜ") ^ i3) * (-81);
                    i6 = iM6983 ^ 990349261;
                    i5 = ((iM6983 ^ i4) * 6619) ^ 283680168;
                    i13 = i14;
                    break;
                case -1295077415:
                case -217939989:
                    i10 = 62701;
                    iM2566 = C0630.m2566("ۖۤ") ^ i4;
                    i = ((iM2566 ^ i3) * (-30693)) ^ (-1109213161);
                    i2 = 1777233427;
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -1014592122:
                case 495122999:
                    i10 = 64993;
                    iM2566 = C0630.m2566("ۖۤ") ^ i4;
                    i = ((iM2566 ^ i3) * (-30693)) ^ (-1109213161);
                    i2 = 1777233427;
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -905810917:
                case 1655004807:
                    strM12252 = strM12252;
                    i14 = i14;
                    s2 = 19793;
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("۠ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-22145)) ^ 277107155;
                        i2 = 1490910322;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ᩴۘ")) * (-39);
                        i = ((iM2566 ^ i3) * 18165) ^ (-892569943);
                        i2 = -1430466597;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -788782119:
                case -213198938:
                    strM12252 = strM12252;
                    i14 = i14;
                    sArr = f22104;
                    if (C1773.f6144 <= 0) {
                        strM12252 = strM12252;
                        iM2566 = (C0630.m2566("ܳܳ") ^ i4) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                    } else {
                        iM2566 = (C2105.m6981("ܽۢ") + i3) * (-111);
                        i = ((iM2566 ^ i4) * (-6261)) ^ (-566108918);
                        i2 = -146895405;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -653548657:
                case -377687707:
                    strM12252 = strM12252;
                    i14 = i14;
                    i8 = 391762849;
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("۠ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-22145)) ^ 277107155;
                        i2 = 1490910322;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۫") ^ i4;
                        i = ((iM2566 ^ i3) * 25889) ^ (-843550917);
                        i2 = 1559578061;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case -569751868:
                case 1565515609:
                    C3683.m11210(animator, strM12252);
                    this.f22108.f33568 = true;
                    break;
                case -382900942:
                case 2108170824:
                    C3245.m9925();
                    if (RunnableC3474.f10992 <= 0) {
                        i14 = i14;
                        iM2566 = (i4 - C0630.m2566("᩻֡")) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * EnumC5983.f18409) ^ 934749751;
                        i2 = -2056167817;
                        i13 = i14;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        strM12252 = strM12252;
                    } else {
                        int iM6984 = (C2105.m6981("ۡۜ") ^ i3) * (-81);
                        i6 = iM6984 ^ 990349261;
                        i5 = ((iM6984 ^ i4) * 6619) ^ 283680168;
                        i13 = i14;
                    }
                    break;
                case 16390877:
                case 1710458740:
                    strM12252 = strM12252;
                    i14 = i14;
                    if (C4117.f13076 <= 0) {
                        strM12252 = strM12252;
                        iM2566 = (C0630.m2566("ܳܳ") ^ i4) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                    } else {
                        iM2566 = C0630.m2566("ܰ᩻") ^ i4;
                        i = ((iM2566 ^ i3) * (-23849)) ^ 2143565394;
                        i2 = 107541626;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case 43148384:
                case 1550257637:
                    strM12252 = strM12252;
                    i14 = i14;
                    int i16 = s + s2;
                    if ((i16 * i16) - i9 > 0) {
                        iM2566 = (C2105.m6981("ۧܶ") + i3) * (-123);
                        i = ((iM2566 ^ i4) * (-22795)) ^ (-56656737);
                        i2 = 1944358565;
                    } else {
                        iM2566 = (i3 - C2105.m6981("᩶ܳ")) * (-99);
                        i = ((iM2566 ^ i4) * 6551) ^ 510267826;
                        i2 = -224052380;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case 999992473:
                case 1704020674:
                    i14 = i14;
                    i12 = 9;
                    if (C1504.m5179()) {
                        strM12252 = strM12252;
                        iM2566 = (i3 - C0630.m2566("ᩴۢ")) * (-105);
                        i = ((iM2566 ^ i4) * 13223) ^ (-173541672);
                        i2 = -1230488898;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩻֡")) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * EnumC5983.f18409) ^ 934749751;
                        i2 = -2056167817;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                case 1031413873:
                case 1507891672:
                    strM12252 = strM12252;
                    i14 = i14;
                    s = sArr[c];
                    i7 = s * s;
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("᩶ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * 17001) ^ 357751966;
                        i2 = 475861110;
                    } else {
                        iM2566 = C2105.m6981("᩶ۤ") ^ i3;
                        i = ((iM2566 ^ i4) * 17315) ^ 1953324891;
                        i2 = 675647750;
                    }
                    i13 = i14;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    strM12252 = strM12252;
                    break;
                default:
                    i14 = i14;
                    strM12252 = C4075.m12252(sArr2, i11, i12, i10);
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ܳܳ") ^ i4) * (-27);
                        strM12252 = strM12252;
                        i = ((iM2566 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                        i13 = i14;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                        strM12252 = strM12252;
                    } else {
                        int iM6985 = C2105.m6981("ᩳ᩹") ^ i4;
                        i5 = ((iM6985 ^ i3) * (-17377)) ^ 954274967;
                        i13 = i14;
                        i6 = iM6985 ^ (-1469166680);
                    }
                    break;
            }
            return;
        }
    }

    public C7220(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206, C11182 c11182, View view2) {
        int i = -1897222501;
        int i2 = C5695.f17556;
        int i3 = C3019.f9544;
        int iM6981 = C2105.m6981("ۡۚ") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-27247)) ^ 353634139;
        int i5 = 1669724475;
        while (true) {
            i = ((((i ^ i2) * (-21951)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1910199086:
                case -382538473:
                    this.f22109 = view;
                    this.f22105 = abstractActivityC3346;
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C0630.m2566("֨۬") ^ i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    } else {
                        iM6981 = (C2105.m6981("ܰۛ") ^ i2) * (-7);
                        i4 = ((iM6981 ^ i3) * (-13665)) ^ 1288962734;
                        i5 = -341394069;
                    }
                    break;
                case -1715095366:
                case -1283442210:
                    C2272.m7503();
                    if (C1916.m6308() >= 0) {
                        iM6981 = (i3 - C0630.m2566("ۗܽ")) * 55;
                        i4 = ((iM6981 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    } else {
                        iM6981 = (C0630.m2566("֨۬") ^ i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    }
                    break;
                case -1714670298:
                case 1464576266:
                    C4075.m12263();
                    RunnableC0588.m2441();
                    iM6981 = (C0630.m2566("֨۬") ^ i3) * (-25);
                    i4 = ((iM6981 ^ i2) * 4367) ^ (-2065521909);
                    i5 = 346209225;
                    break;
                case -1659779490:
                case -362396716:
                    if (C1711.f5919) {
                        iM6981 = C0630.m2566("֫ۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6579)) ^ (-944118055);
                        i5 = 1589096223;
                    } else {
                        iM6981 = (C2105.m6981("֡᩶") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM6981 ^ i3) * (-4095)) ^ 834526463;
                        i5 = 1851044771;
                    }
                    break;
                case -1542915620:
                case 770090058:
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("֡ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32417) ^ (-1563510818);
                        i5 = 600072630;
                    } else {
                        iM6981 = (C0630.m2566("ۨ۟") ^ i2) * (-43);
                        i4 = ((iM6981 ^ i3) * (-1873)) ^ (-911773488);
                        i5 = 1186258079;
                    }
                    break;
                case -1190329189:
                case 662996805:
                    this.f22108 = c11182;
                    this.f22107 = view2;
                    return;
                case -1076042276:
                case -37054065:
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("֡ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32417) ^ (-1563510818);
                        i5 = 600072630;
                    } else {
                        iM6981 = (C0630.m2566("᩻ܽ") + i2) * (-117);
                        i4 = ((iM6981 ^ i3) * 26847) ^ 1360527729;
                        i5 = 228559253;
                    }
                    break;
                case -929970399:
                case 455035908:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("֨۬") ^ i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    } else {
                        iM6981 = C0630.m2566("۫۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29401) ^ 150905436;
                        i5 = 1890620111;
                    }
                    break;
                case -917811446:
                case 858046544:
                    if (RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("᩶᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-26977)) ^ (-1029419153);
                        i5 = -1069259910;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗܽ")) * 55;
                        i4 = ((iM6981 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    }
                    break;
                case -822872901:
                case 747733624:
                    if (C1047.f3863 >= 0) {
                        iM6981 = (C0630.m2566("᩻ܽ") + i2) * (-117);
                        i4 = ((iM6981 ^ i3) * 26847) ^ 1360527729;
                        i5 = 228559253;
                    } else {
                        iM6981 = (C0630.m2566("֨۬") ^ i3) * (-25);
                        i4 = ((iM6981 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    }
                    break;
                case -590722209:
                case 1630293439:
                    if (C1916.f6442) {
                        iM6981 = (C2105.m6981("ۧۙ") + i3) * 97;
                        i4 = ((iM6981 ^ i2) * (-10247)) ^ 1657176584;
                        i5 = 295150470;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۗܽ")) * 55;
                        i4 = ((iM6981 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    }
                    break;
                case -538805083:
                case 1818339547:
                    C0483.m2121();
                    C2126.m7040();
                    throw new RuntimeException();
                case -435738959:
                case 1121243410:
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("᩻ܽ") + i2) * (-117);
                        i4 = ((iM6981 ^ i3) * 26847) ^ 1360527729;
                        i5 = 228559253;
                    } else {
                        iM6981 = C0630.m2566("֫ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24819) ^ 542887535;
                        i5 = -569157993;
                    }
                    break;
                case 1702831788:
                case 1899624271:
                    if (C3746.m11369() >= 0) {
                        iM6981 = C0630.m2566("֡ۛ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 32417) ^ (-1563510818);
                        i5 = 600072630;
                    } else {
                        iM6981 = C2105.m6981("ۚۖ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 31341) ^ 1321943382;
                        i5 = -701808358;
                    }
                    break;
                case 1703617101:
                case 1759456119:
                    if (C0237.f1507 != 0) {
                        iM6981 = (i3 - C0630.m2566("ۗܽ")) * 55;
                        i4 = ((iM6981 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    } else {
                        iM6981 = C2105.m6981("᩷۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22119) ^ (-547756447);
                        i5 = -1351195733;
                    }
                    break;
                default:
                    this.f22106 = dialogInterfaceC0206;
                    if (C1420.m4913()) {
                        iM6981 = C0630.m2566("֫ۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-6579)) ^ (-944118055);
                        i5 = 1589096223;
                    } else {
                        iM6981 = C0630.m2566("᩶۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27493) ^ 566903679;
                        i5 = 1420801601;
                    }
                    break;
            }
        }
    }
}
