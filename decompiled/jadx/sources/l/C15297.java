package l;

import android.annotation.SuppressLint;
import bin.mt.plugin.api.LocalString;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;

/* JADX INFO: renamed from: l.ܶܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B3Z3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15297 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f46929;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20510 f46930;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C20510 f46931;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final StringBuilder f46932;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f46933;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String f46934;

    /* JADX INFO: renamed from: ᩷ۛۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f46935 = {4349, -21447, -21447, -21429, -21476, -21476, -21429, -21502, -21502, -21409, -21470, -21470, -21470, 8669, 8648, 8660, 8653, 8671, 8657, 8662, 8598, 8660, 8663, 8671, 724, 8063, 7971, 8063, 9387, 19133, 19126, 19121, 19185, 19122, 19115, 19185, 19119, 19123, 19114, 19128, 19126, 19121, 19185, 19116, 19110, 19116, 19115, 19130, 19122, 5365, 9025, 9036, 9025, 2818, -26109, -26005, -25986, -26070, -26023, -25985, -25990, -25990, -25992, -26001, -25991, -25991, -26001, -26002, -26064, -26070, -26109, -26039, -26005, -25985, -25991, -26001, -26002, -26070, -26008, -25997, -26064, -26070, -25380, -25379, -25390, -25389, -25392, -25391, -25386, -25387, -25366, -25365, -25368, -25362, -25361, -25364, -25363, -25374, -25375, -25370, 193, -31938, -31892, -31884, -31874, -31899, -31884, -31902, -31877, -31882, -31899, -31977, -31899, -31886, -31887, -31886, -31899, -31886, -31879, -31884, -31886, -31987, -31894, -31938, -31975, -31975, -31975, -31977, -31977, -31910, -31912, -31931, -31918, -31938, -31914, -31933, -31977, -31938, -31900, -31934, -31929, -31929, -31931, -31918, -31932, -31932, -31918, -31917, -31987, -31977, -31263, -31264, -31249, -31250, -31251, -31252, -31253, -31256, -31273, -31274, -31275, -31277, -31278, -31279, -31280, -31265, -31268, -31269, -31884, -31914, -31934, -31932, -31918, -31917, -31977, -31915, -31922, -31987, -31977, 9510, -12446, -12418, -12441, -12427, -12421, -12420, -12484, -12418, -12419, -12427, 5379, -18395, -18392, -18393, -18386, 4766, 24693};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Writer f46936;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m36307() {
        short s = f46935[13];
        int i = (s * 15194) - ((s * s) + 57714409) > 0 ? 48145 : 8632;
        synchronized (C15297.class) {
            new File(C4925.m14322(), C1420.m4902(f46935, 14, 10, i)).delete();
            f46936 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m36310(String str, String str2) {
        short s = f46935[49];
        int i = ((s * s) + 227195329) - (s * 30146) < 0 ? 37984 : 9057;
        synchronized (C15297.class) {
            if (f46936 == null) {
                m36315();
                if (f46936 == null) {
                    return;
                }
            }
            StringBuilder sb = f46932;
            int i2 = 0;
            sb.setLength(0);
            C1420.m4905(sb, f46929.format(C2958.m9026(ViewOnClickListenerC1958.m6432())));
            C1420.m4905(sb, C3432.m10488(f46935, 50, 3, i));
            C1420.m4905(sb, str);
            int iM1493 = C0237.m1493(sb);
            int iM12362 = C4117.m12362(str2, 10);
            boolean z = true;
            int i3 = 0;
            while (iM12362 != -1) {
                m36308(i3, iM12362, z ? 0 : iM1493, str2);
                i3 = iM12362 + 1;
                iM12362 = str2.indexOf(10, i3);
                z = false;
            }
            if (z || i3 != C1711.m5741(str2)) {
                int iM5741 = C1711.m5741(str2);
                if (!z) {
                    i2 = iM1493;
                }
                m36308(i3, iM5741, i2, str2);
            }
            try {
                f46936.write(C0422.m1959(f46932));
                f46936.flush();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static LocalString m36318() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 2108413203;
        int i7 = C1047.f3863;
        int i8 = ViewOnClickListenerC1958.f6529;
        int iM2566 = (i8 - C0630.m2566("ۙ۠")) * 123;
        int i9 = ((iM2566 ^ i7) * 29513) ^ 2133483243;
        int i10 = 180928744;
        while (true) {
            i6 = ((((i6 ^ i7) * (-14423)) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -1950564268:
                case 659677648:
                    C1916.m6308();
                    if (C0050.m940() <= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-27273)) ^ (-1048162104);
                        i10 = 336697755;
                    } else {
                        iM2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    }
                    break;
                case -1933724386:
                case -1645433964:
                    return f46931;
                case -1570393724:
                case -990966530:
                    i5 = 47177;
                    iM2566 = C0630.m2566("֨۠") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-221)) ^ (-1261822981);
                    i10 = 784136854;
                    break;
                case -1566213079:
                case 670988471:
                    if (C1128.f4106 > 0) {
                        iM2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    } else {
                        iM2566 = C2105.m6981("ۙۙ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-27273)) ^ (-1048162104);
                        i10 = 336697755;
                    }
                    break;
                case -1554849739:
                case -1416140268:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ۗ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12825)) ^ (-1900972949);
                        i10 = -2023552757;
                    } else {
                        iM2566 = C2105.m6981("ۨ֫") ^ i7;
                        i9 = ((iM2566 ^ i8) * 3987) ^ (-1960493958);
                        i10 = -70063148;
                    }
                    break;
                case -1551639995:
                case -1087160141:
                    C4263.m12819();
                    return null;
                case -1547417145:
                case 1263705806:
                    if (f46931 == null) {
                        iM2566 = (C2105.m6981("᩺ۗ") ^ i8) * 65;
                        i9 = ((iM2566 ^ i7) * 527) ^ (-1512191005);
                        i10 = 1438625484;
                    } else {
                        iM2566 = C0630.m2566("᩹ۙ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 30901) ^ 627871868;
                        i10 = 29789175;
                    }
                    break;
                case -1276980260:
                case -340915042:
                    i4 = i2 + i3;
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    } else {
                        iM2566 = C2105.m6981("ۨᩴ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 7563) ^ 1458354672;
                        i10 = -1214214292;
                    }
                    break;
                case -1172797969:
                case -750749751:
                    C1916.m6308();
                    if (C3683.f11629 < 0) {
                        iM2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    } else {
                        iM2566 = (i8 - C0630.m2566("ۙ᩹")) * 21;
                        i9 = ((iM2566 ^ i7) * (-6343)) ^ (-982974908);
                        i10 = 1149083370;
                    }
                    break;
                case -894303461:
                case -675662643:
                    i2 = s * s;
                    i3 = 186896241;
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("᩺ᩴ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-31439)) ^ (-2026419610);
                        i10 = 1050253711;
                    } else {
                        iM2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    }
                    break;
                case -700870109:
                case 1990866302:
                    s = sArr[c];
                    if (C11340.m28031()) {
                        iM2566 = C0630.m2566("ۚ᩻") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7465)) ^ (-71126960);
                        i10 = 1391134807;
                    } else {
                        iM2566 = C2105.m6981("ۙۙ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-27273)) ^ (-1048162104);
                        i10 = 336697755;
                    }
                    break;
                case -543956001:
                case -66665242:
                    s2 = 13671;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܽۗ")) * (-35);
                        i9 = ((iM2566 ^ i7) * (-119)) ^ (-1854644773);
                        i10 = -1893363603;
                    }
                    break;
                case -261768956:
                case 116549855:
                    int i11 = s + s2;
                    i = i11 * i11;
                    if (C1773.m5908() <= 0) {
                        iM2566 = C2105.m6981("ۗ۬") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-12825)) ^ (-1900972949);
                        i10 = -2023552757;
                    } else {
                        iM2566 = C2105.m6981("ۧۛ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-15533)) ^ (-1229461912);
                        i10 = -1634632712;
                    }
                    break;
                case 167191782:
                case 249300456:
                    short[] sArr2 = f46935;
                    if (C3683.f11629 >= 0) {
                        iM2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    } else if (C2272.f7362 || C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    } else {
                        f46931 = new C20510(C0714.m2816(sArr2, 191, 4, i5));
                        iM2566 = C0630.m2566("᩹ۙ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 30901) ^ 627871868;
                        i10 = 29789175;
                    }
                    break;
                case 753797970:
                case 1719556696:
                    sArr = f46935;
                    c = 190;
                    if (C0422.m1963()) {
                        iM2566 = (C0630.m2566("ۨ᩻") ^ i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((iM2566 ^ i7) * 25517) ^ (-120996120);
                        i10 = -2012268944;
                    } else {
                        iM2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    }
                    break;
                case 1077077644:
                case 1290268886:
                    C3537.m10746();
                    C2272.m7503();
                    iM2566 = C0630.m2566("ܽܶ") ^ i7;
                    i9 = ((iM2566 ^ i8) * 31571) ^ 1328092531;
                    i10 = 843817539;
                    break;
                case 1932862643:
                case 2004971989:
                    i5 = 43831;
                    iM2566 = C0630.m2566("֨۠") ^ i7;
                    i9 = ((iM2566 ^ i8) * (-221)) ^ (-1261822981);
                    i10 = 784136854;
                    break;
                default:
                    if ((i4 + i4) - i >= 0) {
                        iM2566 = C2105.m6981("ܳ᩺") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-24301)) ^ 1565101569;
                        i10 = -1865658002;
                    } else {
                        iM2566 = C0630.m2566("ۖۖ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 21531) ^ (-176048948);
                        i10 = 655776324;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0815 A[PHI: r0 r2 r3 r7 r23 r25 r27 r30 r39 r40 r41 r42
      0x0815: PHI (r0v64 int) = (r0v57 int), (r0v59 int), (r0v68 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r2v73 java.lang.StringBuilder) = (r2v66 java.lang.StringBuilder), (r2v68 java.lang.StringBuilder), (r2v76 java.lang.StringBuilder) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r3v49 char) = (r3v42 char), (r3v44 char), (r3v52 char) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r7v39 java.lang.String) = (r7v32 java.lang.String), (r7v34 java.lang.String), (r7v43 java.lang.String) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r23v30 int) = (r23v23 int), (r23v25 int), (r23v34 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r25v41 int) = (r25v34 int), (r25v36 int), (r25v44 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r27v46 int) = (r27v38 int), (r27v41 int), (r27v49 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r30v41 short[]) = (r30v34 short[]), (r30v36 short[]), (r30v45 short[]) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r39v34 int) = (r39v27 int), (r39v29 int), (r39v37 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r40v34 java.lang.String) = (r40v27 java.lang.String), (r40v29 java.lang.String), (r40v37 java.lang.String) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r41v35 int) = (r41v28 int), (r41v30 int), (r41v38 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]
      0x0815: PHI (r42v21 int) = (r42v14 int), (r42v16 int), (r42v24 int) binds: [B:131:0x07fc, B:123:0x076f, B:115:0x06df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x0b45 A[PHI: r1 r3 r7 r23 r25 r27 r28 r30 r39 r40 r41 r42
      0x0b45: PHI (r1v216 short) = (r1v48 short), (r1v49 short), (r1v217 short) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r3v112 char) = (r3v26 char), (r3v27 char), (r3v113 char) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r7v81 java.lang.String) = (r7v21 java.lang.String), (r7v22 java.lang.String), (r7v82 java.lang.String) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r23v52 int) = (r23v12 int), (r23v13 int), (r23v53 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r25v69 int) = (r25v23 int), (r25v24 int), (r25v70 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r27v72 int) = (r27v27 int), (r27v28 int), (r27v73 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r28v53 int) = (r28v7 int), (r28v8 int), (r28v54 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r30v82 short[]) = (r30v23 short[]), (r30v24 short[]), (r30v83 short[]) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r39v62 int) = (r39v16 int), (r39v17 int), (r39v63 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r40v67 java.lang.String) = (r40v16 java.lang.String), (r40v17 java.lang.String), (r40v68 java.lang.String) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r41v64 int) = (r41v17 int), (r41v18 int), (r41v65 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0b45: PHI (r42v48 int) = (r42v3 int), (r42v4 int), (r42v49 int) binds: [B:172:0x0b43, B:168:0x0b06, B:10:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01b8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36312(Throwable th, StringBuilder sb, StackTraceElement[] stackTraceElementArr, String str, String str2, Set set) {
        StringBuilder sb2;
        StringBuilder sb3;
        int i;
        char c;
        int iM6981;
        int i2;
        int i3;
        int iM2566;
        int i4;
        int i5;
        short[] sArr;
        int i6;
        int i7;
        int iM2567;
        int i8;
        int i9;
        int iM6982;
        int i10;
        int i11;
        int iM2568;
        int i12;
        int i13;
        int i14;
        int i15;
        int length;
        StringBuilder sb4;
        char c2;
        int iM6983;
        int i16;
        String str3;
        int i17;
        int i18;
        StringBuilder sb5;
        int i19;
        short[] sArr2;
        String str4;
        int i20;
        int i21;
        char c3;
        int iM6984;
        int i22;
        int i23;
        StringBuilder sb6;
        StringBuilder sb7;
        int i24;
        char c4;
        int iM6985;
        int i25;
        int i26;
        int iM2569;
        int i27;
        int i28;
        int iM6986;
        int i29;
        int i30;
        StringBuilder sb8 = sb;
        int i31 = 0;
        Throwable thM7149 = null;
        Throwable th2 = null;
        String strM37867 = null;
        int i32 = 0;
        short[] sArr3 = null;
        int i33 = 0;
        int i34 = 0;
        int i35 = -433365027;
        int i36 = ServiceConnectionC3453.f10921;
        int i37 = C0483.f2088;
        int iM25610 = C0630.m2566("ۙܳ") ^ i37;
        int i38 = ((iM25610 ^ i36) * 10393) ^ 1688429276;
        int i39 = iM25610 ^ (-1597084643);
        Throwable[] thArr = null;
        String strM13542 = null;
        String str5 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int length2 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int length3 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        char c5 = 0;
        int iM5741 = 0;
        short s = 0;
        StackTraceElement[] stackTraceElementArr2 = null;
        while (true) {
            i35 = i39 ^ (i38 & (((i35 ^ i36) * (-16327)) >> 31));
            switch (i35) {
                case -2144571422:
                case 629925819:
                    sb2 = sb8;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    c5 = c5;
                    strM13542 = strM13542;
                    C1420.m4905(sb2, AbstractC2021.m6573(f46935, 128, 5, i41));
                    C2105.m6979(sb2, c5);
                    length2 = length2;
                    i48 = i48;
                    i33 = i33;
                    i34 = i34;
                    iM2566 = (i37 - C0630.m2566("᩻ۖ")) * 5;
                    i38 = ((iM2566 ^ i36) * 19197) ^ 736560896;
                    i4 = -1622128140;
                    i39 = iM2566 ^ i4;
                    c5 = c5;
                    i34 = i34;
                    str5 = str5;
                    i33 = i33;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    sb8 = sb2;
                    i48 = i48;
                    length2 = length2;
                    break;
                case -2121429784:
                case 1643402120:
                    String className = stackTraceElementArr2[i40].getClassName();
                    str5 = className;
                    iM5741 = C1711.m5741(className);
                    i43 = 0;
                    int iM6987 = (C2105.m6981("۫᩶") ^ i36) * (-23);
                    i39 = iM6987 ^ (-2136668161);
                    sb8 = sb;
                    i38 = ((iM6987 ^ i37) * (-6227)) ^ 177395651;
                    strM13542 = strM13542;
                    break;
                case -2117038588:
                case -630284903:
                    StringBuilder sb9 = sb8;
                    C1420.m4905(sb9, C0483.m2128(f46935, 122, 1, i41));
                    C0630.m2567(sb9, c5);
                    break;
                case -2002050434:
                case 816734079:
                    strM13542 = strM13542;
                    length2 = length2;
                    sb2 = sb8;
                    i48 = i48;
                    i33 = i33;
                    i34 = i34;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    c5 = c5;
                    if (i31 != 0) {
                        iM2566 = (C2105.m6981("ۨܳ") + i36) * (-7);
                        i38 = ((iM2566 ^ i37) * (-31551)) ^ (-1759195776);
                        i4 = 79671307;
                    } else {
                        iM2566 = (i37 - C0630.m2566("֨ܳ")) * 61;
                        i38 = ((iM2566 ^ i36) * 9429) ^ (-1125169246);
                        i4 = 1762397247;
                    }
                    i39 = iM2566 ^ i4;
                    c5 = c5;
                    i34 = i34;
                    str5 = str5;
                    i33 = i33;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    sb8 = sb2;
                    i48 = i48;
                    length2 = length2;
                    break;
                case -1985179703:
                case 984420898:
                    str3 = strM13542;
                    i17 = length2;
                    i18 = i40;
                    sb5 = sb8;
                    i19 = iM5741;
                    sArr2 = sArr4;
                    str4 = str5;
                    i20 = i47;
                    i21 = i34;
                    c3 = c5;
                    int i49 = i33;
                    i14 = i48;
                    i15 = i49;
                    if (i20 >= 0) {
                        iM6984 = (C2105.m6981("֡᩶") ^ i36) * (-21);
                        i22 = ((iM6984 ^ i37) * 19053) ^ (-1686303155);
                        i23 = -1486685381;
                    } else {
                        iM6984 = (i36 - C2105.m6981("᩻᩹")) * 57;
                        i22 = ((iM6984 ^ i37) * (-32621)) ^ (-1682568430);
                        i23 = 2063859843;
                    }
                    i39 = iM6984 ^ i23;
                    c5 = c3;
                    i38 = i22;
                    str5 = str4;
                    i34 = i21;
                    strM13542 = str3;
                    length2 = i17;
                    i40 = i18;
                    i47 = i20;
                    sb8 = sb5;
                    sArr4 = sArr2;
                    iM5741 = i19;
                    int i50 = i14;
                    i33 = i15;
                    i48 = i50;
                    break;
                case -1888780910:
                case -1152805474:
                    break;
                case -1880336478:
                case 1497905816:
                    String str6 = str5;
                    String str7 = strM13542;
                    int i51 = iM5741;
                    if (i42 < length2) {
                        iM6985 = (C0630.m2566("᩹֡") + i37) * (-117);
                        i25 = ((iM6985 ^ i36) * (-26481)) ^ 1415016164;
                        i26 = -1690552846;
                    } else {
                        iM6985 = C2105.m6981("᩷ܰ") ^ i37;
                        i25 = ((iM6985 ^ i36) * (-13289)) ^ 2089471262;
                        i26 = -729486698;
                    }
                    i39 = iM6985 ^ i26;
                    iM5741 = i51;
                    i38 = i25;
                    str5 = str6;
                    strM13542 = str7;
                    sb8 = sb;
                    break;
                case -1841497302:
                case -629996082:
                    sb3 = sb8;
                    i = iM5741;
                    c = c5;
                    C1420.m4905(sb3, str2);
                    C1420.m4905(sb3, str);
                    C1128.m3845(sb3, th);
                    C0630.m2567(sb3, c);
                    i40 = 0;
                    int iM6988 = (i36 - C2105.m6981("֫ۚ")) * 9;
                    i38 = ((iM6988 ^ i37) * (-12039)) ^ (-2056968865);
                    i39 = iM6988 ^ (-1158491156);
                    c5 = c;
                    str5 = str5;
                    i34 = i34;
                    i33 = i33;
                    strM13542 = strM13542;
                    i47 = i47;
                    sb8 = sb3;
                    i48 = i48;
                    sArr4 = sArr4;
                    iM5741 = i;
                    length2 = length2;
                    break;
                case -1822586170:
                case 144305353:
                    if (C1128.f4106 > 0) {
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        c5 = c5;
                        iM5741 = iM5741;
                        s = s;
                        sArr4 = sArr4;
                        int i52 = i34;
                        i47 = i47;
                        i6 = i52;
                        int i53 = i33;
                        i48 = i48;
                        i7 = i53;
                        iM2567 = (C2105.m6981("ۡ֡") + i37) * (-3);
                        i8 = ((iM2567 ^ i36) * (-2603)) ^ 1576694458;
                        i9 = -196689364;
                        i39 = iM2567 ^ i9;
                        s = s;
                        c5 = c5;
                        i38 = i8;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i54 = i47;
                        i34 = i6;
                        i47 = i54;
                        int i55 = i48;
                        i33 = i7;
                        i48 = i55;
                    } else {
                        iM6986 = (C2105.m6981("ܺۚ") + i36) * 99;
                        i29 = ((iM6986 ^ i37) * (-611)) ^ 82987425;
                        i30 = 1477905953;
                        i39 = iM6986 ^ i30;
                        i38 = i29;
                    }
                    break;
                case -1769641948:
                case -990852452:
                    sb2 = sb8;
                    Throwable[] suppressed = th.getSuppressed();
                    i42 = 0;
                    thArr = suppressed;
                    length2 = suppressed.length;
                    iM2566 = C0630.m2566("ܳ۠") ^ i37;
                    i38 = ((iM2566 ^ i36) * 25563) ^ (-1143782928);
                    i4 = 1355802540;
                    i39 = iM2566 ^ i4;
                    c5 = c5;
                    i34 = i34;
                    str5 = str5;
                    i33 = i33;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    sb8 = sb2;
                    i48 = i48;
                    length2 = length2;
                    break;
                case -1764380805:
                case -335071566:
                    if (C4075.f12947 >= 0) {
                        iM6986 = C0630.m2566("ۨ᩺") ^ i37;
                        i29 = ((iM6986 ^ i36) * (-7719)) ^ 1567353768;
                        i30 = 390166947;
                        i39 = iM6986 ^ i30;
                        i38 = i29;
                    } else {
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        iM5741 = iM5741;
                        sArr4 = sArr4;
                        int i56 = i34;
                        i47 = i47;
                        i6 = i56;
                        int i57 = i33;
                        i48 = i48;
                        i7 = i57;
                        iM2567 = C2105.m6981("۠۫") ^ i36;
                        i8 = ((iM2567 ^ i37) * 32377) ^ (-1469677102);
                        i9 = -1076963067;
                        i39 = iM2567 ^ i9;
                        s = s;
                        c5 = c5;
                        i38 = i8;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i58 = i47;
                        i34 = i6;
                        i47 = i58;
                        int i59 = i48;
                        i33 = i7;
                        i48 = i59;
                    }
                    break;
                case -1756914219:
                case 1382053513:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    int i60 = i34;
                    i47 = i47;
                    i6 = i60;
                    int i61 = i33;
                    i48 = i48;
                    i7 = i61;
                    c5 = '\n';
                    if (set.contains(th)) {
                        iM2568 = C0630.m2566("ۡܰ") ^ i37;
                        i12 = ((iM2568 ^ i36) * (-17403)) ^ (-1635340928);
                        i13 = 700912910;
                    } else {
                        iM2568 = C0630.m2566("۟ܳ") ^ i37;
                        i12 = ((iM2568 ^ i36) * (-7819)) ^ 972219747;
                        i13 = -400901141;
                    }
                    i39 = iM2568 ^ i13;
                    i38 = i12;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i510 = i47;
                    i34 = i6;
                    i47 = i510;
                    int i511 = i48;
                    i33 = i7;
                    i48 = i511;
                    break;
                case -1751466255:
                case 563143924:
                    length2 = length2;
                    sb2 = sb;
                    m36312(th2, sb2, stackTraceElementArr2, C1773.m5917(sArr5, 138, 12, i41), strM37867, set);
                    i42++;
                    i40 = i40;
                    iM2566 = C0630.m2566("ܳ۠") ^ i37;
                    i38 = ((iM2566 ^ i36) * 25563) ^ (-1143782928);
                    i4 = 1355802540;
                    i39 = iM2566 ^ i4;
                    c5 = c5;
                    i34 = i34;
                    str5 = str5;
                    i33 = i33;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    sb8 = sb2;
                    i48 = i48;
                    length2 = length2;
                    break;
                case -1738786741:
                case -723974424:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    iM5741 = iM5741;
                    th2 = thArr[i42];
                    sArr4 = f46935;
                    i44 = 137;
                    i45 = 1;
                    if (C3019.m9255() > 0) {
                        iM2569 = (C2105.m6981("ᩳۜ") + i36) * (-73);
                        i27 = ((iM2569 ^ i37) * 2441) ^ (-1246352847);
                        i28 = -1019429009;
                        i39 = iM2569 ^ i28;
                        i38 = i27;
                        str5 = str5;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                    } else {
                        sArr4 = sArr4;
                        int i512 = i34;
                        i47 = i47;
                        i6 = i512;
                        int i513 = i33;
                        i48 = i48;
                        i7 = i513;
                        iM2567 = C2105.m6981("۠۫") ^ i36;
                        i8 = ((iM2567 ^ i37) * 32377) ^ (-1469677102);
                        i9 = -1076963067;
                        i39 = iM2567 ^ i9;
                        s = s;
                        c5 = c5;
                        i38 = i8;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i514 = i47;
                        i34 = i6;
                        i47 = i514;
                        int i515 = i48;
                        i33 = i7;
                        i48 = i515;
                    }
                    break;
                case -1629569066:
                case 752897285:
                    i6 = i34;
                    i7 = i33;
                    i41 = 33591;
                    iM6982 = C2105.m6981("ܽ۟") ^ i36;
                    i10 = ((iM6982 ^ i37) * 3091) ^ 248819967;
                    i11 = -1097374533;
                    i39 = iM6982 ^ i11;
                    i38 = i10;
                    c5 = c5;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i516 = i47;
                    i34 = i6;
                    i47 = i516;
                    int i517 = i48;
                    i33 = i7;
                    i48 = i517;
                    break;
                case -1584406521:
                case -395602958:
                    C3663.m11168();
                    iM6986 = (C2105.m6981("ۤܳ") ^ i37) * 11;
                    i29 = ((iM6986 ^ i36) * 6453) ^ (-1948592302);
                    i30 = 953525442;
                    i39 = iM6986 ^ i30;
                    i38 = i29;
                    break;
                case -1552038952:
                case 1312435529:
                    C1916.m6308();
                    if (C4075.f12947 < 0) {
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb4 = sb8;
                        iM5741 = iM5741;
                        str5 = str5;
                        c2 = c5;
                        int i62 = i34;
                        i47 = i47;
                        i6 = i62;
                        int i63 = i33;
                        i48 = i48;
                        i7 = i63;
                        iM6983 = (C0630.m2566("ܰۗ") ^ i36) * (-31);
                        i38 = ((iM6983 ^ i37) * (-3019)) ^ 543119049;
                        i16 = 1761120150;
                        i39 = iM6983 ^ i16;
                        c5 = c2;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb4;
                        int i518 = i47;
                        i34 = i6;
                        i47 = i518;
                        int i519 = i48;
                        i33 = i7;
                        i48 = i519;
                    } else {
                        iM6986 = C0630.m2566("ۨ᩺") ^ i37;
                        i29 = ((iM6986 ^ i36) * (-7719)) ^ 1567353768;
                        i30 = 390166947;
                        i39 = iM6986 ^ i30;
                        i38 = i29;
                    }
                    break;
                case -1550693515:
                case 1776308262:
                    str3 = strM13542;
                    i17 = length2;
                    i18 = i40;
                    sb5 = sb8;
                    i19 = iM5741;
                    sArr2 = sArr4;
                    str4 = str5;
                    i20 = i47;
                    i21 = i34;
                    c3 = c5;
                    int i64 = i33;
                    i14 = i48;
                    i15 = i64;
                    i31 = 0;
                    iM6984 = (C2105.m6981("۫᩹") + i36) * (-105);
                    i22 = ((iM6984 ^ i37) * 8673) ^ (-511256651);
                    i23 = 1607825496;
                    i39 = iM6984 ^ i23;
                    c5 = c3;
                    i38 = i22;
                    str5 = str4;
                    i34 = i21;
                    strM13542 = str3;
                    length2 = i17;
                    i40 = i18;
                    i47 = i20;
                    sb8 = sb5;
                    sArr4 = sArr2;
                    iM5741 = i19;
                    int i520 = i14;
                    i33 = i15;
                    i48 = i520;
                    break;
                case -1541077235:
                case 1110700967:
                    sb6 = sb8;
                    int i65 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    c5 = c5;
                    C1420.m4905(sb6, str2);
                    iM5741 = i65;
                    strM13542 = C4616.m13542(f46935, 133, 4, i41);
                    if (!C0382.f1805) {
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        int i66 = i34;
                        i47 = i47;
                        i6 = i66;
                        int i67 = i33;
                        i48 = i48;
                        i7 = i67;
                        iM6982 = C0630.m2566("ۗۡ") ^ i37;
                        i10 = ((iM6982 ^ i36) * (-16955)) ^ (-1706673984);
                        i11 = 1829258936;
                        i39 = iM6982 ^ i11;
                        i38 = i10;
                        c5 = c5;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i5110 = i47;
                        i34 = i6;
                        i47 = i5110;
                        int i5111 = i48;
                        i33 = i7;
                        i48 = i5111;
                    } else {
                        int iM25611 = C0630.m2566("ᩴᩴ") ^ i37;
                        i38 = ((iM25611 ^ i36) * 23029) ^ (-1264686309);
                        i39 = iM25611 ^ 349079105;
                        c5 = c5;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        sb8 = sb6;
                    }
                    break;
                case -1515480571:
                case -298271257:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    c5 = c5;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    int i68 = i34;
                    i47 = i47;
                    i6 = i68;
                    int i69 = i33;
                    i48 = i48;
                    i7 = i69;
                    s = f46935[100];
                    if (C3432.f10845 >= 0) {
                        iM6982 = C0630.m2566("ۗۡ") ^ i37;
                        i10 = ((iM6982 ^ i36) * (-16955)) ^ (-1706673984);
                        i11 = 1829258936;
                    } else {
                        iM6982 = (C2105.m6981("֡ܰ") + i37) * (-71);
                        i10 = ((iM6982 ^ i36) * 22999) ^ 1326533213;
                        i11 = -1397781051;
                    }
                    i39 = iM6982 ^ i11;
                    i38 = i10;
                    c5 = c5;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i5112 = i47;
                    i34 = i6;
                    i47 = i5112;
                    int i5113 = i48;
                    i33 = i7;
                    i48 = i5113;
                    break;
                case -1436451052:
                case 195331852:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    iM5741 = iM5741;
                    thM7149 = C2167.m7149(th);
                    if (thM7149 != null) {
                        iM2569 = (C0630.m2566("۬ᩴ") ^ i37) * (-13);
                        i27 = ((iM2569 ^ i36) * 2117) ^ 1061597777;
                        i28 = 1803580049;
                    } else {
                        iM2569 = C0630.m2566("ۤ۬") ^ i36;
                        i27 = ((iM2569 ^ i37) * 11817) ^ 1210413375;
                        i28 = 1671189610;
                    }
                    i39 = iM2569 ^ i28;
                    i38 = i27;
                    str5 = str5;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    break;
                case -1378095581:
                case -933044430:
                    C3019.m9255();
                    if (C1128.f4106 > 0) {
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        iM5741 = iM5741;
                        sArr4 = sArr4;
                        int i5114 = i34;
                        i47 = i47;
                        i6 = i5114;
                        int i5115 = i33;
                        i48 = i48;
                        i7 = i5115;
                        iM2567 = C2105.m6981("۠۫") ^ i36;
                        i8 = ((iM2567 ^ i37) * 32377) ^ (-1469677102);
                        i9 = -1076963067;
                        i39 = iM2567 ^ i9;
                        s = s;
                        c5 = c5;
                        i38 = i8;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i5116 = i47;
                        i34 = i6;
                        i47 = i5116;
                        int i5117 = i48;
                        i33 = i7;
                        i48 = i5117;
                    } else {
                        iM6986 = (C2105.m6981("ܺۚ") + i36) * 99;
                        i29 = ((iM6986 ^ i37) * (-611)) ^ 82987425;
                        i30 = 1477905953;
                        i39 = iM6986 ^ i30;
                        i38 = i29;
                    }
                    break;
                case -1370271226:
                case 1196154128:
                    C1773.m5908();
                    C4159.m12565();
                    break;
                case -1352433456:
                case 2006555517:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    iM5741 = iM5741;
                    strM37867 = C16014.m37867(str2, C1128.m3841(sArr4, i44, i45, i41));
                    sArr5 = f46935;
                    if (RunnableC1937.f6483 < 0) {
                        iM2569 = C2105.m6981("ۜ۫") ^ i36;
                        i27 = ((iM2569 ^ i37) * 21115) ^ 1138524945;
                        i28 = -848836085;
                        i39 = iM2569 ^ i28;
                        i38 = i27;
                        str5 = str5;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                    } else {
                        sb4 = sb;
                        c2 = c5;
                        int i610 = i34;
                        i47 = i47;
                        i6 = i610;
                        int i611 = i33;
                        i48 = i48;
                        i7 = i611;
                        iM6983 = (C0630.m2566("ܰۗ") ^ i36) * (-31);
                        i38 = ((iM6983 ^ i37) * (-3019)) ^ 543119049;
                        i16 = 1761120150;
                        i39 = iM6983 ^ i16;
                        c5 = c2;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb4;
                        int i5118 = i47;
                        i34 = i6;
                        i47 = i5118;
                        int i5119 = i48;
                        i33 = i7;
                        i48 = i5119;
                    }
                    break;
                case -1318818233:
                case -889741843:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    iM5741 = iM5741;
                    if (C4117.m12362(C3019.m9250(f46935, 150, 18, i41), C1711.m5733(str5, i43)) == -1) {
                        iM2569 = (i36 - C0630.m2566("ܳ۫")) * (-19);
                        i27 = ((iM2569 ^ i37) * 14839) ^ 1302159833;
                        i28 = 1807606331;
                        i39 = iM2569 ^ i28;
                        i38 = i27;
                        str5 = str5;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                    } else {
                        sb7 = sb;
                        c4 = c5;
                        i24 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        int iM6989 = C2105.m6981("᩺۫") ^ i36;
                        short[] sArr6 = sArr4;
                        int i70 = ((iM6989 ^ i37) * (-9329)) ^ (-794990001);
                        i39 = iM6989 ^ 162486224;
                        c5 = c4;
                        str5 = str5;
                        sb8 = sb7;
                        int i71 = i24;
                        i38 = i70;
                        sArr4 = sArr6;
                        iM5741 = i71;
                    }
                    break;
                case -1313911705:
                case -649832348:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    c5 = c5;
                    iM5741 = iM5741;
                    s = s;
                    sArr4 = sArr4;
                    int i72 = i34;
                    i47 = i47;
                    i6 = i72;
                    int i73 = i33;
                    i48 = i48;
                    i7 = i73;
                    int i74 = (s * s) + 162180225;
                    i32 = i74 + i74;
                    if (C1047.f3863 >= 0) {
                        iM2567 = C2105.m6981("۠۫") ^ i36;
                        i8 = ((iM2567 ^ i37) * 32377) ^ (-1469677102);
                        i9 = -1076963067;
                    } else {
                        iM2567 = (C2105.m6981("ܳۚ") + i36) * (-17);
                        i8 = ((iM2567 ^ i37) * (-26293)) ^ 2076608231;
                        i9 = 1230345963;
                    }
                    i39 = iM2567 ^ i9;
                    s = s;
                    c5 = c5;
                    i38 = i8;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i51110 = i47;
                    i34 = i6;
                    i47 = i51110;
                    int i51111 = i48;
                    i33 = i7;
                    i48 = i51111;
                    break;
                case -1305753007:
                case 1858303276:
                    AbstractC2021.m6574();
                    if (C4117.f13076 <= 0) {
                        iM6986 = (C2105.m6981("ܰ۫") ^ i37) * (-99);
                        i29 = ((iM6986 ^ i36) * 24531) ^ 1096765161;
                        i30 = 374127616;
                        i39 = iM6986 ^ i30;
                        i38 = i29;
                    } else {
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        c5 = c5;
                        iM5741 = iM5741;
                        s = s;
                        sArr4 = sArr4;
                        int i521 = i34;
                        i47 = i47;
                        i6 = i521;
                        int i522 = i33;
                        i48 = i48;
                        i7 = i522;
                        iM2567 = (C2105.m6981("ۡ֡") + i37) * (-3);
                        i8 = ((iM2567 ^ i36) * (-2603)) ^ 1576694458;
                        i9 = -196689364;
                        i39 = iM2567 ^ i9;
                        s = s;
                        c5 = c5;
                        i38 = i8;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i51112 = i47;
                        i34 = i6;
                        i47 = i51112;
                        int i51113 = i48;
                        i33 = i7;
                        i48 = i51113;
                    }
                    break;
                case -1299591179:
                case 1861730826:
                    str3 = strM13542;
                    i17 = length2;
                    i18 = i40;
                    sb5 = sb8;
                    i19 = iM5741;
                    sArr2 = sArr4;
                    str4 = str5;
                    i20 = i47;
                    i21 = i34;
                    c3 = c5;
                    int i75 = i33;
                    i14 = i48;
                    i15 = i75;
                    if (th instanceof C1637) {
                        iM6984 = (C2105.m6981("᩸۠") ^ i37) * (-79);
                        i22 = ((iM6984 ^ i36) * 1627) ^ (-1675512262);
                        i23 = -2022936434;
                    } else {
                        i31 = i46;
                        iM6984 = (C2105.m6981("۫᩹") + i36) * (-105);
                        i22 = ((iM6984 ^ i37) * 8673) ^ (-511256651);
                        i23 = 1607825496;
                    }
                    i39 = iM6984 ^ i23;
                    c5 = c3;
                    i38 = i22;
                    str5 = str4;
                    i34 = i21;
                    strM13542 = str3;
                    length2 = i17;
                    i40 = i18;
                    i47 = i20;
                    sb8 = sb5;
                    sArr4 = sArr2;
                    iM5741 = i19;
                    int i523 = i14;
                    i33 = i15;
                    i48 = i523;
                    break;
                case -1224105929:
                case 34881091:
                    i43++;
                    int iM69810 = (C2105.m6981("۫᩶") ^ i36) * (-23);
                    i39 = iM69810 ^ (-2136668161);
                    sb8 = sb;
                    i38 = ((iM69810 ^ i37) * (-6227)) ^ 177395651;
                    strM13542 = strM13542;
                    break;
                case -1182991743:
                case 661239040:
                    str3 = strM13542;
                    i17 = length2;
                    i18 = i40;
                    sb5 = sb8;
                    i15 = i33;
                    i19 = iM5741;
                    sArr2 = sArr4;
                    str4 = str5;
                    i20 = i47;
                    i21 = i34;
                    c3 = c5;
                    int length4 = (stackTraceElementArr2.length - i46) - i20;
                    if (th instanceof JSONException) {
                        i14 = length4;
                        iM6984 = (C2105.m6981("᩸۠") ^ i37) * (-79);
                        i22 = ((iM6984 ^ i36) * 1627) ^ (-1675512262);
                        i23 = -2022936434;
                        i39 = iM6984 ^ i23;
                        c5 = c3;
                        i38 = i22;
                    } else {
                        int iM25612 = (C0630.m2566("ۨۘ") + i36) * 35;
                        i14 = length4;
                        i38 = ((iM25612 ^ i37) * 31227) ^ (-483210834);
                        i39 = iM25612 ^ 150143274;
                        c5 = c3;
                    }
                    str5 = str4;
                    i34 = i21;
                    strM13542 = str3;
                    length2 = i17;
                    i40 = i18;
                    i47 = i20;
                    sb8 = sb5;
                    sArr4 = sArr2;
                    iM5741 = i19;
                    int i524 = i14;
                    i33 = i15;
                    i48 = i524;
                    break;
                case -1062144288:
                case 1807694324:
                    iM5741 = iM5741;
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    m36312(thM7149, sb, stackTraceElementArr2, C1504.m5177(f46935, 168, 11, i41), str2, set);
                    iM2569 = C0630.m2566("ۤ۬") ^ i36;
                    i27 = ((iM2569 ^ i37) * 11817) ^ 1210413375;
                    i28 = 1671189610;
                    i39 = iM2569 ^ i28;
                    i38 = i27;
                    str5 = str5;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    break;
                case -956510573:
                case 1742571395:
                    int i76 = i48;
                    i15 = i33;
                    length3--;
                    i14 = i76;
                    length = i47 - 1;
                    int iM25613 = (i37 - C0630.m2566("ۘ֨")) * (-55);
                    i39 = iM25613 ^ 893010729;
                    i38 = ((iM25613 ^ i36) * (-20789)) ^ (-336422302);
                    c5 = c5;
                    str5 = str5;
                    i34 = i34;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    sb8 = sb;
                    i47 = length;
                    i40 = i40;
                    int i525 = i14;
                    i33 = i15;
                    i48 = i525;
                    break;
                case -879804622:
                case 705665317:
                    strM13542 = strM13542;
                    length2 = length2;
                    sb2 = sb8;
                    i5 = i33;
                    i34 = i34;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    sArr = sArr3;
                    c5 = c5;
                    C3245.m9923(sb2, C3537.m10748(sArr, i5, i34, i41));
                    i48 = i48;
                    C0422.m1944(sb2, i48);
                    if (C1294.f4556 < 0) {
                        sArr3 = sArr;
                        iM2566 = (C2105.m6981("ۛ᩵") ^ i36) * (-3);
                        i33 = i5;
                        i38 = ((iM2566 ^ i37) * (-17835)) ^ 858028396;
                        i4 = 479283929;
                        i39 = iM2566 ^ i4;
                        c5 = c5;
                        i34 = i34;
                        str5 = str5;
                        i33 = i33;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        sb8 = sb2;
                        i48 = i48;
                        length2 = length2;
                    } else {
                        int iM69811 = (i36 - C2105.m6981("ܶܳ")) * 31;
                        sArr3 = sArr;
                        int i77 = ((iM69811 ^ i37) * (-21235)) ^ (-574317095);
                        i39 = iM69811 ^ (-1183634588);
                        i33 = i5;
                        c5 = c5;
                        i34 = i34;
                        i48 = i48;
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i38 = i77;
                        sb8 = sb2;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                    }
                    break;
                case -873554238:
                case -804208298:
                    sb7 = sb8;
                    i24 = iM5741;
                    str5 = str5;
                    C1420.m4905(sb7, strM13542);
                    C3746.m11367(sb7, stackTraceElementArr2[i40]);
                    c4 = c5;
                    C2105.m6979(sb7, c4);
                    int iM69812 = C2105.m6981("᩺۫") ^ i36;
                    short[] sArr7 = sArr4;
                    int i78 = ((iM69812 ^ i37) * (-9329)) ^ (-794990001);
                    i39 = iM69812 ^ 162486224;
                    c5 = c4;
                    str5 = str5;
                    sb8 = sb7;
                    int i79 = i24;
                    i38 = i78;
                    sArr4 = sArr7;
                    iM5741 = i79;
                    break;
                case -871192728:
                case 1235845548:
                    str3 = strM13542;
                    i17 = length2;
                    sb5 = sb8;
                    int i80 = i48;
                    i15 = i33;
                    i19 = iM5741;
                    sArr2 = sArr4;
                    str4 = str5;
                    i20 = i47;
                    i21 = i34;
                    c3 = c5;
                    i14 = i80;
                    i18 = i40;
                    if (C1294.m4369(stackTraceElementArr2[i20], stackTraceElementArr[length3])) {
                        iM6984 = (C0630.m2566("֨֡") + i37) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i22 = ((iM6984 ^ i36) * (-9291)) ^ 1584655388;
                        i23 = 1032178623;
                    } else {
                        iM6984 = (i36 - C2105.m6981("᩻᩹")) * 57;
                        i22 = ((iM6984 ^ i37) * (-32621)) ^ (-1682568430);
                        i23 = 2063859843;
                    }
                    i39 = iM6984 ^ i23;
                    c5 = c3;
                    i38 = i22;
                    str5 = str4;
                    i34 = i21;
                    strM13542 = str3;
                    length2 = i17;
                    i40 = i18;
                    i47 = i20;
                    sb8 = sb5;
                    sArr4 = sArr2;
                    iM5741 = i19;
                    int i526 = i14;
                    i33 = i15;
                    i48 = i526;
                    break;
                case -559061641:
                case -64340783:
                    C21923.m49329();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM6986 = (C2105.m6981("ۤܳ") ^ i37) * 11;
                        i29 = ((iM6986 ^ i36) * 6453) ^ (-1948592302);
                        i30 = 953525442;
                    } else {
                        iM6986 = C2105.m6981("᩺ᩳ") ^ i37;
                        i29 = ((iM6986 ^ i36) * (-14669)) ^ 496304203;
                        i30 = 927697608;
                    }
                    i39 = iM6986 ^ i30;
                    i38 = i29;
                    break;
                case -446981871:
                case -107169536:
                    i40++;
                    sb3 = sb;
                    i = iM5741;
                    c = c5;
                    int iM69813 = (i36 - C2105.m6981("֫ۚ")) * 9;
                    i38 = ((iM69813 ^ i37) * (-12039)) ^ (-2056968865);
                    i39 = iM69813 ^ (-1158491156);
                    c5 = c;
                    str5 = str5;
                    i34 = i34;
                    i33 = i33;
                    strM13542 = strM13542;
                    i47 = i47;
                    sb8 = sb3;
                    i48 = i48;
                    sArr4 = sArr4;
                    iM5741 = i;
                    length2 = length2;
                    break;
                case -326165887:
                case 1960421374:
                    strM13542 = strM13542;
                    length2 = length2;
                    sb6 = sb8;
                    int i81 = i48;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    c5 = c5;
                    C3245.m9923(sb6, str2);
                    sArr3 = f46935;
                    i33 = 123;
                    i34 = 5;
                    if (C2520.f8000 < 0) {
                        int iM69814 = C2105.m6981("ᩳᩴ") ^ i37;
                        i38 = ((iM69814 ^ i36) * (-17697)) ^ (-3919687);
                        i39 = iM69814 ^ 347023184;
                        c5 = c5;
                        i48 = i81;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        sb8 = sb6;
                    } else {
                        i48 = i81;
                        i40 = i40;
                        i47 = i47;
                        i6 = 5;
                        i7 = 123;
                        iM6982 = C0630.m2566("ۗۡ") ^ i37;
                        i10 = ((iM6982 ^ i36) * (-16955)) ^ (-1706673984);
                        i11 = 1829258936;
                        i39 = iM6982 ^ i11;
                        i38 = i10;
                        c5 = c5;
                        str5 = str5;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                        int i51114 = i47;
                        i34 = i6;
                        i47 = i51114;
                        int i51115 = i48;
                        i33 = i7;
                        i48 = i51115;
                    }
                    break;
                case -311280108:
                case 1396306046:
                    C1128.m3851();
                    if (C0382.m1848()) {
                        iM6986 = (C2105.m6981("ۤܳ") ^ i37) * 11;
                        i29 = ((iM6986 ^ i36) * 6453) ^ (-1948592302);
                        i30 = 953525442;
                    } else {
                        iM6986 = (C2105.m6981("ܺۚ") + i36) * 99;
                        i29 = ((iM6986 ^ i37) * (-611)) ^ 82987425;
                        i30 = 1477905953;
                    }
                    i39 = iM6986 ^ i30;
                    i38 = i29;
                    break;
                case -297540091:
                case 629247424:
                    strM13542 = strM13542;
                    length2 = length2;
                    sb3 = sb8;
                    i48 = i48;
                    i33 = i33;
                    i34 = i34;
                    i = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    i47 = i47;
                    char c6 = c5;
                    if (i40 <= i47) {
                        iM6981 = C2105.m6981("֡ᩳ") ^ i36;
                        i2 = ((iM6981 ^ i37) * (-2317)) ^ 1584036978;
                        i3 = -598121731;
                    } else {
                        iM6981 = (i37 - C2105.m6981("ۤ۟")) * 63;
                        i2 = ((iM6981 ^ i36) * (-9411)) ^ 1018550639;
                        i3 = 1681858961;
                    }
                    i39 = iM6981 ^ i3;
                    c5 = c6;
                    i38 = i2;
                    str5 = str5;
                    i34 = i34;
                    i33 = i33;
                    strM13542 = strM13542;
                    i47 = i47;
                    sb8 = sb3;
                    i48 = i48;
                    sArr4 = sArr4;
                    iM5741 = i;
                    length2 = length2;
                    break;
                case -246569077:
                case 170720242:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    c5 = c5;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    int i82 = i34;
                    i47 = i47;
                    i6 = i82;
                    int i83 = i33;
                    i48 = i48;
                    i7 = i83;
                    s = s;
                    int i84 = s + 12735;
                    if ((i84 * i84) - i32 <= 0) {
                        iM2567 = C2105.m6981("᩶ۧ") ^ i37;
                        i8 = ((iM2567 ^ i36) * 4013) ^ 413347913;
                        i9 = -205512649;
                    } else {
                        iM2567 = C0630.m2566("᩶ۡ") ^ i36;
                        i8 = ((iM2567 ^ i37) * (-18621)) ^ 423589809;
                        i9 = -721427908;
                    }
                    i39 = iM2567 ^ i9;
                    s = s;
                    c5 = c5;
                    i38 = i8;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i51116 = i47;
                    i34 = i6;
                    i47 = i51116;
                    int i51117 = i48;
                    i33 = i7;
                    i48 = i51117;
                    break;
                case -175453211:
                case 685051692:
                    str3 = strM13542;
                    i17 = length2;
                    i18 = i40;
                    sb5 = sb8;
                    i19 = iM5741;
                    sArr2 = sArr4;
                    str4 = str5;
                    i20 = i47;
                    i21 = i34;
                    c3 = c5;
                    int i85 = i33;
                    i14 = i48;
                    i15 = i85;
                    if (length3 >= 0) {
                        iM6984 = (i37 - C2105.m6981("ۤۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i22 = ((iM6984 ^ i36) * 11411) ^ (-693034220);
                        i23 = 933109804;
                    } else {
                        iM6984 = (i36 - C2105.m6981("᩻᩹")) * 57;
                        i22 = ((iM6984 ^ i37) * (-32621)) ^ (-1682568430);
                        i23 = 2063859843;
                    }
                    i39 = iM6984 ^ i23;
                    c5 = c3;
                    i38 = i22;
                    str5 = str4;
                    i34 = i21;
                    strM13542 = str3;
                    length2 = i17;
                    i40 = i18;
                    i47 = i20;
                    sb8 = sb5;
                    sArr4 = sArr2;
                    iM5741 = i19;
                    int i527 = i14;
                    i33 = i15;
                    i48 = i527;
                    break;
                case -152789150:
                case -117360274:
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb4 = sb8;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    int i86 = i47;
                    i6 = i34;
                    c2 = c5;
                    int i87 = i33;
                    i48 = i48;
                    i7 = i87;
                    i47 = i86;
                    C3245.m9923(sb4, C3911.m11919(f46935, 101, 21, i41));
                    C1128.m3845(sb4, th);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6983 = (C0630.m2566("ܰۗ") ^ i36) * (-31);
                        i38 = ((iM6983 ^ i37) * (-3019)) ^ 543119049;
                        i16 = 1761120150;
                    } else {
                        iM6983 = (i36 - C2105.m6981("ۖۚ")) * (-73);
                        i38 = ((iM6983 ^ i37) * (-30345)) ^ (-1261253556);
                        i16 = -329651472;
                    }
                    i39 = iM6983 ^ i16;
                    c5 = c2;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb4;
                    int i51118 = i47;
                    i34 = i6;
                    i47 = i51118;
                    int i51119 = i48;
                    i33 = i7;
                    i48 = i51119;
                    break;
                case -92322100:
                case 926495196:
                    int i88 = i33;
                    i14 = i48;
                    i15 = i88;
                    C0382.m1835(set, th);
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    length = stackTrace.length - 1;
                    stackTraceElementArr2 = stackTrace;
                    i46 = 1;
                    length3 = stackTraceElementArr.length - 1;
                    int iM25614 = (i37 - C0630.m2566("ۘ֨")) * (-55);
                    i39 = iM25614 ^ 893010729;
                    i38 = ((iM25614 ^ i36) * (-20789)) ^ (-336422302);
                    c5 = c5;
                    str5 = str5;
                    i34 = i34;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    sb8 = sb;
                    i47 = length;
                    i40 = i40;
                    int i528 = i14;
                    i33 = i15;
                    i48 = i528;
                    break;
                case 309815578:
                case 1892518727:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    c5 = c5;
                    iM5741 = iM5741;
                    s = s;
                    sArr4 = sArr4;
                    int i89 = i34;
                    i47 = i47;
                    i6 = i89;
                    int i90 = i33;
                    i48 = i48;
                    i7 = i90;
                    if (C3245.m9925() != 0) {
                        iM2567 = (C2105.m6981("ۡ֡") + i37) * (-3);
                        i8 = ((iM2567 ^ i36) * (-2603)) ^ 1576694458;
                        i9 = -196689364;
                    } else {
                        iM2567 = C2105.m6981("ܽ᩻") ^ i37;
                        i8 = ((iM2567 ^ i36) * 31251) ^ 1089224245;
                        i9 = 823857466;
                    }
                    i39 = iM2567 ^ i9;
                    s = s;
                    c5 = c5;
                    i38 = i8;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i511110 = i47;
                    i34 = i6;
                    i47 = i511110;
                    int i511111 = i48;
                    i33 = i7;
                    i48 = i511111;
                    break;
                case 649822463:
                case 896235756:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    int i91 = iM5741;
                    if (i43 >= i91) {
                        sb2 = sb;
                        sArr4 = sArr4;
                        iM5741 = i91;
                        i48 = i48;
                        i33 = i33;
                        i34 = i34;
                        c5 = c5;
                        i40 = i40;
                        iM2566 = (i37 - C0630.m2566("֨ܳ")) * 61;
                        i38 = ((iM2566 ^ i36) * 9429) ^ (-1125169246);
                        i4 = 1762397247;
                        i39 = iM2566 ^ i4;
                        c5 = c5;
                        i34 = i34;
                        str5 = str5;
                        i33 = i33;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                        strM13542 = strM13542;
                        sb8 = sb2;
                        i48 = i48;
                        length2 = length2;
                    } else {
                        int iM69815 = (C2105.m6981("ᩳܺ") + i37) * (-95);
                        i39 = iM69815 ^ (-95961977);
                        iM5741 = i91;
                        i38 = ((iM69815 ^ i36) * (-5745)) ^ (-477964500);
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i40 = i40;
                        sb8 = sb;
                    }
                    break;
                case 653032033:
                case 1919331628:
                    if (RunnableC1937.f6483 < 0) {
                        strM13542 = strM13542;
                        length2 = length2;
                        sb2 = sb8;
                        i48 = i48;
                        i5 = i33;
                        i34 = i34;
                        iM5741 = iM5741;
                        sArr4 = sArr4;
                        str5 = str5;
                        sArr = sArr3;
                        c5 = c5;
                        int iM69816 = (i36 - C2105.m6981("ܶܳ")) * 31;
                        sArr3 = sArr;
                        int i710 = ((iM69816 ^ i37) * (-21235)) ^ (-574317095);
                        i39 = iM69816 ^ (-1183634588);
                        i33 = i5;
                        c5 = c5;
                        i34 = i34;
                        i48 = i48;
                        str5 = str5;
                        strM13542 = strM13542;
                        length2 = length2;
                        i38 = i710;
                        sb8 = sb2;
                        sArr4 = sArr4;
                        iM5741 = iM5741;
                    } else {
                        iM6986 = C2105.m6981("᩺ᩳ") ^ i37;
                        i29 = ((iM6986 ^ i36) * (-14669)) ^ 496304203;
                        i30 = 927697608;
                        i39 = iM6986 ^ i30;
                        i38 = i29;
                    }
                    break;
                case 936352990:
                case 940256359:
                    i6 = i34;
                    i7 = i33;
                    i41 = 24549;
                    iM6982 = C2105.m6981("ܽ۟") ^ i36;
                    i10 = ((iM6982 ^ i37) * 3091) ^ 248819967;
                    i11 = -1097374533;
                    i39 = iM6982 ^ i11;
                    i38 = i10;
                    c5 = c5;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i511112 = i47;
                    i34 = i6;
                    i47 = i511112;
                    int i511113 = i48;
                    i33 = i7;
                    i48 = i511113;
                    break;
                case 938714841:
                case 2146296164:
                    str5 = str5;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    c5 = c5;
                    iM5741 = iM5741;
                    s = s;
                    sArr4 = sArr4;
                    int i92 = i34;
                    i47 = i47;
                    i6 = i92;
                    int i93 = i33;
                    i48 = i48;
                    i7 = i93;
                    if (C0964.m3413()) {
                        iM2567 = (i36 - C0630.m2566("ۙ۫")) * 95;
                        i8 = ((iM2567 ^ i37) * (-26067)) ^ 79235952;
                        i9 = -37366760;
                    } else {
                        iM2567 = (C2105.m6981("ۡ֡") + i37) * (-3);
                        i8 = ((iM2567 ^ i36) * (-2603)) ^ 1576694458;
                        i9 = -196689364;
                    }
                    i39 = iM2567 ^ i9;
                    s = s;
                    c5 = c5;
                    i38 = i8;
                    str5 = str5;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    length2 = length2;
                    i40 = i40;
                    sb8 = sb;
                    int i511114 = i47;
                    i34 = i6;
                    i47 = i511114;
                    int i511115 = i48;
                    i33 = i7;
                    i48 = i511115;
                    break;
                default:
                    strM13542 = strM13542;
                    length2 = length2;
                    sb2 = sb8;
                    i48 = i48;
                    i33 = i33;
                    i34 = i34;
                    iM5741 = iM5741;
                    sArr4 = sArr4;
                    str5 = str5;
                    c5 = c5;
                    if (i48 != 0) {
                        iM2566 = C2105.m6981("ۡۧ") ^ i36;
                        i38 = ((iM2566 ^ i37) * 29837) ^ 1307187374;
                        i4 = 7877591;
                    } else {
                        iM2566 = (i37 - C0630.m2566("᩻ۖ")) * 5;
                        i38 = ((iM2566 ^ i36) * 19197) ^ 736560896;
                        i4 = -1622128140;
                    }
                    i39 = iM2566 ^ i4;
                    c5 = c5;
                    i34 = i34;
                    str5 = str5;
                    i33 = i33;
                    sArr4 = sArr4;
                    iM5741 = iM5741;
                    strM13542 = strM13542;
                    sb8 = sb2;
                    i48 = i48;
                    length2 = length2;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m36316() {
        String str = null;
        String str2 = null;
        int i = 1481973079;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C3746.f11829;
        int iM2566 = (i3 - C0630.m2566("۟۫")) * 95;
        int i4 = ((iM2566 ^ i2) * 20935) ^ 2070987860;
        int i5 = 745855830;
        while (true) {
            i = ((((i ^ i2) * (-967)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1889323691:
                case 103066417:
                    str = f46933;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    } else {
                        iM2566 = C2105.m6981("ۙۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1647)) ^ (-1666382236);
                        i5 = 2049228786;
                    }
                    break;
                case -1446898287:
                case 428317896:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("᩻۟") + i3) * (-23);
                        i4 = ((iM2566 ^ i2) * 32245) ^ 729794142;
                        i5 = -563011140;
                    } else {
                        iM2566 = C2105.m6981("ۢۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28579)) ^ (-1653499612);
                        i5 = 95275258;
                    }
                    break;
                case -1356772119:
                case 838948672:
                    C2272.m7503();
                    return null;
                case -1346823779:
                case 550328488:
                    C1128.m3851();
                    if (C4117.f13076 <= 0) {
                        iM2566 = (C0630.m2566("᩻۟") + i3) * (-23);
                        i4 = ((iM2566 ^ i2) * 32245) ^ 729794142;
                        i5 = -563011140;
                    } else {
                        iM2566 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14361)) ^ (-766662109);
                        i5 = -1792126935;
                    }
                    break;
                case -1207569365:
                case 731787859:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                        i4 = ((iM2566 ^ i2) * (-6089)) ^ (-746560766);
                        i5 = -2012349965;
                    } else {
                        iM2566 = (C2105.m6981("۬᩺") ^ i3) * (-61);
                        i4 = ((iM2566 ^ i2) * (-629)) ^ 1231154649;
                        i5 = 850494251;
                    }
                    break;
                case -1164391133:
                case 772260068:
                    if (C0798.f2919) {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                        i4 = ((iM2566 ^ i2) * (-6089)) ^ (-746560766);
                        i5 = -2012349965;
                    } else {
                        iM2566 = C0630.m2566("֨۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * 173) ^ 1268913102;
                        i5 = 728898756;
                    }
                    break;
                case -1014768497:
                case 1368305908:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((iM2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    } else {
                        iM2566 = C0630.m2566("ۙۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 29927) ^ (-385552284);
                        i5 = 905568933;
                    }
                    break;
                case -974020218:
                case 952592296:
                    str2 = "";
                    iM2566 = C0630.m2566("ۘۢ") ^ i2;
                    i4 = ((iM2566 ^ i3) * 16313) ^ (-1554205293);
                    i5 = 1861420038;
                    break;
                case -369601886:
                case 1641717179:
                    if (C7106.m19120() <= 0) {
                        iM2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((iM2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    } else {
                        iM2566 = (C2105.m6981("᩸᩷") + i3) * 127;
                        i4 = ((iM2566 ^ i2) * (-13615)) ^ (-1745733111);
                        i5 = 1812835334;
                    }
                    break;
                case -274395961:
                case 498271463:
                    C4159.m12565();
                    iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                    i4 = ((iM2566 ^ i2) * (-6089)) ^ (-746560766);
                    i5 = -2012349965;
                    break;
                case -216248912:
                case 986741563:
                    return str2;
                case -8512897:
                case 720208672:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((iM2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    } else {
                        iM2566 = C2105.m6981("۠ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 25409) ^ (-60088380);
                        i5 = 1461090954;
                    }
                    break;
                case 151415085:
                case 474035565:
                    if (!C0382.f1805) {
                        iM2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    } else {
                        iM2566 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14361)) ^ (-766662109);
                        i5 = -1792126935;
                    }
                    break;
                case 835710521:
                case 2146282617:
                    if (str == null) {
                        iM2566 = (C2105.m6981("ۖ۟") ^ i3) * (-41);
                        i4 = ((iM2566 ^ i2) * (-26883)) ^ 857189017;
                        i5 = -1075777188;
                    } else {
                        str2 = str;
                        iM2566 = C0630.m2566("ۘۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16313) ^ (-1554205293);
                        i5 = 1861420038;
                    }
                    break;
                case 841688481:
                case 1286549546:
                    if (C1005.f3721) {
                        iM2566 = (i2 - C0630.m2566("֫᩻")) * 81;
                        i4 = ((iM2566 ^ i3) * 7209) ^ (-1458998019);
                        i5 = 1618536008;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((iM2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    }
                    break;
                case 950969096:
                case 1801647642:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    } else {
                        iM2566 = (C0630.m2566("ۤܺ") ^ i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-4291)) ^ 559203876;
                        i5 = 1535589186;
                    }
                    break;
                case 1303110166:
                case 1965464857:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14361)) ^ (-766662109);
                        i5 = -1792126935;
                    } else {
                        iM2566 = C2105.m6981("֫ܶ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-10675)) ^ (-231063428);
                        i5 = 2136892102;
                    }
                    break;
                default:
                    if (C1128.m3851() <= 0) {
                        iM2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    } else {
                        iM2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                        i4 = ((iM2566 ^ i2) * (-6089)) ^ (-746560766);
                        i5 = -2012349965;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m36317(String str) {
        f46933 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m36313() {
        String str = null;
        String str2 = null;
        int i = -661820326;
        int i2 = C3019.f9544;
        int i3 = C4117.f13076;
        int iM2566 = (i3 - C0630.m2566("ۚܿ")) * (-91);
        int i4 = ((iM2566 ^ i2) * 30599) ^ 1915571190;
        int i5 = 426288221;
        while (true) {
            i = ((((i ^ i2) * 8485) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1772519669:
                case 373480720:
                    C7106.m19120();
                    if (!RunnableC1108.f4040) {
                        iM2566 = (C0630.m2566("۬ۘ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i2) * (-27549)) ^ 998712162;
                        i5 = 1178439621;
                    } else {
                        iM2566 = C0630.m2566("۬۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27719) ^ (-1673634329);
                        i5 = 1338227800;
                    }
                    break;
                case -1729238973:
                case 264766945:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۨ") + i2) * 73;
                        i4 = ((iM2566 ^ i3) * (-20451)) ^ (-333875484);
                        i5 = -1546797212;
                    }
                    break;
                case -1570576165:
                case 257224384:
                    if (C3019.f9544 < 0) {
                        iM2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        iM2566 = (C0630.m2566("۬ۘ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2566 ^ i2) * (-27549)) ^ 998712162;
                        i5 = 1178439621;
                    }
                    break;
                case -1385885357:
                case 1613859286:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        iM2566 = C2105.m6981("ᩳܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-29889)) ^ 1819186233;
                        i5 = -572098423;
                    }
                    break;
                case -1198313551:
                case 710422530:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        iM2566 = (C2105.m6981("ۤᩳ") ^ i3) * 97;
                        i4 = ((iM2566 ^ i2) * 11383) ^ 1487045962;
                        i5 = 2059174379;
                    }
                    break;
                case -1112117459:
                case 789595733:
                    return str2;
                case -1033244264:
                case -601165055:
                    C1420.m4913();
                    C1128.m3851();
                    iM2566 = (C0630.m2566("۬ۘ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM2566 ^ i2) * (-27549)) ^ 998712162;
                    i5 = 1178439621;
                    break;
                case -900099356:
                case 1166968283:
                    if (RunnableC1108.f4040) {
                        iM2566 = C2105.m6981("ۢۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27893)) ^ (-1454992922);
                        i5 = 87168323;
                    } else {
                        iM2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    }
                    break;
                case -814911330:
                case 1542046432:
                    if (str == null) {
                        iM2566 = C2105.m6981("᩵ۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21833) ^ (-1915726993);
                        i5 = -1334340336;
                    } else {
                        str2 = str;
                        iM2566 = (i2 - C0630.m2566("֫۠")) * (-73);
                        i4 = ((iM2566 ^ i3) * 27119) ^ 1438781134;
                        i5 = 305397080;
                    }
                    break;
                case -608311371:
                case -323653782:
                    C0422.m1963();
                    return null;
                case -423807822:
                case 1855774399:
                    str2 = "";
                    iM2566 = (i2 - C0630.m2566("֫۠")) * (-73);
                    i4 = ((iM2566 ^ i3) * 27119) ^ 1438781134;
                    i5 = 305397080;
                    break;
                case -393002869:
                case 754677672:
                    if (C1047.m3599() >= 0) {
                        iM2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        iM2566 = C0630.m2566("۠᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS) ^ 1127073745;
                        i5 = 530967822;
                    }
                    break;
                case -360863497:
                case 1070382615:
                    str = f46934;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        iM2566 = C2105.m6981("ۚ֫") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20009) ^ (-814723940);
                        i5 = 889948929;
                    }
                    break;
                case -250166493:
                case 284726054:
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܶ۫")) * (-81);
                        i4 = ((iM2566 ^ i2) * (-27669)) ^ (-1155089419);
                        i5 = -806323723;
                    }
                    break;
                case 377851841:
                case 1231853619:
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۙ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-15597)) ^ 1674112208;
                        i5 = -939957548;
                    } else {
                        iM2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    }
                    break;
                case 809814617:
                case 2043333673:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((iM2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        iM2566 = C2105.m6981("᩺۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * 27043) ^ (-578534223);
                        i5 = -1717055093;
                    }
                    break;
                case 1571362589:
                case 1673710519:
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ᩻") + i2) * (-73);
                        i4 = ((iM2566 ^ i3) * 25329) ^ (-705027245);
                        i5 = 721868087;
                    }
                    break;
                default:
                    if (!C2126.f7087) {
                        iM2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    } else {
                        iM2566 = C0630.m2566("۬۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27719) ^ (-1673634329);
                        i5 = 1338227800;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36314(String str) {
        f46934 = str;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0121 A[PHI: r2 r16
      0x0121: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v1 java.lang.String), (r2v1 java.lang.String) binds: [B:40:0x011f, B:16:0x0077, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r16v26 int) = (r16v16 int), (r16v23 int), (r16v28 int) binds: [B:40:0x011f, B:16:0x0077, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01b0 A[PHI: r16 r17
      0x01b0: PHI (r16v13 int) = (r16v12 int), (r16v14 int) binds: [B:54:0x0199, B:48:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v1 java.lang.String) binds: [B:54:0x0199, B:48:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0240 A[PHI: r3 r7 r8 r9 r16
      0x0240: PHI (r3v3 java.lang.String) = 
      (r3v1 java.lang.String)
      (r3v2 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
     binds: [B:65:0x0226, B:28:0x00bf, B:18:0x007b, B:16:0x0077, B:13:0x006c, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r7v2 int) = (r7v1 int), (r7v1 int), (r7v1 int), (r7v1 int), (r7v1 int), (r7v4 int) binds: [B:65:0x0226, B:28:0x00bf, B:18:0x007b, B:16:0x0077, B:13:0x006c, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:65:0x0226, B:28:0x00bf, B:18:0x007b, B:16:0x0077, B:13:0x006c, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r9v3 short) = (r9v2 short), (r9v1 short), (r9v1 short), (r9v1 short), (r9v1 short), (r9v1 short) binds: [B:65:0x0226, B:28:0x00bf, B:18:0x007b, B:16:0x0077, B:13:0x006c, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0240: PHI (r16v29 int) = (r16v7 int), (r16v19 int), (r16v22 int), (r16v23 int), (r16v25 int), (r16v32 int) binds: [B:65:0x0226, B:28:0x00bf, B:18:0x007b, B:16:0x0077, B:13:0x006c, B:6:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0274 A[PHI: r1 r6 r16
      0x0274: PHI (r1v3 java.lang.StringBuilder) = (r1v1 java.lang.StringBuilder), (r1v2 java.lang.StringBuilder), (r1v1 java.lang.StringBuilder) binds: [B:71:0x0272, B:44:0x0156, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r6v3 short) = (r6v2 short), (r6v1 short), (r6v1 short) binds: [B:71:0x0272, B:44:0x0156, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0274: PHI (r16v24 int) = (r16v6 int), (r16v15 int), (r16v25 int) binds: [B:71:0x0272, B:44:0x0156, B:13:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02ad A[PHI: r4 r5 r11 r12 r16
      0x02ad: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:75:0x02ab, B:36:0x0100, B:32:0x00e0, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char), (r5v1 char) binds: [B:75:0x02ab, B:36:0x0100, B:32:0x00e0, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r11v3 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:75:0x02ab, B:36:0x0100, B:32:0x00e0, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:75:0x02ab, B:36:0x0100, B:32:0x00e0, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r16v20 int) = (r16v5 int), (r16v17 int), (r16v18 int), (r16v21 int) binds: [B:75:0x02ab, B:36:0x0100, B:32:0x00e0, B:24:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m36319() {
        int iM6981;
        int i;
        int i2;
        StringBuilder sb = null;
        String str = null;
        String strM1483 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 420009642;
        int i8 = C3911.f12484;
        int i9 = C7811.f24123;
        int iM6982 = C2105.m6981("᩵ۚ") ^ i9;
        int i10 = ((iM6982 ^ i8) * 26097) ^ (-365993589);
        int i11 = iM6982 ^ 495639261;
        String str2 = null;
        while (true) {
            int i12 = i11 ^ (i10 & (((i7 ^ i8) * 14405) >> 31));
            switch (i12) {
                case -2093032203:
                case 708287630:
                    i12 = i12;
                    i4 = i3 * i3;
                    s2 = 57184;
                    if (C2272.m7503()) {
                        iM6981 = C0630.m2566("ۗ᩹") ^ i9;
                        i = ((iM6981 ^ i8) * 8705) ^ 1728915273;
                        i2 = 226135692;
                    } else {
                        iM6981 = (C0630.m2566("ۧ᩺") ^ i9) * 33;
                        i = ((iM6981 ^ i8) * 3309) ^ (-1099531815);
                        i2 = 877674488;
                    }
                    int i13 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i13;
                    break;
                case -2082205192:
                case -769435460:
                    return f46933;
                case -1920374248:
                case 1153675485:
                    i12 = i12;
                    C4159.m12565();
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("ۗ᩹") ^ i9;
                        i = ((iM6981 ^ i8) * 8705) ^ 1728915273;
                        i2 = 226135692;
                    } else {
                        iM6981 = (C2105.m6981("ۨܶ") + i8) * (-103);
                        i = ((iM6981 ^ i9) * 28725) ^ 343582067;
                        i2 = -1943911296;
                    }
                    int i14 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i14;
                    break;
                case -1814509647:
                case -880104583:
                    if (C22628.m50615() == 0) {
                        i12 = i12;
                        iM6981 = C2105.m6981("᩹֫") ^ i8;
                        i = ((iM6981 ^ i9) * (-12667)) ^ (-1151620171);
                        i2 = -102052217;
                    } else {
                        iM6981 = (C0630.m2566("ۜ᩶") + i9) * 37;
                        i12 = i12;
                        i = ((iM6981 ^ i8) * (-20963)) ^ (-1929502955);
                        i2 = 979793949;
                    }
                    int i15 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i15;
                    break;
                case -1772034133:
                case 446969476:
                    i12 = i12;
                    C0964.m3413();
                    if (C2167.f7158 < 0) {
                        iM6981 = C0630.m2566("ۗ᩹") ^ i9;
                        i = ((iM6981 ^ i8) * 8705) ^ 1728915273;
                        i2 = 226135692;
                    } else {
                        iM6981 = C2105.m6981("᩹֫") ^ i8;
                        i = ((iM6981 ^ i9) * (-12667)) ^ (-1151620171);
                        i2 = -102052217;
                    }
                    int i16 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i16;
                    break;
                case -1625850252:
                case 706586299:
                    i12 = i12;
                    if (C1916.m6313(str2)) {
                        iM6981 = C0630.m2566("᩶᩸") ^ i9;
                        i = ((iM6981 ^ i8) * (-32303)) ^ (-1622930476);
                        i2 = 1674629945;
                    } else {
                        iM6981 = (i9 - C0630.m2566("᩶۬")) * (-23);
                        i = ((iM6981 ^ i8) * 24933) ^ (-289694070);
                        i2 = -140831729;
                    }
                    int i17 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i17;
                    break;
                case -1401346913:
                case -630998541:
                    i12 = i12;
                    sArr = f46935;
                    c = 195;
                    if (C1047.m3599() >= 0) {
                        iM6981 = (C2105.m6981("᩷֨") ^ i8) * 51;
                        i = ((iM6981 ^ i9) * 29645) ^ (-2103324281);
                        i2 = 1836929917;
                    } else {
                        iM6981 = C2105.m6981("ܺܶ") ^ i8;
                        i = ((iM6981 ^ i9) * (-17523)) ^ (-1828585213);
                        i2 = 417270179;
                    }
                    int i18 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i18;
                    break;
                case -1361836206:
                case -279102603:
                    i12 = i12;
                    sArr2 = f46935;
                    i6 = 196;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C2105.m6981("᩷֨") ^ i8) * 51;
                        i = ((iM6981 ^ i9) * 29645) ^ (-2103324281);
                        i2 = 1836929917;
                    } else {
                        iM6981 = C0630.m2566("᩹֨") ^ i8;
                        i = ((iM6981 ^ i9) * (-3489)) ^ 1881068794;
                        i2 = -14440175;
                    }
                    int i19 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i19;
                    break;
                case -1200028897:
                case -29570934:
                    i12 = i12;
                    s = sArr[c];
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ۨܶ") + i8) * (-103);
                        i = ((iM6981 ^ i9) * 28725) ^ 343582067;
                        i2 = -1943911296;
                    } else {
                        iM6981 = (i9 - C0630.m2566("ᩴ᩻")) * 7;
                        i = ((iM6981 ^ i8) * 19953) ^ (-546667798);
                        i2 = -1529089692;
                    }
                    int i110 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i110;
                    break;
                case -1131764407:
                case 91172816:
                    C7811.m20844();
                    C0630.m2564();
                    return null;
                case -914261479:
                case 1557343141:
                    C1420.m4905(sb, f46934);
                    return C0422.m1959(sb);
                case -773867340:
                case 253361058:
                    i12 = i12;
                    C3245.m9923(sb, strM1483);
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("᩷֨") ^ i8) * 51;
                        i = ((iM6981 ^ i9) * 29645) ^ (-2103324281);
                        i2 = 1836929917;
                    } else {
                        iM6981 = (C0630.m2566("᩵֫") ^ i9) * (-23);
                        i = ((iM6981 ^ i8) * 9471) ^ 1231086248;
                        i2 = 1606903132;
                    }
                    int i111 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i111;
                    break;
                case -609819572:
                case 351258520:
                    i12 = i12;
                    if (i4 - (s * s2) >= 0) {
                        iM6981 = C2105.m6981("֡֫") ^ i9;
                        i = ((iM6981 ^ i8) * (-3467)) ^ (-1242108202);
                        i2 = 1354245200;
                    } else {
                        iM6981 = C2105.m6981("᩻ۙ") ^ i8;
                        i = ((iM6981 ^ i9) * 19793) ^ (-364343955);
                        i2 = -972856214;
                    }
                    int i112 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i112;
                    break;
                case -515353283:
                case -374287821:
                    i5 = 24664;
                    iM6981 = C0630.m2566("ۨۨ") ^ i8;
                    i = ((iM6981 ^ i9) * 29827) ^ (-2037989299);
                    i2 = 75743056;
                    int i113 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i113;
                    break;
                case -497007547:
                case 602968062:
                    i12 = i12;
                    str2 = f46934;
                    if (str2 != null) {
                        iM6981 = C0630.m2566("᩻ܰ") ^ i8;
                        i = ((iM6981 ^ i9) * (-18355)) ^ (-1001527148);
                        i2 = 2046256244;
                    } else {
                        iM6981 = C0630.m2566("᩶᩸") ^ i9;
                        i = ((iM6981 ^ i8) * (-32303)) ^ (-1622930476);
                        i2 = 1674629945;
                    }
                    int i114 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i114;
                    break;
                case -197948298:
                case 813768288:
                    i12 = i12;
                    sb = new StringBuilder();
                    if (C3911.m11924() <= 0) {
                        iM6981 = (C2105.m6981("ۨܶ") + i8) * (-103);
                        i = ((iM6981 ^ i9) * 28725) ^ 343582067;
                        i2 = -1943911296;
                    } else {
                        iM6981 = (C0630.m2566("ۤ᩸") + i8) * (-13);
                        i = ((iM6981 ^ i9) * 13229) ^ 1379109626;
                        i2 = 800218716;
                    }
                    int i115 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i115;
                    break;
                case 180198002:
                case 432256331:
                    i12 = i12;
                    strM1483 = C0237.m1483(sArr2, i6, 1, i5);
                    if (C2958.f9394 >= 0) {
                        iM6981 = C0630.m2566("ۗ᩹") ^ i9;
                        i = ((iM6981 ^ i8) * 8705) ^ 1728915273;
                        i2 = 226135692;
                    } else {
                        iM6981 = C0630.m2566("ۡܶ") ^ i8;
                        i = ((iM6981 ^ i9) * 7913) ^ 1596804969;
                        i2 = 926696148;
                    }
                    int i116 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i116;
                    break;
                case 380923721:
                case 719851905:
                    i12 = i12;
                    C3245.m9923(sb, str);
                    if (C7106.f21815 != 0) {
                        iM6981 = (C2105.m6981("᩷֨") ^ i8) * 51;
                        i = ((iM6981 ^ i9) * 29645) ^ (-2103324281);
                        i2 = 1836929917;
                    } else {
                        iM6981 = C2105.m6981("۫ۡ") ^ i9;
                        i = ((iM6981 ^ i8) * 16415) ^ 459062875;
                        i2 = 522460995;
                    }
                    int i117 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i117;
                    break;
                case 520803008:
                case 1427096693:
                    i12 = i12;
                    C2958.m9034();
                    iM6981 = C0630.m2566("ۗ᩹") ^ i9;
                    i = ((iM6981 ^ i8) * 8705) ^ 1728915273;
                    i2 = 226135692;
                    int i118 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i118;
                    break;
                case 551778753:
                case 1463314944:
                    i5 = 42052;
                    iM6981 = C0630.m2566("ۨۨ") ^ i8;
                    i = ((iM6981 ^ i9) * 29827) ^ (-2037989299);
                    i2 = 75743056;
                    int i119 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i119;
                    break;
                case 1033847153:
                case 1775796663:
                    i12 = i12;
                    str = f46933;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C2105.m6981("᩹֫") ^ i8;
                        i = ((iM6981 ^ i9) * (-12667)) ^ (-1151620171);
                        i2 = -102052217;
                    } else {
                        iM6981 = C2105.m6981("ۤۧ") ^ i9;
                        i = ((iM6981 ^ i8) * 18851) ^ (-769112613);
                        i2 = -1488685427;
                    }
                    int i1110 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i1110;
                    break;
                default:
                    i12 = i12;
                    i3 = s + 14296;
                    if (C3432.m10477() <= 0) {
                        iM6981 = C0630.m2566("ۗ᩹") ^ i9;
                        i = ((iM6981 ^ i8) * 8705) ^ 1728915273;
                        i2 = 226135692;
                    } else {
                        iM6981 = (i8 - C0630.m2566("ܳܰ")) * (-67);
                        i = ((iM6981 ^ i9) * (-6343)) ^ (-1861387492);
                        i2 = 301436461;
                    }
                    int i1111 = i12;
                    i11 = iM6981 ^ i2;
                    i10 = i;
                    i7 = i1111;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m36315() {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15297.m36315():void");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01b0 A[PHI: r4 r5 r6
      0x01b0: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:52:0x014e, B:44:0x0105, B:36:0x00d9, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:52:0x014e, B:44:0x0105, B:36:0x00d9, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r6v3 short) = (r6v2 short), (r6v2 short), (r6v2 short), (r6v5 short) binds: [B:52:0x014e, B:44:0x0105, B:36:0x00d9, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM6981;
        int i;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = -802420466;
        int i6 = C4616.f14690;
        int i7 = C0483.f2088;
        int iM2566 = (C0630.m2566("᩻᩻") ^ i6) * 55;
        int i8 = ((iM2566 ^ i7) * (-6829)) ^ 2052928876;
        int i9 = -438298232;
        while (true) {
            int i10 = iM2566 ^ i9;
            SimpleDateFormat simpleDateFormat = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 32523) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1952654947:
                    case -1270394648:
                        sArr = f46935;
                        c = 0;
                        if (!C2520.m8026()) {
                            iM6981 = (C2105.m6981("᩹֫") ^ i6) * 93;
                            i8 = ((iM6981 ^ i7) * (-29125)) ^ 62194514;
                            i = -1490230224;
                            i10 = iM6981 ^ i;
                        } else {
                            iM2566 = (C0630.m2566("ۡܳ") ^ i6) * 79;
                            i8 = ((iM2566 ^ i7) * (-10137)) ^ (-1458027201);
                            i9 = 921541011;
                        }
                        break;
                    case -1742327318:
                    case 881414408:
                        if (C1420.f5096 <= 0) {
                            iM6981 = C2105.m6981("ۨܰ") ^ i6;
                            i8 = ((iM6981 ^ i7) * (-32481)) ^ (-1269299535);
                            i = -985139335;
                            i10 = iM6981 ^ i;
                        } else {
                            iM2566 = C0630.m2566("ۢܿ") ^ i7;
                            i8 = ((iM2566 ^ i6) * (-20337)) ^ (-230802819);
                            i9 = 545743694;
                        }
                        break;
                    case -1609017457:
                    case 1839196468:
                        if (C4117.f13076 <= 0) {
                            iM2566 = (C0630.m2566("ۡܳ") ^ i6) * 79;
                            i8 = ((iM2566 ^ i7) * (-10137)) ^ (-1458027201);
                            i9 = 921541011;
                        }
                        iM6981 = C2105.m6981("ᩴܿ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 4491) ^ 1926881850;
                        i = 1191599266;
                        i10 = iM6981 ^ i;
                        break;
                    case -1532266466:
                    case 2042662970:
                        if ((s * s2) - i3 <= 0) {
                            iM6981 = C2105.m6981("᩷ۖ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 19371) ^ (-218967574);
                            i = -1513025987;
                        } else {
                            iM6981 = (C2105.m6981("᩷ᩴ") ^ i6) * (-7);
                            i8 = ((iM6981 ^ i7) * (-17103)) ^ 2001622413;
                            i = 1261840343;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -1279171530:
                    case -1017650195:
                        i2 = s + 16562;
                        if (C3746.m11369() >= 0) {
                            iM6981 = C2105.m6981("ᩴܿ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 4491) ^ 1926881850;
                            i = 1191599266;
                        } else {
                            iM6981 = C2105.m6981("ᩳۗ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 15921) ^ (-575933996);
                            i = 1240642873;
                        }
                        i10 = iM6981 ^ i;
                        break;
                    case -1265596031:
                    case -490471878:
                        f46929 = simpleDateFormat;
                        if (!C1504.f5354) {
                            if (ServiceConnectionC3453.f10921 < 0) {
                                f46932 = new StringBuilder(128);
                                return;
                            }
                            iM2566 = (C0630.m2566("ۘ֡") ^ i7) * 7;
                            i8 = ((iM2566 ^ i6) * (-11161)) ^ 708565649;
                            i9 = 1952909234;
                        }
                        iM6981 = C2105.m6981("ᩴܿ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 4491) ^ 1926881850;
                        i = 1191599266;
                        i10 = iM6981 ^ i;
                        break;
                    case -1240994502:
                    case 1948846971:
                        s = sArr[c];
                        if (C11340.f33930 < 0) {
                            iM6981 = (C2105.m6981("ۨܶ") ^ i7) * 85;
                            i8 = ((iM6981 ^ i6) * 26155) ^ 395729472;
                            i = -1525930841;
                            i10 = iM6981 ^ i;
                        } else {
                            iM2566 = (C0630.m2566("ۡܳ") ^ i6) * 79;
                            i8 = ((iM2566 ^ i7) * (-10137)) ^ (-1458027201);
                            i9 = 921541011;
                        }
                        break;
                    case -1144903454:
                    case 122850361:
                        i4 = 37126;
                        iM6981 = C0630.m2566("ۛᩳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 16477) ^ (-640669515);
                        i = -1390851231;
                        i10 = iM6981 ^ i;
                        break;
                    case -984068739:
                    case 5877017:
                        C3683.m11222();
                        throw new RuntimeException();
                    case -792739905:
                    case 2062639873:
                        i4 = 44145;
                        iM6981 = C0630.m2566("ۛᩳ") ^ i7;
                        i8 = ((iM6981 ^ i6) * 16477) ^ (-640669515);
                        i = -1390851231;
                        i10 = iM6981 ^ i;
                        break;
                    case -601681105:
                    case -5969456:
                        C21923.m49329();
                        iM2566 = (C0630.m2566("ۡܳ") ^ i6) * 79;
                        i8 = ((iM2566 ^ i7) * (-10137)) ^ (-1458027201);
                        i9 = 921541011;
                        break;
                    case -469961487:
                    case -257518443:
                        RunnableC1108.m3790();
                        if (C1294.m4372() > 0) {
                            iM2566 = C0630.m2566("ۢܿ") ^ i7;
                            i8 = ((iM2566 ^ i6) * (-20337)) ^ (-230802819);
                            i9 = 545743694;
                        } else {
                            iM2566 = (C0630.m2566("ۡܳ") ^ i6) * 79;
                            i8 = ((iM2566 ^ i7) * (-10137)) ^ (-1458027201);
                            i9 = 921541011;
                        }
                        break;
                    case 1845573696:
                    case 1916466074:
                        short[] sArr2 = f46935;
                        if (C1005.f3721) {
                            if (C1711.m5736() <= 0) {
                                iM2566 = (C0630.m2566("ۡܳ") ^ i6) * 79;
                                i8 = ((iM2566 ^ i7) * (-10137)) ^ (-1458027201);
                                i9 = 921541011;
                                break;
                            } else if (C4159.m12565() >= 0) {
                                iM2566 = C0630.m2566("ۢܿ") ^ i7;
                                i8 = ((iM2566 ^ i6) * (-20337)) ^ (-230802819);
                                i9 = 545743694;
                                break;
                            } else {
                                simpleDateFormat = new SimpleDateFormat(C3245.m9934(sArr2, 1, 12, i4));
                                if (C2520.f8000 < 0) {
                                    iM6981 = C2105.m6981("ۢۡ") ^ i6;
                                    i8 = ((iM6981 ^ i7) * (-21341)) ^ (-1505223729);
                                    i = -1842640002;
                                    i10 = iM6981 ^ i;
                                    break;
                                }
                            }
                        }
                        iM2566 = (C0630.m2566("ۘ֡") ^ i7) * 7;
                        i8 = ((iM2566 ^ i6) * (-11161)) ^ 708565649;
                        i9 = 1952909234;
                        break;
                    default:
                        i3 = i2 * i2;
                        s2 = 66248;
                        if (C1504.f5354) {
                            iM6981 = C2105.m6981("ᩴܿ") ^ i7;
                            i8 = ((iM6981 ^ i6) * 4491) ^ 1926881850;
                            i = 1191599266;
                        } else {
                            iM6981 = C2105.m6981("ۧ֫") ^ i6;
                            i8 = ((iM6981 ^ i7) * 32065) ^ 487428099;
                            i = -2112848518;
                        }
                        i10 = iM6981 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36309(String str) {
        short s = f46935[28];
        int i = (s * s) + 14379264;
        int i2 = s + 3792;
        String strM9250 = C3019.m9250(f46935, 29, 20, (i2 * i2) - (i + i) <= 0 ? 19167 : 30911);
        synchronized (C15297.class) {
            m36310(strM9250, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03db A[PHI: r11 r12 r13
      0x03db: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:99:0x03d9, B:79:0x030f, B:48:0x01c2, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:99:0x03d9, B:79:0x030f, B:48:0x01c2, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x03db: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:99:0x03d9, B:79:0x030f, B:48:0x01c2, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02df A[PHI: r18
      0x02df: PHI (r18v4 short[]) = (r18v3 short[]), (r18v2 short[]) binds: [B:75:0x02dd, B:16:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x034a A[PHI: r19 r20
      0x034a: PHI (r19v3 short) = (r19v2 short), (r19v2 short), (r19v4 short) binds: [B:87:0x0348, B:83:0x032d, B:71:0x02bf] A[DONT_GENERATE, DONT_INLINE]
      0x034a: PHI (r20v3 short) = (r20v2 short), (r20v2 short), (r20v4 short) binds: [B:87:0x0348, B:83:0x032d, B:71:0x02bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x037a  */
    /* JADX WARN: Code duplicated, block: B:96:0x03ab A[PHI: r15 r16 r25
      0x03ab: PHI (r15v5 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int), (r15v2 int) binds: [B:95:0x03a9, B:67:0x029b, B:16:0x0093, B:9:0x006e, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r16v5 int) = (r16v2 int), (r16v3 int), (r16v2 int), (r16v2 int), (r16v2 int) binds: [B:95:0x03a9, B:67:0x029b, B:16:0x0093, B:9:0x006e, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r25v6 int) = (r25v3 int), (r25v4 int), (r25v3 int), (r25v3 int), (r25v3 int) binds: [B:95:0x03a9, B:67:0x029b, B:16:0x0093, B:9:0x006e, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36308(int i, int i2, int i3, String str) {
        int iM2566;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7 = C2167.f7158;
        int i8 = C3432.f10845;
        int iM6981 = C2105.m6981("ܿۖ") ^ i8;
        int i9 = ((iM6981 ^ i7) * (-1405)) ^ (-2054498647);
        StringBuilder sb = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM6981 ^ 951428464;
        char c = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char cM3000 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c2 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        short s = 0;
        short s2 = 0;
        int i22 = 615601500;
        int i23 = 0;
        while (true) {
            i22 = i10 ^ (i9 & (((i22 ^ i7) * (-29917)) >> 31));
            switch (i22) {
                case -2070810100:
                case 18462046:
                    sArr2 = f46935;
                    i17 = 25;
                    i18 = 3;
                    if (C1005.f3721) {
                        iM2566 = (i7 - C0630.m2566("ܽ᩷")) * 25;
                        i4 = ((iM2566 ^ i8) * 30429) ^ (-1714801408);
                        i5 = 1691771976;
                    } else {
                        iM2566 = C2105.m6981("ܶۙ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-24569)) ^ 155071748;
                        i5 = -1870284726;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -2051476829:
                case -576018724:
                    C2105.m6979(sb, c);
                    i16++;
                    iM2566 = (i7 - C2105.m6981("ܿܺ")) * 23;
                    i4 = ((iM2566 ^ i8) * (-6249)) ^ (-502268842);
                    i5 = -1730739568;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1918822097:
                case -795854739:
                    if (C2105.f7037 != 0) {
                        iM2566 = C2105.m6981("ܶۙ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-24569)) ^ 155071748;
                        i5 = -1870284726;
                    } else {
                        iM2566 = C2105.m6981("۠᩷") ^ i8;
                        i4 = ((iM2566 ^ i7) * 24421) ^ (-1392224037);
                        i5 = 794563834;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1816197301:
                case 1057056035:
                    s = sArr[24];
                    s2 = 13253;
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ܳۙ") ^ i7;
                        i4 = ((iM2566 ^ i8) * (-4557)) ^ 790955878;
                        i5 = 579872663;
                    } else {
                        iM2566 = C2105.m6981("ۛܰ") ^ i7;
                        i4 = ((iM2566 ^ i8) * (-26051)) ^ (-1808903777);
                        i5 = -1704832838;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1706516411:
                case 2121130947:
                    if (C0964.f3626 != 0) {
                        iM2566 = (i8 - C2105.m6981("᩺ۗ")) * (-103);
                        i4 = ((iM2566 ^ i7) * 17619) ^ 458994441;
                        i5 = 1067790273;
                    } else {
                        iM2566 = C2105.m6981("ۖ۬") ^ i7;
                        i4 = ((iM2566 ^ i8) * 8947) ^ (-1005363643);
                        i5 = -565697040;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1605016147:
                case 1627417098:
                    if (C22628.f73083 > 0) {
                        iM2566 = (i8 - C2105.m6981("᩺ۗ")) * (-103);
                        i4 = ((iM2566 ^ i7) * 17619) ^ 458994441;
                        i5 = 1067790273;
                    } else {
                        iM2566 = (i7 - C2105.m6981("۫ܳ")) * 11;
                        i4 = ((iM2566 ^ i8) * (-8217)) ^ 471432634;
                        i5 = -2055840167;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1380921287:
                case 1127483177:
                    int i24 = s + s2;
                    i23 = i24 * i24;
                    i19 = s * s;
                    i20 = 175642009;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (i8 - C2105.m6981("᩺ۗ")) * (-103);
                        i4 = ((iM2566 ^ i7) * 17619) ^ 458994441;
                        i5 = 1067790273;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ܿ۟")) * 127;
                        i4 = ((iM2566 ^ i7) * (-19301)) ^ (-192342504);
                        i5 = -2004501857;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1228458600:
                case 510050349:
                    if (i16 < i15) {
                        iM2566 = (C0630.m2566("᩶ۜ") ^ i8) * (-125);
                        i4 = ((iM2566 ^ i7) * 13983) ^ 1428114955;
                        i5 = 372173705;
                    } else {
                        i12 = i21;
                        iM2566 = (C0630.m2566("ܺ۟") ^ i8) * (-67);
                        i4 = ((iM2566 ^ i7) * (-30315)) ^ (-1004232782);
                        i5 = 1553898469;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1148605251:
                case 1115046731:
                    if (cM3000 == '\r') {
                        iM2566 = C2105.m6981("ܳܺ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-18033)) ^ (-956642449);
                        i5 = 1736129633;
                    } else {
                        c2 = cM3000;
                        iM2566 = C2105.m6981("ۗ۠") ^ i7;
                        i4 = ((iM2566 ^ i8) * 9683) ^ 767018692;
                        i5 = -113487242;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -1062943489:
                case 286567030:
                    C0630.m2567(sb, c);
                    i11++;
                    iM2567 = C2105.m6981("ۨ᩻") ^ i7;
                    i9 = ((iM2567 ^ i8) * (-10667)) ^ 309430135;
                    i6 = -22999524;
                    i10 = iM2567 ^ i6;
                    break;
                case -955463492:
                case 1536842981:
                    if (i12 >= i2) {
                        iM2566 = C0630.m2566("ۖۜ") ^ i7;
                        i4 = ((iM2566 ^ i8) * 10275) ^ (-310345490);
                        i5 = 964920721;
                        i10 = iM2566 ^ i5;
                        i9 = i4;
                    } else {
                        iM2567 = C0630.m2566("ܿ۫") ^ i7;
                        i9 = ((iM2567 ^ i8) * 21947) ^ 1248527779;
                        i6 = -867235736;
                        i10 = iM2567 ^ i6;
                    }
                    break;
                case -940892012:
                case 976401872:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ܶۙ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-24569)) ^ 155071748;
                        i5 = -1870284726;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۨ֨")) * (-17);
                        i4 = ((iM2566 ^ i7) * 9145) ^ (-1924618206);
                        i5 = -968227872;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -877782504:
                case 543818937:
                    C0630.m2567(sb, c2);
                    i14++;
                    i12 = i21;
                    iM2566 = (C0630.m2566("ܺ۟") ^ i8) * (-67);
                    i4 = ((iM2566 ^ i7) * (-30315)) ^ (-1004232782);
                    i5 = 1553898469;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -764444370:
                case 164638950:
                    c2 = ' ';
                    iM2566 = C2105.m6981("ۗ۠") ^ i7;
                    i4 = ((iM2566 ^ i8) * 9683) ^ 767018692;
                    i5 = -113487242;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -598955379:
                case 1572189469:
                    i13 = 8031;
                    iM2566 = C0630.m2566("ۛ۠") ^ i8;
                    i4 = ((iM2566 ^ i7) * (-15767)) ^ 753337491;
                    i5 = -1886459804;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -522857615:
                case 310014407:
                    C2105.m6979(sb, '\n');
                    break;
                case -447990649:
                case -26378934:
                    i15 = 4 - (i14 % 4);
                    i16 = 0;
                    iM2566 = (i7 - C2105.m6981("ܿܺ")) * 23;
                    i4 = ((iM2566 ^ i8) * (-6249)) ^ (-502268842);
                    i5 = -1730739568;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -411970767:
                case 549157276:
                    C0422.m1963();
                    break;
                case -70890057:
                case 1029602889:
                    C0050.m940();
                    if (C2958.f9394 < 0) {
                        iM2566 = (i8 - C2105.m6981("᩺ۗ")) * (-103);
                        i4 = ((iM2566 ^ i7) * 17619) ^ 458994441;
                        i5 = 1067790273;
                    } else {
                        iM2566 = C2105.m6981("ܶۙ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-24569)) ^ 155071748;
                        i5 = -1870284726;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case -42473156:
                case 2096212244:
                    if (C2958.f9394 >= 0) {
                        iM2566 = C0630.m2566("ܳۙ") ^ i7;
                        i4 = ((iM2566 ^ i8) * (-4557)) ^ 790955878;
                        i5 = 579872663;
                    } else {
                        iM2566 = C2105.m6981("ۖ᩺") ^ i7;
                        i4 = ((iM2566 ^ i8) * (-9479)) ^ (-1975678626);
                        i5 = -479930478;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 119436032:
                case 1267005773:
                    if (C1916.f6442) {
                        iM2566 = (i8 - C2105.m6981("ᩳ᩵")) * (-11);
                        i4 = ((iM2566 ^ i7) * 21345) ^ 2034626216;
                        i5 = 2089197019;
                    } else {
                        iM2566 = C0630.m2566("᩹ۙ") ^ i7;
                        i4 = ((iM2566 ^ i8) * 29093) ^ 404918059;
                        i5 = -101790150;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 266947070:
                case 630260993:
                    C0050.m940();
                    if (C1294.f4556 < 0) {
                        iM2566 = C0630.m2566("᩹ۙ") ^ i7;
                        i4 = ((iM2566 ^ i8) * 29093) ^ 404918059;
                        i5 = -101790150;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩸") ^ i7;
                        i4 = ((iM2566 ^ i8) * 31365) ^ 213081426;
                        i5 = 2030241588;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 340467401:
                case 1516899229:
                    i13 = 15587;
                    iM2566 = C0630.m2566("ۛ۠") ^ i8;
                    i4 = ((iM2566 ^ i7) * (-15767)) ^ 753337491;
                    i5 = -1886459804;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 353985474:
                case 1359412887:
                    i21 = i12 + 1;
                    cM3000 = C0798.m3000(str, i12);
                    if (cM3000 == '\t') {
                        iM2566 = C0630.m2566("᩵ܰ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-6235)) ^ 1296583684;
                        i5 = 1348162804;
                        i10 = iM2566 ^ i5;
                        i9 = i4;
                    } else {
                        iM2567 = (C2105.m6981("ۤ᩷") ^ i8) * 23;
                        i9 = ((iM2567 ^ i7) * (-26149)) ^ 1417807743;
                        i6 = 112009478;
                        i10 = iM2567 ^ i6;
                    }
                    break;
                case 411491604:
                case 1073646072:
                    sArr = f46935;
                    if (C2105.f7037 != 0) {
                        iM2566 = (i7 - C2105.m6981("۫ܳ")) * 11;
                        i4 = ((iM2566 ^ i8) * (-8217)) ^ 471432634;
                        i5 = -2055840167;
                    } else {
                        iM2566 = C0630.m2566("ܶܰ") ^ i8;
                        i4 = ((iM2566 ^ i7) * (-5599)) ^ (-386100644);
                        i5 = -1978279759;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 431579346:
                case 1150954356:
                    RunnableC0588.m2441();
                    iM2566 = C0630.m2566("᩹ۙ") ^ i7;
                    i4 = ((iM2566 ^ i8) * 29093) ^ 404918059;
                    i5 = -101790150;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 586256639:
                case 670528169:
                    sb = f46932;
                    if (i11 < i3) {
                        int iM6982 = (C2105.m6981("ܽۙ") ^ i8) * (-7);
                        i9 = ((iM6982 ^ i7) * (-12639)) ^ (-959412197);
                        i10 = iM6982 ^ (-859168885);
                    } else {
                        int iM6983 = (i8 - C2105.m6981("ۙ᩶")) * 109;
                        i10 = iM6983 ^ (-1646994557);
                        i9 = ((iM6983 ^ i7) * (-15493)) ^ 528421985;
                    }
                    c = ' ';
                    break;
                case 983197737:
                case 2120761689:
                    i11 = 0;
                    iM2567 = C2105.m6981("ۨ᩻") ^ i7;
                    i9 = ((iM2567 ^ i8) * (-10667)) ^ 309430135;
                    i6 = -22999524;
                    i10 = iM2567 ^ i6;
                    break;
                case 1107494037:
                case 1545853639:
                    int i25 = i19 + i20;
                    if ((i25 + i25) - i23 < 0) {
                        iM2566 = (C0630.m2566("ۖۢ") ^ i7) * (-47);
                        i4 = ((iM2566 ^ i8) * (-10261)) ^ 1299908706;
                        i5 = 1129054359;
                    } else {
                        iM2566 = (C2105.m6981("۫᩵") ^ i7) * 7;
                        i4 = ((iM2566 ^ i8) * (-3753)) ^ 1797138036;
                        i5 = 756138777;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 1153625765:
                case 1299925077:
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ܳۙ") ^ i7;
                        i4 = ((iM2566 ^ i8) * (-4557)) ^ 790955878;
                        i5 = 579872663;
                    } else {
                        iM2566 = C2105.m6981("᩹ۨ") ^ i7;
                        i4 = ((iM2566 ^ i8) * 17523) ^ (-1511407141);
                        i5 = -1515970883;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                case 1569543204:
                case 2017955984:
                    C3245.m9923(sb, C21923.m49334(sArr2, i17, i18, i13));
                    i14 = 0;
                    i12 = i;
                    iM2566 = (C0630.m2566("ܺ۟") ^ i8) * (-67);
                    i4 = ((iM2566 ^ i7) * (-30315)) ^ (-1004232782);
                    i5 = 1553898469;
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
                default:
                    C3245.m9925();
                    if (C7811.f24123 < 0) {
                        iM2566 = C0630.m2566("᩹ۙ") ^ i7;
                        i4 = ((iM2566 ^ i8) * 29093) ^ 404918059;
                        i5 = -101790150;
                    } else {
                        iM2566 = (i8 - C2105.m6981("᩺ۗ")) * (-103);
                        i4 = ((iM2566 ^ i7) * 17619) ^ 458994441;
                        i5 = 1067790273;
                    }
                    i10 = iM2566 ^ i5;
                    i9 = i4;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0c0a A[PHI: r3 r4 r5 r6 r7 r8 r10 r14 r15 r21 r22 r23 r24 r27 r29 r30 r34 r38 r39 r40 r41
      0x0c0a: PHI (r3v8 short[]) = (r3v7 short[]), (r3v9 short[]) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r4v4 int) = (r4v3 int), (r4v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r5v4 short[]) = (r5v3 short[]), (r5v5 short[]) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r7v4 char) = (r7v3 char), (r7v5 char) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r8v4 int) = (r8v3 int), (r8v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v5 java.lang.String) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r14v4 int) = (r14v3 int), (r14v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r15v4 int) = (r15v3 int), (r15v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r21v4 int) = (r21v3 int), (r21v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r22v3 short[]) = (r22v2 short[]), (r22v1 short[]) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r23v2 short) = (r23v1 short), (r23v3 short) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r24v2 short) = (r24v1 short), (r24v3 short) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r27v4 int) = (r27v3 int), (r27v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r29v4 int) = (r29v3 int), (r29v5 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r30v3 java.lang.StackTraceElement) = (r30v2 java.lang.StackTraceElement), (r30v4 java.lang.StackTraceElement) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r34v4 java.lang.String) = (r34v3 java.lang.String), (r34v5 java.lang.String) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r38v8 short[]) = (r38v7 short[]), (r38v9 short[]) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r39v1 java.lang.String) = (r39v0 java.lang.String), (r39v2 java.lang.String) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r40v3 int) = (r40v2 int), (r40v4 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]
      0x0c0a: PHI (r41v1 int) = (r41v0 int), (r41v2 int) binds: [B:154:0x0c08, B:150:0x0bc6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36311(String str, String str2, Throwable th) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        String str3;
        int i5;
        short[] sArr;
        String str4;
        int i6;
        int i7;
        short[] sArr2;
        int i8;
        int i9;
        String str5;
        StackTraceElement stackTraceElement;
        int i10;
        char c;
        StackTraceElement stackTraceElement2;
        int iM2567;
        int i11;
        StackTraceElement stackTraceElement3;
        int i12;
        int i13;
        char c2;
        int i14;
        int length;
        String str6;
        int i15;
        int i16;
        int i17;
        short[] sArr3;
        char c3;
        short[] sArr4;
        int i18;
        int i19;
        String str7;
        String str8;
        int i20;
        int i21;
        int i22;
        short[] sArr5;
        StackTraceElement stackTraceElement4;
        int iM6982;
        int i23;
        int i24;
        int iM2568;
        int i25;
        int i26;
        short[] sArr6;
        StackTraceElement stackTraceElement5;
        char c4;
        short[] sArr7;
        int i27;
        String strM9250;
        StackTraceElement stackTraceElement6;
        String str9;
        char c5;
        StackTraceElement stackTraceElement7;
        String str10;
        int i28;
        int i29;
        short[] sArr8;
        int i30;
        String str11;
        String str12;
        int i31;
        int i32;
        int i33;
        short[] sArr9;
        int iM6983;
        int i34;
        int i35;
        int iM6984;
        int i36;
        int i37;
        short[] sArr10;
        int i38;
        String str13;
        String str14;
        int i39;
        int i40;
        int i41;
        String str15;
        short[] sArr11;
        int i42;
        int i43;
        int i44;
        short[] sArr12 = null;
        short s = 0;
        short s2 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = -826980392;
        int i49 = C0422.f1886;
        int i50 = C1128.f4106;
        int iM2569 = C0630.m2566("֫ۧ") ^ i50;
        int i51 = ((iM2569 ^ i49) * 8371) ^ (-760280049);
        int i52 = iM2569 ^ 2029161596;
        Set setNewSetFromMap = null;
        StackTraceElement stackTraceElement8 = null;
        String str16 = null;
        String strM9934 = null;
        String strM3789 = null;
        short[] sArr13 = null;
        int i53 = 0;
        int i54 = 0;
        StringBuilder sb = null;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        boolean z = false;
        int i58 = 0;
        char c6 = 0;
        int i59 = 0;
        int iM3007 = 0;
        Throwable[] thArr = null;
        String strM7507 = null;
        int length2 = 0;
        Throwable th2 = null;
        Throwable thM2811 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        int i60 = 0;
        StackTraceElement[] stackTraceElementArr = null;
        String str17 = null;
        while (true) {
            i48 = i52 ^ (i51 & (((i48 ^ i49) * (-157)) >> 31));
            switch (i48) {
                case -2114313955:
                case 497232408:
                    if (!AbstractC2021.m6574()) {
                        iM2566 = C2105.m6981("ۖܶ") ^ i50;
                        i = ((iM2566 ^ i49) * (-17437)) ^ (-1324079798);
                        i2 = -2137845563;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    } else {
                        strM3789 = strM3789;
                        i55 = i55;
                        i57 = i57;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        str17 = str17;
                        i54 = i54;
                        length2 = length2;
                        i58 = i58;
                        i47 = i47;
                        sArr15 = sArr15;
                        i59 = i59;
                        iM3007 = iM3007;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c6 = c6;
                        i60 = i60;
                        i53 = i53;
                        iM6981 = (C2105.m6981("ۤ۫") ^ i50) * (-121);
                        i51 = ((iM6981 ^ i49) * 19533) ^ 1655457084;
                        i3 = -148291767;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case -2099516850:
                case -1144143870:
                    i59++;
                    length = i58;
                    c2 = c6;
                    i14 = iM3007;
                    strM3789 = strM3789;
                    int iM25610 = C0630.m2566("᩶ۚ") ^ i49;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str17;
                    i54 = i54;
                    i53 = i53;
                    str16 = str16;
                    i55 = i55;
                    i57 = i57;
                    c6 = c2;
                    iM3007 = i14;
                    stackTraceElement8 = stackTraceElement8;
                    i58 = length;
                    length2 = length2;
                    sArr14 = sArr14;
                    i51 = ((iM25610 ^ i50) * 7569) ^ 1220166671;
                    i52 = iM25610 ^ (-317764245);
                    strM3789 = strM3789;
                    sArr13 = sArr13;
                    break;
                case -2091381830:
                case 159292612:
                    stackTraceElement2 = stackTraceElement8;
                    z = false;
                    iM2567 = (i50 - C0630.m2566("ۜۤ")) * 101;
                    i51 = ((iM2567 ^ i49) * (-22995)) ^ 1886459448;
                    i11 = -241274416;
                    int i61 = iM2567 ^ i11;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    i53 = i53;
                    str16 = str16;
                    sArr14 = sArr14;
                    i55 = i55;
                    i52 = i61;
                    c6 = c6;
                    iM3007 = iM3007;
                    i58 = i58;
                    stackTraceElement8 = stackTraceElement2;
                    strM3789 = strM3789;
                    sArr13 = sArr13;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case -2011706323:
                case 1172510716:
                    C1711.m5736();
                    break;
                case -1965879724:
                case 1701989436:
                    stackTraceElement6 = stackTraceElement8;
                    str9 = str17;
                    C1420.m4905(sb, str9);
                    C1128.m3845(sb, stackTraceElement6);
                    c5 = c6;
                    C0630.m2567(sb, c5);
                    int iM6985 = (i50 - C2105.m6981("ᩳܳ")) * 19;
                    sArr13 = sArr13;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str9;
                    i54 = i54;
                    str16 = str16;
                    i55 = i55;
                    i57 = i57;
                    iM3007 = iM3007;
                    strM3789 = strM3789;
                    StackTraceElement stackTraceElement9 = stackTraceElement6;
                    i51 = ((iM6985 ^ i49) * 30249) ^ (-951685587);
                    i53 = i53;
                    c6 = c5;
                    stackTraceElement8 = stackTraceElement9;
                    sArr10 = sArr14;
                    i52 = iM6985 ^ 440594554;
                    length2 = length2;
                    sArr14 = sArr10;
                    break;
                case -1958869180:
                case 835129959:
                    ViewOnClickListenerC1958.m6429();
                    if (RunnableC3474.f10992 <= 0) {
                        str13 = strM3789;
                        stackTraceElement3 = stackTraceElement8;
                        sArr11 = sArr14;
                        i41 = iM3007;
                        str15 = str16;
                        i40 = length2;
                        i42 = i55;
                        str14 = str17;
                        i43 = i57;
                        i39 = i54;
                        int iM25611 = (C0630.m2566("ۙܺ") + i49) * 45;
                        i12 = ((iM25611 ^ i50) * (-14947)) ^ (-1909349887);
                        i52 = iM25611 ^ 1629613475;
                        i54 = i39;
                        length2 = i40;
                        sArr14 = sArr11;
                        i57 = i43;
                        str17 = str14;
                        i55 = i42;
                        str16 = str15;
                        iM3007 = i41;
                        strM3789 = str13;
                        int i62 = i12;
                        stackTraceElement8 = stackTraceElement3;
                        i51 = i62;
                    } else {
                        iM2566 = (i49 - C0630.m2566("ۜᩴ")) * (-117);
                        i = ((iM2566 ^ i50) * 4893) ^ (-1474765446);
                        i2 = -2126213989;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    }
                    break;
                case -1948756810:
                case -350910488:
                    str6 = strM3789;
                    StackTraceElement stackTraceElement10 = stackTraceElement8;
                    i16 = i55;
                    i17 = i57;
                    sArr3 = sArr14;
                    i18 = iM3007;
                    str7 = str16;
                    str8 = str17;
                    i20 = i54;
                    length2 = length2;
                    if (i53 >= i18) {
                        c3 = c6;
                        sArr4 = sArr13;
                        i21 = i47;
                        i22 = i60;
                        sArr5 = sArr15;
                        i19 = i53;
                        stackTraceElement4 = stackTraceElement10;
                        iM6982 = C2105.m6981("ۙۖ") ^ i50;
                        i23 = ((iM6982 ^ i49) * 10557) ^ (-1333888612);
                        i24 = 108161949;
                        int i63 = iM6982 ^ i24;
                        sArr13 = sArr4;
                        i60 = i22;
                        sArr15 = sArr5;
                        i47 = i21;
                        str17 = str8;
                        i54 = i20;
                        str16 = str7;
                        i55 = i16;
                        i57 = i17;
                        iM3007 = i18;
                        strM3789 = str6;
                        char c7 = c3;
                        stackTraceElement8 = stackTraceElement4;
                        i53 = i19;
                        c6 = c7;
                        sArr10 = sArr3;
                        i52 = i63;
                        i51 = i23;
                        length2 = length2;
                        sArr14 = sArr10;
                    } else {
                        int iM6986 = C2105.m6981("֡ۧ") ^ i50;
                        int i64 = ((iM6986 ^ i49) * 2541) ^ (-536996899);
                        i38 = iM6986 ^ (-689102238);
                        stackTraceElement8 = stackTraceElement10;
                        i51 = i64;
                        str17 = str8;
                        i54 = i20;
                        length2 = length2;
                        str16 = str7;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        iM3007 = i18;
                        i52 = i38;
                        strM3789 = str6;
                    }
                    break;
                case -1910542506:
                case -548223909:
                    C2958.m9034();
                    if (C21923.f70183 == 0) {
                        str6 = strM3789;
                        stackTraceElement5 = stackTraceElement8;
                        i16 = i55;
                        i17 = i57;
                        sArr3 = sArr14;
                        i18 = iM3007;
                        str7 = str16;
                        str8 = str17;
                        i20 = i54;
                        length2 = length2;
                        sArr7 = sArr15;
                        iM6984 = (C0630.m2566("ܰܶ") + i49) * (-119);
                        i36 = ((iM6984 ^ i50) * (-32299)) ^ 2084493;
                        i37 = 1386937058;
                        i38 = iM6984 ^ i37;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = i36;
                        sArr15 = sArr7;
                        str17 = str8;
                        i54 = i20;
                        length2 = length2;
                        str16 = str7;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        iM3007 = i18;
                        i52 = i38;
                        strM3789 = str6;
                    } else {
                        iM2566 = (i49 - C0630.m2566("ۜᩴ")) * (-117);
                        i = ((iM2566 ^ i50) * 4893) ^ (-1474765446);
                        i2 = -2126213989;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    }
                    break;
                case -1877457802:
                case -67728488:
                    if (C4117.m12362(strM3789, C1711.m5733(str16, i53)) == -1) {
                        iM2566 = C0630.m2566("۠ۤ") ^ i49;
                        i = ((iM2566 ^ i50) * 24645) ^ 558938208;
                        i2 = 716779543;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    } else {
                        stackTraceElement6 = stackTraceElement8;
                        c5 = c6;
                        str9 = str17;
                        int iM6987 = (i50 - C2105.m6981("ᩳܳ")) * 19;
                        sArr13 = sArr13;
                        i60 = i60;
                        sArr15 = sArr15;
                        i47 = i47;
                        str17 = str9;
                        i54 = i54;
                        str16 = str16;
                        i55 = i55;
                        i57 = i57;
                        iM3007 = iM3007;
                        strM3789 = strM3789;
                        StackTraceElement stackTraceElement11 = stackTraceElement6;
                        i51 = ((iM6987 ^ i49) * 30249) ^ (-951685587);
                        i53 = i53;
                        c6 = c5;
                        stackTraceElement8 = stackTraceElement11;
                        sArr10 = sArr14;
                        i52 = iM6987 ^ 440594554;
                        length2 = length2;
                        sArr14 = sArr10;
                    }
                    break;
                case -1772011741:
                case 387116359:
                    String strM19110 = C7106.m19110(sArr14, i55, i57, i56);
                    strM3789 = strM3789;
                    i30 = iM3007;
                    str11 = str16;
                    i28 = i55;
                    str12 = str17;
                    i29 = i57;
                    i31 = i54;
                    stackTraceElement7 = stackTraceElement8;
                    sArr14 = sArr14;
                    length2 = length2;
                    m36312(thM2811, sb, stackTraceElementArr, strM19110, "", setNewSetFromMap);
                    sArr8 = sArr13;
                    i32 = i47;
                    i33 = i60;
                    sArr9 = sArr15;
                    iM6983 = C0630.m2566("ܽۚ") ^ i49;
                    i34 = ((iM6983 ^ i50) * (-18827)) ^ (-508659793);
                    i35 = -969509166;
                    i44 = iM6983 ^ i35;
                    sArr13 = sArr8;
                    i60 = i33;
                    sArr15 = sArr9;
                    i47 = i32;
                    str17 = str12;
                    i54 = i31;
                    str16 = str11;
                    i55 = i28;
                    i57 = i29;
                    iM3007 = i30;
                    strM3789 = strM3789;
                    int i65 = i44;
                    stackTraceElement8 = stackTraceElement7;
                    i51 = i34;
                    length2 = length2;
                    sArr14 = sArr14;
                    i52 = i65;
                    break;
                case -1562728590:
                case 10531193:
                    C3663.m11168();
                    if (!AbstractC2021.m6574()) {
                        strM3789 = strM3789;
                        i55 = i55;
                        i57 = i57;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        str17 = str17;
                        i54 = i54;
                        length2 = length2;
                        i58 = i58;
                        i47 = i47;
                        i59 = i59;
                        iM3007 = iM3007;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c6 = c6;
                        i60 = i60;
                        i53 = i53;
                        int iM25612 = (i50 - C0630.m2566("ܽ᩵")) * (-117);
                        i51 = ((iM25612 ^ i49) * (-3207)) ^ 1977819741;
                        i13 = iM25612 ^ 1267675418;
                        i60 = i60;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    iM6981 = (C2105.m6981("ۤ۫") ^ i50) * (-121);
                    i51 = ((iM6981 ^ i49) * 19533) ^ 1655457084;
                    i3 = -148291767;
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case -1436679024:
                case 1202372037:
                    c2 = c6;
                    i14 = iM3007;
                    C3746.m11367(sb, th);
                    C0630.m2567(sb, c2);
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    i59 = 0;
                    stackTraceElementArr = stackTrace;
                    length = stackTrace.length;
                    int iM25613 = C0630.m2566("᩶ۚ") ^ i49;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str17;
                    i54 = i54;
                    i53 = i53;
                    str16 = str16;
                    i55 = i55;
                    i57 = i57;
                    c6 = c2;
                    iM3007 = i14;
                    stackTraceElement8 = stackTraceElement8;
                    i58 = length;
                    length2 = length2;
                    sArr14 = sArr14;
                    i51 = ((iM25613 ^ i50) * 7569) ^ 1220166671;
                    i52 = iM25613 ^ (-317764245);
                    strM3789 = strM3789;
                    sArr13 = sArr13;
                    break;
                case -1418503361:
                case 1327524118:
                    String str18 = strM3789;
                    StackTraceElement stackTraceElement12 = stackTraceElement8;
                    int i66 = i55;
                    int i67 = i57;
                    short[] sArr16 = sArr14;
                    char c8 = c6;
                    short[] sArr17 = sArr13;
                    int i68 = iM3007;
                    int i69 = i53;
                    String str19 = str16;
                    String str20 = str17;
                    int i70 = i54;
                    length2 = length2;
                    int i71 = i47;
                    int i72 = i60;
                    short[] sArr18 = sArr15;
                    if (i70 < length2) {
                        iM2568 = (C2105.m6981("ᩴ᩸") ^ i50) * 53;
                        i25 = ((iM2568 ^ i49) * (-5203)) ^ (-1936846944);
                        i26 = -732484808;
                    } else {
                        iM2568 = (C0630.m2566("֫ܺ") + i49) * (-69);
                        i25 = ((iM2568 ^ i50) * 29341) ^ 301507739;
                        i26 = 1108889383;
                    }
                    int i73 = iM2568 ^ i26;
                    sArr13 = sArr17;
                    i60 = i72;
                    sArr15 = sArr18;
                    i47 = i71;
                    str17 = str20;
                    i54 = i70;
                    str16 = str19;
                    i55 = i66;
                    i57 = i67;
                    iM3007 = i68;
                    strM3789 = str18;
                    sArr6 = sArr16;
                    i52 = i73;
                    i53 = i69;
                    c6 = c8;
                    stackTraceElement8 = stackTraceElement12;
                    i51 = i25;
                    length2 = length2;
                    sArr14 = sArr6;
                    break;
                case -1358670324:
                case 1163422101:
                    i56 = 39434;
                    iM6981 = (i49 - C0630.m2566("ۘۖ")) * (-115);
                    i51 = ((iM6981 ^ i50) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ 1836396329;
                    i3 = 404291373;
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case -1102334928:
                case 1709708334:
                    str3 = strM3789;
                    i5 = i55;
                    i57 = i57;
                    sArr = sArr14;
                    sArr13 = sArr13;
                    str4 = str17;
                    i54 = i54;
                    i6 = length2;
                    i7 = i58;
                    i47 = i47;
                    sArr2 = sArr15;
                    i8 = i59;
                    i9 = iM3007;
                    str5 = str16;
                    stackTraceElement = stackTraceElement8;
                    char c9 = c6;
                    i10 = i60;
                    i4 = i53;
                    C1420.m4905(sb, str2);
                    C2105.m6979(sb, c9);
                    c = c9;
                    int iM6988 = C2105.m6981("ۗ᩵") ^ i50;
                    i60 = i10;
                    sArr15 = sArr2;
                    i59 = i8;
                    str17 = str4;
                    length2 = i6;
                    str16 = str5;
                    sArr14 = sArr;
                    strM3789 = str3;
                    i55 = i5;
                    i52 = iM6988 ^ 732581576;
                    i51 = ((iM6988 ^ i49) * 13197) ^ 431644980;
                    iM3007 = i9;
                    i58 = i7;
                    stackTraceElement8 = stackTraceElement;
                    sArr13 = sArr13;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    int i74 = i4;
                    c6 = c;
                    i53 = i74;
                    break;
                case -1085470307:
                case 274007940:
                    str6 = strM3789;
                    stackTraceElement5 = stackTraceElement8;
                    i16 = i55;
                    i17 = i57;
                    sArr3 = sArr14;
                    i18 = iM3007;
                    str7 = str16;
                    str8 = str17;
                    i20 = i54;
                    length2 = length2;
                    sArr7 = sArr15;
                    th2 = thArr[i20];
                    sArr13 = f46935;
                    i60 = 58;
                    i47 = 12;
                    if (!C1005.f3721) {
                        c4 = c6;
                        i27 = i53;
                        strM9250 = str8;
                        int iM6989 = C2105.m6981("۟᩷") ^ i49;
                        sArr15 = sArr7;
                        i54 = i20;
                        length2 = length2;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        str17 = strM9250;
                        i52 = iM6989 ^ (-963068535);
                        i53 = i27;
                        c6 = c4;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = ((iM6989 ^ i50) * (-22071)) ^ 1113460368;
                        str16 = str7;
                        iM3007 = i18;
                        strM3789 = str6;
                    } else {
                        iM6984 = (C2105.m6981("۬᩻") ^ i50) * (-107);
                        i36 = ((iM6984 ^ i49) * (-10767)) ^ 1030686444;
                        i37 = 387919226;
                        i38 = iM6984 ^ i37;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = i36;
                        sArr15 = sArr7;
                        str17 = str8;
                        i54 = i20;
                        length2 = length2;
                        str16 = str7;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        iM3007 = i18;
                        i52 = i38;
                        strM3789 = str6;
                    }
                    break;
                case -889918792:
                case -688093611:
                    i56 = 15773;
                    iM6981 = (i49 - C0630.m2566("ۘۖ")) * (-115);
                    i51 = ((iM6981 ^ i50) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ 1836396329;
                    i3 = 404291373;
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case -693388918:
                case 2078655754:
                    i4 = i53;
                    str3 = strM3789;
                    i5 = i55;
                    i57 = i57;
                    sArr = sArr14;
                    sArr13 = sArr13;
                    str4 = str17;
                    i54 = i54;
                    i6 = length2;
                    i7 = i58;
                    i47 = i47;
                    sArr2 = sArr15;
                    i8 = i59;
                    i9 = iM3007;
                    str5 = str16;
                    stackTraceElement = stackTraceElement8;
                    i10 = i60;
                    sb = new StringBuilder();
                    c = '\n';
                    if (str2 == null) {
                        int iM69810 = C2105.m6981("ۗ᩵") ^ i50;
                        i60 = i10;
                        sArr15 = sArr2;
                        i59 = i8;
                        str17 = str4;
                        length2 = i6;
                        str16 = str5;
                        sArr14 = sArr;
                        strM3789 = str3;
                        i55 = i5;
                        i52 = iM69810 ^ 732581576;
                        i51 = ((iM69810 ^ i49) * 13197) ^ 431644980;
                        iM3007 = i9;
                        i58 = i7;
                        stackTraceElement8 = stackTraceElement;
                        sArr13 = sArr13;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                        int i75 = i4;
                        c6 = c;
                        i53 = i75;
                    } else {
                        int iM69811 = C2105.m6981("ᩳܽ") ^ i50;
                        i60 = i10;
                        sArr15 = sArr2;
                        i59 = i8;
                        str17 = str4;
                        length2 = i6;
                        i53 = i4;
                        str16 = str5;
                        sArr14 = sArr;
                        strM3789 = str3;
                        i55 = i5;
                        c6 = '\n';
                        i52 = iM69811 ^ (-1228109614);
                        i51 = ((iM69811 ^ i49) * 23967) ^ 1182483683;
                        iM3007 = i9;
                        i58 = i7;
                        stackTraceElement8 = stackTraceElement;
                        sArr13 = sArr13;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case -691397204:
                case 376468751:
                    Throwable[] suppressed = th.getSuppressed();
                    length2 = suppressed.length;
                    i15 = 0;
                    thArr = suppressed;
                    int iM25614 = (C0630.m2566("۠ܶ") + i49) * 101;
                    int i76 = ((iM25614 ^ i50) * (-15785)) ^ 1945268868;
                    sArr13 = sArr13;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str17;
                    i54 = i15;
                    str16 = str16;
                    i55 = i55;
                    i57 = i57;
                    iM3007 = iM3007;
                    strM3789 = strM3789;
                    sArr6 = sArr14;
                    i52 = iM25614 ^ (-1710738363);
                    i53 = i53;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i51 = i76;
                    sArr14 = sArr6;
                    break;
                case -615550300:
                case 37231585:
                    strM3789 = strM3789;
                    StackTraceElement stackTraceElement13 = stackTraceElement8;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    c6 = c6;
                    sArr13 = sArr13;
                    i53 = i53;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    i60 = i60;
                    if (!(th instanceof C1637)) {
                        iM2567 = C0630.m2566("۟ۜ") ^ i50;
                        stackTraceElement2 = stackTraceElement13;
                        i51 = ((iM2567 ^ i49) * (-19745)) ^ 277109511;
                        i11 = 1242198288;
                        int i610 = iM2567 ^ i11;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        i53 = i53;
                        str16 = str16;
                        sArr14 = sArr14;
                        i55 = i55;
                        i52 = i610;
                        c6 = c6;
                        iM3007 = iM3007;
                        i58 = i58;
                        stackTraceElement8 = stackTraceElement2;
                        strM3789 = strM3789;
                        sArr13 = sArr13;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    } else {
                        stackTraceElement8 = stackTraceElement13;
                        iM6981 = (C0630.m2566("ۜۖ") + i49) * (-87);
                        i51 = ((iM6981 ^ i50) * 26241) ^ 2068526085;
                        i3 = -1900070665;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case -563506996:
                case 649487634:
                    strM3789 = RunnableC1108.m3789(f46935, 82, 18, i56);
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (C2105.m6981("۟᩹") + i49) * (-31);
                        i = ((iM2566 ^ i50) * (-7155)) ^ (-962640551);
                        i2 = 1803396973;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    } else {
                        str6 = strM3789;
                        stackTraceElement5 = stackTraceElement8;
                        i16 = i55;
                        i17 = i57;
                        sArr3 = sArr14;
                        c4 = c6;
                        i18 = iM3007;
                        i27 = i53;
                        str7 = str16;
                        strM9250 = str17;
                        i20 = i54;
                        length2 = length2;
                        sArr7 = sArr15;
                        int iM69812 = C2105.m6981("۟᩷") ^ i49;
                        sArr15 = sArr7;
                        i54 = i20;
                        length2 = length2;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        str17 = strM9250;
                        i52 = iM69812 ^ (-963068535);
                        i53 = i27;
                        c6 = c4;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = ((iM69812 ^ i50) * (-22071)) ^ 1113460368;
                        str16 = str7;
                        iM3007 = i18;
                        strM3789 = str6;
                    }
                    break;
                case -562884112:
                case 1752807833:
                    ViewOnClickListenerC1958.m6429();
                    if (!RunnableC1108.f4040) {
                        strM3789 = strM3789;
                        i55 = i55;
                        i57 = i57;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        str17 = str17;
                        i54 = i54;
                        length2 = length2;
                        i58 = i58;
                        i47 = i47;
                        sArr15 = sArr15;
                        i59 = i59;
                        iM3007 = iM3007;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c6 = c6;
                        i60 = i60;
                        i53 = i53;
                        iM6981 = (C2105.m6981("ۤ۫") ^ i50) * (-121);
                        i51 = ((iM6981 ^ i49) * 19533) ^ 1655457084;
                        i3 = -148291767;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    } else {
                        iM2566 = C0630.m2566("᩸֡") ^ i50;
                        i = ((iM2566 ^ i49) * 18299) ^ (-1440956755);
                        i2 = -673842758;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    }
                    break;
                case -555887890:
                case 47367109:
                    m36310(str, C0050.m947(sb));
                    break;
                case -169396914:
                case 716128124:
                    str6 = strM3789;
                    StackTraceElement stackTraceElement14 = stackTraceElement8;
                    int i77 = i55;
                    int i78 = i57;
                    short[] sArr19 = sArr14;
                    char c10 = c6;
                    short[] sArr20 = sArr13;
                    int i79 = iM3007;
                    int i80 = i53;
                    String str21 = str16;
                    String str22 = str17;
                    int i81 = i54;
                    int i82 = length2;
                    int i83 = i58;
                    int i84 = i47;
                    int i85 = i60;
                    short[] sArr21 = sArr15;
                    int i86 = i59;
                    if (i86 < i83) {
                        int iM25615 = (C0630.m2566("᩸ۨ") + i49) * 79;
                        int i87 = ((iM25615 ^ i50) * (-18765)) ^ 2144756549;
                        i60 = i85;
                        sArr15 = sArr21;
                        i47 = i84;
                        i59 = i86;
                        str17 = str22;
                        i54 = i81;
                        length2 = i82;
                        str16 = str21;
                        sArr14 = sArr19;
                        i55 = i77;
                        i57 = i78;
                        iM3007 = i79;
                        i52 = iM25615 ^ (-833897170);
                        i58 = i83;
                        strM3789 = str6;
                        sArr13 = sArr20;
                        i51 = i87;
                        i53 = i80;
                        c6 = c10;
                        stackTraceElement8 = stackTraceElement14;
                    } else {
                        int iM69813 = (i50 - C2105.m6981("᩶ܽ")) * 39;
                        int i88 = ((iM69813 ^ i49) * 7489) ^ (-1611247931);
                        i60 = i85;
                        sArr15 = sArr21;
                        i47 = i84;
                        i59 = i86;
                        str17 = str22;
                        i54 = i81;
                        length2 = i82;
                        str16 = str21;
                        sArr14 = sArr19;
                        i55 = i77;
                        i57 = i78;
                        i52 = iM69813 ^ 1575971048;
                        iM3007 = i79;
                        i53 = i80;
                        i58 = i83;
                        sArr13 = sArr20;
                        c6 = c10;
                        stackTraceElement8 = stackTraceElement14;
                        i51 = i88;
                        strM3789 = str6;
                    }
                    break;
                case -87197193:
                case 1735653289:
                    strM3789 = strM3789;
                    stackTraceElement3 = stackTraceElement8;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    int i89 = iM3007;
                    str16 = str16;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i47 = i47;
                    i60 = i60;
                    strM7507 = C2272.m7507(sArr13, i60, i47, i56);
                    sArr15 = f46935;
                    if (C1420.f5096 > 0) {
                        int iM25616 = C0630.m2566("᩵᩺") ^ i49;
                        i12 = ((iM25616 ^ i50) * (-31051)) ^ 1988511186;
                        sArr13 = sArr13;
                        i60 = i60;
                        i47 = i47;
                        i54 = i54;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        i57 = i57;
                        iM3007 = i89;
                        i52 = iM25616 ^ 1507484483;
                        str17 = str17;
                        strM3789 = strM3789;
                        i55 = i55;
                        int i611 = i12;
                        stackTraceElement8 = stackTraceElement3;
                        i51 = i611;
                    } else {
                        stackTraceElement8 = stackTraceElement3;
                        i58 = i58;
                        c6 = c6;
                        i59 = i59;
                        i53 = i53;
                        iM3007 = i89;
                        int iM25617 = (i50 - C0630.m2566("ܽ᩵")) * (-117);
                        i51 = ((iM25617 ^ i49) * (-3207)) ^ 1977819741;
                        i13 = iM25617 ^ 1267675418;
                        i60 = i60;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case -67684977:
                case 1034502840:
                    str13 = strM3789;
                    str14 = str17;
                    i39 = i54;
                    stackTraceElement3 = stackTraceElement8;
                    i40 = length2;
                    i41 = iM3007;
                    str15 = str16;
                    sArr11 = f46935;
                    i42 = 71;
                    i43 = 11;
                    if (C3746.f11829 <= 0) {
                        int iM25618 = (C0630.m2566("ۙܺ") + i49) * 45;
                        i12 = ((iM25618 ^ i50) * (-14947)) ^ (-1909349887);
                        i52 = iM25618 ^ 1629613475;
                        i54 = i39;
                        length2 = i40;
                        sArr14 = sArr11;
                        i57 = i43;
                        str17 = str14;
                        i55 = i42;
                        str16 = str15;
                        iM3007 = i41;
                    } else {
                        int iM69814 = (i49 - C2105.m6981("ۜܽ")) * 39;
                        i12 = ((iM69814 ^ i50) * 3865) ^ 2017030028;
                        i52 = iM69814 ^ (-593012569);
                        str17 = str14;
                        i54 = i39;
                        length2 = i40;
                        str16 = str15;
                        i55 = 71;
                        i57 = 11;
                        iM3007 = i41;
                        sArr14 = sArr11;
                    }
                    strM3789 = str13;
                    int i612 = i12;
                    stackTraceElement8 = stackTraceElement3;
                    i51 = i612;
                    break;
                case 53752670:
                case 1469327178:
                    if (C0483.f2088 < 0) {
                        iM2566 = (i49 - C0630.m2566("ۜᩴ")) * (-117);
                        i = ((iM2566 ^ i50) * 4893) ^ (-1474765446);
                        i2 = -2126213989;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    } else {
                        strM3789 = strM3789;
                        i55 = i55;
                        i57 = i57;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        str17 = str17;
                        i54 = i54;
                        length2 = length2;
                        i58 = i58;
                        i47 = i47;
                        sArr15 = sArr15;
                        i59 = i59;
                        iM3007 = iM3007;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c6 = c6;
                        i60 = i60;
                        i53 = i53;
                        iM6981 = (C2105.m6981("ۤ۫") ^ i50) * (-121);
                        i51 = ((iM6981 ^ i49) * 19533) ^ 1655457084;
                        i3 = -148291767;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case 75033402:
                case 1691771831:
                    stackTraceElement7 = stackTraceElement8;
                    String className = stackTraceElement7.getClassName();
                    iM3007 = C0798.m3007(className);
                    str10 = className;
                    i53 = 0;
                    int iM25619 = (C0630.m2566("ۡ᩹") ^ i50) * 123;
                    i34 = ((iM25619 ^ i49) * (-12417)) ^ 1264430065;
                    i44 = iM25619 ^ (-53597640);
                    sArr13 = sArr13;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str17;
                    i54 = i54;
                    i55 = i55;
                    i57 = i57;
                    str16 = str10;
                    strM3789 = strM3789;
                    int i613 = i44;
                    stackTraceElement8 = stackTraceElement7;
                    i51 = i34;
                    length2 = length2;
                    sArr14 = sArr14;
                    i52 = i613;
                    break;
                case 110272280:
                case 1926184799:
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    if ((i46 + 1) - i45 > 0) {
                        iM6981 = C0630.m2566("ܳܽ") ^ i50;
                        i51 = ((iM6981 ^ i49) * (-839)) ^ 1042913062;
                        i3 = -1032844518;
                    } else {
                        iM6981 = C0630.m2566("᩻ۡ") ^ i49;
                        i51 = ((iM6981 ^ i50) * (-17871)) ^ (-1873147834);
                        i3 = 1571819858;
                    }
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case 176024951:
                case 1571125204:
                    strM3789 = strM3789;
                    stackTraceElement7 = stackTraceElement8;
                    i28 = i55;
                    i29 = i57;
                    sArr14 = sArr14;
                    sArr8 = sArr13;
                    i30 = iM3007;
                    str11 = str16;
                    str12 = str17;
                    i31 = i54;
                    length2 = length2;
                    i32 = i47;
                    i33 = i60;
                    sArr9 = sArr15;
                    thM2811 = C0714.m2811(th);
                    if (thM2811 != null) {
                        iM6983 = (C2105.m6981("ܿܰ") + i50) * (-7);
                        i34 = ((iM6983 ^ i49) * (-27749)) ^ (-918229049);
                        i35 = -101437335;
                    } else {
                        iM6983 = C0630.m2566("ܽۚ") ^ i49;
                        i34 = ((iM6983 ^ i50) * (-18827)) ^ (-508659793);
                        i35 = -969509166;
                    }
                    i44 = iM6983 ^ i35;
                    sArr13 = sArr8;
                    i60 = i33;
                    sArr15 = sArr9;
                    i47 = i32;
                    str17 = str12;
                    i54 = i31;
                    str16 = str11;
                    i55 = i28;
                    i57 = i29;
                    iM3007 = i30;
                    strM3789 = strM3789;
                    int i614 = i44;
                    stackTraceElement8 = stackTraceElement7;
                    i51 = i34;
                    length2 = length2;
                    sArr14 = sArr14;
                    i52 = i614;
                    break;
                case 207640993:
                case 2144516593:
                    str6 = strM3789;
                    i16 = i55;
                    i17 = i57;
                    sArr3 = sArr14;
                    c3 = c6;
                    sArr4 = sArr13;
                    i18 = iM3007;
                    i19 = i53;
                    str7 = str16;
                    str8 = str17;
                    i20 = i54;
                    length2 = length2;
                    i21 = i47;
                    i22 = i60;
                    sArr5 = sArr15;
                    stackTraceElement4 = stackTraceElementArr[i59];
                    if (z) {
                        iM6982 = C2105.m6981("ۡܽ") ^ i50;
                        i23 = ((iM6982 ^ i49) * (-27827)) ^ 220550652;
                        i24 = 1817360387;
                    } else {
                        iM6982 = C2105.m6981("ۙۖ") ^ i50;
                        i23 = ((iM6982 ^ i49) * 10557) ^ (-1333888612);
                        i24 = 108161949;
                    }
                    int i615 = iM6982 ^ i24;
                    sArr13 = sArr4;
                    i60 = i22;
                    sArr15 = sArr5;
                    i47 = i21;
                    str17 = str8;
                    i54 = i20;
                    str16 = str7;
                    i55 = i16;
                    i57 = i17;
                    iM3007 = i18;
                    strM3789 = str6;
                    char c11 = c3;
                    stackTraceElement8 = stackTraceElement4;
                    i53 = i19;
                    c6 = c11;
                    sArr10 = sArr3;
                    i52 = i615;
                    i51 = i23;
                    length2 = length2;
                    sArr14 = sArr10;
                    break;
                case 222018253:
                case 1623639541:
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    s = sArr12[53];
                    s2 = 1;
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i49 - C2105.m6981("᩻ۧ")) * (-31);
                        i51 = ((iM6981 ^ i50) * 14493) ^ (-1165885521);
                        i3 = -1169856379;
                    } else {
                        iM6981 = (C2105.m6981("ۗۚ") ^ i49) * (-83);
                        i51 = ((iM6981 ^ i50) * (-13491)) ^ 1562443528;
                        i3 = -1939441552;
                    }
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case 236808416:
                case 1183464276:
                    C4616.m13552();
                    iM2566 = C2105.m6981("ۖܶ") ^ i50;
                    i = ((iM2566 ^ i49) * (-17437)) ^ (-1324079798);
                    i2 = -2137845563;
                    i52 = iM2566 ^ i2;
                    i51 = i;
                    break;
                case 251049800:
                case 1975174992:
                    str6 = strM3789;
                    stackTraceElement5 = stackTraceElement8;
                    i16 = i55;
                    i17 = i57;
                    sArr3 = sArr14;
                    c4 = c6;
                    short[] sArr22 = sArr13;
                    sArr7 = sArr15;
                    i18 = iM3007;
                    i27 = i53;
                    str7 = str16;
                    i20 = i54;
                    length2 = length2;
                    int i90 = i47;
                    int i91 = i60;
                    strM9250 = C3019.m9250(f46935, 54, 4, i56);
                    if (C3245.f10203 > 0) {
                        int iM69815 = C2105.m6981("ۧۗ") ^ i49;
                        sArr13 = sArr22;
                        i60 = i91;
                        sArr15 = sArr7;
                        i47 = i90;
                        i54 = i20;
                        str16 = str7;
                        i57 = i17;
                        str17 = strM9250;
                        iM3007 = i18;
                        i53 = i27;
                        strM3789 = str6;
                        c6 = c4;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = ((iM69815 ^ i50) * (-28325)) ^ (-1692828789);
                        i55 = i16;
                        sArr6 = sArr3;
                        i52 = iM69815 ^ (-1841786491);
                        length2 = length2;
                        sArr14 = sArr6;
                    } else {
                        sArr13 = sArr22;
                        i60 = i91;
                        i47 = i90;
                        int iM69816 = C2105.m6981("۟᩷") ^ i49;
                        sArr15 = sArr7;
                        i54 = i20;
                        length2 = length2;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        str17 = strM9250;
                        i52 = iM69816 ^ (-963068535);
                        i53 = i27;
                        c6 = c4;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = ((iM69816 ^ i50) * (-22071)) ^ 1113460368;
                        str16 = str7;
                        iM3007 = i18;
                        strM3789 = str6;
                    }
                    break;
                case 256428982:
                case 1101154320:
                    if (C0714.f2697 >= 0) {
                        str6 = strM3789;
                        stackTraceElement5 = stackTraceElement8;
                        i16 = i55;
                        i17 = i57;
                        sArr3 = sArr14;
                        c4 = c6;
                        i18 = iM3007;
                        i27 = i53;
                        str7 = str16;
                        strM9250 = str17;
                        i20 = i54;
                        length2 = length2;
                        sArr7 = sArr15;
                        int iM69817 = C2105.m6981("۟᩷") ^ i49;
                        sArr15 = sArr7;
                        i54 = i20;
                        length2 = length2;
                        sArr14 = sArr3;
                        i55 = i16;
                        i57 = i17;
                        str17 = strM9250;
                        i52 = iM69817 ^ (-963068535);
                        i53 = i27;
                        c6 = c4;
                        stackTraceElement8 = stackTraceElement5;
                        i51 = ((iM69817 ^ i50) * (-22071)) ^ 1113460368;
                        str16 = str7;
                        iM3007 = i18;
                        strM3789 = str6;
                    } else {
                        iM2566 = C0630.m2566("ۜ֡") ^ i50;
                        i = ((iM2566 ^ i49) * 27691) ^ 1666950311;
                        i2 = -2084906295;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    }
                    break;
                case 467509698:
                case 1699492229:
                    m36312(th2, sb, stackTraceElementArr, strM7507, strM9934, setNewSetFromMap);
                    i15 = i54 + 1;
                    length2 = length2;
                    int iM256110 = (C0630.m2566("۠ܶ") + i49) * 101;
                    int i710 = ((iM256110 ^ i50) * (-15785)) ^ 1945268868;
                    sArr13 = sArr13;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str17;
                    i54 = i15;
                    str16 = str16;
                    i55 = i55;
                    i57 = i57;
                    iM3007 = iM3007;
                    strM3789 = strM3789;
                    sArr6 = sArr14;
                    i52 = iM256110 ^ (-1710738363);
                    i53 = i53;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i51 = i710;
                    sArr14 = sArr6;
                    break;
                case 482970734:
                case 1116646661:
                    stackTraceElement2 = stackTraceElement8;
                    z = true;
                    iM2567 = (i50 - C0630.m2566("ۜۤ")) * 101;
                    i51 = ((iM2567 ^ i49) * (-22995)) ^ 1886459448;
                    i11 = -241274416;
                    int i616 = iM2567 ^ i11;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    i53 = i53;
                    str16 = str16;
                    sArr14 = sArr14;
                    i55 = i55;
                    i52 = i616;
                    c6 = c6;
                    iM3007 = iM3007;
                    i58 = i58;
                    stackTraceElement8 = stackTraceElement2;
                    strM3789 = strM3789;
                    sArr13 = sArr13;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case 561145992:
                case 1744528330:
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    int i92 = s + s2;
                    i45 = i92 * i92;
                    i46 = s * 2;
                    if (C21923.f70183 == 0) {
                        iM6981 = (C0630.m2566("ܶ۫") ^ i50) * (-27);
                        i51 = ((iM6981 ^ i49) * 21071) ^ (-1399262537);
                        i3 = 1798508110;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    } else {
                        sArr15 = sArr15;
                        int iM256111 = (i50 - C0630.m2566("ܽ᩵")) * (-117);
                        i51 = ((iM256111 ^ i49) * (-3207)) ^ 1977819741;
                        i13 = iM256111 ^ 1267675418;
                        i60 = i60;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case 590260094:
                case 1981267329:
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    C0382.m1835(setNewSetFromMap, th);
                    if (th instanceof JSONException) {
                        iM6981 = (C0630.m2566("ۜۖ") + i49) * (-87);
                        i51 = ((iM6981 ^ i50) * 26241) ^ 2068526085;
                        i3 = -1900070665;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                    } else {
                        int iM25620 = (C0630.m2566("֨ܶ") + i49) * (-115);
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = iM25620 ^ 380737127;
                        iM3007 = iM3007;
                        i58 = i58;
                        i51 = ((iM25620 ^ i50) * 1833) ^ 630505606;
                        sArr13 = sArr13;
                        i53 = i53;
                    }
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                case 685755753:
                case 1093824231:
                    str6 = strM3789;
                    stackTraceElement5 = stackTraceElement8;
                    i16 = i55;
                    i17 = i57;
                    sArr3 = sArr14;
                    i18 = iM3007;
                    str7 = str16;
                    str8 = str17;
                    i20 = i54;
                    length2 = length2;
                    sArr7 = sArr15;
                    strM9934 = C3245.m9934(sArr7, 70, 1, i56);
                    if (C2167.f7158 >= 0) {
                        iM6984 = (C0630.m2566("ܰܶ") + i49) * (-119);
                        i36 = ((iM6984 ^ i50) * (-32299)) ^ 2084493;
                        i37 = 1386937058;
                    } else {
                        iM6984 = (C2105.m6981("ۗܺ") ^ i49) * 109;
                        i36 = ((iM6984 ^ i50) * (-1895)) ^ (-241002299);
                        i37 = -2020444712;
                    }
                    i38 = iM6984 ^ i37;
                    stackTraceElement8 = stackTraceElement5;
                    i51 = i36;
                    sArr15 = sArr7;
                    str17 = str8;
                    i54 = i20;
                    length2 = length2;
                    str16 = str7;
                    sArr14 = sArr3;
                    i55 = i16;
                    i57 = i17;
                    iM3007 = i18;
                    i52 = i38;
                    strM3789 = str6;
                    break;
                case 844279570:
                case 1415780403:
                    i53++;
                    str10 = str16;
                    stackTraceElement7 = stackTraceElement8;
                    int iM256112 = (C0630.m2566("ۡ᩹") ^ i50) * 123;
                    i34 = ((iM256112 ^ i49) * (-12417)) ^ 1264430065;
                    i44 = iM256112 ^ (-53597640);
                    sArr13 = sArr13;
                    i60 = i60;
                    sArr15 = sArr15;
                    i47 = i47;
                    str17 = str17;
                    i54 = i54;
                    i55 = i55;
                    i57 = i57;
                    str16 = str10;
                    strM3789 = strM3789;
                    int i617 = i44;
                    stackTraceElement8 = stackTraceElement7;
                    i51 = i34;
                    length2 = length2;
                    sArr14 = sArr14;
                    i52 = i617;
                    break;
                case 949098333:
                case 1448334803:
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ۜ֡") ^ i50;
                        i = ((iM2566 ^ i49) * 27691) ^ 1666950311;
                        i2 = -2084906295;
                        i52 = iM2566 ^ i2;
                        i51 = i;
                    } else {
                        strM3789 = strM3789;
                        i55 = i55;
                        i57 = i57;
                        sArr14 = sArr14;
                        sArr13 = sArr13;
                        str17 = str17;
                        i54 = i54;
                        length2 = length2;
                        i58 = i58;
                        i47 = i47;
                        sArr15 = sArr15;
                        i59 = i59;
                        iM3007 = iM3007;
                        str16 = str16;
                        stackTraceElement8 = stackTraceElement8;
                        c6 = c6;
                        i60 = i60;
                        i53 = i53;
                        iM6981 = (C2105.m6981("ۤ۫") ^ i50) * (-121);
                        i51 = ((iM6981 ^ i49) * 19533) ^ 1655457084;
                        i3 = -148291767;
                        i13 = iM6981 ^ i3;
                        i60 = i60;
                        sArr15 = sArr15;
                        i59 = i59;
                        str17 = str17;
                        length2 = length2;
                        str16 = str16;
                        sArr14 = sArr14;
                        strM3789 = strM3789;
                        i55 = i55;
                        i52 = i13;
                        iM3007 = iM3007;
                        i53 = i53;
                        i58 = i58;
                        sArr13 = sArr13;
                        c6 = c6;
                        stackTraceElement8 = stackTraceElement8;
                        i47 = i47;
                        i54 = i54;
                        i57 = i57;
                    }
                    break;
                case 1069695584:
                case 1296337287:
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    sArr12 = f46935;
                    if (C7811.f24123 >= 0) {
                        iM6981 = (i49 - C2105.m6981("᩻ۧ")) * (-31);
                        i51 = ((iM6981 ^ i50) * 14493) ^ (-1165885521);
                        i3 = -1169856379;
                    } else {
                        iM6981 = (i49 - C2105.m6981("ܳۛ")) * (-79);
                        i51 = ((iM6981 ^ i50) * (-6521)) ^ 950266783;
                        i3 = 795577052;
                    }
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
                default:
                    strM3789 = strM3789;
                    i55 = i55;
                    i57 = i57;
                    sArr14 = sArr14;
                    sArr13 = sArr13;
                    str17 = str17;
                    i54 = i54;
                    length2 = length2;
                    i58 = i58;
                    i47 = i47;
                    sArr15 = sArr15;
                    i59 = i59;
                    iM3007 = iM3007;
                    str16 = str16;
                    stackTraceElement8 = stackTraceElement8;
                    c6 = c6;
                    i60 = i60;
                    i53 = i53;
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C2105.m6981("ۤ۫") ^ i50) * (-121);
                        i51 = ((iM6981 ^ i49) * 19533) ^ 1655457084;
                        i3 = -148291767;
                    } else {
                        iM6981 = (C2105.m6981("ۤܽ") + i50) * 21;
                        i51 = ((iM6981 ^ i49) * 32579) ^ 1202066555;
                        i3 = -1926986923;
                    }
                    i13 = iM6981 ^ i3;
                    i60 = i60;
                    sArr15 = sArr15;
                    i59 = i59;
                    str17 = str17;
                    length2 = length2;
                    str16 = str16;
                    sArr14 = sArr14;
                    strM3789 = strM3789;
                    i55 = i55;
                    i52 = i13;
                    iM3007 = iM3007;
                    i53 = i53;
                    i58 = i58;
                    sArr13 = sArr13;
                    c6 = c6;
                    stackTraceElement8 = stackTraceElement8;
                    i47 = i47;
                    i54 = i54;
                    i57 = i57;
                    break;
            }
            return;
        }
    }
}
