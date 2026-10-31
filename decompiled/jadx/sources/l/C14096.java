package l;

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
public final class C14096 {

    /* JADX INFO: renamed from: ᩴܽᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f42564 = {6550, -2883, -10688, -4522, 1215, -8082, -10474, 1951, -21772, -22778, 29136, 23359, -17570, 22338, -21580, -19479, 19322, -23397, -22676, 31857, -22774, 17046, 30027, 24475, 23090, -19990, 21016, -17240, 31649, -23282, -17803, -18406, 19979, -20805, -17469, -20317, 26563, -20913, -17341, -17953, 26344, 24434, -22089, 32158, -17675, -20039, -17565, 22670, 17805, -16702, -16933, -24160, 21669, -22030, -20034, 22426, 23018, 18511, -22660, -20033, -17011, -23625, -18418, 18786, -17866, 19044, 20239, -19361, 21731, 31819, -16610, 17419, -21297, 20796, 21299, -16866, 31084, -21885, -20608, 19009, -19691, 29705, -16615, -17111, 23246, 26164, -16744, 31721, 19217, 22303, 30223, -16638, 32649, -21922, 17345, -17566, -22523, -20946, -23139, -22949, 17252, -22621, -18222, -24266, -20001, 18348, -22645, 31039, 17162, 16779, -19650, 20069, 29407, 17594, -17578, -16938, 24392, 21718, -19504, -21557, 28942, 31312, -19587, 31864, -19389};

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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33706(AbstractActivityC3346 abstractActivityC3346) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        int i7;
        int iM2568;
        int i8;
        int i9;
        int i10;
        int iM6982;
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
        int iM6983;
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
        int iM6984 = 0;
        int i19 = 0;
        String strM11919 = null;
        int iM2569 = 0;
        int i20 = 433722403;
        int i21 = C4117.f13076;
        int i22 = C22628.f73083;
        int iM25610 = (i21 - C0630.m2566("۫֡")) * 85;
        int i23 = ((iM25610 ^ i22) * (-3497)) ^ 295443270;
        int i24 = iM25610 ^ (-1161831287);
        Resources resources2 = null;
        float[] fArr2 = null;
        ColorStateList colorStateListM48207 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i25 = 0;
        int iM25611 = 0;
        int i26 = 0;
        int i27 = 0;
        int iM25612 = 0;
        int i28 = 0;
        int i29 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        char c3 = 0;
        int i30 = 0;
        boolean zM49431 = false;
        boolean z2 = false;
        ColorStateList colorStateListM48208 = null;
        short[] sArr8 = null;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * 26157) >> 31));
            switch (i20) {
                case -2142536607:
                case -159168751:
                    iM25611 = iM25611;
                    sArr6 = sArr6;
                    f3 = f3;
                    i29 = i29;
                    i30 = i30;
                    sArr5 = sArr5;
                    i25 = i25;
                    sArr7 = sArr7;
                    i32 = i32;
                    zM49431 = C21943.m49431();
                    Resources resources3 = abstractActivityC3346.getResources();
                    theme = abstractActivityC3346.getTheme();
                    C21943.f70274 = C3432.m10492(theme, C2105.m6981(C7811.m20837(f42564, 8, 3, i26)) ^ 2130373409);
                    C21943.f70257 = C0382.m1839(theme, C0630.m2566(C7811.m20837(f42564, 11, 3, i26)) ^ 2126812781);
                    iM6984 = C2105.m6981(C2105.m6988(f42564, 14, 3, i26));
                    i19 = 2130686972;
                    if (RunnableC3474.m10630()) {
                        int iM6985 = C2105.m6981("۠ۛ") ^ i21;
                        i32 = i32;
                        sArr7 = sArr7;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        f3 = f3;
                        i24 = iM6985 ^ (-741086663);
                        i23 = ((iM6985 ^ i22) * (-22567)) ^ 914261403;
                        i25 = i25;
                        i30 = i30;
                        i29 = i29;
                        iM25611 = iM25611;
                        resources2 = resources3;
                    } else {
                        resources2 = resources3;
                        iM2566 = (i21 - C0630.m2566("ܽ᩶")) * (-115);
                        i3 = ((iM2566 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i33 = iM2566 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM25611 = iM25611;
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
                    C21943.f70286 = (C21943.f70257 & i17) | DrawerLayoutUtils.DEFAULT_SCRIM_COLOR;
                    iM2568 = (i21 - C0630.m2566("᩵᩻")) * (-47);
                    i8 = ((iM2568 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM2568 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -2113017066:
                case -754743649:
                    C21943.f70301 = C21943.f70274;
                    f3 = f3;
                    iM6983 = (i21 - C2105.m6981("ۗ֨")) * 99;
                    i15 = ((iM6983 ^ i22) * (-29557)) ^ (-109476847);
                    i16 = 184850045;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -2069493409:
                case 439126661:
                    f3 = f3;
                    i27 = (C21943.f70257 & i17) + ((C21943.f70274 & i17) * 31);
                    if (zM49431) {
                        iM6983 = C0630.m2566("ۗۗ") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-28797)) ^ 1292105934;
                        i16 = -595494287;
                        r16 = z;
                    } else {
                        i18 = i27;
                        iM6983 = C0630.m2566("᩸֡") ^ i21;
                        i15 = ((iM6983 ^ i22) * 7529) ^ 177771985;
                        i16 = 1608636992;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
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
                    iM25611 = iM25611;
                    C21943.f70272 = C0382.m1839(theme, iM6984 ^ i19);
                    C21943.f70277 = C0382.m1839(theme, C0630.m2566(C0798.m3005(f42564, 17, 3, i26)) ^ 2099710037);
                    fArr = new float[3];
                    c3 = 1;
                    i17 = 16777215;
                    c2 = 2;
                    i32 = 0;
                    if (C3432.m10492(theme, C2105.m6981(C3019.m9250(f42564, 20, 3, i26)) ^ 2099289318) != 0) {
                        iM2567 = C2105.m6981("ۛ۠") ^ i21;
                        i5 = ((iM2567 ^ i22) * 28023) ^ (-832656298);
                        i6 = 1604918837;
                    } else {
                        iM2567 = (C0630.m2566("֡ܺ") ^ i22) * 23;
                        i5 = ((iM2567 ^ i21) * (-21141)) ^ (-2092871635);
                        i6 = -1934078454;
                    }
                    int i34 = iM2567 ^ i6;
                    i23 = i5;
                    sArr7 = sArr11;
                    sArr6 = sArr9;
                    i29 = 3;
                    sArr5 = sArr10;
                    f3 = f6;
                    i24 = i34;
                    iM25611 = iM25611;
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
                    i13 = iM25611;
                    sArr2 = sArr8;
                    C3432.m10492(theme, C2105.m6981(C4263.m12817(sArr2, 44, 3, i26)) ^ 2100844597);
                    C21943.f70292 = C4369.m13089(resources, C0630.m2566(C2520.m8030(f42564, 47, 3, i26)) ^ 2125473278, theme);
                    sArr3 = f42564;
                    i14 = 50;
                    if (C0483.f2088 < 0) {
                        int iM25613 = C0630.m2566("᩺ۚ") ^ i22;
                        sArr8 = sArr2;
                        iM25611 = i13;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        resources2 = resources;
                        i23 = ((iM25613 ^ i21) * (-533)) ^ (-608525230);
                        i25 = i12;
                        i30 = 50;
                        f2 = f;
                        i24 = iM25613 ^ (-315179478);
                        z = z;
                        f3 = f2;
                    } else {
                        int iM25614 = (C0630.m2566("᩻۫") + i21) * 127;
                        sArr8 = sArr2;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        i23 = ((iM25614 ^ i22) * 9213) ^ (-920874090);
                        int i35 = i13;
                        resources2 = resources;
                        i25 = i12;
                        i30 = i14;
                        iM25611 = i35;
                        float f7 = f;
                        i24 = iM25614 ^ 1782581567;
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
                    C21943.f70303 = C4369.m13089(resources2, C2105.m6981(C3432.m10488(sArr5, i30, 3, i26)) ^ 2101057331, theme);
                    C21943.f70259 = C3432.m10492(theme, R.attr.colorBackground);
                    iM25611 = iM25611;
                    sArr7 = sArr7;
                    colorStateListM48207 = C21238.m48207(theme, C2105.m6981(C4616.m13542(f42564, 53, 3, i26)) ^ 2129726450);
                    iM6982 = (C0630.m2566("ᩴܺ") + i21) * (-61);
                    i8 = ((iM6982 ^ i22) * (-26683)) ^ (-1335034899);
                    i11 = 1581495326;
                    i10 = iM6982 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1967204295:
                case -1516902970:
                    C1504.m5179();
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("ۖۙ") ^ i22;
                        i = ((iM6981 ^ i21) * 25295) ^ 145073235;
                        i2 = 1433749405;
                        i24 = iM6981 ^ i2;
                        i23 = i;
                    } else {
                        f = f3;
                        sArr3 = sArr5;
                        sArr = sArr7;
                        sArr2 = sArr8;
                        int i36 = i30;
                        i12 = i25;
                        resources = resources2;
                        i13 = iM25611;
                        i14 = i36;
                        int iM25615 = (C0630.m2566("᩻۫") + i21) * 127;
                        sArr8 = sArr2;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        i23 = ((iM25615 ^ i22) * 9213) ^ (-920874090);
                        int i37 = i13;
                        resources2 = resources;
                        i25 = i12;
                        i30 = i14;
                        iM25611 = i37;
                        float f8 = f;
                        i24 = iM25615 ^ 1782581567;
                        f3 = f8;
                    }
                    break;
                case -1819586604:
                case -1398341047:
                    f3 = f3;
                    C21943.f70262 = z2;
                    if (C0382.m1839(theme, C2105.m6981(C1773.m5917(f42564, 62, 3, i26)) ^ 2099956021) != 0) {
                        c = c3;
                        iM6983 = (i21 - C2105.m6981("ܽ᩸")) * 25;
                        i15 = ((iM6983 ^ i22) * 18899) ^ 1287518399;
                        i16 = 1364848467;
                        r16 = c;
                    } else {
                        iM6983 = (i22 - C2105.m6981("᩸ۛ")) * 115;
                        i15 = ((iM6983 ^ i21) * (-25285)) ^ 1124649582;
                        i16 = -673072926;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
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
                    iM25611 = iM25611;
                    C21943.f70287 = C3432.m10492(theme, C0630.m2566(C3537.m10748(sArr4, 32, 3, i26)) ^ 2123484790);
                    C21943.f70293 = C4369.m13089(resources2, C2105.m6981(C0964.m3396(f42564, 35, 3, i26)) ^ 2102347118, theme);
                    if (RunnableC1937.f6483 >= 0) {
                        iM6982 = C0630.m2566("۫۟") ^ i21;
                        i8 = ((iM6982 ^ i22) * 11747) ^ 151246965;
                        i11 = 868625256;
                    } else {
                        iM6982 = C2105.m6981("ܶۙ") ^ i21;
                        i8 = ((iM6982 ^ i22) * 4159) ^ (-410690509);
                        i11 = 84150325;
                    }
                    i10 = iM6982 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1738955140:
                case -46263961:
                    f3 = f3;
                    C21943.f70266 = C3432.m10492(theme, iM2569 ^ 2119664218);
                    C21943.f70296 = C3432.m10492(theme, C0630.m2566(C1773.m5917(f42564, 95, 3, i26)) ^ 2101086735);
                    C21943.f70264 = C0382.m1839(theme, C0630.m2566(C0483.m2128(f42564, 98, 3, i26)) ^ 2098945453);
                    if (C4616.f14690 <= 0) {
                        iM6983 = (C0630.m2566("ᩴ۟") + i21) * 43;
                        i15 = ((iM6983 ^ i22) * (-6999)) ^ 1102803667;
                        i16 = -518645398;
                        r16 = z;
                    } else {
                        iM6983 = C2105.m6981("۠ܺ") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-30173)) ^ 925938407;
                        i16 = 339107863;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1693254148:
                case -1539172155:
                    f3 = f3;
                    C21943.f70267 = C3432.m10492(theme, C2105.m6981(C4159.m12578(sArr7, i31, i28, i26)) ^ 2117599970);
                    C21943.f70280 = C0382.m1839(theme, C2105.m6981(C3746.m11357(f42564, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i26)) ^ 2102751820);
                    iM25612 = 2124945441 ^ C0630.m2566(C0422.m1955(f42564, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i26));
                    iM6983 = C2105.m6981("ۤ֨") ^ i22;
                    i15 = ((iM6983 ^ i21) * 4761) ^ (-616922108);
                    i16 = -244356944;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1691739582:
                case 1332163450:
                    f3 = f3;
                    C21943.f70256 = C3432.m10492(theme, iM25611);
                    C21943.f70281 = C3432.m10492(theme, C2105.m6981(C4263.m12817(f42564, 80, 3, i26)) ^ 2102657432);
                    C21943.f70255 = C0382.m1839(theme, C0630.m2566(C1773.m5917(f42564, 83, 3, i26)) ^ 2100853820);
                    sArr6 = f42564;
                    i25 = 86;
                    if (C0630.m2564()) {
                        iM6983 = (C2105.m6981("᩸᩺") ^ i21) * (-21);
                        i15 = ((iM6983 ^ i22) * (-27317)) ^ (-1936141897);
                        i16 = 1279605405;
                        r16 = z;
                    } else {
                        iM6983 = (C0630.m2566("᩸ܿ") ^ i22) * (-97);
                        i15 = ((iM6983 ^ i21) * (-2439)) ^ (-204902997);
                        i16 = -962822803;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1541370791:
                case -1256738376:
                    f3 = f3;
                    C21943.f70300 = C0382.m1839(theme, C0630.m2566(strM11919) ^ 2125463550);
                    C21943.f70279 = C0382.m1839(theme, C2105.m6981(C1005.m3502(f42564, 74, 3, i26)) ^ 2128294552);
                    iM25611 = 2130237093 ^ C0630.m2566(C0964.m3396(f42564, 77, 3, i26));
                    if (C2167.m7155()) {
                        iM6983 = (C0630.m2566("ᩴ۟") + i21) * 43;
                        i15 = ((iM6983 ^ i22) * (-6999)) ^ 1102803667;
                        i16 = -518645398;
                        r16 = z;
                    } else {
                        iM6983 = C0630.m2566("ۧۜ") ^ i21;
                        i15 = ((iM6983 ^ i22) * (-21375)) ^ (-816325591);
                        i16 = -840737744;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1538393221:
                case -672922694:
                    i30 = i30;
                    int i38 = i25;
                    Resources resources4 = resources2;
                    C7466.m20004(C21943.f70257, fArr);
                    fArr[c2] = fArr[c2] * 0.9f;
                    C21943.f70290 = Color.HSVToColor(fArr);
                    C21943.f70283 = C4369.m13089(resources4, C2105.m6981(C0630.m2575(f42564, 23, 3, i26)) ^ 2127538046, theme);
                    colorStateListM48208 = C21238.m48207(theme, R.attr.textColorPrimary);
                    int iM6986 = C2105.m6981("ۖ᩸") ^ i22;
                    i24 = iM6986 ^ (-851210546);
                    i23 = ((iM6986 ^ i21) * 28083) ^ 1345534135;
                    i32 = i32;
                    iM25611 = iM25611;
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
                    iM6983 = (i21 - C2105.m6981("ۢۨ")) * 81;
                    i15 = ((iM6983 ^ i22) * 10733) ^ 415519351;
                    i16 = -652001544;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -1443239055:
                case -1303610676:
                    C21943.f70301 = C21943.f70274;
                    f3 = f3;
                    iM6983 = (i21 - C2105.m6981("ۗ֨")) * 99;
                    i15 = ((iM6983 ^ i22) * (-29557)) ^ (-109476847);
                    i16 = 184850045;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
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
                    iM25611 = iM25611;
                    C21943.f70291 = C4369.m13089(resources2, C0630.m2566(C3537.m10748(f42564, 26, 3, i26)) ^ 2128876146, theme);
                    C21943.f70260 = C3432.m10492(theme, C2105.m6981(C3746.m11357(f42564, 29, 3, i26)) ^ 2099653475);
                    sArr4 = f42564;
                    iM6982 = (C2105.m6981("ܶ᩹") ^ i21) * (-21);
                    i8 = ((iM6982 ^ i22) * (-30123)) ^ (-559674766);
                    i11 = -785231337;
                    i10 = iM6982 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -1390853142:
                case 1749423617:
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("۬ܺ") ^ i22;
                        i = ((iM6981 ^ i21) * (-13097)) ^ (-1597315463);
                        i2 = 1271322840;
                    } else {
                        iM6981 = (i22 - C2105.m6981("۠ܳ")) * (-9);
                        i = ((iM6981 ^ i21) * (-15459)) ^ (-1220224701);
                        i2 = 1015568900;
                    }
                    i24 = iM6981 ^ i2;
                    i23 = i;
                    break;
                case -1324179632:
                case -379410830:
                    f3 = f3;
                    i18 = ~i27;
                    iM6983 = C0630.m2566("᩸֡") ^ i21;
                    i15 = ((iM6983 ^ i22) * 7529) ^ 177771985;
                    i16 = 1608636992;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
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
                    iM25611 = iM25611;
                    C21943.f70263 = C4369.m13089(resources2, C0630.m2566(C1294.m4373(f42564, 38, 3, i26)) ^ 2101501518, theme);
                    C21943.f70288 = C3432.m10492(theme, C2105.m6981(C1294.m4373(f42564, 41, 3, i26)) ^ 2127188144);
                    sArr8 = f42564;
                    iM6982 = C2105.m6981("ۖ֨") ^ i22;
                    i8 = ((iM6982 ^ i21) * (-9913)) ^ (-829667088);
                    i11 = 1850396143;
                    i10 = iM6982 ^ i11;
                    sArr7 = sArr7;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
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
                    C21943.f70286 = Color.HSVToColor(153, fArr);
                    iM2568 = (i21 - C0630.m2566("᩵᩻")) * (-47);
                    i8 = ((iM2568 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM2568 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
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
                    iM25611 = iM25611;
                    i29 = i29;
                    float[] fArr3 = new float[i29];
                    C7466.m20004(C21943.f70257, fArr);
                    C7466.m20004(C21943.f70274, fArr3);
                    f5 = 0.2f;
                    f4 = 0.8f;
                    if (zM49431) {
                        int iM6987 = C2105.m6981("֫ۧ") ^ i21;
                        i23 = ((iM6987 ^ i22) * (-22213)) ^ (-1894364358);
                        fArr2 = fArr3;
                        i24 = iM6987 ^ 925466443;
                    } else {
                        int iM6988 = (i22 - C2105.m6981("۬ܶ")) * (-105);
                        fArr2 = fArr3;
                        i24 = iM6988 ^ 1513457988;
                        i23 = ((iM6988 ^ i21) * (-22535)) ^ (-1716225908);
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
                    iM25611 = iM25611;
                    C21943.f70275 = colorStateListM48208;
                    C21943.f70273 = C21238.m48207(theme, R.attr.textColorSecondary);
                    C21943.f70284 = C21943.f70275.getDefaultColor();
                    C21943.f70269 = C21943.f70273.getDefaultColor();
                    int[] iArr = {-16842910};
                    i32 = i32;
                    C21943.f70304 = C21943.f70275.getColorForState(iArr, i32);
                    C21943.f70299 = C21943.f70273.getColorForState(iArr, i32);
                    if (C1294.f4556 < 0) {
                        int iM25616 = C0630.m2566("᩻᩹") ^ i22;
                        i8 = ((iM25616 ^ i21) * (-9571)) ^ 1631863850;
                        i10 = iM25616 ^ 1665203864;
                        i32 = i32;
                        sArr7 = sArr7;
                        sArr5 = sArr5;
                        f3 = f3;
                        i24 = i10;
                        i23 = i8;
                        iM25611 = iM25611;
                        resources2 = resources2;
                        i25 = i25;
                        i30 = i30;
                    } else {
                        i29 = i29;
                        iM2566 = (i21 - C0630.m2566("ܽ᩶")) * (-115);
                        i3 = ((iM2566 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i310 = iM2566 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM25611 = iM25611;
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
                    C21943.f70282 = C0382.m1839(theme, iM25612);
                    C21943.f70276 = C3432.m10492(theme, C0630.m2566(RunnableC1108.m3789(f42564, 116, 3, i26)) ^ 2127157653);
                    C21943.f70271 = C3432.m10492(theme, C2105.m6981(C0483.m2128(f42564, 119, 3, i26)) ^ 2129678377);
                    if (C21943.f70301 == 0) {
                        iM6983 = (i22 - C2105.m6981("ܳۚ")) * (-21);
                        i15 = ((iM6983 ^ i21) * 3509) ^ (-2009920543);
                        i16 = -709428327;
                        r16 = z;
                    } else {
                        iM6983 = (i21 - C2105.m6981("ۗ֨")) * 99;
                        i15 = ((iM6983 ^ i22) * (-29557)) ^ (-109476847);
                        i16 = 184850045;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -966498302:
                case 69057746:
                    z2 = true;
                    iM6983 = (i21 - C2105.m6981("ۢۨ")) * 81;
                    i15 = ((iM6983 ^ i22) * 10733) ^ 415519351;
                    i16 = -652001544;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -906053336:
                case -424312763:
                    i7 = i32;
                    C21943.f70286 = (C21943.f70257 & i17) | 1207959552;
                    iM2568 = (i21 - C0630.m2566("᩵᩻")) * (-47);
                    i8 = ((iM2568 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM2568 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -888722305:
                case 1673542464:
                    C1047.m3599();
                    if (C3019.f9544 < 0) {
                        f3 = f3;
                        iM6983 = C2105.m6981("֡۟") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-6845)) ^ (-1365754319);
                        i16 = -1871292805;
                        r16 = z;
                        f2 = f3;
                        i24 = iM6983 ^ i16;
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
                        i13 = iM25611;
                        i14 = i311;
                        int iM25617 = (C0630.m2566("᩻۫") + i21) * 127;
                        sArr8 = sArr2;
                        sArr7 = sArr;
                        sArr5 = sArr3;
                        i23 = ((iM25617 ^ i22) * 9213) ^ (-920874090);
                        int i312 = i13;
                        resources2 = resources;
                        i25 = i12;
                        i30 = i14;
                        iM25611 = i312;
                        float f9 = f;
                        i24 = iM25617 ^ 1782581567;
                        f3 = f9;
                    }
                    break;
                case -865140352:
                case 259175065:
                    f3 = f3;
                    C21943.f70268 = colorStateListM48207;
                    C21943.f70298 = C21238.m48207(theme, C0630.m2566(C3663.m11162(f42564, 56, 3, i26)) ^ 2125895428);
                    if (C3432.m10492(theme, C2105.m6981(C1420.m4902(f42564, 59, 3, i26)) ^ 2101971801) != 0) {
                        iM6983 = C0630.m2566("۟۟") ^ i22;
                        i15 = ((iM6983 ^ i21) * 14757) ^ (-1773509532);
                        i16 = 838754769;
                        r16 = z;
                    } else {
                        iM6983 = (C2105.m6981("۠۬") ^ i21) * 31;
                        i15 = ((iM6983 ^ i22) * 15573) ^ 1194136090;
                        i16 = 1861619141;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -624706965:
                case 869520758:
                    f3 = f3;
                    if (C3432.m10492(theme, C2105.m6981(C7811.m20837(f42564, 122, 3, i26)) ^ 2102682527) != 0) {
                        iM6983 = C2105.m6981("ۘ᩺") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-18283)) ^ (-885009433);
                        i16 = 1313624532;
                        r16 = z;
                    } else {
                        iM6983 = (C0630.m2566("᩵ۡ") ^ i21) * 81;
                        i15 = ((iM6983 ^ i22) * 26737) ^ 301454321;
                        i16 = -200225779;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
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
                    iM25611 = iM25611;
                    if (zM49431) {
                        iM2568 = (C2105.m6981("֨۟") ^ i21) * 91;
                        i8 = ((iM2568 ^ i22) * 31533) ^ (-1572242822);
                        i9 = 1060591477;
                    } else {
                        iM2568 = (C0630.m2566("ۤܿ") + i22) * (-113);
                        i8 = ((iM2568 ^ i21) * 1155) ^ 1698637764;
                        i9 = 699714931;
                    }
                    i10 = iM2568 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case -486553309:
                case 1103476333:
                    f3 = f3;
                    if (zM49431) {
                        iM6983 = C2105.m6981("᩹᩺") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-29275)) ^ 72052900;
                        i16 = -1676041549;
                        r16 = z;
                    } else {
                        iM6983 = (C2105.m6981("ܳۙ") + i21) * 55;
                        i15 = ((iM6983 ^ i22) * 30693) ^ (-347203851);
                        i16 = -1772982179;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case -462826910:
                case 1899125745:
                    f3 = f3;
                    c = 0;
                    iM6983 = (i21 - C2105.m6981("ܽ᩸")) * 25;
                    i15 = ((iM6983 ^ i22) * 18899) ^ 1287518399;
                    i16 = 1364848467;
                    r16 = c;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case 64878675:
                case 567655086:
                    f3 = f3;
                    C21943.f70261 = C0382.m1839(theme, C0630.m2566(C4075.m12252(f42564, 101, 3, i26)) ^ 2100041125);
                    C21943.f70302 = C0382.m1839(theme, C0630.m2566(C0237.m1483(f42564, IShizukuService.Stub.TRANSACTION_isHidden, 3, i26)) ^ 2102228898);
                    sArr7 = f42564;
                    i31 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i28 = 3;
                    if (C0422.m1963()) {
                        iM6983 = (i21 - C2105.m6981("᩹ܳ")) * 59;
                        i15 = ((iM6983 ^ i22) * (-20971)) ^ 1443954741;
                        i16 = 1688544451;
                        r16 = z;
                    } else {
                        iM6983 = C2105.m6981("֡۟") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-6845)) ^ (-1365754319);
                        i16 = -1871292805;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case 108640269:
                case 703169219:
                    i26 = 10653;
                    iM2566 = (C0630.m2566("ۤۢ") ^ i22) * 33;
                    i3 = ((iM2566 ^ i21) * 4139) ^ 1716637358;
                    i4 = 1913934428;
                    int i313 = iM2566 ^ i4;
                    i29 = i29;
                    i32 = i32;
                    iM25611 = iM25611;
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
                    C21943.f70295 = i18;
                    break;
                case 552561245:
                case 684619199:
                    f3 = f3;
                    C21943.f70270 = z;
                    C21943.f70301 = C0382.m1839(theme, C0630.m2566(C4117.m12355(f42564, 65, 3, i26)) ^ 2122338677);
                    C21943.f70297 = C0382.m1839(theme, C0630.m2566(C2958.m9031(f42564, 68, 3, i26)) ^ 2129007414);
                    strM11919 = C3911.m11919(f42564, 71, 3, i26);
                    if (C3019.f9544 >= 0) {
                        iM6983 = (C2105.m6981("᩸᩺") ^ i21) * (-21);
                        i15 = ((iM6983 ^ i22) * (-27317)) ^ (-1936141897);
                        i16 = 1279605405;
                        r16 = z;
                    } else {
                        iM6983 = C2105.m6981("᩹ۤ") ^ i22;
                        i15 = ((iM6983 ^ i21) * 24605) ^ (-879583342);
                        i16 = -2131260208;
                        r16 = z;
                    }
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                case 663018228:
                case 710569964:
                    C11340.m28031();
                    if (C4117.m12364() == 0) {
                        f3 = f3;
                        iM6983 = (C0630.m2566("ᩴ۟") + i21) * 43;
                        i15 = ((iM6983 ^ i22) * (-6999)) ^ 1102803667;
                        i16 = -518645398;
                        r16 = z;
                        f2 = f3;
                        i24 = iM6983 ^ i16;
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
                        iM25611 = iM25611;
                        i29 = i29;
                        iM2566 = (i21 - C0630.m2566("ܽ᩶")) * (-115);
                        i3 = ((iM2566 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i314 = iM2566 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM25611 = iM25611;
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
                    if (C2520.f8000 < 0) {
                        f3 = f3;
                        i30 = i30;
                        sArr5 = sArr5;
                        i25 = i25;
                        sArr7 = sArr7;
                        i32 = i32;
                        resources2 = resources2;
                        iM25611 = iM25611;
                        i29 = i29;
                        iM2566 = (i21 - C0630.m2566("ܽ᩶")) * (-115);
                        i3 = ((iM2566 ^ i22) * (-27211)) ^ 1916011878;
                        i4 = 1612713270;
                        int i315 = iM2566 ^ i4;
                        i29 = i29;
                        i32 = i32;
                        iM25611 = iM25611;
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
                        iM6983 = C2105.m6981("֡۟") ^ i22;
                        i15 = ((iM6983 ^ i21) * (-6845)) ^ (-1365754319);
                        i16 = -1871292805;
                        r16 = z;
                        f2 = f3;
                        i24 = iM6983 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    }
                    break;
                case 761477689:
                case 1351919665:
                    f3 = f3;
                    C21943.f70294 = C0382.m1839(theme, C0630.m2566(AbstractC2021.m6573(sArr6, i25, 3, i26)) ^ 2101692937);
                    C21943.f70285 = C3432.m10492(theme, C0630.m2566(RunnableC1108.m3789(f42564, 89, 3, i26)) ^ 2128809237);
                    iM2569 = C0630.m2566(C7106.m19110(f42564, 92, 3, i26));
                    if (RunnableC1937.m6387() == 0) {
                        iM6983 = (C2105.m6981("ۢ۠") + i21) * (-123);
                        i15 = ((iM6983 ^ i22) * 25715) ^ 7805365;
                        i16 = -723420795;
                        r16 = z;
                        f2 = f3;
                        i24 = iM6983 ^ i16;
                        i23 = i15;
                        z = r16;
                        f3 = f2;
                    } else {
                        i30 = i30;
                        sArr5 = sArr5;
                        i25 = i25;
                        sArr7 = sArr7;
                        resources2 = resources2;
                        iM25611 = iM25611;
                        iM6982 = C0630.m2566("۫۟") ^ i21;
                        i8 = ((iM6982 ^ i22) * 11747) ^ 151246965;
                        i11 = 868625256;
                        i10 = iM6982 ^ i11;
                        sArr7 = sArr7;
                        sArr5 = sArr5;
                        f3 = f3;
                        i24 = i10;
                        i23 = i8;
                        iM25611 = iM25611;
                        resources2 = resources2;
                        i25 = i25;
                        i30 = i30;
                    }
                    break;
                case 907905735:
                case 1620483005:
                    C2167.m7155();
                    f = f3;
                    sArr3 = sArr5;
                    sArr = sArr7;
                    sArr2 = sArr8;
                    int i316 = i30;
                    i12 = i25;
                    resources = resources2;
                    i13 = iM25611;
                    i14 = i316;
                    int iM25618 = (C0630.m2566("᩻۫") + i21) * 127;
                    sArr8 = sArr2;
                    sArr7 = sArr;
                    sArr5 = sArr3;
                    i23 = ((iM25618 ^ i22) * 9213) ^ (-920874090);
                    int i317 = i13;
                    resources2 = resources;
                    i25 = i12;
                    i30 = i14;
                    iM25611 = i317;
                    float f10 = f;
                    i24 = iM25618 ^ 1782581567;
                    f3 = f10;
                    break;
                case 925354156:
                case 1812675740:
                    i26 = 38174;
                    iM2566 = (C0630.m2566("ۤۢ") ^ i22) * 33;
                    i3 = ((iM2566 ^ i21) * 4139) ^ 1716637358;
                    i4 = 1913934428;
                    int i318 = iM2566 ^ i4;
                    i29 = i29;
                    i32 = i32;
                    iM25611 = iM25611;
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
                    if (!C1420.m4913()) {
                        iM6981 = C2105.m6981("۬ܺ") ^ i22;
                        i = ((iM6981 ^ i21) * (-13097)) ^ (-1597315463);
                        i2 = 1271322840;
                        i24 = iM6981 ^ i2;
                        i23 = i;
                    } else {
                        f3 = f3;
                        iM6983 = (C2105.m6981("᩸᩺") ^ i21) * (-21);
                        i15 = ((iM6983 ^ i22) * (-27317)) ^ (-1936141897);
                        i16 = 1279605405;
                        r16 = z;
                        f2 = f3;
                        i24 = iM6983 ^ i16;
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
                    iM25611 = iM25611;
                    i29 = i29;
                    short s = f42564[7];
                    if ((s * 30980) - ((s * s) + 239940100) <= 0) {
                        iM2566 = (C2105.m6981("ۢᩳ") ^ i21) * (-97);
                        i3 = ((iM2566 ^ i22) * 19523) ^ 1956444917;
                        i4 = 876870793;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩸") ^ i22;
                        i3 = ((iM2566 ^ i21) * 18809) ^ (-1567432454);
                        i4 = 1508431009;
                    }
                    int i319 = iM2566 ^ i4;
                    i29 = i29;
                    i32 = i32;
                    iM25611 = iM25611;
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
                    C2958.m9034();
                    break;
                case 1642091376:
                case 1759408002:
                    i7 = i32;
                    fArr[i7] = fArr[i7] * 0.9424f;
                    fArr[c3] = fArr[c3] * 1.1285f;
                    fArr[c2] = ((fArr2[c2] * f5) + f4) * fArr[c2];
                    C21943.f70286 = Color.HSVToColor(72, fArr);
                    iM2568 = (i21 - C0630.m2566("᩵᩻")) * (-47);
                    i8 = ((iM2568 ^ i22) * (-3355)) ^ (-1795954309);
                    i9 = -1244270422;
                    i10 = iM2568 ^ i9;
                    i32 = i7;
                    sArr7 = sArr7;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    f3 = f3;
                    i24 = i10;
                    i23 = i8;
                    iM25611 = iM25611;
                    resources2 = resources2;
                    i25 = i25;
                    i30 = i30;
                    break;
                case 2012497324:
                case 2075113877:
                    C7466.m20004(C21943.f70274, fArr);
                    fArr[c2] = fArr[c2] * f3;
                    C21943.f70301 = Color.HSVToColor(fArr);
                    f3 = f3;
                    iM6983 = (i21 - C2105.m6981("ۗ֨")) * 99;
                    i15 = ((iM6983 ^ i22) * (-29557)) ^ (-109476847);
                    i16 = 184850045;
                    r16 = z;
                    f2 = f3;
                    i24 = iM6983 ^ i16;
                    i23 = i15;
                    z = r16;
                    f3 = f2;
                    break;
                default:
                    if (C0382.f1805) {
                        iM6981 = (i22 - C2105.m6981("۠ܳ")) * (-9);
                        i = ((iM6981 ^ i21) * (-15459)) ^ (-1220224701);
                        i2 = 1015568900;
                    } else {
                        iM6981 = C2105.m6981("ۖۙ") ^ i22;
                        i = ((iM6981 ^ i21) * 25295) ^ 145073235;
                        i2 = 1433749405;
                    }
                    i24 = iM6981 ^ i2;
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
    
        if (l.C0483.f2088 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        if (l.C7811.f24123 >= 0) goto L13;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m33705(TextView textView) {
        int iM2566;
        int i;
        short s;
        int iM2567;
        int i2;
        int i3;
        int iM6981;
        int i4;
        TextView textView2 = textView;
        int i5 = C1128.f4106;
        int i6 = C0422.f1886;
        int iM6982 = C2105.m6981("ۢ᩸") ^ i6;
        int i7 = ((iM6982 ^ i5) * 19333) ^ 1262407023;
        String strM10568 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM6982 ^ 842802782;
        int iM6983 = 0;
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
        Context contextM10622 = null;
        String strM2575 = null;
        ColorStateList colorStateList = null;
        int i16 = 0;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-12623)) >> 31));
            switch (i14) {
                case -1896193877:
                case 50681137:
                    strM2575 = C0630.m2575(sArr3, i11, 3, i13);
                    if (C0714.f2697 < 0) {
                        iM6981 = (C0630.m2566("ۧۤ") + i5) * 77;
                        i2 = ((iM6981 ^ i6) * 11591) ^ 722097169;
                        i4 = 1200650083;
                        i8 = iM6981 ^ i4;
                        i7 = i2;
                    } else {
                        iM2566 = (i6 - C0630.m2566("ۖ᩹")) * 9;
                        i7 = ((iM2566 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                        i8 = iM2566 ^ i;
                        textView2 = textView;
                    }
                    break;
                case -1855076324:
                case 1656772585:
                    sArr2 = f42564;
                    i9 = 1;
                    i10 = 3;
                    if (C1294.f4556 < 0) {
                        iM6981 = C0630.m2566("֡ᩳ") ^ i5;
                        i2 = ((iM6981 ^ i6) * 30597) ^ 229389950;
                        i4 = -1092300302;
                        i8 = iM6981 ^ i4;
                        i7 = i2;
                    } else {
                        iM2566 = (i6 - C0630.m2566("ۖ᩹")) * 9;
                        i7 = ((iM2566 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                        i8 = iM2566 ^ i;
                        textView2 = textView;
                    }
                    break;
                case -1584021386:
                case -643576693:
                    if (i15 - (i12 * i12) > 0) {
                        iM6981 = (C0630.m2566("֨۫") + i6) * (-21);
                        i2 = ((iM6981 ^ i5) * 26405) ^ (-932661831);
                        i4 = -1240805460;
                    } else {
                        iM6981 = C2105.m6981("ܺ۫") ^ i5;
                        i2 = ((iM6981 ^ i6) * (-25243)) ^ (-999107535);
                        i4 = -1503208306;
                    }
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case -1360904777:
                case 987738526:
                    i13 = 33630;
                    iM6981 = (C0630.m2566("ܳ۟") ^ i5) * 51;
                    i2 = ((iM6981 ^ i6) * 6689) ^ 242987864;
                    i4 = 588591632;
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case -1335635675:
                case -513278190:
                    textView2.setBackgroundResource(iM6983 ^ i16);
                    colorStateList = null;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ۖ᩻") ^ i5) * (-11);
                        i2 = ((iM6981 ^ i6) * 11629) ^ 1789548949;
                        i4 = -1259578848;
                    } else {
                        iM6981 = (C0630.m2566("ۧ᩸") + i5) * (-73);
                        i2 = ((iM6981 ^ i6) * (-24151)) ^ (-794322466);
                        i4 = 1190715995;
                    }
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case -1256040699:
                case -638815724:
                    iM6983 = C2105.m6981(strM10568);
                    i16 = 2126825137;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C0630.m2566("ۜۡ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 11563) ^ 1194231856;
                        i4 = -771432977;
                    } else {
                        iM6981 = C2105.m6981("ܳ᩸") ^ i6;
                        i2 = ((iM6981 ^ i5) * 11699) ^ 1936277683;
                        i4 = -1467454591;
                    }
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case -1235214648:
                case -537956591:
                    strM10568 = ServiceConnectionC3453.m10568(sArr2, i9, i10, i13);
                    if (C1420.m4913()) {
                        iM6981 = (C2105.m6981("ۖ᩻") ^ i5) * (-11);
                        i2 = ((iM6981 ^ i6) * 11629) ^ 1789548949;
                        i4 = -1259578848;
                    } else {
                        iM6981 = C2105.m6981("ۘ֫") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-12525)) ^ (-1208448001);
                        i4 = -1379283497;
                    }
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case -1233743693:
                case -932662590:
                    textView2.setTextColor(C0881.m3233(contextM10622, C0630.m2566(strM2575) ^ 2097965792));
                    break;
                case -1222027095:
                case 1533283581:
                    contextM10622 = RunnableC3474.m10622(textView);
                    sArr3 = f42564;
                    i11 = 4;
                    if (C1420.f5096 <= 0) {
                        iM6981 = C0630.m2566("ۜۡ") ^ i6;
                        i2 = ((iM6981 ^ i5) * 11563) ^ 1194231856;
                        i4 = -771432977;
                    } else {
                        iM6981 = C0630.m2566("ۚ᩶") ^ i5;
                        i2 = ((iM6981 ^ i6) * 2159) ^ 272913025;
                        i4 = -2038527553;
                    }
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case -890288789:
                case -335425377:
                    C3683.m11222();
                    s = s2;
                    iM2567 = (C0630.m2566("ۜܺ") ^ i6) * 87;
                    i2 = ((iM2567 ^ i5) * (-8675)) ^ 1250007833;
                    i3 = 522478688;
                    i8 = iM2567 ^ i3;
                    textView2 = textView;
                    s2 = s;
                    i7 = i2;
                    break;
                case -708669779:
                case 1731499945:
                    C3746.m11369();
                    break;
                case -290030231:
                case 331791490:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (i6 - C0630.m2566("ۖ᩹")) * 9;
                        i7 = ((iM2566 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                        i8 = iM2566 ^ i;
                        textView2 = textView;
                    } else {
                        iM6981 = (C2105.m6981("ۖ᩻") ^ i5) * (-11);
                        i2 = ((iM6981 ^ i6) * 11629) ^ 1789548949;
                        i4 = -1259578848;
                        i8 = iM6981 ^ i4;
                        i7 = i2;
                    }
                    break;
                case -150761239:
                case 988072908:
                    C0382.m1848();
                    break;
                case -5711690:
                case 378572639:
                    s2 = sArr[c];
                    s3 = 28760;
                    if (C2520.m8026()) {
                        iM2566 = (i6 - C0630.m2566("ۖ᩹")) * 9;
                        i7 = ((iM2566 ^ i5) * (-5241)) ^ 1096090575;
                        i = -623365566;
                    } else {
                        iM2566 = (i6 - C0630.m2566("ܿۧ")) * 127;
                        i7 = ((iM2566 ^ i5) * (-2021)) ^ 1178603621;
                        i = -1550060625;
                    }
                    i8 = iM2566 ^ i;
                    textView2 = textView;
                    break;
                case -2583896:
                case 206167320:
                    i15 = s2 * s3;
                    s = s2;
                    i12 = s + 7190;
                    if (C0798.m2998() == 0) {
                        iM2567 = (C2105.m6981("ۙۨ") + i6) * (-119);
                        i2 = ((iM2567 ^ i5) * (-917)) ^ 600026837;
                        i3 = -1281475781;
                        i8 = iM2567 ^ i3;
                        textView2 = textView;
                        s2 = s;
                        i7 = i2;
                    } else {
                        int iM6984 = (C2105.m6981("᩹ۖ") ^ i5) * (-87);
                        i8 = iM6984 ^ 164422399;
                        s2 = s;
                        i7 = ((iM6984 ^ i6) * (-5055)) ^ (-643166825);
                        textView2 = textView;
                    }
                    break;
                case 45806285:
                case 1118716608:
                    i13 = 60173;
                    iM6981 = (C0630.m2566("ܳ۟") ^ i5) * 51;
                    i2 = ((iM6981 ^ i6) * 6689) ^ 242987864;
                    i4 = 588591632;
                    i8 = iM6981 ^ i4;
                    i7 = i2;
                    break;
                case 379957169:
                case 1834024308:
                    C3663.m11168();
                    break;
                case 550288381:
                case 718768777:
                    s = s2;
                    sArr = f42564;
                    c = 0;
                    if (C5695.m16023() >= 0) {
                        iM2567 = (C0630.m2566("ۜܺ") ^ i6) * 87;
                        i2 = ((iM2567 ^ i5) * (-8675)) ^ 1250007833;
                        i3 = 522478688;
                    } else {
                        iM2567 = (C0630.m2566("֨᩷") ^ i5) * 3;
                        i2 = ((iM2567 ^ i6) * 25151) ^ (-123300859);
                        i3 = -433671517;
                    }
                    i8 = iM2567 ^ i3;
                    textView2 = textView;
                    s2 = s;
                    i7 = i2;
                    break;
                default:
                    textView2.setBackgroundTintList(colorStateList);
                    if (C4117.f13076 > 0) {
                        iM6981 = (C0630.m2566("ۗ᩵") + i6) * 81;
                        i2 = ((iM6981 ^ i5) * (-8599)) ^ 1923701483;
                        i4 = 1435693446;
                        i8 = iM6981 ^ i4;
                        i7 = i2;
                    } else {
                        s = s2;
                        int iM6985 = (C2105.m6981("᩹ۖ") ^ i5) * (-87);
                        i8 = iM6985 ^ 164422399;
                        s2 = s;
                        i7 = ((iM6985 ^ i6) * (-5055)) ^ (-643166825);
                        textView2 = textView;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PorterDuffColorFilter m33704(int i) {
        int i2 = -1880294461;
        int i3 = C3432.f10845;
        int i4 = C0050.f910;
        int iM6981 = C2105.m6981("ۨ᩻") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-4335)) ^ 34383414;
        int i6 = 909896018;
        while (true) {
            i2 = ((((i2 ^ i4) * (-20145)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2094054679:
                case -1769680593:
                    int i7 = C21238.f68453;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ᩴۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-12975)) ^ 2007816862;
                        i6 = 321640224;
                    } else {
                        iM6981 = C0630.m2566("᩸ۜ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-721)) ^ 1611732019;
                        i6 = 1385393248;
                    }
                    break;
                case -2073701312:
                case -1825106021:
                    C3537.m10746();
                    C1294.m4372();
                    return null;
                case -1916492720:
                case -302718649:
                    if (C2958.f9394 >= 0) {
                        iM6981 = (i3 - C2105.m6981("֨᩹")) * (-49);
                        i5 = ((iM6981 ^ i4) * (-23325)) ^ 1220267139;
                        i6 = 614514441;
                    } else {
                        iM6981 = C0630.m2566("ۙ֨") ^ i3;
                        i5 = ((iM6981 ^ i4) * 1683) ^ 124685473;
                        i6 = -366691002;
                    }
                    break;
                case -1865835906:
                case 813901573:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C2105.m6981("֡᩺") ^ i3;
                        i5 = ((iM6981 ^ i4) * 27691) ^ (-421083677);
                        i6 = -1445130944;
                    } else {
                        iM6981 = (C2105.m6981("᩷۟") + i3) * 115;
                        i5 = ((iM6981 ^ i4) * 28661) ^ (-618278394);
                        i6 = -589145369;
                    }
                    break;
                case -1372239281:
                case -1100381899:
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ܳ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM6981 = C0630.m2566("ܺܳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 71) ^ (-1399365126);
                        i6 = -767236103;
                    }
                    break;
                case -1294683988:
                case 482975377:
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("ܳ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM6981 = C2105.m6981("۬ۖ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-32381)) ^ (-1901454016);
                        i6 = 829510146;
                    }
                    break;
                case -1245401293:
                case -357035205:
                    if (C5695.f17556 >= 0) {
                        iM6981 = C0630.m2566("ܳ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM6981 = (C2105.m6981("ܰۜ") ^ i3) * (-31);
                        i5 = ((iM6981 ^ i4) * (-2659)) ^ (-1098944760);
                        i6 = -2102037382;
                    }
                    break;
                case -1148942876:
                case 1733319656:
                    if (C1005.m3501()) {
                        iM6981 = (C2105.m6981("ۘ᩵") + i4) * 81;
                        i5 = ((iM6981 ^ i3) * (-25651)) ^ (-803669432);
                        i6 = 439474003;
                    } else {
                        iM6981 = C2105.m6981("֡᩺") ^ i3;
                        i5 = ((iM6981 ^ i4) * 27691) ^ (-421083677);
                        i6 = -1445130944;
                    }
                    break;
                case -1144723351:
                case 992585119:
                    if (C1294.f4556 < 0) {
                        return new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                    }
                    iM6981 = C2105.m6981("ᩴۧ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-12975)) ^ 2007816862;
                    i6 = 321640224;
                    break;
                case -1126812899:
                case -352588834:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C2105.m6981("۬ۖ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-32381)) ^ (-1901454016);
                        i6 = 829510146;
                    } else {
                        iM6981 = (i4 - C2105.m6981("֨۬")) * (-57);
                        i5 = ((iM6981 ^ i3) * (-23981)) ^ (-1510608948);
                        i6 = 1385295414;
                    }
                    break;
                case -1006488464:
                case 2083015416:
                    RunnableC3474.m10630();
                    C2520.m8026();
                    iM6981 = C2105.m6981("۬ۖ") ^ i3;
                    i5 = ((iM6981 ^ i4) * (-32381)) ^ (-1901454016);
                    i6 = 829510146;
                    break;
                case -275910504:
                case 1518965654:
                    if (!C1005.f3721) {
                        iM6981 = C2105.m6981("۬ۖ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-32381)) ^ (-1901454016);
                        i6 = 829510146;
                    } else {
                        iM6981 = (i3 - C2105.m6981("֨᩹")) * (-49);
                        i5 = ((iM6981 ^ i4) * (-23325)) ^ 1220267139;
                        i6 = 614514441;
                    }
                    break;
                case 585455172:
                case 1596997505:
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ܳ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM6981 = (C0630.m2566("ۤۧ") ^ i4) * (-121);
                        i5 = ((iM6981 ^ i3) * (-9499)) ^ 641878886;
                        i6 = -1366372889;
                    }
                    break;
                case 1403292965:
                case 1944162640:
                    if (!AbstractC2021.m6574()) {
                        iM6981 = C2105.m6981("֡᩺") ^ i3;
                        i5 = ((iM6981 ^ i4) * 27691) ^ (-421083677);
                        i6 = -1445130944;
                    } else {
                        iM6981 = C0630.m2566("ܳ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    }
                    break;
                default:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("ܳ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30311)) ^ (-1062348210);
                        i6 = 950521326;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۖ֨")) * 89;
                        i5 = ((iM6981 ^ i3) * 25171) ^ 1690513912;
                        i6 = 1071669391;
                    }
                    break;
            }
        }
    }
}
