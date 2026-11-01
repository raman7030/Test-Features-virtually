package p067l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.function.Consumer;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C4654 {

    /* JADX INFO: renamed from: ֫ */
    public static C22876 f10454;

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f10455;

    /* JADX INFO: renamed from: ۫֨֡, reason: not valid java name and contains not printable characters */
    private static final short[] f81901;

    /* JADX INFO: renamed from: ܽ */
    public static final String[] f10456;

    /* JADX INFO: renamed from: ܿ */
    public static Integer f10457;

    /* JADX INFO: renamed from: ᩳ */
    public static long f10458;

    /* JADX INFO: renamed from: ֫ */
    public static native C11233 m9841(int i, InterfaceC10689 interfaceC10689);

    /* JADX INFO: renamed from: ֫ */
    public static native C18379 m9842(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9);

    /* JADX INFO: renamed from: ֫ */
    public static native C18379 m9843(byte[] bArr, byte[] bArr2, String str, String str2, String str3);

    /* JADX INFO: renamed from: ֫ */
    public static native C19721 m9844(String str, byte[] bArr, int i);

    /* JADX INFO: renamed from: ֫ */
    public static native C25065 m9845();

    /* JADX INFO: renamed from: ֫ */
    public static native C25065 m9846(String str);

    /* JADX INFO: renamed from: ֫ */
    public static native C25065 m9848(byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public static native void m9867(C25065 c25065);

    /* JADX INFO: renamed from: ֫ */
    public static native boolean m9871(Consumer consumer);

    /* JADX INFO: renamed from: ֫ */
    public static native boolean m9872(C17393 c17393);

    /* JADX INFO: renamed from: ֫ */
    public static native int[] m9874(Context context, String str);

    /* JADX INFO: renamed from: ۧ */
    public static native void m9878();

    /* JADX INFO: renamed from: ۧ */
    public static native boolean m9881(C17393 c17393);

    /* JADX INFO: renamed from: ۧ */
    public static native InterfaceC4527[] m9882(int i, InterfaceC10689 interfaceC10689);

    /* JADX INFO: renamed from: ܳ */
    public static native boolean m9883();

    /* JADX INFO: renamed from: ܽ */
    public static native byte[] m9885();

    /* JADX INFO: renamed from: ܿ */
    public static native void m9886();

    /* JADX INFO: renamed from: ᩳ */
    public static native byte[] m9887();

    /* JADX INFO: renamed from: ᩻ */
    public static native boolean m9889();

    /* JADX INFO: renamed from: ֫ */
    public static int[] m9873(Application application) {
        return m9874(application, AbstractC0942.m55964());
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m9888() {
        m9871((Consumer) null);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x034d A[PHI: r3 r4 r6 r14 r15 r16 r17 r18 r21 r22 r23 r24 r34
      0x034d: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String), (r3v1 java.lang.String) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v1 java.lang.String), (r4v1 java.lang.String) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r6v41 int) = (r6v17 int), (r6v18 int), (r19v2 int) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r14v62 short[]) = (r14v20 short[]), (r14v21 short[]), (r17v2 short[]) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r15v49 int) = (r15v17 int), (r15v18 int), (r18v2 int) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r16v14 short[]) = (r16v12 short[]), (r16v4 short[]), (r16v4 short[]) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r17v29 int) = (r17v17 int), (r17v18 int), (r17v30 int) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r18v32 java.lang.String) = (r18v20 java.lang.String), (r18v21 java.lang.String), (r18v33 java.lang.String) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r21v4 short) = (r21v1 short), (r21v1 short), (r21v5 short) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r22v3 int) = (r22v1 int), (r22v1 int), (r22v4 int) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r23v4 short) = (r23v1 short), (r23v1 short), (r23v5 short) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r24v42 int) = (r24v12 int), (r24v13 int), (r24v43 int) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r34v6 int) = (r34v4 int), (r34v1 int), (r34v1 int) binds: [B:62:0x034b, B:58:0x0314, B:39:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x03dd A[PHI: r6 r14 r15 r17 r18 r19 r24 r25
      0x03dd: PHI (r6v15 int) = (r6v14 int), (r6v16 int) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r14v18 short[]) = (r14v17 short[]), (r14v19 short[]) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r15v15 int) = (r15v14 int), (r15v16 int) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r17v15 int) = (r17v14 int), (r17v16 int) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r18v18 java.lang.String) = (r18v17 java.lang.String), (r18v19 java.lang.String) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r19v16 java.lang.String) = (r19v15 java.lang.String), (r19v17 java.lang.String) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r24v10 int) = (r24v9 int), (r24v11 int) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]
      0x03dd: PHI (r25v2 java.lang.String) = (r25v1 java.lang.String), (r25v3 java.lang.String) binds: [B:72:0x03c8, B:68:0x03a2] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        short[] sArr;
        int i;
        String str;
        String str2;
        short[] sArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str3;
        int iM55680;
        int i7;
        int i8;
        int iM55681;
        int i9;
        short[] sArr3;
        int i10;
        int i11;
        int i12;
        String strM55986;
        int iM55682;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM55683;
        int i17;
        ApplicationC14266.m56479(40);
        f81901 = new short[]{1402, -28526, -28496, -28499, -28511, -28485, -28499, -28500, -28543, -28540, -28528, -28536, -28509, -28506, -28486, -28536, -28509, -28506, -28486, -28446, -28438, -28527, -28501, -28497, -28494, -28498, -28505, -28437, -28536, -28509, -28506, -28486, -28446, -28438, -28540, -28509, -28498, -28498, -28512, -28509, -28511, -28503, -28437, -28540, -28505, -28496, -28500, -28540, -28498, -28499, -28491, -28505, -28496, -28524, -28501, -28500, -28505, -28540, -28498, -28499, -28491, -28505, -28496, -28536, -28538, -28433, -28543, -28499, -28496, -28505, 4379, 30995, 31030, 31011, 31030, 31095, 31032, 31010, 31011, 31095, 31032, 31025, 31095, 31013, 31030, 31033, 31024, 31026, 31095, 31103, 30978, 30980, 31039, 31032, 31013, 31011, 31102, 31085, 31095, 2595, -9203, -9094, -9113, -9117, -9109, -9203, 6992, 31554, 31553, 31561, 31559, 31552, 31567, 31565, 31557, 31580, 31553, 31578, 31567, 31578, 31563, 7628, 22417, 22458, 22417, 22430, 22455, 22476, 22483, 22420, 22406, 22480, 22483, 22465, 6361, -27187, -27184, -27189, -27170, -27189, -27174, 5740, 12881, 12883, 12892, 12883, 12864, 12875, 4686, 16205, 16207, 16192, 16207, 16220, 16215, 177, -807, -814, -811, -810, -817, -875, -808, -808, 1791, 15021, 15023, 15008, 15023, 15036, 15031, 7383, -8563, -8561, -8576, -8561, -8548, -8553, 330, 30129, 30138, 30141, 30142, 30119, 30205, 30128, 30128, 7968, 24894, 24857, 24833, 24854, 24859, 24862, 24851, 24919, 24858, 24834, 24859, 24835, 24862, 24922, 24859, 24856, 24848, 24862, 24857, 24919, 24859, 24862, 24858, 24862, 24835, 24884, 24854, 24857, 24857, 24856, 24835, 24919, 24836, 24854, 24833, 24850, 24919, 24836, 24862, 24848, 24857, 24850, 24851, 24919, 24834, 24836, 24850, 24837, 24919, 24839, 24837, 24856, 24849, 24862, 24859, 24850, 8591, -8683, -8688, -8699, -8688, -8654, -8688, -8673, -8673, -8674, -8699, -8623, -8701, -8684, -8676, -8674, -8697, -8684, -8623, -8680, -8673, -8697, -8688, -8675, -8680, -8683, -8623, -8675, -8674, -8686, -8688, -8675, -8623, -8703, -8701, -8674, -8681, -8680, -8675, -8684, -8609, -8673, -8684, -8698, 228, 28136, 28141, 28152, 28141, 595, -26701, 17399, 18092, 816, 24023, 24018, 24007, 24018, 9824, -14689, -5483, -14393, -26390, -26370, -26380, 4058, -6951, -2043, 1709, 21520, 20431, -23100, 3732, 28432, 28428, 28417};
        String str4 = null;
        String strM56180 = null;
        String strM56462 = null;
        String strM55783 = null;
        String strM56077 = null;
        int i18 = 0;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i19 = 287062972;
        int i20 = C0930.f81879;
        int i21 = C1124.f82007;
        int iM55684 = (C0873.m55680("ۗۖ") ^ i21) * (-51);
        int i22 = ((iM55684 ^ i20) * (-14421)) ^ 1668213899;
        int i23 = iM55684 ^ (-1135292448);
        short s = 0;
        int i24 = 0;
        short s2 = 0;
        String strM55792 = null;
        String str5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i19 = ((((i19 ^ i20) * 10613) >> 31) & i22) ^ i23;
            switch (i19) {
                case -2045520662:
                case 294323077:
                    i18 = i18;
                    sArr6 = sArr6;
                    i28 = i28;
                    i29 = i29;
                    i6 = i25;
                    str3 = str4;
                    strM56180 = strM56180;
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("۫᩹") ^ i20;
                        i7 = ((iM55680 ^ i21) * 11361) ^ (-244744149);
                        i8 = 996559521;
                    } else {
                        iM55680 = (i21 - C0873.m55680("ᩴۢ")) * 97;
                        i7 = ((iM55680 ^ i20) * (-9247)) ^ 1732598930;
                        i8 = 426228611;
                    }
                    i16 = iM55680 ^ i8;
                    strM56180 = strM56180;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr8 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr8;
                    int i31 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i31;
                    break;
                case -1966256251:
                case -1854771671:
                    i18 = i18;
                    sArr6 = sArr6;
                    i28 = i28;
                    i29 = i29;
                    i6 = i25;
                    str3 = str4;
                    strM56180 = strM56180;
                    strM55792 = C0898.m55792(f81901, 1, 7, i27);
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("֨ۘ") ^ i20;
                        i7 = ((iM55680 ^ i21) * 83) ^ (-1276944683);
                        i8 = -585902776;
                    } else {
                        iM55680 = (i21 - C0873.m55680("ᩴۢ")) * 97;
                        i7 = ((iM55680 ^ i20) * (-9247)) ^ 1732598930;
                        i8 = 426228611;
                    }
                    i16 = iM55680 ^ i8;
                    strM56180 = strM56180;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr9 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr9;
                    int i32 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i32;
                    break;
                case -1830053926:
                case -532049606:
                    i18 = i18;
                    sArr6 = sArr6;
                    i28 = i28;
                    i29 = i29;
                    i6 = i25;
                    str3 = str4;
                    strM55783 = RunnableC0897.m55783(f81901, 43, 10, i27);
                    sArr7 = f81901;
                    i30 = 53;
                    if (C1046.m56302() != 0) {
                        iM55681 = C0873.m55680("۬ۤ") ^ i20;
                        i7 = ((iM55681 ^ i21) * (-10887)) ^ (-1280083714);
                        i9 = 1060552459;
                    } else {
                        iM55681 = C0873.m55680("᩻ۙ") ^ i21;
                        i7 = ((iM55681 ^ i20) * (-4141)) ^ 1571215274;
                        i9 = 1314120865;
                    }
                    i16 = iM55681 ^ i9;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr10 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr10;
                    int i33 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i33;
                    break;
                case -1699017763:
                case -832265327:
                    i18 = i18;
                    sArr6 = sArr6;
                    i28 = i28;
                    i29 = i29;
                    i6 = i25;
                    str3 = str4;
                    strM56462 = C1404.m56462(f81901, 28, 15, i27);
                    if (C0845.f81821 >= 0) {
                        iM55681 = C0873.m55680("۬ۤ") ^ i20;
                        i7 = ((iM55681 ^ i21) * (-10887)) ^ (-1280083714);
                        i9 = 1060552459;
                    } else {
                        iM55681 = (C0946.m55979("֡ۢ") ^ i21) * (-91);
                        i7 = ((iM55681 ^ i20) * 3761) ^ (-2036102056);
                        i9 = 1071014420;
                    }
                    i16 = iM55681 ^ i9;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr11 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr11;
                    int i34 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i34;
                    break;
                case -1512959339:
                case 681245321:
                    i18 = i18;
                    sArr3 = sArr6;
                    i10 = i28;
                    i11 = i29;
                    i12 = i25;
                    strM55986 = C0946.m55986(sArr3, i10, i11, i27);
                    strM56180 = RunnableC1014.m56180(f81901, 15, 13, i27);
                    if (C1124.m56367() >= 0) {
                        str4 = strM55986;
                        iM55682 = C0946.m55979("۠ܽ") ^ i21;
                        strM55986 = str4;
                        i13 = ((iM55682 ^ i20) * (-5709)) ^ 1406004241;
                        i14 = 1473321171;
                    } else {
                        iM55682 = C0873.m55680("᩷֨") ^ i20;
                        i13 = ((iM55682 ^ i21) * 25735) ^ (-2062593636);
                        i14 = -522520458;
                    }
                    String str6 = strM55986;
                    int i35 = i13;
                    str4 = str6;
                    int i36 = iM55682 ^ i14;
                    i29 = i11;
                    i18 = i18;
                    short[] sArr12 = sArr3;
                    i23 = i36;
                    i25 = i12;
                    sArr6 = sArr12;
                    i28 = i10;
                    i22 = i35;
                    break;
                case -1435876272:
                case 275143446:
                    i15 = 1118;
                    int iM55979 = C0946.m55979("᩶ۛ") ^ i21;
                    i28 = i28;
                    str3 = str4;
                    i7 = ((iM55979 ^ i20) * (-15879)) ^ 1076793288;
                    sArr6 = sArr6;
                    i6 = i25;
                    i16 = iM55979 ^ 1744393463;
                    i27 = i15;
                    i29 = i29;
                    strM56180 = strM56180;
                    strM56180 = strM56180;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr13 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr13;
                    int i37 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i37;
                    break;
                case -1399727108:
                case -1159273255:
                    i18 = i18;
                    C1046.m56302();
                    C1028.m56247();
                    sArr = sArr6;
                    i3 = i28;
                    i = i29;
                    str = str4;
                    str2 = strM56180;
                    sArr2 = sArr7;
                    i2 = i30;
                    int iM55685 = C0873.m55680("ۢܽ") ^ i21;
                    int i38 = i25;
                    int i39 = ((iM55685 ^ i20) * 19523) ^ 464563727;
                    int i40 = iM55685 ^ 372885549;
                    i22 = i39;
                    i25 = i38;
                    i4 = i;
                    i5 = i3;
                    sArr6 = sArr;
                    i23 = i40;
                    i30 = i2;
                    str4 = str;
                    i28 = i5;
                    i18 = i18;
                    int i41 = i4;
                    sArr7 = sArr2;
                    strM56180 = str2;
                    i29 = i41;
                    break;
                case -1286945600:
                case -82955039:
                    C1012.m56134();
                    C0877.m55696();
                    throw new RuntimeException();
                case -1188232569:
                case -103917750:
                    i18 = i18;
                    C0894.m55769();
                    if (C1036.f81953 < 0) {
                        sArr6 = sArr6;
                        i28 = i28;
                        i29 = i29;
                        i6 = i25;
                        str3 = str4;
                        strM56180 = strM56180;
                        iM55680 = C0873.m55680("۫᩹") ^ i20;
                        i7 = ((iM55680 ^ i21) * 11361) ^ (-244744149);
                        i8 = 996559521;
                        i16 = iM55680 ^ i8;
                        strM56180 = strM56180;
                        i29 = i29;
                        i18 = i18;
                        short[] sArr14 = sArr6;
                        i23 = i16;
                        i25 = i6;
                        sArr6 = sArr14;
                        int i310 = i28;
                        i22 = i7;
                        str4 = str3;
                        i28 = i310;
                    } else {
                        sArr3 = sArr6;
                        i10 = i28;
                        i11 = i29;
                        i12 = i25;
                        iM55682 = C0946.m55979("۠ܽ") ^ i21;
                        strM55986 = str4;
                        i13 = ((iM55682 ^ i20) * (-5709)) ^ 1406004241;
                        i14 = 1473321171;
                        String str7 = strM55986;
                        int i311 = i13;
                        str4 = str7;
                        int i312 = iM55682 ^ i14;
                        i29 = i11;
                        i18 = i18;
                        short[] sArr15 = sArr3;
                        i23 = i312;
                        i25 = i12;
                        sArr6 = sArr15;
                        i28 = i10;
                        i22 = i311;
                    }
                    break;
                case -975001889:
                case 1614209308:
                    f10456 = new String[]{str4, strM56180, strM56462, strM55783, strM56077, C1028.m56235(sArr5, i25, 7, i27), strM55792, str5};
                    if (C0906.f81862 >= 0) {
                        i18 = 8;
                        i6 = i25;
                        str3 = str4;
                        iM55681 = C0873.m55680("۬ۤ") ^ i20;
                        i7 = ((iM55681 ^ i21) * (-10887)) ^ (-1280083714);
                        i9 = 1060552459;
                    } else {
                        int iM55686 = C0873.m55680("ۙۡ") ^ i20;
                        int i42 = ((iM55686 ^ i21) * 18683) ^ 814512592;
                        i29 = i29;
                        i9 = 1468796724;
                        i18 = 8;
                        short[] sArr16 = sArr6;
                        i6 = i25;
                        iM55681 = iM55686;
                        sArr6 = sArr16;
                        int i43 = i28;
                        str3 = str4;
                        i7 = i42;
                        i28 = i43;
                    }
                    i16 = iM55681 ^ i9;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr17 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr17;
                    int i313 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i313;
                    break;
                case -889041707:
                case -766709732:
                    i15 = 37058;
                    int iM559710 = C0946.m55979("᩶ۛ") ^ i21;
                    i28 = i28;
                    str3 = str4;
                    i7 = ((iM559710 ^ i20) * (-15879)) ^ 1076793288;
                    sArr6 = sArr6;
                    i6 = i25;
                    i16 = iM559710 ^ 1744393463;
                    i27 = i15;
                    i29 = i29;
                    strM56180 = strM56180;
                    strM56180 = strM56180;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr18 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr18;
                    int i314 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i314;
                    break;
                case -665626137:
                case 1993349490:
                    String strM56189 = C1017.m56189(sArr4, i26, 3, i27);
                    short[] sArr19 = f81901;
                    i3 = 11;
                    if (C1046.f81962 <= 0) {
                        str = str4;
                        str2 = strM56180;
                        i18 = i18;
                        str5 = strM56189;
                        sArr = sArr19;
                        sArr2 = sArr7;
                        i2 = i30;
                        i = 4;
                        int iM55687 = C0873.m55680("ۢܽ") ^ i21;
                        int i315 = i25;
                        int i316 = ((iM55687 ^ i20) * 19523) ^ 464563727;
                        int i44 = iM55687 ^ 372885549;
                        i22 = i316;
                        i25 = i315;
                        i4 = i;
                        i5 = i3;
                        sArr6 = sArr;
                        i23 = i44;
                    } else {
                        int iM559711 = (C0946.m55979("ۗ᩻") ^ i21) * 99;
                        i18 = i18;
                        int i45 = ((iM559711 ^ i20) * (-27161)) ^ (-223011531);
                        str2 = strM56180;
                        str5 = strM56189;
                        sArr6 = sArr19;
                        sArr2 = sArr7;
                        i23 = iM559711 ^ (-1811021552);
                        i4 = 4;
                        str = str4;
                        i22 = i45;
                        i2 = i30;
                        i5 = 11;
                    }
                    i30 = i2;
                    str4 = str;
                    i28 = i5;
                    i18 = i18;
                    int i46 = i4;
                    sArr7 = sArr2;
                    strM56180 = str2;
                    i29 = i46;
                    break;
                case -206699890:
                case 641931352:
                    sArr4 = f81901;
                    i26 = 8;
                    if (!C0861.f81831) {
                        i18 = i18;
                        sArr6 = sArr6;
                        i28 = i28;
                        i29 = i29;
                        i6 = i25;
                        str3 = str4;
                        strM56180 = strM56180;
                        iM55680 = C0873.m55680("۫᩹") ^ i20;
                        i7 = ((iM55680 ^ i21) * 11361) ^ (-244744149);
                        i8 = 996559521;
                        i16 = iM55680 ^ i8;
                        strM56180 = strM56180;
                        i29 = i29;
                        i18 = i18;
                        short[] sArr110 = sArr6;
                        i23 = i16;
                        i25 = i6;
                        sArr6 = sArr110;
                        int i317 = i28;
                        i22 = i7;
                        str4 = str3;
                        i28 = i317;
                    } else {
                        iM55683 = C0873.m55680("᩺۫") ^ i20;
                        i17 = ((iM55683 ^ i21) * (-18393)) ^ (-1323411227);
                        i8 = 1483621173;
                        short[] sArr20 = sArr6;
                        i6 = i25;
                        iM55680 = iM55683;
                        sArr6 = sArr20;
                        int i47 = i28;
                        str3 = str4;
                        i7 = i17;
                        i28 = i47;
                        i16 = iM55680 ^ i8;
                        strM56180 = strM56180;
                        i29 = i29;
                        i18 = i18;
                        short[] sArr111 = sArr6;
                        i23 = i16;
                        i25 = i6;
                        sArr6 = sArr111;
                        int i318 = i28;
                        i22 = i7;
                        str4 = str3;
                        i28 = i318;
                    }
                    break;
                case -35536791:
                case 2033300970:
                    int[] iArr = new int[i18];
                    // fill-array-data instruction
                    iArr[0] = 0;
                    iArr[1] = 6;
                    iArr[2] = 5;
                    iArr[3] = 1;
                    iArr[4] = 7;
                    iArr[5] = 2;
                    iArr[6] = 3;
                    iArr[7] = 4;
                    f10455 = iArr;
                    f10458 = 0L;
                    return;
                case 12504620:
                case 274789111:
                    int i48 = (s2 * s2) + 299497636;
                    if ((i48 + i48) - i24 >= 0) {
                        iM55683 = (C0946.m55979("ۧۤ") ^ i21) * (-89);
                        i17 = ((iM55683 ^ i20) * 5093) ^ 662639481;
                        i8 = 1439024154;
                    } else {
                        iM55683 = (C0946.m55979("ܳۛ") + i20) * 15;
                        i17 = ((iM55683 ^ i21) * 28569) ^ (-109921941);
                        i8 = 390886322;
                    }
                    short[] sArr21 = sArr6;
                    i6 = i25;
                    iM55680 = iM55683;
                    sArr6 = sArr21;
                    int i49 = i28;
                    str3 = str4;
                    i7 = i17;
                    i28 = i49;
                    i16 = iM55680 ^ i8;
                    strM56180 = strM56180;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr112 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr112;
                    int i319 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i319;
                    break;
                case 26073352:
                case 2004276873:
                    s2 = f81901[0];
                    s = 17306;
                    if (C0866.f81837 < 0) {
                        iM55683 = (C0946.m55979("᩺᩶") + i21) * 49;
                        i17 = ((iM55683 ^ i20) * (-22291)) ^ 985173673;
                        i8 = 745782316;
                        short[] sArr22 = sArr6;
                        i6 = i25;
                        iM55680 = iM55683;
                        sArr6 = sArr22;
                        int i410 = i28;
                        str3 = str4;
                        i7 = i17;
                        i28 = i410;
                        i16 = iM55680 ^ i8;
                        strM56180 = strM56180;
                        i29 = i29;
                        i18 = i18;
                        short[] sArr113 = sArr6;
                        i23 = i16;
                        i25 = i6;
                        sArr6 = sArr113;
                        int i3110 = i28;
                        i22 = i7;
                        str4 = str3;
                        i28 = i3110;
                    }
                    i18 = i18;
                    i6 = i25;
                    str3 = str4;
                    iM55681 = C0873.m55680("۬ۤ") ^ i20;
                    i7 = ((iM55681 ^ i21) * (-10887)) ^ (-1280083714);
                    i9 = 1060552459;
                    i16 = iM55681 ^ i9;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr114 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr114;
                    int i3111 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i3111;
                    break;
                case 179607933:
                case 366730169:
                    i18 = i18;
                    if (C1017.m56187() > 0) {
                        sArr3 = sArr6;
                        i10 = i28;
                        i11 = i29;
                        i12 = i25;
                        iM55682 = C0946.m55979("۠ܽ") ^ i21;
                        strM55986 = str4;
                        i13 = ((iM55682 ^ i20) * (-5709)) ^ 1406004241;
                        i14 = 1473321171;
                        String str8 = strM55986;
                        int i3112 = i13;
                        str4 = str8;
                        int i3113 = iM55682 ^ i14;
                        i29 = i11;
                        i18 = i18;
                        short[] sArr115 = sArr3;
                        i23 = i3113;
                        i25 = i12;
                        sArr6 = sArr115;
                        i28 = i10;
                        i22 = i3112;
                    } else {
                        sArr = sArr6;
                        i3 = i28;
                        i = i29;
                        str = str4;
                        str2 = strM56180;
                        sArr2 = sArr7;
                        i2 = i30;
                        int iM55688 = C0873.m55680("ۢܽ") ^ i21;
                        int i3114 = i25;
                        int i3115 = ((iM55688 ^ i20) * 19523) ^ 464563727;
                        int i411 = iM55688 ^ 372885549;
                        i22 = i3115;
                        i25 = i3114;
                        i4 = i;
                        i5 = i3;
                        sArr6 = sArr;
                        i23 = i411;
                        i30 = i2;
                        str4 = str;
                        i28 = i5;
                        i18 = i18;
                        int i412 = i4;
                        sArr7 = sArr2;
                        strM56180 = str2;
                        i29 = i412;
                    }
                    break;
                case 1146939151:
                case 1875072663:
                    int i50 = s2 + s;
                    i24 = i50 * i50;
                    if (C0912.f81867 > 0) {
                        iM55683 = (C0946.m55979("᩵ܰ") ^ i20) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i17 = ((iM55683 ^ i21) * 7855) ^ (-170913779);
                        i8 = -1564948367;
                        short[] sArr23 = sArr6;
                        i6 = i25;
                        iM55680 = iM55683;
                        sArr6 = sArr23;
                        int i413 = i28;
                        str3 = str4;
                        i7 = i17;
                        i28 = i413;
                        i16 = iM55680 ^ i8;
                        strM56180 = strM56180;
                        i29 = i29;
                        i18 = i18;
                        short[] sArr116 = sArr6;
                        i23 = i16;
                        i25 = i6;
                        sArr6 = sArr116;
                        int i3116 = i28;
                        i22 = i7;
                        str4 = str3;
                        i28 = i3116;
                    }
                    i18 = i18;
                    i6 = i25;
                    str3 = str4;
                    iM55681 = C0873.m55680("۬ۤ") ^ i20;
                    i7 = ((iM55681 ^ i21) * (-10887)) ^ (-1280083714);
                    i9 = 1060552459;
                    i16 = iM55681 ^ i9;
                    i29 = i29;
                    i18 = i18;
                    short[] sArr117 = sArr6;
                    i23 = i16;
                    i25 = i6;
                    sArr6 = sArr117;
                    int i3117 = i28;
                    i22 = i7;
                    str4 = str3;
                    i28 = i3117;
                    break;
                default:
                    i18 = i18;
                    sArr = sArr6;
                    int i51 = i28;
                    i = i29;
                    str = str4;
                    str2 = strM56180;
                    sArr2 = sArr7;
                    i2 = i30;
                    strM56077 = C0967.m56077(sArr2, i2, 10, i27);
                    sArr5 = f81901;
                    if (C0845.m55584() <= 0) {
                        i25 = 63;
                        i3 = i51;
                        int iM55689 = C0873.m55680("ۢܽ") ^ i21;
                        int i3118 = i25;
                        int i3119 = ((iM55689 ^ i20) * 19523) ^ 464563727;
                        int i414 = iM55689 ^ 372885549;
                        i22 = i3119;
                        i25 = i3118;
                        i4 = i;
                        i5 = i3;
                        sArr6 = sArr;
                        i23 = i414;
                        i30 = i2;
                        str4 = str;
                        i28 = i5;
                        i18 = i18;
                        int i415 = i4;
                        sArr7 = sArr2;
                        strM56180 = str2;
                        i29 = i415;
                    } else {
                        int iM559712 = (C0946.m55979("ܺܶ") ^ i20) * (-125);
                        int i52 = ((iM559712 ^ i21) * 32187) ^ 340535120;
                        sArr6 = sArr;
                        i30 = i2;
                        i23 = iM559712 ^ 1296289346;
                        sArr7 = sArr2;
                        strM56180 = str2;
                        i25 = 63;
                        i29 = i;
                        i18 = i18;
                        i22 = i52;
                        str4 = str;
                        i28 = i51;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m9870(final long j) {
        return m9871(new Consumer() { // from class: l.ۨ֨ۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                C17393 c17393 = null;
                long j2 = 0;
                long j3 = 0;
                int i = 0;
                int i2 = 0;
                int i3 = -2059755290;
                int i4 = C1036.f81953;
                int i5 = AbstractC0942.f81890;
                int iM55680 = (i4 - C0873.m55680("ۜۚ")) * (-81);
                int i6 = ((iM55680 ^ i5) * 26079) ^ (-1394588282);
                int i7 = 1063237298;
                while (true) {
                    i3 = ((((i3 ^ i5) * (-19973)) >> 31) & i6) ^ (iM55680 ^ i7);
                    switch (i3) {
                        case -2007373541:
                        case 535065500:
                            i2 = 119957320;
                            if (C0890.f81849 != 0) {
                                iM55680 = C0873.m55680("ۛۧ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-23161)) ^ (-540117295);
                                i7 = 1150543102;
                            } else {
                                iM55680 = C0946.m55979("ܽۢ") ^ i5;
                                i6 = ((iM55680 ^ i4) * (-699)) ^ 1461440447;
                                i7 = 1001766851;
                            }
                            break;
                        case -1973462777:
                        case 1358777549:
                            if (C1929.f83011 != 0) {
                                iM55680 = C0873.m55680("ۛۧ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-23161)) ^ (-540117295);
                                i7 = 1150543102;
                            } else {
                                iM55680 = (C0873.m55680("ۖ᩹") + i4) * (-63);
                                i6 = ((iM55680 ^ i5) * 24187) ^ 2086006024;
                                i7 = -1740058646;
                            }
                            break;
                        case -1917600224:
                        case -494032333:
                            j2 = j;
                            if (RunnableC0938.m55938() != 0) {
                                iM55680 = C0873.m55680("ۢۘ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-9649)) ^ 1447738837;
                                i7 = 478660280;
                            } else {
                                iM55680 = (C0873.m55680("ۗᩳ") ^ i4) * (-93);
                                i6 = ((iM55680 ^ i5) * (-27911)) ^ (-1879193179);
                                i7 = 1219856048;
                            }
                            break;
                        case -1647190683:
                        case 1830803205:
                            c17393.f51915 = i ^ i2;
                            break;
                        case -1569711737:
                        case -1486705536:
                            if (C0912.f81867 > 0) {
                                iM55680 = C0873.m55680("ۢۘ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-9649)) ^ 1447738837;
                                i7 = 478660280;
                            } else {
                                iM55680 = (C0873.m55680("᩶ܽ") ^ i5) * (-49);
                                i6 = ((iM55680 ^ i4) * (-20555)) ^ 280948399;
                                i7 = -2090158276;
                            }
                            break;
                        case -1248446062:
                        case -603778813:
                            c17393 = (C17393) obj;
                            if (C0854.f81826 != 0) {
                                iM55680 = C0873.m55680("ۛۧ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-23161)) ^ (-540117295);
                                i7 = 1150543102;
                            } else {
                                iM55680 = (C0946.m55979("ۢ۟") ^ i5) * 3;
                                i6 = ((iM55680 ^ i4) * (-27989)) ^ 1524013174;
                                i7 = -512536311;
                            }
                            break;
                        case -851849077:
                        case 124546571:
                            if (C0890.f81849 != 0) {
                                iM55680 = (C0873.m55680("᩶ܶ") ^ i5) * (-41);
                                i6 = ((iM55680 ^ i4) * (-7681)) ^ 1615669325;
                                i7 = -506584930;
                            } else {
                                iM55680 = C0946.m55979("۠ۤ") ^ i4;
                                i6 = ((iM55680 ^ i5) * 31131) ^ (-1459386997);
                                i7 = 1825809178;
                            }
                            break;
                        case -753201874:
                        case -94094181:
                            C1229.m56410();
                            C0937.m55918();
                            iM55680 = (C0873.m55680("᩶ܽ") ^ i5) * (-49);
                            i6 = ((iM55680 ^ i4) * (-20555)) ^ 280948399;
                            i7 = -2090158276;
                            break;
                        case -680971994:
                        case -14939365:
                            if (C1036.f81953 >= 0) {
                                iM55680 = C0946.m55979("֨ᩴ") ^ i5;
                                i6 = ((iM55680 ^ i4) * (-29939)) ^ 814613306;
                                i7 = 524696006;
                            } else {
                                iM55680 = C0873.m55680("ۛۧ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-23161)) ^ (-540117295);
                                i7 = 1150543102;
                            }
                            break;
                        case -657607720:
                        case -295434320:
                            if (RunnableC0897.f81856) {
                                iM55680 = (C0873.m55680("۫ܶ") ^ i5) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                i6 = ((iM55680 ^ i4) * 5283) ^ (-465735971);
                                i7 = 2095025647;
                            } else {
                                iM55680 = C0873.m55680("ۢۘ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-9649)) ^ 1447738837;
                                i7 = 478660280;
                            }
                            break;
                        case -545182378:
                        case 1475721067:
                            c17393.f51917 = j2;
                            j3 = 1000;
                            if (C1404.m56468()) {
                                iM55680 = (C0946.m55979("ۤܳ") ^ i5) * (-53);
                                i6 = ((iM55680 ^ i4) * (-13399)) ^ 24336618;
                                i7 = -337228790;
                            } else {
                                iM55680 = (C0873.m55680("᩶ܶ") ^ i5) * (-41);
                                i6 = ((iM55680 ^ i4) * (-7681)) ^ 1615669325;
                                i7 = -506584930;
                            }
                            break;
                        case -447050418:
                        case 1749170909:
                            i = (int) (j2 / j3);
                            if (ServiceConnectionC1013.m56157() <= 0) {
                                iM55680 = (C0873.m55680("᩶ܶ") ^ i5) * (-41);
                                i6 = ((iM55680 ^ i4) * (-7681)) ^ 1615669325;
                                i7 = -506584930;
                            } else {
                                iM55680 = (i4 - C0946.m55979("ܺ᩵")) * 51;
                                i6 = ((iM55680 ^ i5) * 18427) ^ 1332059544;
                                i7 = -521479118;
                            }
                            break;
                        case -353485824:
                        case 1825810002:
                            C0861.m55626();
                            break;
                        case 332578337:
                        case 1240235913:
                            if (C0989.f81920 >= 0) {
                                iM55680 = C0873.m55680("ۛۧ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-23161)) ^ (-540117295);
                                i7 = 1150543102;
                            } else {
                                iM55680 = (C0873.m55680("᩶ܽ") ^ i5) * (-49);
                                i6 = ((iM55680 ^ i4) * (-20555)) ^ 280948399;
                                i7 = -2090158276;
                            }
                            break;
                        case 1473691011:
                        case 1518813228:
                            if (C1929.f83011 != 0) {
                                iM55680 = C0873.m55680("ۛۧ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-23161)) ^ (-540117295);
                                i7 = 1150543102;
                            } else {
                                iM55680 = C0946.m55979("ۨۡ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-25455)) ^ 286626743;
                                i7 = 143129948;
                            }
                            break;
                        default:
                            if (C0845.f81821 >= 0) {
                                iM55680 = C0946.m55979("֨ᩴ") ^ i5;
                                i6 = ((iM55680 ^ i4) * (-29939)) ^ 814613306;
                                i7 = 524696006;
                            } else {
                                iM55680 = C0873.m55680("ۛ֡") ^ i5;
                                i6 = ((iM55680 ^ i4) * 655) ^ 113181439;
                                i7 = 204281225;
                            }
                            break;
                    }
                    return;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m9880(final Activity activity, final C25065 c25065, final InterfaceC11360 interfaceC11360) {
        int i = -2020006561;
        int i2 = C0863.f81833;
        int i3 = C1003.f81929;
        int iM55680 = C0873.m55680("ۛܳ") ^ i3;
        int i4 = ((iM55680 ^ i2) * (-7151)) ^ (-337625984);
        int i5 = 573181572;
        while (true) {
            i = ((((i ^ i2) * 22111) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2063469030:
                case 43277830:
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0873.m55680("۫᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24889) ^ 2003915124;
                        i5 = 1070167366;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩸۟")) * (-65);
                        i4 = ((iM55680 ^ i3) * (-23445)) ^ 1460074856;
                        i5 = 419929092;
                    }
                    break;
                case -1436412402:
                case -43911551:
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0873.m55680("᩶ܰ") + i3) * 21;
                        i4 = ((iM55680 ^ i2) * 13387) ^ (-1672442782);
                        i5 = -21769559;
                    } else {
                        iM55680 = C0873.m55680("۬ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 12801) ^ 222774697;
                        i5 = 654499234;
                    }
                    break;
                case -1413642352:
                case 1986135713:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("۫᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24889) ^ 2003915124;
                        i5 = 1070167366;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-6611)) ^ 32434642;
                        i5 = 227784083;
                    }
                    break;
                case -1273917982:
                case 369345232:
                    C1048.m56305();
                    break;
                case -951816191:
                case -294150789:
                    activity.runOnUiThread(new Runnable() { // from class: l.᩺֨ۡ

                        /* JADX INFO: renamed from: ܺ۠ۘ, reason: not valid java name and contains not printable characters */
                        private static final short[] f83033 = {3189, -12978, -172, 10597, 13889, -3684, -9129, -11068, 11769, 14444, -12643, 9491, 9055};

                        {
                            int i6 = -430592482;
                            int i7 = ViewOnClickListenerC0939.f81888;
                            int i8 = C1025.f81947;
                            int iM55979 = C0946.m55979("᩶ᩴ") ^ i8;
                            int i9 = ((iM55979 ^ i7) * (-23953)) ^ (-1476751883);
                            int i10 = 1918529335;
                            while (true) {
                                i6 = ((((i6 ^ i7) * 32359) >> 31) & i9) ^ (iM55979 ^ i10);
                                switch (i6) {
                                    case -1969384490:
                                    case 1663750993:
                                        if (C0882.f81846) {
                                            iM55979 = (i8 - C0946.m55979("ᩴ۬")) * (-79);
                                            i9 = ((iM55979 ^ i7) * 27035) ^ (-170134983);
                                            i10 = -705273504;
                                        } else {
                                            iM55979 = C0873.m55680("ۜܳ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-19963)) ^ 616034880;
                                            i10 = -1181399052;
                                        }
                                        break;
                                    case -1652336480:
                                    case 1445932900:
                                        if (C0873.f81841 <= 0) {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        } else {
                                            iM55979 = (C0873.m55680("ܶ֫") ^ i8) * (-107);
                                            i9 = ((iM55979 ^ i7) * (-23287)) ^ 648604448;
                                            i10 = 769914202;
                                        }
                                        break;
                                    case -1272696893:
                                    case -635499683:
                                        return;
                                    case -1009944194:
                                    case -276194362:
                                        C0863.m55643();
                                        C1003.m56123();
                                        throw new RuntimeException();
                                    case -985028336:
                                    case -428656524:
                                        if (C0863.m55643()) {
                                            iM55979 = C0873.m55680("ۢ۟") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 32653) ^ (-616251972);
                                            i10 = -1750217087;
                                        } else {
                                            iM55979 = (i8 - C0946.m55979("ᩴ۬")) * (-79);
                                            i9 = ((iM55979 ^ i7) * 27035) ^ (-170134983);
                                            i10 = -705273504;
                                        }
                                        break;
                                    case -842557371:
                                    case 1610720088:
                                        C1124.m56367();
                                        iM55979 = C0873.m55680("᩷᩸") ^ i7;
                                        i9 = ((iM55979 ^ i8) * 24161) ^ 1836313059;
                                        i10 = -1746037848;
                                        break;
                                    case -574347819:
                                    case 1601361635:
                                        if (C0854.f81826 != 0) {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        } else {
                                            iM55979 = (C0946.m55979("ܿ᩺") + i7) * (-27);
                                            i9 = ((iM55979 ^ i8) * (-10405)) ^ 144753257;
                                            i10 = -967833042;
                                        }
                                        break;
                                    case -429888286:
                                    case 1711854277:
                                        if (C1048.f81963) {
                                            iM55979 = (i7 - C0873.m55680("֡ۖ")) * 81;
                                            i9 = ((iM55979 ^ i8) * (-27083)) ^ (-1629736236);
                                            i10 = -1125812189;
                                        } else {
                                            iM55979 = (i8 - C0946.m55979("ᩴ۬")) * (-79);
                                            i9 = ((iM55979 ^ i7) * 27035) ^ (-170134983);
                                            i10 = -705273504;
                                        }
                                        break;
                                    case -306825196:
                                    case 944638485:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55979 = (i8 - C0946.m55979("ᩴ۬")) * (-79);
                                            i9 = ((iM55979 ^ i7) * 27035) ^ (-170134983);
                                            i10 = -705273504;
                                        } else {
                                            iM55979 = (C0946.m55979("۠᩻") ^ i8) * 35;
                                            i9 = ((iM55979 ^ i7) * (-2857)) ^ 527962215;
                                            i10 = -201850238;
                                        }
                                        break;
                                    case 229445068:
                                    case 531423838:
                                        if (C0906.m55809() > 0) {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        } else {
                                            iM55979 = C0873.m55680("᩷᩸") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 24161) ^ 1836313059;
                                            i10 = -1746037848;
                                        }
                                        break;
                                    case 375149188:
                                    case 832789177:
                                        if (C0861.f81831) {
                                            iM55979 = (C0873.m55680("᩺ۨ") ^ i8) * (-21);
                                            i9 = ((iM55979 ^ i7) * 20199) ^ (-1354469620);
                                            i10 = 752049492;
                                        } else {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        }
                                        break;
                                    case 602467745:
                                    case 1100569486:
                                        if (C1003.f81929 <= 0) {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        } else {
                                            iM55979 = (C0873.m55680("ۚܿ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i9 = ((iM55979 ^ i7) * (-1371)) ^ (-812634638);
                                            i10 = 1161450804;
                                        }
                                        break;
                                    case 1107691386:
                                    case 1581592437:
                                        if (C0882.m55710() != 0) {
                                            iM55979 = (i8 - C0946.m55979("ᩴ۬")) * (-79);
                                            i9 = ((iM55979 ^ i7) * 27035) ^ (-170134983);
                                            i10 = -705273504;
                                        } else {
                                            iM55979 = C0946.m55979("᩻ۘ") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 19155) ^ (-1526222725);
                                            i10 = -536563639;
                                        }
                                        break;
                                    case 1214334060:
                                    case 1609260117:
                                        if (C0967.f81910 < 0) {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        } else {
                                            iM55979 = C0873.m55680("ܰ᩸") ^ i7;
                                            i9 = ((iM55979 ^ i8) * (-7907)) ^ 1370611992;
                                            i10 = 1267711777;
                                        }
                                        break;
                                    case 1515934874:
                                    case 1592539909:
                                        C0930.m55885();
                                        if (C1003.f81929 <= 0) {
                                            iM55979 = C0873.m55680("ᩴ֫") ^ i8;
                                            i9 = ((iM55979 ^ i7) * 19735) ^ 1745890774;
                                            i10 = 960716831;
                                        } else {
                                            iM55979 = C0946.m55979("᩺ܶ") ^ i8;
                                            i9 = ((iM55979 ^ i7) * (-28175)) ^ (-1137229825);
                                            i10 = -1418746300;
                                        }
                                        break;
                                    default:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55979 = C0873.m55680("᩷᩸") ^ i7;
                                            i9 = ((iM55979 ^ i8) * 24161) ^ 1836313059;
                                            i10 = -1746037848;
                                        } else {
                                            iM55979 = (i7 - C0873.m55680("ۜۧ")) * (-65);
                                            i9 = ((iM55979 ^ i8) * (-18613)) ^ 1326025742;
                                            i10 = -1836558611;
                                        }
                                        break;
                                }
                            }
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 28301. Try increasing type updates limit count.
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instruction units count: 2830
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p067l.RunnableC23903.run():void");
                        }
                    });
                    break;
                case -777197916:
                case 1409900259:
                    if (C1404.m56468()) {
                        iM55680 = C0946.m55979("֡᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24961) ^ (-67869906);
                        i5 = 1854508374;
                    } else {
                        iM55680 = (C0946.m55979("᩻֡") ^ i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-1379)) ^ 2104024597;
                        i5 = -1552768717;
                    }
                    break;
                case -550348501:
                case 498130370:
                    C1071.m56343();
                    C0946.m55980();
                    iM55680 = (i2 - C0946.m55979("᩸۟")) * (-65);
                    i4 = ((iM55680 ^ i3) * (-23445)) ^ 1460074856;
                    i5 = 419929092;
                    break;
                case -528349695:
                case 477269851:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("᩶ܰ") + i3) * 21;
                        i4 = ((iM55680 ^ i2) * 13387) ^ (-1672442782);
                        i5 = -21769559;
                    } else {
                        iM55680 = (C0946.m55979("ۙۢ") ^ i2) * (-19);
                        i4 = ((iM55680 ^ i3) * (-18381)) ^ 1010412207;
                        i5 = -1931369722;
                    }
                    break;
                case -312701686:
                case 91969550:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("֡۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4045) ^ (-1233559729);
                        i5 = -607605779;
                    } else {
                        iM55680 = C0946.m55979("᩶ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 28901) ^ (-68522366);
                        i5 = 729678988;
                    }
                    break;
                case -105822501:
                case 811770527:
                    if (AbstractC0942.f81890 > 0) {
                        iM55680 = (C0873.m55680("᩶ܰ") + i3) * 21;
                        i4 = ((iM55680 ^ i2) * 13387) ^ (-1672442782);
                        i5 = -21769559;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩸۟")) * (-65);
                        i4 = ((iM55680 ^ i3) * (-23445)) ^ 1460074856;
                        i5 = 419929092;
                    }
                    break;
                case 5475668:
                case 1024737333:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i2 - C0946.m55979("᩸۟")) * (-65);
                        i4 = ((iM55680 ^ i3) * (-23445)) ^ 1460074856;
                        i5 = 419929092;
                    } else {
                        iM55680 = C0873.m55680("ܰ᩸") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-16403)) ^ (-1544476373);
                        i5 = 630115218;
                    }
                    break;
                case 151283649:
                case 320678591:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("֡۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4045) ^ (-1233559729);
                        i5 = -607605779;
                    } else {
                        iM55680 = C0873.m55680("۫ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16185)) ^ 1405104339;
                        i5 = 1289928775;
                    }
                    break;
                case 713814819:
                case 1193895416:
                    C0949.m56012();
                    if (C0930.f81879 > 0) {
                        iM55680 = (C0946.m55979("᩻֡") ^ i2) * 99;
                        i4 = ((iM55680 ^ i3) * (-1379)) ^ 2104024597;
                        i5 = -1552768717;
                    } else {
                        iM55680 = C0873.m55680("۫᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24889) ^ 2003915124;
                        i5 = 1070167366;
                    }
                    break;
                case 803865414:
                case 1893287120:
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("۫᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24889) ^ 2003915124;
                        i5 = 1070167366;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۨ") ^ i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 1839) ^ (-495309309);
                        i5 = 1848221151;
                    }
                    break;
                case 1864887290:
                case 1912232938:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("֡۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4045) ^ (-1233559729);
                        i5 = -607605779;
                    } else {
                        iM55680 = C0873.m55680("᩻ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7025) ^ 28517039;
                        i5 = -871498017;
                    }
                    break;
                default:
                    if (C0927.f81875) {
                        iM55680 = (i2 - C0946.m55979("᩸۟")) * (-65);
                        i4 = ((iM55680 ^ i3) * (-23445)) ^ 1460074856;
                        i5 = 419929092;
                    } else {
                        iM55680 = C0946.m55979("ᩴܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16135)) ^ 1406187130;
                        i5 = 77264659;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9860(String str, String str2, C22404 c22404, Activity activity, InterfaceC11360 interfaceC11360) {
        C19701 c19701M56033 = null;
        long j = 0;
        int i = -1432581947;
        int i2 = C1028.f81950;
        int i3 = C1046.f81962;
        int iM55979 = (C0946.m55979("ܽ۠") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i4 = ((iM55979 ^ i3) * 2283) ^ (-965427790);
        int i5 = 2042822947;
        while (true) {
            i = ((((i ^ i3) * 6555) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2121457833:
                case 383823865:
                    ServiceConnectionC1013.m56157();
                    iM55979 = (i2 - C0946.m55979("᩺ᩳ")) * (-79);
                    i4 = ((iM55979 ^ i3) * (-31661)) ^ 970377633;
                    i5 = 1616690939;
                    break;
                case -2097261685:
                case 442768032:
                    if (C0992.m56107() <= 0) {
                        iM55979 = (C0946.m55979("ۘ۬") ^ i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-23155)) ^ 774907850;
                        i5 = 306386502;
                    } else {
                        iM55979 = C0946.m55979("ۡۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27837) ^ (-584790968);
                        i5 = -1501906990;
                    }
                    break;
                case -2086249286:
                case -519990167:
                    c19701M56033.m44743(j);
                    m9880(activity, c19701M56033.m44756(), interfaceC11360);
                    break;
                case -2064572005:
                case -10400164:
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0946.m55979("ۘ۬") ^ i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-23155)) ^ 774907850;
                        i5 = 306386502;
                    } else {
                        iM55979 = C0946.m55979("ۛۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 81) ^ (-1340307794);
                        i5 = -350873870;
                    }
                    break;
                case -2036295508:
                case 1822302316:
                    if (C0854.f81826 != 0) {
                        iM55979 = (i2 - C0946.m55979("᩺ᩳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * (-31661)) ^ 970377633;
                        i5 = 1616690939;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1961)) ^ (-476753906);
                        i5 = -639425570;
                    }
                    break;
                case -2001700421:
                case -1086680417:
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0873.m55680("۟ܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23075) ^ 1401957856;
                        i5 = 1147293459;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩻᩵")) * 95;
                        i4 = ((iM55979 ^ i3) * 26713) ^ 1348085228;
                        i5 = -1227736190;
                    }
                    break;
                case -1980366071:
                case -743215591:
                    if (C0946.f81894 == 0) {
                        iM55979 = C0873.m55680("֫۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7137)) ^ (-1832302968);
                        i5 = 1245219980;
                    } else {
                        iM55979 = (C0946.m55979("ۘ۬") ^ i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-23155)) ^ 774907850;
                        i5 = 306386502;
                    }
                    break;
                case -1615486697:
                case -595728999:
                    if (C0877.m55696()) {
                        iM55979 = C0873.m55680("ᩳᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 679) ^ (-75810385);
                        i5 = -4001629;
                    } else {
                        iM55979 = C0873.m55680("۟ܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23075) ^ 1401957856;
                        i5 = 1147293459;
                    }
                    break;
                case -1459084187:
                case -697287393:
                    c19701M56033 = C0955.m56033(C0719o.a.f2908n);
                    c19701M56033.m44744(str);
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("۟ܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23075) ^ 1401957856;
                        i5 = 1147293459;
                    } else {
                        iM55979 = (C0873.m55680("ۤܰ") + i3) * 25;
                        i4 = ((iM55979 ^ i2) * (-22227)) ^ 586117050;
                        i5 = 894511403;
                    }
                    break;
                case -1304015897:
                case 598428951:
                    ServiceConnectionC1013.m56157();
                    C1404.m56468();
                    break;
                case -1109436621:
                case 953234937:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("۟ܿ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23075) ^ 1401957856;
                        i5 = 1147293459;
                    } else {
                        iM55979 = C0946.m55979("۠᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 25089) ^ (-14244621);
                        i5 = 2092809695;
                    }
                    break;
                case -931036244:
                case 1284801296:
                    C0930.m55884(c19701M56033, str2);
                    c19701M56033.m44743(c22404.f70677);
                    j = c22404.f70675;
                    if (C1964.m56597() != 0) {
                        iM55979 = (C0946.m55979("ۘ۬") ^ i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-23155)) ^ 774907850;
                        i5 = 306386502;
                    } else {
                        iM55979 = C0946.m55979("᩵ۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20201) ^ (-1315764794);
                        i5 = -2015631485;
                    }
                    break;
                case -256642706:
                case 1820270227:
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("ܽۚ") ^ i2) * 59;
                        i4 = ((iM55979 ^ i3) * 16319) ^ (-206062728);
                        i5 = -1754222978;
                    } else {
                        iM55979 = C0873.m55680("֫۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7137)) ^ (-1832302968);
                        i5 = 1245219980;
                    }
                    break;
                case 313199092:
                case 1982184018:
                    C1053.m56327();
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("֨۫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1557)) ^ (-167073541);
                        i5 = -1251307329;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩺ᩳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * (-31661)) ^ 970377633;
                        i5 = 1616690939;
                    }
                    break;
                case 593176758:
                case 996021279:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i2 - C0946.m55979("᩺ᩳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * (-31661)) ^ 970377633;
                        i5 = 1616690939;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩵᩵")) * 93;
                        i4 = ((iM55979 ^ i2) * 28737) ^ (-1729615570);
                        i5 = 11077159;
                    }
                    break;
                default:
                    RunnableC0938.m55938();
                    if (C0992.f81922 < 0) {
                        iM55979 = (C0946.m55979("ۘ۬") ^ i3) * 43;
                        i4 = ((iM55979 ^ i2) * (-23155)) ^ 774907850;
                        i5 = 306386502;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩺ᩳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * (-31661)) ^ 970377633;
                        i5 = 1616690939;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x032c A[PHI: r7 r8 r16 r17 r18 r19
      0x032c: PHI (r7v3 int) = (r7v1 int), (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:67:0x032a, B:63:0x0301, B:50:0x026b, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r8v3 short) = (r8v1 short), (r8v1 short), (r8v2 short), (r8v1 short) binds: [B:67:0x032a, B:63:0x0301, B:50:0x026b, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r16v14 int) = (r16v5 int), (r16v6 int), (r16v7 int), (r16v17 int) binds: [B:67:0x032a, B:63:0x0301, B:50:0x026b, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r17v13 l.ᩳᩴۡ) = (r17v5 l.ᩳᩴۡ), (r17v6 l.ᩳᩴۡ), (r17v7 l.ᩳᩴۡ), (r17v17 l.ᩳᩴۡ) binds: [B:67:0x032a, B:63:0x0301, B:50:0x026b, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r18v12 java.lang.String) = (r18v5 java.lang.String), (r18v6 java.lang.String), (r18v7 java.lang.String), (r18v13 java.lang.String) binds: [B:67:0x032a, B:63:0x0301, B:50:0x026b, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x032c: PHI (r19v13 java.lang.String) = (r19v5 java.lang.String), (r19v6 java.lang.String), (r19v7 java.lang.String), (r19v16 java.lang.String) binds: [B:67:0x032a, B:63:0x0301, B:50:0x026b, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x038f A[PHI: r16 r17 r18 r19
      0x038f: PHI (r16v12 int) = (r16v3 int), (r16v4 int), (r16v13 int) binds: [B:75:0x038d, B:71:0x0367, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r17v11 l.ᩳᩴۡ) = (r17v3 l.ᩳᩴۡ), (r17v4 l.ᩳᩴۡ), (r17v12 l.ᩳᩴۡ) binds: [B:75:0x038d, B:71:0x0367, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r18v10 java.lang.String) = (r18v3 java.lang.String), (r18v4 java.lang.String), (r18v11 java.lang.String) binds: [B:75:0x038d, B:71:0x0367, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x038f: PHI (r19v11 java.lang.String) = (r19v3 java.lang.String), (r19v4 java.lang.String), (r19v12 java.lang.String) binds: [B:75:0x038d, B:71:0x0367, B:13:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9863(String str, byte[] bArr, String str2, Activity activity, C17037 c17037) {
        int iM55680;
        int i;
        int i2;
        C19701 c19701;
        int iM55681;
        int i3;
        int i4;
        int i5;
        String strM47462 = null;
        String strM56336 = null;
        String strM47463 = null;
        int i6 = 0;
        C19701 c19701M55781 = null;
        C25065 c25065M44756 = null;
        short s = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 1468610702;
        int i10 = C0877.f81843;
        int i11 = C1124.f82007;
        int iM55682 = (C0873.m55680("ۜܳ") + i10) * 23;
        int i12 = ((iM55682 ^ i11) * 13071) ^ 957364579;
        int i13 = iM55682 ^ (-1744947383);
        while (true) {
            i9 = ((((i9 ^ i11) * 5447) >> 31) & i12) ^ i13;
            switch (i9) {
                case -2065029265:
                case -113964964:
                    c19701 = c19701M55781;
                    strM47463 = C21043.m47462(C0989.m56096(strM47462, strM56336));
                    i6 = 4145;
                    if (C0861.f81831) {
                        int iM55683 = C0873.m55680("᩸ܶ") ^ i10;
                        i13 = iM55683 ^ (-1134214489);
                        i12 = ((iM55683 ^ i11) * 10863) ^ (-1016239974);
                    } else {
                        int iM55684 = (C0873.m55680("ܽ۬") + i10) * (-121);
                        i12 = ((iM55684 ^ i11) * (-11541)) ^ 1760244027;
                        i13 = iM55684 ^ 381085575;
                    }
                    c19701M55781 = c19701;
                    strM47462 = strM47462;
                    break;
                case -1944698062:
                case 301040210:
                    C1046.m56302();
                    C1194.m56396();
                    break;
                case -1801859399:
                case 227888176:
                    m9880(activity, c25065M44756, c17037);
                    break;
                case -1753643725:
                case 1590767525:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0946.m55979("᩺ۢ") ^ i11;
                        i = ((iM55680 ^ i10) * 14491) ^ 909923173;
                        i2 = -706445955;
                    } else {
                        iM55680 = C0873.m55680("᩹᩶") ^ i10;
                        i = ((iM55680 ^ i11) * (-11823)) ^ 1574854509;
                        i2 = 1504314121;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case -1595464864:
                case 702569677:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("ܳ᩵") ^ i11;
                        i = ((iM55680 ^ i10) * (-29825)) ^ (-1388776768);
                        i2 = -946288916;
                    } else {
                        iM55680 = (C0873.m55680("ܺۨ") + i10) * (-99);
                        i = ((iM55680 ^ i11) * 29983) ^ 1123601058;
                        i2 = 1247769137;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case -1594374719:
                case 716119833:
                    if (C1028.f81950 > 0) {
                        strM47462 = strM47462;
                        strM47463 = strM47463;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        iM55680 = C0946.m55979("᩺ۢ") ^ i11;
                        i = ((iM55680 ^ i10) * 14491) ^ 909923173;
                        i2 = -706445955;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        strM47463 = strM47463;
                        strM47462 = strM47462;
                    }
                    c19701 = c19701M55781;
                    int iM55685 = (C0873.m55680("ܽ۬") + i10) * (-121);
                    i12 = ((iM55685 ^ i11) * (-11541)) ^ 1760244027;
                    i13 = iM55685 ^ 381085575;
                    c19701M55781 = c19701;
                    strM47462 = strM47462;
                    break;
                case -1578898606:
                case 841573124:
                    c19701M55781 = RunnableC0897.m55781(i6);
                    i5 = i6;
                    c19701M55781.m44746(bArr);
                    C0866.m55644(c19701M55781, str2);
                    C0930.m55884(c19701M55781, strM47463);
                    if (RunnableC0938.f81886 >= 0) {
                        int iM55979 = (i11 - C0946.m55979("᩹ۘ")) * 47;
                        strM47463 = strM47463;
                        i12 = ((iM55979 ^ i10) * 3819) ^ (-487539129);
                        i6 = i5;
                        i13 = iM55979 ^ (-1653177862);
                    } else {
                        strM47463 = strM47463;
                        int iM559710 = (i11 - C0946.m55979("ܺ᩺")) * 45;
                        i13 = iM559710 ^ (-1572016030);
                        i12 = ((iM559710 ^ i10) * (-29213)) ^ (-657959407);
                        i6 = i5;
                    }
                    strM47463 = strM47463;
                    break;
                case -1432767373:
                case -824682007:
                    C0930.m55885();
                    i5 = i6;
                    int iM559711 = (i11 - C0946.m55979("᩹ۘ")) * 47;
                    strM47463 = strM47463;
                    i12 = ((iM559711 ^ i10) * 3819) ^ (-487539129);
                    i6 = i5;
                    i13 = iM559711 ^ (-1653177862);
                    strM47463 = strM47463;
                    break;
                case -1428926598:
                case 281564841:
                    C0866.m55644(c19701M55781, str);
                    c25065M44756 = c19701M55781.m44756();
                    if (C0930.m55892(c25065M44756)) {
                        int iM55686 = (i10 - C0873.m55680("᩷۠")) * (-71);
                        i12 = ((iM55686 ^ i11) * 29199) ^ (-214340785);
                        i13 = iM55686 ^ (-1237467754);
                    } else {
                        int iM559712 = C0946.m55979("ۡ۫") ^ i10;
                        C25065 c25065 = c25065M44756;
                        i13 = iM559712 ^ (-2082829817);
                        i12 = ((iM559712 ^ i11) * (-25429)) ^ (-1362566999);
                        c25065M44756 = c25065;
                    }
                    c19701M55781 = c19701M55781;
                    break;
                case -1359946464:
                case 1053331106:
                    C8775.m20304();
                    int iM559713 = C0946.m55979("ۡ۫") ^ i10;
                    C25065 c25066 = c25065M44756;
                    i13 = iM559713 ^ (-2082829817);
                    i12 = ((iM559713 ^ i11) * (-25429)) ^ (-1362566999);
                    c25065M44756 = c25066;
                    c19701M55781 = c19701M55781;
                    break;
                case -1118770546:
                case -423080908:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("ܳ᩵") ^ i11;
                        i = ((iM55680 ^ i10) * (-29825)) ^ (-1388776768);
                        i2 = -946288916;
                    } else {
                        iM55680 = (C0946.m55979("۠ۤ") + i11) * (-83);
                        i = ((iM55680 ^ i10) * 28477) ^ 63638014;
                        i2 = 1638633601;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case -929574332:
                case 2072498889:
                    if (C0912.m55833()) {
                        strM47462 = strM47462;
                        strM47463 = strM47463;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        iM55680 = C0873.m55680("ܳ᩵") ^ i11;
                        i = ((iM55680 ^ i10) * (-29825)) ^ (-1388776768);
                        i2 = -946288916;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        strM47463 = strM47463;
                        strM47462 = strM47462;
                    }
                    c19701 = c19701M55781;
                    int iM55687 = (C0873.m55680("ܽ۬") + i10) * (-121);
                    i12 = ((iM55687 ^ i11) * (-11541)) ^ 1760244027;
                    i13 = iM55687 ^ 381085575;
                    c19701M55781 = c19701;
                    strM47462 = strM47462;
                    break;
                case -758299558:
                case 1935587374:
                    i8 = 30163;
                    iM55680 = C0946.m55979("᩺᩸") ^ i11;
                    i = ((iM55680 ^ i10) * 6619) ^ 933986585;
                    i2 = -1150173051;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case -672770551:
                case 117955171:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    if (C0949.m56012()) {
                        iM55680 = C0946.m55979("᩺ۢ") ^ i11;
                        i = ((iM55680 ^ i10) * 14491) ^ 909923173;
                        i2 = -706445955;
                    } else {
                        iM55680 = C0873.m55680("۬ᩴ") ^ i11;
                        i = ((iM55680 ^ i10) * (-23585)) ^ 1298492371;
                        i2 = 1305539135;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case -540454385:
                case 1036342228:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    s = f81901[178];
                    if (!C0863.m55643()) {
                        strM47462 = strM47462;
                        iM55681 = C0873.m55680("ܶ۫") ^ i10;
                        i3 = ((iM55681 ^ i11) * 23009) ^ (-1025803566);
                        i4 = -171430239;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        strM47463 = strM47463;
                    } else {
                        iM55680 = (C0946.m55979("ۧۘ") ^ i11) * 41;
                        i = ((iM55680 ^ i10) * (-15687)) ^ 870112065;
                        i2 = 228916814;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        strM47463 = strM47463;
                        strM47462 = strM47462;
                    }
                    break;
                case -262959304:
                case 902750762:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    int i14 = s + 1;
                    i7 = i14 * i14;
                    s2 = 2;
                    if (C0927.m55873() <= 0) {
                        iM55680 = C0873.m55680("ܳ᩵") ^ i11;
                        i = ((iM55680 ^ i10) * (-29825)) ^ (-1388776768);
                        i2 = -946288916;
                    } else {
                        iM55680 = C0946.m55979("ܰܺ") ^ i10;
                        i = ((iM55680 ^ i11) * 1065) ^ (-565157288);
                        i2 = -877212418;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case 137973338:
                case 2004008702:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0873.m55680("ۖۤ") ^ i10;
                        i = ((iM55680 ^ i11) * 15545) ^ (-722129217);
                        i2 = 1367773916;
                        i13 = iM55680 ^ i2;
                        i12 = i;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        strM47463 = strM47463;
                        strM47462 = strM47462;
                    } else {
                        strM47462 = strM47462;
                        iM55681 = C0873.m55680("ܶ۫") ^ i10;
                        i3 = ((iM55681 ^ i11) * 23009) ^ (-1025803566);
                        i4 = -171430239;
                        i13 = iM55681 ^ i4;
                        i12 = i3;
                        i6 = i6;
                        c19701M55781 = c19701M55781;
                        strM47463 = strM47463;
                    }
                    break;
                case 756000305:
                case 953181826:
                    C0873.m55678();
                    if (!C0861.m55626()) {
                        c19701 = c19701M55781;
                        int iM55688 = (C0873.m55680("ܽ۬") + i10) * (-121);
                        i12 = ((iM55688 ^ i11) * (-11541)) ^ 1760244027;
                        i13 = iM55688 ^ 381085575;
                        c19701M55781 = c19701;
                        strM47462 = strM47462;
                    } else {
                        i5 = i6;
                        int iM559714 = (i11 - C0946.m55979("᩹ۘ")) * 47;
                        strM47463 = strM47463;
                        i12 = ((iM559714 ^ i10) * 3819) ^ (-487539129);
                        i6 = i5;
                        i13 = iM559714 ^ (-1653177862);
                        strM47463 = strM47463;
                    }
                    break;
                case 1173958889:
                case 1248138481:
                    strM47462 = strM47462;
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    if (i7 - ((s * s2) + 1) < 0) {
                        iM55680 = (C0946.m55979("֨ۚ") ^ i10) * 49;
                        i = ((iM55680 ^ i11) * (-15359)) ^ (-1582903681);
                        i2 = -1685025029;
                    } else {
                        iM55680 = (i11 - C0873.m55680("ۛۘ")) * (-103);
                        i = ((iM55680 ^ i10) * (-3309)) ^ 1443446945;
                        i2 = 1575451440;
                    }
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
                case 1224466633:
                case 1447407596:
                    strM47463 = strM47463;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47462 = C21043.m47462(str);
                    strM56336 = C1071.m56336(f81901, 179, 8, i8);
                    if (C0866.m55645()) {
                        iM55681 = C0873.m55680("᩸ܳ") ^ i11;
                        i3 = ((iM55681 ^ i10) * (-8387)) ^ (-1529853346);
                        i4 = 335614896;
                    } else {
                        iM55681 = C0873.m55680("ܶ۫") ^ i10;
                        i3 = ((iM55681 ^ i11) * 23009) ^ (-1025803566);
                        i4 = -171430239;
                    }
                    i13 = iM55681 ^ i4;
                    i12 = i3;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    break;
                default:
                    i8 = 40547;
                    iM55680 = C0946.m55979("᩺᩸") ^ i11;
                    i = ((iM55680 ^ i10) * 6619) ^ 933986585;
                    i2 = -1150173051;
                    i13 = iM55680 ^ i2;
                    i12 = i;
                    i6 = i6;
                    c19701M55781 = c19701M55781;
                    strM47463 = strM47463;
                    strM47462 = strM47462;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9864(ViewOnClickListenerC7928 viewOnClickListenerC7928, C3905 c3905) {
        int i = 0;
        int i2 = -2088555956;
        int i3 = C0992.f81922;
        int i4 = C1124.f82007;
        int iM55979 = C0946.m55979("֡ۖ") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-23189)) ^ 524341304;
        int i6 = -1845939150;
        while (true) {
            i2 = ((((i2 ^ i3) * (-15755)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2114297298:
                case 2093916464:
                    if (C0912.m55833()) {
                        iM55979 = (C0873.m55680("۫᩻") + i4) * 49;
                        i5 = ((iM55979 ^ i3) * 7383) ^ 1470365329;
                        i6 = 1759074265;
                    } else {
                        iM55979 = C0873.m55680("᩻֫") ^ i4;
                        i5 = ((iM55979 ^ i3) * 14701) ^ 109980020;
                        i6 = -373922335;
                    }
                    break;
                case -1887782087:
                case 75661094:
                    if (C1404.m56468()) {
                        iM55979 = C0946.m55979("֫᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32293)) ^ (-1143513859);
                        i6 = 1347219782;
                    } else {
                        iM55979 = C0873.m55680("ᩳᩴ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-29695)) ^ 1664891064;
                        i6 = -921276293;
                    }
                    break;
                case -1369070928:
                case 1782941559:
                    C0854.m55595();
                    C1044.m56286();
                    break;
                case -1304195971:
                case 962945544:
                    if (C0863.m55643()) {
                        iM55979 = (i3 - C0946.m55979("᩶ܿ")) * 17;
                        i5 = ((iM55979 ^ i4) * (-10909)) ^ 1171374766;
                        i6 = -2042281088;
                    } else {
                        iM55979 = C0873.m55680("ۡۖ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-6841)) ^ (-1888420967);
                        i6 = 1129471730;
                    }
                    break;
                case -1299358626:
                case 258087246:
                    C1229.m56410();
                    if (C1404.f82149 < 0) {
                        iM55979 = C0946.m55979("֡᩹") ^ i3;
                        i5 = ((iM55979 ^ i4) * 25241) ^ (-322496944);
                        i6 = -1915396584;
                    } else {
                        iM55979 = C0873.m55680("ۡۖ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-6841)) ^ (-1888420967);
                        i6 = 1129471730;
                    }
                    break;
                case -1260161058:
                case -23776922:
                    m9880(viewOnClickListenerC7928, RunnableC0871.m55668(C0955.m56033(i)), c3905);
                    break;
                case -1108495738:
                case -486168746:
                    if (C1024.f81946) {
                        iM55979 = C0946.m55979("֡᩹") ^ i3;
                        i5 = ((iM55979 ^ i4) * 25241) ^ (-322496944);
                        i6 = -1915396584;
                    } else {
                        iM55979 = (C0873.m55680("֨ۚ") ^ i4) * 71;
                        i5 = ((iM55979 ^ i3) * (-12195)) ^ 776771931;
                        i6 = -524177859;
                    }
                    break;
                case -917101670:
                case 796874959:
                    C0949.m56012();
                    if (!C1048.f81963) {
                        iM55979 = C0946.m55979("֡᩹") ^ i3;
                        i5 = ((iM55979 ^ i4) * 25241) ^ (-322496944);
                        i6 = -1915396584;
                    } else {
                        iM55979 = C0873.m55680("ᩳᩴ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-29695)) ^ 1664891064;
                        i6 = -921276293;
                    }
                    break;
                case -798104906:
                case 1360806897:
                    if (C0917.m55854()) {
                        iM55979 = C0873.m55680("ۖ۬") ^ i3;
                        i5 = ((iM55979 ^ i4) * 8923) ^ (-1317547193);
                        i6 = -2096724511;
                    } else {
                        iM55979 = C0873.m55680("ۡۖ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-6841)) ^ (-1888420967);
                        i6 = 1129471730;
                    }
                    break;
                case -614667367:
                case 355702784:
                    i = 4148;
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("᩵ۙ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 24381) ^ 1126635138;
                        i6 = -1025643973;
                    } else {
                        iM55979 = (C0873.m55680("ܳܽ") ^ i3) * (-21);
                        i5 = ((iM55979 ^ i4) * 8757) ^ 375704933;
                        i6 = 891465600;
                    }
                    break;
                case 615823338:
                case 1410900116:
                    C0877.m55696();
                    if (!C0947.m55997()) {
                        iM55979 = C0873.m55680("ۡۖ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-6841)) ^ (-1888420967);
                        i6 = 1129471730;
                    } else {
                        iM55979 = (C0873.m55680("۫᩻") + i4) * 49;
                        i5 = ((iM55979 ^ i3) * 7383) ^ 1470365329;
                        i6 = 1759074265;
                    }
                    break;
                case 715855934:
                case 1547643426:
                    if (C0927.f81875) {
                        iM55979 = (C0873.m55680("۫᩻") + i4) * 49;
                        i5 = ((iM55979 ^ i3) * 7383) ^ 1470365329;
                        i6 = 1759074265;
                    } else {
                        iM55979 = (C0873.m55680("ۨ֡") ^ i3) * 65;
                        i5 = ((iM55979 ^ i4) * (-9527)) ^ 924014079;
                        i6 = 2040874880;
                    }
                    break;
                case 743482121:
                case 1022388408:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("۫᩻") + i4) * 49;
                        i5 = ((iM55979 ^ i3) * 7383) ^ 1470365329;
                        i6 = 1759074265;
                    } else {
                        iM55979 = (C0873.m55680("ܽۤ") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55979 ^ i3) * (-9525)) ^ (-1084495617);
                        i6 = -1388833325;
                    }
                    break;
                case 1076222073:
                case 1103525719:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ᩳᩴ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-29695)) ^ 1664891064;
                        i6 = -921276293;
                    } else {
                        iM55979 = C0873.m55680("ܳۤ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 29977) ^ 1080711041;
                        i6 = -1137998409;
                    }
                    break;
                case 1618222864:
                case 1737852551:
                    C1024.m56209();
                    iM55979 = C0873.m55680("ۡۖ") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-6841)) ^ (-1888420967);
                    i6 = 1129471730;
                    break;
                default:
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ᩳᩴ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-29695)) ^ 1664891064;
                        i6 = -921276293;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۤۧ")) * (-47);
                        i5 = ((iM55979 ^ i3) * 22041) ^ 1040996573;
                        i6 = -1470797939;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9868(byte[] bArr, String str, String str2, Activity activity, C23074 c23074) {
        int i = 0;
        C25065 c25065M44756 = null;
        int i2 = 966409934;
        int i3 = C1071.f81975;
        int i4 = C0863.f81833;
        int iM55680 = (C0873.m55680("ܳܶ") + i4) * 41;
        int i5 = ((iM55680 ^ i3) * (-19529)) ^ (-1214065614);
        int i6 = 742887040;
        while (true) {
            i2 = ((((i2 ^ i3) * (-287)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2068035412:
                case 38569168:
                    if (C0894.m55769() >= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * 26201) ^ 2061162473;
                        i6 = -1641464501;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩹᩸")) * (-71);
                        i5 = ((iM55680 ^ i4) * 3637) ^ (-518678764);
                        i6 = 1580335294;
                    }
                    break;
                case -1894056918:
                case 130529193:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = (i4 - C0873.m55680("᩵ۙ")) * (-103);
                        i5 = ((iM55680 ^ i3) * 24921) ^ (-1027322685);
                        i6 = -1587850596;
                    } else {
                        iM55680 = (C0946.m55979("֨۬") ^ i3) * 53;
                        i5 = ((iM55680 ^ i4) * (-26261)) ^ 1896102768;
                        i6 = -1689848041;
                    }
                    break;
                case -1830552518:
                case -339873710:
                    i = 4144;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("ۨۧ") + i4) * (-99);
                        i5 = ((iM55680 ^ i3) * 11201) ^ 526054411;
                        i6 = 1439216431;
                    } else {
                        iM55680 = (C0946.m55979("᩶᩻") + i4) * (-49);
                        i5 = ((iM55680 ^ i3) * 8383) ^ 1752300863;
                        i6 = 1476451521;
                    }
                    break;
                case -1723629334:
                case 1905541916:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ۨۧ") + i4) * (-99);
                        i5 = ((iM55680 ^ i3) * 11201) ^ 526054411;
                        i6 = 1439216431;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩹") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-20617)) ^ 199192564;
                        i6 = -1745792533;
                    }
                    break;
                case -1691833639:
                case 1390595293:
                    if (C0955.f81898) {
                        iM55680 = (C0946.m55979("ۨۧ") + i4) * (-99);
                        i5 = ((iM55680 ^ i3) * 11201) ^ 526054411;
                        i6 = 1439216431;
                    } else {
                        iM55680 = C0946.m55979("۟ۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-24233)) ^ (-435021886);
                        i6 = -854340296;
                    }
                    break;
                case -1618324413:
                case 1474756532:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * 26201) ^ 2061162473;
                        i6 = -1641464501;
                    } else {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 7867) ^ (-1600133031);
                        i6 = -69962873;
                    }
                    break;
                case -1198412597:
                case -750194693:
                    C1028.m56247();
                    iM55680 = (C0946.m55979("֨֡") ^ i4) * (-121);
                    i5 = ((iM55680 ^ i3) * 29015) ^ 1072116660;
                    i6 = 2063853519;
                    break;
                case -975104344:
                case -386182177:
                    m9880(activity, c25065M44756, c23074);
                    break;
                case -778752124:
                case 2060163754:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۛᩴ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18007)) ^ 1005601806;
                        i6 = 1462727461;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩵ۙ")) * (-103);
                        i5 = ((iM55680 ^ i3) * 24921) ^ (-1027322685);
                        i6 = -1587850596;
                    }
                    break;
                case -705145371:
                case 1353274108:
                    if (C0927.f81875) {
                        iM55680 = (C0946.m55979("֨֡") ^ i4) * (-121);
                        i5 = ((iM55680 ^ i3) * 29015) ^ 1072116660;
                        i6 = 2063853519;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܽ۫")) * 79;
                        i5 = ((iM55680 ^ i4) * 15759) ^ (-899116503);
                        i6 = 403680380;
                    }
                    break;
                case -673644985:
                case 1543478185:
                    if (C0890.m55740()) {
                        iM55680 = C0946.m55979("ۗ᩵") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-28467)) ^ (-525658790);
                        i6 = 1046621070;
                    } else {
                        iM55680 = (C0946.m55979("֨֡") ^ i4) * (-121);
                        i5 = ((iM55680 ^ i3) * 29015) ^ 1072116660;
                        i6 = 2063853519;
                    }
                    break;
                case -482604037:
                case 386347254:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("֨֡") ^ i4) * (-121);
                        i5 = ((iM55680 ^ i3) * 29015) ^ 1072116660;
                        i6 = 2063853519;
                    } else {
                        iM55680 = C0946.m55979("ۖ᩸") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-21513)) ^ (-271925447);
                        i6 = 447162803;
                    }
                    break;
                case -265244149:
                case 1131686919:
                    C1028.m56247();
                    break;
                case 335028939:
                case 484584167:
                    if (C0894.m55769() >= 0) {
                        iM55680 = (C0946.m55979("ۨۧ") + i4) * (-99);
                        i5 = ((iM55680 ^ i3) * 11201) ^ 526054411;
                        i6 = 1439216431;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ᩳ֡")) * (-13);
                        i5 = ((iM55680 ^ i4) * (-17121)) ^ (-1369404307);
                        i6 = 1518162091;
                    }
                    break;
                case 395864821:
                case 471046355:
                    C8775.m20304();
                    iM55680 = (C0946.m55979("۠ۧ") ^ i4) * (-19);
                    i5 = ((iM55680 ^ i3) * (-26595)) ^ (-882290271);
                    i6 = -830971567;
                    break;
                case 416881456:
                case 1270550937:
                    C0873.m55678();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * 26201) ^ 2061162473;
                        i6 = -1641464501;
                    } else {
                        iM55680 = (C0946.m55979("֨֡") ^ i4) * (-121);
                        i5 = ((iM55680 ^ i3) * 29015) ^ 1072116660;
                        i6 = 2063853519;
                    }
                    break;
                case 1145332546:
                case 1649853915:
                    C19701 c19701M56033 = C0955.m56033(i);
                    c19701M56033.m44746(bArr);
                    C0866.m55644(c19701M56033, str);
                    C0866.m55644(c19701M56033, str2);
                    c25065M44756 = c19701M56033.m44756();
                    if (C0866.m55655(c25065M44756)) {
                        iM55680 = (C0946.m55979("ܺᩴ") ^ i3) * (-115);
                        i5 = ((iM55680 ^ i4) * 31163) ^ (-216215001);
                        i6 = -1904809337;
                    } else {
                        iM55680 = (C0946.m55979("۠ۧ") ^ i4) * (-19);
                        i5 = ((iM55680 ^ i3) * (-26595)) ^ (-882290271);
                        i6 = -830971567;
                    }
                    break;
                default:
                    C0967.m56074();
                    if (!RunnableC1014.m56177()) {
                        iM55680 = C0946.m55979("᩺᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * 26201) ^ 2061162473;
                        i6 = -1641464501;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩵ۙ")) * (-103);
                        i5 = ((iM55680 ^ i3) * 24921) ^ (-1027322685);
                        i6 = -1587850596;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9850(Activity activity, C9552 c9552, String str) {
        int i = -1724329103;
        int i2 = C1053.f81965;
        int i3 = C1012.f81938;
        int iM55680 = (i2 - C0873.m55680("ܰ᩵")) * 13;
        int i4 = ((iM55680 ^ i3) * (-5789)) ^ (-1754546539);
        int i5 = -903685527;
        while (true) {
            i = ((((i ^ i3) * 26675) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1908499194:
                case 1173909079:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i2 - C0873.m55680("᩸ۨ")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-15051)) ^ (-1867349328);
                        i5 = 137338810;
                    } else {
                        iM55680 = (C0873.m55680("ۛۙ") ^ i3) * 23;
                        i4 = ((iM55680 ^ i2) * (-27015)) ^ (-1754240485);
                        i5 = -766078640;
                    }
                    break;
                case -1849906242:
                case -149728284:
                    if (C1046.m56302() != 0) {
                        iM55680 = C0946.m55979("ۢ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31099) ^ 1317304515;
                        i5 = 1285108106;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩷") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8571)) ^ (-753729785);
                        i5 = -2049107225;
                    }
                    break;
                case -1847156441:
                case 3155128:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (C0873.m55680("᩶ܰ") + i2) * (-17);
                        i4 = ((iM55680 ^ i3) * (-23139)) ^ (-661597307);
                        i5 = 701108776;
                    } else {
                        iM55680 = C0946.m55979("ۚۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3383) ^ 1462647072;
                        i5 = -503010543;
                    }
                    break;
                case -1823276206:
                case -1232552838:
                    if (C0946.m55980() != 0) {
                        iM55680 = (i2 - C0873.m55680("᩸ۨ")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-15051)) ^ (-1867349328);
                        i5 = 137338810;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۘۤ")) * 49;
                        i4 = ((iM55680 ^ i2) * (-22383)) ^ (-1440331733);
                        i5 = -1467244060;
                    }
                    break;
                case -1769923638:
                case 1640618739:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("᩶ܰ") + i2) * (-17);
                        i4 = ((iM55680 ^ i3) * (-23139)) ^ (-661597307);
                        i5 = 701108776;
                    } else {
                        iM55680 = C0946.m55979("ܰۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31565) ^ (-1524910984);
                        i5 = -1018192026;
                    }
                    break;
                case -1528440926:
                case 1991237502:
                    C0894.m55769();
                    if (C1028.m56247() >= 0) {
                        iM55680 = (i2 - C0873.m55680("᩸ۨ")) * (-83);
                        i4 = ((iM55680 ^ i3) * (-15051)) ^ (-1867349328);
                        i5 = 137338810;
                    } else {
                        iM55680 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25969) ^ (-761994770);
                        i5 = -1402630403;
                    }
                    break;
                case -1402977514:
                case 570871277:
                    if (!C1025.m56230()) {
                        iM55680 = (i3 - C0946.m55979("᩻᩶")) * 57;
                        i4 = ((iM55680 ^ i2) * 24873) ^ 1428782153;
                        i5 = 644120539;
                    } else {
                        iM55680 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25969) ^ (-761994770);
                        i5 = -1402630403;
                    }
                    break;
                case -1310871686:
                case 718757027:
                    C0892.m55747(new C12701(activity, c9552, str));
                    break;
                case -1062665258:
                case 1652798702:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25969) ^ (-761994770);
                        i5 = -1402630403;
                    } else {
                        iM55680 = C0873.m55680("ܳ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 11697) ^ 15562081;
                        i5 = -1492136861;
                    }
                    break;
                case -488184773:
                case 751637608:
                    if (C0892.m55749()) {
                        iM55680 = C0946.m55979("᩶ۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22635)) ^ (-1350771773);
                        i5 = -826887372;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩻᩶")) * 57;
                        i4 = ((iM55680 ^ i2) * 24873) ^ 1428782153;
                        i5 = 644120539;
                    }
                    break;
                case -312998558:
                case 252015330:
                    C0906.m55809();
                    iM55680 = C0946.m55979("᩷᩺") ^ i3;
                    i4 = ((iM55680 ^ i2) * 25969) ^ (-761994770);
                    i5 = -1402630403;
                    break;
                case -85352136:
                case 1106343695:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0946.m55979("ۢ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31099) ^ 1317304515;
                        i5 = 1285108106;
                    } else {
                        iM55680 = (C0946.m55979("֫ۢ") + i3) * (-107);
                        i4 = ((iM55680 ^ i2) * (-2673)) ^ (-113436812);
                        i5 = -504612271;
                    }
                    break;
                case 818524017:
                case 1714643648:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25969) ^ (-761994770);
                        i5 = -1402630403;
                    } else {
                        iM55680 = C0873.m55680("ܺܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25965)) ^ (-1625361622);
                        i5 = 412211715;
                    }
                    break;
                case 1178340835:
                case 2026239863:
                    if (C1964.f83032 > 0) {
                        iM55680 = (C0873.m55680("᩶ܰ") + i2) * (-17);
                        i4 = ((iM55680 ^ i3) * (-23139)) ^ (-661597307);
                        i5 = 701108776;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩻᩶")) * 57;
                        i4 = ((iM55680 ^ i2) * 24873) ^ 1428782153;
                        i5 = 644120539;
                    }
                    break;
                case 1460677383:
                case 1997181045:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("᩷᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 25969) ^ (-761994770);
                        i5 = -1402630403;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۙܿ")) * 13;
                        i4 = ((iM55680 ^ i3) * 26073) ^ (-1960202221);
                        i5 = 647785532;
                    }
                    break;
                default:
                    AbstractC0942.m55971();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9859(String str, String str2, String str3, Activity activity, C17867 c17867) {
        int i = 0;
        int i2 = 1796404919;
        int i3 = C1036.f81953;
        int i4 = C1046.f81962;
        int iM55680 = C0873.m55680("ᩳۨ") ^ i3;
        int i5 = ((iM55680 ^ i4) * 3323) ^ (-161284549);
        int i6 = -287247664;
        while (true) {
            i2 = ((((i2 ^ i4) * (-429)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2078697658:
                case -1268826056:
                    if (C0927.f81875) {
                        iM55680 = (i4 - C0946.m55979("۟ۖ")) * (-23);
                        i5 = ((iM55680 ^ i3) * (-4613)) ^ (-112639425);
                        i6 = -806875189;
                    } else {
                        iM55680 = C0873.m55680("۟֡") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-22661)) ^ (-707368044);
                        i6 = 258073865;
                    }
                    break;
                case -1061873052:
                case 1210214549:
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i4 - C0946.m55979("۟ۖ")) * (-23);
                        i5 = ((iM55680 ^ i3) * (-4613)) ^ (-112639425);
                        i6 = -806875189;
                    } else {
                        iM55680 = (C0873.m55680("ۡ֫") + i3) * 7;
                        i5 = ((iM55680 ^ i4) * (-29537)) ^ 1886456302;
                        i6 = 1003639548;
                    }
                    break;
                case -1009906644:
                case 449451654:
                    C19701 c19701M55781 = RunnableC0897.m55781(i);
                    C0866.m55644(c19701M55781, str);
                    C0866.m55644(c19701M55781, str2);
                    C0866.m55644(c19701M55781, str3);
                    m9880(activity, c19701M55781.m44756(), c17867);
                    break;
                case -897520096:
                case 1488364757:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i4 - C0946.m55979("۟ۖ")) * (-23);
                        i5 = ((iM55680 ^ i3) * (-4613)) ^ (-112639425);
                        i6 = -806875189;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ᩴۗ")) * 17;
                        i5 = ((iM55680 ^ i3) * (-7841)) ^ 1319145430;
                        i6 = -1894042057;
                    }
                    break;
                case -625538150:
                case -377349698:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i3 - C0873.m55680("᩸ܺ")) * (-101);
                        i5 = ((iM55680 ^ i4) * 9647) ^ 1397024459;
                        i6 = -1584732716;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۗ") + i4) * 119;
                        i5 = ((iM55680 ^ i3) * 31619) ^ 715983060;
                        i6 = 1008901056;
                    }
                    break;
                case -358491990:
                case 1278700083:
                    if (C0873.m55678()) {
                        iM55680 = (i4 - C0946.m55979("۟ۖ")) * (-23);
                        i5 = ((iM55680 ^ i3) * (-4613)) ^ (-112639425);
                        i6 = -806875189;
                    } else {
                        iM55680 = C0873.m55680("ۨ֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18971)) ^ (-1318930498);
                        i6 = 532356567;
                    }
                    break;
                case -136781019:
                case 1128873631:
                    i = C0719o.a.f2896b;
                    if (C0861.f81831) {
                        iM55680 = (C0946.m55979("᩶ۡ") + i3) * (-69);
                        i5 = ((iM55680 ^ i4) * 9923) ^ 1538182111;
                        i6 = -651305146;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ܿۚ")) * (-79);
                        i5 = ((iM55680 ^ i3) * 2461) ^ 1577535704;
                        i6 = 346436095;
                    }
                    break;
                case -111615999:
                case 1637497514:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("֡ۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-18503)) ^ 814551573;
                        i6 = 344522980;
                    } else {
                        iM55680 = (C0946.m55979("ۢۜ") + i4) * (-35);
                        i5 = ((iM55680 ^ i3) * (-13251)) ^ (-1953163083);
                        i6 = 1009003667;
                    }
                    break;
                case -65088357:
                case 1335141635:
                    C1024.m56209();
                    if (C1194.f82045 == 0) {
                        iM55680 = (C0873.m55680("ۡ֫") + i3) * 7;
                        i5 = ((iM55680 ^ i4) * (-29537)) ^ 1886456302;
                        i6 = 1003639548;
                    } else {
                        iM55680 = (C0946.m55979("ۢۜ") + i4) * (-35);
                        i5 = ((iM55680 ^ i3) * (-13251)) ^ (-1953163083);
                        i6 = 1009003667;
                    }
                    break;
                case 43177363:
                case 511021998:
                    C1003.m56123();
                    break;
                case 134278672:
                case 1432455894:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("ۢۜ") + i4) * (-35);
                        i5 = ((iM55680 ^ i3) * (-13251)) ^ (-1953163083);
                        i6 = 1009003667;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ᩸") ^ i3) * 11;
                        i5 = ((iM55680 ^ i4) * (-17127)) ^ 785397193;
                        i6 = 556044315;
                    }
                    break;
                case 472832905:
                case 1810781189:
                    C0937.m55918();
                    C0890.m55740();
                    iM55680 = (C0946.m55979("ۢۜ") + i4) * (-35);
                    i5 = ((iM55680 ^ i3) * (-13251)) ^ (-1953163083);
                    i6 = 1009003667;
                    break;
                case 591609252:
                case 1111502617:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0946.m55979("ۢۜ") + i4) * (-35);
                        i5 = ((iM55680 ^ i3) * (-13251)) ^ (-1953163083);
                        i6 = 1009003667;
                    } else {
                        iM55680 = C0946.m55979("ۧᩳ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-15541)) ^ 1895043183;
                        i6 = -945808832;
                    }
                    break;
                case 750158995:
                case 958496382:
                    if (C1036.f81953 < 0) {
                        iM55680 = (i3 - C0873.m55680("᩸ܺ")) * (-101);
                        i5 = ((iM55680 ^ i4) * 9647) ^ 1397024459;
                        i6 = -1584732716;
                    } else {
                        iM55680 = (i4 - C0946.m55979("۟ۖ")) * (-23);
                        i5 = ((iM55680 ^ i3) * (-4613)) ^ (-112639425);
                        i6 = -806875189;
                    }
                    break;
                case 777837715:
                case 1695875676:
                    if (C0917.f81868) {
                        iM55680 = (i4 - C0946.m55979("ܿۚ")) * (-79);
                        i5 = ((iM55680 ^ i3) * 2461) ^ 1577535704;
                        i6 = 346436095;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۙۘ")) * 57;
                        i5 = ((iM55680 ^ i3) * (-13991)) ^ (-1718850065);
                        i6 = -1519761811;
                    }
                    break;
                default:
                    if (C0937.m55918() >= 0) {
                        iM55680 = (i4 - C0946.m55979("ܿۚ")) * (-79);
                        i5 = ((iM55680 ^ i3) * 2461) ^ 1577535704;
                        i6 = 346436095;
                    } else {
                        iM55680 = C0873.m55680("ᩴۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-15717)) ^ (-1428330487);
                        i6 = 1660521396;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9851(Activity activity, InterfaceC11360 interfaceC11360) {
        int i = -644194783;
        int i2 = C1017.f81942;
        int i3 = C0989.f81920;
        int iM55979 = C0946.m55979("۟ܰ") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-28533)) ^ (-1878688250);
        int i5 = -1630743525;
        while (true) {
            i = ((((i ^ i2) * (-11735)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1953521664:
                case 691875383:
                    if (C1229.m56410() != 0) {
                        iM55979 = C0946.m55979("ۙ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19)) ^ 1062915050;
                        i5 = 1024445449;
                    } else {
                        iM55979 = (C0946.m55979("᩻ܺ") + i3) * 5;
                        i4 = ((iM55979 ^ i2) * (-7585)) ^ 535411384;
                        i5 = 543098519;
                    }
                    break;
                case -1684992756:
                case -323610196:
                    C1036.m56257();
                    C0917.m55854();
                    iM55979 = (i3 - C0946.m55979("ܶܺ")) * (-87);
                    i4 = ((iM55979 ^ i2) * (-14743)) ^ (-2143562453);
                    i5 = 1544519743;
                    break;
                case -1552317511:
                case 866258944:
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22285)) ^ (-419978136);
                        i5 = 1046338030;
                    } else {
                        iM55979 = (C0946.m55979("᩹᩹") ^ i3) * (-121);
                        i4 = ((iM55979 ^ i2) * (-3325)) ^ 653409605;
                        i5 = -1632289965;
                    }
                    break;
                case -1546912119:
                case 651073123:
                    if (C1003.f81929 > 0) {
                        iM55979 = C0946.m55979("ۙ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19)) ^ 1062915050;
                        i5 = 1024445449;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܶܺ")) * (-87);
                        i4 = ((iM55979 ^ i2) * (-14743)) ^ (-2143562453);
                        i5 = 1544519743;
                    }
                    break;
                case -1460836784:
                case -962001103:
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22285)) ^ (-419978136);
                        i5 = 1046338030;
                    } else {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1405)) ^ (-2066839326);
                        i5 = -125342361;
                    }
                    break;
                case -1458144458:
                case -310795404:
                    C1404.m56468();
                    C0873.m55678();
                    break;
                case -1070253352:
                case 316440372:
                    if (RunnableC0897.m55784()) {
                        iM55979 = C0873.m55680("ۨ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-5303)) ^ 857503297;
                        i5 = 1458164880;
                    } else {
                        iM55979 = (C0873.m55680("ۤ᩺") ^ i3) * 15;
                        i4 = ((iM55979 ^ i2) * 31803) ^ 535159619;
                        i5 = 312768849;
                    }
                    break;
                case -880813670:
                case 1602171688:
                    C0989.m56095();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("ܺۙ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * (-15177)) ^ (-1599802005);
                        i5 = 1766339692;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܶܺ")) * (-87);
                        i4 = ((iM55979 ^ i2) * (-14743)) ^ (-2143562453);
                        i5 = 1544519743;
                    }
                    break;
                case -371099879:
                case -66945507:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22285)) ^ (-419978136);
                        i5 = 1046338030;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8467) ^ (-722724987);
                        i5 = -891858326;
                    }
                    break;
                case -259259745:
                case 1810813629:
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("ܺۙ") ^ i2) * (-95);
                        i4 = ((iM55979 ^ i3) * (-15177)) ^ (-1599802005);
                        i5 = 1766339692;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֡ۡ")) * 25;
                        i4 = ((iM55979 ^ i3) * 8945) ^ 57351304;
                        i5 = 1273456445;
                    }
                    break;
                case 295257082:
                case 1336149214:
                    if (C0877.m55696()) {
                        iM55979 = (C0946.m55979("᩶֡") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i3) * 20043) ^ 569592781;
                        i5 = -1686734261;
                    } else {
                        iM55979 = C0873.m55680("ۗۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22285)) ^ (-419978136);
                        i5 = 1046338030;
                    }
                    break;
                case 460239255:
                case 1986611916:
                    if (RunnableC0871.f81839 < 0) {
                        m9880(activity, new C25065(-3), interfaceC11360);
                    }
                    iM55979 = C0873.m55680("ۗۚ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-22285)) ^ (-419978136);
                    i5 = 1046338030;
                    break;
                case 525634556:
                case 1162462937:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("ۨ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-5303)) ^ 857503297;
                        i5 = 1458164880;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܶܺ")) * (-87);
                        i4 = ((iM55979 ^ i2) * (-14743)) ^ (-2143562453);
                        i5 = 1544519743;
                    }
                    break;
                case 820452327:
                case 1530449682:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ۙ֨") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19)) ^ 1062915050;
                        i5 = 1024445449;
                    } else {
                        iM55979 = C0946.m55979("ۘ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18713)) ^ (-78474457);
                        i5 = 890703599;
                    }
                    break;
                default:
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0873.m55680("ۗۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22285)) ^ (-419978136);
                        i5 = 1046338030;
                    } else {
                        iM55979 = C0946.m55979("ۗ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-19361)) ^ (-291885086);
                        i5 = 2035582106;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0288 A[PHI: r6 r7 r11 r12 r16 r17
      0x0288: PHI (r6v5 short) = (r6v3 short), (r6v2 short) binds: [B:62:0x0286, B:34:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r7v5 short) = (r7v3 short), (r7v2 short) binds: [B:62:0x0286, B:34:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r11v4 short[]) = (r11v2 short[]), (r11v5 short[]) binds: [B:62:0x0286, B:34:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r12v4 int) = (r12v2 int), (r12v5 int) binds: [B:62:0x0286, B:34:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r16v17 int) = (r16v7 int), (r16v18 int) binds: [B:62:0x0286, B:34:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x0288: PHI (r17v21 l.ᩳᩴۡ) = (r17v7 l.ᩳᩴۡ), (r17v22 l.ᩳᩴۡ) binds: [B:62:0x0286, B:34:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02c3 A[PHI: r3 r5 r8 r16 r17
      0x02c3: PHI (r3v6 boolean) = (r3v2 boolean), (r3v2 boolean), (r3v3 boolean), (r3v2 boolean) binds: [B:67:0x02c1, B:58:0x025e, B:30:0x0116, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r5v6 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:67:0x02c1, B:58:0x025e, B:30:0x0116, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r8v6 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:67:0x02c1, B:58:0x025e, B:30:0x0116, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r16v33 int) = (r16v6 int), (r16v8 int), (r16v19 int), (r16v34 int) binds: [B:67:0x02c1, B:58:0x025e, B:30:0x0116, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r17v38 l.ᩳᩴۡ) = (r17v6 l.ᩳᩴۡ), (r17v8 l.ᩳᩴۡ), (r17v23 l.ᩳᩴۡ), (r17v39 l.ᩳᩴۡ) binds: [B:67:0x02c1, B:58:0x025e, B:30:0x0116, B:16:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02f8 A[PHI: r9 r16 r17
      0x02f8: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:71:0x02f6, B:54:0x0237, B:13:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r16v26 int) = (r16v5 int), (r16v9 int), (r16v29 int) binds: [B:71:0x02f6, B:54:0x0237, B:13:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x02f8: PHI (r17v33 l.ᩳᩴۡ) = (r17v5 l.ᩳᩴۡ), (r17v9 l.ᩳᩴۡ), (r17v36 l.ᩳᩴۡ) binds: [B:71:0x02f6, B:54:0x0237, B:13:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (p067l.RunnableC0938.f81886 < 0) goto L16;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m9862(String str, ViewOnClickListenerC7928 viewOnClickListenerC7928, C15026 c15026) {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4 = C0989.f81920;
        int i5 = C1229.f82066;
        int iM559711 = (C0946.m55979("᩻ܳ") ^ i5) * (-101);
        int i6 = ((iM559711 ^ i4) * 13235) ^ (-1197790976);
        String packageName = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559711 ^ (-1464208060);
        C19701 c19701M55781 = null;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 719876176;
        C25065 c25065M55668 = null;
        boolean zM55630 = false;
        while (true) {
            int i12 = i7 ^ (i6 & (((i11 ^ i4) * 21373) >> 31));
            switch (i12) {
                case -2090766645:
                case -426512748:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    sArr2 = f81901;
                    i10 = 172;
                    if (C0845.f81821 >= 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = (C0946.m55979("᩷ۧ") + i5) * 49;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i4) * 32189) ^ (-1722135217);
                        i2 = -1067403617;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩸") ^ i5) * 11;
                        i = ((iM55979 ^ i4) * 3291) ^ 1619788000;
                        i2 = 1667226137;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -2048319705:
                case -865369111:
                    i9 = 45906;
                    iM55979 = (C0873.m55680("ᩴۖ") + i5) * 91;
                    i = ((iM55979 ^ i4) * 9129) ^ 1695189754;
                    i2 = 975373318;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1993853558:
                case -164048069:
                    m9880(viewOnClickListenerC7928, c25065M55668, c15026);
                    break;
                case -1960278291:
                case -539016931:
                    i12 = i12;
                    C1012.m56134();
                    break;
                case -1856444459:
                case 261788653:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    packageName = viewOnClickListenerC7928.getPackageName();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i4;
                        i = ((iM55979 ^ i5) * 12865) ^ 925423381;
                        i2 = -1944789955;
                    } else {
                        iM55979 = C0873.m55680("ۤ۟") ^ i4;
                        i = ((iM55979 ^ i5) * (-4039)) ^ 1128292684;
                        i2 = 330426488;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1679234342:
                case 565680125:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    s = sArr[171];
                    s2 = 2;
                    if (C0866.f81837 >= 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = (C0946.m55979("᩷ۧ") + i5) * 49;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i4) * 32189) ^ (-1722135217);
                        i2 = -1067403617;
                    } else {
                        iM55979 = C0946.m55979("ܶۨ") ^ i5;
                        i = ((iM55979 ^ i4) * (-20451)) ^ 796452652;
                        i2 = -1862997663;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1243405708:
                case -972208209:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    zM55630 = C0863.m55630(packageName, C0946.m55986(sArr2, i10, 6, i9));
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۤܳ") ^ i5;
                        i = ((iM55979 ^ i4) * 27051) ^ (-1066294194);
                        i2 = 2050835330;
                    } else {
                        iM55979 = (C0873.m55680("ܽܺ") + i4) * (-5);
                        i = ((iM55979 ^ i5) * 26647) ^ (-493415925);
                        i2 = 1756823274;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1017809239:
                case 476814397:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    sArr = f81901;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ۤܳ") ^ i5;
                        i = ((iM55979 ^ i4) * 27051) ^ (-1066294194);
                        i2 = 2050835330;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩺ۤ")) * (-91);
                        i = ((iM55979 ^ i5) * (-27313)) ^ (-629121411);
                        i2 = -59435460;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1002291200:
                case 706580484:
                    i12 = i12;
                    RunnableC0938.m55938();
                    if (C1053.f81965 > 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = C0946.m55979("۠ᩳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-15701)) ^ (-1237220047);
                        i2 = 721253401;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    }
                    c19701M55781 = c19701M55781;
                    iM55979 = C0873.m55680("᩹ᩳ") ^ i4;
                    i = ((iM55979 ^ i5) * 12865) ^ 925423381;
                    i2 = -1944789955;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -875734518:
                case 1634530033:
                    ServiceConnectionC1013.m56157();
                    break;
                case -808146312:
                case -155461753:
                    if (C0882.f81846) {
                        c19701M55781 = c19701M55781;
                        i12 = i12;
                        iM55979 = C0873.m55680("᩹ᩳ") ^ i4;
                        i = ((iM55979 ^ i5) * 12865) ^ 925423381;
                        i2 = -1944789955;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    } else {
                        int iM55680 = C0873.m55680("ۧۧ") ^ i5;
                        i7 = iM55680 ^ 1974622631;
                        i6 = ((iM55680 ^ i4) * (-21319)) ^ 2048695732;
                        i11 = i12;
                    }
                    break;
                case -799298186:
                case 452754113:
                    i12 = i12;
                    final Map mapM9877 = m9877(C0906.m55815(c25065M55668));
                    if (C1025.f81947 < 0) {
                        m9871(new Consumer() { // from class: l.֨֨ۡ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void m45213n(Object obj) {
                                Map map = null;
                                int i13 = -1562919395;
                                int i14 = C1012.f81938;
                                int i15 = C1025.f81947;
                                int iM559712 = (C0946.m55979("ۨ᩹") + i14) * 97;
                                int i16 = ((iM559712 ^ i15) * (-6535)) ^ (-441221390);
                                int i17 = 2074971687;
                                while (true) {
                                    i13 = ((((i13 ^ i15) * (-31269)) >> 31) & i16) ^ (iM559712 ^ i17);
                                    switch (i13) {
                                        case -2076492147:
                                        case 1654299200:
                                            if (C1229.f82066 < 0) {
                                                iM559712 = C0873.m55680("֨ۜ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * 28275) ^ (-378197983);
                                                i17 = 650588802;
                                            } else {
                                                iM559712 = C0946.m55979("ۤۛ") ^ i14;
                                                i16 = ((iM559712 ^ i15) * 2331) ^ 1712186054;
                                                i17 = -980329273;
                                            }
                                            break;
                                        case -1990601927:
                                        case -767539877:
                                            if (C1929.f83011 == 0) {
                                                iM559712 = C0946.m55979("ۤۛ") ^ i14;
                                                i16 = ((iM559712 ^ i15) * 2331) ^ 1712186054;
                                                i17 = -980329273;
                                            } else {
                                                iM559712 = C0873.m55680("ܰۡ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * (-2761)) ^ (-2128372173);
                                                i17 = 522841716;
                                            }
                                            break;
                                        case -1900281450:
                                        case 1316915386:
                                            if (C0906.m55809() > 0) {
                                                iM559712 = C0946.m55979("۟᩸") ^ i14;
                                                i16 = ((iM559712 ^ i15) * (-21433)) ^ 736252905;
                                                i17 = -678547951;
                                            } else {
                                                iM559712 = C0873.m55680("֨ۜ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * 28275) ^ (-378197983);
                                                i17 = 650588802;
                                            }
                                            break;
                                        case -1789883177:
                                        case 1036622523:
                                            if (C0930.f81879 <= 0) {
                                                iM559712 = C0873.m55680("֨ۜ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * 28275) ^ (-378197983);
                                                i17 = 650588802;
                                            } else {
                                                iM559712 = C0946.m55979("۠ܿ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * (-22241)) ^ 381518341;
                                                i17 = -428398823;
                                            }
                                            break;
                                        case -1530706364:
                                        case 914965806:
                                            if (C1929.m56553()) {
                                                iM559712 = C0946.m55979("֨ܶ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * (-27265)) ^ (-994236135);
                                                i17 = 2050717429;
                                            } else {
                                                iM559712 = C0873.m55680("ܰܳ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * 2123) ^ (-2066104847);
                                                i17 = -393551628;
                                            }
                                            break;
                                        case -1430572553:
                                        case -340866520:
                                            RunnableC0938.m55938();
                                            break;
                                        case -997060685:
                                        case 887864761:
                                            if (C0861.f81831) {
                                                iM559712 = C0946.m55979("ۨᩳ") ^ i14;
                                                i16 = ((iM559712 ^ i15) * (-14679)) ^ 153248720;
                                                i17 = -1525416800;
                                            } else {
                                                iM559712 = C0946.m55979("۟᩸") ^ i14;
                                                i16 = ((iM559712 ^ i15) * (-21433)) ^ 736252905;
                                                i17 = -678547951;
                                            }
                                            break;
                                        case -831107428:
                                        case -187477398:
                                            if (C1017.m56187() <= 0) {
                                                iM559712 = C0946.m55979("֨ܶ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * (-27265)) ^ (-994236135);
                                                i17 = 2050717429;
                                            } else {
                                                iM559712 = (C0873.m55680("۬ۚ") + i15) * C0254q.f1218h;
                                                i16 = ((iM559712 ^ i14) * (-7573)) ^ 1968248231;
                                                i17 = 1381921494;
                                            }
                                            break;
                                        case -409301496:
                                        case 317733547:
                                            if (C0955.f81898) {
                                                iM559712 = C0873.m55680("֨ۜ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * 28275) ^ (-378197983);
                                                i17 = 650588802;
                                            } else {
                                                iM559712 = C0946.m55979("ܰܰ") ^ i14;
                                                i16 = ((iM559712 ^ i15) * (-23561)) ^ (-560802357);
                                                i17 = -577383747;
                                            }
                                            break;
                                        case -173667877:
                                        case 138212676:
                                            ((C17393) obj).f51905 = map;
                                            break;
                                        case -48319059:
                                        case 268916483:
                                            map = mapM9877;
                                            if (RunnableC0897.f81856) {
                                                iM559712 = (i15 - C0946.m55979("ܺ֡")) * 57;
                                                i16 = ((iM559712 ^ i14) * 6043) ^ (-1184364139);
                                                i17 = -2019491251;
                                            } else {
                                                iM559712 = C0946.m55979("֨ܶ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * (-27265)) ^ (-994236135);
                                                i17 = 2050717429;
                                            }
                                            break;
                                        case 116026189:
                                        case 1753313173:
                                            if (C1053.m56327() >= 0) {
                                                iM559712 = C0946.m55979("۟᩸") ^ i14;
                                                i16 = ((iM559712 ^ i15) * (-21433)) ^ 736252905;
                                                i17 = -678547951;
                                            } else {
                                                iM559712 = C0873.m55680("ۙۨ") ^ i14;
                                                i16 = ((iM559712 ^ i15) * 21381) ^ (-180027292);
                                                i17 = 1103614573;
                                            }
                                            break;
                                        case 244092824:
                                        case 1887820696:
                                            C0898.m55800();
                                            C1024.m56209();
                                            iM559712 = C0873.m55680("ܰۡ") ^ i15;
                                            i16 = ((iM559712 ^ i14) * (-2761)) ^ (-2128372173);
                                            i17 = 522841716;
                                            break;
                                        case 432943742:
                                        case 553743667:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM559712 = C0946.m55979("֨ܶ") ^ i15;
                                                i16 = ((iM559712 ^ i14) * (-27265)) ^ (-994236135);
                                                i17 = 2050717429;
                                            } else {
                                                iM559712 = (C0873.m55680("ۧ᩶") + i15) * 47;
                                                i16 = ((iM559712 ^ i14) * 18725) ^ (-1389469418);
                                                i17 = 1104935072;
                                            }
                                            break;
                                        case 470664986:
                                        case 1255130345:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM559712 = C0946.m55979("۟᩸") ^ i14;
                                                i16 = ((iM559712 ^ i15) * (-21433)) ^ 736252905;
                                                i17 = -678547951;
                                            } else {
                                                iM559712 = (C0873.m55680("ۢ۠") ^ i14) * 41;
                                                i16 = ((iM559712 ^ i15) * 26411) ^ (-2144097899);
                                                i17 = -1793511855;
                                            }
                                            break;
                                        default:
                                            if (C0955.f81898) {
                                                iM559712 = C0946.m55979("ۤۛ") ^ i14;
                                                i16 = ((iM559712 ^ i15) * 2331) ^ 1712186054;
                                                i17 = -980329273;
                                            } else {
                                                iM559712 = C0946.m55979("֨᩶") ^ i14;
                                                i16 = ((iM559712 ^ i15) * 14655) ^ (-932076040);
                                                i17 = -1394958184;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM55979 = C0873.m55680("۠᩻") ^ i5;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i4) * (-10687)) ^ (-1590537286);
                        i2 = 1204353511;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    }
                    c19701M55781 = c19701M55781;
                    iM55979 = C0873.m55680("᩹ᩳ") ^ i4;
                    i = ((iM55979 ^ i5) * 12865) ^ 925423381;
                    i2 = -1944789955;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -754567175:
                case 1028750601:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    int i13 = s + s3;
                    if ((i13 * i13) - i8 < 0) {
                        iM55979 = C0873.m55680("ۗ᩶") ^ i4;
                        i = ((iM55979 ^ i5) * 6461) ^ (-1235275395);
                        i2 = 1892363215;
                    } else {
                        iM55979 = (C0873.m55680("ۚ۟") + i4) * 81;
                        i = ((iM55979 ^ i5) * (-21077)) ^ 947086308;
                        i2 = -1698436303;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -744519134:
                case 553962068:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    i8 = (s * s2) + 1;
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("ۤܳ") ^ i5;
                        i = ((iM55979 ^ i4) * 27051) ^ (-1066294194);
                        i2 = 2050835330;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۛ᩻")) * 21;
                        i = ((iM55979 ^ i5) * 15189) ^ 1117703126;
                        i2 = 45890911;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -728858594:
                case 427060796:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    s3 = 1;
                    if (C1036.m56257() <= 0) {
                        iM55979 = C0946.m55979("۠ᩳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-15701)) ^ (-1237220047);
                        i2 = 721253401;
                    } else {
                        iM55979 = (C0946.m55979("ۧۚ") + i5) * (-61);
                        i = ((iM55979 ^ i4) * 30031) ^ (-1585735289);
                        i2 = 1248487479;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -534218800:
                case 1593559574:
                    i12 = i12;
                    c19701M55781.m44745(zM55630);
                    c25065M55668 = RunnableC0871.m55668(c19701M55781);
                    if (!C0930.m55892(c25065M55668)) {
                        iM55979 = C0873.m55680("۠᩻") ^ i5;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i4) * (-10687)) ^ (-1590537286);
                        i2 = 1204353511;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    } else {
                        iM559710 = (C0946.m55979("ᩴ۟") + i4) * 49;
                        i6 = ((iM559710 ^ i5) * (-30447)) ^ (-1810597822);
                        i3 = 1007792276;
                        i11 = i12;
                        i7 = iM559710 ^ i3;
                    }
                    break;
                case -314375477:
                case 2074020501:
                    i12 = i12;
                    c19701M55781 = RunnableC0897.m55781(4153);
                    C0866.m55644(c19701M55781, str);
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM559710 = (i5 - C0946.m55979("ۨ۫")) * 95;
                        i6 = ((iM559710 ^ i4) * (-16971)) ^ (-1847350561);
                        i3 = -1721772311;
                        i11 = i12;
                        i7 = iM559710 ^ i3;
                    } else {
                        iM55979 = (C0946.m55979("᩷ۧ") + i5) * 49;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i4) * 32189) ^ (-1722135217);
                        i2 = -1067403617;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    }
                    break;
                case 177168813:
                case 1209619456:
                    i9 = 57070;
                    iM55979 = (C0873.m55680("ᩴۖ") + i5) * 91;
                    i = ((iM55979 ^ i4) * 9129) ^ 1695189754;
                    i2 = 975373318;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case 1190266455:
                case 1644652737:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ۡܰ") ^ i5;
                        i = ((iM55979 ^ i4) * 30647) ^ (-191276003);
                        i2 = -1382316779;
                    } else {
                        iM55979 = C0946.m55979("۠ᩳ") ^ i4;
                        i = ((iM55979 ^ i5) * (-15701)) ^ (-1237220047);
                        i2 = 721253401;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                default:
                    i12 = i12;
                    C0937.m55918();
                    C0894.m55769();
                    c19701M55781 = c19701M55781;
                    iM55979 = C0873.m55680("ۤܳ") ^ i5;
                    i = ((iM55979 ^ i4) * 27051) ^ (-1066294194);
                    i2 = 2050835330;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9853(Activity activity, C23883 c23883) {
        int i = 0;
        C25065 c25065M56232 = null;
        final Map mapM9877 = null;
        int i2 = 1926881614;
        int i3 = C1053.f81965;
        int i4 = C1229.f82066;
        int iM55979 = C0946.m55979("֨ۙ") ^ i3;
        int i5 = ((iM55979 ^ i4) * (-31111)) ^ 664907352;
        int i6 = 1790123876;
        while (true) {
            i2 = ((((i2 ^ i4) * 26243) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2084844374:
                case -36141241:
                    if (C1028.m56247() < 0) {
                        iM55979 = (i4 - C0873.m55680("۫ۙ")) * (-61);
                        i5 = ((iM55979 ^ i3) * (-29983)) ^ (-108854886);
                        i6 = 1202905766;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۗۡ")) * 53;
                        i5 = ((iM55979 ^ i4) * 21465) ^ 1720879423;
                        i6 = 312182769;
                    }
                    break;
                case -1971658511:
                case -998460121:
                    C0937.m55918();
                    iM55979 = (C0946.m55979("ۘۘ") + i3) * (-53);
                    i5 = ((iM55979 ^ i4) * 12175) ^ (-417356310);
                    i6 = -1844330596;
                    break;
                case -1777838968:
                case -351583001:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("᩶ۛ") + i4) * (-3);
                        i5 = ((iM55979 ^ i3) * 5689) ^ (-123798503);
                        i6 = 1771581974;
                    } else {
                        iM55979 = C0873.m55680("ۜܳ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-27765)) ^ 120689805;
                        i6 = -337161316;
                    }
                    break;
                case -1657710831:
                case -1135446593:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (i4 - C0873.m55680("۫ۙ")) * (-61);
                        i5 = ((iM55979 ^ i3) * (-29983)) ^ (-108854886);
                        i6 = 1202905766;
                    } else {
                        iM55979 = C0946.m55979("᩵᩸") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-28329)) ^ 138659452;
                        i6 = -15030402;
                    }
                    break;
                case -1416225323:
                case 464061530:
                    mapM9877 = m9877(ViewOnClickListenerC0939.m55952(c25065M56232));
                    if (C0854.f81826 != 0) {
                        iM55979 = (i3 - C0946.m55979("ۗۡ")) * 53;
                        i5 = ((iM55979 ^ i4) * 21465) ^ 1720879423;
                        i6 = 312182769;
                    } else {
                        iM55979 = (C0946.m55979("ܿۡ") ^ i4) * 89;
                        i5 = ((iM55979 ^ i3) * (-29857)) ^ 336625173;
                        i6 = -2129651941;
                    }
                    break;
                case -1162896348:
                case 1120657599:
                    C0967.m56074();
                    break;
                case -1129005031:
                case 768124853:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ۘۘ") + i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 12175) ^ (-417356310);
                        i6 = -1844330596;
                    } else {
                        iM55979 = (C0946.m55979("֡ۨ") + i4) * (-71);
                        i5 = ((iM55979 ^ i3) * (-8599)) ^ (-513974102);
                        i6 = -642615222;
                    }
                    break;
                case -563651827:
                case 984611764:
                    RunnableC0938.m55938();
                    if (C1124.f82007 < 0) {
                        iM55979 = (i3 - C0946.m55979("ۗۡ")) * 53;
                        i5 = ((iM55979 ^ i4) * 21465) ^ 1720879423;
                        i6 = 312182769;
                    } else {
                        iM55979 = (C0946.m55979("ۘۘ") + i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 12175) ^ (-417356310);
                        i6 = -1844330596;
                    }
                    break;
                case 28521906:
                case 1323904154:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۗۡ")) * 53;
                        i5 = ((iM55979 ^ i4) * 21465) ^ 1720879423;
                        i6 = 312182769;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۟ܳ")) * 37;
                        i5 = ((iM55979 ^ i4) * (-14143)) ^ (-2109090833);
                        i6 = -1124419343;
                    }
                    break;
                case 389308555:
                case 1342692879:
                    c25065M56232 = C1025.m56232(C0955.m56033(i));
                    if (C0866.m55655(c25065M56232)) {
                        iM55979 = C0946.m55979("ۘ᩶") ^ i4;
                        i5 = ((iM55979 ^ i3) * 10119) ^ 35085720;
                        i6 = -1436995709;
                    } else {
                        iM55979 = (C0873.m55680("ۧܰ") ^ i3) * 67;
                        i5 = ((iM55979 ^ i4) * 45) ^ (-2013511076);
                        i6 = -1928807741;
                    }
                    break;
                case 502149481:
                case 1511476492:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("ܰ᩸") + i3) * (-101);
                        i5 = ((iM55979 ^ i4) * (-30831)) ^ (-1811480639);
                        i6 = 1236369642;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩹") + i3) * 21;
                        i5 = ((iM55979 ^ i4) * (-6653)) ^ 1553999437;
                        i6 = -135155879;
                    }
                    break;
                case 519104826:
                case 989426812:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (C0873.m55680("᩶ۛ") + i4) * (-3);
                        i5 = ((iM55979 ^ i3) * 5689) ^ (-123798503);
                        i6 = 1771581974;
                    } else {
                        iM55979 = (C0946.m55979("ۘۘ") + i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 12175) ^ (-417356310);
                        i6 = -1844330596;
                    }
                    break;
                case 779737336:
                case 1567359334:
                    if (RunnableC1014.f81941 > 0) {
                        m9871(new Consumer() { // from class: l.᩸֨ۡ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void m45213n(Object obj) {
                                Map map = null;
                                int i7 = 85705452;
                                int i8 = C1964.f83032;
                                int i9 = RunnableC0938.f81886;
                                int iM559710 = C0946.m55979("ᩳ᩵") ^ i9;
                                int i10 = ((iM559710 ^ i8) * (-3001)) ^ (-1767024223);
                                int i11 = 1821781304;
                                while (true) {
                                    i7 = ((((i7 ^ i8) * (-18463)) >> 31) & i10) ^ (iM559710 ^ i11);
                                    switch (i7) {
                                        case -1970019291:
                                        case 718251049:
                                            C0898.m55800();
                                            if (C0927.f81875) {
                                                iM559710 = (C0873.m55680("ܽ᩷") + i8) * (-73);
                                                i10 = ((iM559710 ^ i9) * (-24247)) ^ (-1630653678);
                                                i11 = 1792337053;
                                            } else {
                                                iM559710 = C0873.m55680("᩵᩻") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-3215)) ^ 2093082632;
                                                i11 = -861368971;
                                            }
                                            break;
                                        case -1824278562:
                                        case -119488029:
                                            if (C0873.m55678()) {
                                                iM559710 = C0873.m55680("ܶ֡") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-28913)) ^ 562007858;
                                                i11 = -1154703832;
                                            } else {
                                                iM559710 = (C0873.m55680("֨֫") + i9) * 69;
                                                i10 = ((iM559710 ^ i8) * (-31803)) ^ (-1941385304);
                                                i11 = 396613246;
                                            }
                                            break;
                                        case -1764537472:
                                        case -1508609716:
                                            if (C0992.f81922 >= 0) {
                                                iM559710 = C0873.m55680("᩵᩻") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-3215)) ^ 2093082632;
                                                i11 = -861368971;
                                            } else {
                                                iM559710 = C0873.m55680("ܳ᩹") ^ i8;
                                                i10 = ((iM559710 ^ i9) * 2647) ^ 158431998;
                                                i11 = 1064691158;
                                            }
                                            break;
                                        case -1284761145:
                                        case -112671440:
                                            C0927.m55873();
                                            break;
                                        case -1125716108:
                                        case -19261552:
                                            map = mapM9877;
                                            if (C0894.f81854 >= 0) {
                                                iM559710 = C0873.m55680("᩻᩵") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 3123) ^ 1959247624;
                                                i11 = 1164022423;
                                            } else {
                                                iM559710 = C0873.m55680("ܿ᩺") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 20445) ^ 1759489412;
                                                i11 = 1868326783;
                                            }
                                            break;
                                        case -1096432196:
                                        case 375770387:
                                            RunnableC0938.m55938();
                                            iM559710 = C0873.m55680("᩵᩻") ^ i8;
                                            i10 = ((iM559710 ^ i9) * (-3215)) ^ 2093082632;
                                            i11 = -861368971;
                                            break;
                                        case -1096270892:
                                        case 177609363:
                                            if (C0912.f81867 <= 0) {
                                                iM559710 = (C0873.m55680("ܽ۟") ^ i9) * 49;
                                                i10 = ((iM559710 ^ i8) * 12979) ^ (-2032825314);
                                                i11 = 1389891156;
                                            } else {
                                                iM559710 = C0873.m55680("۬ᩴ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-30391)) ^ 1164470470;
                                                i11 = -1756548073;
                                            }
                                            break;
                                        case -886086266:
                                        case -31458707:
                                            C0845.m55584();
                                            if (ServiceConnectionC1013.f81940 < 0) {
                                                iM559710 = (C0873.m55680("ܽ۟") ^ i9) * 49;
                                                i10 = ((iM559710 ^ i8) * 12979) ^ (-2032825314);
                                                i11 = 1389891156;
                                            } else {
                                                iM559710 = C0873.m55680("᩵᩻") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-3215)) ^ 2093082632;
                                                i11 = -861368971;
                                            }
                                            break;
                                        case -786066213:
                                        case 1898625641:
                                            if (C0894.f81854 >= 0) {
                                                iM559710 = C0873.m55680("᩵᩻") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-3215)) ^ 2093082632;
                                                i11 = -861368971;
                                            } else {
                                                iM559710 = (i8 - C0873.m55680("֡֨")) * 21;
                                                i10 = ((iM559710 ^ i9) * (-28487)) ^ (-1817492902);
                                                i11 = -45907220;
                                            }
                                            break;
                                        case -729742617:
                                        case 2005098150:
                                            if (C0890.f81849 != 0) {
                                                iM559710 = C0873.m55680("ܶ֡") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-28913)) ^ 562007858;
                                                i11 = -1154703832;
                                            } else {
                                                iM559710 = (C0873.m55680("ܽ۟") ^ i9) * 49;
                                                i10 = ((iM559710 ^ i8) * 12979) ^ (-2032825314);
                                                i11 = 1389891156;
                                            }
                                            break;
                                        case -726201921:
                                        case 577512854:
                                            if (C1036.m56257() <= 0) {
                                                iM559710 = C0873.m55680("ܶ֡") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-28913)) ^ 562007858;
                                                i11 = -1154703832;
                                            } else {
                                                iM559710 = (C0873.m55680("۟ᩳ") ^ i8) * 83;
                                                i10 = ((iM559710 ^ i9) * (-11273)) ^ (-883173171);
                                                i11 = -1006480255;
                                            }
                                            break;
                                        case -220226822:
                                        case 112073269:
                                            if (C1053.m56327() >= 0) {
                                                iM559710 = (C0873.m55680("ܽ۟") ^ i9) * 49;
                                                i10 = ((iM559710 ^ i8) * 12979) ^ (-2032825314);
                                                i11 = 1389891156;
                                            } else {
                                                iM559710 = C0946.m55979("۠ᩳ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-5091)) ^ 730800927;
                                                i11 = 804839415;
                                            }
                                            break;
                                        case -42550160:
                                        case 976808380:
                                            if (C1017.f81942 >= 0) {
                                                iM559710 = C0873.m55680("ܶ֡") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-28913)) ^ 562007858;
                                                i11 = -1154703832;
                                            } else {
                                                iM559710 = C0946.m55979("᩸ۤ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * 27915) ^ (-670463958);
                                                i11 = -1499231663;
                                            }
                                            break;
                                        case -21019826:
                                        case 146551680:
                                            ((C17393) obj).f51905 = map;
                                            break;
                                        case 1161307743:
                                        case 1189724349:
                                            if (C1053.m56327() >= 0) {
                                                iM559710 = C0873.m55680("᩻᩵") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 3123) ^ 1959247624;
                                                i11 = 1164022423;
                                            } else {
                                                iM559710 = C0946.m55979("ܰۚ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-28965)) ^ (-1858028541);
                                                i11 = -523665175;
                                            }
                                            break;
                                        default:
                                            if (RunnableC0897.m55784()) {
                                                iM559710 = C0873.m55680("᩻᩵") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 3123) ^ 1959247624;
                                                i11 = 1164022423;
                                            } else {
                                                iM559710 = C0946.m55979("ۤۙ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-1039)) ^ (-1791781419);
                                                i11 = -1282464055;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM55979 = (C0873.m55680("ۧܰ") ^ i3) * 67;
                        i5 = ((iM55979 ^ i4) * 45) ^ (-2013511076);
                        i6 = -1928807741;
                    } else {
                        iM55979 = (C0946.m55979("ۘۘ") + i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 12175) ^ (-417356310);
                        i6 = -1844330596;
                    }
                    break;
                case 962291328:
                case 1124876648:
                    m9880(activity, c25065M56232, c23883);
                    break;
                case 1592754301:
                case 1915470923:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("᩶ۛ") + i4) * (-3);
                        i5 = ((iM55979 ^ i3) * 5689) ^ (-123798503);
                        i6 = 1771581974;
                    } else {
                        iM55979 = (i3 - C0873.m55680("֫ۗ")) * 19;
                        i5 = ((iM55979 ^ i4) * (-3871)) ^ 1845483413;
                        i6 = -1641800303;
                    }
                    break;
                case 1768046808:
                case 2142536180:
                    i = 4161;
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("ܰ᩸") + i3) * (-101);
                        i5 = ((iM55979 ^ i4) * (-30831)) ^ (-1811480639);
                        i6 = 1236369642;
                    } else {
                        iM55979 = C0946.m55979("֡ᩳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26193) ^ (-1522688727);
                        i6 = 594051409;
                    }
                    break;
                default:
                    if (C0917.f81868) {
                        iM55979 = (i4 - C0873.m55680("۫ۙ")) * (-61);
                        i5 = ((iM55979 ^ i3) * (-29983)) ^ (-108854886);
                        i6 = 1202905766;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩻") ^ i4;
                        i5 = ((iM55979 ^ i3) * 32203) ^ 1952594759;
                        i6 = 1526428087;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02ca A[PHI: r4 r5 r16 r17 r18
      0x02ca: PHI (r4v7 short[]) = (r4v2 short[]), (r4v3 short[]), (r4v2 short[]), (r4v2 short[]) binds: [B:68:0x02c8, B:64:0x02a2, B:60:0x0276, B:40:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r5v7 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:68:0x02c8, B:64:0x02a2, B:60:0x0276, B:40:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r16v39 boolean) = (r16v5 boolean), (r16v6 boolean), (r16v7 boolean), (r16v41 boolean) binds: [B:68:0x02c8, B:64:0x02a2, B:60:0x0276, B:40:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r17v23 l.ᩳᩴۡ) = (r17v2 l.ᩳᩴۡ), (r17v3 l.ᩳᩴۡ), (r17v4 l.ᩳᩴۡ), (r17v26 l.ᩳᩴۡ) binds: [B:68:0x02c8, B:64:0x02a2, B:60:0x0276, B:40:0x0161] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r18v28 java.lang.String) = (r18v2 java.lang.String), (r18v3 java.lang.String), (r18v4 java.lang.String), (r18v30 java.lang.String) binds: [B:68:0x02c8, B:64:0x02a2, B:60:0x0276, B:40:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9855(String str, Activity activity, C7651 c7651) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        C19701 c19701M56033 = null;
        String packageName = null;
        boolean zM55630 = false;
        C25065 c25065M44756 = null;
        short[] sArr = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 1986715716;
        int i10 = C0873.f81841;
        int i11 = AbstractC0942.f81890;
        int iM55979 = C0946.m55979("ۛۨ") ^ i10;
        int i12 = ((iM55979 ^ i11) * (-4059)) ^ (-1293853498);
        int i13 = -1054440371;
        while (true) {
            int i14 = iM55979 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i11) * 13779) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2014873432:
                    case -426976128:
                        c19701M56033.m44745(zM55630);
                        c25065M44756 = c19701M56033.m44756();
                        if (C0930.m55892(c25065M44756)) {
                            int iM55682 = (C0873.m55680("ۨܿ") ^ i11) * (-33);
                            c19701M56033 = c19701M56033;
                            i12 = ((iM55682 ^ i10) * 16621) ^ (-1574584477);
                            i14 = iM55682 ^ (-2063565121);
                        } else {
                            c19701M56033 = c19701M56033;
                            iM55681 = C0873.m55680("ܳۨ") ^ i10;
                            zM55630 = zM55630;
                            i3 = ((iM55681 ^ i11) * 4589) ^ 1784913172;
                            i4 = 1268011277;
                            i14 = iM55681 ^ i4;
                            i12 = i3;
                            zM55630 = zM55630;
                        }
                        c19701M56033 = c19701M56033;
                        break;
                    case -1972279757:
                    case 1628143961:
                        i7 = 11747;
                        iM55680 = (C0946.m55979("ۖۤ") + i10) * 19;
                        i = ((iM55680 ^ i11) * (-25177)) ^ 1769803852;
                        i2 = 654434731;
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -1933222950:
                    case 287594590:
                        m9880(activity, c25065M44756, c7651);
                        break;
                    case -1906208220:
                    case -74269431:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        if (RunnableC1014.f81941 <= 0) {
                            iM55680 = C0946.m55979("᩹֨") ^ i11;
                            i = ((iM55680 ^ i10) * 559) ^ 1601564825;
                            i2 = 794567631;
                        } else {
                            iM55680 = C0873.m55680("۟ۘ") ^ i10;
                            i = ((iM55680 ^ i11) * (-25763)) ^ 852787002;
                            i2 = -1158198474;
                        }
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -1684623258:
                    case 1029010408:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        if (C1404.f82149 < 0) {
                            iM55680 = C0873.m55680("᩵᩷") ^ i11;
                            i = ((iM55680 ^ i10) * 17009) ^ (-1595464102);
                            i2 = -1388610520;
                            i14 = iM55680 ^ i2;
                            i12 = i;
                            zM55630 = zM55630;
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                        }
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        int iM559710 = C0946.m55979("᩸ܺ") ^ i10;
                        c19701M56033 = c19701M56033;
                        i12 = ((iM559710 ^ i11) * 11843) ^ 879860256;
                        i14 = iM559710 ^ (-2073590232);
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -1674567977:
                    case 385423298:
                        packageName = packageName;
                        zM55630 = zM55630;
                        c19701M56033 = C0955.m56033(4137);
                        C0930.m55884(c19701M56033, str);
                        if (C1124.f82007 < 0) {
                            int iM559711 = C0946.m55979("ۘۨ") ^ i11;
                            c19701M56033 = c19701M56033;
                            i12 = ((iM559711 ^ i10) * 17213) ^ (-1604587865);
                            i14 = iM559711 ^ 1381614345;
                            zM55630 = zM55630;
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                        } else {
                            zM55630 = zM55630;
                            int iM559712 = C0946.m55979("᩸ܺ") ^ i10;
                            c19701M56033 = c19701M56033;
                            i12 = ((iM559712 ^ i11) * 11843) ^ 879860256;
                            i14 = iM559712 ^ (-2073590232);
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                        }
                        break;
                    case -1124559117:
                    case 104464166:
                        i7 = 12850;
                        iM55680 = (C0946.m55979("ۖۤ") + i10) * 19;
                        i = ((iM55680 ^ i11) * (-25177)) ^ 1769803852;
                        i2 = 654434731;
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -1027175297:
                    case 1141988050:
                        C0854.m55595();
                        if (C0949.f81897 < 0) {
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                            zM55630 = zM55630;
                            iM55680 = C0946.m55979("᩹֨") ^ i11;
                            i = ((iM55680 ^ i10) * 559) ^ 1601564825;
                            i2 = 794567631;
                            i14 = iM55680 ^ i2;
                            i12 = i;
                            zM55630 = zM55630;
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                        } else {
                            iM55979 = (C0873.m55680("۬᩸") ^ i10) * (-57);
                            i12 = ((iM55979 ^ i11) * (-6437)) ^ (-1940855348);
                            i13 = -1280236422;
                        }
                        break;
                    case -1026117078:
                    case 1952804848:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        if ((229401316 + i6) - i5 < 0) {
                            iM55680 = (C0873.m55680("֫᩸") ^ i10) * (-45);
                            i = ((iM55680 ^ i11) * (-21785)) ^ 1058950900;
                            i2 = 1845685608;
                        } else {
                            iM55680 = C0873.m55680("ۡᩳ") ^ i11;
                            i = ((iM55680 ^ i10) * 22397) ^ 1433933774;
                            i2 = 1351851799;
                        }
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -883147657:
                    case 2105042428:
                        C0906.m55809();
                        C1929.m56553();
                        int iM559713 = C0946.m55979("᩸ܺ") ^ i10;
                        c19701M56033 = c19701M56033;
                        i12 = ((iM559713 ^ i11) * 11843) ^ 879860256;
                        i14 = iM559713 ^ (-2073590232);
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -780941954:
                    case 958539144:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        s = sArr[141];
                        if (C1017.m56187() <= 0) {
                            iM55680 = C0946.m55979("ۗۚ") ^ i11;
                            i = ((iM55680 ^ i10) * (-13797)) ^ (-1515753755);
                            i2 = 672218202;
                        } else {
                            iM55680 = (C0946.m55979("᩶ᩳ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i = ((iM55680 ^ i10) * (-24109)) ^ (-1458928984);
                            i2 = -1012194628;
                        }
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -556510548:
                    case 1381751897:
                        RunnableC0938.m55938();
                        break;
                    case -532185175:
                    case 191950271:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        if (C1964.f83032 <= 0) {
                            iM55680 = C0946.m55979("ۗۚ") ^ i11;
                            i = ((iM55680 ^ i10) * (-13797)) ^ (-1515753755);
                            i2 = 672218202;
                        } else {
                            iM55680 = C0946.m55979("ۧ᩷") ^ i11;
                            i = ((iM55680 ^ i10) * (-32477)) ^ (-1018608130);
                            i2 = -1506009073;
                        }
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -530070830:
                    case 1359686675:
                        C8775.m20304();
                        c19701M56033 = c19701M56033;
                        iM55681 = C0873.m55680("ܳۨ") ^ i10;
                        zM55630 = zM55630;
                        i3 = ((iM55681 ^ i11) * 4589) ^ 1784913172;
                        i4 = 1268011277;
                        i14 = iM55681 ^ i4;
                        i12 = i3;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        break;
                    case -258580484:
                    case 1242097597:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        sArr = f81901;
                        if (C0937.m55918() >= 0) {
                            iM55680 = C0946.m55979("ۗۚ") ^ i11;
                            i = ((iM55680 ^ i10) * (-13797)) ^ (-1515753755);
                            i2 = 672218202;
                        } else {
                            iM55680 = C0946.m55979("᩷ᩴ") ^ i10;
                            i = ((iM55680 ^ i11) * 6005) ^ 586668046;
                            i2 = -1950325531;
                        }
                        i14 = iM55680 ^ i2;
                        i12 = i;
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case -78059946:
                    case 1115311674:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        i5 = s * 30292;
                        i6 = s * s;
                        if (C0863.f81833 > 0) {
                            iM55680 = C0946.m55979("ۗ۬") ^ i10;
                            i = ((iM55680 ^ i11) * (-15039)) ^ 1599335402;
                            i2 = 785734211;
                            i14 = iM55680 ^ i2;
                            i12 = i;
                            zM55630 = zM55630;
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                        }
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        int iM559714 = C0946.m55979("᩸ܺ") ^ i10;
                        c19701M56033 = c19701M56033;
                        i12 = ((iM559714 ^ i11) * 11843) ^ 879860256;
                        i14 = iM559714 ^ (-2073590232);
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case 83072922:
                    case 1160772092:
                        c19701M56033 = c19701M56033;
                        zM55630 = zM55630;
                        packageName = activity.getPackageName();
                        if (ViewOnClickListenerC0939.f81888 > 0) {
                            iM55681 = (C0946.m55979("ۡ۠") ^ i10) * 49;
                            i3 = ((iM55681 ^ i11) * 1831) ^ (-1760197490);
                            i4 = 280730639;
                            i14 = iM55681 ^ i4;
                            i12 = i3;
                            zM55630 = zM55630;
                            c19701M56033 = c19701M56033;
                        } else {
                            packageName = packageName;
                            iM55680 = C0946.m55979("ۗۚ") ^ i11;
                            i = ((iM55680 ^ i10) * (-13797)) ^ (-1515753755);
                            i2 = 672218202;
                            i14 = iM55680 ^ i2;
                            i12 = i;
                            zM55630 = zM55630;
                            c19701M56033 = c19701M56033;
                            packageName = packageName;
                        }
                        break;
                    case 312131982:
                    case 1264747269:
                        c19701M56033 = c19701M56033;
                        zM55630 = C0863.m55630(packageName, C1003.m56132(sArr2, i8, 6, i7));
                        if (C0863.f81833 <= 0) {
                            c19701M56033 = c19701M56033;
                            int iM559715 = C0946.m55979("᩸ܺ") ^ i10;
                            c19701M56033 = c19701M56033;
                            i12 = ((iM559715 ^ i11) * 11843) ^ 879860256;
                            i14 = iM559715 ^ (-2073590232);
                        } else {
                            int iM55683 = (C0873.m55680("ۧۙ") ^ i11) * (-49);
                            packageName = packageName;
                            i14 = iM55683 ^ (-1880436225);
                            i12 = ((iM55683 ^ i10) * (-11083)) ^ (-647527835);
                        }
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case 1258440710:
                    case 1499755662:
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        zM55630 = zM55630;
                        sArr2 = f81901;
                        i8 = 142;
                        if (C0947.f81895) {
                            iM55680 = C0946.m55979("᩹֨") ^ i11;
                            i = ((iM55680 ^ i10) * 559) ^ 1601564825;
                            i2 = 794567631;
                            i14 = iM55680 ^ i2;
                            i12 = i;
                        } else {
                            int iM559716 = C0946.m55979("ᩳۙ") ^ i11;
                            i14 = iM559716 ^ 1144222923;
                            i12 = ((iM559716 ^ i10) * (-10291)) ^ (-115680276);
                        }
                        zM55630 = zM55630;
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                    case 2022808029:
                    case 2126211386:
                        AbstractC0942.m55971();
                        if (!C0866.m55645()) {
                            iM55979 = C0946.m55979("ۢ᩻") ^ i10;
                            i12 = ((iM55979 ^ i11) * 13109) ^ 1255531105;
                            i13 = 513890893;
                        } else {
                            iM55979 = (C0873.m55680("۬᩸") ^ i10) * (-57);
                            i12 = ((iM55979 ^ i11) * (-6437)) ^ (-1940855348);
                            i13 = -1280236422;
                        }
                        break;
                    default:
                        C1053.m56327();
                        if (C1229.f82066 < 0) {
                            iM55979 = (C0873.m55680("۬᩸") ^ i10) * (-57);
                            i12 = ((iM55979 ^ i11) * (-6437)) ^ (-1940855348);
                            i13 = -1280236422;
                        }
                        int iM559717 = C0946.m55979("᩸ܺ") ^ i10;
                        c19701M56033 = c19701M56033;
                        i12 = ((iM559717 ^ i11) * 11843) ^ 879860256;
                        i14 = iM559717 ^ (-2073590232);
                        c19701M56033 = c19701M56033;
                        packageName = packageName;
                        break;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (p067l.C1036.m56257() <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m9858(String str, String str2, Activity activity, C12484 c12484) {
        long j;
        long j2;
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        int iM559711;
        int i5;
        int i6;
        long jM55808 = 0;
        long j3 = 0;
        long j4 = 0;
        C19701 c19701M55781 = null;
        C25065 c25065M44756 = null;
        int i7 = 838742634;
        int i8 = C1036.f81953;
        int i9 = C0877.f81843;
        int iM559712 = C0946.m55979("۬᩺") ^ i9;
        int i10 = ((iM559712 ^ i8) * 23895) ^ (-1457905299);
        int i11 = iM559712 ^ (-889825474);
        while (true) {
            i7 = ((((i7 ^ i8) * (-17031)) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2048469944:
                case 303436372:
                    SystemClock.sleep(j4 - j3);
                    int iM559713 = C0946.m55979("֨᩹") ^ i8;
                    j = jM55808;
                    i10 = ((iM559713 ^ i9) * 3069) ^ 1223310994;
                    i11 = (-1074751751) ^ iM559713;
                    jM55808 = j;
                    break;
                case -1808900196:
                case -220472069:
                    RunnableC0938.m55938();
                    if (C0930.f81879 <= 0) {
                        j = jM55808;
                        j2 = j3;
                        iM55979 = C0873.m55680("ۚ᩶") ^ i9;
                        i = ((iM55979 ^ i8) * 24371) ^ 739710572;
                        i2 = -1658477137;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    }
                    j = jM55808;
                    j2 = j3;
                    iM55979 = (i9 - C0946.m55979("ۢۜ")) * 39;
                    i = ((iM55979 ^ i8) * 26779) ^ (-1793213606);
                    i2 = 1447021777;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
                case -1693471299:
                case 610789032:
                    j3 = jM55808 - f10458;
                    if (j3 < 30000) {
                        int iM55680 = (C0873.m55680("᩹᩺") + i9) * (-27);
                        i10 = ((iM55680 ^ i8) * 17641) ^ (-808542201);
                        i11 = (-279383006) ^ iM55680;
                        j4 = 30000;
                    } else {
                        j4 = 30000;
                        int iM559714 = C0946.m55979("֨᩹") ^ i8;
                        j = jM55808;
                        i10 = ((iM559714 ^ i9) * 3069) ^ 1223310994;
                        i11 = (-1074751751) ^ iM559714;
                        jM55808 = j;
                    }
                    break;
                case -1687249318:
                case 97721158:
                    C0866.m55644(c19701M55781, str2);
                    c25065M44756 = c19701M55781.m44756();
                    if (C0866.m55655(c25065M44756)) {
                        iM559711 = (C0946.m55979("۠ܿ") ^ i8) * 73;
                        i5 = ((iM559711 ^ i9) * (-8153)) ^ (-599030924);
                        i6 = -35082742;
                    } else {
                        iM559711 = C0873.m55680("ۖᩳ") ^ i9;
                        i5 = ((iM559711 ^ i8) * (-11913)) ^ 60362580;
                        i6 = 1671369246;
                    }
                    i11 = iM559711 ^ i6;
                    i10 = i5;
                    break;
                case -1569149794:
                case -69951164:
                    ServiceConnectionC1013.m56157();
                    j = jM55808;
                    j2 = j3;
                    iM55979 = (i8 - C0873.m55680("ܺۤ")) * 45;
                    i = ((iM55979 ^ i9) * (-21835)) ^ 867874657;
                    i2 = -1365933673;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
                case -1265154486:
                case 1153023021:
                    j = jM55808;
                    j2 = j3;
                    if (C0854.m55595() < 0) {
                        iM55979 = (i8 - C0946.m55979("ᩳ᩶")) * (-59);
                        i = ((iM55979 ^ i9) * 23599) ^ (-285397587);
                        i2 = -2139593049;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    } else {
                        jM55808 = j;
                        iM559710 = (i8 - C0946.m55979("֫ܿ")) * (-75);
                        i3 = ((iM559710 ^ i9) * 25419) ^ 1643201886;
                        i4 = -417704730;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        j3 = j2;
                    }
                    break;
                case -1133824514:
                case 38488998:
                    j2 = j3;
                    jM55808 = C0906.m55808();
                    if (C0992.m56107() <= 0) {
                        iM559710 = (i8 - C0946.m55979("֫ܿ")) * (-75);
                        i3 = ((iM559710 ^ i9) * 25419) ^ 1643201886;
                        i4 = -417704730;
                    } else {
                        iM559710 = C0873.m55680("᩸ۚ") ^ i9;
                        i3 = ((iM559710 ^ i8) * (-13373)) ^ 1067579563;
                        i4 = -1439971369;
                    }
                    i11 = iM559710 ^ i4;
                    i10 = i3;
                    j3 = j2;
                    break;
                case -1129110093:
                case 414983925:
                    C1017.m56187();
                    if (C1025.f81947 < 0) {
                        j = jM55808;
                        j2 = j3;
                        iM55979 = (C0873.m55680("ۧۗ") ^ i8) * 97;
                        i = ((iM55979 ^ i9) * (-26505)) ^ 1485505775;
                        i2 = -1900423074;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    }
                    j = jM55808;
                    j2 = j3;
                    iM55979 = (i9 - C0946.m55979("ۢۜ")) * 39;
                    i = ((iM55979 ^ i8) * 26779) ^ (-1793213606);
                    i2 = 1447021777;
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
                case -1087425999:
                case -449189116:
                    j = jM55808;
                    j2 = j3;
                    if (C1404.f82149 < 0) {
                        iM55979 = (i8 - C0873.m55680("۬۠")) * 17;
                        i = ((iM55979 ^ i9) * (-1741)) ^ 573383198;
                        i2 = 387752702;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    } else {
                        jM55808 = j;
                        iM559710 = (i8 - C0946.m55979("֫ܿ")) * (-75);
                        i3 = ((iM559710 ^ i9) * 25419) ^ 1643201886;
                        i4 = -417704730;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        j3 = j2;
                    }
                    break;
                case -1009259714:
                case 325734766:
                    C1048.m56305();
                    break;
                case -889121771:
                case 1109028943:
                    j = jM55808;
                    j2 = j3;
                    if (C0967.f81910 < 0) {
                        iM55979 = C0873.m55680("᩹᩸") ^ i9;
                        i = ((iM55979 ^ i8) * (-29153)) ^ 903794577;
                        i2 = 841441532;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    } else {
                        jM55808 = j;
                        iM559710 = (i8 - C0946.m55979("֫ܿ")) * (-75);
                        i3 = ((iM559710 ^ i9) * 25419) ^ 1643201886;
                        i4 = -417704730;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        j3 = j2;
                    }
                    break;
                case -814366447:
                case 409946504:
                    j = jM55808;
                    j2 = j3;
                    if (C1036.f81953 < 0) {
                        iM55979 = (C0946.m55979("ۤ۠") + i8) * (-13);
                        i = ((iM55979 ^ i9) * (-24799)) ^ 1988595194;
                        i2 = 941020605;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    } else {
                        jM55808 = j;
                        iM559710 = (i8 - C0946.m55979("֫ܿ")) * (-75);
                        i3 = ((iM559710 ^ i9) * 25419) ^ 1643201886;
                        i4 = -417704730;
                        i11 = iM559710 ^ i4;
                        i10 = i3;
                        j3 = j2;
                    }
                    break;
                case -691283814:
                case 2122124062:
                    j = jM55808;
                    j2 = j3;
                    if (C1025.m56230()) {
                        iM55979 = C0873.m55680("ۚ᩶") ^ i9;
                        i = ((iM55979 ^ i8) * 24371) ^ 739710572;
                        i2 = -1658477137;
                    } else {
                        iM55979 = (i9 - C0873.m55680("ۨ۠")) * (-17);
                        i = ((iM55979 ^ i8) * 12239) ^ 793793271;
                        i2 = 1777605519;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
                case -305076642:
                case 66175881:
                    m9880(activity, c25065M44756, c12484);
                    break;
                case -304322151:
                case 1242640221:
                    j = jM55808;
                    j2 = j3;
                    if (C1071.m56343() != 0) {
                        iM55979 = (C0873.m55680("ۧۗ") ^ i8) * 97;
                        i = ((iM55979 ^ i9) * (-26505)) ^ 1485505775;
                        i2 = -1900423074;
                    } else {
                        iM55979 = C0946.m55979("ۨ֫") ^ i9;
                        i = ((iM55979 ^ i8) * 16027) ^ 266052969;
                        i2 = -633504487;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
                case -259650086:
                case 1494448445:
                    c19701M55781 = RunnableC0897.m55781(C0719o.a.f2903i);
                    C0866.m55644(c19701M55781, str);
                    if (!C0947.f81895) {
                        int iM55681 = (C0873.m55680("۠۟") ^ i8) * (-47);
                        j2 = j3;
                        i10 = ((iM55681 ^ i9) * (-25245)) ^ 245567225;
                        i11 = (-1711834804) ^ iM55681;
                        j3 = j2;
                    } else {
                        j = jM55808;
                        j2 = j3;
                        iM55979 = (i8 - C0873.m55680("ܺۤ")) * 45;
                        i = ((iM55979 ^ i9) * (-21835)) ^ 867874657;
                        i2 = -1365933673;
                        i11 = iM55979 ^ i2;
                        i10 = i;
                        j3 = j2;
                        jM55808 = j;
                    }
                    break;
                case 75880053:
                case 720040208:
                    f10458 = C0906.m55808();
                    iM559711 = C0873.m55680("ۖᩳ") ^ i9;
                    i5 = ((iM559711 ^ i8) * (-11913)) ^ 60362580;
                    i6 = 1671369246;
                    i11 = iM559711 ^ i6;
                    i10 = i5;
                    break;
                case 344684355:
                case 995138328:
                    C0912.m55833();
                    RunnableC1014.m56177();
                    break;
                case 461019207:
                case 1416805575:
                    j = jM55808;
                    j2 = j3;
                    if (C1024.f81946) {
                        iM55979 = (i9 - C0946.m55979("ۢۜ")) * 39;
                        i = ((iM55979 ^ i8) * 26779) ^ (-1793213606);
                        i2 = 1447021777;
                    } else {
                        iM55979 = (C0873.m55680("ܶܺ") ^ i9) * (-67);
                        i = ((iM55979 ^ i8) * (-14283)) ^ 1795931192;
                        i2 = 790932540;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
                default:
                    j = jM55808;
                    j2 = j3;
                    if (C1024.m56209() >= 0) {
                        iM55979 = (i8 - C0873.m55680("ܺۤ")) * 45;
                        i = ((iM55979 ^ i9) * (-21835)) ^ 867874657;
                        i2 = -1365933673;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩹") + i8) * 75;
                        i = ((iM55979 ^ i9) * 2243) ^ (-2006031299);
                        i2 = -1128438503;
                    }
                    i11 = iM55979 ^ i2;
                    i10 = i;
                    j3 = j2;
                    jM55808 = j;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x024f A[PHI: r2 r6 r7 r8 r9 r17
      0x024f: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:61:0x024d, B:57:0x0229, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:61:0x024d, B:57:0x0229, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short) binds: [B:61:0x024d, B:57:0x0229, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:61:0x024d, B:57:0x0229, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:61:0x024d, B:57:0x0229, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r17v12 l.ᩳᩴۡ) = (r17v5 l.ᩳᩴۡ), (r17v6 l.ᩳᩴۡ), (r17v13 l.ᩳᩴۡ) binds: [B:61:0x024d, B:57:0x0229, B:36:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02d5 A[PHI: r12 r13 r17 r18
      0x02d5: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:73:0x02d3, B:65:0x0281, B:32:0x0114, B:16:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:73:0x02d3, B:65:0x0281, B:32:0x0114, B:16:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r17v16 l.ᩳᩴۡ) = (r17v2 l.ᩳᩴۡ), (r17v4 l.ᩳᩴۡ), (r17v14 l.ᩳᩴۡ), (r17v17 l.ᩳᩴۡ) binds: [B:73:0x02d3, B:65:0x0281, B:32:0x0114, B:16:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02d5: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:73:0x02d3, B:65:0x0281, B:32:0x0114, B:16:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9856(String str, Activity activity, C12345 c12345) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4 = C0989.f81920;
        int i5 = ViewOnClickListenerC0939.f81888;
        int iM559710 = C0946.m55979("ۜᩴ") ^ i4;
        int i6 = ((iM559710 ^ i5) * 11035) ^ 1589452262;
        String packageName = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ (-1906588769);
        C19701 c19701M56033 = null;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1470808051;
        C25065 c25065M44756 = null;
        boolean zM55630 = false;
        while (true) {
            i13 = i7 ^ (i6 & (((i13 ^ i5) * (-25811)) >> 31));
            switch (i13) {
                case -1991717975:
                case 1836065879:
                    C8775.m20304();
                    iM55979 = C0946.m55979("᩸ۡ") ^ i5;
                    c19701M56033 = c19701M56033;
                    i = ((iM55979 ^ i4) * (-30621)) ^ 2099548452;
                    i2 = 1727605049;
                    C19701 c19701 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c19701;
                    break;
                case -1914320699:
                case -597191351:
                    c19701M56033 = c19701M56033;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ۛ۠") ^ i4;
                        i = ((iM55979 ^ i5) * 12015) ^ 1307949060;
                        i2 = 89501694;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܽۜ")) * 115;
                        i = ((iM55979 ^ i5) * 16943) ^ 583996759;
                        i2 = 1100018551;
                    }
                    C19701 c19702 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c19702;
                    break;
                case -1784919523:
                case 333328218:
                    c19701M56033 = c19701M56033;
                    sArr2 = f81901;
                    i12 = 149;
                    if (C0967.m56074()) {
                        iM55979 = (C0946.m55979("ۡܳ") ^ i5) * 69;
                        i = ((iM55979 ^ i4) * (-19769)) ^ 393491256;
                        i2 = -886534522;
                    } else {
                        iM55979 = (C0946.m55979("᩵᩺") + i4) * (-61);
                        i = ((iM55979 ^ i5) * 17859) ^ 108784928;
                        i2 = -275077805;
                    }
                    C19701 c19703 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c19703;
                    break;
                case -1733423432:
                case -1452606358:
                    c19701M56033 = c19701M56033;
                    int i14 = i9 + i10;
                    if ((i14 + i14) - i8 < 0) {
                        iM55979 = C0946.m55979("ۘᩴ") ^ i4;
                        i = ((iM55979 ^ i5) * (-16401)) ^ (-256071520);
                        i2 = -1398570601;
                    } else {
                        iM55979 = (C0946.m55979("ۤܶ") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i4) * (-21799)) ^ 1703725707;
                        i2 = 149711113;
                    }
                    C19701 c19704 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c19704;
                    break;
                case -1111427377:
                case 2130135430:
                    c19701M56033 = C0955.m56033(4136);
                    C0930.m55884(c19701M56033, str);
                    if (!RunnableC0897.m55784()) {
                        iM55680 = C0873.m55680("᩸۬") ^ i5;
                        i6 = ((iM55680 ^ i4) * 17197) ^ (-1847806140);
                        i3 = 2054454790;
                        i7 = iM55680 ^ i3;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i4) * (-35);
                        c19701M56033 = c19701M56033;
                        i = ((iM55979 ^ i5) * (-3397)) ^ 2121020073;
                        i2 = 584597223;
                        C19701 c19705 = c19701M56033;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M56033 = c19705;
                    }
                    break;
                case -286265612:
                case 1754814700:
                    c19701M56033.m44745(zM55630);
                    c25065M44756 = c19701M56033.m44756();
                    if (!C0930.m55892(c25065M44756)) {
                        iM55979 = C0946.m55979("᩸ۡ") ^ i5;
                        c19701M56033 = c19701M56033;
                        i = ((iM55979 ^ i4) * (-30621)) ^ 2099548452;
                        i2 = 1727605049;
                        C19701 c19706 = c19701M56033;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M56033 = c19706;
                    } else {
                        iM55680 = C0873.m55680("ᩳۚ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 28243) ^ (-921141093);
                        i3 = 961591975;
                        i7 = iM55680 ^ i3;
                    }
                    break;
                case -273200187:
                case 1760638136:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i4) * (-35);
                        c19701M56033 = c19701M56033;
                        i = ((iM55979 ^ i5) * (-3397)) ^ 2121020073;
                        i2 = 584597223;
                        C19701 c19707 = c19701M56033;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M56033 = c19707;
                    }
                    c19701M56033 = c19701M56033;
                    iM55979 = (C0946.m55979("᩶ۧ") ^ i4) * (-101);
                    i = ((iM55979 ^ i5) * (-14595)) ^ (-2089151237);
                    i2 = 2050661236;
                    C19701 c19708 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c19708;
                    break;
                case -260592116:
                case 567361251:
                    C1964.m56597();
                    if (AbstractC0942.f81890 <= 0) {
                        c19701M56033 = c19701M56033;
                        iM55979 = (C0946.m55979("ۡܳ") ^ i5) * 69;
                        i = ((iM55979 ^ i4) * (-19769)) ^ 393491256;
                        i2 = -886534522;
                        C19701 c19709 = c19701M56033;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M56033 = c19709;
                    }
                    c19701M56033 = c19701M56033;
                    iM55979 = (C0946.m55979("᩶ۧ") ^ i4) * (-101);
                    i = ((iM55979 ^ i5) * (-14595)) ^ (-2089151237);
                    i2 = 2050661236;
                    C19701 c197010 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197010;
                    break;
                case -100920299:
                case 574615230:
                    i11 = 16174;
                    iM55979 = (i4 - C0946.m55979("᩺ۧ")) * 75;
                    i = ((iM55979 ^ i5) * (-28813)) ^ (-949995694);
                    i2 = -1363884280;
                    C19701 c197011 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197011;
                    break;
                case -58461119:
                case 607465806:
                    c19701M56033 = c19701M56033;
                    s = sArr[148];
                    s2 = 19544;
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("ܽۨ") ^ i5;
                        i = ((iM55979 ^ i4) * 26559) ^ 1113136168;
                        i2 = 1020426180;
                    } else {
                        iM55979 = C0946.m55979("ۤ֡") ^ i5;
                        i = ((iM55979 ^ i4) * 19361) ^ 1094278073;
                        i2 = -1464732987;
                    }
                    C19701 c197012 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197012;
                    break;
                case -57504305:
                case 2486475:
                    c19701M56033 = c19701M56033;
                    int i15 = s + s2;
                    i8 = i15 * i15;
                    i9 = s * s;
                    if (C0930.m55885() <= 0) {
                        iM55979 = C0946.m55979("ܽۨ") ^ i5;
                        i = ((iM55979 ^ i4) * 26559) ^ 1113136168;
                        i2 = 1020426180;
                    } else {
                        iM55979 = C0873.m55680("֫ۛ") ^ i4;
                        i = ((iM55979 ^ i5) * 23419) ^ (-1952255364);
                        i2 = -707636572;
                    }
                    C19701 c197013 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197013;
                    break;
                case 98381326:
                case 2054326759:
                    c19701M56033 = c19701M56033;
                    zM55630 = C0863.m55630(packageName, RunnableC0897.m55783(sArr2, i12, 6, i11));
                    if (C1003.m56123() != 0) {
                        iM55979 = (C0946.m55979("᩶ۧ") ^ i4) * (-101);
                        i = ((iM55979 ^ i5) * (-14595)) ^ (-2089151237);
                        i2 = 2050661236;
                    } else {
                        iM55979 = C0873.m55680("ۡܽ") ^ i4;
                        i = ((iM55979 ^ i5) * 27129) ^ (-1072425500);
                        i2 = 466479135;
                    }
                    C19701 c197014 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197014;
                    break;
                case 275553209:
                case 1607508991:
                    c19701M56033 = c19701M56033;
                    sArr = f81901;
                    if (C0917.f81868) {
                        iM55979 = (C0946.m55979("ۡܳ") ^ i5) * 69;
                        i = ((iM55979 ^ i4) * (-19769)) ^ 393491256;
                        i2 = -886534522;
                    } else {
                        iM55979 = (C0946.m55979("᩷֫") ^ i4) * 49;
                        i = ((iM55979 ^ i5) * (-12843)) ^ 1094817787;
                        i2 = 402132306;
                    }
                    C19701 c197015 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197015;
                    break;
                case 276492268:
                case 865821430:
                    C1003.m56123();
                    C0894.m55769();
                    break;
                case 459320734:
                case 2071590416:
                    c19701M56033 = c19701M56033;
                    if (C0882.f81846) {
                        iM55979 = (C0946.m55979("ۡܳ") ^ i5) * 69;
                        i = ((iM55979 ^ i4) * (-19769)) ^ 393491256;
                        i2 = -886534522;
                    } else {
                        iM55979 = C0946.m55979("᩹ۙ") ^ i5;
                        i = ((iM55979 ^ i4) * 5035) ^ (-433597972);
                        i2 = -641378446;
                    }
                    C19701 c197016 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197016;
                    break;
                case 552615587:
                case 1431761871:
                    c19701M56033 = c19701M56033;
                    i10 = 381967936;
                    if (C0882.f81846) {
                        c19701M56033 = c19701M56033;
                        iM55979 = (C0946.m55979("᩹ܿ") ^ i4) * (-35);
                        c19701M56033 = c19701M56033;
                        i = ((iM55979 ^ i5) * (-3397)) ^ 2121020073;
                        i2 = 584597223;
                    } else {
                        iM55979 = (C0946.m55979("۬ۘ") ^ i5) * (-115);
                        i = ((iM55979 ^ i4) * (-32435)) ^ (-900043718);
                        i2 = -1652916107;
                    }
                    C19701 c197017 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197017;
                    break;
                case 777314629:
                case 1512346693:
                    c19701M56033 = c19701M56033;
                    packageName = activity.getPackageName();
                    if (RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("֡ܳ") ^ i5;
                        i = ((iM55979 ^ i4) * (-25287)) ^ (-1583602619);
                        i2 = -1044423784;
                    } else {
                        iM55979 = C0946.m55979("ܽۨ") ^ i5;
                        i = ((iM55979 ^ i4) * 26559) ^ 1113136168;
                        i2 = 1020426180;
                    }
                    C19701 c197018 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197018;
                    break;
                case 853128807:
                case 2094523384:
                    m9880(activity, c25065M44756, c12345);
                    break;
                case 1139503416:
                case 1501672860:
                    i11 = 20466;
                    iM55979 = (i4 - C0946.m55979("᩺ۧ")) * 75;
                    i = ((iM55979 ^ i5) * (-28813)) ^ (-949995694);
                    i2 = -1363884280;
                    C19701 c197019 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c197019;
                    break;
                case 1722278943:
                case 1921794501:
                    C0906.m55809();
                    c19701M56033 = c19701M56033;
                    iM55979 = (C0946.m55979("᩶ۧ") ^ i4) * (-101);
                    i = ((iM55979 ^ i5) * (-14595)) ^ (-2089151237);
                    i2 = 2050661236;
                    C19701 c1970110 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c1970110;
                    break;
                default:
                    C1036.m56257();
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        c19701M56033 = c19701M56033;
                        iM55979 = C0946.m55979("ۛ۠") ^ i4;
                        i = ((iM55979 ^ i5) * 12015) ^ 1307949060;
                        i2 = 89501694;
                        C19701 c1970111 = c19701M56033;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M56033 = c1970111;
                    }
                    c19701M56033 = c19701M56033;
                    iM55979 = (C0946.m55979("᩶ۧ") ^ i4) * (-101);
                    i = ((iM55979 ^ i5) * (-14595)) ^ (-2089151237);
                    i2 = 2050661236;
                    C19701 c1970112 = c19701M56033;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M56033 = c1970112;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9865(ViewOnClickListenerC7928 viewOnClickListenerC7928, C10611 c10611) {
        int i = 0;
        int i2 = -720715487;
        int i3 = C1229.f82066;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55979 = (C0946.m55979("᩵ۙ") + i3) * (-43);
        int i5 = ((iM55979 ^ i4) * (-8003)) ^ (-779301836);
        int i6 = 1690167524;
        while (true) {
            i2 = ((((i2 ^ i4) * (-8775)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1878758404:
                case 339265912:
                    if (C0917.m55854()) {
                        iM55979 = C0873.m55680("ܰۜ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 22891) ^ (-627353412);
                        i6 = 1991322039;
                    } else {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    }
                    break;
                case -1847115302:
                case 1881643945:
                    m9880(viewOnClickListenerC7928, RunnableC0871.m55668(C0955.m56033(i)), c10611);
                    break;
                case -1732628898:
                case -440495909:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0946.m55979("۫᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26903) ^ (-1867107511);
                        i6 = -1936309883;
                    } else {
                        iM55979 = C0946.m55979("ܿۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-21211)) ^ (-1783180282);
                        i6 = -1050634956;
                    }
                    break;
                case -1706673813:
                case -615232738:
                    if (C0992.f81922 >= 0) {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    } else {
                        iM55979 = (C0946.m55979("ܶ֫") ^ i3) * (-37);
                        i5 = ((iM55979 ^ i4) * 31547) ^ (-665323977);
                        i6 = -789487144;
                    }
                    break;
                case -1545672178:
                case 1067734217:
                    if (!C1024.f81946) {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    } else {
                        iM55979 = (C0873.m55680("᩷۟") + i4) * (-25);
                        i5 = ((iM55979 ^ i3) * (-2789)) ^ 1130718651;
                        i6 = -1030077237;
                    }
                    break;
                case -1139194255:
                case 660991689:
                    RunnableC0871.m55672();
                    break;
                case -900249268:
                case 2025724803:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("᩷۠") + i3) * 55;
                        i5 = ((iM55979 ^ i4) * 16215) ^ 948647495;
                        i6 = 80235065;
                    } else {
                        iM55979 = C0946.m55979("ܳ᩺") ^ i3;
                        i5 = ((iM55979 ^ i4) * 6983) ^ 556031048;
                        i6 = -372492920;
                    }
                    break;
                case -827996398:
                case 1842992273:
                    C1404.m56468();
                    if (C1053.m56327() >= 0) {
                        iM55979 = C0946.m55979("۫᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26903) ^ (-1867107511);
                        i6 = -1936309883;
                    } else {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    }
                    break;
                case -640767833:
                case 2121668217:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = (i3 - C0873.m55680("۠᩶")) * (-121);
                        i5 = ((iM55979 ^ i4) * (-24391)) ^ (-1701796436);
                        i6 = -2005259322;
                    } else {
                        iM55979 = C0946.m55979("ۚۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 16299) ^ (-1681022195);
                        i6 = -1619254389;
                    }
                    break;
                case -8667541:
                case 1938492853:
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("᩷۟") + i4) * (-25);
                        i5 = ((iM55979 ^ i3) * (-2789)) ^ 1130718651;
                        i6 = -1030077237;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩻") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-7205)) ^ 894311305;
                        i6 = 569655739;
                    }
                    break;
                case 41070558:
                case 1888532239:
                    i = 4150;
                    if (C1929.m56553()) {
                        iM55979 = (C0946.m55979("᩷۠") + i3) * 55;
                        i5 = ((iM55979 ^ i4) * 16215) ^ 948647495;
                        i6 = 80235065;
                    } else {
                        iM55979 = (C0946.m55979("ۤۜ") ^ i4) * (-97);
                        i5 = ((iM55979 ^ i3) * (-18033)) ^ 1474216386;
                        i6 = -1480707550;
                    }
                    break;
                case 52495149:
                case 434272963:
                    C0947.m55997();
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i3 - C0873.m55680("۠᩶")) * (-121);
                        i5 = ((iM55979 ^ i4) * (-24391)) ^ (-1701796436);
                        i6 = -2005259322;
                    } else {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    }
                    break;
                case 605866148:
                case 1030124585:
                    C1048.m56305();
                    iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                    i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                    i6 = -1472638106;
                    break;
                case 649546475:
                case 1494321653:
                    if (C0854.f81826 != 0) {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    } else {
                        iM55979 = C0946.m55979("۫ۙ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-9247)) ^ 958235783;
                        i6 = 892960921;
                    }
                    break;
                case 787382771:
                case 2083127524:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0873.m55680("֡ۢ") + i4) * 127;
                        i5 = ((iM55979 ^ i3) * (-11721)) ^ (-500637344);
                        i6 = -1472638106;
                    } else {
                        iM55979 = C0946.m55979("ܺᩳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 9745) ^ 707444784;
                        i6 = -1756924459;
                    }
                    break;
                default:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (i3 - C0873.m55680("۠᩶")) * (-121);
                        i5 = ((iM55979 ^ i4) * (-24391)) ^ (-1701796436);
                        i6 = -2005259322;
                    } else {
                        iM55979 = C0946.m55979("ۛۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-23135)) ^ (-476674931);
                        i6 = -1038503954;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    /* JADX WARN: Code duplicated, block: B:80:0x025d  */
    /* JADX WARN: Code duplicated, block: B:84:0x028d  */
    /* JADX INFO: renamed from: ۧ */
    public static Map m9877(String str) {
        int iM55680;
        int i;
        Iterator<String> itKeys = null;
        boolean zM55647 = false;
        int i2 = 1037989699;
        int i3 = C1017.f81942;
        int i4 = C0967.f81910;
        int iM55681 = C0873.m55680("ᩴۧ") ^ i4;
        int i5 = ((iM55681 ^ i3) * 457) ^ (-489346199);
        int i6 = iM55681 ^ 1464110155;
        JSONObject jSONObject = null;
        C0977 c0977 = null;
        while (true) {
            i2 = ((((i2 ^ i3) * (-30793)) >> 31) & i5) ^ i6;
            switch (i2) {
                case -2042066192:
                case -1374064023:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("۫᩶") ^ i4) * 13;
                        i5 = ((iM55680 ^ i3) * (-655)) ^ 1348175950;
                        i = -560273082;
                    } else {
                        iM55680 = (C0873.m55680("ۖᩳ") + i3) * 25;
                        i5 = ((iM55680 ^ i4) * (-32551)) ^ 651129727;
                        i = -1340499188;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -2001408927:
                case 1189628876:
                    C0894.m55769();
                    if (C1048.m56305() < 0) {
                        iM55680 = (C0946.m55979("᩸֨") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i3) * (-16471)) ^ 1830788295;
                        i = 1512264188;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19731)) ^ 347407315;
                        i = -310229880;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1880621776:
                case 1679823216:
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("ۡ᩶") ^ i4) * (-35);
                        i5 = ((iM55680 ^ i3) * 433) ^ (-1043929969);
                        i = -653953075;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1868989139:
                case 177710715:
                    if (C1044.m56286() <= 0) {
                        iM55680 = C0873.m55680("ܳ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19731)) ^ 347407315;
                        i = -310229880;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩸ᩴ")) * 47;
                        i5 = ((iM55680 ^ i4) * (-11369)) ^ 684605530;
                        i = -103806489;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1778712662:
                case 266737518:
                    try {
                        String str2 = (String) C0955.m56035(itKeys);
                        c0977.put(str2, C1929.m56556(jSONObject, str2));
                        iM55680 = (C0873.m55680("֨ܺ") ^ i3) * 59;
                        i5 = ((iM55680 ^ i4) * (-18911)) ^ 1843173892;
                        i = -1969427702;
                    } catch (JSONException unused) {
                        iM55680 = (C0873.m55680("ۛܰ") + i4) * (-125);
                        i5 = ((iM55680 ^ i3) * (-625)) ^ (-202910061);
                        i = -1659203564;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1719034030:
                case -909375243:
                    C1028.m56247();
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    } else {
                        iM55680 = C0873.m55680("ۚۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 18037) ^ (-343006937);
                        i = -850634588;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1396039737:
                case 1010545002:
                    if (C0863.f81833 > 0) {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    } else {
                        iM55680 = (C0946.m55979("᩸֨") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i3) * (-16471)) ^ 1830788295;
                        i = 1512264188;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1304652216:
                case 629195904:
                    return c0977;
                case -1203581565:
                case 1143495593:
                    C0906.m55809();
                    C1012.m56134();
                    return null;
                case -1090055080:
                case -372956973:
                    if (zM55647) {
                        iM55680 = (C0946.m55979("۠ۢ") + i4) * 99;
                        i5 = ((iM55680 ^ i3) * (-17229)) ^ (-1474957220);
                        i = -1795919128;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۙ᩶")) * (-11);
                        i5 = ((iM55680 ^ i4) * 6737) ^ 967269117;
                        i = 1328164025;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1042272784:
                case -962420537:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۚ") ^ i3) * 69;
                        i5 = ((iM55680 ^ i4) * 16795) ^ (-715746418);
                        i = -1918428633;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -1020792500:
                case 25081887:
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0946.m55979("ۡ᩶") ^ i4) * (-35);
                        i5 = ((iM55680 ^ i3) * 433) ^ (-1043929969);
                        i = -653953075;
                    } else {
                        iM55680 = (C0873.m55680("ۛۢ") + i4) * 119;
                        i5 = ((iM55680 ^ i3) * (-85)) ^ (-1766341542);
                        i = -1070199973;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -885989053:
                case -487462177:
                    try {
                        jSONObject = new JSONObject(str);
                        itKeys = jSONObject.keys();
                        try {
                            c0977 = new C0977();
                            iM55680 = (C0873.m55680("֨ܺ") ^ i3) * 59;
                            i5 = ((iM55680 ^ i4) * (-18911)) ^ 1843173892;
                            i = -1969427702;
                        } catch (JSONException unused2) {
                            c0977 = null;
                            iM55680 = (C0873.m55680("ۛܰ") + i4) * (-125);
                            i5 = ((iM55680 ^ i3) * (-625)) ^ (-202910061);
                            i = -1659203564;
                        }
                    } catch (JSONException unused3) {
                        jSONObject = null;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -708571263:
                case 85007920:
                    C1025.m56230();
                    if (C0892.m55749()) {
                        iM55680 = (i3 - C0873.m55680("ۡۤ")) * 73;
                        i5 = ((iM55680 ^ i4) * 28019) ^ 542949208;
                        i = -1904860760;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -592274338:
                case 1140038327:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    } else {
                        iM55680 = (C0946.m55979("᩻᩸") ^ i3) * (-81);
                        i5 = ((iM55680 ^ i4) * 26499) ^ 830117639;
                        i = 737622153;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -589070612:
                case -547143536:
                    if (C0890.m55740()) {
                        iM55680 = C0946.m55979("ܺܳ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11961) ^ (-1727651716);
                        i = -792243348;
                    } else {
                        iM55680 = C0873.m55680("ܳ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19731)) ^ 347407315;
                        i = -310229880;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case -548215614:
                case 2090786266:
                    zM55647 = C0866.m55647(itKeys);
                    iM55680 = (C0946.m55979("ܿܿ") ^ i4) * (-45);
                    i5 = ((iM55680 ^ i3) * (-21429)) ^ (-1703969287);
                    i = -1645822577;
                    i6 = iM55680 ^ i;
                    break;
                case -272305823:
                case 701042870:
                    if (C0927.f81875) {
                        iM55680 = (C0946.m55979("ۡ᩶") ^ i4) * (-35);
                        i5 = ((iM55680 ^ i3) * 433) ^ (-1043929969);
                        i = -653953075;
                    } else {
                        iM55680 = C0946.m55979("ۨ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * 20317) ^ 2042791716;
                        i = 1956737923;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case 403557477:
                case 2039335093:
                    if (C0845.m55584() <= 0) {
                        iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                        i = -1995758594;
                    } else {
                        iM55680 = C0873.m55680("ۧ᩺") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-13031)) ^ (-1866147269);
                        i = -12384105;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case 525045038:
                case 1961308336:
                    if (C0912.m55833()) {
                        iM55680 = (C0946.m55979("᩸֨") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i3) * (-16471)) ^ 1830788295;
                        i = 1512264188;
                    } else {
                        iM55680 = C0873.m55680("ۘۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10825) ^ 1359967609;
                        i = 233609306;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case 831257584:
                case 917329464:
                    RunnableC1014.m56177();
                    iM55680 = (C0873.m55680("᩹᩺") + i3) * (-73);
                    i5 = ((iM55680 ^ i4) * 18879) ^ (-356794435);
                    i = -1995758594;
                    i6 = iM55680 ^ i;
                    break;
                case 1036547895:
                case 1272728856:
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0873.m55680("۫᩶") ^ i4) * 13;
                        i5 = ((iM55680 ^ i3) * (-655)) ^ 1348175950;
                        i = -560273082;
                    } else {
                        iM55680 = (C0873.m55680("۫ܰ") + i4) * 45;
                        i5 = ((iM55680 ^ i3) * 5073) ^ (-610354040);
                        i = 1253870594;
                    }
                    i6 = iM55680 ^ i;
                    break;
                case 1273685923:
                case 1292138383:
                    return Collections.EMPTY_MAP;
                default:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ܳ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19731)) ^ 347407315;
                        i = -310229880;
                    } else {
                        iM55680 = C0946.m55979("ۘۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-32617)) ^ (-511024995);
                        i = -1065853364;
                    }
                    i6 = iM55680 ^ i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02f9 A[PHI: r8 r9 r17 r19
      0x02f9: PHI (r8v9 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:47:0x01f7, B:74:0x02f7, B:65:0x02a4, B:61:0x0282, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r9v9 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:47:0x01f7, B:74:0x02f7, B:65:0x02a4, B:61:0x0282, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r17v48 java.lang.String) = 
      (r17v10 java.lang.String)
      (r17v33 java.lang.String)
      (r17v34 java.lang.String)
      (r17v35 java.lang.String)
      (r17v49 java.lang.String)
     binds: [B:47:0x01f7, B:74:0x02f7, B:65:0x02a4, B:61:0x0282, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x02f9: PHI (r19v32 l.ᩳᩴۡ) = (r19v3 l.ᩳᩴۡ), (r19v23 l.ᩳᩴۡ), (r19v24 l.ᩳᩴۡ), (r19v25 l.ᩳᩴۡ), (r19v33 l.ᩳᩴۡ) binds: [B:47:0x01f7, B:74:0x02f7, B:65:0x02a4, B:61:0x0282, B:13:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m9857(String str, String str2, Activity activity, C8460 c8460) {
        String str3;
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        C25065 c25065M44756;
        int i5;
        int i6 = C0866.f81837;
        int i7 = C1025.f81947;
        int iM55681 = C0873.m55680("ᩳܶ") ^ i6;
        int i8 = ((iM55681 ^ i7) * 25515) ^ (-178434308);
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = iM55681 ^ (-560979106);
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1029149544;
        C25065 c25065 = null;
        C19701 c19701M56033 = null;
        String strM47462 = null;
        String strM47463 = null;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i7) * 19883) >> 31));
            switch (i15) {
                case -2078906751:
                case 1350542669:
                    str3 = strM47463;
                    c19701M56033 = c19701M56033;
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                        i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                        i2 = 2132472610;
                    } else {
                        iM55680 = C0873.m55680("ᩳ۫") ^ i6;
                        i = ((iM55680 ^ i7) * 15895) ^ (-912535997);
                        i2 = -951036555;
                    }
                    i5 = iM55680 ^ i2;
                    c19701M56033 = c19701M56033;
                    String str4 = str3;
                    i9 = i5;
                    i8 = i;
                    strM47463 = str4;
                    break;
                case -2065493460:
                case 37178175:
                    C0854.m55595();
                    if (C1012.f81938 < 0) {
                        c19701M56033 = c19701M56033;
                        iM55979 = C0946.m55979("ۖ᩹") ^ i6;
                        i3 = ((iM55979 ^ i7) * (-9321)) ^ (-1257625563);
                        i4 = 216238544;
                        i9 = iM55979 ^ i4;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    } else {
                        str3 = strM47463;
                        c19701M56033 = c19701M56033;
                        iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                        i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                        i2 = 2132472610;
                        i5 = iM55680 ^ i2;
                        c19701M56033 = c19701M56033;
                        String str5 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str5;
                    }
                    break;
                case -2052459787:
                case 364830437:
                    c19701M56033 = C0955.m56033(C0719o.a.f2895a);
                    C0866.m55644(c19701M56033, str);
                    C0866.m55644(c19701M56033, strM47462);
                    if (C1229.f82066 >= 0) {
                        int iM55682 = C0873.m55680("ۛۖ") ^ i7;
                        str3 = strM47463;
                        i = ((iM55682 ^ i6) * 3543) ^ (-540000450);
                        i5 = iM55682 ^ 1380894461;
                        String str6 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str6;
                    } else {
                        int iM55683 = (C0873.m55680("ܶ֫") ^ i6) * 23;
                        i8 = ((iM55683 ^ i7) * (-12393)) ^ (-2029671968);
                        i9 = iM55683 ^ (-493200813);
                    }
                    break;
                case -2013757834:
                case -1496720309:
                    if (C0877.f81843 >= 0) {
                        c19701M56033 = c19701M56033;
                        iM55979 = C0946.m55979("ۖ᩹") ^ i6;
                        i3 = ((iM55979 ^ i7) * (-9321)) ^ (-1257625563);
                        i4 = 216238544;
                        i9 = iM55979 ^ i4;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    } else {
                        int iM55684 = (C0873.m55680("᩵ܽ") ^ i6) * 3;
                        i9 = iM55684 ^ (-1621752962);
                        i8 = ((iM55684 ^ i7) * (-29551)) ^ 65426303;
                    }
                    break;
                case -1985575206:
                case 1484125248:
                    C0898.m55800();
                    break;
                case -1942698483:
                case -1494738863:
                    C8775.m20304();
                    c25065M44756 = c25065;
                    int iM55685 = C0873.m55680("ۡ֨") ^ i7;
                    c19701M56033 = c19701M56033;
                    i3 = ((iM55685 ^ i6) * 653) ^ (-2001261387);
                    c25065 = c25065M44756;
                    i9 = iM55685 ^ 668605790;
                    i8 = i3;
                    c19701M56033 = c19701M56033;
                    break;
                case -1841724652:
                case -768755836:
                    c19701M56033 = c19701M56033;
                    if (i10 - (i11 + 1) >= 0) {
                        iM55979 = (i7 - C0946.m55979("᩸᩹")) * 27;
                        i3 = ((iM55979 ^ i6) * 393) ^ 1611486994;
                        i4 = -917684543;
                    } else {
                        iM55979 = (i7 - C0946.m55979("᩻ۢ")) * 95;
                        i3 = ((iM55979 ^ i6) * 5219) ^ (-195291298);
                        i4 = -175671213;
                    }
                    i9 = iM55979 ^ i4;
                    i8 = i3;
                    c19701M56033 = c19701M56033;
                    break;
                case -1632089922:
                case -742379088:
                    if (C1012.f81938 >= 0) {
                        c19701M56033 = c19701M56033;
                        iM55979 = C0946.m55979("ܽۗ") ^ i7;
                        i3 = ((iM55979 ^ i6) * 1561) ^ 410728974;
                        i4 = 972085323;
                        i9 = iM55979 ^ i4;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    } else {
                        str3 = strM47463;
                        c19701M56033 = c19701M56033;
                        iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                        i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                        i2 = 2132472610;
                        i5 = iM55680 ^ i2;
                        c19701M56033 = c19701M56033;
                        String str7 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str7;
                    }
                    break;
                case -1537869127:
                case 1550564741:
                    str3 = strM47463;
                    c19701M56033 = c19701M56033;
                    if (C0917.m55854()) {
                        iM55680 = (C0873.m55680("۟᩹") + i7) * (-99);
                        i = ((iM55680 ^ i6) * 32621) ^ (-585145404);
                        i2 = -348847190;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                        i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                        i2 = 2132472610;
                    }
                    i5 = iM55680 ^ i2;
                    c19701M56033 = c19701M56033;
                    String str8 = str3;
                    i9 = i5;
                    i8 = i;
                    strM47463 = str8;
                    break;
                case -1393053508:
                case 1219145801:
                    i12 = 55233;
                    iM55979 = C0873.m55680("᩷ܺ") ^ i6;
                    i3 = ((iM55979 ^ i7) * (-24435)) ^ 1999743909;
                    i4 = -1008423396;
                    i9 = iM55979 ^ i4;
                    i8 = i3;
                    c19701M56033 = c19701M56033;
                    break;
                case -1122818620:
                case -516995948:
                    c19701M56033 = c19701M56033;
                    strM47462 = C21043.m47462(C1046.m56289(strM47463, C1048.m56318(sArr2, i13, i14, i12)));
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0946.m55979("ۖ᩹") ^ i6;
                        i3 = ((iM55979 ^ i7) * (-9321)) ^ (-1257625563);
                        i4 = 216238544;
                    } else {
                        iM55979 = (C0946.m55979("ۧۢ") + i7) * (-105);
                        i3 = ((iM55979 ^ i6) * (-5629)) ^ 2092050401;
                        i4 = -1505230563;
                    }
                    i9 = iM55979 ^ i4;
                    i8 = i3;
                    c19701M56033 = c19701M56033;
                    break;
                case -926992346:
                case -847774052:
                    C1929.m56553();
                    str3 = strM47463;
                    c19701M56033 = c19701M56033;
                    iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                    i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                    i2 = 2132472610;
                    i5 = iM55680 ^ i2;
                    c19701M56033 = c19701M56033;
                    String str9 = str3;
                    i9 = i5;
                    i8 = i;
                    strM47463 = str9;
                    break;
                case -704460235:
                case -119740156:
                    str3 = strM47463;
                    c19701M56033 = c19701M56033;
                    if (C0898.f81858 > 0) {
                        iM55680 = C0873.m55680("᩸᩷") ^ i6;
                        i = ((iM55680 ^ i7) * (-13359)) ^ 472512221;
                        i2 = -2092194439;
                        i5 = iM55680 ^ i2;
                        c19701M56033 = c19701M56033;
                        String str10 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str10;
                    } else {
                        strM47463 = str3;
                        iM55979 = C0946.m55979("ܽۗ") ^ i7;
                        i3 = ((iM55979 ^ i6) * 1561) ^ 410728974;
                        i4 = 972085323;
                        i9 = iM55979 ^ i4;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    }
                    break;
                case -653870816:
                case 2079743329:
                    c19701M56033 = c19701M56033;
                    int i16 = s + s2;
                    i10 = i16 * i16;
                    i11 = s * 2;
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("᩹᩻") ^ i6) * (-31);
                        i3 = ((iM55979 ^ i7) * (-6647)) ^ (-1996435236);
                        i4 = 1764062741;
                        i9 = iM55979 ^ i4;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    } else {
                        str3 = strM47463;
                        iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                        i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                        i2 = 2132472610;
                        i5 = iM55680 ^ i2;
                        c19701M56033 = c19701M56033;
                        String str11 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str11;
                    }
                    break;
                case -290503799:
                case 531753752:
                    C0866.m55644(c19701M56033, str2);
                    c25065M44756 = c19701M56033.m44756();
                    if (C0930.m55892(c25065M44756)) {
                        int iM55686 = (i6 - C0873.m55680("ۧ᩶")) * 97;
                        i8 = ((iM55686 ^ i7) * (-5335)) ^ (-1369962307);
                        c25065 = c25065M44756;
                        i9 = iM55686 ^ 719349061;
                    } else {
                        int iM55687 = C0873.m55680("ۡ֨") ^ i7;
                        c19701M56033 = c19701M56033;
                        i3 = ((iM55687 ^ i6) * 653) ^ (-2001261387);
                        c25065 = c25065M44756;
                        i9 = iM55687 ^ 668605790;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    }
                    break;
                case -197217427:
                case 28331646:
                    str3 = strM47463;
                    c19701M56033 = c19701M56033;
                    if (C0947.f81895) {
                        iM55680 = (i7 - C0873.m55680("ۗ᩺")) * (-115);
                        i = ((iM55680 ^ i6) * 13099) ^ 953453777;
                        i2 = 2132472610;
                    } else {
                        iM55680 = C0873.m55680("᩹֡") ^ i7;
                        i = ((iM55680 ^ i6) * (-2141)) ^ (-931751549);
                        i2 = 207098529;
                    }
                    i5 = iM55680 ^ i2;
                    c19701M56033 = c19701M56033;
                    String str12 = str3;
                    i9 = i5;
                    i8 = i;
                    strM47463 = str12;
                    break;
                case 11870245:
                case 1981455784:
                    i12 = 64699;
                    iM55979 = C0873.m55680("᩷ܺ") ^ i6;
                    i3 = ((iM55979 ^ i7) * (-24435)) ^ 1999743909;
                    i4 = -1008423396;
                    i9 = iM55979 ^ i4;
                    i8 = i3;
                    c19701M56033 = c19701M56033;
                    break;
                case 410007982:
                case 1508398135:
                    str3 = strM47463;
                    c19701M56033 = c19701M56033;
                    sArr = f81901;
                    if (C0863.f81833 > 0) {
                        iM55680 = C0873.m55680("᩹ۡ") ^ i6;
                        i = ((iM55680 ^ i7) * 2667) ^ (-1573023768);
                        i2 = -1406470440;
                        i5 = iM55680 ^ i2;
                        c19701M56033 = c19701M56033;
                        String str13 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str13;
                    } else {
                        strM47463 = str3;
                        iM55979 = C0946.m55979("ܽۗ") ^ i7;
                        i3 = ((iM55979 ^ i6) * 1561) ^ 410728974;
                        i4 = 972085323;
                        i9 = iM55979 ^ i4;
                        i8 = i3;
                        c19701M56033 = c19701M56033;
                    }
                    break;
                case 451288601:
                case 1930074963:
                    c19701M56033 = c19701M56033;
                    s = sArr[155];
                    s2 = 1;
                    if (RunnableC1014.f81941 > 0) {
                        str3 = strM47463;
                        iM55680 = (C0946.m55979("ۙ᩶") + i7) * 85;
                        i = ((iM55680 ^ i6) * (-14223)) ^ 428372896;
                        i2 = 1251276051;
                        i5 = iM55680 ^ i2;
                        c19701M56033 = c19701M56033;
                        String str14 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str14;
                    } else {
                        c19701M56033 = c19701M56033;
                        int iM55688 = C0873.m55680("ۛۖ") ^ i7;
                        str3 = strM47463;
                        i = ((iM55688 ^ i6) * 3543) ^ (-540000450);
                        i5 = iM55688 ^ 1380894461;
                        String str15 = str3;
                        i9 = i5;
                        i8 = i;
                        strM47463 = str15;
                    }
                    break;
                case 482657212:
                case 1095265904:
                    c19701M56033 = c19701M56033;
                    strM47463 = C21043.m47462(str2);
                    sArr2 = f81901;
                    i13 = 156;
                    i14 = 8;
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ܽۗ") ^ i7;
                        i3 = ((iM55979 ^ i6) * 1561) ^ 410728974;
                        i4 = 972085323;
                    } else {
                        iM55979 = (C0946.m55979("᩹᩸") + i6) * 35;
                        i3 = ((iM55979 ^ i7) * 26965) ^ 665547959;
                        i4 = 1062975074;
                    }
                    i9 = iM55979 ^ i4;
                    i8 = i3;
                    c19701M56033 = c19701M56033;
                    break;
                default:
                    m9880(activity, c25065, c8460);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0219 A[PHI: r3 r9 r16 r17
      0x0219: PHI (r3v5 boolean) = (r3v2 boolean), (r3v3 boolean), (r3v2 boolean) binds: [B:56:0x0217, B:33:0x0104, B:7:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r9v5 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:56:0x0217, B:33:0x0104, B:7:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r16v25 int) = (r16v6 int), (r16v14 int), (r16v26 int) binds: [B:56:0x0217, B:33:0x0104, B:7:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0219: PHI (r17v29 l.ᩳᩴۡ) = (r17v6 l.ᩳᩴۡ), (r17v14 l.ᩳᩴۡ), (r17v30 l.ᩳᩴۡ) binds: [B:56:0x0217, B:33:0x0104, B:7:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x027d A[PHI: r6 r7 r11 r12 r16 r17
      0x027d: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:64:0x027b, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:64:0x027b, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r11v3 short[]) = (r11v2 short[]), (r11v4 short[]) binds: [B:64:0x027b, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:64:0x027b, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r16v12 int) = (r16v4 int), (r16v13 int) binds: [B:64:0x027b, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]
      0x027d: PHI (r17v12 l.ᩳᩴۡ) = (r17v4 l.ᩳᩴۡ), (r17v13 l.ᩳᩴۡ) binds: [B:64:0x027b, B:37:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x02b2 A[PHI: r5 r8 r16 r17
      0x02b2: PHI (r5v4 short[]) = (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:68:0x02b0, B:60:0x0254, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:68:0x02b0, B:60:0x0254, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r16v17 int) = (r16v3 int), (r16v5 int), (r16v18 int) binds: [B:68:0x02b0, B:60:0x0254, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x02b2: PHI (r17v17 l.ᩳᩴۡ) = (r17v3 l.ᩳᩴۡ), (r17v5 l.ᩳᩴۡ), (r17v18 l.ᩳᩴۡ) binds: [B:68:0x02b0, B:60:0x0254, B:8:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02e9 A[PHI: r2 r16 r17
      0x02e9: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v3 java.lang.String), (r2v2 java.lang.String) binds: [B:72:0x02e7, B:41:0x0152, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r16v15 int) = (r16v2 int), (r16v11 int), (r16v16 int) binds: [B:72:0x02e7, B:41:0x0152, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x02e9: PHI (r17v15 l.ᩳᩴۡ) = (r17v2 l.ᩳᩴۡ), (r17v11 l.ᩳᩴۡ), (r17v16 l.ᩳᩴۡ) binds: [B:72:0x02e7, B:41:0x0152, B:12:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9861(String str, ViewOnClickListenerC7928 viewOnClickListenerC7928, C3627 c3627) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4 = C1028.f81950;
        int i5 = C1017.f81942;
        int iM55681 = (i5 - C0873.m55680("ۧ֫")) * 3;
        int i6 = ((iM55681 ^ i4) * (-32297)) ^ 230509112;
        String packageName = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM55681 ^ 1998317049;
        C19701 c19701M55781 = null;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -510174367;
        C25065 c25065M55668 = null;
        boolean zM55582 = false;
        while (true) {
            int i12 = i7 ^ (i6 & (((i11 ^ i4) * (-14639)) >> 31));
            switch (i12) {
                case -2035413309:
                case -1144199531:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    zM55582 = C0845.m55582(packageName, C0949.m56016(sArr2, i10, 6, i9));
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0873.m55680("ۡۧ") + i5) * (-97);
                        i = ((iM55979 ^ i4) * 9875) ^ 1548468764;
                        i2 = -640562412;
                    } else {
                        iM55979 = (C0873.m55680("֫ۤ") ^ i5) * 115;
                        i = ((iM55979 ^ i4) * (-17993)) ^ (-931455305);
                        i2 = 587325824;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1945924713:
                case -565646728:
                    C0882.m55710();
                    if (C1025.f81947 < 0) {
                        i12 = i12;
                        iM55680 = C0873.m55680("ۖ᩷") ^ i4;
                        i6 = ((iM55680 ^ i5) * 23991) ^ 623438137;
                        i3 = 355091808;
                        i11 = i12;
                        i7 = iM55680 ^ i3;
                    } else {
                        c19701M55781 = c19701M55781;
                        i12 = i12;
                        iM55979 = (C0873.m55680("ۡۧ") + i5) * (-97);
                        i = ((iM55979 ^ i4) * 9875) ^ 1548468764;
                        i2 = -640562412;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    }
                    break;
                case -1643319444:
                case -1475042393:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    sArr2 = f81901;
                    i10 = 165;
                    if (C0927.f81875) {
                        iM55979 = C0873.m55680("ۙۘ") ^ i4;
                        i = ((iM55979 ^ i5) * 14483) ^ (-1178675760);
                        i2 = 100847723;
                    } else {
                        iM55979 = (C0946.m55979("۠֡") ^ i4) * 109;
                        i = ((iM55979 ^ i5) * (-9753)) ^ 1273803844;
                        i2 = 1903157185;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1581238267:
                case -343808206:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    int i13 = s + s3;
                    if ((i13 * i13) - i8 >= 0) {
                        iM55979 = C0873.m55680("ۚۖ") ^ i5;
                        i = ((iM55979 ^ i4) * 19605) ^ 69130498;
                        i2 = -2019208948;
                    } else {
                        iM55979 = C0946.m55979("ܺۨ") ^ i5;
                        i = ((iM55979 ^ i4) * (-31465)) ^ 886218845;
                        i2 = -2024040409;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1344694580:
                case 298012738:
                    i12 = i12;
                    c19701M55781 = RunnableC0897.m55781(4160);
                    C0930.m55884(c19701M55781, str);
                    if (C0882.m55710() == 0) {
                        iM55979 = C0946.m55979("ۙۙ") ^ i4;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i5) * (-25181)) ^ (-1877796489);
                        i2 = -1251366003;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩷") ^ i4;
                        i6 = ((iM55680 ^ i5) * 23991) ^ 623438137;
                        i3 = 355091808;
                        i11 = i12;
                        i7 = iM55680 ^ i3;
                    }
                    break;
                case -1296605052:
                case -230012848:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    i8 = (s * s2) + 1;
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("ۢ۠") + i5) * (-61);
                        i = ((iM55979 ^ i4) * 5809) ^ 1227041292;
                        i2 = 1995282600;
                    } else {
                        iM55979 = (C0873.m55680("۬֫") + i5) * (-105);
                        i = ((iM55979 ^ i4) * 13933) ^ (-1707418021);
                        i2 = 301445681;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -1273475652:
                case 142002697:
                    final Map mapM9877 = m9877(ViewOnClickListenerC0939.m55952(c25065M55668));
                    i12 = i12;
                    if (C1071.f81975 > 0) {
                        m9871(new Consumer() { // from class: l.ۙ֨ۡ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void m45213n(Object obj) {
                                Map map = null;
                                int i14 = 1052969802;
                                int i15 = C1124.f82007;
                                int i16 = RunnableC0938.f81886;
                                int iM559710 = (C0946.m55979("᩹ۘ") + i15) * 73;
                                int i17 = ((iM559710 ^ i16) * 7727) ^ 696919886;
                                int i18 = -685295187;
                                while (true) {
                                    i14 = ((((i14 ^ i16) * 25605) >> 31) & i17) ^ (iM559710 ^ i18);
                                    switch (i14) {
                                        case -2145842354:
                                        case 1855401601:
                                            if (RunnableC0938.m55938() != 0) {
                                                iM559710 = (i16 - C0946.m55979("۬ۨ")) * (-67);
                                                i17 = ((iM559710 ^ i15) * 5921) ^ (-1698039438);
                                                i18 = 474563777;
                                            } else {
                                                iM559710 = C0873.m55680("ۚۤ") ^ i15;
                                                i17 = ((iM559710 ^ i16) * 20149) ^ 999144342;
                                                i18 = 428659135;
                                            }
                                            break;
                                        case -1906419148:
                                        case 639269182:
                                            if (C0863.f81833 <= 0) {
                                                iM559710 = (i16 - C0946.m55979("۬ۨ")) * (-67);
                                                i17 = ((iM559710 ^ i15) * 5921) ^ (-1698039438);
                                                i18 = 474563777;
                                            } else {
                                                iM559710 = C0873.m55680("ܽᩴ") ^ i15;
                                                i17 = ((iM559710 ^ i16) * 15793) ^ (-1280761500);
                                                i18 = -1654616460;
                                            }
                                            break;
                                        case -1546467719:
                                        case 1113409944:
                                            if (C0967.m56074()) {
                                                iM559710 = (C0873.m55680("ۜܿ") ^ i15) * (-123);
                                                i17 = ((iM559710 ^ i16) * 15505) ^ (-1617432229);
                                                i18 = -255169466;
                                            } else {
                                                iM559710 = C0946.m55979("ᩳܽ") ^ i16;
                                                i17 = ((iM559710 ^ i15) * 27375) ^ 2140909933;
                                                i18 = -649606511;
                                            }
                                            break;
                                        case -1136835407:
                                        case 530196470:
                                            if (C1194.m56396() <= 0) {
                                                iM559710 = (i16 - C0946.m55979("۬ۨ")) * (-67);
                                                i17 = ((iM559710 ^ i15) * 5921) ^ (-1698039438);
                                                i18 = 474563777;
                                            } else {
                                                iM559710 = (C0946.m55979("ۙۤ") + i16) * 23;
                                                i17 = ((iM559710 ^ i15) * (-28977)) ^ 596804718;
                                                i18 = -881899464;
                                            }
                                            break;
                                        case -932387817:
                                        case -154108734:
                                            RunnableC1014.m56177();
                                            if (C1028.f81950 <= 0) {
                                                iM559710 = (i16 - C0946.m55979("۬ۨ")) * (-67);
                                                i17 = ((iM559710 ^ i15) * 5921) ^ (-1698039438);
                                                i18 = 474563777;
                                            } else {
                                                iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                                i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                                i18 = 667222141;
                                            }
                                            break;
                                        case -840971337:
                                        case 8763524:
                                            AbstractC0942.m55971();
                                            if (!C0892.f81851) {
                                                iM559710 = (i15 - C0946.m55979("ܳ۬")) * (-67);
                                                i17 = ((iM559710 ^ i16) * (-16467)) ^ (-1861420349);
                                                i18 = -1730461737;
                                            } else {
                                                iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                                i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                                i18 = 667222141;
                                            }
                                            break;
                                        case -790366821:
                                        case 103768505:
                                            map = mapM9877;
                                            if (C0912.f81867 <= 0) {
                                                iM559710 = (C0873.m55680("ۜܿ") ^ i15) * (-123);
                                                i17 = ((iM559710 ^ i16) * 15505) ^ (-1617432229);
                                                i18 = -255169466;
                                            } else {
                                                iM559710 = (C0946.m55979("۠ۚ") + i15) * 99;
                                                i17 = ((iM559710 ^ i16) * (-28175)) ^ 2087882668;
                                                i18 = -1424921239;
                                            }
                                            break;
                                        case -746533691:
                                        case 1218915985:
                                            if (C1017.f81942 >= 0) {
                                                iM559710 = C0873.m55680("۠᩶") ^ i16;
                                                i17 = ((iM559710 ^ i15) * (-25615)) ^ (-18396766);
                                                i18 = 1829729363;
                                            } else {
                                                iM559710 = (i15 - C0946.m55979("ܺ֨")) * (-39);
                                                i17 = ((iM559710 ^ i16) * 9657) ^ 1054423060;
                                                i18 = -1020840009;
                                            }
                                            break;
                                        case -621003914:
                                        case -51624721:
                                            C0947.m55997();
                                            RunnableC1014.m56177();
                                            iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                            i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                            i18 = 667222141;
                                            break;
                                        case -189060446:
                                        case 707841495:
                                            if (C1012.m56134() <= 0) {
                                                iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                                i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                                i18 = 667222141;
                                            } else {
                                                iM559710 = (C0946.m55979("ۖۢ") ^ i16) * (-9);
                                                i17 = ((iM559710 ^ i15) * (-17159)) ^ (-341142988);
                                                i18 = 2094402707;
                                            }
                                            break;
                                        case -103680129:
                                        case 397934138:
                                            ((C17393) obj).f51905 = map;
                                            break;
                                        case 75585299:
                                        case 421414092:
                                            C0937.m55918();
                                            C0892.m55749();
                                            break;
                                        case 269424922:
                                        case 1884771572:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                                i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                                i18 = 667222141;
                                            } else {
                                                iM559710 = (C0946.m55979("᩵ۜ") + i15) * 123;
                                                i17 = ((iM559710 ^ i16) * 11577) ^ 1963013532;
                                                i18 = -1842955379;
                                            }
                                            break;
                                        case 733674926:
                                        case 1914043921:
                                            if (C1404.f82149 >= 0) {
                                                iM559710 = C0873.m55680("۠᩶") ^ i16;
                                                i17 = ((iM559710 ^ i15) * (-25615)) ^ (-18396766);
                                                i18 = 1829729363;
                                            } else {
                                                iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                                i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                                i18 = 667222141;
                                            }
                                            break;
                                        case 1546993649:
                                        case 1921190315:
                                            if (C0898.m55800() <= 0) {
                                                iM559710 = (i15 - C0946.m55979("ۤۙ")) * 39;
                                                i17 = ((iM559710 ^ i16) * (-15859)) ^ 1646157995;
                                                i18 = 667222141;
                                            } else {
                                                iM559710 = C0873.m55680("֫ۨ") ^ i16;
                                                i17 = ((iM559710 ^ i15) * (-1277)) ^ (-112238934);
                                                i18 = 532493187;
                                            }
                                            break;
                                        default:
                                            if (C0863.f81833 <= 0) {
                                                iM559710 = (i15 - C0946.m55979("ܳ۬")) * (-67);
                                                i17 = ((iM559710 ^ i16) * (-16467)) ^ (-1861420349);
                                                i18 = -1730461737;
                                            } else {
                                                iM559710 = (C0946.m55979("᩹֡") ^ i16) * C0254q.f1218h;
                                                i17 = ((iM559710 ^ i15) * (-6863)) ^ 473988658;
                                                i18 = 1413951067;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM55979 = C0873.m55680("ۚۛ") ^ i4;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i5) * 26469) ^ 1766417174;
                        i2 = 2117569784;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩷") ^ i4;
                        i6 = ((iM55680 ^ i5) * 23991) ^ 623438137;
                        i3 = 355091808;
                        i11 = i12;
                        i7 = iM55680 ^ i3;
                    }
                    break;
                case -1156127145:
                case -636356782:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    sArr = f81901;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ۢ۠") + i5) * (-61);
                        i = ((iM55979 ^ i4) * 5809) ^ 1227041292;
                        i2 = 1995282600;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܿ᩵")) * (-33);
                        i = ((iM55979 ^ i5) * 14053) ^ 1790458660;
                        i2 = -1958790546;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -890972318:
                case 36926475:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("ܽۗ") ^ i4;
                        i = ((iM55979 ^ i5) * (-21955)) ^ 1767476590;
                        i2 = -1198439001;
                    } else {
                        iM55979 = (C0946.m55979("ۤܰ") + i5) * (-51);
                        i = ((iM55979 ^ i4) * (-22949)) ^ 1759618236;
                        i2 = -1931446583;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -743425976:
                case 661809714:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    packageName = viewOnClickListenerC7928.getPackageName();
                    if (C1194.f82045 != 0) {
                        iM55979 = C0946.m55979("ܽۗ") ^ i4;
                        i = ((iM55979 ^ i5) * (-21955)) ^ 1767476590;
                        i2 = -1198439001;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩻") ^ i5;
                        i = ((iM55979 ^ i4) * (-16237)) ^ 401521274;
                        i2 = 2041397609;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -738753353:
                case 1365190276:
                    C0898.m55800();
                    AbstractC0942.m55971();
                    break;
                case -530291119:
                case 1885212464:
                    if (C0863.f81833 > 0) {
                        c19701M55781 = c19701M55781;
                        i12 = i12;
                        iM55979 = C0946.m55979("ܽۗ") ^ i4;
                        i = ((iM55979 ^ i5) * (-21955)) ^ 1767476590;
                        i2 = -1198439001;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    }
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    iM55979 = (C0873.m55680("ۡۧ") + i5) * (-97);
                    i = ((iM55979 ^ i4) * 9875) ^ 1548468764;
                    i2 = -640562412;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -347591170:
                case 945720135:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    s3 = 1;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ۡۧ") + i5) * (-97);
                        i = ((iM55979 ^ i4) * 9875) ^ 1548468764;
                        i2 = -640562412;
                    } else {
                        iM55979 = (i4 - C0873.m55680("᩹֫")) * (-105);
                        i = ((iM55979 ^ i5) * (-30317)) ^ 806808410;
                        i2 = 1945386416;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case -174655684:
                case 891470399:
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    s = sArr[164];
                    s2 = 2;
                    if (C0912.f81867 <= 0) {
                        iM55979 = C0873.m55680("ۙۘ") ^ i4;
                        i = ((iM55979 ^ i5) * 14483) ^ (-1178675760);
                        i2 = 100847723;
                    } else {
                        iM55979 = C0873.m55680("ۚۘ") ^ i4;
                        i = ((iM55979 ^ i5) * 20413) ^ 1936631257;
                        i2 = -730926241;
                    }
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case 359599433:
                case 430584970:
                    i12 = i12;
                    c19701M55781.m44745(zM55582);
                    c25065M55668 = RunnableC0871.m55668(c19701M55781);
                    if (!C0930.m55892(c25065M55668)) {
                        iM55979 = C0873.m55680("ۚۛ") ^ i4;
                        c19701M55781 = c19701M55781;
                        i = ((iM55979 ^ i5) * 26469) ^ 1766417174;
                        i2 = 2117569784;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    } else {
                        iM55680 = (i5 - C0873.m55680("֡ۢ")) * (-47);
                        i6 = ((iM55680 ^ i4) * (-10393)) ^ 1884984881;
                        i3 = 2002698544;
                        i11 = i12;
                        i7 = iM55680 ^ i3;
                    }
                    break;
                case 418258780:
                case 1221633708:
                    m9880(viewOnClickListenerC7928, c25065M55668, c3627);
                    break;
                case 949935095:
                case 1444710010:
                    i9 = 15054;
                    iM55979 = C0873.m55680("ۤ᩸") ^ i4;
                    i = ((iM55979 ^ i5) * (-20707)) ^ (-1830844255);
                    i2 = 1998252211;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case 1457681027:
                case 1770621449:
                    i9 = 7211;
                    iM55979 = C0873.m55680("ۤ᩸") ^ i4;
                    i = ((iM55979 ^ i5) * (-20707)) ^ (-1830844255);
                    i2 = 1998252211;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                case 1660806559:
                case 1945363428:
                    C0930.m55885();
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    iM55979 = (C0873.m55680("ۡۧ") + i5) * (-97);
                    i = ((iM55979 ^ i4) * 9875) ^ 1548468764;
                    i2 = -640562412;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
                default:
                    C1017.m56187();
                    if (C1036.m56257() <= 0) {
                        c19701M55781 = c19701M55781;
                        i12 = i12;
                        iM55979 = (C0946.m55979("ۢ۠") + i5) * (-61);
                        i = ((iM55979 ^ i4) * 5809) ^ 1227041292;
                        i2 = 1995282600;
                        i11 = i12;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                        c19701M55781 = c19701M55781;
                    }
                    c19701M55781 = c19701M55781;
                    i12 = i12;
                    iM55979 = (C0873.m55680("ۡۧ") + i5) * (-97);
                    i = ((iM55979 ^ i4) * 9875) ^ 1548468764;
                    i2 = -640562412;
                    i11 = i12;
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    c19701M55781 = c19701M55781;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9852(Activity activity, C12583 c12583) {
        int i = 0;
        C25065 c25065M55668 = null;
        final Map mapM9877 = null;
        int i2 = -1853692609;
        int i3 = RunnableC0938.f81886;
        int i4 = RunnableC0871.f81839;
        int iM55979 = (C0946.m55979("ۨۘ") + i3) * 25;
        int i5 = ((iM55979 ^ i4) * (-23659)) ^ (-888573302);
        int i6 = -1232519599;
        while (true) {
            i2 = ((((i2 ^ i4) * 2029) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1981849381:
                case -1387115560:
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("ᩳ᩵") + i3) * (-79);
                        i5 = ((iM55979 ^ i4) * 17179) ^ (-1639977850);
                        i6 = -731223522;
                    } else {
                        iM55979 = C0873.m55680("۫ۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 31239) ^ 1682360754;
                        i6 = 20079098;
                    }
                    break;
                case -1731640550:
                case -584139218:
                    if (!C0861.f81831) {
                        iM55979 = C0946.m55979("ۚܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 22655) ^ 1192101576;
                        i6 = -65763413;
                    } else {
                        iM55979 = (C0946.m55979("ᩳܺ") ^ i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-23609)) ^ (-1605435363);
                        i6 = -1711712052;
                    }
                    break;
                case -1641858813:
                case -1431360820:
                    m9880(activity, c25065M55668, c12583);
                    break;
                case -1541860810:
                case 137422086:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ۖ᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-5935)) ^ (-1680084998);
                        i6 = -55807764;
                    } else {
                        iM55979 = C0946.m55979("ۢᩳ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 32311) ^ (-140971098);
                        i6 = -1356037765;
                    }
                    break;
                case -1409856308:
                case 1950759281:
                    if (C1017.f81942 < 0) {
                        m9871(new Consumer() { // from class: l.ۚ֨ۡ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void m45213n(Object obj) {
                                Map map = null;
                                int i7 = -2131638659;
                                int i8 = C1036.f81953;
                                int i9 = RunnableC0871.f81839;
                                int iM559710 = (i9 - C0946.m55979("᩶᩸")) * 95;
                                int i10 = ((iM559710 ^ i8) * (-25867)) ^ (-1937480238);
                                int i11 = 942355818;
                                while (true) {
                                    i7 = ((((i7 ^ i8) * (-4883)) >> 31) & i10) ^ (iM559710 ^ i11);
                                    switch (i7) {
                                        case -1809312202:
                                        case 1323841211:
                                            if (C0947.f81895) {
                                                iM559710 = C0946.m55979("ᩳ֨") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-3717)) ^ 586934008;
                                                i11 = -722681458;
                                            } else {
                                                iM559710 = C0946.m55979("᩹ܽ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 18545) ^ 537932678;
                                                i11 = 879851410;
                                            }
                                            break;
                                        case -1651147310:
                                        case 100558938:
                                            if (C0845.f81821 >= 0) {
                                                iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                                i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                                i11 = -1599882933;
                                            } else {
                                                iM559710 = (C0946.m55979("۫᩵") ^ i9) * 101;
                                                i10 = ((iM559710 ^ i8) * (-25933)) ^ 788155428;
                                                i11 = -303037645;
                                            }
                                            break;
                                        case -1416996267:
                                        case 459444889:
                                            if (C0967.f81910 >= 0) {
                                                iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                                i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                                i11 = -1599882933;
                                            } else {
                                                iM559710 = (i9 - C0946.m55979("ۙ۠")) * 81;
                                                i10 = ((iM559710 ^ i8) * (-16583)) ^ (-1393218952);
                                                i11 = 1129796643;
                                            }
                                            break;
                                        case -1396183886:
                                        case 1514356777:
                                            if (C0946.f81894 != 0) {
                                                iM559710 = C0946.m55979("۟ۛ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 16003) ^ (-1160087932);
                                                i11 = -1600489427;
                                            } else {
                                                iM559710 = (C0873.m55680("ᩳۨ") + i8) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i10 = ((iM559710 ^ i9) * 17687) ^ (-1989071814);
                                                i11 = -262350050;
                                            }
                                            break;
                                        case -1383484455:
                                        case 2137053985:
                                            if (C0930.f81879 <= 0) {
                                                iM559710 = C0873.m55680("ۙۛ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-2605)) ^ (-1700062696);
                                                i11 = -1407076259;
                                            } else {
                                                iM559710 = C0946.m55979("ۢᩳ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * 20495) ^ (-169341730);
                                                i11 = 1243882870;
                                            }
                                            break;
                                        case -1252890565:
                                        case -748560496:
                                            if (C0912.f81867 <= 0) {
                                                iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                                i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                                i11 = -1599882933;
                                            } else {
                                                iM559710 = (C0873.m55680("ۨۚ") + i8) * (-89);
                                                i10 = ((iM559710 ^ i9) * (-17039)) ^ 1409269459;
                                                i11 = 781378727;
                                            }
                                            break;
                                        case -1232992572:
                                        case 1944700995:
                                            ((C17393) obj).f51905 = map;
                                            break;
                                        case -306651544:
                                        case 431354925:
                                            map = mapM9877;
                                            if (C1036.f81953 >= 0) {
                                                iM559710 = C0946.m55979("ۘ᩺") ^ i9;
                                                i10 = ((iM559710 ^ i8) * (-25991)) ^ (-1512230635);
                                                i11 = 1646248867;
                                            } else {
                                                iM559710 = C0873.m55680("ܳۛ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 29891) ^ 155116049;
                                                i11 = -367865372;
                                            }
                                            break;
                                        case -93267602:
                                        case 1521256832:
                                            if (C0989.f81920 >= 0) {
                                                iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                                i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                                i11 = -1599882933;
                                            } else {
                                                iM559710 = (i8 - C0946.m55979("ܳۜ")) * (-39);
                                                i10 = ((iM559710 ^ i9) * (-25951)) ^ 735679723;
                                                i11 = 1310540798;
                                            }
                                            break;
                                        case -81667285:
                                        case 1488370470:
                                            if (C0989.m56095() <= 0) {
                                                iM559710 = C0873.m55680("ۙۛ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-2605)) ^ (-1700062696);
                                                i11 = -1407076259;
                                            } else {
                                                iM559710 = (C0873.m55680("ᩴۜ") + i8) * (-19);
                                                i10 = ((iM559710 ^ i9) * 4633) ^ 1840524360;
                                                i11 = -2041953095;
                                            }
                                            break;
                                        case -68889938:
                                        case 843553251:
                                            C0877.m55696();
                                            if (C1053.m56327() < 0) {
                                                iM559710 = C0946.m55979("ᩳ֨") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-3717)) ^ 586934008;
                                                i11 = -722681458;
                                            } else {
                                                iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                                i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                                i11 = -1599882933;
                                            }
                                            break;
                                        case 599609296:
                                        case 1441757625:
                                            RunnableC1014.m56177();
                                            C0890.m55740();
                                            break;
                                        case 771556618:
                                        case 1420410858:
                                            if (RunnableC0938.f81886 >= 0) {
                                                iM559710 = C0873.m55680("ۙۛ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-2605)) ^ (-1700062696);
                                                i11 = -1407076259;
                                            } else {
                                                iM559710 = C0873.m55680("۬ۘ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 9557) ^ (-845201755);
                                                i11 = 1251671379;
                                            }
                                            break;
                                        case 962681950:
                                        case 1516684520:
                                            C1053.m56327();
                                            if (C0927.m55873() > 0) {
                                                iM559710 = C0873.m55680("ۙۛ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-2605)) ^ (-1700062696);
                                                i11 = -1407076259;
                                            } else {
                                                iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                                i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                                i11 = -1599882933;
                                            }
                                            break;
                                        case 1254245738:
                                        case 1757725754:
                                            C1124.m56367();
                                            iM559710 = (i9 - C0873.m55680("ۧۗ")) * (-59);
                                            i10 = ((iM559710 ^ i8) * 31881) ^ (-208972393);
                                            i11 = -1599882933;
                                            break;
                                        default:
                                            RunnableC0897.m55784();
                                            if (C1025.f81947 < 0) {
                                                iM559710 = C0946.m55979("۟ۛ") ^ i9;
                                                i10 = ((iM559710 ^ i8) * 16003) ^ (-1160087932);
                                                i11 = -1600489427;
                                            } else {
                                                iM559710 = C0873.m55680("ۙۛ") ^ i8;
                                                i10 = ((iM559710 ^ i9) * (-2605)) ^ (-1700062696);
                                                i11 = -1407076259;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        });
                        iM55979 = (C0946.m55979("ܰۖ") ^ i3) * (-9);
                        i5 = ((iM55979 ^ i4) * 12545) ^ (-968439180);
                        i6 = 1092732951;
                    } else {
                        iM55979 = C0946.m55979("ۤܺ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 12697) ^ 1828139088;
                        i6 = -2026911073;
                    }
                    break;
                case -1337061108:
                case 1844937508:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (C0946.m55979("ᩳܺ") ^ i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-23609)) ^ (-1605435363);
                        i6 = -1711712052;
                    } else {
                        iM55979 = C0946.m55979("ۤܺ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 12697) ^ 1828139088;
                        i6 = -2026911073;
                    }
                    break;
                case -1102061911:
                case 1833910694:
                    C0927.m55873();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = C0873.m55680("۫ۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 31239) ^ 1682360754;
                        i6 = 20079098;
                    } else {
                        iM55979 = (C0946.m55979("ᩳܺ") ^ i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-23609)) ^ (-1605435363);
                        i6 = -1711712052;
                    }
                    break;
                case -1077894520:
                case 1786448501:
                    mapM9877 = m9877(C0906.m55815(c25065M55668));
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0946.m55979("ᩳܺ") ^ i4) * 73;
                        i5 = ((iM55979 ^ i3) * (-23609)) ^ (-1605435363);
                        i6 = -1711712052;
                    } else {
                        iM55979 = (C0873.m55680("ۧܿ") + i4) * 11;
                        i5 = ((iM55979 ^ i3) * (-23453)) ^ (-435676344);
                        i6 = 908734753;
                    }
                    break;
                case -1049091677:
                case 235490995:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0946.m55979("ۚܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 22655) ^ 1192101576;
                        i6 = -65763413;
                    } else {
                        iM55979 = C0946.m55979("ۤۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 30047) ^ (-1060342317);
                        i6 = -1714166188;
                    }
                    break;
                case -452900440:
                case 382519651:
                    C0906.m55809();
                    C1048.m56305();
                    break;
                case 14283274:
                case 1447982758:
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0946.m55979("ۚܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 22655) ^ 1192101576;
                        i6 = -65763413;
                    } else {
                        iM55979 = (C0946.m55979("۬ܽ") + i3) * (-3);
                        i5 = ((iM55979 ^ i4) * (-13579)) ^ 1695672368;
                        i6 = -1960187732;
                    }
                    break;
                case 304018917:
                case 757941847:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("ۖ᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-5935)) ^ (-1680084998);
                        i6 = -55807764;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * 21509) ^ 102695283;
                        i6 = -1725761869;
                    }
                    break;
                case 767728594:
                case 1450908197:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۖ᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-5935)) ^ (-1680084998);
                        i6 = -55807764;
                    } else {
                        iM55979 = C0946.m55979("ۤ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 27833) ^ 1531974359;
                        i6 = -1261017744;
                    }
                    break;
                case 777144601:
                case 1593959314:
                    i = 4162;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ۖ᩶") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-5935)) ^ (-1680084998);
                        i6 = -55807764;
                    } else {
                        iM55979 = C0946.m55979("᩹᩻") ^ i4;
                        i5 = ((iM55979 ^ i3) * 1577) ^ 728167172;
                        i6 = -248242416;
                    }
                    break;
                case 839942575:
                case 920097029:
                    if (C1964.m56597() != 0) {
                        iM55979 = C0873.m55680("۫ۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 31239) ^ 1682360754;
                        i6 = 20079098;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ᩳܿ")) * 119;
                        i5 = ((iM55979 ^ i4) * (-20221)) ^ 1598247356;
                        i6 = -516001269;
                    }
                    break;
                case 1258191543:
                case 2114540036:
                    C0989.m56095();
                    iM55979 = C0946.m55979("ۤܺ") ^ i3;
                    i5 = ((iM55979 ^ i4) * 12697) ^ 1828139088;
                    i6 = -2026911073;
                    break;
                default:
                    c25065M55668 = RunnableC0871.m55668(RunnableC0897.m55781(i));
                    if (C0866.m55655(c25065M55668)) {
                        iM55979 = C0946.m55979("ۢۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 193) ^ (-814931328);
                        i6 = 641433887;
                    } else {
                        iM55979 = (C0946.m55979("ܰۖ") ^ i3) * (-9);
                        i5 = ((iM55979 ^ i4) * 12545) ^ (-968439180);
                        i6 = 1092732951;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9869(byte[] bArr, String str, String str2, String str3, Activity activity, InterfaceC11360 interfaceC11360) {
        C19701 c19701M55781 = null;
        int i = -82808808;
        int i2 = C1229.f82066;
        int i3 = C0949.f81897;
        int iM55979 = (i2 - C0946.m55979("ܽܽ")) * (-71);
        int i4 = ((iM55979 ^ i3) * (-30871)) ^ 1285240860;
        int i5 = 1248065614;
        while (true) {
            i = ((((i ^ i3) * (-21077)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1858196112:
                case -538805609:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("۫֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31057) ^ 1326595712;
                        i5 = -1656426729;
                    } else {
                        iM55979 = C0946.m55979("ۡۛ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14817) ^ (-126806091);
                        i5 = 452765107;
                    }
                    break;
                case -1425228562:
                case 1120694080:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i2 - C0873.m55680("֫ܳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * 28099) ^ 1957644477;
                        i5 = 351522461;
                    } else {
                        iM55979 = (C0873.m55680("ۤۡ") ^ i3) * (-83);
                        i4 = ((iM55979 ^ i2) * (-14245)) ^ (-1565404829);
                        i5 = -1783677125;
                    }
                    break;
                case -1271090484:
                case 52950242:
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("֫ۗ") + i2) * (-21);
                        i4 = ((iM55979 ^ i3) * 12529) ^ 1424275881;
                        i5 = 1677606656;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩺") + i3) * (-93);
                        i4 = ((iM55979 ^ i2) * (-14589)) ^ (-79365182);
                        i5 = -1788123316;
                    }
                    break;
                case -1266844465:
                case 481086788:
                    c19701M55781 = RunnableC0897.m55781(4195);
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ۜۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14883) ^ 221177335;
                        i5 = -508425995;
                    } else {
                        iM55979 = C0873.m55680("ۧ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * 31259) ^ (-235411486);
                        i5 = -1227944864;
                    }
                    break;
                case -1266415660:
                case 35151410:
                    if (C1025.f81947 < 0) {
                        iM55979 = (i3 - C0873.m55680("ۨۢ")) * (-61);
                        i4 = ((iM55979 ^ i2) * (-28211)) ^ 875567710;
                        i5 = 1220782050;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩺") + i3) * (-93);
                        i4 = ((iM55979 ^ i2) * (-14589)) ^ (-79365182);
                        i5 = -1788123316;
                    }
                    break;
                case -1159316895:
                case 750057072:
                    C0898.m55800();
                    iM55979 = (C0873.m55680("ۚ᩺") + i3) * (-93);
                    i4 = ((iM55979 ^ i2) * (-14589)) ^ (-79365182);
                    i5 = -1788123316;
                    break;
                case -976127471:
                case 1160172346:
                    C0930.m55884(c19701M55781, str2);
                    C0866.m55644(c19701M55781, str3);
                    m9880(activity, c19701M55781.m44754(), interfaceC11360);
                    break;
                case -676678241:
                case 1770674283:
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ۚ᩺") + i3) * (-93);
                        i4 = ((iM55979 ^ i2) * (-14589)) ^ (-79365182);
                        i5 = -1788123316;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩵֡")) * 35;
                        i4 = ((iM55979 ^ i2) * (-28813)) ^ (-1765677076);
                        i5 = 660238142;
                    }
                    break;
                case -475590425:
                case 1872326706:
                    C1012.m56134();
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (i2 - C0873.m55680("֫ܳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * 28099) ^ 1957644477;
                        i5 = 351522461;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۨۢ")) * (-61);
                        i4 = ((iM55979 ^ i2) * (-28211)) ^ 875567710;
                        i5 = 1220782050;
                    }
                    break;
                case -333807903:
                case 1322375116:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("۫֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31057) ^ 1326595712;
                        i5 = -1656426729;
                    } else {
                        iM55979 = (C0946.m55979("ܳܺ") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * (-32303)) ^ 1885202998;
                        i5 = -448106733;
                    }
                    break;
                case 80668849:
                case 1067636799:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ۨۢ")) * (-61);
                        i4 = ((iM55979 ^ i2) * (-28211)) ^ 875567710;
                        i5 = 1220782050;
                    } else {
                        iM55979 = C0873.m55680("ۛ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6879)) ^ (-253244319);
                        i5 = -511023654;
                    }
                    break;
                case 606713180:
                case 953954968:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i2 - C0873.m55680("֫ܳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * 28099) ^ 1957644477;
                        i5 = 351522461;
                    } else {
                        iM55979 = (C0873.m55680("᩻۟") ^ i2) * (-47);
                        i4 = ((iM55979 ^ i3) * 24069) ^ 506604523;
                        i5 = 704198881;
                    }
                    break;
                case 739693855:
                case 2119624038:
                    if (C1025.f81947 < 0) {
                        iM55979 = C0873.m55680("۫֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 31057) ^ 1326595712;
                        i5 = -1656426729;
                    } else {
                        iM55979 = (C0873.m55680("ۚ᩺") + i3) * (-93);
                        i4 = ((iM55979 ^ i2) * (-14589)) ^ (-79365182);
                        i5 = -1788123316;
                    }
                    break;
                case 954490712:
                case 969253713:
                    c19701M55781.m44746(C6054.m13643(bArr, bArr.length));
                    C0930.m55884(c19701M55781, str);
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (i3 - C0873.m55680("ۨۢ")) * (-61);
                        i4 = ((iM55979 ^ i2) * (-28211)) ^ 875567710;
                        i5 = 1220782050;
                    } else {
                        iM55979 = (C0946.m55979("ۢ۬") + i2) * (-75);
                        i4 = ((iM55979 ^ i3) * (-20631)) ^ 679931120;
                        i5 = -1693222465;
                    }
                    break;
                case 1794470352:
                case 2110618898:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (i2 - C0873.m55680("֫ܳ")) * (-79);
                        i4 = ((iM55979 ^ i3) * 28099) ^ 1957644477;
                        i5 = 351522461;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩷᩷")) * (-21);
                        i4 = ((iM55979 ^ i3) * (-14459)) ^ 1126331171;
                        i5 = -1339032558;
                    }
                    break;
                default:
                    C0866.m55645();
                    C0873.m55678();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0273 A[PHI: r4 r5 r6 r8 r9 r18 r19
      0x0273: PHI (r4v4 char) = (r4v2 char), (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r5v4 short) = (r5v2 short), (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r6v4 short) = (r6v2 short), (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r8v3 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v4 int) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r9v3 short) = (r9v2 short), (r9v2 short), (r9v2 short), (r9v4 short) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r18v15 l.ᩳᩴۡ) = (r18v10 l.ᩳᩴۡ), (r18v11 l.ᩳᩴۡ), (r18v12 l.ᩳᩴۡ), (r18v16 l.ᩳᩴۡ) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:68:0x0292, B:64:0x0271, B:60:0x024c, B:52:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x02ca A[PHI: r7 r18
      0x02ca: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:73:0x02c8, B:56:0x0227] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r18v13 l.ᩳᩴۡ) = (r18v9 l.ᩳᩴۡ), (r18v14 l.ᩳᩴۡ) binds: [B:73:0x02c8, B:56:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C25065 m9847(String str, boolean z) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int i5 = C0863.f81833;
        int i6 = C1036.f81953;
        int iM559710 = C0946.m55979("᩻۠") ^ i5;
        int i7 = ((iM559710 ^ i6) * 12665) ^ (-883323907);
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM559710 ^ (-253388362);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        short s3 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = -1568467394;
        String strM47462 = null;
        C19701 c19701M55781 = null;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i6) * (-1265)) >> 31));
            switch (i15) {
                case -1756153539:
                case -1418591572:
                    i12 = 1825;
                    iM55979 = C0873.m55680("֨ᩳ") ^ i5;
                    i3 = ((iM55979 ^ i6) * (-20219)) ^ (-1404297811);
                    i4 = 854516978;
                    C19701 c19701 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c19701;
                    break;
                case -1729723668:
                case 1631675469:
                    sArr2 = f81901;
                    if (C1048.f81963) {
                        int iM559711 = C0946.m55979("ۛܺ") ^ i6;
                        i8 = iM559711 ^ (-878260791);
                        i7 = ((iM559711 ^ i5) * 17587) ^ 646551026;
                        i13 = 122;
                    } else {
                        c19701M55781 = c19701M55781;
                        i13 = 122;
                        iM55979 = C0873.m55680("ܳ۬") ^ i6;
                        i3 = ((iM55979 ^ i5) * 8139) ^ (-139873665);
                        i4 = -1621704544;
                        C19701 c19702 = c19701M55781;
                        i8 = iM55979 ^ i4;
                        i7 = i3;
                        c19701M55781 = c19702;
                    }
                    break;
                case -1662846442:
                case -1567104090:
                    c19701M55781 = c19701M55781;
                    s = sArr[c];
                    s2 = 1;
                    if (C1044.f81959 >= 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                        i4 = 1967096264;
                    } else {
                        iM55979 = (C0873.m55680("ۨۡ") + i6) * 7;
                        i3 = ((iM55979 ^ i5) * 14241) ^ (-645136565);
                        i4 = 1097608636;
                    }
                    C19701 c19703 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c19703;
                    break;
                case -1658388834:
                case 933467764:
                    C0866.m55645();
                    return null;
                case -1162332491:
                case -351766385:
                    C0937.m55918();
                    if (C0967.f81910 < 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = C0873.m55680("ܳ۬") ^ i6;
                        i3 = ((iM55979 ^ i5) * 8139) ^ (-139873665);
                        i4 = -1621704544;
                        C19701 c19704 = c19701M55781;
                        i8 = iM55979 ^ i4;
                        i7 = i3;
                        c19701M55781 = c19704;
                    } else {
                        iM55680 = C0873.m55680("ۙ۠") ^ i5;
                        i = ((iM55680 ^ i6) * 21901) ^ (-1015323998);
                        i2 = -927685796;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1026299697:
                case -799065222:
                    RunnableC0938.m55938();
                    C0890.m55740();
                    iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                    c19701M55781 = c19701M55781;
                    i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                    i4 = 1967096264;
                    C19701 c19705 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c19705;
                    break;
                case -879349958:
                case 494188222:
                    if (C1404.f82149 >= 0) {
                        iM55680 = (i6 - C0946.m55979("᩵ۘ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM55680 ^ i5) * 9387) ^ 488937811;
                        i2 = 1055807887;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        c19701M55781 = c19701M55781;
                        iM55979 = C0873.m55680("ܳ۬") ^ i6;
                        i3 = ((iM55979 ^ i5) * 8139) ^ (-139873665);
                        i4 = -1621704544;
                        C19701 c19706 = c19701M55781;
                        i8 = iM55979 ^ i4;
                        i7 = i3;
                        c19701M55781 = c19706;
                    }
                    break;
                case -828638002:
                case 704998968:
                    if (z) {
                        strM47462 = str;
                        iM55979 = (C0873.m55680("֫ۚ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i3 = ((iM55979 ^ i5) * 16297) ^ 492277690;
                        i4 = -913118233;
                    } else {
                        iM55979 = (C0946.m55979("᩻۬") + i5) * (-93);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i6) * 20863) ^ (-994279812);
                        i4 = 1774022490;
                    }
                    C19701 c19707 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c19707;
                    break;
                case -757884986:
                case 365047866:
                    c19701M55781 = c19701M55781;
                    c = 'y';
                    if (C1229.m56410() != 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                        i4 = 1967096264;
                    } else {
                        iM55979 = C0873.m55680("᩵ܳ") ^ i5;
                        i3 = ((iM55979 ^ i6) * (-3567)) ^ 32255834;
                        i4 = -2079686071;
                    }
                    C19701 c19708 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c19708;
                    break;
                case -634954026:
                case 290470110:
                    c19701M55781 = c19701M55781;
                    i9 = s + s2;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("ܿ᩵") ^ i5;
                        i3 = ((iM55979 ^ i6) * 1191) ^ 217416394;
                        i4 = -746744019;
                    } else {
                        iM55979 = (C0946.m55979("ۘᩳ") + i6) * 55;
                        i3 = ((iM55979 ^ i5) * (-6627)) ^ (-2118246636);
                        i4 = -448193417;
                    }
                    C19701 c19709 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c19709;
                    break;
                case -401743502:
                case 1674689350:
                    c19701M55781 = c19701M55781;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ܿ᩵") ^ i5;
                        i3 = ((iM55979 ^ i6) * 1191) ^ 217416394;
                        i4 = -746744019;
                    } else {
                        iM55979 = (C0946.m55979("ܺۗ") + i6) * (-79);
                        i3 = ((iM55979 ^ i5) * (-5435)) ^ 98844501;
                        i4 = -2140647025;
                    }
                    C19701 c197010 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197010;
                    break;
                case -366353921:
                case 1677820524:
                    c19701M55781 = c19701M55781;
                    i11 = s * s3;
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("ܳ۬") ^ i6;
                        i3 = ((iM55979 ^ i5) * 8139) ^ (-139873665);
                        i4 = -1621704544;
                    } else {
                        iM55979 = C0873.m55680("ܺ۫") ^ i6;
                        i3 = ((iM55979 ^ i5) * (-23225)) ^ 1070544905;
                        i4 = -506447418;
                    }
                    C19701 c197011 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197011;
                    break;
                case -242420450:
                case 2118741415:
                    c19701M55781 = c19701M55781;
                    i10 = i9 * i9;
                    s3 = 2;
                    if (C0927.f81875) {
                        c19701M55781 = c19701M55781;
                        iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                        i4 = 1967096264;
                    } else {
                        iM55979 = C0873.m55680("ۗ֨") ^ i5;
                        i3 = ((iM55979 ^ i6) * (-16425)) ^ (-1353127424);
                        i4 = 2095716572;
                    }
                    C19701 c197012 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197012;
                    break;
                case -205657833:
                case 269907507:
                    strM47462 = C21043.m47462(C17588.m40053(str, C0937.m55921(sArr2, i13, i14, i12)));
                    iM55979 = (C0873.m55680("֫ۚ") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i3 = ((iM55979 ^ i5) * 16297) ^ 492277690;
                    i4 = -913118233;
                    C19701 c197013 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197013;
                    break;
                case -159200100:
                case 2041905324:
                    C0894.m55769();
                    if (C0890.f81849 == 0) {
                        iM55680 = C0873.m55680("ۙ۠") ^ i5;
                        i = ((iM55680 ^ i6) * 21901) ^ (-1015323998);
                        i2 = -927685796;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                    } else {
                        iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                        i4 = 1967096264;
                        C19701 c197014 = c19701M55781;
                        i8 = iM55979 ^ i4;
                        i7 = i3;
                        c19701M55781 = c197014;
                    }
                    break;
                case -116516864:
                case 759509091:
                    if (C1046.f81962 <= 0) {
                        c19701M55781 = c19701M55781;
                        i14 = 12;
                        iM55979 = C0873.m55680("ܳ۬") ^ i6;
                        i3 = ((iM55979 ^ i5) * 8139) ^ (-139873665);
                        i4 = -1621704544;
                        C19701 c197015 = c19701M55781;
                        i8 = iM55979 ^ i4;
                        i7 = i3;
                        c19701M55781 = c197015;
                    } else {
                        int iM55681 = C0873.m55680("۠֨") ^ i5;
                        i8 = iM55681 ^ 150859770;
                        i7 = ((iM55681 ^ i6) * 3363) ^ (-816056272);
                        i14 = 12;
                    }
                    break;
                case 120846626:
                case 1434905768:
                    c19701M55781 = c19701M55781;
                    if ((i11 + 1) - i10 <= 0) {
                        iM55979 = (C0873.m55680("᩶۫") + i5) * (-69);
                        i3 = ((iM55979 ^ i6) * 30583) ^ 343818340;
                        i4 = 285714032;
                    } else {
                        iM55979 = C0873.m55680("ۚܿ") ^ i6;
                        i3 = ((iM55979 ^ i5) * (-8657)) ^ 1181137902;
                        i4 = 1907410061;
                    }
                    C19701 c197016 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197016;
                    break;
                case 865326727:
                case 1454398722:
                    i12 = 22517;
                    iM55979 = C0873.m55680("֨ᩳ") ^ i5;
                    i3 = ((iM55979 ^ i6) * (-20219)) ^ (-1404297811);
                    i4 = 854516978;
                    C19701 c197017 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197017;
                    break;
                case 1070092509:
                case 2132445271:
                    c19701M55781 = c19701M55781;
                    sArr = f81901;
                    if (C0877.f81843 >= 0) {
                        c19701M55781 = c19701M55781;
                        iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                        i4 = 1967096264;
                    } else {
                        iM55979 = C0946.m55979("ۨܿ") ^ i5;
                        i3 = ((iM55979 ^ i6) * (-22619)) ^ 1956569043;
                        i4 = 220835436;
                    }
                    C19701 c197018 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197018;
                    break;
                case 1217371065:
                case 1878286004:
                    c19701M55781 = RunnableC0897.m55781(4214);
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0946.m55979("ܺ᩹") + i6) * (-125);
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i5) * (-7737)) ^ 1979355905;
                        i4 = 1967096264;
                    } else {
                        iM55979 = C0873.m55680("᩹ۧ") ^ i5;
                        c19701M55781 = c19701M55781;
                        i3 = ((iM55979 ^ i6) * (-6757)) ^ (-2072304461);
                        i4 = 1119914233;
                    }
                    C19701 c197019 = c19701M55781;
                    i8 = iM55979 ^ i4;
                    i7 = i3;
                    c19701M55781 = c197019;
                    break;
                default:
                    C0930.m55884(c19701M55781, strM47462);
                    return C1025.m56232(c19701M55781);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC4527[] m9875(final C19561 c19561, final List list) {
        int iM55989 = 0;
        int i = -1468060371;
        int i2 = C0845.f81821;
        int i3 = C0930.f81879;
        int iM55680 = C0873.m55680("ܳۛ") ^ i2;
        int i4 = ((iM55680 ^ i3) * 32499) ^ (-2015623068);
        int i5 = -86069561;
        while (true) {
            i = ((((i ^ i3) * 13257) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2073299218:
                case 2032839739:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("᩵۬") + i2) * 83;
                        i4 = ((iM55680 ^ i3) * 8913) ^ (-1472692859);
                        i5 = -2063447655;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩷ܶ")) * (-119);
                        i4 = ((iM55680 ^ i2) * (-17187)) ^ (-374134526);
                        i5 = 2047030869;
                    }
                    break;
                case -1807009119:
                case 1066572852:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("֫ۡ") ^ i3) * (-95);
                        i4 = ((iM55680 ^ i2) * 13517) ^ (-86804194);
                        i5 = -1888408090;
                    } else {
                        iM55680 = C0873.m55680("ۘۤ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 559) ^ 1419707099;
                        i5 = -1471128313;
                    }
                    break;
                case -1722027311:
                case 1370694666:
                    C0927.m55873();
                    iM55680 = C0946.m55979("᩷֫") ^ i2;
                    i4 = ((iM55680 ^ i3) * 20101) ^ 1656970018;
                    i5 = 1424682671;
                    break;
                case -1583257670:
                case 1792042803:
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0946.m55979("ᩴ֡") + i2) * (-105);
                        i4 = ((iM55680 ^ i3) * (-28651)) ^ 2030854208;
                        i5 = -271784072;
                    } else {
                        iM55680 = (C0873.m55680("ۧۖ") + i3) * (-29);
                        i4 = ((iM55680 ^ i2) * 18597) ^ (-1918813185);
                        i5 = 2072577680;
                    }
                    break;
                case -1471362576:
                case -1120100065:
                    RunnableC0871.m55672();
                    C0912.m55833();
                    return null;
                case -1321684176:
                case -431318042:
                    C0946.m55980();
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0873.m55680("ۤ᩵") + i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-20017)) ^ 2046980011;
                        i5 = -1713712118;
                    } else {
                        iM55680 = C0946.m55979("᩷֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20101) ^ 1656970018;
                        i5 = 1424682671;
                    }
                    break;
                case -1011043612:
                case 1425382208:
                    if (C0892.f81851) {
                        iM55680 = C0946.m55979("֡ܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26027)) ^ 526439805;
                        i5 = 1469544568;
                    } else {
                        iM55680 = (C0873.m55680("֫ۡ") ^ i3) * (-95);
                        i4 = ((iM55680 ^ i2) * 13517) ^ (-86804194);
                        i5 = -1888408090;
                    }
                    break;
                case -1010518739:
                case -276956970:
                    if (C1404.m56468()) {
                        iM55680 = (C0873.m55680("ܺۛ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 3255) ^ (-1037040007);
                        i5 = -870832555;
                    } else {
                        iM55680 = (C0873.m55680("᩵۬") + i2) * 83;
                        i4 = ((iM55680 ^ i3) * 8913) ^ (-1472692859);
                        i5 = -2063447655;
                    }
                    break;
                case -880939803:
                case 9191500:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ۤ᩵") + i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-20017)) ^ 2046980011;
                        i5 = -1713712118;
                    } else {
                        iM55680 = C0873.m55680("ۜۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11047)) ^ (-158215658);
                        i5 = -310833325;
                    }
                    break;
                case -805575361:
                case -256002508:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ۤ᩵") + i3) * (-115);
                        i4 = ((iM55680 ^ i2) * (-20017)) ^ 2046980011;
                        i5 = -1713712118;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܳܽ")) * (-67);
                        i4 = ((iM55680 ^ i3) * 15021) ^ 1274027903;
                        i5 = -1023115318;
                    }
                    break;
                case -203729929:
                case 687619718:
                    if (C1003.m56123() != 0) {
                        iM55680 = (C0946.m55979("ᩴ֡") + i2) * (-105);
                        i4 = ((iM55680 ^ i3) * (-28651)) ^ 2030854208;
                        i5 = -271784072;
                    } else {
                        iM55680 = C0946.m55979("᩷֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20101) ^ 1656970018;
                        i5 = 1424682671;
                    }
                    break;
                case 108746116:
                case 148419119:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("᩷֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 20101) ^ 1656970018;
                        i5 = 1424682671;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܽۨ")) * 89;
                        i4 = ((iM55680 ^ i3) * (-24283)) ^ 1737183271;
                        i5 = 510339813;
                    }
                    break;
                case 570547415:
                case 1442133351:
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("᩵۬") + i2) * 83;
                        i4 = ((iM55680 ^ i3) * 8913) ^ (-1472692859);
                        i5 = -2063447655;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܶ۟")) * 89;
                        i4 = ((iM55680 ^ i2) * 8621) ^ 730730787;
                        i5 = 1337393;
                    }
                    break;
                case 1410913484:
                case 1650058530:
                    return m9882(iM55989, new InterfaceC10689() { // from class: l.۫֨ۡ
                        {
                            int i6 = -752855205;
                            int i7 = C0949.f81897;
                            int i8 = C1964.f83032;
                            int iM55681 = C0873.m55680("ۙܰ") ^ i8;
                            int i9 = ((iM55681 ^ i7) * (-11561)) ^ (-1478011822);
                            int i10 = -1754690097;
                            while (true) {
                                i6 = ((((i6 ^ i7) * (-3369)) >> 31) & i9) ^ (iM55681 ^ i10);
                                switch (i6) {
                                    case -2129017212:
                                    case -930786493:
                                        C0854.m55595();
                                        if (C0866.f81837 >= 0) {
                                            iM55681 = C0873.m55680("᩶۬") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 24497) ^ (-1943168926);
                                            i10 = -1202325410;
                                        } else {
                                            iM55681 = C0873.m55680("᩻۬") ^ i7;
                                            i9 = ((iM55681 ^ i8) * (-22293)) ^ (-115863578);
                                            i10 = 1211842824;
                                        }
                                        break;
                                    case -1854998785:
                                    case 379802693:
                                        C0873.m55678();
                                        C1124.m56367();
                                        throw new RuntimeException();
                                    case -1837967153:
                                    case 977554980:
                                        if (C0861.f81831) {
                                            iM55681 = C0946.m55979("ۖ᩶") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 15537) ^ 1810426621;
                                            i10 = 795998896;
                                        } else {
                                            iM55681 = C0946.m55979("۠ۡ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 7435) ^ 585291449;
                                            i10 = 670178814;
                                        }
                                        break;
                                    case -1686642385:
                                    case 1627410254:
                                        C1046.m56302();
                                        if (!RunnableC1014.m56177()) {
                                            iM55681 = (C0946.m55979("᩶᩷") + i8) * (-87);
                                            i9 = ((iM55681 ^ i7) * 6649) ^ 1971408373;
                                            i10 = 1840495472;
                                        } else {
                                            iM55681 = C0873.m55680("᩻۬") ^ i7;
                                            i9 = ((iM55681 ^ i8) * (-22293)) ^ (-115863578);
                                            i10 = 1211842824;
                                        }
                                        break;
                                    case -1474642829:
                                    case 1899473803:
                                        if (C1017.f81942 >= 0) {
                                            iM55681 = (C0946.m55979("ܶ֫") + i8) * (-101);
                                            i9 = ((iM55681 ^ i7) * 5419) ^ (-832749315);
                                            i10 = 1007295500;
                                        } else {
                                            iM55681 = (C0873.m55680("ᩴۤ") + i8) * (-23);
                                            i9 = ((iM55681 ^ i7) * 16439) ^ (-450905304);
                                            i10 = 329757105;
                                        }
                                        break;
                                    case -1340193991:
                                    case 1006086074:
                                        if (C0992.f81922 >= 0) {
                                            iM55681 = C0946.m55979("۠ۡ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 7435) ^ 585291449;
                                            i10 = 670178814;
                                        } else {
                                            iM55681 = (C0946.m55979("᩷ۢ") + i7) * (-93);
                                            i9 = ((iM55681 ^ i8) * 16113) ^ (-1930680345);
                                            i10 = -583062707;
                                        }
                                        break;
                                    case -1184571915:
                                    case -289238059:
                                        if (C0992.f81922 >= 0) {
                                            iM55681 = C0873.m55680("᩶۬") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 24497) ^ (-1943168926);
                                            i10 = -1202325410;
                                        } else {
                                            iM55681 = C0873.m55680("۬᩺") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 15237) ^ (-577158678);
                                            i10 = -497027712;
                                        }
                                        break;
                                    case -1022665164:
                                    case 1503986067:
                                        C0894.m55769();
                                        RunnableC0871.m55672();
                                        iM55681 = C0873.m55680("᩻۬") ^ i7;
                                        i9 = ((iM55681 ^ i8) * (-22293)) ^ (-115863578);
                                        i10 = 1211842824;
                                        break;
                                    case -681729858:
                                    case 1924016969:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM55681 = (C0946.m55979("ܶ֫") + i8) * (-101);
                                            i9 = ((iM55681 ^ i7) * 5419) ^ (-832749315);
                                            i10 = 1007295500;
                                        } else {
                                            iM55681 = C0946.m55979("ۖ֨") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 21699) ^ 1698795950;
                                            i10 = -1483667522;
                                        }
                                        break;
                                    case -558607510:
                                    case -205486048:
                                        if (C0917.m55854()) {
                                            iM55681 = C0946.m55979("۫ۛ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 3257) ^ (-662632307);
                                            i10 = 932496035;
                                        } else {
                                            iM55681 = C0873.m55680("᩶۬") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 24497) ^ (-1943168926);
                                            i10 = -1202325410;
                                        }
                                        break;
                                    case -473037330:
                                    case 1174160402:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55681 = C0946.m55979("۠ۡ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 7435) ^ 585291449;
                                            i10 = 670178814;
                                        } else {
                                            iM55681 = C0946.m55979("ۛܰ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * (-19887)) ^ 2141434760;
                                            i10 = 1900866528;
                                        }
                                        break;
                                    case -22786599:
                                    case 1792570636:
                                        C1044.m56286();
                                        if (C1053.f81965 <= 0) {
                                            iM55681 = (C0946.m55979("ܶ֫") + i8) * (-101);
                                            i9 = ((iM55681 ^ i7) * 5419) ^ (-832749315);
                                            i10 = 1007295500;
                                        } else {
                                            iM55681 = (C0946.m55979("᩶᩷") + i8) * (-87);
                                            i9 = ((iM55681 ^ i7) * 6649) ^ 1971408373;
                                            i10 = 1840495472;
                                        }
                                        break;
                                    case 445780531:
                                    case 1551612635:
                                        if (C1028.f81950 <= 0) {
                                            iM55681 = C0946.m55979("۠ۡ") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 7435) ^ 585291449;
                                            i10 = 670178814;
                                        } else {
                                            iM55681 = (i7 - C0946.m55979("ܳ۠")) * (-39);
                                            i9 = ((iM55681 ^ i8) * (-18599)) ^ (-474946742);
                                            i10 = -765720255;
                                        }
                                        break;
                                    case 725733429:
                                    case 990480552:
                                        if (C1048.f81963) {
                                            iM55681 = (C0873.m55680("ۚ۠") ^ i8) * (-55);
                                            i9 = ((iM55681 ^ i7) * (-10557)) ^ 465550013;
                                            i10 = -1882889117;
                                        } else {
                                            iM55681 = C0873.m55680("᩶۬") ^ i7;
                                            i9 = ((iM55681 ^ i8) * 24497) ^ (-1943168926);
                                            i10 = -1202325410;
                                        }
                                        break;
                                    case 833600368:
                                    case 2049024824:
                                        return;
                                    default:
                                        if (C1048.f81963) {
                                            iM55681 = C0946.m55979("ܽۡ") ^ i8;
                                            i9 = ((iM55681 ^ i7) * 17585) ^ (-135126661);
                                            i10 = -970757753;
                                        } else {
                                            iM55681 = (C0946.m55979("᩶᩷") + i8) * (-87);
                                            i9 = ((iM55681 ^ i7) * 6649) ^ 1971408373;
                                            i10 = 1840495472;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // p067l.InterfaceC10689
                        /* JADX INFO: renamed from: ֫ */
                        public final InputStream mo24623(int i6) {
                            List list2 = null;
                            Object objM56563 = null;
                            int i7 = 1832568646;
                            int i8 = C1012.f81938;
                            int i9 = C0863.f81833;
                            int iM55681 = C0873.m55680("ۤ᩹") ^ i8;
                            int i10 = ((iM55681 ^ i9) * (-13735)) ^ (-281345609);
                            int i11 = 2048474661;
                            while (true) {
                                i7 = ((((i7 ^ i9) * (-9771)) >> 31) & i10) ^ (iM55681 ^ i11);
                                switch (i7) {
                                    case -2042663563:
                                    case 1240012326:
                                        return C0917.m55845(c19561, (C5738) objM56563);
                                    case -2012744790:
                                    case -95262024:
                                        if (C1036.f81953 >= 0) {
                                            iM55681 = (C0946.m55979("ۨ᩹") + i8) * (-91);
                                            i10 = ((iM55681 ^ i9) * 4213) ^ 1241100925;
                                            i11 = -1965153375;
                                        } else {
                                            iM55681 = (C0873.m55680("ۙۙ") + i9) * 53;
                                            i10 = ((iM55681 ^ i8) * (-27117)) ^ (-303713262);
                                            i11 = 483985293;
                                        }
                                        break;
                                    case -1896734845:
                                    case -1229098943:
                                        if (C0898.m55800() <= 0) {
                                            iM55681 = (C0873.m55680("᩹᩷") + i8) * (-29);
                                            i10 = ((iM55681 ^ i9) * (-6397)) ^ 838624013;
                                            i11 = -1704421924;
                                        } else {
                                            iM55681 = (C0873.m55680("֨᩶") ^ i8) * 85;
                                            i10 = ((iM55681 ^ i9) * (-7139)) ^ (-1104617423);
                                            i11 = 281286278;
                                        }
                                        break;
                                    case -1563590541:
                                    case -821193448:
                                        if (C1194.f82045 != 0) {
                                            iM55681 = C0946.m55979("֡ۚ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-30355)) ^ 437429047;
                                            i11 = 421376390;
                                        } else {
                                            iM55681 = C0946.m55979("ܶۤ") ^ i8;
                                            i10 = ((iM55681 ^ i9) * (-26265)) ^ 873176733;
                                            i11 = -313573588;
                                        }
                                        break;
                                    case -1559516182:
                                    case 2072817945:
                                        if (C0989.f81920 >= 0) {
                                            iM55681 = C0873.m55680("۬ۘ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-29843)) ^ 856018830;
                                            i11 = 1466338556;
                                        } else {
                                            iM55681 = C0946.m55979("֨᩸") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-16627)) ^ 1610205727;
                                            i11 = 268267589;
                                        }
                                        break;
                                    case -1455275986:
                                    case 387381908:
                                        if (C0992.f81922 >= 0) {
                                            iM55681 = (C0873.m55680("᩹ܰ") ^ i9) * 13;
                                            i10 = ((iM55681 ^ i8) * 1605) ^ 823459169;
                                            i11 = 128310318;
                                        } else {
                                            iM55681 = C0946.m55979("ۡۙ") ^ i8;
                                            i10 = ((iM55681 ^ i9) * (-18983)) ^ (-473510261);
                                            i11 = -2115315066;
                                        }
                                        break;
                                    case -759062305:
                                    case 1147928304:
                                        C0854.m55595();
                                        if (C0967.f81910 >= 0) {
                                            iM55681 = C0873.m55680("۬ۘ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-29843)) ^ 856018830;
                                            i11 = 1466338556;
                                        } else {
                                            iM55681 = C0946.m55979("֡ۚ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-30355)) ^ 437429047;
                                            i11 = 421376390;
                                        }
                                        break;
                                    case -432462898:
                                    case 998720762:
                                        ServiceConnectionC1013.m56157();
                                        iM55681 = C0946.m55979("֡ۚ") ^ i9;
                                        i10 = ((iM55681 ^ i8) * (-30355)) ^ 437429047;
                                        i11 = 421376390;
                                        break;
                                    case -271861971:
                                    case 2064811326:
                                        objM56563 = C1929.m56563(list2, i6);
                                        if (C0861.f81831) {
                                            iM55681 = C0873.m55680("ܶܿ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * 10681) ^ 1913091251;
                                            i11 = 1359131630;
                                        } else {
                                            iM55681 = (C0873.m55680("᩹ܰ") ^ i9) * 13;
                                            i10 = ((iM55681 ^ i8) * 1605) ^ 823459169;
                                            i11 = 128310318;
                                        }
                                        break;
                                    case 32917470:
                                    case 668544089:
                                        C0947.m55997();
                                        return null;
                                    case 732968604:
                                    case 2099096973:
                                        C0845.m55584();
                                        if (C1044.f81959 < 0) {
                                            iM55681 = (C0873.m55680("᩹᩷") + i8) * (-29);
                                            i10 = ((iM55681 ^ i9) * (-6397)) ^ 838624013;
                                            i11 = -1704421924;
                                        } else {
                                            iM55681 = C0946.m55979("֡ۚ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-30355)) ^ 437429047;
                                            i11 = 421376390;
                                        }
                                        break;
                                    case 876297048:
                                    case 1810135693:
                                        list2 = list;
                                        if (RunnableC0897.f81856) {
                                            iM55681 = (i8 - C0946.m55979("ۤ۫")) * 37;
                                            i10 = ((iM55681 ^ i9) * (-15557)) ^ 1814177727;
                                            i11 = -1004864920;
                                        } else {
                                            iM55681 = C0873.m55680("۬ۘ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-29843)) ^ 856018830;
                                            i11 = 1466338556;
                                        }
                                        break;
                                    case 889085366:
                                    case 1483366836:
                                        if (C0906.m55809() <= 0) {
                                            iM55681 = C0946.m55979("֡ۚ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-30355)) ^ 437429047;
                                            i11 = 421376390;
                                        } else {
                                            iM55681 = (C0873.m55680("᩸ۨ") ^ i8) * 67;
                                            i10 = ((iM55681 ^ i9) * 18591) ^ 910164101;
                                            i11 = -317078366;
                                        }
                                        break;
                                    case 1278650494:
                                    case 1334645393:
                                        C0892.m55749();
                                        if (!C1048.f81963) {
                                            iM55681 = C0946.m55979("֡ۚ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-30355)) ^ 437429047;
                                            i11 = 421376390;
                                        } else {
                                            iM55681 = (C0946.m55979("ۨ᩹") + i8) * (-91);
                                            i10 = ((iM55681 ^ i9) * 4213) ^ 1241100925;
                                            i11 = -1965153375;
                                        }
                                        break;
                                    case 1482392170:
                                    case 1860215142:
                                        if (C0912.m55833()) {
                                            iM55681 = (C0873.m55680("᩹ܰ") ^ i9) * 13;
                                            i10 = ((iM55681 ^ i8) * 1605) ^ 823459169;
                                            i11 = 128310318;
                                        } else {
                                            iM55681 = (C0946.m55979("᩸ۚ") + i9) * (-25);
                                            i10 = ((iM55681 ^ i8) * 17475) ^ (-431979915);
                                            i11 = 508016598;
                                        }
                                        break;
                                    default:
                                        if (C0947.f81895) {
                                            iM55681 = C0873.m55680("۬ۘ") ^ i9;
                                            i10 = ((iM55681 ^ i8) * (-29843)) ^ 856018830;
                                            i11 = 1466338556;
                                        } else {
                                            iM55681 = (C0946.m55979("֡֫") ^ i9) * 9;
                                            i10 = ((iM55681 ^ i8) * (-27397)) ^ (-451348902);
                                            i11 = 1128274793;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                case 1872162399:
                case 1975762666:
                    if (C0890.f81849 == 0) {
                        iM55680 = (C0873.m55680("֫ۡ") ^ i3) * (-95);
                        i4 = ((iM55680 ^ i2) * 13517) ^ (-86804194);
                        i5 = -1888408090;
                    } else {
                        iM55680 = (C0946.m55979("ᩴ֡") + i2) * (-105);
                        i4 = ((iM55680 ^ i3) * (-28651)) ^ 2030854208;
                        i5 = -271784072;
                    }
                    break;
                default:
                    iM55989 = C0947.m55989(list);
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0873.m55680("᩵۬") + i2) * 83;
                        i4 = ((iM55680 ^ i3) * 8913) ^ (-1472692859);
                        i5 = -2063447655;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩸ܽ")) * 65;
                        i4 = ((iM55680 ^ i3) * 32555) ^ (-383328322);
                        i5 = 1195615780;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x016a  */
    /* JADX INFO: renamed from: ֫ */
    public static void m9849(Activity activity, C6449 c6449) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int iM55979;
        int i5;
        C25085 c25085M56364 = null;
        Throwable th = null;
        C25065 c25065M55004 = null;
        C25065 c25065M9845 = null;
        boolean zM55892 = false;
        boolean zM56397 = false;
        C25085 c25085M56365 = null;
        boolean zM55020 = false;
        boolean zM55655 = false;
        boolean zM55806 = false;
        C25065 c25065M44756 = null;
        boolean zM55656 = false;
        boolean zM55021 = false;
        boolean zM55923 = false;
        int i6 = 2001458631;
        int i7 = C1124.f82007;
        int i8 = C1028.f81950;
        int iM55682 = C0873.m55680("ۖۙ") ^ i8;
        int i9 = ((iM55682 ^ i7) * (-19635)) ^ (-1319371675);
        int i10 = iM55682 ^ (-424661889);
        IOException iOException = null;
        int i11 = 0;
        Lock lockWriteLock = null;
        C25065 c25065 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-30837)) >> 31));
            switch (i6) {
                case -2140553639:
                case 2049830081:
                    c25085M56364 = c25085M56364;
                    c25085M56365 = c25085M56365;
                    short s = f81901[134];
                    int i12 = s * 18624;
                    int i13 = s + 4656;
                    if (i12 - (i13 * i13) > 0) {
                        iM55681 = C0873.m55680("᩵ۚ") ^ i7;
                        i3 = ((iM55681 ^ i8) * 3795) ^ (-1688557473);
                        i4 = -237909007;
                    } else {
                        iM55681 = (C0873.m55680("ܶܽ") ^ i8) * (-53);
                        i3 = ((iM55681 ^ i7) * (-18619)) ^ 1852546868;
                        i4 = 1141013423;
                    }
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
                case -2106968927:
                case 759222039:
                    if (!zM55020) {
                        c25065M55004 = c25065M9845;
                        iM55681 = C0873.m55680("֡ۗ") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-32111)) ^ 786008982;
                        i4 = 373659712;
                        c25085M56365 = c25085M56365;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        c25085M56364 = c25085M56364;
                    } else {
                        c25085M56365 = c25085M56365;
                        iM55680 = C0873.m55680("ۙ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * (-29489)) ^ 1936061699;
                        i2 = 800661305;
                        int i14 = iM55680 ^ i2;
                        c25085M56365 = c25085M56365;
                        i10 = i14;
                        i9 = i;
                    }
                    break;
                case -2072803030:
                case -836277161:
                    zM55021 = c25065M44756.m55020();
                    iM55979 = C0946.m55979("ۧۛ") ^ i7;
                    i = ((iM55979 ^ i8) * (-4939)) ^ 285959859;
                    i5 = -580363876;
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1961938406:
                case -773587577:
                    c25085M56365 = c25085M56365;
                    zM56397 = C1194.m56397(c25085M56364.f80029);
                    iM55680 = (C0873.m55680("ܺ᩷") + i8) * 71;
                    i = ((iM55680 ^ i7) * (-9541)) ^ (-784625205);
                    i2 = 1011594246;
                    int i15 = iM55680 ^ i2;
                    c25085M56365 = c25085M56365;
                    i10 = i15;
                    i9 = i;
                    break;
                case -1957178478:
                case -1163148406:
                    ServiceConnectionC1013.m56164(lockWriteLock);
                    throw th;
                case -1931976356:
                case -1346508515:
                    c25085M56364 = c25085M56364;
                    c25085M56365 = c25085M56365;
                    try {
                        c25065M55004 = C25065.m55004(iOException);
                        iM55681 = C0873.m55680("֡ۗ") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-32111)) ^ 786008982;
                        i4 = 373659712;
                    } catch (Throwable th2) {
                        th = th2;
                        c25085M56364 = c25085M56364;
                        iM55681 = C0873.m55680("֫᩵") ^ i7;
                        c25085M56364 = c25085M56364;
                        i3 = ((iM55681 ^ i8) * 23831) ^ 1920844720;
                        i4 = 1469852151;
                    }
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
                case -1870279940:
                case 775844175:
                    try {
                        c25085M56365 = c25085M56365;
                        try {
                            zM55806 = C0906.m55806(C1024.m56203(f81901, 135, 6, i11), c25085M56364.f80032);
                            iM55680 = C0946.m55979("᩹ܿ") ^ i7;
                            i = ((iM55680 ^ i8) * 12537) ^ 848684336;
                            i2 = 1285085223;
                            int i16 = iM55680 ^ i2;
                            c25085M56365 = c25085M56365;
                            i10 = i16;
                            i9 = i;
                        } catch (IOException e) {
                            e = e;
                            iOException = e;
                            iM55681 = (i8 - C0946.m55979("۫ᩴ")) * (-81);
                            c25085M56364 = c25085M56364;
                            i3 = ((iM55681 ^ i7) * (-9207)) ^ 841559530;
                            i4 = -634273703;
                            c25085M56365 = c25085M56365;
                            i10 = iM55681 ^ i4;
                            i9 = i3;
                            c25085M56364 = c25085M56364;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            iM55681 = C0873.m55680("֫᩵") ^ i7;
                            c25085M56364 = c25085M56364;
                            i3 = ((iM55681 ^ i8) * 23831) ^ 1920844720;
                            i4 = 1469852151;
                            c25085M56365 = c25085M56365;
                            i10 = iM55681 ^ i4;
                            i9 = i3;
                            c25085M56364 = c25085M56364;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        c25085M56365 = c25085M56365;
                    } catch (Throwable th4) {
                        th = th4;
                        c25085M56365 = c25085M56365;
                    }
                    break;
                case -1634277851:
                case -466711914:
                    c25085M56365 = c25085M56365;
                    zM55020 = c25065M9845.m55020();
                    iM55680 = (C0873.m55680("ۨܰ") ^ i8) * 101;
                    i = ((iM55680 ^ i7) * (-31775)) ^ 1746409952;
                    i2 = 296892896;
                    int i17 = iM55680 ^ i2;
                    c25085M56365 = c25085M56365;
                    i10 = i17;
                    i9 = i;
                    break;
                case -1597253785:
                case -1030827568:
                    c25085M56365 = C1124.m56364();
                    zM55655 = C0866.m55655(c25065M9845);
                    iM55979 = C0946.m55979("ܿۤ") ^ i7;
                    i = ((iM55979 ^ i8) * (-16487)) ^ 304328429;
                    i5 = -462918042;
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1582513258:
                case 172812818:
                    if (!zM55806) {
                        c25065M9845 = c25065;
                        iM55680 = (C0946.m55979("ܰۙ") ^ i7) * (-7);
                        i = ((iM55680 ^ i8) * (-17203)) ^ 1227933928;
                        i2 = -697396444;
                        int i18 = iM55680 ^ i2;
                        c25085M56365 = c25085M56365;
                        i10 = i18;
                        i9 = i;
                    } else {
                        iM55979 = (i8 - C0873.m55680("᩸ۤ")) * (-87);
                        i = ((iM55979 ^ i7) * (-7323)) ^ (-439110301);
                        i5 = 1869514922;
                        i10 = iM55979 ^ i5;
                        i9 = i;
                    }
                    break;
                case -1578722732:
                case -1034702828:
                    if (zM55656) {
                        iM55979 = C0873.m55680("ۡ֨") ^ i8;
                        i = ((iM55979 ^ i7) * (-26707)) ^ (-1658176597);
                        i5 = 654489135;
                    } else {
                        iM55979 = (C0946.m55979("ܳۜ") + i7) * 91;
                        i = ((iM55979 ^ i8) * (-26601)) ^ (-1187841842);
                        i5 = -1664276361;
                    }
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1538075741:
                case 1662967257:
                    zM55923 = C0937.m55923(c25085M56365.f80029);
                    iM55979 = (i8 - C0946.m55979("ۘۚ")) * 91;
                    i = ((iM55979 ^ i7) * (-5683)) ^ 1357816185;
                    i5 = -266341920;
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1446056442:
                case 2129722961:
                    if (zM55923) {
                        c25065M44756 = c25065M9845;
                        iM55979 = (i7 - C0946.m55979("ۧ᩺")) * (-89);
                        i = ((iM55979 ^ i8) * (-16343)) ^ (-241603164);
                        i5 = -1995052965;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩷") ^ i8;
                        i = ((iM55979 ^ i7) * 15967) ^ (-1331154192);
                        i5 = 1931978286;
                    }
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1359001148:
                case 178427908:
                    if (c25085M56365 != null) {
                        iM55979 = (C0873.m55680("ܽ۟") + i7) * 85;
                        i = ((iM55979 ^ i8) * 11323) ^ 2058298946;
                        i5 = 1741182574;
                    } else {
                        c25065M44756 = c25065M9845;
                        iM55979 = (i7 - C0946.m55979("ۧ᩺")) * (-89);
                        i = ((iM55979 ^ i8) * (-16343)) ^ (-241603164);
                        i5 = -1995052965;
                    }
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1344006426:
                case 1647305547:
                    c25065M9845 = C8992.m20781();
                    iM55680 = (C0946.m55979("ܰۙ") ^ i7) * (-7);
                    i = ((iM55680 ^ i8) * (-17203)) ^ 1227933928;
                    i2 = -697396444;
                    int i19 = iM55680 ^ i2;
                    c25085M56365 = c25085M56365;
                    i10 = i19;
                    i9 = i;
                    break;
                case -1330029822:
                case 20754919:
                    zM55656 = C0866.m55655(c25065M44756);
                    iM55979 = (C0873.m55680("ܿ۟") + i8) * (-109);
                    i = ((iM55979 ^ i7) * 29057) ^ 942402280;
                    i5 = -146090773;
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case -1161624536:
                case 780404608:
                    c25085M56365 = c25085M56365;
                    if (!zM56397) {
                        iM55680 = C0873.m55680("۠ۚ") ^ i8;
                        i = ((iM55680 ^ i7) * (-21207)) ^ (-1147017925);
                        i2 = -161719837;
                        int i110 = iM55680 ^ i2;
                        c25085M56365 = c25085M56365;
                        i10 = i110;
                        i9 = i;
                    } else {
                        c25085M56364 = c25085M56364;
                        iM55681 = C0946.m55979("ܰ᩸") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-18397)) ^ 890245712;
                        i4 = -682424120;
                        c25085M56365 = c25085M56365;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        c25085M56364 = c25085M56364;
                    }
                    break;
                case -1055458675:
                case 488029328:
                    C25085 c25085 = c25085M56364;
                    c25085M56365 = c25085M56365;
                    try {
                        c25085M56364 = C1124.m56364();
                        try {
                            try {
                                C25065 c25066 = new C25065(1);
                                int iM559710 = C0946.m55979("᩶ۛ") ^ i7;
                                i9 = ((iM559710 ^ i8) * 3751) ^ 466967868;
                                c25085M56365 = c25085M56365;
                                i10 = iM559710 ^ (-1413489266);
                                c25085M56364 = c25085M56364;
                                c25065 = c25066;
                            } catch (IOException e3) {
                                iOException = e3;
                                c25085M56364 = c25085M56364;
                                c25065 = null;
                                iM55681 = (i8 - C0946.m55979("۫ᩴ")) * (-81);
                                c25085M56364 = c25085M56364;
                                i3 = ((iM55681 ^ i7) * (-9207)) ^ 841559530;
                                i4 = -634273703;
                                c25085M56365 = c25085M56365;
                                i10 = iM55681 ^ i4;
                                i9 = i3;
                                c25085M56364 = c25085M56364;
                            } catch (Throwable th5) {
                                th = th5;
                                c25085M56364 = c25085M56364;
                                c25065 = null;
                                iM55681 = C0873.m55680("֫᩵") ^ i7;
                                c25085M56364 = c25085M56364;
                                i3 = ((iM55681 ^ i8) * 23831) ^ 1920844720;
                                i4 = 1469852151;
                                c25085M56365 = c25085M56365;
                                i10 = iM55681 ^ i4;
                                i9 = i3;
                                c25085M56364 = c25085M56364;
                            }
                        } catch (IOException e4) {
                            iOException = e4;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (IOException e5) {
                        iOException = e5;
                        c25085M56364 = c25085;
                    }
                    break;
                case -955012782:
                case 599280363:
                    c25085M56364 = c25085M56364;
                    c25085M56365 = c25085M56365;
                    lockWriteLock = C19701.f59885.writeLock();
                    lockWriteLock.lock();
                    iM55681 = (C0873.m55680("ۙᩴ") ^ i7) * 49;
                    i3 = ((iM55681 ^ i8) * 17207) ^ 1898732850;
                    i4 = 2058889148;
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
                case -930121431:
                case 484823203:
                    i11 = 37078;
                    iM55681 = (i8 - C0873.m55680("᩹֡")) * 53;
                    i3 = ((iM55681 ^ i7) * (-25643)) ^ 503316919;
                    i4 = 1776897130;
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
                case -790384389:
                case 3136942:
                    c25085M56365 = c25085M56365;
                    if (zM55892) {
                        iM55680 = C0873.m55680("ۙ᩷") ^ i7;
                        i = ((iM55680 ^ i8) * (-29489)) ^ 1936061699;
                        i2 = 800661305;
                    } else {
                        iM55680 = (C0946.m55979("֡᩶") ^ i7) * (-23);
                        i = ((iM55680 ^ i8) * (-9855)) ^ (-2082049884);
                        i2 = 1272222692;
                    }
                    int i111 = iM55680 ^ i2;
                    c25085M56365 = c25085M56365;
                    i10 = i111;
                    i9 = i;
                    break;
                case -279930815:
                case 1889297907:
                    C1044.m56283(lockWriteLock);
                    m9880(activity, c25065M55004, c6449);
                    return;
                case 133916329:
                case 979685847:
                    c25065M9845 = m9845();
                    iM55680 = (C0946.m55979("ܰۙ") ^ i7) * (-7);
                    i = ((iM55680 ^ i8) * (-17203)) ^ 1227933928;
                    i2 = -697396444;
                    int i112 = iM55680 ^ i2;
                    c25085M56365 = c25085M56365;
                    i10 = i112;
                    i9 = i;
                    break;
                case 157264308:
                case 340436870:
                    if (zM55655) {
                        iM55979 = C0873.m55680("᩵ᩴ") ^ i8;
                        i = ((iM55979 ^ i7) * (-28827)) ^ 585884417;
                        i5 = 1819844222;
                    } else {
                        c25065M44756 = c25065M9845;
                        iM55979 = (i7 - C0946.m55979("ۧ᩺")) * (-89);
                        i = ((iM55979 ^ i8) * (-16343)) ^ (-241603164);
                        i5 = -1995052965;
                    }
                    i10 = iM55979 ^ i5;
                    i9 = i;
                    break;
                case 297228951:
                case 368973708:
                    try {
                        C19701 c19701M56033 = C0955.m56033(C0719o.a.f2909o);
                        C0930.m55884(c19701M56033, c25085M56365.f80029);
                        c25065M44756 = c19701M56033.m44756();
                        iM55979 = (i7 - C0946.m55979("ۧ᩺")) * (-89);
                        i = ((iM55979 ^ i8) * (-16343)) ^ (-241603164);
                        i5 = -1995052965;
                        i10 = iM55979 ^ i5;
                        i9 = i;
                    } catch (IOException e6) {
                        iOException = e6;
                        c25085M56365 = c25085M56365;
                        iM55681 = (i8 - C0946.m55979("۫ᩴ")) * (-81);
                        c25085M56364 = c25085M56364;
                        i3 = ((iM55681 ^ i7) * (-9207)) ^ 841559530;
                        i4 = -634273703;
                        c25085M56365 = c25085M56365;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        c25085M56364 = c25085M56364;
                    } catch (Throwable th7) {
                        th = th7;
                        c25085M56365 = c25085M56365;
                        iM55681 = C0873.m55680("֫᩵") ^ i7;
                        c25085M56364 = c25085M56364;
                        i3 = ((iM55681 ^ i8) * 23831) ^ 1920844720;
                        i4 = 1469852151;
                        c25085M56365 = c25085M56365;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        c25085M56364 = c25085M56364;
                    }
                    break;
                case 524112449:
                case 1183565564:
                    c25085M56365 = c25085M56365;
                    if (c25085M56364 != null) {
                        iM55681 = C0946.m55979("᩹֫") ^ i8;
                        c25085M56364 = c25085M56364;
                        i3 = ((iM55681 ^ i7) * 11493) ^ (-1352307203);
                        i4 = -304791379;
                    } else {
                        c25085M56364 = c25085M56364;
                        iM55681 = C0946.m55979("ܰ᩸") ^ i7;
                        i3 = ((iM55681 ^ i8) * (-18397)) ^ 890245712;
                        i4 = -682424120;
                    }
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
                case 811574559:
                case 1761171378:
                    if (!zM55021) {
                        c25065M55004 = c25065M44756;
                        iM55681 = C0873.m55680("֡ۗ") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-32111)) ^ 786008982;
                        i4 = 373659712;
                        c25085M56365 = c25085M56365;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        c25085M56364 = c25085M56364;
                    } else {
                        iM55979 = C0873.m55680("ۡ֨") ^ i8;
                        i = ((iM55979 ^ i7) * (-26707)) ^ (-1658176597);
                        i5 = 654489135;
                        i10 = iM55979 ^ i5;
                        i9 = i;
                    }
                    break;
                case 985390061:
                case 1427572010:
                    c25085M56365 = c25085M56365;
                    zM55892 = C0930.m55892(c25065M9845);
                    iM55680 = (C0946.m55979("۫֫") + i8) * (-63);
                    i = ((iM55680 ^ i7) * 12423) ^ 1722805419;
                    i2 = -1333838229;
                    int i113 = iM55680 ^ i2;
                    c25085M56365 = c25085M56365;
                    i10 = i113;
                    i9 = i;
                    break;
                case 1104880685:
                case 1977137655:
                    m9886();
                    c25065M55004 = c25065M44756;
                    iM55681 = C0873.m55680("֡ۗ") ^ i8;
                    i3 = ((iM55681 ^ i7) * (-32111)) ^ 786008982;
                    i4 = 373659712;
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
                default:
                    i11 = 38335;
                    iM55681 = (i8 - C0873.m55680("᩹֡")) * 53;
                    i3 = ((iM55681 ^ i7) * (-25643)) ^ 503316919;
                    i4 = 1776897130;
                    c25085M56365 = c25085M56365;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    c25085M56364 = c25085M56364;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m9876() {
        C25085 c25085M56079 = null;
        boolean zM55923 = false;
        boolean zM55924 = false;
        boolean zM55925 = false;
        boolean z = false;
        int i = 1825093075;
        int i2 = ViewOnClickListenerC0939.f81888;
        int i3 = C1028.f81950;
        int iM55979 = (C0946.m55979("ۡۛ") ^ i3) * (-31);
        int i4 = ((iM55979 ^ i2) * (-16519)) ^ 1647797642;
        int i5 = -962912195;
        while (true) {
            i = ((((i ^ i2) * (-24705)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1967051317:
                case 1161193479:
                    C1003.m56123();
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("ᩳۗ") ^ i2) * 59;
                        i4 = ((iM55979 ^ i3) * 6299) ^ 1902966691;
                        i5 = -1610190942;
                    } else {
                        iM55979 = C0946.m55979("ᩳۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 4293) ^ (-1995840365);
                        i5 = 1103486447;
                    }
                    break;
                case -1536425829:
                case 1452400681:
                    zM55924 = C0937.m55923(c25085M56079.f80029);
                    iM55979 = C0946.m55979("ܽۗ") ^ i3;
                    i4 = ((iM55979 ^ i2) * (-24671)) ^ (-1906956803);
                    i5 = 294496106;
                    break;
                case -1447249504:
                case 2001995957:
                    if (zM55924) {
                        iM55979 = C0946.m55979("᩶ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9563) ^ 1311017240;
                        i5 = -111544783;
                    } else {
                        iM55979 = (C0873.m55680("ܳ᩻") ^ i3) * 47;
                        i4 = ((iM55979 ^ i2) * 16909) ^ (-153465688);
                        i5 = -2139511076;
                    }
                    break;
                case -1384571717:
                case -798269994:
                    break;
                case -1202420688:
                case -255996890:
                    C0947.m55997();
                    C0882.m55710();
                    break;
                case -1089691124:
                case -1014837853:
                    C0898.m55800();
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ۙۖ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8973) ^ (-1600350873);
                        i5 = 1872558443;
                    } else {
                        iM55979 = C0873.m55680("۬ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10023)) ^ 229323553;
                        i5 = 974393610;
                    }
                    break;
                case -1029077532:
                case -510297980:
                    if (zM55925) {
                        iM55979 = C0946.m55979("᩻᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15637) ^ (-1825466971);
                        i5 = 1809046205;
                    } else {
                        iM55979 = (C0873.m55680("۠۟") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-8645)) ^ (-1598198541);
                        i5 = 1374644010;
                    }
                    break;
                case -762192196:
                case 1001790778:
                    if (!z) {
                        iM55979 = C0946.m55979("᩶ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9563) ^ 1311017240;
                        i5 = -111544783;
                    } else {
                        iM55979 = (C0873.m55680("۠۟") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-8645)) ^ (-1598198541);
                        i5 = 1374644010;
                    }
                    break;
                case -482230362:
                case -211834443:
                    zM55923 = C0937.m55923(c25085M56079.f80032);
                    iM55979 = (C0873.m55680("ᩴ֫") ^ i3) * (-41);
                    i4 = ((iM55979 ^ i2) * (-17591)) ^ (-2014446615);
                    i5 = 2101047795;
                    break;
                case -372646526:
                case -110008167:
                    if (c25085M56079 != null) {
                        iM55979 = C0873.m55680("֡᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 11107) ^ (-1429199012);
                        i5 = -2053619788;
                    } else {
                        iM55979 = C0946.m55979("᩶ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9563) ^ 1311017240;
                        i5 = -111544783;
                    }
                    break;
                case -291294101:
                case 1743288033:
                    if (!C0882.f81846) {
                        iM55979 = (C0873.m55680("ᩳۗ") ^ i2) * 59;
                        i4 = ((iM55979 ^ i3) * 6299) ^ 1902966691;
                        i5 = -1610190942;
                    } else {
                        iM55979 = C0873.m55680("ۨܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13669) ^ (-1608567467);
                        i5 = -561180288;
                    }
                    break;
                case -96950227:
                case 260131253:
                    if (zM55923) {
                        iM55979 = (i2 - C0946.m55979("᩸ܳ")) * 19;
                        i4 = ((iM55979 ^ i3) * (-27251)) ^ (-810914385);
                        i5 = -1710505553;
                    } else {
                        iM55979 = (C0873.m55680("۠۟") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i3) * (-8645)) ^ (-1598198541);
                        i5 = 1374644010;
                    }
                    break;
                case -61387487:
                case -11248443:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("۬ۨ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10023)) ^ 229323553;
                        i5 = 974393610;
                    } else {
                        iM55979 = C0873.m55680("ۨܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13669) ^ (-1608567467);
                        i5 = -561180288;
                    }
                    break;
                case -3119058:
                case 139535500:
                    C1229.m56410();
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("᩹ܽ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 16173) ^ (-1033762922);
                        i5 = 1767321196;
                    } else {
                        iM55979 = C0873.m55680("֡ۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-14543)) ^ 1749435565;
                        i5 = 1870505681;
                    }
                    break;
                case 68657965:
                case 1361540149:
                    if (C0917.m55854()) {
                        iM55979 = (C0946.m55979("ܺ᩹") + i2) * 35;
                        i4 = ((iM55979 ^ i3) * (-26595)) ^ 247058384;
                        i5 = 2020661883;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۚ֨")) * (-57);
                        i4 = ((iM55979 ^ i3) * (-11961)) ^ (-1350757414);
                        i5 = -830353132;
                    }
                    break;
                case 218750211:
                case 877283227:
                    z = c25085M56079.f80031;
                    iM55979 = (C0873.m55680("۫᩷") ^ i2) * 119;
                    i4 = ((iM55979 ^ i3) * 4339) ^ 615515006;
                    i5 = 668626167;
                    break;
                case 370634190:
                case 634782018:
                    m9845();
                    iM55979 = C0946.m55979("᩶ᩳ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 9563) ^ 1311017240;
                    i5 = -111544783;
                    break;
                case 656388059:
                case 2042080007:
                    if (C0927.f81875) {
                        iM55979 = C0946.m55979("᩵֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 1427) ^ (-1344949072);
                        i5 = 20056008;
                    } else {
                        iM55979 = (C0873.m55680("ᩳۧ") + i3) * 11;
                        i4 = ((iM55979 ^ i2) * 353) ^ (-1398090010);
                        i5 = 1663601791;
                    }
                    break;
                case 996063167:
                case 1357104009:
                    C0947.m55997();
                    if (!C0947.m55997()) {
                        iM55979 = C0873.m55680("ۨܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13669) ^ (-1608567467);
                        i5 = -561180288;
                    } else {
                        iM55979 = (C0946.m55979("᩹ܽ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 16173) ^ (-1033762922);
                        i5 = 1767321196;
                    }
                    break;
                case 1002407489:
                case 1467298213:
                    if (RunnableC0938.f81886 < 0) {
                        iM55979 = (C0873.m55680("ᩳۧ") + i3) * 11;
                        i4 = ((iM55979 ^ i2) * 353) ^ (-1398090010);
                        i5 = 1663601791;
                    } else {
                        iM55979 = C0873.m55680("ۨܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 13669) ^ (-1608567467);
                        i5 = -561180288;
                    }
                    break;
                case 1636707327:
                case 2030655827:
                    zM55925 = RunnableC0938.m55924();
                    iM55979 = C0946.m55979("᩺ܺ") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-6335)) ^ (-1355448782);
                    i5 = -1246371661;
                    break;
                case 1849124929:
                case 2110568222:
                    C1012.m56134();
                    iM55979 = C0873.m55680("ۨܽ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 13669) ^ (-1608567467);
                    i5 = -561180288;
                    break;
                default:
                    try {
                        c25085M56079 = C0967.m56079();
                        iM55979 = (C0873.m55680("ۛ᩺") ^ i3) * 127;
                        i4 = ((iM55979 ^ i2) * (-22211)) ^ 2111550421;
                        i5 = 1423839955;
                    } catch (IOException unused) {
                        iM55979 = C0946.m55979("᩶ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9563) ^ 1311017240;
                        i5 = -111544783;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m9884(String str) {
        C25085 c25085M56079 = null;
        String str2 = null;
        boolean zM56397 = false;
        int i = 813835589;
        int i2 = RunnableC0871.f81839;
        int i3 = C0930.f81879;
        int iM55979 = (i3 - C0946.m55979("ܿܰ")) * (-61);
        int i4 = ((iM55979 ^ i2) * (-20155)) ^ (-1470474047);
        int i5 = -1276380917;
        while (true) {
            i = ((((i ^ i2) * (-7251)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2100592008:
                case -1262250377:
                    if (C0912.m55833()) {
                        iM55979 = (C0946.m55979("۠ۧ") ^ i2) * 57;
                        i4 = ((iM55979 ^ i3) * (-8313)) ^ 642280855;
                        i5 = 1272089206;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 3047) ^ 398702428;
                        i5 = 1442195369;
                    }
                    break;
                case -2083860800:
                case 1263856513:
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = C0873.m55680("ۧ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17199) ^ (-822567025);
                        i5 = -1545655998;
                    } else {
                        iM55979 = (C0873.m55680("ۘܳ") ^ i2) * 31;
                        i4 = ((iM55979 ^ i3) * (-2657)) ^ 390065341;
                        i5 = -1141393881;
                    }
                    break;
                case -1961329701:
                case 54032926:
                    C1071.m56343();
                    if (C0946.f81894 == 0) {
                        iM55979 = (C0946.m55979("ᩴۧ") ^ i2) * 85;
                        i4 = ((iM55979 ^ i3) * 4033) ^ 898056382;
                        i5 = 2066307993;
                    } else {
                        iM55979 = C0946.m55979("᩶᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-5867)) ^ (-1705169672);
                        i5 = -2084336132;
                    }
                    break;
                case -1879476030:
                case 171259212:
                    zM56397 = C1194.m56397(c25085M56079.f80033);
                    iM55979 = (C0946.m55979("ۧۜ") ^ i3) * (-69);
                    i4 = ((iM55979 ^ i2) * (-1607)) ^ (-920108003);
                    i5 = -250795197;
                    break;
                case -1751237543:
                case 7757107:
                    if (!C1929.m56553()) {
                        iM55979 = (C0946.m55979("ᩴۧ") ^ i2) * 85;
                        i4 = ((iM55979 ^ i3) * 4033) ^ 898056382;
                        i5 = 2066307993;
                    } else {
                        iM55979 = C0873.m55680("ۧ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17199) ^ (-822567025);
                        i5 = -1545655998;
                    }
                    break;
                case -1747898670:
                case 318066177:
                    if (zM56397) {
                        str2 = str;
                        iM55979 = (C0946.m55979("ܳۡ") ^ i3) * 41;
                        i4 = ((iM55979 ^ i2) * 14517) ^ 1581071816;
                        i5 = 2130695468;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۫᩸")) * (-15);
                        i4 = ((iM55979 ^ i2) * (-30271)) ^ 2048302572;
                        i5 = 2019438727;
                    }
                    break;
                case -1384275255:
                case -170080109:
                    C0894.m55769();
                    if (!C0892.m55749()) {
                        iM55979 = (C0946.m55979("ᩴۧ") ^ i2) * 85;
                        i4 = ((iM55979 ^ i3) * 4033) ^ 898056382;
                        i5 = 2066307993;
                    } else {
                        iM55979 = C0946.m55979("֫᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28121) ^ (-612728888);
                        i5 = 785118958;
                    }
                    break;
                case -1373773723:
                case 1862081572:
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("ۡۡ") + i3) * 89;
                        i4 = ((iM55979 ^ i2) * (-29191)) ^ 1665348224;
                        i5 = 192380455;
                    } else {
                        iM55979 = (C0946.m55979("۠ۧ") ^ i2) * 57;
                        i4 = ((iM55979 ^ i3) * (-8313)) ^ 642280855;
                        i5 = 1272089206;
                    }
                    break;
                case -1307781424:
                case 513724331:
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("۠ۧ") ^ i2) * 57;
                        i4 = ((iM55979 ^ i3) * (-8313)) ^ 642280855;
                        i5 = 1272089206;
                    } else {
                        iM55979 = C0946.m55979("ۛۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-12637)) ^ 731367587;
                        i5 = -465112173;
                    }
                    break;
                case -1128567013:
                case -871549005:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("֫᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28121) ^ (-612728888);
                        i5 = 785118958;
                    } else {
                        iM55979 = (C0873.m55680("֨ۤ") + i3) * 11;
                        i4 = ((iM55979 ^ i2) * 3009) ^ 1777736849;
                        i5 = 1289123918;
                    }
                    break;
                case -1008579809:
                case 44372884:
                    return str2;
                case -889501438:
                case 425425883:
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ۧ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17199) ^ (-822567025);
                        i5 = -1545655998;
                    } else {
                        iM55979 = (C0946.m55979("ۤ۟") + i2) * (-127);
                        i4 = ((iM55979 ^ i3) * 11985) ^ 19846547;
                        i5 = 793596253;
                    }
                    break;
                case -535160811:
                case 975447683:
                    C0946.m55980();
                    C1044.m56286();
                    iM55979 = (C0946.m55979("ᩴۧ") ^ i2) * 85;
                    i4 = ((iM55979 ^ i3) * 4033) ^ 898056382;
                    i5 = 2066307993;
                    break;
                case -372673141:
                case 1326400188:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ᩴۧ") ^ i2) * 85;
                        i4 = ((iM55979 ^ i3) * 4033) ^ 898056382;
                        i5 = 2066307993;
                    } else {
                        iM55979 = (C0873.m55680("۟ۛ") ^ i2) * (-117);
                        i4 = ((iM55979 ^ i3) * 11251) ^ 1033390732;
                        i5 = 1530390328;
                    }
                    break;
                case -82857911:
                case 1846318560:
                    if (C0912.f81867 <= 0) {
                        iM55979 = (C0946.m55979("۠ۧ") ^ i2) * 57;
                        i4 = ((iM55979 ^ i3) * (-8313)) ^ 642280855;
                        i5 = 1272089206;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۚ") + i3) * 31;
                        i4 = ((iM55979 ^ i2) * 17057) ^ (-1673897807);
                        i5 = 16253642;
                    }
                    break;
                case 419941188:
                case 984305918:
                    str2 = c25085M56079.f80033;
                    iM55979 = (C0946.m55979("ܳۡ") ^ i3) * 41;
                    i4 = ((iM55979 ^ i2) * 14517) ^ 1581071816;
                    i5 = 2130695468;
                    break;
                case 1311516375:
                case 1394382472:
                    if (c25085M56079 != null) {
                        iM55979 = (C0946.m55979("᩹᩻") ^ i2) * (-9);
                        i4 = ((iM55979 ^ i3) * 30539) ^ 541982353;
                        i5 = 431535049;
                    } else {
                        str2 = str;
                        iM55979 = (C0946.m55979("ܳۡ") ^ i3) * 41;
                        i4 = ((iM55979 ^ i2) * 14517) ^ 1581071816;
                        i5 = 2130695468;
                    }
                    break;
                case 1325232744:
                case 1411289520:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0946.m55979("֫᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 28121) ^ (-612728888);
                        i5 = 785118958;
                    } else {
                        iM55979 = (C0873.m55680("ܺ֡") ^ i2) * 51;
                        i4 = ((iM55979 ^ i3) * 7767) ^ (-1791160562);
                        i5 = -133411803;
                    }
                    break;
                case 1426744253:
                case 2012211153:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ۧ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17199) ^ (-822567025);
                        i5 = -1545655998;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩵") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-24533)) ^ (-1005366414);
                        i5 = -948637845;
                    }
                    break;
                case 1689312277:
                case 1734703953:
                    C1929.m56553();
                    return null;
                default:
                    try {
                        c25085M56079 = C0967.m56079();
                        iM55979 = C0873.m55680("ܰ᩺") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20973) ^ (-268771384);
                        i5 = -673767374;
                    } catch (IOException unused) {
                        str2 = str;
                        iM55979 = (C0946.m55979("ܳۡ") ^ i3) * 41;
                        i4 = ((iM55979 ^ i2) * 14517) ^ 1581071816;
                        i5 = 2130695468;
                    }
                    break;
            }
        }
    }
}
