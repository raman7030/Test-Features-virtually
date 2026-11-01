package p067l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 751X */
/* JADX INFO: loaded from: classes3.dex */
public final class C15766 {

    /* JADX INFO: renamed from: ᩴܽᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f82212 = {6550, -2883, -10688, -4522, 1215, -8082, -10474, 1951, -21772, -22778, 29136, 23359, -17570, 22338, -21580, -19479, 19322, -23397, -22676, 31857, -22774, 17046, 30027, 24475, 23090, -19990, 21016, -17240, 31649, -23282, -17803, -18406, 19979, -20805, -17469, -20317, 26563, -20913, -17341, -17953, 26344, 24434, -22089, 32158, -17675, -20039, -17565, 22670, 17805, -16702, -16933, -24160, 21669, -22030, -20034, 22426, 23018, 18511, -22660, -20033, -17011, -23625, -18418, 18786, -17866, 19044, 20239, -19361, 21731, 31819, -16610, 17419, -21297, 20796, 21299, -16866, 31084, -21885, -20608, 19009, -19691, 29705, -16615, -17111, 23246, 26164, -16744, 31721, 19217, 22303, 30223, -16638, 32649, -21922, 17345, -17566, -22523, -20946, -23139, -22949, 17252, -22621, -18222, -24266, -20001, 18348, -22645, 31039, 17162, 16779, -19650, 20069, 29407, 17594, -17578, -16938, 24392, 21718, -19504, -21557, 28942, 31312, -19587, 31864, -19389};

    /* JADX WARN: Code duplicated, block: B:16:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x047c A[PHI: r3 r38
      0x047c: PHI (r3v117 int) = (r3v103 int), (r3v2 int), (r3v2 int) binds: [B:78:0x047a, B:66:0x036b, B:21:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r38v80 float) = (r38v50 float), (r38v61 float), (r38v87 float) binds: [B:78:0x047a, B:66:0x036b, B:21:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x04e5 A[PHI: r1 r8 r23 r38
      0x04e5: PHI (r1v36 int) = (r1v2 int), (r1v2 int), (r1v41 int) binds: [B:11:0x0096, B:82:0x04e3, B:74:0x0424] A[DONT_GENERATE, DONT_INLINE]
      0x04e5: PHI (r8v48 short[]) = (r8v2 short[]), (r8v2 short[]), (r8v50 short[]) binds: [B:11:0x0096, B:82:0x04e3, B:74:0x0424] A[DONT_GENERATE, DONT_INLINE]
      0x04e5: PHI (r23v3 java.lang.String) = (r23v1 java.lang.String), (r23v2 java.lang.String), (r23v1 java.lang.String) binds: [B:11:0x0096, B:82:0x04e3, B:74:0x0424] A[DONT_GENERATE, DONT_INLINE]
      0x04e5: PHI (r38v51 float) = (r38v6 float), (r38v49 float), (r38v52 float) binds: [B:11:0x0096, B:82:0x04e3, B:74:0x0424] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX INFO: renamed from: ֫ */
    public static void m35832(AbstractActivityC5549 abstractActivityC5549) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int i7;
        int iM55682;
        int i8;
        int i9;
        int i10;
        int iM559710;
        int i11;
        int i12;
        short[] sArr;
        float f;
        Resources resources;
        int i13;
        short[] sArr2;
        short[] sArr3;
        int i14;
        float f2;
        int iM559711;
        int i15;
        int i16;
        char c;
        ?? r16;
        Resources.Theme theme = null;
        float[] fArr = null;
        int i17 = 0;
        char c2 = 0;
        float f3 = 0.0f;
        boolean z = 0;
        int i18 = 0;
        int iM559712 = 0;
        int i19 = 0;
        String strM56252 = null;
        int iM55683 = 0;
        int i20 = 433722403;
        int i21 = C1046.f81962;
        int i22 = C1964.f83032;
        int iM55684 = (i21 - C0873.m55680("۫֡")) * 85;
        int i23 = ((iM55684 ^ i22) * (-3497)) ^ 295443270;
        int i24 = iM55684 ^ (-1161831287);
        Resources resources2 = null;
        float[] fArr2 = null;
        ColorStateList colorStateListM50538 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i25 = 0;
        int iM55685 = 0;
        int i26 = 0;
        int i27 = 0;
        int iM55686 = 0;
        int i28 = 0;
        int i29 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        char c3 = 0;
        int i30 = 0;
        boolean zM51768 = false;
        boolean z2 = false;
        ColorStateList colorStateListM50539 = null;
        short[] sArr8 = null;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * 26157) >> 31));
            switch (i20) {
                case -2142536607:
                case -159168751:
                    iM55685 = iM55685;
                    sArr6 = sArr6;
                    f3 = f3;
                    i29 = i29;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    i32 = i32;
                    zM51768 = C23223.m51768();
                    Resources resources3 = abstractActivityC5549.getResources();
                    theme = abstractActivityC5549.getTheme();
                    C23223.f72985 = C1012.m56148(theme, C0946.m55979(C1229.m56403(f82212, 8, 3, i26)) ^ 2130373409);
                    C23223.f72969 = C0861.m55617(theme, C0873.m55680(C1229.m56403(f82212, 11, 3, i26)) ^ 2126812781);
                    iM559712 = C0946.m55979(C0946.m55986(f82212, 14, 3, i26));
                    i19 = 2130686972;
                    if (RunnableC1014.m56177()) {
                        int iM559713 = C0946.m55979("۠ۛ") ^ i21;
                        i32 = i32;
                        sArr7 = sArr7;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        f3 = f3;
                        i24 = iM559713 ^ (-741086663);
                        i23 = ((iM559713 ^ i22) * (-22567)) ^ 914261403;
                        i25 = i25;
                        i30 = i30;
                        i29 = i29;
                        iM55685 = iM55685;
                        resources2 = resources3;
                    } else {
                        resources2 = resources3;
                        iM55680 = (i21 - C0873.m55680("ܽ᩶")) * (-115);
                        i3 = ((iM55680 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i33 = iM55680 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM55685 = iM55685;
                        sArr7 = sArr7;
                        resources2 = resources2;
                        sArr5 = sArr5;
                        i25 = i25;
                        f3 = f3;
                        i24 = i33;
                        i23 = i3;
                        i30 = i30;
                        sArr6 = sArr6;
                    }
                    break;
                case -2138697062:
                case 534557777:
                    i7 = i32;
                    C23223.f72997 = (C23223.f72969 & i17) | DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
                    iM55682 = (i21 - C0873.m55680("᩵᩻")) * (-47);
                    i8 = ((iM55682 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM55682 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -2113017066:
                case -754743649:
                    C23223.f73012 = C23223.f72985;
                    f3 = f3;
                    iM559711 = (i21 - C0946.m55979("ۗ֨")) * 99;
                    i15 = ((iM559711 ^ i22) * (-29557)) ^ (-109476847);
                    i16 = 184850045;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -2069493409:
                case 439126661:
                    f3 = f3;
                    i27 = (C23223.f72969 & i17) + ((C23223.f72985 & i17) * 31);
                    if (zM51768) {
                        iM559711 = C0873.m55680("ۗۗ") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-28797)) ^ 1292105934;
                        i16 = -595494287;
                        r16 = z;
                    } else {
                        i18 = i27;
                        iM559711 = C0873.m55680("᩸֡") ^ i21;
                        i15 = ((iM559711 ^ i22) * 7529) ^ 177771985;
                        i16 = 1608636992;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -2061849755:
                case -394180839:
                    short[] sArr9 = sArr6;
                    float f6 = f3;
                    i30 = i30;
                    short[] sArr10 = sArr5;
                    i25 = i25;
                    short[] sArr11 = sArr7;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    C23223.f72983 = C0861.m55617(theme, iM559712 ^ i19);
                    C23223.f72988 = C0861.m55617(theme, C0873.m55680(C0882.m55717(f82212, 17, 3, i26)) ^ 2099710037);
                    fArr = new float[3];
                    c3 = 1;
                    i17 = 16777215;
                    c2 = 2;
                    i32 = 0;
                    if (C1012.m56148(theme, C0946.m55979(C0992.m56102(f82212, 20, 3, i26)) ^ 2099289318) != 0) {
                        iM55681 = C0946.m55979("ۛ۠") ^ i21;
                        i5 = ((iM55681 ^ i22) * 28023) ^ (-832656298);
                        i6 = 1604918837;
                    } else {
                        iM55681 = (C0873.m55680("֡ܺ") ^ i22) * 23;
                        i5 = ((iM55681 ^ i21) * (-21141)) ^ (-2092871635);
                        i6 = -1934078454;
                    }
                    int i34 = iM55681 ^ i6;
                    i23 = i5;
                    sArr7 = sArr11;
                    sArr6 = sArr9;
                    i29 = 3;
                    sArr5 = sArr10;
                    f3 = f6;
                    i24 = i34;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -2060411340:
                case 1537807006:
                    i12 = i25;
                    sArr = sArr7;
                    f = f3;
                    resources = resources2;
                    i13 = iM55685;
                    sArr2 = sArr8;
                    C1012.m56148(theme, C0946.m55979(C1053.m56325(sArr2, 44, 3, i26)) ^ 2100844597);
                    C23223.f73003 = C1059.m14953(resources, C0873.m55680(C0967.m56077(f82212, 47, 3, i26)) ^ 2125473278, theme);
                    sArr3 = f82212;
                    i14 = 50;
                    if (C0866.f81837 < 0) {
                        int iM55687 = C0873.m55680("᩺ۚ") ^ i22;
                        sArr8 = sArr2;
                        iM55685 = i13;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        resources2 = resources;
                        i23 = ((iM55687 ^ i21) * (-533)) ^ (-608525230);
                        i25 = i12;
                        i30 = 50;
                        f2 = f;
                        i24 = iM55687 ^ (-315179478);
                        z = z;
                        f3 = f2;
                    } else {
                        int iM55688 = (C0873.m55680("᩻۫") + i21) * 127;
                        sArr8 = sArr2;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        i23 = ((iM55688 ^ i22) * 9213) ^ (-920874090);
                        int i35 = i13;
                        resources2 = resources;
                        i25 = i12;
                        i30 = i14;
                        iM55685 = i35;
                        float f7 = f;
                        i24 = iM55688 ^ 1782581567;
                        f3 = f7;
                    }
                    break;
                case -1993779849:
                case -657030295:
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    resources2 = resources2;
                    C23223.f73014 = C1059.m14953(resources2, C0946.m55979(C1012.m56144(sArr5, i30, 3, i26)) ^ 2101057331, theme);
                    C23223.f72971 = C1012.m56148(theme, R.attr.colorBackground);
                    iM55685 = iM55685;
                    sArr7 = sArr7;
                    colorStateListM50538 = C22553.m50538(theme, C0946.m55979(C1071.m56336(f82212, 53, 3, i26)) ^ 2129726450);
                    iM559710 = (C0873.m55680("ᩴܺ") + i21) * (-61);
                    i8 = ((iM559710 ^ i22) * (-26683)) ^ (-1335034899);
                    i11 = 1581495326;
                    i10 = iM559710 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1967204295:
                case -1516902970:
                    C0917.m55854();
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("ۖۙ") ^ i22;
                        i = ((iM55979 ^ i21) * 25295) ^ 145073235;
                        i2 = 1433749405;
                        i24 = iM55979 ^ i2;
                        i23 = i;
                    } else {
                        f = f3;
                        sArr3 = sArr5;
                        sArr = sArr7;
                        sArr2 = sArr8;
                        int i36 = i30;
                        i12 = i25;
                        resources = resources2;
                        i13 = iM55685;
                        i14 = i36;
                        int iM55689 = (C0873.m55680("᩻۫") + i21) * 127;
                        sArr8 = sArr2;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        i23 = ((iM55689 ^ i22) * 9213) ^ (-920874090);
                        int i37 = i13;
                        resources2 = resources;
                        i25 = i12;
                        i30 = i14;
                        iM55685 = i37;
                        float f8 = f;
                        i24 = iM55689 ^ 1782581567;
                        f3 = f8;
                    }
                    break;
                case -1819586604:
                case -1398341047:
                    f3 = f3;
                    C23223.f72974 = z2;
                    if (C0861.m55617(theme, C0946.m55979(C0930.m55893(f82212, 62, 3, i26)) ^ 2099956021) != 0) {
                        c = c3;
                        iM559711 = (i21 - C0946.m55979("ܽ᩸")) * 25;
                        i15 = ((iM559711 ^ i22) * 18899) ^ 1287518399;
                        i16 = 1364848467;
                        r16 = c;
                    } else {
                        iM559711 = (i22 - C0946.m55979("᩸ۛ")) * 115;
                        i15 = ((iM559711 ^ i21) * (-25285)) ^ 1124649582;
                        i16 = -673072926;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1812016078:
                case 810107035:
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    C23223.f72998 = C1012.m56148(theme, C0873.m55680(C1017.m56189(sArr4, 32, 3, i26)) ^ 2123484790);
                    C23223.f73004 = C1059.m14953(resources2, C0946.m55979(C0890.m55726(f82212, 35, 3, i26)) ^ 2102347118, theme);
                    if (RunnableC0938.f81886 >= 0) {
                        iM559710 = C0873.m55680("۫۟") ^ i21;
                        i8 = ((iM559710 ^ i22) * 11747) ^ 151246965;
                        i11 = 868625256;
                    } else {
                        iM559710 = C0946.m55979("ܶۙ") ^ i21;
                        i8 = ((iM559710 ^ i22) * 4159) ^ (-410690509);
                        i11 = 84150325;
                    }
                    i10 = iM559710 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1738955140:
                case -46263961:
                    f3 = f3;
                    C23223.f72977 = C1012.m56148(theme, iM55683 ^ 2119664218);
                    C23223.f73007 = C1012.m56148(theme, C0873.m55680(C0930.m55893(f82212, 95, 3, i26)) ^ 2101086735);
                    C23223.f72976 = C0861.m55617(theme, C0873.m55680(C0866.m55652(f82212, 98, 3, i26)) ^ 2098945453);
                    if (C1071.f81975 <= 0) {
                        iM559711 = (C0873.m55680("ᩴ۟") + i21) * 43;
                        i15 = ((iM559711 ^ i22) * (-6999)) ^ 1102803667;
                        i16 = -518645398;
                        r16 = z;
                    } else {
                        iM559711 = C0946.m55979("۠ܺ") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-30173)) ^ 925938407;
                        i16 = 339107863;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1693254148:
                case -1539172155:
                    f3 = f3;
                    C23223.f72978 = C1012.m56148(theme, C0946.m55979(C1048.m56318(sArr7, i31, i28, i26)) ^ 2117599970);
                    C23223.f72991 = C0861.m55617(theme, C0946.m55979(C1028.m56235(f82212, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i26)) ^ 2102751820);
                    iM55686 = 2124945441 ^ C0873.m55680(C0863.m55635(f82212, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i26));
                    iM559711 = C0946.m55979("ۤ֨") ^ i22;
                    i15 = ((iM559711 ^ i21) * 4761) ^ (-616922108);
                    i16 = -244356944;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1691739582:
                case 1332163450:
                    f3 = f3;
                    C23223.f72968 = C1012.m56148(theme, iM55685);
                    C23223.f72992 = C1012.m56148(theme, C0946.m55979(C1053.m56325(f82212, 80, 3, i26)) ^ 2102657432);
                    C23223.f72967 = C0861.m55617(theme, C0873.m55680(C0930.m55893(f82212, 83, 3, i26)) ^ 2100853820);
                    sArr6 = f82212;
                    i25 = 86;
                    if (C0873.m55678()) {
                        iM559711 = (C0946.m55979("᩸᩺") ^ i21) * (-21);
                        i15 = ((iM559711 ^ i22) * (-27317)) ^ (-1936141897);
                        i16 = 1279605405;
                        r16 = z;
                    } else {
                        iM559711 = (C0873.m55680("᩸ܿ") ^ i22) * (-97);
                        i15 = ((iM559711 ^ i21) * (-2439)) ^ (-204902997);
                        i16 = -962822803;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1541370791:
                case -1256738376:
                    f3 = f3;
                    C23223.f73011 = C0861.m55617(theme, C0873.m55680(strM56252) ^ 2125463550);
                    C23223.f72990 = C0861.m55617(theme, C0946.m55979(C0892.m55750(f82212, 74, 3, i26)) ^ 2128294552);
                    iM55685 = 2130237093 ^ C0873.m55680(C0890.m55726(f82212, 77, 3, i26));
                    if (C0949.m56012()) {
                        iM559711 = (C0873.m55680("ᩴ۟") + i21) * 43;
                        i15 = ((iM559711 ^ i22) * (-6999)) ^ 1102803667;
                        i16 = -518645398;
                        r16 = z;
                    } else {
                        iM559711 = C0873.m55680("ۧۜ") ^ i21;
                        i15 = ((iM559711 ^ i22) * (-21375)) ^ (-816325591);
                        i16 = -840737744;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1538393221:
                case -672922694:
                    i30 = i30;
                    int i38 = i25;
                    Resources resources4 = resources2;
                    C9464.m21979(C23223.f72969, fArr);
                    fArr[c2] = fArr[c2] * 0.9f;
                    C23223.f73001 = Color.HSVToColor(fArr);
                    C23223.f72994 = C1059.m14953(resources4, C0946.m55979(C0873.m55689(f82212, 23, 3, i26)) ^ 2127538046, theme);
                    colorStateListM50539 = C22553.m50538(theme, R.attr.textColorPrimary);
                    int iM559714 = C0946.m55979("ۖ᩸") ^ i22;
                    i24 = iM559714 ^ (-851210546);
                    i23 = ((iM559714 ^ i21) * 28083) ^ 1345534135;
                    i32 = i32;
                    iM55685 = iM55685;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    resources2 = resources4;
                    sArr5 = sArr5;
                    i25 = i38;
                    f3 = 0.9f;
                    i30 = i30;
                    break;
                case -1537931548:
                case -324435088:
                    z2 = false;
                    iM559711 = (i21 - C0946.m55979("ۢۨ")) * 81;
                    i15 = ((iM559711 ^ i22) * 10733) ^ 415519351;
                    i16 = -652001544;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1443239055:
                case -1303610676:
                    C23223.f73012 = C23223.f72985;
                    f3 = f3;
                    iM559711 = (i21 - C0946.m55979("ۗ֨")) * 99;
                    i15 = ((iM559711 ^ i22) * (-29557)) ^ (-109476847);
                    i16 = 184850045;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1397462531:
                case 1453373221:
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    C23223.f73002 = C1059.m14953(resources2, C0873.m55680(C1017.m56189(f82212, 26, 3, i26)) ^ 2128876146, theme);
                    C23223.f72972 = C1012.m56148(theme, C0946.m55979(C1028.m56235(f82212, 29, 3, i26)) ^ 2099653475);
                    sArr4 = f82212;
                    iM559710 = (C0946.m55979("ܶ᩹") ^ i21) * (-21);
                    i8 = ((iM559710 ^ i22) * (-30123)) ^ (-559674766);
                    i11 = -785231337;
                    i10 = iM559710 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1390853142:
                case 1749423617:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("۬ܺ") ^ i22;
                        i = ((iM55979 ^ i21) * (-13097)) ^ (-1597315463);
                        i2 = 1271322840;
                    } else {
                        iM55979 = (i22 - C0946.m55979("۠ܳ")) * (-9);
                        i = ((iM55979 ^ i21) * (-15459)) ^ (-1220224701);
                        i2 = 1015568900;
                    }
                    i24 = iM55979 ^ i2;
                    i23 = i;
                    break;
                case -1324179632:
                case -379410830:
                    f3 = f3;
                    i18 = ~i27;
                    iM559711 = C0873.m55680("᩸֡") ^ i21;
                    i15 = ((iM559711 ^ i22) * 7529) ^ 177771985;
                    i16 = 1608636992;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1151445157:
                case 1405973745:
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    C23223.f72975 = C1059.m14953(resources2, C0873.m55680(C0906.m55810(f82212, 38, 3, i26)) ^ 2101501518, theme);
                    C23223.f72999 = C1012.m56148(theme, C0946.m55979(C0906.m55810(f82212, 41, 3, i26)) ^ 2127188144);
                    sArr8 = f82212;
                    iM559710 = C0946.m55979("ۖ֨") ^ i22;
                    i8 = ((iM559710 ^ i21) * (-9913)) ^ (-829667088);
                    i11 = 1850396143;
                    i10 = iM559710 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1140281861:
                case 575297583:
                    i7 = i32;
                    fArr[i7] = fArr[i7] * 0.9425f;
                    fArr[c3] = fArr[c3] * 1.3619f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C23223.f72997 = Color.HSVToColor(153, fArr);
                    iM55682 = (i21 - C0873.m55680("᩵᩻")) * (-47);
                    i8 = ((iM55682 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM55682 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1052618550:
                case 1540182812:
                    short[] sArr12 = sArr6;
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    int i39 = i25;
                    sArr7 = sArr7;
                    i32 = i32;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    i29 = i29;
                    float[] fArr3 = new float[i29];
                    C9464.m21979(C23223.f72969, fArr);
                    C9464.m21979(C23223.f72985, fArr3);
                    f5 = 0.2f;
                    f4 = 0.8f;
                    if (zM51768) {
                        int iM559715 = C0946.m55979("֫ۧ") ^ i21;
                        i23 = ((iM559715 ^ i22) * (-22213)) ^ (-1894364358);
                        fArr2 = fArr3;
                        i24 = iM559715 ^ 925466443;
                    } else {
                        int iM559716 = (i22 - C0946.m55979("۬ܶ")) * (-105);
                        fArr2 = fArr3;
                        i24 = iM559716 ^ 1513457988;
                        i23 = ((iM559716 ^ i21) * (-22535)) ^ (-1716225908);
                    }
                    i25 = i39;
                    sArr6 = sArr12;
                    i30 = i30;
                    break;
                case -1043029910:
                case -123705777:
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    C23223.f72986 = colorStateListM50539;
                    C23223.f72984 = C22553.m50538(theme, R.attr.textColorSecondary);
                    C23223.f72995 = C23223.f72986.getDefaultColor();
                    C23223.f72980 = C23223.f72984.getDefaultColor();
                    int[] iArr = {-16842910};
                    i32 = i32;
                    C23223.f73015 = C23223.f72986.getColorForState(iArr, i32);
                    C23223.f73010 = C23223.f72984.getColorForState(iArr, i32);
                    if (C0906.f81862 < 0) {
                        int iM556810 = C0873.m55680("᩻᩹") ^ i22;
                        i8 = ((iM556810 ^ i21) * (-9571)) ^ 1631863850;
                        i10 = iM556810 ^ 1665203864;
                        i32 = i32;
                        sArr7 = sArr7;
                        sArr5 = sArr5;
                        f3 = f3;
                        i24 = i10;
                        i23 = i8;
                        iM55685 = iM55685;
                        resources2 = resources2;
                        i25 = i25;
                        i30 = i30;
                    } else {
                        i29 = i29;
                        iM55680 = (i21 - C0873.m55680("ܽ᩶")) * (-115);
                        i3 = ((iM55680 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i310 = iM55680 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM55685 = iM55685;
                        sArr7 = sArr7;
                        resources2 = resources2;
                        sArr5 = sArr5;
                        i25 = i25;
                        f3 = f3;
                        i24 = i310;
                        i23 = i3;
                        i30 = i30;
                        sArr6 = sArr6;
                    }
                    break;
                case -997411561:
                case 586440211:
                    f3 = f3;
                    C23223.f72993 = C0861.m55617(theme, iM55686);
                    C23223.f72987 = C1012.m56148(theme, C0873.m55680(RunnableC0897.m55783(f82212, 116, 3, i26)) ^ 2127157653);
                    C23223.f72982 = C1012.m56148(theme, C0946.m55979(C0866.m55652(f82212, 119, 3, i26)) ^ 2129678377);
                    if (C23223.f73012 == 0) {
                        iM559711 = (i22 - C0946.m55979("ܳۚ")) * (-21);
                        i15 = ((iM559711 ^ i21) * 3509) ^ (-2009920543);
                        i16 = -709428327;
                        r16 = z;
                    } else {
                        iM559711 = (i21 - C0946.m55979("ۗ֨")) * 99;
                        i15 = ((iM559711 ^ i22) * (-29557)) ^ (-109476847);
                        i16 = 184850045;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -966498302:
                case 69057746:
                    z2 = true;
                    iM559711 = (i21 - C0946.m55979("ۢۨ")) * 81;
                    i15 = ((iM559711 ^ i22) * 10733) ^ 415519351;
                    i16 = -652001544;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -906053336:
                case -424312763:
                    i7 = i32;
                    C23223.f72997 = (C23223.f72969 & i17) | 1207959552;
                    iM55682 = (i21 - C0873.m55680("᩵᩻")) * (-47);
                    i8 = ((iM55682 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM55682 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -888722305:
                case 1673542464:
                    C0894.m55769();
                    if (C0992.f81922 < 0) {
                        f3 = f3;
                        iM559711 = C0946.m55979("֡۟") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-6845)) ^ (-1365754319);
                        i16 = -1871292805;
                        r16 = z;
                        f2 = f3;
                        i24 = iM559711 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    } else {
                        f = f3;
                        sArr3 = sArr5;
                        sArr = sArr7;
                        sArr2 = sArr8;
                        int i311 = i30;
                        i12 = i25;
                        resources = resources2;
                        i13 = iM55685;
                        i14 = i311;
                        int iM556811 = (C0873.m55680("᩻۫") + i21) * 127;
                        sArr8 = sArr2;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        i23 = ((iM556811 ^ i22) * 9213) ^ (-920874090);
                        int i312 = i13;
                        resources2 = resources;
                        i25 = i12;
                        i30 = i14;
                        iM55685 = i312;
                        float f9 = f;
                        i24 = iM556811 ^ 1782581567;
                        f3 = f9;
                    }
                    break;
                case -865140352:
                case 259175065:
                    f3 = f3;
                    C23223.f72979 = colorStateListM50538;
                    C23223.f73009 = C22553.m50538(theme, C0873.m55680(C1024.m56203(f82212, 56, 3, i26)) ^ 2125895428);
                    if (C1012.m56148(theme, C0946.m55979(C0912.m55822(f82212, 59, 3, i26)) ^ 2101971801) != 0) {
                        iM559711 = C0873.m55680("۟۟") ^ i22;
                        i15 = ((iM559711 ^ i21) * 14757) ^ (-1773509532);
                        i16 = 838754769;
                        r16 = z;
                    } else {
                        iM559711 = (C0946.m55979("۠۬") ^ i21) * 31;
                        i15 = ((iM559711 ^ i22) * 15573) ^ 1194136090;
                        i16 = 1861619141;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -624706965:
                case 869520758:
                    f3 = f3;
                    if (C1012.m56148(theme, C0946.m55979(C1229.m56403(f82212, 122, 3, i26)) ^ 2102682527) != 0) {
                        iM559711 = C0946.m55979("ۘ᩺") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-18283)) ^ (-885009433);
                        i16 = 1313624532;
                        r16 = z;
                    } else {
                        iM559711 = (C0873.m55680("᩵ۡ") ^ i21) * 81;
                        i15 = ((iM559711 ^ i22) * 26737) ^ 301454321;
                        i16 = -200225779;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -540086538:
                case 157310967:
                    sArr6 = sArr6;
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    i7 = i32;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    if (zM51768) {
                        iM55682 = (C0946.m55979("֨۟") ^ i21) * 91;
                        i8 = ((iM55682 ^ i22) * 31533) ^ (-1572242822);
                        i9 = 1060591477;
                    } else {
                        iM55682 = (C0873.m55680("ۤܿ") + i22) * (-113);
                        i8 = ((iM55682 ^ i21) * 1155) ^ 1698637764;
                        i9 = 699714931;
                    }
                    i10 = iM55682 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -486553309:
                case 1103476333:
                    f3 = f3;
                    if (zM51768) {
                        iM559711 = C0946.m55979("᩹᩺") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-29275)) ^ 72052900;
                        i16 = -1676041549;
                        r16 = z;
                    } else {
                        iM559711 = (C0946.m55979("ܳۙ") + i21) * 55;
                        i15 = ((iM559711 ^ i22) * 30693) ^ (-347203851);
                        i16 = -1772982179;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -462826910:
                case 1899125745:
                    f3 = f3;
                    c = 0;
                    iM559711 = (i21 - C0946.m55979("ܽ᩸")) * 25;
                    i15 = ((iM559711 ^ i22) * 18899) ^ 1287518399;
                    i16 = 1364848467;
                    r16 = c;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case 64878675:
                case 567655086:
                    f3 = f3;
                    C23223.f72973 = C0861.m55617(theme, C0873.m55680(C1044.m56276(f82212, 101, 3, i26)) ^ 2100041125);
                    C23223.f73013 = C0861.m55617(theme, C0873.m55680(C0854.m55597(f82212, IShizukuService.Stub.TRANSACTION_isHidden, 3, i26)) ^ 2102228898);
                    sArr7 = f82212;
                    i31 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i28 = 3;
                    if (C0863.m55643()) {
                        iM559711 = (i21 - C0946.m55979("᩹ܳ")) * 59;
                        i15 = ((iM559711 ^ i22) * (-20971)) ^ 1443954741;
                        i16 = 1688544451;
                        r16 = z;
                    } else {
                        iM559711 = C0946.m55979("֡۟") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-6845)) ^ (-1365754319);
                        i16 = -1871292805;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case 108640269:
                case 703169219:
                    i26 = 10653;
                    iM55680 = (C0873.m55680("ۤۢ") ^ i22) * 33;
                    i3 = ((iM55680 ^ i21) * 4139) ^ 1716637358;
                    i4 = 1913934428;
                    int i313 = iM55680 ^ i4;
                    i29 = i29;
                    i32 = i32;
                    iM55685 = iM55685;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    sArr5 = sArr5;
                    i25 = i25;
                    f3 = f3;
                    i24 = i313;
                    i23 = i3;
                    i30 = i30;
                    sArr6 = sArr6;
                    break;
                case 153844430:
                case 1616671914:
                    C23223.f73006 = i18;
                    break;
                case 552561245:
                case 684619199:
                    f3 = f3;
                    C23223.f72981 = z;
                    C23223.f73012 = C0861.m55617(theme, C0873.m55680(C1046.m56293(f82212, 65, 3, i26)) ^ 2122338677);
                    C23223.f73008 = C0861.m55617(theme, C0873.m55680(C0989.m56092(f82212, 68, 3, i26)) ^ 2129007414);
                    strM56252 = C1036.m56252(f82212, 71, 3, i26);
                    if (C0992.f81922 >= 0) {
                        iM559711 = (C0946.m55979("᩸᩺") ^ i21) * (-21);
                        i15 = ((iM559711 ^ i22) * (-27317)) ^ (-1936141897);
                        i16 = 1279605405;
                        r16 = z;
                    } else {
                        iM559711 = C0946.m55979("᩹ۤ") ^ i22;
                        i15 = ((iM559711 ^ i21) * 24605) ^ (-879583342);
                        i16 = -2131260208;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case 663018228:
                case 710569964:
                    C1404.m56468();
                    if (C1046.m56302() == 0) {
                        f3 = f3;
                        iM559711 = (C0873.m55680("ᩴ۟") + i21) * 43;
                        i15 = ((iM559711 ^ i22) * (-6999)) ^ 1102803667;
                        i16 = -518645398;
                        r16 = z;
                        f2 = f3;
                        i24 = iM559711 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    } else {
                        f3 = f3;
                        i30 = i30;
                        sArr5 = sArr5;
                        i25 = i25;
                        sArr7 = sArr7;
                        i32 = i32;
                        resources2 = resources2;
                        iM55685 = iM55685;
                        i29 = i29;
                        iM55680 = (i21 - C0873.m55680("ܽ᩶")) * (-115);
                        i3 = ((iM55680 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i314 = iM55680 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM55685 = iM55685;
                        sArr7 = sArr7;
                        resources2 = resources2;
                        sArr5 = sArr5;
                        i25 = i25;
                        f3 = f3;
                        i24 = i314;
                        i23 = i3;
                        i30 = i30;
                        sArr6 = sArr6;
                    }
                    break;
                case 740737938:
                case 1970390764:
                    if (C0967.f81910 < 0) {
                        f3 = f3;
                        i30 = i30;
                        sArr5 = sArr5;
                        i25 = i25;
                        sArr7 = sArr7;
                        i32 = i32;
                        resources2 = resources2;
                        iM55685 = iM55685;
                        i29 = i29;
                        iM55680 = (i21 - C0873.m55680("ܽ᩶")) * (-115);
                        i3 = ((iM55680 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i315 = iM55680 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM55685 = iM55685;
                        sArr7 = sArr7;
                        resources2 = resources2;
                        sArr5 = sArr5;
                        i25 = i25;
                        f3 = f3;
                        i24 = i315;
                        i23 = i3;
                        i30 = i30;
                        sArr6 = sArr6;
                    } else {
                        f3 = f3;
                        iM559711 = C0946.m55979("֡۟") ^ i22;
                        i15 = ((iM559711 ^ i21) * (-6845)) ^ (-1365754319);
                        i16 = -1871292805;
                        r16 = z;
                        f2 = f3;
                        i24 = iM559711 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    }
                    break;
                case 761477689:
                case 1351919665:
                    f3 = f3;
                    C23223.f73005 = C0861.m55617(theme, C0873.m55680(AbstractC0942.m55970(sArr6, i25, 3, i26)) ^ 2101692937);
                    C23223.f72996 = C1012.m56148(theme, C0873.m55680(RunnableC0897.m55783(f82212, 89, 3, i26)) ^ 2128809237);
                    iM55683 = C0873.m55680(C1194.m56386(f82212, 92, 3, i26));
                    if (RunnableC0938.m55938() == 0) {
                        iM559711 = (C0946.m55979("ۢ۠") + i21) * (-123);
                        i15 = ((iM559711 ^ i22) * 25715) ^ 7805365;
                        i16 = -723420795;
                        r16 = z;
                        f2 = f3;
                        i24 = iM559711 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    } else {
                        i30 = i30;
                        sArr5 = sArr5;
                        i25 = i25;
                        sArr7 = sArr7;
                        resources2 = resources2;
                        iM55685 = iM55685;
                        iM559710 = C0873.m55680("۫۟") ^ i21;
                        i8 = ((iM559710 ^ i22) * 11747) ^ 151246965;
                        i11 = 868625256;
                        i10 = iM559710 ^ i11;
                        sArr7 = sArr7;
                        sArr5 = sArr5;
                        f3 = f3;
                        i24 = i10;
                        i23 = i8;
                        iM55685 = iM55685;
                        resources2 = resources2;
                        i25 = i25;
                        i30 = i30;
                    }
                    break;
                case 907905735:
                case 1620483005:
                    C0949.m56012();
                    f = f3;
                    sArr3 = sArr5;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    int i316 = i30;
                    i12 = i25;
                    resources = resources2;
                    i13 = iM55685;
                    i14 = i316;
                    int iM556812 = (C0873.m55680("᩻۫") + i21) * 127;
                    sArr8 = sArr2;
                    sArr7 = sArr;
                    sArr5 = sArr3;
                    i23 = ((iM556812 ^ i22) * 9213) ^ (-920874090);
                    int i317 = i13;
                    resources2 = resources;
                    i25 = i12;
                    i30 = i14;
                    iM55685 = i317;
                    float f10 = f;
                    i24 = iM556812 ^ 1782581567;
                    f3 = f10;
                    break;
                case 925354156:
                case 1812675740:
                    i26 = 38174;
                    iM55680 = (C0873.m55680("ۤۢ") ^ i22) * 33;
                    i3 = ((iM55680 ^ i21) * 4139) ^ 1716637358;
                    i4 = 1913934428;
                    int i318 = iM55680 ^ i4;
                    i29 = i29;
                    i32 = i32;
                    iM55685 = iM55685;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    sArr5 = sArr5;
                    i25 = i25;
                    f3 = f3;
                    i24 = i318;
                    i23 = i3;
                    i30 = i30;
                    sArr6 = sArr6;
                    break;
                case 938161630:
                case 1695509659:
                    if (!C0912.m55833()) {
                        iM55979 = C0946.m55979("۬ܺ") ^ i22;
                        i = ((iM55979 ^ i21) * (-13097)) ^ (-1597315463);
                        i2 = 1271322840;
                        i24 = iM55979 ^ i2;
                        i23 = i;
                    } else {
                        f3 = f3;
                        iM559711 = (C0946.m55979("᩸᩺") ^ i21) * (-21);
                        i15 = ((iM559711 ^ i22) * (-27317)) ^ (-1936141897);
                        i16 = 1279605405;
                        r16 = z;
                        f2 = f3;
                        i24 = iM559711 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    }
                    break;
                case 1428401824:
                case 1779997356:
                    sArr6 = sArr6;
                    f3 = f3;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    i32 = i32;
                    resources2 = resources2;
                    iM55685 = iM55685;
                    i29 = i29;
                    short s = f82212[7];
                    if ((s * 30980) - ((s * s) + 239940100) <= 0) {
                        iM55680 = (C0946.m55979("ۢᩳ") ^ i21) * (-97);
                        i3 = ((iM55680 ^ i22) * 19523) ^ 1956444917;
                        i4 = 876870793;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩸") ^ i22;
                        i3 = ((iM55680 ^ i21) * 18809) ^ (-1567432454);
                        i4 = 1508431009;
                    }
                    int i319 = iM55680 ^ i4;
                    i29 = i29;
                    i32 = i32;
                    iM55685 = iM55685;
                    sArr7 = sArr7;
                    resources2 = resources2;
                    sArr5 = sArr5;
                    i25 = i25;
                    f3 = f3;
                    i24 = i319;
                    i23 = i3;
                    i30 = i30;
                    sArr6 = sArr6;
                    break;
                case 1582711778:
                case 1709075510:
                    C0989.m56095();
                    break;
                case 1642091376:
                case 1759408002:
                    i7 = i32;
                    fArr[i7] = fArr[i7] * 0.9424f;
                    fArr[c3] = fArr[c3] * 1.1285f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C23223.f72997 = Color.HSVToColor(72, fArr);
                    iM55682 = (i21 - C0873.m55680("᩵᩻")) * (-47);
                    i8 = ((iM55682 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM55682 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM55685 = iM55685;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case 2012497324:
                case 2075113877:
                    C9464.m21979(C23223.f72985, fArr);
                    fArr[c2] = fArr[c2] * f3;
                    C23223.f73012 = Color.HSVToColor(fArr);
                    f3 = f3;
                    iM559711 = (i21 - C0946.m55979("ۗ֨")) * 99;
                    i15 = ((iM559711 ^ i22) * (-29557)) ^ (-109476847);
                    i16 = 184850045;
                    r16 = z;
                    f2 = f3;
                    i24 = iM559711 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                default:
                    if (C0861.f81831) {
                        iM55979 = (i22 - C0946.m55979("۠ܳ")) * (-9);
                        i = ((iM55979 ^ i21) * (-15459)) ^ (-1220224701);
                        i2 = 1015568900;
                    } else {
                        iM55979 = C0946.m55979("ۖۙ") ^ i22;
                        i = ((iM55979 ^ i21) * 25295) ^ 145073235;
                        i2 = 1433749405;
                    }
                    i24 = iM55979 ^ i2;
                    i23 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0125 A[PHI: r3 r5 r6 r10 r11
      0x0125: PHI (r3v4 android.content.Context) = (r3v2 android.content.Context), (r3v3 android.content.Context), (r3v2 android.content.Context) binds: [B:36:0x0123, B:27:0x00c4, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:36:0x0123, B:27:0x00c4, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:36:0x0123, B:27:0x00c4, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:36:0x0123, B:27:0x00c4, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:36:0x0123, B:27:0x00c4, B:15:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x015b A[PHI: r2 r4
      0x015b: PHI (r2v5 android.content.res.ColorStateList) = 
      (r2v2 android.content.res.ColorStateList)
      (r2v3 android.content.res.ColorStateList)
      (r2v2 android.content.res.ColorStateList)
      (r2v2 android.content.res.ColorStateList)
     binds: [B:40:0x0159, B:32:0x00fd, B:12:0x0072, B:85:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:40:0x0159, B:32:0x00fd, B:12:0x0072, B:85:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
    
        if (p067l.C0866.f81837 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        if (p067l.C1229.f82066 >= 0) goto L13;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m35831(TextView textView) {
        int iM55680;
        int i;
        short s;
        int iM55681;
        int i2;
        int i3;
        int iM55979;
        int i4;
        TextView textView2 = textView;
        int i5 = C0898.f81858;
        int i6 = C0863.f81833;
        int iM559710 = C0946.m55979("ۢ᩸") ^ i6;
        int i7 = ((iM559710 ^ i5) * 19333) ^ 1262407023;
        String strM56161 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM559710 ^ 842802782;
        int iM559711 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i14 = 952154911;
        int i15 = 0;
        Context contextM56169 = null;
        String strM55689 = null;
        ColorStateList colorStateList = null;
        int i16 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-12623)) >> 31));
            switch (i14) {
                case -1896193877:
                case 50681137:
                    strM55689 = C0873.m55689(sArr3, i11, 3, i13);
                    if (C0877.f81843 < 0) {
                        iM55979 = (C0873.m55680("ۧۤ") + i5) * 77;
                        i2 = ((iM55979 ^ i6) * 11591) ^ 722097169;
                        i4 = 1200650083;
                        i8 = iM55979 ^ i4;
                        i7 = i2;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ۖ᩹")) * 9;
                        i7 = ((iM55680 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                        i8 = iM55680 ^ i;
                        textView2 = textView;
                    }
                    break;
                case -1855076324:
                case 1656772585:
                    sArr2 = f82212;
                    i9 = 1;
                    i10 = 3;
                    if (C0906.f81862 < 0) {
                        iM55979 = C0873.m55680("֡ᩳ") ^ i5;
                        i2 = ((iM55979 ^ i6) * 30597) ^ 229389950;
                        i4 = -1092300302;
                        i8 = iM55979 ^ i4;
                        i7 = i2;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ۖ᩹")) * 9;
                        i7 = ((iM55680 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                        i8 = iM55680 ^ i;
                        textView2 = textView;
                    }
                    break;
                case -1584021386:
                case -643576693:
                    if (i15 - (i12 * i12) > 0) {
                        iM55979 = (C0873.m55680("֨۫") + i6) * (-21);
                        i2 = ((iM55979 ^ i5) * 26405) ^ (-932661831);
                        i4 = -1240805460;
                    } else {
                        iM55979 = C0946.m55979("ܺ۫") ^ i5;
                        i2 = ((iM55979 ^ i6) * (-25243)) ^ (-999107535);
                        i4 = -1503208306;
                    }
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case -1360904777:
                case 987738526:
                    i13 = 33630;
                    iM55979 = (C0873.m55680("ܳ۟") ^ i5) * 51;
                    i2 = ((iM55979 ^ i6) * 6689) ^ 242987864;
                    i4 = 588591632;
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case -1335635675:
                case -513278190:
                    textView2.setBackgroundResource(iM559711 ^ i16);
                    colorStateList = null;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ۖ᩻") ^ i5) * (-11);
                        i2 = ((iM55979 ^ i6) * 11629) ^ 1789548949;
                        i4 = -1259578848;
                    } else {
                        iM55979 = (C0873.m55680("ۧ᩸") + i5) * (-73);
                        i2 = ((iM55979 ^ i6) * (-24151)) ^ (-794322466);
                        i4 = 1190715995;
                    }
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case -1256040699:
                case -638815724:
                    iM559711 = C0946.m55979(strM56161);
                    i16 = 2126825137;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = C0873.m55680("ۜۡ") ^ i6;
                        i2 = ((iM55979 ^ i5) * 11563) ^ 1194231856;
                        i4 = -771432977;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩸") ^ i6;
                        i2 = ((iM55979 ^ i5) * 11699) ^ 1936277683;
                        i4 = -1467454591;
                    }
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case -1235214648:
                case -537956591:
                    strM56161 = ServiceConnectionC1013.m56161(sArr2, i9, i10, i13);
                    if (C0912.m55833()) {
                        iM55979 = (C0946.m55979("ۖ᩻") ^ i5) * (-11);
                        i2 = ((iM55979 ^ i6) * 11629) ^ 1789548949;
                        i4 = -1259578848;
                    } else {
                        iM55979 = C0946.m55979("ۘ֫") ^ i6;
                        i2 = ((iM55979 ^ i5) * (-12525)) ^ (-1208448001);
                        i4 = -1379283497;
                    }
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case -1233743693:
                case -932662590:
                    textView2.setTextColor(C0886.m5547(contextM56169, C0873.m55680(strM55689) ^ 2097965792));
                    break;
                case -1222027095:
                case 1533283581:
                    contextM56169 = RunnableC1014.m56169(textView);
                    sArr3 = f82212;
                    i11 = 4;
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("ۜۡ") ^ i6;
                        i2 = ((iM55979 ^ i5) * 11563) ^ 1194231856;
                        i4 = -771432977;
                    } else {
                        iM55979 = C0873.m55680("ۚ᩶") ^ i5;
                        i2 = ((iM55979 ^ i6) * 2159) ^ 272913025;
                        i4 = -2038527553;
                    }
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case -890288789:
                case -335425377:
                    C1025.m56230();
                    s = s2;
                    iM55681 = (C0873.m55680("ۜܺ") ^ i6) * 87;
                    i2 = ((iM55681 ^ i5) * (-8675)) ^ 1250007833;
                    i3 = 522478688;
                    i8 = iM55681 ^ i3;
                    textView2 = textView;
                    s2 = s;
                    i7 = i2;
                    break;
                case -708669779:
                case 1731499945:
                    C1028.m56247();
                    break;
                case -290030231:
                case 331791490:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (i6 - C0873.m55680("ۖ᩹")) * 9;
                        i7 = ((iM55680 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                        i8 = iM55680 ^ i;
                        textView2 = textView;
                    } else {
                        iM55979 = (C0946.m55979("ۖ᩻") ^ i5) * (-11);
                        i2 = ((iM55979 ^ i6) * 11629) ^ 1789548949;
                        i4 = -1259578848;
                        i8 = iM55979 ^ i4;
                        i7 = i2;
                    }
                    break;
                case -150761239:
                case 988072908:
                    C0861.m55626();
                    break;
                case -5711690:
                case 378572639:
                    s2 = sArr[c];
                    s3 = 28760;
                    if (C0967.m56074()) {
                        iM55680 = (i6 - C0873.m55680("ۖ᩹")) * 9;
                        i7 = ((iM55680 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ܿۧ")) * 127;
                        i7 = ((iM55680 ^ i5) * (-2021)) ^ 1178603621;
                        i = -1550060625;
                    }
                    i8 = iM55680 ^ i;
                    textView2 = textView;
                    break;
                case -2583896:
                case 206167320:
                    i15 = s2 * s3;
                    s = s2;
                    i12 = s + 7190;
                    if (C0882.m55710() == 0) {
                        iM55681 = (C0946.m55979("ۙۨ") + i6) * (-119);
                        i2 = ((iM55681 ^ i5) * (-917)) ^ 600026837;
                        i3 = -1281475781;
                        i8 = iM55681 ^ i3;
                        textView2 = textView;
                        s2 = s;
                        i7 = i2;
                    } else {
                        int iM559712 = (C0946.m55979("᩹ۖ") ^ i5) * (-87);
                        i8 = iM559712 ^ 164422399;
                        s2 = s;
                        i7 = ((iM559712 ^ i6) * (-5055)) ^ (-643166825);
                        textView2 = textView;
                    }
                    break;
                case 45806285:
                case 1118716608:
                    i13 = 60173;
                    iM55979 = (C0873.m55680("ܳ۟") ^ i5) * 51;
                    i2 = ((iM55979 ^ i6) * 6689) ^ 242987864;
                    i4 = 588591632;
                    i8 = iM55979 ^ i4;
                    i7 = i2;
                    break;
                case 379957169:
                case 1834024308:
                    C1024.m56209();
                    break;
                case 550288381:
                case 718768777:
                    s = s2;
                    sArr = f82212;
                    c = 0;
                    if (C1124.m56367() >= 0) {
                        iM55681 = (C0873.m55680("ۜܺ") ^ i6) * 87;
                        i2 = ((iM55681 ^ i5) * (-8675)) ^ 1250007833;
                        i3 = 522478688;
                    } else {
                        iM55681 = (C0873.m55680("֨᩷") ^ i5) * 3;
                        i2 = ((iM55681 ^ i6) * 25151) ^ (-123300859);
                        i3 = -433671517;
                    }
                    i8 = iM55681 ^ i3;
                    textView2 = textView;
                    s2 = s;
                    i7 = i2;
                    break;
                default:
                    textView2.setBackgroundTintList(colorStateList);
                    if (C1046.f81962 > 0) {
                        iM55979 = (C0873.m55680("ۗ᩵") + i6) * 81;
                        i2 = ((iM55979 ^ i5) * (-8599)) ^ 1923701483;
                        i4 = 1435693446;
                        i8 = iM55979 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        int iM559713 = (C0946.m55979("᩹ۖ") ^ i5) * (-87);
                        i8 = iM559713 ^ 164422399;
                        s2 = s;
                        i7 = ((iM559713 ^ i6) * (-5055)) ^ (-643166825);
                        textView2 = textView;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static PorterDuffColorFilter m35830(int i) {
        int i2 = -1880294461;
        int i3 = C1012.f81938;
        int i4 = C0845.f81821;
        int iM55979 = C0946.m55979("ۨ᩻") ^ i3;
        int i5 = ((iM55979 ^ i4) * (-4335)) ^ 34383414;
        int i6 = 909896018;
        while (true) {
            i2 = ((((i2 ^ i4) * (-20145)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2094054679:
                case -1769680593:
                    int i7 = C22553.f71136;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ᩴۧ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-12975)) ^ 2007816862;
                        i6 = 321640224;
                    } else {
                        iM55979 = C0873.m55680("᩸ۜ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-721)) ^ 1611732019;
                        i6 = 1385393248;
                    }
                    break;
                case -2073701312:
                case -1825106021:
                    C1017.m56187();
                    C0906.m55809();
                    return null;
                case -1916492720:
                case -302718649:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (i3 - C0946.m55979("֨᩹")) * (-49);
                        i5 = ((iM55979 ^ i4) * (-23325)) ^ 1220267139;
                        i6 = 614514441;
                    } else {
                        iM55979 = C0873.m55680("ۙ֨") ^ i3;
                        i5 = ((iM55979 ^ i4) * 1683) ^ 124685473;
                        i6 = -366691002;
                    }
                    break;
                case -1865835906:
                case 813901573:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0946.m55979("֡᩺") ^ i3;
                        i5 = ((iM55979 ^ i4) * 27691) ^ (-421083677);
                        i6 = -1445130944;
                    } else {
                        iM55979 = (C0946.m55979("᩷۟") + i3) * 115;
                        i5 = ((iM55979 ^ i4) * 28661) ^ (-618278394);
                        i6 = -589145369;
                    }
                    break;
                case -1372239281:
                case -1100381899:
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ܳ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM55979 = C0873.m55680("ܺܳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 71) ^ (-1399365126);
                        i6 = -767236103;
                    }
                    break;
                case -1294683988:
                case 482975377:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ܳ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM55979 = C0946.m55979("۬ۖ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32381)) ^ (-1901454016);
                        i6 = 829510146;
                    }
                    break;
                case -1245401293:
                case -357035205:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ܳ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM55979 = (C0946.m55979("ܰۜ") ^ i3) * (-31);
                        i5 = ((iM55979 ^ i4) * (-2659)) ^ (-1098944760);
                        i6 = -2102037382;
                    }
                    break;
                case -1148942876:
                case 1733319656:
                    if (C0892.m55749()) {
                        iM55979 = (C0946.m55979("ۘ᩵") + i4) * 81;
                        i5 = ((iM55979 ^ i3) * (-25651)) ^ (-803669432);
                        i6 = 439474003;
                    } else {
                        iM55979 = C0946.m55979("֡᩺") ^ i3;
                        i5 = ((iM55979 ^ i4) * 27691) ^ (-421083677);
                        i6 = -1445130944;
                    }
                    break;
                case -1144723351:
                case 992585119:
                    if (C0906.f81862 < 0) {
                        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                    iM55979 = C0946.m55979("ᩴۧ") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-12975)) ^ 2007816862;
                    i6 = 321640224;
                    break;
                case -1126812899:
                case -352588834:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0946.m55979("۬ۖ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32381)) ^ (-1901454016);
                        i6 = 829510146;
                    } else {
                        iM55979 = (i4 - C0946.m55979("֨۬")) * (-57);
                        i5 = ((iM55979 ^ i3) * (-23981)) ^ (-1510608948);
                        i6 = 1385295414;
                    }
                    break;
                case -1006488464:
                case 2083015416:
                    RunnableC1014.m56177();
                    C0967.m56074();
                    iM55979 = C0946.m55979("۬ۖ") ^ i3;
                    i5 = ((iM55979 ^ i4) * (-32381)) ^ (-1901454016);
                    i6 = 829510146;
                    break;
                case -275910504:
                case 1518965654:
                    if (!C0892.f81851) {
                        iM55979 = C0946.m55979("۬ۖ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32381)) ^ (-1901454016);
                        i6 = 829510146;
                    } else {
                        iM55979 = (i3 - C0946.m55979("֨᩹")) * (-49);
                        i5 = ((iM55979 ^ i4) * (-23325)) ^ 1220267139;
                        i6 = 614514441;
                    }
                    break;
                case 585455172:
                case 1596997505:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ܳ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM55979 = (C0873.m55680("ۤۧ") ^ i4) * (-121);
                        i5 = ((iM55979 ^ i3) * (-9499)) ^ 641878886;
                        i6 = -1366372889;
                    }
                    break;
                case 1403292965:
                case 1944162640:
                    if (!AbstractC0942.m55971()) {
                        iM55979 = C0946.m55979("֡᩺") ^ i3;
                        i5 = ((iM55979 ^ i4) * 27691) ^ (-421083677);
                        i6 = -1445130944;
                    } else {
                        iM55979 = C0873.m55680("ܳ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    }
                    break;
                default:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("ܳ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۖ֨")) * 89;
                        i5 = ((iM55979 ^ i3) * 25171) ^ 1690513912;
                        i6 = 1071669391;
                    }
                    break;
            }
        }
    }
}
