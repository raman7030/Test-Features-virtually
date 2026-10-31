package l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.UncheckedIOException;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ܶۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC14946 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45553 = 0;

    /* JADX INFO: renamed from: ᩺ܰܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f45554 = {5445, 3094, 3079, 3098, 3094, 3124, 3083, 3079, 3093, 3079, 3088, 3133, 3089, 3088, 3073, 3087, 3079, 3094, 3082, 3085, 3078, 3094, 3083, 3094, 3086, 3079, 3089, 3075, 3092, 3079, 3078, 3107, 3089, 3122, 3075, 3094, 3082, 3089, 3099, 3084, 3094, 3075, 3098, 3108, 3083, 3086, 3079, 3116, 3075, 3087, 3079, 3089, 3095, 3090, 3090, 3085, 3088, 3094, 3118, 3085, 3073, 3075, 3094, 3079, 2868, -8543, -8528, -8531, -8543, -8573, -8516, -8528, -8542, -8528, -8537, -8566, -8527, -8528, -8522, -8520, -8528, -8543, -8515, -8518, -8527, -8543, -8516, -8543, -8519, -8528, 6543, 18380, 18381, 18384, 18423, 18380, 18381, 18379, 18375, 18373, 18392, 18369, 18372, 18381, 18423, 18381, 18374, 18383, 18369, 18374, 18381, 9432, 28154, 28159, 28138, 28159, 7636, 24701, 23358, 31686, 27164, -32043, 29423, 26800, -30555, -24747, 1221, 1225, 1218, 1219, 1219, 1218, 1231, 1234, 1273, 1233, 1225, 1236, 1218, 1273, 1233, 1236, 1223, 1238, 1273, 1232, 1231, 1219, 1233, 1219, 1236, -29073, 21299, 22573, 1237, 1223, 1232, 1219, 1269, 1234, 1223, 1234, 1219, 1257, 1224, 1268, 1219, 1237, 1235, 1226, 1234, 1234, 1231, 1234, 1226, 1219, 1237, 1247, 1224, 1234, 1223, 1246, 1248, 1231, 1226, 1219, 1256, 1223, 1227, 1219, 1237, 1235, 1238, 1238, 1225, 1236, 1234, 1258, 1225, 1221, 1223, 1234, 1219, 1237, 1223, 1232, 1219, 1218, 1255, 1237, 1270, 1223, 1234, 1230, 1234, 1219, 1246, 1234, 1273, 1232, 1231, 1219, 1233, 1219, 1236, 1273, 1237, 1223, 1232, 1219, 1273, 1223, 1237, 1273, 1238, 1223, 1234, 1230, 1227, 1219, 1234, 1230, 1225, 1218, 1227, 1219, 1227, 1225, 1236, 1247, 1264, 1231, 1219, 1233, 1219, 1236, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1237, 1236, 1221, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1218, 1223, 1234, 1223, -32465, -28744, -28259, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1218, 1219, 1221, 1166, 1177, 1227, 1167, 1272, 1277, 1158, 1199, 1275, 1164, 1161, 1161, 1158, 1259, 1255, 1268, 1261, 1273, 1166, 1253, 1258, 1255, 1269, 1269, 1242, 1248, 1263, 1251, 1258, 1250, 1242, 1259, 1251, 1266, 1262, 1257, 1250, 1167, 1273, 1166, 1269, 1266, 1255, 1268, 1266, 1242, 1251, 1256, 1250, 1167, 1160, 1164, 1177, 1196, 1512, 31044, 17929, 21480, 23179, -21649, 17495, 19714, 18251, -20700, 23175, -20418, 20712, 2909, -1842, -7097, -9885, -8870, -8705, 6894, -8166, 7840, -3883, 5408, -10142, 7623, -10550, -6562, -1148, -9667, -6140, -12107, -11483, -6974, 2961, -7568, -1547, -11029, 6574, -6372, 3802, -946, 5651, -606, -11517, 112, 612, -10621, -2265, -12261, 3733, 17618, 17626, 17618, 17616, 17613, 17606, 17641, 17622, 17626, 17608, 17626, 17613, 17647, 17630, 17611, 17623, 17618, 17626, 17618, 17616, 17613, 17606, 17641, 17622, 17626, 17608, 17626, 17613, 17553, 17618, 17626, 17618, 17616, 17613, 17606, 17554, 17612, 17611, 17630, 17611, 17626, 7375, -28061, -28078, -28081, -28093, -28063, -28066, -28078, -28096, -28078, -28091};

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f45555;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C12392 f45556;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C6273 f45557;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public String f45558;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f45559;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public byte f45560;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public String f45561;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C15545 f45562;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f45563 = false;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f45564;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45565;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -929305085;
        int i6 = C4117.f13076;
        int i7 = C1773.f6144;
        int iM2566 = (i6 - C0630.m2566("ۨۨ")) * 13;
        int i8 = ((iM2566 ^ i7) * (-18961)) ^ 1924226964;
        int i9 = 1012053535;
        while (true) {
            i5 = ((((i5 ^ i7) * 2837) >> 31) & i8) ^ (iM2566 ^ i9);
            switch (i5) {
                case -2076809903:
                case 210143348:
                    sArr2 = f45554;
                    i4 = 449;
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((iM2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM2566 = C0630.m2566("᩹ۖ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-10191)) ^ (-573938642);
                        i9 = -737518550;
                    }
                    break;
                case -2043921325:
                case 1415780196:
                    sArr = f45554;
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ܿܿ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        iM2566 = C0630.m2566("ܽ֡") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-22573)) ^ (-329302849);
                        i9 = 260617486;
                    }
                    break;
                case -1944275644:
                case 1088948343:
                    i3 = 233;
                    iM2566 = (C0630.m2566("۫֫") ^ i7) * 43;
                    i8 = ((iM2566 ^ i6) * 22049) ^ (-591135280);
                    i9 = 1575520163;
                    break;
                case -1869416592:
                case -1274202721:
                    C2105.m6982();
                    if (!C2126.f7087) {
                        iM2566 = C0630.m2566("۠᩷") ^ i6;
                        i8 = ((iM2566 ^ i7) * 17991) ^ 378312645;
                        i9 = -1201371095;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((iM2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    }
                    break;
                case -1813345551:
                case 1395568440:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C0630.m2566("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2566 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        iM2566 = (C0630.m2566("۠ۡ") + i6) * 17;
                        i8 = ((iM2566 ^ i7) * 26747) ^ (-1537563213);
                        i9 = -998607759;
                    }
                    break;
                case -1615362391:
                case -988932998:
                    if (!C4159.f13567) {
                        iM2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((iM2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        iM2566 = (C0630.m2566("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2566 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    }
                    break;
                case -1561466745:
                case 1552980204:
                    C2520.m8026();
                    if (C2105.m6982() != 0) {
                        iM2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((iM2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((iM2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    }
                    break;
                case -801141069:
                case -775363917:
                    s2 = 772;
                    if (C0422.f1886 <= 0) {
                        iM2566 = C0630.m2566("ܿܿ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        iM2566 = (C2105.m6981("ۜܰ") ^ i6) * 109;
                        i8 = ((iM2566 ^ i7) * (-4329)) ^ 561810798;
                        i9 = 322084303;
                    }
                    break;
                case -709620783:
                case 1456833584:
                    s = sArr[c];
                    i = s * s;
                    if (C7106.m19120() <= 0) {
                        iM2566 = C0630.m2566("ܿܿ") ^ i6;
                        i8 = ((iM2566 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        iM2566 = C0630.m2566("֫ܺ") ^ i6;
                        i8 = ((iM2566 ^ i7) * 9409) ^ (-1229171367);
                        i9 = -1541175344;
                    }
                    break;
                case -528334792:
                case 859905601:
                    if ((s * s2) - i2 <= 0) {
                        iM2566 = C2105.m6981("ܳ֫") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-21307)) ^ (-1249892708);
                        i9 = 185520027;
                    } else {
                        iM2566 = (C0630.m2566("ۨ֡") + i6) * 3;
                        i8 = ((iM2566 ^ i7) * (-3027)) ^ 1030539949;
                        i9 = -2008820124;
                    }
                    break;
                case -219501672:
                case 1858841343:
                    i2 = 148996 + i;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((iM2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM2566 = (C0630.m2566("᩺ۙ") ^ i7) * (-113);
                        i8 = ((iM2566 ^ i6) * 16031) ^ 1893596928;
                        i9 = -1942817516;
                    }
                    break;
                case -154326464:
                case 118199641:
                    if (C7106.f21815 != 0) {
                        iM2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((iM2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM2566 = C0630.m2566("᩶ܰ") ^ i7;
                        i8 = ((iM2566 ^ i6) * (-15979)) ^ (-2030939604);
                        i9 = 473896551;
                    }
                    break;
                case -88865119:
                case 2140834531:
                    return C3683.m11225(sArr2, i4, 10, i3);
                case 111973940:
                case 194544456:
                    c = 448;
                    if (C1711.f5919) {
                        iM2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((iM2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        iM2566 = (C0630.m2566("ۢܽ") ^ i6) * 21;
                        i8 = ((iM2566 ^ i7) * 13259) ^ 1821707391;
                        i9 = 1213679324;
                    }
                    break;
                case 120601668:
                case 632507061:
                    i3 = 37431;
                    iM2566 = (C0630.m2566("۫֫") ^ i7) * 43;
                    i8 = ((iM2566 ^ i6) * 22049) ^ (-591135280);
                    i9 = 1575520163;
                    break;
                case 287005376:
                case 847334635:
                    if (C3663.f11553) {
                        iM2566 = (C0630.m2566("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM2566 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        iM2566 = C2105.m6981("۫ۛ") ^ i7;
                        i8 = ((iM2566 ^ i6) * 20303) ^ 245767219;
                        i9 = 623198190;
                    }
                    break;
                case 557134588:
                case 619425356:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("۠᩷") ^ i6;
                        i8 = ((iM2566 ^ i7) * 17991) ^ 378312645;
                        i9 = -1201371095;
                    } else {
                        iM2566 = (C2105.m6981("᩷ܰ") ^ i6) * (-25);
                        i8 = ((iM2566 ^ i7) * (-12395)) ^ (-1217636707);
                        i9 = -719786038;
                    }
                    break;
                case 917567437:
                case 1616503213:
                    C0483.m2121();
                    ViewOnClickListenerC1958.m6429();
                    iM2566 = C0630.m2566("۠᩷") ^ i6;
                    i8 = ((iM2566 ^ i7) * 17991) ^ 378312645;
                    i9 = -1201371095;
                    break;
                default:
                    C7106.m19120();
                    return null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x02a2 A[PHI: r2 r12 r17 r19 r20
      0x02a2: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v7 java.lang.String) binds: [B:63:0x02a0, B:40:0x0142, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]) binds: [B:63:0x02a0, B:40:0x0142, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r17v29 android.content.Intent) = (r17v3 android.content.Intent), (r17v15 android.content.Intent), (r17v33 android.content.Intent) binds: [B:63:0x02a0, B:40:0x0142, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r19v3 short[]) = (r19v2 short[]), (r19v1 short[]), (r19v1 short[]) binds: [B:63:0x02a0, B:40:0x0142, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x02a2: PHI (r20v18 java.lang.String) = (r20v1 java.lang.String), (r20v9 java.lang.String), (r20v21 java.lang.String) binds: [B:63:0x02a0, B:40:0x0142, B:6:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x02db A[PHI: r13 r17 r20
      0x02db: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v5 short[]) binds: [B:67:0x02d9, B:43:0x0170, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r17v25 android.content.Intent) = (r17v2 android.content.Intent), (r17v10 android.content.Intent), (r17v26 android.content.Intent) binds: [B:67:0x02d9, B:43:0x0170, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r20v14 java.lang.String) = (r20v0 java.lang.String), (r20v8 java.lang.String), (r20v15 java.lang.String) binds: [B:67:0x02d9, B:43:0x0170, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35400(C5652 c5652, C18258 c18258, String str) {
        int iM6981;
        int i;
        int i2;
        int i3;
        int i4;
        int iM2566;
        int i5 = C11340.f33930;
        int i6 = C7811.f24123;
        int iM2567 = (i5 - C0630.m2566("ᩳۜ")) * (-99);
        int i7 = ((iM2567 ^ i6) * (-24471)) ^ 556047534;
        String strM13542 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM2567 ^ (-662187982);
        Intent intent = null;
        String strM7159 = null;
        int i9 = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -138874850;
        short[] sArr3 = null;
        int i14 = 0;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i6) * 27899) >> 31));
            switch (i13) {
                case -2100234653:
                case 253525569:
                    Application applicationM1842 = C0382.m1842();
                    strM13542 = strM13542;
                    if (ServiceConnectionC3453.m10564() > 0) {
                        intent = new Intent(applicationM1842, (Class<?>) ActivityC14946.class);
                        sArr3 = f45554;
                        if (C0237.m1481() >= 0) {
                            intent = intent;
                            iM6981 = (C0630.m2566("ۧ֨") ^ i6) * (-29);
                            i = ((iM6981 ^ i5) * 24427) ^ (-1664767305);
                            i2 = 433504083;
                            intent = intent;
                            i8 = iM6981 ^ i2;
                        } else {
                            int iM6982 = (C2105.m6981("ᩴ۬") + i5) * 59;
                            i = ((iM6982 ^ i6) * (-24709)) ^ 2107237479;
                            i8 = iM6982 ^ (-2027721596);
                        }
                        i7 = i;
                        strM13542 = strM13542;
                    } else {
                        int iM2568 = C0630.m2566("᩺᩻") ^ i5;
                        i8 = iM2568 ^ (-1869981799);
                        i7 = ((iM2568 ^ i6) * (-16075)) ^ (-1726847854);
                        strM13542 = strM13542;
                        intent = null;
                    }
                    break;
                case -2048716413:
                case -461209030:
                    intent = intent;
                    strM13542 = strM13542;
                    sArr = f45554;
                    if (C3432.m10477() <= 0) {
                        iM6981 = (C0630.m2566("ۧ֨") ^ i6) * (-29);
                        i = ((iM6981 ^ i5) * 24427) ^ (-1664767305);
                        i2 = 433504083;
                    } else {
                        iM6981 = (i6 - C0630.m2566("ܰܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM6981 ^ i5) * (-17279)) ^ (-696499174);
                        i2 = 2058435964;
                    }
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case -1898815769:
                case -1221774337:
                    intent = intent;
                    strM13542 = strM13542;
                    int i15 = s + s2;
                    i10 = i15 * i15;
                    i11 = s * s;
                    i12 = 108826624;
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("ۗۢ") ^ i6;
                        i = ((iM6981 ^ i5) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                    } else {
                        iM6981 = C0630.m2566("ۡۖ") ^ i6;
                        i = ((iM6981 ^ i5) * 30691) ^ (-1572838285);
                        i2 = 1615047185;
                    }
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case -1787322630:
                case 1199310043:
                    C3537.m10746();
                    break;
                case -1763873318:
                case 1624357061:
                    intent = intent;
                    strM13542 = strM13542;
                    s = sArr[64];
                    s2 = 10432;
                    if (!C1504.f5354) {
                        iM6981 = (C2105.m6981("ۖ۟") ^ i5) * (-125);
                        i = ((iM6981 ^ i6) * (-21967)) ^ 592929664;
                        i2 = -802370400;
                        intent = intent;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        strM13542 = strM13542;
                    } else {
                        int iM2569 = C0630.m2566("᩺᩻") ^ i5;
                        i8 = iM2569 ^ (-1869981799);
                        i7 = ((iM2569 ^ i6) * (-16075)) ^ (-1726847854);
                        strM13542 = strM13542;
                        intent = null;
                    }
                    break;
                case -1708661727:
                case 296507661:
                    C1504.m5168(intent, C11340.m28025(sArr2, 85, 5, i14), str);
                    c5652.m15940(intent);
                    break;
                case -1658608698:
                case 1633078648:
                    strM13542 = C4616.m13542(sArr3, 79, 6, i14);
                    i9 = 2;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C0630.m2566("ۡ֨") ^ i5;
                        i4 = ((iM2566 ^ i6) * 9991) ^ (-112051179);
                        i3 = -411486859;
                    } else {
                        iM2566 = (C0630.m2566("᩵۠") + i5) * (-107);
                        i4 = ((iM2566 ^ i6) * (-7749)) ^ (-1804245636);
                        i3 = -1805819896;
                    }
                    i8 = iM2566 ^ i3;
                    i7 = i4;
                    intent = intent;
                    break;
                case -1589008019:
                case 677655776:
                    C0964.m3413();
                    if (!C4159.f13567) {
                        iM2566 = C0630.m2566("ۡ֨") ^ i5;
                        i4 = ((iM2566 ^ i6) * 9991) ^ (-112051179);
                        i3 = -411486859;
                        i8 = iM2566 ^ i3;
                        i7 = i4;
                        intent = intent;
                    } else {
                        intent = intent;
                        strM13542 = strM13542;
                        iM6981 = C0630.m2566("ۗۢ") ^ i6;
                        i = ((iM6981 ^ i5) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                        intent = intent;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        strM13542 = strM13542;
                    }
                    break;
                case -1334203718:
                case -776752317:
                    intent = intent;
                    strM13542 = strM13542;
                    int i16 = i11 + i12;
                    if ((i16 + i16) - i10 < 0) {
                        iM6981 = (i5 - C0630.m2566("۬ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM6981 ^ i6) * 12113) ^ (-1835850748);
                        i2 = 1867068868;
                    } else {
                        iM6981 = C0630.m2566("ܰ᩶") ^ i6;
                        i = ((iM6981 ^ i5) * 16863) ^ (-1691445672);
                        i2 = -498979296;
                    }
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case -1039623385:
                case -159541817:
                    i14 = 58771;
                    iM6981 = C0630.m2566("᩺᩶") ^ i5;
                    i = ((iM6981 ^ i6) * 31349) ^ 32206497;
                    i2 = 901000146;
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case -983921573:
                case 935230651:
                    intent.putExtra(strM13542, i9);
                    sArr2 = f45554;
                    if (C0483.f2088 >= 0) {
                        intent = intent;
                        strM13542 = strM13542;
                        iM6981 = C0630.m2566("۬ܳ") ^ i6;
                        i = ((iM6981 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                        intent = intent;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        strM13542 = strM13542;
                    } else {
                        int iM25610 = (C0630.m2566("ܺܿ") + i6) * 81;
                        i7 = ((iM25610 ^ i5) * (-29229)) ^ (-1060191108);
                        i8 = iM25610 ^ 1557905729;
                    }
                    break;
                case -845765377:
                case 861128878:
                    if (C4263.f13799 > 0) {
                        strM13542 = strM13542;
                        int iM25611 = C0630.m2566("᩺᩻") ^ i5;
                        i8 = iM25611 ^ (-1869981799);
                        i7 = ((iM25611 ^ i6) * (-16075)) ^ (-1726847854);
                        strM13542 = strM13542;
                        intent = null;
                    } else {
                        intent = intent;
                        strM13542 = strM13542;
                        iM6981 = C0630.m2566("ۗۢ") ^ i6;
                        i = ((iM6981 ^ i5) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                        intent = intent;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        strM13542 = strM13542;
                    }
                    break;
                case -837107551:
                case 1323629068:
                    C1420.m4913();
                    if (C1420.m4913()) {
                        intent = intent;
                        strM13542 = strM13542;
                        iM6981 = C0630.m2566("۬ܳ") ^ i6;
                        i = ((iM6981 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                        intent = intent;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                        strM13542 = strM13542;
                    }
                    intent = intent;
                    strM13542 = strM13542;
                    iM6981 = C0630.m2566("ۗۢ") ^ i6;
                    i = ((iM6981 ^ i5) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case -780881062:
                case 1404178977:
                    i14 = 57045;
                    iM6981 = C0630.m2566("᩺᩶") ^ i5;
                    i = ((iM6981 ^ i6) * 31349) ^ 32206497;
                    i2 = 901000146;
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case -340490900:
                case 198747360:
                    intent = intent;
                    strM13542 = strM13542;
                    C2956.m9014(ActivityC16315.class, c18258, strM7159);
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("۬ܳ") ^ i6;
                        i = ((iM6981 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                    } else {
                        iM6981 = (C0630.m2566("᩵ۛ") ^ i6) * (-107);
                        i = ((iM6981 ^ i5) * 22055) ^ (-1863656355);
                        i2 = -1877425004;
                    }
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case 745889717:
                case 2092526555:
                    intent = intent;
                    strM13542 = strM13542;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("۬ܳ") ^ i6;
                        i = ((iM6981 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                    } else {
                        iM6981 = (C2105.m6981("᩻۬") ^ i5) * (-109);
                        i = ((iM6981 ^ i6) * 15739) ^ 1302575049;
                        i2 = 1325149485;
                    }
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                case 1151549412:
                case 1507773556:
                    C3663.m11168();
                    C11340.m28031();
                    intent = intent;
                    strM13542 = strM13542;
                    iM6981 = C0630.m2566("ۗۢ") ^ i6;
                    i = ((iM6981 ^ i5) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
                default:
                    intent = intent;
                    strM13542 = strM13542;
                    strM7159 = C2167.m7159(f45554, 65, 14, i14);
                    if (C0630.f2410 <= 0) {
                        iM6981 = (C0630.m2566("ۧ֨") ^ i6) * (-29);
                        i = ((iM6981 ^ i5) * 24427) ^ (-1664767305);
                        i2 = 433504083;
                    } else {
                        iM6981 = (C0630.m2566("ۙ᩸") ^ i6) * 17;
                        i = ((iM6981 ^ i5) * 17909) ^ (-219811688);
                        i2 = -617984104;
                    }
                    intent = intent;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    strM13542 = strM13542;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C12392 c12392 = null;
        C15545 c15545 = null;
        int i = -461802817;
        int i2 = C22628.f73083;
        int i3 = C3432.f10845;
        int iM6981 = C2105.m6981("ۤ۬") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-3709)) ^ (-728609854);
        int i5 = 1207986969;
        while (true) {
            i = ((((i ^ i2) * 365) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1926708397:
                case 87470913:
                    break;
                case -1631971841:
                case 1523961399:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        iM6981 = (C2105.m6981("֡۬") + i3) * (-95);
                        i4 = ((iM6981 ^ i2) * (-17241)) ^ (-114761841);
                        i5 = -804803136;
                    }
                    break;
                case -1564581652:
                case 1912005292:
                    if (C1504.f5354) {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * (-29);
                        i4 = ((iM6981 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    } else {
                        iM6981 = (i3 - C2105.m6981("֨ۧ")) * (-127);
                        i4 = ((iM6981 ^ i2) * (-25777)) ^ 1202031780;
                        i5 = -609007248;
                    }
                    break;
                case -1421827041:
                case 2118445089:
                    c12392.m30386();
                    iM6981 = (i3 - C2105.m6981("᩶ۡ")) * (-33);
                    i4 = ((iM6981 ^ i2) * 16499) ^ (-47891953);
                    i5 = 1999405563;
                    break;
                case -1008888021:
                case -252544743:
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        iM6981 = C2105.m6981("ܺۢ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-16083)) ^ 1880200175;
                        i5 = -1420167692;
                    }
                    break;
                case -867607374:
                case -577613390:
                    if (C4159.f13567) {
                        iM6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-23363)) ^ 2130611825;
                        i5 = -2146364010;
                    } else {
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    }
                    break;
                case -538549864:
                case 833736727:
                    super.onDestroy();
                    c15545 = this.f45562;
                    if (c15545 != null) {
                        iM6981 = (C2105.m6981("ۨۖ") + i3) * 97;
                        i4 = ((iM6981 ^ i2) * 22171) ^ (-753542557);
                        i5 = -2072843251;
                    } else {
                        iM6981 = C2105.m6981("᩺֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-8081)) ^ (-719337036);
                        i5 = 819367891;
                    }
                    break;
                case -329450478:
                case 1196945731:
                    if (!C2520.m8026()) {
                        iM6981 = (C2105.m6981("ۚ֫") + i2) * 51;
                        i4 = ((iM6981 ^ i3) * (-3711)) ^ 835622563;
                        i5 = -1681801550;
                    } else {
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    }
                    break;
                case -322396688:
                case 744997965:
                    C4616.m13552();
                    C4616.m13552();
                    break;
                case -121549240:
                case 1422557456:
                    C3911.m11924();
                    if (C22628.f73083 > 0) {
                        iM6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * (-29);
                        i4 = ((iM6981 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    }
                    break;
                case -48960327:
                case 1469226802:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        iM6981 = C2105.m6981("᩹ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10119)) ^ 271640916;
                        i5 = -1755423376;
                    }
                    break;
                case 225255737:
                case 665087534:
                    C0714.m2805();
                    iM6981 = C2105.m6981("᩺᩸") ^ i3;
                    i4 = ((iM6981 ^ i2) * 23255) ^ (-620145538);
                    i5 = -1720659877;
                    break;
                case 385898926:
                case 934966572:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        iM6981 = C0630.m2566("֫ۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 21415) ^ (-967823975);
                        i5 = -625518722;
                    }
                    break;
                case 427338843:
                case 1754524591:
                    c15545.m36695();
                    iM6981 = C2105.m6981("᩺֫") ^ i2;
                    i4 = ((iM6981 ^ i3) * (-8081)) ^ (-719337036);
                    i5 = 819367891;
                    break;
                case 489256115:
                case 2062237132:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        iM6981 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19733) ^ (-59784388);
                        i5 = 338053491;
                    }
                    break;
                case 706462326:
                case 1050134328:
                    if (C1916.f6442) {
                        iM6981 = C2105.m6981("᩻᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3689)) ^ (-497405293);
                        i5 = 585109521;
                    } else {
                        iM6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    }
                    break;
                case 721101544:
                case 1873001159:
                    c12392 = this.f45556;
                    if (c12392 != null) {
                        iM6981 = C0630.m2566("᩹᩶") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-15811)) ^ 1218241728;
                        i5 = -1633620511;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩶ۡ")) * (-33);
                        i4 = ((iM6981 ^ i2) * 16499) ^ (-47891953);
                        i5 = 1999405563;
                    }
                    break;
                case 889585724:
                case 918326952:
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        iM6981 = C2105.m6981("ۧᩴ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 11095) ^ 2061164580;
                        i5 = 192164278;
                    }
                    break;
                case 1471277409:
                case 1995152856:
                    C0050.m940();
                    if (C0964.f3626 != 0) {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * (-29);
                        i4 = ((iM6981 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    } else {
                        iM6981 = (C2105.m6981("ۚ֫") + i2) * 51;
                        i4 = ((iM6981 ^ i3) * (-3711)) ^ 835622563;
                        i5 = -1681801550;
                    }
                    break;
                default:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        iM6981 = C2105.m6981("ܳۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-22177)) ^ (-1161552708);
                        i5 = 1753672853;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f5 A[PHI: r2 r11
      0x00f5: PHI (r2v4 android.content.Intent) = (r2v3 android.content.Intent), (r2v2 android.content.Intent), (r2v2 android.content.Intent) binds: [B:32:0x00f3, B:28:0x00d2, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r11v4 short[]) = (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:32:0x00f3, B:28:0x00d2, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x020c A[PHI: r5
      0x020c: PHI (r5v4 short) = (r5v3 short), (r5v2 short) binds: [B:61:0x020a, B:16:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x023f A[PHI: r4 r6
      0x023f: PHI (r4v4 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:65:0x023d, B:57:0x01ee, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x023f: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:65:0x023d, B:57:0x01ee, B:23:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0271 A[PHI: r7 r8 r9 r12 r13 r18
      0x0271: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:69:0x026f, B:53:0x01d1, B:49:0x01b0, B:18:0x0084, B:16:0x0080, B:12:0x0061, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:69:0x026f, B:53:0x01d1, B:49:0x01b0, B:18:0x0084, B:16:0x0080, B:12:0x0061, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:69:0x026f, B:53:0x01d1, B:49:0x01b0, B:18:0x0084, B:16:0x0080, B:12:0x0061, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:69:0x026f, B:53:0x01d1, B:49:0x01b0, B:18:0x0084, B:16:0x0080, B:12:0x0061, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:69:0x026f, B:53:0x01d1, B:49:0x01b0, B:18:0x0084, B:16:0x0080, B:12:0x0061, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r18v5 short[]) = 
      (r18v4 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
      (r18v3 short[])
     binds: [B:69:0x026f, B:53:0x01d1, B:49:0x01b0, B:18:0x0084, B:16:0x0080, B:12:0x0061, B:9:0x0058, B:6:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final void finish() {
        int iM6981;
        int i;
        int i2;
        int i3 = C0422.f1886;
        int i4 = C5695.f17556;
        int iM2566 = (C0630.m2566("ۡ᩺") ^ i3) * 37;
        int i5 = ((iM2566 ^ i4) * 16767) ^ (-2025781879);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ 155545947;
        Intent intent = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -507283885;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 23783) >> 31));
            switch (i14) {
                case -2041655086:
                case -2039557259:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = C2105.m6981("ܰۢ") ^ i3;
                        i = ((iM6981 ^ i4) * (-3779)) ^ 1655080680;
                        i2 = 1636432553;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2018075141:
                case -1823832125:
                    sArr = f45554;
                    if (C21923.f70183 != 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = C2105.m6981("ۚۘ") ^ i3;
                        i = ((iM6981 ^ i4) * 25021) ^ 2026651400;
                        i2 = 1823030689;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1911988616:
                case -199730823:
                    C1773.m5908();
                    if (C0630.f2410 <= 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = C2105.m6981("ܺܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 14493) ^ (-1508558851);
                        i2 = -9575674;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1626543040:
                case -710503021:
                    i11 = 28062;
                    iM6981 = (C2105.m6981("ܿܶ") + i3) * 59;
                    i = ((iM6981 ^ i4) * 25303) ^ (-2034499338);
                    i2 = -1635167001;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1621328726:
                case 1568086913:
                    C4117.m12364();
                    iM6981 = C0630.m2566("۫۟") ^ i3;
                    i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                    i2 = -1446093635;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1358064763:
                case -238732034:
                    intent = new Intent();
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("ܺܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 14493) ^ (-1508558851);
                        i2 = -9575674;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۫ۛ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM6981 ^ i4) * 23677) ^ (-1954607210);
                        i2 = 22662433;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1327454953:
                case -143298825:
                    intent.putExtra(C1711.m5726(sArr2, i12, i13, i11), m35407());
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("᩶ᩳ") + i4) * (-71);
                        i = ((iM6981 ^ i3) * 4665) ^ 1632940300;
                        i2 = -1161662708;
                    } else {
                        iM6981 = C2105.m6981("᩸ܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-26413)) ^ (-1490120105);
                        i2 = -1372124967;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1322925336:
                case 1376148839:
                    C4616.m13552();
                    break;
                case -1302326618:
                case 2036489242:
                    i10 = 298978681;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = (C2105.m6981("᩹۬") + i4) * 79;
                        i = ((iM6981 ^ i3) * 15831) ^ 1299555516;
                        i2 = 911440358;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1143767134:
                case 731246726:
                    i7 = s + 17291;
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("᩶ᩳ") + i4) * (-71);
                        i = ((iM6981 ^ i3) * 4665) ^ 1632940300;
                        i2 = -1161662708;
                    } else {
                        iM6981 = C0630.m2566("ᩳ۟") ^ i3;
                        i = ((iM6981 ^ i4) * 25849) ^ 1696484717;
                        i2 = -1633244897;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -656590844:
                case 992778219:
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = (C2105.m6981("᩹᩻") + i3) * 65;
                        i = ((iM6981 ^ i4) * (-6829)) ^ 472214391;
                        i2 = 165937506;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -420709151:
                case 1444569595:
                    super.finish();
                    break;
                case -410630341:
                case 1151800772:
                    C3683.m11222();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = (C2105.m6981("ۢ֫") + i4) * 29;
                        i = ((iM6981 ^ i3) * 13573) ^ 1026299018;
                        i2 = 126501348;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -116721400:
                case -30462464:
                    sArr2 = f45554;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ܺܶ") ^ i3;
                        i = ((iM6981 ^ i4) * 14493) ^ (-1508558851);
                        i2 = -9575674;
                    } else {
                        iM6981 = (C0630.m2566("ۗ֡") + i4) * (-85);
                        i = ((iM6981 ^ i3) * (-29207)) ^ 1366725205;
                        i2 = 931979627;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 55649488:
                case 1423965021:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 < 0) {
                        iM6981 = (C2105.m6981("ۨ۟") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM6981 ^ i3) * 3787) ^ (-214873415);
                        i2 = 434557980;
                    } else {
                        iM6981 = C0630.m2566("֫ܿ") ^ i3;
                        i = ((iM6981 ^ i4) * 18513) ^ (-1403039343);
                        i2 = -2014897739;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 255313973:
                case 1124275019:
                    setResult(1, intent);
                    iM6981 = (i4 - C2105.m6981("ܰۨ")) * (-73);
                    i = ((iM6981 ^ i3) * 643) ^ (-1883939870);
                    i2 = -1117440952;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 551848751:
                case 1897858896:
                    if (this.f45559) {
                        iM6981 = C2105.m6981("۫ۡ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30569)) ^ (-756236933);
                        i2 = 485671423;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ܰۨ")) * (-73);
                        i = ((iM6981 ^ i3) * 643) ^ (-1883939870);
                        i2 = -1117440952;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 640959137:
                case 649175364:
                    s = sArr[c];
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C2105.m6981("᩹᩻") + i3) * 65;
                        i = ((iM6981 ^ i4) * (-6829)) ^ 472214391;
                        i2 = 165937506;
                    } else {
                        iM6981 = (C0630.m2566("᩻ܽ") ^ i4) * (-5);
                        i = ((iM6981 ^ i3) * 31759) ^ 1959112590;
                        i2 = 1986953521;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 693966430:
                case 1950524830:
                    c = 'o';
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("᩶ᩳ") + i4) * (-71);
                        i = ((iM6981 ^ i3) * 4665) ^ 1632940300;
                        i2 = -1161662708;
                    } else {
                        iM6981 = (C2105.m6981("ܰ֨") ^ i4) * 11;
                        i = ((iM6981 ^ i3) * 25889) ^ 1939047009;
                        i2 = 391195812;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 738022574:
                case 1376799164:
                    i11 = 51398;
                    iM6981 = (C2105.m6981("ܿܶ") + i3) * 59;
                    i = ((iM6981 ^ i4) * 25303) ^ (-2034499338);
                    i2 = -1635167001;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i12 = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    i13 = 4;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("۫۟") ^ i3;
                        i = ((iM6981 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM6981 = C0630.m2566("֡ۤ") ^ i3;
                        i = ((iM6981 ^ i4) * (-19577)) ^ 2089996051;
                        i2 = -1475652747;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x04f4 A[PHI: r3 r20 r21 r30
      0x04f4: PHI (r3v36 java.lang.String) = (r3v2 java.lang.String), (r3v38 java.lang.String) binds: [B:109:0x04de, B:99:0x043c] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r20v56 l.۬ۜܽ) = (r20v18 l.۬ۜܽ), (r20v57 l.۬ۜܽ) binds: [B:109:0x04de, B:99:0x043c] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r21v56 l.۬ۜܽ) = (r21v18 l.۬ۜܽ), (r21v57 l.۬ۜܽ) binds: [B:109:0x04de, B:99:0x043c] A[DONT_GENERATE, DONT_INLINE]
      0x04f4: PHI (r30v74 l.ᩳ᩵ۡ) = (r30v25 l.ᩳ᩵ۡ), (r30v75 l.ᩳ᩵ۡ) binds: [B:109:0x04de, B:99:0x043c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00df, code lost:
    
        if (l.C3245.f10203 > 0) goto L14;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        C12951 c12951;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int iM2568;
        int i6;
        int i7;
        C18258 c18258;
        boolean z;
        short[] sArr;
        C15545 c15545;
        C18258 c18259;
        C15545 c15546;
        int i8;
        C15545 c15547;
        boolean z2;
        int iM6982;
        int i9;
        int i10;
        int i11;
        int iM6983;
        int i12;
        int i13;
        int iM6984;
        int i14;
        int i15;
        int iM2569;
        int i16;
        int iM6985;
        int i17;
        bundle = bundle;
        int i18 = -1626752940;
        int i19 = C5695.f17556;
        int i20 = C1294.f4556;
        int iM6986 = (i19 - C2105.m6981("ۚ᩵")) * (-79);
        int i21 = ((iM6986 ^ i20) * 22423) ^ (-751157885);
        int i22 = iM6986 ^ 1567861515;
        C12392 c12392 = null;
        Intent intentM12571 = null;
        C15545 c15548 = null;
        InterfaceC12344 interfaceC12344 = null;
        String str = null;
        short[] sArr2 = null;
        int i23 = 0;
        boolean z3 = false;
        int iM6987 = 0;
        int i24 = 0;
        int i25 = 0;
        C15545 c15549 = null;
        String strM10628 = null;
        Intent intentM7034 = null;
        C18258 c182510 = null;
        short[] sArr3 = null;
        boolean z4 = false;
        String str2 = null;
        C12951 c12952 = null;
        C12951 c12953 = null;
        byte[] bArr = null;
        byte[] bArrM14990 = null;
        TextView textViewM34924 = null;
        String strM9031 = null;
        int intExtra = 0;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * 15917) >> 31));
            switch (i18) {
                case -2139419769:
                case -1023552034:
                    c18259 = c182510;
                    c15547 = c15548;
                    C12951 c12954 = c12952;
                    c12953 = c12953;
                    c12951 = c12954;
                    c15547.m36677(str2);
                    z2 = z4;
                    this.f45555 = C2126.m7034(this).getBooleanExtra(C1005.m3502(f45554, 190, 13, i23), z2);
                    intentM7034 = C2126.m7034(this);
                    if (C3683.f11629 >= 0) {
                        iM6982 = C2105.m6981("᩷ܳ") ^ i20;
                        i9 = ((iM6982 ^ i19) * 29031) ^ 563056917;
                        i10 = 1024512247;
                    } else {
                        iM6982 = (i20 - C2105.m6981("ۖ᩻")) * 69;
                        i9 = ((iM6982 ^ i19) * (-11003)) ^ 1624150316;
                        i10 = -900989582;
                    }
                    i8 = iM6982 ^ i10;
                    c15548 = c15547;
                    i21 = i9;
                    z4 = z2;
                    c182510 = c18259;
                    i22 = i8;
                    bundle = bundle;
                    C12951 c12955 = c12953;
                    c12952 = c12951;
                    c12953 = c12955;
                    break;
                case -2032111767:
                case -1848165857:
                    RunnableC1937.m6387();
                    if (C4159.f13567) {
                        iM6981 = C0630.m2566("ܳ֡") ^ i19;
                        i = ((iM6981 ^ i20) * 7625) ^ (-1648175783);
                        i2 = -1086196391;
                    } else {
                        iM6981 = (C0630.m2566("ۨ᩶") ^ i19) * (-101);
                        i = ((iM6981 ^ i20) * 27945) ^ 367008840;
                        i2 = 803067359;
                    }
                    i22 = iM6981 ^ i2;
                    i21 = i;
                    break;
                case -2009628646:
                case -1281824221:
                    C22628.m50616(this.f45556, new C0273(str));
                    break;
                case -2001895713:
                case 1707285362:
                    super.finish();
                    break;
                case -1903924775:
                case -1222382191:
                    C4263.m12819();
                    break;
                case -1902056000:
                case -1014651443:
                    c182510 = c182510;
                    C12951 c12956 = c12952;
                    c12953 = c12953;
                    c12951 = c12956;
                    strM9031 = C2958.m9031(f45554, 244, 12, i23);
                    if (C5213.m14989(bundle, strM9031)) {
                        iM6983 = (i20 - C0630.m2566("᩹ܺ")) * 95;
                        i12 = ((iM6983 ^ i19) * (-27343)) ^ 1983309670;
                        i13 = 360290094;
                    } else {
                        iM6983 = (C2105.m6981("᩶᩶") ^ i20) * (-69);
                        i12 = ((iM6983 ^ i19) * 5941) ^ 1878300457;
                        i13 = 2104282656;
                    }
                    C18258 c182511 = c182510;
                    i22 = iM6983 ^ i13;
                    i21 = i12;
                    c182510 = c182511;
                    C12951 c12957 = c12953;
                    c12952 = c12951;
                    c12953 = c12957;
                    break;
                case -1858793033:
                case 1532989989:
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    iM6987 = iM6987;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    textViewM34924 = textViewM34924;
                    C12951 c12958 = c12952;
                    c12953 = c12953;
                    c12951 = c12958;
                    short s = f45554[116];
                    int i26 = (s * s) + 284495689;
                    int i27 = s + 16867;
                    if ((i27 * i27) - (i26 + i26) > 0) {
                        iM2566 = (C2105.m6981("ۚ᩷") + i20) * 81;
                        i3 = ((iM2566 ^ i19) * (-29777)) ^ (-887054704);
                        i4 = -666250121;
                    } else {
                        iM2566 = C0630.m2566("ܿۤ") ^ i19;
                        i3 = ((iM2566 ^ i20) * (-16171)) ^ (-455342962);
                        i4 = -1874493674;
                    }
                    i7 = iM2566 ^ i4;
                    iM6987 = iM6987;
                    textViewM34924 = textViewM34924;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c15548 = c15548;
                    str = str;
                    z4 = z4;
                    C12951 c12959 = c12953;
                    c12952 = c12951;
                    c12953 = c12959;
                    break;
                case -1843700416:
                case -591586955:
                    if (C3245.f10203 > 0) {
                        iM6981 = C2105.m6981("ᩳۛ") ^ i19;
                        i = ((iM6981 ^ i20) * (-31967)) ^ (-1082308033);
                        i2 = -286151950;
                        i22 = iM6981 ^ i2;
                        i21 = i;
                    } else {
                        c18259 = c182510;
                        c15546 = c15548;
                        C12951 c129510 = c12952;
                        c12953 = c12953;
                        c12951 = c129510;
                        int iM25610 = (i20 - C0630.m2566("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i28 = ((iM25610 ^ i19) * (-26763)) ^ (-156291116);
                        i8 = iM25610 ^ (-1092488166);
                        c15548 = c15546;
                        i21 = i28;
                        c182510 = c18259;
                        i22 = i8;
                        bundle = bundle;
                        C12951 c129511 = c12953;
                        c12952 = c12951;
                        c12953 = c129511;
                    }
                    break;
                case -1704769799:
                case -159048968:
                    if (C21923.f70183 == 0) {
                        str = str;
                        c182510 = c182510;
                        z3 = z3;
                        iM6987 = iM6987;
                        z4 = z4;
                        c15548 = c15548;
                        strM9031 = strM9031;
                        textViewM34924 = textViewM34924;
                        C12951 c129512 = c12952;
                        c12953 = c12953;
                        c12951 = c129512;
                        iM2566 = (i20 - C0630.m2566("ܺ۫")) * 17;
                        i3 = ((iM2566 ^ i19) * 3495) ^ (-283401538);
                        i4 = 1411486444;
                        i7 = iM2566 ^ i4;
                        iM6987 = iM6987;
                        textViewM34924 = textViewM34924;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        z3 = z3;
                        i22 = i7;
                        i21 = i3;
                        c15548 = c15548;
                        str = str;
                        z4 = z4;
                        C12951 c129513 = c12953;
                        c12952 = c12951;
                        c12953 = c129513;
                    }
                    c18258 = c182510;
                    z = z4;
                    c15545 = c15548;
                    sArr = sArr2;
                    C12951 c129514 = c12952;
                    c12953 = c12953;
                    c12951 = c129514;
                    iM6985 = (C2105.m6981("᩷ۚ") + i20) * 99;
                    i21 = ((iM6985 ^ i19) * (-28701)) ^ (-101361958);
                    i17 = -1175935286;
                    int i29 = iM6985 ^ i17;
                    sArr2 = sArr;
                    c15548 = c15545;
                    c182510 = c18258;
                    i22 = i29;
                    z4 = z;
                    bundle = bundle;
                    C12951 c129515 = c12953;
                    c12952 = c12951;
                    c12953 = c129515;
                    break;
                case -1684962609:
                case 11374542:
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    textViewM34924 = textViewM34924;
                    C12951 c129516 = c12952;
                    c12953 = c12953;
                    c12951 = c129516;
                    super.onCreate(bundle);
                    m10214();
                    C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    AbstractC0525 c0129 = new C0129(this);
                    RunnableC3474.m10618(onBackPressedDispatcher);
                    onBackPressedDispatcher.m28891(c0129);
                    iM6987 = C2105.m6981(C0237.m1483(f45554, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i23)) ^ 2123082943;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2567 = (C2105.m6981("۫ᩳ") + i19) * 9;
                        i21 = ((iM2567 ^ i20) * 3513) ^ (-1136830147);
                        i5 = -862200370;
                    } else {
                        iM2567 = (C0630.m2566("ۘۖ") ^ i20) * (-67);
                        i21 = ((iM2567 ^ i19) * 7201) ^ 1856648921;
                        i5 = 254434565;
                    }
                    i11 = iM2567 ^ i5;
                    textViewM34924 = textViewM34924;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c15548 = c15548;
                    z4 = z4;
                    C12951 c129517 = c12953;
                    c12952 = c12951;
                    c12953 = c129517;
                    break;
                case -1495005906:
                case -1429206905:
                    c182510 = c182510;
                    C12951 c129518 = c12952;
                    c12953 = c12953;
                    c12951 = c129518;
                    if (intExtra != z3) {
                        iM6983 = (i19 - C0630.m2566("ܿۨ")) * (-35);
                        i12 = ((iM6983 ^ i20) * 17789) ^ 1475699543;
                        i13 = -242292352;
                    } else {
                        iM6983 = C2105.m6981("ۛ᩺") ^ i20;
                        i12 = ((iM6983 ^ i19) * (-30113)) ^ (-718690291);
                        i13 = 1650118138;
                    }
                    C18258 c182512 = c182510;
                    i22 = iM6983 ^ i13;
                    i21 = i12;
                    c182510 = c182512;
                    C12951 c129519 = c12953;
                    c12952 = c12951;
                    c12953 = c129519;
                    break;
                case -1490758571:
                case -832704624:
                    super.finish();
                    break;
                case -1472225171:
                case 142015296:
                    if (C2520.f8000 < 0) {
                        str = str;
                        c182510 = c182510;
                        z3 = z3;
                        z4 = z4;
                        c15548 = c15548;
                        strM9031 = strM9031;
                        C12951 c129520 = c12952;
                        c12953 = c12953;
                        c12951 = c129520;
                        iM2568 = C0630.m2566("۠ۘ") ^ i19;
                        i21 = ((iM2568 ^ i20) * (-2583)) ^ (-2072005550);
                        i6 = 2095104432;
                        i11 = iM2568 ^ i6;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c15548 = c15548;
                        z4 = z4;
                        C12951 c1295110 = c12953;
                        c12952 = c12951;
                        c12953 = c1295110;
                    }
                    c18259 = c182510;
                    c15546 = c15548;
                    C12951 c1295111 = c12952;
                    c12953 = c12953;
                    c12951 = c1295111;
                    int iM25611 = (i20 - C0630.m2566("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    int i210 = ((iM25611 ^ i19) * (-26763)) ^ (-156291116);
                    i8 = iM25611 ^ (-1092488166);
                    c15548 = c15546;
                    i21 = i210;
                    c182510 = c18259;
                    i22 = i8;
                    bundle = bundle;
                    C12951 c1295112 = c12953;
                    c12952 = c12951;
                    c12953 = c1295112;
                    break;
                case -1462872363:
                case -57256394:
                    if (!C2126.f7087) {
                        iM6981 = (C0630.m2566("ۨ᩶") ^ i19) * (-101);
                        i = ((iM6981 ^ i20) * 27945) ^ 367008840;
                        i2 = 803067359;
                        i22 = iM6981 ^ i2;
                        i21 = i;
                    } else {
                        str = str;
                        c182510 = c182510;
                        z3 = z3;
                        z4 = z4;
                        c15548 = c15548;
                        strM9031 = strM9031;
                        C12951 c129521 = c12952;
                        c12953 = c12953;
                        c12951 = c129521;
                        iM2568 = C2105.m6981("ܿ֨") ^ i20;
                        i21 = ((iM2568 ^ i19) * 4519) ^ 1416770523;
                        i6 = 562837947;
                        i11 = iM2568 ^ i6;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c15548 = c15548;
                        z4 = z4;
                        C12951 c1295113 = c12953;
                        c12952 = c12951;
                        c12953 = c1295113;
                    }
                    break;
                case -1398200695:
                case -1391468746:
                    c182510 = c182510;
                    C12951 c129522 = c12952;
                    c12953 = c12953;
                    c12951 = c129522;
                    intExtra = intentM12571.getIntExtra(ViewOnClickListenerC1958.m6435(f45554, 238, 6, i23), -1);
                    if (intExtra != 0) {
                        iM6983 = C2105.m6981("ۛ۟") ^ i19;
                        i12 = ((iM6983 ^ i20) * 2711) ^ (-2140314495);
                        i13 = 1206383540;
                    } else {
                        iM6983 = (C0630.m2566("᩹۫") ^ i20) * (-43);
                        i12 = ((iM6983 ^ i19) * (-32305)) ^ 506365402;
                        i13 = 1178425682;
                    }
                    C18258 c182513 = c182510;
                    i22 = iM6983 ^ i13;
                    i21 = i12;
                    c182510 = c182513;
                    C12951 c1295114 = c12953;
                    c12952 = c12951;
                    c12953 = c1295114;
                    break;
                case -1314017229:
                case 748911640:
                    super.finish();
                    break;
                case -1169890305:
                case 715725598:
                    c12951 = c12952;
                    i23 = 11356;
                    iM2566 = C2105.m6981("᩻ۧ") ^ i19;
                    i3 = ((iM2566 ^ i20) * 16587) ^ 716552081;
                    i4 = -308702123;
                    i7 = iM2566 ^ i4;
                    iM6987 = iM6987;
                    textViewM34924 = textViewM34924;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c15548 = c15548;
                    str = str;
                    z4 = z4;
                    C12951 c1295115 = c12953;
                    c12952 = c12951;
                    c12953 = c1295115;
                    break;
                case -938190153:
                case 334862128:
                    this.f45565 = z3;
                    C22628.m50616(this.f45556, new C0273(C4263.m12812(c182510.f56782, C1128.m3841(f45554, 302, 54, i23), "")));
                    this.f45560 = (byte) c182510.f56781;
                    break;
                case -911884945:
                case -428738984:
                    c182510 = c182510;
                    C12951 c129523 = c12952;
                    c12953 = c12953;
                    c12951 = c129523;
                    bArrM14990 = C5213.m14990(bundle, strM9031);
                    if (bArrM14990 == null) {
                        iM6983 = (C2105.m6981("ܶᩴ") + i20) * (-125);
                        i12 = ((iM6983 ^ i19) * 31727) ^ 29827826;
                        i13 = -537623622;
                    } else {
                        iM6983 = (i19 - C0630.m2566("ܿ۬")) * (-125);
                        i12 = ((iM6983 ^ i20) * (-29385)) ^ 717159976;
                        i13 = 665570758;
                    }
                    C18258 c182514 = c182510;
                    i22 = iM6983 ^ i13;
                    i21 = i12;
                    c182510 = c182514;
                    C12951 c1295116 = c12953;
                    c12952 = c12951;
                    c12953 = c1295116;
                    break;
                case -878358474:
                case -781778829:
                    C2958.m9034();
                    break;
                case -850225874:
                case 1283091390:
                    C12951 c129524 = c12952;
                    c12953 = c12953;
                    c12951 = c129524;
                    c182510 = c182510;
                    bArr = (byte[]) C2956.m9013(C22628.m50602(f45554, BottomAppBarTopEdgeTreatment.ANGLE_UP, 15, i23));
                    if (bArr == null) {
                        iM6983 = (i19 - C2105.m6981("۠ۗ")) * (-39);
                        i12 = ((iM6983 ^ i20) * 14619) ^ (-189748932);
                        i13 = 850806431;
                    } else {
                        iM6983 = C2105.m6981("ۗۖ") ^ i20;
                        i12 = ((iM6983 ^ i19) * 7361) ^ (-163068696);
                        i13 = -1301386867;
                    }
                    C18258 c182515 = c182510;
                    i22 = iM6983 ^ i13;
                    i21 = i12;
                    c182510 = c182515;
                    C12951 c1295117 = c12953;
                    c12952 = c12951;
                    c12953 = c1295117;
                    break;
                case -804730155:
                case 503467727:
                    this.f45556.mo25896(c12952);
                    break;
                case -792293088:
                case -414381333:
                    c182510 = c182510;
                    C12951 c129525 = c12952;
                    c12953 = c12953;
                    c12951 = c129525;
                    this.f45561 = C4263.m12825(interfaceC12344, C3019.m9250(sArr3, 214, 24, i23), null);
                    C12392 c12393 = this.f45556;
                    if (C1773.f6144 > 0) {
                        c12393.m30334(new C5069(strM10628));
                        this.f45557 = ViewOnClickListenerC19121.m44072(this, new InterfaceC23206() { // from class: l.ᩴۖᩳ
                            @Override // l.InterfaceC23206
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // l.InterfaceC23206
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo8486(String str3) {
                                int i30 = ActivityC14946.f45553;
                                new C7891(this.f57276, str3).m20274();
                            }
                        });
                        this.f45556.m30407(z3);
                        if (bundle != null) {
                            iM6983 = C2105.m6981("۬᩶") ^ i19;
                            i12 = ((iM6983 ^ i20) * (-29533)) ^ 1045962799;
                            i13 = 1670855837;
                        } else {
                            iM6983 = (C2105.m6981("᩶᩶") ^ i20) * (-69);
                            i12 = ((iM6983 ^ i19) * 5941) ^ 1878300457;
                            i13 = 2104282656;
                        }
                        C18258 c182516 = c182510;
                        i22 = iM6983 ^ i13;
                        i21 = i12;
                        c182510 = c182516;
                        C12951 c1295118 = c12953;
                        c12952 = c12951;
                        c12953 = c1295118;
                    } else {
                        str = str;
                        z3 = z3;
                        iM6987 = iM6987;
                        z4 = z4;
                        c15548 = c15548;
                        strM9031 = strM9031;
                        textViewM34924 = textViewM34924;
                        iM2566 = (i20 - C0630.m2566("ܺ۫")) * 17;
                        i3 = ((iM2566 ^ i19) * 3495) ^ (-283401538);
                        i4 = 1411486444;
                        i7 = iM2566 ^ i4;
                        iM6987 = iM6987;
                        textViewM34924 = textViewM34924;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        z3 = z3;
                        i22 = i7;
                        i21 = i3;
                        c15548 = c15548;
                        str = str;
                        z4 = z4;
                        C12951 c1295119 = c12953;
                        c12952 = c12951;
                        c12953 = c1295119;
                    }
                    break;
                case -605738905:
                case 2104670404:
                    c12951 = c12952;
                    i23 = 1190;
                    iM2566 = C2105.m6981("᩻ۧ") ^ i19;
                    i3 = ((iM2566 ^ i20) * 16587) ^ 716552081;
                    i4 = -308702123;
                    i7 = iM2566 ^ i4;
                    iM6987 = iM6987;
                    textViewM34924 = textViewM34924;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c15548 = c15548;
                    str = str;
                    z4 = z4;
                    C12951 c12951110 = c12953;
                    c12952 = c12951;
                    c12953 = c12951110;
                    break;
                case -550344513:
                case -375922173:
                    c182510 = c182510;
                    C12951 c129526 = c12952;
                    c12953 = c12953;
                    c12951 = c129526;
                    str = (String) C2956.m9013(C2958.m9031(f45554, 256, 14, i23));
                    if (str == null) {
                        iM6983 = C2105.m6981("ܿ۟") ^ i19;
                        i12 = ((iM6983 ^ i20) * (-18925)) ^ 2125264921;
                        i13 = 1704638728;
                    } else {
                        iM6983 = C2105.m6981("ۡ᩻") ^ i20;
                        i12 = ((iM6983 ^ i19) * (-31019)) ^ (-446128249);
                        i13 = 658495883;
                    }
                    C18258 c182517 = c182510;
                    i22 = iM6983 ^ i13;
                    i21 = i12;
                    c182510 = c182517;
                    C12951 c12951111 = c12953;
                    c12952 = c12951;
                    c12953 = c12951111;
                    break;
                case -436189829:
                case 1337130351:
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    C12951 c129527 = c12952;
                    c12953 = c12953;
                    c12951 = c129527;
                    C0483.m2125(this);
                    RunnableC3474.m10625(this.f10584, new ViewOnClickListenerC15566(1, this));
                    C2126.m7039(this.f10584, new ViewOnClickListenerC3658(this, 0));
                    textViewM34924 = C14624.m34924(this.f10584);
                    if (C0382.f1805) {
                        iM2568 = C0630.m2566("᩺֨") ^ i20;
                        i21 = ((iM2568 ^ i19) * (-21199)) ^ 1349452678;
                        i6 = -684376571;
                    } else {
                        iM2568 = C0630.m2566("۠ۘ") ^ i19;
                        i21 = ((iM2568 ^ i20) * (-2583)) ^ (-2072005550);
                        i6 = 2095104432;
                    }
                    i11 = iM2568 ^ i6;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c15548 = c15548;
                    z4 = z4;
                    C12951 c12951112 = c12953;
                    c12952 = c12951;
                    c12953 = c12951112;
                    break;
                case -413981396:
                case 903602477:
                    c182510 = c182510;
                    C12951 c129528 = c12952;
                    c12953 = c12953;
                    c12951 = c129528;
                    this.f45558 = RunnableC3474.m10628(intentM7034, C3019.m9250(f45554, 203, 11, i23));
                    interfaceC12344 = ApplicationC20075.f65008;
                    sArr3 = f45554;
                    if (C4263.f13799 > 0) {
                        iM6983 = C2105.m6981("ۛᩳ") ^ i19;
                        i12 = ((iM6983 ^ i20) * 9427) ^ (-1328972025);
                        i13 = 175817796;
                        C18258 c182518 = c182510;
                        i22 = iM6983 ^ i13;
                        i21 = i12;
                        c182510 = c182518;
                        C12951 c12951113 = c12953;
                        c12952 = c12951;
                        c12953 = c12951113;
                    } else {
                        str = str;
                        z3 = z3;
                        z4 = z4;
                        c15548 = c15548;
                        strM9031 = strM9031;
                        textViewM34924 = textViewM34924;
                        iM2567 = (C2105.m6981("۫ᩳ") + i19) * 9;
                        i21 = ((iM2567 ^ i20) * 3513) ^ (-1136830147);
                        i5 = -862200370;
                        i11 = iM2567 ^ i5;
                        textViewM34924 = textViewM34924;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c15548 = c15548;
                        z4 = z4;
                        C12951 c12951114 = c12953;
                        c12952 = c12951;
                        c12953 = c12951114;
                    }
                    break;
                case -374674683:
                case 1013653495:
                    c18258 = c182510;
                    z = z4;
                    sArr = sArr2;
                    C12951 c129529 = c12952;
                    c12953 = c12953;
                    c12951 = c129529;
                    c15545 = c15548;
                    c15549.m36678(RunnableC1108.m3789(f45554, 130, 21, i23), true);
                    int iM25612 = C0630.m2566(C0714.m2816(f45554, 151, 3, i23));
                    i25 = 2098852048;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        i24 = iM25612;
                        z3 = true;
                        iM6985 = (C2105.m6981("᩷ۚ") + i20) * 99;
                        i21 = ((iM6985 ^ i19) * (-28701)) ^ (-101361958);
                        i17 = -1175935286;
                        int i211 = iM6985 ^ i17;
                        sArr2 = sArr;
                        c15548 = c15545;
                        c182510 = c18258;
                        i22 = i211;
                        z4 = z;
                        bundle = bundle;
                    } else {
                        int iM6988 = (C2105.m6981("ܳۙ") + i20) * 21;
                        i24 = iM25612;
                        sArr2 = sArr;
                        c15548 = c15545;
                        c182510 = c18258;
                        bundle = bundle;
                        i22 = iM6988 ^ 1850620928;
                        i21 = ((iM6988 ^ i19) * (-25179)) ^ (-2104059851);
                        z4 = z;
                        z3 = true;
                    }
                    C12951 c12951115 = c12953;
                    c12952 = c12951;
                    c12953 = c12951115;
                    break;
                case -328181014:
                case 898100229:
                    c18259 = c182510;
                    c15546 = c15548;
                    C12951 c129530 = c12952;
                    c12953 = c12953;
                    c12951 = c129530;
                    C1128.m3853(C0964.m3409(this, i24 ^ i25), 8);
                    intentM12571 = C4159.m12571(this);
                    this.f45559 = intentM12571.getBooleanExtra(C4075.m12252(f45554, EnumC17734.f54268, 17, i23), false);
                    sArr2 = f45554;
                    if (C0237.f1507 != 0) {
                        z4 = false;
                        int iM25613 = (i20 - C0630.m2566("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i212 = ((iM25613 ^ i19) * (-26763)) ^ (-156291116);
                        i8 = iM25613 ^ (-1092488166);
                        c15548 = c15546;
                        i21 = i212;
                        c182510 = c18259;
                    } else {
                        int iM6989 = C2105.m6981("᩻ۢ") ^ i19;
                        int i30 = ((iM6989 ^ i20) * 12687) ^ (-1010534766);
                        i8 = iM6989 ^ 480719199;
                        c15548 = c15546;
                        i21 = i30;
                        c182510 = c18259;
                        z4 = false;
                    }
                    i22 = i8;
                    bundle = bundle;
                    C12951 c12951116 = c12953;
                    c12952 = c12951;
                    c12953 = c12951116;
                    break;
                case -301083649:
                case 209522986:
                    super.finish();
                    break;
                case -58993829:
                case 1383477696:
                    C0964.m3413();
                    if (C4117.f13076 > 0) {
                        c18259 = c182510;
                        z2 = z4;
                        c15547 = c15548;
                        C12951 c129531 = c12952;
                        c12953 = c12953;
                        c12951 = c129531;
                        iM6982 = C2105.m6981("᩷ܳ") ^ i20;
                        i9 = ((iM6982 ^ i19) * 29031) ^ 563056917;
                        i10 = 1024512247;
                        i8 = iM6982 ^ i10;
                        c15548 = c15547;
                        i21 = i9;
                        z4 = z2;
                        c182510 = c18259;
                        i22 = i8;
                        bundle = bundle;
                        C12951 c12951117 = c12953;
                        c12952 = c12951;
                        c12953 = c12951117;
                    }
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    C12951 c1295210 = c12952;
                    c12953 = c12953;
                    c12951 = c1295210;
                    iM2568 = C2105.m6981("ܿ֨") ^ i20;
                    i21 = ((iM2568 ^ i19) * 4519) ^ 1416770523;
                    i6 = 562837947;
                    i11 = iM2568 ^ i6;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c15548 = c15548;
                    z4 = z4;
                    C12951 c12951118 = c12953;
                    c12952 = c12951;
                    c12953 = c12951118;
                    break;
                case 63287405:
                case 1439081830:
                    C4616.m13552();
                    if (!C2167.m7155()) {
                        c18259 = c182510;
                        c15546 = c15548;
                        C12951 c12951119 = c12952;
                        c12953 = c12953;
                        c12951 = c12951119;
                        int iM25614 = (i20 - C0630.m2566("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i213 = ((iM25614 ^ i19) * (-26763)) ^ (-156291116);
                        i8 = iM25614 ^ (-1092488166);
                        c15548 = c15546;
                        i21 = i213;
                        c182510 = c18259;
                        i22 = i8;
                        bundle = bundle;
                        C12951 c129511110 = c12953;
                        c12952 = c12951;
                        c12953 = c129511110;
                    } else {
                        iM6981 = (C0630.m2566("ۨ᩶") ^ i19) * (-101);
                        i = ((iM6981 ^ i20) * 27945) ^ 367008840;
                        i2 = 803067359;
                        i22 = iM6981 ^ i2;
                        i21 = i;
                    }
                    break;
                case 179398044:
                case 204862283:
                    C12951 c129532 = c12953;
                    c12951 = c12952;
                    c12953 = c129532;
                    c182510 = (C18258) C2956.m9013(C1773.m5917(f45554, 288, 14, i23));
                    if (c182510 == null) {
                        iM6984 = (C2105.m6981("ۗܽ") ^ i19) * (-121);
                        i14 = ((iM6984 ^ i20) * (-15443)) ^ (-501360279);
                        i15 = 785890151;
                    } else {
                        iM6984 = (C0630.m2566("ۢ֨") ^ i20) * (-93);
                        i14 = ((iM6984 ^ i19) * 4633) ^ 641118455;
                        i15 = 2047197591;
                    }
                    i22 = iM6984 ^ i15;
                    i21 = i14;
                    C12951 c129511111 = c12953;
                    c12952 = c12951;
                    c12953 = c129511111;
                    break;
                case 187533464:
                case 768330131:
                    c12951 = c12952;
                    C12951 c12951M31485 = C12951.m31485(bArrM14990);
                    boolean zM12815 = C4263.m12815(c12951M31485);
                    this.f45565 = zM12815;
                    if (!zM12815) {
                        c12953 = c12951M31485;
                        iM6984 = (C0630.m2566("۫ۚ") ^ i20) * (-75);
                        i14 = ((iM6984 ^ i19) * 30963) ^ 1057271676;
                        i15 = -882931687;
                        i22 = iM6984 ^ i15;
                        i21 = i14;
                        C12951 c129511112 = c12953;
                        c12952 = c12951;
                        c12953 = c129511112;
                    } else {
                        iM2569 = (C0630.m2566("᩺۫") ^ i19) * 47;
                        c12953 = c12951M31485;
                        i21 = ((iM2569 ^ i20) * 22995) ^ (-1362939987);
                        i16 = -146447539;
                        i22 = iM2569 ^ i16;
                        C12951 c129511113 = c12953;
                        c12952 = c12951;
                        c12953 = c129511113;
                    }
                    break;
                case 377098713:
                case 2077523063:
                    C12951 c129533 = c12952;
                    this.f45560 = C7106.m19108(c12953);
                    c12953 = c12953;
                    c12951 = c129533;
                    iM6984 = (C0630.m2566("۫ۚ") ^ i20) * (-75);
                    i14 = ((iM6984 ^ i19) * 30963) ^ 1057271676;
                    i15 = -882931687;
                    i22 = iM6984 ^ i15;
                    i21 = i14;
                    C12951 c129511114 = c12953;
                    c12952 = c12951;
                    c12953 = c129511114;
                    break;
                case 379231191:
                case 1813754386:
                    c182510 = c182510;
                    z4 = z4;
                    c15548 = c15548;
                    C12951 c129534 = c12952;
                    c12953 = c12953;
                    c12951 = c129534;
                    c12392.m30494();
                    m10236(this.f45556);
                    strM9031 = strM9031;
                    str = str;
                    z3 = z3;
                    C15545 c155410 = new C15545(this, this.f45556, C0714.m2816(f45554, 126, 4, i23), new C9197(this));
                    this.f45562 = c155410;
                    if (C1128.f4106 <= 0) {
                        c15549 = c155410;
                        iM2568 = C2105.m6981("ܿ֨") ^ i20;
                        i21 = ((iM2568 ^ i19) * 4519) ^ 1416770523;
                        i6 = 562837947;
                        i11 = iM2568 ^ i6;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c15548 = c15548;
                    } else {
                        int iM25615 = C0630.m2566("ۚۘ") ^ i19;
                        c15549 = c155410;
                        c182510 = c182510;
                        str = str;
                        z3 = z3;
                        i22 = iM25615 ^ (-782441314);
                        i21 = ((iM25615 ^ i20) * 6569) ^ 1066698336;
                        strM9031 = strM9031;
                        c15548 = c15548;
                    }
                    z4 = z4;
                    C12951 c129511115 = c12953;
                    c12952 = c12951;
                    c12953 = c129511115;
                    break;
                case 493225337:
                case 893082482:
                    c12953 = c12953;
                    C12951 c12951M31486 = C12951.m31485(bArr);
                    boolean zM12816 = C4263.m12815(c12951M31486);
                    this.f45565 = zM12816;
                    if (!zM12816) {
                        c12951 = c12951M31486;
                        iM6984 = (i19 - C2105.m6981("ۙۧ")) * 45;
                        i14 = ((iM6984 ^ i20) * 8107) ^ 1232061456;
                        i15 = 1652744928;
                        i22 = iM6984 ^ i15;
                        i21 = i14;
                        C12951 c129511116 = c12953;
                        c12952 = c12951;
                        c12953 = c129511116;
                    } else {
                        iM2569 = (i20 - C0630.m2566("ۡ֨")) * (-103);
                        c12951 = c12951M31486;
                        i21 = ((iM2569 ^ i19) * (-4907)) ^ (-1974266753);
                        i16 = -655734724;
                        i22 = iM2569 ^ i16;
                        C12951 c129511117 = c12953;
                        c12952 = c12951;
                        c12953 = c129511117;
                    }
                    break;
                case 696428724:
                case 2017374784:
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    C12951 c129535 = c12952;
                    c12953 = c12953;
                    c12951 = c129535;
                    textViewM34924 = textViewM34924;
                    textViewM34924.setTextSize(18.0f);
                    C12392 c12394 = (C12392) C0964.m3409(this, C0630.m2566(C0050.m948(f45554, 123, 3, i23)) ^ 2125287322);
                    this.f45556 = c12394;
                    if (C0422.f1886 > 0) {
                        int iM25616 = (i20 - C0630.m2566("ۢۖ")) * 75;
                        i3 = ((iM25616 ^ i19) * (-16489)) ^ 1860346147;
                        i7 = iM25616 ^ 1372995722;
                        c12392 = c12394;
                        textViewM34924 = textViewM34924;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        z3 = z3;
                        i22 = i7;
                        i21 = i3;
                        c15548 = c15548;
                        str = str;
                        z4 = z4;
                        C12951 c129511118 = c12953;
                        c12952 = c12951;
                        c12953 = c129511118;
                    } else {
                        c12392 = c12394;
                        iM2567 = (C2105.m6981("۫ᩳ") + i19) * 9;
                        i21 = ((iM2567 ^ i20) * 3513) ^ (-1136830147);
                        i5 = -862200370;
                        i11 = iM2567 ^ i5;
                        textViewM34924 = textViewM34924;
                        c182510 = c182510;
                        strM9031 = strM9031;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c15548 = c15548;
                        z4 = z4;
                        C12951 c129511119 = c12953;
                        c12952 = c12951;
                        c12953 = c129511119;
                    }
                    break;
                case 716741320:
                case 1262260120:
                    this.f45560 = C7106.m19108(c12952);
                    C12951 c129536 = c12952;
                    c12953 = c12953;
                    c12951 = c129536;
                    iM6984 = (i19 - C2105.m6981("ۙۧ")) * 45;
                    i14 = ((iM6984 ^ i20) * 8107) ^ 1232061456;
                    i15 = 1652744928;
                    i22 = iM6984 ^ i15;
                    i21 = i14;
                    C12951 c1295111110 = c12953;
                    c12952 = c12951;
                    c12953 = c1295111110;
                    break;
                case 935519015:
                case 1471182913:
                    C3663.m11161(C0630.m2566(ServiceConnectionC3453.m10568(f45554, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 3, i23)) ^ 2098509582);
                    super.finish();
                    break;
                case 1071765828:
                case 1858625867:
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    iM6987 = iM6987;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    textViewM34924 = textViewM34924;
                    C12951 c129537 = c12952;
                    c12953 = c12953;
                    c12951 = c129537;
                    C0964.m3409(this, iM6987);
                    C9762 c9762 = (C9762) C4263.m12813(this, C2105.m6981(C0630.m2575(f45554, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i23)) ^ 2126143562);
                    this.f10584 = c9762;
                    C2272.m7515(this, c9762);
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = (i20 - C0630.m2566("ܺ۫")) * 17;
                        i3 = ((iM2566 ^ i19) * 3495) ^ (-283401538);
                        i4 = 1411486444;
                    } else {
                        iM2566 = C0630.m2566("ܿܽ") ^ i19;
                        i3 = ((iM2566 ^ i20) * 10409) ^ 202501094;
                        i4 = -1568326938;
                    }
                    i7 = iM2566 ^ i4;
                    iM6987 = iM6987;
                    textViewM34924 = textViewM34924;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c15548 = c15548;
                    str = str;
                    z4 = z4;
                    C12951 c1295111111 = c12953;
                    c12952 = c12951;
                    c12953 = c1295111111;
                    break;
                case 1193758652:
                case 1885662332:
                    C11340.m28031();
                    str = str;
                    c182510 = c182510;
                    z3 = z3;
                    z4 = z4;
                    c15548 = c15548;
                    strM9031 = strM9031;
                    C12951 c1295211 = c12952;
                    c12953 = c12953;
                    c12951 = c1295211;
                    iM2568 = C2105.m6981("ܿ֨") ^ i20;
                    i21 = ((iM2568 ^ i19) * 4519) ^ 1416770523;
                    i6 = 562837947;
                    i11 = iM2568 ^ i6;
                    c182510 = c182510;
                    strM9031 = strM9031;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c15548 = c15548;
                    z4 = z4;
                    C12951 c1295111112 = c12953;
                    c12952 = c12951;
                    c12953 = c1295111112;
                    break;
                case 1612239446:
                case 2019374216:
                    C12951 c129538 = c12952;
                    c12953 = c12953;
                    c12951 = c129538;
                    if (intExtra != 2) {
                        iM6984 = (C2105.m6981("֫֡") ^ i20) * (-75);
                        i14 = ((iM6984 ^ i19) * 9857) ^ 1508652317;
                        i15 = -1811577223;
                    } else {
                        iM6984 = (i19 - C2105.m6981("ۤۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i14 = ((iM6984 ^ i20) * 23611) ^ (-148532635);
                        i15 = 790576961;
                    }
                    i22 = iM6984 ^ i15;
                    i21 = i14;
                    C12951 c1295111113 = c12953;
                    c12952 = c12951;
                    c12953 = c1295111113;
                    break;
                case 1883440296:
                case 1943470509:
                    this.f45556.mo25896(c12953);
                    break;
                default:
                    c18258 = c182510;
                    z = z4;
                    C12951 c129539 = c12952;
                    c12953 = c12953;
                    c12951 = c129539;
                    sArr = sArr2;
                    strM10628 = RunnableC3474.m10628(intentM12571, C3683.m11225(sArr, 171, 5, i23));
                    String strM10629 = RunnableC3474.m10628(intentM12571, C2126.m7036(f45554, PicnicEngine.MAX_AUX_BYTES, 14, i23));
                    setTitle(strM10628);
                    C15545 c155411 = this.f45562;
                    str2 = C0964.m3403(strM10629) ? strM10628 : strM10629;
                    iM6985 = C0630.m2566("֡۟") ^ i19;
                    c15545 = c155411;
                    i21 = ((iM6985 ^ i20) * (-2625)) ^ (-199352825);
                    i17 = 1833737870;
                    int i214 = iM6985 ^ i17;
                    sArr2 = sArr;
                    c15548 = c15545;
                    c182510 = c18258;
                    i22 = i214;
                    z4 = z;
                    bundle = bundle;
                    C12951 c1295111114 = c12953;
                    c12952 = c12951;
                    c12953 = c1295111114;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01bb A[PHI: r10
      0x01bb: PHI (r10v4 short) = (r10v3 short), (r10v2 short), (r10v2 short), (r10v2 short) binds: [B:48:0x01b9, B:14:0x0079, B:10:0x0059, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0245 A[PHI: r2 r3 r6 r9 r12 r13 r14 r19
      0x0245: PHI (r2v4 l.۬ۤۡ) = (r2v2 l.۬ۤۡ), (r2v2 l.۬ۤۡ), (r2v2 l.۬ۤۡ), (r2v3 l.۬ۤۡ), (r2v2 l.۬ۤۡ) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r12v3 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v4 short[]) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r14v3 int) = (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v4 int) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0243, B:60:0x0228, B:52:0x01ed, B:33:0x010f, B:25:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0273 A[PHI: r4 r7 r8
      0x0273: PHI (r4v4 byte) = (r4v2 byte), (r4v2 byte), (r4v3 byte), (r4v2 byte), (r4v2 byte) binds: [B:68:0x0271, B:56:0x020b, B:29:0x00eb, B:21:0x00ab, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:68:0x0271, B:56:0x020b, B:29:0x00eb, B:21:0x00ab, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0273: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:68:0x0271, B:56:0x020b, B:29:0x00eb, B:21:0x00ab, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35403(ActivityC14946 activityC14946, DialogInterfaceC0206 dialogInterfaceC0206) {
        int iM2566;
        int i;
        int i2;
        int i3 = C3019.f9544;
        int i4 = C11340.f33930;
        int iM6981 = C2105.m6981("᩵۠") ^ i4;
        int i5 = ((iM6981 ^ i3) * 27209) ^ (-1825800336);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 1359170599;
        InterfaceC13049 interfaceC13049M4377 = null;
        int i7 = 0;
        byte b = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i8 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 872598707;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 18169) >> 31));
            switch (i12) {
                case -2060824560:
                case -470731553:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("ۛ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM2566 = C0630.m2566("᩶֡") ^ i4;
                        i = ((iM2566 ^ i3) * 25581) ^ (-1293746683);
                        i2 = -35980366;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1967610242:
                case 1326179558:
                    c = 'Z';
                    if (C1504.f5354) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM2566 = C2105.m6981("ۧܽ") ^ i3;
                        i = ((iM2566 ^ i4) * (-5557)) ^ (-2034114711);
                        i2 = -2055413531;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1896276101:
                case 703849829:
                    sArr = f45554;
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM2566 = (C2105.m6981("ܶܶ") + i3) * (-59);
                        i = ((iM2566 ^ i4) * (-5941)) ^ 1612922588;
                        i2 = 1956373398;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1824575032:
                case -490038519:
                    sArr2 = f45554;
                    i10 = 91;
                    i11 = 20;
                    if (C5695.f17556 >= 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM2566 = C0630.m2566("᩻۫") ^ i3;
                        i = ((iM2566 ^ i4) * (-24721)) ^ (-1246269131);
                        i2 = 1245401412;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1732901554:
                case 1075310071:
                    break;
                case -1731072289:
                case 352555407:
                    b = (byte) i7;
                    if (C3683.m11222()) {
                        iM2566 = C0630.m2566("ۛ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM2566 = C2105.m6981("ᩴۗ") ^ i4;
                        i = ((iM2566 ^ i3) * 14515) ^ 1797017116;
                        i2 = 1192635415;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1483087004:
                case 597137781:
                    C1916.m6302(interfaceC13049M4377.mo25852(b, C1420.m4902(sArr2, i10, i11, i9)));
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ۛ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM2566 = C2105.m6981("ۜ۟") ^ i4;
                        i = ((iM2566 ^ i3) * 21511) ^ 469362983;
                        i2 = -773859878;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1048975923:
                case -879822627:
                    C4075.m12263();
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("᩶֫") ^ i4;
                        i = ((iM2566 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    } else {
                        iM2566 = (C0630.m2566("ۤۚ") ^ i3) * (-103);
                        i = ((iM2566 ^ i4) * (-5033)) ^ (-503259696);
                        i2 = 1739965321;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -947970295:
                case 61035679:
                    C1047.m3599();
                    break;
                case -680793416:
                case 653789456:
                    if (i8 - (s * s3) >= 0) {
                        iM2566 = C2105.m6981("᩵᩹") ^ i4;
                        i = ((iM2566 ^ i3) * (-14265)) ^ (-2039219241);
                        i2 = -1092449628;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۙ") + i3) * (-37);
                        i = ((iM2566 ^ i4) * 20705) ^ 915990379;
                        i2 = 1893234281;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -671616472:
                case 979686814:
                    i9 = 47693;
                    iM2566 = (i4 - C0630.m2566("۬ۜ")) * 57;
                    i = ((iM2566 ^ i3) * 30937) ^ (-1758444259);
                    i2 = 437837298;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -591487856:
                case 1597811770:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("᩶֫") ^ i4;
                        i = ((iM2566 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    } else {
                        iM2566 = C0630.m2566("ۛ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -475751194:
                case -94598232:
                    int i13 = s + s2;
                    i8 = i13 * i13;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM2566 = C0630.m2566("ۙۛ") ^ i3;
                        i = ((iM2566 ^ i4) * (-28569)) ^ 1397491195;
                        i2 = -394069892;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -278436813:
                case 1791746876:
                    i9 = 18344;
                    iM2566 = (i4 - C0630.m2566("۬ۜ")) * 57;
                    i = ((iM2566 ^ i3) * 30937) ^ (-1758444259);
                    i2 = 437837298;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -101021538:
                case 329248152:
                    C0050.m940();
                    if (C1711.f5919) {
                        iM2566 = (C2105.m6981("۠֫") ^ i3) * (-111);
                        i = ((iM2566 ^ i4) * 30455) ^ (-948292895);
                        i2 = 913640614;
                    } else {
                        iM2566 = C2105.m6981("᩶֫") ^ i4;
                        i = ((iM2566 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 86223534:
                case 1978400151:
                    s3 = 70624;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("᩶֫") ^ i4;
                        i = ((iM2566 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    } else {
                        iM2566 = C2105.m6981("ۜۡ") ^ i4;
                        i = ((iM2566 ^ i3) * 31629) ^ 1119506333;
                        i2 = 54597121;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 99952997:
                case 1262674283:
                    activityC14946.setResult(2);
                    super.finish();
                    break;
                case 125601215:
                case 657044382:
                    C3663.m11167(dialogInterfaceC0206);
                    if (activityC14946.f45560 == activityC14946.f45564) {
                        iM2566 = (C2105.m6981("᩹֡") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i3) * 2661) ^ 89134757;
                        i2 = 508940779;
                    } else {
                        iM2566 = C2105.m6981("ܰ۟") ^ i3;
                        i = ((iM2566 ^ i4) * 23557) ^ 715053777;
                        i2 = -553289654;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 838800756:
                case 1759360035:
                    s = sArr[c];
                    s2 = 17656;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("ۛ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM2566 = C0630.m2566("ۢ۠") ^ i4;
                        i = ((iM2566 ^ i3) * (-16581)) ^ (-1022616440);
                        i2 = 932079588;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 849613845:
                case 921354795:
                    interfaceC13049M4377 = C1294.m4377(ApplicationC20075.f65008);
                    i7 = activityC14946.f45564;
                    if (C0630.f2410 <= 0) {
                        iM2566 = C0630.m2566("᩺ᩴ") ^ i3;
                        i = ((iM2566 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM2566 = C2105.m6981("᩻ۧ") ^ i3;
                        i = ((iM2566 ^ i4) * (-12957)) ^ (-2014257072);
                        i2 = -123657293;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2126.m7040();
                    iM2566 = (C0630.m2566("ۤۚ") ^ i3) * (-103);
                    i = ((iM2566 ^ i4) * (-5033)) ^ (-503259696);
                    i2 = 1739965321;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x038e A[PHI: r1 r3 r16 r17 r18
      0x038e: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v1 java.lang.String), (r1v1 java.lang.String), (r1v1 java.lang.String) binds: [B:111:0x038e, B:76:0x038c, B:72:0x0363, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r3v3 short) = (r3v1 short), (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:111:0x038e, B:76:0x038c, B:72:0x0363, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r16v34 int) = (r16v2 int), (r16v13 int), (r16v14 int), (r16v39 int) binds: [B:111:0x038e, B:76:0x038c, B:72:0x0363, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r17v31 short[]) = (r17v4 short[]), (r17v15 short[]), (r17v16 short[]), (r17v36 short[]) binds: [B:111:0x038e, B:76:0x038c, B:72:0x0363, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x038e: PHI (r18v29 android.content.Intent) = 
      (r18v3 android.content.Intent)
      (r18v15 android.content.Intent)
      (r18v16 android.content.Intent)
      (r18v34 android.content.Intent)
     binds: [B:111:0x038e, B:76:0x038c, B:72:0x0363, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x03f1 A[PHI: r16 r17 r18
      0x03f1: PHI (r16v36 int) = (r16v11 int), (r16v12 int), (r16v37 int) binds: [B:84:0x03ef, B:80:0x03c6, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r17v33 short[]) = (r17v13 short[]), (r17v14 short[]), (r17v34 short[]) binds: [B:84:0x03ef, B:80:0x03c6, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x03f1: PHI (r18v31 android.content.Intent) = (r18v13 android.content.Intent), (r18v14 android.content.Intent), (r2v1 android.content.Intent) binds: [B:84:0x03ef, B:80:0x03c6, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (l.C7811.f24123 >= 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m35399(AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3, String str4) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        int i7;
        int iM2568;
        int i8;
        int i9;
        int iM2569;
        int i10;
        int i11;
        AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
        String strM11919 = null;
        Intent intent = null;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr = null;
        int i15 = 0;
        short[] sArr2 = null;
        int i16 = -1477588506;
        int i17 = C2167.f7158;
        int i18 = C3911.f12484;
        int iM25610 = (C0630.m2566("ᩴܿ") + i17) * 63;
        int i19 = ((iM25610 ^ i18) * (-30413)) ^ (-667990718);
        int i20 = iM25610 ^ (-1749952935);
        while (true) {
            i16 = ((((i16 ^ i18) * (-14131)) >> 31) & i19) ^ i20;
            switch (i16) {
                case -2137746974:
                case 1484198753:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    int i21 = s + 14430;
                    i12 = i21 * i21;
                    i13 = s * s;
                    if (C5695.m16023() < 0) {
                        iM6981 = C2105.m6981("ۨ۟") ^ i17;
                        i3 = ((iM6981 ^ i18) * (-11901)) ^ (-1316926898);
                        i4 = 1906177908;
                        i20 = iM6981 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC3347 = abstractActivityC3346;
                    } else {
                        intent = intent;
                        int iM25611 = (i17 - C0630.m2566("᩶ۡ")) * (-115);
                        i19 = ((iM25611 ^ i18) * 31169) ^ 985421825;
                        i20 = iM25611 ^ 849459146;
                        i16 = i16;
                        sArr2 = sArr2;
                        abstractActivityC3347 = abstractActivityC3346;
                    }
                    break;
                case -1943091273:
                case 1549108785:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("ۤ֫") ^ i18;
                        i3 = ((iM6981 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                    } else {
                        iM6981 = C0630.m2566("۠ᩳ") ^ i18;
                        i3 = ((iM6981 ^ i17) * (-30977)) ^ 393995421;
                        i4 = 1417193779;
                    }
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -1908351276:
                case 189191900:
                    C1047.m3599();
                    break;
                case -1840086179:
                case -917488995:
                    C4075.m12261(abstractActivityC3347, intent);
                    break;
                case -1820718844:
                case 1235833729:
                    i7 = i16;
                    if (C0964.m3403(str4)) {
                        iM2568 = C0630.m2566("ۤᩳ") ^ i18;
                        i8 = ((iM2568 ^ i17) * 18867) ^ 963368148;
                        i9 = 1328320300;
                    } else {
                        iM2568 = C0630.m2566("ۚۗ") ^ i18;
                        i8 = ((iM2568 ^ i17) * 16905) ^ (-376916223);
                        i9 = 449519289;
                    }
                    i20 = iM2568 ^ i9;
                    i19 = i8;
                    i16 = i7;
                    break;
                case -1681570045:
                case -491476451:
                    C0382.m1848();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM2566 = (i18 - C2105.m6981("ۢ᩸")) * 61;
                        i = ((iM2566 ^ i17) * 8749) ^ 111485674;
                        i2 = 1944222462;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                    } else {
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM6981 = (C0630.m2566("۟᩹") + i17) * (-127);
                        i3 = ((iM6981 ^ i18) * 11619) ^ (-1102342665);
                        i4 = -1546029708;
                        i20 = iM6981 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC3347 = abstractActivityC3346;
                    }
                    break;
                case -1463048283:
                case 1346840487:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    int i22 = 208224900 + i13;
                    if ((i22 + i22) - i12 >= 0) {
                        iM2566 = (C2105.m6981("ܰ֫") ^ i18) * (-49);
                        i = ((iM2566 ^ i17) * (-4909)) ^ 1942817208;
                        i2 = 314041700;
                    } else {
                        iM2566 = (C2105.m6981("ۛۤ") + i17) * (-23);
                        i = ((iM2566 ^ i18) * (-5227)) ^ 184791998;
                        i2 = 748601279;
                    }
                    i20 = iM2566 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -1446029002:
                case -768754154:
                    if (abstractActivityC3347 instanceof Main) {
                        iM2569 = C0630.m2566("ۨۛ") ^ i18;
                        i10 = ((iM2569 ^ i17) * 20997) ^ 401742085;
                        i11 = -769682995;
                    } else {
                        iM2569 = C0630.m2566("ۢ֨") ^ i17;
                        i10 = ((iM2569 ^ i18) * (-32121)) ^ 301212979;
                        i11 = 1258607741;
                    }
                    i20 = iM2569 ^ i11;
                    i19 = i10;
                    break;
                case -1421457258:
                case 1879349245:
                    C7811.m20844();
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    iM6981 = (C0630.m2566("۟᩹") + i17) * (-127);
                    i3 = ((iM6981 ^ i18) * 11619) ^ (-1102342665);
                    i4 = -1546029708;
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -1312429009:
                case -314496513:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C2105.m6981("ۡۧ") + i17) * (-101);
                        i3 = ((iM6981 ^ i18) * (-5375)) ^ (-926778865);
                        i4 = -616129273;
                    } else {
                        iM6981 = (C2105.m6981("ۖۧ") + i17) * (-17);
                        i3 = ((iM6981 ^ i18) * (-12567)) ^ (-398028822);
                        i4 = 488435246;
                    }
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -1298440011:
                case -1216176568:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    s = f45554[0];
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("ۤ֫") ^ i18;
                        i3 = ((iM6981 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                    } else {
                        iM6981 = (C2105.m6981("֨֫") + i18) * (-83);
                        i3 = ((iM6981 ^ i17) * (-6475)) ^ 1183875765;
                        i4 = 2087248985;
                    }
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -1074637344:
                case 626976044:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C2105.m6981("ۡۧ") + i17) * (-101);
                        i3 = ((iM6981 ^ i18) * (-5375)) ^ (-926778865);
                        i4 = -616129273;
                    } else {
                        iM6981 = C0630.m2566("᩹ۤ") ^ i18;
                        i3 = ((iM6981 ^ i17) * (-8129)) ^ (-2026759784);
                        i4 = 195114081;
                    }
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -1069040615:
                case 1389894400:
                    i16 = i16;
                    C1504.m5168(intent, RunnableC0588.m2436(f45554, 26, 11, i14), str3);
                    sArr2 = sArr2;
                    iM2567 = (C2105.m6981("ܽۤ") ^ i17) * (-5);
                    i5 = ((iM2567 ^ i18) * 31263) ^ (-79735241);
                    i6 = 1379266079;
                    i20 = iM2567 ^ i6;
                    i19 = i5;
                    i16 = i16;
                    sArr2 = sArr2;
                    break;
                case -941827716:
                case 420898825:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    C2956.m9014(RunnableC3474.m10618(abstractActivityC3346), str, strM11919);
                    if (C4159.f13567) {
                        iM2566 = (i17 - C2105.m6981("᩷ܰ")) * (-53);
                        i = ((iM2566 ^ i18) * 22827) ^ 1175257806;
                        i2 = 480565848;
                    } else {
                        iM2566 = (i18 - C2105.m6981("ۢ᩸")) * 61;
                        i = ((iM2566 ^ i17) * 8749) ^ 111485674;
                        i2 = 1944222462;
                    }
                    i20 = iM2566 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -657587618:
                case 1832069365:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM6981 = C0630.m2566("ۤ֫") ^ i18;
                        i3 = ((iM6981 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                        i20 = iM6981 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC3347 = abstractActivityC3346;
                    }
                    sArr2 = sArr2;
                    i16 = i16;
                    iM6981 = (C2105.m6981("ۡۧ") + i17) * (-101);
                    i3 = ((iM6981 ^ i18) * (-5375)) ^ (-926778865);
                    i4 = -616129273;
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -590336618:
                case -349827438:
                    i14 = 3170;
                    iM2566 = (C2105.m6981("ۤۜ") + i17) * 45;
                    i = ((iM2566 ^ i18) * 17757) ^ 356015753;
                    i2 = 833508858;
                    i20 = iM2566 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -581540950:
                case 391308045:
                    break;
                case -357973354:
                case 2095140026:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C22628.f73083 <= 0) {
                        iM6981 = (C0630.m2566("۟᩹") + i17) * (-127);
                        i3 = ((iM6981 ^ i18) * 11619) ^ (-1102342665);
                        i4 = -1546029708;
                    } else {
                        iM6981 = (i17 - C2105.m6981("᩵ۛ")) * (-113);
                        i3 = ((iM6981 ^ i18) * 19371) ^ (-389305237);
                        i4 = -1379179264;
                    }
                    i20 = iM6981 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC3347 = abstractActivityC3346;
                    break;
                case -355165892:
                case 1438322072:
                    i14 = 8327;
                    iM2566 = (C2105.m6981("ۤۜ") + i17) * 45;
                    i = ((iM2566 ^ i18) * 17757) ^ 356015753;
                    i2 = 833508858;
                    i20 = iM2566 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -64429167:
                case 287752686:
                    C1504.m5168(intent, RunnableC1108.m3789(f45554, 37, 14, i14), str4);
                    i7 = i16;
                    iM2568 = C0630.m2566("ۤᩳ") ^ i18;
                    i8 = ((iM2568 ^ i17) * 18867) ^ 963368148;
                    i9 = 1328320300;
                    i20 = iM2568 ^ i9;
                    i19 = i8;
                    i16 = i7;
                    break;
                case -12045314:
                case 1126884247:
                    i16 = i16;
                    intent.putExtra(C1047.m3603(sArr, i15, 6, i14), 0);
                    sArr2 = f45554;
                    if (C3537.f11231 < 0) {
                        int iM6982 = C2105.m6981("ۨ᩵") ^ i18;
                        intent = intent;
                        i19 = ((iM6982 ^ i17) * 20897) ^ 1050783485;
                        i20 = iM6982 ^ (-1640792352);
                        i16 = i16;
                        intent = intent;
                    } else {
                        sArr2 = sArr2;
                        iM6981 = (C2105.m6981("ۡۧ") + i17) * (-101);
                        i3 = ((iM6981 ^ i18) * (-5375)) ^ (-926778865);
                        i4 = -616129273;
                        i20 = iM6981 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC3347 = abstractActivityC3346;
                    }
                    break;
                case 493127831:
                case 2113790151:
                    sArr2 = sArr2;
                    i16 = i16;
                    intent = new Intent(abstractActivityC3347, (Class<?>) ActivityC14946.class);
                    sArr = f45554;
                    i15 = 15;
                    if (C1128.f4106 > 0) {
                        iM2567 = (C0630.m2566("ܽ۬") ^ i18) * 33;
                        i5 = ((iM2567 ^ i17) * (-21787)) ^ 1931128901;
                        i6 = 1007935332;
                        i20 = iM2567 ^ i6;
                        i19 = i5;
                        i16 = i16;
                        sArr2 = sArr2;
                    } else {
                        int iM25612 = (i17 - C0630.m2566("᩶ۡ")) * (-115);
                        i19 = ((iM25612 ^ i18) * 31169) ^ 985421825;
                        i20 = iM25612 ^ 849459146;
                        i16 = i16;
                        sArr2 = sArr2;
                        abstractActivityC3347 = abstractActivityC3346;
                    }
                    break;
                case 884287995:
                case 2026940536:
                    i16 = i16;
                    C1504.m5168(intent, ServiceConnectionC3453.m10568(sArr2, 21, 5, i14), str2);
                    if (C4263.m12824(str3)) {
                        sArr2 = sArr2;
                        iM2567 = (C2105.m6981("ܽۤ") ^ i17) * (-5);
                        i5 = ((iM2567 ^ i18) * 31263) ^ (-79735241);
                        i6 = 1379266079;
                        i20 = iM2567 ^ i6;
                        i19 = i5;
                    } else {
                        int iM25613 = C0630.m2566("۬᩺") ^ i17;
                        sArr2 = sArr2;
                        i19 = ((iM25613 ^ i18) * (-7629)) ^ (-487612354);
                        i20 = iM25613 ^ 420593969;
                    }
                    i16 = i16;
                    sArr2 = sArr2;
                    break;
                case 888957739:
                case 2107286510:
                    intent.putExtra(C4263.m12817(f45554, 51, 13, i14), true);
                    iM2569 = C0630.m2566("ۢ֨") ^ i17;
                    i10 = ((iM2569 ^ i18) * (-32121)) ^ 301212979;
                    i11 = 1258607741;
                    i20 = iM2569 ^ i11;
                    i19 = i10;
                    break;
                default:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    strM11919 = C3911.m11919(f45554, 1, 14, i14);
                    if (!C0798.f2919) {
                        iM2566 = (i18 - C0630.m2566("᩻ۚ")) * (-107);
                        i = ((iM2566 ^ i17) * 19169) ^ 314197085;
                        i2 = -1719704057;
                        i20 = iM2566 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                    } else {
                        iM6981 = C0630.m2566("ۤ֫") ^ i18;
                        i3 = ((iM6981 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                        i20 = iM6981 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC3347 = abstractActivityC3346;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int iM6982;
        int i4;
        ActivityC14946 activityC14946 = this;
        int i5 = C0630.f2410;
        int i6 = C4263.f13799;
        int iM6983 = (i5 - C2105.m6981("֨ۤ")) * (-121);
        int i7 = ((iM6983 ^ i6) * (-19265)) ^ (-1683356217);
        C15545 c15545 = null;
        String strM6311 = null;
        String strM948 = null;
        short[] sArr = null;
        int i8 = iM6983 ^ 1606619725;
        boolean z = false;
        int iM2567 = 0;
        int iM2568 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        int i16 = 0;
        int i17 = 1459908915;
        MenuInflater menuInflater = null;
        short[] sArr2 = null;
        int iM6984 = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i6) * 6747) >> 31));
            switch (i17) {
                case -2126974730:
                case -2000115802:
                    menuInflater = getMenuInflater();
                    strM6311 = C1916.m6311(f45554, 357, 3, i10);
                    if (C1420.f5096 <= 0) {
                        iM6982 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((iM6982 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                    } else {
                        iM6982 = (i6 - C2105.m6981("ۧۧ")) * (-37);
                        i7 = ((iM6982 ^ i5) * (-401)) ^ (-61979246);
                        i4 = 1944294517;
                    }
                    i8 = iM6982 ^ i4;
                    activityC14946 = this;
                    break;
                case -1959759605:
                case 1806171022:
                    if (!C1504.f5354) {
                        iM6981 = C2105.m6981("᩷ۜ") ^ i5;
                        i = ((iM6981 ^ i6) * 1787) ^ (-140916145);
                        i2 = 48568649;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((iM2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -1824050490:
                case -1453038258:
                    RunnableC1108.m3790();
                    if (!C2126.f7087) {
                        iM6981 = C0630.m2566("ۙ۬") ^ i6;
                        i = ((iM6981 ^ i5) * (-19497)) ^ (-1008715106);
                        i2 = -1083407600;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM6982 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((iM6982 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = iM6982 ^ i4;
                        activityC14946 = this;
                    }
                    break;
                case -1684759930:
                case 924453281:
                    C0422.m1953(C1916.m6301(menu, 2128509350 ^ iM6984), z);
                    menuInflater = menuInflater;
                    iM2566 = (C0630.m2566("ۢ᩵") + i5) * 59;
                    i7 = ((iM2566 ^ i6) * 30975) ^ (-126604038);
                    i3 = 361871988;
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
                case -1629964195:
                case -765575639:
                    menuInflater = menuInflater;
                    short s2 = sArr2[c];
                    int i18 = s2 + 7771;
                    if (!C0630.m2564()) {
                        int iM6985 = (i6 - C2105.m6981("ۙᩴ")) * (-111);
                        int i19 = ((iM6985 ^ i5) * (-377)) ^ (-1814650683);
                        i8 = iM6985 ^ 732054660;
                        menuInflater = menuInflater;
                        s = s2;
                        i16 = i18;
                        i7 = i19;
                        activityC14946 = this;
                    } else {
                        s = s2;
                        i16 = i18;
                        iM2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((iM2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -1352885093:
                case 1194649628:
                    c15545.m36675(C1916.m6301(menu, 2128319687 ^ iM2567));
                    return true;
                case -1077174467:
                case -140881323:
                    C3683.m11222();
                    C0714.m2805();
                    menuInflater = menuInflater;
                    iM2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                    i7 = ((iM2566 ^ i6) * (-17371)) ^ 1755476767;
                    i3 = 1393730309;
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
                case -1074896453:
                case 511175556:
                    i10 = 11550;
                    iM2566 = C0630.m2566("᩸ۧ") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-13263)) ^ 1971023457;
                    i3 = -1251482959;
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
                case -1016279923:
                case -117410273:
                    iM2568 = C0630.m2566(strM948);
                    i9 = 2122066124;
                    if (C1916.m6308() >= 0) {
                        iM6981 = C2105.m6981("᩷ۜ") ^ i5;
                        i = ((iM6981 ^ i6) * 1787) ^ (-140916145);
                        i2 = 48568649;
                    } else {
                        iM6981 = C0630.m2566("۠ᩴ") ^ i5;
                        i = ((iM6981 ^ i6) * (-391)) ^ (-236707178);
                        i2 = 415191742;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -969970165:
                case 20924381:
                    menuInflater = menuInflater;
                    int i20 = i14 + i15;
                    if (i13 - (i20 + i20) > 0) {
                        iM2566 = (i5 - C2105.m6981("ۡ᩸")) * 13;
                        i7 = ((iM2566 ^ i6) * 21063) ^ 1952150789;
                        i3 = -606745600;
                    } else {
                        iM2566 = (C0630.m2566("ܽܰ") + i5) * 59;
                        i7 = ((iM2566 ^ i6) * (-18241)) ^ 1421119786;
                        i3 = -125079673;
                    }
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
                case -890029012:
                case 1482083658:
                    C0483.m2121();
                    if (!C1916.f6442) {
                        iM6982 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((iM6982 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = iM6982 ^ i4;
                        activityC14946 = this;
                    } else {
                        menuInflater = menuInflater;
                        iM2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((iM2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -738549203:
                case 303325631:
                    strM948 = C0050.m948(f45554, 363, 3, i10);
                    if (C3683.f11629 < 0) {
                        iM6981 = C2105.m6981("ܰ۠") ^ i6;
                        i = ((iM6981 ^ i5) * (-25577)) ^ (-2091369888);
                        i2 = -147849195;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((iM2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -731106472:
                case -210775881:
                    c15545 = activityC14946.f45562;
                    sArr = f45554;
                    i11 = 360;
                    i12 = 3;
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۙ۬") ^ i6;
                        i = ((iM6981 ^ i5) * (-19497)) ^ (-1008715106);
                        i2 = -1083407600;
                    } else {
                        iM6981 = C2105.m6981("᩵ᩳ") ^ i6;
                        i = ((iM6981 ^ i5) * (-30713)) ^ 1424961450;
                        i2 = 2125052135;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -565850517:
                case 1257693009:
                    iM2567 = C0630.m2566(C2167.m7159(sArr, i11, i12, i10));
                    if (C21923.f70183 == 0) {
                        iM6981 = (C2105.m6981("ܿ᩶") + i5) * (-17);
                        i = ((iM6981 ^ i6) * (-10445)) ^ 1123059078;
                        i2 = -1122269233;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM2566 = C0630.m2566("۠۠") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -402580317:
                case 304112954:
                    C3245.m9925();
                    return false;
                case 64434519:
                case 1896850656:
                    iM6984 = C2105.m6981(C2958.m9031(f45554, 366, 3, i10));
                    if (C2105.m6982() == 0) {
                        iM6981 = (i6 - C2105.m6981("ܶۧ")) * 33;
                        i = ((iM6981 ^ i5) * 1875) ^ 539078628;
                        i2 = -1999007690;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        iM6982 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((iM6982 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = iM6982 ^ i4;
                        activityC14946 = this;
                    }
                    break;
                case 129030878:
                case 2104891403:
                    menuInflater = menuInflater;
                    sArr2 = f45554;
                    c = 356;
                    if (C4263.m12819() >= 0) {
                        iM2566 = C0630.m2566("۠۠") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                    } else {
                        iM2566 = C2105.m6981("۬᩻") ^ i5;
                        i7 = ((iM2566 ^ i6) * 15863) ^ 60624355;
                        i3 = -1997660064;
                    }
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
                case 489582061:
                case 695141949:
                    menuInflater = menuInflater;
                    menuInflater.inflate(C0630.m2566(strM6311) ^ 2118458552, menu);
                    if (!activityC14946.f45565) {
                        int iM2569 = C0630.m2566("ۗۨ") ^ i5;
                        i8 = iM2569 ^ (-1991600230);
                        i7 = ((iM2569 ^ i6) * 1247) ^ (-1846433517);
                        menuInflater = menuInflater;
                        activityC14946 = this;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩵") + i5) * 59;
                        i7 = ((iM2566 ^ i6) * 30975) ^ (-126604038);
                        i3 = 361871988;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case 648057808:
                case 1108300396:
                    z = false;
                    C0050.m943(C1916.m6301(menu, iM2568 ^ i9), false);
                    if (C0630.f2410 > 0) {
                        iM6981 = (C0630.m2566("ۖ۬") ^ i6) * (-93);
                        i = ((iM6981 ^ i5) * 20733) ^ 546780603;
                        i2 = -1959462822;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM2566 = C0630.m2566("۠۠") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                        i8 = iM2566 ^ i3;
                        activityC14946 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case 955689963:
                case 1094334019:
                    i10 = 36798;
                    iM2566 = C0630.m2566("᩸ۧ") ^ i6;
                    i7 = ((iM2566 ^ i5) * (-13263)) ^ 1971023457;
                    i3 = -1251482959;
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
                default:
                    menuInflater = menuInflater;
                    i13 = i16 * i16;
                    i14 = s * s;
                    i15 = 60388441;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((iM2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                    } else {
                        iM2566 = (C0630.m2566("ۜ֫") ^ i6) * q.h;
                        i7 = ((iM2566 ^ i5) * 26393) ^ (-1135170669);
                        i3 = 1464710976;
                    }
                    i8 = iM2566 ^ i3;
                    activityC14946 = this;
                    menuInflater = menuInflater;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0142 A[PHI: r12 r14 r15
      0x0142: PHI (r12v81 l.ܶ᩵ܿ) = (r12v79 l.ܶ᩵ܿ), (r12v1 l.ܶ᩵ܿ), (r12v1 l.ܶ᩵ܿ) binds: [B:32:0x0140, B:26:0x0112, B:23:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r14v6 l.ۛ᩵᩷) = (r14v4 l.ۛ᩵᩷), (r14v2 l.ۛ᩵᩷), (r14v2 l.ۛ᩵᩷) binds: [B:32:0x0140, B:26:0x0112, B:23:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r15v6 java.lang.String) = (r15v4 java.lang.String), (r15v2 java.lang.String), (r15v2 java.lang.String) binds: [B:32:0x0140, B:26:0x0112, B:23:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d6, code lost:
    
        if (l.C4075.f12947 < 0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        int i2;
        short[] sArr;
        C19258 c19258;
        DialogInterface.OnClickListener onClickListener;
        int iM6981;
        int i3;
        int i4;
        int i5;
        int i6;
        short[] sArr2;
        byte b;
        DialogInterface.OnClickListener onClickListener2;
        DialogInterface.OnClickListener onClickListener3;
        int iM2566;
        int i7;
        int i8;
        ?? r11;
        int iM6982;
        int i9;
        int i10;
        final ActivityC14946 activityC14946 = this;
        AbstractC15440 abstractC15440M1845 = null;
        short[] sArr3 = null;
        int i11 = 47359149;
        int i12 = C0422.f1886;
        int i13 = C1128.f4106;
        int iM2567 = C0630.m2566("۬۫") ^ i12;
        int i14 = ((iM2567 ^ i13) * (-20117)) ^ 1608856711;
        int i15 = iM2567 ^ (-1849452126);
        DialogInterface.OnClickListener onClickListener4 = null;
        DialogInterface.OnClickListener onClickListener5 = null;
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = null;
        String strM9031 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iM12567 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iM6983 = 0;
        int i21 = 0;
        short s = 0;
        int i22 = 0;
        int iM2568 = 0;
        byte b2 = 0;
        int i23 = 0;
        int i24 = 0;
        C19258 c19259 = null;
        String parent = null;
        boolean z = false;
        C6273 c6273 = null;
        int iM6984 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 11803) >> 31));
            switch (i11) {
                case -2067093114:
                case -92463151:
                    C7811.m20844();
                    if (C21923.f70183 != 0) {
                        iM6982 = (i13 - C2105.m6981("ᩳ᩷")) * (-109);
                        i9 = ((iM6982 ^ i12) * (-24965)) ^ 1231031861;
                        i10 = -1896846778;
                    } else {
                        iM6982 = C0630.m2566("ᩴܰ") ^ i12;
                        i9 = ((iM6982 ^ i13) * 9215) ^ (-359095689);
                        i10 = 2119548367;
                    }
                    i15 = iM6982 ^ i10;
                    i14 = i9;
                    break;
                case -2060452677:
                case 2007513720:
                    abstractC15440M1845 = abstractC15440M1845;
                    if (iM12567 == (C2105.m6981(C1420.m4902(f45554, 388, 3, i17)) ^ 2118643564)) {
                        iM2566 = (i12 - C0630.m2566("ۚᩳ")) * (-23);
                        i7 = ((iM2566 ^ i13) * (-5755)) ^ 597991978;
                        i8 = 1974731096;
                        r11 = i20;
                    } else {
                        iM2566 = (i13 - C0630.m2566("ۘۢ")) * (-13);
                        i7 = ((iM2566 ^ i12) * (-28819)) ^ 1257862802;
                        i8 = 345151676;
                        r11 = i20;
                    }
                    i15 = iM2566 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC15440M1845 = abstractC15440M1845;
                    break;
                case -2053411341:
                case 2130550529:
                    C6273 c6274 = activityC14946.f45557;
                    String str = activityC14946.f45561;
                    String strM947 = C0050.m947(getTitle());
                    RunnableC3474.m10618(c6274);
                    C6273.m17282(c6274, iM6984, str, strM947, (String[]) null, 24);
                    return z;
                case -2050743578:
                case 99570891:
                    abstractC15440M1845 = abstractC15440M1845;
                    if (iM12567 == (C0630.m2566(C3245.m9934(f45554, 391, 3, i17)) ^ 2122367824)) {
                        iM2566 = C0630.m2566("ۙ᩶") ^ i12;
                        i7 = ((iM2566 ^ i13) * (-751)) ^ 438482652;
                        i8 = -2128417628;
                        r11 = i20;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۘ") + i13) * (-93);
                        i7 = ((iM2566 ^ i12) * (-30631)) ^ (-1499535830);
                        i8 = -307126151;
                        r11 = i20;
                    }
                    i15 = iM2566 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC15440M1845 = abstractC15440M1845;
                    break;
                case -1993865252:
                case -1191500215:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr6 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr6;
                    short s2 = f45554[369];
                    int i25 = s2 + 3877;
                    if (!C2272.f7362) {
                        int iM6985 = (C2105.m6981("ܺ᩺") ^ i13) * (-101);
                        s = s2;
                        i22 = i25;
                        i16 = i16;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i14 = ((iM6985 ^ i12) * 25051) ^ (-1521922086);
                        i15 = iM6985 ^ 1055614877;
                        c19259 = c19259;
                        i18 = i18;
                        activityC14946 = this;
                        onClickListener5 = onClickListener5;
                        abstractC15440M1845 = abstractC15440M1845;
                        DialogInterface.OnClickListener onClickListener6 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener6;
                    } else {
                        s = s2;
                        i22 = i25;
                        iM6981 = (C2105.m6981("ۚۢ") + i13) * 5;
                        i3 = ((iM6981 ^ i12) * 19325) ^ (-1586289026);
                        i4 = 452514650;
                        i6 = iM6981 ^ i4;
                        i18 = i18;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        DialogInterface.OnClickListener onClickListener7 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener7;
                    }
                    break;
                case -1839114399:
                case 1366770311:
                    C0798.m2998();
                    if (!C1711.f5919) {
                        iM6982 = C0630.m2566("ᩴܰ") ^ i12;
                        i9 = ((iM6982 ^ i13) * 9215) ^ (-359095689);
                        i10 = 2119548367;
                        i15 = iM6982 ^ i10;
                        i14 = i9;
                    } else {
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        onClickListener5 = onClickListener5;
                        sArr4 = sArr4;
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i18;
                        short[] sArr7 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr7;
                        iM6981 = (C2105.m6981("ۚۢ") + i13) * 5;
                        i3 = ((iM6981 ^ i12) * 19325) ^ (-1586289026);
                        i4 = 452514650;
                        i6 = iM6981 ^ i4;
                        i18 = i18;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        DialogInterface.OnClickListener onClickListener8 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener8;
                    }
                    break;
                case -1714863848:
                case 1266745968:
                    activityC14946.f45562.m36676(ActivityC2953.class);
                    return z;
                case -1701871988:
                case 1875292309:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr8 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr8;
                    if (iM12567 == (C2105.m6981(C3019.m9250(f45554, 373, 3, i17)) ^ 2121172834)) {
                        iM6981 = C2105.m6981("ᩴ᩸") ^ i13;
                        i3 = ((iM6981 ^ i12) * 9671) ^ 1316021118;
                        i4 = -348244340;
                    } else {
                        iM6981 = (C2105.m6981("ۤ֡") + i13) * (-119);
                        i3 = ((iM6981 ^ i12) * 13621) ^ (-385717776);
                        i4 = -213144048;
                    }
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener9 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener9;
                    break;
                case -1654426363:
                case -674497476:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr9 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr9;
                    int i26 = (s * s) + 15031129;
                    if ((i22 * i22) - (i26 + i26) > 0) {
                        iM6981 = (i13 - C2105.m6981("۫ܺ")) * 87;
                        i3 = ((iM6981 ^ i12) * (-18159)) ^ (-903612740);
                        i4 = 2078662529;
                    } else {
                        iM6981 = (i12 - C2105.m6981("ۗ֫")) * 23;
                        i3 = ((iM6981 ^ i13) * 19929) ^ 1871757747;
                        i4 = -168990816;
                    }
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener10 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener10;
                    break;
                case -1619619330:
                case 762287132:
                    sArr = sArr3;
                    i17 = 35039;
                    iM6981 = C0630.m2566("᩷ۘ") ^ i12;
                    i3 = ((iM6981 ^ i13) * (-28457)) ^ (-129434971);
                    i4 = -1531938423;
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener11 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener11;
                    break;
                case -1571478416:
                case 676967183:
                    return i20;
                case -1287173976:
                case 96947333:
                    if (C2958.f9394 < 0) {
                        abstractC15440M1845 = abstractC15440M1845;
                        onClickListener = onClickListener4;
                        sArr = sArr3;
                        c19258 = c19259;
                        onClickListener5 = onClickListener5;
                        i = i16;
                        i2 = i18;
                        int iM6986 = C2105.m6981("ܿۧ") ^ i12;
                        int i27 = ((iM6986 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM6986 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i27;
                        c19259 = c19258;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC15440M1845 = abstractC15440M1845;
                    } else {
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        i5 = i18;
                        short[] sArr10 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr10;
                        int iM2569 = C0630.m2566("ᩴܶ") ^ i12;
                        short[] sArr11 = sArr4;
                        i14 = ((iM2569 ^ i13) * 8267) ^ 1988122756;
                        i15 = iM2569 ^ (-71948871);
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i5;
                        sArr4 = sArr11;
                        c19259 = c19259;
                        onClickListener5 = onClickListener5;
                        abstractC15440M1845 = abstractC15440M1845;
                        DialogInterface.OnClickListener onClickListener12 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener12;
                    }
                    break;
                case -1261566288:
                case 914484685:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19258 = c19259;
                    onClickListener5 = onClickListener5;
                    i = i16;
                    i2 = i18;
                    sArr2 = sArr3;
                    iM6983 = C2105.m6981(C1711.m5726(sArr2, 382, 3, i17));
                    i21 = 2116789544;
                    if (C4616.f14690 > 0) {
                        int iM25610 = C0630.m2566("۠᩵") ^ i12;
                        i15 = iM25610 ^ 708278375;
                        i14 = ((iM25610 ^ i13) * 10589) ^ (-1264747806);
                        sArr3 = sArr2;
                        i16 = i;
                        i18 = i2;
                        c19259 = c19258;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC15440M1845 = abstractC15440M1845;
                    } else {
                        sArr3 = sArr2;
                        onClickListener3 = onClickListener5;
                        b = b2;
                        onClickListener2 = onClickListener4;
                        int iM25611 = C0630.m2566("᩺ܿ") ^ i13;
                        DialogInterface.OnClickListener onClickListener13 = onClickListener3;
                        i14 = ((iM25611 ^ i12) * 9983) ^ (-1015374055);
                        i15 = iM25611 ^ (-1145015451);
                        onClickListener4 = onClickListener2;
                        i18 = i2;
                        abstractC15440M1845 = abstractC15440M1845;
                        onClickListener5 = onClickListener13;
                        b2 = b;
                        i16 = i;
                        c19259 = c19258;
                    }
                    break;
                case -1227944336:
                case -357747509:
                    activityC14946.f45563 = z;
                    activityC14946.f45562.mo11728();
                    return z;
                case -1220120272:
                case 506336570:
                    activityC14946.f45562.m36697();
                    return z;
                case -1186399911:
                case -736804345:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19258 = c19259;
                    onClickListener5 = onClickListener5;
                    i = i16;
                    i2 = i18;
                    sArr2 = sArr3;
                    C0382.m1849(c19258, iM2568);
                    byte b3 = activityC14946.f45560;
                    activityC14946.f45564 = b3;
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩵ۖᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            this.f60435.f45564 = i28;
                        }
                    };
                    if (!C2126.f7087) {
                        int iM6987 = C2105.m6981("ۘ᩸") ^ i13;
                        onClickListener4 = onClickListener;
                        i14 = ((iM6987 ^ i12) * 29165) ^ (-896505184);
                        i15 = iM6987 ^ 1328519771;
                        b2 = b3;
                        sArr3 = sArr2;
                        i16 = i;
                        i18 = i2;
                        c19259 = c19258;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC15440M1845 = abstractC15440M1845;
                    } else {
                        b2 = b3;
                        sArr = sArr2;
                        int iM6988 = C2105.m6981("ܿۧ") ^ i12;
                        int i28 = ((iM6988 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM6988 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i28;
                        c19259 = c19258;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC15440M1845 = abstractC15440M1845;
                    }
                    break;
                case -1139825474:
                case 1888740937:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr12 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr12;
                    z = true;
                    z = true;
                    if (iM12567 == (C0630.m2566(strM9031) ^ 2129421025)) {
                        iM6981 = C2105.m6981("ۡܰ") ^ i12;
                        i3 = ((iM6981 ^ i13) * (-21043)) ^ (-1578691503);
                        i4 = 377425604;
                    } else {
                        iM6981 = (C2105.m6981("ۡܽ") + i13) * (-29);
                        i3 = ((iM6981 ^ i12) * 31625) ^ 661883180;
                        i4 = -1837278528;
                    }
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener14 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener14;
                    break;
                case -1135083063:
                case 390291540:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr13 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr13;
                    iM12567 = C4159.m12567(menuItem);
                    strM9031 = C2958.m9031(f45554, 370, 3, i17);
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("ۢ֨") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-19543)) ^ 942181104;
                        i4 = -218512609;
                    } else {
                        iM6981 = C2105.m6981("۫ۛ") ^ i12;
                        i3 = ((iM6981 ^ i13) * 29975) ^ (-1213859000);
                        i4 = 1752725528;
                    }
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener15 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener15;
                    break;
                case -1112239218:
                case 1723713010:
                    C3911.m11924();
                    iM6982 = (i13 - C2105.m6981("ᩳ᩷")) * (-109);
                    i9 = ((iM6982 ^ i12) * (-24965)) ^ 1231031861;
                    i10 = -1896846778;
                    i15 = iM6982 ^ i10;
                    i14 = i9;
                    break;
                case -1047822290:
                case -684368862:
                    finish();
                    return z;
                case -1036876935:
                case 1352048977:
                    String strM3496 = C1005.m3496(abstractC15440M1845);
                    AbstractC2021.m6565(c6273);
                    C6273.m17282(c6273, iM6984, parent, strM3496, (String[]) null, 24);
                    return z;
                case -924708277:
                case -201681581:
                    sArr = sArr3;
                    i17 = 34438;
                    iM6981 = C0630.m2566("᩷ۘ") ^ i12;
                    i3 = ((iM6981 ^ i13) * (-28457)) ^ (-129434971);
                    i4 = -1531938423;
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener16 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener16;
                    break;
                case -899368761:
                case -480354822:
                    if (C0422.f1886 > 0) {
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        onClickListener5 = onClickListener5;
                        sArr4 = sArr4;
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i18;
                        short[] sArr14 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr14;
                        iM6981 = C0630.m2566("ۢ֨") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-19543)) ^ 942181104;
                        i4 = -218512609;
                        i6 = iM6981 ^ i4;
                        i18 = i18;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        DialogInterface.OnClickListener onClickListener17 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener17;
                    } else {
                        iM6982 = C0630.m2566("ᩴܰ") ^ i12;
                        i9 = ((iM6982 ^ i13) * 9215) ^ (-359095689);
                        i10 = 2119548367;
                        i15 = iM6982 ^ i10;
                        i14 = i9;
                    }
                    break;
                case -860832155:
                case -474382400:
                    i = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    onClickListener5 = onClickListener5;
                    i2 = i18;
                    short[] sArr15 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr15;
                    int i29 = DialogInterfaceC0206.f1451;
                    C19258 c192510 = new C19258(activityC14946);
                    sArr4 = f45554;
                    i23 = 379;
                    i24 = 3;
                    if (C1047.m3599() < 0) {
                        int iM25612 = (i12 - C0630.m2566("᩺ۧ")) * (-77);
                        int i30 = ((iM25612 ^ i13) * 31957) ^ (-991624346);
                        i15 = iM25612 ^ (-978563006);
                        i16 = i;
                        c19259 = c192510;
                        i14 = i30;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        abstractC15440M1845 = abstractC15440M1845;
                        DialogInterface.OnClickListener onClickListener18 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener18;
                    } else {
                        c19258 = c192510;
                        onClickListener = onClickListener4;
                        int iM6989 = C2105.m6981("ܿۧ") ^ i12;
                        int i210 = ((iM6989 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM6989 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i210;
                        c19259 = c19258;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC15440M1845 = abstractC15440M1845;
                    }
                    break;
                case -355663087:
                case 2147258078:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19258 = c19259;
                    onClickListener5 = onClickListener5;
                    dialogInterfaceC0206M19253 = C7187.m19253(c19258, C0630.m2566(C1916.m6311(sArr5, i18, i16, i17)) ^ 2122045158, onClickListener5, i19, onClickListener5);
                    if (ServiceConnectionC3453.m10564() > 0) {
                        int iM25613 = (C0630.m2566("ۚᩴ") ^ i13) * (-19);
                        i15 = iM25613 ^ (-1101322806);
                        i14 = ((iM25613 ^ i12) * 1387) ^ 686517613;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19258;
                    } else {
                        i = i16;
                        i2 = i18;
                        onClickListener = onClickListener4;
                        sArr = sArr3;
                        int iM69810 = C2105.m6981("ܿۧ") ^ i12;
                        int i211 = ((iM69810 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM69810 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i211;
                        c19259 = c19258;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC15440M1845 = abstractC15440M1845;
                    }
                    break;
                case -272532950:
                case 1364668224:
                    C3746.m11369();
                    C0630.m2564();
                    return false;
                case -248789767:
                case 811645962:
                    C3663.m11168();
                    break;
                case -116438718:
                case 191722174:
                    abstractC15440M1845 = abstractC15440M1845;
                    if (iM12567 == (C2105.m6981(C2105.m6988(f45554, 394, 3, i17)) ^ 2104216598)) {
                        iM2566 = C0630.m2566("ۘܿ") ^ i13;
                        i7 = ((iM2566 ^ i12) * (-24349)) ^ (-1582855354);
                        i8 = -542015347;
                        r11 = i20;
                    } else {
                        iM2566 = (i12 - C0630.m2566("ۧۘ")) * 93;
                        i7 = ((iM2566 ^ i13) * 19407) ^ (-265400563);
                        i8 = -252060874;
                        r11 = i20;
                    }
                    i15 = iM2566 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC15440M1845 = abstractC15440M1845;
                    break;
                case -109979971:
                case 651708881:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr16 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr16;
                    i24 = i24;
                    if (iM12567 == (C0630.m2566(C1773.m5917(f45554, 376, 3, i17)) ^ 2124288501)) {
                        iM6981 = (i13 - C2105.m6981("ۗۡ")) * (-71);
                        i3 = ((iM6981 ^ i12) * 5317) ^ 701626576;
                        i4 = 1228126885;
                    } else {
                        iM6981 = C0630.m2566("۫ᩳ") ^ i12;
                        i3 = ((iM6981 ^ i13) * (-31199)) ^ 269072514;
                        i4 = 1866697105;
                    }
                    i6 = iM6981 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    DialogInterface.OnClickListener onClickListener19 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener19;
                    break;
                case -39832832:
                case 594513914:
                    abstractC15440M1845 = abstractC15440M1845;
                    r11 = 0;
                    r11 = 0;
                    if (iM12567 == (C2105.m6981(C3683.m11225(f45554, 400, 3, i17)) ^ 2119952332)) {
                        iM2566 = C0630.m2566("ܶۜ") ^ i13;
                        i7 = ((iM2566 ^ i12) * (-7723)) ^ (-273357311);
                        i8 = -146607114;
                    } else {
                        iM2566 = (C2105.m6981("ܰۡ") ^ i12) * 55;
                        i7 = ((iM2566 ^ i13) * 31351) ^ 1014555735;
                        i8 = -118101088;
                    }
                    i15 = iM2566 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC15440M1845 = abstractC15440M1845;
                    break;
                case -35732410:
                case 1525575555:
                    abstractC15440M1845 = abstractC15440M1845;
                    if (iM12567 == (C0630.m2566(C0237.m1483(f45554, 397, 3, i17)) ^ 2127881853)) {
                        iM2566 = (i12 - C0630.m2566("֡ᩴ")) * 41;
                        i7 = ((iM2566 ^ i13) * 26005) ^ 1975872405;
                        i8 = -867231849;
                        r11 = i20;
                    } else {
                        iM2566 = C0630.m2566("ۜۛ") ^ i13;
                        i7 = ((iM2566 ^ i12) * (-7573)) ^ 390058472;
                        i8 = -182128713;
                        r11 = i20;
                    }
                    i15 = iM2566 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC15440M1845 = abstractC15440M1845;
                    break;
                case -3796392:
                case 945675970:
                    boolean zM12824 = C4263.m12824(activityC14946.f45558);
                    abstractC15440M1845 = abstractC15440M1845;
                    iM6984 = C2105.m6981(C0382.m1840(f45554, 403, 3, i17)) ^ 2116582964;
                    if (zM12824) {
                        iM2566 = C2105.m6981("ܺۢ") ^ i12;
                        i7 = ((iM2566 ^ i13) * (-2193)) ^ (-925707843);
                        i8 = -1653553126;
                        r11 = i20;
                    } else {
                        iM2566 = (i13 - C0630.m2566("֡۫")) * (-85);
                        i7 = ((iM2566 ^ i12) * (-6673)) ^ (-373269468);
                        i8 = 2044747675;
                        r11 = i20;
                    }
                    i15 = iM2566 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC15440M1845 = abstractC15440M1845;
                    break;
                case 126604316:
                case 1201249278:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i16 = i16;
                    i5 = i18;
                    i23 = i23;
                    i24 = i24;
                    short[] sArr17 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr17;
                    iM2568 = C0630.m2566(C1916.m6311(sArr4, i23, i24, i17)) ^ 2099534130;
                    if (C1128.f4106 > 0) {
                        int iM69811 = C2105.m6981("ۙ۬") ^ i12;
                        i3 = ((iM69811 ^ i13) * (-6559)) ^ (-1991146780);
                        i6 = iM69811 ^ (-1583128213);
                        i24 = i24;
                        i18 = i5;
                        i23 = i23;
                        sArr4 = sArr4;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC15440M1845 = abstractC15440M1845;
                        c19259 = c19259;
                        DialogInterface.OnClickListener onClickListener110 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener110;
                    }
                    int iM25614 = C0630.m2566("ᩴܶ") ^ i12;
                    short[] sArr18 = sArr4;
                    i14 = ((iM25614 ^ i13) * 8267) ^ 1988122756;
                    i15 = iM25614 ^ (-71948871);
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i5;
                    sArr4 = sArr18;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    abstractC15440M1845 = abstractC15440M1845;
                    DialogInterface.OnClickListener onClickListener111 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener111;
                    break;
                case 211944870:
                case 1202418483:
                    i2 = i18;
                    abstractC15440M1845 = abstractC15440M1845;
                    c19258 = c19259;
                    i = i16;
                    b = b2;
                    onClickListener2 = onClickListener4;
                    c19258.m44429(C2405.f7665, b, onClickListener2);
                    sArr3 = f45554;
                    if (C2272.f7362) {
                        onClickListener3 = null;
                        int iM25615 = C0630.m2566("᩺ܿ") ^ i13;
                        DialogInterface.OnClickListener onClickListener112 = onClickListener3;
                        i14 = ((iM25615 ^ i12) * 9983) ^ (-1015374055);
                        i15 = iM25615 ^ (-1145015451);
                        onClickListener4 = onClickListener2;
                        i18 = i2;
                        abstractC15440M1845 = abstractC15440M1845;
                        onClickListener5 = onClickListener112;
                        b2 = b;
                        i16 = i;
                    } else {
                        int iM25616 = C0630.m2566("ۡᩴ") ^ i13;
                        i14 = ((iM25616 ^ i12) * 19413) ^ (-429293057);
                        i15 = iM25616 ^ (-1135939893);
                        b2 = b;
                        onClickListener4 = onClickListener2;
                        i16 = i;
                        i18 = i2;
                        abstractC15440M1845 = abstractC15440M1845;
                        onClickListener5 = null;
                    }
                    c19259 = c19258;
                    break;
                case 244617642:
                case 1437396757:
                    activityC14946.setResult(2);
                    super.finish();
                    return z;
                case 650212370:
                case 834837417:
                    activityC14946.f45562.m36696();
                    return z;
                case 853333235:
                case 1564693117:
                    abstractC15440M1845 = abstractC15440M1845;
                    c19259 = c19259;
                    onClickListener5 = onClickListener5;
                    i19 = iM6983 ^ i21;
                    sArr5 = f45554;
                    i18 = 385;
                    if (RunnableC1937.f6483 >= 0) {
                        i16 = 3;
                        i5 = 385;
                        short[] sArr19 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr19;
                        int iM25617 = C0630.m2566("ᩴܶ") ^ i12;
                        short[] sArr110 = sArr4;
                        i14 = ((iM25617 ^ i13) * 8267) ^ 1988122756;
                        i15 = iM25617 ^ (-71948871);
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i5;
                        sArr4 = sArr110;
                        c19259 = c19259;
                        onClickListener5 = onClickListener5;
                        abstractC15440M1845 = abstractC15440M1845;
                        DialogInterface.OnClickListener onClickListener113 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener113;
                    } else {
                        int iM69812 = C2105.m6981("ۛܳ") ^ i12;
                        i15 = iM69812 ^ 1729566311;
                        i14 = ((iM69812 ^ i13) * (-30031)) ^ 2090773230;
                        c19259 = c19259;
                        onClickListener5 = onClickListener5;
                        abstractC15440M1845 = abstractC15440M1845;
                        i16 = 3;
                    }
                    break;
                case 1131002608:
                case 1434843473:
                    abstractC15440M1845 = C0382.m1845(activityC14946.f45558, new String[i20]);
                    c6273 = activityC14946.f45557;
                    parent = abstractC15440M1845.getParent();
                    if (C3537.f11231 >= 0) {
                        iM6982 = (i13 - C2105.m6981("ᩳ᩷")) * (-109);
                        i9 = ((iM6982 ^ i12) * (-24965)) ^ 1231031861;
                        i10 = -1896846778;
                    } else {
                        iM6982 = (i12 - C2105.m6981("ܰۤ")) * 75;
                        i9 = ((iM6982 ^ i13) * 27101) ^ (-478477213);
                        i10 = 473953502;
                    }
                    i15 = iM6982 ^ i10;
                    i14 = i9;
                    break;
                default:
                    C2126.m7039(C21923.m49343(dialogInterfaceC0206M19253), new ViewOnClickListenerC23705(activityC14946, dialogInterfaceC0206M19253, z ? 1 : 0));
                    return z;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private byte[] m35407() {
        int iM6981;
        int i;
        C12392 c12392 = null;
        boolean z = false;
        int i2 = 1315461950;
        int i3 = C3911.f12484;
        int i4 = C3019.f9544;
        int iM2566 = (C0630.m2566("᩸֫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM2566 ^ i3) * (-9363)) ^ 1383843560;
        int i6 = -695098000;
        while (true) {
            int i7 = iM2566 ^ i6;
            C10130 c10130 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-11163)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1957862118:
                    case -1438283836:
                        c12392 = this.f45556;
                        z = false;
                        if (C3746.f11829 > 0) {
                            iM6981 = (i4 - C0630.m2566("۟᩷")) * (-53);
                            i5 = ((iM6981 ^ i3) * 21503) ^ (-1225891421);
                            i = -1979105400;
                            i7 = iM6981 ^ i;
                        } else {
                            iM2566 = C0630.m2566("ۙܰ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 8599) ^ (-1605529187);
                            i6 = -1104996820;
                        }
                        break;
                    case -1862406212:
                    case -1408404582:
                        C1504.m5175(c10130, this.f45560);
                        iM6981 = (C0630.m2566("᩸ᩴ") ^ i3) * (-99);
                        i5 = ((iM6981 ^ i4) * 24351) ^ (-673084587);
                        i = 494070305;
                        i7 = iM6981 ^ i;
                        break;
                    case -1387545664:
                    case 1204370080:
                        c12392.m30331(c10130, z);
                        return c10130.m25427();
                    case -960527856:
                    case 1796097396:
                        c10130.m25425(this.f45565);
                        if (this.f45565) {
                            iM6981 = C2105.m6981("۫ܰ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-21241)) ^ (-13188122);
                            i = 1257146410;
                        } else {
                            iM6981 = (C0630.m2566("᩸ᩴ") ^ i3) * (-99);
                            i5 = ((iM6981 ^ i4) * 24351) ^ (-673084587);
                            i = 494070305;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -843780403:
                    case 1489038158:
                        if (RunnableC0588.f2309 < 0) {
                            iM2566 = C2105.m6981("᩶ܺ") ^ i4;
                            i5 = ((iM2566 ^ i3) * (-1507)) ^ (-475657198);
                            i6 = -2107359160;
                        } else {
                            iM2566 = (i4 - C0630.m2566("ۖܶ")) * 37;
                            i5 = ((iM2566 ^ i3) * (-13313)) ^ (-465381526);
                            i6 = 1835888519;
                        }
                        break;
                    case -441865799:
                    case -278715014:
                        RunnableC3474.m10630();
                        return null;
                    case -335428076:
                    case 2032514333:
                        C3245.m9925();
                        if (C0630.f2410 <= 0) {
                            iM2566 = (i4 - C0630.m2566("ۖܶ")) * 37;
                            i5 = ((iM2566 ^ i3) * (-13313)) ^ (-465381526);
                            i6 = 1835888519;
                        } else {
                            iM2566 = (i3 - C0630.m2566("֡᩷")) * (-111);
                            i5 = ((iM2566 ^ i4) * 31283) ^ 376409486;
                            i6 = 108017206;
                        }
                        break;
                    case 814970579:
                    case 1875309116:
                        C4263.m12819();
                        if (!AbstractC2021.m6574()) {
                            iM2566 = (i4 - C0630.m2566("ۖܶ")) * 37;
                            i5 = ((iM2566 ^ i3) * (-13313)) ^ (-465381526);
                            i6 = 1835888519;
                        } else {
                            iM2566 = (C2105.m6981("ۡۜ") + i3) * (-21);
                            i5 = ((iM2566 ^ i4) * (-18139)) ^ 1497388137;
                            i6 = 1986946829;
                        }
                        break;
                    case 875193606:
                    case 894708631:
                        AbstractC2021.m6574();
                        iM2566 = (i3 - C0630.m2566("֡᩷")) * (-111);
                        i5 = ((iM2566 ^ i4) * 31283) ^ 376409486;
                        i6 = 108017206;
                        break;
                    default:
                        if (C4159.f13567) {
                            if (C5695.f17556 < 0) {
                                if (C3663.f11553) {
                                    iM2566 = (i3 - C0630.m2566("֡᩷")) * (-111);
                                    i5 = ((iM2566 ^ i4) * 31283) ^ 376409486;
                                    i6 = 108017206;
                                    break;
                                } else if (C1128.f4106 <= 0) {
                                    iM2566 = (i4 - C0630.m2566("ۖܶ")) * 37;
                                    i5 = ((iM2566 ^ i3) * (-13313)) ^ (-465381526);
                                    i6 = 1835888519;
                                    break;
                                } else if (C1420.f5096 > 0) {
                                    if (C3019.f9544 >= 0 || ViewOnClickListenerC1958.f6529 <= 0) {
                                        iM2566 = C2105.m6981("᩶ܺ") ^ i4;
                                        i5 = ((iM2566 ^ i3) * (-1507)) ^ (-475657198);
                                        i6 = -2107359160;
                                        break;
                                    } else if (C22628.f73083 > 0) {
                                        c10130 = new C10130();
                                        if (C7811.m20844() == 0) {
                                            iM6981 = (C0630.m2566("ۜۤ") ^ i4) * 25;
                                            i5 = ((iM6981 ^ i3) * (-9921)) ^ 745579511;
                                            i = 1607420108;
                                            i7 = iM6981 ^ i;
                                            break;
                                        }
                                    }
                                }
                            }
                            iM2566 = C0630.m2566("ۙܰ") ^ i3;
                            i5 = ((iM2566 ^ i4) * 8599) ^ (-1605529187);
                            i6 = -1104996820;
                            break;
                        }
                        iM2566 = (C2105.m6981("ۡۜ") + i3) * (-21);
                        i5 = ((iM2566 ^ i4) * (-18139)) ^ 1497388137;
                        i6 = 1986946829;
                        break;
                }
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        C15545 c15545 = null;
        int i = -1474828796;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C4075.f12947;
        int iM2566 = C0630.m2566("ܶ᩻") ^ i2;
        int i4 = ((iM2566 ^ i3) * 23679) ^ (-1740611177);
        int i5 = 1670248068;
        while (true) {
            i = ((((i ^ i3) * (-25631)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1841038682:
                case -187143320:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۖ۠")) * (-71);
                        i4 = ((iM2566 ^ i3) * (-20465)) ^ (-345382312);
                        i5 = -921542862;
                    } else {
                        iM2566 = C0630.m2566("ۧ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27183)) ^ 1191572376;
                        i5 = 1677362542;
                    }
                    break;
                case -1745398635:
                case -1385340851:
                    if (RunnableC1937.m6387() != 0) {
                        iM2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM2566 = C0630.m2566("֫ܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-10485)) ^ 43416760;
                        i5 = 1434805959;
                    }
                    break;
                case -1687711327:
                case 1279234687:
                    C1420.m4913();
                    if (!C3663.f11553) {
                        iM2566 = C0630.m2566("֡ۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19731) ^ 872861308;
                        i5 = 736689303;
                    } else {
                        iM2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    }
                    break;
                case -1612660630:
                case -572603923:
                    if (C1504.m5179()) {
                        iM2566 = C2105.m6981("᩸ܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10741)) ^ 1433355891;
                        i5 = -966564567;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    }
                    break;
                case -1548527596:
                case -492067020:
                    if (!RunnableC3474.m10630()) {
                        iM2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        iM2566 = (C2105.m6981("ܿ᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2566 ^ i2) * (-20773)) ^ 633693335;
                        i5 = 442918439;
                    }
                    break;
                case -1029440603:
                case 184918099:
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        iM2566 = (C0630.m2566("ۧۙ") + i2) * (-17);
                        i4 = ((iM2566 ^ i3) * 28339) ^ (-2122553384);
                        i5 = -2137843269;
                    }
                    break;
                case -771762133:
                case 135898876:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        iM2566 = C0630.m2566("᩸ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-4081)) ^ (-1559902239);
                        i5 = -1436603170;
                    }
                    break;
                case -645265107:
                case 2113091791:
                    break;
                case -541194488:
                case 1937637303:
                    c15545.m36684();
                    iM2566 = C0630.m2566("֨ۗ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 11323) ^ (-734729054);
                    i5 = -173498568;
                    break;
                case -385845284:
                case 1852404873:
                    if (C2126.f7087) {
                        iM2566 = C0630.m2566("֡ۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 19731) ^ 872861308;
                        i5 = 736689303;
                    } else {
                        iM2566 = (C0630.m2566("ۨܺ") ^ i2) * (-119);
                        i4 = ((iM2566 ^ i3) * (-28961)) ^ 794740819;
                        i5 = 1324347968;
                    }
                    break;
                case -341751697:
                case 116451553:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM2566 = C0630.m2566("ܰۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16107) ^ (-889644712);
                        i5 = 674635460;
                    }
                    break;
                case -178608221:
                case 1920286914:
                    c15545 = this.f45562;
                    if (c15545 != null) {
                        iM2566 = C0630.m2566("ۧ᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * 31781) ^ (-1277532365);
                        i5 = 660515827;
                    } else {
                        iM2566 = C0630.m2566("֨ۗ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 11323) ^ (-734729054);
                        i5 = -173498568;
                    }
                    break;
                case -25185490:
                case 1864409239:
                    if (C3683.f11629 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֡ۙ")) * (-105);
                        i4 = ((iM2566 ^ i2) * 26145) ^ (-1106094239);
                        i5 = -799804379;
                    }
                    break;
                case 372863260:
                case 1665695223:
                    C2167.m7155();
                    if (C0483.f2088 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    }
                    break;
                case 445634495:
                case 692114504:
                    C1504.m5179();
                    RunnableC0588.m2441();
                    break;
                case 864646199:
                case 934193334:
                    super.onResume();
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("ۘ᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6065) ^ (-426996389);
                        i5 = -2143135353;
                    } else {
                        iM2566 = (C2105.m6981("ܿ᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2566 ^ i2) * (-20773)) ^ 633693335;
                        i5 = 442918439;
                    }
                    break;
                case 1441921971:
                case 1776581582:
                    C4616.m13552();
                    C7811.m20844();
                    iM2566 = C0630.m2566("ۜ֨") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-20627)) ^ (-264505712);
                    i5 = 2103683635;
                    break;
                default:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i2 - C2105.m6981("ۖ۠")) * (-71);
                        i4 = ((iM2566 ^ i3) * (-20465)) ^ (-345382312);
                        i5 = -921542862;
                    } else {
                        iM2566 = (C0630.m2566("ۡܶ") ^ i2) * (-75);
                        i4 = ((iM2566 ^ i3) * (-22181)) ^ (-2144483609);
                        i5 = -1396612343;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0356 A[PHI: r14 r17 r24 r29
      0x0356: PHI (r14v28 short[]) = (r14v8 short[]), (r14v20 short[]), (r14v32 short[]) binds: [B:85:0x0354, B:47:0x01ad, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r17v4 short[]) = (r17v3 short[]), (r17v2 short[]), (r17v2 short[]) binds: [B:85:0x0354, B:47:0x01ad, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r24v12 int) = (r24v2 int), (r24v3 int), (r24v2 int) binds: [B:85:0x0354, B:47:0x01ad, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0356: PHI (r29v10 int) = (r29v3 int), (r29v4 int), (r29v3 int) binds: [B:85:0x0354, B:47:0x01ad, B:10:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0388 A[PHI: r7 r11 r13 r14 r18
      0x0388: PHI (r7v4 l.ܶ᩵ܿ) = (r7v2 l.ܶ᩵ܿ), (r7v2 l.ܶ᩵ܿ), (r7v5 l.ܶ᩵ܿ) binds: [B:89:0x0386, B:81:0x0334, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v5 short[]) binds: [B:89:0x0386, B:81:0x0334, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v5 int) binds: [B:89:0x0386, B:81:0x0334, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r14v26 short[]) = (r14v7 short[]), (r14v9 short[]), (r14v27 short[]) binds: [B:89:0x0386, B:81:0x0334, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0388: PHI (r18v4 char) = (r18v2 char), (r18v3 char), (r18v2 char) binds: [B:89:0x0386, B:81:0x0334, B:14:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (l.C3683.f11629 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (l.C4263.f13799 <= 0) goto L9;
     */
    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        Bundle bundle2 = bundle;
        int i7 = C0422.f1886;
        int i8 = C4263.f13799;
        int iM2567 = C0630.m2566("᩶۬") ^ i8;
        int i9 = ((iM2567 ^ i7) * (-31493)) ^ (-688228104);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM2567 ^ (-1571238213);
        byte[] bArrM35407 = null;
        int length = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        char c = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 361723364;
        int i19 = 0;
        short[] sArr4 = null;
        IOException iOException = null;
        AbstractC15440 abstractC15440M36535 = null;
        AbstractC15440 abstractC15440 = null;
        String strM9934 = null;
        String str = null;
        int i20 = 0;
        while (true) {
            i18 = i10 ^ (i9 & (((i18 ^ i7) * 26113) >> 31));
            switch (i18) {
                case -2130118750:
                case -606839412:
                    throw new UncheckedIOException(iOException);
                case -1984652694:
                case 1903031526:
                    sArr = sArr;
                    super.onSaveInstanceState(bundle);
                    if (this.f45556 != null) {
                        iM2566 = (C0630.m2566("᩹ᩴ") + i8) * 27;
                        i3 = ((iM2566 ^ i7) * (-17951)) ^ 1598607045;
                        i4 = 1072310911;
                    } else {
                        iM2566 = C0630.m2566("ۛܰ") ^ i7;
                        i3 = ((iM2566 ^ i8) * 15945) ^ (-1985896155);
                        i4 = -2089458398;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1939095928:
                case -525715341:
                    C0050.m940();
                    C0714.m2805();
                    sArr = sArr;
                    iM2566 = C2105.m6981("ۤ᩵") ^ i7;
                    i3 = ((iM2566 ^ i8) * 20791) ^ 1610047459;
                    i4 = 1577968384;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1827661996:
                case -795534637:
                    i11 = 40514;
                    iM2566 = (i7 - C2105.m6981("᩹ܺ")) * (-61);
                    i3 = ((iM2566 ^ i8) * (-4299)) ^ (-352021404);
                    i4 = 1641789830;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1777869659:
                case 1031610680:
                    sArr = sArr;
                    if (C1128.f4106 <= 0) {
                        iM2566 = C0630.m2566("ᩴ᩺") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-4303)) ^ (-260037823);
                        i4 = 2048591846;
                    } else {
                        iM2566 = (C0630.m2566("ܺۤ") + i7) * (-37);
                        i3 = ((iM2566 ^ i8) * (-29841)) ^ 1534406655;
                        i4 = -1398906816;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1733549415:
                case 141928386:
                    bundle2.putString(str, C4117.m12359(abstractC15440M36535));
                    bundle2.remove(strM9934);
                    return;
                case -1684079210:
                case 794440143:
                    return;
                case -1644058974:
                case -1313558029:
                    sArr = sArr;
                    c = 406;
                    if (C1420.m4913()) {
                        iM2566 = C0630.m2566("ᩴ᩺") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-4303)) ^ (-260037823);
                        i4 = 2048591846;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۤ֡")) * (-63);
                        i3 = ((iM2566 ^ i7) * 18481) ^ (-795741693);
                        i4 = -1147752977;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1626137380:
                case -1428183135:
                    i11 = 17599;
                    iM2566 = (i7 - C2105.m6981("᩹ܺ")) * (-61);
                    i3 = ((iM2566 ^ i8) * (-4299)) ^ (-352021404);
                    i4 = 1641789830;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1615964615:
                case 1795704625:
                    sArr = sArr;
                    int i21 = i14 + i15;
                    i16 = i21 + i21;
                    s = 4645;
                    if (C3432.f10845 >= 0) {
                        iM2566 = C2105.m6981("ۤ᩵") ^ i7;
                        i3 = ((iM2566 ^ i8) * 20791) ^ 1610047459;
                        i4 = 1577968384;
                    } else {
                        iM2566 = (i7 - C2105.m6981("۠ۘ")) * 59;
                        i3 = ((iM2566 ^ i8) * 29143) ^ (-1284215437);
                        i4 = 1857270435;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1561514672:
                case -550129661:
                    sArr = sArr;
                    i17 = 407;
                    i19 = 16;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i7 - C2105.m6981("ۚۘ")) * 101;
                        i3 = ((iM2566 ^ i8) * (-3837)) ^ (-23371824);
                        i4 = 1070082966;
                    } else {
                        iM2566 = C0630.m2566("ܿۡ") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-28535)) ^ 779225640;
                        i4 = 1128076574;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1508802876:
                case -455875379:
                    sArr = sArr;
                    s2 = sArr4[c];
                    i14 = s2 * s2;
                    i15 = 21576025;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ܳ֨") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-21605)) ^ (-2068431667);
                        i4 = 280711793;
                    } else {
                        iM2566 = C2105.m6981("ۗܶ") ^ i7;
                        i3 = ((iM2566 ^ i8) * 17855) ^ 728636514;
                        i4 = -2025468409;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1439902213:
                case 1189498896:
                    C1047.m3599();
                    C4159.m12565();
                    return;
                case -1404096516:
                case 139523493:
                    if (!C1005.f3721) {
                        sArr = sArr;
                        iM2566 = (i7 - C2105.m6981("ۚۘ")) * 101;
                        i3 = ((iM2566 ^ i8) * (-3837)) ^ (-23371824);
                        i4 = 1070082966;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    }
                    sArr = sArr;
                    iM2566 = C2105.m6981("ۤ᩵") ^ i7;
                    i3 = ((iM2566 ^ i8) * 20791) ^ 1610047459;
                    i4 = 1577968384;
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1353686615:
                case 1589462438:
                    sArr = f45554;
                    if (C2167.f7158 >= 0) {
                        iM6982 = C0630.m2566("ۖܶ") ^ i8;
                        i5 = ((iM6982 ^ i7) * 7201) ^ (-1211414318);
                        i6 = -722023813;
                    } else {
                        iM6982 = (C2105.m6981("ܶܶ") + i8) * 89;
                        i5 = ((iM6982 ^ i7) * (-3117)) ^ (-1303372008);
                        i6 = -345032789;
                    }
                    i10 = iM6982 ^ i6;
                    i9 = i5;
                    bundle2 = bundle;
                    break;
                case -1174698642:
                case -979222085:
                    sArr = sArr;
                    bArrM35407 = m35407();
                    length = bArrM35407.length;
                    i20 = WXNativeGamePageObject.LENGTH_LIMIT;
                    if (!C1916.f6442) {
                        sArr = sArr;
                        iM6982 = C0630.m2566("ۖܶ") ^ i8;
                        i5 = ((iM6982 ^ i7) * 7201) ^ (-1211414318);
                        i6 = -722023813;
                        i10 = iM6982 ^ i6;
                        i9 = i5;
                        bundle2 = bundle;
                    } else {
                        iM2566 = C0630.m2566("ܶ֨") ^ i7;
                        i3 = ((iM2566 ^ i8) * 2113) ^ (-419886636);
                        i4 = 1180099477;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    }
                    break;
                case -918318775:
                case 1840455673:
                    sArr = sArr;
                    sArr4 = f45554;
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ۙۚ") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-23911)) ^ 1769130649;
                        i4 = -2048375814;
                    } else {
                        iM2566 = (i7 - C2105.m6981("ۚۘ")) * 101;
                        i3 = ((iM2566 ^ i8) * (-3837)) ^ (-23371824);
                        i4 = 1070082966;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -793375312:
                case -548448690:
                    sArr = sArr;
                    int i22 = s2 + s;
                    if (i16 - (i22 * i22) < 0) {
                        iM2566 = C2105.m6981("ۧ֡") ^ i8;
                        i3 = ((iM2566 ^ i7) * 31699) ^ 1582135822;
                        i4 = -456529823;
                    } else {
                        iM2566 = C0630.m2566("ۙܽ") ^ i8;
                        i3 = ((iM2566 ^ i7) * 23049) ^ 320907880;
                        i4 = -1420824976;
                    }
                    i10 = iM2566 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -729310572:
                case -243790137:
                    strM9934 = C3245.m9934(sArr2, i12, 12, i11);
                    if (length < i20) {
                        iM6981 = (C2105.m6981("ۚۛ") + i7) * (-113);
                        i = ((iM6981 ^ i8) * 31493) ^ (-46598778);
                        i2 = -911444790;
                    } else {
                        iM6981 = (i7 - C0630.m2566("֫֡")) * 17;
                        i = ((iM6981 ^ i8) * (-28525)) ^ 1614948414;
                        i2 = -1230889447;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -340605831:
                case 1340551420:
                    break;
                case -265366595:
                case 1972470571:
                    abstractC15440M36535 = abstractC15440.m36535(C1047.m3603(sArr3, i13, 13, i11));
                    iM6981 = (C0630.m2566("ۛۨ") ^ i8) * (-93);
                    i = ((iM6981 ^ i7) * (-8405)) ^ 712190465;
                    i2 = -1838272978;
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
                case -143928740:
                case 912969748:
                    bundle2.putByteArray(strM9934, bArrM35407);
                    bundle2.remove(str);
                    return;
                case -111947489:
                case 2002901940:
                    sArr = sArr;
                    int i23 = i17;
                    int i24 = i19;
                    String strM11225 = C3683.m11225(sArr, i23, i24, i11);
                    sArr2 = f45554;
                    if (C2105.f7037 != 0) {
                        i17 = i23;
                        i19 = i24;
                        i12 = 423;
                        str = strM11225;
                        iM2566 = C0630.m2566("ܳ֨") ^ i7;
                        i3 = ((iM2566 ^ i8) * (-21605)) ^ (-2068431667);
                        i4 = 280711793;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    } else {
                        int iM2568 = C0630.m2566("ܰۛ") ^ i7;
                        i9 = ((iM2568 ^ i8) * (-2263)) ^ (-1868169855);
                        int i25 = iM2568 ^ (-376199059);
                        i19 = i24;
                        sArr = sArr;
                        i12 = 423;
                        i17 = i23;
                        str = strM11225;
                        i10 = i25;
                    }
                    break;
                case 288454210:
                case 1108548469:
                    abstractC15440 = C16293.f50113;
                    sArr3 = f45554;
                    i13 = 435;
                    if (C4075.f12947 < 0) {
                        iM6981 = C2105.m6981("᩸ۖ") ^ i8;
                        i = ((iM6981 ^ i7) * 6083) ^ (-988484045);
                        i2 = -999177781;
                        i10 = iM6981 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        iM2566 = C0630.m2566("ᩴ᩺") ^ i8;
                        i3 = ((iM2566 ^ i7) * (-4303)) ^ (-260037823);
                        i4 = 2048591846;
                        i10 = iM2566 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    }
                    break;
                case 651109750:
                case 1313103944:
                    break;
                default:
                    try {
                        abstractC15440M36535.m36503(bArrM35407, 0, bArrM35407.length);
                        iM6981 = C0630.m2566("֡֡") ^ i8;
                        i = ((iM6981 ^ i7) * (-4659)) ^ (-1189370002);
                        i2 = -1393508463;
                    } catch (IOException e) {
                        iOException = e;
                        iM6981 = C0630.m2566("۟֨") ^ i7;
                        i = ((iM6981 ^ i8) * 27645) ^ (-1567472466);
                        i2 = -1713148406;
                    }
                    i10 = iM6981 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }
}
