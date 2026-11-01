package p067l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FO */
/* JADX INFO: loaded from: classes2.dex */
public final class C9230 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ܶۧ᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f82051 = {8300, -640, -625, -632, -628, -640, -619, -632, -626, -625, 6942, -21548, -21541, -21540, -21544, -21548, -21567, -21540, -21542, -21541, -21548, -21543, -21563, -21539, -21548, 5698, -9398, -9403, -9406, -9402, -9398, -9377, -9406, -9404, -9403, 7388, -4581, -4588, -4589, -4585, -4581, -4594, -4589, -4587, -4588};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractActivityC5549 f24989;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ DialogInterfaceC2564 f24990;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ View f24991;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C12996 f24992;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View f24993;

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
    
        if (p067l.RunnableC0938.f81886 < 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationRepeat(Animator animator) {
        int i;
        int iM55680;
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
        int i13 = C0877.f81843;
        int i14 = RunnableC0938.f81886;
        int iM55979 = C0946.m55979("ۙ᩻") ^ i14;
        int i15 = ((iM55979 ^ i13) * 6953) ^ 2132234058;
        int i16 = iM55979 ^ (-644434066);
        short[] sArr2 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 10435) >> 31));
            switch (i12) {
                case -1965323688:
                case -582422830:
                    C1012.m56134();
                    C1028.m56247();
                    i = i9;
                    iM55680 = C0946.m55979("᩸ۗ") ^ i13;
                    i2 = ((iM55680 ^ i14) * (-3677)) ^ 1063290529;
                    i3 = -880362021;
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1918083337:
                case 2124371277:
                    if (C1028.f81950 <= 0) {
                        i = i9;
                        i11 = 9;
                        iM55680 = C0946.m55979("᩸ۗ") ^ i13;
                        i2 = ((iM55680 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                        i16 = iM55680 ^ i3;
                        i15 = i2;
                        i9 = i;
                    } else {
                        int iM55681 = C0873.m55680("֡۠") ^ i14;
                        i16 = iM55681 ^ 693330544;
                        i15 = ((iM55681 ^ i13) * (-1043)) ^ 105567826;
                        i11 = 9;
                    }
                    break;
                case -1826293040:
                case -1092554316:
                    i = i9;
                    i8 = 341288676;
                    if (C0873.m55678()) {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i13;
                        i2 = ((iM55680 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                    } else {
                        iM55680 = C0946.m55979("ܶ֡") ^ i14;
                        i2 = ((iM55680 ^ i13) * 25349) ^ 784186763;
                        i3 = 158346167;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1735192138:
                case -1729505103:
                    i = i9;
                    int i17 = i7 + i8;
                    if (i6 - (i17 + i17) <= 0) {
                        iM55680 = (C0873.m55680("۫ۘ") ^ i14) * (-65);
                        i2 = ((iM55680 ^ i13) * (-29803)) ^ (-1240873839);
                        i3 = 709294506;
                    } else {
                        iM55680 = C0946.m55979("ۡܰ") ^ i13;
                        i2 = ((iM55680 ^ i14) * 21013) ^ 911515905;
                        i3 = -796884294;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1483932160:
                case 1170906265:
                    C0877.m55696();
                    C1194.m56396();
                    break;
                case -1470330746:
                case 1832033772:
                    i = i9;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ۤۧ") ^ i14;
                        i2 = ((iM55680 ^ i13) * (-17263)) ^ (-1001221181);
                        i3 = 1874419700;
                    } else {
                        iM55680 = (C0873.m55680("᩷ۨ") + i14) * (-115);
                        i2 = ((iM55680 ^ i13) * 893) ^ (-1198761887);
                        i3 = 937081829;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1428032400:
                case 1931342167:
                    i = i9;
                    i6 = i5 * i5;
                    i7 = s * s;
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i13;
                        i2 = ((iM55680 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                    } else {
                        iM55680 = (C0946.m55979("ۤۨ") + i13) * (-21);
                        i2 = ((iM55680 ^ i14) * (-11705)) ^ (-1441905149);
                        i3 = -1068220901;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1293817885:
                case 798384810:
                    sArr = f82051;
                    i10 = 26;
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0873.m55680("᩹۬") ^ i13;
                        i = i9;
                        i2 = ((iM55680 ^ i14) * (-30373)) ^ 597830854;
                        i3 = 77048790;
                    } else {
                        i = i9;
                        iM55680 = C0873.m55680("᩺᩵") ^ i14;
                        i2 = ((iM55680 ^ i13) * 27833) ^ 119855382;
                        i3 = -276839076;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1286572379:
                case 1313198825:
                    C1044.m56286();
                    if (C0967.f81910 < 0) {
                        i = i9;
                        iM55680 = C0946.m55979("ۤۧ") ^ i14;
                        i2 = ((iM55680 ^ i13) * (-17263)) ^ (-1001221181);
                        i3 = 1874419700;
                        i16 = iM55680 ^ i3;
                        i15 = i2;
                        i9 = i;
                    }
                    i = i9;
                    iM55680 = C0946.m55979("᩸ۗ") ^ i13;
                    i2 = ((iM55680 ^ i14) * (-3677)) ^ 1063290529;
                    i3 = -880362021;
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -1196423163:
                case 1250481695:
                    C1025.m56218(animator, C0967.m56077(sArr, i10, i11, i9));
                    break;
                case -1023963293:
                case 1838915863:
                    i = i9;
                    s = sArr2[c];
                    s2 = 18474;
                    if (C0890.m55740()) {
                        iM55680 = (C0946.m55979("ᩳ᩵") ^ i14) * 39;
                        i2 = ((iM55680 ^ i13) * 215) ^ 42849548;
                        i3 = 56069307;
                    } else {
                        iM55680 = C0946.m55979("ۤۧ") ^ i14;
                        i2 = ((iM55680 ^ i13) * (-17263)) ^ (-1001221181);
                        i3 = 1874419700;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -777543183:
                case 1590641864:
                    i4 = 11248;
                    iM55680 = C0873.m55680("᩹᩸") ^ i13;
                    i = i4;
                    i2 = ((iM55680 ^ i14) * 4509) ^ (-1952192575);
                    i3 = 1018016481;
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -759425546:
                case -551904653:
                    i4 = 56107;
                    iM55680 = C0873.m55680("᩹᩸") ^ i13;
                    i = i4;
                    i2 = ((iM55680 ^ i14) * 4509) ^ (-1952192575);
                    i3 = 1018016481;
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case -27632547:
                case 61763946:
                    C0912.m55833();
                    if (C0989.f81920 >= 0) {
                        i = i9;
                        iM55680 = (C0946.m55979("ۜۜ") + i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM55680 ^ i13) * (-5207)) ^ (-1390411791);
                        i3 = -1482510718;
                        i16 = iM55680 ^ i3;
                        i15 = i2;
                        i9 = i;
                    }
                    iM55680 = C0873.m55680("᩹۬") ^ i13;
                    i = i9;
                    i2 = ((iM55680 ^ i14) * (-30373)) ^ 597830854;
                    i3 = 77048790;
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 207038705:
                case 1215661702:
                    i = i9;
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0873.m55680("ۧܳ") + i13) * (-69);
                        i2 = ((iM55680 ^ i14) * (-31635)) ^ (-1396309559);
                        i3 = -365458502;
                    } else {
                        iM55680 = C0873.m55680("ۧۢ") ^ i13;
                        i2 = ((iM55680 ^ i14) * 31137) ^ (-2045588474);
                        i3 = 638799424;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 371738476:
                case 2091668032:
                    i = i9;
                    c = 25;
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0946.m55979("ۜۜ") + i14) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM55680 ^ i13) * (-5207)) ^ (-1390411791);
                        i3 = -1482510718;
                    } else {
                        iM55680 = (i13 - C0873.m55680("۬۬")) * (-63);
                        i2 = ((iM55680 ^ i14) * 32517) ^ (-1909664985);
                        i3 = -1759202230;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 775763228:
                case 979479875:
                    i = i9;
                    i5 = s + s2;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ۧܳ") + i13) * (-69);
                        i2 = ((iM55680 ^ i14) * (-31635)) ^ (-1396309559);
                        i3 = -365458502;
                    } else {
                        iM55680 = C0873.m55680("ܰۜ") ^ i13;
                        i2 = ((iM55680 ^ i14) * 25293) ^ (-1733462216);
                        i3 = -44953882;
                    }
                    i16 = iM55680 ^ i3;
                    i15 = i2;
                    i9 = i;
                    break;
                case 1426301174:
                case 1563995020:
                    break;
                default:
                    i = i9;
                    sArr2 = f82051;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0946.m55979("᩸ۗ") ^ i13;
                        i2 = ((iM55680 ^ i14) * (-3677)) ^ 1063290529;
                        i3 = -880362021;
                    } else {
                        iM55680 = C0946.m55979("ۡۙ") ^ i14;
                        i2 = ((iM55680 ^ i13) * (-20913)) ^ (-863067475);
                        i3 = -2016721826;
                    }
                    i16 = iM55680 ^ i3;
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
    
        if (p067l.C1024.m56209() >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (p067l.C1028.f81950 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (p067l.C0890.m55740() != false) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationEnd(Animator animator) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        C9230 c9230 = this;
        int i4 = C0894.f81854;
        int i5 = C1964.f83032;
        int iM55682 = (C0873.m55680("᩸ᩴ") + i4) * 123;
        int i6 = ((iM55682 ^ i5) * (-11713)) ^ 1355151899;
        ViewGroup.LayoutParams layoutParamsM56344 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55682 ^ (-189074630);
        int iM55746 = 0;
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
        String strM56318 = null;
        while (true) {
            i12 = i7 ^ (i6 & (((i12 ^ i5) * 14369) >> 31));
            switch (i12) {
                case -2143257102:
                case -857183738:
                    C0937.m55918();
                    break;
                case -2108432258:
                case -1335762339:
                    i10 = 20;
                    i11 = 5;
                    if (C0906.f81862 >= 0) {
                        iM55681 = (C0873.m55680("۫᩻") ^ i5) * (-75);
                        i = ((iM55681 ^ i4) * (-2437)) ^ (-1643847921);
                        i3 = 1388549506;
                    } else {
                        iM55681 = C0873.m55680("֨ܰ") ^ i4;
                        i = ((iM55681 ^ i5) * 24997) ^ 2046265240;
                        i3 = -803292593;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case -1644178800:
                case 758969980:
                    view.setLayoutParams(layoutParamsM56344);
                    c9230.f24992.f36568 = true;
                    break;
                case -1564920968:
                case 732369116:
                    if ((55890576 + i8) - (s * 14952) < 0) {
                        iM55680 = C0946.m55979("ۗۤ") ^ i5;
                        i = ((iM55680 ^ i4) * (-8153)) ^ (-712135562);
                        i2 = -362704194;
                    } else {
                        iM55680 = (C0873.m55680("ۡܰ") ^ i5) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i4) * (-15051)) ^ 128137474;
                        i2 = 2110479763;
                    }
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case -1415667354:
                case 994501299:
                    C1025.m56218(animator, strM56318);
                    fArr = new float[2];
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0946.m55979("֨ۡ") ^ i4;
                        i = ((iM55680 ^ i5) * (-18401)) ^ 692743853;
                        i2 = 1403820632;
                        i7 = iM55680 ^ i2;
                        c9230 = this;
                        i6 = i;
                    } else {
                        int iM55979 = (i5 - C0946.m55979("ۨۤ")) * 85;
                        i7 = iM55979 ^ 1415912402;
                        i6 = ((iM55979 ^ i4) * 26435) ^ (-836777176);
                        c9230 = this;
                    }
                    break;
                case -1365320585:
                case -545108304:
                    i9 = 58817;
                    iM55680 = (C0873.m55680("ۚۡ") ^ i4) * 123;
                    i = ((iM55680 ^ i5) * (-15367)) ^ 1465113329;
                    i2 = 1050216793;
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case -1334644127:
                case -553940409:
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    view2 = c9230.f24993;
                    sArr2 = f82051;
                    if (C1046.f81962 > 0) {
                        iM55681 = C0873.m55680("ᩴᩳ") ^ i5;
                        i = ((iM55681 ^ i4) * 28665) ^ (-1480389522);
                        i3 = -1212962590;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = C0873.m55680("᩷ۨ") ^ i5;
                    i = ((iM55680 ^ i4) * 9221) ^ (-1962034438);
                    i2 = 146286240;
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case -1264432721:
                case 1029184274:
                    C1964.m56597();
                    C1046.m56302();
                    break;
                case -1172532422:
                case 251363261:
                    sArr = f82051;
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("ᩳۤ") + i4) * (-65);
                        i = ((iM55680 ^ i5) * (-137)) ^ 933670727;
                        i2 = -547562688;
                    } else {
                        iM55680 = (C0873.m55680("᩵֡") + i5) * 31;
                        i = ((iM55680 ^ i4) * 10949) ^ 1763860067;
                        i2 = -1976385897;
                    }
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case -1139822624:
                case 748433471:
                    C1404.m56468();
                    break;
                case -947140285:
                case 706289795:
                    strM56318 = C1048.m56318(f82051, 11, 9, i9);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("᩷ۨ") ^ i5;
                        i = ((iM55680 ^ i4) * 9221) ^ (-1962034438);
                        i2 = 146286240;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩺ۧ")) * (-7);
                        i = ((iM55680 ^ i5) * (-32125)) ^ 2138724072;
                        i2 = -1974412614;
                    }
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case -556521208:
                case 2019487496:
                    C1046.m56302();
                    C0927.m55873();
                    iM55680 = C0873.m55680("᩷ۨ") ^ i5;
                    i = ((iM55680 ^ i4) * 9221) ^ (-1962034438);
                    i2 = 146286240;
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case -547298692:
                case 1566968238:
                    C1929.m56565(C1124.m56368(view2, C0949.m56016(sArr2, i10, i11, i9), fArr));
                    view = c9230.f24991;
                    if (C0949.f81897 >= 0) {
                        iM55681 = (C0873.m55680("᩷ۖ") + i5) * 71;
                        i = ((iM55681 ^ i4) * 10267) ^ (-1279909534);
                        i3 = -566204591;
                    } else {
                        iM55681 = (i5 - C0873.m55680("ۖ᩷")) * (-61);
                        i = ((iM55681 ^ i4) * (-31507)) ^ 1096362061;
                        i3 = 675230902;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case -510928924:
                case 536911655:
                    i9 = 43957;
                    iM55680 = (C0873.m55680("ۚۡ") ^ i4) * 123;
                    i = ((iM55680 ^ i5) * (-15367)) ^ 1465113329;
                    i2 = 1050216793;
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case 18816432:
                case 811428670:
                    layoutParamsM56344 = C1071.m56344(view);
                    iM55746 = C0892.m55746(view);
                    if (!C0861.m55626()) {
                        iM55681 = (C0946.m55979("ۤᩴ") ^ i4) * 115;
                        i = ((iM55681 ^ i5) * (-11735)) ^ 813150815;
                        i3 = -1241687826;
                        i7 = iM55681 ^ i3;
                        i6 = i;
                    }
                    iM55680 = (C0873.m55680("ᩳۤ") + i4) * (-65);
                    i = ((iM55680 ^ i5) * (-137)) ^ 933670727;
                    i2 = -547562688;
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case 167798674:
                case 950738357:
                    layoutParamsM56344.height = iM55746 / 5;
                    if (C0989.f81920 >= 0) {
                        iM55681 = (C0873.m55680("᩷ۖ") + i5) * 71;
                        i = ((iM55681 ^ i4) * 10267) ^ (-1279909534);
                        i3 = -566204591;
                    } else {
                        iM55681 = C0873.m55680("ᩳۜ") ^ i4;
                        i = ((iM55681 ^ i5) * 7119) ^ (-505185599);
                        i3 = 277146928;
                    }
                    i7 = iM55681 ^ i3;
                    i6 = i;
                    break;
                case 215182246:
                case 1283126909:
                    c = '\n';
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ᩴۜ") ^ i4;
                        i = ((iM55680 ^ i5) * 10125) ^ 819675114;
                        i2 = 1653807079;
                    } else {
                        iM55680 = C0946.m55979("֨ۡ") ^ i4;
                        i = ((iM55680 ^ i5) * (-18401)) ^ 692743853;
                        i2 = 1403820632;
                    }
                    i7 = iM55680 ^ i2;
                    c9230 = this;
                    i6 = i;
                    break;
                case 324536064:
                case 1693810157:
                    break;
                default:
                    s = sArr[c];
                    i8 = s * s;
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("᩷ۨ") ^ i5;
                        i = ((iM55680 ^ i4) * 9221) ^ (-1962034438);
                        i2 = 146286240;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩺") ^ i4;
                        i = ((iM55680 ^ i5) * (-30719)) ^ 676077262;
                        i2 = 801233137;
                    }
                    i7 = iM55680 ^ i2;
                    c9230 = this;
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
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        int i8;
        int i9 = C0989.f81920;
        int i10 = C1071.f81975;
        int iM55682 = C0873.m55680("ۗܶ") ^ i10;
        int i11 = ((iM55682 ^ i9) * (-20957)) ^ (-826624236);
        short[] sArr = null;
        short[] sArr2 = null;
        int i12 = iM55682 ^ 1504419097;
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
        String strM55852 = null;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i9) * 3015) >> 31));
            switch (i19) {
                case -2134803962:
                case 379290517:
                    c = c;
                    i13 = i13;
                    C1025.m56218(animator, strM55852);
                    view = this.f24993;
                    if (view.getTag() == null) {
                        iM55979 = C0946.m55979("ۗۙ") ^ i10;
                        i = ((iM55979 ^ i9) * (-23525)) ^ 39177265;
                        i2 = -113884015;
                    } else {
                        iM55979 = C0873.m55680("ܿ֫") ^ i9;
                        i = ((iM55979 ^ i10) * (-17985)) ^ 2121882504;
                        i2 = 2143661604;
                    }
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1964535041:
                case -964363182:
                    C1028.m56238(view, 0);
                    C0906.m55807(view, 0.0f);
                    break;
                case -1842567040:
                case 2056653019:
                    C1071.m56343();
                    C1024.m56209();
                    int iM559710 = C0946.m55979("֫᩺") ^ i9;
                    i8 = ((iM559710 ^ i10) * 2147) ^ 160077910;
                    i12 = iM559710 ^ 1499045981;
                    i11 = i8;
                    break;
                case -1809080060:
                case 879005517:
                    c = c;
                    i13 = i13;
                    sArr = f82051;
                    if (C1404.m56468()) {
                        iM55979 = (i9 - C0946.m55979("۠ۚ")) * (-125);
                        i = ((iM55979 ^ i10) * 28211) ^ 2091964643;
                        i2 = -186574902;
                    } else {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i10;
                        i = ((iM55979 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                    }
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1504342526:
                case -52442533:
                    i16 = 60341;
                    iM55979 = C0946.m55979("᩻֡") ^ i9;
                    i = ((iM55979 ^ i10) * 32719) ^ 1441682048;
                    i2 = -378103465;
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1463516170:
                case 1833736069:
                    i16 = 61050;
                    iM55979 = C0946.m55979("᩻֡") ^ i9;
                    i = ((iM55979 ^ i10) * 32719) ^ 1441682048;
                    i2 = -378103465;
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -1401179931:
                case 119517403:
                    RunnableC0871.m55672();
                    C1036.m56257();
                    break;
                case -1165509987:
                case -838890645:
                    i13 = i13;
                    c = '#';
                    if (C0917.m55854()) {
                        iM55681 = C0873.m55680("ܿۚ") ^ i9;
                        i6 = ((iM55681 ^ i10) * 28975) ^ 1384658444;
                        i7 = 889981986;
                    } else {
                        iM55681 = (C0873.m55680("ۚ۬") + i9) * 43;
                        i6 = ((iM55681 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                    }
                    i12 = iM55681 ^ i7;
                    i11 = i6;
                    i13 = i13;
                    break;
                case -1070714418:
                case 1411458774:
                    c = c;
                    s = sArr[c];
                    i13 = s * s;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۗܿ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-5263)) ^ (-1591904395);
                        i4 = 129623451;
                    } else {
                        iM55680 = C0873.m55680("᩷ۧ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-27355)) ^ 1642113698;
                        i4 = 532974775;
                    }
                    i5 = iM55680 ^ i4;
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
                    if (!C0892.m55749()) {
                        c = c;
                        iM55681 = (C0873.m55680("ۚ۬") + i9) * 43;
                        i6 = ((iM55681 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                        i12 = iM55681 ^ i7;
                        i11 = i6;
                        i13 = i13;
                    } else {
                        iM55979 = C0873.m55680("᩻֫") ^ i9;
                        i = ((iM55979 ^ i10) * (-7155)) ^ 677704137;
                        i2 = 363059517;
                        i5 = iM55979 ^ i2;
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
                    sArr2 = f82051;
                    i17 = 36;
                    i18 = 9;
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i10;
                        i = ((iM55979 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                    } else {
                        iM55979 = C0873.m55680("᩹ܳ") ^ i10;
                        i = ((iM55979 ^ i9) * (-23599)) ^ 1370074644;
                        i2 = 888188908;
                    }
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -655753835:
                case -544390989:
                    c = c;
                    C12996 c12996 = this.f24992;
                    if (RunnableC0871.f81839 < 0) {
                        C16487 c16487 = new C16487(c12996);
                        if (!C1024.f81946) {
                            i13 = i13;
                            new ViewOnClickListenerC7889(this.f24989, this.f24990, view, c16487);
                            C0890.m55731(view, view);
                            iM55979 = C0873.m55680("ܿ֫") ^ i9;
                            i = ((iM55979 ^ i10) * (-17985)) ^ 2121882504;
                            i2 = 2143661604;
                            i5 = iM55979 ^ i2;
                            i11 = i;
                            c = c;
                            i13 = i13;
                            i12 = i5;
                        } else {
                            int iM55683 = C0873.m55680("᩵᩸") ^ i9;
                            i8 = ((iM55683 ^ i10) * (-22653)) ^ 948197987;
                            c = c;
                            i12 = iM55683 ^ 827185349;
                            i11 = i8;
                        }
                    } else {
                        i13 = i13;
                        c = c;
                        iM55681 = (C0873.m55680("ۚ۬") + i9) * 43;
                        i6 = ((iM55681 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                        i12 = iM55681 ^ i7;
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
                        iM55979 = (i9 - C0946.m55979("ᩳܿ")) * (-61);
                        i = ((iM55979 ^ i10) * 2355) ^ 1511999616;
                        i2 = -96758780;
                    } else {
                        iM55979 = (C0873.m55680("᩹ۤ") ^ i10) * (-17);
                        i = ((iM55979 ^ i9) * 28061) ^ 1848110035;
                        i2 = -1855517602;
                    }
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -197767681:
                case 306727670:
                    c = c;
                    i13 = i13;
                    strM55852 = C0917.m55852(sArr2, i17, i18, i16);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i10;
                        i = ((iM55979 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                    } else {
                        iM55979 = (C0946.m55979("۬ܰ") ^ i10) * 33;
                        i = ((iM55979 ^ i9) * (-32735)) ^ 62759648;
                        i2 = 2128222594;
                    }
                    i5 = iM55979 ^ i2;
                    i11 = i;
                    c = c;
                    i13 = i13;
                    i12 = i5;
                    break;
                case -104839766:
                case 1070753470:
                    RunnableC0938.m55938();
                    if (C0882.f81846) {
                        int iM559711 = C0946.m55979("֫᩺") ^ i9;
                        i8 = ((iM559711 ^ i10) * 2147) ^ 160077910;
                        i12 = iM559711 ^ 1499045981;
                    } else {
                        c = c;
                        int iM55684 = C0873.m55680("᩵᩸") ^ i9;
                        i8 = ((iM55684 ^ i10) * (-22653)) ^ 948197987;
                        c = c;
                        i12 = iM55684 ^ 827185349;
                    }
                    i11 = i8;
                    break;
                case 365958346:
                case 2131794150:
                    c = c;
                    i13 = i13;
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (i10 - C0946.m55979("ܺ۬")) * (-3);
                        i = ((iM55979 ^ i9) * 19549) ^ 297330708;
                        i2 = -1079273509;
                        i5 = iM55979 ^ i2;
                        i11 = i;
                        c = c;
                        i13 = i13;
                        i12 = i5;
                    }
                    i13 = i13;
                    iM55680 = C0873.m55680("ۗܿ") ^ i10;
                    i3 = ((iM55680 ^ i9) * (-5263)) ^ (-1591904395);
                    i4 = 129623451;
                    i5 = iM55680 ^ i4;
                    i11 = i3;
                    c = c;
                    i12 = i5;
                    break;
                case 553836563:
                case 1199728329:
                    if (RunnableC1014.f81941 <= 0) {
                        i13 = i13;
                        iM55681 = (C0873.m55680("ۚ۬") + i9) * 43;
                        i6 = ((iM55681 ^ i10) * 29965) ^ 2021521811;
                        i7 = 321775773;
                        i12 = iM55681 ^ i7;
                        i11 = i6;
                        i13 = i13;
                    } else {
                        int iM559712 = C0946.m55979("֫᩺") ^ i9;
                        i8 = ((iM559712 ^ i10) * 2147) ^ 160077910;
                        i12 = iM559712 ^ 1499045981;
                        i11 = i8;
                    }
                    break;
                case 964454695:
                case 1148185734:
                    c = c;
                    i13 = i13;
                    i14 = 78127921;
                    if (C1017.m56187() > 0) {
                        iM55979 = C0873.m55680("᩺ۙ") ^ i10;
                        i = ((iM55979 ^ i9) * (-21967)) ^ 951540568;
                        i2 = 1649455866;
                        i5 = iM55979 ^ i2;
                        i11 = i;
                        c = c;
                        i13 = i13;
                        i12 = i5;
                    }
                    i13 = i13;
                    iM55680 = C0873.m55680("ۗܿ") ^ i10;
                    i3 = ((iM55680 ^ i9) * (-5263)) ^ (-1591904395);
                    i4 = 129623451;
                    i5 = iM55680 ^ i4;
                    i11 = i3;
                    c = c;
                    i12 = i5;
                    break;
                default:
                    if (!C0892.f81851) {
                        int iM559713 = C0946.m55979("֫᩺") ^ i9;
                        i8 = ((iM559713 ^ i10) * 2147) ^ 160077910;
                        i12 = iM559713 ^ 1499045981;
                        i11 = i8;
                    } else {
                        c = c;
                        i13 = i13;
                        iM55979 = C0873.m55680("᩺ᩴ") ^ i10;
                        i = ((iM55979 ^ i9) * (-16683)) ^ (-1353447446);
                        i2 = 1546557729;
                        i5 = iM55979 ^ i2;
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
        int iM55680;
        int i;
        int i2;
        int i3 = C1229.f82066;
        int i4 = C0989.f81920;
        int iM55681 = (C0873.m55680("ۜ֨") ^ i3) * (-91);
        int i5 = ((iM55681 ^ i4) * 13835) ^ (-464164567);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ (-1084297782);
        String strM56276 = null;
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
                    C1053.m56327();
                    C1053.m56327();
                    break;
                case -1716097169:
                case 1610758030:
                    if (!C0955.f81898) {
                        i14 = i14;
                        iM55680 = (C0873.m55680("ܳܳ") ^ i4) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                        i13 = i14;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        strM56276 = strM56276;
                    } else {
                        int iM55979 = (C0946.m55979("ۡۜ") ^ i3) * (-81);
                        i6 = iM55979 ^ 990349261;
                        i5 = ((iM55979 ^ i4) * 6619) ^ 283680168;
                        i13 = i14;
                    }
                    break;
                case -1664324022:
                case 1425675383:
                    strM56276 = strM56276;
                    i14 = i14;
                    sArr2 = f82051;
                    i11 = 1;
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("۠ۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-22145)) ^ 277107155;
                        i2 = 1490910322;
                    } else {
                        iM55680 = C0873.m55680("ۨܶ") ^ i4;
                        i = ((iM55680 ^ i3) * 18355) ^ (-849608671);
                        i2 = -826758336;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -1625922180:
                case 789095071:
                    strM56276 = strM56276;
                    i14 = i14;
                    c = 0;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("᩶ۤ") ^ i3;
                        i = ((iM55680 ^ i4) * 17315) ^ 1953324891;
                        i2 = 675647750;
                    } else {
                        iM55680 = (C0946.m55979("ۧ᩹") ^ i3) * (-47);
                        i = ((iM55680 ^ i4) * 26687) ^ (-1347790073);
                        i2 = 1771838260;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -1596243902:
                case 1311916795:
                    if (C1229.m56410() == 0) {
                        strM56276 = strM56276;
                        i14 = i14;
                        iM55680 = C0946.m55979("᩶ۤ") ^ i3;
                        i = ((iM55680 ^ i4) * 17315) ^ 1953324891;
                        i2 = 675647750;
                        i13 = i14;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        strM56276 = strM56276;
                    } else {
                        int iM559710 = (C0946.m55979("ۡۜ") ^ i3) * (-81);
                        i6 = iM559710 ^ 990349261;
                        i5 = ((iM559710 ^ i4) * 6619) ^ 283680168;
                        i13 = i14;
                    }
                    break;
                case -1445681747:
                case 116582289:
                    strM56276 = strM56276;
                    i14 = i14;
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C0930.f81879 <= 0) {
                        strM56276 = strM56276;
                        iM55680 = (C0873.m55680("ܳܳ") ^ i4) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                    } else {
                        iM55680 = (C0946.m55979("ܶۙ") ^ i3) * 11;
                        i = ((iM55680 ^ i4) * (-7193)) ^ 800998337;
                        i2 = -940254197;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -1336544017:
                case 1152663568:
                    C0967.m56074();
                    int iM559711 = (C0946.m55979("ۡۜ") ^ i3) * (-81);
                    i6 = iM559711 ^ 990349261;
                    i5 = ((iM559711 ^ i4) * 6619) ^ 283680168;
                    i13 = i14;
                    break;
                case -1295077415:
                case -217939989:
                    i10 = 62701;
                    iM55680 = C0873.m55680("ۖۤ") ^ i4;
                    i = ((iM55680 ^ i3) * (-30693)) ^ (-1109213161);
                    i2 = 1777233427;
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -1014592122:
                case 495122999:
                    i10 = 64993;
                    iM55680 = C0873.m55680("ۖۤ") ^ i4;
                    i = ((iM55680 ^ i3) * (-30693)) ^ (-1109213161);
                    i2 = 1777233427;
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -905810917:
                case 1655004807:
                    strM56276 = strM56276;
                    i14 = i14;
                    s2 = 19793;
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("۠ۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-22145)) ^ 277107155;
                        i2 = 1490910322;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ᩴۘ")) * (-39);
                        i = ((iM55680 ^ i3) * 18165) ^ (-892569943);
                        i2 = -1430466597;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -788782119:
                case -213198938:
                    strM56276 = strM56276;
                    i14 = i14;
                    sArr = f82051;
                    if (C0930.f81879 <= 0) {
                        strM56276 = strM56276;
                        iM55680 = (C0873.m55680("ܳܳ") ^ i4) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                    } else {
                        iM55680 = (C0946.m55979("ܽۢ") + i3) * (-111);
                        i = ((iM55680 ^ i4) * (-6261)) ^ (-566108918);
                        i2 = -146895405;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -653548657:
                case -377687707:
                    strM56276 = strM56276;
                    i14 = i14;
                    i8 = 391762849;
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("۠ۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-22145)) ^ 277107155;
                        i2 = 1490910322;
                    } else {
                        iM55680 = C0946.m55979("ᩴ۫") ^ i4;
                        i = ((iM55680 ^ i3) * 25889) ^ (-843550917);
                        i2 = 1559578061;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case -569751868:
                case 1565515609:
                    C1025.m56218(animator, strM56276);
                    this.f24992.f36568 = true;
                    break;
                case -382900942:
                case 2108170824:
                    C1003.m56123();
                    if (RunnableC1014.f81941 <= 0) {
                        i14 = i14;
                        iM55680 = (i4 - C0873.m55680("᩻֡")) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * EnumC8055.f21261) ^ 934749751;
                        i2 = -2056167817;
                        i13 = i14;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        strM56276 = strM56276;
                    } else {
                        int iM559712 = (C0946.m55979("ۡۜ") ^ i3) * (-81);
                        i6 = iM559712 ^ 990349261;
                        i5 = ((iM559712 ^ i4) * 6619) ^ 283680168;
                        i13 = i14;
                    }
                    break;
                case 16390877:
                case 1710458740:
                    strM56276 = strM56276;
                    i14 = i14;
                    if (C1046.f81962 <= 0) {
                        strM56276 = strM56276;
                        iM55680 = (C0873.m55680("ܳܳ") ^ i4) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩻") ^ i4;
                        i = ((iM55680 ^ i3) * (-23849)) ^ 2143565394;
                        i2 = 107541626;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case 43148384:
                case 1550257637:
                    strM56276 = strM56276;
                    i14 = i14;
                    int i16 = s + s2;
                    if ((i16 * i16) - i9 > 0) {
                        iM55680 = (C0946.m55979("ۧܶ") + i3) * (-123);
                        i = ((iM55680 ^ i4) * (-22795)) ^ (-56656737);
                        i2 = 1944358565;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩶ܳ")) * (-99);
                        i = ((iM55680 ^ i4) * 6551) ^ 510267826;
                        i2 = -224052380;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case 999992473:
                case 1704020674:
                    i14 = i14;
                    i12 = 9;
                    if (C0917.m55854()) {
                        strM56276 = strM56276;
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-105);
                        i = ((iM55680 ^ i4) * 13223) ^ (-173541672);
                        i2 = -1230488898;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩻֡")) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * EnumC8055.f21261) ^ 934749751;
                        i2 = -2056167817;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                case 1031413873:
                case 1507891672:
                    strM56276 = strM56276;
                    i14 = i14;
                    s = sArr[c];
                    i7 = s * s;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("᩶ܺ") ^ i4;
                        i = ((iM55680 ^ i3) * 17001) ^ 357751966;
                        i2 = 475861110;
                    } else {
                        iM55680 = C0946.m55979("᩶ۤ") ^ i3;
                        i = ((iM55680 ^ i4) * 17315) ^ 1953324891;
                        i2 = 675647750;
                    }
                    i13 = i14;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    strM56276 = strM56276;
                    break;
                default:
                    i14 = i14;
                    strM56276 = C1044.m56276(sArr2, i11, i12, i10);
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ܳܳ") ^ i4) * (-27);
                        strM56276 = strM56276;
                        i = ((iM55680 ^ i3) * (-12251)) ^ 763939579;
                        i2 = 1641533923;
                        i13 = i14;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                        strM56276 = strM56276;
                    } else {
                        int iM559713 = C0946.m55979("ᩳ᩹") ^ i4;
                        i5 = ((iM559713 ^ i3) * (-17377)) ^ 954274967;
                        i13 = i14;
                        i6 = iM559713 ^ (-1469166680);
                    }
                    break;
            }
            return;
        }
    }

    public C9230(View view, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564, C12996 c12996, View view2) {
        int i = -1897222501;
        int i2 = C1124.f82007;
        int i3 = C0992.f81922;
        int iM55979 = C0946.m55979("ۡۚ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-27247)) ^ 353634139;
        int i5 = 1669724475;
        while (true) {
            i = ((((i ^ i2) * (-21951)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1910199086:
                case -382538473:
                    this.f24993 = view;
                    this.f24989 = abstractActivityC5549;
                    if (C1017.m56187() <= 0) {
                        iM55979 = (C0873.m55680("֨۬") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    } else {
                        iM55979 = (C0946.m55979("ܰۛ") ^ i2) * (-7);
                        i4 = ((iM55979 ^ i3) * (-13665)) ^ 1288962734;
                        i5 = -341394069;
                    }
                    break;
                case -1715095366:
                case -1283442210:
                    C0955.m56025();
                    if (C0937.m55918() >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۗܽ")) * 55;
                        i4 = ((iM55979 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    } else {
                        iM55979 = (C0873.m55680("֨۬") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    }
                    break;
                case -1714670298:
                case 1464576266:
                    C1044.m56286();
                    RunnableC0871.m55672();
                    iM55979 = (C0873.m55680("֨۬") ^ i3) * (-25);
                    i4 = ((iM55979 ^ i2) * 4367) ^ (-2065521909);
                    i5 = 346209225;
                    break;
                case -1659779490:
                case -362396716:
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("֫ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6579)) ^ (-944118055);
                        i5 = 1589096223;
                    } else {
                        iM55979 = (C0946.m55979("֡᩶") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i3) * (-4095)) ^ 834526463;
                        i5 = 1851044771;
                    }
                    break;
                case -1542915620:
                case 770090058:
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("֡ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32417) ^ (-1563510818);
                        i5 = 600072630;
                    } else {
                        iM55979 = (C0873.m55680("ۨ۟") ^ i2) * (-43);
                        i4 = ((iM55979 ^ i3) * (-1873)) ^ (-911773488);
                        i5 = 1186258079;
                    }
                    break;
                case -1190329189:
                case 662996805:
                    this.f24992 = c12996;
                    this.f24991 = view2;
                    return;
                case -1076042276:
                case -37054065:
                    if (C0989.f81920 >= 0) {
                        iM55979 = C0873.m55680("֡ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32417) ^ (-1563510818);
                        i5 = 600072630;
                    } else {
                        iM55979 = (C0873.m55680("᩻ܽ") + i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 26847) ^ 1360527729;
                        i5 = 228559253;
                    }
                    break;
                case -929970399:
                case 455035908:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("֨۬") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    } else {
                        iM55979 = C0873.m55680("۫۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29401) ^ 150905436;
                        i5 = 1890620111;
                    }
                    break;
                case -917811446:
                case 858046544:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("᩶᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-26977)) ^ (-1029419153);
                        i5 = -1069259910;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۗܽ")) * 55;
                        i4 = ((iM55979 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    }
                    break;
                case -822872901:
                case 747733624:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("᩻ܽ") + i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 26847) ^ 1360527729;
                        i5 = 228559253;
                    } else {
                        iM55979 = (C0873.m55680("֨۬") ^ i3) * (-25);
                        i4 = ((iM55979 ^ i2) * 4367) ^ (-2065521909);
                        i5 = 346209225;
                    }
                    break;
                case -590722209:
                case 1630293439:
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("ۧۙ") + i3) * 97;
                        i4 = ((iM55979 ^ i2) * (-10247)) ^ 1657176584;
                        i5 = 295150470;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۗܽ")) * 55;
                        i4 = ((iM55979 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    }
                    break;
                case -538805083:
                case 1818339547:
                    C0866.m55645();
                    C0947.m55997();
                    throw new RuntimeException();
                case -435738959:
                case 1121243410:
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("᩻ܽ") + i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 26847) ^ 1360527729;
                        i5 = 228559253;
                    } else {
                        iM55979 = C0873.m55680("֫ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24819) ^ 542887535;
                        i5 = -569157993;
                    }
                    break;
                case 1702831788:
                case 1899624271:
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0873.m55680("֡ۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 32417) ^ (-1563510818);
                        i5 = 600072630;
                    } else {
                        iM55979 = C0946.m55979("ۚۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31341) ^ 1321943382;
                        i5 = -701808358;
                    }
                    break;
                case 1703617101:
                case 1759456119:
                    if (C0854.f81826 != 0) {
                        iM55979 = (i3 - C0873.m55680("ۗܽ")) * 55;
                        i4 = ((iM55979 ^ i2) * 32243) ^ (-954328784);
                        i5 = -263250167;
                    } else {
                        iM55979 = C0946.m55979("᩷۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22119) ^ (-547756447);
                        i5 = -1351195733;
                    }
                    break;
                default:
                    this.f24990 = dialogInterfaceC2564;
                    if (C0912.m55833()) {
                        iM55979 = C0873.m55680("֫ۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-6579)) ^ (-944118055);
                        i5 = 1589096223;
                    } else {
                        iM55979 = C0873.m55680("᩶۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27493) ^ 566903679;
                        i5 = 1420801601;
                    }
                    break;
            }
        }
    }
}
