package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D76O */
/* JADX INFO: loaded from: classes4.dex */
public final class C20415 {

    /* JADX INFO: renamed from: ܽܽ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f65876 = {1001, 23634, 23635, 23630, 23639, 23630, 23643, 23642, 23620, 23635, 23621, 23641, 23619, 23620, 23637, 23635, 23657, 23618, 23639, 23636, 23642, 23635};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15799 f65877;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f65878;

    public C20415(C15799 c15799, C10247 c10247) {
        this.f65877 = c15799;
        this.f65878 = c10247;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x06ad A[PHI: r2 r4 r5 r11 r14 r29
      0x06ad: PHI (r2v66 l.᩸᩷ۜ) = (r2v62 l.᩸᩷ۜ), (r2v64 l.᩸᩷ۜ), (r2v67 l.᩸᩷ۜ) binds: [B:166:0x06ab, B:158:0x0653, B:150:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x06ad: PHI (r4v24 int) = (r4v20 int), (r4v22 int), (r4v25 int) binds: [B:166:0x06ab, B:158:0x0653, B:150:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x06ad: PHI (r5v9 short) = (r5v2 short), (r5v2 short), (r5v10 short) binds: [B:166:0x06ab, B:158:0x0653, B:150:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x06ad: PHI (r11v40 int) = (r11v36 int), (r11v38 int), (r11v41 int) binds: [B:166:0x06ab, B:158:0x0653, B:150:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x06ad: PHI (r14v39 java.lang.String) = (r14v35 java.lang.String), (r14v37 java.lang.String), (r14v40 java.lang.String) binds: [B:166:0x06ab, B:158:0x0653, B:150:0x05fe] A[DONT_GENERATE, DONT_INLINE]
      0x06ad: PHI (r29v20 l.᩸᩷ۜ) = (r29v16 l.᩸᩷ۜ), (r29v18 l.᩸᩷ۜ), (r29v21 l.᩸᩷ۜ) binds: [B:166:0x06ab, B:158:0x0653, B:150:0x05fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0226 A[PHI: r11 r14 r24 r27 r28 r30
      0x0226: PHI (r11v19 int) = (r11v3 int), (r11v18 int), (r11v20 int) binds: [B:60:0x01e0, B:65:0x020f, B:55:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r14v17 l.᩸᩷ۜ) = (r14v3 l.᩸᩷ۜ), (r14v16 l.᩸᩷ۜ), (r14v18 l.᩸᩷ۜ) binds: [B:60:0x01e0, B:65:0x020f, B:55:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r24v4 int) = (r24v2 int), (r24v1 int), (r24v1 int) binds: [B:60:0x01e0, B:65:0x020f, B:55:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r27v15 l.᩸᩷ۜ) = (r27v0 l.᩸᩷ۜ), (r27v14 l.᩸᩷ۜ), (r27v16 l.᩸᩷ۜ) binds: [B:60:0x01e0, B:65:0x020f, B:55:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r28v13 int) = (r28v0 int), (r28v12 int), (r28v14 int) binds: [B:60:0x01e0, B:65:0x020f, B:55:0x0196] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r30v14 short) = (r30v0 short), (r30v13 short), (r30v15 short) binds: [B:60:0x01e0, B:65:0x020f, B:55:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (l.C0630.f2410 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        r29 = r6;
        r2 = r11;
        r11 = r4;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (l.C1773.f6144 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        if (l.C21923.f70183 == 0) goto L39;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17592 m46820(C14852 c14852, C17178 c17178, C15923 c15923) throws Throwable {
        C21826 c21826;
        int i;
        C21826 c21827;
        C21826 c21828;
        int i2;
        C21826 c21829;
        int i3;
        int iM2566;
        int i4;
        int i5;
        String str;
        int iM6981;
        int i6;
        int i7;
        int iM6982;
        int i8;
        int i9;
        C21826 c21826M46815;
        String str2;
        int iM6983;
        int i10;
        int i11;
        int iM2567;
        int i12;
        int i13;
        int i14;
        int i15;
        short s;
        C21826 c218210;
        int i16;
        String str3;
        C21826 c218211;
        int iM6984;
        int i17;
        int i18;
        C21826 c218212;
        int i19;
        int iM6985;
        int i20;
        int i21;
        int iM2568;
        int i22;
        int i23 = C3746.f11829;
        int i24 = ViewOnClickListenerC1958.f6529;
        int iM2569 = (C0630.m2566("᩻᩻") ^ i24) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i25 = ((iM2569 ^ i23) * 9723) ^ (-1701715651);
        String str4 = null;
        String str5 = null;
        Throwable th = null;
        C21826 c218213 = null;
        C21826 c21826M46816 = null;
        int i26 = iM2569 ^ 1340499362;
        int i27 = 0;
        short s2 = 0;
        ArrayList arrayList = null;
        int i28 = 0;
        int i29 = 0;
        boolean zM6437 = false;
        boolean zM4369 = false;
        boolean zM6438 = false;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        C21826 c218214 = null;
        ArrayList arrayList2 = null;
        int i33 = -1900909269;
        while (true) {
            i33 = i26 ^ (i25 & (((i33 ^ i23) * (-8135)) >> 31));
            switch (i33) {
                case -2128496871:
                case -1069599870:
                    if (C3663.m11168() < 0) {
                        c21827 = c21826M46816;
                        c21828 = c218214;
                        i27 = i27;
                        i2 = i28;
                        str2 = str5;
                        iM6983 = (C2105.m6981("ۖۛ") + i24) * (-75);
                        i10 = ((iM6983 ^ i23) * (-17203)) ^ 1886227971;
                        i11 = -1962113526;
                        i13 = iM6983 ^ i11;
                        str5 = str2;
                        c21826M46816 = c21827;
                        i28 = i2;
                        i27 = i27;
                        c218214 = c21828;
                        i26 = i13;
                        i25 = i10;
                        i33 = i33;
                    }
                    iM2568 = C0630.m2566("ۚۛ") ^ i24;
                    i10 = ((iM2568 ^ i23) * (-17263)) ^ 39664660;
                    i22 = 280961780;
                    i26 = i22 ^ iM2568;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -1849311551:
                case 200092450:
                    s2 = s2;
                    c21829 = c21826M46816;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    str = str5;
                    zM4369 = C1294.m4369(C0483.m2128(f65876, 4, 4, i27), str);
                    iM6981 = (i24 - C2105.m6981("ᩳܺ")) * (-109);
                    i6 = ((iM6981 ^ i23) * 21309) ^ (-1860075732);
                    i7 = -2021535793;
                    i26 = i7 ^ iM6981;
                    i25 = i6;
                    i27 = i27;
                    str5 = str;
                    c218214 = c218214;
                    i28 = i28;
                    c21826M46816 = c21829;
                    s2 = s2;
                    break;
                case -1809409960:
                case 1983407149:
                    i15 = i27;
                    s = s2;
                    c218210 = c21826M46816;
                    i16 = i28;
                    str3 = str5;
                    arrayList = new ArrayList();
                    c218211 = c17178.f52649;
                    if (C1420.m4913()) {
                        iM6984 = (C0630.m2566("ᩴ᩵") + i23) * (-99);
                        i17 = ((iM6984 ^ i24) * 21523) ^ 581972855;
                        i18 = 327422884;
                    } else {
                        iM6984 = C2105.m6981("֡ۢ") ^ i24;
                        i17 = ((iM6984 ^ i23) * (-18897)) ^ 866044455;
                        i18 = -1245652910;
                    }
                    i = iM6984 ^ i18;
                    str5 = str3;
                    c21826M46816 = c218210;
                    s2 = s;
                    i28 = i16;
                    i27 = i15;
                    c218214 = c218211;
                    i25 = i17;
                    i26 = i;
                    i33 = i33;
                    break;
                case -1551739922:
                case -1022996659:
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    if (C0798.f2919) {
                        iM6983 = C2105.m6981("᩻ۙ") ^ i23;
                        i10 = ((iM6983 ^ i24) * 29145) ^ 1854192857;
                        i11 = 1864740926;
                    } else {
                        iM6983 = C0630.m2566("᩵۬") ^ i24;
                        i10 = ((iM6983 ^ i23) * (-8855)) ^ (-1648649981);
                        i11 = 78443962;
                    }
                    i13 = iM6983 ^ i11;
                    str5 = str2;
                    c21826M46816 = c21827;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -1447916545:
                case 2038294802:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    if (zM4369) {
                        iM6982 = (i23 - C2105.m6981("᩹۟")) * (-5);
                        i8 = ((iM6982 ^ i24) * 9167) ^ (-241992257);
                        i9 = -1747887532;
                    } else {
                        iM6982 = C2105.m6981("ۢ᩶") ^ i24;
                        i8 = ((iM6982 ^ i23) * (-30373)) ^ 1495280684;
                        i9 = 1913602599;
                    }
                    i26 = i9 ^ iM6982;
                    i25 = i8;
                    i27 = i27;
                    c21826M46816 = c21826;
                    i33 = i33;
                    c218214 = c218214;
                    i28 = i28;
                    s2 = s2;
                    break;
                case -1431383899:
                case -446574276:
                    s2 = s2;
                    c21829 = c21826M46816;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    str = str5;
                    zM6437 = ViewOnClickListenerC1958.m6437(C4616.m13542(f65876, 1, 3, i27), str);
                    iM6981 = (i23 - C2105.m6981("۫᩷")) * (-79);
                    i6 = ((iM6981 ^ i24) * (-8191)) ^ (-231832161);
                    i7 = -1789582335;
                    i26 = i7 ^ iM6981;
                    i25 = i6;
                    i27 = i27;
                    str5 = str;
                    c218214 = c218214;
                    i28 = i28;
                    c21826M46816 = c21829;
                    s2 = s2;
                    break;
                case -1324128914:
                case 1837156602:
                    RunnableC0588.m2441();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        s2 = s2;
                        c218214 = c218214;
                        i28 = i28;
                        i27 = i27;
                        c21826 = c21826M46816;
                        iM6982 = C2105.m6981("ܿۗ") ^ i24;
                        i8 = ((iM6982 ^ i23) * 17333) ^ 29684172;
                        i9 = 1709479554;
                        i26 = i9 ^ iM6982;
                        i25 = i8;
                        i27 = i27;
                        c21826M46816 = c21826;
                        i33 = i33;
                        c218214 = c218214;
                        i28 = i28;
                        s2 = s2;
                    }
                    s2 = s2;
                    c21829 = c21826M46816;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    str = str5;
                    iM6981 = C2105.m6981("ۡۨ") ^ i23;
                    i6 = ((iM6981 ^ i24) * 26335) ^ 1449969648;
                    i7 = -1494833344;
                    i26 = i7 ^ iM6981;
                    i25 = i6;
                    i27 = i27;
                    str5 = str;
                    c218214 = c218214;
                    i28 = i28;
                    c21826M46816 = c21829;
                    s2 = s2;
                    break;
                case -1213288424:
                case -1021887549:
                    i14 = 21305;
                    int iM25610 = (i23 - C0630.m2566("ۤ۠")) * 123;
                    int i34 = ((iM25610 ^ i24) * 26893) ^ 107416833;
                    c218214 = c218214;
                    str5 = str5;
                    c21826M46816 = c21826M46816;
                    s2 = s2;
                    i26 = iM25610 ^ (-36008405);
                    i28 = i28;
                    i33 = i33;
                    i27 = i14;
                    i25 = i34;
                    break;
                case -1148399086:
                case 899706651:
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    if (C0630.m2564()) {
                        iM6983 = C0630.m2566("ܰۧ") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-25993)) ^ (-823152025);
                        i11 = -674576324;
                    } else {
                        iM6983 = C2105.m6981("ܺܿ") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-12627)) ^ (-1247105979);
                        i11 = -1378069300;
                    }
                    i13 = iM6983 ^ i11;
                    str5 = str2;
                    c21826M46816 = c21827;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -1067944893:
                case -592707800:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    if (!C0422.m1963()) {
                        c21827 = c21826;
                        c21828 = c218214;
                        i2 = i28;
                        s2 = s2;
                        str2 = str5;
                        iM6983 = C0630.m2566("ᩳ۫") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-9329)) ^ (-1177497288);
                        i11 = -1805984087;
                        i13 = iM6983 ^ i11;
                        str5 = str2;
                        c21826M46816 = c21827;
                        i28 = i2;
                        i27 = i27;
                        c218214 = c21828;
                        i26 = i13;
                        i25 = i10;
                        i33 = i33;
                    } else {
                        if (C3663.m11168() < 0) {
                            return new C17592(c14852.f45300, str4, arrayList, new C21826(i31, 0, 0, 0, 0, 0));
                        }
                        iM6982 = C2105.m6981("ܿۗ") ^ i24;
                        i8 = ((iM6982 ^ i23) * 17333) ^ 29684172;
                        i9 = 1709479554;
                        i26 = i9 ^ iM6982;
                        i25 = i8;
                        i27 = i27;
                        c21826M46816 = c21826;
                        i33 = i33;
                        c218214 = c218214;
                        i28 = i28;
                        s2 = s2;
                    }
                    break;
                case -888800404:
                case -501678046:
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6983 = (C2105.m6981("ۖۛ") + i24) * (-75);
                        i10 = ((iM6983 ^ i23) * (-17203)) ^ 1886227971;
                        i11 = -1962113526;
                    } else {
                        iM6983 = (i24 - C2105.m6981("۠ܽ")) * (-117);
                        i10 = ((iM6983 ^ i23) * 31659) ^ (-603914344);
                        i11 = -529445865;
                    }
                    i13 = iM6983 ^ i11;
                    str5 = str2;
                    c21826M46816 = c21827;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -830754563:
                case 220307959:
                    i14 = 23606;
                    int iM25611 = (i23 - C0630.m2566("ۤ۠")) * 123;
                    int i35 = ((iM25611 ^ i24) * 26893) ^ 107416833;
                    c218214 = c218214;
                    str5 = str5;
                    c21826M46816 = c21826M46816;
                    s2 = s2;
                    i26 = iM25611 ^ (-36008405);
                    i28 = i28;
                    i33 = i33;
                    i27 = i14;
                    i25 = i35;
                    break;
                case -779708003:
                case 1133035739:
                    C1128.m3851();
                    C2520.m8026();
                    return null;
                case -767407578:
                case 253768912:
                    C2105.m6982();
                    if (C4159.f13567) {
                        s = s2;
                        c218210 = c21826M46816;
                        c218211 = c218214;
                        i15 = i27;
                        i16 = i28;
                        str3 = str5;
                        iM6984 = (C0630.m2566("ᩴ᩵") + i23) * (-99);
                        i17 = ((iM6984 ^ i24) * 21523) ^ 581972855;
                        i18 = 327422884;
                        i = iM6984 ^ i18;
                        str5 = str3;
                        c21826M46816 = c218210;
                        s2 = s;
                        i28 = i16;
                        i27 = i15;
                        c218214 = c218211;
                        i25 = i17;
                        i26 = i;
                        i33 = i33;
                    }
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    iM6983 = C2105.m6981("᩻ۙ") ^ i23;
                    i10 = ((iM6983 ^ i24) * 29145) ^ 1854192857;
                    i11 = 1864740926;
                    i13 = iM6983 ^ i11;
                    str5 = str2;
                    c21826M46816 = c21827;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -753884809:
                case -227824213:
                    s2 = s2;
                    c21829 = c21826M46816;
                    c218214 = c218214;
                    i27 = i27;
                    str5 = (String) C3537.m10755(arrayList2, i29);
                    i3 = i28;
                    if (i29 == i3) {
                        c218213 = c218214;
                        iM2566 = C0630.m2566("۟᩹") ^ i24;
                        i4 = ((iM2566 ^ i23) * 5489) ^ 1298621617;
                        i5 = -24273944;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i24;
                        i4 = ((iM2566 ^ i23) * 17951) ^ (-1839999965);
                        i5 = 492791425;
                    }
                    i26 = i5 ^ iM2566;
                    i25 = i4;
                    i28 = i3;
                    i27 = i27;
                    c218214 = c218214;
                    c21826M46816 = c21829;
                    s2 = s2;
                    break;
                case -743424009:
                case -283127997:
                    int i36 = C8869.f27007;
                    throw th;
                case -697696728:
                case 52217257:
                    s2 = s2;
                    c21829 = c21826M46816;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    str = str5;
                    if (zM6437) {
                        iM6981 = C2105.m6981("᩷۠") ^ i23;
                        i6 = ((iM6981 ^ i24) * 30093) ^ 1581182839;
                        i7 = 708529819;
                    } else {
                        iM6981 = C2105.m6981("᩶ۗ") ^ i23;
                        i6 = ((iM6981 ^ i24) * 8679) ^ (-1369392474);
                        i7 = -148910843;
                    }
                    i26 = i7 ^ iM6981;
                    i25 = i6;
                    i27 = i27;
                    str5 = str;
                    c218214 = c218214;
                    i28 = i28;
                    c21826M46816 = c21829;
                    s2 = s2;
                    break;
                case -505165564:
                case 745913086:
                    c218212 = c21826M46816;
                    c21828 = c218214;
                    str4 = c17178.f52650;
                    arrayList2 = c17178.f52651;
                    i29 = c21828.f69914;
                    i19 = i29;
                    int iM25612 = (C0630.m2566("֡ܶ") ^ i23) * (-111);
                    i10 = ((iM25612 ^ i24) * (-22187)) ^ 1440079037;
                    i13 = iM25612 ^ (-1834377453);
                    i27 = i27;
                    str5 = str5;
                    i28 = i19;
                    c21826M46816 = c218212;
                    s2 = s2;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -314422413:
                case 298372915:
                    return new C17592(c14852.f45300, str4, arrayList, null);
                case -226448236:
                case 382689338:
                    C1773.m5908();
                    iM2568 = C0630.m2566("֨ܿ") ^ i24;
                    i10 = ((iM2568 ^ i23) * 20715) ^ (-1710738415);
                    i22 = -2052748483;
                    i26 = i22 ^ iM2568;
                    i25 = i10;
                    i33 = i33;
                    break;
                case -184137949:
                case 353460388:
                    int i37 = C8869.f27007;
                    return new C17592(c14852.f45300, str4, arrayList, c21826M46816);
                case -170740413:
                case 1409625805:
                    short s3 = s2;
                    C21826 c218215 = c21826M46816;
                    C21826 c218216 = c218214;
                    int i38 = i27;
                    int i39 = i28;
                    String str6 = str5;
                    if (i29 < C0382.m1847(arrayList2)) {
                        iM6985 = C0630.m2566("֨᩻") ^ i23;
                        i20 = ((iM6985 ^ i24) * 9207) ^ 1125374507;
                        i21 = -1800262499;
                    } else {
                        iM6985 = (i24 - C2105.m6981("ܶۖ")) * (-97);
                        i20 = ((iM6985 ^ i23) * 8313) ^ 1457799244;
                        i21 = -208381190;
                    }
                    i26 = i21 ^ iM6985;
                    i25 = i20;
                    str5 = str6;
                    i33 = i33;
                    c21826M46816 = c218215;
                    s2 = s3;
                    i28 = i39;
                    i27 = i38;
                    c218214 = c218216;
                    break;
                case 45397018:
                case 1056294987:
                    i19 = i28;
                    i29++;
                    c218212 = c21826M46816;
                    c21828 = c218214;
                    int iM25613 = (C0630.m2566("֡ܶ") ^ i23) * (-111);
                    i10 = ((iM25613 ^ i24) * (-22187)) ^ 1440079037;
                    i13 = iM25613 ^ (-1834377453);
                    i27 = i27;
                    str5 = str5;
                    i28 = i19;
                    c21826M46816 = c218212;
                    s2 = s2;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case 119388689:
                case 1297504361:
                    break;
                case 167756645:
                case 447035696:
                    break;
                case 170012105:
                case 2075303610:
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    int i40 = s2 * 3618;
                    i32 = s2 * s2;
                    if (C1047.m3599() < 0) {
                        int iM6986 = C2105.m6981("᩷ܿ") ^ i24;
                        int i41 = ((iM6986 ^ i23) * (-3591)) ^ (-973180180);
                        i = iM6986 ^ 908336121;
                        i30 = i40;
                        i25 = i41;
                        str5 = str2;
                        c21826M46816 = c21827;
                        i28 = i2;
                        i27 = i27;
                        c218214 = c21828;
                        i26 = i;
                        i33 = i33;
                    } else {
                        i30 = i40;
                        iM6983 = C0630.m2566("ᩳ۫") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-9329)) ^ (-1177497288);
                        i11 = -1805984087;
                        i13 = iM6983 ^ i11;
                        str5 = str2;
                        c21826M46816 = c21827;
                        i28 = i2;
                        i27 = i27;
                        c218214 = c21828;
                        i26 = i13;
                        i25 = i10;
                        i33 = i33;
                    }
                    break;
                case 242726289:
                case 1073619750:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    int i42 = i29 + 1;
                    if (i42 >= C0382.m1847(arrayList2)) {
                        i31 = i42;
                        iM6982 = (i24 - C2105.m6981("ܶ᩶")) * (-29);
                        i8 = ((iM6982 ^ i23) * (-20357)) ^ 805890097;
                        i9 = 1189576590;
                        i26 = i9 ^ iM6982;
                        i25 = i8;
                        i27 = i27;
                        c21826M46816 = c21826;
                        i33 = i33;
                        c218214 = c218214;
                        i28 = i28;
                        s2 = s2;
                    } else {
                        int iM6987 = (C2105.m6981("۫ᩴ") + i24) * (-25);
                        int i43 = ((iM6987 ^ i23) * 12621) ^ 458504938;
                        i = iM6987 ^ 348557512;
                        i31 = i42;
                        i25 = i43;
                        i27 = i27;
                        c21826M46816 = c21826;
                        c218214 = c218214;
                        i28 = i28;
                        s2 = s2;
                        i26 = i;
                        i33 = i33;
                    }
                    break;
                case 532422976:
                case 1778444145:
                    c21826M46815 = m46815(c14852, c17178, arrayList, i29, c218213);
                    c21826M46816 = c21826M46815;
                    str = str5;
                    int iM25614 = C0630.m2566("ۢ۟") ^ i23;
                    i26 = 1574630601 ^ iM25614;
                    i25 = ((iM25614 ^ i24) * 26251) ^ 184364403;
                    i27 = i27;
                    str5 = str;
                    i33 = i33;
                    c218214 = c218214;
                    i28 = i28;
                    s2 = s2;
                    break;
                case 538354905:
                case 1058474910:
                    c21826M46815 = m46819(c14852, c17178, arrayList, i29, c218213);
                    c21826M46816 = c21826M46815;
                    str = str5;
                    int iM25615 = C0630.m2566("ۢ۟") ^ i23;
                    i26 = 1574630601 ^ iM25615;
                    i25 = ((iM25615 ^ i24) * 26251) ^ 184364403;
                    i27 = i27;
                    str5 = str;
                    i33 = i33;
                    c218214 = c218214;
                    i28 = i28;
                    s2 = s2;
                    break;
                case 724918314:
                case 875292134:
                    C2105.m6982();
                    if (C4075.f12947 < 0) {
                        iM2568 = C0630.m2566("ۚۛ") ^ i24;
                        i10 = ((iM2568 ^ i23) * (-17263)) ^ 39664660;
                        i22 = 280961780;
                    } else {
                        iM2568 = (i24 - C0630.m2566("ۢۧ")) * (-19);
                        i10 = ((iM2568 ^ i23) * (-19317)) ^ 1384372925;
                        i22 = -1942130333;
                    }
                    i26 = i22 ^ iM2568;
                    i25 = i10;
                    i33 = i33;
                    break;
                case 775360469:
                case 1151098242:
                    C2958.m9034();
                    break;
                case 835179981:
                case 1272224051:
                    C3911.m11924();
                    if (RunnableC1937.f6483 >= 0) {
                        s2 = s2;
                        c21829 = c21826M46816;
                        c218214 = c218214;
                        i28 = i28;
                        i27 = i27;
                        str = str5;
                        iM6981 = C2105.m6981("ۡۨ") ^ i23;
                        i6 = ((iM6981 ^ i24) * 26335) ^ 1449969648;
                        i7 = -1494833344;
                        i26 = i7 ^ iM6981;
                        i25 = i6;
                        i27 = i27;
                        str5 = str;
                        c218214 = c218214;
                        i28 = i28;
                        c21826M46816 = c21829;
                        s2 = s2;
                    } else {
                        c21827 = c21826M46816;
                        c21828 = c218214;
                        i27 = i27;
                        i2 = i28;
                        str2 = str5;
                        iM6983 = C2105.m6981("᩻ۙ") ^ i23;
                        i10 = ((iM6983 ^ i24) * 29145) ^ 1854192857;
                        i11 = 1864740926;
                        i13 = iM6983 ^ i11;
                        str5 = str2;
                        c21826M46816 = c21827;
                        i28 = i2;
                        i27 = i27;
                        c218214 = c21828;
                        i26 = i13;
                        i25 = i10;
                        i33 = i33;
                    }
                    break;
                case 888385866:
                case 917776667:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    int i44 = C8869.f27007;
                    if (C0382.m1847(arrayList) >= c17178.f52647) {
                        iM6982 = C0630.m2566("ۖۗ") ^ i23;
                        i8 = ((iM6982 ^ i24) * 20981) ^ (-988260968);
                        i9 = 1495773442;
                    } else {
                        iM6982 = (i24 - C2105.m6981("ܶ᩶")) * (-29);
                        i8 = ((iM6982 ^ i23) * (-20357)) ^ 805890097;
                        i9 = 1189576590;
                    }
                    i26 = i9 ^ iM6982;
                    i25 = i8;
                    i27 = i27;
                    c21826M46816 = c21826;
                    i33 = i33;
                    c218214 = c218214;
                    i28 = i28;
                    s2 = s2;
                    break;
                case 990076945:
                case 1823049383:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    if (c21826 != null) {
                        iM6982 = (i23 - C2105.m6981("᩸ᩴ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM6982 ^ i24) * (-14631)) ^ (-1278433481);
                        i9 = -2083111773;
                    } else {
                        iM6982 = C0630.m2566("᩺ۖ") ^ i24;
                        i8 = ((iM6982 ^ i23) * (-32067)) ^ (-1472460601);
                        i9 = 1653913264;
                    }
                    i26 = i9 ^ iM6982;
                    i25 = i8;
                    i27 = i27;
                    c21826M46816 = c21826;
                    i33 = i33;
                    c218214 = c218214;
                    i28 = i28;
                    s2 = s2;
                    break;
                case 1232893070:
                case 2047041275:
                    s2 = s2;
                    c21829 = c21826M46816;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    str = str5;
                    if (C0964.m3413()) {
                        c218213 = new C21826(0, 0, 0, 0, 0, 0);
                        str5 = str;
                        i3 = i28;
                        iM2566 = C0630.m2566("۟᩹") ^ i24;
                        i4 = ((iM2566 ^ i23) * 5489) ^ 1298621617;
                        i5 = -24273944;
                        i26 = i5 ^ iM2566;
                        i25 = i4;
                        i28 = i3;
                        i27 = i27;
                        c218214 = c218214;
                        c21826M46816 = c21829;
                        s2 = s2;
                    }
                    iM6981 = C2105.m6981("ۡۨ") ^ i23;
                    i6 = ((iM6981 ^ i24) * 26335) ^ 1449969648;
                    i7 = -1494833344;
                    i26 = i7 ^ iM6981;
                    i25 = i6;
                    i27 = i27;
                    str5 = str;
                    c218214 = c218214;
                    i28 = i28;
                    c21826M46816 = c21829;
                    s2 = s2;
                    break;
                case 1289829687:
                case 1375356191:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21829 = c21826M46816;
                    str = str5;
                    try {
                        c21826M46816 = m46816(c14852, c17178, c15923, arrayList, i29, c218213);
                        int iM25616 = C0630.m2566("ۢ۟") ^ i23;
                        i26 = 1574630601 ^ iM25616;
                        i25 = ((iM25616 ^ i24) * 26251) ^ 184364403;
                        i27 = i27;
                        str5 = str;
                        i33 = i33;
                        c218214 = c218214;
                        i28 = i28;
                    } catch (RuntimeException e) {
                        e = e;
                        th = e;
                        iM6981 = C0630.m2566("ۡ᩸") ^ i24;
                        i6 = ((iM6981 ^ i23) * 13047) ^ 1062006983;
                        i7 = -2020379529;
                        i26 = i7 ^ iM6981;
                        i25 = i6;
                        i27 = i27;
                        str5 = str;
                        c218214 = c218214;
                        i28 = i28;
                        c21826M46816 = c21829;
                    } catch (C3059 e2) {
                        e = e2;
                        th = e;
                        iM6981 = C0630.m2566("ۡ᩸") ^ i24;
                        i6 = ((iM6981 ^ i23) * 13047) ^ 1062006983;
                        i7 = -2020379529;
                        i26 = i7 ^ iM6981;
                        i25 = i6;
                        i27 = i27;
                        str5 = str;
                        c218214 = c218214;
                        i28 = i28;
                        c21826M46816 = c21829;
                    }
                    s2 = s2;
                    break;
                case 1351379610:
                case 1926128468:
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    s2 = f65876[0];
                    if (C3245.f10203 <= 0) {
                        iM6983 = C0630.m2566("ܰۧ") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-25993)) ^ (-823152025);
                        i11 = -674576324;
                    } else {
                        iM6983 = C2105.m6981("۬᩻") ^ i23;
                        i10 = ((iM6983 ^ i24) * 6267) ^ (-2123783588);
                        i11 = 1828426787;
                    }
                    i13 = iM6983 ^ i11;
                    str5 = str2;
                    c21826M46816 = c21827;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case 1452841248:
                case 1644463206:
                    short s4 = s2;
                    C21826 c218217 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    String str7 = str5;
                    if (i30 - (i32 + 3272481) <= 0) {
                        iM2567 = C0630.m2566("ۨۤ") ^ i23;
                        i10 = ((iM2567 ^ i24) * 29927) ^ (-1630781304);
                        i12 = 1811428846;
                    } else {
                        iM2567 = C0630.m2566("ۚۡ") ^ i24;
                        i10 = ((iM2567 ^ i23) * (-22727)) ^ 685381878;
                        i12 = -477245592;
                    }
                    i13 = iM2567 ^ i12;
                    str5 = str7;
                    c21826M46816 = c218217;
                    s2 = s4;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case 1579661880:
                case 1819010377:
                    c21827 = c21826M46816;
                    c21828 = c218214;
                    i27 = i27;
                    i2 = i28;
                    str2 = str5;
                    if (C7811.f24123 >= 0) {
                        iM6983 = C0630.m2566("ܰۧ") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-25993)) ^ (-823152025);
                        i11 = -674576324;
                    } else {
                        iM6983 = C0630.m2566("֫۫") ^ i23;
                        i10 = ((iM6983 ^ i24) * (-18847)) ^ (-1842131567);
                        i11 = -983847509;
                    }
                    i13 = iM6983 ^ i11;
                    str5 = str2;
                    c21826M46816 = c21827;
                    i28 = i2;
                    i27 = i27;
                    c218214 = c21828;
                    i26 = i13;
                    i25 = i10;
                    i33 = i33;
                    break;
                case 2123456611:
                case 2146212925:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    if (zM6438) {
                        iM6982 = C0630.m2566("ۜܽ") ^ i23;
                        i8 = ((iM6982 ^ i24) * 26841) ^ (-1014747780);
                        i9 = 1506711706;
                    } else {
                        iM6982 = (i24 - C2105.m6981("ܶ᩶")) * (-29);
                        i8 = ((iM6982 ^ i23) * (-20357)) ^ 805890097;
                        i9 = 1189576590;
                    }
                    i26 = i9 ^ iM6982;
                    i25 = i8;
                    i27 = i27;
                    c21826M46816 = c21826;
                    i33 = i33;
                    c218214 = c218214;
                    i28 = i28;
                    s2 = s2;
                    break;
                default:
                    s2 = s2;
                    c218214 = c218214;
                    i28 = i28;
                    i27 = i27;
                    c21826 = c21826M46816;
                    try {
                        zM6438 = ViewOnClickListenerC1958.m6437(RunnableC1108.m3789(f65876, 8, 14, i27), str5);
                        iM6982 = C2105.m6981("ۨܰ") ^ i24;
                        i8 = ((iM6982 ^ i23) * (-29353)) ^ (-272412408);
                        i9 = 716314908;
                        i26 = i9 ^ iM6982;
                        i25 = i8;
                        i27 = i27;
                        c21826M46816 = c21826;
                        i33 = i33;
                        c218214 = c218214;
                        i28 = i28;
                    } catch (RuntimeException e3) {
                        e = e3;
                        c21829 = c21826;
                        str = str5;
                        th = e;
                        iM6981 = C0630.m2566("ۡ᩸") ^ i24;
                        i6 = ((iM6981 ^ i23) * 13047) ^ 1062006983;
                        i7 = -2020379529;
                        i26 = i7 ^ iM6981;
                        i25 = i6;
                        i27 = i27;
                        str5 = str;
                        c218214 = c218214;
                        i28 = i28;
                        c21826M46816 = c21829;
                    } catch (C3059 e4) {
                        e = e4;
                        c21829 = c21826;
                        str = str5;
                        th = e;
                        iM6981 = C0630.m2566("ۡ᩸") ^ i24;
                        i6 = ((iM6981 ^ i23) * 13047) ^ 1062006983;
                        i7 = -2020379529;
                        i26 = i7 ^ iM6981;
                        i25 = i6;
                        i27 = i27;
                        str5 = str;
                        c218214 = c218214;
                        i28 = i28;
                        c21826M46816 = c21829;
                    }
                    s2 = s2;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21826 m46816(C14852 c14852, C17178 c17178, C15923 c15923, ArrayList arrayList, int i, C21826 c21826) {
        int i2;
        C22531 c22531;
        C14852 c14853 = c14852;
        C15923 c15924 = c15923;
        long j = (int) Long.parseLong(c17178.f52650.substring(2), 16);
        String str = c17178.f52646;
        C15799 c15799 = this.f65877;
        ArrayList arrayListM37408 = c15799.m37408(c14853, str, c15924);
        C22531 c22532 = new C22531();
        int i3 = c21826.f69912;
        int i4 = c21826.f69916;
        int i5 = i3;
        while (i5 < arrayListM37408.size()) {
            C7980 c7980M37426 = c15799.m37426(c14853, str, (C17667) arrayListM37408.get(i5), c15924);
            int i6 = i5 == i3 ? i4 : 0;
            int i7 = 0;
            for (C16611 c16611 : c7980M37426.getMethods()) {
                int i8 = i7 + 1;
                if (i7 < i6) {
                    i2 = i5;
                    c22531 = c22532;
                } else {
                    int i9 = (i5 == i3 && i7 == i4) ? c21826.f69917 : 0;
                    int i10 = i7;
                    i2 = i5;
                    c22531 = c22532;
                    c22532.m50529(c17178, arrayList, c16611, j);
                    int iM39129 = c16611.m39129(i9, c22531);
                    C21826 c21827 = iM39129 >= 0 ? new C21826(i, 0, i2, i10, iM39129, 0) : null;
                    if (c21827 != null) {
                        return c21827;
                    }
                }
                c22532 = c22531;
                i7 = i8;
                i6 = i6;
                i5 = i2;
                i4 = i4;
                i3 = i3;
            }
            i5++;
            c14853 = c14852;
            c15924 = c15923;
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Code duplicated, block: B:101:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:4:0x002c, B:5:0x0033, B:7:0x0039, B:18:0x0061, B:21:0x0072, B:46:0x00ba, B:27:0x0080, B:30:0x008a, B:35:0x0094, B:36:0x0099), top: B:86:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:4:0x002c, B:5:0x0033, B:7:0x0039, B:18:0x0061, B:21:0x0072, B:46:0x00ba, B:27:0x0080, B:30:0x008a, B:35:0x0094, B:36:0x0099), top: B:86:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x005f, blocks: (B:10:0x0045, B:12:0x004f, B:24:0x007b, B:42:0x00b0), top: B:93:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[Catch: Exception -> 0x00a1, ۗۛ᩻ -> 0x00f1, all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:4:0x002c, B:5:0x0033, B:7:0x0039, B:18:0x0061, B:21:0x0072, B:46:0x00ba, B:27:0x0080, B:30:0x008a, B:35:0x0094, B:36:0x0099), top: B:86:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: Exception -> 0x00a1, ۗۛ᩻ -> 0x00f1, all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:4:0x002c, B:5:0x0033, B:7:0x0039, B:18:0x0061, B:21:0x0072, B:46:0x00ba, B:27:0x0080, B:30:0x008a, B:35:0x0094, B:36:0x0099), top: B:86:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x005f, blocks: (B:10:0x0045, B:12:0x004f, B:24:0x007b, B:42:0x00b0), top: B:93:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:99:0x00d6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C21826 m46815(C14852 c14852, C17178 c17178, ArrayList arrayList, int i, C21826 c21826) throws Throwable {
        C22274 c22274;
        C18090 c18090;
        Throwable th;
        ArrayList arrayList2;
        C22274 c22275;
        C11418 c11418;
        int i2;
        String str;
        boolean zM30562;
        C3545 entry;
        int iM50003;
        int i3;
        C21826 c21826M46817;
        C14852 c14853 = c14852;
        int i4 = c21826.f69913;
        String str2 = c17178.f52646;
        C15799 c15799 = this.f65877;
        ArrayList arrayListM37430 = c15799.m37430(c14853, str2);
        HashMap mapM37433 = c15799.m37433(c14853, str2);
        C22274 c22274M35251 = c14852.m35251();
        C21569 c21569M50006 = c22274M35251.m50006();
        C11418 c11419 = new C11418();
        try {
            try {
                try {
                    C18090 c18091 = new C18090(c14852.m35253());
                    try {
                        C12534 c12534M25976 = this.f65878.m25976(c14853, c15799, str2);
                        int i5 = i4;
                        while (i5 < arrayListM37430.size()) {
                            C13874 c13874 = (C13874) arrayListM37430.get(i5);
                            Long l2 = c13874.f41356;
                            String str3 = c13874.f41355;
                            if (l2 != null) {
                                try {
                                    if (l2.longValue() <= 10 || c13874.f41356.longValue() > 2097152) {
                                        arrayList2 = arrayListM37430;
                                    } else {
                                        str = (String) mapM37433.get(str3);
                                        arrayList2 = arrayListM37430;
                                        if ("zip_entry".equals(str)) {
                                            zM30562 = true;
                                            if ("axml".equals(str)) {
                                                c15799.m37422(c14853, str2, str3, c11419);
                                            } else {
                                                try {
                                                    c11419.m28185(0);
                                                    entry = c18091.getEntry(str3);
                                                    if (entry == null || (iM50003 = c22274M35251.m50003(str3)) == 1) {
                                                        zM30562 = false;
                                                    } else if (iM50003 == 2) {
                                                        C12396.m30565(c18091, entry, c12534M25976, c11419);
                                                        zM30562 = true;
                                                    } else {
                                                        c21569M50006.m48727(str3);
                                                        zM30562 = C12396.m30562(c18091, entry, c12534M25976, c11419, c21569M50006);
                                                    }
                                                } catch (C3059 e) {
                                                    c18090 = c18091;
                                                    throw e;
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (!zM30562) {
                                                if (i5 == i4) {
                                                    i3 = c21826.f69915;
                                                } else {
                                                    i3 = 0;
                                                }
                                                i2 = i5;
                                                c18090 = c18091;
                                                c11418 = c11419;
                                                c22275 = c22274M35251;
                                                c21826M46817 = m46817(c17178, arrayList, i, i2, c13874.f41355, c11418, i3);
                                                if (c21826M46817 != null) {
                                                    c18090.close();
                                                    c22275.m50004();
                                                    return c21826M46817;
                                                }
                                            }
                                        }
                                    }
                                    i2 = i5;
                                    c18090 = c18091;
                                    c11418 = c11419;
                                    c22275 = c22274M35251;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c18090 = c18091;
                                    try {
                                        c18090.close();
                                        throw th;
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                        throw th;
                                    }
                                }
                            } else {
                                str = (String) mapM37433.get(str3);
                                arrayList2 = arrayListM37430;
                                if ("zip_entry".equals(str)) {
                                    zM30562 = true;
                                    if ("axml".equals(str)) {
                                        c15799.m37422(c14853, str2, str3, c11419);
                                    } else {
                                        c11419.m28185(0);
                                        entry = c18091.getEntry(str3);
                                        if (entry == null) {
                                            if (iM50003 == 2) {
                                                C12396.m30565(c18091, entry, c12534M25976, c11419);
                                                zM30562 = true;
                                            } else {
                                                c21569M50006.m48727(str3);
                                                zM30562 = C12396.m30562(c18091, entry, c12534M25976, c11419, c21569M50006);
                                            }
                                        }
                                        zM30562 = false;
                                    }
                                    if (!zM30562) {
                                        if (i5 == i4) {
                                            i3 = c21826.f69915;
                                        } else {
                                            i3 = 0;
                                        }
                                        i2 = i5;
                                        c18090 = c18091;
                                        c11418 = c11419;
                                        c22275 = c22274M35251;
                                        c21826M46817 = m46817(c17178, arrayList, i, i2, c13874.f41355, c11418, i3);
                                        if (c21826M46817 != null) {
                                            c18090.close();
                                            c22275.m50004();
                                            return c21826M46817;
                                        }
                                    }
                                }
                                i2 = i5;
                                c18090 = c18091;
                                c11418 = c11419;
                                c22275 = c22274M35251;
                            }
                            i5 = i2 + 1;
                            c14853 = c14852;
                            c21569M50006 = c21569M50006;
                            c12534M25976 = c12534M25976;
                            arrayListM37430 = arrayList2;
                            c18091 = c18090;
                            c11419 = c11418;
                            c22274M35251 = c22275;
                        }
                        c22274 = c22274M35251;
                        c18091.close();
                    } catch (Throwable th4) {
                        th = th4;
                        c18090 = c18091;
                    }
                    th = th;
                    c18090.close();
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    c22274M35251.m50004();
                    throw th;
                }
            } catch (C3059 e2) {
                throw e2;
            } catch (Exception unused2) {
            }
        } catch (C3059 e3) {
            throw e3;
        } catch (Exception unused3) {
            c22274 = c22274M35251;
        } catch (Throwable th6) {
            th = th6;
            c22274M35251.m50004();
            throw th;
        }
        c22274.m50004();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21826 m46817(C17178 c17178, ArrayList arrayList, int i, int i2, String str, C11418 c11418, int i3) {
        int length;
        C7184 c7184 = new C7184();
        try {
            C13000 c13000 = new C13000(c11418);
            try {
                c7184.m19219(c13000);
                while (c7184.m19220() != 1) {
                    if (c7184.m19231() == 2) {
                        int i4 = 0;
                        int i5 = 0;
                        while (i5 < c7184.m19216()) {
                            C16396 c16396M19227 = c7184.m19227(i5);
                            if (c16396M19227.m38632() >= i3 && !"xmlns".equals(c7184.m19234(i5)) && !"xmlns".equals(c7184.m19217(i5))) {
                                String strM19232 = c7184.m19232(i5);
                                if (!strM19232.isEmpty() && (strM19232.charAt(i4) == '@' || strM19232.charAt(i4) == '?')) {
                                    String str2 = c17178.f52650;
                                    if (m46818(strM19232, i4, str2.length(), str2)) {
                                        length = str2.length();
                                    } else {
                                        int length2 = str2.length() - 2;
                                        length = (length2 <= 0 || !m46818(strM19232, 2, length2, str2)) ? -1 : length2;
                                    }
                                    if (length != 0 && length + 1 == strM19232.length()) {
                                        arrayList.add(new C18298("axml", "resource_id", "axml", str, C8163.m21635(Math.max(i4, c16396M19227.m38632() - 80), c11418.length(), 300, c11418).replace('\n', ' '), null, null, null, null, null, null));
                                        if (arrayList.size() >= c17178.f52647) {
                                            C21826 c21826 = new C21826(i, i2, 0, 0, 0, c16396M19227.m38630());
                                            c13000.close();
                                            return c21826;
                                        }
                                    }
                                }
                            }
                            i5++;
                            i4 = 0;
                        }
                    }
                }
                c13000.close();
                return null;
            } catch (Throwable th) {
                try {
                    c13000.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException | C1580 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46818(String str, int i, int i2, String str2) {
        if (i2 + 1 <= str.length() && i + i2 <= str2.length()) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = 1 + i3;
                char cCharAt = str.charAt(i4);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                char cCharAt2 = str2.charAt(i3 + i);
                if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                }
                if (cCharAt == cCharAt2) {
                    i3 = i4;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C21826 m46819(C14852 c14852, C17178 c17178, ArrayList arrayList, int i, C21826 c21826) throws C3059 {
        String str = c17178.f52646;
        C10247 c10247 = this.f65878;
        C15799 c15799 = this.f65877;
        C9042 c9042M25979 = c10247.m25979(c14852, c15799, str);
        try {
            String str2 = c17178.f52650;
            int i2 = c21826.f69913;
            int i3 = c21826.f69915;
            int size = c17178.f52647 - arrayList.size();
            HashSet hashSet = new HashSet();
            Iterator it = c15799.m37430(c14852, str).iterator();
            while (it.hasNext()) {
                hashSet.add(((C13874) it.next()).f41355);
            }
            C6925 c6925M23331 = c9042M25979.m23331(str2, i2, i3, size, hashSet);
            for (C14685 c14685 : c6925M23331.f21381) {
                String str3 = c14685.f44860;
                C13232 c13232 = c14685.f44857;
                arrayList.add(new C18298("resource_table", str3, "resource", C9042.m23294(c13232.f39608), c14685.f44859, c13232.f39606, c13232.f39605, c14685.f44861, c14685.f44855, c14685.f44856, c14685.f44858));
            }
            if (c6925M23331.f21378) {
                return new C21826(i, c6925M23331.f21380, 0, 0, 0, c6925M23331.f21379);
            }
            return null;
        } catch (C3059 e) {
            if (C15799.m37396(str)) {
                C10247.m25972(c14852, e);
            }
            throw e;
        }
    }
}
