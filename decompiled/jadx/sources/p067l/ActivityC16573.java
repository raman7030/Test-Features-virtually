package p067l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXNativeGamePageObject;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.p066io.UncheckedIOException;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ܶۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16573 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩴۧ */
    public static final /* synthetic */ int f48667 = 0;

    /* JADX INFO: renamed from: ᩺ܰܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82227 = {5445, 3094, 3079, 3098, 3094, 3124, 3083, 3079, 3093, 3079, 3088, 3133, 3089, 3088, 3073, 3087, 3079, 3094, 3082, 3085, 3078, 3094, 3083, 3094, 3086, 3079, 3089, 3075, 3092, 3079, 3078, 3107, 3089, 3122, 3075, 3094, 3082, 3089, 3099, 3084, 3094, 3075, 3098, 3108, 3083, 3086, 3079, 3116, 3075, 3087, 3079, 3089, 3095, 3090, 3090, 3085, 3088, 3094, 3118, 3085, 3073, 3075, 3094, 3079, 2868, -8543, -8528, -8531, -8543, -8573, -8516, -8528, -8542, -8528, -8537, -8566, -8527, -8528, -8522, -8520, -8528, -8543, -8515, -8518, -8527, -8543, -8516, -8543, -8519, -8528, 6543, 18380, 18381, 18384, 18423, 18380, 18381, 18379, 18375, 18373, 18392, 18369, 18372, 18381, 18423, 18381, 18374, 18383, 18369, 18374, 18381, 9432, 28154, 28159, 28138, 28159, 7636, 24701, 23358, 31686, 27164, -32043, 29423, 26800, -30555, -24747, 1221, 1225, 1218, 1219, 1219, 1218, 1231, 1234, 1273, 1233, 1225, 1236, 1218, 1273, 1233, 1236, 1223, 1238, 1273, 1232, 1231, 1219, 1233, 1219, 1236, -29073, 21299, 22573, 1237, 1223, 1232, 1219, 1269, 1234, 1223, 1234, 1219, 1257, 1224, 1268, 1219, 1237, 1235, 1226, 1234, 1234, 1231, 1234, 1226, 1219, 1237, 1247, 1224, 1234, 1223, 1246, 1248, 1231, 1226, 1219, 1256, 1223, 1227, 1219, 1237, 1235, 1238, 1238, 1225, 1236, 1234, 1258, 1225, 1221, 1223, 1234, 1219, 1237, 1223, 1232, 1219, 1218, 1255, 1237, 1270, 1223, 1234, 1230, 1234, 1219, 1246, 1234, 1273, 1232, 1231, 1219, 1233, 1219, 1236, 1273, 1237, 1223, 1232, 1219, 1273, 1223, 1237, 1273, 1238, 1223, 1234, 1230, 1227, 1219, 1234, 1230, 1225, 1218, 1227, 1219, 1227, 1225, 1236, 1247, 1264, 1231, 1219, 1233, 1219, 1236, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1237, 1236, 1221, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1218, 1223, 1234, 1223, -32465, -28744, -28259, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1218, 1219, 1221, 1166, 1177, 1227, 1167, 1272, 1277, 1158, 1199, 1275, 1164, 1161, 1161, 1158, 1259, 1255, 1268, 1261, 1273, 1166, 1253, 1258, 1255, 1269, 1269, 1242, 1248, 1263, 1251, 1258, 1250, 1242, 1259, 1251, 1266, 1262, 1257, 1250, 1167, 1273, 1166, 1269, 1266, 1255, 1268, 1266, 1242, 1251, 1256, 1250, 1167, 1160, 1164, 1177, 1196, 1512, 31044, 17929, 21480, 23179, -21649, 17495, 19714, 18251, -20700, 23175, -20418, 20712, 2909, -1842, -7097, -9885, -8870, -8705, 6894, -8166, 7840, -3883, 5408, -10142, 7623, -10550, -6562, -1148, -9667, -6140, -12107, -11483, -6974, 2961, -7568, -1547, -11029, 6574, -6372, 3802, -946, 5651, -606, -11517, 112, 612, -10621, -2265, -12261, 3733, 17618, 17626, 17618, 17616, 17613, 17606, 17641, 17622, 17626, 17608, 17626, 17613, 17647, 17630, 17611, 17623, 17618, 17626, 17618, 17616, 17613, 17606, 17641, 17622, 17626, 17608, 17626, 17613, 17553, 17618, 17626, 17618, 17616, 17613, 17606, 17554, 17612, 17611, 17630, 17611, 17626, 7375, -28061, -28078, -28081, -28093, -28063, -28066, -28078, -28096, -28078, -28091};

    /* JADX INFO: renamed from: ۖۧ */
    public boolean f48668;

    /* JADX INFO: renamed from: ۘۧ */
    public C14146 f48669;

    /* JADX INFO: renamed from: ۜۧ */
    public C8331 f48670;

    /* JADX INFO: renamed from: ۡۧ */
    public String f48671;

    /* JADX INFO: renamed from: ۢۧ */
    public boolean f48672;

    /* JADX INFO: renamed from: ܳۧ */
    public byte f48673;

    /* JADX INFO: renamed from: ܺۧ */
    public String f48674;

    /* JADX INFO: renamed from: ܿۧ */
    public C17143 f48675;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f48676 = false;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f48677;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f48678;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
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
        int i6 = C1046.f81962;
        int i7 = C0930.f81879;
        int iM55680 = (i6 - C0873.m55680("ۨۨ")) * 13;
        int i8 = ((iM55680 ^ i7) * (-18961)) ^ 1924226964;
        int i9 = 1012053535;
        while (true) {
            i5 = ((((i5 ^ i7) * 2837) >> 31) & i8) ^ (iM55680 ^ i9);
            switch (i5) {
                case -2076809903:
                case 210143348:
                    sArr2 = f82227;
                    i4 = 449;
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (i7 - C0873.m55680("ۤۨ")) * (-89);
                        i8 = ((iM55680 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM55680 = C0873.m55680("᩹ۖ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-10191)) ^ (-573938642);
                        i9 = -737518550;
                    }
                    break;
                case -2043921325:
                case 1415780196:
                    sArr = f82227;
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ܿܿ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        iM55680 = C0873.m55680("ܽ֡") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-22573)) ^ (-329302849);
                        i9 = 260617486;
                    }
                    break;
                case -1944275644:
                case 1088948343:
                    i3 = 233;
                    iM55680 = (C0873.m55680("۫֫") ^ i7) * 43;
                    i8 = ((iM55680 ^ i6) * 22049) ^ (-591135280);
                    i9 = 1575520163;
                    break;
                case -1869416592:
                case -1274202721:
                    C0946.m55980();
                    if (!C0947.f81895) {
                        iM55680 = C0873.m55680("۠᩷") ^ i6;
                        i8 = ((iM55680 ^ i7) * 17991) ^ 378312645;
                        i9 = -1201371095;
                    } else {
                        iM55680 = C0873.m55680("֨۠") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    }
                    break;
                case -1813345551:
                case 1395568440:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0873.m55680("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM55680 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        iM55680 = (C0873.m55680("۠ۡ") + i6) * 17;
                        i8 = ((iM55680 ^ i7) * 26747) ^ (-1537563213);
                        i9 = -998607759;
                    }
                    break;
                case -1615362391:
                case -988932998:
                    if (!C1048.f81963) {
                        iM55680 = C0873.m55680("֨۠") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM55680 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    }
                    break;
                case -1561466745:
                case 1552980204:
                    C0967.m56074();
                    if (C0946.m55980() != 0) {
                        iM55680 = (i7 - C0873.m55680("ۤۨ")) * (-89);
                        i8 = ((iM55680 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM55680 = C0873.m55680("֨۠") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    }
                    break;
                case -801141069:
                case -775363917:
                    s2 = 772;
                    if (C0863.f81833 <= 0) {
                        iM55680 = C0873.m55680("ܿܿ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        iM55680 = (C0946.m55979("ۜܰ") ^ i6) * 109;
                        i8 = ((iM55680 ^ i7) * (-4329)) ^ 561810798;
                        i9 = 322084303;
                    }
                    break;
                case -709620783:
                case 1456833584:
                    s = sArr[c];
                    i = s * s;
                    if (C1194.m56396() <= 0) {
                        iM55680 = C0873.m55680("ܿܿ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        iM55680 = C0873.m55680("֫ܺ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 9409) ^ (-1229171367);
                        i9 = -1541175344;
                    }
                    break;
                case -528334792:
                case 859905601:
                    if ((s * s2) - i2 <= 0) {
                        iM55680 = C0946.m55979("ܳ֫") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-21307)) ^ (-1249892708);
                        i9 = 185520027;
                    } else {
                        iM55680 = (C0873.m55680("ۨ֡") + i6) * 3;
                        i8 = ((iM55680 ^ i7) * (-3027)) ^ 1030539949;
                        i9 = -2008820124;
                    }
                    break;
                case -219501672:
                case 1858841343:
                    i2 = 148996 + i;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (i7 - C0873.m55680("ۤۨ")) * (-89);
                        i8 = ((iM55680 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۙ") ^ i7) * (-113);
                        i8 = ((iM55680 ^ i6) * 16031) ^ 1893596928;
                        i9 = -1942817516;
                    }
                    break;
                case -154326464:
                case 118199641:
                    if (C1194.f82045 != 0) {
                        iM55680 = (i7 - C0873.m55680("ۤۨ")) * (-89);
                        i8 = ((iM55680 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        iM55680 = C0873.m55680("᩶ܰ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-15979)) ^ (-2030939604);
                        i9 = 473896551;
                    }
                    break;
                case -88865119:
                case 2140834531:
                    return C1025.m56233(sArr2, i4, 10, i3);
                case 111973940:
                case 194544456:
                    c = 448;
                    if (C0927.f81875) {
                        iM55680 = C0873.m55680("֨۠") ^ i7;
                        i8 = ((iM55680 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        iM55680 = (C0873.m55680("ۢܽ") ^ i6) * 21;
                        i8 = ((iM55680 ^ i7) * 13259) ^ 1821707391;
                        i9 = 1213679324;
                    }
                    break;
                case 120601668:
                case 632507061:
                    i3 = 37431;
                    iM55680 = (C0873.m55680("۫֫") ^ i7) * 43;
                    i8 = ((iM55680 ^ i6) * 22049) ^ (-591135280);
                    i9 = 1575520163;
                    break;
                case 287005376:
                case 847334635:
                    if (C1024.f81946) {
                        iM55680 = (C0873.m55680("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((iM55680 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        iM55680 = C0946.m55979("۫ۛ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 20303) ^ 245767219;
                        i9 = 623198190;
                    }
                    break;
                case 557134588:
                case 619425356:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("۠᩷") ^ i6;
                        i8 = ((iM55680 ^ i7) * 17991) ^ 378312645;
                        i9 = -1201371095;
                    } else {
                        iM55680 = (C0946.m55979("᩷ܰ") ^ i6) * (-25);
                        i8 = ((iM55680 ^ i7) * (-12395)) ^ (-1217636707);
                        i9 = -719786038;
                    }
                    break;
                case 917567437:
                case 1616503213:
                    C0866.m55645();
                    ViewOnClickListenerC0939.m55941();
                    iM55680 = C0873.m55680("۠᩷") ^ i6;
                    i8 = ((iM55680 ^ i7) * 17991) ^ 378312645;
                    i9 = -1201371095;
                    break;
                default:
                    C1194.m56396();
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
    /* JADX INFO: renamed from: ֫ */
    public static void m37552(C7741 c7741, C19721 c19721, String str) {
        int iM55979;
        int i;
        int i2;
        int i3;
        int i4;
        int iM55680;
        int i5 = C1404.f82149;
        int i6 = C1229.f82066;
        int iM55681 = (i5 - C0873.m55680("ᩳۜ")) * (-99);
        int i7 = ((iM55681 ^ i6) * (-24471)) ^ 556047534;
        String strM56336 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = iM55681 ^ (-662187982);
        Intent intent = null;
        String strM56016 = null;
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
                    Application applicationM55620 = C0861.m55620();
                    strM56336 = strM56336;
                    if (ServiceConnectionC1013.m56157() > 0) {
                        intent = new Intent(applicationM55620, (Class<?>) ActivityC16573.class);
                        sArr3 = f82227;
                        if (C0854.m55595() >= 0) {
                            intent = intent;
                            iM55979 = (C0873.m55680("ۧ֨") ^ i6) * (-29);
                            i = ((iM55979 ^ i5) * 24427) ^ (-1664767305);
                            i2 = 433504083;
                            intent = intent;
                            i8 = iM55979 ^ i2;
                        } else {
                            int iM559710 = (C0946.m55979("ᩴ۬") + i5) * 59;
                            i = ((iM559710 ^ i6) * (-24709)) ^ 2107237479;
                            i8 = iM559710 ^ (-2027721596);
                        }
                        i7 = i;
                        strM56336 = strM56336;
                    } else {
                        int iM55682 = C0873.m55680("᩺᩻") ^ i5;
                        i8 = iM55682 ^ (-1869981799);
                        i7 = ((iM55682 ^ i6) * (-16075)) ^ (-1726847854);
                        strM56336 = strM56336;
                        intent = null;
                    }
                    break;
                case -2048716413:
                case -461209030:
                    intent = intent;
                    strM56336 = strM56336;
                    sArr = f82227;
                    if (C1012.m56134() <= 0) {
                        iM55979 = (C0873.m55680("ۧ֨") ^ i6) * (-29);
                        i = ((iM55979 ^ i5) * 24427) ^ (-1664767305);
                        i2 = 433504083;
                    } else {
                        iM55979 = (i6 - C0873.m55680("ܰܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM55979 ^ i5) * (-17279)) ^ (-696499174);
                        i2 = 2058435964;
                    }
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case -1898815769:
                case -1221774337:
                    intent = intent;
                    strM56336 = strM56336;
                    int i15 = s + s2;
                    i10 = i15 * i15;
                    i11 = s * s;
                    i12 = 108826624;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("ۗۢ") ^ i6;
                        i = ((iM55979 ^ i5) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                    } else {
                        iM55979 = C0873.m55680("ۡۖ") ^ i6;
                        i = ((iM55979 ^ i5) * 30691) ^ (-1572838285);
                        i2 = 1615047185;
                    }
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case -1787322630:
                case 1199310043:
                    C1017.m56187();
                    break;
                case -1763873318:
                case 1624357061:
                    intent = intent;
                    strM56336 = strM56336;
                    s = sArr[64];
                    s2 = 10432;
                    if (!C0917.f81868) {
                        iM55979 = (C0946.m55979("ۖ۟") ^ i5) * (-125);
                        i = ((iM55979 ^ i6) * (-21967)) ^ 592929664;
                        i2 = -802370400;
                        intent = intent;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                        strM56336 = strM56336;
                    } else {
                        int iM55683 = C0873.m55680("᩺᩻") ^ i5;
                        i8 = iM55683 ^ (-1869981799);
                        i7 = ((iM55683 ^ i6) * (-16075)) ^ (-1726847854);
                        strM56336 = strM56336;
                        intent = null;
                    }
                    break;
                case -1708661727:
                case 296507661:
                    C0917.m55843(intent, C1404.m56462(sArr2, 85, 5, i14), str);
                    c7741.m17868(intent);
                    break;
                case -1658608698:
                case 1633078648:
                    strM56336 = C1071.m56336(sArr3, 79, 6, i14);
                    i9 = 2;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0873.m55680("ۡ֨") ^ i5;
                        i4 = ((iM55680 ^ i6) * 9991) ^ (-112051179);
                        i3 = -411486859;
                    } else {
                        iM55680 = (C0873.m55680("᩵۠") + i5) * (-107);
                        i4 = ((iM55680 ^ i6) * (-7749)) ^ (-1804245636);
                        i3 = -1805819896;
                    }
                    i8 = iM55680 ^ i3;
                    i7 = i4;
                    intent = intent;
                    break;
                case -1589008019:
                case 677655776:
                    C0890.m55740();
                    if (!C1048.f81963) {
                        iM55680 = C0873.m55680("ۡ֨") ^ i5;
                        i4 = ((iM55680 ^ i6) * 9991) ^ (-112051179);
                        i3 = -411486859;
                        i8 = iM55680 ^ i3;
                        i7 = i4;
                        intent = intent;
                    } else {
                        intent = intent;
                        strM56336 = strM56336;
                        iM55979 = C0873.m55680("ۗۢ") ^ i6;
                        i = ((iM55979 ^ i5) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                        intent = intent;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                        strM56336 = strM56336;
                    }
                    break;
                case -1334203718:
                case -776752317:
                    intent = intent;
                    strM56336 = strM56336;
                    int i16 = i11 + i12;
                    if ((i16 + i16) - i10 < 0) {
                        iM55979 = (i5 - C0873.m55680("۬ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i6) * 12113) ^ (-1835850748);
                        i2 = 1867068868;
                    } else {
                        iM55979 = C0873.m55680("ܰ᩶") ^ i6;
                        i = ((iM55979 ^ i5) * 16863) ^ (-1691445672);
                        i2 = -498979296;
                    }
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case -1039623385:
                case -159541817:
                    i14 = 58771;
                    iM55979 = C0873.m55680("᩺᩶") ^ i5;
                    i = ((iM55979 ^ i6) * 31349) ^ 32206497;
                    i2 = 901000146;
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case -983921573:
                case 935230651:
                    intent.putExtra(strM56336, i9);
                    sArr2 = f82227;
                    if (C0866.f81837 >= 0) {
                        intent = intent;
                        strM56336 = strM56336;
                        iM55979 = C0873.m55680("۬ܳ") ^ i6;
                        i = ((iM55979 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                        intent = intent;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                        strM56336 = strM56336;
                    } else {
                        int iM55684 = (C0873.m55680("ܺܿ") + i6) * 81;
                        i7 = ((iM55684 ^ i5) * (-29229)) ^ (-1060191108);
                        i8 = iM55684 ^ 1557905729;
                    }
                    break;
                case -845765377:
                case 861128878:
                    if (C1053.f81965 > 0) {
                        strM56336 = strM56336;
                        int iM55685 = C0873.m55680("᩺᩻") ^ i5;
                        i8 = iM55685 ^ (-1869981799);
                        i7 = ((iM55685 ^ i6) * (-16075)) ^ (-1726847854);
                        strM56336 = strM56336;
                        intent = null;
                    } else {
                        intent = intent;
                        strM56336 = strM56336;
                        iM55979 = C0873.m55680("ۗۢ") ^ i6;
                        i = ((iM55979 ^ i5) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                        intent = intent;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                        strM56336 = strM56336;
                    }
                    break;
                case -837107551:
                case 1323629068:
                    C0912.m55833();
                    if (C0912.m55833()) {
                        intent = intent;
                        strM56336 = strM56336;
                        iM55979 = C0873.m55680("۬ܳ") ^ i6;
                        i = ((iM55979 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                        intent = intent;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                        strM56336 = strM56336;
                    }
                    intent = intent;
                    strM56336 = strM56336;
                    iM55979 = C0873.m55680("ۗۢ") ^ i6;
                    i = ((iM55979 ^ i5) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case -780881062:
                case 1404178977:
                    i14 = 57045;
                    iM55979 = C0873.m55680("᩺᩶") ^ i5;
                    i = ((iM55979 ^ i6) * 31349) ^ 32206497;
                    i2 = 901000146;
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case -340490900:
                case 198747360:
                    intent = intent;
                    strM56336 = strM56336;
                    C5178.m11082(ActivityC17874.class, c19721, strM56016);
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("۬ܳ") ^ i6;
                        i = ((iM55979 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                    } else {
                        iM55979 = (C0873.m55680("᩵ۛ") ^ i6) * (-107);
                        i = ((iM55979 ^ i5) * 22055) ^ (-1863656355);
                        i2 = -1877425004;
                    }
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case 745889717:
                case 2092526555:
                    intent = intent;
                    strM56336 = strM56336;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("۬ܳ") ^ i6;
                        i = ((iM55979 ^ i5) * 867) ^ 2064139321;
                        i2 = 280605165;
                    } else {
                        iM55979 = (C0946.m55979("᩻۬") ^ i5) * (-109);
                        i = ((iM55979 ^ i6) * 15739) ^ 1302575049;
                        i2 = 1325149485;
                    }
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                case 1151549412:
                case 1507773556:
                    C1024.m56209();
                    C1404.m56468();
                    intent = intent;
                    strM56336 = strM56336;
                    iM55979 = C0873.m55680("ۗۢ") ^ i6;
                    i = ((iM55979 ^ i5) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
                default:
                    intent = intent;
                    strM56336 = strM56336;
                    strM56016 = C0949.m56016(f82227, 65, 14, i14);
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("ۧ֨") ^ i6) * (-29);
                        i = ((iM55979 ^ i5) * 24427) ^ (-1664767305);
                        i2 = 433504083;
                    } else {
                        iM55979 = (C0873.m55680("ۙ᩸") ^ i6) * 17;
                        i = ((iM55979 ^ i5) * 17909) ^ (-219811688);
                        i2 = -617984104;
                    }
                    intent = intent;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    strM56336 = strM56336;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        C14146 c14146 = null;
        C17143 c17143 = null;
        int i = -461802817;
        int i2 = C1964.f83032;
        int i3 = C1012.f81938;
        int iM55979 = C0946.m55979("ۤ۬") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-3709)) ^ (-728609854);
        int i5 = 1207986969;
        while (true) {
            i = ((((i ^ i2) * 365) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1926708397:
                case 87470913:
                    break;
                case -1631971841:
                case 1523961399:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        iM55979 = (C0946.m55979("֡۬") + i3) * (-95);
                        i4 = ((iM55979 ^ i2) * (-17241)) ^ (-114761841);
                        i5 = -804803136;
                    }
                    break;
                case -1564581652:
                case 1912005292:
                    if (C0917.f81868) {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * (-29);
                        i4 = ((iM55979 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    } else {
                        iM55979 = (i3 - C0946.m55979("֨ۧ")) * (-127);
                        i4 = ((iM55979 ^ i2) * (-25777)) ^ 1202031780;
                        i5 = -609007248;
                    }
                    break;
                case -1421827041:
                case 2118445089:
                    c14146.m32450();
                    iM55979 = (i3 - C0946.m55979("᩶ۡ")) * (-33);
                    i4 = ((iM55979 ^ i2) * 16499) ^ (-47891953);
                    i5 = 1999405563;
                    break;
                case -1008888021:
                case -252544743:
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("᩺᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        iM55979 = C0946.m55979("ܺۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-16083)) ^ 1880200175;
                        i5 = -1420167692;
                    }
                    break;
                case -867607374:
                case -577613390:
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ᩴ᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-23363)) ^ 2130611825;
                        i5 = -2146364010;
                    } else {
                        iM55979 = C0946.m55979("᩺᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    }
                    break;
                case -538549864:
                case 833736727:
                    super.onDestroy();
                    c17143 = this.f48675;
                    if (c17143 != null) {
                        iM55979 = (C0946.m55979("ۨۖ") + i3) * 97;
                        i4 = ((iM55979 ^ i2) * 22171) ^ (-753542557);
                        i5 = -2072843251;
                    } else {
                        iM55979 = C0946.m55979("᩺֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-8081)) ^ (-719337036);
                        i5 = 819367891;
                    }
                    break;
                case -329450478:
                case 1196945731:
                    if (!C0967.m56074()) {
                        iM55979 = (C0946.m55979("ۚ֫") + i2) * 51;
                        i4 = ((iM55979 ^ i3) * (-3711)) ^ 835622563;
                        i5 = -1681801550;
                    } else {
                        iM55979 = C0946.m55979("᩺᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    }
                    break;
                case -322396688:
                case 744997965:
                    C1071.m56343();
                    C1071.m56343();
                    break;
                case -121549240:
                case 1422557456:
                    C1036.m56257();
                    if (C1964.f83032 > 0) {
                        iM55979 = C0946.m55979("ۢۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * (-29);
                        i4 = ((iM55979 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    }
                    break;
                case -48960327:
                case 1469226802:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        iM55979 = C0946.m55979("᩹ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10119)) ^ 271640916;
                        i5 = -1755423376;
                    }
                    break;
                case 225255737:
                case 665087534:
                    C0877.m55696();
                    iM55979 = C0946.m55979("᩺᩸") ^ i3;
                    i4 = ((iM55979 ^ i2) * 23255) ^ (-620145538);
                    i5 = -1720659877;
                    break;
                case 385898926:
                case 934966572:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("۬۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        iM55979 = C0873.m55680("֫ۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 21415) ^ (-967823975);
                        i5 = -625518722;
                    }
                    break;
                case 427338843:
                case 1754524591:
                    c17143.m38856();
                    iM55979 = C0946.m55979("᩺֫") ^ i2;
                    i4 = ((iM55979 ^ i3) * (-8081)) ^ (-719337036);
                    i5 = 819367891;
                    break;
                case 489256115:
                case 2062237132:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("ۢۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        iM55979 = C0873.m55680("ܶ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * 19733) ^ (-59784388);
                        i5 = 338053491;
                    }
                    break;
                case 706462326:
                case 1050134328:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("᩻᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3689)) ^ (-497405293);
                        i5 = 585109521;
                    } else {
                        iM55979 = C0946.m55979("ۢۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    }
                    break;
                case 721101544:
                case 1873001159:
                    c14146 = this.f48669;
                    if (c14146 != null) {
                        iM55979 = C0873.m55680("᩹᩶") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-15811)) ^ 1218241728;
                        i5 = -1633620511;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩶ۡ")) * (-33);
                        i4 = ((iM55979 ^ i2) * 16499) ^ (-47891953);
                        i5 = 1999405563;
                    }
                    break;
                case 889585724:
                case 918326952:
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("᩺᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        iM55979 = C0946.m55979("ۧᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 11095) ^ 2061164580;
                        i5 = 192164278;
                    }
                    break;
                case 1471277409:
                case 1995152856:
                    C0845.m55584();
                    if (C0890.f81849 != 0) {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * (-29);
                        i4 = ((iM55979 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    } else {
                        iM55979 = (C0946.m55979("ۚ֫") + i2) * 51;
                        i4 = ((iM55979 ^ i3) * (-3711)) ^ 835622563;
                        i5 = -1681801550;
                    }
                    break;
                default:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ۢۜ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        iM55979 = C0946.m55979("ܳۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22177)) ^ (-1161552708);
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
        int iM55979;
        int i;
        int i2;
        int i3 = C0863.f81833;
        int i4 = C1124.f82007;
        int iM55680 = (C0873.m55680("ۡ᩺") ^ i3) * 37;
        int i5 = ((iM55680 ^ i4) * 16767) ^ (-2025781879);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55680 ^ 155545947;
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
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = C0946.m55979("ܰۢ") ^ i3;
                        i = ((iM55979 ^ i4) * (-3779)) ^ 1655080680;
                        i2 = 1636432553;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2018075141:
                case -1823832125:
                    sArr = f82227;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = C0946.m55979("ۚۘ") ^ i3;
                        i = ((iM55979 ^ i4) * 25021) ^ 2026651400;
                        i2 = 1823030689;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1911988616:
                case -199730823:
                    C0930.m55885();
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = C0946.m55979("ܺܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 14493) ^ (-1508558851);
                        i2 = -9575674;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1626543040:
                case -710503021:
                    i11 = 28062;
                    iM55979 = (C0946.m55979("ܿܶ") + i3) * 59;
                    i = ((iM55979 ^ i4) * 25303) ^ (-2034499338);
                    i2 = -1635167001;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1621328726:
                case 1568086913:
                    C1046.m56302();
                    iM55979 = C0873.m55680("۫۟") ^ i3;
                    i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                    i2 = -1446093635;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1358064763:
                case -238732034:
                    intent = new Intent();
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("ܺܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 14493) ^ (-1508558851);
                        i2 = -9575674;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۫ۛ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i4) * 23677) ^ (-1954607210);
                        i2 = 22662433;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1327454953:
                case -143298825:
                    intent.putExtra(C0927.m55863(sArr2, i12, i13, i11), m37559());
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0873.m55680("᩶ᩳ") + i4) * (-71);
                        i = ((iM55979 ^ i3) * 4665) ^ 1632940300;
                        i2 = -1161662708;
                    } else {
                        iM55979 = C0946.m55979("᩸ܽ") ^ i4;
                        i = ((iM55979 ^ i3) * (-26413)) ^ (-1490120105);
                        i2 = -1372124967;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1322925336:
                case 1376148839:
                    C1071.m56343();
                    break;
                case -1302326618:
                case 2036489242:
                    i10 = 298978681;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = (C0946.m55979("᩹۬") + i4) * 79;
                        i = ((iM55979 ^ i3) * 15831) ^ 1299555516;
                        i2 = 911440358;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1143767134:
                case 731246726:
                    i7 = s + 17291;
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("᩶ᩳ") + i4) * (-71);
                        i = ((iM55979 ^ i3) * 4665) ^ 1632940300;
                        i2 = -1161662708;
                    } else {
                        iM55979 = C0873.m55680("ᩳ۟") ^ i3;
                        i = ((iM55979 ^ i4) * 25849) ^ 1696484717;
                        i2 = -1633244897;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -656590844:
                case 992778219:
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = (C0946.m55979("᩹᩻") + i3) * 65;
                        i = ((iM55979 ^ i4) * (-6829)) ^ 472214391;
                        i2 = 165937506;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -420709151:
                case 1444569595:
                    super.finish();
                    break;
                case -410630341:
                case 1151800772:
                    C1025.m56230();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = (C0946.m55979("ۢ֫") + i4) * 29;
                        i = ((iM55979 ^ i3) * 13573) ^ 1026299018;
                        i2 = 126501348;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -116721400:
                case -30462464:
                    sArr2 = f82227;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ܺܶ") ^ i3;
                        i = ((iM55979 ^ i4) * 14493) ^ (-1508558851);
                        i2 = -9575674;
                    } else {
                        iM55979 = (C0873.m55680("ۗ֡") + i4) * (-85);
                        i = ((iM55979 ^ i3) * (-29207)) ^ 1366725205;
                        i2 = 931979627;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 55649488:
                case 1423965021:
                    int i15 = i9 + i10;
                    if ((i15 + i15) - i8 < 0) {
                        iM55979 = (C0946.m55979("ۨ۟") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55979 ^ i3) * 3787) ^ (-214873415);
                        i2 = 434557980;
                    } else {
                        iM55979 = C0873.m55680("֫ܿ") ^ i3;
                        i = ((iM55979 ^ i4) * 18513) ^ (-1403039343);
                        i2 = -2014897739;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 255313973:
                case 1124275019:
                    setResult(1, intent);
                    iM55979 = (i4 - C0946.m55979("ܰۨ")) * (-73);
                    i = ((iM55979 ^ i3) * 643) ^ (-1883939870);
                    i2 = -1117440952;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 551848751:
                case 1897858896:
                    if (this.f48672) {
                        iM55979 = C0946.m55979("۫ۡ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30569)) ^ (-756236933);
                        i2 = 485671423;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ܰۨ")) * (-73);
                        i = ((iM55979 ^ i3) * 643) ^ (-1883939870);
                        i2 = -1117440952;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 640959137:
                case 649175364:
                    s = sArr[c];
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("᩹᩻") + i3) * 65;
                        i = ((iM55979 ^ i4) * (-6829)) ^ 472214391;
                        i2 = 165937506;
                    } else {
                        iM55979 = (C0873.m55680("᩻ܽ") ^ i4) * (-5);
                        i = ((iM55979 ^ i3) * 31759) ^ 1959112590;
                        i2 = 1986953521;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 693966430:
                case 1950524830:
                    c = 'o';
                    if (C0917.f81868) {
                        iM55979 = (C0873.m55680("᩶ᩳ") + i4) * (-71);
                        i = ((iM55979 ^ i3) * 4665) ^ 1632940300;
                        i2 = -1161662708;
                    } else {
                        iM55979 = (C0946.m55979("ܰ֨") ^ i4) * 11;
                        i = ((iM55979 ^ i3) * 25889) ^ 1939047009;
                        i2 = 391195812;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 738022574:
                case 1376799164:
                    i11 = 51398;
                    iM55979 = (C0946.m55979("ܿܶ") + i3) * 59;
                    i = ((iM55979 ^ i4) * 25303) ^ (-2034499338);
                    i2 = -1635167001;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    i12 = UMErrorCode.E_UM_BE_DEFLATE_FAILED;
                    i13 = 4;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("۫۟") ^ i3;
                        i = ((iM55979 ^ i4) * 18127) ^ (-900616175);
                        i2 = -1446093635;
                    } else {
                        iM55979 = C0873.m55680("֡ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * (-19577)) ^ 2089996051;
                        i2 = -1475652747;
                    }
                    i6 = iM55979 ^ i2;
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
    
        if (p067l.C1003.f81929 > 0) goto L14;
     */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int iM55979;
        int i;
        int i2;
        C14677 c14677;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int iM55682;
        int i6;
        int i7;
        C19721 c19721;
        boolean z;
        short[] sArr;
        C17143 c17143;
        C19721 c19722;
        C17143 c17144;
        int i8;
        C17143 c17145;
        boolean z2;
        int iM559710;
        int i9;
        int i10;
        int i11;
        int iM559711;
        int i12;
        int i13;
        int iM559712;
        int i14;
        int i15;
        int iM55683;
        int i16;
        int iM559713;
        int i17;
        bundle = bundle;
        int i18 = -1626752940;
        int i19 = C1124.f82007;
        int i20 = C0906.f81862;
        int iM559714 = (i19 - C0946.m55979("ۚ᩵")) * (-79);
        int i21 = ((iM559714 ^ i20) * 22423) ^ (-751157885);
        int i22 = iM559714 ^ 1567861515;
        C14146 c14146 = null;
        Intent intentM56311 = null;
        C17143 c17146 = null;
        InterfaceC14100 interfaceC14100 = null;
        String str = null;
        short[] sArr2 = null;
        int i23 = 0;
        boolean z3 = false;
        int iM559715 = 0;
        int i24 = 0;
        int i25 = 0;
        C17143 c17147 = null;
        String strM56175 = null;
        Intent intentM55991 = null;
        C19721 c19723 = null;
        short[] sArr3 = null;
        boolean z4 = false;
        String str2 = null;
        C14677 c14678 = null;
        C14677 c14679 = null;
        byte[] bArr = null;
        byte[] bArrM16900 = null;
        TextView textViewM37071 = null;
        String strM56092 = null;
        int intExtra = 0;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i20) * 15917) >> 31));
            switch (i18) {
                case -2139419769:
                case -1023552034:
                    c19722 = c19723;
                    c17145 = c17146;
                    C14677 c146710 = c14678;
                    c14679 = c14679;
                    c14677 = c146710;
                    c17145.m38838(str2);
                    z2 = z4;
                    this.f48668 = C0947.m55991(this).getBooleanExtra(C0892.m55750(f82227, 190, 13, i23), z2);
                    intentM55991 = C0947.m55991(this);
                    if (C1025.f81947 >= 0) {
                        iM559710 = C0946.m55979("᩷ܳ") ^ i20;
                        i9 = ((iM559710 ^ i19) * 29031) ^ 563056917;
                        i10 = 1024512247;
                    } else {
                        iM559710 = (i20 - C0946.m55979("ۖ᩻")) * 69;
                        i9 = ((iM559710 ^ i19) * (-11003)) ^ 1624150316;
                        i10 = -900989582;
                    }
                    i8 = iM559710 ^ i10;
                    c17146 = c17145;
                    i21 = i9;
                    z4 = z2;
                    c19723 = c19722;
                    i22 = i8;
                    bundle = bundle;
                    C14677 c146711 = c14679;
                    c14678 = c14677;
                    c14679 = c146711;
                    break;
                case -2032111767:
                case -1848165857:
                    RunnableC0938.m55938();
                    if (C1048.f81963) {
                        iM55979 = C0873.m55680("ܳ֡") ^ i19;
                        i = ((iM55979 ^ i20) * 7625) ^ (-1648175783);
                        i2 = -1086196391;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩶") ^ i19) * (-101);
                        i = ((iM55979 ^ i20) * 27945) ^ 367008840;
                        i2 = 803067359;
                    }
                    i22 = iM55979 ^ i2;
                    i21 = i;
                    break;
                case -2009628646:
                case -1281824221:
                    C1964.m56598(this.f48669, new C2628(str));
                    break;
                case -2001895713:
                case 1707285362:
                    super.finish();
                    break;
                case -1903924775:
                case -1222382191:
                    C1053.m56327();
                    break;
                case -1902056000:
                case -1014651443:
                    c19723 = c19723;
                    C14677 c146712 = c14678;
                    c14679 = c14679;
                    c14677 = c146712;
                    strM56092 = C0989.m56092(f82227, 244, 12, i23);
                    if (C7323.m16899(bundle, strM56092)) {
                        iM559711 = (i20 - C0873.m55680("᩹ܺ")) * 95;
                        i12 = ((iM559711 ^ i19) * (-27343)) ^ 1983309670;
                        i13 = 360290094;
                    } else {
                        iM559711 = (C0946.m55979("᩶᩶") ^ i20) * (-69);
                        i12 = ((iM559711 ^ i19) * 5941) ^ 1878300457;
                        i13 = 2104282656;
                    }
                    C19721 c19724 = c19723;
                    i22 = iM559711 ^ i13;
                    i21 = i12;
                    c19723 = c19724;
                    C14677 c146713 = c14679;
                    c14678 = c14677;
                    c14679 = c146713;
                    break;
                case -1858793033:
                case 1532989989:
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    iM559715 = iM559715;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    textViewM37071 = textViewM37071;
                    C14677 c146714 = c14678;
                    c14679 = c14679;
                    c14677 = c146714;
                    short s = f82227[116];
                    int i26 = (s * s) + 284495689;
                    int i27 = s + 16867;
                    if ((i27 * i27) - (i26 + i26) > 0) {
                        iM55680 = (C0946.m55979("ۚ᩷") + i20) * 81;
                        i3 = ((iM55680 ^ i19) * (-29777)) ^ (-887054704);
                        i4 = -666250121;
                    } else {
                        iM55680 = C0873.m55680("ܿۤ") ^ i19;
                        i3 = ((iM55680 ^ i20) * (-16171)) ^ (-455342962);
                        i4 = -1874493674;
                    }
                    i7 = iM55680 ^ i4;
                    iM559715 = iM559715;
                    textViewM37071 = textViewM37071;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c17146 = c17146;
                    str = str;
                    z4 = z4;
                    C14677 c146715 = c14679;
                    c14678 = c14677;
                    c14679 = c146715;
                    break;
                case -1843700416:
                case -591586955:
                    if (C1003.f81929 > 0) {
                        iM55979 = C0946.m55979("ᩳۛ") ^ i19;
                        i = ((iM55979 ^ i20) * (-31967)) ^ (-1082308033);
                        i2 = -286151950;
                        i22 = iM55979 ^ i2;
                        i21 = i;
                    } else {
                        c19722 = c19723;
                        c17144 = c17146;
                        C14677 c146716 = c14678;
                        c14679 = c14679;
                        c14677 = c146716;
                        int iM55684 = (i20 - C0873.m55680("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i28 = ((iM55684 ^ i19) * (-26763)) ^ (-156291116);
                        i8 = iM55684 ^ (-1092488166);
                        c17146 = c17144;
                        i21 = i28;
                        c19723 = c19722;
                        i22 = i8;
                        bundle = bundle;
                        C14677 c146717 = c14679;
                        c14678 = c14677;
                        c14679 = c146717;
                    }
                    break;
                case -1704769799:
                case -159048968:
                    if (C1929.f83011 == 0) {
                        str = str;
                        c19723 = c19723;
                        z3 = z3;
                        iM559715 = iM559715;
                        z4 = z4;
                        c17146 = c17146;
                        strM56092 = strM56092;
                        textViewM37071 = textViewM37071;
                        C14677 c146718 = c14678;
                        c14679 = c14679;
                        c14677 = c146718;
                        iM55680 = (i20 - C0873.m55680("ܺ۫")) * 17;
                        i3 = ((iM55680 ^ i19) * 3495) ^ (-283401538);
                        i4 = 1411486444;
                        i7 = iM55680 ^ i4;
                        iM559715 = iM559715;
                        textViewM37071 = textViewM37071;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        z3 = z3;
                        i22 = i7;
                        i21 = i3;
                        c17146 = c17146;
                        str = str;
                        z4 = z4;
                        C14677 c146719 = c14679;
                        c14678 = c14677;
                        c14679 = c146719;
                    }
                    c19721 = c19723;
                    z = z4;
                    c17143 = c17146;
                    sArr = sArr2;
                    C14677 c146720 = c14678;
                    c14679 = c14679;
                    c14677 = c146720;
                    iM559713 = (C0946.m55979("᩷ۚ") + i20) * 99;
                    i21 = ((iM559713 ^ i19) * (-28701)) ^ (-101361958);
                    i17 = -1175935286;
                    int i29 = iM559713 ^ i17;
                    sArr2 = sArr;
                    c17146 = c17143;
                    c19723 = c19721;
                    i22 = i29;
                    z4 = z;
                    bundle = bundle;
                    C14677 c1467110 = c14679;
                    c14678 = c14677;
                    c14679 = c1467110;
                    break;
                case -1684962609:
                case 11374542:
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    textViewM37071 = textViewM37071;
                    C14677 c146721 = c14678;
                    c14679 = c14679;
                    c14677 = c146721;
                    super.onCreate(bundle);
                    m12250();
                    C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    AbstractC0868 c2491 = new C2491(this);
                    RunnableC1014.m56165(onBackPressedDispatcher);
                    onBackPressedDispatcher.m30940(c2491);
                    iM559715 = C0946.m55979(C0854.m55597(f82227, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i23)) ^ 2123082943;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55681 = (C0946.m55979("۫ᩳ") + i19) * 9;
                        i21 = ((iM55681 ^ i20) * 3513) ^ (-1136830147);
                        i5 = -862200370;
                    } else {
                        iM55681 = (C0873.m55680("ۘۖ") ^ i20) * (-67);
                        i21 = ((iM55681 ^ i19) * 7201) ^ 1856648921;
                        i5 = 254434565;
                    }
                    i11 = iM55681 ^ i5;
                    textViewM37071 = textViewM37071;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c17146 = c17146;
                    z4 = z4;
                    C14677 c1467111 = c14679;
                    c14678 = c14677;
                    c14679 = c1467111;
                    break;
                case -1495005906:
                case -1429206905:
                    c19723 = c19723;
                    C14677 c146722 = c14678;
                    c14679 = c14679;
                    c14677 = c146722;
                    if (intExtra != z3) {
                        iM559711 = (i19 - C0873.m55680("ܿۨ")) * (-35);
                        i12 = ((iM559711 ^ i20) * 17789) ^ 1475699543;
                        i13 = -242292352;
                    } else {
                        iM559711 = C0946.m55979("ۛ᩺") ^ i20;
                        i12 = ((iM559711 ^ i19) * (-30113)) ^ (-718690291);
                        i13 = 1650118138;
                    }
                    C19721 c19725 = c19723;
                    i22 = iM559711 ^ i13;
                    i21 = i12;
                    c19723 = c19725;
                    C14677 c1467112 = c14679;
                    c14678 = c14677;
                    c14679 = c1467112;
                    break;
                case -1490758571:
                case -832704624:
                    super.finish();
                    break;
                case -1472225171:
                case 142015296:
                    if (C0967.f81910 < 0) {
                        str = str;
                        c19723 = c19723;
                        z3 = z3;
                        z4 = z4;
                        c17146 = c17146;
                        strM56092 = strM56092;
                        C14677 c146723 = c14678;
                        c14679 = c14679;
                        c14677 = c146723;
                        iM55682 = C0873.m55680("۠ۘ") ^ i19;
                        i21 = ((iM55682 ^ i20) * (-2583)) ^ (-2072005550);
                        i6 = 2095104432;
                        i11 = iM55682 ^ i6;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c17146 = c17146;
                        z4 = z4;
                        C14677 c1467113 = c14679;
                        c14678 = c14677;
                        c14679 = c1467113;
                    }
                    c19722 = c19723;
                    c17144 = c17146;
                    C14677 c1467114 = c14678;
                    c14679 = c14679;
                    c14677 = c1467114;
                    int iM55685 = (i20 - C0873.m55680("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    int i210 = ((iM55685 ^ i19) * (-26763)) ^ (-156291116);
                    i8 = iM55685 ^ (-1092488166);
                    c17146 = c17144;
                    i21 = i210;
                    c19723 = c19722;
                    i22 = i8;
                    bundle = bundle;
                    C14677 c1467115 = c14679;
                    c14678 = c14677;
                    c14679 = c1467115;
                    break;
                case -1462872363:
                case -57256394:
                    if (!C0947.f81895) {
                        iM55979 = (C0873.m55680("ۨ᩶") ^ i19) * (-101);
                        i = ((iM55979 ^ i20) * 27945) ^ 367008840;
                        i2 = 803067359;
                        i22 = iM55979 ^ i2;
                        i21 = i;
                    } else {
                        str = str;
                        c19723 = c19723;
                        z3 = z3;
                        z4 = z4;
                        c17146 = c17146;
                        strM56092 = strM56092;
                        C14677 c146724 = c14678;
                        c14679 = c14679;
                        c14677 = c146724;
                        iM55682 = C0946.m55979("ܿ֨") ^ i20;
                        i21 = ((iM55682 ^ i19) * 4519) ^ 1416770523;
                        i6 = 562837947;
                        i11 = iM55682 ^ i6;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c17146 = c17146;
                        z4 = z4;
                        C14677 c1467116 = c14679;
                        c14678 = c14677;
                        c14679 = c1467116;
                    }
                    break;
                case -1398200695:
                case -1391468746:
                    c19723 = c19723;
                    C14677 c146725 = c14678;
                    c14679 = c14679;
                    c14677 = c146725;
                    intExtra = intentM56311.getIntExtra(ViewOnClickListenerC0939.m55947(f82227, 238, 6, i23), -1);
                    if (intExtra != 0) {
                        iM559711 = C0946.m55979("ۛ۟") ^ i19;
                        i12 = ((iM559711 ^ i20) * 2711) ^ (-2140314495);
                        i13 = 1206383540;
                    } else {
                        iM559711 = (C0873.m55680("᩹۫") ^ i20) * (-43);
                        i12 = ((iM559711 ^ i19) * (-32305)) ^ 506365402;
                        i13 = 1178425682;
                    }
                    C19721 c19726 = c19723;
                    i22 = iM559711 ^ i13;
                    i21 = i12;
                    c19723 = c19726;
                    C14677 c1467117 = c14679;
                    c14678 = c14677;
                    c14679 = c1467117;
                    break;
                case -1314017229:
                case 748911640:
                    super.finish();
                    break;
                case -1169890305:
                case 715725598:
                    c14677 = c14678;
                    i23 = 11356;
                    iM55680 = C0946.m55979("᩻ۧ") ^ i19;
                    i3 = ((iM55680 ^ i20) * 16587) ^ 716552081;
                    i4 = -308702123;
                    i7 = iM55680 ^ i4;
                    iM559715 = iM559715;
                    textViewM37071 = textViewM37071;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c17146 = c17146;
                    str = str;
                    z4 = z4;
                    C14677 c1467118 = c14679;
                    c14678 = c14677;
                    c14679 = c1467118;
                    break;
                case -938190153:
                case 334862128:
                    this.f48678 = z3;
                    C1964.m56598(this.f48669, new C2628(C1053.m56320(c19723.f59999, C0898.m55792(f82227, 302, 54, i23), "")));
                    this.f48673 = (byte) c19723.f59998;
                    break;
                case -911884945:
                case -428738984:
                    c19723 = c19723;
                    C14677 c146726 = c14678;
                    c14679 = c14679;
                    c14677 = c146726;
                    bArrM16900 = C7323.m16900(bundle, strM56092);
                    if (bArrM16900 == null) {
                        iM559711 = (C0946.m55979("ܶᩴ") + i20) * (-125);
                        i12 = ((iM559711 ^ i19) * 31727) ^ 29827826;
                        i13 = -537623622;
                    } else {
                        iM559711 = (i19 - C0873.m55680("ܿ۬")) * (-125);
                        i12 = ((iM559711 ^ i20) * (-29385)) ^ 717159976;
                        i13 = 665570758;
                    }
                    C19721 c19727 = c19723;
                    i22 = iM559711 ^ i13;
                    i21 = i12;
                    c19723 = c19727;
                    C14677 c1467119 = c14679;
                    c14678 = c14677;
                    c14679 = c1467119;
                    break;
                case -878358474:
                case -781778829:
                    C0989.m56095();
                    break;
                case -850225874:
                case 1283091390:
                    C14677 c146727 = c14678;
                    c14679 = c14679;
                    c14677 = c146727;
                    c19723 = c19723;
                    bArr = (byte[]) C5178.m11081(C1964.m56584(f82227, BottomAppBarTopEdgeTreatment.ANGLE_UP, 15, i23));
                    if (bArr == null) {
                        iM559711 = (i19 - C0946.m55979("۠ۗ")) * (-39);
                        i12 = ((iM559711 ^ i20) * 14619) ^ (-189748932);
                        i13 = 850806431;
                    } else {
                        iM559711 = C0946.m55979("ۗۖ") ^ i20;
                        i12 = ((iM559711 ^ i19) * 7361) ^ (-163068696);
                        i13 = -1301386867;
                    }
                    C19721 c19728 = c19723;
                    i22 = iM559711 ^ i13;
                    i21 = i12;
                    c19723 = c19728;
                    C14677 c14671110 = c14679;
                    c14678 = c14677;
                    c14679 = c14671110;
                    break;
                case -804730155:
                case 503467727:
                    this.f48669.mo27918(c14678);
                    break;
                case -792293088:
                case -414381333:
                    c19723 = c19723;
                    C14677 c146728 = c14678;
                    c14679 = c14679;
                    c14677 = c146728;
                    this.f48674 = C1053.m56333(interfaceC14100, C0992.m56102(sArr3, 214, 24, i23), null);
                    C14146 c14147 = this.f48669;
                    if (C0930.f81879 > 0) {
                        c14147.m32398(new C7186(strM56175));
                        this.f48670 = ViewOnClickListenerC20541.m46366(this, new InterfaceC24424() { // from class: l.ᩴۖᩳ
                            @Override // p067l.InterfaceC24424
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // p067l.InterfaceC24424
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo10533(String str3) {
                                int i30 = ActivityC16573.f48667;
                                new C9868(this.f60496, str3).m22250();
                            }
                        });
                        this.f48669.m32471(z3);
                        if (bundle != null) {
                            iM559711 = C0946.m55979("۬᩶") ^ i19;
                            i12 = ((iM559711 ^ i20) * (-29533)) ^ 1045962799;
                            i13 = 1670855837;
                        } else {
                            iM559711 = (C0946.m55979("᩶᩶") ^ i20) * (-69);
                            i12 = ((iM559711 ^ i19) * 5941) ^ 1878300457;
                            i13 = 2104282656;
                        }
                        C19721 c19729 = c19723;
                        i22 = iM559711 ^ i13;
                        i21 = i12;
                        c19723 = c19729;
                        C14677 c14671111 = c14679;
                        c14678 = c14677;
                        c14679 = c14671111;
                    } else {
                        str = str;
                        z3 = z3;
                        iM559715 = iM559715;
                        z4 = z4;
                        c17146 = c17146;
                        strM56092 = strM56092;
                        textViewM37071 = textViewM37071;
                        iM55680 = (i20 - C0873.m55680("ܺ۫")) * 17;
                        i3 = ((iM55680 ^ i19) * 3495) ^ (-283401538);
                        i4 = 1411486444;
                        i7 = iM55680 ^ i4;
                        iM559715 = iM559715;
                        textViewM37071 = textViewM37071;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        z3 = z3;
                        i22 = i7;
                        i21 = i3;
                        c17146 = c17146;
                        str = str;
                        z4 = z4;
                        C14677 c14671112 = c14679;
                        c14678 = c14677;
                        c14679 = c14671112;
                    }
                    break;
                case -605738905:
                case 2104670404:
                    c14677 = c14678;
                    i23 = 1190;
                    iM55680 = C0946.m55979("᩻ۧ") ^ i19;
                    i3 = ((iM55680 ^ i20) * 16587) ^ 716552081;
                    i4 = -308702123;
                    i7 = iM55680 ^ i4;
                    iM559715 = iM559715;
                    textViewM37071 = textViewM37071;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c17146 = c17146;
                    str = str;
                    z4 = z4;
                    C14677 c14671113 = c14679;
                    c14678 = c14677;
                    c14679 = c14671113;
                    break;
                case -550344513:
                case -375922173:
                    c19723 = c19723;
                    C14677 c146729 = c14678;
                    c14679 = c14679;
                    c14677 = c146729;
                    str = (String) C5178.m11081(C0989.m56092(f82227, 256, 14, i23));
                    if (str == null) {
                        iM559711 = C0946.m55979("ܿ۟") ^ i19;
                        i12 = ((iM559711 ^ i20) * (-18925)) ^ 2125264921;
                        i13 = 1704638728;
                    } else {
                        iM559711 = C0946.m55979("ۡ᩻") ^ i20;
                        i12 = ((iM559711 ^ i19) * (-31019)) ^ (-446128249);
                        i13 = 658495883;
                    }
                    C19721 c197210 = c19723;
                    i22 = iM559711 ^ i13;
                    i21 = i12;
                    c19723 = c197210;
                    C14677 c14671114 = c14679;
                    c14678 = c14677;
                    c14679 = c14671114;
                    break;
                case -436189829:
                case 1337130351:
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    C14677 c146730 = c14678;
                    c14679 = c14679;
                    c14677 = c146730;
                    C0866.m55649(this);
                    RunnableC1014.m56172(this.f13392, new ViewOnClickListenerC17163(1, this));
                    C0947.m55996(this.f13392, new ViewOnClickListenerC5845(this, 0));
                    textViewM37071 = C16267.m37071(this.f13392);
                    if (C0861.f81831) {
                        iM55682 = C0873.m55680("᩺֨") ^ i20;
                        i21 = ((iM55682 ^ i19) * (-21199)) ^ 1349452678;
                        i6 = -684376571;
                    } else {
                        iM55682 = C0873.m55680("۠ۘ") ^ i19;
                        i21 = ((iM55682 ^ i20) * (-2583)) ^ (-2072005550);
                        i6 = 2095104432;
                    }
                    i11 = iM55682 ^ i6;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c17146 = c17146;
                    z4 = z4;
                    C14677 c14671115 = c14679;
                    c14678 = c14677;
                    c14679 = c14671115;
                    break;
                case -413981396:
                case 903602477:
                    c19723 = c19723;
                    C14677 c146731 = c14678;
                    c14679 = c14679;
                    c14677 = c146731;
                    this.f48671 = RunnableC1014.m56175(intentM55991, C0992.m56102(f82227, 203, 11, i23));
                    interfaceC14100 = ApplicationC21448.f67649;
                    sArr3 = f82227;
                    if (C1053.f81965 > 0) {
                        iM559711 = C0946.m55979("ۛᩳ") ^ i19;
                        i12 = ((iM559711 ^ i20) * 9427) ^ (-1328972025);
                        i13 = 175817796;
                        C19721 c197211 = c19723;
                        i22 = iM559711 ^ i13;
                        i21 = i12;
                        c19723 = c197211;
                        C14677 c14671116 = c14679;
                        c14678 = c14677;
                        c14679 = c14671116;
                    } else {
                        str = str;
                        z3 = z3;
                        z4 = z4;
                        c17146 = c17146;
                        strM56092 = strM56092;
                        textViewM37071 = textViewM37071;
                        iM55681 = (C0946.m55979("۫ᩳ") + i19) * 9;
                        i21 = ((iM55681 ^ i20) * 3513) ^ (-1136830147);
                        i5 = -862200370;
                        i11 = iM55681 ^ i5;
                        textViewM37071 = textViewM37071;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c17146 = c17146;
                        z4 = z4;
                        C14677 c14671117 = c14679;
                        c14678 = c14677;
                        c14679 = c14671117;
                    }
                    break;
                case -374674683:
                case 1013653495:
                    c19721 = c19723;
                    z = z4;
                    sArr = sArr2;
                    C14677 c146732 = c14678;
                    c14679 = c14679;
                    c14677 = c146732;
                    c17143 = c17146;
                    c17147.m38839(RunnableC0897.m55783(f82227, 130, 21, i23), true);
                    int iM55686 = C0873.m55680(C0877.m55707(f82227, 151, 3, i23));
                    i25 = 2098852048;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        i24 = iM55686;
                        z3 = true;
                        iM559713 = (C0946.m55979("᩷ۚ") + i20) * 99;
                        i21 = ((iM559713 ^ i19) * (-28701)) ^ (-101361958);
                        i17 = -1175935286;
                        int i211 = iM559713 ^ i17;
                        sArr2 = sArr;
                        c17146 = c17143;
                        c19723 = c19721;
                        i22 = i211;
                        z4 = z;
                        bundle = bundle;
                    } else {
                        int iM559716 = (C0946.m55979("ܳۙ") + i20) * 21;
                        i24 = iM55686;
                        sArr2 = sArr;
                        c17146 = c17143;
                        c19723 = c19721;
                        bundle = bundle;
                        i22 = iM559716 ^ 1850620928;
                        i21 = ((iM559716 ^ i19) * (-25179)) ^ (-2104059851);
                        z4 = z;
                        z3 = true;
                    }
                    C14677 c14671118 = c14679;
                    c14678 = c14677;
                    c14679 = c14671118;
                    break;
                case -328181014:
                case 898100229:
                    c19722 = c19723;
                    c17144 = c17146;
                    C14677 c146733 = c14678;
                    c14679 = c14679;
                    c14677 = c146733;
                    C0898.m55802(C0890.m55736(this, i24 ^ i25), 8);
                    intentM56311 = C1048.m56311(this);
                    this.f48672 = intentM56311.getBooleanExtra(C1044.m56276(f82227, EnumC19222.f57460, 17, i23), false);
                    sArr2 = f82227;
                    if (C0854.f81826 != 0) {
                        z4 = false;
                        int iM55687 = (i20 - C0873.m55680("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i212 = ((iM55687 ^ i19) * (-26763)) ^ (-156291116);
                        i8 = iM55687 ^ (-1092488166);
                        c17146 = c17144;
                        i21 = i212;
                        c19723 = c19722;
                    } else {
                        int iM559717 = C0946.m55979("᩻ۢ") ^ i19;
                        int i30 = ((iM559717 ^ i20) * 12687) ^ (-1010534766);
                        i8 = iM559717 ^ 480719199;
                        c17146 = c17144;
                        i21 = i30;
                        c19723 = c19722;
                        z4 = false;
                    }
                    i22 = i8;
                    bundle = bundle;
                    C14677 c14671119 = c14679;
                    c14678 = c14677;
                    c14679 = c14671119;
                    break;
                case -301083649:
                case 209522986:
                    super.finish();
                    break;
                case -58993829:
                case 1383477696:
                    C0890.m55740();
                    if (C1046.f81962 > 0) {
                        c19722 = c19723;
                        z2 = z4;
                        c17145 = c17146;
                        C14677 c146734 = c14678;
                        c14679 = c14679;
                        c14677 = c146734;
                        iM559710 = C0946.m55979("᩷ܳ") ^ i20;
                        i9 = ((iM559710 ^ i19) * 29031) ^ 563056917;
                        i10 = 1024512247;
                        i8 = iM559710 ^ i10;
                        c17146 = c17145;
                        i21 = i9;
                        z4 = z2;
                        c19723 = c19722;
                        i22 = i8;
                        bundle = bundle;
                        C14677 c146711110 = c14679;
                        c14678 = c14677;
                        c14679 = c146711110;
                    }
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    C14677 c1467210 = c14678;
                    c14679 = c14679;
                    c14677 = c1467210;
                    iM55682 = C0946.m55979("ܿ֨") ^ i20;
                    i21 = ((iM55682 ^ i19) * 4519) ^ 1416770523;
                    i6 = 562837947;
                    i11 = iM55682 ^ i6;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c17146 = c17146;
                    z4 = z4;
                    C14677 c146711111 = c14679;
                    c14678 = c14677;
                    c14679 = c146711111;
                    break;
                case 63287405:
                case 1439081830:
                    C1071.m56343();
                    if (!C0949.m56012()) {
                        c19722 = c19723;
                        c17144 = c17146;
                        C14677 c14671120 = c14678;
                        c14679 = c14679;
                        c14677 = c14671120;
                        int iM55688 = (i20 - C0873.m55680("ۗܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        int i213 = ((iM55688 ^ i19) * (-26763)) ^ (-156291116);
                        i8 = iM55688 ^ (-1092488166);
                        c17146 = c17144;
                        i21 = i213;
                        c19723 = c19722;
                        i22 = i8;
                        bundle = bundle;
                        C14677 c146711112 = c14679;
                        c14678 = c14677;
                        c14679 = c146711112;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩶") ^ i19) * (-101);
                        i = ((iM55979 ^ i20) * 27945) ^ 367008840;
                        i2 = 803067359;
                        i22 = iM55979 ^ i2;
                        i21 = i;
                    }
                    break;
                case 179398044:
                case 204862283:
                    C14677 c146735 = c14679;
                    c14677 = c14678;
                    c14679 = c146735;
                    c19723 = (C19721) C5178.m11081(C0930.m55893(f82227, 288, 14, i23));
                    if (c19723 == null) {
                        iM559712 = (C0946.m55979("ۗܽ") ^ i19) * (-121);
                        i14 = ((iM559712 ^ i20) * (-15443)) ^ (-501360279);
                        i15 = 785890151;
                    } else {
                        iM559712 = (C0873.m55680("ۢ֨") ^ i20) * (-93);
                        i14 = ((iM559712 ^ i19) * 4633) ^ 641118455;
                        i15 = 2047197591;
                    }
                    i22 = iM559712 ^ i15;
                    i21 = i14;
                    C14677 c146711113 = c14679;
                    c14678 = c14677;
                    c14679 = c146711113;
                    break;
                case 187533464:
                case 768330131:
                    c14677 = c14678;
                    C14677 c14677M33572 = C14677.m33572(bArrM16900);
                    boolean zM56323 = C1053.m56323(c14677M33572);
                    this.f48678 = zM56323;
                    if (!zM56323) {
                        c14679 = c14677M33572;
                        iM559712 = (C0873.m55680("۫ۚ") ^ i20) * (-75);
                        i14 = ((iM559712 ^ i19) * 30963) ^ 1057271676;
                        i15 = -882931687;
                        i22 = iM559712 ^ i15;
                        i21 = i14;
                        C14677 c146711114 = c14679;
                        c14678 = c14677;
                        c14679 = c146711114;
                    } else {
                        iM55683 = (C0873.m55680("᩺۫") ^ i19) * 47;
                        c14679 = c14677M33572;
                        i21 = ((iM55683 ^ i20) * 22995) ^ (-1362939987);
                        i16 = -146447539;
                        i22 = iM55683 ^ i16;
                        C14677 c146711115 = c14679;
                        c14678 = c14677;
                        c14679 = c146711115;
                    }
                    break;
                case 377098713:
                case 2077523063:
                    C14677 c146736 = c14678;
                    this.f48673 = C1194.m56384(c14679);
                    c14679 = c14679;
                    c14677 = c146736;
                    iM559712 = (C0873.m55680("۫ۚ") ^ i20) * (-75);
                    i14 = ((iM559712 ^ i19) * 30963) ^ 1057271676;
                    i15 = -882931687;
                    i22 = iM559712 ^ i15;
                    i21 = i14;
                    C14677 c146711116 = c14679;
                    c14678 = c14677;
                    c14679 = c146711116;
                    break;
                case 379231191:
                case 1813754386:
                    c19723 = c19723;
                    z4 = z4;
                    c17146 = c17146;
                    C14677 c146737 = c14678;
                    c14679 = c14679;
                    c14677 = c146737;
                    c14146.m32558();
                    m12272(this.f48669);
                    strM56092 = strM56092;
                    str = str;
                    z3 = z3;
                    C17143 c17148 = new C17143(this, this.f48669, C0877.m55707(f82227, 126, 4, i23), new C11110(this));
                    this.f48675 = c17148;
                    if (C0898.f81858 <= 0) {
                        c17147 = c17148;
                        iM55682 = C0946.m55979("ܿ֨") ^ i20;
                        i21 = ((iM55682 ^ i19) * 4519) ^ 1416770523;
                        i6 = 562837947;
                        i11 = iM55682 ^ i6;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c17146 = c17146;
                    } else {
                        int iM55689 = C0873.m55680("ۚۘ") ^ i19;
                        c17147 = c17148;
                        c19723 = c19723;
                        str = str;
                        z3 = z3;
                        i22 = iM55689 ^ (-782441314);
                        i21 = ((iM55689 ^ i20) * 6569) ^ 1066698336;
                        strM56092 = strM56092;
                        c17146 = c17146;
                    }
                    z4 = z4;
                    C14677 c146711117 = c14679;
                    c14678 = c14677;
                    c14679 = c146711117;
                    break;
                case 493225337:
                case 893082482:
                    c14679 = c14679;
                    C14677 c14677M33573 = C14677.m33572(bArr);
                    boolean zM56324 = C1053.m56323(c14677M33573);
                    this.f48678 = zM56324;
                    if (!zM56324) {
                        c14677 = c14677M33573;
                        iM559712 = (i19 - C0946.m55979("ۙۧ")) * 45;
                        i14 = ((iM559712 ^ i20) * 8107) ^ 1232061456;
                        i15 = 1652744928;
                        i22 = iM559712 ^ i15;
                        i21 = i14;
                        C14677 c146711118 = c14679;
                        c14678 = c14677;
                        c14679 = c146711118;
                    } else {
                        iM55683 = (i20 - C0873.m55680("ۡ֨")) * (-103);
                        c14677 = c14677M33573;
                        i21 = ((iM55683 ^ i19) * (-4907)) ^ (-1974266753);
                        i16 = -655734724;
                        i22 = iM55683 ^ i16;
                        C14677 c146711119 = c14679;
                        c14678 = c14677;
                        c14679 = c146711119;
                    }
                    break;
                case 696428724:
                case 2017374784:
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    C14677 c146738 = c14678;
                    c14679 = c14679;
                    c14677 = c146738;
                    textViewM37071 = textViewM37071;
                    textViewM37071.setTextSize(18.0f);
                    C14146 c14148 = (C14146) C0890.m55736(this, C0873.m55680(C0845.m55592(f82227, 123, 3, i23)) ^ 2125287322);
                    this.f48669 = c14148;
                    if (C0863.f81833 > 0) {
                        int iM556810 = (i20 - C0873.m55680("ۢۖ")) * 75;
                        i3 = ((iM556810 ^ i19) * (-16489)) ^ 1860346147;
                        i7 = iM556810 ^ 1372995722;
                        c14146 = c14148;
                        textViewM37071 = textViewM37071;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        z3 = z3;
                        i22 = i7;
                        i21 = i3;
                        c17146 = c17146;
                        str = str;
                        z4 = z4;
                        C14677 c1467111110 = c14679;
                        c14678 = c14677;
                        c14679 = c1467111110;
                    } else {
                        c14146 = c14148;
                        iM55681 = (C0946.m55979("۫ᩳ") + i19) * 9;
                        i21 = ((iM55681 ^ i20) * 3513) ^ (-1136830147);
                        i5 = -862200370;
                        i11 = iM55681 ^ i5;
                        textViewM37071 = textViewM37071;
                        c19723 = c19723;
                        strM56092 = strM56092;
                        str = str;
                        z3 = z3;
                        i22 = i11;
                        c17146 = c17146;
                        z4 = z4;
                        C14677 c1467111111 = c14679;
                        c14678 = c14677;
                        c14679 = c1467111111;
                    }
                    break;
                case 716741320:
                case 1262260120:
                    this.f48673 = C1194.m56384(c14678);
                    C14677 c146739 = c14678;
                    c14679 = c14679;
                    c14677 = c146739;
                    iM559712 = (i19 - C0946.m55979("ۙۧ")) * 45;
                    i14 = ((iM559712 ^ i20) * 8107) ^ 1232061456;
                    i15 = 1652744928;
                    i22 = iM559712 ^ i15;
                    i21 = i14;
                    C14677 c1467111112 = c14679;
                    c14678 = c14677;
                    c14679 = c1467111112;
                    break;
                case 935519015:
                case 1471182913:
                    C1024.m56202(C0873.m55680(ServiceConnectionC1013.m56161(f82227, WhirlpoolDigest.REDUCTION_POLYNOMIAL, 3, i23)) ^ 2098509582);
                    super.finish();
                    break;
                case 1071765828:
                case 1858625867:
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    iM559715 = iM559715;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    textViewM37071 = textViewM37071;
                    C14677 c146740 = c14678;
                    c14679 = c14679;
                    c14677 = c146740;
                    C0890.m55736(this, iM559715);
                    C1326 c1326 = (C1326) C1053.m56321(this, C0946.m55979(C0873.m55689(f82227, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i23)) ^ 2126143562);
                    this.f13392 = c1326;
                    C0955.m56037(this, c1326);
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i20 - C0873.m55680("ܺ۫")) * 17;
                        i3 = ((iM55680 ^ i19) * 3495) ^ (-283401538);
                        i4 = 1411486444;
                    } else {
                        iM55680 = C0873.m55680("ܿܽ") ^ i19;
                        i3 = ((iM55680 ^ i20) * 10409) ^ 202501094;
                        i4 = -1568326938;
                    }
                    i7 = iM55680 ^ i4;
                    iM559715 = iM559715;
                    textViewM37071 = textViewM37071;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    z3 = z3;
                    i22 = i7;
                    i21 = i3;
                    c17146 = c17146;
                    str = str;
                    z4 = z4;
                    C14677 c1467111113 = c14679;
                    c14678 = c14677;
                    c14679 = c1467111113;
                    break;
                case 1193758652:
                case 1885662332:
                    C1404.m56468();
                    str = str;
                    c19723 = c19723;
                    z3 = z3;
                    z4 = z4;
                    c17146 = c17146;
                    strM56092 = strM56092;
                    C14677 c1467211 = c14678;
                    c14679 = c14679;
                    c14677 = c1467211;
                    iM55682 = C0946.m55979("ܿ֨") ^ i20;
                    i21 = ((iM55682 ^ i19) * 4519) ^ 1416770523;
                    i6 = 562837947;
                    i11 = iM55682 ^ i6;
                    c19723 = c19723;
                    strM56092 = strM56092;
                    str = str;
                    z3 = z3;
                    i22 = i11;
                    c17146 = c17146;
                    z4 = z4;
                    C14677 c1467111114 = c14679;
                    c14678 = c14677;
                    c14679 = c1467111114;
                    break;
                case 1612239446:
                case 2019374216:
                    C14677 c146741 = c14678;
                    c14679 = c14679;
                    c14677 = c146741;
                    if (intExtra != 2) {
                        iM559712 = (C0946.m55979("֫֡") ^ i20) * (-75);
                        i14 = ((iM559712 ^ i19) * 9857) ^ 1508652317;
                        i15 = -1811577223;
                    } else {
                        iM559712 = (i19 - C0946.m55979("ۤۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i14 = ((iM559712 ^ i20) * 23611) ^ (-148532635);
                        i15 = 790576961;
                    }
                    i22 = iM559712 ^ i15;
                    i21 = i14;
                    C14677 c1467111115 = c14679;
                    c14678 = c14677;
                    c14679 = c1467111115;
                    break;
                case 1883440296:
                case 1943470509:
                    this.f48669.mo27918(c14679);
                    break;
                default:
                    c19721 = c19723;
                    z = z4;
                    C14677 c146742 = c14678;
                    c14679 = c14679;
                    c14677 = c146742;
                    sArr = sArr2;
                    strM56175 = RunnableC1014.m56175(intentM56311, C1025.m56233(sArr, 171, 5, i23));
                    String strM56176 = RunnableC1014.m56175(intentM56311, C0947.m55993(f82227, PicnicEngine.MAX_AUX_BYTES, 14, i23));
                    setTitle(strM56175);
                    C17143 c17149 = this.f48675;
                    str2 = C0890.m55730(strM56176) ? strM56175 : strM56176;
                    iM559713 = C0873.m55680("֡۟") ^ i19;
                    c17143 = c17149;
                    i21 = ((iM559713 ^ i20) * (-2625)) ^ (-199352825);
                    i17 = 1833737870;
                    int i214 = iM559713 ^ i17;
                    sArr2 = sArr;
                    c17146 = c17143;
                    c19723 = c19721;
                    i22 = i214;
                    z4 = z;
                    bundle = bundle;
                    C14677 c1467111116 = c14679;
                    c14678 = c14677;
                    c14679 = c1467111116;
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
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37555(ActivityC16573 activityC16573, DialogInterfaceC2564 dialogInterfaceC2564) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0992.f81922;
        int i4 = C1404.f82149;
        int iM55979 = C0946.m55979("᩵۠") ^ i4;
        int i5 = ((iM55979 ^ i3) * 27209) ^ (-1825800336);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 1359170599;
        InterfaceC14770 interfaceC14770M55814 = null;
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
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("ۛ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM55680 = C0873.m55680("᩶֡") ^ i4;
                        i = ((iM55680 ^ i3) * 25581) ^ (-1293746683);
                        i2 = -35980366;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1967610242:
                case 1326179558:
                    c = 'Z';
                    if (C0917.f81868) {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM55680 = C0946.m55979("ۧܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-5557)) ^ (-2034114711);
                        i2 = -2055413531;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1896276101:
                case 703849829:
                    sArr = f82227;
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM55680 = (C0946.m55979("ܶܶ") + i3) * (-59);
                        i = ((iM55680 ^ i4) * (-5941)) ^ 1612922588;
                        i2 = 1956373398;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1824575032:
                case -490038519:
                    sArr2 = f82227;
                    i10 = 91;
                    i11 = 20;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM55680 = C0873.m55680("᩻۫") ^ i3;
                        i = ((iM55680 ^ i4) * (-24721)) ^ (-1246269131);
                        i2 = 1245401412;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1732901554:
                case 1075310071:
                    break;
                case -1731072289:
                case 352555407:
                    b = (byte) i7;
                    if (C1025.m56230()) {
                        iM55680 = C0873.m55680("ۛ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM55680 = C0946.m55979("ᩴۗ") ^ i4;
                        i = ((iM55680 ^ i3) * 14515) ^ 1797017116;
                        i2 = 1192635415;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1483087004:
                case 597137781:
                    C0937.m55912(interfaceC14770M55814.mo27874(b, C0912.m55822(sArr2, i10, i11, i9)));
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ۛ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM55680 = C0946.m55979("ۜ۟") ^ i4;
                        i = ((iM55680 ^ i3) * 21511) ^ 469362983;
                        i2 = -773859878;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1048975923:
                case -879822627:
                    C1044.m56286();
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("᩶֫") ^ i4;
                        i = ((iM55680 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    } else {
                        iM55680 = (C0873.m55680("ۤۚ") ^ i3) * (-103);
                        i = ((iM55680 ^ i4) * (-5033)) ^ (-503259696);
                        i2 = 1739965321;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -947970295:
                case 61035679:
                    C0894.m55769();
                    break;
                case -680793416:
                case 653789456:
                    if (i8 - (s * s3) >= 0) {
                        iM55680 = C0946.m55979("᩵᩹") ^ i4;
                        i = ((iM55680 ^ i3) * (-14265)) ^ (-2039219241);
                        i2 = -1092449628;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۙ") + i3) * (-37);
                        i = ((iM55680 ^ i4) * 20705) ^ 915990379;
                        i2 = 1893234281;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -671616472:
                case 979686814:
                    i9 = 47693;
                    iM55680 = (i4 - C0873.m55680("۬ۜ")) * 57;
                    i = ((iM55680 ^ i3) * 30937) ^ (-1758444259);
                    i2 = 437837298;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -591487856:
                case 1597811770:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("᩶֫") ^ i4;
                        i = ((iM55680 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    } else {
                        iM55680 = C0873.m55680("ۛ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -475751194:
                case -94598232:
                    int i13 = s + s2;
                    i8 = i13 * i13;
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM55680 = C0873.m55680("ۙۛ") ^ i3;
                        i = ((iM55680 ^ i4) * (-28569)) ^ 1397491195;
                        i2 = -394069892;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -278436813:
                case 1791746876:
                    i9 = 18344;
                    iM55680 = (i4 - C0873.m55680("۬ۜ")) * 57;
                    i = ((iM55680 ^ i3) * 30937) ^ (-1758444259);
                    i2 = 437837298;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -101021538:
                case 329248152:
                    C0845.m55584();
                    if (C0927.f81875) {
                        iM55680 = (C0946.m55979("۠֫") ^ i3) * (-111);
                        i = ((iM55680 ^ i4) * 30455) ^ (-948292895);
                        i2 = 913640614;
                    } else {
                        iM55680 = C0946.m55979("᩶֫") ^ i4;
                        i = ((iM55680 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 86223534:
                case 1978400151:
                    s3 = 70624;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("᩶֫") ^ i4;
                        i = ((iM55680 ^ i3) * 7323) ^ 638438104;
                        i2 = 1472563965;
                    } else {
                        iM55680 = C0946.m55979("ۜۡ") ^ i4;
                        i = ((iM55680 ^ i3) * 31629) ^ 1119506333;
                        i2 = 54597121;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 99952997:
                case 1262674283:
                    activityC16573.setResult(2);
                    super.finish();
                    break;
                case 125601215:
                case 657044382:
                    C1024.m56208(dialogInterfaceC2564);
                    if (activityC16573.f48673 == activityC16573.f48677) {
                        iM55680 = (C0946.m55979("᩹֡") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i3) * 2661) ^ 89134757;
                        i2 = 508940779;
                    } else {
                        iM55680 = C0946.m55979("ܰ۟") ^ i3;
                        i = ((iM55680 ^ i4) * 23557) ^ 715053777;
                        i2 = -553289654;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 838800756:
                case 1759360035:
                    s = sArr[c];
                    s2 = 17656;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("ۛ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-25843)) ^ 214706579;
                        i2 = -944434751;
                    } else {
                        iM55680 = C0873.m55680("ۢ۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-16581)) ^ (-1022616440);
                        i2 = 932079588;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 849613845:
                case 921354795:
                    interfaceC14770M55814 = C0906.m55814(ApplicationC21448.f67649);
                    i7 = activityC16573.f48677;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("᩺ᩴ") ^ i3;
                        i = ((iM55680 ^ i4) * 11559) ^ 1343265488;
                        i2 = 823941722;
                    } else {
                        iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-12957)) ^ (-2014257072);
                        i2 = -123657293;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0947.m55997();
                    iM55680 = (C0873.m55680("ۤۚ") ^ i3) * (-103);
                    i = ((iM55680 ^ i4) * (-5033)) ^ (-503259696);
                    i2 = 1739965321;
                    i6 = iM55680 ^ i2;
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
    
        if (p067l.C1229.f82066 >= 0) goto L15;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m37551(AbstractActivityC5549 abstractActivityC5549, String str, String str2, String str3, String str4) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        int i7;
        int iM55682;
        int i8;
        int i9;
        int iM55683;
        int i10;
        int i11;
        AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
        String strM56252 = null;
        Intent intent = null;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr = null;
        int i15 = 0;
        short[] sArr2 = null;
        int i16 = -1477588506;
        int i17 = C0949.f81897;
        int i18 = C1036.f81953;
        int iM55684 = (C0873.m55680("ᩴܿ") + i17) * 63;
        int i19 = ((iM55684 ^ i18) * (-30413)) ^ (-667990718);
        int i20 = iM55684 ^ (-1749952935);
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
                    if (C1124.m56367() < 0) {
                        iM55979 = C0946.m55979("ۨ۟") ^ i17;
                        i3 = ((iM55979 ^ i18) * (-11901)) ^ (-1316926898);
                        i4 = 1906177908;
                        i20 = iM55979 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC55410 = abstractActivityC5549;
                    } else {
                        intent = intent;
                        int iM55685 = (i17 - C0873.m55680("᩶ۡ")) * (-115);
                        i19 = ((iM55685 ^ i18) * 31169) ^ 985421825;
                        i20 = iM55685 ^ 849459146;
                        i16 = i16;
                        sArr2 = sArr2;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    break;
                case -1943091273:
                case 1549108785:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("ۤ֫") ^ i18;
                        i3 = ((iM55979 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                    } else {
                        iM55979 = C0873.m55680("۠ᩳ") ^ i18;
                        i3 = ((iM55979 ^ i17) * (-30977)) ^ 393995421;
                        i4 = 1417193779;
                    }
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1908351276:
                case 189191900:
                    C0894.m55769();
                    break;
                case -1840086179:
                case -917488995:
                    C1044.m56284(abstractActivityC55410, intent);
                    break;
                case -1820718844:
                case 1235833729:
                    i7 = i16;
                    if (C0890.m55730(str4)) {
                        iM55682 = C0873.m55680("ۤᩳ") ^ i18;
                        i8 = ((iM55682 ^ i17) * 18867) ^ 963368148;
                        i9 = 1328320300;
                    } else {
                        iM55682 = C0873.m55680("ۚۗ") ^ i18;
                        i8 = ((iM55682 ^ i17) * 16905) ^ (-376916223);
                        i9 = 449519289;
                    }
                    i20 = iM55682 ^ i9;
                    i19 = i8;
                    i16 = i7;
                    break;
                case -1681570045:
                case -491476451:
                    C0861.m55626();
                    if (ServiceConnectionC1013.f81940 < 0) {
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM55680 = (i18 - C0946.m55979("ۢ᩸")) * 61;
                        i = ((iM55680 ^ i17) * 8749) ^ 111485674;
                        i2 = 1944222462;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                    } else {
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM55979 = (C0873.m55680("۟᩹") + i17) * (-127);
                        i3 = ((iM55979 ^ i18) * 11619) ^ (-1102342665);
                        i4 = -1546029708;
                        i20 = iM55979 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    break;
                case -1463048283:
                case 1346840487:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    int i22 = 208224900 + i13;
                    if ((i22 + i22) - i12 >= 0) {
                        iM55680 = (C0946.m55979("ܰ֫") ^ i18) * (-49);
                        i = ((iM55680 ^ i17) * (-4909)) ^ 1942817208;
                        i2 = 314041700;
                    } else {
                        iM55680 = (C0946.m55979("ۛۤ") + i17) * (-23);
                        i = ((iM55680 ^ i18) * (-5227)) ^ 184791998;
                        i2 = 748601279;
                    }
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -1446029002:
                case -768754154:
                    if (abstractActivityC55410 instanceof Main) {
                        iM55683 = C0873.m55680("ۨۛ") ^ i18;
                        i10 = ((iM55683 ^ i17) * 20997) ^ 401742085;
                        i11 = -769682995;
                    } else {
                        iM55683 = C0873.m55680("ۢ֨") ^ i17;
                        i10 = ((iM55683 ^ i18) * (-32121)) ^ 301212979;
                        i11 = 1258607741;
                    }
                    i20 = iM55683 ^ i11;
                    i19 = i10;
                    break;
                case -1421457258:
                case 1879349245:
                    C1229.m56410();
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    iM55979 = (C0873.m55680("۟᩹") + i17) * (-127);
                    i3 = ((iM55979 ^ i18) * 11619) ^ (-1102342665);
                    i4 = -1546029708;
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1312429009:
                case -314496513:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0946.m55979("ۡۧ") + i17) * (-101);
                        i3 = ((iM55979 ^ i18) * (-5375)) ^ (-926778865);
                        i4 = -616129273;
                    } else {
                        iM55979 = (C0946.m55979("ۖۧ") + i17) * (-17);
                        i3 = ((iM55979 ^ i18) * (-12567)) ^ (-398028822);
                        i4 = 488435246;
                    }
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1298440011:
                case -1216176568:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    s = f82227[0];
                    if (C0992.f81922 >= 0) {
                        iM55979 = C0873.m55680("ۤ֫") ^ i18;
                        i3 = ((iM55979 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                    } else {
                        iM55979 = (C0946.m55979("֨֫") + i18) * (-83);
                        i3 = ((iM55979 ^ i17) * (-6475)) ^ 1183875765;
                        i4 = 2087248985;
                    }
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1074637344:
                case 626976044:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0946.m55979("ۡۧ") + i17) * (-101);
                        i3 = ((iM55979 ^ i18) * (-5375)) ^ (-926778865);
                        i4 = -616129273;
                    } else {
                        iM55979 = C0873.m55680("᩹ۤ") ^ i18;
                        i3 = ((iM55979 ^ i17) * (-8129)) ^ (-2026759784);
                        i4 = 195114081;
                    }
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -1069040615:
                case 1389894400:
                    i16 = i16;
                    C0917.m55843(intent, RunnableC0871.m55667(f82227, 26, 11, i14), str3);
                    sArr2 = sArr2;
                    iM55681 = (C0946.m55979("ܽۤ") ^ i17) * (-5);
                    i5 = ((iM55681 ^ i18) * 31263) ^ (-79735241);
                    i6 = 1379266079;
                    i20 = iM55681 ^ i6;
                    i19 = i5;
                    i16 = i16;
                    sArr2 = sArr2;
                    break;
                case -941827716:
                case 420898825:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    C5178.m11082(RunnableC1014.m56165(abstractActivityC5549), str, strM56252);
                    if (C1048.f81963) {
                        iM55680 = (i17 - C0946.m55979("᩷ܰ")) * (-53);
                        i = ((iM55680 ^ i18) * 22827) ^ 1175257806;
                        i2 = 480565848;
                    } else {
                        iM55680 = (i18 - C0946.m55979("ۢ᩸")) * 61;
                        i = ((iM55680 ^ i17) * 8749) ^ 111485674;
                        i2 = 1944222462;
                    }
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -657587618:
                case 1832069365:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        intent = intent;
                        sArr2 = sArr2;
                        i16 = i16;
                        iM55979 = C0873.m55680("ۤ֫") ^ i18;
                        i3 = ((iM55979 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                        i20 = iM55979 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    sArr2 = sArr2;
                    i16 = i16;
                    iM55979 = (C0946.m55979("ۡۧ") + i17) * (-101);
                    i3 = ((iM55979 ^ i18) * (-5375)) ^ (-926778865);
                    i4 = -616129273;
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -590336618:
                case -349827438:
                    i14 = 3170;
                    iM55680 = (C0946.m55979("ۤۜ") + i17) * 45;
                    i = ((iM55680 ^ i18) * 17757) ^ 356015753;
                    i2 = 833508858;
                    i20 = iM55680 ^ i2;
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
                    if (C1964.f83032 <= 0) {
                        iM55979 = (C0873.m55680("۟᩹") + i17) * (-127);
                        i3 = ((iM55979 ^ i18) * 11619) ^ (-1102342665);
                        i4 = -1546029708;
                    } else {
                        iM55979 = (i17 - C0946.m55979("᩵ۛ")) * (-113);
                        i3 = ((iM55979 ^ i18) * 19371) ^ (-389305237);
                        i4 = -1379179264;
                    }
                    i20 = iM55979 ^ i4;
                    i19 = i3;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    abstractActivityC55410 = abstractActivityC5549;
                    break;
                case -355165892:
                case 1438322072:
                    i14 = 8327;
                    iM55680 = (C0946.m55979("ۤۜ") + i17) * 45;
                    i = ((iM55680 ^ i18) * 17757) ^ 356015753;
                    i2 = 833508858;
                    i20 = iM55680 ^ i2;
                    i19 = i;
                    i16 = i16;
                    sArr2 = sArr2;
                    intent = intent;
                    break;
                case -64429167:
                case 287752686:
                    C0917.m55843(intent, RunnableC0897.m55783(f82227, 37, 14, i14), str4);
                    i7 = i16;
                    iM55682 = C0873.m55680("ۤᩳ") ^ i18;
                    i8 = ((iM55682 ^ i17) * 18867) ^ 963368148;
                    i9 = 1328320300;
                    i20 = iM55682 ^ i9;
                    i19 = i8;
                    i16 = i7;
                    break;
                case -12045314:
                case 1126884247:
                    i16 = i16;
                    intent.putExtra(C0894.m55773(sArr, i15, 6, i14), 0);
                    sArr2 = f82227;
                    if (C1017.f81942 < 0) {
                        int iM559710 = C0946.m55979("ۨ᩵") ^ i18;
                        intent = intent;
                        i19 = ((iM559710 ^ i17) * 20897) ^ 1050783485;
                        i20 = iM559710 ^ (-1640792352);
                        i16 = i16;
                        intent = intent;
                    } else {
                        sArr2 = sArr2;
                        iM55979 = (C0946.m55979("ۡۧ") + i17) * (-101);
                        i3 = ((iM55979 ^ i18) * (-5375)) ^ (-926778865);
                        i4 = -616129273;
                        i20 = iM55979 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    break;
                case 493127831:
                case 2113790151:
                    sArr2 = sArr2;
                    i16 = i16;
                    intent = new Intent(abstractActivityC55410, (Class<?>) ActivityC16573.class);
                    sArr = f82227;
                    i15 = 15;
                    if (C0898.f81858 > 0) {
                        iM55681 = (C0873.m55680("ܽ۬") ^ i18) * 33;
                        i5 = ((iM55681 ^ i17) * (-21787)) ^ 1931128901;
                        i6 = 1007935332;
                        i20 = iM55681 ^ i6;
                        i19 = i5;
                        i16 = i16;
                        sArr2 = sArr2;
                    } else {
                        int iM55686 = (i17 - C0873.m55680("᩶ۡ")) * (-115);
                        i19 = ((iM55686 ^ i18) * 31169) ^ 985421825;
                        i20 = iM55686 ^ 849459146;
                        i16 = i16;
                        sArr2 = sArr2;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    break;
                case 884287995:
                case 2026940536:
                    i16 = i16;
                    C0917.m55843(intent, ServiceConnectionC1013.m56161(sArr2, 21, 5, i14), str2);
                    if (C1053.m56332(str3)) {
                        sArr2 = sArr2;
                        iM55681 = (C0946.m55979("ܽۤ") ^ i17) * (-5);
                        i5 = ((iM55681 ^ i18) * 31263) ^ (-79735241);
                        i6 = 1379266079;
                        i20 = iM55681 ^ i6;
                        i19 = i5;
                    } else {
                        int iM55687 = C0873.m55680("۬᩺") ^ i17;
                        sArr2 = sArr2;
                        i19 = ((iM55687 ^ i18) * (-7629)) ^ (-487612354);
                        i20 = iM55687 ^ 420593969;
                    }
                    i16 = i16;
                    sArr2 = sArr2;
                    break;
                case 888957739:
                case 2107286510:
                    intent.putExtra(C1053.m56325(f82227, 51, 13, i14), true);
                    iM55683 = C0873.m55680("ۢ֨") ^ i17;
                    i10 = ((iM55683 ^ i18) * (-32121)) ^ 301212979;
                    i11 = 1258607741;
                    i20 = iM55683 ^ i11;
                    i19 = i10;
                    break;
                default:
                    intent = intent;
                    sArr2 = sArr2;
                    i16 = i16;
                    strM56252 = C1036.m56252(f82227, 1, 14, i14);
                    if (!C0882.f81846) {
                        iM55680 = (i18 - C0873.m55680("᩻ۚ")) * (-107);
                        i = ((iM55680 ^ i17) * 19169) ^ 314197085;
                        i2 = -1719704057;
                        i20 = iM55680 ^ i2;
                        i19 = i;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                    } else {
                        iM55979 = C0873.m55680("ۤ֫") ^ i18;
                        i3 = ((iM55979 ^ i17) * 18703) ^ (-1291896469);
                        i4 = -240050593;
                        i20 = iM55979 ^ i4;
                        i19 = i3;
                        i16 = i16;
                        sArr2 = sArr2;
                        intent = intent;
                        abstractActivityC55410 = abstractActivityC5549;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int iM559710;
        int i4;
        ActivityC16573 activityC16573 = this;
        int i5 = C0873.f81841;
        int i6 = C1053.f81965;
        int iM559711 = (i5 - C0946.m55979("֨ۤ")) * (-121);
        int i7 = ((iM559711 ^ i6) * (-19265)) ^ (-1683356217);
        C17143 c17143 = null;
        String strM55921 = null;
        String strM55592 = null;
        short[] sArr = null;
        int i8 = iM559711 ^ 1606619725;
        boolean z = false;
        int iM55681 = 0;
        int iM55682 = 0;
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
        int iM559712 = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i6) * 6747) >> 31));
            switch (i17) {
                case -2126974730:
                case -2000115802:
                    menuInflater = getMenuInflater();
                    strM55921 = C0937.m55921(f82227, 357, 3, i10);
                    if (C0912.f81867 <= 0) {
                        iM559710 = (i6 - C0946.m55979("ۡ֨")) * (-89);
                        i7 = ((iM559710 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                    } else {
                        iM559710 = (i6 - C0946.m55979("ۧۧ")) * (-37);
                        i7 = ((iM559710 ^ i5) * (-401)) ^ (-61979246);
                        i4 = 1944294517;
                    }
                    i8 = iM559710 ^ i4;
                    activityC16573 = this;
                    break;
                case -1959759605:
                case 1806171022:
                    if (!C0917.f81868) {
                        iM55979 = C0946.m55979("᩷ۜ") ^ i5;
                        i = ((iM55979 ^ i6) * 1787) ^ (-140916145);
                        i2 = 48568649;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM55680 = (C0946.m55979("۬ܰ") ^ i5) * 19;
                        i7 = ((iM55680 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -1824050490:
                case -1453038258:
                    RunnableC0897.m55784();
                    if (!C0947.f81895) {
                        iM55979 = C0873.m55680("ۙ۬") ^ i6;
                        i = ((iM55979 ^ i5) * (-19497)) ^ (-1008715106);
                        i2 = -1083407600;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = (i6 - C0946.m55979("ۡ֨")) * (-89);
                        i7 = ((iM559710 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = iM559710 ^ i4;
                        activityC16573 = this;
                    }
                    break;
                case -1684759930:
                case 924453281:
                    C0863.m55633(C0937.m55911(menu, 2128509350 ^ iM559712), z);
                    menuInflater = menuInflater;
                    iM55680 = (C0873.m55680("ۢ᩵") + i5) * 59;
                    i7 = ((iM55680 ^ i6) * 30975) ^ (-126604038);
                    i3 = 361871988;
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
                    menuInflater = menuInflater;
                    break;
                case -1629964195:
                case -765575639:
                    menuInflater = menuInflater;
                    short s2 = sArr2[c];
                    int i18 = s2 + 7771;
                    if (!C0873.m55678()) {
                        int iM559713 = (i6 - C0946.m55979("ۙᩴ")) * (-111);
                        int i19 = ((iM559713 ^ i5) * (-377)) ^ (-1814650683);
                        i8 = iM559713 ^ 732054660;
                        menuInflater = menuInflater;
                        s = s2;
                        i16 = i18;
                        i7 = i19;
                        activityC16573 = this;
                    } else {
                        s = s2;
                        i16 = i18;
                        iM55680 = (C0946.m55979("۬ܰ") ^ i5) * 19;
                        i7 = ((iM55680 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -1352885093:
                case 1194649628:
                    c17143.m38836(C0937.m55911(menu, 2128319687 ^ iM55681));
                    return true;
                case -1077174467:
                case -140881323:
                    C1025.m56230();
                    C0877.m55696();
                    menuInflater = menuInflater;
                    iM55680 = (C0946.m55979("۬ܰ") ^ i5) * 19;
                    i7 = ((iM55680 ^ i6) * (-17371)) ^ 1755476767;
                    i3 = 1393730309;
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
                    menuInflater = menuInflater;
                    break;
                case -1074896453:
                case 511175556:
                    i10 = 11550;
                    iM55680 = C0873.m55680("᩸ۧ") ^ i6;
                    i7 = ((iM55680 ^ i5) * (-13263)) ^ 1971023457;
                    i3 = -1251482959;
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
                    menuInflater = menuInflater;
                    break;
                case -1016279923:
                case -117410273:
                    iM55682 = C0873.m55680(strM55592);
                    i9 = 2122066124;
                    if (C0937.m55918() >= 0) {
                        iM55979 = C0946.m55979("᩷ۜ") ^ i5;
                        i = ((iM55979 ^ i6) * 1787) ^ (-140916145);
                        i2 = 48568649;
                    } else {
                        iM55979 = C0873.m55680("۠ᩴ") ^ i5;
                        i = ((iM55979 ^ i6) * (-391)) ^ (-236707178);
                        i2 = 415191742;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -969970165:
                case 20924381:
                    menuInflater = menuInflater;
                    int i20 = i14 + i15;
                    if (i13 - (i20 + i20) > 0) {
                        iM55680 = (i5 - C0946.m55979("ۡ᩸")) * 13;
                        i7 = ((iM55680 ^ i6) * 21063) ^ 1952150789;
                        i3 = -606745600;
                    } else {
                        iM55680 = (C0873.m55680("ܽܰ") + i5) * 59;
                        i7 = ((iM55680 ^ i6) * (-18241)) ^ 1421119786;
                        i3 = -125079673;
                    }
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
                    menuInflater = menuInflater;
                    break;
                case -890029012:
                case 1482083658:
                    C0866.m55645();
                    if (!C0937.f81884) {
                        iM559710 = (i6 - C0946.m55979("ۡ֨")) * (-89);
                        i7 = ((iM559710 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = iM559710 ^ i4;
                        activityC16573 = this;
                    } else {
                        menuInflater = menuInflater;
                        iM55680 = (C0946.m55979("۬ܰ") ^ i5) * 19;
                        i7 = ((iM55680 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -738549203:
                case 303325631:
                    strM55592 = C0845.m55592(f82227, 363, 3, i10);
                    if (C1025.f81947 < 0) {
                        iM55979 = C0946.m55979("ܰ۠") ^ i6;
                        i = ((iM55979 ^ i5) * (-25577)) ^ (-2091369888);
                        i2 = -147849195;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM55680 = (C0946.m55979("۬ܰ") ^ i5) * 19;
                        i7 = ((iM55680 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -731106472:
                case -210775881:
                    c17143 = activityC16573.f48675;
                    sArr = f82227;
                    i11 = 360;
                    i12 = 3;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۙ۬") ^ i6;
                        i = ((iM55979 ^ i5) * (-19497)) ^ (-1008715106);
                        i2 = -1083407600;
                    } else {
                        iM55979 = C0946.m55979("᩵ᩳ") ^ i6;
                        i = ((iM55979 ^ i5) * (-30713)) ^ 1424961450;
                        i2 = 2125052135;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -565850517:
                case 1257693009:
                    iM55681 = C0873.m55680(C0949.m56016(sArr, i11, i12, i10));
                    if (C1929.f83011 == 0) {
                        iM55979 = (C0946.m55979("ܿ᩶") + i5) * (-17);
                        i = ((iM55979 ^ i6) * (-10445)) ^ 1123059078;
                        i2 = -1122269233;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM55680 = C0873.m55680("۠۠") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case -402580317:
                case 304112954:
                    C1003.m56123();
                    return false;
                case 64434519:
                case 1896850656:
                    iM559712 = C0946.m55979(C0989.m56092(f82227, 366, 3, i10));
                    if (C0946.m55980() == 0) {
                        iM55979 = (i6 - C0946.m55979("ܶۧ")) * 33;
                        i = ((iM55979 ^ i5) * 1875) ^ 539078628;
                        i2 = -1999007690;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        iM559710 = (i6 - C0946.m55979("ۡ֨")) * (-89);
                        i7 = ((iM559710 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = iM559710 ^ i4;
                        activityC16573 = this;
                    }
                    break;
                case 129030878:
                case 2104891403:
                    menuInflater = menuInflater;
                    sArr2 = f82227;
                    c = 356;
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0873.m55680("۠۠") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                    } else {
                        iM55680 = C0946.m55979("۬᩻") ^ i5;
                        i7 = ((iM55680 ^ i6) * 15863) ^ 60624355;
                        i3 = -1997660064;
                    }
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
                    menuInflater = menuInflater;
                    break;
                case 489582061:
                case 695141949:
                    menuInflater = menuInflater;
                    menuInflater.inflate(C0873.m55680(strM55921) ^ 2118458552, menu);
                    if (!activityC16573.f48678) {
                        int iM55683 = C0873.m55680("ۗۨ") ^ i5;
                        i8 = iM55683 ^ (-1991600230);
                        i7 = ((iM55683 ^ i6) * 1247) ^ (-1846433517);
                        menuInflater = menuInflater;
                        activityC16573 = this;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩵") + i5) * 59;
                        i7 = ((iM55680 ^ i6) * 30975) ^ (-126604038);
                        i3 = 361871988;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case 648057808:
                case 1108300396:
                    z = false;
                    C0845.m55587(C0937.m55911(menu, iM55682 ^ i9), false);
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0873.m55680("ۖ۬") ^ i6) * (-93);
                        i = ((iM55979 ^ i5) * 20733) ^ 546780603;
                        i2 = -1959462822;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        menuInflater = menuInflater;
                        iM55680 = C0873.m55680("۠۠") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                        i8 = iM55680 ^ i3;
                        activityC16573 = this;
                        menuInflater = menuInflater;
                    }
                    break;
                case 955689963:
                case 1094334019:
                    i10 = 36798;
                    iM55680 = C0873.m55680("᩸ۧ") ^ i6;
                    i7 = ((iM55680 ^ i5) * (-13263)) ^ 1971023457;
                    i3 = -1251482959;
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
                    menuInflater = menuInflater;
                    break;
                default:
                    menuInflater = menuInflater;
                    i13 = i16 * i16;
                    i14 = s * s;
                    i15 = 60388441;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0946.m55979("۬ܰ") ^ i5) * 19;
                        i7 = ((iM55680 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                    } else {
                        iM55680 = (C0873.m55680("ۜ֫") ^ i6) * C0254q.f1218h;
                        i7 = ((iM55680 ^ i5) * 26393) ^ (-1135170669);
                        i3 = 1464710976;
                    }
                    i8 = iM55680 ^ i3;
                    activityC16573 = this;
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
    
        if (p067l.C1044.f81959 < 0) goto L18;
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
        C20671 c20671;
        DialogInterface.OnClickListener onClickListener;
        int iM55979;
        int i3;
        int i4;
        int i5;
        int i6;
        short[] sArr2;
        byte b;
        DialogInterface.OnClickListener onClickListener2;
        DialogInterface.OnClickListener onClickListener3;
        int iM55680;
        int i7;
        int i8;
        ?? r11;
        int iM559710;
        int i9;
        int i10;
        final ActivityC16573 activityC16573 = this;
        AbstractC17043 abstractC17043M55623 = null;
        short[] sArr3 = null;
        int i11 = 47359149;
        int i12 = C0863.f81833;
        int i13 = C0898.f81858;
        int iM55681 = C0873.m55680("۬۫") ^ i12;
        int i14 = ((iM55681 ^ i13) * (-20117)) ^ 1608856711;
        int i15 = iM55681 ^ (-1849452126);
        DialogInterface.OnClickListener onClickListener4 = null;
        DialogInterface.OnClickListener onClickListener5 = null;
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = null;
        String strM56092 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int iM56307 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iM559711 = 0;
        int i21 = 0;
        short s = 0;
        int i22 = 0;
        int iM55682 = 0;
        byte b2 = 0;
        int i23 = 0;
        int i24 = 0;
        C20671 c20672 = null;
        String parent = null;
        boolean z = false;
        C8331 c8331 = null;
        int iM559712 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 11803) >> 31));
            switch (i11) {
                case -2067093114:
                case -92463151:
                    C1229.m56410();
                    if (C1929.f83011 != 0) {
                        iM559710 = (i13 - C0946.m55979("ᩳ᩷")) * (-109);
                        i9 = ((iM559710 ^ i12) * (-24965)) ^ 1231031861;
                        i10 = -1896846778;
                    } else {
                        iM559710 = C0873.m55680("ᩴܰ") ^ i12;
                        i9 = ((iM559710 ^ i13) * 9215) ^ (-359095689);
                        i10 = 2119548367;
                    }
                    i15 = iM559710 ^ i10;
                    i14 = i9;
                    break;
                case -2060452677:
                case 2007513720:
                    abstractC17043M55623 = abstractC17043M55623;
                    if (iM56307 == (C0946.m55979(C0912.m55822(f82227, 388, 3, i17)) ^ 2118643564)) {
                        iM55680 = (i12 - C0873.m55680("ۚᩳ")) * (-23);
                        i7 = ((iM55680 ^ i13) * (-5755)) ^ 597991978;
                        i8 = 1974731096;
                        r11 = i20;
                    } else {
                        iM55680 = (i13 - C0873.m55680("ۘۢ")) * (-13);
                        i7 = ((iM55680 ^ i12) * (-28819)) ^ 1257862802;
                        i8 = 345151676;
                        r11 = i20;
                    }
                    i15 = iM55680 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC17043M55623 = abstractC17043M55623;
                    break;
                case -2053411341:
                case 2130550529:
                    C8331 c8332 = activityC16573.f48670;
                    String str = activityC16573.f48674;
                    String strM55591 = C0845.m55591(getTitle());
                    RunnableC1014.m56165(c8332);
                    C8331.m19220(c8332, iM559712, str, strM55591, (String[]) null, 24);
                    return z;
                case -2050743578:
                case 99570891:
                    abstractC17043M55623 = abstractC17043M55623;
                    if (iM56307 == (C0873.m55680(C1003.m56132(f82227, 391, 3, i17)) ^ 2122367824)) {
                        iM55680 = C0873.m55680("ۙ᩶") ^ i12;
                        i7 = ((iM55680 ^ i13) * (-751)) ^ 438482652;
                        i8 = -2128417628;
                        r11 = i20;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۘ") + i13) * (-93);
                        i7 = ((iM55680 ^ i12) * (-30631)) ^ (-1499535830);
                        i8 = -307126151;
                        r11 = i20;
                    }
                    i15 = iM55680 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC17043M55623 = abstractC17043M55623;
                    break;
                case -1993865252:
                case -1191500215:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr6 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr6;
                    short s2 = f82227[369];
                    int i25 = s2 + 3877;
                    if (!C0955.f81898) {
                        int iM559713 = (C0946.m55979("ܺ᩺") ^ i13) * (-101);
                        s = s2;
                        i22 = i25;
                        i16 = i16;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i14 = ((iM559713 ^ i12) * 25051) ^ (-1521922086);
                        i15 = iM559713 ^ 1055614877;
                        c20672 = c20672;
                        i18 = i18;
                        activityC16573 = this;
                        onClickListener5 = onClickListener5;
                        abstractC17043M55623 = abstractC17043M55623;
                        DialogInterface.OnClickListener onClickListener6 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener6;
                    } else {
                        s = s2;
                        i22 = i25;
                        iM55979 = (C0946.m55979("ۚۢ") + i13) * 5;
                        i3 = ((iM55979 ^ i12) * 19325) ^ (-1586289026);
                        i4 = 452514650;
                        i6 = iM55979 ^ i4;
                        i18 = i18;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        DialogInterface.OnClickListener onClickListener7 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener7;
                    }
                    break;
                case -1839114399:
                case 1366770311:
                    C0882.m55710();
                    if (!C0927.f81875) {
                        iM559710 = C0873.m55680("ᩴܰ") ^ i12;
                        i9 = ((iM559710 ^ i13) * 9215) ^ (-359095689);
                        i10 = 2119548367;
                        i15 = iM559710 ^ i10;
                        i14 = i9;
                    } else {
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        onClickListener5 = onClickListener5;
                        sArr4 = sArr4;
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i18;
                        short[] sArr7 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr7;
                        iM55979 = (C0946.m55979("ۚۢ") + i13) * 5;
                        i3 = ((iM55979 ^ i12) * 19325) ^ (-1586289026);
                        i4 = 452514650;
                        i6 = iM55979 ^ i4;
                        i18 = i18;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        DialogInterface.OnClickListener onClickListener8 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener8;
                    }
                    break;
                case -1714863848:
                case 1266745968:
                    activityC16573.f48675.m38837(ActivityC5175.class);
                    return z;
                case -1701871988:
                case 1875292309:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr8 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr8;
                    if (iM56307 == (C0946.m55979(C0992.m56102(f82227, 373, 3, i17)) ^ 2121172834)) {
                        iM55979 = C0946.m55979("ᩴ᩸") ^ i13;
                        i3 = ((iM55979 ^ i12) * 9671) ^ 1316021118;
                        i4 = -348244340;
                    } else {
                        iM55979 = (C0946.m55979("ۤ֡") + i13) * (-119);
                        i3 = ((iM55979 ^ i12) * 13621) ^ (-385717776);
                        i4 = -213144048;
                    }
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener9 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener9;
                    break;
                case -1654426363:
                case -674497476:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
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
                        iM55979 = (i13 - C0946.m55979("۫ܺ")) * 87;
                        i3 = ((iM55979 ^ i12) * (-18159)) ^ (-903612740);
                        i4 = 2078662529;
                    } else {
                        iM55979 = (i12 - C0946.m55979("ۗ֫")) * 23;
                        i3 = ((iM55979 ^ i13) * 19929) ^ 1871757747;
                        i4 = -168990816;
                    }
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener10 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener10;
                    break;
                case -1619619330:
                case 762287132:
                    sArr = sArr3;
                    i17 = 35039;
                    iM55979 = C0873.m55680("᩷ۘ") ^ i12;
                    i3 = ((iM55979 ^ i13) * (-28457)) ^ (-129434971);
                    i4 = -1531938423;
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener11 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener11;
                    break;
                case -1571478416:
                case 676967183:
                    return i20;
                case -1287173976:
                case 96947333:
                    if (C0989.f81920 < 0) {
                        abstractC17043M55623 = abstractC17043M55623;
                        onClickListener = onClickListener4;
                        sArr = sArr3;
                        c20671 = c20672;
                        onClickListener5 = onClickListener5;
                        i = i16;
                        i2 = i18;
                        int iM559714 = C0946.m55979("ܿۧ") ^ i12;
                        int i27 = ((iM559714 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM559714 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i27;
                        c20672 = c20671;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC17043M55623 = abstractC17043M55623;
                    } else {
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        i5 = i18;
                        short[] sArr10 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr10;
                        int iM55683 = C0873.m55680("ᩴܶ") ^ i12;
                        short[] sArr11 = sArr4;
                        i14 = ((iM55683 ^ i13) * 8267) ^ 1988122756;
                        i15 = iM55683 ^ (-71948871);
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i5;
                        sArr4 = sArr11;
                        c20672 = c20672;
                        onClickListener5 = onClickListener5;
                        abstractC17043M55623 = abstractC17043M55623;
                        DialogInterface.OnClickListener onClickListener12 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener12;
                    }
                    break;
                case -1261566288:
                case 914484685:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20671 = c20672;
                    onClickListener5 = onClickListener5;
                    i = i16;
                    i2 = i18;
                    sArr2 = sArr3;
                    iM559711 = C0946.m55979(C0927.m55863(sArr2, 382, 3, i17));
                    i21 = 2116789544;
                    if (C1071.f81975 > 0) {
                        int iM55684 = C0873.m55680("۠᩵") ^ i12;
                        i15 = iM55684 ^ 708278375;
                        i14 = ((iM55684 ^ i13) * 10589) ^ (-1264747806);
                        sArr3 = sArr2;
                        i16 = i;
                        i18 = i2;
                        c20672 = c20671;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC17043M55623 = abstractC17043M55623;
                    } else {
                        sArr3 = sArr2;
                        onClickListener3 = onClickListener5;
                        b = b2;
                        onClickListener2 = onClickListener4;
                        int iM55685 = C0873.m55680("᩺ܿ") ^ i13;
                        DialogInterface.OnClickListener onClickListener13 = onClickListener3;
                        i14 = ((iM55685 ^ i12) * 9983) ^ (-1015374055);
                        i15 = iM55685 ^ (-1145015451);
                        onClickListener4 = onClickListener2;
                        i18 = i2;
                        abstractC17043M55623 = abstractC17043M55623;
                        onClickListener5 = onClickListener13;
                        b2 = b;
                        i16 = i;
                        c20672 = c20671;
                    }
                    break;
                case -1227944336:
                case -357747509:
                    activityC16573.f48676 = z;
                    activityC16573.f48675.mo13664();
                    return z;
                case -1220120272:
                case 506336570:
                    activityC16573.f48675.m38858();
                    return z;
                case -1186399911:
                case -736804345:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20671 = c20672;
                    onClickListener5 = onClickListener5;
                    i = i16;
                    i2 = i18;
                    sArr2 = sArr3;
                    C0861.m55627(c20671, iM55682);
                    byte b3 = activityC16573.f48673;
                    activityC16573.f48677 = b3;
                    onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩵ۖᩳ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            this.f63666.f48677 = i28;
                        }
                    };
                    if (!C0947.f81895) {
                        int iM559715 = C0946.m55979("ۘ᩸") ^ i13;
                        onClickListener4 = onClickListener;
                        i14 = ((iM559715 ^ i12) * 29165) ^ (-896505184);
                        i15 = iM559715 ^ 1328519771;
                        b2 = b3;
                        sArr3 = sArr2;
                        i16 = i;
                        i18 = i2;
                        c20672 = c20671;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC17043M55623 = abstractC17043M55623;
                    } else {
                        b2 = b3;
                        sArr = sArr2;
                        int iM559716 = C0946.m55979("ܿۧ") ^ i12;
                        int i28 = ((iM559716 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM559716 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i28;
                        c20672 = c20671;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC17043M55623 = abstractC17043M55623;
                    }
                    break;
                case -1139825474:
                case 1888740937:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
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
                    if (iM56307 == (C0873.m55680(strM56092) ^ 2129421025)) {
                        iM55979 = C0946.m55979("ۡܰ") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-21043)) ^ (-1578691503);
                        i4 = 377425604;
                    } else {
                        iM55979 = (C0946.m55979("ۡܽ") + i13) * (-29);
                        i3 = ((iM55979 ^ i12) * 31625) ^ 661883180;
                        i4 = -1837278528;
                    }
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener14 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener14;
                    break;
                case -1135083063:
                case 390291540:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr13 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr13;
                    iM56307 = C1048.m56307(menuItem);
                    strM56092 = C0989.m56092(f82227, 370, 3, i17);
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("ۢ֨") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-19543)) ^ 942181104;
                        i4 = -218512609;
                    } else {
                        iM55979 = C0946.m55979("۫ۛ") ^ i12;
                        i3 = ((iM55979 ^ i13) * 29975) ^ (-1213859000);
                        i4 = 1752725528;
                    }
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener15 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener15;
                    break;
                case -1112239218:
                case 1723713010:
                    C1036.m56257();
                    iM559710 = (i13 - C0946.m55979("ᩳ᩷")) * (-109);
                    i9 = ((iM559710 ^ i12) * (-24965)) ^ 1231031861;
                    i10 = -1896846778;
                    i15 = iM559710 ^ i10;
                    i14 = i9;
                    break;
                case -1047822290:
                case -684368862:
                    finish();
                    return z;
                case -1036876935:
                case 1352048977:
                    String strM55744 = C0892.m55744(abstractC17043M55623);
                    AbstractC0942.m55962(c8331);
                    C8331.m19220(c8331, iM559712, parent, strM55744, (String[]) null, 24);
                    return z;
                case -924708277:
                case -201681581:
                    sArr = sArr3;
                    i17 = 34438;
                    iM55979 = C0873.m55680("᩷ۘ") ^ i12;
                    i3 = ((iM55979 ^ i13) * (-28457)) ^ (-129434971);
                    i4 = -1531938423;
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener16 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener16;
                    break;
                case -899368761:
                case -480354822:
                    if (C0863.f81833 > 0) {
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        onClickListener5 = onClickListener5;
                        sArr4 = sArr4;
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i18;
                        short[] sArr14 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr14;
                        iM55979 = C0873.m55680("ۢ֨") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-19543)) ^ 942181104;
                        i4 = -218512609;
                        i6 = iM55979 ^ i4;
                        i18 = i18;
                        i23 = i23;
                        sArr4 = sArr4;
                        i24 = i24;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        DialogInterface.OnClickListener onClickListener17 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener17;
                    } else {
                        iM559710 = C0873.m55680("ᩴܰ") ^ i12;
                        i9 = ((iM559710 ^ i13) * 9215) ^ (-359095689);
                        i10 = 2119548367;
                        i15 = iM559710 ^ i10;
                        i14 = i9;
                    }
                    break;
                case -860832155:
                case -474382400:
                    i = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    onClickListener5 = onClickListener5;
                    i2 = i18;
                    short[] sArr15 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr15;
                    int i29 = DialogInterfaceC2564.f4230;
                    C20671 c20673 = new C20671(activityC16573);
                    sArr4 = f82227;
                    i23 = 379;
                    i24 = 3;
                    if (C0894.m55769() < 0) {
                        int iM55686 = (i12 - C0873.m55680("᩺ۧ")) * (-77);
                        int i30 = ((iM55686 ^ i13) * 31957) ^ (-991624346);
                        i15 = iM55686 ^ (-978563006);
                        i16 = i;
                        c20672 = c20673;
                        i14 = i30;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        abstractC17043M55623 = abstractC17043M55623;
                        DialogInterface.OnClickListener onClickListener18 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener18;
                    } else {
                        c20671 = c20673;
                        onClickListener = onClickListener4;
                        int iM559717 = C0946.m55979("ܿۧ") ^ i12;
                        int i210 = ((iM559717 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM559717 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i210;
                        c20672 = c20671;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC17043M55623 = abstractC17043M55623;
                    }
                    break;
                case -355663087:
                case 2147258078:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20671 = c20672;
                    onClickListener5 = onClickListener5;
                    dialogInterfaceC2564M21200 = C9199.m21200(c20671, C0873.m55680(C0937.m55921(sArr5, i18, i16, i17)) ^ 2122045158, onClickListener5, i19, onClickListener5);
                    if (ServiceConnectionC1013.m56157() > 0) {
                        int iM55687 = (C0873.m55680("ۚᩴ") ^ i13) * (-19);
                        i15 = iM55687 ^ (-1101322806);
                        i14 = ((iM55687 ^ i12) * 1387) ^ 686517613;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20671;
                    } else {
                        i = i16;
                        i2 = i18;
                        onClickListener = onClickListener4;
                        sArr = sArr3;
                        int iM559718 = C0946.m55979("ܿۧ") ^ i12;
                        int i211 = ((iM559718 ^ i13) * 7717) ^ (-1236130941);
                        i15 = iM559718 ^ 1235019278;
                        sArr3 = sArr;
                        i16 = i;
                        onClickListener4 = onClickListener;
                        i14 = i211;
                        c20672 = c20671;
                        i18 = i2;
                        onClickListener5 = onClickListener5;
                        i20 = i20;
                        abstractC17043M55623 = abstractC17043M55623;
                    }
                    break;
                case -272532950:
                case 1364668224:
                    C1028.m56247();
                    C0873.m55678();
                    return false;
                case -248789767:
                case 811645962:
                    C1024.m56209();
                    break;
                case -116438718:
                case 191722174:
                    abstractC17043M55623 = abstractC17043M55623;
                    if (iM56307 == (C0946.m55979(C0946.m55986(f82227, 394, 3, i17)) ^ 2104216598)) {
                        iM55680 = C0873.m55680("ۘܿ") ^ i13;
                        i7 = ((iM55680 ^ i12) * (-24349)) ^ (-1582855354);
                        i8 = -542015347;
                        r11 = i20;
                    } else {
                        iM55680 = (i12 - C0873.m55680("ۧۘ")) * 93;
                        i7 = ((iM55680 ^ i13) * 19407) ^ (-265400563);
                        i8 = -252060874;
                        r11 = i20;
                    }
                    i15 = iM55680 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC17043M55623 = abstractC17043M55623;
                    break;
                case -109979971:
                case 651708881:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i23 = i23;
                    i16 = i16;
                    i18 = i18;
                    short[] sArr16 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr16;
                    i24 = i24;
                    if (iM56307 == (C0873.m55680(C0930.m55893(f82227, 376, 3, i17)) ^ 2124288501)) {
                        iM55979 = (i13 - C0946.m55979("ۗۡ")) * (-71);
                        i3 = ((iM55979 ^ i12) * 5317) ^ 701626576;
                        i4 = 1228126885;
                    } else {
                        iM55979 = C0873.m55680("۫ᩳ") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-31199)) ^ 269072514;
                        i4 = 1866697105;
                    }
                    i6 = iM55979 ^ i4;
                    i18 = i18;
                    i23 = i23;
                    sArr4 = sArr4;
                    i24 = i24;
                    i15 = i6;
                    i14 = i3;
                    onClickListener5 = onClickListener5;
                    i16 = i16;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    DialogInterface.OnClickListener onClickListener19 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener19;
                    break;
                case -39832832:
                case 594513914:
                    abstractC17043M55623 = abstractC17043M55623;
                    r11 = 0;
                    r11 = 0;
                    if (iM56307 == (C0946.m55979(C1025.m56233(f82227, 400, 3, i17)) ^ 2119952332)) {
                        iM55680 = C0873.m55680("ܶۜ") ^ i13;
                        i7 = ((iM55680 ^ i12) * (-7723)) ^ (-273357311);
                        i8 = -146607114;
                    } else {
                        iM55680 = (C0946.m55979("ܰۡ") ^ i12) * 55;
                        i7 = ((iM55680 ^ i13) * 31351) ^ 1014555735;
                        i8 = -118101088;
                    }
                    i15 = iM55680 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC17043M55623 = abstractC17043M55623;
                    break;
                case -35732410:
                case 1525575555:
                    abstractC17043M55623 = abstractC17043M55623;
                    if (iM56307 == (C0873.m55680(C0854.m55597(f82227, 397, 3, i17)) ^ 2127881853)) {
                        iM55680 = (i12 - C0873.m55680("֡ᩴ")) * 41;
                        i7 = ((iM55680 ^ i13) * 26005) ^ 1975872405;
                        i8 = -867231849;
                        r11 = i20;
                    } else {
                        iM55680 = C0873.m55680("ۜۛ") ^ i13;
                        i7 = ((iM55680 ^ i12) * (-7573)) ^ 390058472;
                        i8 = -182128713;
                        r11 = i20;
                    }
                    i15 = iM55680 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC17043M55623 = abstractC17043M55623;
                    break;
                case -3796392:
                case 945675970:
                    boolean zM56332 = C1053.m56332(activityC16573.f48671);
                    abstractC17043M55623 = abstractC17043M55623;
                    iM559712 = C0946.m55979(C0861.m55618(f82227, 403, 3, i17)) ^ 2116582964;
                    if (zM56332) {
                        iM55680 = C0946.m55979("ܺۢ") ^ i12;
                        i7 = ((iM55680 ^ i13) * (-2193)) ^ (-925707843);
                        i8 = -1653553126;
                        r11 = i20;
                    } else {
                        iM55680 = (i13 - C0873.m55680("֡۫")) * (-85);
                        i7 = ((iM55680 ^ i12) * (-6673)) ^ (-373269468);
                        i8 = 2044747675;
                        r11 = i20;
                    }
                    i15 = iM55680 ^ i8;
                    i14 = i7;
                    i20 = r11;
                    abstractC17043M55623 = abstractC17043M55623;
                    break;
                case 126604316:
                case 1201249278:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    sArr4 = sArr4;
                    i16 = i16;
                    i5 = i18;
                    i23 = i23;
                    i24 = i24;
                    short[] sArr17 = sArr3;
                    onClickListener4 = onClickListener4;
                    sArr = sArr17;
                    iM55682 = C0873.m55680(C0937.m55921(sArr4, i23, i24, i17)) ^ 2099534130;
                    if (C0898.f81858 > 0) {
                        int iM559719 = C0946.m55979("ۙ۬") ^ i12;
                        i3 = ((iM559719 ^ i13) * (-6559)) ^ (-1991146780);
                        i6 = iM559719 ^ (-1583128213);
                        i24 = i24;
                        i18 = i5;
                        i23 = i23;
                        sArr4 = sArr4;
                        i15 = i6;
                        i14 = i3;
                        onClickListener5 = onClickListener5;
                        i16 = i16;
                        abstractC17043M55623 = abstractC17043M55623;
                        c20672 = c20672;
                        DialogInterface.OnClickListener onClickListener110 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener110;
                    }
                    int iM55688 = C0873.m55680("ᩴܶ") ^ i12;
                    short[] sArr18 = sArr4;
                    i14 = ((iM55688 ^ i13) * 8267) ^ 1988122756;
                    i15 = iM55688 ^ (-71948871);
                    i23 = i23;
                    i24 = i24;
                    i16 = i16;
                    i18 = i5;
                    sArr4 = sArr18;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    abstractC17043M55623 = abstractC17043M55623;
                    DialogInterface.OnClickListener onClickListener111 = onClickListener4;
                    sArr3 = sArr;
                    onClickListener4 = onClickListener111;
                    break;
                case 211944870:
                case 1202418483:
                    i2 = i18;
                    abstractC17043M55623 = abstractC17043M55623;
                    c20671 = c20672;
                    i = i16;
                    b = b2;
                    onClickListener2 = onClickListener4;
                    c20671.m46723(C4654.f10456, b, onClickListener2);
                    sArr3 = f82227;
                    if (C0955.f81898) {
                        onClickListener3 = null;
                        int iM55689 = C0873.m55680("᩺ܿ") ^ i13;
                        DialogInterface.OnClickListener onClickListener112 = onClickListener3;
                        i14 = ((iM55689 ^ i12) * 9983) ^ (-1015374055);
                        i15 = iM55689 ^ (-1145015451);
                        onClickListener4 = onClickListener2;
                        i18 = i2;
                        abstractC17043M55623 = abstractC17043M55623;
                        onClickListener5 = onClickListener112;
                        b2 = b;
                        i16 = i;
                    } else {
                        int iM556810 = C0873.m55680("ۡᩴ") ^ i13;
                        i14 = ((iM556810 ^ i12) * 19413) ^ (-429293057);
                        i15 = iM556810 ^ (-1135939893);
                        b2 = b;
                        onClickListener4 = onClickListener2;
                        i16 = i;
                        i18 = i2;
                        abstractC17043M55623 = abstractC17043M55623;
                        onClickListener5 = null;
                    }
                    c20672 = c20671;
                    break;
                case 244617642:
                case 1437396757:
                    activityC16573.setResult(2);
                    super.finish();
                    return z;
                case 650212370:
                case 834837417:
                    activityC16573.f48675.m38857();
                    return z;
                case 853333235:
                case 1564693117:
                    abstractC17043M55623 = abstractC17043M55623;
                    c20672 = c20672;
                    onClickListener5 = onClickListener5;
                    i19 = iM559711 ^ i21;
                    sArr5 = f82227;
                    i18 = 385;
                    if (RunnableC0938.f81886 >= 0) {
                        i16 = 3;
                        i5 = 385;
                        short[] sArr19 = sArr3;
                        onClickListener4 = onClickListener4;
                        sArr = sArr19;
                        int iM556811 = C0873.m55680("ᩴܶ") ^ i12;
                        short[] sArr110 = sArr4;
                        i14 = ((iM556811 ^ i13) * 8267) ^ 1988122756;
                        i15 = iM556811 ^ (-71948871);
                        i23 = i23;
                        i24 = i24;
                        i16 = i16;
                        i18 = i5;
                        sArr4 = sArr110;
                        c20672 = c20672;
                        onClickListener5 = onClickListener5;
                        abstractC17043M55623 = abstractC17043M55623;
                        DialogInterface.OnClickListener onClickListener113 = onClickListener4;
                        sArr3 = sArr;
                        onClickListener4 = onClickListener113;
                    } else {
                        int iM559720 = C0946.m55979("ۛܳ") ^ i12;
                        i15 = iM559720 ^ 1729566311;
                        i14 = ((iM559720 ^ i13) * (-30031)) ^ 2090773230;
                        c20672 = c20672;
                        onClickListener5 = onClickListener5;
                        abstractC17043M55623 = abstractC17043M55623;
                        i16 = 3;
                    }
                    break;
                case 1131002608:
                case 1434843473:
                    abstractC17043M55623 = C0861.m55623(activityC16573.f48671, new String[i20]);
                    c8331 = activityC16573.f48670;
                    parent = abstractC17043M55623.getParent();
                    if (C1017.f81942 >= 0) {
                        iM559710 = (i13 - C0946.m55979("ᩳ᩷")) * (-109);
                        i9 = ((iM559710 ^ i12) * (-24965)) ^ 1231031861;
                        i10 = -1896846778;
                    } else {
                        iM559710 = (i12 - C0946.m55979("ܰۤ")) * 75;
                        i9 = ((iM559710 ^ i13) * 27101) ^ (-478477213);
                        i10 = 473953502;
                    }
                    i15 = iM559710 ^ i10;
                    i14 = i9;
                    break;
                default:
                    C0947.m55996(C1929.m56567(dialogInterfaceC2564M21200), new ViewOnClickListenerC24898(activityC16573, dialogInterfaceC2564M21200, z ? 1 : 0));
                    return z;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ */
    private byte[] m37559() {
        int iM55979;
        int i;
        C14146 c14146 = null;
        boolean z = false;
        int i2 = 1315461950;
        int i3 = C1036.f81953;
        int i4 = C0992.f81922;
        int iM55680 = (C0873.m55680("᩸֫") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i5 = ((iM55680 ^ i3) * (-9363)) ^ 1383843560;
        int i6 = -695098000;
        while (true) {
            int i7 = iM55680 ^ i6;
            C11996 c11996 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * (-11163)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1957862118:
                    case -1438283836:
                        c14146 = this.f48669;
                        z = false;
                        if (C1028.f81950 > 0) {
                            iM55979 = (i4 - C0873.m55680("۟᩷")) * (-53);
                            i5 = ((iM55979 ^ i3) * 21503) ^ (-1225891421);
                            i = -1979105400;
                            i7 = iM55979 ^ i;
                        } else {
                            iM55680 = C0873.m55680("ۙܰ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 8599) ^ (-1605529187);
                            i6 = -1104996820;
                        }
                        break;
                    case -1862406212:
                    case -1408404582:
                        C0917.m55850(c11996, this.f48673);
                        iM55979 = (C0873.m55680("᩸ᩴ") ^ i3) * (-99);
                        i5 = ((iM55979 ^ i4) * 24351) ^ (-673084587);
                        i = 494070305;
                        i7 = iM55979 ^ i;
                        break;
                    case -1387545664:
                    case 1204370080:
                        c14146.m32395(c11996, z);
                        return c11996.m27447();
                    case -960527856:
                    case 1796097396:
                        c11996.m27445(this.f48678);
                        if (this.f48678) {
                            iM55979 = C0946.m55979("۫ܰ") ^ i3;
                            i5 = ((iM55979 ^ i4) * (-21241)) ^ (-13188122);
                            i = 1257146410;
                        } else {
                            iM55979 = (C0873.m55680("᩸ᩴ") ^ i3) * (-99);
                            i5 = ((iM55979 ^ i4) * 24351) ^ (-673084587);
                            i = 494070305;
                        }
                        i7 = iM55979 ^ i;
                        break;
                    case -843780403:
                    case 1489038158:
                        if (RunnableC0871.f81839 < 0) {
                            iM55680 = C0946.m55979("᩶ܺ") ^ i4;
                            i5 = ((iM55680 ^ i3) * (-1507)) ^ (-475657198);
                            i6 = -2107359160;
                        } else {
                            iM55680 = (i4 - C0873.m55680("ۖܶ")) * 37;
                            i5 = ((iM55680 ^ i3) * (-13313)) ^ (-465381526);
                            i6 = 1835888519;
                        }
                        break;
                    case -441865799:
                    case -278715014:
                        RunnableC1014.m56177();
                        return null;
                    case -335428076:
                    case 2032514333:
                        C1003.m56123();
                        if (C0873.f81841 <= 0) {
                            iM55680 = (i4 - C0873.m55680("ۖܶ")) * 37;
                            i5 = ((iM55680 ^ i3) * (-13313)) ^ (-465381526);
                            i6 = 1835888519;
                        } else {
                            iM55680 = (i3 - C0873.m55680("֡᩷")) * (-111);
                            i5 = ((iM55680 ^ i4) * 31283) ^ 376409486;
                            i6 = 108017206;
                        }
                        break;
                    case 814970579:
                    case 1875309116:
                        C1053.m56327();
                        if (!AbstractC0942.m55971()) {
                            iM55680 = (i4 - C0873.m55680("ۖܶ")) * 37;
                            i5 = ((iM55680 ^ i3) * (-13313)) ^ (-465381526);
                            i6 = 1835888519;
                        } else {
                            iM55680 = (C0946.m55979("ۡۜ") + i3) * (-21);
                            i5 = ((iM55680 ^ i4) * (-18139)) ^ 1497388137;
                            i6 = 1986946829;
                        }
                        break;
                    case 875193606:
                    case 894708631:
                        AbstractC0942.m55971();
                        iM55680 = (i3 - C0873.m55680("֡᩷")) * (-111);
                        i5 = ((iM55680 ^ i4) * 31283) ^ 376409486;
                        i6 = 108017206;
                        break;
                    default:
                        if (C1048.f81963) {
                            if (C1124.f82007 < 0) {
                                if (C1024.f81946) {
                                    iM55680 = (i3 - C0873.m55680("֡᩷")) * (-111);
                                    i5 = ((iM55680 ^ i4) * 31283) ^ 376409486;
                                    i6 = 108017206;
                                    break;
                                } else if (C0898.f81858 <= 0) {
                                    iM55680 = (i4 - C0873.m55680("ۖܶ")) * 37;
                                    i5 = ((iM55680 ^ i3) * (-13313)) ^ (-465381526);
                                    i6 = 1835888519;
                                    break;
                                } else if (C0912.f81867 > 0) {
                                    if (C0992.f81922 >= 0 || ViewOnClickListenerC0939.f81888 <= 0) {
                                        iM55680 = C0946.m55979("᩶ܺ") ^ i4;
                                        i5 = ((iM55680 ^ i3) * (-1507)) ^ (-475657198);
                                        i6 = -2107359160;
                                        break;
                                    } else if (C1964.f83032 > 0) {
                                        c11996 = new C11996();
                                        if (C1229.m56410() == 0) {
                                            iM55979 = (C0873.m55680("ۜۤ") ^ i4) * 25;
                                            i5 = ((iM55979 ^ i3) * (-9921)) ^ 745579511;
                                            i = 1607420108;
                                            i7 = iM55979 ^ i;
                                            break;
                                        }
                                    }
                                }
                            }
                            iM55680 = C0873.m55680("ۙܰ") ^ i3;
                            i5 = ((iM55680 ^ i4) * 8599) ^ (-1605529187);
                            i6 = -1104996820;
                            break;
                        }
                        iM55680 = (C0946.m55979("ۡۜ") + i3) * (-21);
                        i5 = ((iM55680 ^ i4) * (-18139)) ^ 1497388137;
                        i6 = 1986946829;
                        break;
                }
            }
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        C17143 c17143 = null;
        int i = -1474828796;
        int i2 = ViewOnClickListenerC0939.f81888;
        int i3 = C1044.f81959;
        int iM55680 = C0873.m55680("ܶ᩻") ^ i2;
        int i4 = ((iM55680 ^ i3) * 23679) ^ (-1740611177);
        int i5 = 1670248068;
        while (true) {
            i = ((((i ^ i3) * (-25631)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1841038682:
                case -187143320:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i2 - C0946.m55979("ۖ۠")) * (-71);
                        i4 = ((iM55680 ^ i3) * (-20465)) ^ (-345382312);
                        i5 = -921542862;
                    } else {
                        iM55680 = C0873.m55680("ۧ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27183)) ^ 1191572376;
                        i5 = 1677362542;
                    }
                    break;
                case -1745398635:
                case -1385340851:
                    if (RunnableC0938.m55938() != 0) {
                        iM55680 = (i2 - C0873.m55680("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM55680 = C0873.m55680("֫ܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10485)) ^ 43416760;
                        i5 = 1434805959;
                    }
                    break;
                case -1687711327:
                case 1279234687:
                    C0912.m55833();
                    if (!C1024.f81946) {
                        iM55680 = C0873.m55680("֡ۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19731) ^ 872861308;
                        i5 = 736689303;
                    } else {
                        iM55680 = C0873.m55680("ۜ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    }
                    break;
                case -1612660630:
                case -572603923:
                    if (C0917.m55854()) {
                        iM55680 = C0946.m55979("᩸ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10741)) ^ 1433355891;
                        i5 = -966564567;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    }
                    break;
                case -1548527596:
                case -492067020:
                    if (!RunnableC1014.m56177()) {
                        iM55680 = C0873.m55680("ۜ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        iM55680 = (C0946.m55979("ܿ᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i2) * (-20773)) ^ 633693335;
                        i5 = 442918439;
                    }
                    break;
                case -1029440603:
                case 184918099:
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ۜ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        iM55680 = (C0873.m55680("ۧۙ") + i2) * (-17);
                        i4 = ((iM55680 ^ i3) * 28339) ^ (-2122553384);
                        i5 = -2137843269;
                    }
                    break;
                case -771762133:
                case 135898876:
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ۜ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        iM55680 = C0873.m55680("᩸ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-4081)) ^ (-1559902239);
                        i5 = -1436603170;
                    }
                    break;
                case -645265107:
                case 2113091791:
                    break;
                case -541194488:
                case 1937637303:
                    c17143.m38845();
                    iM55680 = C0873.m55680("֨ۗ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 11323) ^ (-734729054);
                    i5 = -173498568;
                    break;
                case -385845284:
                case 1852404873:
                    if (C0947.f81895) {
                        iM55680 = C0873.m55680("֡ۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 19731) ^ 872861308;
                        i5 = 736689303;
                    } else {
                        iM55680 = (C0873.m55680("ۨܺ") ^ i2) * (-119);
                        i4 = ((iM55680 ^ i3) * (-28961)) ^ 794740819;
                        i5 = 1324347968;
                    }
                    break;
                case -341751697:
                case 116451553:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i2 - C0873.m55680("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM55680 = C0873.m55680("ܰۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16107) ^ (-889644712);
                        i5 = 674635460;
                    }
                    break;
                case -178608221:
                case 1920286914:
                    c17143 = this.f48675;
                    if (c17143 != null) {
                        iM55680 = C0873.m55680("ۧ᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * 31781) ^ (-1277532365);
                        i5 = 660515827;
                    } else {
                        iM55680 = C0873.m55680("֨ۗ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 11323) ^ (-734729054);
                        i5 = -173498568;
                    }
                    break;
                case -25185490:
                case 1864409239:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֡ۙ")) * (-105);
                        i4 = ((iM55680 ^ i2) * 26145) ^ (-1106094239);
                        i5 = -799804379;
                    }
                    break;
                case 372863260:
                case 1665695223:
                    C0949.m56012();
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM55680 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        iM55680 = C0873.m55680("ۜ֨") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    }
                    break;
                case 445634495:
                case 692114504:
                    C0917.m55854();
                    RunnableC0871.m55672();
                    break;
                case 864646199:
                case 934193334:
                    super.onResume();
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("ۘ᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6065) ^ (-426996389);
                        i5 = -2143135353;
                    } else {
                        iM55680 = (C0946.m55979("ܿ᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55680 ^ i2) * (-20773)) ^ 633693335;
                        i5 = 442918439;
                    }
                    break;
                case 1441921971:
                case 1776581582:
                    C1071.m56343();
                    C1229.m56410();
                    iM55680 = C0873.m55680("ۜ֨") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-20627)) ^ (-264505712);
                    i5 = 2103683635;
                    break;
                default:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i2 - C0946.m55979("ۖ۠")) * (-71);
                        i4 = ((iM55680 ^ i3) * (-20465)) ^ (-345382312);
                        i5 = -921542862;
                    } else {
                        iM55680 = (C0873.m55680("ۡܶ") ^ i2) * (-75);
                        i4 = ((iM55680 ^ i3) * (-22181)) ^ (-2144483609);
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
    
        if (p067l.C1025.f81947 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (p067l.C1053.f81965 <= 0) goto L9;
     */
    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        Bundle bundle2 = bundle;
        int i7 = C0863.f81833;
        int i8 = C1053.f81965;
        int iM55681 = C0873.m55680("᩶۬") ^ i8;
        int i9 = ((iM55681 ^ i7) * (-31493)) ^ (-688228104);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i10 = iM55681 ^ (-1571238213);
        byte[] bArrM37559 = null;
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
        AbstractC17043 abstractC17043M38693 = null;
        AbstractC17043 abstractC17043 = null;
        String strM56132 = null;
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
                    if (this.f48669 != null) {
                        iM55680 = (C0873.m55680("᩹ᩴ") + i8) * 27;
                        i3 = ((iM55680 ^ i7) * (-17951)) ^ 1598607045;
                        i4 = 1072310911;
                    } else {
                        iM55680 = C0873.m55680("ۛܰ") ^ i7;
                        i3 = ((iM55680 ^ i8) * 15945) ^ (-1985896155);
                        i4 = -2089458398;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1939095928:
                case -525715341:
                    C0845.m55584();
                    C0877.m55696();
                    sArr = sArr;
                    iM55680 = C0946.m55979("ۤ᩵") ^ i7;
                    i3 = ((iM55680 ^ i8) * 20791) ^ 1610047459;
                    i4 = 1577968384;
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1827661996:
                case -795534637:
                    i11 = 40514;
                    iM55680 = (i7 - C0946.m55979("᩹ܺ")) * (-61);
                    i3 = ((iM55680 ^ i8) * (-4299)) ^ (-352021404);
                    i4 = 1641789830;
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1777869659:
                case 1031610680:
                    sArr = sArr;
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0873.m55680("ᩴ᩺") ^ i8;
                        i3 = ((iM55680 ^ i7) * (-4303)) ^ (-260037823);
                        i4 = 2048591846;
                    } else {
                        iM55680 = (C0873.m55680("ܺۤ") + i7) * (-37);
                        i3 = ((iM55680 ^ i8) * (-29841)) ^ 1534406655;
                        i4 = -1398906816;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1733549415:
                case 141928386:
                    bundle2.putString(str, C1046.m56297(abstractC17043M38693));
                    bundle2.remove(strM56132);
                    return;
                case -1684079210:
                case 794440143:
                    return;
                case -1644058974:
                case -1313558029:
                    sArr = sArr;
                    c = 406;
                    if (C0912.m55833()) {
                        iM55680 = C0873.m55680("ᩴ᩺") ^ i8;
                        i3 = ((iM55680 ^ i7) * (-4303)) ^ (-260037823);
                        i4 = 2048591846;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ۤ֡")) * (-63);
                        i3 = ((iM55680 ^ i7) * 18481) ^ (-795741693);
                        i4 = -1147752977;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1626137380:
                case -1428183135:
                    i11 = 17599;
                    iM55680 = (i7 - C0946.m55979("᩹ܺ")) * (-61);
                    i3 = ((iM55680 ^ i8) * (-4299)) ^ (-352021404);
                    i4 = 1641789830;
                    i10 = iM55680 ^ i4;
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
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0946.m55979("ۤ᩵") ^ i7;
                        i3 = ((iM55680 ^ i8) * 20791) ^ 1610047459;
                        i4 = 1577968384;
                    } else {
                        iM55680 = (i7 - C0946.m55979("۠ۘ")) * 59;
                        i3 = ((iM55680 ^ i8) * 29143) ^ (-1284215437);
                        i4 = 1857270435;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1561514672:
                case -550129661:
                    sArr = sArr;
                    i17 = 407;
                    i19 = 16;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i7 - C0946.m55979("ۚۘ")) * 101;
                        i3 = ((iM55680 ^ i8) * (-3837)) ^ (-23371824);
                        i4 = 1070082966;
                    } else {
                        iM55680 = C0873.m55680("ܿۡ") ^ i8;
                        i3 = ((iM55680 ^ i7) * (-28535)) ^ 779225640;
                        i4 = 1128076574;
                    }
                    i10 = iM55680 ^ i4;
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
                    if (C1003.f81929 <= 0) {
                        iM55680 = C0873.m55680("ܳ֨") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-21605)) ^ (-2068431667);
                        i4 = 280711793;
                    } else {
                        iM55680 = C0946.m55979("ۗܶ") ^ i7;
                        i3 = ((iM55680 ^ i8) * 17855) ^ 728636514;
                        i4 = -2025468409;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1439902213:
                case 1189498896:
                    C0894.m55769();
                    C1048.m56305();
                    return;
                case -1404096516:
                case 139523493:
                    if (!C0892.f81851) {
                        sArr = sArr;
                        iM55680 = (i7 - C0946.m55979("ۚۘ")) * 101;
                        i3 = ((iM55680 ^ i8) * (-3837)) ^ (-23371824);
                        i4 = 1070082966;
                        i10 = iM55680 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    }
                    sArr = sArr;
                    iM55680 = C0946.m55979("ۤ᩵") ^ i7;
                    i3 = ((iM55680 ^ i8) * 20791) ^ 1610047459;
                    i4 = 1577968384;
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -1353686615:
                case 1589462438:
                    sArr = f82227;
                    if (C0949.f81897 >= 0) {
                        iM559710 = C0873.m55680("ۖܶ") ^ i8;
                        i5 = ((iM559710 ^ i7) * 7201) ^ (-1211414318);
                        i6 = -722023813;
                    } else {
                        iM559710 = (C0946.m55979("ܶܶ") + i8) * 89;
                        i5 = ((iM559710 ^ i7) * (-3117)) ^ (-1303372008);
                        i6 = -345032789;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    bundle2 = bundle;
                    break;
                case -1174698642:
                case -979222085:
                    sArr = sArr;
                    bArrM37559 = m37559();
                    length = bArrM37559.length;
                    i20 = WXNativeGamePageObject.LENGTH_LIMIT;
                    if (!C0937.f81884) {
                        sArr = sArr;
                        iM559710 = C0873.m55680("ۖܶ") ^ i8;
                        i5 = ((iM559710 ^ i7) * 7201) ^ (-1211414318);
                        i6 = -722023813;
                        i10 = iM559710 ^ i6;
                        i9 = i5;
                        bundle2 = bundle;
                    } else {
                        iM55680 = C0873.m55680("ܶ֨") ^ i7;
                        i3 = ((iM55680 ^ i8) * 2113) ^ (-419886636);
                        i4 = 1180099477;
                        i10 = iM55680 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    }
                    break;
                case -918318775:
                case 1840455673:
                    sArr = sArr;
                    sArr4 = f82227;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ۙۚ") ^ i8;
                        i3 = ((iM55680 ^ i7) * (-23911)) ^ 1769130649;
                        i4 = -2048375814;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۚۘ")) * 101;
                        i3 = ((iM55680 ^ i8) * (-3837)) ^ (-23371824);
                        i4 = 1070082966;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -793375312:
                case -548448690:
                    sArr = sArr;
                    int i22 = s2 + s;
                    if (i16 - (i22 * i22) < 0) {
                        iM55680 = C0946.m55979("ۧ֡") ^ i8;
                        i3 = ((iM55680 ^ i7) * 31699) ^ 1582135822;
                        i4 = -456529823;
                    } else {
                        iM55680 = C0873.m55680("ۙܽ") ^ i8;
                        i3 = ((iM55680 ^ i7) * 23049) ^ 320907880;
                        i4 = -1420824976;
                    }
                    i10 = iM55680 ^ i4;
                    i9 = i3;
                    sArr = sArr;
                    bundle2 = bundle;
                    break;
                case -729310572:
                case -243790137:
                    strM56132 = C1003.m56132(sArr2, i12, 12, i11);
                    if (length < i20) {
                        iM55979 = (C0946.m55979("ۚۛ") + i7) * (-113);
                        i = ((iM55979 ^ i8) * 31493) ^ (-46598778);
                        i2 = -911444790;
                    } else {
                        iM55979 = (i7 - C0873.m55680("֫֡")) * 17;
                        i = ((iM55979 ^ i8) * (-28525)) ^ 1614948414;
                        i2 = -1230889447;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -340605831:
                case 1340551420:
                    break;
                case -265366595:
                case 1972470571:
                    abstractC17043M38693 = abstractC17043.m38693(C0894.m55773(sArr3, i13, 13, i11));
                    iM55979 = (C0873.m55680("ۛۨ") ^ i8) * (-93);
                    i = ((iM55979 ^ i7) * (-8405)) ^ 712190465;
                    i2 = -1838272978;
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
                case -143928740:
                case 912969748:
                    bundle2.putByteArray(strM56132, bArrM37559);
                    bundle2.remove(str);
                    return;
                case -111947489:
                case 2002901940:
                    sArr = sArr;
                    int i23 = i17;
                    int i24 = i19;
                    String strM56233 = C1025.m56233(sArr, i23, i24, i11);
                    sArr2 = f82227;
                    if (C0946.f81894 != 0) {
                        i17 = i23;
                        i19 = i24;
                        i12 = 423;
                        str = strM56233;
                        iM55680 = C0873.m55680("ܳ֨") ^ i7;
                        i3 = ((iM55680 ^ i8) * (-21605)) ^ (-2068431667);
                        i4 = 280711793;
                        i10 = iM55680 ^ i4;
                        i9 = i3;
                        sArr = sArr;
                        bundle2 = bundle;
                    } else {
                        int iM55682 = C0873.m55680("ܰۛ") ^ i7;
                        i9 = ((iM55682 ^ i8) * (-2263)) ^ (-1868169855);
                        int i25 = iM55682 ^ (-376199059);
                        i19 = i24;
                        sArr = sArr;
                        i12 = 423;
                        i17 = i23;
                        str = strM56233;
                        i10 = i25;
                    }
                    break;
                case 288454210:
                case 1108548469:
                    abstractC17043 = C17853.f53280;
                    sArr3 = f82227;
                    i13 = 435;
                    if (C1044.f81959 < 0) {
                        iM55979 = C0946.m55979("᩸ۖ") ^ i8;
                        i = ((iM55979 ^ i7) * 6083) ^ (-988484045);
                        i2 = -999177781;
                        i10 = iM55979 ^ i2;
                        i9 = i;
                    } else {
                        sArr = sArr;
                        iM55680 = C0873.m55680("ᩴ᩺") ^ i8;
                        i3 = ((iM55680 ^ i7) * (-4303)) ^ (-260037823);
                        i4 = 2048591846;
                        i10 = iM55680 ^ i4;
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
                        abstractC17043M38693.m38661(bArrM37559, 0, bArrM37559.length);
                        iM55979 = C0873.m55680("֡֡") ^ i8;
                        i = ((iM55979 ^ i7) * (-4659)) ^ (-1189370002);
                        i2 = -1393508463;
                    } catch (IOException e) {
                        iOException = e;
                        iM55979 = C0873.m55680("۟֨") ^ i7;
                        i = ((iM55979 ^ i8) * 27645) ^ (-1567472466);
                        i2 = -1713148406;
                    }
                    i10 = iM55979 ^ i2;
                    i9 = i;
                    break;
            }
        }
    }
}
