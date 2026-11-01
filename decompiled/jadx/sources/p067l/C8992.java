package p067l;

import android.app.Application;
import android.util.Base64;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۜ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6NZ */
/* JADX INFO: loaded from: classes.dex */
public final class C8992 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f24358;

    /* JADX INFO: renamed from: ۡ֡۫, reason: not valid java name and contains not printable characters */
    private static final short[] f82042;

    /* JADX INFO: renamed from: ۧ */
    public static final SecureRandom f24359;

    /* JADX INFO: renamed from: ܳ */
    public static int[] f24360;

    /* JADX INFO: renamed from: ܽ */
    public static String f24361;

    /* JADX INFO: renamed from: ܿ */
    public static C25085 f24362;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f24363;

    /* JADX INFO: renamed from: ֫ */
    public static native String m20762(int[] iArr);

    /* JADX INFO: renamed from: ֫ */
    public static native C14677 m20763(C22876 c22876, int i, int[] iArr);

    /* JADX INFO: renamed from: ֫ */
    public static native void m20767(C11349 c11349, String str, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public static native void m20768(C22876 c22876);

    /* JADX INFO: renamed from: ֫ */
    public static native void m20769(C22876 c22876, int i, byte[] bArr, int[] iArr);

    /* JADX INFO: renamed from: ۧ */
    public static native synchronized void m20778(C25085 c25085);

    /* JADX INFO: renamed from: ܽ */
    public static native synchronized String m20782();

    /* JADX INFO: renamed from: ܿ */
    public static native int[] m20785();

    /* JADX INFO: renamed from: ᩳ */
    public static native synchronized C25085 m20786();

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m20777() {
        short s = f82042[258];
        int i = s + 6040;
        int i2 = (s * 24160) - (i * i) <= 0 ? 3318 : 23641;
        synchronized (C8992.class) {
            m20776(RunnableC0897.m55783(f82042, 259, 4, i2)).m51083();
            f24362 = null;
            f24363 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20771(C25065 c25065, String str) throws IOException {
        String str2 = null;
        int i = 530018869;
        int i2 = C0866.f81837;
        int i3 = AbstractC0942.f81890;
        int iM55680 = (i3 - C0873.m55680("᩷ۙ")) * (-81);
        int i4 = ((iM55680 ^ i2) * 6611) ^ 209966111;
        int i5 = 753413357;
        while (true) {
            i = ((((i ^ i2) * (-14163)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1949865793:
                case 705135325:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("ܽۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16443) ^ (-1742677436);
                        i5 = -437422219;
                    } else {
                        iM55680 = C0946.m55979("ۤᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22231)) ^ (-216867227);
                        i5 = -1377609055;
                    }
                    break;
                case -1923212352:
                case -1289227909:
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0873.m55680("ܽۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16443) ^ (-1742677436);
                        i5 = -437422219;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۨۙ")) * 25;
                        i4 = ((iM55680 ^ i3) * (-29679)) ^ 1844097443;
                        i5 = -870582069;
                    }
                    break;
                case -1664889601:
                case 1271112174:
                    m20773(c25065, str, str2, true);
                    break;
                case -1420100127:
                case -1394747283:
                    C1229.m56410();
                    if (C1017.f81942 < 0) {
                        iM55680 = C0946.m55979("᩸֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    } else {
                        iM55680 = C0873.m55680("֨ᩳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2297)) ^ (-1175116008);
                        i5 = -1027020444;
                    }
                    break;
                case -1287184440:
                case 691482694:
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0873.m55680("ۜ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    } else {
                        iM55680 = C0946.m55979("᩸֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    }
                    break;
                case -1176077438:
                case 1029576601:
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("ۗ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25613) ^ (-51529685);
                        i5 = -1906359763;
                    } else {
                        iM55680 = C0873.m55680("ۜ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    }
                    break;
                case -401986513:
                case 1925250221:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("᩸֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۢۧ")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-7747)) ^ (-862011286);
                        i5 = 253148125;
                    }
                    break;
                case -150904971:
                case 201344094:
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0873.m55680("ۜ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    } else {
                        iM55680 = (C0946.m55979("ܺۡ") + i2) * (-101);
                        i4 = ((iM55680 ^ i3) * 1429) ^ (-1336134078);
                        i5 = -67361723;
                    }
                    break;
                case 105261577:
                case 1032267515:
                    str2 = null;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("᩺ۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1149)) ^ (-1196920300);
                        i5 = -1145111640;
                    } else {
                        iM55680 = (C0946.m55979("ۛᩳ") + i3) * 27;
                        i4 = ((iM55680 ^ i2) * (-30659)) ^ (-735287677);
                        i5 = -1193960954;
                    }
                    break;
                case 113559802:
                case 947151252:
                    C1003.m56123();
                    C0937.m55918();
                    iM55680 = C0873.m55680("֨ᩳ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-2297)) ^ (-1175116008);
                    i5 = -1027020444;
                    break;
                case 134633830:
                case 2070117552:
                    if (C0967.m56074()) {
                        iM55680 = C0873.m55680("᩺ۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1149)) ^ (-1196920300);
                        i5 = -1145111640;
                    } else {
                        iM55680 = (C0873.m55680("ܿ۟") ^ i2) * (-115);
                        i4 = ((iM55680 ^ i3) * 15421) ^ 1014797016;
                        i5 = -377895517;
                    }
                    break;
                case 223335403:
                case 322451096:
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0873.m55680("ۜ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    } else {
                        iM55680 = C0873.m55680("ۤܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21563) ^ 160733360;
                        i5 = 2091766152;
                    }
                    break;
                case 501970604:
                case 1429380793:
                    C0989.m56095();
                    C1046.m56302();
                    break;
                case 730761092:
                case 1098802504:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("᩺ۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1149)) ^ (-1196920300);
                        i5 = -1145111640;
                    } else {
                        iM55680 = (C0873.m55680("ܰۘ") ^ i3) * 97;
                        i4 = ((iM55680 ^ i2) * 13961) ^ 1741371811;
                        i5 = -627933675;
                    }
                    break;
                case 752814613:
                case 1367133914:
                    if (C1024.m56209() >= 0) {
                        iM55680 = C0946.m55979("᩸֨") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    } else {
                        iM55680 = (C0873.m55680("ܶ᩵") ^ i3) * 33;
                        i4 = ((iM55680 ^ i2) * (-23377)) ^ 1921065607;
                        i5 = 1352284492;
                    }
                    break;
                default:
                    C1071.m56343();
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("ܽۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16443) ^ (-1742677436);
                        i5 = -437422219;
                    } else {
                        iM55680 = C0873.m55680("ۜ֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c9 A[PHI: r3 r12 r13 r18
      0x01c9: PHI (r3v5 java.lang.String) = (r3v1 java.lang.String), (r3v3 java.lang.String), (r3v1 java.lang.String) binds: [B:52:0x01c7, B:21:0x0082, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r12v4 short[]) = (r12v2 short[]), (r12v1 short[]), (r12v1 short[]) binds: [B:52:0x01c7, B:21:0x0082, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r13v4 int) = (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:52:0x01c7, B:21:0x0082, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x01c9: PHI (r18v34 int) = (r18v15 int), (r18v24 int), (r18v35 int) binds: [B:52:0x01c7, B:21:0x0082, B:9:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0261 A[PHI: r1 r8 r9 r10 r18 r19
      0x0261: PHI (r1v3 ??) = (r1v7 ??), (r1v8 ??), (r1v2 ??), (r1v9 ??) binds: [B:63:0x025f, B:44:0x016d, B:40:0x0147, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:63:0x025f, B:44:0x016d, B:40:0x0147, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:63:0x025f, B:44:0x016d, B:40:0x0147, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r10v3 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:63:0x025f, B:44:0x016d, B:40:0x0147, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r18v28 int) = (r18v10 int), (r18v17 int), (r18v18 int), (r18v29 int) binds: [B:63:0x025f, B:44:0x016d, B:40:0x0147, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r19v3 l.᩸۫ۡ) = (r19v1 l.᩸۫ۡ), (r19v2 l.᩸۫ۡ), (r19v1 l.᩸۫ۡ), (r19v1 l.᩸۫ۡ) binds: [B:63:0x025f, B:44:0x016d, B:40:0x0147, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b9 A[PHI: r5 r6 r7 r18
      0x02b9: PHI (r5v3 char) = (r5v2 char), (r5v1 char) binds: [B:71:0x02b7, B:67:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r6v2 short) = (r6v1 short), (r6v3 short) binds: [B:71:0x02b7, B:67:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:71:0x02b7, B:67:0x0297] A[DONT_GENERATE, DONT_INLINE]
      0x02b9: PHI (r18v8 int) = (r18v7 int), (r18v9 int) binds: [B:71:0x02b7, B:67:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x02eb A[PHI: r2 r4 r18
      0x02eb: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String), (r2v1 java.lang.String) binds: [B:75:0x02e9, B:28:0x00be, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:75:0x02e9, B:28:0x00be, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02eb: PHI (r18v31 int) = (r18v6 int), (r18v21 int), (r18v36 int) binds: [B:75:0x02e9, B:28:0x00be, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (p067l.C0894.f81854 >= 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m20774(boolean z, boolean z2) {
        int iM55680;
        int i;
        int i2;
        ?? r1 = 0;
        String strM55893 = null;
        String strM55863 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 49596819;
        int i11 = RunnableC1014.f81941;
        int i12 = C0906.f81862;
        int iM55681 = (C0873.m55680("᩵ܽ") + i12) * (-77);
        int i13 = ((iM55681 ^ i11) * (-7365)) ^ 1327764898;
        int i14 = iM55681 ^ (-625974751);
        C22876 c22876M20776 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i11) * 2101) >> 31));
            switch (i15) {
                case -2082982680:
                case -159163066:
                    i15 = i15;
                    sArr = f82042;
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0946.m55979("ۤۖ") + i11) * 75;
                        i = ((iM55680 ^ i12) * (-11957)) ^ (-1230612122);
                        i2 = -496267392;
                    } else {
                        iM55680 = C0873.m55680("ۘ۟") ^ i11;
                        i = ((iM55680 ^ i12) * (-1629)) ^ (-476758569);
                        i2 = -658900807;
                    }
                    int i16 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i16;
                    r1 = r1;
                    break;
                case -2040161723:
                case 73071819:
                    i15 = i15;
                    i9 = 4;
                    if (C0937.f81884) {
                        iM55680 = (C0946.m55979("ۖܶ") ^ i11) * 67;
                        i = ((iM55680 ^ i12) * (-21881)) ^ 964417060;
                        i2 = 1488297558;
                    } else {
                        iM55680 = C0946.m55979("ۨܿ") ^ i12;
                        i = ((iM55680 ^ i11) * 21309) ^ 1209326675;
                        i2 = -1106452289;
                    }
                    int i17 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i17;
                    r1 = r1;
                    break;
                case -1861757603:
                case 285510595:
                    break;
                case -1791791336:
                case -895165098:
                    i15 = i15;
                    m20768(c22876M20776);
                    r1 = 0;
                    r1 = 0;
                    f24362 = null;
                    if (C1929.f83011 != 0) {
                        iM55680 = (i12 - C0946.m55979("ۡۧ")) * (-69);
                        i = ((iM55680 ^ i11) * (-20181)) ^ 1662849149;
                        i2 = 2092084074;
                    } else {
                        iM55680 = C0873.m55680("᩹ۘ") ^ i12;
                        i = ((iM55680 ^ i11) * 22953) ^ (-440775353);
                        i2 = -451930863;
                    }
                    int i18 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i18;
                    r1 = r1;
                    break;
                case -1545424595:
                case 548187410:
                    i15 = i15;
                    int i19 = i5 + i6;
                    if ((i19 + i19) - i4 < 0) {
                        iM55680 = C0873.m55680("ۜۖ") ^ i11;
                        i = ((iM55680 ^ i12) * 30035) ^ (-726351756);
                        i2 = 320217273;
                    } else {
                        iM55680 = (i12 - C0946.m55979("ۢ᩸")) * 63;
                        i = ((iM55680 ^ i11) * 20613) ^ (-1910056675);
                        i2 = -332059631;
                    }
                    int i110 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i110;
                    r1 = r1;
                    break;
                case -1185681901:
                case -584156953:
                    i15 = i15;
                    c = 245;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("᩶ۚ") ^ i12;
                        i = ((iM55680 ^ i11) * (-2239)) ^ (-33009608);
                        i2 = -1567123477;
                    } else {
                        iM55680 = C0946.m55979("ܰ۫") ^ i12;
                        i = ((iM55680 ^ i11) * (-16713)) ^ 63877137;
                        i2 = -1161400135;
                    }
                    int i111 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i111;
                    r1 = r1;
                    break;
                case -1049843527:
                case -19078406:
                    i7 = 12207;
                    iM55680 = (C0873.m55680("۬ܿ") + i11) * (-127);
                    i = ((iM55680 ^ i12) * (-24809)) ^ (-1027520519);
                    i2 = 672322888;
                    int i112 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i112;
                    r1 = r1;
                    break;
                case -971929123:
                case 1973981284:
                    i15 = i15;
                    if (z2) {
                        iM55680 = (C0946.m55979("᩹ܽ") + i11) * 41;
                        i = ((iM55680 ^ i12) * 863) ^ (-1727008412);
                        i2 = 1752680618;
                    } else {
                        iM55680 = C0946.m55979("۬᩸") ^ i12;
                        i = ((iM55680 ^ i11) * 6619) ^ (-959266972);
                        i2 = 1903149882;
                    }
                    int i113 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i113;
                    r1 = r1;
                    break;
                case -949469037:
                case 272469849:
                    i15 = i15;
                    strM55863 = C0927.m55863(f82042, Scalar25519.TARGET_LENGTH, 4, i7);
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0873.m55680("ۗ᩹") ^ i11) * (-11);
                        i = ((iM55680 ^ i12) * 16973) ^ 1839243416;
                        i2 = -1717420026;
                    } else {
                        iM55680 = (C0946.m55979("ܿۘ") + i11) * 23;
                        i = ((iM55680 ^ i12) * (-28081)) ^ (-1464992001);
                        i2 = -700665316;
                    }
                    int i114 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i114;
                    r1 = r1;
                    break;
                case -563641315:
                case 65455479:
                    C4654.m9886();
                    break;
                case -505158036:
                case 1141325512:
                    i15 = i15;
                    C4654.m9878();
                    sArr2 = f82042;
                    i8 = 246;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ۗ᩹") ^ i11) * (-11);
                        i = ((iM55680 ^ i12) * 16973) ^ 1839243416;
                        i2 = -1717420026;
                    } else {
                        iM55680 = C0946.m55979("᩹ᩳ") ^ i12;
                        i = ((iM55680 ^ i11) * 10327) ^ (-50452598);
                        i2 = 695100276;
                    }
                    int i115 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i115;
                    r1 = r1;
                    break;
                case -286507787:
                case 1397898493:
                    ViewOnClickListenerC0939.m55941();
                    i15 = i15;
                    r1 = r1;
                    iM55680 = (i12 - C0946.m55979("ۡۧ")) * (-69);
                    i = ((iM55680 ^ i11) * (-20181)) ^ 1662849149;
                    i2 = 2092084074;
                    int i116 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i116;
                    r1 = r1;
                    break;
                case -118064975:
                case 35568897:
                    i15 = i15;
                    c22876M20776 = m20776(C1124.m56373(sArr2, i8, i9, i7));
                    r1 = r1;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (i12 - C0946.m55979("ۡۧ")) * (-69);
                        i = ((iM55680 ^ i11) * (-20181)) ^ 1662849149;
                        i2 = 2092084074;
                    } else {
                        iM55680 = C0946.m55979("֨ܰ") ^ i12;
                        i = ((iM55680 ^ i11) * 727) ^ (-645668724);
                        i2 = 1705827829;
                    }
                    int i117 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i117;
                    r1 = r1;
                    break;
                case -104514426:
                case 437384310:
                    m20768(m20776(strM55863));
                    f24360 = r1;
                    i15 = i15;
                    iM55680 = C0946.m55979("۬᩸") ^ i12;
                    i = ((iM55680 ^ i11) * 6619) ^ (-959266972);
                    i2 = 1903149882;
                    int i118 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i118;
                    r1 = r1;
                    break;
                case 21343150:
                case 1929131630:
                    i7 = 42357;
                    iM55680 = (C0873.m55680("۬ܿ") + i11) * (-127);
                    i = ((iM55680 ^ i12) * (-24809)) ^ (-1027520519);
                    i2 = 672322888;
                    int i119 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i119;
                    r1 = r1;
                    break;
                case 228334308:
                case 1753218558:
                    i15 = i15;
                    s = sArr[c];
                    i3 = s + 6215;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i12;
                        i = ((iM55680 ^ i11) * (-16713)) ^ 63877137;
                        i2 = -1161400135;
                    } else {
                        iM55680 = (C0873.m55680("֡۠") ^ i11) * 59;
                        i = ((iM55680 ^ i12) * 26889) ^ (-948967390);
                        i2 = -673876202;
                    }
                    int i1110 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1110;
                    r1 = r1;
                    break;
                case 365830953:
                case 1630793891:
                    C0949.m56012();
                    if (C1028.m56247() >= 0) {
                        i15 = i15;
                        iM55680 = (C0946.m55979("ۤۖ") + i11) * 75;
                        i = ((iM55680 ^ i12) * (-11957)) ^ (-1230612122);
                        i2 = -496267392;
                        int i1111 = i15;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        i10 = i1111;
                        r1 = r1;
                    }
                    i15 = i15;
                    iM55680 = (C0873.m55680("ۗ᩹") ^ i11) * (-11);
                    i = ((iM55680 ^ i12) * 16973) ^ 1839243416;
                    i2 = -1717420026;
                    int i1112 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1112;
                    r1 = r1;
                    break;
                case 542024153:
                case 1734144550:
                    i15 = i15;
                    m20768(m20776(strM55893));
                    f24361 = r1;
                    iM55680 = C0873.m55680("ۖ᩶") ^ i11;
                    i = ((iM55680 ^ i12) * (-32341)) ^ 2068061979;
                    i2 = 339915689;
                    int i1113 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1113;
                    r1 = r1;
                    break;
                case 799614772:
                case 1216536197:
                    i15 = i15;
                    strM55893 = C0930.m55893(f82042, 250, 4, i7);
                    if (C0873.m55678()) {
                        iM55680 = (C0946.m55979("ۤۖ") + i11) * 75;
                        i = ((iM55680 ^ i12) * (-11957)) ^ (-1230612122);
                        i2 = -496267392;
                    } else {
                        iM55680 = C0946.m55979("᩵ۢ") ^ i12;
                        i = ((iM55680 ^ i11) * (-5671)) ^ 1731291948;
                        i2 = -933789952;
                    }
                    int i1114 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1114;
                    r1 = r1;
                    break;
                case 1092557529:
                case 1382111381:
                    C0930.m55885();
                    if (C0912.f81867 <= 0) {
                        i15 = i15;
                        iM55680 = C0946.m55979("ۨܿ") ^ i12;
                        i = ((iM55680 ^ i11) * 21309) ^ 1209326675;
                        i2 = -1106452289;
                        int i1115 = i15;
                        i14 = iM55680 ^ i2;
                        i13 = i;
                        i10 = i1115;
                        r1 = r1;
                    }
                    i15 = i15;
                    r1 = r1;
                    iM55680 = (i12 - C0946.m55979("ۡۧ")) * (-69);
                    i = ((iM55680 ^ i11) * (-20181)) ^ 1662849149;
                    i2 = 2092084074;
                    int i1116 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1116;
                    r1 = r1;
                    break;
                case 1137553063:
                case 1188866256:
                    i15 = i15;
                    i4 = i3 * i3;
                    i5 = s * s;
                    i6 = 38626225;
                    r1 = r1;
                    if (C1929.f83011 != 0) {
                        iM55680 = (i12 - C0946.m55979("ۡۧ")) * (-69);
                        i = ((iM55680 ^ i11) * (-20181)) ^ 1662849149;
                        i2 = 2092084074;
                    } else {
                        iM55680 = C0946.m55979("۠ۤ") ^ i12;
                        i = ((iM55680 ^ i11) * 25699) ^ 140219257;
                        i2 = 216718082;
                    }
                    int i1117 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1117;
                    r1 = r1;
                    break;
                case 1243322437:
                case 1307287651:
                    i15 = i15;
                    f24363 = true;
                    if (z) {
                        iM55680 = C0873.m55680("᩺᩵") ^ i11;
                        i = ((iM55680 ^ i12) * 21767) ^ 159435674;
                        i2 = 694901779;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩶") ^ i11;
                        i = ((iM55680 ^ i12) * (-32341)) ^ 2068061979;
                        i2 = 339915689;
                    }
                    int i1118 = i15;
                    i14 = iM55680 ^ i2;
                    i13 = i;
                    i10 = i1118;
                    r1 = r1;
                    break;
                default:
                    C1003.m56123();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e1 A[PHI: r0 r12 r13
      0x00e1: PHI (r0v35 java.lang.String) = (r0v29 java.lang.String), (r0v4 java.lang.String), (r0v4 java.lang.String) binds: [B:38:0x0199, B:34:0x016a, B:22:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r12v4 int) = (r12v1 int), (r12v2 int), (r12v1 int) binds: [B:38:0x0199, B:34:0x016a, B:22:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r13v4 int) = (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:38:0x0199, B:34:0x016a, B:22:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        if (p067l.C0877.f81843 < 0) goto L10;
     */
    static {
        short[] sArr;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        String strM56325;
        String str2;
        int iM559710;
        int i8;
        ApplicationC14266.m56479(72);
        f82042 = new short[]{8417, -10195, -10192, -10197, -10178, -10197, -10182, -10178, -10180, -10188, -10189, -10192, -10184, -10186, -10191, -10190, -10186, -10184, -10195, -10178, -10197, -10182, 4311, 12889, 12814, 12894, 12805, 5837, 14599, 14596, 14604, 14594, 14597, 6380, -18532, -18455, -18551, -18544, -18455, -18560, -18532, -18455, -18551, -18544, -18455, -18559, -18443, -18532, -18455, -18551, -18544, -18455, -18554, -18532, -18455, -18551, -18544, -18455, -18551, -18532, -18455, -18551, -18544, -18455, -18550, -18551, -18515, -18505, -18505, -18515, -18518, -18525, -18460, -18505, -18527, -18505, -18505, -18515, -18517, -18518, -18460, -18521, -18506, -18527, -18528, -18527, -18518, -18512, -18515, -18523, -18520, -18532, -18455, -18551, -18544, -18455, -18544, 7865, -7875, -7811, -7818, -7836, 9847, 30702, 30668, 30659, 30659, 30658, 30681, 30605, 30664, 30659, 30670, 30687, 30676, 30685, 30681, 30605, 30657, 30658, 30670, 30668, 30657, 30605, 30670, 30687, 30664, 30665, 30664, 30659, 30681, 30660, 30668, 30657, 30605, 30665, 30668, 30681, 30668, 30689, 30658, 30670, 30668, 30657, 30605, 30670, 30687, 30664, 30665, 30664, 30659, 30681, 30660, 30668, 30657, 30605, 30665, 30668, 30681, 30668, 30605, 30681, 30658, 30658, 30605, 30657, 30668, 30687, 30666, 30664, 626, 4351, 4312, 4288, 4311, 4314, 4319, 4306, 4246, 4293, 4307, 4293, 4293, 4319, 4313, 4312, 4246, 4305, 4292, 4311, 4312, 4290, 4311, 4309, 4317, 4325, 4290, 4311, 4314, 4307, 4246, 4293, 4307, 4293, 4293, 4319, 4313, 4312, 4246, 4305, 4292, 4311, 4312, 4290, 4325, 4307, 4293, 4293, 4319, 4313, 4312, 4246, 4311, 4309, 4317, 4312, 4313, 4289, 4314, 4307, 4306, 4305, 4307, 4315, 4307, 4312, 4290, 4246, 4294, 4307, 4312, 4306, 4319, 4312, 4305, 2128, 12238, 12184, 12236, 12188, 12234, 12189, 12237, 12182, 12233, 12187, 12235, 12183, 8455, 3223, 3265, 3221, 3269, 6865, 27835, 27885, 27833, 27881, 6098, 5207, 5205, 5213, 5188, 5209, 5186, 5207, 5186, 5203, 9106, 18508, 18517, 18444, 18501, 18500, 18519, 18504, 18498, 18500, 18459, 18500, 18451, 18499, 18456, 18496, 18454, 18498, 18450, 18496, 18511, 18501, 18515, 18510, 18504, 18501, 18558, 18504, 18501, 18554, 18449, 18444, 18456, 18496, 18444, 18503, 18528, 18444, 18535, 18556, 18522, 18448, 18445, 18448, 18455, 18524, 18456, 18454, 18454, 18453, 18501, 18452, 18455, 18501, 18455, 18457, 18451, 18500, 18452, 18453, 18456, 18498, 18449, 18442, 18459, 18459, 18459, 18459, 5231, -12764, -12682, -12762, -12678, -12765, -12683, -12767, -12687, -12761, -12688, -12768, -12677, 9793, 10179, 10133, 10177, 10129, 10183, 10128, 10176, 10139, 10180, 10134, 10182, 10138};
        String strM56189 = null;
        String str3 = null;
        String str4 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i9 = C0898.f81858;
        int i10 = RunnableC0938.f81886;
        int iM559711 = C0946.m55979("ۤ۫") ^ i9;
        int i11 = ((iM559711 ^ i10) * (-24025)) ^ (-1446088894);
        int i12 = iM559711 ^ (-414844153);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 835597538;
        short[] sArr5 = null;
        String strM55863 = null;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        while (true) {
            i18 = i12 ^ ((((i18 ^ i10) * 11367) >> 31) & i11);
            switch (i18) {
                case -2103756282:
                case -509291189:
                    sArr = sArr5;
                    i = i20;
                    s = s;
                    String str5 = strM56189;
                    if (C0917.f81868) {
                        strM56189 = str5;
                        i3 = 5;
                        iM55979 = (C0873.m55680("ܶۚ") + i10) * (-99);
                        i5 = i;
                        i4 = ((iM55979 ^ i9) * (-6777)) ^ 325576787;
                        strM56189 = strM56189;
                        i2 = 279429560;
                    } else {
                        int iM55680 = C0873.m55680("᩸᩹") ^ i10;
                        int i21 = ((iM55680 ^ i9) * 25793) ^ (-1246853139);
                        i2 = 1349485194;
                        iM55979 = iM55680;
                        i3 = 5;
                        i4 = i21;
                        strM56189 = str5;
                        i5 = i;
                    }
                    int i22 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i23 = i3;
                    i11 = i4;
                    i12 = i22;
                    sArr5 = sArr;
                    i19 = i23;
                    break;
                case -2079671441:
                case -1047588191:
                    i6 = i19;
                    i7 = i20;
                    s = s;
                    str = strM56189;
                    short[] sArr6 = sArr5;
                    strM56325 = C1053.m56325(sArr6, i7, i6, i13);
                    sArr4 = f82042;
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("ۘܺ") ^ i10) * (-65);
                        sArr = sArr6;
                        i2 = 1163883650;
                        i4 = ((iM55979 ^ i9) * (-30409)) ^ (-19803906);
                        strM56189 = str;
                        i5 = i7;
                    } else {
                        sArr5 = sArr6;
                        int iM55681 = C0873.m55680("۠᩸") ^ i9;
                        String str6 = str3;
                        int i24 = ((iM55681 ^ i10) * 24023) ^ (-702850597);
                        i2 = -2111660121;
                        short[] sArr7 = sArr5;
                        iM55979 = iM55681;
                        strM56189 = str;
                        i5 = i7;
                        i4 = i24;
                        str3 = str6;
                        sArr = sArr7;
                    }
                    short[] sArr8 = sArr4;
                    i3 = i6;
                    str4 = strM56325;
                    sArr4 = sArr8;
                    int i25 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i26 = i3;
                    i11 = i4;
                    i12 = i25;
                    sArr5 = sArr;
                    i19 = i26;
                    break;
                case -2078254162:
                case 1929799151:
                    s = s;
                    str2 = strM56189;
                    C0898.m55800();
                    if (C0967.f81910 < 0) {
                        iM559710 = C0946.m55979("ۙ᩸") ^ i9;
                        i11 = 517775398 ^ ((iM559710 ^ i10) * 27713);
                        i8 = 156167691;
                        i12 = i8 ^ iM559710;
                        strM56189 = str2;
                        s = s;
                    } else {
                        int iM55682 = C0873.m55680("֡᩵") ^ i10;
                        i4 = ((iM55682 ^ i9) * (-30819)) ^ 1537244971;
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM55682;
                        strM56189 = str2;
                        i5 = i20;
                        i2 = -185518047;
                        int i27 = iM55979 ^ i2;
                        i20 = i5;
                        s = s;
                        int i28 = i3;
                        i11 = i4;
                        i12 = i27;
                        sArr5 = sArr;
                        i19 = i28;
                    }
                    break;
                case -1804845000:
                case 123813463:
                    s = s;
                    String str7 = strM56189;
                    if (i17 - ((s * s) + 9678321) > 0) {
                        int iM559712 = (C0946.m55979("ܰ᩻") + i9) * 19;
                        i4 = ((iM559712 ^ i10) * 15393) ^ (-931505557);
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM559712;
                        strM56189 = str7;
                        i5 = i20;
                        i2 = 1409935590;
                    } else {
                        int iM559713 = (i10 - C0946.m55979("۬۬")) * 119;
                        i4 = ((iM559713 ^ i9) * 26199) ^ (-338384323);
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM559713;
                        strM56189 = str7;
                        i5 = i20;
                        i2 = 1039240610;
                    }
                    int i29 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i210 = i3;
                    i11 = i4;
                    i12 = i29;
                    sArr5 = sArr;
                    i19 = i210;
                    break;
                case -1472212133:
                case 458972504:
                    s = s;
                    int i30 = s * 6222;
                    if (C0930.f81879 > 0) {
                        int iM55683 = C0873.m55680("ۖ֡") ^ i9;
                        str2 = strM56189;
                        i17 = i30;
                        i12 = iM55683 ^ 266723348;
                        i11 = ((iM55683 ^ i10) * (-13955)) ^ 1458790186;
                        strM56189 = str2;
                        s = s;
                    } else {
                        i17 = i30;
                        int iM559714 = C0946.m55979("ᩴۘ") ^ i9;
                        i11 = ((iM559714 ^ i10) * (-17205)) ^ (-1709499789);
                        i12 = iM559714 ^ 750692495;
                        s = s;
                    }
                    break;
                case -1355062139:
                case 466564377:
                    str3 = "";
                    short[] sArr9 = f82042;
                    if (C1404.m56468()) {
                        int iM559715 = (C0946.m55979("ۗ۟") + i9) * (-91);
                        i4 = ((iM559715 ^ i10) * 11347) ^ (-676979101);
                        i2 = 426229307;
                        iM55979 = iM559715;
                        i3 = i19;
                        sArr = sArr9;
                        s = s;
                        i5 = 10;
                    } else {
                        sArr5 = sArr9;
                        i7 = 10;
                        str = strM56189;
                        strM56325 = str4;
                        i6 = i19;
                        int iM55684 = C0873.m55680("۠᩸") ^ i9;
                        String str8 = str3;
                        int i211 = ((iM55684 ^ i10) * 24023) ^ (-702850597);
                        i2 = -2111660121;
                        short[] sArr10 = sArr5;
                        iM55979 = iM55684;
                        strM56189 = str;
                        i5 = i7;
                        i4 = i211;
                        str3 = str8;
                        sArr = sArr10;
                        short[] sArr11 = sArr4;
                        i3 = i6;
                        str4 = strM56325;
                        sArr4 = sArr11;
                    }
                    int i212 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i213 = i3;
                    i11 = i4;
                    i12 = i212;
                    sArr5 = sArr;
                    i19 = i213;
                    break;
                case -1341874886:
                case 1033070548:
                    f24358 = new String[]{str3, str4, C1036.m56252(sArr4, 15, 7, i13), strM55863, strM56189};
                    return;
                case -1307482434:
                case -824116635:
                    strM56189 = C1017.m56189(sArr3, i16, 3, i13);
                    if (AbstractC0942.f81890 <= 0) {
                        i3 = i19;
                        i = i20;
                        s = s;
                        sArr = sArr5;
                        iM55979 = (C0873.m55680("ܶۚ") + i10) * (-99);
                        i5 = i;
                        i4 = ((iM55979 ^ i9) * (-6777)) ^ 325576787;
                        strM56189 = strM56189;
                        i2 = 279429560;
                    } else {
                        int iM559716 = C0946.m55979("᩵ۡ") ^ i9;
                        i4 = ((iM559716 ^ i10) * 20749) ^ 46772362;
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM559716;
                        s = s;
                        i5 = i20;
                        i2 = 323488221;
                    }
                    int i214 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i215 = i3;
                    i11 = i4;
                    i12 = i214;
                    sArr5 = sArr;
                    i19 = i215;
                    break;
                case -1262857705:
                case -300538883:
                    i14 = 1;
                    i15 = 6;
                    if (C1964.f83032 <= 0) {
                        i3 = i19;
                        i = i20;
                        s = s;
                        sArr = sArr5;
                        iM55979 = (C0873.m55680("ܶۚ") + i10) * (-99);
                        i5 = i;
                        i4 = ((iM55979 ^ i9) * (-6777)) ^ 325576787;
                        strM56189 = strM56189;
                        i2 = 279429560;
                    } else {
                        int iM55685 = (i9 - C0873.m55680("᩹ۚ")) * (-127);
                        i4 = ((iM55685 ^ i10) * (-6071)) ^ 1295316322;
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM55685;
                        s = s;
                        i5 = i20;
                        i2 = -659334038;
                    }
                    int i216 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i217 = i3;
                    i11 = i4;
                    i12 = i216;
                    sArr5 = sArr;
                    i19 = i217;
                    break;
                case -1201012343:
                case 1479217924:
                    sArr2 = f82042;
                    if (C1053.m56327() < 0) {
                        int iM559717 = (i10 - C0946.m55979("᩶ۛ")) * (-93);
                        i4 = ((iM559717 ^ i9) * (-27093)) ^ (-509821401);
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM559717;
                        s = s;
                        i5 = i20;
                        i2 = -1243727816;
                        int i218 = iM55979 ^ i2;
                        i20 = i5;
                        s = s;
                        int i219 = i3;
                        i11 = i4;
                        i12 = i218;
                        sArr5 = sArr;
                        i19 = i219;
                    } else {
                        s = s;
                        int iM559718 = C0946.m55979("ᩴۘ") ^ i9;
                        i11 = ((iM559718 ^ i10) * (-17205)) ^ (-1709499789);
                        i12 = iM559718 ^ 750692495;
                        s = s;
                    }
                    break;
                case -853812631:
                case -272555960:
                    s = f82042[0];
                    if (C1025.f81947 >= 0) {
                        str2 = strM56189;
                        iM559710 = C0946.m55979("ۙ᩸") ^ i9;
                        i11 = 517775398 ^ ((iM559710 ^ i10) * 27713);
                        i8 = 156167691;
                    } else {
                        iM559710 = C0946.m55979("ۗ᩷") ^ i10;
                        i11 = ((iM559710 ^ i9) * 10603) ^ 381543157;
                        str2 = strM56189;
                        i8 = 970777329;
                    }
                    i12 = i8 ^ iM559710;
                    strM56189 = str2;
                    s = s;
                    break;
                case -539960600:
                case -326352080:
                    f24359 = new SecureRandom();
                    if (C1028.f81950 <= 0) {
                        i3 = i19;
                        i = i20;
                        s = s;
                        sArr = sArr5;
                        iM55979 = (C0873.m55680("ܶۚ") + i10) * (-99);
                        i5 = i;
                        i4 = ((iM55979 ^ i9) * (-6777)) ^ 325576787;
                        strM56189 = strM56189;
                        i2 = 279429560;
                    } else {
                        int iM559719 = (i10 - C0946.m55979("ۙ᩻")) * (-77);
                        i4 = ((iM559719 ^ i9) * (-12345)) ^ (-629130595);
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM559719;
                        s = s;
                        i5 = i20;
                        i2 = 1184277436;
                    }
                    int i2110 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i2111 = i3;
                    i11 = i4;
                    i12 = i2110;
                    sArr5 = sArr;
                    i19 = i2111;
                    break;
                case -311145564:
                case 493883547:
                    i13 = 55391;
                    int iM55686 = (i9 - C0873.m55680("᩹ܰ")) * 69;
                    i4 = ((iM55686 ^ i10) * 25) ^ 1477207071;
                    i3 = i19;
                    sArr = sArr5;
                    iM55979 = iM55686;
                    s = s;
                    i5 = i20;
                    i2 = -1506102075;
                    int i2112 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i2113 = i3;
                    i11 = i4;
                    i12 = i2112;
                    sArr5 = sArr;
                    i19 = i2113;
                    break;
                case -170460017:
                case 1255489863:
                    i13 = 388;
                    int iM55687 = (i9 - C0873.m55680("᩹ܰ")) * 69;
                    i4 = ((iM55687 ^ i10) * 25) ^ 1477207071;
                    i3 = i19;
                    sArr = sArr5;
                    iM55979 = iM55687;
                    s = s;
                    i5 = i20;
                    i2 = -1506102075;
                    int i2114 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i2115 = i3;
                    i11 = i4;
                    i12 = i2114;
                    sArr5 = sArr;
                    i19 = i2115;
                    break;
                case 30017404:
                case 1630711495:
                    C1036.m56257();
                    if (C1046.f81962 > 0) {
                        s = s;
                        int iM5597110 = C0946.m55979("ᩴۘ") ^ i9;
                        i11 = ((iM5597110 ^ i10) * (-17205)) ^ (-1709499789);
                        i12 = iM5597110 ^ 750692495;
                        s = s;
                    } else {
                        s = s;
                        str2 = strM56189;
                        int iM55688 = C0873.m55680("֡᩵") ^ i10;
                        i4 = ((iM55688 ^ i9) * (-30819)) ^ 1537244971;
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM55688;
                        strM56189 = str2;
                        i5 = i20;
                        i2 = -185518047;
                        int i2116 = iM55979 ^ i2;
                        i20 = i5;
                        s = s;
                        int i2117 = i3;
                        i11 = i4;
                        i12 = i2116;
                        sArr5 = sArr;
                        i19 = i2117;
                    }
                    break;
                case 279573677:
                case 427424602:
                    strM55863 = C0927.m55863(sArr2, i14, i15, i13);
                    sArr3 = f82042;
                    i16 = 7;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        s = s;
                        str2 = strM56189;
                        int iM55689 = C0873.m55680("֡᩵") ^ i10;
                        i4 = ((iM55689 ^ i9) * (-30819)) ^ 1537244971;
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM55689;
                        strM56189 = str2;
                        i5 = i20;
                        i2 = -185518047;
                    } else {
                        int iM559720 = C0946.m55979("֫ܰ") ^ i10;
                        i4 = ((iM559720 ^ i9) * 21715) ^ 480798494;
                        i3 = i19;
                        sArr = sArr5;
                        iM55979 = iM559720;
                        s = s;
                        i5 = i20;
                        i2 = 1594069930;
                    }
                    int i2118 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i2119 = i3;
                    i11 = i4;
                    i12 = i2118;
                    sArr5 = sArr;
                    i19 = i2119;
                    break;
                case 607753635:
                case 1758932242:
                    C0898.m55800();
                    break;
                case 1663575978:
                case 1695690751:
                    C1012.m56134();
                    i7 = i20;
                    str = strM56189;
                    strM56325 = str4;
                    i6 = i19;
                    int iM556810 = C0873.m55680("۠᩸") ^ i9;
                    String str9 = str3;
                    int i2120 = ((iM556810 ^ i10) * 24023) ^ (-702850597);
                    i2 = -2111660121;
                    short[] sArr12 = sArr5;
                    iM55979 = iM556810;
                    strM56189 = str;
                    i5 = i7;
                    i4 = i2120;
                    str3 = str9;
                    sArr = sArr12;
                    short[] sArr13 = sArr4;
                    i3 = i6;
                    str4 = strM56325;
                    sArr4 = sArr13;
                    int i21110 = iM55979 ^ i2;
                    i20 = i5;
                    s = s;
                    int i21111 = i3;
                    i11 = i4;
                    i12 = i21110;
                    sArr5 = sArr;
                    i19 = i21111;
                    break;
                default:
                    C0937.m55918();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22876 m20776(String str) {
        int i = 1574781702;
        int i2 = C0873.f81841;
        int i3 = C0930.f81879;
        int iM55680 = C0873.m55680("ۢ᩵") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-13295)) ^ 1413669340;
        int i5 = -349368871;
        while (true) {
            i = ((((i ^ i3) * 6777) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1417913803:
                case -742088126:
                    if (!C0937.f81884) {
                        iM55680 = (C0946.m55979("۫۟") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * 16405) ^ 1183422652;
                        i5 = 1509371859;
                    } else {
                        iM55680 = C0946.m55979("ۗ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3181) ^ 758923581;
                        i5 = -949840517;
                    }
                    break;
                case -1315107508:
                case 415545091:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("۫۟") ^ i3) * 77;
                        i4 = ((iM55680 ^ i2) * 16405) ^ 1183422652;
                        i5 = 1509371859;
                    } else if (C0927.f81875) {
                        iM55680 = (C0946.m55979("ۢܺ") ^ i3) * 7;
                        i4 = ((iM55680 ^ i2) * (-7381)) ^ 51629620;
                        i5 = -1525189336;
                    } else {
                        if (!C0917.f81868 && C0898.m55800() > 0) {
                            if (C0873.f81841 <= 0) {
                                iM55680 = C0873.m55680("ۘܶ") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-349)) ^ 1286616182;
                                i5 = 571908529;
                            } else {
                                if (C0967.f81910 < 0 && C1003.m56123() == 0) {
                                    if (C1044.m56286() > 0) {
                                        if (!C1024.f81946) {
                                            Application applicationM56136 = C1012.m56136();
                                            if (C1964.f83032 > 0) {
                                                return new C22876(new File(applicationM56136.getNoBackupFilesDir(), str));
                                            }
                                        }
                                    }
                                }
                                iM55680 = C0946.m55979("ۗ۬") ^ i2;
                                i4 = ((iM55680 ^ i3) * 3181) ^ 758923581;
                                i5 = -949840517;
                            }
                        }
                        iM55680 = C0873.m55680("ۖܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3301)) ^ (-390612396);
                        i5 = -2050891542;
                    }
                    break;
                case -1081125006:
                case -500737238:
                    C0906.m55809();
                    iM55680 = C0946.m55979("ۗ۬") ^ i2;
                    i4 = ((iM55680 ^ i3) * 3181) ^ 758923581;
                    i5 = -949840517;
                    break;
                case -37258411:
                case 2024183209:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("ۢܺ") ^ i3) * 7;
                        i4 = ((iM55680 ^ i2) * (-7381)) ^ 51629620;
                        i5 = -1525189336;
                    } else {
                        iM55680 = C0946.m55979("ۗ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3181) ^ 758923581;
                        i5 = -949840517;
                    }
                    break;
                case 1263921273:
                case 1457951593:
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("ۘܶ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-349)) ^ 1286616182;
                        i5 = 571908529;
                    } else {
                        iM55680 = C0946.m55979("ۗ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3181) ^ 758923581;
                        i5 = -949840517;
                    }
                    break;
                default:
                    ViewOnClickListenerC0939.m55941();
                    C0967.m56074();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m20784(String str) {
        boolean zM56397 = false;
        boolean z = false;
        int i = 0;
        char cM55712 = 0;
        int i2 = 1082952165;
        int i3 = RunnableC0871.f81839;
        int i4 = C0866.f81837;
        int iM55680 = C0873.m55680("ۘۖ") ^ i4;
        int i5 = ((iM55680 ^ i3) * 16827) ^ 1340612469;
        int i6 = 1182407945;
        while (true) {
            i2 = ((((i2 ^ i3) * 28629) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1985558073:
                case 652872732:
                    z = false;
                    if (zM56397) {
                        iM55680 = C0873.m55680("ܶۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    } else {
                        iM55680 = (C0873.m55680("ۚܶ") + i3) * 17;
                        i5 = ((iM55680 ^ i4) * 3733) ^ (-1499346310);
                        i6 = -1711300263;
                    }
                    break;
                case -1745992286:
                case 963293420:
                    C1025.m56230();
                    if (C0946.m55980() == 0) {
                        iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        iM55680 = C0946.m55979("᩵ۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    }
                    break;
                case -1722183180:
                case 1674936423:
                    zM56397 = C1194.m56397(str);
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        iM55680 = C0873.m55680("ᩳ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * 7679) ^ (-898436846);
                        i6 = 2006341162;
                    }
                    break;
                case -1685789066:
                case 2010990051:
                    cM55712 = C0882.m55712(str, i);
                    if (cM55712 >= '!') {
                        iM55680 = (C0946.m55979("ۚۧ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55680 ^ i4) * (-27557)) ^ (-971706961);
                        i6 = -477903019;
                    } else {
                        iM55680 = C0873.m55680("ܶۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    }
                    break;
                case -1607127390:
                case 915638656:
                    if (C0882.m55719(str) > 1024) {
                        iM55680 = C0873.m55680("ܶۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    } else {
                        iM55680 = C0873.m55680("᩸ܰ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-1409)) ^ (-689078570);
                        i6 = 277765935;
                    }
                    break;
                case -1587855288:
                case 1746415919:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        iM55680 = C0946.m55979("ۘ֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 15387) ^ 107729182;
                        i6 = -221634199;
                    }
                    break;
                case -1580921714:
                case -1496216598:
                    C1036.m56257();
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0946.m55979("᩵ۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    } else {
                        iM55680 = (i4 - C0946.m55979("۬᩵")) * 123;
                        i5 = ((iM55680 ^ i3) * 20117) ^ 1742841869;
                        i6 = 318459747;
                    }
                    break;
                case -1451087448:
                case 198309864:
                    return z;
                case -1424476636:
                case 1205900022:
                    i++;
                    iM55680 = C0946.m55979("۫۟") ^ i3;
                    i5 = ((iM55680 ^ i4) * 27313) ^ (-280402316);
                    i6 = -1837300439;
                    break;
                case -1201213039:
                case -558613900:
                    return true;
                case -1127576168:
                case -1104686020:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("᩵ۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۨۖ")) * (-33);
                        i5 = ((iM55680 ^ i3) * 17803) ^ 1084451243;
                        i6 = 1419138404;
                    }
                    break;
                case -810667372:
                case 415478702:
                    i = 0;
                    iM55680 = C0946.m55979("۫۟") ^ i3;
                    i5 = ((iM55680 ^ i4) * 27313) ^ (-280402316);
                    i6 = -1837300439;
                    break;
                case -611232555:
                case -289624154:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("ۤۧ") ^ i4) * 97;
                        i5 = ((iM55680 ^ i3) * (-19067)) ^ 32041743;
                        i6 = 715583850;
                    } else {
                        iM55680 = (i4 - C0946.m55979("۬᩵")) * 123;
                        i5 = ((iM55680 ^ i3) * 20117) ^ 1742841869;
                        i6 = 318459747;
                    }
                    break;
                case -554546422:
                case -536460849:
                    if (C0930.m55885() <= 0) {
                        iM55680 = (i4 - C0946.m55979("᩻ۘ")) * (-49);
                        i5 = ((iM55680 ^ i3) * (-17337)) ^ 1723473661;
                        i6 = 1940932726;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۛܶ")) * (-55);
                        i5 = ((iM55680 ^ i4) * (-24223)) ^ 1246397932;
                        i6 = 1655541587;
                    }
                    break;
                case -534474891:
                case 662555517:
                    C0866.m55645();
                    return false;
                case -325193020:
                case 1860825218:
                    C1012.m56134();
                    C0949.m56012();
                    iM55680 = (i4 - C0946.m55979("۬᩵")) * 123;
                    i5 = ((iM55680 ^ i3) * 20117) ^ 1742841869;
                    i6 = 318459747;
                    break;
                case 83310710:
                case 1673962315:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        iM55680 = (C0873.m55680("ܿۧ") ^ i4) * (-29);
                        i5 = ((iM55680 ^ i3) * 26257) ^ (-1844289426);
                        i6 = -1606487508;
                    }
                    break;
                case 193341394:
                case 2027474654:
                    if (i < C0882.m55719(str)) {
                        iM55680 = C0946.m55979("᩶ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-18649)) ^ (-1029931123);
                        i6 = 1151634417;
                    } else {
                        iM55680 = (C0946.m55979("ۢۨ") + i3) * (-113);
                        i5 = ((iM55680 ^ i4) * 651) ^ (-1981643603);
                        i6 = -640232785;
                    }
                    break;
                case 316701047:
                case 1695614703:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0946.m55979("ۤۧ") ^ i4) * 97;
                        i5 = ((iM55680 ^ i3) * (-19067)) ^ 32041743;
                        i6 = 715583850;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۧᩳ")) * (-81);
                        i5 = ((iM55680 ^ i4) * 1969) ^ 465241683;
                        i6 = 609650822;
                    }
                    break;
                case 415895917:
                case 902711245:
                    if (C1194.f82045 != 0) {
                        iM55680 = (C0946.m55979("ۤۧ") ^ i4) * 97;
                        i5 = ((iM55680 ^ i3) * (-19067)) ^ 32041743;
                        i6 = 715583850;
                    } else {
                        iM55680 = C0873.m55680("ۡۗ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 5317) ^ 1395731175;
                        i6 = 1059441626;
                    }
                    break;
                case 721438281:
                case 1719652323:
                    if (cM55712 > '~') {
                        iM55680 = C0873.m55680("ܶۛ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    } else {
                        iM55680 = (C0946.m55979("۫ۜ") ^ i4) * (-53);
                        i5 = ((iM55680 ^ i3) * (-9475)) ^ (-1001543465);
                        i6 = 1723604514;
                    }
                    break;
                case 822925970:
                case 878356544:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        iM55680 = C0946.m55979("ۖܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 8679) ^ (-687988791);
                        i6 = 624011536;
                    }
                    break;
                case 1584101230:
                case 1798375189:
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("ۛۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 19469) ^ (-1393666797);
                        i6 = -1171092553;
                    } else {
                        iM55680 = C0946.m55979("᩵ۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    }
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0873.m55680("ۜۘ") ^ i3) * 67;
                        i5 = ((iM55680 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55680 ^ i3) * 1601) ^ (-1043969745);
                        i6 = 1193753472;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0371  */
    /* JADX WARN: Code duplicated, block: B:111:0x03be  */
    /* JADX WARN: Code duplicated, block: B:115:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:119:0x0425  */
    /* JADX WARN: Code duplicated, block: B:123:0x0458  */
    /* JADX WARN: Code duplicated, block: B:127:0x0486  */
    /* JADX WARN: Code duplicated, block: B:133:0x04c1 A[PHI: r18
      0x04c1: PHI (r18v3 long) = (r18v1 long), (r18v1 long), (r18v5 long) binds: [B:106:0x039e, B:9:0x0059, B:132:0x04bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0294  */
    /* JADX WARN: Code duplicated, block: B:92:0x0305 A[PHI: r3 r5
      0x0305: PHI (r3v3 long) = 
      (r3v2 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
      (r3v1 long)
     binds: [B:90:0x02ec, B:85:0x02c8, B:82:0x02ad, B:75:0x025f, B:72:0x023f, B:69:0x0221, B:66:0x0215, B:63:0x01f8, B:42:0x00f8, B:37:0x00d3, B:135:0x0305] A[DONT_GENERATE, DONT_INLINE]
      0x0305: PHI (r5v3 int) = 
      (r5v1 int)
      (r5v2 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
     binds: [B:90:0x02ec, B:85:0x02c8, B:82:0x02ad, B:75:0x025f, B:72:0x023f, B:69:0x0221, B:66:0x0215, B:63:0x01f8, B:42:0x00f8, B:37:0x00d3, B:135:0x0305] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ */
    public static void m20783(C25085 c25085) throws C19050 {
        int iM55680;
        int i;
        int i2;
        C25085 c25086 = c25085;
        long j = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        String[] strArr = null;
        int i5 = 0;
        byte[] bArrDecode = null;
        int length = 0;
        boolean zM55806 = false;
        int i6 = 27522665;
        int i7 = C1046.f81962;
        int i8 = C1017.f81942;
        int iM55681 = C0873.m55680("ۜܰ") ^ i7;
        int i9 = ((iM55681 ^ i8) * 10173) ^ (-1522486320);
        int i10 = iM55681 ^ 1043211646;
        long j2 = 0;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i8) * 10077) >> 31));
            switch (i6) {
                case -2087052242:
                case -1707333761:
                    if (C0927.m55878(c25086.f80028) <= 43) {
                        iM55680 = C0946.m55979("ۚ֫") ^ i7;
                        i = ((iM55680 ^ i8) * 9161) ^ 1870556606;
                        i2 = 936279525;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i11 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11;
                    break;
                case -1856057821:
                case -335362451:
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0873.m55680("ᩳܺ") + i8) * (-21);
                        i = ((iM55680 ^ i7) * (-14153)) ^ (-659111856);
                        i2 = -27867037;
                    } else {
                        iM55680 = (C0946.m55979("ۛ᩵") ^ i8) * 15;
                        i = ((iM55680 ^ i7) * (-2037)) ^ (-490468032);
                        i2 = 1910278929;
                    }
                    int i12 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i12;
                    break;
                case -1821764879:
                case -540294179:
                    throw new C19050();
                case -1818926736:
                case 94103670:
                    bArrDecode = Base64.decode(str2, i4);
                    length = bArrDecode.length;
                    iM55680 = (C0873.m55680("ۡۜ") + i8) * (-3);
                    i = ((iM55680 ^ i7) * (-12995)) ^ (-2111559786);
                    i2 = -1423022482;
                    int i13 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i13;
                    break;
                case -1745864276:
                case 560879237:
                    if (c25086.f80027 != j) {
                        iM55680 = (C0946.m55979("᩷᩻") ^ i7) * (-21);
                        i = ((iM55680 ^ i8) * (-21937)) ^ (-310597132);
                        i2 = 1657178799;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i14 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i14;
                    break;
                case -1634111177:
                case -1088646460:
                    if (C0866.f81837 < 0) {
                        iM55680 = (C0873.m55680("ܶۜ") + i7) * (-29);
                        i = ((iM55680 ^ i8) * 8531) ^ (-1341059527);
                        i2 = -955406358;
                    } else {
                        iM55680 = C0946.m55979("᩻ᩴ") ^ i8;
                        i = ((iM55680 ^ i7) * (-3497)) ^ (-1671805294);
                        i2 = -107334521;
                    }
                    int i15 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i15;
                    break;
                case -1590722050:
                case 572245154:
                    C1071.m56343();
                    RunnableC1014.m56177();
                    return;
                case -1547731345:
                case -1533670045:
                    if (C0906.m55806(strArr[i5], str)) {
                        iM55680 = (C0946.m55979("ܿ֫") ^ i8) * (-123);
                        i = ((iM55680 ^ i7) * 28265) ^ (-1233447455);
                        i2 = 653827930;
                    } else {
                        iM55680 = C0873.m55680("֨ۧ") ^ i7;
                        i = ((iM55680 ^ i8) * 10477) ^ (-1162526901);
                        i2 = 2071087441;
                    }
                    int i16 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i16;
                    break;
                case -1445428436:
                case 1216364158:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("᩻ᩴ") ^ i8;
                        i = ((iM55680 ^ i7) * (-3497)) ^ (-1671805294);
                        i2 = -107334521;
                    } else {
                        iM55680 = C0946.m55979("᩺᩷") ^ i8;
                        i = ((iM55680 ^ i7) * 12279) ^ 145155277;
                        i2 = 829499932;
                    }
                    int i17 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i17;
                    break;
                case -1353328613:
                case -1271711734:
                    if (RunnableC1014.m56177()) {
                        iM55680 = C0946.m55979("֨᩷") ^ i7;
                        i = ((iM55680 ^ i8) * 20151) ^ 1532044402;
                        i2 = 1872454502;
                    } else {
                        iM55680 = (C0873.m55680("ᩳܺ") + i8) * (-21);
                        i = ((iM55680 ^ i7) * (-14153)) ^ (-659111856);
                        i2 = -27867037;
                    }
                    int i18 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i18;
                    break;
                case -1317137891:
                case 1455444982:
                    str2 = c25086.f80028;
                    i4 = 11;
                    iM55680 = C0946.m55979("ܿܳ") ^ i7;
                    i = ((iM55680 ^ i8) * (-6201)) ^ (-614991031);
                    i2 = -983819261;
                    int i19 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i19;
                    break;
                case -1288582323:
                case 990273421:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i7 - C0946.m55979("ܶ۬")) * 45;
                        i = ((iM55680 ^ i8) * (-30977)) ^ 1846256365;
                        i2 = 413584990;
                    } else {
                        iM55680 = (i8 - C0873.m55680("ۧ۫")) * (-13);
                        i = ((iM55680 ^ i7) * 25505) ^ (-1744489052);
                        i2 = 1274161358;
                    }
                    int i110 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i110;
                    break;
                case -1286231459:
                case -1075975184:
                    try {
                        zM55806 = C0906.m55806(str2, Base64.encodeToString(bArrDecode, i4));
                        iM55680 = (C0946.m55979("۟᩵") ^ i7) * (-19);
                        i = ((iM55680 ^ i8) * (-30719)) ^ 907223819;
                        i2 = -2132562888;
                    } catch (IllegalArgumentException unused) {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i111 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i111;
                    break;
                case -1095448614:
                case -275355381:
                    C0927.m55873();
                    if (C0877.f81843 < 0) {
                        iM55680 = C0946.m55979("ۨ᩹") ^ i8;
                        i = ((iM55680 ^ i7) * (-32413)) ^ 513038504;
                        i2 = 1888910629;
                    } else {
                        iM55680 = (C0873.m55680("ᩳܺ") + i8) * (-21);
                        i = ((iM55680 ^ i7) * (-14153)) ^ (-659111856);
                        i2 = -27867037;
                    }
                    int i112 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i112;
                    break;
                case -1077168847:
                case 1627864403:
                    if (C0882.m55719(c25086.f80030) <= 1024) {
                        iM55680 = C0946.m55979("֫۟") ^ i8;
                        i = ((iM55680 ^ i7) * (-7967)) ^ (-1901719845);
                        i2 = -1664218258;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i113 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i113;
                    break;
                case -1001378512:
                case 2053820758:
                    throw new C19050();
                case -961751758:
                case 1299689904:
                    if (C0927.m55878(c25086.f80033) <= 256) {
                        iM55680 = (C0946.m55979("ܺۛ") + i7) * 109;
                        i = ((iM55680 ^ i8) * (-30395)) ^ 936572848;
                        i2 = -156069308;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i114 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i114;
                    break;
                case -872227126:
                case 818162878:
                    str = c25086.f80032;
                    i5 = 0;
                    iM55680 = (C0873.m55680("᩸ᩴ") + i8) * (-81);
                    i = ((iM55680 ^ i7) * (-3901)) ^ 1665241265;
                    i2 = -163991249;
                    int i115 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i115;
                    break;
                case -737450552:
                case 1759994893:
                    long j3 = c25086.f80027;
                    if (C0866.f81837 >= 0) {
                        j2 = j3;
                        iM55680 = C0946.m55979("᩻ᩴ") ^ i8;
                        i = ((iM55680 ^ i7) * (-3497)) ^ (-1671805294);
                        i2 = -107334521;
                        int i116 = i;
                        i10 = iM55680 ^ i2;
                        i9 = i116;
                    } else {
                        int iM55682 = C0873.m55680("᩹᩹") ^ i8;
                        j2 = j3;
                        i10 = iM55682 ^ (-1674980800);
                        i9 = ((iM55682 ^ i7) * (-29889)) ^ 862297655;
                        c25086 = c25085;
                    }
                    break;
                case -713492729:
                case 1844582330:
                    if (C1194.m56397(c25086.f80029)) {
                        iM55680 = (C0946.m55979("᩷᩻") ^ i7) * (-21);
                        i = ((iM55680 ^ i8) * (-21937)) ^ (-310597132);
                        i2 = 1657178799;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩹") ^ i8;
                        i = ((iM55680 ^ i7) * 1791) ^ 824279685;
                        i2 = -1686313065;
                    }
                    int i117 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i117;
                    break;
                case -523540117:
                case 497670678:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۨ᩹") ^ i8;
                        i = ((iM55680 ^ i7) * (-32413)) ^ 513038504;
                        i2 = 1888910629;
                    } else {
                        iM55680 = C0946.m55979("֫۫") ^ i7;
                        i = ((iM55680 ^ i8) * 13337) ^ 467938196;
                        i2 = -486927347;
                    }
                    int i118 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i118;
                    break;
                case -421239996:
                case 492048452:
                    return;
                case -260174517:
                case 1254429307:
                    if (m20784(c25086.f80029)) {
                        iM55680 = C0873.m55680("ᩳ֫") ^ i8;
                        i = ((iM55680 ^ i7) * (-1805)) ^ 1137543974;
                        i2 = 1179257982;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i119 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i119;
                    break;
                case -176736269:
                case -170373429:
                    ServiceConnectionC1013.m56157();
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0873.m55680("ᩴ֫") + i7) * 109;
                        i = ((iM55680 ^ i8) * (-23387)) ^ 1492086317;
                        i2 = 446694669;
                    } else {
                        iM55680 = (C0873.m55680("ܶۜ") + i7) * (-29);
                        i = ((iM55680 ^ i8) * 8531) ^ (-1341059527);
                        i2 = -955406358;
                    }
                    int i1110 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1110;
                    break;
                case -159760595:
                case 307740444:
                    if (C0866.m55645()) {
                        iM55680 = C0873.m55680("᩶᩵") ^ i8;
                        i = ((iM55680 ^ i7) * 3773) ^ 1016496302;
                        i2 = -1536709753;
                    } else {
                        iM55680 = (C0946.m55979("ۛ᩵") ^ i8) * 15;
                        i = ((iM55680 ^ i7) * (-2037)) ^ (-490468032);
                        i2 = 1910278929;
                    }
                    int i1111 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1111;
                    break;
                case -127969358:
                case 1991779112:
                    j = 0;
                    if (j2 >= 0) {
                        iM55680 = (C0946.m55979("ۗۗ") + i7) * (-73);
                        i = ((iM55680 ^ i8) * 9557) ^ 1383571402;
                        i2 = 359855128;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i1112 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1112;
                    break;
                case 101520682:
                case 673216404:
                    if (C0967.m56074()) {
                        iM55680 = (C0873.m55680("ᩳܺ") + i8) * (-21);
                        i = ((iM55680 ^ i7) * (-14153)) ^ (-659111856);
                        i2 = -27867037;
                    } else {
                        iM55680 = C0946.m55979("۫۟") ^ i7;
                        i = ((iM55680 ^ i8) * 21449) ^ (-1156631639);
                        i2 = 1157506131;
                    }
                    int i1113 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1113;
                    break;
                case 171278577:
                case 2017674998:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ܶۜ") + i7) * (-29);
                        i = ((iM55680 ^ i8) * 8531) ^ (-1341059527);
                        i2 = -955406358;
                    } else {
                        iM55680 = C0873.m55680("ܰᩴ") ^ i7;
                        i = ((iM55680 ^ i8) * (-26659)) ^ 1181976357;
                        i2 = -436688722;
                    }
                    int i1114 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1114;
                    break;
                case 230171763:
                case 1432268789:
                    strArr = f24358;
                    if (i5 < strArr.length) {
                        iM55680 = (C0946.m55979("ۧ֡") + i7) * (-57);
                        i = ((iM55680 ^ i8) * 25233) ^ (-1490749935);
                        i2 = 257218024;
                    } else {
                        iM55680 = (C0946.m55979("ۧۙ") + i8) * 49;
                        i = ((iM55680 ^ i7) * 22349) ^ (-402711213);
                        i2 = -77701759;
                    }
                    int i1115 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1115;
                    break;
                case 267382085:
                case 1535069049:
                    if (zM55806) {
                        iM55680 = (C0873.m55680("ᩴۗ") + i7) * 127;
                        i = ((iM55680 ^ i8) * 2873) ^ (-147005912);
                        i2 = 1062847432;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i1116 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1116;
                    break;
                case 305619872:
                case 377503560:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ۛ᩵") ^ i8) * 15;
                        i = ((iM55680 ^ i7) * (-2037)) ^ (-490468032);
                        i2 = 1910278929;
                    } else {
                        iM55680 = (C0873.m55680("֨᩶") + i8) * (-123);
                        i = ((iM55680 ^ i7) * 22523) ^ (-996052323);
                        i2 = -831624013;
                    }
                    int i1117 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1117;
                    break;
                case 469886830:
                case 1301516586:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (C0873.m55680("ᩳܺ") + i8) * (-21);
                        i = ((iM55680 ^ i7) * (-14153)) ^ (-659111856);
                        i2 = -27867037;
                    } else {
                        iM55680 = C0873.m55680("ܽ֫") ^ i7;
                        i = ((iM55680 ^ i8) * 20895) ^ (-1057281542);
                        i2 = 1560083544;
                    }
                    int i1118 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1118;
                    break;
                case 489872692:
                case 1429637273:
                    i3 = c25086.f80026;
                    if (i3 >= 1) {
                        iM55680 = (i7 - C0873.m55680("ۢ۬")) * 91;
                        i = ((iM55680 ^ i8) * (-2239)) ^ 218934456;
                        i2 = -1151836755;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i1119 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i1119;
                    break;
                case 521165142:
                case 1977477490:
                    if (C0912.m55833()) {
                        iM55680 = (C0873.m55680("ᩴ֫") + i7) * 109;
                        i = ((iM55680 ^ i8) * (-23387)) ^ 1492086317;
                        i2 = 446694669;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۤۙ")) * (-107);
                        i = ((iM55680 ^ i8) * (-31853)) ^ 178039202;
                        i2 = -224870556;
                    }
                    int i11110 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11110;
                    break;
                case 570171583:
                case 1180696887:
                    if (length == 32) {
                        iM55680 = (i7 - C0873.m55680("ۚ۬")) * 83;
                        i = ((iM55680 ^ i8) * (-301)) ^ (-1530976782);
                        i2 = -1874615598;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i11111 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11111;
                    break;
                case 588316679:
                case 1507943107:
                    C1053.m56327();
                    if (C0861.m55626()) {
                        iM55680 = C0946.m55979("ۨ᩹") ^ i8;
                        i = ((iM55680 ^ i7) * (-32413)) ^ 513038504;
                        i2 = 1888910629;
                    } else {
                        iM55680 = (C0873.m55680("ᩴ֫") + i7) * 109;
                        i = ((iM55680 ^ i8) * (-23387)) ^ 1492086317;
                        i2 = 446694669;
                    }
                    int i11112 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11112;
                    break;
                case 648303007:
                case 1644426914:
                    if (i3 <= 255) {
                        iM55680 = C0873.m55680("֫ۡ") ^ i8;
                        i = ((iM55680 ^ i7) * 32677) ^ 1407915258;
                        i2 = 79777243;
                    } else {
                        iM55680 = (i8 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i7) * (-17031)) ^ 1052648672;
                        i2 = 441311943;
                    }
                    int i11113 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11113;
                    break;
                case 767256009:
                case 1893820648:
                    i5++;
                    iM55680 = (C0873.m55680("᩸ᩴ") + i8) * (-81);
                    i = ((iM55680 ^ i7) * (-3901)) ^ 1665241265;
                    i2 = -163991249;
                    int i11114 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11114;
                    break;
                case 849122972:
                case 943244097:
                    C1028.m56247();
                    if (C0906.f81862 < 0) {
                        iM55680 = C0946.m55979("ۨ᩹") ^ i8;
                        i = ((iM55680 ^ i7) * (-32413)) ^ 513038504;
                        i2 = 1888910629;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ܶ۬")) * 45;
                        i = ((iM55680 ^ i8) * (-30977)) ^ 1846256365;
                        i2 = 413584990;
                    }
                    int i11115 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11115;
                    break;
                case 903408600:
                case 1353259148:
                    C0890.m55740();
                    C1025.m56230();
                    iM55680 = C0946.m55979("ۨ᩹") ^ i8;
                    i = ((iM55680 ^ i7) * (-32413)) ^ 513038504;
                    i2 = 1888910629;
                    int i11116 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11116;
                    break;
                case 961687566:
                case 1817397554:
                    if (C0917.m55854()) {
                        iM55680 = C0946.m55979("ۡۤ") ^ i8;
                        i = ((iM55680 ^ i7) * (-23937)) ^ 2077887656;
                        i2 = -1493044415;
                    } else {
                        iM55680 = (C0946.m55979("ܺ᩸") ^ i7) * 55;
                        i = ((iM55680 ^ i8) * 24161) ^ 1191963462;
                        i2 = 442457179;
                    }
                    int i11117 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11117;
                    break;
                default:
                    if (C1194.m56397(c25086.f80028)) {
                        iM55680 = (C0873.m55680("ᩴۗ") + i7) * 127;
                        i = ((iM55680 ^ i8) * 2873) ^ (-147005912);
                        i2 = 1062847432;
                    } else {
                        iM55680 = (C0946.m55979("ۖ֫") ^ i8) * (-113);
                        i = ((iM55680 ^ i7) * (-18447)) ^ 692055869;
                        i2 = 976800615;
                    }
                    int i11118 = i;
                    i10 = iM55680 ^ i2;
                    i9 = i11118;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m20775(byte[] bArr) {
        int iM55979;
        int i;
        byte[] bArrDigest = null;
        int i2 = -1316473382;
        int i3 = AbstractC0942.f81890;
        int i4 = C1404.f82149;
        int iM559710 = (C0946.m55979("ۧۚ") ^ i3) * (-57);
        int i5 = ((iM559710 ^ i4) * 5517) ^ (-619242538);
        int i6 = -151045098;
        while (true) {
            int i7 = iM559710 ^ i6;
            C11996 c11996 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 19833) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1852635279:
                    case 434787506:
                        c11996.write(bArrDigest);
                        return c11996.m27464();
                    case -1674180080:
                    case 912233297:
                        c11996.write(bArr);
                        if (C1053.f81965 > 0) {
                            iM55979 = C0873.m55680("ۖۘ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-10995)) ^ 2106083266;
                            i = -1838979504;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = (i3 - C0946.m55979("ܰ۠")) * 15;
                            i5 = ((iM559710 ^ i4) * (-7633)) ^ (-414261371);
                            i6 = 1689561042;
                        }
                        break;
                    case -1673325371:
                    case 2000966799:
                        C0912.m55833();
                        if (C1053.f81965 <= 0) {
                            iM559710 = C0946.m55979("۬᩶") ^ i4;
                            i5 = ((iM559710 ^ i3) * 29705) ^ (-829898160);
                            i6 = 73174715;
                        } else {
                            iM559710 = C0873.m55680("ܶۙ") ^ i4;
                            i5 = ((iM559710 ^ i3) * 19593) ^ 1735001432;
                            i6 = -288166791;
                        }
                        break;
                    case -1579699840:
                    case -797550451:
                        C0854.m55595();
                        if (C1012.m56134() <= 0) {
                            iM559710 = C0873.m55680("ۚ᩹") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-18725)) ^ (-136770304);
                            i6 = 158229037;
                        } else {
                            iM559710 = C0873.m55680("ܶۙ") ^ i4;
                            i5 = ((iM559710 ^ i3) * 19593) ^ 1735001432;
                            i6 = -288166791;
                        }
                        break;
                    case -1274305142:
                    case -993447151:
                        bArrDigest = C16111.m36668().digest(bArr);
                        if (C1025.f81947 < 0) {
                            iM55979 = C0873.m55680("ܶ۟") ^ i4;
                            i5 = ((iM55979 ^ i3) * 30149) ^ (-1732433043);
                            i = 1169802788;
                            i7 = iM55979 ^ i;
                        } else {
                            iM559710 = C0946.m55979("۬᩶") ^ i4;
                            i5 = ((iM559710 ^ i3) * 29705) ^ (-829898160);
                            i6 = 73174715;
                        }
                        break;
                    case -1178704391:
                    case 1564978613:
                        C0890.m55740();
                        return null;
                    case 662272593:
                    case 1606681457:
                        if (C0877.f81843 < 0) {
                            iM559710 = C0873.m55680("ܶۙ") ^ i4;
                            i5 = ((iM559710 ^ i3) * 19593) ^ 1735001432;
                            i6 = -288166791;
                        } else {
                            iM559710 = (C0946.m55979("ۜۙ") ^ i3) * (-61);
                            i5 = ((iM559710 ^ i4) * 21095) ^ (-1744734106);
                            i6 = -522724733;
                        }
                        break;
                    case 713233004:
                    case 1122783014:
                        if (C0912.m55833() || C1229.m56410() != 0) {
                            iM559710 = (C0946.m55979("ۜۙ") ^ i3) * (-61);
                            i5 = ((iM559710 ^ i4) * 21095) ^ (-1744734106);
                            i6 = -522724733;
                        } else if (C0854.f81826 == 0) {
                            if (C1124.f82007 < 0) {
                                if (C1194.f82045 == 0) {
                                    if (C1003.f81929 <= 0) {
                                        iM559710 = C0946.m55979("۬᩶") ^ i4;
                                        i5 = ((iM559710 ^ i3) * 29705) ^ (-829898160);
                                        i6 = 73174715;
                                        break;
                                    } else if (C0898.m55800() > 0) {
                                        c11996 = new C11996();
                                        if (C0877.m55696()) {
                                            iM55979 = (C0946.m55979("᩵ܺ") ^ i4) * 19;
                                            i5 = ((iM55979 ^ i3) * 5885) ^ (-83365383);
                                            i = -1991079478;
                                            i7 = iM55979 ^ i;
                                            break;
                                        }
                                    }
                                }
                                iM559710 = C0873.m55680("ܶۙ") ^ i4;
                                i5 = ((iM559710 ^ i3) * 19593) ^ 1735001432;
                                i6 = -288166791;
                                break;
                            }
                            iM559710 = C0873.m55680("ۚ᩹") ^ i3;
                            i5 = ((iM559710 ^ i4) * (-18725)) ^ (-136770304);
                            i6 = 158229037;
                        } else {
                            iM559710 = (i3 - C0946.m55979("ܰ۠")) * 15;
                            i5 = ((iM559710 ^ i4) * (-7633)) ^ (-414261371);
                            i6 = 1689561042;
                        }
                        break;
                    default:
                        C0866.m55645();
                        iM559710 = (C0946.m55979("ۜۙ") ^ i3) * (-61);
                        i5 = ((iM559710 ^ i4) * 21095) ^ (-1744734106);
                        i6 = -522724733;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m20787() {
        byte[] bArr = null;
        SecureRandom secureRandom = null;
        int i = -1914004726;
        int i2 = RunnableC0871.f81839;
        int i3 = C1003.f81929;
        int iM55979 = C0946.m55979("ۙۘ") ^ i2;
        int i4 = ((iM55979 ^ i3) * 21155) ^ 1322683651;
        int i5 = 1882103071;
        while (true) {
            i = ((((i ^ i3) * 23515) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2116252100:
                case 1603363542:
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("֡᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10351)) ^ (-492404435);
                        i5 = -1322150539;
                    } else {
                        iM55979 = C0946.m55979("ۖ᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23771) ^ (-991586818);
                        i5 = -1984300418;
                    }
                    break;
                case -2023048183:
                case 799854476:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("᩻۫") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 3945) ^ 1783307934;
                        i5 = 717540653;
                    } else {
                        iM55979 = (C0946.m55979("ۧܳ") ^ i3) * (-53);
                        i4 = ((iM55979 ^ i2) * (-27197)) ^ (-1730385130);
                        i5 = 794856577;
                    }
                    break;
                case -1816431368:
                case -1373274990:
                    if (C0955.m56025()) {
                        iM55979 = C0946.m55979("᩺ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32513)) ^ 317648102;
                        i5 = 1655582613;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܽ۠")) * (-107);
                        i4 = ((iM55979 ^ i2) * (-15847)) ^ 945532267;
                        i5 = -1333508742;
                    }
                    break;
                case -1808348944:
                case -68213756:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        iM55979 = (C0946.m55979("ܰۘ") ^ i2) * 49;
                        i4 = ((iM55979 ^ i3) * (-16473)) ^ (-276534495);
                        i5 = 287963258;
                    }
                    break;
                case -1760454364:
                case -371869265:
                    bArr = new byte[32];
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        iM55979 = C0873.m55680("ܳ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10435)) ^ 2042318947;
                        i5 = -1235757510;
                    }
                    break;
                case -1687959392:
                case 684368418:
                    C0967.m56074();
                    C0873.m55678();
                    iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                    i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                    i5 = -1732911749;
                    break;
                case -1027560289:
                case 1552167155:
                    secureRandom.nextBytes(bArr);
                    return Base64.encodeToString(bArr, 11);
                case -550381372:
                case 1111884264:
                    C1012.m56134();
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("᩺ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32513)) ^ 317648102;
                        i5 = 1655582613;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    }
                    break;
                case -505722942:
                case -13490902:
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0946.m55979("᩺ۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-32513)) ^ 317648102;
                        i5 = 1655582613;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ᩴܰ")) * 79;
                        i4 = ((iM55979 ^ i3) * 24935) ^ 629662361;
                        i5 = 35131713;
                    }
                    break;
                case -297108590:
                case 272821169:
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("ܳۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24025) ^ (-566517012);
                        i5 = 1187692908;
                    } else {
                        iM55979 = C0873.m55680("ۘ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21233) ^ 1817167029;
                        i5 = -1940062222;
                    }
                    break;
                case -78189657:
                case 508934887:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0946.m55979("᩻۫") + i3) * 61;
                        i4 = ((iM55979 ^ i2) * 3945) ^ 1783307934;
                        i5 = 717540653;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    }
                    break;
                case 31243940:
                case 493591669:
                    RunnableC0938.m55938();
                    if (C1012.f81938 < 0) {
                        iM55979 = C0873.m55680("֡᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10351)) ^ (-492404435);
                        i5 = -1322150539;
                    } else {
                        iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    }
                    break;
                case 60017623:
                case 457952971:
                    C1025.m56230();
                    C1229.m56410();
                    return null;
                case 223549205:
                case 1747321645:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0946.m55979("ᩳۧ") + i3) * 101;
                        i4 = ((iM55979 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        iM55979 = C0873.m55680("᩸ܺ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22009)) ^ (-2000096053);
                        i5 = -1012849560;
                    }
                    break;
                case 626676782:
                case 657256691:
                    secureRandom = f24359;
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0873.m55680("ܳۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24025) ^ (-566517012);
                        i5 = 1187692908;
                    } else {
                        iM55979 = (C0946.m55979("ۨᩳ") + i2) * (-125);
                        i4 = ((iM55979 ^ i3) * 9591) ^ (-846812314);
                        i5 = -1812298915;
                    }
                    break;
                default:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("ܳۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24025) ^ (-566517012);
                        i5 = 1187692908;
                    } else {
                        iM55979 = C0873.m55680("ۘۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28395)) ^ (-1565453972);
                        i5 = -644438381;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0109 A[PHI: r3
      0x0109: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:43:0x0107, B:18:0x0046, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0157 A[PHI: r1
      0x0157: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v2 java.lang.String), (r1v2 java.lang.String) binds: [B:51:0x0155, B:35:0x00c6, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x018c A[PHI: r2
      0x018c: PHI (r2v4 int) = (r2v2 int), (r2v3 int), (r2v2 int), (r2v2 int) binds: [B:55:0x018a, B:47:0x0137, B:39:0x00e4, B:25:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C25085 m20765(C25085 c25085) {
        int iM55680;
        int i;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        int i3 = 1880352155;
        int i4 = C1071.f81975;
        int i5 = C0992.f81922;
        int iM55681 = C0873.m55680("֫᩷") ^ i5;
        int i6 = ((iM55681 ^ i4) * 24665) ^ (-1713624317);
        int i7 = 101315490;
        while (true) {
            int i8 = iM55681 ^ i7;
            C25085 c25086 = null;
            while (true) {
                i3 = ((((i3 ^ i4) * (-26241)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2135898810:
                    case -1292701740:
                        c25086.f80033 = c25085.f80033;
                        if (C0917.f81868) {
                            iM55680 = C0873.m55680("ۡۤ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 30281) ^ 1944324012;
                            i = -2060360095;
                        } else {
                            iM55680 = C0946.m55979("۠ܶ") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-1537)) ^ 1817935945;
                            i = 743487415;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -2131772087:
                    case -665233968:
                        c25086.f80028 = str2;
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            iM55680 = C0873.m55680("ۡۤ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 30281) ^ 1944324012;
                            i = -2060360095;
                        } else {
                            iM55680 = (i5 - C0946.m55979("۬᩵")) * 55;
                            i6 = ((iM55680 ^ i4) * 8445) ^ (-1982977464);
                            i = 1457665667;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1978603695:
                    case -1554439022:
                        str3 = c25085.f80030;
                        if (C0912.f81867 > 0) {
                            iM55680 = C0873.m55680("ۚۛ") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-17081)) ^ (-1614059354);
                            i = 1104353288;
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -1707677159:
                    case 1489198120:
                        if (C0877.f81843 >= 0) {
                            iM55680 = C0873.m55680("ۡ֨") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-24279)) ^ (-293092307);
                            i = -1041888698;
                        } else {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * (-127);
                            i6 = ((iM55680 ^ i5) * 29303) ^ (-160895464);
                            i = 890135514;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1522064349:
                    case -413331871:
                        C1229.m56410();
                        C0890.m55740();
                        return null;
                    case -1133167019:
                    case -232500058:
                        c25086.f80027 = c25085.f80027;
                        if (C0890.f81849 != 0) {
                            iM55680 = C0873.m55680("ۡۤ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 30281) ^ 1944324012;
                            i = -2060360095;
                        } else {
                            iM55680 = (i5 - C0873.m55680("֨᩹")) * (-15);
                            i6 = ((iM55680 ^ i4) * (-3547)) ^ (-185990998);
                            i = -1012975874;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -1022012826:
                    case -888542127:
                        c25086.f80029 = str;
                        i2 = c25085.f80026;
                        if (C0894.f81854 >= 0) {
                            iM55680 = C0873.m55680("ۡۤ") ^ i5;
                            i6 = ((iM55680 ^ i4) * 30281) ^ 1944324012;
                            i = -2060360095;
                        } else {
                            iM55680 = (i4 - C0946.m55979("۟᩻")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i6 = ((iM55680 ^ i5) * 16881) ^ (-1978969494);
                            i = -1836270088;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -923881545:
                    case 1533210402:
                        c25086.f80032 = c25085.f80032;
                        if (C1003.f81929 <= 0) {
                            iM55680 = (C0873.m55680("ܰ۫") + i4) * (-17);
                            i6 = ((iM55680 ^ i5) * (-7005)) ^ 1920473936;
                            i = -2039088893;
                        } else {
                            iM55680 = C0946.m55979("᩻ۡ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 30019) ^ (-281398879);
                            i = -1398275497;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -804550447:
                    case 1013610736:
                        str = c25085.f80029;
                        if (C1048.f81963) {
                            iM55680 = (i5 - C0873.m55680("ۤܶ")) * 11;
                            i6 = ((iM55680 ^ i4) * (-21793)) ^ (-1291513855);
                            i = -17916901;
                        } else {
                            iM55680 = (C0873.m55680("ܰ۫") + i4) * (-17);
                            i6 = ((iM55680 ^ i5) * (-7005)) ^ 1920473936;
                            i = -2039088893;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -589845796:
                    case 1470079266:
                        c25086.f80026 = i2;
                        str2 = c25085.f80028;
                        if (C0967.m56074()) {
                            iM55680 = C0873.m55680("ۡ֨") ^ i4;
                            i6 = ((iM55680 ^ i5) * (-24279)) ^ (-293092307);
                            i = -1041888698;
                        } else {
                            iM55680 = C0873.m55680("ܿۛ") ^ i4;
                            i6 = ((iM55680 ^ i5) * 4573) ^ 1124717829;
                            i = -1504410379;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    case -446724671:
                    case -341266306:
                        if (C1404.f82149 < 0) {
                            c25086 = new C25085();
                            if (c25085 == null) {
                                iM55680 = (C0873.m55680("۠ۧ") ^ i5) * (-63);
                                i6 = ((iM55680 ^ i4) * 23427) ^ 1909734570;
                                i = -1329428997;
                            } else {
                                iM55680 = (i4 - C0873.m55680("ۛۜ")) * (-7);
                                i6 = ((iM55680 ^ i5) * 19121) ^ (-73566828);
                                i = 1285019186;
                            }
                            i8 = iM55680 ^ i;
                        }
                        break;
                    case -352122154:
                    case -290609143:
                        if (C0946.m55980() != 0) {
                        }
                        iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * (-127);
                        i6 = ((iM55680 ^ i5) * 29303) ^ (-160895464);
                        i = 890135514;
                        i8 = iM55680 ^ i;
                        break;
                    case -216979982:
                    case 183219489:
                        c25086.f80031 = c25085.f80031;
                        return c25086;
                    case -64884010:
                    case 1332005354:
                        C0967.m56074();
                        C0992.m56107();
                        iM55680 = C0873.m55680("ۡ֨") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-24279)) ^ (-293092307);
                        i = -1041888698;
                        i8 = iM55680 ^ i;
                        break;
                    case 898194892:
                    case 1913666563:
                        return c25086;
                    case 1037590133:
                    case 1754280882:
                        C0927.m55873();
                        if (C0873.f81841 > 0) {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * (-127);
                            i6 = ((iM55680 ^ i5) * 29303) ^ (-160895464);
                            i = 890135514;
                        } else {
                            iM55680 = (C0873.m55680("ܰ۫") + i4) * (-17);
                            i6 = ((iM55680 ^ i5) * (-7005)) ^ 1920473936;
                            i = -2039088893;
                        }
                        i8 = iM55680 ^ i;
                        break;
                    default:
                        c25086.f80030 = str3;
                        if (RunnableC1014.f81941 <= 0) {
                            iM55680 = (C0946.m55979("֨ᩴ") ^ i4) * (-127);
                            i6 = ((iM55680 ^ i5) * 29303) ^ (-160895464);
                            i = 890135514;
                        } else {
                            iM55680 = C0946.m55979("ۧۗ") ^ i5;
                            i6 = ((iM55680 ^ i4) * (-10689)) ^ (-1831369038);
                            i = 1829867622;
                        }
                        i8 = iM55680 ^ i;
                        break;
                }
            }
            iM55681 = (C0946.m55979("᩵ۢ") + i5) * (-77);
            i6 = ((iM55681 ^ i4) * 11181) ^ 456622698;
            i7 = 524703230;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20772(C25065 c25065, String str, String str2) throws IOException {
        boolean z = false;
        int i = 1558197110;
        int i2 = C1003.f81929;
        int i3 = C1028.f81950;
        int iM55680 = C0873.m55680("᩻ۘ") ^ i2;
        int i4 = ((iM55680 ^ i3) * 29075) ^ 1853833605;
        int i5 = -622545549;
        while (true) {
            i = ((((i ^ i3) * 19673) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2133389996:
                case -1585154967:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("ܽۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21895)) ^ 503367055;
                        i5 = 1367240713;
                    } else {
                        iM55680 = C0946.m55979("ۨᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16081)) ^ 705287849;
                        i5 = 2054115683;
                    }
                    break;
                case -2131499386:
                case 705277881:
                    C0946.m55980();
                    C0906.m55809();
                    break;
                case -2012537621:
                case -941201780:
                    if (str2 != null) {
                        iM55680 = C0873.m55680("ۚۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-24111)) ^ (-1480891434);
                        i5 = 236919762;
                    } else {
                        iM55680 = C0873.m55680("ܺۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23173) ^ 15943684;
                        i5 = 850029966;
                    }
                    break;
                case -1973764124:
                case -1646505123:
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("᩻᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4155) ^ 653737116;
                        i5 = -950111278;
                    } else {
                        iM55680 = C0873.m55680("۬۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    }
                    break;
                case -1744925127:
                case 74884802:
                    m20773(c25065, str, str2, z);
                    break;
                case -1651460852:
                case 1845714545:
                    if (!C0892.f81851) {
                        iM55680 = C0946.m55979("ۜۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12755)) ^ (-701557260);
                        i5 = -1171708461;
                    } else {
                        iM55680 = C0946.m55979("۟۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    }
                    break;
                case -1565444553:
                case -588204471:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ܽۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21895)) ^ 503367055;
                        i5 = 1367240713;
                    } else {
                        iM55680 = C0873.m55680("۬۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    }
                    break;
                case -993453937:
                case 1957259548:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("᩶۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15203) ^ 833597996;
                        i5 = -327103445;
                    } else {
                        iM55680 = C0946.m55979("۟۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    }
                    break;
                case -855613440:
                case 1628087487:
                    C1003.m56123();
                    C0894.m55769();
                    iM55680 = C0873.m55680("۬۠") ^ i3;
                    i4 = ((iM55680 ^ i2) * 22615) ^ 864673440;
                    i5 = -433425641;
                    break;
                case -797419871:
                case 744921339:
                    z = true;
                    iM55680 = (C0873.m55680("ۡۛ") + i2) * (-97);
                    i4 = ((iM55680 ^ i3) * (-5547)) ^ (-200888628);
                    i5 = -339428228;
                    break;
                case -592654361:
                case 1948155840:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2109)) ^ 2041688933;
                        i5 = 1283016860;
                    } else {
                        iM55680 = C0946.m55979("ܺܶ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12919)) ^ (-2002134200);
                        i5 = 566339118;
                    }
                    break;
                case -123808090:
                case -115315789:
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("ۜۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12755)) ^ (-701557260);
                        i5 = -1171708461;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩶ۜ")) * (-17);
                        i4 = ((iM55680 ^ i3) * (-30873)) ^ (-1230812690);
                        i5 = 1927353873;
                    }
                    break;
                case 203190434:
                case 1704690606:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0946.m55979("۟۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۜ") ^ i3) * (-57);
                        i4 = ((iM55680 ^ i2) * (-5955)) ^ (-1717030254);
                        i5 = -974087466;
                    }
                    break;
                case 933748691:
                case 1970822526:
                    C1044.m56286();
                    if (C0930.m55885() <= 0) {
                        iM55680 = C0946.m55979("۟۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    } else {
                        iM55680 = C0873.m55680("۬۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    }
                    break;
                case 943770376:
                case 1207657273:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0946.m55979("ۜۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12755)) ^ (-701557260);
                        i5 = -1171708461;
                    } else {
                        iM55680 = C0946.m55979("᩸᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23485)) ^ 693606165;
                        i5 = 1205966136;
                    }
                    break;
                case 1192757751:
                case 1736284166:
                    if (C0955.m56025()) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2109)) ^ 2041688933;
                        i5 = 1283016860;
                    } else {
                        iM55680 = (C0873.m55680("ۛܰ") ^ i2) * 15;
                        i4 = ((iM55680 ^ i3) * (-10297)) ^ (-987588483);
                        i5 = -1927961320;
                    }
                    break;
                case 1416872838:
                case 1790784610:
                    z = false;
                    iM55680 = (C0873.m55680("ۡۛ") + i2) * (-97);
                    i4 = ((iM55680 ^ i3) * (-5547)) ^ (-200888628);
                    i5 = -339428228;
                    break;
                case 1477900679:
                case 1886899713:
                    if (C1017.m56187() <= 0) {
                        iM55680 = C0873.m55680("ܽۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21895)) ^ 503367055;
                        i5 = 1367240713;
                    } else {
                        iM55680 = (C0873.m55680("ۛ֫") + i3) * (-45);
                        i4 = ((iM55680 ^ i2) * (-31193)) ^ (-1888119117);
                        i5 = 1542916078;
                    }
                    break;
                default:
                    if (RunnableC1014.m56177()) {
                        iM55680 = C0946.m55979("ۖ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23293)) ^ (-640249565);
                        i5 = 439962347;
                    } else {
                        iM55680 = C0873.m55680("۬۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03bb A[PHI: r8 r18
      0x03bb: PHI (r8v61 short) = (r8v60 short), (r8v2 short) binds: [B:102:0x03b9, B:98:0x0396] A[DONT_GENERATE, DONT_INLINE]
      0x03bb: PHI (r18v4 int) = (r18v3 int), (r18v5 int) binds: [B:102:0x03b9, B:98:0x0396] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x025a A[PHI: r17
      0x025a: PHI (r17v10 short) = (r17v8 short), (r17v11 short) binds: [B:68:0x0244, B:60:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m20773(C25065 c25065, String str, String str2, boolean z) throws IOException {
        int iM55979;
        int i;
        int i2;
        int iM559710;
        int i3;
        int i4;
        short s;
        int iM55680;
        int i5;
        int i6;
        int iM559711;
        int i7;
        int i8;
        int iM559712;
        int i9;
        String str3 = str2;
        int i10 = C0877.f81843;
        int i11 = C0930.f81879;
        int iM55681 = (C0873.m55680("᩸ۗ") + i11) * C0254q.f1218h;
        int i12 = ((iM55681 ^ i10) * (-4007)) ^ (-85191378);
        String strM55952 = null;
        short[] sArr = null;
        int i13 = iM55681 ^ (-1152938326);
        int iM55021 = 0;
        boolean z2 = false;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1616446661;
        int i18 = 0;
        long jM55013 = 0;
        C25085 c25085M20765 = null;
        while (true) {
            i17 = i13 ^ (i12 & (((i17 ^ i10) * (-8637)) >> 31));
            switch (i17) {
                case -2107680500:
                case 1352046586:
                    C1024.m56209();
                    if (C1071.f81975 > 0) {
                        iM559712 = (C0946.m55979("᩸ۛ") ^ i11) * 35;
                        i5 = ((iM559712 ^ i10) * 6623) ^ 1783463200;
                        i9 = 1634614935;
                        i13 = iM559712 ^ i9;
                        i12 = i5;
                    }
                    iM55680 = (C0873.m55680("ܿ֫") + i10) * 85;
                    i5 = ((iM55680 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -2055101289:
                case 1459431813:
                    i14 = 14223;
                    iM559711 = C0946.m55979("ܳܺ") ^ i10;
                    i7 = ((iM559711 ^ i11) * 23645) ^ 1937229485;
                    i8 = -2015513447;
                    i12 = i7;
                    s2 = s2;
                    i13 = iM559711 ^ i8;
                    str3 = str2;
                    break;
                case -2030844296:
                case -1815496525:
                    short[] sArr2 = f82042;
                    s2 = s2;
                    if (C0890.m55740()) {
                        throw new IOException(C1012.m56144(sArr2, 214, 31, i14));
                    }
                    iM55979 = C0873.m55680("֡᩺") ^ i10;
                    i = ((iM55979 ^ i11) * (-31137)) ^ (-918584432);
                    i2 = -33953418;
                    i12 = i;
                    s = s2;
                    i13 = iM55979 ^ i2;
                    s2 = s;
                    break;
                case -1927963509:
                case -1579280609:
                    s2 = s2;
                    short[] sArr3 = f82042;
                    if (C0992.f81922 < 0) {
                        throw new IOException(C1124.m56373(sArr3, 171, 21, i14));
                    }
                    iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                    i8 = 478506209;
                    i12 = i7;
                    s2 = s2;
                    i13 = iM559711 ^ i8;
                    str3 = str2;
                    break;
                case -1898678665:
                case 338474923:
                    if ((s2 * 9734) - i18 <= 0) {
                        iM55680 = (C0873.m55680("ۗ۟") ^ i10) * 13;
                        i5 = ((iM55680 ^ i11) * 8603) ^ 33295677;
                        i6 = 1437567707;
                    } else {
                        iM55680 = C0946.m55979("ۗ۫") ^ i11;
                        i5 = ((iM55680 ^ i10) * 16233) ^ 1784036261;
                        i6 = -1422123115;
                    }
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -1882091397:
                case 841159139:
                    C0854.m55595();
                    if (C1003.m56123() != 0) {
                        iM559712 = (C0873.m55680("֫ۤ") + i10) * (-95);
                        i5 = ((iM559712 ^ i11) * 30577) ^ (-2094883978);
                        i9 = 1626807180;
                        i13 = iM559712 ^ i9;
                        i12 = i5;
                    }
                    iM55680 = (C0873.m55680("ܿ֫") + i10) * 85;
                    i5 = ((iM55680 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -1634181857:
                case -873268218:
                    if (!C1048.f81963) {
                        s2 = s2;
                        iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    } else {
                        iM55680 = (C0873.m55680("ܿ֫") + i10) * 85;
                        i5 = ((iM55680 ^ i11) * (-21629)) ^ 1120837210;
                        i6 = 820049367;
                        i13 = iM55680 ^ i6;
                        str3 = str2;
                        i12 = i5;
                    }
                    break;
                case -1439668308:
                case 1941322642:
                    if (RunnableC0938.f81886 < 0) {
                        iM559710 = (i10 - C0946.m55979("֡ۙ")) * 97;
                        i3 = ((iM559710 ^ i11) * (-5959)) ^ (-786420766);
                        i4 = 541512355;
                        s = s2;
                        i13 = iM559710 ^ i4;
                        i12 = i3;
                        s2 = s;
                    } else {
                        s2 = s2;
                        iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    }
                    break;
                case -1360854150:
                case -323712899:
                    s2 = s2;
                    if (str3 != null) {
                        iM55979 = (C0873.m55680("ܺۤ") ^ i11) * 37;
                        i = ((iM55979 ^ i10) * 26851) ^ (-282481616);
                        i2 = 791584103;
                    } else {
                        iM55979 = (i11 - C0873.m55680("ۨܶ")) * 77;
                        i = ((iM55979 ^ i10) * 249) ^ 1089145140;
                        i2 = -137300028;
                    }
                    i12 = i;
                    s = s2;
                    i13 = iM55979 ^ i2;
                    s2 = s;
                    break;
                case -1331579079:
                case 1867209771:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ܿ֫") + i10) * 85;
                        i5 = ((iM55680 ^ i11) * (-21629)) ^ 1120837210;
                        i6 = 820049367;
                    } else {
                        iM55680 = (C0873.m55680("ᩳ۬") ^ i10) * (-103);
                        i5 = ((iM55680 ^ i11) * (-12215)) ^ 405475347;
                        i6 = 1363736093;
                    }
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -1240011544:
                case 794440795:
                    i18 = (s2 * s2) + 23687689;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("ܿۛ") + i11) * 61;
                        i5 = ((iM55680 ^ i10) * (-31123)) ^ 1141502707;
                        i6 = -1400500143;
                    } else {
                        iM55680 = (C0873.m55680("᩷᩶") + i11) * 123;
                        i5 = ((iM55680 ^ i10) * (-28953)) ^ 96568090;
                        i6 = 1656242684;
                    }
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -857126977:
                case 1185530344:
                    s2 = s2;
                    c25085M20765.f80032 = C0898.m55792(sArr, i15, i16, i14);
                    c25085M20765.f80028 = str;
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("ۤۡ") ^ i10;
                        i = ((iM55979 ^ i11) * (-17683)) ^ (-247505284);
                        i2 = -994479603;
                        i12 = i;
                        s = s2;
                        i13 = iM55979 ^ i2;
                        s2 = s;
                    } else {
                        iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    }
                    break;
                case -812010347:
                case -110948020:
                    s2 = s2;
                    c25085M20765.f80027 = jM55013;
                    c25085M20765.f80029 = strM55952;
                    c25085M20765.f80026 = iM55021;
                    sArr = f82042;
                    if (!C0949.m56012()) {
                        iM55979 = C0946.m55979("ۘۖ") ^ i11;
                        i = ((iM55979 ^ i10) * 25765) ^ 954615054;
                        i2 = -892869466;
                        i12 = i;
                        s = s2;
                        i13 = iM55979 ^ i2;
                        s2 = s;
                    } else {
                        iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    }
                    break;
                case -782820617:
                case 2097224084:
                    C0854.m55595();
                    C0912.m55833();
                    iM55680 = (C0873.m55680("ܿ֫") + i10) * 85;
                    i5 = ((iM55680 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -769391214:
                case 160581859:
                    s2 = s2;
                    c25085M20765 = m20765(C0967.m56079());
                    jM55013 = c25065.m55013();
                    strM55952 = ViewOnClickListenerC0939.m55952(c25065);
                    if (C1053.f81965 <= 0) {
                        iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                    } else {
                        iM559711 = C0873.m55680("۠᩵") ^ i10;
                        i7 = ((iM559711 ^ i11) * (-1371)) ^ (-1634109805);
                        i8 = 2095375340;
                    }
                    i12 = i7;
                    s2 = s2;
                    i13 = iM559711 ^ i8;
                    str3 = str2;
                    break;
                case -665746955:
                case 209748763:
                    s2 = s2;
                    if (jM55013 >= c25085M20765.f80027) {
                        iM55979 = (i10 - C0873.m55680("ܿ֡")) * (-121);
                        i = ((iM55979 ^ i11) * 12855) ^ (-1424831270);
                        i2 = 1371403520;
                    } else {
                        iM55979 = C0873.m55680("᩸֨") ^ i11;
                        i = ((iM55979 ^ i10) * (-31081)) ^ (-463118078);
                        i2 = -557598293;
                    }
                    i12 = i;
                    s = s2;
                    i13 = iM55979 ^ i2;
                    s2 = s;
                    break;
                case -558201301:
                case -248820797:
                    s2 = s2;
                    if (!m20784(strM55952)) {
                        iM559711 = C0946.m55979("֫֨") ^ i11;
                        i7 = ((iM559711 ^ i10) * 13233) ^ (-1950046654);
                        i8 = -1549252576;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    } else {
                        iM55979 = C0946.m55979("ܽᩳ") ^ i11;
                        i = ((iM55979 ^ i10) * (-3199)) ^ 2100046162;
                        i2 = -2131955022;
                        i12 = i;
                        s = s2;
                        i13 = iM55979 ^ i2;
                        s2 = s;
                    }
                    break;
                case -520881854:
                case -260185491:
                    short[] sArr4 = f82042;
                    if (C0890.f81849 == 0) {
                        throw new IOException(C1929.m56558(sArr4, 195, 19, i14));
                    }
                    iM559710 = (i10 - C0946.m55979("֡ۙ")) * 97;
                    i3 = ((iM559710 ^ i11) * (-5959)) ^ (-786420766);
                    i4 = 541512355;
                    s = s2;
                    i13 = iM559710 ^ i4;
                    i12 = i3;
                    s2 = s;
                    break;
                case -461742162:
                case 1607605289:
                    s2 = s2;
                    i15 = 192;
                    i16 = 3;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("֡᩺") ^ i10;
                        i = ((iM55979 ^ i11) * (-31137)) ^ (-918584432);
                        i2 = -33953418;
                    } else {
                        iM55979 = C0946.m55979("֫ۜ") ^ i10;
                        i = ((iM55979 ^ i11) * (-30053)) ^ 34384521;
                        i2 = 1118235443;
                    }
                    i12 = i;
                    s = s2;
                    i13 = iM55979 ^ i2;
                    s2 = s;
                    break;
                case -367486904:
                case -297133461:
                    s2 = s2;
                    c25085M20765.f80030 = "";
                    c25085M20765.f80033 = str3;
                    c25085M20765.f80031 = z2;
                    iM55979 = (i11 - C0873.m55680("ۨܶ")) * 77;
                    i = ((iM55979 ^ i10) * 249) ^ 1089145140;
                    i2 = -137300028;
                    i12 = i;
                    s = s2;
                    i13 = iM55979 ^ i2;
                    s2 = s;
                    break;
                case -335440952:
                case 1320339242:
                    s2 = s2;
                    if (z) {
                        iM55979 = (i10 - C0873.m55680("ܿ֡")) * (-121);
                        i = ((iM55979 ^ i11) * 12855) ^ (-1424831270);
                        i2 = 1371403520;
                    } else {
                        iM55979 = C0946.m55979("۟ۢ") ^ i10;
                        i = ((iM55979 ^ i11) * (-16735)) ^ 2139461606;
                        i2 = -2100346139;
                    }
                    i12 = i;
                    s = s2;
                    i13 = iM55979 ^ i2;
                    s2 = s;
                    break;
                case -300538055:
                case 519781576:
                    s2 = f82042[170];
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("ܿۛ") + i11) * 61;
                        i5 = ((iM55680 ^ i10) * (-31123)) ^ 1141502707;
                        i6 = -1400500143;
                    } else {
                        iM55680 = C0873.m55680("ۨᩳ") ^ i11;
                        i5 = ((iM55680 ^ i10) * (-15801)) ^ 2093989651;
                        i6 = 31958310;
                    }
                    i13 = iM55680 ^ i6;
                    str3 = str2;
                    i12 = i5;
                    break;
                case -223668636:
                case 1626120641:
                    s2 = s2;
                    iM55021 = c25065.m55021();
                    if (jM55013 > 0) {
                        iM559711 = C0946.m55979("ܳۗ") ^ i10;
                        i7 = ((iM559711 ^ i11) * (-23327)) ^ 1810573031;
                        i8 = 2137307098;
                    } else {
                        iM559711 = C0946.m55979("֫֨") ^ i11;
                        i7 = ((iM559711 ^ i10) * 13233) ^ (-1950046654);
                        i8 = -1549252576;
                    }
                    i12 = i7;
                    s2 = s2;
                    i13 = iM559711 ^ i8;
                    str3 = str2;
                    break;
                case 11353130:
                case 1872971434:
                    i14 = 4278;
                    iM559711 = C0946.m55979("ܳܺ") ^ i10;
                    i7 = ((iM559711 ^ i11) * 23645) ^ 1937229485;
                    i8 = -2015513447;
                    i12 = i7;
                    s2 = s2;
                    i13 = iM559711 ^ i8;
                    str3 = str2;
                    break;
                case 90725576:
                case 765137558:
                    C0930.m55885();
                    if (C0863.f81833 <= 0) {
                        s2 = s2;
                        iM55979 = C0873.m55680("֡᩺") ^ i10;
                        i = ((iM55979 ^ i11) * (-31137)) ^ (-918584432);
                        i2 = -33953418;
                        i12 = i;
                        s = s2;
                        i13 = iM55979 ^ i2;
                        s2 = s;
                    } else {
                        s2 = s2;
                        iM559711 = (i11 - C0946.m55979("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((iM559711 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    }
                    break;
                case 488360911:
                case 1257682029:
                    s2 = s2;
                    m20778(c25085M20765);
                    if (C0930.m55892(m20764())) {
                        iM559710 = (C0873.m55680("᩻ۛ") ^ i11) * (-41);
                        i3 = ((iM559710 ^ i10) * 29585) ^ (-1602188407);
                        i4 = -378228994;
                    } else {
                        iM559710 = C0946.m55979("ܳᩴ") ^ i10;
                        i3 = ((iM559710 ^ i11) * 18607) ^ 793878109;
                        i4 = 146548164;
                    }
                    s = s2;
                    i13 = iM559710 ^ i4;
                    i12 = i3;
                    s2 = s;
                    break;
                case 1794581412:
                case 1923169306:
                    return;
                case 1801605457:
                case 1886443274:
                    C0947.m55997();
                    return;
                default:
                    s2 = s2;
                    z2 = true;
                    if (iM55021 < 1) {
                        iM559711 = C0946.m55979("֫֨") ^ i11;
                        i7 = ((iM559711 ^ i10) * 13233) ^ (-1950046654);
                        i8 = -1549252576;
                        i12 = i7;
                        s2 = s2;
                        i13 = iM559711 ^ i8;
                        str3 = str2;
                    } else {
                        iM55979 = C0946.m55979("ᩴᩴ") ^ i11;
                        i = ((iM55979 ^ i10) * 7155) ^ (-1759205005);
                        i2 = 1611458652;
                        i12 = i;
                        s = s2;
                        i13 = iM55979 ^ i2;
                        s2 = s;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20761(String str, String str2) {
        C25085 c25085M56364 = null;
        C25085 c25085M20765 = null;
        String strM20787 = null;
        int i = 1877658942;
        int i2 = ViewOnClickListenerC0939.f81888;
        int i3 = C0845.f81821;
        int iM55680 = C0873.m55680("ᩴ᩸") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-653)) ^ 365303529;
        int i5 = 1066845562;
        while (true) {
            i = ((((i ^ i3) * (-24421)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2113042208:
                case -1459419541:
                    C1017.m56187();
                    return null;
                case -2107897834:
                case -18704261:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("ۢ۟") + i3) * (-89);
                        i4 = ((iM55680 ^ i2) * 15919) ^ 354729930;
                        i5 = -2091959853;
                    } else {
                        iM55680 = C0873.m55680("ۛۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-24671)) ^ 363560572;
                        i5 = 698457179;
                    }
                    break;
                case -1994254969:
                case -552843997:
                    C1036.m56257();
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("᩸֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6655) ^ 310888292;
                        i5 = 871045431;
                    } else {
                        iM55680 = (C0873.m55680("ۢ۟") + i3) * (-89);
                        i4 = ((iM55680 ^ i2) * 15919) ^ 354729930;
                        i5 = -2091959853;
                    }
                    break;
                case -1818403098:
                case 1741391657:
                    C0927.m55873();
                    iM55680 = (C0873.m55680("ۢ۟") + i3) * (-89);
                    i4 = ((iM55680 ^ i2) * 15919) ^ 354729930;
                    i5 = -2091959853;
                    break;
                case -1647014239:
                case 1236056925:
                    if (RunnableC0897.f81856) {
                        iM55680 = (C0873.m55680("ۛܰ") + i3) * 61;
                        i4 = ((iM55680 ^ i2) * (-7727)) ^ 1164288468;
                        i5 = 1645720249;
                    } else {
                        iM55680 = (C0873.m55680("ۢ۟") + i3) * (-89);
                        i4 = ((iM55680 ^ i2) * 15919) ^ 354729930;
                        i5 = -2091959853;
                    }
                    break;
                case -1645373072:
                case -1556308294:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("۠᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        iM55680 = (C0873.m55680("ᩳ᩸") ^ i2) * 47;
                        i4 = ((iM55680 ^ i3) * 11569) ^ 1367775782;
                        i5 = 366241181;
                    }
                    break;
                case -1363901357:
                case 1294078275:
                    c25085M20765.f80028 = strM20787;
                    m20778(c25085M20765);
                    return c25085M20765.f80028;
                case -1042993257:
                case -489375306:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("۠᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        iM55680 = C0946.m55979("᩺ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27033) ^ 113693891;
                        i5 = -1430124562;
                    }
                    break;
                case -836369955:
                case 1640747205:
                    strM20787 = m20787();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۛ֡")) * 41;
                        i4 = ((iM55680 ^ i2) * (-4687)) ^ 1145621868;
                        i5 = -1475565889;
                    } else {
                        iM55680 = C0873.m55680("ۖܿ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19175) ^ 171563427;
                        i5 = 1376862769;
                    }
                    break;
                case -772254736:
                case -721134985:
                    if (AbstractC0942.m55971()) {
                        iM55680 = (i3 - C0946.m55979("ۛ֡")) * 41;
                        i4 = ((iM55680 ^ i2) * (-4687)) ^ 1145621868;
                        i5 = -1475565889;
                    } else {
                        iM55680 = C0946.m55979("ۧۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3433)) ^ 862417512;
                        i5 = -909188715;
                    }
                    break;
                case -603077195:
                case 1955894749:
                    if (C0906.m55806(str2, c25085M56364.f80030)) {
                        iM55680 = (C0946.m55979("ۗᩴ") ^ i2) * (-81);
                        i4 = ((iM55680 ^ i3) * (-22083)) ^ (-1838201619);
                        i5 = 817328348;
                    } else {
                        iM55680 = (C0946.m55979("ܰ۟") + i2) * 31;
                        i4 = ((iM55680 ^ i3) * (-19837)) ^ 1193685279;
                        i5 = 443064803;
                    }
                    break;
                case -566073774:
                case 892086148:
                    if (C1071.f81975 > 0) {
                        iM55680 = C0946.m55979("ܿۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21023)) ^ (-1179738564);
                        i5 = -1460721402;
                    } else {
                        iM55680 = C0873.m55680("۠᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    }
                    break;
                case -540066688:
                case 1742692499:
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("۠᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        iM55680 = C0946.m55979("ܰۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 18517) ^ 1791835028;
                        i5 = 1634825822;
                    }
                    break;
                case -438809545:
                case 1001540846:
                    if (ViewOnClickListenerC0939.m55949(str, c25085M56364.f80032)) {
                        iM55680 = C0946.m55979("ۧ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20181)) ^ 2108454879;
                        i5 = -2010033073;
                    } else {
                        iM55680 = (C0946.m55979("ܰ۟") + i2) * 31;
                        i4 = ((iM55680 ^ i3) * (-19837)) ^ 1193685279;
                        i5 = 443064803;
                    }
                    break;
                case 704910137:
                case 982813461:
                    c25085M20765 = m20765(c25085M56364);
                    c25085M20765.f80032 = str;
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0946.m55979("᩸֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6655) ^ 310888292;
                        i5 = 871045431;
                    } else {
                        iM55680 = C0873.m55680("ۢᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 4617) ^ 2041895484;
                        i5 = -1114103947;
                    }
                    break;
                case 1094577647:
                case 1717043654:
                    c25085M20765.f80030 = str2;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0946.m55979("ܿۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21023)) ^ (-1179738564);
                        i5 = -1460721402;
                    } else {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18941) ^ 2063532898;
                        i5 = 904432908;
                    }
                    break;
                case 1284506250:
                case 1369171897:
                    c25085M56364 = C1124.m56364();
                    if (c25085M56364 != null) {
                        iM55680 = (C0873.m55680("֫ۚ") + i2) * (-51);
                        i4 = ((iM55680 ^ i3) * (-13877)) ^ 12527342;
                        i5 = 125019744;
                    } else {
                        iM55680 = (C0946.m55979("ܰ۟") + i2) * 31;
                        i4 = ((iM55680 ^ i3) * (-19837)) ^ 1193685279;
                        i5 = 443064803;
                    }
                    break;
                case 1414190024:
                case 1621815341:
                    AbstractC0942.m55971();
                    if (!C0955.m56025()) {
                        iM55680 = C0873.m55680("۠᩵") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        iM55680 = C0946.m55979("᩸֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 6655) ^ 310888292;
                        i5 = 871045431;
                    }
                    break;
                case 1547060552:
                case 1807101897:
                    if (C0917.f81868) {
                        iM55680 = C0946.m55979("ܿۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21023)) ^ (-1179738564);
                        i5 = -1460721402;
                    } else {
                        iM55680 = C0873.m55680("ۗ۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-8743)) ^ 1498200661;
                        i5 = 510754325;
                    }
                    break;
                default:
                    return c25085M56364.f80028;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01bb A[PHI: r1 r18
      0x01bb: PHI (r1v4 l.᩻᩵ۡ) = (r1v3 l.᩻᩵ۡ), (r1v2 l.᩻᩵ۡ), (r1v2 l.᩻᩵ۡ) binds: [B:49:0x01a1, B:37:0x0122, B:35:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r18v17 l.᩻᩵ۡ) = (r18v11 l.᩻᩵ۡ), (r18v15 l.᩻᩵ۡ), (r18v18 l.᩻᩵ۡ) binds: [B:49:0x01a1, B:37:0x0122, B:35:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0285 A[PHI: r7 r14 r18
      0x0285: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:68:0x0283, B:40:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:68:0x0283, B:40:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0285: PHI (r18v13 l.᩻᩵ۡ) = (r18v4 l.᩻᩵ۡ), (r18v14 l.᩻᩵ۡ) binds: [B:68:0x0283, B:40:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b4 A[PHI: r6 r8 r9 r18
      0x02b4: PHI (r6v4 short) = (r6v2 short), (r6v3 short), (r6v2 short) binds: [B:64:0x0260, B:6:0x0054, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:64:0x0260, B:6:0x0054, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:64:0x0260, B:6:0x0054, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r18v26 l.᩻᩵ۡ) = (r18v5 l.᩻᩵ۡ), (r18v21 l.᩻᩵ۡ), (r18v27 l.᩻᩵ۡ) binds: [B:64:0x0260, B:6:0x0054, B:14:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x030c A[PHI: r5 r10 r18 r19
      0x030c: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char), (r5v2 char) binds: [B:78:0x030a, B:74:0x02ea, B:60:0x023a, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x030c: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:78:0x030a, B:74:0x02ea, B:60:0x023a, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x030c: PHI (r18v19 l.᩻᩵ۡ) = (r18v2 l.᩻᩵ۡ), (r18v3 l.᩻᩵ۡ), (r18v6 l.᩻᩵ۡ), (r18v20 l.᩻᩵ۡ) binds: [B:78:0x030a, B:74:0x02ea, B:60:0x023a, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x030c: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:78:0x030a, B:74:0x02ea, B:60:0x023a, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m20766(String str) {
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int i5 = RunnableC0871.f81839;
        int i6 = C0863.f81833;
        int iM55682 = (i6 - C0873.m55680("ۡ۬")) * 23;
        int i7 = ((iM55682 ^ i5) * (-12025)) ^ 42845956;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55682 ^ 1245319891;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1537738131;
        String str2 = null;
        C25085 c25085M20765 = null;
        C25085 c25085M56364 = null;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i5) * 22411) >> 31));
            switch (i16) {
                case -2131971313:
                case 917112019:
                    i13 = 24069;
                    iM55680 = (C0946.m55979("ܽۚ") + i5) * (-41);
                    i = ((iM55680 ^ i6) * 19403) ^ 345265257;
                    i2 = 108492352;
                    C25085 c25085 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c25085;
                    break;
                case -2064852966:
                case 1342730868:
                    c25085M20765 = c25085M20765;
                    c25085M56364 = C1124.m56364();
                    if (c25085M56364 != null) {
                        iM55680 = (C0946.m55979("ۛ᩺") + i6) * (-51);
                        i = ((iM55680 ^ i5) * (-16681)) ^ (-1316602272);
                        i2 = 581836635;
                    } else {
                        iM55680 = C0873.m55680("ܰۛ") ^ i6;
                        i = ((iM55680 ^ i5) * 6647) ^ 374828081;
                        i2 = -165249175;
                    }
                    C25085 c25086 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c25086;
                    break;
                case -1922997257:
                case 2069241374:
                    i13 = 14699;
                    iM55680 = (C0946.m55979("ܽۚ") + i5) * (-41);
                    i = ((iM55680 ^ i6) * 19403) ^ 345265257;
                    i2 = 108492352;
                    C25085 c25087 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c25087;
                    break;
                case -1512301374:
                case 710677851:
                    c25085M20765 = c25085M20765;
                    sArr2 = f82042;
                    i14 = 28;
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0946.m55979("ۗ۫") ^ i6;
                        i = ((iM55680 ^ i5) * (-1139)) ^ (-823911768);
                        i2 = -501611617;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩶") + i5) * (-37);
                        i = ((iM55680 ^ i6) * 20429) ^ 1891674248;
                        i2 = -1993158669;
                    }
                    C25085 c25088 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c25088;
                    break;
                case -1489993611:
                case -1215633605:
                    C0912.m55833();
                    if (!RunnableC1014.m56177()) {
                        iM55681 = C0946.m55979("ᩴۛ") ^ i5;
                        i3 = ((iM55681 ^ i6) * 22831) ^ (-683043803);
                        i4 = 788281364;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        c25085M20765 = c25085M20765;
                        iM55680 = C0946.m55979("ۗ۫") ^ i6;
                        i = ((iM55680 ^ i5) * (-1139)) ^ (-823911768);
                        i2 = -501611617;
                        C25085 c25089 = c25085M20765;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        c25085M20765 = c25089;
                    }
                    break;
                case -1224409764:
                case 470311198:
                    C1071.m56343();
                    if (C0845.m55584() <= 0) {
                        c25085M20765 = c25085M20765;
                        iM55680 = (C0946.m55979("᩵ۚ") + i6) * (-103);
                        i = ((iM55680 ^ i5) * (-14123)) ^ (-207307802);
                        i2 = -1006725712;
                        C25085 c250810 = c25085M20765;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        c25085M20765 = c250810;
                    }
                    c25085M20765 = c25085M20765;
                    iM55680 = (C0946.m55979("᩻۠") ^ i6) * (-13);
                    i = ((iM55680 ^ i5) * 28581) ^ 1601273780;
                    i2 = -183374868;
                    C25085 c250811 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250811;
                    break;
                case -1024835810:
                case 1912530320:
                    c25085M20765 = c25085M20765;
                    c = 27;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0946.m55979("᩵ۚ") + i6) * (-103);
                        i = ((iM55680 ^ i5) * (-14123)) ^ (-207307802);
                        i2 = -1006725712;
                    } else {
                        iM55680 = C0873.m55680("᩵᩻") ^ i6;
                        i = ((iM55680 ^ i5) * (-19779)) ^ 1881604299;
                        i2 = -269457883;
                    }
                    C25085 c250812 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250812;
                    break;
                case -982626801:
                case -174958382:
                    c25085M20765 = c25085M20765;
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) <= 0) {
                        iM55680 = C0873.m55680("ܳܰ") ^ i5;
                        i = ((iM55680 ^ i6) * 26893) ^ (-1256901442);
                        i2 = -491976724;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ܺۚ")) * (-39);
                        i = ((iM55680 ^ i5) * (-19689)) ^ 507989862;
                        i2 = -1264105994;
                    }
                    C25085 c250813 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250813;
                    break;
                case -809633023:
                case 935076170:
                    c25085M20765.f80028 = str2;
                    c25085M20765.f80030 = str2;
                    m20778(c25085M20765);
                    c25085M20765 = c25085M20765;
                    iM55680 = C0873.m55680("ܰۛ") ^ i6;
                    i = ((iM55680 ^ i5) * 6647) ^ 374828081;
                    i2 = -165249175;
                    C25085 c250814 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250814;
                    break;
                case -516374330:
                case -82381250:
                    c25085M20765.f80032 = str2;
                    if (!RunnableC0897.m55784()) {
                        iM55681 = (C0946.m55979("ܽۧ") ^ i5) * (-95);
                        i3 = ((iM55681 ^ i6) * (-26891)) ^ 1710948767;
                        i4 = -328342961;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        c25085M20765 = c25085M20765;
                        iM55680 = C0946.m55979("ۗ۫") ^ i6;
                        i = ((iM55680 ^ i5) * (-1139)) ^ (-823911768);
                        i2 = -501611617;
                        C25085 c250815 = c25085M20765;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        c25085M20765 = c250815;
                    }
                    break;
                case -414244866:
                case 1999974377:
                    c25085M20765 = c25085M20765;
                    sArr = f82042;
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("ۨܰ") ^ i5;
                        i = ((iM55680 ^ i6) * (-23247)) ^ 1380000136;
                        i2 = -402274441;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۚ") + i6) * (-103);
                        i = ((iM55680 ^ i5) * (-14123)) ^ (-207307802);
                        i2 = -1006725712;
                    }
                    C25085 c250816 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250816;
                    break;
                case -403843807:
                case -288499261:
                    break;
                case -376696485:
                case 1226847712:
                    C0937.m55918();
                    break;
                case -266527408:
                case -84829590:
                    if (C0845.f81821 >= 0) {
                        iM55681 = C0946.m55979("ᩴۛ") ^ i5;
                        i3 = ((iM55681 ^ i6) * 22831) ^ (-683043803);
                        i4 = 788281364;
                        i8 = iM55681 ^ i4;
                        i7 = i3;
                    } else {
                        c25085M20765 = c25085M20765;
                        iM55680 = (C0946.m55979("᩻۠") ^ i6) * (-13);
                        i = ((iM55680 ^ i5) * 28581) ^ 1601273780;
                        i2 = -183374868;
                        C25085 c250817 = c25085M20765;
                        i8 = iM55680 ^ i2;
                        i7 = i;
                        c25085M20765 = c250817;
                    }
                    break;
                case -217966053:
                case 728336485:
                    c25085M20765 = m20765(c25085M56364);
                    str2 = "";
                    if (C1025.m56230()) {
                        iM55681 = C0946.m55979("ᩴۛ") ^ i5;
                        i3 = ((iM55681 ^ i6) * 22831) ^ (-683043803);
                        i4 = 788281364;
                    } else {
                        iM55681 = C0873.m55680("᩷ۛ") ^ i6;
                        i3 = ((iM55681 ^ i5) * 22845) ^ (-1849062854);
                        i4 = -103761789;
                    }
                    i8 = iM55681 ^ i4;
                    i7 = i3;
                    break;
                case -158968875:
                case 1087377109:
                    if (C0906.m55806(str, c25085M56364.f80028)) {
                        iM55680 = (C0946.m55979("ܿ֡") + i5) * (-19);
                        c25085M20765 = c25085M20765;
                        i = ((iM55680 ^ i6) * (-30741)) ^ (-1938533430);
                        i2 = 1631122694;
                    } else {
                        c25085M20765 = c25085M20765;
                        iM55680 = C0873.m55680("ܰۛ") ^ i6;
                        i = ((iM55680 ^ i5) * 6647) ^ 374828081;
                        i2 = -165249175;
                    }
                    C25085 c250818 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250818;
                    break;
                case 152711461:
                case 1363366983:
                    c25085M20765 = c25085M20765;
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("᩻۠") ^ i6) * (-13);
                        i = ((iM55680 ^ i5) * 28581) ^ 1601273780;
                        i2 = -183374868;
                    } else {
                        iM55680 = (i5 - C0946.m55979("ᩴۘ")) * 71;
                        i = ((iM55680 ^ i6) * 31669) ^ 1660545706;
                        i2 = -496865066;
                    }
                    C25085 c250819 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c250819;
                    break;
                case 242962898:
                case 1844522881:
                    c25085M20765 = c25085M20765;
                    if (ViewOnClickListenerC0939.m55949(RunnableC0897.m55783(sArr2, i14, i15, i13), c25085M56364.f80032)) {
                        iM55680 = (i5 - C0873.m55680("᩻ۧ")) * (-47);
                        i = ((iM55680 ^ i6) * 537) ^ (-904611070);
                        i2 = 1305631366;
                    } else {
                        iM55680 = C0873.m55680("ܰۛ") ^ i6;
                        i = ((iM55680 ^ i5) * 6647) ^ 374828081;
                        i2 = -165249175;
                    }
                    C25085 c2508110 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c2508110;
                    break;
                case 495460013:
                case 1005968934:
                    C0890.m55740();
                    c25085M20765 = c25085M20765;
                    iM55680 = (C0946.m55979("᩻۠") ^ i6) * (-13);
                    i = ((iM55680 ^ i5) * 28581) ^ 1601273780;
                    i2 = -183374868;
                    C25085 c2508111 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c2508111;
                    break;
                case 927183616:
                case 1153694018:
                    c25085M20765 = c25085M20765;
                    i15 = 5;
                    if (C0947.f81895) {
                        iM55680 = (C0946.m55979("ܶܳ") ^ i5) * 57;
                        i = ((iM55680 ^ i6) * (-15159)) ^ (-60804331);
                        i2 = -271051401;
                    } else {
                        iM55680 = C0873.m55680("֫۟") ^ i6;
                        i = ((iM55680 ^ i5) * (-18403)) ^ 2021304001;
                        i2 = 378577991;
                    }
                    C25085 c2508112 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c2508112;
                    break;
                case 1200075405:
                case 1369236635:
                    c25085M20765 = c25085M20765;
                    i12 = 149842081;
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0946.m55979("᩵ۚ") + i6) * (-103);
                        i = ((iM55680 ^ i5) * (-14123)) ^ (-207307802);
                        i2 = -1006725712;
                    } else {
                        iM55680 = (C0946.m55979("۠ܽ") + i6) * (-113);
                        i = ((iM55680 ^ i5) * 18551) ^ (-613404106);
                        i2 = 984115597;
                    }
                    C25085 c2508113 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c2508113;
                    break;
                case 1230850062:
                case 1649997464:
                    c25085M20765 = c25085M20765;
                    i9 = s + 12241;
                    if (C1024.f81946) {
                        iM55680 = (C0946.m55979("ܶܳ") ^ i5) * 57;
                        i = ((iM55680 ^ i6) * (-15159)) ^ (-60804331);
                        i2 = -271051401;
                    } else {
                        iM55680 = (i5 - C0946.m55979("۠ۢ")) * 123;
                        i = ((iM55680 ^ i6) * 629) ^ 132856276;
                        i2 = -223341254;
                    }
                    C25085 c2508114 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c2508114;
                    break;
                default:
                    c25085M20765 = c25085M20765;
                    s = sArr[c];
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0946.m55979("᩻۠") ^ i6) * (-13);
                        i = ((iM55680 ^ i5) * 28581) ^ 1601273780;
                        i2 = -183374868;
                    } else {
                        iM55680 = (C0873.m55680("ܳۜ") + i6) * 93;
                        i = ((iM55680 ^ i5) * (-5059)) ^ 1390462095;
                        i2 = 1871846970;
                    }
                    C25085 c2508115 = c25085M20765;
                    i8 = iM55680 ^ i2;
                    i7 = i;
                    c25085M20765 = c2508115;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25065 m20764() {
        C25085 c25085M56364 = null;
        C19701 c19701M56033 = null;
        String str = null;
        String str2 = null;
        long j = 0;
        C25065 c25065M44756 = null;
        C25085 c25085M20765 = null;
        String str3 = null;
        int i = 646083727;
        int i2 = C0930.f81879;
        int i3 = C0992.f81922;
        int iM55979 = (C0946.m55979("֫ᩳ") ^ i3) * (-61);
        int i4 = ((iM55979 ^ i2) * 23025) ^ (-883127331);
        int i5 = -1720780360;
        while (true) {
            i = ((((i ^ i2) * (-7461)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2020130938:
                case 1446575166:
                    c25085M20765.f80032 = str3;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("᩶᩻") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        iM55979 = C0946.m55979("ۧۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18439)) ^ 751396248;
                        i5 = 658186124;
                    }
                    break;
                case -2017599977:
                case 1756354853:
                    C0906.m55809();
                    C1036.m56257();
                    iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 953) ^ 2029508762;
                    i5 = -314695326;
                    break;
                case -1833473664:
                case -1132011884:
                    C4654.m9886();
                    iM55979 = (i2 - C0946.m55979("֡ܳ")) * 85;
                    i4 = ((iM55979 ^ i3) * 18461) ^ (-1306870980);
                    i5 = 829235760;
                    break;
                case -1821580631:
                case 917072317:
                    c25065M44756 = c19701M56033.m44756();
                    if (C0930.m55892(c25065M44756)) {
                        iM55979 = (C0946.m55979("۫᩸") + i2) * (-23);
                        i4 = ((iM55979 ^ i3) * 30183) ^ 1655542236;
                        i5 = -1373703734;
                    } else {
                        iM55979 = (C0946.m55979("ܰۡ") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * 1849) ^ 1544347895;
                        i5 = -858555373;
                    }
                    break;
                case -1557799028:
                case 1594722325:
                    if (C1194.m56397(c25085M56364.f80029)) {
                        iM55979 = (C0873.m55680("۫᩹") ^ i3) * (-61);
                        i4 = ((iM55979 ^ i2) * (-10727)) ^ (-1191609164);
                        i5 = 632142616;
                    } else {
                        iM55979 = C0946.m55979("ۤۚ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-12221)) ^ 1688914318;
                        i5 = 856070665;
                    }
                    break;
                case -1508175315:
                case -1257946058:
                    if (!C0947.m55997()) {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 953) ^ 2029508762;
                        i5 = -314695326;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩻ܰ")) * (-119);
                        i4 = ((iM55979 ^ i3) * 22027) ^ 1648139425;
                        i5 = 802667852;
                    }
                    break;
                case -1392265034:
                case 1677810804:
                    str = c25085M56364.f80028;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 953) ^ 2029508762;
                        i5 = -314695326;
                    } else {
                        iM55979 = (C0946.m55979("ۖۤ") ^ i3) * 49;
                        i4 = ((iM55979 ^ i2) * 14601) ^ 2088716852;
                        i5 = -1114379748;
                    }
                    break;
                case -1245179740:
                case 1039135180:
                    return c25065M44756;
                case -1200264277:
                case -250668545:
                    c19701M56033.m44743(j);
                    if (C0882.m55710() != 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    } else {
                        iM55979 = C0946.m55979("ۧܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21359) ^ 464706771;
                        i5 = -620216990;
                    }
                    break;
                case -1080207529:
                case 498804617:
                    c19701M56033 = C0955.m56033(C0719o.a.f2907m);
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("ᩴܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9391) ^ (-815015235);
                        i5 = 1487402746;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩷֡")) * 39;
                        i4 = ((iM55979 ^ i2) * 15103) ^ 1280778950;
                        i5 = 1461678206;
                    }
                    break;
                case -965540670:
                case 1864744606:
                    c19701M56033.m44744(str);
                    str2 = c25085M56364.f80029;
                    if (C0955.f81898) {
                        iM55979 = (C0946.m55979("᩶᩻") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        iM55979 = C0873.m55680("᩵ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13809)) ^ 1399245743;
                        i5 = 90828382;
                    }
                    break;
                case -895858007:
                case 1561073930:
                    c25085M20765.f80028 = str3;
                    c25085M20765.f80030 = str3;
                    m20778(c25085M20765);
                    iM55979 = (C0946.m55979("ܰۡ") + i3) * (-7);
                    i4 = ((iM55979 ^ i2) * 1849) ^ 1544347895;
                    i5 = -858555373;
                    break;
                case -100914128:
                case 34086771:
                    c25085M56364 = C1124.m56364();
                    if (c25085M56364 != null) {
                        iM55979 = (C0946.m55979("ۖܺ") ^ i2) * (-73);
                        i4 = ((iM55979 ^ i3) * (-30715)) ^ (-1697307585);
                        i5 = -186109429;
                    } else {
                        iM55979 = (C0873.m55680("۫᩹") ^ i3) * (-61);
                        i4 = ((iM55979 ^ i2) * (-10727)) ^ (-1191609164);
                        i5 = 632142616;
                    }
                    break;
                case 10261641:
                case 420991974:
                    C0989.m56095();
                    return null;
                case 136703337:
                case 1108852645:
                    if (C1046.f81962 > 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    } else {
                        iM55979 = (i2 - C0946.m55979("᩻ܰ")) * (-119);
                        i4 = ((iM55979 ^ i3) * 22027) ^ 1648139425;
                        i5 = 802667852;
                    }
                    break;
                case 389863994:
                case 1160485058:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i2 - C0946.m55979("᩻ܰ")) * (-119);
                        i4 = ((iM55979 ^ i3) * 22027) ^ 1648139425;
                        i5 = 802667852;
                    } else if (C0866.f81837 < 0) {
                        if (C0866.f81837 < 0) {
                            return new C25065(4);
                        }
                        iM55979 = (C0946.m55979("᩶᩻") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    }
                    break;
                case 584233674:
                case 1281199754:
                    if (c25065M44756.m55020()) {
                        iM55979 = (C0946.m55979("᩷ۨ") + i3) * (-33);
                        i4 = ((iM55979 ^ i2) * 12987) ^ 1915812007;
                        i5 = -515617781;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֡ܳ")) * 85;
                        i4 = ((iM55979 ^ i3) * 18461) ^ (-1306870980);
                        i5 = 829235760;
                    }
                    break;
                case 1660451921:
                case 2085359104:
                    c25085M20765 = m20765(c25085M56364);
                    str3 = "";
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0873.m55680("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    } else {
                        iM55979 = C0873.m55680("֡ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 6447) ^ 1190423909;
                        i5 = -1456804923;
                    }
                    break;
                case 1751791154:
                case 2085274655:
                    C0854.m55595();
                    if (!C1025.m56230()) {
                        iM55979 = C0946.m55979("᩻ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 953) ^ 2029508762;
                        i5 = -314695326;
                    } else {
                        iM55979 = C0946.m55979("ᩴܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 9391) ^ (-815015235);
                        i5 = 1487402746;
                    }
                    break;
                default:
                    C0866.m55644(c19701M56033, str2);
                    j = c25085M56364.f80027;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = (C0946.m55979("᩶᩻") + i3) * (-7);
                        i4 = ((iM55979 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        iM55979 = (C0873.m55680("֨ۜ") + i2) * (-55);
                        i4 = ((iM55979 ^ i3) * 2875) ^ (-993345766);
                        i5 = 69719813;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0192 A[PHI: r4 r7
      0x0192: PHI (r4v5 l.ᩳᩴۡ) = (r4v2 l.ᩳᩴۡ), (r4v3 l.ᩳᩴۡ), (r4v2 l.ᩳᩴۡ), (r4v2 l.ᩳᩴۡ), (r4v2 l.ᩳᩴۡ) binds: [B:47:0x0190, B:39:0x0148, B:14:0x0085, B:10:0x0067, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0192: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:47:0x0190, B:39:0x0148, B:14:0x0085, B:10:0x0067, B:6:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0288 A[PHI: r1
      0x0288: PHI (r1v18 l.᩻᩵ۡ) = (r1v17 l.᩻᩵ۡ), (r1v2 l.᩻᩵ۡ) binds: [B:69:0x026f, B:63:0x0249] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        if (p067l.C0898.f81858 > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005a, code lost:
    
        if (p067l.C1025.f81947 >= 0) goto L7;
     */
    /* JADX INFO: renamed from: ܳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C25065 m20781() throws IOException {
        C25085 c25085;
        short s;
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4 = C1017.f81942;
        int i5 = C0989.f81920;
        int iM559710 = (i4 - C0946.m55979("ۚ᩶")) * (-123);
        int i6 = ((iM559710 ^ i5) * (-11301)) ^ 106087025;
        C25065 c25065M44756 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ (-261315189);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = -788627263;
        int i16 = 0;
        String str = null;
        C19701 c19701M55781 = null;
        String strM20761 = null;
        String string = null;
        C25085 c25085M56079 = null;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * 7617) >> 31));
            switch (i15) {
                case -1943902533:
                case -1629857004:
                    i11 = 5174;
                    iM55680 = C0946.m55979("᩻ۜ") ^ i4;
                    i = ((iM55680 ^ i5) * 30751) ^ 1414730991;
                    i3 = 1206605859;
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1843747667:
                case 252070778:
                    if (C0937.m55923(c25085M56079.f80029)) {
                        iM55680 = (C0946.m55979("᩵᩶") + i5) * 39;
                        i = ((iM55680 ^ i4) * (-3399)) ^ 280642436;
                        i3 = 3021983;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۧܶ")) * 39;
                        i = ((iM55680 ^ i5) * (-31815)) ^ (-61169461);
                        i3 = 459117821;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1773047896:
                case -542397149:
                    c25085M56079 = C0967.m56079();
                    if (c25085M56079 != null) {
                        iM55680 = (i5 - C0873.m55680("ۤ᩷")) * (-39);
                        i = ((iM55680 ^ i4) * 9971) ^ (-425382915);
                        i3 = -1462563170;
                    } else {
                        iM55680 = (C0946.m55979("᩵᩶") + i5) * 39;
                        i = ((iM55680 ^ i4) * (-3399)) ^ 280642436;
                        i3 = 3021983;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1689004778:
                case -1267645387:
                    if (C0906.m55806(C0863.m55635(sArr, i12, i13, i11), c25085M56079.f80032)) {
                        iM55680 = C0873.m55680("᩶֨") ^ i4;
                        i = ((iM55680 ^ i5) * 3921) ^ 1123728299;
                        i3 = -804379954;
                    } else {
                        iM55680 = C0946.m55979("ۙܺ") ^ i5;
                        i = ((iM55680 ^ i4) * (-733)) ^ (-1512483984);
                        i3 = 7903295;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1473377805:
                case -1084705902:
                    return c25065M44756;
                case -1420778786:
                case -1266658330:
                    c19701M55781 = RunnableC0897.m55781(C0719o.a.f2906l);
                    c19701M55781.m44744(strM20761);
                    if (C0863.f81833 <= 0) {
                        iM55680 = (i4 - C0873.m55680("ۜۘ")) * 37;
                        i = ((iM55680 ^ i5) * 28239) ^ 856539455;
                        i3 = 1636846423;
                    } else {
                        iM55680 = C0946.m55979("ۧܺ") ^ i5;
                        i = ((iM55680 ^ i4) * (-16471)) ^ (-693072755);
                        i3 = -812888155;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1344980281:
                case 503732715:
                    s = s2;
                    c25085 = c25085M56079;
                    i16 = i14 + 1243225;
                    if (C0946.f81894 != 0) {
                        iM55979 = (i5 - C0873.m55680("۬ۜ")) * 19;
                        i = ((iM55979 ^ i4) * (-25605)) ^ (-328909063);
                        i2 = 1935079953;
                    } else {
                        iM55979 = C0873.m55680("ܽۢ") ^ i5;
                        i = ((iM55979 ^ i4) * (-3991)) ^ (-2061375992);
                        i2 = -10605718;
                    }
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case -1080678473:
                case -857376339:
                    c25085 = c25085M56079;
                    s = f82042[268];
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0946.m55979("᩻ۖ") ^ i4;
                        i = ((iM55979 ^ i5) * 30241) ^ 2013016496;
                        i2 = -1165238174;
                    } else {
                        iM55979 = C0946.m55979("ۤ֡") ^ i5;
                        i = ((iM55979 ^ i4) * (-11799)) ^ 1159266882;
                        i2 = 1001554971;
                    }
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case -1071849274:
                case -1014058711:
                    break;
                case -1032318414:
                case -979003799:
                    if (c25065M44756.m55020()) {
                        iM55680 = C0873.m55680("ۙۙ") ^ i4;
                        i = ((iM55680 ^ i5) * (-28923)) ^ 1197991193;
                        i3 = -1399721295;
                    } else {
                        iM55680 = (C0873.m55680("֨֨") ^ i5) * (-37);
                        i = ((iM55680 ^ i4) * (-18939)) ^ (-1427971742);
                        i3 = 975951582;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -1028179039:
                case 1493064471:
                    return new C25065(4);
                case -920010238:
                case 28579702:
                    return m20764();
                case -829389391:
                case 1377437459:
                    s = s2;
                    c25085 = c25085M56079;
                    i14 = s * s;
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("᩷᩹") ^ i4;
                        i = ((iM55979 ^ i5) * (-25673)) ^ 1154521381;
                        i2 = 2121234543;
                    } else {
                        iM55979 = C0873.m55680("ۨܳ") ^ i5;
                        i = ((iM55979 ^ i4) * (-28715)) ^ (-725425676);
                        i2 = 484925105;
                    }
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case -745563303:
                case 1137512014:
                    m20773(c25065M44756, strM20761, (String) null, false);
                    return c25065M44756;
                case -540006424:
                case 175904440:
                    i9 = i16 + i16;
                    s = s2;
                    i10 = s + 1115;
                    if (C1929.m56553()) {
                        c25085 = c25085M56079;
                        iM55979 = (i5 - C0873.m55680("۬ۜ")) * 19;
                        i = ((iM55979 ^ i4) * (-25605)) ^ (-328909063);
                        i2 = 1935079953;
                        i7 = iM55979 ^ i2;
                        c25085M56079 = c25085;
                        s2 = s;
                        i6 = i;
                    } else {
                        int iM55681 = C0873.m55680("ۙܶ") ^ i4;
                        i7 = iM55681 ^ 921024081;
                        s2 = s;
                        i6 = ((iM55681 ^ i5) * 31793) ^ (-1212491260);
                        c25085M56079 = c25085M56079;
                    }
                    break;
                case -474275087:
                case 236842498:
                    strM20761 = m20761(C0955.m56029(sArr2, i8, 6, i11), string);
                    if (C1053.f81965 > 0) {
                        iM55680 = (C0873.m55680("᩶᩶") + i4) * (-47);
                        i = ((iM55680 ^ i5) * (-18435)) ^ (-1287197199);
                        i3 = -890561844;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    s = s2;
                    c25085 = c25085M56079;
                    iM55979 = C0873.m55680("ۨܳ") ^ i5;
                    i = ((iM55979 ^ i4) * (-28715)) ^ (-725425676);
                    i2 = 484925105;
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case -413376154:
                case 1285660866:
                    if ((i10 * i10) - i9 > 0) {
                        iM55680 = (i5 - C0873.m55680("᩺᩺")) * (-113);
                        i = ((iM55680 ^ i4) * 30069) ^ 1403897279;
                        i3 = -470722805;
                    } else {
                        iM55680 = C0873.m55680("ۚܿ") ^ i4;
                        i = ((iM55680 ^ i5) * (-12725)) ^ 1647558535;
                        i3 = 1331924219;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -397231648:
                case 290560401:
                    sArr = f82042;
                    i12 = 269;
                    i13 = 3;
                    if (C1036.m56257() > 0) {
                        iM55680 = (i4 - C0873.m55680("ܳۢ")) * (-53);
                        i = ((iM55680 ^ i5) * 14017) ^ (-457262851);
                        i3 = 546394620;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    s = s2;
                    c25085 = c25085M56079;
                    iM55979 = C0873.m55680("ۨܳ") ^ i5;
                    i = ((iM55979 ^ i4) * (-28715)) ^ (-725425676);
                    i2 = 484925105;
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case -391435507:
                case 1202375037:
                    C0866.m55644(c19701M55781, str);
                    c25065M44756 = c19701M55781.m44756();
                    if (C0930.m55892(c25065M44756)) {
                        iM55680 = (C0873.m55680("ۛۧ") + i5) * (-65);
                        i = ((iM55680 ^ i4) * (-3415)) ^ 1835420824;
                        i3 = -2111584397;
                    } else {
                        iM55680 = (C0873.m55680("ۤ᩺") + i4) * (-69);
                        i = ((iM55680 ^ i5) * 16397) ^ 975629584;
                        i3 = -1115984823;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -372942483:
                case 971298135:
                    C0912.m55833();
                    if (C0992.f81922 < 0) {
                        iM55680 = (i4 - C0873.m55680("ۜۘ")) * 37;
                        i = ((iM55680 ^ i5) * 28239) ^ 856539455;
                        i3 = 1636846423;
                    } else {
                        iM55680 = (C0946.m55979("ܺ᩵") + i5) * (-43);
                        i = ((iM55680 ^ i4) * 12273) ^ 981323615;
                        i3 = 317183292;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case -178611927:
                case 1619621325:
                    string = Long.toString(c25085M56079.f80027);
                    sArr2 = f82042;
                    if (!C0955.f81898) {
                        iM55680 = C0946.m55979("ܽܶ") ^ i5;
                        i = ((iM55680 ^ i4) * 3467) ^ (-79628391);
                        i3 = -1998595678;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    s = s2;
                    c25085 = c25085M56079;
                    iM55979 = C0946.m55979("᩻ۖ") ^ i4;
                    i = ((iM55979 ^ i5) * 30241) ^ 2013016496;
                    i2 = -1165238174;
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case 541963922:
                case 984500225:
                    str = c25085M56079.f80029;
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = C0873.m55680("ۙ᩷") ^ i5;
                        i = ((iM55680 ^ i4) * (-32093)) ^ 1175834489;
                        i3 = -1299645100;
                        i7 = iM55680 ^ i3;
                        i6 = i;
                    }
                    s = s2;
                    c25085 = c25085M56079;
                    iM55979 = (i5 - C0873.m55680("۬ۜ")) * 19;
                    i = ((iM55979 ^ i4) * (-25605)) ^ (-328909063);
                    i2 = 1935079953;
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case 772753041:
                case 773371985:
                    C1024.m56209();
                    C0898.m55800();
                    s = s2;
                    c25085 = c25085M56079;
                    iM55979 = (i5 - C0873.m55680("۬ۜ")) * 19;
                    i = ((iM55979 ^ i4) * (-25605)) ^ (-328909063);
                    i2 = 1935079953;
                    i7 = iM55979 ^ i2;
                    c25085M56079 = c25085;
                    s2 = s;
                    i6 = i;
                    break;
                case 786573714:
                case 2100233538:
                    i11 = 26922;
                    iM55680 = C0946.m55979("᩻ۜ") ^ i4;
                    i = ((iM55680 ^ i5) * 30751) ^ 1414730991;
                    i3 = 1206605859;
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case 1121137652:
                case 1327614616:
                    C0912.m55833();
                    C0947.m55997();
                    return null;
                case 1199120601:
                case 2113791148:
                    i8 = 272;
                    if (C0927.f81875) {
                        iM55680 = (i4 - C0873.m55680("ۜۘ")) * 37;
                        i = ((iM55680 ^ i5) * 28239) ^ 856539455;
                        i3 = 1636846423;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܿ᩷")) * (-15);
                        i = ((iM55680 ^ i5) * (-29359)) ^ (-1051655194);
                        i3 = -1205137392;
                    }
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                case 2099783131:
                case 2140493875:
                    C4654.m9886();
                    iM55680 = (C0873.m55680("֨֨") ^ i5) * (-37);
                    i = ((iM55680 ^ i4) * (-18939)) ^ (-1427971742);
                    i3 = 975951582;
                    i7 = iM55680 ^ i3;
                    i6 = i;
                    break;
                default:
                    RunnableC0938.m55938();
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0357  */
    /* JADX WARN: Code duplicated, block: B:109:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:113:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02db  */
    /* JADX WARN: Code duplicated, block: B:97:0x0328  */
    /* JADX INFO: renamed from: ۧ */
    public static byte[] m20779(C22876 c22876) throws Throwable {
        int iM55680;
        int i;
        int i2 = RunnableC0938.f81886;
        int i3 = C1071.f81975;
        int iM55979 = (C0946.m55979("ۖ᩶") + i3) * 15;
        int i4 = ((iM55979 ^ i2) * 26561) ^ 965349119;
        int i5 = iM55979 ^ (-1820154243);
        Throwable th = null;
        Object obj = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        long size = 0;
        byte[] bArr = null;
        int i9 = 0;
        FileInputStream fileInputStreamM51089 = null;
        int i10 = -155822200;
        while (true) {
            int i11 = i5 ^ ((((i10 ^ i2) * (-20243)) >> 31) & i4);
            switch (i11) {
                case -2102861002:
                case 1781358397:
                    if (i6 < i9) {
                        iM55680 = C0873.m55680("᩸ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26899) ^ 1977234534;
                        i = 1882259981;
                    } else {
                        iM55680 = C0873.m55680("ᩳۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 3931) ^ (-1325774565);
                        i = 103707827;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -2088036535:
                case -2063811375:
                    if (C1053.f81965 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    } else {
                        iM55680 = (C0873.m55680("ܰۖ") ^ i2) * 53;
                        i4 = ((iM55680 ^ i3) * (-1327)) ^ (-1660728828);
                        i = 2054448405;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -2071644016:
                case 1020940134:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = (i2 - C0946.m55979("᩷ۨ")) * (-109);
                        i4 = ((iM55680 ^ i3) * 14459) ^ 2042092395;
                        i = -632180779;
                    } else {
                        iM55680 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21405)) ^ 1111546741;
                        i = 748114496;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -2050361885:
                case -145565886:
                    RunnableC0871.m55672();
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩷ۨ")) * (-109);
                        i4 = ((iM55680 ^ i3) * 14459) ^ 2042092395;
                        i = -632180779;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -2047926773:
                case 1530782709:
                    throw new C19050();
                case -1855264287:
                case 1538584103:
                    if (size <= 16384) {
                        iM55680 = (C0873.m55680("۫ۧ") + i2) * (-11);
                        i4 = ((iM55680 ^ i3) * (-22261)) ^ (-1566335892);
                        i = 1930813055;
                    } else {
                        iM55680 = C0873.m55680("ۤܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9367) ^ 1860046951;
                        i = -467030666;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1755924380:
                case 1712619587:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("۟ۘ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-21405)) ^ 1111546741;
                        i = 748114496;
                    } else {
                        iM55680 = C0873.m55680("ۗ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24627) ^ 592607871;
                        i = -1317109244;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1739927212:
                case -1371344071:
                    fileInputStreamM51089 = c22876.m51089();
                    iM55680 = (i3 - C0946.m55979("֨֫")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((iM55680 ^ i2) * 22689) ^ 673607353;
                    i = -865615309;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1714231831:
                case 1281955841:
                    C1017.m56187();
                    C0912.m55833();
                    iM55680 = (C0873.m55680("᩺᩻") ^ i2) * 37;
                    i4 = ((iM55680 ^ i3) * (-959)) ^ (-252931909);
                    i = -1228677595;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1421245241:
                case -935446463:
                    i9 = (int) size;
                    bArr = new byte[i9];
                    iM55680 = C0946.m55979("ۜ֨") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-24369)) ^ 2127996786;
                    i = 1413087784;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1384976849:
                case 1206834429:
                    throw new C19050();
                case -1184209088:
                case 1495927096:
                    size = C13853.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamM51089.getChannel()).size();
                    iM55680 = (C0873.m55680("ۚۡ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM55680 ^ i3) * 17365) ^ (-350042499);
                    i = -1571407960;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1083175801:
                case 351030805:
                    if (C0892.f81851) {
                        iM55680 = (C0873.m55680("᩵ᩴ") + i2) * 63;
                        i4 = ((iM55680 ^ i3) * 25713) ^ (-2052397910);
                        i = 2142147875;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֨۟")) * 49;
                        i4 = ((iM55680 ^ i2) * 16805) ^ (-1837886025);
                        i = -2052044679;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -1030574225:
                case 147397149:
                    throw new C19050();
                case -1016269160:
                case 701821500:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (C0873.m55680("᩺᩻") ^ i2) * 37;
                        i4 = ((iM55680 ^ i3) * (-959)) ^ (-252931909);
                        i = -1228677595;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܺ᩷")) * (-39);
                        i4 = ((iM55680 ^ i2) * (-14671)) ^ (-622271229);
                        i = 225146846;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -845014601:
                case -428697268:
                    if (i8 >= 0) {
                        iM55680 = C0873.m55680("֨ۤ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27605)) ^ 1517502399;
                        i = -1027712887;
                    } else {
                        iM55680 = C0873.m55680("ۘۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 3585) ^ 2043591720;
                        i = -703737657;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -826820335:
                case 1316977641:
                    if (C1024.m56209() >= 0) {
                        iM55680 = (i3 - C0946.m55979("֨۟")) * 49;
                        i4 = ((iM55680 ^ i2) * 16805) ^ (-1837886025);
                        i = -2052044679;
                    } else {
                        iM55680 = (C0946.m55979("ۖۨ") + i3) * 59;
                        i4 = ((iM55680 ^ i2) * 24227) ^ (-492964224);
                        i = 772944446;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -737875397:
                case 547193988:
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ۢܳ") + i2) * (-35);
                        i4 = ((iM55680 ^ i3) * (-13471)) ^ 1700146167;
                        i = -120645950;
                    } else {
                        iM55680 = (C0946.m55979("ᩴܳ") ^ i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 16721) ^ (-1205171044);
                        i = -1139796604;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -710538581:
                case 1019704053:
                    if (C1229.f82066 >= 0) {
                        iM55680 = (i2 - C0946.m55979("۫۟")) * (-15);
                        i4 = ((iM55680 ^ i3) * (-19823)) ^ (-260406286);
                        i = -1394270036;
                    } else {
                        iM55680 = C0873.m55680("ۧ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 7465) ^ 1764906662;
                        i = -1523575443;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -695033187:
                case 1180587304:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    } else {
                        iM55680 = C0873.m55680("ܿᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 13035) ^ 1593183794;
                        i = 1085253014;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -547896102:
                case 1971030590:
                    C0930.m55885();
                    if (C1053.f81965 > 0) {
                        iM55680 = (C0873.m55680("ܿۨ") + i2) * (-123);
                        i4 = ((iM55680 ^ i3) * 22757) ^ (-99393542);
                        i = 273043645;
                    } else {
                        iM55680 = (C0946.m55979("ۛ֨") ^ i3) * (-125);
                        i4 = ((iM55680 ^ i2) * (-10213)) ^ (-1985808503);
                        i = -1842634537;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -533817544:
                case -469421963:
                    i6 += i8;
                    iM55680 = C0946.m55979("֡֡") ^ i2;
                    i4 = ((iM55680 ^ i3) * 12835) ^ (-1943539051);
                    i = 323717180;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -500368660:
                case 1921058468:
                    i6 = 0;
                    iM55680 = C0946.m55979("֡֡") ^ i2;
                    i4 = ((iM55680 ^ i3) * 12835) ^ (-1943539051);
                    i = 323717180;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -329086400:
                case 236916680:
                    if (C0892.m55749()) {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۫۟")) * (-15);
                        i4 = ((iM55680 ^ i3) * (-19823)) ^ (-260406286);
                        i = -1394270036;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -193025472:
                case 1192680569:
                    fileInputStreamM51089.close();
                    return bArr;
                case -176864339:
                case 1770641941:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0946.m55979("ᩴܳ") ^ i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 16721) ^ (-1205171044);
                        i = -1139796604;
                    } else {
                        iM55680 = C0946.m55979("ۘ۫") ^ i3;
                        i4 = ((iM55680 ^ i2) * 28839) ^ 750797319;
                        i = 1897055595;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -139515499:
                case 170678105:
                    C1012.m56134();
                    if (C0947.f81895) {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    } else {
                        iM55680 = (C0946.m55979("ᩴܳ") ^ i2) * (-9);
                        i4 = ((iM55680 ^ i3) * 16721) ^ (-1205171044);
                        i = -1139796604;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case -86045628:
                case 908171355:
                    if (C0992.f81922 < 0) {
                        iM55680 = (i2 - C0946.m55979("᩷ۨ")) * (-109);
                        i4 = ((iM55680 ^ i3) * 14459) ^ 2042092395;
                        i = -632180779;
                    } else {
                        iM55680 = (C0873.m55680("ܿۨ") + i2) * (-123);
                        i4 = ((iM55680 ^ i3) * 22757) ^ (-99393542);
                        i = 273043645;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 27937488:
                case 1470742712:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0946.m55979("ۛ֨") ^ i3) * (-125);
                        i4 = ((iM55680 ^ i2) * (-10213)) ^ (-1985808503);
                        i = -1842634537;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۫ܰ")) * 71;
                        i4 = ((iM55680 ^ i3) * (-6861)) ^ (-1561191257);
                        i = 1228019990;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 135801600:
                case 299790486:
                    try {
                        fileInputStreamM51089.close();
                        iM55680 = (i2 - C0873.m55680("۬ۗ")) * (-5);
                        i4 = ((iM55680 ^ i3) * (-17799)) ^ 1147526962;
                        i = 1755198346;
                        i5 = iM55680 ^ i;
                        i10 = i11;
                    } catch (Throwable th2) {
                        int iM55681 = (i3 - C0873.m55680("֫᩸")) * (-77);
                        i4 = ((iM55681 ^ i2) * (-20249)) ^ (-1612817834);
                        int i12 = iM55681 ^ 1135153404;
                        obj = th2;
                        i10 = i11;
                        i5 = i12;
                    }
                    break;
                case 361346872:
                case 546738352:
                    i7 = fileInputStreamM51089.read();
                    iM55680 = (C0873.m55680("ܶ֡") + i2) * 33;
                    i4 = ((iM55680 ^ i3) * 14213) ^ (-1620668436);
                    i = -411899073;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 437509941:
                case 1994049974:
                    C0877.m55706(th, obj);
                    iM55680 = (i2 - C0873.m55680("۬ۗ")) * (-5);
                    i4 = ((iM55680 ^ i3) * (-17799)) ^ 1147526962;
                    i = 1755198346;
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 688891338:
                case 776823983:
                    if (i7 == -1) {
                        iM55680 = (C0946.m55979("ۤ᩷") ^ i3) * (-89);
                        i4 = ((iM55680 ^ i2) * 29551) ^ 2052805176;
                        i = 2089947877;
                    } else {
                        iM55680 = C0873.m55680("ۛ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20939)) ^ (-1584590820);
                        i = -891361361;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 744976659:
                case 1451856438:
                    try {
                        i8 = fileInputStreamM51089.read(bArr, i6, i9 - i6);
                        iM55680 = C0946.m55979("۫ۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-12655)) ^ 1441546126;
                        i = -350676424;
                    } catch (Throwable th3) {
                        th = th3;
                        iM55680 = (C0873.m55680("ᩳܳ") ^ i2) * (-59);
                        i4 = ((iM55680 ^ i3) * (-23313)) ^ (-926906120);
                        i = 1764973234;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 957059918:
                case 1035461020:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("᩺᩻") ^ i2) * 37;
                        i4 = ((iM55680 ^ i3) * (-959)) ^ (-252931909);
                        i = -1228677595;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                case 1298618912:
                case 1309590735:
                    throw th;
                case 1661464263:
                case 1876116264:
                    RunnableC0897.m55784();
                    if (C1025.f81947 < 0) {
                        iM55680 = (i3 - C0873.m55680("ᩴۢ")) * (-73);
                        i4 = ((iM55680 ^ i2) * (-20639)) ^ (-191395748);
                        i = -1188015841;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ܶ֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i2) * 12575) ^ (-2110832208);
                        i = -497604065;
                    }
                    i5 = iM55680 ^ i;
                    i10 = i11;
                    break;
                default:
                    C1404.m56468();
                    C0877.m55696();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m20780(byte[] bArr) throws C19050 {
        int length = 0;
        int i = 0;
        int length2 = 0;
        byte[] bArrCopyOf = null;
        int length3 = 0;
        int length4 = 0;
        byte[] bArrCopyOfRange = null;
        MessageDigest messageDigestM36668 = null;
        int i2 = -773379593;
        int i3 = C1012.f81938;
        int i4 = AbstractC0942.f81890;
        int iM55979 = (C0946.m55979("᩹۠") + i4) * 87;
        int i5 = ((iM55979 ^ i3) * (-5947)) ^ (-1653388621);
        int i6 = -871051557;
        while (true) {
            i2 = ((((i2 ^ i3) * (-30689)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2042998383:
                case -1050799428:
                    throw new C19050();
                case -2035853584:
                case 250772720:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("ܽܿ") + i3) * 31;
                        i5 = ((iM55979 ^ i4) * (-5013)) ^ (-1734526903);
                        i6 = -783815269;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ܿۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55979 ^ i3) * (-9351)) ^ 560317421;
                        i6 = -1501641115;
                    }
                    break;
                case -2021210492:
                case 2045533476:
                    if (C0955.f81898) {
                        iM55979 = (C0873.m55680("ܳۤ") ^ i3) * 123;
                        i5 = ((iM55979 ^ i4) * 2689) ^ 1616138807;
                        i6 = 1066721601;
                    } else {
                        iM55979 = (C0946.m55979("۠ۛ") ^ i4) * (-49);
                        i5 = ((iM55979 ^ i3) * (-1625)) ^ (-2110278286);
                        i6 = -1934666281;
                    }
                    break;
                case -1751036656:
                case 25282350:
                    C0894.m55769();
                    if (C1017.m56187() <= 0) {
                        iM55979 = C0946.m55979("ۗۤ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 17807) ^ (-1618282083);
                        i6 = -390276196;
                    } else {
                        iM55979 = (C0873.m55680("ܳۤ") ^ i3) * 123;
                        i5 = ((iM55979 ^ i4) * 2689) ^ 1616138807;
                        i6 = 1066721601;
                    }
                    break;
                case -1646947065:
                case 1834087688:
                    if (C0861.f81831) {
                        iM55979 = (C0873.m55680("۬ۡ") + i3) * 123;
                        i5 = ((iM55979 ^ i4) * 23447) ^ 2121881062;
                        i6 = 600056475;
                    } else {
                        iM55979 = C0873.m55680("ۧ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30127) ^ 1234045829;
                        i6 = 1981630603;
                    }
                    break;
                case -1431300314:
                case 586551796:
                    if (C0989.f81920 >= 0) {
                        iM55979 = (C0946.m55979("᩺۠") ^ i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-30711)) ^ (-788280649);
                        i6 = -1548985300;
                    } else {
                        iM55979 = C0946.m55979("ۧܳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-21137)) ^ (-1441106295);
                        i6 = -1142490380;
                    }
                    break;
                case -1254056018:
                case -786649896:
                    length2 = bArr.length - i;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("ۧ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30127) ^ 1234045829;
                        i6 = 1981630603;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۧ᩺")) * (-19);
                        i5 = ((iM55979 ^ i3) * 5483) ^ 1489901056;
                        i6 = -1702003428;
                    }
                    break;
                case -1190867267:
                case 2126345992:
                    length = bArr.length;
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("ۗۤ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 17807) ^ (-1618282083);
                        i6 = -390276196;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۖۚ")) * (-83);
                        i5 = ((iM55979 ^ i3) * (-3815)) ^ (-869669428);
                        i6 = -1951689957;
                    }
                    break;
                case -1105817870:
                case 1352573045:
                    C0861.m55626();
                    if (C0890.f81849 != 0) {
                        iM55979 = (C0873.m55680("ܳۤ") ^ i3) * 123;
                        i5 = ((iM55979 ^ i4) * 2689) ^ 1616138807;
                        i6 = 1066721601;
                    } else {
                        iM55979 = C0873.m55680("ۧ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30127) ^ 1234045829;
                        i6 = 1981630603;
                    }
                    break;
                case -1072003608:
                case 770387130:
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0873.m55680("ۧ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * 30127) ^ 1234045829;
                        i6 = 1981630603;
                    } else {
                        iM55979 = C0946.m55979("֨᩹") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26511) ^ 1264850566;
                        i6 = 848450685;
                    }
                    break;
                case -923554509:
                case 1133427966:
                    if (MessageDigest.isEqual(bArrCopyOfRange, messageDigestM36668.digest(bArrCopyOf))) {
                        iM55979 = C0873.m55680("۟᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-10395)) ^ 680404705;
                        i6 = 842778047;
                    } else {
                        iM55979 = (C0946.m55979("۟ܰ") + i3) * (-91);
                        i5 = ((iM55979 ^ i4) * (-14459)) ^ (-755385151);
                        i6 = -977042673;
                    }
                    break;
                case -724704435:
                case -439713569:
                    i = 32;
                    if (length >= 32) {
                        iM55979 = C0873.m55680("᩸ۡ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 15021) ^ (-1947154068);
                        i6 = 1678494873;
                    } else {
                        iM55979 = C0873.m55680("ۡ᩸") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-13065)) ^ 1609374505;
                        i6 = -1745587576;
                    }
                    break;
                case -706971911:
                case 384924570:
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, length3, length4);
                    messageDigestM36668 = C16111.m36668();
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0946.m55979("᩺۠") ^ i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-30711)) ^ (-788280649);
                        i6 = -1548985300;
                    } else {
                        iM55979 = C0946.m55979("᩹ۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-4399)) ^ 407010917;
                        i6 = -157688747;
                    }
                    break;
                case -652716188:
                case 199511244:
                    bArrCopyOf = Arrays.copyOf(bArr, length2);
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("ۗۤ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 17807) ^ (-1618282083);
                        i6 = -390276196;
                    } else {
                        iM55979 = C0946.m55979("ۨܺ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 14071) ^ (-1077714411);
                        i6 = 347874096;
                    }
                    break;
                case -511032518:
                case 548871149:
                    ServiceConnectionC1013.m56157();
                    return null;
                case 778615450:
                case 1687266634:
                    return bArrCopyOf;
                case 1020591085:
                case 1699083971:
                    if (RunnableC1014.f81941 > 0) {
                        iM55979 = (C0946.m55979("᩺۠") ^ i3) * (-9);
                        i5 = ((iM55979 ^ i4) * (-30711)) ^ (-788280649);
                        i6 = -1548985300;
                    } else {
                        iM55979 = (C0873.m55680("ܳۤ") ^ i3) * 123;
                        i5 = ((iM55979 ^ i4) * 2689) ^ 1616138807;
                        i6 = 1066721601;
                    }
                    break;
                case 1063389986:
                case 2143046901:
                    C1044.m56286();
                    C1929.m56553();
                    iM55979 = C0873.m55680("ۧ۬") ^ i4;
                    i5 = ((iM55979 ^ i3) * 30127) ^ 1234045829;
                    i6 = 1981630603;
                    break;
                case 1500462533:
                case 1689702482:
                    throw new C19050();
                default:
                    length3 = bArrCopyOf.length;
                    length4 = bArr.length;
                    if (C0894.f81854 >= 0) {
                        iM55979 = (C0873.m55680("ܽܿ") + i3) * 31;
                        i5 = ((iM55979 ^ i4) * (-5013)) ^ (-1734526903);
                        i6 = -783815269;
                    } else {
                        iM55979 = C0873.m55680("ܳܰ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 15891) ^ 878203169;
                        i6 = -2089410777;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20770(C22876 c22876, byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamM51091 = null;
        IOException e = null;
        boolean zEquals = false;
        int i = -175553367;
        int i2 = C1053.f81965;
        int i3 = ViewOnClickListenerC0939.f81888;
        int iM55680 = C0873.m55680("ۛ᩺") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-10399)) ^ 32491809;
        int i5 = 822616678;
        while (true) {
            i = ((((i ^ i3) * 19637) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1980320790:
                case 168319608:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("ۡܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5121)) ^ 1487487487;
                        i5 = 1126016949;
                    } else {
                        iM55680 = C0946.m55979("᩹᩹") ^ i3;
                        i4 = ((iM55680 ^ i2) * 22249) ^ (-1484540568);
                        i5 = -1189497375;
                    }
                    break;
                case -1792249831:
                case 1001658797:
                    if (C0845.m55584() <= 0) {
                        iM55680 = C0946.m55979("᩺ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۨۘ")) * (-105);
                        i4 = ((iM55680 ^ i3) * 1697) ^ (-352137188);
                        i5 = -1502607702;
                    }
                    break;
                case -1748342213:
                case 288137295:
                    return;
                case -1707546669:
                case 169680979:
                    if (!C0917.m55854()) {
                        iM55680 = C0946.m55979("ۡܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5121)) ^ 1487487487;
                        i5 = 1126016949;
                    } else {
                        iM55680 = C0946.m55979("᩺ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    }
                    break;
                case -1687991728:
                case 1852721487:
                    if (zEquals) {
                        iM55680 = C0946.m55979("ۤܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3925)) ^ (-116867707);
                        i5 = -1008135488;
                    } else {
                        iM55680 = (C0946.m55979("ۤ۬") + i3) * (-21);
                        i4 = ((iM55680 ^ i2) * (-20407)) ^ (-1291654857);
                        i5 = -1038842690;
                    }
                    break;
                case -1447125003:
                case 1868867758:
                    if (C0949.m56012()) {
                        iM55680 = C0946.m55979("᩺ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        iM55680 = (C0873.m55680("ۜ᩸") ^ i2) * 41;
                        i4 = ((iM55680 ^ i3) * (-5871)) ^ 1214944452;
                        i5 = 1263142870;
                    }
                    break;
                case -1414502023:
                case -619318037:
                    throw new IOException();
                case -1109762609:
                case 469088050:
                    if (C0946.f81894 != 0) {
                        iM55680 = (i2 - C0873.m55680("۬ܿ")) * (-61);
                        i4 = ((iM55680 ^ i3) * 3743) ^ (-2128487432);
                        i5 = -1943917332;
                    } else {
                        iM55680 = C0946.m55979("ۜۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 32135) ^ 122681489;
                        i5 = -1045372455;
                    }
                    break;
                case -1034588041:
                case 60836827:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28905)) ^ (-691198752);
                        i5 = -1055979267;
                    } else {
                        iM55680 = (C0946.m55979("ۧۡ") ^ i3) * (-125);
                        i4 = ((iM55680 ^ i2) * 11867) ^ 909984231;
                        i5 = 1666926509;
                    }
                    break;
                case -979818045:
                case 1309281812:
                    C0992.m56107();
                    if (ViewOnClickListenerC0939.m55941() < 0) {
                        iM55680 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28905)) ^ (-691198752);
                        i5 = -1055979267;
                    } else {
                        iM55680 = C0946.m55979("᩺ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    }
                    break;
                case -783753794:
                case 1281543305:
                    if (!C0947.m55997()) {
                        iM55680 = (i2 - C0946.m55979("ۨۘ")) * (-105);
                        i4 = ((iM55680 ^ i3) * 1697) ^ (-352137188);
                        i5 = -1502607702;
                    } else {
                        iM55680 = (C0873.m55680("֨ۘ") ^ i3) * 45;
                        i4 = ((iM55680 ^ i2) * 20509) ^ 1066863600;
                        i5 = -2078268113;
                    }
                    break;
                case -647150708:
                case 677076532:
                    try {
                        fileOutputStreamM51091.write(bArr);
                        fileOutputStreamM51091.getFD().sync();
                        c22876.m51085(fileOutputStreamM51091);
                        zEquals = Arrays.equals(bArr, c22876.m51087());
                        iM55680 = C0946.m55979("ۚۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16717)) ^ 1371878473;
                        i5 = 1513274154;
                    } catch (IOException e2) {
                        e = e2;
                        iM55680 = (C0873.m55680("ۚ᩸") + i3) * (-89);
                        i4 = ((iM55680 ^ i2) * (-4909)) ^ 1515342746;
                        i5 = -48259538;
                    }
                    break;
                case -491575138:
                case 389996539:
                    if (!C0882.f81846) {
                        iM55680 = C0946.m55979("ۧۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28905)) ^ (-691198752);
                        i5 = -1055979267;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۖ") ^ i2) * (-121);
                        i4 = ((iM55680 ^ i3) * (-26913)) ^ (-1812907567);
                        i5 = 1936546148;
                    }
                    break;
                case -489748505:
                case -169077894:
                    fileOutputStreamM51091 = c22876.m51091();
                    iM55680 = (i2 - C0946.m55979("֡ܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((iM55680 ^ i3) * 14761) ^ 214824374;
                    i5 = -986661915;
                    break;
                case -416516154:
                case 1113015197:
                    c22876.m51084(fileOutputStreamM51091);
                    throw e;
                case -315007242:
                case -260628791:
                    if (C0854.f81826 != 0) {
                        iM55680 = (i2 - C0946.m55979("ۨۘ")) * (-105);
                        i4 = ((iM55680 ^ i3) * 1697) ^ (-352137188);
                        i5 = -1502607702;
                    } else {
                        iM55680 = C0873.m55680("ᩳۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 9635) ^ (-1289524710);
                        i5 = -1646162935;
                    }
                    break;
                case 89449905:
                case 771677040:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("֨ۘ") ^ i3) * 45;
                        i4 = ((iM55680 ^ i2) * 20509) ^ 1066863600;
                        i5 = -2078268113;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۙۢ")) * 95;
                        i4 = ((iM55680 ^ i3) * (-24367)) ^ 184611214;
                        i5 = 1466008872;
                    }
                    break;
                case 440367885:
                case 791238837:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (i2 - C0873.m55680("۬ܿ")) * (-61);
                        i4 = ((iM55680 ^ i3) * 3743) ^ (-2128487432);
                        i5 = -1943917332;
                    } else {
                        iM55680 = (i3 - C0946.m55979("᩻۫")) * (-93);
                        i4 = ((iM55680 ^ i2) * 23093) ^ (-1140507940);
                        i5 = 1808770471;
                    }
                    break;
                case 553499554:
                case 1609183521:
                    C1017.m56187();
                    return;
                case 615955001:
                case 966147879:
                    if (C0906.m55809() <= 0) {
                        iM55680 = (i2 - C0873.m55680("۬ܿ")) * (-61);
                        i4 = ((iM55680 ^ i3) * 3743) ^ (-2128487432);
                        i5 = -1943917332;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ܶ۬")) * (-105);
                        i4 = ((iM55680 ^ i3) * 13481) ^ (-27368675);
                        i5 = 1153750153;
                    }
                    break;
                case 697416066:
                case 1038218965:
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ᩳۖ") ^ i2) * (-121);
                        i4 = ((iM55680 ^ i3) * (-26913)) ^ (-1812907567);
                        i5 = 1936546148;
                    } else {
                        iM55680 = C0946.m55979("᩷۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11883)) ^ 1980396982;
                        i5 = 1310712947;
                    }
                    break;
                case 981496969:
                case 1980701297:
                    if (C1046.f81962 <= 0) {
                        iM55680 = C0946.m55979("᩺ۙ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        iM55680 = C0946.m55979("᩺ᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2653) ^ (-238584721);
                        i5 = 1840698410;
                    }
                    break;
                default:
                    C1028.m56247();
                    C1964.m56597();
                    iM55680 = (i2 - C0946.m55979("ۨۘ")) * (-105);
                    i4 = ((iM55680 ^ i3) * 1697) ^ (-352137188);
                    i5 = -1502607702;
                    break;
            }
        }
    }
}
