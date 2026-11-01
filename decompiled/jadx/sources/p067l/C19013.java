package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.p080ec.custom.sec.SecP256K1Field;

/* JADX INFO: renamed from: l.ܿᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes4.dex */
public final class C19013 {

    /* JADX INFO: renamed from: ۢۧܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f82286 = {2208, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27101, 27102, 27084, 27098, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27123, 27134, 27110, 27130, 27117, 27071, 27132, 27120, 27114, 27121, 27115, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27101, 27102, 27084, 27098, 27071, 27130, 27111, 27115, 27130, 27121, 27115, 27071, 27123, 27130, 27121, 27128, 27115, 27127, 27087, 27134, 27115, 27132, 27127, 27130, 27131, 27071, 27101, 27102, 27084, 27098, 27071, 27130, 27111, 27115, 27130, 27121, 27115, 27071, 27132, 27117, 27120, 27116, 27116, 27130, 27116, 27071, 27133, 27123, 27120, 27132, 27124, 27071, 27133, 27120, 27114, 27121, 27131, 27134, 27117, 27110, 27082, 27121, 27124, 27121, 27120, 27112, 27121, 27071, 27101, 27102, 27084, 27098, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27123, 27134, 27110, 27130, 27117, 27071, 27115, 27134, 27128, 27071, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27123, 27126, 27115, 27130, 27117, 27134, 27123, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27132, 27120, 27114, 27121, 27115, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27119, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27126, 27131, 27130, 27121, 27115, 27126, 27115, 27110, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27119, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27132, 27123, 27126, 27119, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27123, 27126, 27115, 27130, 27117, 27134, 27123, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27120, 27129, 27129, 27116, 27130, 27115, 27088, 27113, 27130, 27117, 27123, 27134, 27119, 27119, 27126, 27121, 27128, 27071, 27119, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27116, 27115, 27134, 27117, 27115, 27116, 27087, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27116, 27115, 27134, 27117, 27115, 27071, 27122, 27126, 27116, 27116, 27130, 27116, 27071, 27132, 27123, 27126, 27119, 5952, 4873, 4910, 4918, 4897, 4908, 4905, 4900, 4960, 4912, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4912, 4897, 4916, 4899, 4904, 4960, 4914, 4897, 4910, 4903, 4901, 4880, 4897, 4916, 4899, 4904, 4960, 4908, 4897, 4921, 4901, 4914, 4915, 4960, 4898, 4901, 4908, 4911, 4910, 4903, 4960, 4916, 4911, 4960, 4900, 4905, 4902, 4902, 4901, 4914, 4901, 4910, 4916, 4960, 4898, 4908, 4911, 4899, 4907, 4915, 4880, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4912, 4897, 4916, 4899, 4904, 4960, 4899, 4914, 4911, 4915, 4915, 4901, 4915, 4960, 4897, 4960, 4982, 4980, 4960, 4875, 4905, 4866, 4960, 4898, 4908, 4911, 4899, 4907, 4869, 4909, 4912, 4916, 4921, 4960, 4912, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4912, 4897, 4916, 4899, 4904, 4960, 4914, 4897, 4910, 4903, 4901, 4880, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4908, 4897, 4921, 4901, 4914, 4960, 4900, 4911, 4901, 4915, 4960, 4910, 4911, 4916, 4960, 4905, 4910, 4916, 4901, 4914, 4915, 4901, 4899, 4916, 4960, 4905, 4916, 4915, 4960, 4899, 4908, 4905, 4912, 4880, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4915, 4916, 4897, 4914, 4916, 4915, 4960, 4911, 4918, 4901, 4914, 4908, 4897, 4912, 1882, 16102, 16087, 16066, 16085, 16094, 16022, 16089, 16080, 16080, 16069, 16083, 16066, 16025, 16064, 16087, 16090, 16067, 16083, 16022, 16090, 16083, 16088, 16081, 16066, 16094, 16022, 16091, 16095, 16069, 16091, 16087, 16066, 16085, 16094, 16102, 16087, 16066, 16085, 16094, 16022, 16089, 16080, 16080, 16069, 16083, 16066, 16069, 16022, 16091, 16067, 16069, 16066, 16022, 16084, 16083, 16022, 16069, 16089, 16068, 16066, 16083, 16082, 16022, 16065, 16095, 16066, 16094, 16095, 16088, 16022, 16089, 16088, 16083, 16022, 16084, 16090, 16089, 16085, 16093, 1455, 27145, 27182, 27190, 27169, 27180, 27177, 27172, 27232, 27176, 27173, 27192, 27232, 27171, 27176, 27173, 27171, 27179, 27184, 27183, 27177, 27182, 27188, 27258, 27232, 1066, 7928, 7881, 7900, 7883, 7872, 7816, 7898, 7881, 7878, 7887, 7885, 7816, 7883, 7898, 7879, 7899, 7899, 7885, 7899, 7816, 7881, 7816, 7838, 7836, 7816, 7907, 7873, 7914, 7816, 7882, 7876, 7879, 7883, 7875, 3273, -1449, -1421, -1431, -1431, -1421, -1420, -1411, -1478, -1415, -1422, -1409, -1415, -1423, -1430, -1419, -1421, -1420, -1426, -1478, -1430, -1413, -1426, -1426, -1409, -1432, -1420, -1478, -1421, -1410, -1409, -1420, -1426, -1421, -1426, -1437};

    /* JADX INFO: renamed from: ֫ */
    public final int f56677;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23667[] f56678;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ long m43159(long j) {
        return m43160(j, 40L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m43160(long j, long j2) {
        long j3 = 0;
        int i = -1814198210;
        int i2 = RunnableC0938.f81886;
        int i3 = C1404.f82149;
        int iM55979 = C0946.m55979("ܰ֡") ^ i2;
        int i4 = ((iM55979 ^ i3) * 28523) ^ 1718558276;
        int i5 = 1914199044;
        while (true) {
            i = ((((i ^ i3) * 9465) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1839856590:
                case -980606520:
                    if (j3 < j) {
                        iM55979 = C0946.m55979("ܽۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10755)) ^ (-871788321);
                        i5 = 1412353615;
                    } else {
                        iM55979 = (C0873.m55680("᩵۠") + i3) * 77;
                        i4 = ((iM55979 ^ i2) * 24019) ^ 1296021374;
                        i5 = 352453814;
                    }
                    break;
                case -1839679810:
                case 1246818897:
                    C0854.m55595();
                    C0863.m55643();
                    return 0L;
                case -1833334248:
                case -532669976:
                    C0947.m55997();
                    if (C0989.m56095() > 0) {
                        iM55979 = (i3 - C0873.m55680("ۨܽ")) * (-35);
                        i4 = ((iM55979 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        iM55979 = C0946.m55979("᩵ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    }
                    break;
                case -1565454645:
                case -839123463:
                    C1404.m56468();
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14901) ^ 1839435402;
                        i5 = 1288625483;
                    } else {
                        iM55979 = C0946.m55979("᩵ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    }
                    break;
                case -1527068901:
                case -671492156:
                    if (C0906.f81862 < 0) {
                        iM55979 = (i2 - C0946.m55979("ۘ֨")) * 47;
                        i4 = ((iM55979 ^ i3) * 10601) ^ 82493882;
                        i5 = 686678638;
                    } else {
                        iM55979 = C0946.m55979("᩵ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    }
                    break;
                case -1363056976:
                case -995849235:
                    return j3;
                case -1319330127:
                case -584192868:
                    C0912.m55833();
                    C1071.m56343();
                    iM55979 = C0946.m55979("᩵ܿ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 23931) ^ (-379077509);
                    i5 = 62411518;
                    break;
                case -1229951595:
                case -1216225724:
                    if (C0854.m55595() >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۨܽ")) * (-35);
                        i4 = ((iM55979 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۟") + i3) * (-103);
                        i4 = ((iM55979 ^ i2) * (-22045)) ^ 1571315842;
                        i5 = -1575569230;
                    }
                    break;
                case -1089405698:
                case 1969770616:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14901) ^ 1839435402;
                        i5 = 1288625483;
                    } else {
                        iM55979 = C0946.m55979("۫ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22869) ^ 1071351631;
                        i5 = -2060917778;
                    }
                    break;
                case -976357798:
                case 641961472:
                    return C14849.FOREVER_NS;
                case -856620615:
                case 1476974498:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۨܽ")) * (-35);
                        i4 = ((iM55979 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۚ᩶")) * 75;
                        i4 = ((iM55979 ^ i3) * (-15343)) ^ 221304000;
                        i5 = -938199390;
                    }
                    break;
                case -607391466:
                case -470063265:
                    if (C1124.m56367() >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۨܽ")) * (-35);
                        i4 = ((iM55979 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        iM55979 = C0873.m55680("۫᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-11495)) ^ 289762785;
                        i5 = -407390048;
                    }
                    break;
                case -324626980:
                case 677227303:
                    if (j3 >= 0) {
                        iM55979 = C0946.m55979("ܽۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15401) ^ 122990662;
                        i5 = 296214974;
                    } else {
                        iM55979 = C0946.m55979("ܽۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10755)) ^ (-871788321);
                        i5 = 1412353615;
                    }
                    break;
                case -102819842:
                case 10787638:
                    if (C1194.m56396() <= 0) {
                        iM55979 = (i3 - C0873.m55680("ۨܽ")) * (-35);
                        i4 = ((iM55979 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        iM55979 = C0946.m55979("۠᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5445)) ^ (-285180491);
                        i5 = -1168311650;
                    }
                    break;
                case 348905840:
                case 852408053:
                    j3 = j2 + j;
                    if (C0947.m55997()) {
                        iM55979 = (i3 - C0946.m55979("ۚ᩵")) * 57;
                        i4 = ((iM55979 ^ i2) * 6585) ^ 1949183620;
                        i5 = -1713943934;
                    } else {
                        iM55979 = C0946.m55979("֫֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-889)) ^ 1661567547;
                        i5 = 948701110;
                    }
                    break;
                case 464629793:
                case 594290905:
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("᩵ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        iM55979 = (C0873.m55680("ۧ᩺") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM55979 ^ i2) * 14835) ^ 1353792503;
                        i5 = 1228895431;
                    }
                    break;
                case 488389381:
                case 1985255271:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ۛ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14901) ^ 1839435402;
                        i5 = 1288625483;
                    } else {
                        iM55979 = (C0946.m55979("ۖ᩹") ^ i3) * 77;
                        i4 = ((iM55979 ^ i2) * 9441) ^ (-852906911);
                        i5 = -206390966;
                    }
                    break;
                case 733989409:
                case 1969315109:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۘ֨")) * 47;
                        i4 = ((iM55979 ^ i3) * 10601) ^ 82493882;
                        i5 = 686678638;
                    } else {
                        iM55979 = C0946.m55979("᩶ۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-22795)) ^ 378261359;
                        i5 = 416816567;
                    }
                    break;
                default:
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0946.m55979("᩵ܿ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        iM55979 = (C0946.m55979("ܿۚ") + i2) * (-19);
                        i4 = ((iM55979 ^ i3) * SecP256K1Field.PInv33) ^ 769243228;
                        i5 = -1699402668;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0c12 A[PHI: r1 r2 r5 r6 r7 r9 r10 r19 r24 r25 r26 r28 r35 r39 r40 r42 r56
      0x0c12: PHI (r1v45 l.᩹ܽܳ[]) = (r1v21 l.᩹ܽܳ[]), (r1v50 l.᩹ܽܳ[]) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r2v46 l.᩹ܽܳ[]) = (r2v21 l.᩹ܽܳ[]), (r2v51 l.᩹ܽܳ[]) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r5v35 l.᩹ܽܳ[]) = (r5v15 l.᩹ܽܳ[]), (r5v40 l.᩹ܽܳ[]) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r6v47 int) = (r6v20 int), (r6v52 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r7v26 int) = (r7v12 int), (r7v28 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r9v28 int) = (r9v12 int), (r9v33 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r10v26 int) = (r10v10 int), (r10v30 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r19v35 int) = (r19v13 int), (r19v40 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r24v34 int) = (r24v14 int), (r24v39 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r25v36 int) = (r25v14 int), (r25v41 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r26v33 long[]) = (r26v13 long[]), (r26v38 long[]) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r28v31 int) = (r28v12 int), (r28v36 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r35v35 int) = (r35v15 int), (r35v40 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r39v36 int) = (r39v16 int), (r39v41 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r40v28 long) = (r40v12 long), (r40v33 long) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r42v27 long) = (r42v11 long), (r42v32 long) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]
      0x0c12: PHI (r56v38 int) = (r56v18 int), (r56v43 int) binds: [B:177:0x0bfb, B:6:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    private C19013 m43166(InterfaceC23667 interfaceC23667) {
        int i;
        InterfaceC23667[] interfaceC23667Arr;
        InterfaceC23667[] interfaceC23667Arr2;
        int i2;
        long[] jArr;
        InterfaceC23667[] interfaceC23667Arr3;
        long jM43160;
        int i3;
        int i4;
        int i5;
        InterfaceC23667[] interfaceC23667Arr4;
        InterfaceC23667[] interfaceC23667Arr5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC23667[] interfaceC23667Arr6;
        long[] jArr2;
        int i12;
        int i13;
        InterfaceC23667[] interfaceC23667Arr7;
        int i14;
        int iM55680;
        int i15;
        long[] jArr3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        InterfaceC23667[] interfaceC23667Arr8;
        InterfaceC23667[] interfaceC23667Arr9;
        int i23;
        int i24;
        InterfaceC23667[] interfaceC23667Arr10;
        int i25;
        int i26;
        int iM55681;
        int i27;
        int i28;
        long[] jArr4;
        int i29;
        int i30;
        int iM55682;
        int i31;
        int i32;
        InterfaceC23667[] interfaceC23667Arr11;
        int i33;
        int iM55683;
        int i34;
        int i35;
        int i36;
        int iM55979;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        long j;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        InterfaceC23667[] interfaceC23667Arr12;
        int i48;
        int i49;
        int i50;
        int i51;
        int iM55684;
        int i52;
        int i53;
        int iM55685;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int iM55686;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        long jMax;
        int iM559710;
        int i65;
        int i66;
        int i67;
        int iM559711;
        int i68;
        int i69;
        int iM559712;
        int i70;
        int i71;
        int iM55687;
        int i72;
        int i73;
        long[] jArr5 = null;
        long j2 = 0;
        long j3 = 0;
        int i74 = 0;
        int i75 = 0;
        long j4 = 0;
        long j5 = 0;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        int i79 = 369902139;
        int i80 = C0949.f81897;
        int i81 = C1012.f81938;
        int iM55688 = C0873.m55680("۫ۜ") ^ i81;
        int i82 = ((iM55688 ^ i80) * (-9891)) ^ (-1353519323);
        int i83 = iM55688 ^ 320825963;
        InterfaceC23667[] interfaceC23667Arr13 = null;
        InterfaceC23667[] interfaceC23667Arr14 = null;
        InterfaceC23667 interfaceC23668 = null;
        Object[] objArrCopyOf = null;
        InterfaceC23667[] interfaceC23667Arr15 = null;
        long[] jArr6 = null;
        InterfaceC23667 interfaceC23669 = null;
        long j6 = 0;
        int i84 = 0;
        int i85 = 0;
        int i86 = 0;
        int i87 = 0;
        int i88 = 0;
        int i89 = 0;
        int i90 = 0;
        int i91 = 0;
        int i92 = 0;
        int i93 = 0;
        int i94 = 0;
        InterfaceC23667[] interfaceC23667Arr16 = null;
        int length = 0;
        int i95 = 0;
        int i96 = 0;
        int i97 = 0;
        int length2 = 0;
        int length3 = 0;
        int i98 = 0;
        int length4 = 0;
        InterfaceC23667[] interfaceC23667Arr17 = null;
        C19013 c19013M43163 = null;
        long j7 = 0;
        int i99 = 0;
        InterfaceC23667[] interfaceC23667Arr18 = null;
        InterfaceC23667[] interfaceC23667Arr19 = null;
        int i100 = 0;
        while (true) {
            i79 = i83 ^ (i82 & (((i79 ^ i80) * 7343) >> 31));
            switch (i79) {
                case -2116573948:
                case 397872936:
                    interfaceC23667Arr10 = interfaceC23667Arr16;
                    jM43160 = j6;
                    InterfaceC23667[] interfaceC23667Arr20 = new InterfaceC23667[interfaceC23667Arr10.length];
                    i29 = i93;
                    i26 = i96;
                    i24 = i94;
                    AbstractC0942.m55965(interfaceC23667Arr10, i29, interfaceC23667Arr20, i29, i24);
                    interfaceC23667Arr17 = interfaceC23667Arr20;
                    i91 = i24;
                    i25 = i29;
                    iM55681 = (C0946.m55979("ܶۧ") ^ i80) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i27 = ((iM55681 ^ i81) * 22075) ^ 1871994395;
                    i28 = -1614083683;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    int i101 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i85 = i85;
                    i96 = i26;
                    i93 = i25;
                    i92 = i92;
                    i94 = i24;
                    i88 = i88;
                    i83 = iM55681 ^ i28;
                    i86 = i101;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr10;
                    i82 = i27;
                    jArr6 = jArr4;
                    long j8 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j8;
                    break;
                case -2107182817:
                case -1027037354:
                    i = i87;
                    i16 = i88;
                    i17 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    interfaceC23667Arr11 = interfaceC23667Arr13;
                    i2 = i84;
                    jArr = jArr6;
                    i20 = i92;
                    int i102 = i100;
                    i33 = i93;
                    i18 = i96;
                    i19 = i85;
                    InterfaceC23667[] interfaceC23667Arr21 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr21;
                    long j9 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j9;
                    if (interfaceC23667Arr11.length != 0) {
                        iM55683 = (C0946.m55979("ᩳܶ") + i81) * 15;
                        i100 = i102;
                        i34 = ((iM55683 ^ i80) * 19333) ^ 844348045;
                        i35 = -739956041;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr11;
                        i87 = i;
                        int i103 = i16;
                        i83 = iM55683 ^ i35;
                        i85 = i19;
                        i96 = i18;
                        i93 = i33;
                        i92 = i20;
                        i94 = i17;
                        i88 = i103;
                        long[] jArr7 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i34;
                        jArr6 = jArr7;
                        InterfaceC23667[] interfaceC23667Arr22 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr22;
                        long j10 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j10;
                    } else {
                        i100 = i102;
                        i36 = i98;
                        int iM55689 = C0873.m55680("۬᩷") ^ i80;
                        int i104 = ((iM55689 ^ i81) * 10859) ^ 1460462032;
                        int i105 = i16;
                        i83 = iM55689 ^ 1696471788;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr11;
                        i87 = i;
                        long j11 = j7;
                        i98 = i36;
                        i99 = i99;
                        i85 = i19;
                        j6 = jM43160;
                        i96 = i18;
                        j7 = j11;
                        i93 = i33;
                        i92 = i20;
                        i94 = i17;
                        i88 = i105;
                        long[] jArr8 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i104;
                        jArr6 = jArr8;
                        InterfaceC23667[] interfaceC23667Arr23 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr23;
                    }
                    break;
                case -2059194292:
                case -1112902729:
                    i64 = i84 + 1;
                    i87 = 1024;
                    i62 = i98;
                    i63 = i99;
                    int iM559713 = C0946.m55979("ۨۗ") ^ i81;
                    int i106 = i64;
                    int i107 = ((iM559713 ^ i80) * (-6955)) ^ 226774153;
                    int i108 = iM559713 ^ 2083744086;
                    length4 = length4;
                    i82 = i107;
                    i84 = i106;
                    i99 = i63;
                    i98 = i62;
                    j6 = j6;
                    j7 = j7;
                    i88 = i88;
                    i83 = i108;
                    break;
                case -2030731003:
                case -599768786:
                    C1017.m56187();
                    if (C1025.f81947 < 0) {
                        iM55687 = (C0946.m55979("ۙۧ") ^ i81) * 27;
                        i72 = ((iM55687 ^ i80) * 7919) ^ (-1680608994);
                        i73 = -2010476399;
                    } else {
                        iM55687 = (C0873.m55680("ۧᩴ") ^ i80) * (-109);
                        i72 = ((iM55687 ^ i81) * 19597) ^ 1886944276;
                        i73 = -1769605081;
                    }
                    i83 = iM55687 ^ i73;
                    i82 = i72;
                    break;
                case -2001936254:
                case -1947187507:
                    i87 = i87;
                    i88 = i88;
                    i39 = length;
                    i12 = i96;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    i13 = i85;
                    interfaceC23667Arr7 = interfaceC23667Arr18;
                    i14 = i86;
                    long j12 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j12;
                    interfaceC23667Arr15 = (InterfaceC23667[]) Arrays.copyOf(interfaceC23667Arr7, i39);
                    if (C1017.m56187() <= 0) {
                        int iM559714 = (C0946.m55979("۟ۢ") ^ i80) * 127;
                        length = i39;
                        i82 = ((iM559714 ^ i81) * (-6671)) ^ (-2095191771);
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM559714 ^ (-1212727239);
                    } else {
                        length = i39;
                        iM55979 = C0873.m55680("᩷ᩴ") ^ i81;
                        i37 = ((iM55979 ^ i80) * 28601) ^ (-1628219781);
                        i38 = 251935791;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                    }
                    i86 = i71;
                    long j13 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j13;
                    break;
                case -1980048934:
                case -1173149222:
                    i87 = i87;
                    i88 = i88;
                    i12 = i96;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    i13 = i85;
                    interfaceC23667Arr7 = interfaceC23667Arr18;
                    long j14 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j14;
                    interfaceC23667Arr15[interfaceC23667Arr7.length] = interfaceC23667;
                    i14 = i86;
                    if (interfaceC23667Arr15.length >= 16) {
                        iM55979 = (C0873.m55680("᩺ܽ") ^ i80) * 97;
                        i37 = ((iM55979 ^ i81) * 12391) ^ (-80559839);
                        i38 = -1589517830;
                    } else {
                        iM55979 = C0873.m55680("۫ܰ") ^ i81;
                        i37 = ((iM55979 ^ i80) * 29849) ^ 1058249986;
                        i38 = -1535825876;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    i71 = i14;
                    interfaceC23667Arr18 = interfaceC23667Arr7;
                    i85 = i13;
                    i96 = i12;
                    i88 = i88;
                    i83 = iM55979 ^ i38;
                    i82 = i37;
                    i86 = i71;
                    long j15 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j15;
                    break;
                case -1969937679:
                case -1262242354:
                    i = i87;
                    i16 = i88;
                    i17 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    interfaceC23667Arr2 = interfaceC23667Arr13;
                    i2 = i84;
                    jArr = jArr6;
                    i20 = i92;
                    int i109 = i93;
                    i18 = i96;
                    i19 = i85;
                    InterfaceC23667[] interfaceC23667Arr24 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr24;
                    long j16 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j16;
                    if (interfaceC23667Arr14 != null) {
                        int iM556810 = C0873.m55680("ۢۤ") ^ i80;
                        jArr6 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = ((iM556810 ^ i81) * 14445) ^ 346478892;
                        i85 = i19;
                        i96 = i18;
                        i93 = i109;
                        i92 = i20;
                        i94 = i17;
                        i88 = i16;
                        i83 = iM556810 ^ 1146903889;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr2;
                        i87 = i;
                        InterfaceC23667[] interfaceC23667Arr25 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr25;
                        long j17 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j17;
                    } else {
                        i21 = i109;
                        interfaceC23667Arr11 = interfaceC23667Arr;
                        i33 = i21;
                        iM55683 = C0873.m55680("ᩳ᩻") ^ i81;
                        i34 = ((iM55683 ^ i80) * 4057) ^ 1817171443;
                        i35 = 1849604205;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr11;
                        i87 = i;
                        int i1010 = i16;
                        i83 = iM55683 ^ i35;
                        i85 = i19;
                        i96 = i18;
                        i93 = i33;
                        i92 = i20;
                        i94 = i17;
                        i88 = i1010;
                        long[] jArr9 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i34;
                        jArr6 = jArr9;
                        InterfaceC23667[] interfaceC23667Arr26 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr26;
                        long j18 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j18;
                    }
                    break;
                case -1943737916:
                case 1717750402:
                    C1964.m56597();
                    if (C0854.m55595() < 0) {
                        iM55687 = (i81 - C0873.m55680("֨ۖ")) * 77;
                        i72 = ((iM55687 ^ i80) * (-20557)) ^ (-412368169);
                        i73 = -1431773668;
                        i83 = iM55687 ^ i73;
                        i82 = i72;
                    } else {
                        i87 = i87;
                        i88 = i88;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i50 = length4;
                        i84 = i84;
                        i51 = i85;
                        long j19 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j19;
                        iM55685 = (C0873.m55680("ۙۚ") + i80) * (-115);
                        i54 = ((iM55685 ^ i81) * (-30677)) ^ 1263380220;
                        i55 = 1431850307;
                        i57 = iM55685 ^ i55;
                        length4 = i50;
                        i82 = i54;
                        i85 = i51;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    }
                    break;
                case -1908412528:
                case 291614369:
                    return new C19013(i98, interfaceC23667Arr15);
                case -1895605945:
                case 302087193:
                    int i110 = i88;
                    jMax = j7;
                    int i111 = length4;
                    jM43160 = j6;
                    if (i89 < i111) {
                        iM559710 = C0946.m55979("ۗ᩵") ^ i81;
                        i65 = ((iM559710 ^ i80) * 30819) ^ (-1325255565);
                        i66 = 1993612777;
                    } else {
                        iM559710 = C0946.m55979("ᩴᩳ") ^ i80;
                        i65 = ((iM559710 ^ i81) * 15061) ^ (-1023819247);
                        i66 = -65115150;
                    }
                    int i112 = iM559710 ^ i66;
                    length4 = i111;
                    i82 = i65;
                    i67 = i110;
                    i83 = i112;
                    j6 = jM43160;
                    j7 = jMax;
                    i88 = i67;
                    break;
                case -1866152431:
                case -1862070221:
                    C0967.m56074();
                    if (!C0947.m55997()) {
                        i87 = i87;
                        i58 = i88;
                        i59 = length4;
                        long j20 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j20;
                        iM55686 = C0873.m55680("ۨ᩸") ^ i81;
                        i60 = ((iM55686 ^ i80) * 169) ^ (-880552637);
                        i61 = 50518361;
                        int i113 = iM55686 ^ i61;
                        length4 = i59;
                        i82 = i60;
                        i88 = i58;
                        i83 = i113;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    }
                    i87 = i87;
                    i43 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i44 = length4;
                    i84 = i84;
                    i47 = i96;
                    i45 = i85;
                    long j21 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j21;
                    int iM559715 = (C0946.m55979("ۜᩴ") + i80) * (-93);
                    int i114 = i47;
                    i46 = ((iM559715 ^ i81) * 28885) ^ 1784404255;
                    i88 = i43;
                    i83 = iM559715 ^ (-594393368);
                    i85 = i45;
                    i96 = i114;
                    length4 = i44;
                    i82 = i46;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    j = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case -1790885478:
                case -1529293162:
                    i87 = i87;
                    i88 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i30 = length4;
                    i84 = i84;
                    long j22 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j22;
                    j3 = 96 * j2;
                    if (C0930.f81879 > 0) {
                        iM55682 = C0873.m55680("ۖ᩻") ^ i81;
                        i31 = ((iM55682 ^ i80) * 19121) ^ 2132101391;
                        i32 = -1896531020;
                        i57 = iM55682 ^ i32;
                        length4 = i30;
                        i82 = i31;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    } else {
                        length4 = i30;
                        i7 = i94;
                        i8 = i92;
                        i9 = i93;
                        i10 = i96;
                        i11 = i85;
                        interfaceC23667Arr6 = interfaceC23667Arr16;
                        jArr2 = jArr6;
                        InterfaceC23667[] interfaceC23667Arr27 = interfaceC23667Arr18;
                        i86 = i86;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        interfaceC23667Arr3 = interfaceC23667Arr27;
                        iM55680 = (i80 - C0873.m55680("ܰۤ")) * (-49);
                        i3 = ((iM55680 ^ i81) * 25755) ^ (-552260375);
                        i15 = 538438792;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        jArr3 = jArr2;
                        interfaceC23667Arr16 = interfaceC23667Arr6;
                        i85 = i11;
                        i96 = i10;
                        i93 = i9;
                        i92 = i8;
                        i94 = i7;
                        i88 = i88;
                        i83 = iM55680 ^ i15;
                        i82 = i3;
                        jArr6 = jArr3;
                        InterfaceC23667[] interfaceC23667Arr28 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr28;
                        long j23 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j23;
                    }
                    break;
                case -1706415460:
                case -1010784065:
                    i88 = i88;
                    InterfaceC23667 interfaceC236610 = interfaceC23667Arr15[i89];
                    jM43160 = j6;
                    jMax = Math.max(interfaceC236610.mo34206(), interfaceC236610.mo34198());
                    if (C1071.m56343() == 0) {
                        iM559711 = (C0946.m55979("ۙۙ") ^ i81) * 101;
                        i68 = ((iM559711 ^ i80) * 18677) ^ 2035026127;
                        i69 = 456078849;
                        i67 = i88;
                        i83 = iM559711 ^ i69;
                        i82 = i68;
                        j6 = jM43160;
                        j7 = jMax;
                        i88 = i67;
                    } else {
                        i98 = i98;
                        i99 = i99;
                        i50 = length4;
                        j7 = jMax;
                        i51 = i85;
                        i87 = i87;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        iM55685 = (C0873.m55680("ۙۚ") + i80) * (-115);
                        i54 = ((iM55685 ^ i81) * (-30677)) ^ 1263380220;
                        i55 = 1431850307;
                        i57 = iM55685 ^ i55;
                        length4 = i50;
                        i82 = i54;
                        i85 = i51;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    }
                    break;
                case -1660285643:
                case 54246213:
                    i2 = i84;
                    i = i87;
                    i16 = i88;
                    i17 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    jArr = jArr6;
                    i20 = i92;
                    i33 = i93;
                    i18 = i96;
                    i19 = i85;
                    InterfaceC23667[] interfaceC23667Arr29 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    long j24 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j24;
                    interfaceC23667Arr11 = (InterfaceC23667[]) Arrays.copyOf(interfaceC23667Arr14, i100);
                    interfaceC23667Arr3 = interfaceC23667Arr29;
                    iM55683 = C0873.m55680("ᩳ᩻") ^ i81;
                    i34 = ((iM55683 ^ i80) * 4057) ^ 1817171443;
                    i35 = 1849604205;
                    i84 = i2;
                    interfaceC23667Arr13 = interfaceC23667Arr11;
                    i87 = i;
                    int i1011 = i16;
                    i83 = iM55683 ^ i35;
                    i85 = i19;
                    i96 = i18;
                    i93 = i33;
                    i92 = i20;
                    i94 = i17;
                    i88 = i1011;
                    long[] jArr10 = jArr;
                    interfaceC23667Arr16 = interfaceC23667Arr;
                    i82 = i34;
                    jArr6 = jArr10;
                    InterfaceC23667[] interfaceC23667Arr210 = interfaceC23667Arr3;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr210;
                    long j110 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j110;
                    break;
                case -1610788762:
                case -114829275:
                    i58 = i88;
                    long j25 = j7;
                    i59 = length4;
                    jM43160 = j6;
                    i98 = i98;
                    i99 = i99;
                    interfaceC23669 = interfaceC23667Arr13[i90];
                    j7 = j25;
                    i87 = i87;
                    Arrays.fill(jArr6, 0L);
                    if (RunnableC0938.f81886 >= 0) {
                        iM55686 = C0873.m55680("ۨ᩸") ^ i81;
                        i60 = ((iM55686 ^ i80) * 169) ^ (-880552637);
                        i61 = 50518361;
                    } else {
                        iM55686 = (C0873.m55680("ᩴܿ") ^ i81) * (-83);
                        i60 = ((iM55686 ^ i80) * (-9385)) ^ 700424638;
                        i61 = -1876440316;
                    }
                    int i115 = iM55686 ^ i61;
                    length4 = i59;
                    i82 = i60;
                    i88 = i58;
                    i83 = i115;
                    i87 = i87;
                    j = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case -1548545500:
                case -981148844:
                    jM43160 = j6;
                    interfaceC23667Arr8 = interfaceC23667Arr18;
                    interfaceC23667Arr9 = interfaceC23667Arr17;
                    i100 = i91;
                    i23 = i94 + 1;
                    i22 = i93;
                    int iM556811 = (i80 - C0873.m55680("۬᩵")) * 109;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    InterfaceC23667[] interfaceC23667Arr30 = interfaceC23667Arr8;
                    interfaceC23667Arr14 = interfaceC23667Arr9;
                    i85 = i85;
                    i96 = i96;
                    i93 = i22;
                    i92 = i92;
                    i94 = i23;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr30;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr16;
                    i82 = ((iM556811 ^ i81) * 4311) ^ 1100663103;
                    i88 = i88;
                    i83 = iM556811 ^ (-999481490);
                    jArr6 = jArr4;
                    long j26 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j26;
                    break;
                case -1527938172:
                case 1086937033:
                    i87 = i87;
                    i88 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i50 = length4;
                    i84 = i84;
                    long j27 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j27;
                    c19013M43163 = m43163(i98, interfaceC23667Arr15);
                    i51 = i85;
                    long length5 = interfaceC23667Arr15.length;
                    if (C1964.f83032 > 0) {
                        int iM559716 = C0946.m55979("᩷ۤ") ^ i80;
                        i52 = ((iM559716 ^ i81) * (-21065)) ^ 840941033;
                        i56 = iM559716 ^ 1276442353;
                        length4 = i50;
                        j2 = length5;
                        i82 = i52;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i6 = i88;
                        i83 = i56;
                        i85 = i51;
                        i88 = i6;
                        long j111 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j111;
                    } else {
                        j2 = length5;
                        iM55685 = (C0873.m55680("ۙۚ") + i80) * (-115);
                        i54 = ((iM55685 ^ i81) * (-30677)) ^ 1263380220;
                        i55 = 1431850307;
                        i57 = iM55685 ^ i55;
                        length4 = i50;
                        i82 = i54;
                        i85 = i51;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    }
                    break;
                case -1509168110:
                case 1295009972:
                    jArr2 = jArr6;
                    i87 = i87;
                    i88 = i88;
                    i7 = i94;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    i8 = i92;
                    i9 = i93;
                    i10 = i96;
                    i11 = i85;
                    InterfaceC23667[] interfaceC23667Arr31 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr31;
                    long j28 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j28;
                    interfaceC23667Arr6 = this.f56678;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i80 - C0873.m55680("ܰۤ")) * (-49);
                        i3 = ((iM55680 ^ i81) * 25755) ^ (-552260375);
                        i15 = 538438792;
                    } else {
                        iM55680 = (i81 - C0873.m55680("ܿۖ")) * (-61);
                        i3 = ((iM55680 ^ i80) * (-25943)) ^ (-103783942);
                        i15 = 670929843;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    jArr3 = jArr2;
                    interfaceC23667Arr16 = interfaceC23667Arr6;
                    i85 = i11;
                    i96 = i10;
                    i93 = i9;
                    i92 = i8;
                    i94 = i7;
                    i88 = i88;
                    i83 = iM55680 ^ i15;
                    i82 = i3;
                    jArr6 = jArr3;
                    InterfaceC23667[] interfaceC23667Arr211 = interfaceC23667Arr3;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr211;
                    long j29 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j29;
                    break;
                case -1240042783:
                case 171540716:
                    if (C0992.m56107() <= 0) {
                        i87 = i87;
                        i43 = i88;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i44 = length4;
                        i84 = i84;
                        i47 = i96;
                        i45 = i85;
                        long j210 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j210;
                        int iM559717 = (C0946.m55979("ۜᩴ") + i80) * (-93);
                        int i116 = i47;
                        i46 = ((iM559717 ^ i81) * 28885) ^ 1784404255;
                        i88 = i43;
                        i83 = iM559717 ^ (-594393368);
                        i85 = i45;
                        i96 = i116;
                        length4 = i44;
                        i82 = i46;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    } else {
                        i87 = i87;
                        i88 = i88;
                        i12 = i96;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        long j30 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j30;
                        iM55979 = C0873.m55680("֫֡") ^ i81;
                        i37 = ((iM55979 ^ i80) * 16239) ^ 1471309623;
                        i38 = -1157268526;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j112 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j112;
                    }
                    break;
                case -1215048604:
                case -765408914:
                    i24 = i94;
                    interfaceC23667Arr10 = interfaceC23667Arr16;
                    i29 = i93;
                    i26 = i96;
                    jM43160 = j6;
                    interfaceC23667Arr14[i100] = interfaceC23668;
                    i91 = i100 + 1;
                    interfaceC23667Arr17 = interfaceC23667Arr14;
                    i25 = i29;
                    iM55681 = (C0946.m55979("ܶۧ") ^ i80) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i27 = ((iM55681 ^ i81) * 22075) ^ 1871994395;
                    i28 = -1614083683;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    int i1012 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i85 = i85;
                    i96 = i26;
                    i93 = i25;
                    i92 = i92;
                    i94 = i24;
                    i88 = i88;
                    i83 = iM55681 ^ i28;
                    i86 = i1012;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr10;
                    i82 = i27;
                    jArr6 = jArr4;
                    long j211 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j211;
                    break;
                case -1211929376:
                case 1540877966:
                    i = i87;
                    int i117 = i88;
                    int i118 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    interfaceC23667Arr2 = interfaceC23667Arr13;
                    i2 = i84;
                    jArr = jArr6;
                    int i119 = i92;
                    int i120 = i93;
                    int i121 = i96;
                    int i122 = i85;
                    InterfaceC23667[] interfaceC23667Arr32 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr32;
                    long j31 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j31;
                    InterfaceC23667 interfaceC236611 = interfaceC23667Arr[i118];
                    if (!interfaceC236611.mo34204(interfaceC23667)) {
                        int iM556812 = C0873.m55680("֨᩵") ^ i81;
                        i3 = ((iM556812 ^ i80) * 26933) ^ (-371131503);
                        interfaceC23668 = interfaceC236611;
                        i85 = i122;
                        i96 = i121;
                        i93 = i120;
                        i92 = i119;
                        i94 = i118;
                        i88 = i117;
                        i83 = iM556812 ^ (-145572863);
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr2;
                        i87 = i;
                        jArr3 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i3;
                        jArr6 = jArr3;
                        InterfaceC23667[] interfaceC23667Arr212 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr212;
                        long j212 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j212;
                    } else {
                        int iM556813 = C0873.m55680("ۖ᩺") ^ i81;
                        int i123 = ((iM556813 ^ i80) * 3947) ^ 882342971;
                        interfaceC23668 = interfaceC236611;
                        i85 = i122;
                        i96 = i121;
                        i93 = i120;
                        i92 = i119;
                        i94 = i118;
                        i88 = i117;
                        i83 = iM556813 ^ 2144542683;
                        jArr6 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i123;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr2;
                        i87 = i;
                        InterfaceC23667[] interfaceC23667Arr213 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr213;
                        long j113 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j113;
                    }
                    break;
                case -1175908299:
                case 149214808:
                    C1229.m56410();
                    if (C1053.f81965 <= 0) {
                        i87 = i87;
                        i88 = i88;
                        i12 = i96;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        long j32 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j32;
                        iM55979 = C0873.m55680("᩷ۖ") ^ i81;
                        i37 = ((iM55979 ^ i80) * (-29809)) ^ 776114930;
                        i38 = -973869558;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j114 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j114;
                    } else {
                        i87 = i87;
                        i88 = i88;
                        i7 = i94;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i8 = i92;
                        i9 = i93;
                        i10 = i96;
                        i11 = i85;
                        interfaceC23667Arr6 = interfaceC23667Arr16;
                        jArr2 = jArr6;
                        InterfaceC23667[] interfaceC23667Arr33 = interfaceC23667Arr18;
                        i86 = i86;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        interfaceC23667Arr3 = interfaceC23667Arr33;
                        long j33 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j33;
                        iM55680 = (i80 - C0873.m55680("ܰۤ")) * (-49);
                        i3 = ((iM55680 ^ i81) * 25755) ^ (-552260375);
                        i15 = 538438792;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        jArr3 = jArr2;
                        interfaceC23667Arr16 = interfaceC23667Arr6;
                        i85 = i11;
                        i96 = i10;
                        i93 = i9;
                        i92 = i8;
                        i94 = i7;
                        i88 = i88;
                        i83 = iM55680 ^ i15;
                        i82 = i3;
                        jArr6 = jArr3;
                        InterfaceC23667[] interfaceC23667Arr214 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr214;
                        long j213 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j213;
                    }
                    break;
                case -1164548339:
                case 1004637945:
                    j7 = j7;
                    jM43160 = j3 + 48;
                    length4 = interfaceC23667Arr15.length;
                    i89 = 0;
                    int iM556814 = (C0873.m55680("ۨ᩹") + i80) * (-33);
                    i82 = ((iM556814 ^ i81) * 30275) ^ (-1364604579);
                    i57 = iM556814 ^ (-373714832);
                    i88 = i88;
                    i83 = i57;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    j = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case -1139170067:
                case 1183631526:
                    C0894.m55769();
                    C1404.m56468();
                    i87 = i87;
                    i88 = i88;
                    i12 = i96;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    i13 = i85;
                    interfaceC23667Arr7 = interfaceC23667Arr18;
                    i14 = i86;
                    long j34 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j34;
                    iM55979 = C0873.m55680("֫֡") ^ i81;
                    i37 = ((iM55979 ^ i80) * 16239) ^ 1471309623;
                    i38 = -1157268526;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    i71 = i14;
                    interfaceC23667Arr18 = interfaceC23667Arr7;
                    i85 = i13;
                    i96 = i12;
                    i88 = i88;
                    i83 = iM55979 ^ i38;
                    i82 = i37;
                    i86 = i71;
                    long j115 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j115;
                    break;
                case -1136105535:
                case -223989754:
                    i4 = i87;
                    i5 = i88;
                    interfaceC23667Arr4 = interfaceC23667Arr13;
                    long j35 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j35;
                    interfaceC23667Arr5 = interfaceC23667Arr4;
                    i76 = 65536;
                    int iM556815 = C0873.m55680("᩷֡") ^ i80;
                    interfaceC23667Arr3 = interfaceC23667Arr5;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr4;
                    i87 = i4;
                    i82 = ((iM556815 ^ i81) * 21845) ^ (-419324270);
                    i85 = i85;
                    i96 = i96;
                    i93 = i93;
                    i92 = i92;
                    i94 = i94;
                    i88 = i5;
                    i83 = iM556815 ^ 367239140;
                    jArr6 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr16;
                    InterfaceC23667[] interfaceC23667Arr215 = interfaceC23667Arr3;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr215;
                    long j214 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j214;
                    break;
                case -1108406048:
                case 1449736454:
                    long j36 = j7;
                    jM43160 = j6;
                    i86++;
                    j7 = j36;
                    int iM556816 = C0873.m55680("֡֫") ^ i81;
                    length4 = length4;
                    i82 = ((iM556816 ^ i80) * (-18187)) ^ (-490769792);
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    i6 = i88;
                    i83 = iM556816 ^ (-944867899);
                    i85 = i85;
                    i96 = i96;
                    i88 = i6;
                    long j116 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j116;
                    break;
                case -1009527695:
                case 2072929847:
                    if (c19013M43163.m43183(i88, i78 - i88) > j6) {
                        i87 = i87;
                        i88 = i88;
                        i12 = i96;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        long j37 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j37;
                        iM55979 = C0873.m55680("۫ܰ") ^ i81;
                        i37 = ((iM55979 ^ i80) * 29849) ^ 1058249986;
                        i38 = -1535825876;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j117 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j117;
                    } else {
                        iM55687 = (C0946.m55979("ۡᩴ") ^ i81) * (-107);
                        i72 = ((iM55687 ^ i80) * 14457) ^ (-752149018);
                        i73 = 1263138379;
                        i83 = iM55687 ^ i73;
                        i82 = i72;
                    }
                    break;
                case -1001374513:
                case -764764460:
                    interfaceC23667Arr19[i85] = interfaceC23669;
                    i75 = i85 + 1;
                    i88 = i88;
                    jMax = j7;
                    jM43160 = j6;
                    iM559711 = C0873.m55680("᩹᩶") ^ i80;
                    i68 = ((iM559711 ^ i81) * 15833) ^ (-1344306391);
                    i69 = -312090754;
                    i67 = i88;
                    i83 = iM559711 ^ i69;
                    i82 = i68;
                    j6 = jM43160;
                    j7 = jMax;
                    i88 = i67;
                    break;
                case -920129903:
                case 486859821:
                    i88 = i88;
                    jMax = j7;
                    jM43160 = j6;
                    if (i84 < i87) {
                        iM559711 = C0946.m55979("ᩴۖ") ^ i80;
                        i68 = ((iM559711 ^ i81) * 12647) ^ 77620567;
                        i69 = -534852832;
                    } else {
                        i75 = i85;
                        iM559711 = C0873.m55680("᩹᩶") ^ i80;
                        i68 = ((iM559711 ^ i81) * 15833) ^ (-1344306391);
                        i69 = -312090754;
                    }
                    i67 = i88;
                    i83 = iM559711 ^ i69;
                    i82 = i68;
                    j6 = jM43160;
                    j7 = jMax;
                    i88 = i67;
                    break;
                case -892884329:
                case -547626014:
                    i87 = i87;
                    i88 = i88;
                    i24 = i94;
                    interfaceC23667Arr10 = interfaceC23667Arr16;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    jArr6 = jArr6;
                    i92 = i92;
                    i25 = i93;
                    i26 = i96;
                    i85 = i85;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i86 = i86;
                    long j38 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j38;
                    if (interfaceC23667Arr14 == null) {
                        iM55681 = C0873.m55680("᩵᩻") ^ i81;
                        i27 = ((iM55681 ^ i80) * 6177) ^ (-1933826940);
                        i28 = -1566565722;
                    } else {
                        interfaceC23667Arr17 = interfaceC23667Arr14;
                        i91 = i100;
                        iM55681 = (C0946.m55979("ܶۧ") ^ i80) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i27 = ((iM55681 ^ i81) * 22075) ^ 1871994395;
                        i28 = -1614083683;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    int i1013 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i85 = i85;
                    i96 = i26;
                    i93 = i25;
                    i92 = i92;
                    i94 = i24;
                    i88 = i88;
                    i83 = iM55681 ^ i28;
                    i86 = i1013;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr10;
                    i82 = i27;
                    jArr6 = jArr4;
                    long j215 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j215;
                    break;
                case -860476984:
                case -31346418:
                    i87 = i87;
                    i88 = i88;
                    i24 = i94;
                    interfaceC23667Arr10 = interfaceC23667Arr16;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    jArr6 = jArr6;
                    i92 = i92;
                    i25 = i93;
                    i26 = i96;
                    i85 = i85;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i86 = i86;
                    long j39 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j39;
                    if (interfaceC23667Arr18.length < 256) {
                        iM55681 = (C0946.m55979("ۢ᩻") ^ i81) * (-81);
                        i27 = ((iM55681 ^ i80) * 22411) ^ (-745451219);
                        i28 = -867935088;
                    } else {
                        iM55681 = C0873.m55680("ܶ᩹") ^ i80;
                        i27 = ((iM55681 ^ i81) * 7127) ^ 1841708238;
                        i28 = -1252539610;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    int i1014 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i85 = i85;
                    i96 = i26;
                    i93 = i25;
                    i92 = i92;
                    i94 = i24;
                    i88 = i88;
                    i83 = iM55681 ^ i28;
                    i86 = i1014;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr10;
                    i82 = i27;
                    jArr6 = jArr4;
                    long j216 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j216;
                    break;
                case -769239580:
                case 1035695928:
                    i87 = i87;
                    i88 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i50 = length4;
                    i84 = i84;
                    i51 = i85;
                    int i124 = length3;
                    long j40 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j40;
                    if (i90 >= i124) {
                        length3 = i124;
                        iM55685 = (C0873.m55680("ۗۜ") ^ i81) * (-15);
                        i54 = ((iM55685 ^ i80) * 12943) ^ 1340143818;
                        i55 = 1930286219;
                        i57 = iM55685 ^ i55;
                        length4 = i50;
                        i82 = i54;
                        i85 = i51;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    } else {
                        iM55684 = C0946.m55979("ۡ۫") ^ i80;
                        length3 = i124;
                        i52 = ((iM55684 ^ i81) * 5625) ^ (-771997113);
                        i53 = 544311337;
                        i56 = iM55684 ^ i53;
                        length4 = i50;
                        i82 = i52;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i6 = i88;
                        i83 = i56;
                        i85 = i51;
                        i88 = i6;
                        long j118 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j118;
                    }
                    break;
                case -735233083:
                case -130654209:
                    j7 = j7;
                    jM43160 = j6;
                    i86 = 0;
                    length2 = interfaceC23667Arr15.length;
                    int iM556817 = C0873.m55680("֡֫") ^ i81;
                    length4 = length4;
                    i82 = ((iM556817 ^ i80) * (-18187)) ^ (-490769792);
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    i6 = i88;
                    i83 = iM556817 ^ (-944867899);
                    i85 = i85;
                    i96 = i96;
                    i88 = i6;
                    long j119 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j119;
                    break;
                case -676692846:
                case 410090679:
                    if (C1404.f82149 >= 0) {
                        i87 = i87;
                        i88 = i88;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i50 = length4;
                        i84 = i84;
                        i51 = i85;
                        long j120 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j120;
                        iM55685 = (C0873.m55680("ۙۚ") + i80) * (-115);
                        i54 = ((iM55685 ^ i81) * (-30677)) ^ 1263380220;
                        i55 = 1431850307;
                        i57 = iM55685 ^ i55;
                        length4 = i50;
                        i82 = i54;
                        i85 = i51;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    } else {
                        i87 = i87;
                        i88 = i88;
                        i12 = i96;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        long j310 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j310;
                        iM55979 = C0873.m55680("֫֡") ^ i81;
                        i37 = ((iM55979 ^ i80) * 16239) ^ 1471309623;
                        i38 = -1157268526;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j1110 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1110;
                    }
                    break;
                case -649300765:
                case -593337142:
                    i62 = i98;
                    i63 = i99;
                    interfaceC23669.mo34199(i62, i63, jArr6);
                    i64 = 0;
                    i87 = i77;
                    int iM559718 = C0946.m55979("ۨۗ") ^ i81;
                    int i1015 = i64;
                    int i1016 = ((iM559718 ^ i80) * (-6955)) ^ 226774153;
                    int i1017 = iM559718 ^ 2083744086;
                    length4 = length4;
                    i82 = i1016;
                    i84 = i1015;
                    i99 = i63;
                    i98 = i62;
                    j6 = j6;
                    j7 = j7;
                    i88 = i88;
                    i83 = i1017;
                    break;
                case -618025683:
                case 754874792:
                    i = i87;
                    i16 = i88;
                    i33 = i93;
                    i17 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    i18 = i96;
                    interfaceC23667Arr11 = interfaceC23667Arr13;
                    i2 = i84;
                    i19 = i85;
                    jArr = jArr6;
                    InterfaceC23667[] interfaceC23667Arr34 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr34;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j6;
                    int length6 = interfaceC23667Arr11.length;
                    i95 = 65536;
                    i36 = this.f56677;
                    if (length6 >= 256) {
                        int iM556818 = C0873.m55680("֨ᩳ") ^ i81;
                        int i125 = ((iM556818 ^ i80) * 7473) ^ 1988780796;
                        i94 = i17;
                        i88 = i16;
                        i83 = iM556818 ^ 930243580;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr11;
                        i87 = i;
                        i98 = i36;
                        i99 = i99;
                        i85 = i19;
                        j6 = jM43160;
                        i96 = i18;
                        j7 = j7;
                        i93 = i33;
                        i92 = 2147418111;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i125;
                        jArr6 = jArr;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr3;
                    } else {
                        i20 = 2147418111;
                        int iM556819 = C0873.m55680("۬᩷") ^ i80;
                        int i1018 = ((iM556819 ^ i81) * 10859) ^ 1460462032;
                        int i1019 = i16;
                        i83 = iM556819 ^ 1696471788;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr11;
                        i87 = i;
                        long j121 = j7;
                        i98 = i36;
                        i99 = i99;
                        i85 = i19;
                        j6 = jM43160;
                        i96 = i18;
                        j7 = j121;
                        i93 = i33;
                        i92 = i20;
                        i94 = i17;
                        i88 = i1019;
                        long[] jArr11 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i1018;
                        jArr6 = jArr11;
                        InterfaceC23667[] interfaceC23667Arr216 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr216;
                    }
                    break;
                case -525800394:
                case 449125959:
                    if (C0882.m55710() != 0) {
                        iM55687 = (C0946.m55979("ۙۧ") ^ i81) * 27;
                        i72 = ((iM55687 ^ i80) * 7919) ^ (-1680608994);
                        i73 = -2010476399;
                        i83 = iM55687 ^ i73;
                        i82 = i72;
                    } else {
                        i87 = i87;
                        i88 = i88;
                        i12 = i96;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        long j311 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j311;
                        iM55979 = C0873.m55680("֫֡") ^ i81;
                        i37 = ((iM55979 ^ i80) * 16239) ^ 1471309623;
                        i38 = -1157268526;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j1111 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1111;
                    }
                    break;
                case -417362927:
                case 1990114606:
                    i22 = i93;
                    interfaceC23667Arr8 = interfaceC23667Arr18;
                    jM43160 = j6;
                    interfaceC23667Arr9 = null;
                    i23 = 0;
                    i100 = 0;
                    int iM5568110 = (i80 - C0873.m55680("۬᩵")) * 109;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    InterfaceC23667[] interfaceC23667Arr35 = interfaceC23667Arr8;
                    interfaceC23667Arr14 = interfaceC23667Arr9;
                    i85 = i85;
                    i96 = i96;
                    i93 = i22;
                    i92 = i92;
                    i94 = i23;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr35;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr16;
                    i82 = ((iM5568110 ^ i81) * 4311) ^ 1100663103;
                    i88 = i88;
                    i83 = iM5568110 ^ (-999481490);
                    jArr6 = jArr4;
                    long j217 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j217;
                    break;
                case -409748186:
                case 1812051203:
                    i87 = i87;
                    i88 = i88;
                    i12 = i96;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    i13 = i85;
                    interfaceC23667Arr7 = interfaceC23667Arr18;
                    i14 = i86;
                    long j41 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j41;
                    objArrCopyOf = Arrays.copyOf(interfaceC23667Arr7, interfaceC23667Arr7.length + 1);
                    if (C0947.m55997()) {
                        iM55979 = C0873.m55680("֫֡") ^ i81;
                        i37 = ((iM55979 ^ i80) * 16239) ^ 1471309623;
                        i38 = -1157268526;
                    } else {
                        iM55979 = C0946.m55979("ܽܺ") ^ i81;
                        i37 = ((iM55979 ^ i80) * (-27023)) ^ (-1651802906);
                        i38 = 1603935964;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    i71 = i14;
                    interfaceC23667Arr18 = interfaceC23667Arr7;
                    i85 = i13;
                    i96 = i12;
                    i88 = i88;
                    i83 = iM55979 ^ i38;
                    i82 = i37;
                    i86 = i71;
                    long j1112 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j1112;
                    break;
                case -400437051:
                case 1636627609:
                    i5 = i88;
                    long j42 = j7;
                    jM43160 = j6;
                    i76 = i74;
                    i98 = i98;
                    i99 = i99;
                    j7 = j42;
                    i4 = i87;
                    interfaceC23667Arr4 = interfaceC23667Arr13;
                    interfaceC23667Arr5 = (InterfaceC23667[]) Arrays.copyOf(interfaceC23667Arr19, i85);
                    int iM5568111 = C0873.m55680("᩷֡") ^ i80;
                    interfaceC23667Arr3 = interfaceC23667Arr5;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr4;
                    i87 = i4;
                    i82 = ((iM5568111 ^ i81) * 21845) ^ (-419324270);
                    i85 = i85;
                    i96 = i96;
                    i93 = i93;
                    i92 = i92;
                    i94 = i94;
                    i88 = i5;
                    i83 = iM5568111 ^ 367239140;
                    jArr6 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr16;
                    InterfaceC23667[] interfaceC23667Arr217 = interfaceC23667Arr3;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr217;
                    long j218 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j218;
                    break;
                case -387076794:
                case 639047582:
                    i87 = i87;
                    i88 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i30 = length4;
                    i84 = i84;
                    long j43 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j43;
                    if (!(interfaceC23667Arr15[i86] instanceof C14949)) {
                        length4 = i30;
                        i12 = i96;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        iM55979 = C0873.m55680("۫ܰ") ^ i81;
                        i37 = ((iM55979 ^ i80) * 29849) ^ 1058249986;
                        i38 = -1535825876;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j1113 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1113;
                    } else {
                        iM55682 = (i81 - C0873.m55680("᩵۫")) * 17;
                        i31 = ((iM55682 ^ i80) * (-32547)) ^ (-108379230);
                        i32 = -1144245806;
                        i57 = iM55682 ^ i32;
                        length4 = i30;
                        i82 = i31;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    }
                    break;
                case -364253405:
                case 1473722871:
                    long j44 = j6;
                    i40 = i98;
                    jM43160 = j44;
                    i41 = Integer.MAX_VALUE;
                    int iM556820 = (C0873.m55680("᩹ᩳ") + i81) * C0254q.f1218h;
                    i42 = ((iM556820 ^ i80) * 16441) ^ (-440110686);
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    j = j7;
                    i99 = i41;
                    i98 = i40;
                    i85 = i85;
                    i96 = i96;
                    i88 = i88;
                    i83 = iM556820 ^ 483060505;
                    i82 = i42;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case -359751063:
                case 371149932:
                    InterfaceC23667[] interfaceC23667Arr36 = (InterfaceC23667[]) objArrCopyOf;
                    interfaceC23667Arr36[interfaceC23667Arr18.length] = interfaceC23667;
                    return m43163(i98, interfaceC23667Arr36);
                case -250904718:
                case -100489604:
                    interfaceC23667Arr12 = interfaceC23667Arr13;
                    i48 = i97;
                    jM43160 = j6;
                    i49 = i96;
                    jArr6 = new long[i49];
                    i90 = 0;
                    i77 = i49;
                    length3 = interfaceC23667Arr12.length;
                    interfaceC23667Arr19 = new InterfaceC23667[i48];
                    i85 = i93;
                    int iM559719 = C0946.m55979("ܶ᩺") ^ i80;
                    i97 = i48;
                    int i126 = ((iM559719 ^ i81) * (-10411)) ^ (-1218479986);
                    int i127 = iM559719 ^ (-454229734);
                    length4 = length4;
                    i82 = i126;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr12;
                    i87 = i87;
                    i96 = i49;
                    i88 = i88;
                    i83 = i127;
                    long j1114 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j1114;
                    break;
                case -39781024:
                case 1109109031:
                    i = i87;
                    i16 = i88;
                    i17 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    i18 = i96;
                    InterfaceC23667[] interfaceC23667Arr37 = interfaceC23667Arr13;
                    i2 = i84;
                    i19 = i85;
                    jArr = jArr6;
                    i20 = i92;
                    InterfaceC23667[] interfaceC23667Arr38 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr38;
                    long j45 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j45;
                    if (interfaceC23667Arr.length != 0) {
                        int iM559720 = (i80 - C0946.m55979("֨ܿ")) * 93;
                        i3 = ((iM559720 ^ i81) * 9271) ^ (-648264398);
                        i92 = i20;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr37;
                        i94 = i17;
                        i87 = i;
                        i88 = i16;
                        i83 = iM559720 ^ 321984738;
                        i85 = i19;
                        i96 = i18;
                        i93 = 0;
                        jArr3 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i3;
                        jArr6 = jArr3;
                        InterfaceC23667[] interfaceC23667Arr218 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr218;
                        long j219 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j219;
                    } else {
                        i21 = 0;
                        interfaceC23667Arr11 = interfaceC23667Arr;
                        i33 = i21;
                        iM55683 = C0873.m55680("ᩳ᩻") ^ i81;
                        i34 = ((iM55683 ^ i80) * 4057) ^ 1817171443;
                        i35 = 1849604205;
                        i84 = i2;
                        interfaceC23667Arr13 = interfaceC23667Arr11;
                        i87 = i;
                        int i10110 = i16;
                        i83 = iM55683 ^ i35;
                        i85 = i19;
                        i96 = i18;
                        i93 = i33;
                        i92 = i20;
                        i94 = i17;
                        i88 = i10110;
                        long[] jArr12 = jArr;
                        interfaceC23667Arr16 = interfaceC23667Arr;
                        i82 = i34;
                        jArr6 = jArr12;
                        InterfaceC23667[] interfaceC23667Arr219 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr219;
                        long j1115 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1115;
                    }
                    break;
                case -12980105:
                case 875568197:
                    i90++;
                    i49 = i96;
                    interfaceC23667Arr12 = interfaceC23667Arr13;
                    i85 = i75;
                    i77 = 1024;
                    i48 = i97;
                    jM43160 = j6;
                    int iM5597110 = C0946.m55979("ܶ᩺") ^ i80;
                    i97 = i48;
                    int i128 = ((iM5597110 ^ i81) * (-10411)) ^ (-1218479986);
                    int i129 = iM5597110 ^ (-454229734);
                    length4 = length4;
                    i82 = i128;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr12;
                    i87 = i87;
                    i96 = i49;
                    i88 = i88;
                    i83 = i129;
                    long j1116 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j1116;
                    break;
                case 149565119:
                case 625715627:
                    long j46 = j7;
                    jM43160 = j6;
                    int i130 = c19013M43163.f56677;
                    if (i130 > 2147418111) {
                        iM559712 = (C0873.m55680("ܶ᩶") + i81) * (-117);
                        i42 = ((iM559712 ^ i80) * (-28213)) ^ 1352874385;
                        i70 = 1249376049;
                    } else {
                        iM559712 = C0946.m55979("᩶֨") ^ i80;
                        i42 = ((iM559712 ^ i81) * 16281) ^ (-1440915034);
                        i70 = -793638082;
                    }
                    i83 = iM559712 ^ i70;
                    j = j46;
                    i88 = i130;
                    i82 = i42;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case 155621040:
                case 1894026781:
                    C0863.m55643();
                    if (C0930.m55885() > 0) {
                        i87 = i87;
                        i88 = i88;
                        i7 = i94;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i8 = i92;
                        i9 = i93;
                        i10 = i96;
                        i11 = i85;
                        interfaceC23667Arr6 = interfaceC23667Arr16;
                        jArr2 = jArr6;
                        InterfaceC23667[] interfaceC23667Arr39 = interfaceC23667Arr18;
                        i86 = i86;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        interfaceC23667Arr3 = interfaceC23667Arr39;
                        long j312 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j312;
                        iM55680 = (i80 - C0873.m55680("ܰۤ")) * (-49);
                        i3 = ((iM55680 ^ i81) * 25755) ^ (-552260375);
                        i15 = 538438792;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        jArr3 = jArr2;
                        interfaceC23667Arr16 = interfaceC23667Arr6;
                        i85 = i11;
                        i96 = i10;
                        i93 = i9;
                        i92 = i8;
                        i94 = i7;
                        i88 = i88;
                        i83 = iM55680 ^ i15;
                        i82 = i3;
                        jArr6 = jArr3;
                        InterfaceC23667[] interfaceC23667Arr2110 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr2110;
                        long j2110 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j2110;
                    } else {
                        i87 = i87;
                        i88 = i88;
                        i12 = i96;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i13 = i85;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        i14 = i86;
                        long j313 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j313;
                        iM55979 = C0873.m55680("֫֡") ^ i81;
                        i37 = ((iM55979 ^ i80) * 16239) ^ 1471309623;
                        i38 = -1157268526;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM55979 ^ i38;
                        i82 = i37;
                        i86 = i71;
                        long j1117 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1117;
                    }
                    break;
                case 166182634:
                case 1322059728:
                    i78 = i76 + i88;
                    iM55687 = (C0873.m55680("ܶܳ") + i80) * (-93);
                    i72 = ((iM55687 ^ i81) * (-14819)) ^ 1738334843;
                    i73 = 1890919870;
                    i83 = iM55687 ^ i73;
                    i82 = i72;
                    break;
                case 236033452:
                case 526368435:
                    C1012.m56134();
                    return null;
                case 281129078:
                case 555978985:
                    i4 = i87;
                    i5 = i88;
                    int i131 = length4;
                    long j47 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j47;
                    i74 = 65536;
                    interfaceC23667Arr4 = interfaceC23667Arr13;
                    if (i85 != interfaceC23667Arr4.length) {
                        int iM556821 = (C0873.m55680("֨ܽ") + i80) * 69;
                        length4 = i131;
                        i82 = ((iM556821 ^ i81) * (-2235)) ^ 2142663959;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr4;
                        i87 = i4;
                        i6 = i5;
                        i83 = iM556821 ^ (-184022786);
                        i88 = i6;
                        long j1118 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1118;
                    } else {
                        length4 = i131;
                        i76 = 65536;
                        interfaceC23667Arr5 = interfaceC23667Arr4;
                        int iM5568112 = C0873.m55680("᩷֡") ^ i80;
                        interfaceC23667Arr3 = interfaceC23667Arr5;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr4;
                        i87 = i4;
                        i82 = ((iM5568112 ^ i81) * 21845) ^ (-419324270);
                        i85 = i85;
                        i96 = i96;
                        i93 = i93;
                        i92 = i92;
                        i94 = i94;
                        i88 = i5;
                        i83 = iM5568112 ^ 367239140;
                        jArr6 = jArr6;
                        interfaceC23667Arr16 = interfaceC23667Arr16;
                        InterfaceC23667[] interfaceC23667Arr2111 = interfaceC23667Arr3;
                        interfaceC23667Arr14 = interfaceC23667Arr14;
                        i86 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr2111;
                        long j2111 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j2111;
                    }
                    break;
                case 284949831:
                case 961248740:
                    j4 = jArr6[i84];
                    int i132 = i88;
                    long j48 = ~jArr5[i84];
                    if (C0912.f81867 > 0) {
                        int iM556822 = (C0873.m55680("֫᩷") ^ i81) * 11;
                        i82 = ((iM556822 ^ i80) * 30021) ^ (-2100485669);
                        i67 = i132;
                        i83 = iM556822 ^ (-1584562174);
                        j5 = j48;
                        i88 = i67;
                    } else {
                        i88 = i132;
                        j5 = j48;
                        i39 = length;
                        i12 = i96;
                        i13 = i85;
                        i87 = i87;
                        interfaceC23667Arr7 = interfaceC23667Arr18;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i84 = i84;
                        i14 = i86;
                        long j49 = j6;
                        i98 = i98;
                        i99 = i99;
                        j7 = j7;
                        jM43160 = j49;
                        int iM5597111 = (C0946.m55979("۟ۢ") ^ i80) * 127;
                        length = i39;
                        i82 = ((iM5597111 ^ i81) * (-6671)) ^ (-2095191771);
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i71 = i14;
                        interfaceC23667Arr18 = interfaceC23667Arr7;
                        i85 = i13;
                        i96 = i12;
                        i88 = i88;
                        i83 = iM5597111 ^ (-1212727239);
                        i86 = i71;
                        long j1119 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j1119;
                    }
                    break;
                case 315277203:
                case 454129020:
                    return c19013M43163;
                case 452978048:
                case 1782166825:
                    long j50 = j7;
                    i89++;
                    jM43160 = m43160(j6, j50);
                    j7 = j50;
                    int iM5568113 = (C0873.m55680("ۨ᩹") + i80) * (-33);
                    i82 = ((iM5568113 ^ i81) * 30275) ^ (-1364604579);
                    i57 = iM5568113 ^ (-373714832);
                    i88 = i88;
                    i83 = i57;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    j = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case 592397295:
                case 1293816887:
                    i = i87;
                    i16 = i88;
                    i17 = i94;
                    interfaceC23667Arr = interfaceC23667Arr16;
                    interfaceC23667Arr11 = interfaceC23667Arr13;
                    i2 = i84;
                    jArr = jArr6;
                    i20 = i92;
                    i33 = i93;
                    i18 = i96;
                    i19 = i85;
                    InterfaceC23667[] interfaceC23667Arr40 = interfaceC23667Arr18;
                    i86 = i86;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    interfaceC23667Arr3 = interfaceC23667Arr40;
                    long j51 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j51;
                    if (i17 < interfaceC23667Arr.length) {
                        iM55683 = C0873.m55680("۬֡") ^ i80;
                        i34 = ((iM55683 ^ i81) * 8059) ^ (-285013961);
                        i35 = 1855274227;
                    } else {
                        iM55683 = C0873.m55680("ܰ᩻") ^ i81;
                        i34 = ((iM55683 ^ i80) * (-24787)) ^ (-900765154);
                        i35 = 30873517;
                    }
                    i84 = i2;
                    interfaceC23667Arr13 = interfaceC23667Arr11;
                    i87 = i;
                    int i10111 = i16;
                    i83 = iM55683 ^ i35;
                    i85 = i19;
                    i96 = i18;
                    i93 = i33;
                    i92 = i20;
                    i94 = i17;
                    i88 = i10111;
                    long[] jArr13 = jArr;
                    interfaceC23667Arr16 = interfaceC23667Arr;
                    i82 = i34;
                    jArr6 = jArr13;
                    InterfaceC23667[] interfaceC23667Arr2112 = interfaceC23667Arr3;
                    interfaceC23667Arr14 = interfaceC23667Arr14;
                    i86 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr2112;
                    long j11110 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j11110;
                    break;
                case 908745042:
                case 2000151433:
                    i78 = Integer.MAX_VALUE;
                    iM55687 = (C0873.m55680("ܶܳ") + i80) * (-93);
                    i72 = ((iM55687 ^ i81) * (-14819)) ^ 1738334843;
                    i73 = 1890919870;
                    i83 = iM55687 ^ i73;
                    i82 = i72;
                    break;
                case 960740907:
                case 2070075017:
                    long j52 = j6;
                    i40 = i98;
                    jM43160 = j52;
                    i41 = i40 + i95;
                    int iM556823 = (C0873.m55680("᩹ᩳ") + i81) * C0254q.f1218h;
                    i42 = ((iM556823 ^ i80) * 16441) ^ (-440110686);
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    j = j7;
                    i99 = i41;
                    i98 = i40;
                    i85 = i85;
                    i96 = i96;
                    i88 = i88;
                    i83 = iM556823 ^ 483060505;
                    i82 = i42;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case 989756743:
                case 1718598446:
                    if ((j4 & j5) != 0) {
                        iM55687 = (C0946.m55979("᩺ۙ") + i80) * (-87);
                        i72 = ((iM55687 ^ i81) * (-7477)) ^ (-1407207860);
                        i73 = -266894631;
                    } else {
                        iM55687 = (C0873.m55680("۬ܿ") ^ i81) * (-111);
                        i72 = ((iM55687 ^ i80) * 23313) ^ 1585686310;
                        i73 = -111523481;
                    }
                    i83 = iM55687 ^ i73;
                    i82 = i72;
                    break;
                case 999731473:
                case 2016863023:
                    i87 = i87;
                    i88 = i88;
                    i12 = i96;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    i13 = i85;
                    interfaceC23667Arr7 = interfaceC23667Arr18;
                    i14 = i86;
                    long j53 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j53;
                    length = interfaceC23667Arr7.length + 1;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("᩷ۖ") ^ i81;
                        i37 = ((iM55979 ^ i80) * (-29809)) ^ 776114930;
                        i38 = -973869558;
                    } else {
                        iM55979 = C0946.m55979("᩷֨") ^ i80;
                        i37 = ((iM55979 ^ i81) * (-14647)) ^ 324436248;
                        i38 = 1375295157;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    i71 = i14;
                    interfaceC23667Arr18 = interfaceC23667Arr7;
                    i85 = i13;
                    i96 = i12;
                    i88 = i88;
                    i83 = iM55979 ^ i38;
                    i82 = i37;
                    i86 = i71;
                    long j11111 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j11111;
                    break;
                case 1027964093:
                case 1883556131:
                    i87 = i87;
                    i43 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i44 = length4;
                    i84 = i84;
                    int i133 = i85;
                    long j54 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j54;
                    long[] jArr14 = new long[1024];
                    i45 = i133;
                    interfaceC23667.mo34199(i98, i99, jArr14);
                    int length7 = interfaceC23667Arr13.length;
                    if (C0894.f81854 >= 0) {
                        i97 = length7;
                        jArr5 = jArr14;
                        i47 = 1024;
                        int iM5597112 = (C0946.m55979("ۜᩴ") + i80) * (-93);
                        int i1110 = i47;
                        i46 = ((iM5597112 ^ i81) * 28885) ^ 1784404255;
                        i88 = i43;
                        i83 = iM5597112 ^ (-594393368);
                        i85 = i45;
                        i96 = i1110;
                    } else {
                        int iM556824 = (C0873.m55680("ܿۜ") ^ i80) * 99;
                        i46 = ((iM556824 ^ i81) * (-21967)) ^ (-2020698937);
                        jArr5 = jArr14;
                        i85 = i45;
                        i88 = i43;
                        i96 = 1024;
                        i83 = iM556824 ^ (-43975869);
                        i97 = length7;
                    }
                    length4 = i44;
                    i82 = i46;
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    j = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j;
                    break;
                case 1334109394:
                case 1539855248:
                    i87 = i87;
                    i88 = i88;
                    i24 = i94;
                    interfaceC23667Arr10 = interfaceC23667Arr16;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    jArr6 = jArr6;
                    int i134 = i93;
                    i26 = i96;
                    i85 = i85;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i86 = i86;
                    int i135 = i92;
                    long j55 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j55;
                    if (i98 > i135) {
                        int iM556825 = C0873.m55680("۠ܿ") ^ i80;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        interfaceC23667Arr18 = interfaceC23667Arr18;
                        i85 = i85;
                        i96 = i26;
                        i93 = i134;
                        jArr6 = jArr6;
                        interfaceC23667Arr16 = interfaceC23667Arr10;
                        i82 = ((iM556825 ^ i81) * 29229) ^ (-851912215);
                        i86 = i86;
                        i94 = i24;
                        i88 = i88;
                        i83 = iM556825 ^ 857718618;
                        i92 = i135;
                    } else {
                        i92 = i135;
                        iM55681 = (i80 - C0946.m55979("ۧۘ")) * (-89);
                        i25 = i134;
                        i27 = ((iM55681 ^ i81) * (-8051)) ^ (-17069379);
                        i28 = 173334010;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        int i10112 = i86;
                        interfaceC23667Arr18 = interfaceC23667Arr18;
                        i85 = i85;
                        i96 = i26;
                        i93 = i25;
                        i92 = i92;
                        i94 = i24;
                        i88 = i88;
                        i83 = iM55681 ^ i28;
                        i86 = i10112;
                        jArr4 = jArr6;
                        interfaceC23667Arr16 = interfaceC23667Arr10;
                        i82 = i27;
                        jArr6 = jArr4;
                    }
                    long j2112 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j2112;
                    break;
                case 1924831943:
                case 2141399347:
                    i87 = i87;
                    i88 = i88;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i50 = length4;
                    i84 = i84;
                    i51 = i85;
                    int i136 = length2;
                    long j56 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j56;
                    if (i86 >= i136) {
                        length2 = i136;
                        iM55685 = C0873.m55680("ۘܶ") ^ i81;
                        i54 = ((iM55685 ^ i80) * (-12097)) ^ (-2032337923);
                        i55 = -170010689;
                        i57 = iM55685 ^ i55;
                        length4 = i50;
                        i82 = i54;
                        i85 = i51;
                        i88 = i88;
                        i83 = i57;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        j = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j;
                    } else {
                        iM55684 = (i80 - C0873.m55680("۬۬")) * (-79);
                        length2 = i136;
                        i52 = ((iM55684 ^ i81) * 6377) ^ 545778502;
                        i53 = 107132800;
                        i56 = iM55684 ^ i53;
                        length4 = i50;
                        i82 = i52;
                        i84 = i84;
                        interfaceC23667Arr13 = interfaceC23667Arr13;
                        i87 = i87;
                        i6 = i88;
                        i83 = i56;
                        i85 = i51;
                        i88 = i6;
                        long j11112 = j7;
                        i98 = i98;
                        i99 = i99;
                        j6 = jM43160;
                        j7 = j11112;
                    }
                    break;
                default:
                    i87 = i87;
                    i88 = i88;
                    i24 = i94;
                    interfaceC23667Arr10 = interfaceC23667Arr16;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i84 = i84;
                    jArr6 = jArr6;
                    i92 = i92;
                    i25 = i93;
                    i26 = i96;
                    i85 = i85;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i86 = i86;
                    long j57 = j6;
                    i98 = i98;
                    i99 = i99;
                    j7 = j7;
                    jM43160 = j57;
                    if (interfaceC23667Arr14 != null) {
                        iM55681 = C0946.m55979("ۤ᩵") ^ i80;
                        i27 = ((iM55681 ^ i81) * (-23217)) ^ (-2123296613);
                        i28 = 188134745;
                    } else {
                        interfaceC23667Arr17 = interfaceC23667Arr14;
                        i91 = i100;
                        iM55681 = (C0946.m55979("ܶۧ") ^ i80) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i27 = ((iM55681 ^ i81) * 22075) ^ 1871994395;
                        i28 = -1614083683;
                    }
                    i84 = i84;
                    interfaceC23667Arr13 = interfaceC23667Arr13;
                    i87 = i87;
                    int i10113 = i86;
                    interfaceC23667Arr18 = interfaceC23667Arr18;
                    i85 = i85;
                    i96 = i26;
                    i93 = i25;
                    i92 = i92;
                    i94 = i24;
                    i88 = i88;
                    i83 = iM55681 ^ i28;
                    i86 = i10113;
                    jArr4 = jArr6;
                    interfaceC23667Arr16 = interfaceC23667Arr10;
                    i82 = i27;
                    jArr6 = jArr4;
                    long j2113 = j7;
                    i98 = i98;
                    i99 = i99;
                    j6 = jM43160;
                    j7 = j2113;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43182(IdentityHashMap identityHashMap) {
        InterfaceC23667[] interfaceC23667Arr = null;
        int length = 0;
        boolean z = false;
        int i = 0;
        InterfaceC23667 interfaceC23667 = null;
        int i2 = -303572100;
        int i3 = C1025.f81947;
        int i4 = ServiceConnectionC1013.f81940;
        int iM55979 = (C0946.m55979("ܶ᩻") + i3) * 77;
        int i5 = ((iM55979 ^ i4) * 14853) ^ (-570345425);
        int i6 = 561115005;
        while (true) {
            i2 = ((((i2 ^ i4) * (-30047)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2029684550:
                case 236179747:
                    length = interfaceC23667Arr.length;
                    z = false;
                    i = 0;
                    iM55979 = (C0873.m55680("᩸ۤ") + i3) * 7;
                    i5 = ((iM55979 ^ i4) * (-25265)) ^ 840418033;
                    i6 = -304988541;
                    break;
                case -1952034154:
                case -547651612:
                    i++;
                    iM55979 = (C0873.m55680("᩸ۤ") + i3) * 7;
                    i5 = ((iM55979 ^ i4) * (-25265)) ^ 840418033;
                    i6 = -304988541;
                    break;
                case -1854649504:
                case -278116484:
                    if (identityHashMap.containsKey(((C24337) interfaceC23667).f77099)) {
                        iM55979 = C0873.m55680("᩹۠") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32581)) ^ 157152272;
                        i6 = -582904253;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩵") ^ i3) * 33;
                        i5 = ((iM55979 ^ i4) * (-12729)) ^ 83149788;
                        i6 = 246426372;
                    }
                    break;
                case -1797167732:
                case 1109316588:
                    if (i < length) {
                        iM55979 = (C0946.m55979("ܶۡ") ^ i4) * (-109);
                        i5 = ((iM55979 ^ i3) * 18689) ^ 1820902469;
                        i6 = -954055361;
                    } else {
                        iM55979 = C0946.m55979("֨ۨ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-10757)) ^ (-386616175);
                        i6 = 2048358664;
                    }
                    break;
                case -1763689928:
                case 1849794822:
                    return z;
                case -1585286576:
                case -1171133547:
                    if (C0890.f81849 != 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-17001)) ^ (-1743584577);
                        i6 = -928942549;
                    } else {
                        iM55979 = C0873.m55680("ۘۙ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 13341) ^ (-1328129396);
                        i6 = -1731397813;
                    }
                    break;
                case -1504051299:
                case 570407587:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-17001)) ^ (-1743584577);
                        i6 = -928942549;
                    } else {
                        iM55979 = (C0873.m55680("ۖ۟") ^ i3) * (-43);
                        i5 = ((iM55979 ^ i4) * (-2409)) ^ 1382444223;
                        i6 = -1298897926;
                    }
                    break;
                case -1403950921:
                case -882691782:
                    if (C0937.f81884) {
                        iM55979 = C0946.m55979("ܶ᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-17223)) ^ (-1867183798);
                        i6 = -1971958005;
                    } else {
                        iM55979 = C0946.m55979("ۛᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 2993) ^ 953093658;
                        i6 = -855072470;
                    }
                    break;
                case -1182558269:
                case 1108765934:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("ۖ۟") ^ i3) * (-43);
                        i5 = ((iM55979 ^ i4) * (-2409)) ^ 1382444223;
                        i6 = -1298897926;
                    } else {
                        iM55979 = C0946.m55979("ᩴܽ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-9711)) ^ (-1862726447);
                        i6 = 1455760812;
                    }
                    break;
                case -930420883:
                case 1608127246:
                    C0989.m56095();
                    C1024.m56209();
                    iM55979 = (C0946.m55979("ᩴ۠") ^ i4) * (-121);
                    i5 = ((iM55979 ^ i3) * (-18525)) ^ (-1165821325);
                    i6 = -344938444;
                    break;
                case -571565890:
                case -402410345:
                    interfaceC23667 = interfaceC23667Arr[i];
                    if (interfaceC23667 instanceof C24337) {
                        iM55979 = (i4 - C0873.m55680("᩷֨")) * (-71);
                        i5 = ((iM55979 ^ i3) * (-8011)) ^ 392174926;
                        i6 = -648789049;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩵") ^ i3) * 33;
                        i5 = ((iM55979 ^ i4) * (-12729)) ^ 83149788;
                        i6 = 246426372;
                    }
                    break;
                case -348555408:
                case 1237637528:
                    C0863.m55643();
                    RunnableC0938.m55938();
                    return false;
                case -83026468:
                case 879255080:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0946.m55979("ۛᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 2993) ^ 953093658;
                        i6 = -855072470;
                    } else {
                        iM55979 = C0873.m55680("ۗܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-17001)) ^ (-1743584577);
                        i6 = -928942549;
                    }
                    break;
                case 191351941:
                case 1139012702:
                    if (RunnableC0897.f81856) {
                        iM55979 = (C0946.m55979("ۧ֡") + i3) * (-95);
                        i5 = ((iM55979 ^ i4) * (-23333)) ^ (-2033883540);
                        i6 = 1324405429;
                    } else {
                        iM55979 = C0946.m55979("ۛᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 2993) ^ 953093658;
                        i6 = -855072470;
                    }
                    break;
                case 264067154:
                case 298376211:
                    interfaceC23667Arr = this.f56678;
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0873.m55680("ᩳۤ") ^ i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 2125) ^ (-1917363616);
                        i6 = 1411359420;
                    } else {
                        iM55979 = (C0946.m55979("᩻᩷") + i4) * (-59);
                        i5 = ((iM55979 ^ i3) * (-17233)) ^ (-115164410);
                        i6 = 1812264415;
                    }
                    break;
                case 552840386:
                case 840923423:
                    if (C0989.m56095() <= 0) {
                        iM55979 = (C0873.m55680("ۖ۟") ^ i3) * (-43);
                        i5 = ((iM55979 ^ i4) * (-2409)) ^ 1382444223;
                        i6 = -1298897926;
                    } else {
                        iM55979 = C0946.m55979("ۙ۬") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-727)) ^ (-1156833763);
                        i6 = -1110787405;
                    }
                    break;
                case 700804137:
                case 1961336775:
                    return true;
                case 1009151118:
                case 2146294162:
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("ۖ۟") ^ i3) * (-43);
                        i5 = ((iM55979 ^ i4) * (-2409)) ^ 1382444223;
                        i6 = -1298897926;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ۠") ^ i4) * (-121);
                        i5 = ((iM55979 ^ i3) * (-18525)) ^ (-1165821325);
                        i6 = -344938444;
                    }
                    break;
                case 1153575196:
                case 1719747460:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0873.m55680("ᩳۤ") ^ i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 2125) ^ (-1917363616);
                        i6 = 1411359420;
                    } else {
                        iM55979 = C0946.m55979("ۨ֨") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-227)) ^ (-1471267932);
                        i6 = 1292144110;
                    }
                    break;
                case 1362990320:
                case 2104939059:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("ۖ۟") ^ i3) * (-43);
                        i5 = ((iM55979 ^ i4) * (-2409)) ^ 1382444223;
                        i6 = -1298897926;
                    } else {
                        iM55979 = C0946.m55979("ܿۚ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 3005) ^ (-9408296);
                        i6 = 1323732312;
                    }
                    break;
                case 1777034119:
                case 1816915367:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("ۗܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-17001)) ^ (-1743584577);
                        i6 = -928942549;
                    } else {
                        iM55979 = C0873.m55680("ۢᩳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-21817)) ^ 81929673;
                        i6 = -730561794;
                    }
                    break;
                default:
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0873.m55680("ᩳۤ") ^ i3) * (-53);
                        i5 = ((iM55979 ^ i4) * 2125) ^ (-1917363616);
                        i6 = 1411359420;
                    } else {
                        iM55979 = C0946.m55979("ᩳܰ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32389)) ^ (-502019493);
                        i6 = -1886603;
                    }
                    break;
            }
        }
    }

    public C19013(int i, InterfaceC23667[] interfaceC23667Arr) {
        int i2 = -2085099879;
        int i3 = C0898.f81858;
        int i4 = C0863.f81833;
        int iM55680 = (i3 - C0873.m55680("֫᩵")) * (-89);
        int i5 = ((iM55680 ^ i4) * 20709) ^ 837717024;
        int i6 = -1121221918;
        while (true) {
            i2 = ((((i2 ^ i4) * (-18295)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2087303814:
                case 601825372:
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("֡ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    } else {
                        iM55680 = C0946.m55979("ܿ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-14089)) ^ 390227861;
                        i6 = 826609566;
                    }
                    break;
                case -1780564839:
                case 1479042389:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("֡ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֡ۗ")) * (-27);
                        i5 = ((iM55680 ^ i4) * (-677)) ^ 939394847;
                        i6 = -1716516736;
                    }
                    break;
                case -1626405671:
                case 562867945:
                    C1044.m56286();
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("۫֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 23317) ^ (-1052058775);
                        i6 = -569874736;
                    } else {
                        iM55680 = C0873.m55680("֡ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    }
                    break;
                case -1335680264:
                case 610471159:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = (C0946.m55979("ᩴ۫") ^ i3) * (-91);
                        i5 = ((iM55680 ^ i4) * 19075) ^ 1969778663;
                        i6 = -197357003;
                    } else {
                        iM55680 = C0873.m55680("ܳۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    }
                    break;
                case -1273875206:
                case -1247715857:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("۫֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 23317) ^ (-1052058775);
                        i6 = -569874736;
                    } else {
                        iM55680 = C0946.m55979("ܳ᩷") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-26903)) ^ 2092081145;
                        i6 = -1655029003;
                    }
                    break;
                case -1217128720:
                case -1201616593:
                    this.f56677 = i;
                    if (C0873.f81841 <= 0) {
                        iM55680 = C0873.m55680("ܳۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        iM55680 = C0946.m55979("ۜ᩸") ^ i4;
                        i5 = ((iM55680 ^ i3) * 16279) ^ (-1691880844);
                        i6 = -141214541;
                    }
                    break;
                case -1189612718:
                case 1982240224:
                    C1024.m56209();
                    throw new RuntimeException();
                case -1161887248:
                case 1426249161:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("ܳۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֨ܺ")) * (-37);
                        i5 = ((iM55680 ^ i4) * (-3175)) ^ 633502430;
                        i6 = -989780776;
                    }
                    break;
                case -1031995350:
                case -891258830:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("۫֫") ^ i3;
                        i5 = ((iM55680 ^ i4) * 23317) ^ (-1052058775);
                        i6 = -569874736;
                    } else {
                        iM55680 = (i4 - C0873.m55680("֡᩷")) * 61;
                        i5 = ((iM55680 ^ i3) * 21091) ^ (-1512492624);
                        i6 = 1518225776;
                    }
                    break;
                case -741755694:
                case -400939830:
                    if (C1964.f83032 <= 0) {
                        iM55680 = C0873.m55680("ۛᩴ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-23313)) ^ (-1986721568);
                        i6 = 963052305;
                    } else {
                        iM55680 = (C0873.m55680("᩻ܰ") ^ i3) * C0254q.f1218h;
                        i5 = ((iM55680 ^ i4) * 27101) ^ (-1230124740);
                        i6 = -934968710;
                    }
                    break;
                case -695419592:
                case 323237964:
                    C0882.m55710();
                    if (!C0949.m56012()) {
                        iM55680 = C0873.m55680("֡ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    } else {
                        iM55680 = (C0946.m55979("ᩴ۫") ^ i3) * (-91);
                        i5 = ((iM55680 ^ i4) * 19075) ^ 1969778663;
                        i6 = -197357003;
                    }
                    break;
                case -498222957:
                case 1870664935:
                    this.f56678 = interfaceC23667Arr;
                    return;
                case -276918098:
                case 1501472633:
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("ܳۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        iM55680 = (C0946.m55979("ۤᩴ") ^ i3) * 71;
                        i5 = ((iM55680 ^ i4) * 31473) ^ (-807564223);
                        i6 = -1633829694;
                    }
                    break;
                case 64071854:
                case 1506769543:
                    C1404.m56468();
                    C0927.m55873();
                    iM55680 = C0873.m55680("ܳۘ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 10291) ^ 2023499798;
                    i6 = 1858941156;
                    break;
                case 699316104:
                case 1463115567:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0873.m55680("ܳۘ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        iM55680 = C0873.m55680("ۢۙ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-8771)) ^ 264564159;
                        i6 = 1307134719;
                    }
                    break;
                default:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("ᩴ۫") ^ i3) * (-91);
                        i5 = ((iM55680 ^ i4) * 19075) ^ 1969778663;
                        i6 = -197357003;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩶᩺")) * (-53);
                        i5 = ((iM55680 ^ i3) * (-7955)) ^ 555770835;
                        i6 = 70507405;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19013 m43162(int i) {
        int i2 = -1139257374;
        int i3 = C1229.f82066;
        int i4 = C0992.f81922;
        int iM55680 = (C0873.m55680("ܿ۫") + i3) * 21;
        int i5 = ((iM55680 ^ i4) * (-2835)) ^ (-1561679656);
        int i6 = 1794963006;
        while (true) {
            i2 = ((((i2 ^ i4) * (-31593)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2081249091:
                case -1846848803:
                    if (!C0947.f81895) {
                        iM55680 = C0946.m55979("᩸ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-2549)) ^ (-1274464230);
                        i6 = 562955607;
                    } else {
                        iM55680 = C0873.m55680("ۙᩴ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-18021)) ^ (-46689928);
                        i6 = 983376472;
                    }
                    break;
                case -1955788380:
                case 924930456:
                    if (C1046.f81962 > 0) {
                        iM55680 = C0946.m55979("᩸ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-2549)) ^ (-1274464230);
                        i6 = 562955607;
                    } else {
                        iM55680 = C0873.m55680("ۛۜ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 4619) ^ (-1113605625);
                        i6 = 131964625;
                    }
                    break;
                case -960159880:
                case -869484699:
                    C1194.m56396();
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = (i4 - C0946.m55979("᩷᩻")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-10753)) ^ (-810570740);
                        i6 = 406608509;
                    } else {
                        iM55680 = C0873.m55680("ۛۜ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 4619) ^ (-1113605625);
                        i6 = 131964625;
                    }
                    break;
                case -231744655:
                case 195879802:
                    if (!C1024.f81946) {
                        if (RunnableC1014.m56177()) {
                            if (C0894.f81854 < 0) {
                                if (RunnableC1014.f81941 > 0) {
                                    if (C0863.f81833 > 0 && C1194.m56396() > 0) {
                                        if (C0877.f81843 < 0) {
                                            if (C0882.m55710() == 0) {
                                                if (ServiceConnectionC1013.f81940 < 0) {
                                                    int i7 = (-65536) & i;
                                                    if (C1053.f81965 > 0) {
                                                        return new C19013(i7, new InterfaceC23667[0]);
                                                    }
                                                    iM55680 = C0946.m55979("ۢܺ") ^ i3;
                                                    i5 = ((iM55680 ^ i4) * 19481) ^ 685568759;
                                                    i6 = 538659586;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            iM55680 = C0873.m55680("ۙᩴ") ^ i3;
                            i5 = ((iM55680 ^ i4) * (-18021)) ^ (-46689928);
                            i6 = 983376472;
                            break;
                        }
                        iM55680 = (i4 - C0946.m55979("᩷᩻")) * (-33);
                        i5 = ((iM55680 ^ i3) * (-10753)) ^ (-810570740);
                        i6 = 406608509;
                        break;
                    }
                    iM55680 = C0873.m55680("ۛۜ") ^ i3;
                    i5 = ((iM55680 ^ i4) * 4619) ^ (-1113605625);
                    i6 = 131964625;
                    break;
                case 408514248:
                case 1185298697:
                    C0892.m55749();
                    C0890.m55740();
                    iM55680 = C0873.m55680("ۛۜ") ^ i3;
                    i5 = ((iM55680 ^ i4) * 4619) ^ (-1113605625);
                    i6 = 131964625;
                    break;
                default:
                    C1929.m56553();
                    C0927.m55873();
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43180() {
        InterfaceC23667[] interfaceC23667Arr = null;
        int i = 410621261;
        int i2 = C1044.f81959;
        int i3 = C1036.f81953;
        int iM55680 = (i3 - C0873.m55680("ۧܳ")) * (-29);
        int i4 = ((iM55680 ^ i2) * (-24883)) ^ (-594847831);
        int i5 = 1289468176;
        while (true) {
            i = ((((i ^ i2) * 3633) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2125949605:
                case 2045339782:
                    C1017.m56187();
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i2 - C0873.m55680("᩹ܿ")) * 79;
                        i4 = ((iM55680 ^ i3) * (-24221)) ^ (-356873778);
                        i5 = 505881132;
                    } else {
                        iM55680 = C0946.m55979("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    }
                    break;
                case -2103458508:
                case -296609599:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0873.m55680("ᩳ۟") + i2) * 91;
                        i4 = ((iM55680 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        iM55680 = C0946.m55979("᩶ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-18663)) ^ 285553967;
                        i5 = -1203573070;
                    }
                    break;
                case -2084138190:
                case -1680849114:
                    if (interfaceC23667Arr.length == 0) {
                        iM55680 = (C0946.m55979("ۢۜ") + i2) * (-121);
                        i4 = ((iM55680 ^ i3) * 31571) ^ (-2115955210);
                        i5 = 1060677843;
                    } else {
                        iM55680 = C0873.m55680("ۢ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25591)) ^ (-492481332);
                        i5 = -1003759344;
                    }
                    break;
                case -1803156341:
                case -815064955:
                    interfaceC23667Arr = this.f56678;
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    } else {
                        iM55680 = C0873.m55680("۫ۢ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-6705)) ^ (-1144476525);
                        i5 = 2080249468;
                    }
                    break;
                case -1658983106:
                case 538064171:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("ۖᩴ") ^ i2) * 101;
                        i4 = ((iM55680 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        iM55680 = C0873.m55680("ᩳ᩹") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-22619)) ^ 1055005818;
                        i5 = 1090441720;
                    }
                    break;
                case -1646009295:
                case 1333509847:
                    if (C0912.f81867 <= 0) {
                        iM55680 = (C0873.m55680("ۖᩴ") ^ i2) * 101;
                        i4 = ((iM55680 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        iM55680 = C0873.m55680("֨᩺") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2917)) ^ (-543093908);
                        i5 = 912976431;
                    }
                    break;
                case -1625642429:
                case 1468510464:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0873.m55680("ۖᩴ") ^ i2) * 101;
                        i4 = ((iM55680 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        iM55680 = (i2 - C0873.m55680("۠᩵")) * 89;
                        i4 = ((iM55680 ^ i3) * (-515)) ^ 355074546;
                        i5 = -460096903;
                    }
                    break;
                case -1279995475:
                case 916561130:
                    return true;
                case -1112988360:
                case 380685800:
                    C1044.m56286();
                    C0892.m55749();
                    iM55680 = (C0873.m55680("ᩳ۟") + i2) * 91;
                    i4 = ((iM55680 ^ i3) * 19707) ^ 1502257172;
                    i5 = 1473835085;
                    break;
                case -1104072155:
                case 1065898380:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۖۧ")) * (-5);
                        i4 = ((iM55680 ^ i3) * 27157) ^ 1084207005;
                        i5 = -1200688100;
                    }
                    break;
                case -942904821:
                case -928608698:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ᩳ۟") + i2) * 91;
                        i4 = ((iM55680 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        iM55680 = C0873.m55680("ܳܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13533)) ^ 222569176;
                        i5 = -1449623899;
                    }
                    break;
                case -298466787:
                case 222046082:
                    C0930.m55885();
                    if (C1071.m56343() != 0) {
                        iM55680 = C0946.m55979("۠ۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    } else {
                        iM55680 = (C0873.m55680("ᩳ۟") + i2) * 91;
                        i4 = ((iM55680 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    }
                    break;
                case -276617898:
                case 777899521:
                    C1025.m56230();
                    C1071.m56343();
                    return false;
                case 583536849:
                case 1886949628:
                    return false;
                case 906217517:
                case 1587737565:
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0873.m55680("ۖᩴ") ^ i2) * 101;
                        i4 = ((iM55680 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        iM55680 = (C0873.m55680("ۖܺ") ^ i3) * (-107);
                        i4 = ((iM55680 ^ i2) * 28839) ^ 1887482853;
                        i5 = 479956403;
                    }
                    break;
                case 1122805112:
                case 1647223094:
                    if (C0992.f81922 >= 0) {
                        iM55680 = (i2 - C0873.m55680("᩹ܿ")) * 79;
                        i4 = ((iM55680 ^ i3) * (-24221)) ^ (-356873778);
                        i5 = 505881132;
                    } else {
                        iM55680 = C0946.m55979("ܰ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12603) ^ (-180186571);
                        i5 = -502944071;
                    }
                    break;
                case 1784563238:
                case 2067584989:
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("ᩳۗ") + i3) * 63;
                        i4 = ((iM55680 ^ i2) * 6941) ^ (-943360544);
                        i5 = 1303084836;
                    } else {
                        iM55680 = (C0873.m55680("ᩳ۟") + i2) * 91;
                        i4 = ((iM55680 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    }
                    break;
                default:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0873.m55680("ᩳ۟") + i2) * 91;
                        i4 = ((iM55680 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        iM55680 = (C0873.m55680("ۢۨ") ^ i3) * (-109);
                        i4 = ((iM55680 ^ i2) * (-11935)) ^ (-2147226111);
                        i5 = 222777233;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43172() {
        return this.f56677;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43178(IdentityHashMap identityHashMap, ArrayList arrayList) {
        InterfaceC23667[] interfaceC23667Arr = null;
        int length = 0;
        int i = 0;
        InterfaceC23667 interfaceC23667 = null;
        C24337 c24337 = null;
        int i2 = -1380032240;
        int i3 = C1036.f81953;
        int i4 = C1071.f81975;
        int iM55680 = (C0873.m55680("۠ۚ") + i3) * 51;
        int i5 = ((iM55680 ^ i4) * (-30903)) ^ (-613937601);
        int i6 = -1409028589;
        while (true) {
            i2 = ((((i2 ^ i4) * (-10319)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -1964443917:
                case 1457308336:
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0873.m55680("᩵ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 4469) ^ 905014636;
                        i6 = -488808705;
                    } else {
                        iM55680 = C0873.m55680("᩶֫") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-26943)) ^ (-41929383);
                        i6 = 824073312;
                    }
                    break;
                case -1752787635:
                case -300840004:
                    if (AbstractC0942.m55971()) {
                        iM55680 = (i4 - C0946.m55979("֫ܶ")) * 95;
                        i5 = ((iM55680 ^ i3) * 3939) ^ 1886961950;
                        i6 = 1837309499;
                    } else {
                        iM55680 = (C0946.m55979("۫ᩴ") ^ i3) * (-87);
                        i5 = ((iM55680 ^ i4) * (-28819)) ^ 1938104732;
                        i6 = -972267571;
                    }
                    break;
                case -1740688924:
                case 344604197:
                    C1044.m56286();
                    iM55680 = C0873.m55680("᩵ܺ") ^ i4;
                    i5 = ((iM55680 ^ i3) * 4469) ^ 905014636;
                    i6 = -488808705;
                    break;
                case -1655205607:
                case -1492678467:
                    c24337 = (C24337) interfaceC23667;
                    if (C0949.m56005(identityHashMap, c24337.f77099, Boolean.TRUE) == null) {
                        iM55680 = C0946.m55979("ۙۖ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 10839) ^ (-910677997);
                        i6 = 1386904840;
                    } else {
                        iM55680 = C0873.m55680("ۖۢ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-14261)) ^ 2122030147;
                        i6 = 1548610155;
                    }
                    break;
                case -1592592440:
                case 1945324970:
                    if (i < length) {
                        iM55680 = C0873.m55680("֡ۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-3703)) ^ 1869723749;
                        i6 = -1959103941;
                    } else {
                        iM55680 = C0873.m55680("ܺᩴ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 6481) ^ 475373306;
                        i6 = 358857737;
                    }
                    break;
                case -1587041612:
                case 1399817966:
                    if (C0906.f81862 >= 0) {
                        iM55680 = (C0873.m55680("ۧ۬") + i3) * (-35);
                        i5 = ((iM55680 ^ i4) * 691) ^ 655383287;
                        i6 = -1910388047;
                    } else {
                        iM55680 = C0946.m55979("֨ܶ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-32663)) ^ 1405082418;
                        i6 = -947350650;
                    }
                    break;
                case -1384048228:
                case 4491195:
                    interfaceC23667 = interfaceC23667Arr[i];
                    if (interfaceC23667 instanceof C24337) {
                        iM55680 = C0873.m55680("ܺۡ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-32439)) ^ 410376166;
                        i6 = 1105479759;
                    } else {
                        iM55680 = C0873.m55680("ۖۢ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-14261)) ^ 2122030147;
                        i6 = 1548610155;
                    }
                    break;
                case -1267043743:
                case 1318956945:
                    interfaceC23667Arr = this.f56678;
                    length = interfaceC23667Arr.length;
                    i = 0;
                    iM55680 = (C0946.m55979("۟ܽ") ^ i3) * (-91);
                    i5 = ((iM55680 ^ i4) * 2125) ^ (-1792307799);
                    i6 = 1306846591;
                    break;
                case -1231078398:
                case -520987293:
                    if (C1048.m56305() >= 0) {
                        iM55680 = (C0873.m55680("᩵ۘ") + i4) * 25;
                        i5 = ((iM55680 ^ i3) * (-13395)) ^ (-1310823205);
                        i6 = -716732312;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-8875)) ^ (-1404686219);
                        i6 = -2114437119;
                    }
                    break;
                case -1162996046:
                case -695660638:
                    i++;
                    iM55680 = (C0946.m55979("۟ܽ") ^ i3) * (-91);
                    i5 = ((iM55680 ^ i4) * 2125) ^ (-1792307799);
                    i6 = 1306846591;
                    break;
                case -1067127096:
                case 863662437:
                    if (C0906.m55809() <= 0) {
                        iM55680 = (C0873.m55680("᩵ۘ") + i4) * 25;
                        i5 = ((iM55680 ^ i3) * (-13395)) ^ (-1310823205);
                        i6 = -716732312;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩻") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3483) ^ 1056748403;
                        i6 = 311177584;
                    }
                    break;
                case -999965862:
                case -260323002:
                    C1036.m56257();
                    break;
                case -807502980:
                case 560661277:
                    if (AbstractC0942.m55971()) {
                        iM55680 = C0873.m55680("᩵ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 4469) ^ 905014636;
                        i6 = -488808705;
                    } else {
                        iM55680 = C0946.m55979("ܶۨ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 1631) ^ 1819832205;
                        i6 = 747481282;
                    }
                    break;
                case -768516218:
                case -287534805:
                    if (C0861.f81831) {
                        iM55680 = (C0873.m55680("᩺ܳ") ^ i4) * 47;
                        i5 = ((iM55680 ^ i3) * 15919) ^ 2014321168;
                        i6 = -334875673;
                    } else {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-8875)) ^ (-1404686219);
                        i6 = -2114437119;
                    }
                    break;
                case -317466836:
                case 396802901:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("᩵ۘ") + i4) * 25;
                        i5 = ((iM55680 ^ i3) * (-13395)) ^ (-1310823205);
                        i6 = -716732312;
                    } else {
                        iM55680 = (C0946.m55979("ۛۡ") + i4) * 59;
                        i5 = ((iM55680 ^ i3) * (-1343)) ^ 1996375782;
                        i6 = 2063102863;
                    }
                    break;
                case -193988352:
                case 619701987:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-8875)) ^ (-1404686219);
                        i6 = -2114437119;
                    } else {
                        iM55680 = (C0873.m55680("ܶۖ") ^ i3) * 33;
                        i5 = ((iM55680 ^ i4) * (-7061)) ^ 1317018692;
                        i6 = 1236482534;
                    }
                    break;
                case -134732144:
                case 796006014:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-8875)) ^ (-1404686219);
                        i6 = -2114437119;
                    } else {
                        iM55680 = (C0873.m55680("۠᩹") + i4) * (-25);
                        i5 = ((iM55680 ^ i3) * 6753) ^ (-1624933705);
                        i6 = 83208234;
                    }
                    break;
                case 171348080:
                case 388347396:
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0873.m55680("᩵ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 4469) ^ 905014636;
                        i6 = -488808705;
                    } else {
                        iM55680 = C0946.m55979("᩹ܽ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-19035)) ^ 605601080;
                        i6 = 138185946;
                    }
                    break;
                case 502140003:
                case 2028943614:
                    if (C1028.f81950 > 0) {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-8875)) ^ (-1404686219);
                        i6 = -2114437119;
                    } else {
                        iM55680 = C0873.m55680("᩵ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 4469) ^ 905014636;
                        i6 = -488808705;
                    }
                    break;
                case 869832883:
                case 1536620054:
                    break;
                case 1853597758:
                case 1947302101:
                    C1194.m56393(arrayList, c24337.f77099);
                    iM55680 = C0873.m55680("ۖۢ") ^ i3;
                    i5 = ((iM55680 ^ i4) * (-14261)) ^ 2122030147;
                    i6 = 1548610155;
                    break;
                default:
                    if (!C0927.f81875) {
                        iM55680 = (C0873.m55680("᩹᩺") ^ i3) * 45;
                        i5 = ((iM55680 ^ i4) * (-8875)) ^ (-1404686219);
                        i6 = -2114437119;
                    } else {
                        iM55680 = (C0873.m55680("ۧ۬") + i3) * (-35);
                        i5 = ((iM55680 ^ i4) * 691) ^ 655383287;
                        i6 = -1910388047;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02d9 A[PHI: r17
      0x02d9: PHI (r17v28 l.ܿᩳܳ) = (r17v4 l.ܿᩳܳ), (r17v5 l.ܿᩳܳ), (r17v29 l.ܿᩳܳ) binds: [B:83:0x02d7, B:79:0x02bc, B:10:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0308 A[PHI: r3 r17
      0x0308: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:87:0x0306, B:71:0x026b, B:59:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x0308: PHI (r17v10 l.ܿᩳܳ) = (r17v3 l.ܿᩳܳ), (r17v7 l.ܿᩳܳ), (r17v11 l.ܿᩳܳ) binds: [B:87:0x0306, B:71:0x026b, B:59:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0339 A[PHI: r17
      0x0339: PHI (r17v26 l.ܿᩳܳ) = (r17v2 l.ܿᩳܳ), (r17v9 l.ܿᩳܳ), (r17v30 l.ܿᩳܳ) binds: [B:91:0x0337, B:63:0x021a, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (p067l.C0992.m56107() > 0) goto L18;
     */
    /* JADX INFO: renamed from: ᩳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C19013 m43184(int i, int i2) {
        C19013 c19013;
        int iM55680;
        int i3;
        int iM55681;
        int i4;
        int i5;
        C19013 c19014 = this;
        int i6 = C1053.f81965;
        int i7 = C1028.f81950;
        int iM55682 = (C0873.m55680("ܳۘ") + i6) * 5;
        int i8 = ((iM55682 ^ i7) * 12357) ^ 1738154202;
        C19013 c19015 = null;
        InterfaceC23667[] interfaceC23667Arr = null;
        InterfaceC23667 interfaceC23667 = null;
        InterfaceC23667[] interfaceC23667Arr2 = null;
        int i9 = iM55682 ^ 2002623765;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 613540654;
        InterfaceC23667[] interfaceC23667Arr3 = null;
        int i15 = 0;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i7) * (-32553)) >> 31));
            switch (i14) {
                case -2117628161:
                case -487428607:
                    c19013 = c19015;
                    if (interfaceC23667Arr3 == null) {
                        iM55681 = C0946.m55979("ܽܰ") ^ i7;
                        i4 = ((iM55681 ^ i6) * 28245) ^ (-1214926305);
                        i5 = 533800351;
                    } else {
                        interfaceC23667Arr2 = interfaceC23667Arr3;
                        i13 = i12;
                        iM55681 = C0946.m55979("ۛ᩵") ^ i6;
                        i4 = ((iM55681 ^ i7) * (-16543)) ^ (-1762817389);
                        i5 = 1706186312;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case -2082603806:
                case -1343837670:
                    C1024.m56209();
                    c19013 = c19015;
                    iM55680 = (i7 - C0946.m55979("᩵ܶ")) * (-69);
                    i8 = ((iM55680 ^ i6) * 15561) ^ 1529056952;
                    i3 = 1615932331;
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -2034630839:
                case 1379852699:
                    c19013 = c19015;
                    if (i12 == 0) {
                        iM55681 = C0946.m55979("ۙۛ") ^ i6;
                        i4 = ((iM55681 ^ i7) * 6307) ^ (-1009823961);
                        i5 = -1483171307;
                    } else {
                        iM55681 = C0946.m55979("ۧ۫") ^ i7;
                        i4 = ((iM55681 ^ i6) * 2109) ^ (-1199823564);
                        i5 = -1618164896;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case -1867360909:
                case -314931804:
                    c19013 = c19015;
                    interfaceC23667 = interfaceC23667Arr[i15];
                    if (interfaceC23667.mo34203(i, i10)) {
                        iM55681 = C0946.m55979("᩶ܺ") ^ i6;
                        i4 = ((iM55681 ^ i7) * 30525) ^ 91413860;
                        i5 = -1461896136;
                    } else {
                        iM55681 = C0873.m55680("᩹ۖ") ^ i7;
                        i4 = ((iM55681 ^ i6) * (-9855)) ^ 2128020046;
                        i5 = -2077745767;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case -1850379123:
                case -386409435:
                    if (C1003.f81929 <= 0) {
                        c19013 = c19015;
                        iM55680 = (i6 - C0873.m55680("ܽ᩻")) * (-35);
                        i8 = ((iM55680 ^ i7) * 539) ^ (-219170506);
                        i3 = 323310836;
                        i9 = iM55680 ^ i3;
                        c19014 = this;
                        c19015 = c19013;
                    }
                    c19013 = c19015;
                    iM55680 = (C0946.m55979("֨ۛ") ^ i6) * 81;
                    i8 = ((iM55680 ^ i7) * 26573) ^ 1032993774;
                    i3 = 1051262353;
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -1815844833:
                case 1151813909:
                    return c19015;
                case -1762776944:
                case -111847583:
                    c19013 = c19015;
                    InterfaceC23667[] interfaceC23667Arr4 = (InterfaceC23667[]) Arrays.copyOf(interfaceC23667Arr3, i12);
                    if (C1036.f81953 < 0) {
                        return new C19013(c19014.f56677, interfaceC23667Arr4);
                    }
                    iM55680 = (i7 - C0946.m55979("ۡ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i8 = ((iM55680 ^ i6) * 6413) ^ 1390204987;
                    i3 = 1453562094;
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -1760246880:
                case -1401034848:
                    c19015 = null;
                    interfaceC23667Arr3 = null;
                    i11 = 0;
                    i15 = 0;
                    i12 = 0;
                    int iM55979 = C0946.m55979("ۖܳ") ^ i6;
                    i9 = iM55979 ^ 647188926;
                    i8 = ((iM55979 ^ i7) * (-10151)) ^ (-2146515185);
                    c19014 = this;
                    break;
                case -1721320716:
                case -412704382:
                    c19013 = c19015;
                    if (C1124.f82007 >= 0) {
                        iM55680 = (i7 - C0946.m55979("ۡ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM55680 ^ i6) * 6413) ^ 1390204987;
                        i3 = 1453562094;
                    } else {
                        iM55680 = C0873.m55680("᩶᩶") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-3809)) ^ (-149012732);
                        i3 = -1859144579;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -1673701410:
                case 1374589338:
                    i15++;
                    i12 = i13;
                    interfaceC23667Arr3 = interfaceC23667Arr2;
                    int iM559710 = C0946.m55979("ۖܳ") ^ i6;
                    i9 = iM559710 ^ 647188926;
                    i8 = ((iM559710 ^ i7) * (-10151)) ^ (-2146515185);
                    c19014 = this;
                    break;
                case -1519332459:
                case 1930625794:
                    c19013 = c19015;
                    if (C0937.f81884) {
                        iM55680 = (C0873.m55680("ۢܽ") ^ i7) * 53;
                        i8 = ((iM55680 ^ i6) * 24399) ^ 1856903753;
                        i3 = -196542146;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ܽ᩻")) * (-35);
                        i8 = ((iM55680 ^ i7) * 539) ^ (-219170506);
                        i3 = 323310836;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -1493128650:
                case 617973750:
                    c19013 = c19015;
                    if (C0866.f81837 >= 0) {
                        iM55680 = (i6 - C0873.m55680("ᩳ᩷")) * (-51);
                        i8 = ((iM55680 ^ i7) * (-19159)) ^ 61198609;
                        i3 = 2059122385;
                    } else {
                        iM55680 = C0873.m55680("ۡۜ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-22489)) ^ 311597616;
                        i3 = 704317175;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -1469626736:
                case 408086359:
                    i13 = i12 + 1;
                    c19013 = c19015;
                    interfaceC23667Arr2 = interfaceC23667Arr3;
                    iM55681 = C0946.m55979("ۛ᩵") ^ i6;
                    i4 = ((iM55681 ^ i7) * (-16543)) ^ (-1762817389);
                    i5 = 1706186312;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case -1429283253:
                case 108357977:
                    break;
                case -1086144728:
                case 483068739:
                    c19013 = c19015;
                    m43171(i, i2);
                    i10 = i2 + i;
                    if (C1194.f82045 != 0) {
                        iM55680 = (i6 - C0873.m55680("ᩳ᩷")) * (-51);
                        i8 = ((iM55680 ^ i7) * (-19159)) ^ 61198609;
                        i3 = 2059122385;
                    } else {
                        iM55680 = C0946.m55979("᩶֨") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-19293)) ^ (-1841407971);
                        i3 = -238112073;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -1010137274:
                case 415258016:
                    return c19014;
                case -995208285:
                case 1327665673:
                    c19013 = c19015;
                    if (C1964.f83032 <= 0) {
                        iM55680 = (C0946.m55979("֨ۛ") ^ i6) * 81;
                        i8 = ((iM55680 ^ i7) * 26573) ^ 1032993774;
                        i3 = 1051262353;
                    } else {
                        iM55680 = C0946.m55979("ܺۗ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-27603)) ^ (-814453639);
                        i3 = -808619631;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -993132778:
                case 1632287133:
                    C0949.m56012();
                    if (C0992.m56107() > 0) {
                        c19013 = c19015;
                        iM55680 = (i7 - C0946.m55979("ۡ᩷")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((iM55680 ^ i6) * 6413) ^ 1390204987;
                        i3 = 1453562094;
                        i9 = iM55680 ^ i3;
                        c19014 = this;
                        c19015 = c19013;
                    }
                    c19013 = c19015;
                    iM55680 = (C0946.m55979("֨ۛ") ^ i6) * 81;
                    i8 = ((iM55680 ^ i7) * 26573) ^ 1032993774;
                    i3 = 1051262353;
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -830514917:
                case 673149127:
                    C1036.m56257();
                    return null;
                case -681777083:
                case 181310555:
                    c19013 = c19015;
                    if (interfaceC23667Arr3 == null) {
                        iM55681 = (C0873.m55680("ۨ֨") + i7) * 61;
                        i4 = ((iM55681 ^ i6) * 30449) ^ 307854095;
                        i5 = -1724190991;
                    } else {
                        iM55681 = (C0946.m55979("᩺ܺ") ^ i6) * (-95);
                        i4 = ((iM55681 ^ i7) * 31665) ^ (-1525676945);
                        i5 = -1031157837;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case -215899149:
                case -197336096:
                    c19013 = c19015;
                    if (C0861.m55626()) {
                        iM55680 = (i6 - C0873.m55680("ᩳ᩷")) * (-51);
                        i8 = ((iM55680 ^ i7) * (-19159)) ^ 61198609;
                        i3 = 2059122385;
                    } else {
                        iM55680 = (C0946.m55979("ܽܿ") ^ i7) * (-87);
                        i8 = ((iM55680 ^ i6) * (-17543)) ^ (-271750199);
                        i3 = -345780387;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -74334620:
                case 412626893:
                    c19013 = c19015;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ܰܶ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 7765) ^ 2101511288;
                        i3 = 2017654307;
                    } else {
                        iM55680 = (C0946.m55979("֨ۛ") ^ i6) * 81;
                        i8 = ((iM55680 ^ i7) * 26573) ^ 1032993774;
                        i3 = 1051262353;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case -29959833:
                case 1807675570:
                    interfaceC23667Arr3[i12] = interfaceC23667;
                    c19013 = c19015;
                    iM55681 = (C0946.m55979("ܰ۟") ^ i7) * (-127);
                    i4 = ((iM55681 ^ i6) * 12197) ^ (-901504019);
                    i5 = 1382305498;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case 143604160:
                case 2030602985:
                    InterfaceC23667[] interfaceC23667Arr5 = new InterfaceC23667[interfaceC23667Arr.length];
                    AbstractC0942.m55965(interfaceC23667Arr, i11, interfaceC23667Arr5, i11, i15);
                    interfaceC23667Arr2 = interfaceC23667Arr5;
                    c19013 = c19015;
                    i13 = i15;
                    iM55681 = C0946.m55979("ۛ᩵") ^ i6;
                    i4 = ((iM55681 ^ i7) * (-16543)) ^ (-1762817389);
                    i5 = 1706186312;
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case 315597707:
                case 1502353108:
                    c19013 = c19015;
                    interfaceC23667Arr = c19014.f56678;
                    if (i15 < interfaceC23667Arr.length) {
                        iM55681 = C0873.m55680("ۗ۠") ^ i6;
                        i4 = ((iM55681 ^ i7) * (-13465)) ^ (-108591189);
                        i5 = -647596443;
                    } else {
                        iM55681 = (C0873.m55680("ۚۛ") ^ i7) * (-25);
                        i4 = ((iM55681 ^ i6) * 28461) ^ 206452314;
                        i5 = -32636761;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
                case 513497280:
                case 1877359839:
                    c19013 = c19015;
                    if (C1194.f82045 != 0) {
                        iM55680 = (i7 - C0946.m55979("᩵ܶ")) * (-69);
                        i8 = ((iM55680 ^ i6) * 15561) ^ 1529056952;
                        i3 = 1615932331;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۧ") ^ i6) * 123;
                        i8 = ((iM55680 ^ i7) * (-10825)) ^ (-1457254572);
                        i3 = -628147737;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                case 615474746:
                case 1921832692:
                    c19013 = c19015;
                    if (C1929.m56553()) {
                        iM55680 = (i6 - C0873.m55680("ܽ᩻")) * (-35);
                        i8 = ((iM55680 ^ i7) * 539) ^ (-219170506);
                        i3 = 323310836;
                    } else {
                        iM55680 = (C0873.m55680("֨᩸") + i6) * (-15);
                        i8 = ((iM55680 ^ i7) * (-16445)) ^ (-484026793);
                        i3 = -900184946;
                    }
                    i9 = iM55680 ^ i3;
                    c19014 = this;
                    c19015 = c19013;
                    break;
                default:
                    c19013 = c19015;
                    if (interfaceC23667Arr3 != null) {
                        iM55681 = (i6 - C0873.m55680("ᩴ᩶")) * 27;
                        i4 = ((iM55681 ^ i7) * 93) ^ 844093886;
                        i5 = -287178960;
                    } else {
                        iM55681 = (C0946.m55979("ܰ۟") ^ i7) * (-127);
                        i4 = ((iM55681 ^ i6) * 12197) ^ (-901504019);
                        i5 = 1382305498;
                    }
                    i9 = iM55681 ^ i5;
                    i8 = i4;
                    c19015 = c19013;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0186  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0228 A[PHI: r7
      0x0228: PHI (r7v10 l.۬ܽܳ) = (r7v4 l.۬ܽܳ), (r7v7 l.۬ܽܳ), (r7v4 l.۬ܽܳ) binds: [B:75:0x01e2, B:47:0x00ca, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public final C19684 m43179(int i, byte[] bArr, int i2, int i3) {
        int iM55680;
        int i4;
        boolean z = false;
        int i5 = 1481397207;
        int i6 = RunnableC1014.f81941;
        int i7 = C0912.f81867;
        int iM55979 = (i6 - C0946.m55979("ᩴᩴ")) * 49;
        int i8 = ((iM55979 ^ i7) * (-2939)) ^ 296012515;
        int i9 = -749358699;
        while (true) {
            int i10 = iM55979 ^ i9;
            C14949 c14949 = null;
            while (true) {
                i5 = ((((i5 ^ i7) * 22293) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -1941110412:
                    case -1073858572:
                        return new C19684(this, z);
                    case -1903528271:
                    case -1208833628:
                        C1036.m56257();
                        if (C0873.f81841 <= 0) {
                            iM55680 = C0873.m55680("ܺۤ") ^ i6;
                            i8 = ((iM55680 ^ i7) * 2389) ^ 671399441;
                            i4 = 1900307741;
                        } else {
                            iM55680 = (C0946.m55979("ܽۤ") + i7) * 81;
                            i8 = ((iM55680 ^ i6) * 29723) ^ 1831926825;
                            i4 = 664463519;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -1877557270:
                    case -1486560798:
                        C19013 c19013M43166 = m43166(c14949);
                        InterfaceC23667[] interfaceC23667Arr = c19013M43166.f56678;
                        for (InterfaceC23667 interfaceC23667 : this.f56678) {
                            if (interfaceC23667 instanceof C24337) {
                                C24337 c24337 = (C24337) interfaceC23667;
                                int length = interfaceC23667Arr.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= length) {
                                        z = true;
                                        return new C19684(c19013M43166, z);
                                    }
                                    InterfaceC23667 interfaceC23668 = interfaceC23667Arr[i11];
                                    if ((interfaceC23668 instanceof C24337) && ((C24337) interfaceC23668).f77099 == c24337.f77099) {
                                    }
                                    i11++;
                                    break;
                                }
                            }
                        }
                        return new C19684(c19013M43166, z);
                    case -1824206741:
                    case -936751227:
                        if (C1025.f81947 >= 0) {
                            iM55680 = C0873.m55680("ܺۤ") ^ i6;
                            i8 = ((iM55680 ^ i7) * 2389) ^ 671399441;
                            i4 = 1900307741;
                        } else {
                            iM55680 = (i6 - C0873.m55680("ۛۧ")) * 35;
                            i8 = ((iM55680 ^ i7) * 27223) ^ (-814370867);
                            i4 = 859631365;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -1796179629:
                    case 948328204:
                        if (C0873.m55678()) {
                            iM55680 = (C0946.m55979("ܽۤ") + i7) * 81;
                            i8 = ((iM55680 ^ i6) * 29723) ^ 1831926825;
                            i4 = 664463519;
                        } else {
                            iM55680 = (C0873.m55680("۬֫") ^ i7) * (-125);
                            i8 = ((iM55680 ^ i6) * (-28391)) ^ 710090293;
                            i4 = 478028484;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -798991982:
                    case 129990317:
                        if (C0845.f81821 >= 0) {
                        }
                        iM55680 = (i6 - C0873.m55680("ۛۧ")) * 35;
                        i8 = ((iM55680 ^ i7) * 27223) ^ (-814370867);
                        i4 = 859631365;
                        i10 = iM55680 ^ i4;
                        break;
                    case -472625501:
                    case 1915322157:
                        if (C0989.m56095() <= 0) {
                            iM55680 = (C0946.m55979("ܽۤ") + i7) * 81;
                            i8 = ((iM55680 ^ i6) * 29723) ^ 1831926825;
                            i4 = 664463519;
                        } else {
                            iM55680 = C0946.m55979("ܶܽ") ^ i7;
                            i8 = ((iM55680 ^ i6) * 11295) ^ (-1868283608);
                            i4 = 945811822;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -334617165:
                    case 1509734420:
                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                        }
                        iM55680 = (C0873.m55680("ۙۨ") + i6) * 25;
                        i8 = ((iM55680 ^ i7) * (-26941)) ^ 1560797932;
                        i4 = -299029770;
                        i10 = iM55680 ^ i4;
                        break;
                        break;
                    case -262690850:
                    case 2116966282:
                        if (C0894.f81854 >= 0) {
                            iM55680 = (i6 - C0873.m55680("᩺ۗ")) * (-5);
                            i8 = ((iM55680 ^ i7) * (-15993)) ^ 1981026243;
                            i4 = 298146589;
                        } else {
                            iM55680 = (C0873.m55680("᩶ۚ") + i7) * (-11);
                            i8 = ((iM55680 ^ i6) * 18387) ^ (-1668084596);
                            i4 = -365105038;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -98278587:
                    case 1661067580:
                        if (C1071.f81975 <= 0) {
                            iM55680 = C0873.m55680("᩺۠") ^ i6;
                            i8 = ((iM55680 ^ i7) * 28833) ^ (-445800470);
                            i4 = -702849105;
                        } else {
                            iM55680 = C0946.m55979("ۢۢ") ^ i7;
                            i8 = ((iM55680 ^ i6) * (-12169)) ^ 45478808;
                            i4 = 439795648;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -65407382:
                    case 21947337:
                        if (C1964.f83032 <= 0) {
                            iM55680 = C0873.m55680("ܺۤ") ^ i6;
                            i8 = ((iM55680 ^ i7) * 2389) ^ 671399441;
                            i4 = 1900307741;
                        } else {
                            iM55680 = C0946.m55979("ܰۙ") ^ i6;
                            i8 = ((iM55680 ^ i7) * (-18649)) ^ (-2139106621);
                            i4 = 13517643;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case -41577284:
                    case 450816852:
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + i3);
                        if (ViewOnClickListenerC0939.m55941() >= 0) {
                        }
                        c14949 = new C14949(AbstractC12979.m29750(i, 1, i3), bArrCopyOfRange);
                        if (C0937.m55918() >= 0) {
                            iM55680 = C0873.m55680("᩺۠") ^ i6;
                            i8 = ((iM55680 ^ i7) * 28833) ^ (-445800470);
                            i4 = -702849105;
                        } else {
                            iM55680 = (i7 - C0873.m55680("ۤ᩹")) * (-117);
                            i8 = ((iM55680 ^ i6) * 21945) ^ 1710877840;
                            i4 = -1546404073;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                        break;
                    case 279858778:
                    case 1171099972:
                        C0930.m55885();
                        C0892.m55749();
                        return null;
                    case 542727127:
                    case 2073414717:
                        C10927.m25189(bArr.length, i2, i3);
                        m43171(i, i3);
                        z = false;
                        if (i3 == 0) {
                            iM55680 = (C0873.m55680("֫ۤ") + i7) * 19;
                            i8 = ((iM55680 ^ i6) * (-26269)) ^ (-881217490);
                            i4 = -1209667933;
                        } else {
                            iM55680 = (i6 - C0873.m55680("᩵ܰ")) * (-123);
                            i8 = ((iM55680 ^ i7) * (-20245)) ^ (-1702531022);
                            i4 = 137963046;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    case 751481724:
                    case 1629776719:
                        if (RunnableC0897.m55784()) {
                        }
                        iM55680 = (C0946.m55979("ۧۤ") ^ i6) * (-65);
                        i8 = ((iM55680 ^ i7) * 2473) ^ 1076454954;
                        i4 = 1371073981;
                        i10 = iM55680 ^ i4;
                        break;
                        break;
                    case 1371599334:
                    case 1775583066:
                        C0946.m55980();
                        iM55680 = C0873.m55680("ܺۤ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 2389) ^ 671399441;
                        i4 = 1900307741;
                        i10 = iM55680 ^ i4;
                        break;
                    case 1424117716:
                    case 1949552063:
                        if (C1964.m56597() != 0) {
                            iM55680 = (i6 - C0873.m55680("ۛۧ")) * 35;
                            i8 = ((iM55680 ^ i7) * 27223) ^ (-814370867);
                            i4 = 859631365;
                        } else {
                            iM55680 = (i6 - C0873.m55680("᩺ۗ")) * (-5);
                            i8 = ((iM55680 ^ i7) * (-15993)) ^ 1981026243;
                            i4 = 298146589;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                    default:
                        if (C0992.f81922 >= 0) {
                            iM55680 = C0873.m55680("᩺۠") ^ i6;
                            i8 = ((iM55680 ^ i7) * 28833) ^ (-445800470);
                            i4 = -702849105;
                        } else {
                            iM55680 = C0946.m55979("۬ۨ") ^ i6;
                            i8 = ((iM55680 ^ i7) * 22707) ^ (-1900284064);
                            i4 = 1500268509;
                        }
                        i10 = iM55680 ^ i4;
                        break;
                }
            }
            iM55979 = C0873.m55680("᩷۫") ^ i7;
            i8 = ((iM55979 ^ i6) * (-22723)) ^ (-1124568553);
            i9 = -796053333;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0248 A[PHI: r7 r21 r23
      0x0248: PHI (r7v5 long) = (r7v1 long), (r7v1 long), (r7v6 long) binds: [B:63:0x0246, B:59:0x0226, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r21v18 int) = (r21v12 int), (r21v13 int), (r21v19 int) binds: [B:63:0x0246, B:59:0x0226, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r23v20 long) = (r23v17 long), (r23v18 long), (r23v21 long) binds: [B:63:0x0246, B:59:0x0226, B:19:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0280 A[PHI: r21 r23
      0x0280: PHI (r21v27 int) = (r21v11 int), (r21v14 int), (r21v28 int) binds: [B:67:0x027e, B:55:0x0203, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r23v24 long) = (r23v16 long), (r23v19 long), (r23v25 long) binds: [B:67:0x027e, B:55:0x0203, B:10:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܽ */
    public final long m43183(int i, int i2) {
        int i3;
        int iM55979;
        int i4;
        int i5;
        int iM55680;
        int i6;
        int i7;
        long jMo34205;
        int i8;
        int i9;
        int i10 = i;
        int i11 = C0898.f81858;
        int i12 = C1124.f82007;
        int iM559710 = (C0946.m55979("᩷ۚ") ^ i11) * 83;
        int i13 = ((iM559710 ^ i12) * 21559) ^ (-1858780624);
        InterfaceC23667[] interfaceC23667Arr = null;
        long j = 0;
        long jM43160 = 0;
        int i14 = iM559710 ^ (-451514013);
        int i15 = 0;
        int length = 0;
        int i16 = 1697008060;
        int i17 = 0;
        long j2 = 0;
        long j3 = 0;
        InterfaceC23667 interfaceC23667 = null;
        long j4 = 0;
        int i18 = 0;
        while (true) {
            i16 = i14 ^ (i13 & (((i16 ^ i12) * 15001) >> 31));
            switch (i16) {
                case -2012097852:
                case -890703751:
                    jMo34205 = interfaceC23667.mo34205(i10, i15);
                    j3 = jMo34205;
                    iM55680 = C0946.m55979("۟֫") ^ i11;
                    i6 = ((iM55680 ^ i12) * 8283) ^ 1421456653;
                    i7 = 1422897123;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    j2 = j2;
                    break;
                case -2004417802:
                case 483428317:
                    j2 = j2;
                    i3 = i17;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (C0946.m55979("᩹᩵") + i11) * 89;
                        i4 = ((iM55979 ^ i12) * 28613) ^ 683748471;
                        i5 = 1442829066;
                    } else {
                        iM55979 = (i12 - C0946.m55979("᩷ۖ")) * 123;
                        i4 = ((iM55979 ^ i11) * (-2211)) ^ 1398721394;
                        i5 = -1234574575;
                    }
                    i9 = iM55979 ^ i5;
                    i13 = i4;
                    i17 = i3;
                    j2 = j2;
                    i14 = i9;
                    break;
                case -1910216318:
                case 561563604:
                    j2 = j2;
                    i3 = i17;
                    if (!C0892.m55749()) {
                        i17 = i3;
                        int iM55681 = C0873.m55680("۬ۨ") ^ i12;
                        i14 = iM55681 ^ (-13028577);
                        i13 = ((iM55681 ^ i11) * (-11229)) ^ 1262683846;
                        j2 = j2;
                    } else {
                        iM55979 = C0946.m55979("ۘ۠") ^ i11;
                        i4 = ((iM55979 ^ i12) * (-27989)) ^ (-446099782);
                        i5 = 625098361;
                        i9 = iM55979 ^ i5;
                        i13 = i4;
                        i17 = i3;
                        j2 = j2;
                        i14 = i9;
                    }
                    break;
                case -1693791378:
                case 454255812:
                    jMo34205 = 0;
                    j3 = jMo34205;
                    iM55680 = C0946.m55979("۟֫") ^ i11;
                    i6 = ((iM55680 ^ i12) * 8283) ^ 1421456653;
                    i7 = 1422897123;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    j2 = j2;
                    break;
                case -1649591143:
                case 1960548198:
                    j2 = j2;
                    if (i18 < length) {
                        iM55680 = (C0873.m55680("ܰ᩵") + i11) * (-75);
                        i6 = ((iM55680 ^ i12) * (-8517)) ^ 221695632;
                        i7 = 911126839;
                    } else {
                        iM55680 = (C0873.m55680("۟᩺") + i12) * (-81);
                        i6 = ((iM55680 ^ i11) * 2119) ^ (-1639077820);
                        i7 = -872149642;
                    }
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    j2 = j2;
                    break;
                case -1561139634:
                case -672743770:
                    RunnableC0871.m55672();
                    int iM559711 = C0946.m55979("᩻۠") ^ i12;
                    i14 = iM559711 ^ (-464017157);
                    i13 = ((iM559711 ^ i11) * 28991) ^ 865003800;
                    break;
                case -1271544281:
                case -889323134:
                    int i19 = i17;
                    j2 = ((long) i19) * 96;
                    if (C0863.m55643()) {
                        int iM559712 = (i12 - C0946.m55979("᩸᩸")) * (-63);
                        i13 = ((iM559712 ^ i11) * 11873) ^ (-1065149819);
                        i9 = iM559712 ^ (-643832796);
                        i17 = i19;
                    } else {
                        i8 = i19;
                        int iM55682 = (i12 - C0873.m55680("᩺ܶ")) * (-83);
                        int i20 = ((iM55682 ^ i11) * 19817) ^ 1962097380;
                        i9 = iM55682 ^ (-1404465864);
                        i13 = i20;
                        i17 = i8;
                        i10 = i;
                    }
                    i14 = i9;
                    break;
                case -1268417721:
                case 1701408428:
                    if (C1036.f81953 < 0) {
                        j2 = j2;
                        i3 = i17;
                        iM55979 = (i11 - C0873.m55680("ۛۤ")) * (-53);
                        i4 = ((iM55979 ^ i12) * 24201) ^ (-587006060);
                        i5 = 2008597539;
                        i9 = iM55979 ^ i5;
                        i13 = i4;
                        i17 = i3;
                        j2 = j2;
                        i14 = i9;
                    } else {
                        int iM559713 = C0946.m55979("᩻۠") ^ i12;
                        i14 = iM559713 ^ (-464017157);
                        i13 = ((iM559713 ^ i11) * 28991) ^ 865003800;
                    }
                    break;
                case -1123049285:
                case 446609250:
                    i18++;
                    j2 = j2;
                    j4 = jM43160;
                    iM55680 = C0873.m55680("ۘܳ") ^ i11;
                    i6 = ((iM55680 ^ i12) * 3869) ^ 2017834443;
                    i7 = 2086620149;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    j2 = j2;
                    break;
                case -946811853:
                case 253949757:
                    j2 = j2;
                    i15 = i2 + i10;
                    interfaceC23667Arr = this.f56678;
                    int length2 = interfaceC23667Arr.length;
                    if (C0947.f81895) {
                        i17 = length2;
                        int iM55683 = C0873.m55680("۬ۨ") ^ i12;
                        i14 = iM55683 ^ (-13028577);
                        i13 = ((iM55683 ^ i11) * (-11229)) ^ 1262683846;
                    } else {
                        int iM559714 = (C0946.m55979("ᩴۢ") ^ i11) * 25;
                        i14 = iM559714 ^ 1627471505;
                        i17 = length2;
                        i13 = ((iM559714 ^ i12) * (-3881)) ^ (-1285106862);
                    }
                    j2 = j2;
                    break;
                case -898312507:
                case 384143807:
                    j2 = j2;
                    length = interfaceC23667Arr.length;
                    j4 = j2 + j;
                    i18 = 0;
                    iM55680 = C0873.m55680("ۘܳ") ^ i11;
                    i6 = ((iM55680 ^ i12) * 3869) ^ 2017834443;
                    i7 = 2086620149;
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    j2 = j2;
                    break;
                case -803259682:
                case 768008889:
                    j2 = j2;
                    i3 = i17;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i11 - C0873.m55680("ۛۤ")) * (-53);
                        i4 = ((iM55979 ^ i12) * 24201) ^ (-587006060);
                        i5 = 2008597539;
                    } else {
                        iM55979 = C0946.m55979("ᩴ۬") ^ i11;
                        i4 = ((iM55979 ^ i12) * 19763) ^ 783963054;
                        i5 = -2147467322;
                    }
                    i9 = iM55979 ^ i5;
                    i13 = i4;
                    i17 = i3;
                    j2 = j2;
                    i14 = i9;
                    break;
                case -554563114:
                case 1028060152:
                    return j4;
                case 157528937:
                case 2016931415:
                    C1036.m56257();
                    return 0L;
                case 302960180:
                case 556892667:
                    RunnableC0938.m55938();
                    if (C1404.m56468()) {
                        i8 = i17;
                        int iM55684 = (i12 - C0873.m55680("᩺ܶ")) * (-83);
                        int i21 = ((iM55684 ^ i11) * 19817) ^ 1962097380;
                        i9 = iM55684 ^ (-1404465864);
                        i13 = i21;
                        i17 = i8;
                        i10 = i;
                        i14 = i9;
                    }
                    j2 = j2;
                    i3 = i17;
                    iM55979 = (i11 - C0873.m55680("ۛۤ")) * (-53);
                    i4 = ((iM55979 ^ i12) * 24201) ^ (-587006060);
                    i5 = 2008597539;
                    i9 = iM55979 ^ i5;
                    i13 = i4;
                    i17 = i3;
                    j2 = j2;
                    i14 = i9;
                    break;
                case 352273067:
                case 1099362713:
                    j2 = j2;
                    i3 = i17;
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0946.m55979("᩹᩵") + i11) * 89;
                        i4 = ((iM55979 ^ i12) * 28613) ^ 683748471;
                        i5 = 1442829066;
                    } else {
                        iM55979 = C0873.m55680("᩺֨") ^ i12;
                        i4 = ((iM55979 ^ i11) * 12965) ^ 1786322585;
                        i5 = -2144534243;
                    }
                    i9 = iM55979 ^ i5;
                    i13 = i4;
                    i17 = i3;
                    j2 = j2;
                    i14 = i9;
                    break;
                case 472132680:
                case 651087986:
                    long j5 = j2;
                    i8 = i17;
                    if (C1046.f81962 <= 0) {
                        j2 = j5;
                        int iM55685 = (i12 - C0873.m55680("᩺ܶ")) * (-83);
                        int i22 = ((iM55685 ^ i11) * 19817) ^ 1962097380;
                        i9 = iM55685 ^ (-1404465864);
                        i13 = i22;
                        i17 = i8;
                        i10 = i;
                        i14 = i9;
                    } else {
                        int iM559715 = (C0946.m55979("۟֡") ^ i12) * (-31);
                        i13 = ((iM559715 ^ i11) * 12209) ^ (-1079655205);
                        i17 = i8;
                        j2 = j5;
                        i14 = iM559715 ^ (-937626153);
                        i10 = i;
                    }
                    break;
                case 641774793:
                case 2040569779:
                    j2 = j2;
                    j = 48;
                    if (!C0927.f81875) {
                        iM55680 = (C0873.m55680("᩵ܺ") ^ i12) * 17;
                        i6 = ((iM55680 ^ i11) * (-17389)) ^ 1827948820;
                        i7 = -695181331;
                        i14 = iM55680 ^ i7;
                        i13 = i6;
                        j2 = j2;
                    } else {
                        i3 = i17;
                        iM55979 = (C0946.m55979("᩹᩵") + i11) * 89;
                        i4 = ((iM55979 ^ i12) * 28613) ^ 683748471;
                        i5 = 1442829066;
                        i9 = iM55979 ^ i5;
                        i13 = i4;
                        i17 = i3;
                        j2 = j2;
                        i14 = i9;
                    }
                    break;
                case 777234091:
                case 1548448391:
                    j2 = j2;
                    jM43160 = m43160(j4, Math.max(interfaceC23667.mo34206(), j3));
                    if (!C0947.f81895) {
                        iM55680 = (C0873.m55680("ۡۙ") + i12) * (-35);
                        i6 = ((iM55680 ^ i11) * 30913) ^ (-8626046);
                        i7 = -1949905999;
                        i14 = iM55680 ^ i7;
                        i13 = i6;
                        j2 = j2;
                    } else {
                        int iM55686 = C0873.m55680("۬ۨ") ^ i12;
                        i14 = iM55686 ^ (-13028577);
                        i13 = ((iM55686 ^ i11) * (-11229)) ^ 1262683846;
                        j2 = j2;
                    }
                    break;
                case 1265570934:
                case 2146223856:
                    if (C1053.f81965 > 0) {
                        j2 = j2;
                        i3 = i17;
                        iM55979 = (C0946.m55979("᩹᩵") + i11) * 89;
                        i4 = ((iM55979 ^ i12) * 28613) ^ 683748471;
                        i5 = 1442829066;
                        i9 = iM55979 ^ i5;
                        i13 = i4;
                        i17 = i3;
                        j2 = j2;
                        i14 = i9;
                    } else {
                        int iM559716 = C0946.m55979("᩻۠") ^ i12;
                        i14 = iM559716 ^ (-464017157);
                        i13 = ((iM559716 ^ i11) * 28991) ^ 865003800;
                    }
                    break;
                case 1830361892:
                case 2000444392:
                    j2 = j2;
                    i3 = i17;
                    m43171(i, i2);
                    if (C0845.m55584() <= 0) {
                        iM55979 = (i11 - C0873.m55680("ۛۤ")) * (-53);
                        i4 = ((iM55979 ^ i12) * 24201) ^ (-587006060);
                        i5 = 2008597539;
                    } else {
                        iM55979 = (i11 - C0873.m55680("᩵۟")) * (-7);
                        i4 = ((iM55979 ^ i12) * 14489) ^ 1578275455;
                        i5 = -883387917;
                    }
                    i9 = iM55979 ^ i5;
                    i13 = i4;
                    i17 = i3;
                    j2 = j2;
                    i14 = i9;
                    break;
                default:
                    j2 = j2;
                    interfaceC23667 = interfaceC23667Arr[i18];
                    if (interfaceC23667.mo34203(i10, i15)) {
                        iM55680 = C0873.m55680("ۛۨ") ^ i12;
                        i6 = ((iM55680 ^ i11) * (-51)) ^ 2145237367;
                        i7 = 1696999934;
                    } else {
                        iM55680 = C0873.m55680("᩻ۧ") ^ i11;
                        i6 = ((iM55680 ^ i12) * (-19561)) ^ 37884511;
                        i7 = 328489152;
                    }
                    i14 = iM55680 ^ i7;
                    i13 = i6;
                    j2 = j2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f0 A[PHI: r6 r7
      0x00f0: PHI (r6v6 l.᩹ܽܳ) = (r6v3 l.᩹ܽܳ), (r6v2 l.᩹ܽܳ), (r6v2 l.᩹ܽܳ), (r6v2 l.᩹ܽܳ) binds: [B:30:0x00d8, B:26:0x00b2, B:23:0x0091, B:21:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r7v7 l.᩺ܽܳ) = (r7v2 l.᩺ܽܳ), (r7v4 l.᩺ܽܳ), (r7v2 l.᩺ܽܳ), (r7v2 l.᩺ܽܳ) binds: [B:30:0x00d8, B:26:0x00b2, B:23:0x0091, B:21:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01db  */
    /* JADX WARN: Code duplicated, block: B:70:0x024c  */
    /* JADX WARN: Code duplicated, block: B:74:0x027d  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b0  */
    /* JADX INFO: renamed from: ֫ */
    public final void m43174(int i, int i2, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int i7 = 0;
        InterfaceC23667[] interfaceC23667Arr = null;
        int length = 0;
        int i8 = 0;
        InterfaceC23667 interfaceC23667 = null;
        C24337 c24337 = null;
        int i9 = -1804298807;
        int i10 = C1046.f81962;
        int i11 = RunnableC0938.f81886;
        int iM559711 = C0946.m55979("ᩴ᩹") ^ i11;
        int i12 = ((iM559711 ^ i10) * 19699) ^ (-1268342879);
        int i13 = -243772855;
        while (true) {
            int i14 = iM559711 ^ i13;
            while (true) {
                i9 = ((((i9 ^ i10) * 13863) >> 31) & i12) ^ i14;
                switch (i9) {
                    case -2006524241:
                    case -447949393:
                        if (i8 < length) {
                            iM559710 = C0946.m55979("᩸ۘ") ^ i10;
                            i5 = ((iM559710 ^ i11) * (-11425)) ^ 515189692;
                            i6 = 402143416;
                        } else {
                            iM559710 = (C0946.m55979("ۗۜ") + i11) * 75;
                            i5 = ((iM559710 ^ i10) * 31893) ^ (-783572419);
                            i6 = -654992416;
                        }
                        i14 = iM559710 ^ i6;
                        i12 = i5;
                        break;
                    case -1339532505:
                    case -667668365:
                        i8++;
                        iM55979 = C0946.m55979("ۙ۟") ^ i10;
                        i3 = ((iM55979 ^ i11) * 25059) ^ (-1379698783);
                        i4 = -1283091410;
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1289671964:
                    case -1253189456:
                        if (identityHashMap.containsKey(c24337.f77099)) {
                            iM559710 = (C0873.m55680("ۘܶ") + i11) * 13;
                            i5 = ((iM559710 ^ i10) * 29457) ^ 760278891;
                            i6 = -1331083109;
                        } else {
                            iM559710 = (C0873.m55680("ܿ֨") + i11) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((iM559710 ^ i10) * (-14243)) ^ (-876812384);
                            i6 = -52637215;
                        }
                        i14 = iM559710 ^ i6;
                        i12 = i5;
                        break;
                    case -1281247488:
                    case -1179656680:
                        if (C0861.f81831) {
                            iM55979 = (C0946.m55979("ܶ֨") ^ i11) * 21;
                            i3 = ((iM55979 ^ i10) * 30701) ^ 1608615514;
                            i4 = -830528682;
                        } else {
                            iM55979 = (C0946.m55979("ۤ֨") ^ i10) * (-71);
                            i3 = ((iM55979 ^ i11) * 30919) ^ (-337647119);
                            i4 = 1496506591;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1222878508:
                    case -53303422:
                        if (C0992.f81922 >= 0) {
                        }
                        iM55979 = C0873.m55680("ۡ᩹") ^ i10;
                        i3 = ((iM55979 ^ i11) * (-14721)) ^ 2143848960;
                        i4 = 1408957850;
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1195212025:
                    case 970776750:
                        if (C0863.m55643()) {
                            iM55979 = C0873.m55680("۟᩹") ^ i10;
                            i3 = ((iM55979 ^ i11) * 24125) ^ (-1335291529);
                            i4 = -1352520213;
                        } else {
                            iM55979 = (C0946.m55979("۟֡") ^ i11) * 57;
                            i3 = ((iM55979 ^ i10) * 13561) ^ (-949679187);
                            i4 = 1394023107;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1110651911:
                    case -232113778:
                        if (C0906.m55809() <= 0) {
                            iM55979 = (C0946.m55979("ۤ֨") ^ i10) * (-71);
                            i3 = ((iM55979 ^ i11) * 30919) ^ (-337647119);
                            i4 = 1496506591;
                        } else {
                            iM55979 = C0873.m55680("᩸ܶ") ^ i11;
                            i3 = ((iM55979 ^ i10) * (-8515)) ^ (-1530845813);
                            i4 = 1604882806;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1091129149:
                    case 1428925667:
                        if (C1028.f81950 <= 0) {
                            iM55979 = C0873.m55680("ۡ᩹") ^ i10;
                            i3 = ((iM55979 ^ i11) * (-14721)) ^ 2143848960;
                            i4 = 1408957850;
                        } else {
                            iM55979 = (C0873.m55680("֫ۤ") ^ i10) * (-33);
                            i3 = ((iM55979 ^ i11) * (-8125)) ^ (-899309574);
                            i4 = 450099539;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1033820335:
                    case 681255307:
                        if (RunnableC0938.f81886 >= 0) {
                            iM55979 = (C0946.m55979("ۤ֨") ^ i10) * (-71);
                            i3 = ((iM55979 ^ i11) * 30919) ^ (-337647119);
                            i4 = 1496506591;
                            i14 = iM55979 ^ i4;
                            i12 = i3;
                        }
                        iM55979 = C0873.m55680("ۡ᩹") ^ i10;
                        i3 = ((iM55979 ^ i11) * (-14721)) ^ 2143848960;
                        i4 = 1408957850;
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -1030634960:
                    case 1093835135:
                        interfaceC23667 = interfaceC23667Arr[i8];
                        if (interfaceC23667 instanceof C24337) {
                            iM559710 = (i11 - C0873.m55680("֫ۘ")) * 59;
                            i5 = ((iM559710 ^ i10) * (-15399)) ^ (-1832945472);
                            i6 = -1650272664;
                        } else {
                            iM559710 = (C0873.m55680("ۘܶ") + i11) * 13;
                            i5 = ((iM559710 ^ i10) * 29457) ^ 760278891;
                            i6 = -1331083109;
                        }
                        i14 = iM559710 ^ i6;
                        i12 = i5;
                        break;
                    case -893209263:
                    case -256857645:
                        if (C0927.f81875) {
                            iM55979 = C0873.m55680("ۡ᩹") ^ i10;
                            i3 = ((iM55979 ^ i11) * (-14721)) ^ 2143848960;
                            i4 = 1408957850;
                        } else {
                            iM55979 = C0873.m55680("ۢ֡") ^ i11;
                            i3 = ((iM55979 ^ i10) * 32107) ^ 1106161552;
                            i4 = -1485736707;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -834112030:
                    case -329894450:
                        if (C0989.f81920 >= 0) {
                            iM55979 = (C0946.m55979("ۤ֨") ^ i10) * (-71);
                            i3 = ((iM55979 ^ i11) * 30919) ^ (-337647119);
                            i4 = 1496506591;
                        } else {
                            iM55979 = C0873.m55680("֫۠") ^ i10;
                            i3 = ((iM55979 ^ i11) * (-2507)) ^ (-2073359648);
                            i4 = -278466006;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -272268065:
                    case 1620624358:
                        if (C0882.f81846) {
                            iM55979 = (C0946.m55979("۫۠") ^ i10) * 31;
                            i3 = ((iM55979 ^ i11) * (-2393)) ^ 1608456720;
                            i4 = 2130089598;
                        } else {
                            iM55979 = C0946.m55979("ۨܿ") ^ i11;
                            i3 = ((iM55979 ^ i10) * 5051) ^ (-1952789484);
                            i4 = -555123792;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -106211274:
                    case 1446193050:
                        if (RunnableC0871.f81839 >= 0) {
                            iM55979 = (C0946.m55979("۟֡") ^ i11) * 57;
                            i3 = ((iM55979 ^ i10) * 13561) ^ (-949679187);
                            i4 = 1394023107;
                        } else {
                            iM55979 = (C0873.m55680("ۤۛ") + i11) * 75;
                            i3 = ((iM55979 ^ i10) * 3963) ^ (-88866263);
                            i4 = -99814649;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case -56025040:
                    case 549249564:
                        C0898.m55800();
                        break;
                    case -41194826:
                    case 705179082:
                        C0877.m55700(identityHashMap, c24337.f77099, C0912.m55836(C0861.m55625(arrayList)));
                        C0937.m55917(arrayList, c24337.f77099);
                        iM559710 = (C0873.m55680("ۘܶ") + i11) * 13;
                        i5 = ((iM559710 ^ i10) * 29457) ^ 760278891;
                        i6 = -1331083109;
                        i14 = iM559710 ^ i6;
                        i12 = i5;
                        break;
                    case -35932721:
                    case 1989296769:
                        ViewOnClickListenerC0939.m55941();
                        iM55979 = (C0946.m55979("۫۠") ^ i10) * 31;
                        i3 = ((iM55979 ^ i11) * (-2393)) ^ 1608456720;
                        i4 = 2130089598;
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case 49842759:
                    case 934482895:
                        c24337 = (C24337) interfaceC23667;
                        if (c24337.mo34203(i, i7)) {
                            iM559710 = (i10 - C0873.m55680("ۤ᩷")) * (-85);
                            i5 = ((iM559710 ^ i11) * 21037) ^ (-284488598);
                            i6 = -1710062484;
                        } else {
                            iM559710 = (C0873.m55680("ۘܶ") + i11) * 13;
                            i5 = ((iM559710 ^ i10) * 29457) ^ 760278891;
                            i6 = -1331083109;
                        }
                        i14 = iM559710 ^ i6;
                        i12 = i5;
                        break;
                    case 87263365:
                    case 1499557070:
                        C1046.m56302();
                        if (C1048.m56305() < 0) {
                        }
                        iM55979 = (C0946.m55979("۫۠") ^ i10) * 31;
                        i3 = ((iM55979 ^ i11) * (-2393)) ^ 1608456720;
                        i4 = 2130089598;
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case 915566888:
                    case 2044170270:
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            iM55979 = (C0946.m55979("۫۠") ^ i10) * 31;
                            i3 = ((iM55979 ^ i11) * (-2393)) ^ 1608456720;
                            i4 = 2130089598;
                        } else {
                            iM55979 = (C0873.m55680("ۚ᩵") + i10) * 59;
                            i3 = ((iM55979 ^ i11) * (-30861)) ^ 2092675491;
                            i4 = -1117684977;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case 1141771052:
                    case 2059699265:
                        m43171(i, i2);
                        i7 = i2 + i;
                        interfaceC23667Arr = this.f56678;
                        length = interfaceC23667Arr.length;
                        i8 = 0;
                        iM55979 = C0946.m55979("ۙ۟") ^ i10;
                        i3 = ((iM55979 ^ i11) * 25059) ^ (-1379698783);
                        i4 = -1283091410;
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                    case 1326086605:
                    case 1642422503:
                        if (C1044.f81959 >= 0) {
                            iM55979 = (C0946.m55979("۟֡") ^ i11) * 57;
                            i3 = ((iM55979 ^ i10) * 13561) ^ (-949679187);
                            i4 = 1394023107;
                        } else {
                            iM55979 = (i10 - C0873.m55680("֡۠")) * 13;
                            i3 = ((iM55979 ^ i11) * (-19389)) ^ (-1757894874);
                            i4 = -691727253;
                        }
                        i14 = iM55979 ^ i4;
                        i12 = i3;
                        break;
                }
                return;
            }
            iM559711 = C0946.m55979("ۧۛ") ^ i11;
            i12 = ((iM559711 ^ i10) * 7661) ^ (-1098450133);
            i13 = -412008065;
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x03c8 A[PHI: r4 r10 r30
      0x03c8: PHI (r4v4 byte[]) = (r4v2 byte[]), (r4v3 byte[]), (r4v2 byte[]), (r4v2 byte[]) binds: [B:92:0x03c6, B:84:0x038c, B:72:0x030d, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x03c8: PHI (r10v4 l.᩹ܽܳ[]) = (r10v2 l.᩹ܽܳ[]), (r10v2 l.᩹ܽܳ[]), (r10v3 l.᩹ܽܳ[]), (r10v2 l.᩹ܽܳ[]) binds: [B:92:0x03c6, B:84:0x038c, B:72:0x030d, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x03c8: PHI (r30v50 int) = (r30v7 int), (r30v9 int), (r30v12 int), (r30v51 int) binds: [B:92:0x03c6, B:84:0x038c, B:72:0x030d, B:13:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03fd A[PHI: r7 r8 r9 r16 r30
      0x03fd: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:96:0x03fb, B:88:0x03a9, B:76:0x0331, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x03fd: PHI (r8v5 long[]) = (r8v2 long[]), (r8v2 long[]), (r8v3 long[]), (r8v2 long[]) binds: [B:96:0x03fb, B:88:0x03a9, B:76:0x0331, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x03fd: PHI (r9v5 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:96:0x03fb, B:88:0x03a9, B:76:0x0331, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x03fd: PHI (r16v5 int) = (r16v2 int), (r16v2 int), (r16v2 int), (r16v6 int) binds: [B:96:0x03fb, B:88:0x03a9, B:76:0x0331, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x03fd: PHI (r30v54 int) = (r30v6 int), (r30v8 int), (r30v11 int), (r30v55 int) binds: [B:96:0x03fb, B:88:0x03a9, B:76:0x0331, B:9:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (p067l.C1017.f81942 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (p067l.C1046.f81962 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0085, code lost:
    
        if (p067l.C1929.m56553() == false) goto L20;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C19013 m43173(int i, int i2) {
        int i3;
        int iM55979;
        int i4;
        int i5;
        int iM55680;
        int i6;
        int i7 = C1025.f81947;
        int i8 = RunnableC1014.f81941;
        int iM559710 = (C0946.m55979("ܰ᩺") + i8) * (-65);
        int i9 = ((iM559710 ^ i7) * 15449) ^ (-948033181);
        long[] jArr = null;
        InterfaceC23667[] interfaceC23667Arr = null;
        int[] iArr = null;
        byte[] bArr = null;
        long j = 0;
        int i10 = iM559710 ^ 1074891961;
        byte[] bArr2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iBitCount = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 51254887;
        int length = 0;
        while (true) {
            i25 = i10 ^ (i9 & (((i25 ^ i7) * (-1035)) >> 31));
            switch (i25) {
                case -2063758792:
                case -1959931057:
                    iArr[i21] = i + i20;
                    i24 = 1;
                    if (C0949.f81897 < 0) {
                        iM55680 = C0873.m55680("ܿ᩻") ^ i7;
                        i4 = ((iM55680 ^ i8) * (-4349)) ^ (-722248343);
                        i6 = 1500828559;
                        i10 = iM55680 ^ i6;
                        i9 = i4;
                    }
                    i3 = length;
                    iM55979 = (C0873.m55680("֨ۢ") + i8) * 19;
                    i4 = ((iM55979 ^ i7) * (-32293)) ^ (-1405158158);
                    i5 = 960910176;
                    int i26 = iM55979 ^ i5;
                    length = i3;
                    i10 = i26;
                    i9 = i4;
                    break;
                case -2021100436:
                case -1400695925:
                    iBitCount = i16 + Long.bitCount(jArr[i15]);
                    if (!C1929.m56553()) {
                        iM55680 = C0946.m55979("ۜ᩸") ^ i7;
                        i4 = ((iM55680 ^ i8) * 10955) ^ 717910501;
                        i6 = 975565698;
                        i10 = iM55680 ^ i6;
                        i9 = i4;
                    }
                    i3 = length;
                    iM55979 = (C0946.m55979("۠᩷") + i7) * (-119);
                    i4 = ((iM55979 ^ i8) * (-2347)) ^ (-444278800);
                    i5 = 2033053247;
                    int i27 = iM55979 ^ i5;
                    length = i3;
                    i10 = i27;
                    i9 = i4;
                    break;
                case -2009848329:
                case 1005967104:
                    i14 = 0;
                    length = interfaceC23667Arr.length;
                    i17 = 0;
                    iM55680 = C0873.m55680("۠᩶") ^ i8;
                    i4 = ((iM55680 ^ i7) * 6427) ^ 1958185723;
                    i6 = 741818851;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1955076409:
                case -1856656436:
                    i3 = length;
                    m43171(i, i2);
                    bArr2 = new byte[i2];
                    if (C1124.f82007 >= 0) {
                        iM55979 = (C0873.m55680("ܺۡ") + i8) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i7) * (-9611)) ^ 1981584808;
                        i5 = -2127966705;
                    } else {
                        iM55979 = C0946.m55979("֨ܽ") ^ i8;
                        i4 = ((iM55979 ^ i7) * (-5551)) ^ (-359394368);
                        i5 = -1275461037;
                    }
                    int i28 = iM55979 ^ i5;
                    length = i3;
                    i10 = i28;
                    i9 = i4;
                    break;
                case -1898443503:
                case 28273317:
                    j = jArr[i11];
                    i21 = i22;
                    iM55680 = (i8 - C0946.m55979("᩶ۙ")) * 25;
                    i4 = ((iM55680 ^ i7) * (-7485)) ^ 371152224;
                    i6 = -129811406;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1830827698:
                case 1225066953:
                    i3 = length;
                    interfaceC23667Arr = this.f56678;
                    if (C0890.m55740()) {
                        iM55979 = C0946.m55979("ܽۤ") ^ i8;
                        i4 = ((iM55979 ^ i7) * 15451) ^ 1391058314;
                        i5 = 1512046058;
                    } else {
                        iM55979 = (C0873.m55680("ܺۡ") + i8) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i7) * (-9611)) ^ 1981584808;
                        i5 = -2127966705;
                    }
                    int i29 = iM55979 ^ i5;
                    length = i3;
                    i10 = i29;
                    i9 = i4;
                    break;
                case -1736477930:
                case 1167861658:
                    if (i15 < i12) {
                        iM55680 = (i8 - C0946.m55979("᩷ᩴ")) * 123;
                        i4 = ((iM55680 ^ i7) * 21873) ^ (-1113817558);
                        i6 = -1917740644;
                    } else {
                        iM55680 = C0946.m55979("֡ۡ") ^ i7;
                        i4 = ((iM55680 ^ i8) * (-31555)) ^ 136361695;
                        i6 = -378843411;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1700108786:
                case 1002832584:
                    return null;
                case -1676320691:
                case -1115349796:
                    i11++;
                    i22 = i21;
                    iM55680 = C0873.m55680("ܶۛ") ^ i7;
                    i4 = ((iM55680 ^ i8) * 2837) ^ 1319153611;
                    i6 = -1958084474;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1652537082:
                case -568439034:
                    i3 = length;
                    i12 = i18 >>> i19;
                    jArr = new long[i12];
                    i13 = i + i2;
                    if (C1024.f81946) {
                        iM55979 = (C0946.m55979("۠᩷") + i7) * (-119);
                        i4 = ((iM55979 ^ i8) * (-2347)) ^ (-444278800);
                        i5 = 2033053247;
                    } else {
                        iM55979 = (C0946.m55979("ۜ᩻") ^ i7) * (-95);
                        i4 = ((iM55979 ^ i8) * (-22523)) ^ 28629148;
                        i5 = 147889659;
                    }
                    int i210 = iM55979 ^ i5;
                    length = i3;
                    i10 = i210;
                    i9 = i4;
                    break;
                case -1474668266:
                case 760780187:
                    C1964.m56597();
                    if (C0912.f81867 <= 0) {
                        i3 = length;
                        iM55979 = (C0873.m55680("ܺۡ") + i8) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i7) * (-9611)) ^ 1981584808;
                        i5 = -2127966705;
                        int i211 = iM55979 ^ i5;
                        length = i3;
                        i10 = i211;
                        i9 = i4;
                    }
                    iM55680 = C0873.m55680("ܺܰ") ^ i7;
                    i4 = ((iM55680 ^ i8) * (-10937)) ^ 1883017011;
                    i6 = -900510296;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1443383635:
                case -806130026:
                    i3 = length;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (C0873.m55680("ܺۡ") + i8) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i7) * (-9611)) ^ 1981584808;
                        i5 = -2127966705;
                    } else {
                        iM55979 = (C0873.m55680("ۜ֨") + i7) * 79;
                        i4 = ((iM55979 ^ i8) * 2579) ^ (-750682831);
                        i5 = -1584160149;
                    }
                    int i212 = iM55979 ^ i5;
                    length = i3;
                    i10 = i212;
                    i9 = i4;
                    break;
                case -1414211818:
                case 212481436:
                    interfaceC23667Arr[i14].mo34202(bArr2, i, i13, jArr);
                    i14++;
                    iM55680 = C0873.m55680("۠᩶") ^ i8;
                    i4 = ((iM55680 ^ i7) * 6427) ^ 1958185723;
                    i6 = 741818851;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1376523906:
                case 198999555:
                    bArr[i21] = bArr2[i20];
                    i23 = i21 + i24;
                    iM55680 = (i8 - C0873.m55680("ܰۤ")) * 53;
                    i4 = ((iM55680 ^ i7) * (-21413)) ^ (-518390869);
                    i6 = 1295017233;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -1274568710:
                case 1054108531:
                    C1003.m56123();
                    break;
                case -929804053:
                case 176710776:
                    bArr = new byte[i16];
                    iArr = new int[i16];
                    i11 = i17;
                    i22 = 0;
                    iM55680 = C0873.m55680("ܶۛ") ^ i7;
                    i4 = ((iM55680 ^ i8) * 2837) ^ 1319153611;
                    i6 = -1958084474;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -918172371:
                case 2011067208:
                    if (j != 0) {
                        iM55680 = C0946.m55979("֨۬") ^ i7;
                        i4 = ((iM55680 ^ i8) * 19623) ^ 616791270;
                        i6 = 657561437;
                    } else {
                        iM55680 = C0873.m55680("ۗ۫") ^ i7;
                        i4 = ((iM55680 ^ i8) * (-5139)) ^ 1971551285;
                        i6 = 1754430292;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -897694516:
                case 2144151310:
                    if (i11 < i12) {
                        iM55680 = C0873.m55680("ۗ᩵") ^ i7;
                        i4 = ((iM55680 ^ i8) * (-10569)) ^ 1159326182;
                        i6 = -181910218;
                    } else {
                        iM55680 = (i8 - C0873.m55680("۫۬")) * 39;
                        i4 = ((iM55680 ^ i7) * 12857) ^ (-395696363);
                        i6 = -927283528;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -838520122:
                case 220434795:
                    i3 = length;
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0946.m55979("۠᩷") + i7) * (-119);
                        i4 = ((iM55979 ^ i8) * (-2347)) ^ (-444278800);
                        i5 = 2033053247;
                    } else {
                        iM55979 = C0873.m55680("ۘ۫") ^ i8;
                        i4 = ((iM55979 ^ i7) * (-23723)) ^ (-801402956);
                        i5 = -937582573;
                    }
                    int i213 = iM55979 ^ i5;
                    length = i3;
                    i10 = i213;
                    i9 = i4;
                    break;
                case -828187277:
                case 1629015394:
                    i15++;
                    i16 = iBitCount;
                    iM55680 = C0873.m55680("᩺᩺") ^ i7;
                    i4 = ((iM55680 ^ i8) * 425) ^ (-907120756);
                    i6 = 1828453819;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -770672277:
                case -517102130:
                    i3 = length;
                    i18 = i2 + 63;
                    i19 = 6;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0946.m55979("֨ۙ") ^ i8;
                        i4 = ((iM55979 ^ i7) * (-24801)) ^ (-1900510015);
                        i5 = 668031702;
                    } else {
                        iM55979 = C0873.m55680("ۧۛ") ^ i7;
                        i4 = ((iM55979 ^ i8) * (-31183)) ^ 117465684;
                        i5 = 1762087999;
                    }
                    int i214 = iM55979 ^ i5;
                    length = i3;
                    i10 = i214;
                    i9 = i4;
                    break;
                case -742989580:
                case -88599410:
                    int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + (i11 << 6);
                    if (iNumberOfTrailingZeros < i2) {
                        int iM559711 = C0946.m55979("᩻ۛ") ^ i8;
                        i20 = iNumberOfTrailingZeros;
                        i9 = ((iM559711 ^ i7) * 31507) ^ 67684343;
                        i10 = iM559711 ^ (-356244190);
                    } else {
                        i20 = iNumberOfTrailingZeros;
                        i23 = i21;
                        iM55680 = (i8 - C0873.m55680("ܰۤ")) * 53;
                        i4 = ((iM55680 ^ i7) * (-21413)) ^ (-518390869);
                        i6 = 1295017233;
                        i10 = iM55680 ^ i6;
                        i9 = i4;
                    }
                    break;
                case -675571716:
                case 1708153475:
                    i3 = length;
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("۠᩷") + i7) * (-119);
                        i4 = ((iM55979 ^ i8) * (-2347)) ^ (-444278800);
                        i5 = 2033053247;
                    } else {
                        iM55979 = C0873.m55680("ܶۙ") ^ i8;
                        i4 = ((iM55979 ^ i7) * (-9825)) ^ 180050870;
                        i5 = -358757111;
                    }
                    int i215 = iM55979 ^ i5;
                    length = i3;
                    i10 = i215;
                    i9 = i4;
                    break;
                case -598882537:
                case 140338076:
                    j &= j - 1;
                    i21 = i23;
                    iM55680 = (i8 - C0946.m55979("᩶ۙ")) * 25;
                    i4 = ((iM55680 ^ i7) * (-7485)) ^ 371152224;
                    i6 = -129811406;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case -30664093:
                case 908080804:
                    C0854.m55595();
                    C0861.m55626();
                    return null;
                case 95468744:
                case 572087596:
                    return m43167(bArr, this.f56677, iArr);
                case 366477278:
                case 1363075659:
                    break;
                case 466458683:
                case 1174423641:
                    i15 = 0;
                    i16 = 0;
                    iM55680 = C0873.m55680("᩺᩺") ^ i7;
                    i4 = ((iM55680 ^ i8) * 425) ^ (-907120756);
                    i6 = 1828453819;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case 502020704:
                case 966434847:
                    if (i16 == 0) {
                        iM55680 = C0873.m55680("ܽ᩻") ^ i8;
                        i4 = ((iM55680 ^ i7) * 15281) ^ 162630136;
                        i6 = 1512846779;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ᩴۧ")) * (-107);
                        i4 = ((iM55680 ^ i7) * 22429) ^ (-1297118784);
                        i6 = -593363799;
                    }
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
                case 1153172657:
                case 1306354648:
                    int i30 = length;
                    if (i14 < i30) {
                        int iM55681 = (C0873.m55680("ᩴ֫") + i8) * 23;
                        i9 = ((iM55681 ^ i7) * 22525) ^ (-1777631929);
                        length = i30;
                        i10 = iM55681 ^ (-1060594592);
                    } else {
                        i3 = i30;
                        iM55979 = C0946.m55979("۠ۘ") ^ i7;
                        i4 = ((iM55979 ^ i8) * 32539) ^ 492296202;
                        i5 = -1299754420;
                        int i216 = iM55979 ^ i5;
                        length = i3;
                        i10 = i216;
                        i9 = i4;
                    }
                    break;
                case 1178280266:
                case 1277650724:
                    C1024.m56209();
                    break;
                case 1664350192:
                case 1947307415:
                    i3 = length;
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("֨ۢ") + i8) * 19;
                        i4 = ((iM55979 ^ i7) * (-32293)) ^ (-1405158158);
                        i5 = 960910176;
                    } else {
                        iM55979 = C0946.m55979("ۜܶ") ^ i7;
                        i4 = ((iM55979 ^ i8) * (-11721)) ^ (-1627585093);
                        i5 = -106656932;
                    }
                    int i217 = iM55979 ^ i5;
                    length = i3;
                    i10 = i217;
                    i9 = i4;
                    break;
                default:
                    C0898.m55800();
                    C1964.m56597();
                    iM55680 = (i7 - C0946.m55979("ۤ֫")) * 73;
                    i4 = ((iM55680 ^ i8) * 17467) ^ (-1684041442);
                    i6 = 1146871605;
                    i10 = iM55680 ^ i6;
                    i9 = i4;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    public static p067l.C19013 m43165(p067l.C19013 r41, int r42, p067l.C14279 r43, int r44, int r45, int r46, int r47, int[] r48, int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C19013.m43165(l.ܿᩳܳ, int, l.۫ܽܳ, int, int, int, int, int[], int, int):l.ܿᩳܳ");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43177(IdentityHashMap identityHashMap) {
        InterfaceC23667[] interfaceC23667Arr = null;
        int length = 0;
        int i = 0;
        InterfaceC23667 interfaceC23667 = null;
        C14279 c14279 = null;
        int i2 = -1651601643;
        int i3 = C0894.f81854;
        int i4 = C0930.f81879;
        int iM55680 = (i3 - C0873.m55680("ܳ֫")) * (-107);
        int i5 = ((iM55680 ^ i4) * 23087) ^ 1472056255;
        int i6 = 1885140063;
        while (true) {
            i2 = ((((i2 ^ i4) * 19891) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2111480856:
                case 1365827939:
                    C0930.m55885();
                    if (C0992.f81922 < 0) {
                        iM55680 = C0873.m55680("ۨ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 25271) ^ 82233700;
                        i6 = 1789246945;
                    } else {
                        iM55680 = C0946.m55979("ۨ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17059) ^ 553498596;
                        i6 = 1042537547;
                    }
                    break;
                case -2086949132:
                case 1142423828:
                    C0949.m56012();
                    RunnableC1014.m56177();
                    iM55680 = C0946.m55979("ۨ᩶") ^ i4;
                    i5 = ((iM55680 ^ i3) * 17059) ^ 553498596;
                    i6 = 1042537547;
                    break;
                case -2060815444:
                case -28534033:
                    if (i < length) {
                        iM55680 = (C0946.m55979("᩻֡") ^ i4) * 51;
                        i5 = ((iM55680 ^ i3) * 43) ^ (-1704232656);
                        i6 = -251040111;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۖ۠")) * 9;
                        i5 = ((iM55680 ^ i4) * (-309)) ^ 2099506881;
                        i6 = -422173431;
                    }
                    break;
                case -1972744350:
                case -1092265535:
                    interfaceC23667 = interfaceC23667Arr[i];
                    if (interfaceC23667 instanceof C24337) {
                        iM55680 = C0946.m55979("ۢۢ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-31381)) ^ 1162980740;
                        i6 = -456066131;
                    } else {
                        iM55680 = (C0946.m55979("֡ۧ") ^ i3) * (-109);
                        i5 = ((iM55680 ^ i4) * 8797) ^ 1939283770;
                        i6 = -2072548509;
                    }
                    break;
                case -1383612228:
                case -17543429:
                    C0877.m55700(identityHashMap, c14279, Boolean.TRUE);
                    iM55680 = (C0946.m55979("֡ۧ") ^ i3) * (-109);
                    i5 = ((iM55680 ^ i4) * 8797) ^ 1939283770;
                    i6 = -2072548509;
                    break;
                case -1352034502:
                case -801867144:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11869) ^ (-150497788);
                        i6 = -602677426;
                    } else {
                        iM55680 = C0873.m55680("ᩴۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 20089) ^ 18907714;
                        i6 = 1628965929;
                    }
                    break;
                case -1334845260:
                case 535190174:
                    break;
                case -1140299031:
                case 1937618849:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("۫ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-19061)) ^ (-1313984137);
                        i6 = 1243485173;
                    } else {
                        iM55680 = (C0873.m55680("֫ܽ") + i4) * 61;
                        i5 = ((iM55680 ^ i3) * 14677) ^ 1474948079;
                        i6 = 486437402;
                    }
                    break;
                case -1065340535:
                case 860111958:
                    if (C1024.f81946) {
                        iM55680 = C0873.m55680("ۨ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 25271) ^ 82233700;
                        i6 = 1789246945;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܰܽ")) * 71;
                        i5 = ((iM55680 ^ i4) * (-23193)) ^ (-1858542291);
                        i6 = -413561131;
                    }
                    break;
                case -898808293:
                case -51524694:
                    c14279 = ((C24337) interfaceC23667).f77099;
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0946.m55979("۫ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-19061)) ^ (-1313984137);
                        i6 = 1243485173;
                    } else {
                        iM55680 = C0873.m55680("ۨ᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * 1447) ^ (-491496644);
                        i6 = 553596231;
                    }
                    break;
                case -840289783:
                case -739150249:
                    if (C1048.m56305() >= 0) {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11869) ^ (-150497788);
                        i6 = -602677426;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ᩴۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM55680 ^ i3) * 22419) ^ (-1636135791);
                        i6 = 1299795721;
                    }
                    break;
                case -615498671:
                case 1979667874:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0946.m55979("ۜۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3263) ^ 1956145786;
                        i6 = -1143766210;
                    } else {
                        iM55680 = C0946.m55979("ۡۧ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-8855)) ^ 1036795071;
                        i6 = -45298809;
                    }
                    break;
                case -329043038:
                case 885985013:
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("ۨ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 25271) ^ 82233700;
                        i6 = 1789246945;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۜ") + i4) * (-17);
                        i5 = ((iM55680 ^ i3) * 15917) ^ (-398413777);
                        i6 = -697187697;
                    }
                    break;
                case -215322548:
                case 2032448903:
                    if (C1964.m56597() != 0) {
                        iM55680 = C0946.m55979("ۜۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3263) ^ 1956145786;
                        i6 = -1143766210;
                    } else {
                        iM55680 = C0946.m55979("ܰۨ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 13433) ^ 1239427623;
                        i6 = -33204368;
                    }
                    break;
                case 110776836:
                case 278809907:
                    C0946.m55980();
                    C1048.m56305();
                    break;
                case 235037512:
                case 1068866898:
                    interfaceC23667Arr = this.f56678;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("۫ܺ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-19061)) ^ (-1313984137);
                        i6 = 1243485173;
                    } else {
                        iM55680 = C0873.m55680("ᩳۗ") ^ i3;
                        i5 = ((iM55680 ^ i4) * (-85)) ^ (-58160728);
                        i6 = -688598879;
                    }
                    break;
                case 706208715:
                case 1688448940:
                    if (C0946.f81894 != 0) {
                        iM55680 = C0946.m55979("ۜۧ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3263) ^ 1956145786;
                        i6 = -1143766210;
                    } else {
                        iM55680 = C0873.m55680("ۨ۫") ^ i4;
                        i5 = ((iM55680 ^ i3) * 25271) ^ 82233700;
                        i6 = 1789246945;
                    }
                    break;
                case 917200348:
                case 927811658:
                    if (C1229.f82066 < 0) {
                        iM55680 = C0946.m55979("᩷ۛ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11869) ^ (-150497788);
                        i6 = -602677426;
                    } else {
                        iM55680 = C0946.m55979("ۨ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17059) ^ 553498596;
                        i6 = 1042537547;
                    }
                    break;
                case 1188649243:
                case 1206543102:
                    i++;
                    iM55680 = C0946.m55979("֫᩺") ^ i4;
                    i5 = ((iM55680 ^ i3) * 5759) ^ 1198661651;
                    i6 = -1416112011;
                    break;
                case 1342362549:
                case 1485125874:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۨ᩶") ^ i4;
                        i5 = ((iM55680 ^ i3) * 17059) ^ 553498596;
                        i6 = 1042537547;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ۚۙ")) * 97;
                        i5 = ((iM55680 ^ i4) * 3163) ^ (-193027009);
                        i6 = 1762429350;
                    }
                    break;
                default:
                    length = interfaceC23667Arr.length;
                    i = 0;
                    iM55680 = C0946.m55979("֫᩺") ^ i4;
                    i5 = ((iM55680 ^ i3) * 5759) ^ 1198661651;
                    i6 = -1416112011;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0409 A[PHI: r4
      0x0409: PHI (r4v84 short) = (r4v6 short), (r4v9 short), (r4v11 short), (r4v85 short) binds: [B:101:0x0407, B:89:0x039c, B:81:0x0360, B:20:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x043b A[PHI: r4 r18
      0x043b: PHI (r4v92 short) = (r4v5 short), (r4v10 short), (r4v12 short), (r4v94 short) binds: [B:105:0x0439, B:85:0x037e, B:71:0x030b, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x043b: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:105:0x0439, B:85:0x037e, B:71:0x030b, B:13:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0271 A[PHI: r5 r6 r7
      0x0271: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int), (r5v2 int) binds: [B:59:0x026f, B:19:0x009c, B:15:0x007b, B:7:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r6v4 l.᩹ܽܳ[]) = (r6v3 l.᩹ܽܳ[]), (r6v2 l.᩹ܽܳ[]), (r6v2 l.᩹ܽܳ[]), (r6v2 l.᩹ܽܳ[]) binds: [B:59:0x026f, B:19:0x009c, B:15:0x007b, B:7:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r7v4 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:59:0x026f, B:19:0x009c, B:15:0x007b, B:7:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x03d8 A[PHI: r4
      0x03d8: PHI (r4v98 short) = (r4v7 short), (r4v8 short), (r4v100 short) binds: [B:97:0x03d6, B:93:0x03b9, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        if (p067l.C1229.f82066 < 0) goto L20;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43176(DataOutputStream dataOutputStream, int i, int i2, IdentityHashMap identityHashMap) {
        short s;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int iM55680;
        int i6;
        C19013 c19013 = this;
        int i7 = C0873.f81841;
        int i8 = AbstractC0942.f81890;
        int iM559711 = C0946.m55979("֨ۚ") ^ i8;
        int i9 = ((iM559711 ^ i7) * 3723) ^ 1148686609;
        InterfaceC23667[] interfaceC23667Arr = null;
        Integer num = null;
        int i10 = iM559711 ^ 669045643;
        int i11 = 0;
        int length = 0;
        int i12 = 0;
        int i13 = 0;
        int length2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1404353478;
        short s2 = 0;
        C24337 c24337 = null;
        InterfaceC23667 interfaceC23667 = null;
        int i19 = 0;
        while (true) {
            i18 = i10 ^ (i9 & (((i18 ^ i7) * 19895) >> 31));
            switch (i18) {
                case -1926298485:
                case -50368102:
                    C1003.m56120(dataOutputStream, i13);
                    length2 = interfaceC23667Arr.length;
                    i14 = i15;
                    iM559710 = C0873.m55680("᩸֨") ^ i8;
                    i3 = ((iM559710 ^ i7) * 2445) ^ (-1624019742);
                    i5 = -1775508481;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1863519580:
                case 243935140:
                    s2 = f82286[609];
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0946.m55979("۫ۧ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-2499)) ^ (-1518223329);
                        i6 = -447767476;
                    } else {
                        iM55680 = C0873.m55680("ۛܰ") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-3021)) ^ 8417034;
                        i6 = 675746482;
                    }
                    i10 = iM55680 ^ i6;
                    c19013 = this;
                    break;
                case -1708203141:
                case 260522570:
                    dataOutputStream.writeByte(2);
                    c24337.m53698(dataOutputStream, i, i11, C0863.m55631(num));
                    iM559710 = (C0946.m55979("᩺ۗ") + i8) * (-95);
                    i3 = ((iM559710 ^ i7) * (-29027)) ^ (-730236366);
                    i5 = -1610554252;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1690266565:
                case 964949085:
                    dataOutputStream.writeByte(1);
                    ((C14949) interfaceC23667).m34201(dataOutputStream, i, i11);
                    iM559710 = (C0946.m55979("᩺ۗ") + i8) * (-95);
                    i3 = ((iM559710 ^ i7) * (-29027)) ^ (-730236366);
                    i5 = -1610554252;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1555109307:
                case -1219465026:
                    RunnableC0938.m55938();
                    if (C1017.f81942 < 0) {
                        s = s2;
                        iM55979 = C0946.m55979("ܰۘ") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-29983)) ^ 1898920216;
                        i4 = 1021048781;
                        i10 = iM55979 ^ i4;
                        c19013 = this;
                        s2 = s;
                        i9 = i3;
                    }
                    iM559710 = (i8 - C0873.m55680("ۗۜ")) * (-123);
                    i3 = ((iM559710 ^ i7) * (-29971)) ^ 324391181;
                    i5 = 1633048592;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1353108320:
                case 422190236:
                    i12 = 0;
                    i13 = 0;
                    i15 = 0;
                    iM559710 = (C0873.m55680("ۚ֡") ^ i8) * (-125);
                    i3 = ((iM559710 ^ i7) * 9093) ^ (-1955809616);
                    i5 = 1588243978;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1331444709:
                case 1025531910:
                    C0912.m55833();
                    break;
                case -1278362867:
                case -1262911988:
                    C1025.m56230();
                    C0949.m56012();
                    return;
                case -1276785005:
                case -1064092167:
                    if (C1044.f81959 >= 0) {
                        s = s2;
                        iM55979 = C0873.m55680("ܺۤ") ^ i7;
                        i3 = ((iM55979 ^ i8) * (-2655)) ^ 1827980404;
                        i4 = -304056046;
                        i10 = iM55979 ^ i4;
                        c19013 = this;
                        s2 = s;
                        i9 = i3;
                    }
                    iM559710 = C0946.m55979("۫ܳ") ^ i7;
                    i3 = ((iM559710 ^ i8) * (-9431)) ^ 689298656;
                    i5 = 424997445;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1237634090:
                case 1172322429:
                    s = s2;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (C0873.m55680("᩻۠") + i8) * 15;
                        i3 = ((iM55979 ^ i7) * 2655) ^ 1603375555;
                        i4 = -1478274507;
                    } else {
                        iM55979 = C0946.m55979("᩹ᩳ") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-19417)) ^ 1361476506;
                        i4 = -1497603161;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -1172455996:
                case -260140922:
                    if (i12 < length) {
                        iM559710 = (i8 - C0873.m55680("ۧ֨")) * (-51);
                        i3 = ((iM559710 ^ i7) * 6527) ^ 231749640;
                        i5 = -484026713;
                    } else {
                        iM559710 = (C0946.m55979("ۨۙ") + i7) * C0254q.f1218h;
                        i3 = ((iM559710 ^ i8) * 22489) ^ 784856713;
                        i5 = -1271937215;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -1065200052:
                case -778530977:
                    if (i14 < length2) {
                        iM559710 = C0946.m55979("ܿۚ") ^ i8;
                        i3 = ((iM559710 ^ i7) * 11161) ^ (-410825956);
                        i5 = 1507928060;
                    } else {
                        iM559710 = (i7 - C0946.m55979("ܺ֡")) * 21;
                        i3 = ((iM559710 ^ i8) * 6227) ^ 1003491438;
                        i5 = -1380101773;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -907058242:
                case -902383565:
                    i19 = 51255;
                    iM559710 = C0946.m55979("ۙ۬") ^ i8;
                    i3 = ((iM559710 ^ i7) * (-21627)) ^ (-424721203);
                    i5 = -1236545860;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -573727880:
                case -380321778:
                    return;
                case -522085876:
                case 1865688591:
                    c19013.m43171(i, i2);
                    i11 = i2 + i;
                    interfaceC23667Arr = c19013.f56678;
                    length = interfaceC23667Arr.length;
                    if (C0992.f81922 >= 0) {
                        iM559710 = C0946.m55979("۫ܳ") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-9431)) ^ 689298656;
                        i5 = 424997445;
                    } else {
                        iM559710 = (C0946.m55979("ܿۜ") ^ i7) * (-39);
                        i3 = ((iM559710 ^ i8) * 26257) ^ (-918466372);
                        i5 = 906273695;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -351631494:
                case 49855054:
                    throw new IOException(C0854.m55597(f82286, 610, 35, i19));
                case -279834474:
                case 797043448:
                    s = s2;
                    if (C1929.f83011 != 0) {
                        iM55979 = C0946.m55979("ܰۘ") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-29983)) ^ 1898920216;
                        i4 = 1021048781;
                    } else {
                        iM55979 = C0873.m55680("᩷᩷") ^ i8;
                        i3 = ((iM55979 ^ i7) * 16019) ^ 1751789167;
                        i4 = 234350834;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -267017410:
                case -57422243:
                    s = s2;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ܺۤ") ^ i7;
                        i3 = ((iM55979 ^ i8) * (-2655)) ^ 1827980404;
                        i4 = -304056046;
                    } else {
                        iM55979 = C0946.m55979("ᩳۙ") ^ i8;
                        i3 = ((iM55979 ^ i7) * 13625) ^ 2122394464;
                        i4 = -1601662790;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -237083507:
                case 1804138367:
                    if (interfaceC23667 instanceof C14949) {
                        iM559710 = (C0946.m55979("֡ܰ") ^ i8) * (-115);
                        i3 = ((iM559710 ^ i7) * (-27503)) ^ (-207556996);
                        i5 = 671361633;
                    } else {
                        iM559710 = (i7 - C0946.m55979("᩵۠")) * (-15);
                        i3 = ((iM559710 ^ i8) * (-28923)) ^ 452289507;
                        i5 = -70988162;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -165599745:
                case 2045224756:
                    s = s2;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0873.m55680("ܺۤ") ^ i7;
                        i3 = ((iM55979 ^ i8) * (-2655)) ^ 1827980404;
                        i4 = -304056046;
                    } else {
                        iM55979 = C0873.m55680("۬ۤ") ^ i7;
                        i3 = ((iM55979 ^ i8) * (-30623)) ^ 1680243367;
                        i4 = 1428679433;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case -111472514:
                case 281546837:
                    i19 = 64026;
                    iM559710 = C0946.m55979("ۙ۬") ^ i8;
                    i3 = ((iM559710 ^ i7) * (-21627)) ^ (-424721203);
                    i5 = -1236545860;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case -78959217:
                case 651828222:
                    i12++;
                    i13 = i17;
                    iM559710 = (C0873.m55680("ۚ֡") ^ i8) * (-125);
                    i3 = ((iM559710 ^ i7) * 9093) ^ (-1955809616);
                    i5 = 1588243978;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case 256593668:
                case 1482690198:
                    interfaceC23667 = interfaceC23667Arr[i14];
                    if (interfaceC23667.mo34203(i, i11)) {
                        iM559710 = (C0946.m55979("ܰ᩹") ^ i7) * 63;
                        i3 = ((iM559710 ^ i8) * (-2791)) ^ 1393713936;
                        i5 = 987601614;
                    } else {
                        iM559710 = (C0946.m55979("᩺ۗ") + i8) * (-95);
                        i3 = ((iM559710 ^ i7) * (-29027)) ^ (-730236366);
                        i5 = -1610554252;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case 261609783:
                case 1719725837:
                    s = s2;
                    if (C0873.f81841 <= 0) {
                        iM55979 = (C0873.m55680("᩻۠") + i8) * 15;
                        i3 = ((iM55979 ^ i7) * 2655) ^ 1603375555;
                        i4 = -1478274507;
                    } else {
                        iM55979 = C0946.m55979("ۗۡ") ^ i7;
                        i3 = ((iM55979 ^ i8) * (-27725)) ^ (-709242445);
                        i4 = -1243470534;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 485576984:
                case 1770114397:
                    s = s2;
                    int i20 = s + 5297;
                    if ((i20 * i20) - i16 > 0) {
                        iM55979 = C0873.m55680("ۚ֫") ^ i7;
                        i3 = ((iM55979 ^ i8) * 25099) ^ (-1015876463);
                        i4 = -1822468375;
                        i10 = iM55979 ^ i4;
                        c19013 = this;
                        s2 = s;
                        i9 = i3;
                    } else {
                        int iM559712 = (C0946.m55979("۫ۤ") + i7) * (-125);
                        i10 = iM559712 ^ (-1478031864);
                        s2 = s;
                        i9 = ((iM559712 ^ i8) * (-2543)) ^ 676301717;
                        c19013 = this;
                    }
                    break;
                case 942255678:
                case 1410776821:
                    c24337 = (C24337) interfaceC23667;
                    num = (Integer) identityHashMap.get(c24337.f77099);
                    if (num != null) {
                        iM559710 = (C0946.m55979("ᩴ᩶") ^ i7) * 35;
                        i3 = ((iM559710 ^ i8) * (-21343)) ^ 1714861726;
                        i5 = -56492361;
                    } else {
                        iM559710 = (C0873.m55680("ۗۛ") + i7) * 89;
                        i3 = ((iM559710 ^ i8) * 4199) ^ 1972803131;
                        i5 = 1824903136;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case 949383873:
                case 1532897681:
                    s = s2;
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("᩻۠") + i8) * 15;
                        i3 = ((iM55979 ^ i7) * 2655) ^ 1603375555;
                        i4 = -1478274507;
                    } else {
                        iM55979 = C0873.m55680("ᩳ۫") ^ i8;
                        i3 = ((iM55979 ^ i7) * 8251) ^ 1803399599;
                        i4 = -968538113;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 1063862582:
                case 1900735034:
                    s = s2;
                    if (C0861.f81831) {
                        iM55979 = (C0946.m55979("ۡۖ") ^ i7) * (-111);
                        i3 = ((iM55979 ^ i8) * (-32229)) ^ (-1084484053);
                        i4 = -394688642;
                    } else {
                        iM55979 = C0946.m55979("ܰۘ") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-29983)) ^ 1898920216;
                        i4 = 1021048781;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 1139065003:
                case 2014742846:
                    C1229.m56410();
                    s = s2;
                    iM55979 = (C0873.m55680("᩻۠") + i8) * 15;
                    i3 = ((iM55979 ^ i7) * 2655) ^ 1603375555;
                    i4 = -1478274507;
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 1410249745:
                case 1595375453:
                    if (interfaceC23667Arr[i12].mo34203(i, i11)) {
                        iM559710 = C0946.m55979("۫ۜ") ^ i8;
                        i3 = ((iM559710 ^ i7) * 1231) ^ 856243415;
                        i5 = -772234496;
                    } else {
                        i17 = i13;
                        iM559710 = (i7 - C0873.m55680("ۖۧ")) * 19;
                        i3 = ((iM559710 ^ i8) * 7201) ^ (-943425827);
                        i5 = 1079683360;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case 1526554139:
                case 1928799809:
                    s = s2;
                    int i21 = (s * s) + 28058209;
                    i16 = i21 + i21;
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0946.m55979("ܰۘ") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-29983)) ^ 1898920216;
                        i4 = 1021048781;
                    } else {
                        iM55979 = C0873.m55680("᩵᩶") ^ i8;
                        i3 = ((iM55979 ^ i7) * (-32141)) ^ R.id.MT_Protector;
                        i4 = 1247318074;
                    }
                    i10 = iM55979 ^ i4;
                    c19013 = this;
                    s2 = s;
                    i9 = i3;
                    break;
                case 1785830886:
                case 1922146867:
                    if (C0930.m55885() <= 0) {
                        iM559710 = C0946.m55979("۫ܳ") ^ i7;
                        i3 = ((iM559710 ^ i8) * (-9431)) ^ 689298656;
                        i5 = 424997445;
                    } else {
                        iM559710 = (i8 - C0873.m55680("ۗۜ")) * (-123);
                        i3 = ((iM559710 ^ i7) * (-29971)) ^ 324391181;
                        i5 = 1633048592;
                    }
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                case 1824293864:
                case 1971419988:
                    i14++;
                    iM559710 = C0873.m55680("᩸֨") ^ i8;
                    i3 = ((iM559710 ^ i7) * 2445) ^ (-1624019742);
                    i5 = -1775508481;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
                default:
                    i17 = i13 + 1;
                    iM559710 = (i7 - C0873.m55680("ۖۧ")) * 19;
                    i3 = ((iM559710 ^ i8) * 7201) ^ (-943425827);
                    i5 = 1079683360;
                    i10 = iM559710 ^ i5;
                    i9 = i3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0126 A[PHI: r16
      0x0126: PHI (r16v4 int) = (r16v3 int), (r16v2 int), (r16v2 int) binds: [B:38:0x0124, B:29:0x00d0, B:101:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ac A[PHI: r8 r9 r10
      0x01ac: PHI (r8v3 int) = (r8v2 int), (r8v5 int) binds: [B:50:0x0192, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r9v3 int) = (r9v2 int), (r9v5 int) binds: [B:50:0x0192, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:50:0x0192, B:6:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static void m43168(int i, int i2, long[] jArr) {
        int iM55680;
        int i3;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        int i8 = -281481033;
        int i9 = C0873.f81841;
        int i10 = C1046.f81962;
        int iM55682 = C0873.m55680("۫ܶ") ^ i10;
        int i11 = ((iM55682 ^ i9) * 30807) ^ (-1934855635);
        int i12 = iM55682 ^ (-399931073);
        long j = 0;
        long j2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j3 = 0;
        int i22 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 10505) >> 31));
            switch (i8) {
                case -2057486992:
                case 1320468184:
                    C1028.m56247();
                    int iM55979 = (C0946.m55979("ۘ۬") ^ i9) * (-59);
                    i11 = ((iM55979 ^ i10) * 13221) ^ 1276275703;
                    i13 = i13;
                    i12 = iM55979 ^ 1441094835;
                    break;
                case -1785736577:
                case -340959178:
                    i22 = i & i18;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i10 - C0873.m55680("۬ۙ")) * (-35);
                        i3 = ((iM55680 ^ i9) * (-21)) ^ 1020858740;
                        i4 = -246308436;
                    } else {
                        iM55680 = (i10 - C0946.m55979("᩹᩵")) * (-73);
                        i3 = ((iM55680 ^ i9) * (-11801)) ^ 705210755;
                        i4 = 1593181706;
                    }
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    break;
                case -1736908973:
                case 359483023:
                    i19 = 63;
                    if (!C0927.f81875) {
                        iM55680 = C0946.m55979("ۙܳ") ^ i9;
                        i3 = ((iM55680 ^ i10) * (-8177)) ^ 967341470;
                        i4 = 5383025;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                    } else {
                        int iM559710 = (C0946.m55979("ۘ۬") ^ i9) * (-59);
                        i11 = ((iM559710 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = iM559710 ^ 1441094835;
                    }
                    break;
                case -1148506813:
                case 1527443768:
                    if (!C0947.m55997()) {
                        int iM559711 = (C0946.m55979("ۘ۬") ^ i9) * (-59);
                        i11 = ((iM559711 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = iM559711 ^ 1441094835;
                    } else {
                        iM55680 = C0946.m55979("ۜܰ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-27871)) ^ (-1704620426);
                        i4 = 544219571;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                    }
                    break;
                case -1092563405:
                case 1987468600:
                    i5 = i13;
                    if (i >= i2) {
                        iM55681 = C0946.m55979("᩹ۚ") ^ i10;
                        i6 = ((iM55681 ^ i9) * 1635) ^ 249144242;
                        i7 = 301712211;
                    } else {
                        iM55681 = C0873.m55680("ܺ᩵") ^ i10;
                        i6 = ((iM55681 ^ i9) * 9125) ^ 1196926269;
                        i7 = -1528721923;
                    }
                    i11 = i6;
                    int i23 = i5;
                    i12 = iM55681 ^ i7;
                    i13 = i23;
                    break;
                case -1013529719:
                case 528642903:
                    j3 = -1;
                    j = (-1) << i22;
                    if (C0967.f81910 < 0) {
                        iM55680 = C0873.m55680("ۗ֡") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-16361)) ^ 1053696865;
                        i4 = 1134822786;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                    } else {
                        i5 = i13;
                        iM55681 = (C0946.m55979("֡᩸") ^ i10) * 55;
                        i6 = ((iM55681 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                        i11 = i6;
                        int i24 = i5;
                        i12 = iM55681 ^ i7;
                        i13 = i24;
                    }
                    break;
                case -840989994:
                case -740327234:
                    ServiceConnectionC1013.m56157();
                    if (C0877.f81843 < 0) {
                        iM55680 = (C0873.m55680("ۘۛ") ^ i9) * 47;
                        i3 = ((iM55680 ^ i10) * 23495) ^ (-802552017);
                        i4 = 500348392;
                        i12 = iM55680 ^ i4;
                        i11 = i3;
                    } else {
                        i5 = i13;
                        iM55681 = (C0946.m55979("֡᩸") ^ i10) * 55;
                        i6 = ((iM55681 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                        i11 = i6;
                        int i25 = i5;
                        i12 = iM55681 ^ i7;
                        i13 = i25;
                    }
                    break;
                case -712548738:
                case 929366830:
                    jArr[i14] = jArr[i14] | (j2 & j);
                    break;
                case -550666272:
                case 1947938964:
                    i13 = i14 + 1;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0873.m55680("ۘۛ") ^ i9) * 47;
                        i3 = ((iM55680 ^ i10) * 23495) ^ (-802552017);
                        i4 = 500348392;
                    } else {
                        iM55680 = (C0946.m55979("᩵ۜ") ^ i10) * 23;
                        i3 = ((iM55680 ^ i9) * 1237) ^ (-1463892092);
                        i4 = -564388580;
                    }
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    break;
                case -435701306:
                case 1524766541:
                    i20 = i15 & i19;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0946.m55979("ۜܰ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-27871)) ^ (-1704620426);
                        i4 = 544219571;
                    } else {
                        iM55680 = C0873.m55680("ܰ۠") ^ i9;
                        i3 = ((iM55680 ^ i10) * (-21715)) ^ (-1719695639);
                        i4 = 176914815;
                    }
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    break;
                case -232198879:
                case 495244382:
                    i5 = i13;
                    i14 = i >>> 6;
                    if (C1229.f82066 >= 0) {
                        iM55681 = (C0946.m55979("֡᩸") ^ i10) * 55;
                        i6 = ((iM55681 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                    } else {
                        iM55681 = C0946.m55979("᩺֨") ^ i9;
                        i6 = ((iM55681 ^ i10) * (-4703)) ^ (-1687975995);
                        i7 = 299365483;
                    }
                    i11 = i6;
                    int i26 = i5;
                    i12 = iM55681 ^ i7;
                    i13 = i26;
                    break;
                case -150817178:
                case 308844668:
                    Arrays.fill(jArr, i13, i17, j3);
                    jArr[i17] = j2 | jArr[i17];
                    break;
                case -120959257:
                case 1194418805:
                    break;
                case 306331692:
                case 1738641639:
                    i15 = i2 + i21;
                    if (C0946.m55980() != 0) {
                        i16 = 6;
                        int iM559712 = (C0946.m55979("ۘ۬") ^ i9) * (-59);
                        i11 = ((iM559712 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = iM559712 ^ 1441094835;
                    } else {
                        int iM55683 = (C0873.m55680("ۛۙ") ^ i10) * (-67);
                        i12 = iM55683 ^ 1556410769;
                        i11 = ((iM55683 ^ i9) * (-31717)) ^ (-1376086246);
                        i16 = 6;
                    }
                    break;
                case 352570729:
                case 1264853315:
                    i21 = -1;
                    if (C0890.f81849 == 0) {
                        i5 = i13;
                        iM55681 = C0946.m55979("᩸ᩴ") ^ i9;
                        i6 = ((iM55681 ^ i10) * (-1031)) ^ (-900186370);
                        i7 = 1024602461;
                        i11 = i6;
                        int i27 = i5;
                        i12 = iM55681 ^ i7;
                        i13 = i27;
                    } else {
                        int iM559713 = (C0946.m55979("ۘ۬") ^ i9) * (-59);
                        i11 = ((iM559713 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = iM559713 ^ 1441094835;
                    }
                    break;
                case 490173533:
                case 1346079625:
                    j2 = j3 >>> (63 - i20);
                    if (i14 == i17) {
                        iM55680 = C0873.m55680("۫ۨ") ^ i9;
                        i3 = ((iM55680 ^ i10) * (-4895)) ^ (-1755529108);
                        i4 = -1892193179;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩻") ^ i9) * (-77);
                        i3 = ((iM55680 ^ i10) * (-11457)) ^ 365065765;
                        i4 = -3435529;
                    }
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    break;
                case 543034723:
                case 1991860416:
                    C1964.m56597();
                    if (RunnableC0871.f81839 < 0) {
                        i5 = i13;
                        iM55681 = (C0946.m55979("֡᩸") ^ i10) * 55;
                        i6 = ((iM55681 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                        i11 = i6;
                        int i28 = i5;
                        i12 = iM55681 ^ i7;
                        i13 = i28;
                    } else {
                        int iM559714 = (C0946.m55979("ۘ۬") ^ i9) * (-59);
                        i11 = ((iM559714 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = iM559714 ^ 1441094835;
                    }
                    break;
                case 1187267546:
                case 1974738953:
                    jArr[i14] = j | jArr[i14];
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("ۜܰ") ^ i10;
                        i3 = ((iM55680 ^ i9) * (-27871)) ^ (-1704620426);
                        i4 = 544219571;
                    } else {
                        iM55680 = (C0873.m55680("᩻᩷") + i10) * 25;
                        i3 = ((iM55680 ^ i9) * 13131) ^ (-1074696517);
                        i4 = -1523604053;
                    }
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    break;
                case 1283894697:
                case 1289408911:
                    C1028.m56247();
                    break;
                default:
                    i17 = i15 >>> i16;
                    i18 = 63;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i10 - C0873.m55680("۬ۙ")) * (-35);
                        i3 = ((iM55680 ^ i9) * (-21)) ^ 1020858740;
                        i4 = -246308436;
                    } else {
                        iM55680 = (C0873.m55680("֨ᩴ") ^ i9) * 89;
                        i3 = ((iM55680 ^ i10) * 22659) ^ (-704375074);
                        i4 = 313702277;
                    }
                    i12 = iM55680 ^ i4;
                    i11 = i3;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43175(int i, byte[] bArr, int i2, int i3) {
        InterfaceC23667[] interfaceC23667Arr = null;
        int length = 0;
        int i4 = 0;
        int i5 = 1709831858;
        int i6 = AbstractC0942.f81890;
        int i7 = C0930.f81879;
        int iM55680 = C0873.m55680("ᩳ֡") ^ i7;
        int i8 = ((iM55680 ^ i6) * (-17325)) ^ 456226982;
        int i9 = 1939624602;
        while (true) {
            i5 = ((((i5 ^ i6) * (-201)) >> 31) & i8) ^ (iM55680 ^ i9);
            switch (i5) {
                case -2139580562:
                case -1450589722:
                    if (C1003.m56123() != 0) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    } else {
                        iM55680 = (C0946.m55979("ܶۖ") ^ i6) * 51;
                        i8 = ((iM55680 ^ i7) * (-15119)) ^ (-1061327151);
                        i9 = -51564080;
                    }
                    break;
                case -2096501148:
                case 1461992449:
                    C10927.m25189(bArr.length, i2, i3);
                    m43171(i, i3);
                    if (i3 == 0) {
                        iM55680 = (C0873.m55680("᩶ۚ") ^ i7) * (-7);
                        i8 = ((iM55680 ^ i6) * 23643) ^ 7597578;
                        i9 = 1567318726;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ܿ֨")) * (-95);
                        i8 = ((iM55680 ^ i6) * 27443) ^ (-287749248);
                        i9 = -1489915553;
                    }
                    break;
                case -1558707921:
                case 2125002557:
                    RunnableC0871.m55672();
                    if (C1229.f82066 >= 0) {
                        iM55680 = (C0873.m55680("ᩳܶ") + i7) * (-35);
                        i8 = ((iM55680 ^ i6) * 30847) ^ (-2113268347);
                        i9 = 1912464091;
                    } else {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    }
                    break;
                case -1485919676:
                case 1170753034:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i6 - C0946.m55979("ܶ᩸")) * 63;
                        i8 = ((iM55680 ^ i7) * 13919) ^ (-1624562522);
                        i9 = -460075420;
                    } else {
                        iM55680 = C0873.m55680("᩷ۢ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-19861)) ^ (-200729574);
                        i9 = 756050544;
                    }
                    break;
                case -1405058726:
                case -987942548:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i6 - C0946.m55979("ܶ᩸")) * 63;
                        i8 = ((iM55680 ^ i7) * 13919) ^ (-1624562522);
                        i9 = -460075420;
                    } else {
                        iM55680 = (C0873.m55680("ۡᩳ") ^ i7) * (-119);
                        i8 = ((iM55680 ^ i6) * (-13009)) ^ (-170142196);
                        i9 = 315023973;
                    }
                    break;
                case -1333336554:
                case 658559258:
                    if (i4 < length) {
                        iM55680 = (C0873.m55680("᩺ܳ") ^ i6) * (-99);
                        i8 = ((iM55680 ^ i7) * 21569) ^ 348206455;
                        i9 = -913083281;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۚ") ^ i7) * (-7);
                        i8 = ((iM55680 ^ i6) * 23643) ^ 7597578;
                        i9 = 1567318726;
                    }
                    break;
                case -1321978618:
                case 1082548434:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    } else {
                        iM55680 = C0873.m55680("ۗ֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * 11853) ^ 576570171;
                        i9 = -85272723;
                    }
                    break;
                case -1222114085:
                case -442902934:
                    if (C0989.f81920 < 0) {
                        iM55680 = (C0873.m55680("ۨۗ") + i6) * (-59);
                        i8 = ((iM55680 ^ i7) * (-3685)) ^ (-434754538);
                        i9 = -1520041835;
                    } else {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    }
                    break;
                case -1088542231:
                case -34119449:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    } else {
                        iM55680 = (i7 - C0946.m55979("֨ۜ")) * (-75);
                        i8 = ((iM55680 ^ i6) * (-22495)) ^ 2002217757;
                        i9 = 239062776;
                    }
                    break;
                case -1012041616:
                case 1782646384:
                    C0946.m55980();
                    break;
                case -847212109:
                case 204868886:
                    if (C0955.f81898) {
                        iM55680 = (i6 - C0946.m55979("ܶ᩸")) * 63;
                        i8 = ((iM55680 ^ i7) * 13919) ^ (-1624562522);
                        i9 = -460075420;
                    } else {
                        iM55680 = C0873.m55680("۟᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7211)) ^ 99961412;
                        i9 = 567495390;
                    }
                    break;
                case -589569460:
                case 2097539881:
                    C0882.m55710();
                    C0894.m55769();
                    iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                    i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                    i9 = -317499645;
                    break;
                case -538828255:
                case -363370674:
                    C0906.m55809();
                    if (C0898.m55800() <= 0) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ܿۧ")) * 13;
                        i8 = ((iM55680 ^ i7) * (-23095)) ^ 1311167796;
                        i9 = 462974102;
                    }
                    break;
                case -442440060:
                case 2037088533:
                    break;
                case 74206003:
                case 1944320115:
                    if (C0967.m56074()) {
                        iM55680 = (C0873.m55680("ᩳܶ") + i7) * (-35);
                        i8 = ((iM55680 ^ i6) * 30847) ^ (-2113268347);
                        i9 = 1912464091;
                    } else {
                        iM55680 = C0873.m55680("ᩳۘ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-32365)) ^ 1606700469;
                        i9 = -482424192;
                    }
                    break;
                case 255830930:
                case 1691859096:
                    interfaceC23667Arr = this.f56678;
                    length = interfaceC23667Arr.length;
                    i4 = 0;
                    iM55680 = C0946.m55979("ۧۡ") ^ i6;
                    i8 = ((iM55680 ^ i7) * (-26407)) ^ (-925570725);
                    i9 = 1911194179;
                    break;
                case 258917458:
                case 1520345197:
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("ۘۧ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-28455)) ^ (-1917345054);
                        i9 = -14445206;
                    } else {
                        iM55680 = (C0873.m55680("ۨۗ") + i6) * (-59);
                        i8 = ((iM55680 ^ i7) * (-3685)) ^ (-434754538);
                        i9 = -1520041835;
                    }
                    break;
                case 594552869:
                case 1562512098:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i6 - C0946.m55979("ܶ᩸")) * 63;
                        i8 = ((iM55680 ^ i7) * 13919) ^ (-1624562522);
                        i9 = -460075420;
                    } else {
                        iM55680 = (C0946.m55979("᩺۟") ^ i7) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((iM55680 ^ i6) * 10213) ^ 344379094;
                        i9 = 1378940721;
                    }
                    break;
                case 1477246536:
                case 2075778744:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ᩴ᩹") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-7399)) ^ (-903546512);
                        i9 = -317499645;
                    } else {
                        iM55680 = C0873.m55680("ۧۚ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-17881)) ^ (-2078220278);
                        i9 = 625584931;
                    }
                    break;
                default:
                    interfaceC23667Arr[i4].mo34200(i, bArr, i + i3, i2);
                    i4++;
                    iM55680 = C0946.m55979("ۧۡ") ^ i6;
                    i8 = ((iM55680 ^ i7) * (-26407)) ^ (-925570725);
                    i9 = 1911194179;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (p067l.C0949.f81897 >= 0) goto L20;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C19013 m43167(byte[] bArr, int i, int[] iArr) throws CloneNotSupportedException {
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        int iM55681;
        int i8;
        int i9;
        int iM55682;
        int i10;
        int i11;
        int i12;
        int iM55683;
        int i13;
        int i14;
        int i15 = C1071.f81975;
        int i16 = ServiceConnectionC1013.f81940;
        int iM55684 = (i16 - C0873.m55680("ᩳۛ")) * 75;
        int i17 = ((iM55684 ^ i15) * 4117) ^ 354572683;
        short[] sArr = null;
        int i18 = iM55684 ^ (-87900607);
        int i19 = 0;
        int length = 0;
        char c = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        short s = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 2088798547;
        while (true) {
            C14949 c14949 = null;
            while (true) {
                i25 = i18 ^ (i17 & (((i25 ^ i15) * 30525) >> 31));
                switch (i25) {
                    case -2053990946:
                    case 890172506:
                        i24 = 16054;
                        iM55979 = (i16 - C0873.m55680("۬ۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM55979 ^ i15) * 10535) ^ 456628246;
                        i3 = 1852931085;
                        int i26 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i26;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -2031910779:
                    case -654762538:
                        return m43162(i19);
                    case -1957945851:
                    case -1617142980:
                        i20++;
                        i22 = i21;
                        i12 = i22;
                        int iM55685 = (i15 - C0873.m55680("᩺ۚ")) * 127;
                        sArr = sArr;
                        i18 = iM55685 ^ (-1630645162);
                        i17 = ((iM55685 ^ i16) * 24151) ^ 178501221;
                        i21 = i12;
                        break;
                    case -1854926471:
                    case 1823969706:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        if (C1012.f81938 >= 0) {
                            iM55979 = (C0873.m55680("᩶֨") + i16) * 23;
                            i2 = ((iM55979 ^ i15) * 25489) ^ (-1782166639);
                            i3 = -142507820;
                        } else {
                            iM55979 = (i16 - C0946.m55979("ۡᩴ")) * (-109);
                            i2 = ((iM55979 ^ i15) * (-30967)) ^ 518900437;
                            i3 = 190155902;
                        }
                        int i27 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i27;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -1810695333:
                    case -144645107:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        if (iArr.length == bArr.length) {
                            iM55979 = C0946.m55979("ۖ֨") ^ i15;
                            i2 = ((iM55979 ^ i16) * (-7205)) ^ 122157905;
                            i3 = -759545679;
                        } else {
                            iM55979 = C0873.m55680("ܰܰ") ^ i15;
                            i2 = ((iM55979 ^ i16) * (-24789)) ^ 1147275539;
                            i3 = 867769522;
                        }
                        int i28 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i28;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -1754264987:
                    case -1122975462:
                        C0882.m55710();
                        C1194.m56396();
                        return null;
                    case -1739762179:
                    case -1298076831:
                        if (i20 != 0) {
                            iM55683 = (C0873.m55680("᩷֫") + i15) * 33;
                            i13 = ((iM55683 ^ i16) * (-28247)) ^ (-874258751);
                            i14 = -1469535247;
                        } else {
                            iM55683 = C0873.m55680("᩻᩶") ^ i16;
                            i13 = ((iM55683 ^ i15) * (-8999)) ^ 1204501002;
                            i14 = 1740153902;
                        }
                        i18 = iM55683 ^ i14;
                        i17 = i13;
                        break;
                    case -1701013584:
                    case -912611093:
                        C0992.m56107();
                        if (!C1025.m56230()) {
                            i21 = i21;
                            i22 = i22;
                            sArr = sArr;
                            iM55682 = (C0946.m55979("᩸ܽ") ^ i15) * 49;
                            i10 = ((iM55682 ^ i16) * (-14313)) ^ 260060430;
                            i11 = -2033173581;
                            sArr = sArr;
                            i18 = iM55682 ^ i11;
                            i17 = i10;
                            i21 = i21;
                            i22 = i22;
                        }
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        iM55979 = (C0873.m55680("᩶֨") + i16) * 23;
                        i2 = ((iM55979 ^ i15) * 25489) ^ (-1782166639);
                        i3 = -142507820;
                        int i29 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i29;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -1460749614:
                    case 1265697107:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        short[] sArr2 = f82286;
                        if (C1012.m56134() > 0) {
                            throw new IllegalArgumentException(C0890.m55726(sArr2, 504, 45, i24));
                        }
                        iM55682 = (C0946.m55979("᩸ܽ") ^ i15) * 49;
                        i10 = ((iM55682 ^ i16) * (-14313)) ^ 260060430;
                        i11 = -2033173581;
                        sArr = sArr;
                        i18 = iM55682 ^ i11;
                        i17 = i10;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -1420379978:
                    case 298942755:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        if (i20 < length) {
                            iM559710 = (i15 - C0946.m55979("ۨ۟")) * 89;
                            i6 = ((iM559710 ^ i16) * 9759) ^ 1158992500;
                            i7 = 793152354;
                        } else {
                            iM559710 = (i16 - C0946.m55979("ۚۨ")) * 13;
                            i6 = ((iM559710 ^ i15) * 27899) ^ (-1839319422);
                            i7 = 284227434;
                        }
                        sArr = sArr;
                        i18 = iM559710 ^ i7;
                        i17 = i6;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -1315507727:
                    case 352461938:
                        short[] sArr3 = f82286;
                        if (C1048.f81963) {
                            throw new IllegalArgumentException(C0912.m55822(sArr3, FloatingActionButton.AUTO_MINI_LARGEST_SCREEN_WIDTH, 34, i24));
                        }
                        iM55979 = C0873.m55680("᩵ܺ") ^ i15;
                        i2 = ((iM55979 ^ i16) * 28761) ^ 1018736322;
                        i3 = 1270685923;
                        int i210 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i210;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -1117298295:
                    case 1829094726:
                        C1048.m56305();
                        C0898.m55800();
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        iM55979 = (C0873.m55680("᩶֨") + i16) * 23;
                        i2 = ((iM55979 ^ i15) * 25489) ^ (-1782166639);
                        i3 = -142507820;
                        int i211 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i211;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -700572322:
                    case 1081189576:
                        i24 = 46712;
                        iM55979 = (i16 - C0873.m55680("۬ۜ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM55979 ^ i15) * 10535) ^ 456628246;
                        i3 = 1852931085;
                        int i212 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i212;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -667079220:
                    case 430198076:
                        C0894.m55769();
                        if (C0845.f81821 >= 0) {
                            i21 = i21;
                            i22 = i22;
                            sArr = sArr;
                            iM559710 = C0873.m55680("᩹ᩳ") ^ i15;
                            i6 = ((iM559710 ^ i16) * (-9305)) ^ 1815943369;
                            i7 = -736310957;
                            sArr = sArr;
                            i18 = iM559710 ^ i7;
                            i17 = i6;
                            i21 = i21;
                            i22 = i22;
                        } else {
                            i21 = i21;
                            i22 = i22;
                            sArr = sArr;
                            iM55682 = (C0946.m55979("᩸ܽ") ^ i15) * 49;
                            i10 = ((iM55682 ^ i16) * (-14313)) ^ 260060430;
                            i11 = -2033173581;
                            sArr = sArr;
                            i18 = iM55682 ^ i11;
                            i17 = i10;
                            i21 = i21;
                            i22 = i22;
                        }
                        break;
                    case -637702618:
                    case 607294058:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        i23 = (s * s) + 90364036;
                        if (C0892.f81851) {
                            iM55979 = (i16 - C0946.m55979("ܽ֫")) * 53;
                            i2 = ((iM55979 ^ i15) * (-7923)) ^ 1420847531;
                            i3 = 1528914962;
                        } else {
                            iM55979 = C0873.m55680("᩵ܺ") ^ i15;
                            i2 = ((iM55979 ^ i16) * 28761) ^ 1018736322;
                            i3 = 1270685923;
                        }
                        int i213 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i213;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -614249592:
                    case -246899671:
                        break;
                    case -273420730:
                    case 2030176443:
                        C0898.m55800();
                        if (C1046.f81962 <= 0) {
                            i21 = i21;
                            i22 = i22;
                            sArr = sArr;
                            iM55682 = (C0873.m55680("ۚۜ") ^ i16) * (-37);
                            i10 = ((iM55682 ^ i15) * 32153) ^ (-255047113);
                            i11 = 823054063;
                            sArr = sArr;
                            i18 = iM55682 ^ i11;
                            i17 = i10;
                            i21 = i21;
                            i22 = i22;
                        }
                        iM55979 = C0873.m55680("᩵ܺ") ^ i15;
                        i2 = ((iM55979 ^ i16) * 28761) ^ 1018736322;
                        i3 = 1270685923;
                        int i214 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i214;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -261084306:
                    case 506611446:
                        sArr = sArr;
                        i22 = i22;
                        i21 = i21;
                        if (i21 >= ((long) i19) + 65536) {
                            i21 = i21;
                            iM55681 = (C0873.m55680("ۜ֫") + i16) * (-127);
                            i8 = ((iM55681 ^ i15) * (-7481)) ^ 261103032;
                            i9 = -662811923;
                            int i30 = iM55681 ^ i9;
                            sArr = sArr;
                            i18 = i30;
                            i17 = i8;
                            i22 = i22;
                        } else {
                            iM559710 = (C0873.m55680("ᩴܰ") ^ i15) * 61;
                            i6 = ((iM559710 ^ i16) * 15469) ^ (-608722352);
                            i7 = -1572628239;
                            sArr = sArr;
                            i18 = iM559710 ^ i7;
                            i17 = i6;
                            i21 = i21;
                            i22 = i22;
                        }
                        break;
                    case -224110455:
                    case 514283686:
                        if (C0898.m55800() > 0) {
                            i21 = i21;
                            i22 = i22;
                            iM55680 = C0873.m55680("᩸᩵") ^ i16;
                            i4 = ((iM55680 ^ i15) * (-289)) ^ (-816276664);
                            i5 = 627970918;
                            i18 = iM55680 ^ i5;
                            i17 = i4;
                            i21 = i21;
                            i22 = i22;
                        }
                        iM55979 = C0873.m55680("᩵ܺ") ^ i15;
                        i2 = ((iM55979 ^ i16) * 28761) ^ 1018736322;
                        i3 = 1270685923;
                        int i215 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i215;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case -97706446:
                    case 2052275659:
                        InterfaceC23667[] interfaceC23667Arr = new InterfaceC23667[1];
                        interfaceC23667Arr[c] = c14949;
                        return new C19013(i19, interfaceC23667Arr);
                    case -59593487:
                    case 1409764184:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        if (i23 - (s * 19012) >= 0) {
                            iM55979 = C0946.m55979("ܰۖ") ^ i16;
                            i2 = ((iM55979 ^ i15) * 12383) ^ (-910623826);
                            i3 = 1768260872;
                        } else {
                            iM55979 = C0946.m55979("ۙᩳ") ^ i15;
                            i2 = ((iM55979 ^ i16) * (-15587)) ^ 166807988;
                            i3 = -259707612;
                        }
                        int i216 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i216;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case 294060793:
                    case 1470663507:
                        i21 = i21;
                        i22 = i22;
                        sArr = f82286;
                        if (C0890.f81849 != 0) {
                            iM55680 = C0873.m55680("᩸᩵") ^ i16;
                            i4 = ((iM55680 ^ i15) * (-289)) ^ (-816276664);
                            i5 = 627970918;
                        } else {
                            iM55680 = C0873.m55680("᩺֡") ^ i15;
                            i4 = ((iM55680 ^ i16) * 2351) ^ (-1726799124);
                            i5 = 943376636;
                        }
                        i18 = iM55680 ^ i5;
                        i17 = i4;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case 406019974:
                    case 587054140:
                        i12 = i21;
                        c = 0;
                        i20 = 0;
                        i22 = Integer.MIN_VALUE;
                        int iM55686 = (i15 - C0873.m55680("᩺ۚ")) * 127;
                        sArr = sArr;
                        i18 = iM55686 ^ (-1630645162);
                        i17 = ((iM55686 ^ i16) * 24151) ^ 178501221;
                        i21 = i12;
                        break;
                    case 410821840:
                    case 1241889996:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        if (iArr.length == 0) {
                            iM559710 = C0873.m55680("᩸ۗ") ^ i16;
                            i6 = ((iM559710 ^ i15) * (-3263)) ^ 70104316;
                            i7 = 1779912362;
                        } else {
                            iM559710 = C0946.m55979("֨ۚ") ^ i16;
                            i6 = ((iM559710 ^ i15) * (-32615)) ^ (-332448596);
                            i7 = -595434449;
                        }
                        sArr = sArr;
                        i18 = iM559710 ^ i7;
                        i17 = i6;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case 511847515:
                    case 1807080398:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        s = sArr[469];
                        if (C0882.f81846) {
                            iM55979 = C0946.m55979("ܺܶ") ^ i16;
                            i2 = ((iM55979 ^ i15) * 7291) ^ 1490876340;
                            i3 = 885669760;
                        } else {
                            iM55979 = C0873.m55680("ۡ᩻") ^ i15;
                            i2 = ((iM55979 ^ i16) * (-29351)) ^ 626021686;
                            i3 = 42574608;
                        }
                        int i217 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i217;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                    case 812984173:
                    case 1163082099:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        AbstractC12979 abstractC12979M29748 = AbstractC12979.m29748(iArr.length, iArr);
                        if (!C0955.f81898) {
                            Object objClone = bArr.clone();
                            if (C1124.m56367() < 0) {
                                C14949 c149410 = new C14949(abstractC12979M29748, (byte[]) objClone);
                                if (C0949.f81897 < 0) {
                                    int iM559711 = (i15 - C0946.m55979("᩷᩶")) * (-89);
                                    i2 = ((iM559711 ^ i16) * (-6967)) ^ 779645270;
                                    sArr = sArr;
                                    c14949 = c149410;
                                    i18 = iM559711 ^ (-209271028);
                                    i17 = i2;
                                    i21 = i21;
                                    i22 = i22;
                                } else {
                                    c14949 = c149410;
                                    iM559710 = C0873.m55680("᩹ᩳ") ^ i15;
                                    i6 = ((iM559710 ^ i16) * (-9305)) ^ 1815943369;
                                    i7 = -736310957;
                                    sArr = sArr;
                                    i18 = iM559710 ^ i7;
                                    i17 = i6;
                                    i21 = i21;
                                    i22 = i22;
                                }
                            } else {
                                iM55682 = (C0873.m55680("ۚۜ") ^ i16) * (-37);
                                i10 = ((iM55682 ^ i15) * 32153) ^ (-255047113);
                                i11 = 823054063;
                                sArr = sArr;
                                i18 = iM55682 ^ i11;
                                i17 = i10;
                                i21 = i21;
                                i22 = i22;
                            }
                        } else {
                            iM55682 = (C0946.m55979("᩸ܽ") ^ i15) * 49;
                            i10 = ((iM55682 ^ i16) * (-14313)) ^ 260060430;
                            i11 = -2033173581;
                            sArr = sArr;
                            i18 = iM55682 ^ i11;
                            i17 = i10;
                            i21 = i21;
                            i22 = i22;
                        }
                        break;
                    case 935414648:
                    case 1480922499:
                        i22 = i22;
                        sArr = sArr;
                        i21 = iArr[i20];
                        if (i21 >= i19) {
                            iM55681 = (C0873.m55680("ۨۘ") + i15) * 33;
                            i8 = ((iM55681 ^ i16) * 6643) ^ 1105784792;
                            i9 = 237247198;
                        } else {
                            iM55681 = (C0873.m55680("ۜ֫") + i16) * (-127);
                            i8 = ((iM55681 ^ i15) * (-7481)) ^ 261103032;
                            i9 = -662811923;
                        }
                        int i31 = iM55681 ^ i9;
                        sArr = sArr;
                        i18 = i31;
                        i17 = i8;
                        i22 = i22;
                        break;
                    case 1456117925:
                    case 1956607904:
                        if (i21 <= i22) {
                            i22 = i22;
                            sArr = sArr;
                            iM55681 = (C0873.m55680("ۜ֫") + i16) * (-127);
                            i8 = ((iM55681 ^ i15) * (-7481)) ^ 261103032;
                            i9 = -662811923;
                            int i32 = iM55681 ^ i9;
                            sArr = sArr;
                            i18 = i32;
                            i17 = i8;
                            i22 = i22;
                        } else {
                            iM55683 = C0873.m55680("᩻᩶") ^ i16;
                            i13 = ((iM55683 ^ i15) * (-8999)) ^ 1204501002;
                            i14 = 1740153902;
                            i18 = iM55683 ^ i14;
                            i17 = i13;
                        }
                        break;
                    default:
                        i21 = i21;
                        i22 = i22;
                        sArr = sArr;
                        i19 = i & (-65536);
                        length = iArr.length;
                        if (C1028.m56247() < 0) {
                            iM559710 = (C0873.m55680("᩺᩹") ^ i16) * (-77);
                            i6 = ((iM559710 ^ i15) * 30319) ^ (-1638891511);
                            i7 = -1734456831;
                            sArr = sArr;
                            i18 = iM559710 ^ i7;
                            i17 = i6;
                            i21 = i21;
                            i22 = i22;
                        }
                        iM55979 = (C0873.m55680("᩶֨") + i16) * 23;
                        i2 = ((iM55979 ^ i15) * 25489) ^ (-1782166639);
                        i3 = -142507820;
                        int i218 = iM55979 ^ i3;
                        sArr = sArr;
                        i18 = i218;
                        i17 = i2;
                        i21 = i21;
                        i22 = i22;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43181(int i, int i2) {
        int i3 = 0;
        InterfaceC23667[] interfaceC23667Arr = null;
        int length = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 893447992;
        int i6 = C0989.f81920;
        int i7 = C1044.f81959;
        int iM55680 = (i6 - C0873.m55680("ۙ֨")) * 127;
        int i8 = ((iM55680 ^ i7) * 31311) ^ (-1559634012);
        int i9 = 1771354378;
        while (true) {
            i5 = ((((i5 ^ i7) * 20325) >> 31) & i8) ^ (iM55680 ^ i9);
            switch (i5) {
                case -2128884177:
                case -1889073579:
                    return true;
                case -1846067910:
                case 1600550340:
                    C1025.m56230();
                    C0882.m55710();
                    iM55680 = (C0873.m55680("ܿܶ") + i6) * (-125);
                    i8 = ((iM55680 ^ i7) * (-10369)) ^ (-596523903);
                    i9 = 563128103;
                    break;
                case -1739867831:
                case -939248499:
                    C1194.m56396();
                    if (!C0917.m55854()) {
                        iM55680 = (i7 - C0873.m55680("֡۬")) * 17;
                        i8 = ((iM55680 ^ i6) * (-29065)) ^ (-1476132365);
                        i9 = 1506250440;
                    } else {
                        iM55680 = (C0873.m55680("ܿܶ") + i6) * (-125);
                        i8 = ((iM55680 ^ i7) * (-10369)) ^ (-596523903);
                        i9 = 563128103;
                    }
                    break;
                case -1524515709:
                case 462725973:
                    if (C0877.m55696()) {
                        iM55680 = (C0946.m55979("۫ܽ") ^ i7) * (-31);
                        i8 = ((iM55680 ^ i6) * (-13339)) ^ (-660931066);
                        i9 = 638592807;
                    } else {
                        iM55680 = (i7 - C0873.m55680("֡۬")) * 17;
                        i8 = ((iM55680 ^ i6) * (-29065)) ^ (-1476132365);
                        i9 = 1506250440;
                    }
                    break;
                case -1411816133:
                case 235282023:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ܿܶ") + i6) * (-125);
                        i8 = ((iM55680 ^ i7) * (-10369)) ^ (-596523903);
                        i9 = 563128103;
                    } else {
                        iM55680 = C0946.m55979("᩶ۤ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-4153)) ^ 2118817013;
                        i9 = -819660121;
                    }
                    break;
                case -1349899003:
                case -405135133:
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("۬֨") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-19097)) ^ 1368798081;
                        i9 = 1835646946;
                    } else {
                        iM55680 = (C0873.m55680("ᩴܶ") ^ i6) * 19;
                        i8 = ((iM55680 ^ i7) * (-13393)) ^ (-2107903259);
                        i9 = 1065737384;
                    }
                    break;
                case -1322157238:
                case 2018112721:
                    if (C0955.m56025()) {
                        iM55680 = (C0873.m55680("ۘۖ") + i7) * (-111);
                        i8 = ((iM55680 ^ i6) * 30065) ^ (-1283521069);
                        i9 = -528508041;
                    } else {
                        iM55680 = C0873.m55680("ۨ᩸") ^ i7;
                        i8 = ((iM55680 ^ i6) * 11303) ^ (-250547044);
                        i9 = -880797067;
                    }
                    break;
                case -879392998:
                case 1525815309:
                    if (C0955.f81898) {
                        iM55680 = (i7 - C0873.m55680("֡۬")) * 17;
                        i8 = ((iM55680 ^ i6) * (-29065)) ^ (-1476132365);
                        i9 = 1506250440;
                    } else {
                        iM55680 = (C0946.m55979("ۜ᩺") ^ i6) * (-5);
                        i8 = ((iM55680 ^ i7) * 20431) ^ (-463815135);
                        i9 = -1967196856;
                    }
                    break;
                case -851203281:
                case -129591304:
                    if (interfaceC23667Arr[i4].mo34203(i, i3)) {
                        iM55680 = (C0946.m55979("ۗᩳ") + i7) * (-39);
                        i8 = ((iM55680 ^ i6) * 4707) ^ 1922324595;
                        i9 = -1231227551;
                    } else {
                        iM55680 = C0946.m55979("۠ۢ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-29651)) ^ 168498211;
                        i9 = -2061731035;
                    }
                    break;
                case -707267072:
                case 1472703989:
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55680 = C0946.m55979("᩺֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-20967)) ^ 288029680;
                        i9 = -1438149342;
                    } else {
                        iM55680 = (C0873.m55680("ܿܶ") + i6) * (-125);
                        i8 = ((iM55680 ^ i7) * (-10369)) ^ (-596523903);
                        i9 = 563128103;
                    }
                    break;
                case -694964106:
                case -229971374:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0946.m55979("᩺֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-20967)) ^ 288029680;
                        i9 = -1438149342;
                    } else {
                        iM55680 = C0946.m55979("ۡ᩻") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-14909)) ^ 427274313;
                        i9 = 1342409134;
                    }
                    break;
                case -200678091:
                case 1928090034:
                    if (i4 < length) {
                        iM55680 = (C0946.m55979("۬֡") ^ i6) * (-109);
                        i8 = ((iM55680 ^ i7) * (-19627)) ^ (-1334291615);
                        i9 = 1489353470;
                    } else {
                        iM55680 = (C0873.m55680("ۧ᩹") + i6) * (-19);
                        i8 = ((iM55680 ^ i7) * 6421) ^ 562564429;
                        i9 = -506754331;
                    }
                    break;
                case -110202749:
                case 6018113:
                    if (C1053.m56327() >= 0) {
                        iM55680 = C0946.m55979("۬֨") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-19097)) ^ 1368798081;
                        i9 = 1835646946;
                    } else {
                        iM55680 = C0946.m55979("᩺֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-20967)) ^ 288029680;
                        i9 = -1438149342;
                    }
                    break;
                case 131736714:
                case 2106595148:
                    interfaceC23667Arr = this.f56678;
                    length = interfaceC23667Arr.length;
                    z = false;
                    i4 = 0;
                    iM55680 = (C0873.m55680("ܰۗ") ^ i7) * (-81);
                    i8 = ((iM55680 ^ i6) * 6251) ^ (-66194235);
                    i9 = 787367652;
                    break;
                case 168940140:
                case 798778544:
                    return z;
                case 190685933:
                case 393202927:
                    m43171(i, i2);
                    i3 = i2 + i;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0873.m55680("ۘۖ") + i7) * (-111);
                        i8 = ((iM55680 ^ i6) * 30065) ^ (-1283521069);
                        i9 = -528508041;
                    } else {
                        iM55680 = (i6 - C0873.m55680("ۧۛ")) * 5;
                        i8 = ((iM55680 ^ i7) * (-4461)) ^ (-1340613133);
                        i9 = -831270843;
                    }
                    break;
                case 222803711:
                case 687248981:
                    i4++;
                    iM55680 = (C0873.m55680("ܰۗ") ^ i7) * (-81);
                    i8 = ((iM55680 ^ i6) * 6251) ^ (-66194235);
                    i9 = 787367652;
                    break;
                case 419698306:
                case 1813690221:
                    C0917.m55854();
                    return false;
                case 1091140952:
                case 1138490173:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0873.m55680("ܿܶ") + i6) * (-125);
                        i8 = ((iM55680 ^ i7) * (-10369)) ^ (-596523903);
                        i9 = 563128103;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۨᩴ")) * (-65);
                        i8 = ((iM55680 ^ i6) * 3533) ^ (-236933627);
                        i9 = 1987200859;
                    }
                    break;
                case 1199362129:
                case 1504456387:
                    if (C0890.m55740()) {
                        iM55680 = C0946.m55979("ۙ᩹") ^ i6;
                        i8 = ((iM55680 ^ i7) * 30953) ^ 900118716;
                        i9 = 1142116125;
                    } else {
                        iM55680 = C0946.m55979("᩺֫") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-20967)) ^ 288029680;
                        i9 = -1438149342;
                    }
                    break;
                default:
                    if (C0927.m55873() <= 0) {
                        iM55680 = (i7 - C0873.m55680("֡۬")) * 17;
                        i8 = ((iM55680 ^ i6) * (-29065)) ^ (-1476132365);
                        i9 = 1506250440;
                    } else {
                        iM55680 = (i7 - C0873.m55680("֫ܶ")) * 127;
                        i8 = ((iM55680 ^ i6) * (-17475)) ^ 505767442;
                        i9 = 1124678512;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00eb A[PHI: r2 r4
      0x00eb: PHI (r2v83 long) = (r2v80 long), (r2v2 long), (r2v2 long) binds: [B:34:0x00d5, B:26:0x009e, B:24:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r4v6 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:34:0x00d5, B:26:0x009e, B:24:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0226 A[PHI: r5 r16
      0x0226: PHI (r5v5 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]) binds: [B:66:0x0224, B:54:0x01c4, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r16v19 long) = (r16v3 long), (r16v6 long), (r16v20 long) binds: [B:66:0x0224, B:54:0x01c4, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0256 A[PHI: r16
      0x0256: PHI (r16v16 long) = (r16v2 long), (r16v4 long), (r16v17 long) binds: [B:70:0x0254, B:62:0x0207, B:14:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02a9 A[PHI: r7 r8 r16
      0x02a9: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:78:0x02a7, B:74:0x0289, B:58:0x01e6, B:46:0x016a, B:29:0x00c2, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:78:0x02a7, B:74:0x0289, B:58:0x01e6, B:46:0x016a, B:29:0x00c2, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02a9: PHI (r16v14 long) = (r16v0 long), (r16v1 long), (r16v5 long), (r16v8 long), (r16v13 long), (r16v15 long) binds: [B:78:0x02a7, B:74:0x0289, B:58:0x01e6, B:46:0x016a, B:29:0x00c2, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (p067l.C0989.f81920 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m43171(int i, int i2) {
        int iM55979;
        int i3;
        int iM55680;
        int i4;
        int i5;
        long j = 0;
        int i6 = 0;
        short[] sArr = null;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -919936408;
        int i11 = C1036.f81953;
        int i12 = C0930.f81879;
        int iM55681 = (i12 - C0873.m55680("ۨܰ")) * (-77);
        int i13 = ((iM55681 ^ i11) * 13183) ^ (-585553066);
        int i14 = -1365468794;
        while (true) {
            int i15 = iM55681 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i11) * (-6585)) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -1918678650:
                    case -888540291:
                        j = j;
                        sArr = f82286;
                        if (C0917.f81868) {
                            iM55979 = C0873.m55680("֡᩷") ^ i11;
                            i13 = (-590586962) ^ ((iM55979 ^ i12) * (-3449));
                            i3 = 432594940;
                        } else {
                            iM55979 = (i12 - C0946.m55979("۟ۙ")) * (-17);
                            i13 = 765821945 ^ ((iM55979 ^ i11) * 21409);
                            i3 = 39159922;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1693455863:
                    case 1050590484:
                        j = j;
                        if ((116143729 + i8) - i7 >= 0) {
                            iM55979 = (C0873.m55680("۬ᩳ") ^ i12) * (-7);
                            i13 = 1686961315 ^ ((iM55979 ^ i11) * 20317);
                            i3 = 159099058;
                        } else {
                            iM55979 = C0946.m55979("᩶۫") ^ i12;
                            i13 = (-1847009722) ^ ((iM55979 ^ i11) * (-22805));
                            i3 = -942887436;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1425058807:
                    case -1255247225:
                        j = j;
                        if (C0949.f81897 >= 0) {
                            iM55979 = C0873.m55680("֡᩷") ^ i11;
                            i13 = (-590586962) ^ ((iM55979 ^ i12) * (-3449));
                            i3 = 432594940;
                        } else {
                            iM55979 = C0873.m55680("ۢۗ") ^ i12;
                            i13 = 535138445 ^ ((iM55979 ^ i11) * 24423);
                            i3 = 590259654;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1416391278:
                    case 227743749:
                        j = j;
                        if (AbstractC0942.f81890 <= 0) {
                            iM55979 = (C0873.m55680("ܺۜ") ^ i11) * 57;
                            i13 = 1799925659 ^ ((iM55979 ^ i12) * (-19129));
                            i3 = 603384887;
                        } else {
                            iM55979 = C0946.m55979("᩸۟") ^ i12;
                            i13 = (-1660622577) ^ ((iM55979 ^ i11) * (-8571));
                            i3 = 266348903;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1314217509:
                    case 1640290676:
                        i9 = 7848;
                        iM55979 = C0873.m55680("ۤ᩻") ^ i11;
                        i13 = (-1433774888) ^ ((iM55979 ^ i12) * 25349);
                        i3 = -2044097320;
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1311519236:
                    case -1256982598:
                        short[] sArr2 = f82286;
                        j = j;
                        if (C1071.f81975 > 0) {
                            throw new IllegalArgumentException(ServiceConnectionC1013.m56161(sArr2, 575, 34, i9));
                        }
                        iM55979 = C0873.m55680("ܿ᩷") ^ i12;
                        i13 = 1626105396 ^ ((iM55979 ^ i11) * (-20227));
                        i3 = -156412276;
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1245178176:
                    case 1901730460:
                        j = j;
                        i7 = s * 21554;
                        i8 = s * s;
                        if (C1024.f81946) {
                            iM55979 = C0873.m55680("ܿ᩷") ^ i12;
                            i13 = 1626105396 ^ ((iM55979 ^ i11) * (-20227));
                            i3 = -156412276;
                        } else {
                            iM55979 = (C0873.m55680("᩻ۧ") ^ i11) * (-85);
                            i13 = 157842420 ^ ((iM55979 ^ i12) * (-1131));
                            i3 = -862323462;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -1225603126:
                    case 879619159:
                        C0937.m55918();
                        if (C0927.f81875) {
                            iM55681 = C0946.m55979("ۛۚ") ^ i12;
                            i13 = ((iM55681 ^ i11) * (-2811)) ^ 1354704024;
                            i14 = -815803915;
                        }
                        j = j;
                        iM55979 = C0873.m55680("֡᩷") ^ i11;
                        i13 = (-590586962) ^ ((iM55979 ^ i12) * (-3449));
                        i3 = 432594940;
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -936774356:
                    case 1262688968:
                        C0992.m56107();
                        break;
                    case -764477863:
                    case -669987742:
                        C0946.m55980();
                        return;
                    case -700649746:
                    case 1319090122:
                        if (j > ((long) i6) + 65536) {
                            iM55680 = C0873.m55680("᩹ۚ") ^ i11;
                            i4 = ((iM55680 ^ i12) * 12299) ^ 664175216;
                            i5 = 1408494126;
                            i15 = iM55680 ^ i5;
                            i13 = i4;
                        } else {
                            iM55681 = (C0946.m55979("ۗۙ") + i11) * (-51);
                            i13 = ((iM55681 ^ i12) * (-28777)) ^ (-788000985);
                            i14 = 736936666;
                        }
                        break;
                    case -505255076:
                    case 1749136488:
                        if (ServiceConnectionC1013.m56157() > 0) {
                            j = j;
                            iM55979 = (C0873.m55680("ܺۜ") ^ i11) * 57;
                            i13 = 1799925659 ^ ((iM55979 ^ i12) * (-19129));
                            i3 = 603384887;
                            i15 = iM55979 ^ i3;
                            j = j;
                        }
                        j = j;
                        iM55979 = C0873.m55680("֡᩷") ^ i11;
                        i13 = (-590586962) ^ ((iM55979 ^ i12) * (-3449));
                        i3 = 432594940;
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -416378794:
                    case 1415834750:
                        j = j;
                        s = sArr[574];
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM55979 = (C0873.m55680("ᩴۤ") + i12) * 41;
                            i13 = (-512263364) ^ ((iM55979 ^ i11) * (-821));
                            i3 = -903092452;
                        } else {
                            iM55979 = (C0873.m55680("֡᩹") ^ i11) * 13;
                            i13 = (-1563439441) ^ ((iM55979 ^ i12) * (-20211));
                            i3 = -926336875;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -378341577:
                    case 2004120835:
                        i9 = 64026;
                        iM55979 = C0873.m55680("ۤ᩻") ^ i11;
                        i13 = (-1433774888) ^ ((iM55979 ^ i12) * 25349);
                        i3 = -2044097320;
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -180674483:
                    case 699470365:
                        j = j;
                        if (C1229.m56410() != 0) {
                            iM55979 = C0873.m55680("ܿ᩷") ^ i12;
                            i13 = 1626105396 ^ ((iM55979 ^ i11) * (-20227));
                            i3 = -156412276;
                        } else {
                            iM55979 = (C0873.m55680("ۙۗ") ^ i12) * (-99);
                            i13 = (-888491986) ^ ((iM55979 ^ i11) * (-32253));
                            i3 = -1116302276;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case -158021454:
                    case 2138907470:
                        i6 = this.f56677;
                        if (i >= i6) {
                            iM55680 = (C0946.m55979("ܽۡ") + i12) * 35;
                            i4 = ((iM55680 ^ i11) * 6191) ^ 725879601;
                            i5 = -1304892416;
                        } else {
                            iM55680 = C0873.m55680("᩹ۚ") ^ i11;
                            i4 = ((iM55680 ^ i12) * 12299) ^ 664175216;
                            i5 = 1408494126;
                        }
                        i15 = iM55680 ^ i5;
                        i13 = i4;
                        break;
                    case -13946593:
                    case 1575822498:
                        C1404.m56468();
                        C0947.m55997();
                        j = j;
                        iM55979 = C0873.m55680("ܿ᩷") ^ i12;
                        i13 = 1626105396 ^ ((iM55979 ^ i11) * (-20227));
                        i3 = -156412276;
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case 307409517:
                    case 559838198:
                        j = j;
                        if (C0863.m55643()) {
                            iM55979 = (i11 - C0873.m55680("᩻ۤ")) * 95;
                            i13 = 1255784017 ^ ((iM55979 ^ i12) * (-28939));
                            i3 = 1713242441;
                        } else {
                            iM55979 = C0873.m55680("ܿ᩷") ^ i12;
                            i13 = 1626105396 ^ ((iM55979 ^ i11) * (-20227));
                            i3 = -156412276;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case 605757371:
                    case 1607503404:
                        j = j;
                        if (C0863.f81833 <= 0) {
                            iM55979 = C0873.m55680("ܿ᩷") ^ i12;
                            i13 = 1626105396 ^ ((iM55979 ^ i11) * (-20227));
                            i3 = -156412276;
                        } else {
                            iM55979 = C0946.m55979("ۛᩳ") ^ i11;
                            i13 = 836227891 ^ ((iM55979 ^ i12) * (-19111));
                            i3 = 332982432;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    case 1086127558:
                    case 1623874266:
                        j = ((long) i) + ((long) i2);
                        if (i2 >= 0) {
                            iM55680 = C0873.m55680("ܽܽ") ^ i12;
                            i4 = ((iM55680 ^ i11) * (-21893)) ^ (-230058547);
                            i5 = -668381468;
                        } else {
                            iM55680 = C0873.m55680("᩹ۚ") ^ i11;
                            i4 = ((iM55680 ^ i12) * 12299) ^ 664175216;
                            i5 = 1408494126;
                        }
                        i15 = iM55680 ^ i5;
                        i13 = i4;
                        break;
                    case 1275431245:
                    case 1372990580:
                        j = j;
                        if (C1229.f82066 >= 0) {
                            iM55979 = (C0873.m55680("ܺۜ") ^ i11) * 57;
                            i13 = 1799925659 ^ ((iM55979 ^ i12) * (-19129));
                            i3 = 603384887;
                        } else {
                            iM55979 = (i11 - C0946.m55979("᩹᩻")) * 77;
                            i13 = (-1694448337) ^ ((iM55979 ^ i12) * 29889);
                            i3 = -998386288;
                        }
                        i15 = iM55979 ^ i3;
                        j = j;
                        break;
                    default:
                        return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x010d A[PHI: r22
      0x010d: PHI (r22v4 int) = (r22v3 int), (r22v2 int) binds: [B:29:0x010b, B:13:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0298 A[PHI: r15 r20 r21
      0x0298: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:63:0x0296, B:53:0x0218, B:33:0x0145, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v3 int), (r20v2 int) binds: [B:63:0x0296, B:53:0x0218, B:33:0x0145, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]
      0x0298: PHI (r21v4 int) = (r21v2 int), (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:63:0x0296, B:53:0x0218, B:33:0x0145, B:10:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C19013 m43163(int i, InterfaceC23667[] interfaceC23667Arr) {
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7 = i;
        int i8 = C1404.f82149;
        int i9 = C0912.f81867;
        int iM55682 = (C0873.m55680("᩸۬") ^ i9) * 47;
        int i10 = ((iM55682 ^ i8) * (-18785)) ^ (-2019514859);
        byte[] bArr = null;
        long[] jArr = null;
        byte[] bArr2 = null;
        long j = 0;
        int i11 = iM55682 ^ (-800765974);
        int i12 = 0;
        int length = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iBitCount = 0;
        int i17 = 0;
        int i18 = 0;
        int iNumberOfTrailingZeros = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = -1177873991;
        int i26 = 0;
        int[] iArr = null;
        int i27 = 0;
        while (true) {
            i25 = i11 ^ (i10 & (((i25 ^ i8) * (-24461)) >> 31));
            switch (i25) {
                case -2127422302:
                case -1945568997:
                    if (i14 < length) {
                        iM55979 = (C0873.m55680("ۤۖ") + i9) * (-53);
                        i2 = ((iM55979 ^ i8) * 1605) ^ 1312216231;
                        i3 = -1523935105;
                    } else {
                        iM55979 = (C0873.m55680("ᩳ֨") + i8) * (-63);
                        i2 = ((iM55979 ^ i9) * (-10005)) ^ 2119239734;
                        i3 = -1974718930;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -2003661600:
                case -28131910:
                    C0989.m56095();
                    C1071.m56343();
                    return null;
                case -1968066677:
                case 733014028:
                    if (i13 < i12) {
                        iM55979 = (C0946.m55979("ۢܿ") ^ i9) * (-13);
                        i2 = ((iM55979 ^ i8) * (-20659)) ^ 424834165;
                        i3 = -746697441;
                    } else {
                        iM55979 = (C0946.m55979("֡ܳ") + i8) * (-49);
                        i2 = ((iM55979 ^ i9) * (-27729)) ^ 1270164917;
                        i3 = 224931232;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1955138786:
                case 1117323967:
                    i16 = 0;
                    i27 = 0;
                    iM55979 = C0873.m55680("ܺᩴ") ^ i8;
                    i2 = ((iM55979 ^ i9) * (-9909)) ^ (-1754356522);
                    i3 = 1691923996;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1760992004:
                case -1538588646:
                    C0917.m55854();
                    if (C1053.f81965 > 0) {
                        iM55979 = C0873.m55680("ܰ᩷") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-3931)) ^ (-1782263215);
                        i3 = -1114071191;
                    } else {
                        iM55979 = (C0873.m55680("᩹ܿ") + i9) * 69;
                        i2 = ((iM55979 ^ i8) * 23305) ^ (-1986676329);
                        i3 = 1005586520;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1737842647:
                case 1765892459:
                    if (j != 0) {
                        iM55979 = C0946.m55979("᩵ۢ") ^ i8;
                        i2 = ((iM55979 ^ i9) * 1889) ^ 1735247913;
                        i3 = 1623879158;
                    } else {
                        iM55979 = (C0873.m55680("ܽᩳ") + i9) * (-57);
                        i2 = ((iM55979 ^ i8) * (-32251)) ^ 1295346419;
                        i3 = -723289889;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1641210036:
                case 652754321:
                    i17 = i27 + iBitCount;
                    if (!C0927.f81875) {
                        iM55979 = (C0946.m55979("ۨۜ") ^ i9) * 43;
                        i2 = ((iM55979 ^ i8) * 2275) ^ 1902624793;
                        i3 = 402866269;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        iM55680 = (i9 - C0873.m55680("۟֫")) * 35;
                        i10 = ((iM55680 ^ i8) * (-1103)) ^ (-1262347358);
                        i4 = -745047228;
                        i11 = iM55680 ^ i4;
                        i7 = i;
                    }
                    break;
                case -1614046317:
                case 100893624:
                    i26 = 65536;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (i9 - C0873.m55680("۟֫")) * 35;
                        i10 = ((iM55680 ^ i8) * (-1103)) ^ (-1262347358);
                        i4 = -745047228;
                    } else {
                        iM55680 = C0873.m55680("᩸ܰ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 287) ^ 361456650;
                        i4 = -1777882310;
                    }
                    i11 = iM55680 ^ i4;
                    i7 = i;
                    break;
                case -1571483958:
                case 2139349947:
                    i5 = i26;
                    if (C1036.f81953 < 0) {
                        iM55681 = (C0873.m55680("᩷ܰ") ^ i9) * 33;
                        i2 = ((iM55681 ^ i8) * (-27039)) ^ (-1960170790);
                        i6 = -1157209579;
                        i11 = iM55681 ^ i6;
                        i7 = i;
                        i26 = i5;
                        i10 = i2;
                    } else {
                        i26 = i5;
                        iM55680 = (i9 - C0873.m55680("۟֫")) * 35;
                        i10 = ((iM55680 ^ i8) * (-1103)) ^ (-1262347358);
                        i4 = -745047228;
                        i11 = iM55680 ^ i4;
                        i7 = i;
                    }
                    break;
                case -1483937821:
                case 2105301946:
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("ܰ᩷") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-3931)) ^ (-1782263215);
                        i3 = -1114071191;
                    } else {
                        iM55979 = (i8 - C0873.m55680("۫᩵")) * 99;
                        i2 = ((iM55979 ^ i9) * (-19117)) ^ 1915060605;
                        i3 = -529725962;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1475548256:
                case 1531143934:
                    iBitCount = Long.bitCount(jArr[i16]);
                    if (C0937.f81884) {
                        iM55979 = (i9 - C0873.m55680("᩹۫")) * (-17);
                        i2 = ((iM55979 ^ i8) * 18691) ^ (-504299909);
                        i3 = -510443374;
                    } else {
                        iM55979 = (C0873.m55680("᩹ܿ") + i9) * 69;
                        i2 = ((iM55979 ^ i8) * 23305) ^ (-1986676329);
                        i3 = 1005586520;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1326290086:
                case 2047135242:
                    if (i16 < i12) {
                        iM55979 = (C0946.m55979("ᩳܳ") + i8) * 33;
                        i2 = ((iM55979 ^ i9) * (-6293)) ^ 215672134;
                        i3 = 43698978;
                    } else {
                        iM55979 = (C0946.m55979("ۘۛ") + i9) * (-121);
                        i2 = ((iM55979 ^ i8) * (-2141)) ^ 377103159;
                        i3 = -1002131308;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1272573863:
                case -678656659:
                    iArr[i21] = i7 + i20;
                    i22 = 1;
                    if (!C0877.m55696()) {
                        i5 = i26;
                        int iM559710 = C0946.m55979("᩹֡") ^ i8;
                        i11 = iM559710 ^ (-1590023180);
                        i26 = i5;
                        i10 = ((iM559710 ^ i9) * (-17839)) ^ 2134434049;
                        i7 = i;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩶") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-5939)) ^ 1914873766;
                        i3 = 1495369778;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    }
                    break;
                case -1265351109:
                case -342031296:
                    C0946.m55980();
                    C0894.m55769();
                    iM55979 = C0873.m55680("ܰ᩷") ^ i9;
                    i2 = ((iM55979 ^ i8) * (-3931)) ^ (-1782263215);
                    i3 = -1114071191;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1260162617:
                case 340431211:
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                    i19 = i13 << 6;
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0873.m55680("᩹ܿ") + i9) * 69;
                        i2 = ((iM55979 ^ i8) * 23305) ^ (-1986676329);
                        i3 = 1005586520;
                    } else {
                        iM55979 = (i9 - C0873.m55680("ۧ۠")) * (-111);
                        i2 = ((iM55979 ^ i8) * (-24775)) ^ (-1021687222);
                        i3 = -1727810940;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1106867805:
                case 2032757256:
                    i14++;
                    iM55979 = (C0946.m55979("ۨܺ") + i9) * 51;
                    i2 = ((iM55979 ^ i8) * (-23539)) ^ 1380658095;
                    i3 = 228404425;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1081487770:
                case -436581335:
                    length = interfaceC23667Arr.length;
                    i14 = 0;
                    i18 = 0;
                    iM55979 = (C0946.m55979("ۨܺ") + i9) * 51;
                    i2 = ((iM55979 ^ i8) * (-23539)) ^ 1380658095;
                    i3 = 228404425;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1057358200:
                case 863910585:
                    i13++;
                    i24 = i21;
                    iM55979 = (C0946.m55979("ۧۢ") ^ i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i2 = ((iM55979 ^ i9) * (-27309)) ^ 551857308;
                    i3 = -2042125951;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -1026485390:
                case -981489545:
                    j &= j - 1;
                    i21 = i23;
                    iM55979 = (C0946.m55979("ܳۨ") + i8) * 21;
                    i2 = ((iM55979 ^ i9) * 5739) ^ 341593913;
                    i3 = 248084174;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -862225567:
                case 1964193408:
                    C0937.m55918();
                    if (C1194.f82045 == 0) {
                        iM55680 = (i9 - C0873.m55680("۟֫")) * 35;
                        i10 = ((iM55680 ^ i8) * (-1103)) ^ (-1262347358);
                        i4 = -745047228;
                        i11 = iM55680 ^ i4;
                        i7 = i;
                    } else {
                        iM55979 = C0873.m55680("ܰ᩷") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-3931)) ^ (-1782263215);
                        i3 = -1114071191;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    }
                    break;
                case -475151042:
                case 641479695:
                    i15 = Integer.MAX_VALUE;
                    iM55979 = (i8 - C0946.m55979("᩸۟")) * 9;
                    i2 = ((iM55979 ^ i9) * (-13173)) ^ 796157900;
                    i3 = -891845605;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -449134598:
                case 40451695:
                    i20 = i19 + iNumberOfTrailingZeros;
                    if (C1025.f81947 >= 0) {
                        iM55979 = (i8 - C0873.m55680("۫᩵")) * 99;
                        i2 = ((iM55979 ^ i9) * (-19117)) ^ 1915060605;
                        i3 = -529725962;
                    } else {
                        iM55979 = (C0873.m55680("ۚܳ") + i8) * (-37);
                        i2 = ((iM55979 ^ i9) * (-31451)) ^ 1881692091;
                        i3 = -2109468070;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case -168704800:
                case 451650484:
                    i23 = i21 + i22;
                    bArr2[i21] = bArr[i20];
                    if (AbstractC0942.f81890 > 0) {
                        iM55979 = C0946.m55979("ۡ᩹") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-4207)) ^ 587728661;
                        i3 = 385604598;
                        i11 = iM55979 ^ i3;
                        i10 = i2;
                    } else {
                        i5 = i26;
                        int iM559711 = C0946.m55979("᩹֡") ^ i8;
                        i11 = iM559711 ^ (-1590023180);
                        i26 = i5;
                        i10 = ((iM559711 ^ i9) * (-17839)) ^ 2134434049;
                        i7 = i;
                    }
                    break;
                case 175385322:
                case 1573120404:
                    j = jArr[i13];
                    i21 = i24;
                    iM55979 = (C0946.m55979("ܳۨ") + i8) * 21;
                    i2 = ((iM55979 ^ i9) * 5739) ^ 341593913;
                    i3 = 248084174;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case 467132188:
                case 1379597222:
                    i15 = i7 + i26;
                    iM55979 = (i8 - C0946.m55979("᩸۟")) * 9;
                    i2 = ((iM55979 ^ i9) * (-13173)) ^ 796157900;
                    i3 = -891845605;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case 536475972:
                case 1110357950:
                    i5 = i26;
                    bArr = new byte[i5];
                    if (RunnableC0871.f81839 < 0) {
                        iM55681 = (C0873.m55680("᩵ᩳ") ^ i9) * 123;
                        i2 = ((iM55681 ^ i8) * (-21497)) ^ (-782988718);
                        i6 = -909539665;
                        i11 = iM55681 ^ i6;
                        i7 = i;
                        i26 = i5;
                        i10 = i2;
                    } else {
                        int iM559712 = C0946.m55979("᩹֡") ^ i8;
                        i11 = iM559712 ^ (-1590023180);
                        i26 = i5;
                        i10 = ((iM559712 ^ i9) * (-17839)) ^ 2134434049;
                        i7 = i;
                    }
                    break;
                case 821166645:
                case 1694014709:
                    iArr = new int[i27];
                    bArr2 = new byte[i27];
                    i13 = i18;
                    i24 = 0;
                    iM55979 = (C0946.m55979("ۧۢ") ^ i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i2 = ((iM55979 ^ i9) * (-27309)) ^ 551857308;
                    i3 = -2042125951;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case 1408794301:
                case 1549178732:
                    interfaceC23667Arr[i14].mo34202(bArr, i7, i15, jArr);
                    if (C1124.m56367() >= 0) {
                        iM55979 = (C0873.m55680("᩹ܿ") + i9) * 69;
                        i2 = ((iM55979 ^ i8) * 23305) ^ (-1986676329);
                        i3 = 1005586520;
                    } else {
                        iM55979 = C0873.m55680("ۖ᩻") ^ i8;
                        i2 = ((iM55979 ^ i9) * (-10031)) ^ 1037087478;
                        i3 = 1781285114;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case 1477647713:
                case 1657951661:
                    i12 = 1024;
                    jArr = new long[1024];
                    if (i7 > 2147418111) {
                        iM55979 = C0873.m55680("۫ܽ") ^ i9;
                        i2 = ((iM55979 ^ i8) * (-19227)) ^ (-1808263821);
                        i3 = -1603812584;
                    } else {
                        iM55979 = (C0946.m55979("ۗ۫") + i8) * 45;
                        i2 = ((iM55979 ^ i9) * 21023) ^ 470920742;
                        i3 = 431331798;
                    }
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
                case 1614382173:
                case 1856216018:
                    return m43167(bArr2, i7, iArr);
                default:
                    i16++;
                    i27 = i17;
                    iM55979 = C0873.m55680("ܺᩴ") ^ i8;
                    i2 = ((iM55979 ^ i9) * (-9909)) ^ (-1754356522);
                    i3 = 1691923996;
                    i11 = iM55979 ^ i3;
                    i10 = i2;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x017a A[PHI: r1 r2
      0x017a: PHI (r1v4 char) = (r1v3 char), (r1v2 char), (r1v2 char) binds: [B:56:0x0178, B:52:0x015b, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x017a: PHI (r2v4 short) = (r2v2 short), (r2v3 short), (r2v2 short) binds: [B:56:0x0178, B:52:0x015b, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01aa A[PHI: r3
      0x01aa: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:60:0x01a8, B:48:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d8 A[PHI: r0 r4 r5
      0x01d8: PHI (r0v5 short[]) = (r0v4 short[]), (r0v2 short[]), (r0v2 short[]) binds: [B:64:0x01d6, B:44:0x011b, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:64:0x01d6, B:44:0x011b, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short) binds: [B:64:0x01d6, B:44:0x011b, B:12:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۧ */
    public static IOException m43170(String str) {
        int iM55680;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1710833034;
        int i8 = RunnableC0938.f81886;
        int i9 = C0906.f81862;
        int iM55681 = (i8 - C0873.m55680("ܺۚ")) * 71;
        int i10 = ((iM55681 ^ i9) * 13543) ^ 2046762936;
        int i11 = -1652175655;
        while (true) {
            int i12 = iM55681 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-17791)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1860252500:
                    case -1214060809:
                        c = 549;
                        if (C1046.f81962 <= 0) {
                            iM55680 = (C0873.m55680("۠ۤ") + i8) * 77;
                            i = ((iM55680 ^ i9) * 15409) ^ (-1160018380);
                            i2 = -1892066094;
                        } else {
                            iM55680 = C0873.m55680("֨ܰ") ^ i8;
                            i = ((iM55680 ^ i9) * 18595) ^ 2124607715;
                            i2 = 1174145418;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1599523367:
                    case 1460866244:
                        RunnableC0938.m55938();
                        return null;
                    case -1403896071:
                    case -1227141194:
                        C0937.m55918();
                        if (C1025.f81947 >= 0) {
                        }
                        iM55680 = (i9 - C0946.m55979("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i8) * 31719) ^ 483791025;
                        i2 = -2042010606;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1212083282:
                    case 235527666:
                        if ((i5 + 1) - i4 > 0) {
                            iM55680 = C0946.m55979("ܿۚ") ^ i9;
                            i = ((iM55680 ^ i8) * 4147) ^ 1965403317;
                            i2 = 1537747922;
                        } else {
                            iM55680 = (C0946.m55979("᩵ۨ") + i8) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i = ((iM55680 ^ i9) * (-23317)) ^ 1132642418;
                            i2 = -2068438770;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -1068444551:
                    case -190809470:
                        i6 = 58006;
                        iM55680 = C0873.m55680("֫ܺ") ^ i8;
                        i = ((iM55680 ^ i9) * 9645) ^ 286285096;
                        i2 = -716623185;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -954384736:
                    case -220496017:
                        i5 = s * s2;
                        if (C0946.f81894 != 0) {
                            iM55680 = (i9 - C0946.m55979("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM55680 ^ i8) * 31719) ^ 483791025;
                            i2 = -2042010606;
                        } else {
                            iM55680 = C0946.m55979("ۡ֫") ^ i9;
                            i = ((iM55680 ^ i8) * 131) ^ (-1957306595);
                            i2 = -1593724621;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -844083984:
                    case -736141272:
                        s = sArr[c];
                        if (C0946.f81894 != 0) {
                            iM55680 = (C0873.m55680("۠ۤ") + i8) * 77;
                            i = ((iM55680 ^ i9) * 15409) ^ (-1160018380);
                            i2 = -1892066094;
                        } else {
                            iM55680 = C0946.m55979("ܳ᩹") ^ i9;
                            i = ((iM55680 ^ i8) * (-20535)) ^ (-691724844);
                            i2 = -822045858;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -467047940:
                    case -394850209:
                        sArr = f82286;
                        if (AbstractC0942.f81890 <= 0) {
                            iM55680 = (C0873.m55680("ۨۤ") ^ i8) * (-55);
                            i = ((iM55680 ^ i9) * 5147) ^ (-1392733968);
                            i2 = 518087344;
                        } else {
                            iM55680 = C0873.m55680("۬۫") ^ i9;
                            i = ((iM55680 ^ i8) * (-16991)) ^ 678116233;
                            i2 = 1481214823;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -357973923:
                    case 1861554180:
                        C0930.m55885();
                        C0967.m56074();
                        break;
                    case -229282043:
                    case 1647220122:
                        if (!C0955.f81898) {
                        }
                        iM55680 = (C0873.m55680("۠ۤ") + i8) * 77;
                        i = ((iM55680 ^ i9) * 15409) ^ (-1160018380);
                        i2 = -1892066094;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -146677709:
                    case 1054167684:
                        if (RunnableC0938.m55938() != 0) {
                            iM55680 = C0946.m55979("۠ᩴ") ^ i9;
                            i = ((iM55680 ^ i8) * 21835) ^ (-1419877965);
                            i2 = -1379532723;
                        } else {
                            iM55680 = C0873.m55680("ۡۘ") ^ i8;
                            i = ((iM55680 ^ i9) * 9925) ^ 1325381557;
                            i2 = 641852874;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case -80432331:
                    case 347415984:
                        i4 = i3 * i3;
                        s2 = 2;
                        if (C1028.f81950 <= 0) {
                            iM55680 = (C0873.m55680("ۨۤ") ^ i8) * (-55);
                            i = ((iM55680 ^ i9) * 5147) ^ (-1392733968);
                            i2 = 518087344;
                        } else {
                            iM55680 = (i8 - C0946.m55979("᩸ۜ")) * (-45);
                            i = ((iM55680 ^ i9) * (-28807)) ^ 933413662;
                            i2 = -1667364718;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 47077874:
                    case 188735206:
                        if (C0892.f81851) {
                            iM55680 = (C0873.m55680("ۨۤ") ^ i8) * (-55);
                            i = ((iM55680 ^ i9) * 5147) ^ (-1392733968);
                            i2 = 518087344;
                            i12 = iM55680 ^ i2;
                            i10 = i;
                        }
                        iM55680 = (i9 - C0946.m55979("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((iM55680 ^ i8) * 31719) ^ 483791025;
                        i2 = -2042010606;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 403760883:
                    case 707321071:
                        i6 = 27200;
                        iM55680 = C0873.m55680("֫ܺ") ^ i8;
                        i = ((iM55680 ^ i9) * 9645) ^ 286285096;
                        i2 = -716623185;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    case 1611193555:
                    case 1759673624:
                        i3 = s + 1;
                        if (AbstractC0942.f81890 <= 0) {
                            iM55680 = C0946.m55979("۠ᩴ") ^ i9;
                            i = ((iM55680 ^ i8) * 21835) ^ (-1419877965);
                            i2 = -1379532723;
                        } else {
                            iM55680 = (C0873.m55680("ܳܳ") + i9) * (-101);
                            i = ((iM55680 ^ i8) * (-19285)) ^ 200376964;
                            i2 = 167874076;
                        }
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                    default:
                        short[] sArr2 = f82286;
                        if (C0898.f81858 > 0) {
                            if (C0906.f81862 < 0) {
                                if (C0912.f81867 > 0) {
                                    return new IOException(C21466.m48631(C0947.m55993(sArr2, 550, 24, i6), str));
                                }
                            }
                            iM55680 = (i9 - C0946.m55979("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((iM55680 ^ i8) * 31719) ^ 483791025;
                            i2 = -2042010606;
                            i12 = iM55680 ^ i2;
                            i10 = i;
                        }
                        iM55680 = (C0873.m55680("۠ۤ") + i8) * 77;
                        i = ((iM55680 ^ i9) * 15409) ^ (-1160018380);
                        i2 = -1892066094;
                        i12 = iM55680 ^ i2;
                        i10 = i;
                        break;
                }
            }
            iM55681 = (i9 - C0873.m55680("ܰ᩹")) * 27;
            i10 = ((iM55681 ^ i8) * (-31937)) ^ (-805255399);
            i11 = 583264018;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43158(int i, int[] iArr) {
        int i2 = 0;
        int length = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1936110353;
        int i7 = RunnableC0938.f81886;
        int i8 = C0992.f81922;
        int iM55979 = (i8 - C0946.m55979("᩶۟")) * 63;
        int i9 = ((iM55979 ^ i7) * 22411) ^ (-1773872245);
        int i10 = 1297164254;
        while (true) {
            i6 = ((((i6 ^ i7) * (-10931)) >> 31) & i9) ^ (iM55979 ^ i10);
            switch (i6) {
                case -1917601776:
                case 2129525132:
                    if (C0854.m55595() >= 0) {
                        iM55979 = (C0946.m55979("ۢ᩻") + i7) * (-117);
                        i9 = ((iM55979 ^ i8) * 4257) ^ 759079975;
                        i10 = 2118338202;
                    } else {
                        iM55979 = (C0873.m55680("ۢܽ") + i8) * (-49);
                        i9 = ((iM55979 ^ i7) * 21991) ^ (-144754632);
                        i10 = -461299971;
                    }
                    break;
                case -1361951796:
                case -281854449:
                    i5 = i3 >>> i4;
                    if (iArr[i5] < i) {
                        iM55979 = (i7 - C0873.m55680("ᩳ᩵")) * (-99);
                        i9 = ((iM55979 ^ i8) * 11625) ^ 1836304749;
                        i10 = -386899473;
                    } else {
                        length = i5;
                        iM55979 = (C0873.m55680("۫ۛ") + i7) * 115;
                        i9 = ((iM55979 ^ i8) * 22671) ^ 1507658984;
                        i10 = -1226162752;
                    }
                    break;
                case -1350101001:
                case 638613204:
                    if (C0892.f81851) {
                        iM55979 = (C0873.m55680("ۘܽ") + i7) * (-55);
                        i9 = ((iM55979 ^ i8) * (-8219)) ^ 1619549866;
                        i10 = 440250347;
                    } else {
                        iM55979 = (C0946.m55979("ۢ᩻") + i7) * (-117);
                        i9 = ((iM55979 ^ i8) * 4257) ^ 759079975;
                        i10 = 2118338202;
                    }
                    break;
                case -1342002173:
                case 1751751106:
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("֨᩶") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-32517)) ^ (-1540575419);
                        i10 = -667632832;
                    } else {
                        iM55979 = C0873.m55680("ۖܶ") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-29599)) ^ 1702224537;
                        i10 = 1109804327;
                    }
                    break;
                case -1296581467:
                case 1430025419:
                    length = iArr.length;
                    i2 = 0;
                    iM55979 = (C0873.m55680("۫ۛ") + i7) * 115;
                    i9 = ((iM55979 ^ i8) * 22671) ^ 1507658984;
                    i10 = -1226162752;
                    break;
                case -1108982612:
                case 95333557:
                    if (C1025.m56230()) {
                        iM55979 = (C0946.m55979("֫ۤ") + i8) * 21;
                        i9 = ((iM55979 ^ i7) * 21871) ^ (-1230220891);
                        i10 = -1120818923;
                    } else {
                        iM55979 = (C0873.m55680("ۨ֨") ^ i8) * 37;
                        i9 = ((iM55979 ^ i7) * 30107) ^ (-353139725);
                        i10 = -1813148679;
                    }
                    break;
                case -1015094744:
                case 1294822260:
                    RunnableC0897.m55784();
                    C1194.m56396();
                    return 0;
                case -990474870:
                case 1317854823:
                    return i2;
                case -953636664:
                case 179079738:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("֨᩶") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-32517)) ^ (-1540575419);
                        i10 = -667632832;
                    } else {
                        iM55979 = (C0873.m55680("ܳۛ") + i7) * 35;
                        i9 = ((iM55979 ^ i8) * 9349) ^ 1215274030;
                        i10 = -1231960319;
                    }
                    break;
                case -884787918:
                case 2128110407:
                    i2 = i5 + 1;
                    iM55979 = (C0873.m55680("۫ۛ") + i7) * 115;
                    i9 = ((iM55979 ^ i8) * 22671) ^ 1507658984;
                    i10 = -1226162752;
                    break;
                case -876778743:
                case 720937476:
                    if (C0906.m55809() <= 0) {
                        iM55979 = (C0946.m55979("۫ۙ") ^ i8) * (-79);
                        i9 = ((iM55979 ^ i7) * 19909) ^ 8011312;
                        i10 = -1410831550;
                    } else {
                        iM55979 = (i8 - C0946.m55979("֡֨")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((iM55979 ^ i7) * 12565) ^ 62093363;
                        i10 = -527505498;
                    }
                    break;
                case -126695665:
                case 97186351:
                    i3 = i2 + length;
                    i4 = 1;
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0946.m55979("֫ۤ") + i8) * 21;
                        i9 = ((iM55979 ^ i7) * 21871) ^ (-1230220891);
                        i10 = -1120818923;
                    } else {
                        iM55979 = (C0873.m55680("ۗᩴ") ^ i8) * 15;
                        i9 = ((iM55979 ^ i7) * (-2699)) ^ (-1427329218);
                        i10 = 54931276;
                    }
                    break;
                case 14594588:
                case 1484412776:
                    AbstractC0942.m55971();
                    if (C1929.f83011 != 0) {
                        iM55979 = (C0873.m55680("ۧ֡") + i8) * 77;
                        i9 = ((iM55979 ^ i7) * 29823) ^ 36532352;
                        i10 = 239699000;
                    } else {
                        iM55979 = (C0946.m55979("ۢ᩻") + i7) * (-117);
                        i9 = ((iM55979 ^ i8) * 4257) ^ 759079975;
                        i10 = 2118338202;
                    }
                    break;
                case 279471172:
                case 1059755790:
                    if (i2 < length) {
                        iM55979 = (C0873.m55680("᩻᩶") ^ i7) * 9;
                        i9 = ((iM55979 ^ i8) * (-10255)) ^ (-1118722983);
                        i10 = -661138186;
                    } else {
                        iM55979 = C0873.m55680("ᩳۘ") ^ i8;
                        i9 = ((iM55979 ^ i7) * 7991) ^ 341813316;
                        i10 = -1557238446;
                    }
                    break;
                case 473651261:
                case 883180839:
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("֨᩶") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-32517)) ^ (-1540575419);
                        i10 = -667632832;
                    } else {
                        iM55979 = C0946.m55979("֨۫") ^ i8;
                        i9 = ((iM55979 ^ i7) * (-32465)) ^ 1868527589;
                        i10 = 713660283;
                    }
                    break;
                case 738228551:
                case 1154953943:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("֨᩶") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-32517)) ^ (-1540575419);
                        i10 = -667632832;
                    } else {
                        iM55979 = (C0873.m55680("ܽۡ") + i7) * 39;
                        i9 = ((iM55979 ^ i8) * 20825) ^ (-236298242);
                        i10 = 1194836814;
                    }
                    break;
                case 741221691:
                case 1872031213:
                    C0955.m56025();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("֨᩶") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-32517)) ^ (-1540575419);
                        i10 = -667632832;
                    } else {
                        iM55979 = (C0946.m55979("֫ۤ") + i8) * 21;
                        i9 = ((iM55979 ^ i7) * 21871) ^ (-1230220891);
                        i10 = -1120818923;
                    }
                    break;
                case 1238871460:
                case 1748826749:
                    C0877.m55696();
                    C0927.m55873();
                    iM55979 = (C0946.m55979("֫ۤ") + i8) * 21;
                    i9 = ((iM55979 ^ i7) * 21871) ^ (-1230220891);
                    i10 = -1120818923;
                    break;
                case 1837359202:
                case 2005995194:
                    C0845.m55584();
                    if (C0989.f81920 < 0) {
                        iM55979 = (C0946.m55979("ۢ᩻") + i7) * (-117);
                        i9 = ((iM55979 ^ i8) * 4257) ^ 759079975;
                        i10 = 2118338202;
                    } else {
                        iM55979 = C0873.m55680("֨᩶") ^ i7;
                        i9 = ((iM55979 ^ i8) * (-32517)) ^ (-1540575419);
                        i10 = -667632832;
                    }
                    break;
                default:
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("ۧ֡") + i8) * 77;
                        i9 = ((iM55979 ^ i7) * 29823) ^ 36532352;
                        i10 = 239699000;
                    } else {
                        iM55979 = (C0873.m55680("۠ۡ") ^ i7) * 7;
                        i9 = ((iM55979 ^ i8) * (-12873)) ^ (-435287494);
                        i10 = -1789095953;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:245:0x14fb A[PHI: r0 r1 r5 r6 r8 r9 r10 r12 r16 r20 r21 r24 r25 r27 r28 r29 r33 r34 r35 r36 r38 r39 r41 r42 r46 r48
      0x14fb: PHI (r0v147 int) = (r0v51 int), (r0v56 int), (r0v148 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r1v154 short) = (r1v43 short), (r1v59 short), (r1v155 short) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r5v141 int) = (r5v53 int), (r5v58 int), (r5v142 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r6v148 long) = (r6v78 long), (r6v83 long), (r6v149 long) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r8v84 int) = (r8v39 int), (r8v44 int), (r8v85 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r9v130 int) = (r9v83 int), (r9v88 int), (r9v131 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r10v79 int) = (r10v33 int), (r10v39 int), (r10v80 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r12v94 int) = (r12v40 int), (r12v46 int), (r12v95 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r16v41 int) = (r16v4 int), (r16v9 int), (r16v42 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r20v46 int) = (r20v3 int), (r20v8 int), (r20v47 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r21v64 int) = (r21v18 int), (r21v23 int), (r21v65 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r24v88 byte[]) = (r24v44 byte[]), (r24v50 byte[]), (r24v89 byte[]) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r25v94 int) = (r25v51 int), (r25v56 int), (r25v95 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r27v98 int) = (r27v52 int), (r27v57 int), (r27v99 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r28v66 l.ۧᩳܳ) = (r28v30 l.ۧᩳܳ), (r28v35 l.ۧᩳܳ), (r28v67 l.ۧᩳܳ) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r29v99 int) = (r29v47 int), (r29v52 int), (r29v100 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r33v98 int) = (r33v42 int), (r33v47 int), (r33v99 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r34v85 int) = (r34v30 int), (r34v35 int), (r34v86 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r35v93 l.۫ܽܳ) = (r35v41 l.۫ܽܳ), (r35v46 l.۫ܽܳ), (r35v94 l.۫ܽܳ) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r36v72 int) = (r36v31 int), (r36v36 int), (r36v73 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r38v63 int[]) = (r38v25 int[]), (r38v30 int[]), (r38v64 int[]) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r39v65 long) = (r39v30 long), (r39v35 long), (r39v66 long) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r41v3 int) = (r41v1 int), (r41v2 int), (r41v1 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r42v54 int) = (r42v23 int), (r42v28 int), (r42v55 int) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r46v105 long) = (r46v49 long), (r46v55 long), (r46v106 long) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]
      0x14fb: PHI (r48v25 long) = (r48v3 long), (r48v8 long), (r48v26 long) binds: [B:244:0x14f9, B:223:0x12e8, B:14:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x03d2 A[PHI: r9 r34 r35
      0x03d2: PHI (r9v119 int) = (r9v118 int), (r9v2 int) binds: [B:61:0x03b3, B:54:0x0358] A[DONT_GENERATE, DONT_INLINE]
      0x03d2: PHI (r34v61 l.۫ܽܳ) = (r34v60 l.۫ܽܳ), (r34v62 l.۫ܽܳ) binds: [B:61:0x03b3, B:54:0x0358] A[DONT_GENERATE, DONT_INLINE]
      0x03d2: PHI (r35v74 int) = (r35v73 int), (r35v75 int) binds: [B:61:0x03b3, B:54:0x0358] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x014e, code lost:
    
        if (p067l.C0892.m55749() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0150, code lost:
    
        r35 = r3;
        r36 = r6;
        r42 = r11;
        r38 = r12;
        r12 = r22;
        r8 = r24;
        r39 = r27;
        r46 = r51;
        r34 = r53;
        r28 = r0;
        r27 = r2;
        r24 = r10;
        r0 = r20;
        r10 = r26;
        r20 = r5;
        r5 = r7;
        r6 = r49;
        r48 = r16;
        r16 = r25;
        r25 = r9;
        r9 = r21;
        r21 = r29;
        r29 = r33;
        r33 = r1;
        r1 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02b2, code lost:
    
        if (p067l.C0949.f81897 < 0) goto L28;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C19013 m43164(DataInput dataInput, int i, int i2, C14279[] c14279Arr, C18817 c18817) throws IOException {
        C14279 c14279;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        long j;
        long j2;
        int i9;
        AbstractC12979 abstractC12979;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int iM55680;
        int i13;
        int i14;
        int iM55681;
        int i15;
        C14279 c142710;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        long j3;
        long j4;
        long j5;
        int i20;
        AbstractC12979 abstractC129710;
        int i21;
        int i22;
        byte[] bArr2;
        int iM55682;
        int i23;
        int i24;
        int i25;
        int iM55979;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int iM559710;
        C14279 c142711;
        int i33;
        int i34;
        long j6;
        int i35;
        int i36;
        int i37;
        byte[] bArr3;
        int[] iArr3;
        long j7;
        int iM55683;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        long j8;
        long j9;
        AbstractC12979 abstractC129711;
        int i44;
        int i45;
        int i46;
        C14279 c142712;
        C14279 c142713;
        int i47;
        int i48;
        int i49;
        int iM559711;
        int i50;
        C14279 c142714;
        int i51;
        int i52;
        int[] iArr4;
        int i53;
        int i54;
        long j10;
        int i55;
        int i56;
        byte[] bArr4;
        int i57;
        int i58;
        int i59;
        int i60;
        long j11;
        long j12;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        short s;
        int iM559712;
        int i67;
        int i68;
        int iM55684;
        int i69;
        int i70;
        int i71;
        int i72;
        int i73;
        int i74;
        int[] iArr5;
        int i75;
        int i76;
        long j13;
        long j14;
        int i77;
        AbstractC12979 abstractC129712;
        int i78;
        int i79;
        byte[] bArr5;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        int i86;
        long j15;
        int i87;
        int i88;
        int i89;
        int iM55685;
        int i90;
        int i91;
        C14279 c142715;
        int i92;
        int i93;
        int i94;
        int[] iArr6;
        int i95;
        long j16;
        long j17;
        int i96;
        byte[] bArr6;
        int i97;
        int i98;
        int i99;
        long j18;
        int i100;
        int i101;
        int i102;
        int i103;
        int iM559713;
        int i104;
        int i105;
        long j19;
        long j20;
        int i106;
        int i107;
        int i108;
        long j21;
        int i109;
        int i110;
        int i111;
        long j22;
        int i112;
        AbstractC12979 abstractC12979M29749;
        C14279 c142716;
        long j23;
        C14279 c142717;
        int iM32812;
        int i113;
        int i114;
        int iM55686;
        int i115;
        int i116;
        int iM559714;
        int i117;
        C14279 c142718;
        int i118;
        int iM559715;
        int i119;
        int iM55687;
        int i120;
        int i121;
        int i122 = 0;
        int i123 = 0;
        int i124 = 0;
        int i125 = -1917323529;
        int i126 = C0906.f81862;
        int i127 = C1964.f83032;
        int iM559716 = C0946.m55979("ᩳ᩸") ^ i127;
        int i128 = ((iM559716 ^ i126) * (-7583)) ^ 41928381;
        int i129 = iM559716 ^ 1320928458;
        long j24 = 0;
        long j25 = 0;
        InterfaceC23667[] interfaceC23667Arr = null;
        long j26 = 0;
        int[] iArr7 = null;
        long j27 = 0;
        AbstractC12979 abstractC129713 = null;
        C14279 c142719 = null;
        int i130 = 0;
        int i131 = 0;
        int i132 = 0;
        int i133 = 0;
        int i134 = 0;
        int iMo23869 = 0;
        int i135 = 0;
        int i136 = 0;
        int i137 = 0;
        int i138 = 0;
        int i139 = 0;
        int i140 = 0;
        short s2 = 0;
        int i141 = 0;
        int i142 = 0;
        long j28 = 0;
        byte[] bArr7 = null;
        long j29 = 0;
        int i143 = 0;
        int i144 = 0;
        int i145 = 0;
        int i146 = 0;
        while (true) {
            i125 = i129 ^ (i128 & (((i125 ^ i126) * (-28495)) >> 31));
            switch (i125) {
                case -2144599380:
                case 219665474:
                    C0930.m55885();
                    return null;
                case -2134488060:
                case 409566028:
                    C14279 c142720 = c142719;
                    i132 = i132;
                    int i147 = i133;
                    int i148 = i134;
                    int i149 = i141;
                    int i150 = i130;
                    if (i131 < abstractC129713.mo23868()) {
                        iM55686 = (i127 - C0873.m55680("᩸ܿ")) * (-97);
                        i115 = ((iM55686 ^ i126) * 7253) ^ (-977578879);
                        i116 = 518273833;
                    } else {
                        iM55686 = C0873.m55680("᩺᩹") ^ i126;
                        i115 = ((iM55686 ^ i127) * 4247) ^ (-1315228575);
                        i116 = -720813146;
                    }
                    i129 = iM55686 ^ i116;
                    i130 = i150;
                    i134 = i148;
                    i133 = i147;
                    i141 = i149;
                    c142719 = c142720;
                    i128 = i115;
                    i132 = i132;
                    break;
                case -2126192102:
                case 661298356:
                    C1046.m56302();
                    if (C0898.f81858 <= 0) {
                        c14279 = c142719;
                        i3 = i132;
                        i4 = i133;
                        i5 = i134;
                        i6 = i143;
                        iArr = iArr7;
                        i7 = i145;
                        i8 = i146;
                        j = j29;
                        j2 = j27;
                        i9 = i142;
                        abstractC12979 = abstractC129713;
                        i10 = i131;
                        i11 = iMo23869;
                        bArr = bArr7;
                        int i151 = i141;
                        i130 = i130;
                        i140 = i140;
                        i12 = i151;
                        iM559710 = (C0946.m55979("ܽᩳ") + i127) * (-55);
                        i32 = ((iM559710 ^ i126) * 28139) ^ 1660239401;
                        i31 = -516150150;
                        int i152 = iM559710 ^ i31;
                        bArr7 = bArr;
                        iMo23869 = i11;
                        i131 = i10;
                        abstractC129713 = abstractC12979;
                        i142 = i9;
                        iArr7 = iArr;
                        j29 = j;
                        i143 = i6;
                        j27 = j2;
                        i146 = i8;
                        i129 = i152;
                        i145 = i7;
                        i133 = i4;
                        i132 = i3;
                        i128 = i32;
                        i134 = i5;
                        c142719 = c14279;
                        int i153 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i153;
                    } else {
                        c142714 = c142719;
                        i51 = i133;
                        i52 = i143;
                        iArr4 = iArr7;
                        i53 = i144;
                        i54 = i145;
                        j3 = j29;
                        j10 = j27;
                        i55 = i142;
                        abstractC129710 = abstractC129713;
                        i56 = i131;
                        bArr4 = bArr7;
                        i57 = i137;
                        i58 = i139;
                        i59 = i132;
                        i60 = i134;
                        j11 = j26;
                        j12 = j25;
                        i61 = i146;
                        i62 = iMo23869;
                        i63 = i138;
                        i64 = i140;
                        i65 = i141;
                        i66 = i130;
                        s = s2;
                        iM559712 = (C0873.m55680("ᩴܶ") ^ i126) * 29;
                        i67 = ((iM559712 ^ i127) * (-20943)) ^ (-1803705912);
                        i68 = 1415775817;
                        s2 = s;
                        i128 = i67;
                        i139 = i58;
                        i144 = i53;
                        bArr7 = bArr4;
                        i130 = i66;
                        i142 = i55;
                        c142719 = c142714;
                        iArr7 = iArr4;
                        i143 = i52;
                        j27 = j10;
                        i129 = iM559712 ^ i68;
                        i145 = i54;
                        i131 = i56;
                        i141 = i65;
                        i140 = i64;
                        i138 = i63;
                        iMo23869 = i62;
                        i146 = i61;
                        j25 = j12;
                        j26 = j11;
                        i133 = i51;
                        i134 = i60;
                        i132 = i59;
                        i137 = i57;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                    }
                    break;
                case -2032555242:
                case -1630801214:
                    c142711 = c142719;
                    i33 = i134;
                    i34 = i145;
                    j6 = j26;
                    i12 = i141;
                    c18817.m42870(j6);
                    i35 = 0;
                    iArr7 = new int[i34];
                    bArr7 = new byte[i34];
                    i142 = -1;
                    int iM559717 = C0946.m55979("ܺۙ") ^ i127;
                    j26 = j6;
                    i145 = i34;
                    i131 = i131;
                    abstractC129713 = abstractC129713;
                    i133 = i133;
                    j29 = j29;
                    j27 = j27;
                    i134 = i33;
                    i129 = iM559717 ^ 1422243695;
                    i128 = ((iM559717 ^ i126) * 14895) ^ 1490668888;
                    iMo23869 = iMo23869;
                    c142719 = c142711;
                    i146 = i146;
                    i132 = i35;
                    i143 = i143;
                    int i154 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i154;
                    break;
                case -1999621811:
                case -391622665:
                    c142718 = c142719;
                    i118 = i134;
                    iMo23869 = abstractC129713.mo23869(i131);
                    if (i131 != 0) {
                        iM559715 = (C0946.m55979("᩵ܿ") ^ i126) * 89;
                        i128 = ((iM559715 ^ i127) * (-21871)) ^ (-931466036);
                        i119 = -1982272985;
                    } else {
                        iM559715 = (C0946.m55979("᩷ᩳ") + i127) * 11;
                        i128 = ((iM559715 ^ i126) * (-24711)) ^ 1469016968;
                        i119 = 2066828817;
                    }
                    i129 = iM559715 ^ i119;
                    c142719 = c142718;
                    i134 = i118;
                    break;
                case -1936744614:
                case 222136277:
                    c142715 = c142719;
                    i101 = i138;
                    i102 = i140;
                    i103 = i141;
                    j19 = j27;
                    i97 = i137;
                    i99 = i132;
                    j20 = j28;
                    c18817.m42870(j20);
                    interfaceC23667Arr = new InterfaceC23667[i97];
                    j18 = j25;
                    i100 = (int) j18;
                    i136 = 0;
                    int iM559718 = C0946.m55979("֡᩶") ^ i127;
                    j28 = j20;
                    i128 = ((iM559718 ^ i126) * 2407) ^ (-1486684508);
                    j26 = j26;
                    i139 = i139;
                    i144 = i144;
                    bArr7 = bArr7;
                    i142 = i142;
                    i133 = i133;
                    iArr7 = iArr7;
                    i143 = i143;
                    j27 = j19;
                    i134 = i134;
                    i129 = iM559718 ^ (-686198040);
                    i145 = i145;
                    i132 = i99;
                    c142719 = c142715;
                    i137 = i97;
                    abstractC129713 = abstractC129713;
                    int i155 = i102;
                    i138 = i101;
                    iMo23869 = iMo23869;
                    i146 = i100;
                    j25 = j18;
                    i131 = i131;
                    i130 = i130;
                    j29 = j29;
                    i141 = i103;
                    i140 = i155;
                    break;
                case -1929856394:
                case -834237909:
                    C14279 c142721 = c142719;
                    iArr7[i132] = i123;
                    bArr7[i132] = dataInput.readByte();
                    i34 = i145;
                    i142 = i141;
                    i33 = i134;
                    j6 = j26;
                    i35 = i132 + 1;
                    c142711 = c142721;
                    i12 = i142;
                    int iM559719 = C0946.m55979("ܺۙ") ^ i127;
                    j26 = j6;
                    i145 = i34;
                    i131 = i131;
                    abstractC129713 = abstractC129713;
                    i133 = i133;
                    j29 = j29;
                    j27 = j27;
                    i134 = i33;
                    i129 = iM559719 ^ 1422243695;
                    i128 = ((iM559719 ^ i126) * 14895) ^ 1490668888;
                    iMo23869 = iMo23869;
                    c142719 = c142711;
                    i146 = i146;
                    i132 = i35;
                    i143 = i143;
                    int i156 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i156;
                    break;
                case -1925214917:
                case 736891740:
                    C0892.m55749();
                    if (!C0861.m55626()) {
                        c142714 = c142719;
                        i51 = i133;
                        i52 = i143;
                        iArr4 = iArr7;
                        i53 = i144;
                        i54 = i145;
                        j3 = j29;
                        j10 = j27;
                        i55 = i142;
                        abstractC129710 = abstractC129713;
                        i56 = i131;
                        bArr4 = bArr7;
                        i57 = i137;
                        i58 = i139;
                        i59 = i132;
                        i60 = i134;
                        j11 = j26;
                        j12 = j25;
                        i61 = i146;
                        i62 = iMo23869;
                        i63 = i138;
                        i64 = i140;
                        i65 = i141;
                        i66 = i130;
                        s = s2;
                        iM559712 = (C0873.m55680("ᩴܶ") ^ i126) * 29;
                        i67 = ((iM559712 ^ i127) * (-20943)) ^ (-1803705912);
                        i68 = 1415775817;
                        s2 = s;
                        i128 = i67;
                        i139 = i58;
                        i144 = i53;
                        bArr7 = bArr4;
                        i130 = i66;
                        i142 = i55;
                        c142719 = c142714;
                        iArr7 = iArr4;
                        i143 = i52;
                        j27 = j10;
                        i129 = iM559712 ^ i68;
                        i145 = i54;
                        i131 = i56;
                        i141 = i65;
                        i140 = i64;
                        i138 = i63;
                        iMo23869 = i62;
                        i146 = i61;
                        j25 = j12;
                        j26 = j11;
                        i133 = i51;
                        i134 = i60;
                        i132 = i59;
                        i137 = i57;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                    } else {
                        iM55687 = C0946.m55979("ܽۖ") ^ i126;
                        i120 = ((iM55687 ^ i127) * 24359) ^ (-617046363);
                        i121 = -329015416;
                        i129 = iM55687 ^ i121;
                        i128 = i120;
                    }
                    break;
                case -1895562786:
                case 1139033493:
                    c142712 = c142719;
                    i73 = i133;
                    i87 = i134;
                    i74 = i143;
                    iArr5 = iArr7;
                    i88 = i144;
                    i75 = i145;
                    j3 = j29;
                    j13 = j26;
                    j14 = j27;
                    i77 = i142;
                    abstractC129712 = abstractC129713;
                    i78 = i131;
                    bArr5 = bArr7;
                    i89 = i137;
                    i81 = i139;
                    i72 = i132;
                    int i157 = i141;
                    i84 = i130;
                    long j30 = j25;
                    i76 = i146;
                    i79 = iMo23869;
                    i80 = i138;
                    i82 = i140;
                    i83 = i157;
                    if (i2 > 0) {
                        int iM559720 = (C0946.m55979("ܽܶ") + i126) * 25;
                        j15 = j30;
                        int i158 = 219835507 ^ iM559720;
                        i128 = ((iM559720 ^ i127) * (-2059)) ^ (-806903595);
                        i139 = i81;
                        i144 = i88;
                        i132 = i72;
                        bArr7 = bArr5;
                        i130 = i84;
                        i142 = i77;
                        iArr7 = iArr5;
                        i143 = i74;
                        j27 = j14;
                        i137 = i89;
                        i129 = i158;
                        i145 = i75;
                        i131 = i78;
                        abstractC129713 = abstractC129712;
                        i141 = i83;
                        j29 = j3;
                    } else {
                        j15 = j30;
                        iM55685 = C0946.m55979("۠֫") ^ i127;
                        i90 = ((iM55685 ^ i126) * (-25061)) ^ (-1525617836);
                        i91 = -26832862;
                        int i159 = iM55685 ^ i91;
                        i128 = i90;
                        i139 = i81;
                        i144 = i88;
                        i132 = i72;
                        bArr7 = bArr5;
                        i131 = i78;
                        i142 = i77;
                        iArr7 = iArr5;
                        i143 = i74;
                        j27 = j14;
                        i137 = i89;
                        i129 = i159;
                        i145 = i75;
                        abstractC129713 = abstractC129712;
                        i130 = i84;
                        j29 = j3;
                        i141 = i83;
                    }
                    i140 = i82;
                    i138 = i80;
                    iMo23869 = i79;
                    i146 = i76;
                    j25 = j15;
                    j26 = j13;
                    i133 = i73;
                    i134 = i87;
                    c142719 = c142712;
                    break;
                case -1884820052:
                case 1430279860:
                    c142710 = c142719;
                    i3 = i132;
                    i16 = i133;
                    i17 = i134;
                    bArr2 = bArr7;
                    i143 = i143;
                    iArr2 = iArr7;
                    i19 = i146;
                    i25 = i139;
                    j3 = j29;
                    i12 = i141;
                    j4 = j26;
                    j5 = j27;
                    i20 = i142;
                    abstractC129710 = abstractC129713;
                    i130 = i130;
                    i21 = i131;
                    i22 = iMo23869;
                    i28 = i138;
                    i30 = dataInput.readInt();
                    i29 = i19 - i;
                    if (i30 <= 0) {
                        int iM559721 = (i127 - C0946.m55979("ۧ֨")) * 85;
                        int i160 = ((iM559721 ^ i126) * 28705) ^ (-1732506931);
                        j26 = j4;
                        i138 = i28;
                        i139 = i25;
                        bArr7 = bArr2;
                        iMo23869 = i22;
                        i131 = i21;
                        i142 = i20;
                        i133 = i16;
                        i143 = i143;
                        j27 = j5;
                        i129 = iM559721 ^ (-595326423);
                        i145 = i30;
                        i134 = i17;
                        i146 = i19;
                        abstractC129713 = abstractC129710;
                        i130 = i130;
                        c142719 = c142710;
                        j29 = j3;
                        i132 = i3;
                        i128 = i160;
                        i141 = i12;
                        iArr7 = iArr2;
                        i140 = i29;
                    } else {
                        int iM559722 = (i127 - C0946.m55979("۫᩷")) * (-21);
                        int i161 = ((iM559722 ^ i126) * 4681) ^ 1244464299;
                        j26 = j4;
                        i138 = i28;
                        i139 = i25;
                        bArr7 = bArr2;
                        iMo23869 = i22;
                        i131 = i21;
                        i142 = i20;
                        i133 = i16;
                        i143 = i143;
                        j27 = j5;
                        i145 = i30;
                        i134 = i17;
                        i146 = i19;
                        i129 = iM559722 ^ (-2011597448);
                        i130 = i130;
                        c142719 = c142710;
                        iArr7 = iArr2;
                        i132 = i3;
                        i141 = i12;
                        i128 = i161;
                        i140 = i29;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                    }
                    break;
                case -1864380093:
                case 833777519:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    if (C1028.f81950 <= 0) {
                        iM559712 = (C0946.m55979("ܳ֡") ^ i127) * (-41);
                        i67 = ((iM559712 ^ i126) * 27027) ^ (-633349379);
                        i68 = 340503337;
                    } else {
                        iM559712 = (C0873.m55680("᩸۠") + i127) * (-107);
                        i67 = ((iM559712 ^ i126) * 30169) ^ (-419431332);
                        i68 = -783007278;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -1843821783:
                case -1367692626:
                    C0917.m55854();
                    if (!C0947.f81895) {
                        c142715 = c142719;
                        i92 = i133;
                        i93 = i134;
                        i94 = i143;
                        iArr6 = iArr7;
                        i95 = i144;
                        i145 = i145;
                        j29 = j29;
                        j16 = j26;
                        j17 = j27;
                        i96 = i142;
                        abstractC129713 = abstractC129713;
                        i131 = i131;
                        bArr6 = bArr7;
                        i97 = i137;
                        i98 = i139;
                        i99 = i132;
                        int i162 = i141;
                        i130 = i130;
                        j18 = j25;
                        i100 = i146;
                        iMo23869 = iMo23869;
                        i101 = i138;
                        i102 = i140;
                        i103 = i162;
                        iM559713 = (i126 - C0946.m55979("֡֨")) * (-69);
                        i104 = ((iM559713 ^ i127) * 29919) ^ (-1938794049);
                        i105 = -172103592;
                        j26 = j16;
                        i139 = i98;
                        i144 = i95;
                        bArr7 = bArr6;
                        i142 = i96;
                        i133 = i92;
                        iArr7 = iArr6;
                        i143 = i94;
                        j27 = j17;
                        i134 = i93;
                        i129 = iM559713 ^ i105;
                        i128 = i104;
                        i145 = i145;
                        i132 = i99;
                        c142719 = c142715;
                        i137 = i97;
                        abstractC129713 = abstractC129713;
                        int i1510 = i102;
                        i138 = i101;
                        iMo23869 = iMo23869;
                        i146 = i100;
                        j25 = j18;
                        i131 = i131;
                        i130 = i130;
                        j29 = j29;
                        i141 = i103;
                        i140 = i1510;
                    } else {
                        c142714 = c142719;
                        i51 = i133;
                        i52 = i143;
                        iArr4 = iArr7;
                        i53 = i144;
                        i54 = i145;
                        j3 = j29;
                        j10 = j27;
                        i55 = i142;
                        abstractC129710 = abstractC129713;
                        i56 = i131;
                        bArr4 = bArr7;
                        i57 = i137;
                        i58 = i139;
                        i59 = i132;
                        i60 = i134;
                        j11 = j26;
                        j12 = j25;
                        i61 = i146;
                        i62 = iMo23869;
                        i63 = i138;
                        i64 = i140;
                        i65 = i141;
                        i66 = i130;
                        s = s2;
                        iM559712 = (C0946.m55979("ᩴ᩹") ^ i127) * 11;
                        i67 = ((iM559712 ^ i126) * (-19571)) ^ 1939616958;
                        i68 = -1290249815;
                        s2 = s;
                        i128 = i67;
                        i139 = i58;
                        i144 = i53;
                        bArr7 = bArr4;
                        i130 = i66;
                        i142 = i55;
                        c142719 = c142714;
                        iArr7 = iArr4;
                        i143 = i52;
                        j27 = j10;
                        i129 = iM559712 ^ i68;
                        i145 = i54;
                        i131 = i56;
                        i141 = i65;
                        i140 = i64;
                        i138 = i63;
                        iMo23869 = i62;
                        i146 = i61;
                        j25 = j12;
                        j26 = j11;
                        i133 = i51;
                        i134 = i60;
                        i132 = i59;
                        i137 = i57;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                    }
                    break;
                case -1824284269:
                case 1623701131:
                    C14279 c142722 = c142719;
                    i40 = i132;
                    i41 = i133;
                    int i163 = i134;
                    j8 = j29;
                    int i164 = i141;
                    j9 = j27;
                    abstractC129711 = abstractC129713;
                    i130 = i130;
                    i44 = i131;
                    i140 = i140;
                    if (i164 >= 0) {
                        int iM55688 = (C0873.m55680("ܺۚ") ^ i127) * (-33);
                        int i165 = ((iM55688 ^ i126) * 575) ^ 1889273642;
                        i129 = iM55688 ^ (-843594103);
                        j27 = j9;
                        i131 = i44;
                        abstractC129713 = abstractC129711;
                        i132 = i40;
                        i134 = i163;
                        i133 = i41;
                        j29 = j8;
                        i140 = i140;
                        i130 = i130;
                        i141 = i164;
                        i128 = i165;
                        c142719 = c142722;
                    } else {
                        i12 = i164;
                        i43 = i146;
                        i42 = i163;
                        c14279 = c142722;
                        i45 = iMo23869;
                        i46 = i142;
                        int iM55689 = C0873.m55680("ᩳ֡") ^ i127;
                        i129 = iM55689 ^ 235582432;
                        j27 = j9;
                        i128 = ((iM55689 ^ i126) * (-22559)) ^ (-644281199);
                        i142 = i46;
                        iMo23869 = i45;
                        i131 = i44;
                        abstractC129713 = abstractC129711;
                        i133 = i41;
                        j29 = j8;
                        i134 = i42;
                        i146 = i43;
                        i132 = i40;
                        c142719 = c14279;
                        int i1511 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i1511;
                    }
                    break;
                case -1794962504:
                case 992509198:
                    C14279 c142723 = c142719;
                    int i166 = i133;
                    int i167 = i134;
                    int i168 = i143;
                    int i169 = i145;
                    int i170 = i146;
                    long j31 = j29;
                    long j32 = j26;
                    long j33 = j27;
                    int i171 = i142;
                    AbstractC12979 abstractC129714 = abstractC129713;
                    int i172 = i131;
                    int i173 = iMo23869;
                    byte[] bArr8 = bArr7;
                    int i174 = i139;
                    i12 = i141;
                    int unsignedByte = dataInput.readUnsignedByte();
                    if (unsignedByte == 1) {
                        iM55680 = C0873.m55680("ۨܽ") ^ i127;
                        i13 = ((iM55680 ^ i126) * 30003) ^ (-1357370273);
                        i14 = -1169934822;
                    } else {
                        iM55680 = (i126 - C0873.m55680("ܿܺ")) * (-45);
                        i13 = ((iM55680 ^ i127) * (-22267)) ^ 386192721;
                        i14 = 1511580665;
                    }
                    int i175 = iM55680 ^ i14;
                    i138 = unsignedByte;
                    j26 = j32;
                    i139 = i174;
                    bArr7 = bArr8;
                    i131 = i172;
                    abstractC129713 = abstractC129714;
                    i142 = i171;
                    i133 = i166;
                    j29 = j31;
                    i143 = i168;
                    j27 = j33;
                    i134 = i167;
                    i145 = i169;
                    i129 = i175;
                    iMo23869 = i173;
                    c142719 = c142723;
                    i146 = i170;
                    i132 = i132;
                    i128 = i13;
                    iArr7 = iArr7;
                    int i1512 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i1512;
                    break;
                case -1730725333:
                case 358757507:
                    c142710 = c142719;
                    i3 = i132;
                    i16 = i133;
                    i17 = i134;
                    i143 = i143;
                    iArr2 = iArr7;
                    i18 = i145;
                    i19 = i146;
                    j3 = j29;
                    j4 = j26;
                    j5 = j27;
                    i20 = i142;
                    abstractC129710 = abstractC129713;
                    i21 = i131;
                    i22 = iMo23869;
                    bArr2 = bArr7;
                    int i176 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i176;
                    i25 = i139;
                    if (i25 >= c14279Arr.length) {
                        i139 = i25;
                        iM55682 = (C0873.m55680("ۨᩴ") ^ i126) * (-67);
                        i23 = ((iM55682 ^ i127) * 2541) ^ (-1320765136);
                        i24 = 1627758749;
                        int i177 = iM55682 ^ i24;
                        j26 = j4;
                        i131 = i21;
                        abstractC129713 = abstractC129710;
                        i142 = i20;
                        i133 = i16;
                        iArr7 = iArr2;
                        j29 = j3;
                        i143 = i143;
                        j27 = j5;
                        i134 = i17;
                        i129 = i177;
                        iMo23869 = i22;
                        c142719 = c142710;
                        i146 = i19;
                        i132 = i3;
                        i128 = i23;
                        bArr7 = bArr2;
                        i145 = i18;
                        int i1513 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i1513;
                    } else {
                        iM55979 = C0946.m55979("ۘܽ") ^ i127;
                        i26 = ((iM55979 ^ i126) * 5405) ^ 41558419;
                        i27 = -885533932;
                        int i178 = iM55979 ^ i27;
                        j26 = j4;
                        i139 = i25;
                        bArr7 = bArr2;
                        i131 = i21;
                        abstractC129713 = abstractC129710;
                        i142 = i20;
                        i133 = i16;
                        iArr7 = iArr2;
                        j29 = j3;
                        j27 = j5;
                        i134 = i17;
                        i145 = i18;
                        i129 = i178;
                        iMo23869 = i22;
                        c142719 = c142710;
                        i146 = i19;
                        i132 = i3;
                        i128 = i26;
                        i143 = i143;
                        int i1514 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i1514;
                    }
                    break;
                case -1729619152:
                case -1323773791:
                    throw new ArithmeticException();
                case -1695380128:
                case -1448855135:
                    c142713 = c142719;
                    i47 = i134;
                    i48 = i141;
                    long j34 = ((long) i48) + j24;
                    i130 = i130;
                    int i179 = (int) j34;
                    i40 = i132;
                    i41 = i133;
                    if (j34 == i179) {
                        iM559714 = C0873.m55680("ۜ֫") ^ i127;
                        i49 = ((iM559714 ^ i126) * (-5963)) ^ 885758254;
                        i117 = -73050489;
                    } else {
                        iM559714 = (C0946.m55979("ۘ᩷") + i126) * 11;
                        i49 = ((iM559714 ^ i127) * (-21259)) ^ (-790760416);
                        i117 = 495062942;
                    }
                    i129 = iM559714 ^ i117;
                    i123 = i179;
                    i130 = i130;
                    i132 = i40;
                    i134 = i47;
                    i141 = i48;
                    c142719 = c142713;
                    i128 = i49;
                    i133 = i41;
                    break;
                case -1689290808:
                case 875437176:
                    c142712 = c142719;
                    i73 = i133;
                    i87 = i134;
                    i74 = i143;
                    iArr5 = iArr7;
                    i88 = i144;
                    i75 = i145;
                    j3 = j29;
                    j13 = j26;
                    j14 = j27;
                    i77 = i142;
                    abstractC129712 = abstractC129713;
                    i78 = i131;
                    bArr5 = bArr7;
                    j15 = j25;
                    i89 = i137;
                    i76 = i146;
                    i81 = i139;
                    i72 = i132;
                    i79 = iMo23869;
                    i80 = i138;
                    i82 = i140;
                    i83 = i141;
                    i84 = i130;
                    if (i89 > 256) {
                        i85 = i87;
                        i144 = i88;
                        i86 = i89;
                        int iM556810 = C0873.m55680("ۗ᩶") ^ i126;
                        i128 = ((iM556810 ^ i127) * (-3693)) ^ (-555947639);
                        i139 = i81;
                        bArr7 = bArr5;
                        i131 = i78;
                        i130 = i84;
                        i142 = i77;
                        c142719 = c142712;
                        i143 = i74;
                        j27 = j14;
                        i129 = iM556810 ^ 1089911717;
                        i145 = i75;
                        abstractC129713 = abstractC129712;
                        i141 = i83;
                        j29 = j3;
                        i140 = i82;
                        i138 = i80;
                        iMo23869 = i79;
                        i146 = i76;
                        j25 = j15;
                        j26 = j13;
                        i133 = i73;
                        i134 = i85;
                        i132 = i72;
                        i137 = i86;
                        iArr7 = iArr5;
                    } else {
                        iM55685 = (C0873.m55680("ܶ۟") + i126) * 23;
                        i90 = ((iM55685 ^ i127) * 17121) ^ (-2008175996);
                        i91 = -96906023;
                        int i1515 = iM55685 ^ i91;
                        i128 = i90;
                        i139 = i81;
                        i144 = i88;
                        i132 = i72;
                        bArr7 = bArr5;
                        i131 = i78;
                        i142 = i77;
                        iArr7 = iArr5;
                        i143 = i74;
                        j27 = j14;
                        i137 = i89;
                        i129 = i1515;
                        i145 = i75;
                        abstractC129713 = abstractC129712;
                        i130 = i84;
                        j29 = j3;
                        i141 = i83;
                        i140 = i82;
                        i138 = i80;
                        iMo23869 = i79;
                        i146 = i76;
                        j25 = j15;
                        j26 = j13;
                        i133 = i73;
                        i134 = i87;
                        c142719 = c142712;
                    }
                    break;
                case -1678468343:
                case -391546666:
                    c142715 = c142719;
                    i92 = i133;
                    i93 = i134;
                    i94 = i143;
                    iArr6 = iArr7;
                    i95 = i144;
                    i145 = i145;
                    j29 = j29;
                    j16 = j26;
                    j17 = j27;
                    i96 = i142;
                    abstractC129713 = abstractC129713;
                    i131 = i131;
                    bArr6 = bArr7;
                    i97 = i137;
                    i98 = i139;
                    i99 = i132;
                    int i180 = i141;
                    i130 = i130;
                    j18 = j25;
                    i100 = i146;
                    iMo23869 = iMo23869;
                    i101 = i138;
                    i102 = i140;
                    i103 = i180;
                    j28 = (((long) i97) * 96) + 48;
                    if (C1929.f83011 != 0) {
                        iM559713 = (i126 - C0946.m55979("֡֨")) * (-69);
                        i104 = ((iM559713 ^ i127) * 29919) ^ (-1938794049);
                        i105 = -172103592;
                    } else {
                        iM559713 = (C0873.m55680("᩻ۨ") + i127) * (-65);
                        i104 = ((iM559713 ^ i126) * (-25313)) ^ 1297919594;
                        i105 = -603550198;
                    }
                    j26 = j16;
                    i139 = i98;
                    i144 = i95;
                    bArr7 = bArr6;
                    i142 = i96;
                    i133 = i92;
                    iArr7 = iArr6;
                    i143 = i94;
                    j27 = j17;
                    i134 = i93;
                    i129 = iM559713 ^ i105;
                    i128 = i104;
                    i145 = i145;
                    i132 = i99;
                    c142719 = c142715;
                    i137 = i97;
                    abstractC129713 = abstractC129713;
                    int i1516 = i102;
                    i138 = i101;
                    iMo23869 = iMo23869;
                    i146 = i100;
                    j25 = j18;
                    i131 = i131;
                    i130 = i130;
                    j29 = j29;
                    i141 = i103;
                    i140 = i1516;
                    break;
                case -1657132005:
                case 2060776050:
                    c142717 = c142719;
                    iM32812 = c142717.m32812();
                    i113 = Integer.MIN_VALUE;
                    i114 = 0;
                    int iM559723 = (i127 - C0946.m55979("ۧܳ")) * (-57);
                    i129 = iM559723 ^ 416140557;
                    i140 = i140;
                    i130 = iM32812;
                    i141 = i141;
                    c142719 = c142717;
                    i131 = i114;
                    i128 = ((iM559723 ^ i126) * 30501) ^ (-1063099878);
                    i134 = i134;
                    i133 = i113;
                    i132 = i132;
                    break;
                case -1634836898:
                case 809031474:
                    C1194.m56396();
                    if (!C1048.f81963) {
                        c142715 = c142719;
                        i92 = i133;
                        i93 = i134;
                        i94 = i143;
                        iArr6 = iArr7;
                        i95 = i144;
                        i145 = i145;
                        j29 = j29;
                        j16 = j26;
                        j17 = j27;
                        i96 = i142;
                        abstractC129713 = abstractC129713;
                        i131 = i131;
                        bArr6 = bArr7;
                        i97 = i137;
                        i98 = i139;
                        i99 = i132;
                        int i1610 = i141;
                        i130 = i130;
                        j18 = j25;
                        i100 = i146;
                        iMo23869 = iMo23869;
                        i101 = i138;
                        i102 = i140;
                        i103 = i1610;
                        iM559713 = (i126 - C0946.m55979("֡֨")) * (-69);
                        i104 = ((iM559713 ^ i127) * 29919) ^ (-1938794049);
                        i105 = -172103592;
                        j26 = j16;
                        i139 = i98;
                        i144 = i95;
                        bArr7 = bArr6;
                        i142 = i96;
                        i133 = i92;
                        iArr7 = iArr6;
                        i143 = i94;
                        j27 = j17;
                        i134 = i93;
                        i129 = iM559713 ^ i105;
                        i128 = i104;
                        i145 = i145;
                        i132 = i99;
                        c142719 = c142715;
                        i137 = i97;
                        abstractC129713 = abstractC129713;
                        int i1517 = i102;
                        i138 = i101;
                        iMo23869 = iMo23869;
                        i146 = i100;
                        j25 = j18;
                        i131 = i131;
                        i130 = i130;
                        j29 = j29;
                        i141 = i103;
                        i140 = i1517;
                    } else {
                        iM55687 = C0946.m55979("ܽۖ") ^ i126;
                        i120 = ((iM55687 ^ i127) * 24359) ^ (-617046363);
                        i121 = -329015416;
                        i129 = iM55687 ^ i121;
                        i128 = i120;
                    }
                    break;
                case -1568895202:
                case 2048236355:
                    C14279 c142724 = c142719;
                    int i181 = i132;
                    i133 = i133;
                    i5 = i134;
                    i146 = i146;
                    j29 = j29;
                    long j35 = j27;
                    abstractC129713 = abstractC129713;
                    i131 = i131;
                    iMo23869 = iMo23869;
                    int i182 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i182;
                    if (j35 <= i146) {
                        int iM559724 = (C0946.m55979("ۜܳ") ^ i127) * (-73);
                        i129 = iM559724 ^ (-1786580619);
                        j27 = j35;
                        i131 = i131;
                        abstractC129713 = abstractC129713;
                        i133 = i133;
                        j29 = j29;
                        i134 = i5;
                        c142719 = c142724;
                        i128 = ((iM559724 ^ i126) * 6349) ^ (-1188948875);
                        iMo23869 = iMo23869;
                        i146 = i146;
                        i132 = i181;
                    } else {
                        c14279 = c142724;
                        j27 = j35;
                        i143 = i143;
                        iArr3 = iArr7;
                        i36 = i145;
                        i3 = i181;
                        i37 = i142;
                        bArr3 = bArr7;
                        int iM559725 = C0946.m55979("֨ۘ") ^ i126;
                        i32 = ((iM559725 ^ i127) * 4337) ^ 639899674;
                        i129 = iM559725 ^ (-583727122);
                        bArr7 = bArr3;
                        iMo23869 = iMo23869;
                        i131 = i131;
                        abstractC129713 = abstractC129713;
                        i142 = i37;
                        i133 = i133;
                        iArr7 = iArr3;
                        j29 = j29;
                        i143 = i143;
                        i146 = i146;
                        i145 = i36;
                        i132 = i3;
                        i128 = i32;
                        i134 = i5;
                        c142719 = c14279;
                    }
                    int i1518 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i1518;
                    break;
                case -1556522900:
                case 1345077412:
                    if (RunnableC1014.f81941 > 0) {
                        c142714 = c142719;
                        i51 = i133;
                        i52 = i143;
                        iArr4 = iArr7;
                        i53 = i144;
                        i54 = i145;
                        j3 = j29;
                        j10 = j27;
                        i55 = i142;
                        abstractC129710 = abstractC129713;
                        i56 = i131;
                        bArr4 = bArr7;
                        i57 = i137;
                        i58 = i139;
                        i59 = i132;
                        i60 = i134;
                        j11 = j26;
                        j12 = j25;
                        i61 = i146;
                        i62 = iMo23869;
                        i63 = i138;
                        i64 = i140;
                        i65 = i141;
                        i66 = i130;
                        s = s2;
                        iM559712 = (C0946.m55979("ܳ֡") ^ i127) * (-41);
                        i67 = ((iM559712 ^ i126) * 27027) ^ (-633349379);
                        i68 = 340503337;
                        s2 = s;
                        i128 = i67;
                        i139 = i58;
                        i144 = i53;
                        bArr7 = bArr4;
                        i130 = i66;
                        i142 = i55;
                        c142719 = c142714;
                        iArr7 = iArr4;
                        i143 = i52;
                        j27 = j10;
                        i129 = iM559712 ^ i68;
                        i145 = i54;
                        i131 = i56;
                        i141 = i65;
                        i140 = i64;
                        i138 = i63;
                        iMo23869 = i62;
                        i146 = i61;
                        j25 = j12;
                        j26 = j11;
                        i133 = i51;
                        i134 = i60;
                        i132 = i59;
                        i137 = i57;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                    }
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    iM559712 = (C0946.m55979("ᩳۢ") + i126) * 119;
                    i67 = ((iM559712 ^ i127) * 17265) ^ 170907266;
                    i68 = -862681313;
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -1449784459:
                case -15337083:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    if (RunnableC1014.f81941 <= 0) {
                        iM559712 = (C0873.m55680("ᩴܶ") ^ i126) * 29;
                        i67 = ((iM559712 ^ i127) * (-20943)) ^ (-1803705912);
                        i68 = 1415775817;
                    } else {
                        iM559712 = (C0873.m55680("᩹᩹") + i126) * 11;
                        i67 = ((iM559712 ^ i127) * (-24939)) ^ 1049796426;
                        i68 = -94426794;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -1395339110:
                case 1005227149:
                    throw m43170(C0927.m55863(f82286, 199, 28, i134));
                case -1279070481:
                case 949769923:
                    throw m43170(C0845.m55592(f82286, 128, 27, i134));
                case -1273584919:
                case 1961119227:
                    throw m43170(C0912.m55829(i138, C0930.m55893(f82286, 99, 29, i134)));
                case -1131864569:
                case -495445045:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    if (C1044.f81959 >= 0) {
                        iM559712 = (i127 - C0873.m55680("֡ۛ")) * (-41);
                        i67 = ((iM559712 ^ i126) * (-13353)) ^ 771875613;
                        i68 = 639113572;
                    } else {
                        iM559712 = C0873.m55680("۬ۖ") ^ i126;
                        i67 = ((iM559712 ^ i127) * 6743) ^ (-1876082983);
                        i68 = 1712471799;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -1090324924:
                case -689069534:
                    i114 = i131 + 1;
                    c142717 = c142719;
                    i113 = iMo23869;
                    iM32812 = i130;
                    int iM559726 = (i127 - C0946.m55979("ۧܳ")) * (-57);
                    i129 = iM559726 ^ 416140557;
                    i140 = i140;
                    i130 = iM32812;
                    i141 = i141;
                    c142719 = c142717;
                    i131 = i114;
                    i128 = ((iM559726 ^ i126) * 30501) ^ (-1063099878);
                    i134 = i134;
                    i133 = i113;
                    i132 = i132;
                    break;
                case -1082940352:
                case -474266165:
                    if (C0845.f81821 < 0) {
                        i106 = i132;
                        i107 = i133;
                        i108 = i134;
                        j21 = j29;
                        j22 = j27;
                        abstractC12979M29749 = abstractC129713;
                        i112 = i131;
                        int i183 = i141;
                        i110 = i130;
                        i111 = i140;
                        c142716 = c142719;
                        i109 = i183;
                        int iM556811 = (C0873.m55680("᩺֨") + i127) * 3;
                        j23 = j21;
                        i128 = ((iM556811 ^ i126) * (-3745)) ^ 620534340;
                        i129 = iM556811 ^ 1060937133;
                        j27 = j22;
                        i131 = i112;
                        abstractC129713 = abstractC12979M29749;
                        i132 = i106;
                        i134 = i108;
                        i133 = i107;
                        j29 = j23;
                        C14279 c142725 = c142716;
                        i140 = i111;
                        i130 = i110;
                        i141 = i109;
                        c142719 = c142725;
                    } else {
                        iM55687 = C0946.m55979("ܽۖ") ^ i126;
                        i120 = ((iM55687 ^ i127) * 24359) ^ (-617046363);
                        i121 = -329015416;
                        i129 = iM55687 ^ i121;
                        i128 = i120;
                    }
                    break;
                case -1072178924:
                case -396430860:
                    c142713 = c142719;
                    i40 = i132;
                    i41 = i133;
                    i47 = i134;
                    i48 = i141;
                    i130 = i130;
                    i140 = i140;
                    if (i48 >= i140) {
                        i12 = i48;
                        i43 = i146;
                        j8 = j29;
                        i42 = i47;
                        j9 = j27;
                        abstractC129711 = abstractC129713;
                        i44 = i131;
                        c14279 = c142713;
                        i45 = iMo23869;
                        i46 = i142;
                        int iM556812 = C0873.m55680("ᩳ֡") ^ i127;
                        i129 = iM556812 ^ 235582432;
                        j27 = j9;
                        i128 = ((iM556812 ^ i126) * (-22559)) ^ (-644281199);
                        i142 = i46;
                        iMo23869 = i45;
                        i131 = i44;
                        abstractC129713 = abstractC129711;
                        i133 = i41;
                        j29 = j8;
                        i134 = i42;
                        i146 = i43;
                        i132 = i40;
                        c142719 = c14279;
                        int i1519 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i1519;
                    } else {
                        int iM559727 = C0946.m55979("᩸᩷") ^ i126;
                        i49 = ((iM559727 ^ i127) * 3947) ^ 1427230012;
                        i129 = iM559727 ^ 905541044;
                        i140 = i140;
                        i130 = i130;
                        i132 = i40;
                        i134 = i47;
                        i141 = i48;
                        c142719 = c142713;
                        i128 = i49;
                        i133 = i41;
                    }
                    break;
                case -984441322:
                case 1656199395:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    int i184 = (s * s) + 251539600;
                    i124 = i184 + i184;
                    if (C0877.f81843 >= 0) {
                        iM559712 = (i127 - C0873.m55680("֡ۛ")) * (-41);
                        i67 = ((iM559712 ^ i126) * (-13353)) ^ 771875613;
                        i68 = 639113572;
                    } else {
                        iM559712 = (C0946.m55979("᩶ܶ") ^ i126) * (-109);
                        i67 = ((iM559712 ^ i127) * (-27367)) ^ (-219049771);
                        i68 = 1553104249;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -921021002:
                case -703341215:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    if (C1017.f81942 >= 0) {
                        iM559712 = (C0946.m55979("ᩳۢ") + i126) * 119;
                        i67 = ((iM559712 ^ i127) * 17265) ^ 170907266;
                        i68 = -862681313;
                    } else {
                        iM559712 = (C0946.m55979("ܿ֫") + i126) * 7;
                        i67 = ((iM559712 ^ i127) * 30373) ^ 283592518;
                        i68 = -118413266;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -899110971:
                case -668238779:
                    int i185 = i140;
                    i103 = i141;
                    i136++;
                    c142715 = c142719;
                    j19 = j27;
                    j20 = j28;
                    i97 = i137;
                    i99 = i132;
                    int i186 = i138;
                    i102 = i185;
                    j18 = j25;
                    i100 = i146;
                    i101 = i186;
                    int iM5597110 = C0946.m55979("֡᩶") ^ i127;
                    j28 = j20;
                    i128 = ((iM5597110 ^ i126) * 2407) ^ (-1486684508);
                    j26 = j26;
                    i139 = i139;
                    i144 = i144;
                    bArr7 = bArr7;
                    i142 = i142;
                    i133 = i133;
                    iArr7 = iArr7;
                    i143 = i143;
                    j27 = j19;
                    i134 = i134;
                    i129 = iM5597110 ^ (-686198040);
                    i145 = i145;
                    i132 = i99;
                    c142719 = c142715;
                    i137 = i97;
                    abstractC129713 = abstractC129713;
                    int i15110 = i102;
                    i138 = i101;
                    iMo23869 = iMo23869;
                    i146 = i100;
                    j25 = j18;
                    i131 = i131;
                    i130 = i130;
                    j29 = j29;
                    i141 = i103;
                    i140 = i15110;
                    break;
                case -880456694:
                case 1454026511:
                    throw m43170(C1229.m56403(f82286, 31, 26, i134));
                case -828358582:
                case 2027481195:
                    ViewOnClickListenerC0939.m55941();
                    C1012.m56134();
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    iM559712 = (C0873.m55680("ᩴܶ") ^ i126) * 29;
                    i67 = ((iM559712 ^ i127) * (-20943)) ^ (-1803705912);
                    i68 = 1415775817;
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -806816481:
                case 612815688:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    int i187 = s + 15860;
                    if ((i187 * i187) - i124 > 0) {
                        iM559712 = C0946.m55979("ۡۨ") ^ i127;
                        i67 = ((iM559712 ^ i126) * 28687) ^ 256130239;
                        i68 = -900785922;
                    } else {
                        iM559712 = (C0946.m55979("ۨܿ") ^ i127) * 3;
                        i67 = ((iM559712 ^ i126) * 19293) ^ 198184379;
                        i68 = -34658741;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case -791662169:
                case 630256979:
                    throw m43170(C1229.m56403(f82286, 227, 26, i134));
                case -766651163:
                case 1882474961:
                    return new C19013(i144, interfaceC23667Arr);
                case -743960425:
                case 1916602357:
                    throw m43170(C0898.m55792(f82286, 179, 20, i134));
                case -710279620:
                case 1042245350:
                    c14279 = c142719;
                    i3 = i132;
                    i4 = i133;
                    i5 = i134;
                    i6 = i143;
                    iArr = iArr7;
                    i7 = i145;
                    i8 = i146;
                    j = j29;
                    j2 = j27;
                    i9 = i142;
                    abstractC12979 = abstractC129713;
                    i10 = i131;
                    i11 = iMo23869;
                    bArr = bArr7;
                    int i188 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i188;
                    j26 = (((long) i7) * 9) + 128;
                    if (C0863.f81833 <= 0) {
                        iM559710 = (C0946.m55979("ܽᩳ") + i127) * (-55);
                        i32 = ((iM559710 ^ i126) * 28139) ^ 1660239401;
                        i31 = -516150150;
                    } else {
                        iM559710 = (i126 - C0873.m55680("ۜܽ")) * (-43);
                        i32 = ((iM559710 ^ i127) * 25201) ^ (-1342091467);
                        i31 = 124102480;
                    }
                    int i1520 = iM559710 ^ i31;
                    bArr7 = bArr;
                    iMo23869 = i11;
                    i131 = i10;
                    abstractC129713 = abstractC12979;
                    i142 = i9;
                    iArr7 = iArr;
                    j29 = j;
                    i143 = i6;
                    j27 = j2;
                    i146 = i8;
                    i129 = i1520;
                    i145 = i7;
                    i133 = i4;
                    i132 = i3;
                    i128 = i32;
                    i134 = i5;
                    c142719 = c14279;
                    int i15111 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i15111;
                    break;
                case -563099695:
                case -486884098:
                    C14279 c142726 = c142719;
                    int i189 = i132;
                    int i190 = i133;
                    int i191 = i134;
                    int i192 = i143;
                    int[] iArr8 = iArr7;
                    int i193 = i144;
                    int i194 = i145;
                    int i195 = i146;
                    j3 = j29;
                    long j36 = j26;
                    long j37 = j27;
                    int i196 = i142;
                    abstractC129710 = abstractC129713;
                    int i197 = i131;
                    int i198 = iMo23869;
                    byte[] bArr9 = bArr7;
                    i57 = i137;
                    int i199 = i138;
                    int i200 = i139;
                    int i201 = i141;
                    int i202 = i130;
                    int i203 = i140;
                    if (i136 < i57) {
                        int iM556813 = C0873.m55680("᩶ۨ") ^ i127;
                        int i204 = ((iM556813 ^ i126) * 14237) ^ 1486616804;
                        j26 = j36;
                        i139 = i200;
                        i144 = i193;
                        bArr7 = bArr9;
                        i131 = i197;
                        i142 = i196;
                        i133 = i190;
                        iArr7 = iArr8;
                        i143 = i192;
                        j27 = j37;
                        i134 = i191;
                        i145 = i194;
                        i129 = iM556813 ^ 248004831;
                        c142719 = c142726;
                        i137 = i57;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                        i128 = i204;
                        i130 = i202;
                        i141 = i201;
                        i140 = i203;
                        i138 = i199;
                        iMo23869 = i198;
                        i146 = i195;
                        i132 = i189;
                    } else {
                        int iM559728 = C0946.m55979("ܽ֡") ^ i126;
                        i59 = i189;
                        i128 = ((iM559728 ^ i127) * (-24081)) ^ (-285619904);
                        j26 = j36;
                        i139 = i200;
                        i144 = i193;
                        bArr7 = bArr9;
                        i131 = i197;
                        i142 = i196;
                        i133 = i190;
                        iArr7 = iArr8;
                        i143 = i192;
                        j27 = j37;
                        i129 = iM559728 ^ (-549709314);
                        i134 = i191;
                        i145 = i194;
                        i130 = i202;
                        c142719 = c142726;
                        i141 = i201;
                        i140 = i203;
                        i138 = i199;
                        iMo23869 = i198;
                        i146 = i195;
                        i132 = i59;
                        i137 = i57;
                        abstractC129713 = abstractC129710;
                        j29 = j3;
                    }
                    break;
                case -510387800:
                case 476923845:
                    c142710 = c142719;
                    i3 = i132;
                    i16 = i133;
                    i17 = i134;
                    i143 = i143;
                    iArr2 = iArr7;
                    i18 = i145;
                    i19 = i146;
                    j3 = j29;
                    j4 = j26;
                    j5 = j27;
                    i20 = i142;
                    abstractC129710 = abstractC129713;
                    i21 = i131;
                    i22 = iMo23869;
                    bArr2 = bArr7;
                    i25 = i139;
                    int i205 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i205;
                    if (i18 > i140) {
                        i28 = i138;
                        i29 = i140;
                        i30 = i18;
                        int iM559729 = (i127 - C0946.m55979("ۧ֨")) * 85;
                        int i1611 = ((iM559729 ^ i126) * 28705) ^ (-1732506931);
                        j26 = j4;
                        i138 = i28;
                        i139 = i25;
                        bArr7 = bArr2;
                        iMo23869 = i22;
                        i131 = i21;
                        i142 = i20;
                        i133 = i16;
                        i143 = i143;
                        j27 = j5;
                        i129 = iM559729 ^ (-595326423);
                        i145 = i30;
                        i134 = i17;
                        i146 = i19;
                        abstractC129713 = abstractC129710;
                        i130 = i130;
                        c142719 = c142710;
                        j29 = j3;
                        i132 = i3;
                        i128 = i1611;
                        i141 = i12;
                        iArr7 = iArr2;
                        i140 = i29;
                    } else {
                        iM55979 = C0946.m55979("ۢ᩸") ^ i126;
                        i26 = ((iM55979 ^ i127) * (-29209)) ^ (-450968888);
                        i27 = -1860747493;
                        int i1710 = iM55979 ^ i27;
                        j26 = j4;
                        i139 = i25;
                        bArr7 = bArr2;
                        i131 = i21;
                        abstractC129713 = abstractC129710;
                        i142 = i20;
                        i133 = i16;
                        iArr7 = iArr2;
                        j29 = j3;
                        j27 = j5;
                        i134 = i17;
                        i145 = i18;
                        i129 = i1710;
                        iMo23869 = i22;
                        c142719 = c142710;
                        i146 = i19;
                        i132 = i3;
                        i128 = i26;
                        i143 = i143;
                        int i15112 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i15112;
                    }
                    break;
                case -476377980:
                case -5455302:
                    i71 = 38373;
                    int iM556814 = C0873.m55680("ۤ۫") ^ i126;
                    i128 = ((iM556814 ^ i127) * (-23119)) ^ 10752911;
                    i139 = i139;
                    i144 = i144;
                    i132 = i132;
                    bArr7 = bArr7;
                    i142 = i142;
                    c142719 = c142719;
                    iArr7 = iArr7;
                    i143 = i143;
                    j27 = j27;
                    i137 = i137;
                    i129 = iM556814 ^ (-1356302015);
                    i145 = i145;
                    i131 = i131;
                    abstractC129713 = abstractC129713;
                    j29 = j29;
                    i134 = i71;
                    i130 = i130;
                    i133 = i133;
                    i141 = i141;
                    i140 = i140;
                    i138 = i138;
                    iMo23869 = iMo23869;
                    i146 = i146;
                    j25 = j25;
                    j26 = j26;
                    break;
                case -268508175:
                case 465084525:
                    throw m43170(C0845.m55592(f82286, 1, 30, i134));
                case -173296159:
                case 771079313:
                    throw m43170(C0892.m55750(f82286, 57, 42, i134));
                case -24916676:
                case 491938744:
                    throw m43170(AbstractC0942.m55970(f82286, 253, 25, i134));
                case -20933990:
                case 1280649988:
                    i130 = i130;
                    C14279 c142727 = c142719;
                    i40 = i132;
                    i41 = i133;
                    i42 = i134;
                    i43 = i146;
                    j8 = j29;
                    i140 = i140;
                    j9 = j27;
                    abstractC129711 = abstractC129713;
                    i44 = i131;
                    i45 = iMo23869;
                    int i206 = dataInput.readInt();
                    i46 = i142;
                    if (i206 <= i46) {
                        c14279 = c142727;
                        i12 = i206;
                        int iM556815 = C0873.m55680("ᩳ֡") ^ i127;
                        i129 = iM556815 ^ 235582432;
                        j27 = j9;
                        i128 = ((iM556815 ^ i126) * (-22559)) ^ (-644281199);
                        i142 = i46;
                        iMo23869 = i45;
                        i131 = i44;
                        abstractC129713 = abstractC129711;
                        i133 = i41;
                        j29 = j8;
                        i134 = i42;
                        i146 = i43;
                        i132 = i40;
                        c142719 = c14279;
                        int i15113 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i15113;
                    } else {
                        int iM556816 = C0873.m55680("ܽۚ") ^ i126;
                        c142712 = c142727;
                        i128 = ((iM556816 ^ i127) * (-18217)) ^ 426631643;
                        i129 = iM556816 ^ (-808458339);
                        i140 = i140;
                        j27 = j9;
                        i142 = i46;
                        iMo23869 = i45;
                        i131 = i44;
                        abstractC129713 = abstractC129711;
                        i130 = i130;
                        i133 = i41;
                        j29 = j8;
                        i134 = i42;
                        i146 = i43;
                        i141 = i206;
                        i132 = i40;
                        c142719 = c142712;
                    }
                    break;
                case -19657070:
                case 539905176:
                    abstractC129713 = abstractC129713;
                    i131 = i131;
                    c14279 = c142719;
                    i3 = i132;
                    i133 = i133;
                    i5 = i134;
                    i36 = i145;
                    i146 = i146;
                    iMo23869 = iMo23869;
                    int i207 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i207;
                    int i208 = dataInput.readInt();
                    int i209 = dataInput.readInt();
                    i37 = i142;
                    bArr3 = bArr7;
                    long j38 = j24 + ((long) i208);
                    i143 = i143;
                    iArr3 = iArr7;
                    j27 = ((long) i209) + j38;
                    if (i208 < 0) {
                        i122 = i209;
                        j29 = j38;
                        int iM5597210 = C0946.m55979("֨ۘ") ^ i126;
                        i32 = ((iM5597210 ^ i127) * 4337) ^ 639899674;
                        i129 = iM5597210 ^ (-583727122);
                        bArr7 = bArr3;
                        iMo23869 = iMo23869;
                        i131 = i131;
                        abstractC129713 = abstractC129713;
                        i142 = i37;
                        i133 = i133;
                        iArr7 = iArr3;
                        j29 = j29;
                        i143 = i143;
                        i146 = i146;
                        i145 = i36;
                        i132 = i3;
                        i128 = i32;
                        i134 = i5;
                        c142719 = c14279;
                        int i15114 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i15114;
                    } else {
                        int iM559730 = C0946.m55979("۬۬") ^ i127;
                        i26 = ((iM559730 ^ i126) * 8603) ^ 2093669726;
                        i129 = iM559730 ^ 116810159;
                        i122 = i209;
                        i131 = i131;
                        abstractC129713 = abstractC129713;
                        i142 = i37;
                        i133 = i133;
                        iArr7 = iArr3;
                        i134 = i5;
                        j29 = j38;
                        bArr7 = bArr3;
                        iMo23869 = iMo23869;
                        c142719 = c14279;
                        i146 = i146;
                        i145 = i36;
                        i132 = i3;
                        i128 = i26;
                        i143 = i143;
                        int i15115 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i15115;
                    }
                    break;
                case 2102253:
                case 1841417725:
                    c142712 = c142719;
                    i72 = i132;
                    i73 = i133;
                    i74 = i143;
                    iArr5 = iArr7;
                    i75 = i145;
                    i76 = i146;
                    j3 = j29;
                    j13 = j26;
                    j14 = j27;
                    i77 = i142;
                    abstractC129712 = abstractC129713;
                    i78 = i131;
                    i79 = iMo23869;
                    bArr5 = bArr7;
                    i80 = i138;
                    i81 = i139;
                    i82 = i140;
                    i83 = i141;
                    i84 = i130;
                    i144 = i & (-65536);
                    long j39 = i;
                    i85 = i134;
                    long j40 = ((long) i2) + j39;
                    i86 = dataInput.readInt();
                    if (i86 < 0) {
                        j24 = j39;
                        j15 = j40;
                        int iM556817 = C0873.m55680("ۗ᩶") ^ i126;
                        i128 = ((iM556817 ^ i127) * (-3693)) ^ (-555947639);
                        i139 = i81;
                        bArr7 = bArr5;
                        i131 = i78;
                        i130 = i84;
                        i142 = i77;
                        c142719 = c142712;
                        i143 = i74;
                        j27 = j14;
                        i129 = iM556817 ^ 1089911717;
                        i145 = i75;
                        abstractC129713 = abstractC129712;
                        i141 = i83;
                        j29 = j3;
                        i140 = i82;
                        i138 = i80;
                        iMo23869 = i79;
                        i146 = i76;
                        j25 = j15;
                        j26 = j13;
                        i133 = i73;
                        i134 = i85;
                        i132 = i72;
                        i137 = i86;
                        iArr7 = iArr5;
                    } else {
                        int iM559731 = (C0946.m55979("ܿۧ") + i127) * (-45);
                        j24 = j39;
                        i128 = ((iM559731 ^ i126) * (-11163)) ^ 399736050;
                        j26 = j13;
                        i139 = i81;
                        bArr7 = bArr5;
                        abstractC129713 = abstractC129712;
                        i142 = i77;
                        i133 = i73;
                        i143 = i74;
                        j27 = j14;
                        i129 = iM559731 ^ 497049849;
                        i134 = i85;
                        i145 = i75;
                        i132 = i72;
                        i130 = i84;
                        i137 = i86;
                        i141 = i83;
                        iArr7 = iArr5;
                        i140 = i82;
                        i138 = i80;
                        iMo23869 = i79;
                        i146 = i76;
                        j25 = j40;
                        i131 = i78;
                        c142719 = c142712;
                        j29 = j3;
                    }
                    break;
                case 99684828:
                case 1240779281:
                    c142715 = c142719;
                    i92 = i133;
                    i93 = i134;
                    i94 = i143;
                    iArr6 = iArr7;
                    i95 = i144;
                    i145 = i145;
                    j29 = j29;
                    j16 = j26;
                    j17 = j27;
                    i96 = i142;
                    abstractC129713 = abstractC129713;
                    i131 = i131;
                    bArr6 = bArr7;
                    i97 = i137;
                    i98 = i139;
                    i99 = i132;
                    int i210 = i141;
                    i130 = i130;
                    j18 = j25;
                    i100 = i146;
                    iMo23869 = iMo23869;
                    i101 = i138;
                    i102 = i140;
                    i103 = i210;
                    if (j18 <= ((long) i95) + 65536) {
                        iM559713 = (C0946.m55979("ۚܺ") ^ i126) * 3;
                        i104 = ((iM559713 ^ i127) * (-6769)) ^ 516760321;
                        i105 = -441438089;
                    } else {
                        iM559713 = C0946.m55979("ۙ᩵") ^ i126;
                        i104 = ((iM559713 ^ i127) * (-6601)) ^ (-1196979300);
                        i105 = -2097290234;
                    }
                    j26 = j16;
                    i139 = i98;
                    i144 = i95;
                    bArr7 = bArr6;
                    i142 = i96;
                    i133 = i92;
                    iArr7 = iArr6;
                    i143 = i94;
                    j27 = j17;
                    i134 = i93;
                    i129 = iM559713 ^ i105;
                    i128 = i104;
                    i145 = i145;
                    i132 = i99;
                    c142719 = c142715;
                    i137 = i97;
                    abstractC129713 = abstractC129713;
                    int i15116 = i102;
                    i138 = i101;
                    iMo23869 = iMo23869;
                    i146 = i100;
                    j25 = j18;
                    i131 = i131;
                    i130 = i130;
                    j29 = j29;
                    i141 = i103;
                    i140 = i15116;
                    break;
                case 154068933:
                case 1154187419:
                    c14279 = c142719;
                    i5 = i134;
                    i12 = i141;
                    j7 = j27;
                    i36 = i145;
                    interfaceC23667Arr[i136] = new C14949(AbstractC12979.m29748(i36, iArr7), bArr7);
                    iM55683 = C0946.m55979("᩹᩺") ^ i126;
                    i38 = ((iM55683 ^ i127) * 14093) ^ (-23865771);
                    i39 = 1998619983;
                    int i211 = iM55683 ^ i39;
                    i134 = i5;
                    i145 = i36;
                    i142 = i142;
                    iMo23869 = iMo23869;
                    i131 = i131;
                    abstractC129713 = abstractC129713;
                    c142719 = c14279;
                    j29 = j29;
                    j27 = j7;
                    i129 = i211;
                    i146 = i146;
                    i128 = i38;
                    i132 = i132;
                    i133 = i133;
                    int i15117 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i15117;
                    break;
                case 251841296:
                case 627668309:
                    if (iMo23869 >= i143) {
                        c142718 = c142719;
                        i118 = i134;
                        iM559715 = (C0873.m55680("᩷֨") ^ i126) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i128 = ((iM559715 ^ i127) * 13567) ^ 269387943;
                        i119 = -682602238;
                        i129 = iM559715 ^ i119;
                        c142719 = c142718;
                        i134 = i118;
                    } else {
                        iM55687 = (C0873.m55680("᩷ۛ") + i127) * (-127);
                        i120 = ((iM55687 ^ i126) * 8735) ^ 1942439058;
                        i121 = -1809281915;
                        i129 = iM55687 ^ i121;
                        i128 = i120;
                    }
                    break;
                case 451544151:
                case 951689713:
                    c142715 = c142719;
                    i92 = i133;
                    i93 = i134;
                    i94 = i143;
                    iArr6 = iArr7;
                    i95 = i144;
                    i145 = i145;
                    j29 = j29;
                    j16 = j26;
                    j17 = j27;
                    i96 = i142;
                    abstractC129713 = abstractC129713;
                    i131 = i131;
                    bArr6 = bArr7;
                    i97 = i137;
                    i98 = i139;
                    i99 = i132;
                    int i212 = i141;
                    i130 = i130;
                    j18 = j25;
                    i100 = i146;
                    iMo23869 = iMo23869;
                    i101 = i138;
                    i102 = i140;
                    i103 = i212;
                    if (i97 == 0) {
                        iM559713 = (C0946.m55979("ܽ᩸") + i127) * (-83);
                        i104 = ((iM559713 ^ i126) * (-17063)) ^ (-264500520);
                        i105 = -375789131;
                    } else {
                        iM559713 = C0946.m55979("ܳܰ") ^ i127;
                        i104 = ((iM559713 ^ i126) * 23075) ^ (-1499929710);
                        i105 = 806547810;
                    }
                    j26 = j16;
                    i139 = i98;
                    i144 = i95;
                    bArr7 = bArr6;
                    i142 = i96;
                    i133 = i92;
                    iArr7 = iArr6;
                    i143 = i94;
                    j27 = j17;
                    i134 = i93;
                    i129 = iM559713 ^ i105;
                    i128 = i104;
                    i145 = i145;
                    i132 = i99;
                    c142719 = c142715;
                    i137 = i97;
                    abstractC129713 = abstractC129713;
                    int i15118 = i102;
                    i138 = i101;
                    iMo23869 = iMo23869;
                    i146 = i100;
                    j25 = j18;
                    i131 = i131;
                    i130 = i130;
                    j29 = j29;
                    i141 = i103;
                    i140 = i15118;
                    break;
                case 492073852:
                case 2069597260:
                    c142714 = c142719;
                    i51 = i133;
                    i52 = i143;
                    iArr4 = iArr7;
                    i53 = i144;
                    i54 = i145;
                    j3 = j29;
                    j10 = j27;
                    i55 = i142;
                    abstractC129710 = abstractC129713;
                    i56 = i131;
                    bArr4 = bArr7;
                    i57 = i137;
                    i58 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    i66 = i130;
                    s = s2;
                    if (C1929.f83011 != 0) {
                        iM559712 = (C0946.m55979("ᩴ᩹") ^ i127) * 11;
                        i67 = ((iM559712 ^ i126) * (-19571)) ^ 1939616958;
                        i68 = -1290249815;
                    } else {
                        iM559712 = (i127 - C0946.m55979("ۢᩴ")) * (-87);
                        i67 = ((iM559712 ^ i126) * 30801) ^ 1249231230;
                        i68 = 212023102;
                    }
                    s2 = s;
                    i128 = i67;
                    i139 = i58;
                    i144 = i53;
                    bArr7 = bArr4;
                    i130 = i66;
                    i142 = i55;
                    c142719 = c142714;
                    iArr7 = iArr4;
                    i143 = i52;
                    j27 = j10;
                    i129 = iM559712 ^ i68;
                    i145 = i54;
                    i131 = i56;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                case 620225634:
                case 2046999218:
                    C14279 c142728 = c142719;
                    interfaceC23667Arr[i136] = new C24337(c142728, abstractC129713, i135, i143);
                    i36 = i145;
                    i5 = i134;
                    j7 = j27;
                    c14279 = c142728;
                    i12 = i141;
                    iM55683 = C0946.m55979("᩹᩺") ^ i126;
                    i38 = ((iM55683 ^ i127) * 14093) ^ (-23865771);
                    i39 = 1998619983;
                    int i213 = iM55683 ^ i39;
                    i134 = i5;
                    i145 = i36;
                    i142 = i142;
                    iMo23869 = iMo23869;
                    i131 = i131;
                    abstractC129713 = abstractC129713;
                    c142719 = c14279;
                    j29 = j29;
                    j27 = j7;
                    i129 = i213;
                    i146 = i146;
                    i128 = i38;
                    i132 = i132;
                    i133 = i133;
                    int i15119 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i15119;
                    break;
                case 640753556:
                case 1660692922:
                    c142710 = c142719;
                    i3 = i132;
                    i16 = i133;
                    i17 = i134;
                    i143 = i143;
                    iArr2 = iArr7;
                    i18 = i145;
                    i19 = i146;
                    j3 = j29;
                    j4 = j26;
                    j5 = j27;
                    i20 = i142;
                    abstractC129710 = abstractC129713;
                    i21 = i131;
                    i22 = iMo23869;
                    bArr2 = bArr7;
                    int i214 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i214;
                    i139 = dataInput.readInt();
                    if (i139 >= 0) {
                        iM55682 = C0873.m55680("ܽܰ") ^ i127;
                        i23 = ((iM55682 ^ i126) * 16929) ^ 695121427;
                        i24 = 545379827;
                    } else {
                        iM55682 = (C0873.m55680("ۨᩴ") ^ i126) * (-67);
                        i23 = ((iM55682 ^ i127) * 2541) ^ (-1320765136);
                        i24 = 1627758749;
                    }
                    int i1711 = iM55682 ^ i24;
                    j26 = j4;
                    i131 = i21;
                    abstractC129713 = abstractC129710;
                    i142 = i20;
                    i133 = i16;
                    iArr7 = iArr2;
                    j29 = j3;
                    i143 = i143;
                    j27 = j5;
                    i134 = i17;
                    i129 = i1711;
                    iMo23869 = i22;
                    c142719 = c142710;
                    i146 = i19;
                    i132 = i3;
                    i128 = i23;
                    bArr7 = bArr2;
                    i145 = i18;
                    int i151110 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i151110;
                    break;
                case 735371556:
                case 1557597058:
                    c142718 = c142719;
                    i118 = i134;
                    if (((long) iMo23869) + ((long) i130) > i135) {
                        iM559715 = (i126 - C0873.m55680("ۨ᩷")) * 73;
                        i128 = ((iM559715 ^ i127) * (-379)) ^ 1006490078;
                        i119 = -866243543;
                    } else {
                        iM559715 = (C0873.m55680("᩷֨") ^ i126) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i128 = ((iM559715 ^ i127) * 13567) ^ 269387943;
                        i119 = -682602238;
                    }
                    i129 = iM559715 ^ i119;
                    c142719 = c142718;
                    i134 = i118;
                    break;
                case 857062092:
                case 1786647818:
                    c14279 = c142719;
                    i132 = i132;
                    i133 = i133;
                    i5 = i134;
                    i36 = i145;
                    i146 = i146;
                    j29 = j29;
                    j7 = j27;
                    abstractC129713 = abstractC129713;
                    i131 = i131;
                    iMo23869 = iMo23869;
                    i142 = i142;
                    int i215 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i215;
                    if (i122 <= 0) {
                        bArr3 = bArr7;
                        i143 = i143;
                        iArr3 = iArr7;
                        i3 = i132;
                        j27 = j7;
                        i37 = i142;
                        int iM5597211 = C0946.m55979("֨ۘ") ^ i126;
                        i32 = ((iM5597211 ^ i127) * 4337) ^ 639899674;
                        i129 = iM5597211 ^ (-583727122);
                        bArr7 = bArr3;
                        iMo23869 = iMo23869;
                        i131 = i131;
                        abstractC129713 = abstractC129713;
                        i142 = i37;
                        i133 = i133;
                        iArr7 = iArr3;
                        j29 = j29;
                        i143 = i143;
                        i146 = i146;
                        i145 = i36;
                        i132 = i3;
                        i128 = i32;
                        i134 = i5;
                        c142719 = c14279;
                        int i151111 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i151111;
                    } else {
                        iM55683 = C0873.m55680("ۙ᩺") ^ i127;
                        i38 = ((iM55683 ^ i126) * (-25515)) ^ (-1492934496);
                        i39 = -1751161028;
                        int i216 = iM55683 ^ i39;
                        i134 = i5;
                        i145 = i36;
                        i142 = i142;
                        iMo23869 = iMo23869;
                        i131 = i131;
                        abstractC129713 = abstractC129713;
                        c142719 = c14279;
                        j29 = j29;
                        j27 = j7;
                        i129 = i216;
                        i146 = i146;
                        i128 = i38;
                        i132 = i132;
                        i133 = i133;
                        int i151112 = i12;
                        i140 = i140;
                        i130 = i130;
                        i141 = i151112;
                    }
                    break;
                case 883798279:
                case 1639471113:
                    C14279 c142729 = c142719;
                    int i217 = i133;
                    int i218 = i134;
                    int i219 = i143;
                    int i220 = i145;
                    int i221 = i146;
                    long j41 = j29;
                    long j42 = j26;
                    long j43 = j27;
                    int i222 = i142;
                    AbstractC12979 abstractC129715 = abstractC129713;
                    int i223 = i131;
                    int i224 = iMo23869;
                    byte[] bArr10 = bArr7;
                    int i225 = i138;
                    int i226 = i139;
                    i12 = i141;
                    if (i225 == 2) {
                        iM55681 = C0946.m55979("ۙ᩷") ^ i126;
                        i13 = ((iM55681 ^ i127) * (-9879)) ^ (-337055160);
                        i15 = -1992734975;
                    } else {
                        iM55681 = C0873.m55680("ᩴܿ") ^ i126;
                        i13 = ((iM55681 ^ i127) * (-31251)) ^ 1857280085;
                        i15 = 454897545;
                    }
                    int i227 = iM55681 ^ i15;
                    j26 = j42;
                    i138 = i225;
                    i139 = i226;
                    bArr7 = bArr10;
                    iMo23869 = i224;
                    i131 = i223;
                    i142 = i222;
                    i133 = i217;
                    i143 = i219;
                    j27 = j43;
                    i129 = i227;
                    i134 = i218;
                    i146 = i221;
                    i145 = i220;
                    abstractC129713 = abstractC129715;
                    c142719 = c142729;
                    j29 = j41;
                    i132 = i132;
                    i128 = i13;
                    iArr7 = iArr7;
                    int i151113 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i151113;
                    break;
                case 927991743:
                case 1254845922:
                    break;
                case 931601753:
                case 981776055:
                    i106 = i132;
                    i107 = i133;
                    i108 = i134;
                    j21 = j29;
                    i109 = i141;
                    i110 = i130;
                    i111 = i140;
                    i135 = (int) j21;
                    j22 = j27;
                    i143 = (int) j22;
                    i112 = i131;
                    abstractC12979M29749 = AbstractC12979.m29749(dataInput, i, c18817);
                    c142716 = c14279Arr[i139];
                    if (C1028.f81950 <= 0) {
                        int iM556818 = (C0873.m55680("᩺֨") + i127) * 3;
                        j23 = j21;
                        i128 = ((iM556818 ^ i126) * (-3745)) ^ 620534340;
                        i129 = iM556818 ^ 1060937133;
                    } else {
                        j23 = j21;
                        int iM556819 = (C0873.m55680("ܽ᩹") ^ i126) * (-105);
                        i129 = iM556819 ^ 1330420931;
                        i128 = ((iM556819 ^ i127) * 11013) ^ 1526731251;
                    }
                    j27 = j22;
                    i131 = i112;
                    abstractC129713 = abstractC12979M29749;
                    i132 = i106;
                    i134 = i108;
                    i133 = i107;
                    j29 = j23;
                    C14279 c1427210 = c142716;
                    i140 = i111;
                    i130 = i110;
                    i141 = i109;
                    c142719 = c1427210;
                    break;
                case 933671784:
                case 1390211518:
                    c142718 = c142719;
                    i118 = i134;
                    if (((long) i133) + ((long) i130) <= iMo23869) {
                        iM559715 = (C0946.m55979("᩷ᩳ") + i127) * 11;
                        i128 = ((iM559715 ^ i126) * (-24711)) ^ 1469016968;
                        i119 = 2066828817;
                    } else {
                        iM559715 = C0946.m55979("ܿ۟") ^ i127;
                        i128 = ((iM559715 ^ i126) * 22209) ^ 805190076;
                        i119 = 275977264;
                    }
                    i129 = iM559715 ^ i119;
                    c142719 = c142718;
                    i134 = i118;
                    break;
                case 964290766:
                case 1854572243:
                    return null;
                case 1131138714:
                case 1999602824:
                    break;
                case 1254037783:
                case 1548006743:
                    i71 = 27039;
                    int iM5568110 = C0873.m55680("ۤ۫") ^ i126;
                    i128 = ((iM5568110 ^ i127) * (-23119)) ^ 10752911;
                    i139 = i139;
                    i144 = i144;
                    i132 = i132;
                    bArr7 = bArr7;
                    i142 = i142;
                    c142719 = c142719;
                    iArr7 = iArr7;
                    i143 = i143;
                    j27 = j27;
                    i137 = i137;
                    i129 = iM5568110 ^ (-1356302015);
                    i145 = i145;
                    i131 = i131;
                    abstractC129713 = abstractC129713;
                    j29 = j29;
                    i134 = i71;
                    i130 = i130;
                    i133 = i133;
                    i141 = i141;
                    i140 = i140;
                    i138 = i138;
                    iMo23869 = iMo23869;
                    i146 = i146;
                    j25 = j25;
                    j26 = j26;
                    break;
                case 1372594902:
                case 1588866158:
                    throw m43170(C0898.m55792(f82286, 155, 24, i134));
                case 1736669895:
                case 2145063791:
                    C14279 c142730 = c142719;
                    i51 = i133;
                    int i228 = i143;
                    int[] iArr9 = iArr7;
                    int i229 = i144;
                    int i230 = i145;
                    j3 = j29;
                    long j44 = j27;
                    int i231 = i142;
                    abstractC129710 = abstractC129713;
                    int i232 = i131;
                    byte[] bArr11 = bArr7;
                    i57 = i137;
                    int i233 = i139;
                    i59 = i132;
                    i60 = i134;
                    j11 = j26;
                    j12 = j25;
                    i61 = i146;
                    i62 = iMo23869;
                    i63 = i138;
                    i64 = i140;
                    i65 = i141;
                    int i234 = i130;
                    s2 = f82286[0];
                    if (C1003.m56123() != 0) {
                        iM55684 = C0946.m55979("᩸ܶ") ^ i126;
                        i69 = ((iM55684 ^ i127) * (-26615)) ^ 177336302;
                        i70 = 204658169;
                    } else {
                        iM55684 = (C0873.m55680("ܽ۬") ^ i127) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i69 = ((iM55684 ^ i126) * 2391) ^ (-724528772);
                        i70 = -870820649;
                    }
                    int i235 = iM55684 ^ i70;
                    i128 = i69;
                    i139 = i233;
                    i144 = i229;
                    bArr7 = bArr11;
                    i131 = i232;
                    i142 = i231;
                    c142719 = c142730;
                    iArr7 = iArr9;
                    i143 = i228;
                    j27 = j44;
                    i129 = i235;
                    i145 = i230;
                    i130 = i234;
                    i141 = i65;
                    i140 = i64;
                    i138 = i63;
                    iMo23869 = i62;
                    i146 = i61;
                    j25 = j12;
                    j26 = j11;
                    i133 = i51;
                    i134 = i60;
                    i132 = i59;
                    i137 = i57;
                    abstractC129713 = abstractC129710;
                    j29 = j3;
                    break;
                default:
                    c14279 = c142719;
                    i3 = i132;
                    i4 = i133;
                    i5 = i134;
                    int i236 = i145;
                    int i237 = i146;
                    long j45 = j29;
                    long j46 = j27;
                    AbstractC12979 abstractC129716 = abstractC129713;
                    int i238 = i131;
                    int i239 = iMo23869;
                    int i240 = i142;
                    int i241 = i141;
                    i130 = i130;
                    i140 = i140;
                    i12 = i241;
                    if (i3 < i236) {
                        iM559711 = C0873.m55680("ۧۗ") ^ i126;
                        i32 = ((iM559711 ^ i127) * (-18369)) ^ 1528651894;
                        i50 = 1372125281;
                    } else {
                        iM559711 = C0946.m55979("۟ۘ") ^ i126;
                        i32 = ((iM559711 ^ i127) * 13813) ^ 1301453595;
                        i50 = -339481239;
                    }
                    int i242 = iM559711 ^ i50;
                    i145 = i236;
                    i142 = i240;
                    iMo23869 = i239;
                    i131 = i238;
                    abstractC129713 = abstractC129716;
                    j29 = j45;
                    j27 = j46;
                    i146 = i237;
                    i129 = i242;
                    i133 = i4;
                    i132 = i3;
                    i128 = i32;
                    i134 = i5;
                    c142719 = c14279;
                    int i151114 = i12;
                    i140 = i140;
                    i130 = i130;
                    i141 = i151114;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43169(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iM56023 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int length = 0;
        int i7 = 1625898685;
        int i8 = RunnableC1014.f81941;
        int i9 = C1036.f81953;
        int iM55680 = (C0873.m55680("֡ܰ") ^ i8) * (-15);
        int i10 = ((iM55680 ^ i9) * (-23899)) ^ 1026659712;
        int i11 = -167129687;
        while (true) {
            i7 = ((((i7 ^ i9) * 15949) >> 31) & i10) ^ (iM55680 ^ i11);
            switch (i7) {
                case -2054809187:
                case 1999769099:
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-25063)) ^ (-837205236);
                        i11 = 2016752471;
                    } else {
                        iM55680 = (i9 - C0873.m55680("۫ۜ")) * 127;
                        i10 = ((iM55680 ^ i8) * 14821) ^ 1869291850;
                        i11 = -1158348840;
                    }
                    break;
                case -2027073291:
                case -30378601:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("ܶۗ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-29809)) ^ (-617031595);
                        i11 = -1379913447;
                    } else {
                        iM55680 = C0946.m55979("ᩴ᩶") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-2739)) ^ (-1777022207);
                        i11 = -354768387;
                    }
                    break;
                case -2027022487:
                case -1697559278:
                    if (i4 < iM56023) {
                        iM55680 = (C0946.m55979("ܽܶ") + i8) * 95;
                        i10 = ((iM55680 ^ i9) * 30645) ^ 490224798;
                        i11 = 501883367;
                    } else {
                        i5 = iM56023;
                        iM55680 = (C0946.m55979("᩹ۛ") ^ i9) * (-53);
                        i10 = ((iM55680 ^ i8) * 8737) ^ (-49375484);
                        i11 = 2099443512;
                    }
                    break;
                case -1815466113:
                case -1473841111:
                    if (C0861.f81831) {
                        iM55680 = (i9 - C0873.m55680("ܽܽ")) * 93;
                        i10 = ((iM55680 ^ i8) * 25049) ^ 1583929705;
                        i11 = 882757980;
                    } else {
                        iM55680 = C0873.m55680("ܶۗ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-29809)) ^ (-617031595);
                        i11 = -1379913447;
                    }
                    break;
                case -1348607213:
                case 748319646:
                    iM56023 = C0955.m56023(bArr.length, i3);
                    i4 = 0;
                    iM55680 = C0873.m55680("᩵᩷") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-6873)) ^ 1858744973;
                    i11 = -80163299;
                    break;
                case -1304655481:
                case 785491112:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-25063)) ^ (-837205236);
                        i11 = 2016752471;
                    } else {
                        iM55680 = (C0873.m55680("ܿ᩵") ^ i9) * 71;
                        i10 = ((iM55680 ^ i8) * (-2839)) ^ 1898914156;
                        i11 = 1775968164;
                    }
                    break;
                case -1288421863:
                case 205177194:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0873.m55680("ܿ᩵") ^ i9) * 71;
                        i10 = ((iM55680 ^ i8) * (-2839)) ^ 1898914156;
                        i11 = 1775968164;
                    } else {
                        iM55680 = C0946.m55979("ۨۤ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-13011)) ^ (-579797598);
                        i11 = -909317768;
                    }
                    break;
                case -1253361077:
                case -565637640:
                    if (C1124.f82007 >= 0) {
                        iM55680 = C0873.m55680("ܶۗ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-29809)) ^ (-617031595);
                        i11 = -1379913447;
                    } else {
                        iM55680 = C0946.m55979("᩷۫") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-1407)) ^ 804459503;
                        i11 = 1512405077;
                    }
                    break;
                case -1107283511:
                case 1691264728:
                    if (RunnableC0897.f81856) {
                        iM55680 = C0946.m55979("ۡۧ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 10359) ^ 1290055440;
                        i11 = -1613077476;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۘ") + i8) * (-77);
                        i10 = ((iM55680 ^ i9) * (-4983)) ^ 1551033136;
                        i11 = -549746232;
                    }
                    break;
                case -726834723:
                case 1365540600:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0946.m55979("ᩳۘ") + i8) * (-77);
                        i10 = ((iM55680 ^ i9) * (-4983)) ^ 1551033136;
                        i11 = -549746232;
                    } else {
                        iM55680 = C0873.m55680("۠۫") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-22943)) ^ 1877916766;
                        i11 = -898004608;
                    }
                    break;
                case -626940401:
                case 1260646765:
                    C0955.m56025();
                    break;
                case -605133439:
                case -438961573:
                    break;
                case -546817646:
                case 1075152066:
                    bArr2[i6] = bArr[length];
                    i4++;
                    iM55680 = C0873.m55680("᩵᩷") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-6873)) ^ 1858744973;
                    i11 = -80163299;
                    break;
                case -541973585:
                case 1003261612:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-25063)) ^ (-837205236);
                        i11 = 2016752471;
                    } else {
                        iM55680 = C0873.m55680("ۙܺ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-15373)) ^ 261039757;
                        i11 = -1848511585;
                    }
                    break;
                case 434063478:
                case 1308244334:
                    if (C1044.f81959 < 0) {
                        iM55680 = (C0873.m55680("ܿ᩵") ^ i9) * 71;
                        i10 = ((iM55680 ^ i8) * (-2839)) ^ 1898914156;
                        i11 = 1775968164;
                    } else {
                        iM55680 = C0873.m55680("ܶۗ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-29809)) ^ (-617031595);
                        i11 = -1379913447;
                    }
                    break;
                case 817293028:
                case 981969179:
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("֫ۗ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-25063)) ^ (-837205236);
                        i11 = 2016752471;
                    } else {
                        iM55680 = (C0873.m55680("۫֡") ^ i8) * (-113);
                        i10 = ((iM55680 ^ i9) * 21695) ^ (-986928463);
                        i11 = -1553954131;
                    }
                    break;
                case 1267885341:
                case 1315983992:
                    i6 = i2 + i4;
                    length = (i + i4) % bArr.length;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ܶۗ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-29809)) ^ (-617031595);
                        i11 = -1379913447;
                    } else {
                        iM55680 = C0946.m55979("۠᩵") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-20867)) ^ (-1821564247);
                        i11 = 965472274;
                    }
                    break;
                case 1298536821:
                case 1415380094:
                    if (C0882.f81846) {
                        iM55680 = (C0873.m55680("ܿ᩵") ^ i9) * 71;
                        i10 = ((iM55680 ^ i8) * (-2839)) ^ 1898914156;
                        i11 = 1775968164;
                    } else {
                        iM55680 = (C0946.m55979("֡ۗ") ^ i9) * (-117);
                        i10 = ((iM55680 ^ i8) * (-8583)) ^ (-657497533);
                        i11 = -876528666;
                    }
                    break;
                case 1320888453:
                case 1519307665:
                    if (i5 < i3) {
                        iM55680 = (C0946.m55979("۫ᩳ") ^ i8) * 23;
                        i10 = ((iM55680 ^ i9) * (-6195)) ^ 749190784;
                        i11 = -294944522;
                    } else {
                        iM55680 = (C0946.m55979("۬ۤ") ^ i8) * 99;
                        i10 = ((iM55680 ^ i9) * 26983) ^ 1462692892;
                        i11 = 944863236;
                    }
                    break;
                case 1459795493:
                case 1625904241:
                    C1229.m56410();
                    iM55680 = C0873.m55680("ܶۗ") ^ i9;
                    i10 = ((iM55680 ^ i8) * (-29809)) ^ (-617031595);
                    i11 = -1379913447;
                    break;
                default:
                    int iM56024 = C0955.m56023(i5, i3 - i5);
                    AbstractC0942.m55965(bArr2, i2, bArr2, i2 + i5, iM56024);
                    i5 += iM56024;
                    iM55680 = (C0946.m55979("᩹ۛ") ^ i9) * (-53);
                    i10 = ((iM55680 ^ i8) * 8737) ^ (-49375484);
                    i11 = 2099443512;
                    break;
            }
            return;
        }
    }
}
