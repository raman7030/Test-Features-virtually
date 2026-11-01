package p067l;

import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K3YG */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6260 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ֫֫֫, reason: not valid java name and contains not printable characters */
    private static final short[] f81960 = {6199, -17872, -17861, -17860, -17796, -17857, -17882, -17796, -17886, -17858, -17881, -17867, -17861, -17860, -17796, -17887, -17877, -17887, -17882, -17865, -17857, 4081, 27843, 27871, 27846, 27860, 27866, 27869, 27805, 27871, 27868, 27860, 27795, 27806, 27795, 27855, 27795, 27855, 27795, 5455, -28777, 26930, -25989, 28960, -31348, 27112, 21536, 32538, 29684, 1539, 1567, 1542, 1556, 1562, 1565, 1580, 1567, 1564, 1556, 32412, 20864, 25856, 27162, 25523, 29077, 1539, 1567, 1542, 1556, 1562, 1565, 1594, 1559, 2736, 15537, 12769, -9665, 9599, 31073, -17870, 23549, 31099, -20089, -23052, 31314, 16949, 22689, -21040, 29899, 31137, -21498, -17027, 31230, -18147, -18185, 27750, -21718, -20319, -24356, -20573, 29874, -22459, 17217, -16526, 31466, -20451, -23037, -22680, 8725, 8734, 8729, 8793, 8730, 8707, 8793, 8711, 8731, 8706, 8720, 8734, 8729, 8793, 8708, 8718, 8708, 8707, 8722, 8730, 8829, 8799, 8798, -22202, 32326, -21051, 2311, 15794, 15758, 15767, 15749, 15755, 15756, 15790, 15757, 15749, 15796, 15755, 15751, 15765, 15751, 15760};

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f15835 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public C14146 f15836;

    /* JADX INFO: renamed from: ܿۧ */
    public String f15837;

    /* JADX INFO: renamed from: ᩳۧ */
    public C17143 f15838;

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
        int i5 = -2025420984;
        int i6 = C1964.f83032;
        int i7 = C0866.f81837;
        int iM55680 = C0873.m55680("᩻᩶") ^ i7;
        int i8 = ((iM55680 ^ i6) * (-1347)) ^ (-103269899);
        int i9 = 833016040;
        while (true) {
            i5 = ((((i5 ^ i6) * (-29721)) >> 31) & i8) ^ (iM55680 ^ i9);
            switch (i5) {
                case -2121568417:
                case -592623340:
                    C0927.m55873();
                    AbstractC0942.m55971();
                    iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                    i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                    i9 = 821023823;
                    break;
                case -2054406603:
                case 1703344552:
                    c = 134;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0873.m55680("֫ۨ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        iM55680 = (C0946.m55979("ᩴ᩷") + i6) * (-37);
                        i8 = ((iM55680 ^ i7) * 14943) ^ (-420220194);
                        i9 = 696584714;
                    }
                    break;
                case -1867932599:
                case 1703831046:
                    RunnableC1014.m56177();
                    if (C0854.m55595() < 0) {
                        iM55680 = (i7 - C0873.m55680("ۘۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM55680 ^ i6) * (-22651)) ^ (-1458105638);
                        i9 = -1880653169;
                    } else {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    }
                    break;
                case -1586589408:
                case 504617412:
                    i3 = 15842;
                    iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                    i8 = ((iM55680 ^ i7) * 18915) ^ (-1720455725);
                    i9 = -1646024556;
                    break;
                case -1476370841:
                case 666933092:
                    sArr2 = f81960;
                    i4 = 135;
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("֫ۨ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        iM55680 = C0946.m55979("ᩳ᩺") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-16519)) ^ (-935259823);
                        i9 = -682059773;
                    }
                    break;
                case -1475413174:
                case -293156432:
                    sArr = f81960;
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ۙܽ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 29559) ^ (-1633802185);
                        i9 = 1598961785;
                    } else {
                        iM55680 = C0873.m55680("ۗۜ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 29473) ^ (-1644941330);
                        i9 = 59688434;
                    }
                    break;
                case -1421821959:
                case 142114919:
                    return C1053.m56325(sArr2, i4, 15, i3);
                case -1264483620:
                case -299103275:
                    i2 = i + 1;
                    if (C1053.m56327() >= 0) {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        iM55680 = C0873.m55680("ܰᩴ") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-1169)) ^ 355010199;
                        i9 = 480862116;
                    }
                    break;
                case -1184873335:
                case 472949320:
                    s = sArr[c];
                    if (C0866.f81837 >= 0) {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        iM55680 = (i7 - C0873.m55680("᩺᩻")) * 51;
                        i8 = ((iM55680 ^ i6) * (-15965)) ^ 1065433755;
                        i9 = -1078312270;
                    }
                    break;
                case -1101558950:
                case -841554566:
                    int i10 = s + s2;
                    if ((i10 * i10) - i2 >= 0) {
                        iM55680 = C0946.m55979("ܰ֡") ^ i7;
                        i8 = ((iM55680 ^ i6) * (-21139)) ^ (-956524967);
                        i9 = -1053791306;
                    } else {
                        iM55680 = (i7 - C0946.m55979("ۜ᩹")) * 81;
                        i8 = ((iM55680 ^ i6) * (-5223)) ^ (-1805821380);
                        i9 = -1610632328;
                    }
                    break;
                case -1014304541:
                case -795169688:
                    s2 = 1;
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        iM55680 = C0946.m55979("ۘ۟") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-7529)) ^ (-1800659615);
                        i9 = -1951115586;
                    }
                    break;
                case -858056172:
                case 1016408672:
                    i = s * 2;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0873.m55680("ۨۖ") ^ i6;
                        i8 = ((iM55680 ^ i7) * (-11437)) ^ (-1226241851);
                        i9 = -1521859004;
                    } else {
                        iM55680 = C0873.m55680("ۗ᩸") ^ i6;
                        i8 = ((iM55680 ^ i7) * 32627) ^ 1233792410;
                        i9 = -2126353730;
                    }
                    break;
                case -168398090:
                case 707077287:
                    C0861.m55626();
                    C1229.m56410();
                    return null;
                case 180615042:
                case 595958270:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0873.m55680("֫ۨ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    }
                    break;
                case 249636246:
                case 1071206161:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (i7 - C0873.m55680("ۘۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((iM55680 ^ i6) * (-22651)) ^ (-1458105638);
                        i9 = -1880653169;
                    } else {
                        iM55680 = C0946.m55979("ᩴ᩵") ^ i7;
                        i8 = ((iM55680 ^ i6) * 25709) ^ 1505959448;
                        i9 = -460609569;
                    }
                    break;
                case 262753654:
                case 419815041:
                    if (C1044.m56286() > 0) {
                        iM55680 = C0873.m55680("ۗۜ") ^ i7;
                        i8 = ((iM55680 ^ i6) * 29473) ^ (-1644941330);
                        i9 = 59688434;
                    } else {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    }
                    break;
                case 1001111389:
                case 1318679048:
                    if (C1194.m56396() <= 0) {
                        iM55680 = (C0946.m55979("֫ܶ") ^ i6) * 29;
                        i8 = ((iM55680 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        iM55680 = C0873.m55680("᩵ۖ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 21319) ^ (-1742333446);
                        i9 = 1348912202;
                    }
                    break;
                case 1781365333:
                case 1789781278:
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("֫ۨ") ^ i6;
                        i8 = ((iM55680 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        iM55680 = (C0873.m55680("ۜ֨") ^ i7) * 45;
                        i8 = ((iM55680 ^ i6) * (-10629)) ^ (-932544633);
                        i9 = 937331829;
                    }
                    break;
                default:
                    i3 = 46467;
                    iM55680 = C0873.m55680("ۤᩴ") ^ i6;
                    i8 = ((iM55680 ^ i7) * 18915) ^ (-1720455725);
                    i9 = -1646024556;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0 A[PHI: r3
      0x00b0: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:27:0x00ae, B:15:0x0067, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b A[PHI: r1 r12
      0x010b: PHI (r1v4 android.view.MenuInflater) = (r1v3 android.view.MenuInflater), (r1v2 android.view.MenuInflater) binds: [B:35:0x0109, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r12v4 short[]) = (r12v3 short[]), (r12v2 short[]) binds: [B:35:0x0109, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d0 A[PHI: r6 r7 r8 r9
      0x01d0: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:54:0x01ce, B:50:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:54:0x01ce, B:50:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:54:0x01ce, B:50:0x01b0] A[DONT_GENERATE, DONT_INLINE]
      0x01d0: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:54:0x01ce, B:50:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x021b A[PHI: r13 r18
      0x021b: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:62:0x0219, B:31:0x00e5, B:17:0x006b, B:15:0x0067, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:62:0x0219, B:31:0x00e5, B:17:0x006b, B:15:0x0067, B:9:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0245 A[PHI: r2 r5 r10
      0x0245: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:58:0x01fe, B:46:0x018e, B:12:0x005d, B:6:0x004c, B:87:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r5v5 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:58:0x01fe, B:46:0x018e, B:12:0x005d, B:6:0x004c, B:87:0x0245] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r10v5 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:58:0x01fe, B:46:0x018e, B:12:0x005d, B:6:0x004c, B:87:0x0245] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM55680;
        int i;
        int i2;
        int i3 = C0967.f81910;
        int i4 = RunnableC0871.f81839;
        int iM55681 = (C0873.m55680("۟᩺") + i3) * (-107);
        int i5 = ((iM55681 ^ i4) * (-27197)) ^ 717088666;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55681 ^ (-1891126126);
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -652524366;
        String strM56016 = null;
        int iM55682 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-26349)) >> 31));
            switch (i12) {
                case -2129010590:
                case 502151800:
                    if (C1124.m56367() < 0) {
                        iM55680 = (C0873.m55680("ۚ۟") ^ i4) * 101;
                        i = ((iM55680 ^ i3) * (-19241)) ^ 1334399801;
                        i2 = -1964188123;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۠ۢ")) * (-47);
                        i = ((iM55680 ^ i4) * (-31297)) ^ 1042122335;
                        i2 = -1707537979;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1909493763:
                case 1188639424:
                    C0927.m55873();
                    return false;
                case -1871238336:
                case 482000846:
                    s = sArr[c];
                    s2 = 12838;
                    if (C0861.f81831) {
                        iM55680 = C0946.m55979("ܺܿ") ^ i3;
                        i = ((iM55680 ^ i4) * 29597) ^ (-1064960595);
                        i2 = -272045399;
                    } else {
                        iM55680 = C0873.m55680("᩺ܳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-23279)) ^ (-1096402306);
                        i2 = -1518843647;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1800183797:
                case -958491337:
                    C0894.m55769();
                    if (C1044.m56286() <= 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 61;
                        i = ((iM55680 ^ i4) * 23097) ^ (-809183986);
                        i2 = 12855460;
                    } else {
                        iM55680 = (C0873.m55680("ۚ۟") ^ i4) * 101;
                        i = ((iM55680 ^ i3) * (-19241)) ^ 1334399801;
                        i2 = -1964188123;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1708407517:
                case -458441782:
                    iM55682 = C0873.m55680(strM56016) ^ 2104370099;
                    if (C1024.f81946) {
                        iM55680 = (i3 - C0946.m55979("۠ۢ")) * (-47);
                        i = ((iM55680 ^ i4) * (-31297)) ^ 1042122335;
                        i2 = -1707537979;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM55979 = (C0946.m55979("۟᩵") + i4) * 81;
                        i5 = ((iM55979 ^ i3) * (-28359)) ^ (-2116956035);
                        i6 = iM55979 ^ (-473020041);
                    }
                    break;
                case -1586164161:
                case 1433852828:
                    sArr = f81960;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 61;
                        i = ((iM55680 ^ i4) * 23097) ^ (-809183986);
                        i2 = 12855460;
                    } else {
                        iM55680 = C0873.m55680("ܰۧ") ^ i3;
                        i = ((iM55680 ^ i4) * 18591) ^ 1593554016;
                        i2 = -1249955324;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1573340361:
                case 1073500736:
                    menuInflater = getMenuInflater();
                    sArr2 = f81960;
                    if (C0854.f81826 != 0) {
                        iM55680 = C0946.m55979("۫ܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-15333)) ^ (-372908858);
                        i2 = -1773523069;
                    } else {
                        iM55680 = C0946.m55979("ܳۢ") ^ i4;
                        i = ((iM55680 ^ i3) * 15455) ^ (-1848929393);
                        i2 = 1970999752;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1512988043:
                case -1128365112:
                    i10 = 42130;
                    iM55680 = C0946.m55979("ܶ᩶") ^ i3;
                    i = ((iM55680 ^ i4) * (-10477)) ^ (-1730412586);
                    i2 = 698124643;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1327574492:
                case 1014980480:
                    i10 = 41420;
                    iM55680 = C0946.m55979("ܶ᩶") ^ i3;
                    i = ((iM55680 ^ i4) * (-10477)) ^ (-1730412586);
                    i2 = 698124643;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1248246106:
                case 1523180482:
                    menuInflater.inflate(iM55682, menu);
                    return true;
                case -353011582:
                case 1845730562:
                    strM56016 = C0949.m56016(sArr2, i11, 3, i10);
                    if (C0937.f81884) {
                        iM55680 = (i3 - C0873.m55680("᩵֡")) * (-23);
                        i = ((iM55680 ^ i4) * 2809) ^ 698398406;
                        i2 = -1865381374;
                    } else {
                        iM55680 = (C0873.m55680("ۚ۟") ^ i4) * 101;
                        i = ((iM55680 ^ i3) * (-19241)) ^ 1334399801;
                        i2 = -1964188123;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -345938285:
                case 1684850104:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0873.m55680("᩺ܳ") ^ i4;
                        i = ((iM55680 ^ i3) * (-23279)) ^ (-1096402306);
                        i2 = -1518843647;
                    } else {
                        iM55680 = C0873.m55680("۟ܶ") ^ i4;
                        i = ((iM55680 ^ i3) * 3635) ^ (-755894520);
                        i2 = -1021881427;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -327153560:
                case 999260779:
                    i11 = 74;
                    if (C0947.m55997()) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 61;
                        i = ((iM55680 ^ i4) * 23097) ^ (-809183986);
                        i2 = 12855460;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܳۛ")) * 31;
                        i = ((iM55680 ^ i3) * 14029) ^ 711502281;
                        i2 = -882145733;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -289458108:
                case 1257852535:
                    C0949.m56012();
                    RunnableC0897.m55784();
                    iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 61;
                    i = ((iM55680 ^ i4) * 23097) ^ (-809183986);
                    i2 = 12855460;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -201145498:
                case 1493113096:
                    if ((i8 + i9) - i7 < 0) {
                        iM55680 = (i4 - C0946.m55979("ۤ᩵")) * 55;
                        i = ((iM55680 ^ i3) * (-9597)) ^ (-470988977);
                        i2 = -1323173753;
                    } else {
                        iM55680 = C0873.m55680("۠۬") ^ i3;
                        i = ((iM55680 ^ i4) * (-19291)) ^ (-781955177);
                        i2 = 997901948;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -33644277:
                case 1015057751:
                    C0927.m55873();
                    if (C1929.f83011 == 0) {
                        iM55680 = (C0946.m55979("ۖ᩶") ^ i3) * 61;
                        i = ((iM55680 ^ i4) * 23097) ^ (-809183986);
                        i2 = 12855460;
                    } else {
                        iM55680 = C0946.m55979("۫ܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-15333)) ^ (-372908858);
                        i2 = -1773523069;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1015568051:
                case 1054547943:
                    c = 'I';
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = (i3 - C0946.m55979("۠ۢ")) * (-47);
                        i = ((iM55680 ^ i4) * (-31297)) ^ 1042122335;
                        i2 = -1707537979;
                    } else {
                        iM55680 = C0873.m55680("۟۠") ^ i4;
                        i = ((iM55680 ^ i3) * (-19341)) ^ 1244840736;
                        i2 = 160173838;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1525444661:
                case 1612490393:
                    i9 = 41203561;
                    if (C0946.f81894 != 0) {
                        iM55680 = (i3 - C0946.m55979("۠ۢ")) * (-47);
                        i = ((iM55680 ^ i4) * (-31297)) ^ 1042122335;
                        i2 = -1707537979;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܳ᩶")) * (-111);
                        i = ((iM55680 ^ i4) * 8801) ^ (-1461449152);
                        i2 = 721844297;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۠ۢ")) * (-47);
                        i = ((iM55680 ^ i4) * (-31297)) ^ 1042122335;
                        i2 = -1707537979;
                    } else {
                        iM55680 = (C0946.m55979("ۤܽ") + i4) * (-5);
                        i = ((iM55680 ^ i3) * 11975) ^ (-1140288009);
                        i2 = 1601879911;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14121. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ActivityC6260.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m14200(ActivityC6260 activityC6260) {
        C14146 c14146 = null;
        String str = null;
        C14146 c14147 = null;
        int i = 832425137;
        int i2 = C1071.f81975;
        int i3 = RunnableC0871.f81839;
        int iM55680 = (i3 - C0873.m55680("ܽ֫")) * 13;
        int i4 = ((iM55680 ^ i2) * (-12479)) ^ 1772439984;
        int i5 = -605193090;
        while (true) {
            i = ((((i ^ i2) * 9017) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1263522412:
                case 548633046:
                    if (RunnableC0871.f81839 < 0) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    } else {
                        iM55680 = C0873.m55680("᩹ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24211) ^ (-1177477452);
                        i5 = 55276589;
                    }
                    break;
                case -1214488650:
                case 188847250:
                    str = "";
                    if (C0989.f81920 >= 0) {
                        iM55680 = C0873.m55680("᩷ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17797)) ^ 1575321467;
                        i5 = 788037911;
                    } else {
                        iM55680 = (C0946.m55979("ܰ۬") + i3) * (-49);
                        i4 = ((iM55680 ^ i2) * (-8465)) ^ (-1567584020);
                        i5 = -2035018690;
                    }
                    break;
                case -1211549412:
                case -896533921:
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    } else {
                        iM55680 = (C0873.m55680("ۗ֫") ^ i2) * (-49);
                        i4 = ((iM55680 ^ i3) * (-24465)) ^ (-74156616);
                        i5 = -761944345;
                    }
                    break;
                case -1198518756:
                case 995172126:
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("ܺᩴ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-10915)) ^ 1411145696;
                        i5 = 1354444038;
                    } else {
                        iM55680 = C0946.m55979("ܰ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    }
                    break;
                case -1120649108:
                case 646287781:
                    ViewOnClickListenerC0939.m55941();
                    RunnableC0897.m55784();
                    iM55680 = C0873.m55680("᩹ܰ") ^ i2;
                    i4 = ((iM55680 ^ i3) * 24211) ^ (-1177477452);
                    i5 = 55276589;
                    break;
                case -918542125:
                case 144668818:
                    c14146 = activityC6260.f15836;
                    if (C0930.m55885() <= 0) {
                        iM55680 = (C0873.m55680("ۚۡ") ^ i3) * (-47);
                        i4 = ((iM55680 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        iM55680 = C0946.m55979("ۘ᩻") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14791) ^ (-1518847824);
                        i5 = 771400945;
                    }
                    break;
                case -642601813:
                case 138437788:
                    if (C0967.f81910 < 0) {
                        iM55680 = (C0873.m55680("ۚۡ") ^ i3) * (-47);
                        i4 = ((iM55680 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۙ") ^ i3) * 97;
                        i4 = ((iM55680 ^ i2) * 30369) ^ 1525374597;
                        i5 = 1908926633;
                    }
                    break;
                case -344627162:
                case 636719418:
                    C1036.m56257();
                    RunnableC0938.m55938();
                    break;
                case -50091659:
                case 961750782:
                    c14147.scrollTo(0, 0);
                    break;
                case 2884283:
                case 1651661884:
                    C1964.m56598(c14146, str);
                    c14147 = activityC6260.f15836;
                    if (C0989.m56095() <= 0) {
                        iM55680 = C0946.m55979("ܰ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    } else {
                        iM55680 = (C0873.m55680("۟۠") + i2) * (-125);
                        i4 = ((iM55680 ^ i3) * (-135)) ^ (-584500249);
                        i5 = 747370909;
                    }
                    break;
                case 170733907:
                case 1285049038:
                    C16907.m38468();
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("᩷ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17797)) ^ 1575321467;
                        i5 = 788037911;
                    } else {
                        iM55680 = C0946.m55979("᩹ۧ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5843) ^ 2044128519;
                        i5 = 36928760;
                    }
                    break;
                case 298847358:
                case 1151743019:
                    if (C0894.m55769() >= 0) {
                        iM55680 = (C0873.m55680("ۚۡ") ^ i3) * (-47);
                        i4 = ((iM55680 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        iM55680 = C0946.m55979("ܶ۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-13405)) ^ 1935424188;
                        i5 = -1916099823;
                    }
                    break;
                case 338803400:
                case 980096927:
                    if (C1025.f81947 >= 0) {
                        iM55680 = (C0946.m55979("᩶ۙ") ^ i3) * 97;
                        i4 = ((iM55680 ^ i2) * 30369) ^ 1525374597;
                        i5 = 1908926633;
                    } else {
                        iM55680 = C0946.m55979("᩶ۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9073) ^ (-647953292);
                        i5 = -1154137004;
                    }
                    break;
                case 583893214:
                case 1654275072:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("᩹ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24211) ^ (-1177477452);
                        i5 = 55276589;
                    } else {
                        iM55680 = C0946.m55979("ۘۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 25309) ^ 2024259375;
                        i5 = 501881632;
                    }
                    break;
                case 613128630:
                case 901974466:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ۚۡ") ^ i3) * (-47);
                        i4 = ((iM55680 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        iM55680 = (C0873.m55680("ۘܽ") + i3) * (-125);
                        i4 = ((iM55680 ^ i2) * 22547) ^ (-1259204873);
                        i5 = 2017476128;
                    }
                    break;
                default:
                    C0917.m55854();
                    if (C1194.m56396() > 0) {
                        iM55680 = (C0946.m55979("᩶ۙ") ^ i3) * 97;
                        i4 = ((iM55680 ^ i2) * 30369) ^ 1525374597;
                        i5 = 1908926633;
                    } else {
                        iM55680 = C0873.m55680("᩹ܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 24211) ^ (-1177477452);
                        i5 = 55276589;
                    }
                    break;
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ܽ */
    private void m14204(java.lang.String r50) {
        /*
            Method dump skipped, instruction units count: 4168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.ActivityC6260.m14204(java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0235 A[PHI: r6 r7 r8
      0x0235: PHI (r6v4 int) = (r6v3 int), (r6v1 int), (r6v1 int) binds: [B:49:0x0188, B:10:0x003c, B:6:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r7v3 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:49:0x0188, B:10:0x003c, B:6:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:49:0x0188, B:10:0x003c, B:6:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0269 A[PHI: r3
      0x0269: PHI (r3v3 short[]) = (r3v1 short[]), (r3v1 short[]), (r3v2 short[]), (r3v1 short[]) binds: [B:71:0x0267, B:61:0x0200, B:57:0x01e1, B:14:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x029a  */
    /* JADX WARN: Code duplicated, block: B:80:0x02cc A[PHI: r2
      0x02cc: PHI (r2v4 java.lang.Object) = (r2v1 java.lang.Object), (r2v3 java.lang.Object), (r2v1 java.lang.Object) binds: [B:79:0x02ca, B:28:0x008e, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (p067l.C0947.f81895 != false) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m14201(ActivityC6260 activityC6260, List list, DialogInterface dialogInterface, int i) {
        int iM55979;
        int i2;
        int i3;
        Object objM56587 = null;
        short[] sArr = null;
        short s = 0;
        short s2 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1951584083;
        int i9 = C0866.f81837;
        int i10 = C0912.f81867;
        int iM55680 = C0873.m55680("᩻ۚ") ^ i10;
        int i11 = ((iM55680 ^ i9) * (-21393)) ^ (-1011600099);
        int i12 = iM55680 ^ (-231528990);
        while (true) {
            i8 = ((((i8 ^ i9) * (-22595)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -1959295750:
                case 1599390731:
                    i7 = 16946;
                    iM55979 = C0873.m55680("ᩳܿ") ^ i10;
                    i2 = ((iM55979 ^ i9) * 16243) ^ (-245892130);
                    i3 = -1699519670;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1837648599:
                case -630197449:
                    int i13 = s + s2;
                    i4 = i13 * i13;
                    i5 = s * s;
                    i6 = 175615504;
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("ܶ֡") ^ i10) * (-83);
                        i2 = ((iM55979 ^ i9) * (-27675)) ^ 977696722;
                        i3 = -146059774;
                    } else {
                        iM55979 = (i10 - C0873.m55680("ۖ᩺")) * (-115);
                        i2 = ((iM55979 ^ i9) * (-7639)) ^ (-864937861);
                        i3 = -1888176609;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1667665192:
                case -1200630943:
                    ViewOnClickListenerC0939.m55941();
                    if (C0863.f81833 > 0) {
                        iM55979 = (C0946.m55979("ܺۘ") ^ i9) * 95;
                        i2 = ((iM55979 ^ i10) * 3365) ^ (-584257269);
                        i3 = -1444905240;
                        i12 = iM55979 ^ i3;
                        i11 = i2;
                    }
                    iM55979 = C0946.m55979("ۙۚ") ^ i9;
                    i2 = ((iM55979 ^ i10) * 13141) ^ (-1036840986);
                    i3 = 604989966;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1570742486:
                case -69270587:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0946.m55979("ۡᩴ") ^ i10) * 5;
                        i2 = ((iM55979 ^ i9) * (-25579)) ^ 1697998969;
                        i3 = -831883749;
                        i12 = iM55979 ^ i3;
                        i11 = i2;
                    }
                    iM55979 = (C0946.m55979("ܶ֡") ^ i10) * (-83);
                    i2 = ((iM55979 ^ i9) * (-27675)) ^ 977696722;
                    i3 = -146059774;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1501389245:
                case -444405983:
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("ۙۚ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 13141) ^ (-1036840986);
                        i3 = 604989966;
                    } else {
                        iM55979 = C0946.m55979("ᩳۢ") ^ i10;
                        i2 = ((iM55979 ^ i9) * 27143) ^ 2002543335;
                        i3 = 1980408718;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1394613084:
                case -80943316:
                    C0854.m55595();
                    iM55979 = (C0946.m55979("ܶ֡") ^ i10) * (-83);
                    i2 = ((iM55979 ^ i9) * (-27675)) ^ 977696722;
                    i3 = -146059774;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1308965431:
                case 2008099724:
                    if (C0892.f81851) {
                        iM55979 = (C0946.m55979("۬᩻") ^ i9) * (-87);
                        i2 = ((iM55979 ^ i10) * (-32019)) ^ (-1945284847);
                        i3 = -331263292;
                    } else {
                        iM55979 = (C0946.m55979("ۡᩴ") ^ i10) * 5;
                        i2 = ((iM55979 ^ i9) * (-25579)) ^ 1697998969;
                        i3 = -831883749;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1306580702:
                case -540565178:
                    i7 = 47698;
                    iM55979 = C0873.m55680("ᩳܿ") ^ i10;
                    i2 = ((iM55979 ^ i9) * 16243) ^ (-245892130);
                    i3 = -1699519670;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1205068956:
                case -982464277:
                    activityC6260.m14204(C0866.m55658((C18249) objM56587));
                    iM55979 = (C0946.m55979("᩵ۘ") ^ i9) * 81;
                    i2 = ((iM55979 ^ i10) * 30563) ^ 625552864;
                    i3 = 1376008287;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1196110574:
                case 108211203:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("ۙۚ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 13141) ^ (-1036840986);
                        i3 = 604989966;
                    } else {
                        iM55979 = C0873.m55680("֡ۡ") ^ i10;
                        i2 = ((iM55979 ^ i9) * (-14101)) ^ 1026495720;
                        i3 = 677417120;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -1031756840:
                case 160123669:
                    if (C0955.f81898) {
                        iM55979 = (C0946.m55979("ܺۘ") ^ i9) * 95;
                        i2 = ((iM55979 ^ i10) * 3365) ^ (-584257269);
                        i3 = -1444905240;
                    } else {
                        iM55979 = C0873.m55680("ۨ᩹") ^ i9;
                        i2 = ((iM55979 ^ i10) * (-18555)) ^ 1314971407;
                        i3 = 1737976704;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -968927105:
                case 54445423:
                    int i14 = i5 + i6;
                    if (i4 - (i14 + i14) > 0) {
                        iM55979 = C0873.m55680("ܰ֡") ^ i9;
                        i2 = ((iM55979 ^ i10) * 19573) ^ (-696324369);
                        i3 = 1410610824;
                    } else {
                        iM55979 = C0946.m55979("ۡ֫") ^ i9;
                        i2 = ((iM55979 ^ i10) * 22213) ^ 1328339285;
                        i3 = 1832691147;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -962369496:
                case 1903266593:
                    if (RunnableC0897.m55784()) {
                        iM55979 = (C0946.m55979("ܺۘ") ^ i9) * 95;
                        i2 = ((iM55979 ^ i10) * 3365) ^ (-584257269);
                        i3 = -1444905240;
                    } else {
                        iM55979 = (C0873.m55680("ۨ᩷") ^ i10) * C0254q.f1218h;
                        i2 = ((iM55979 ^ i9) * (-5303)) ^ 937976814;
                        i3 = -1087008148;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -884587169:
                case -431464573:
                    dialogInterface.dismiss();
                    break;
                case -871824388:
                case -809328362:
                    objM56587 = C1964.m56587(list, i - 2);
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("ۡᩴ") ^ i10) * 5;
                        i2 = ((iM55979 ^ i9) * (-25579)) ^ 1697998969;
                        i3 = -831883749;
                    } else {
                        iM55979 = (i9 - C0873.m55680("۠᩷")) * 123;
                        i2 = ((iM55979 ^ i10) * 4331) ^ 86782815;
                        i3 = -252183281;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -646282254:
                case 1749377837:
                    if (i == 0) {
                        iM55979 = (C0946.m55979("ᩳܺ") + i10) * (-111);
                        i2 = ((iM55979 ^ i9) * (-339)) ^ 283115188;
                        i3 = 2063478316;
                    } else {
                        iM55979 = (i9 - C0873.m55680("ܽᩳ")) * 19;
                        i2 = ((iM55979 ^ i10) * 7467) ^ 231615906;
                        i3 = -1989691145;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -480638265:
                case 1764172475:
                    activityC6260.m14204((String) null);
                    iM55979 = (C0946.m55979("᩵ۘ") ^ i9) * 81;
                    i2 = ((iM55979 ^ i10) * 30563) ^ 625552864;
                    i3 = 1376008287;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case -232331759:
                case 1847387539:
                    C0949.m56012();
                    C0992.m56107();
                    break;
                case 116096160:
                case 1246051779:
                    if (i == 1) {
                        iM55979 = C0946.m55979("ۛۙ") ^ i10;
                        i2 = ((iM55979 ^ i9) * (-4977)) ^ 339769414;
                        i3 = 868148862;
                    } else {
                        iM55979 = C0873.m55680("ۛۛ") ^ i10;
                        i2 = ((iM55979 ^ i9) * 26085) ^ 1874960153;
                        i3 = -1883045112;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case 263936181:
                case 1886709428:
                    activityC6260.m14204(C1012.m56144(f81960, 1, 20, i7));
                    iM55979 = (C0946.m55979("᩵ۘ") ^ i9) * 81;
                    i2 = ((iM55979 ^ i10) * 30563) ^ 625552864;
                    i3 = 1376008287;
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case 1394911233:
                case 1806368340:
                    sArr = f81960;
                    if (C1124.f82007 >= 0) {
                        iM55979 = C0946.m55979("ۙۚ") ^ i9;
                        i2 = ((iM55979 ^ i10) * 13141) ^ (-1036840986);
                        i3 = 604989966;
                    } else {
                        iM55979 = (C0946.m55979("ܰ۠") + i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM55979 ^ i9) * (-24173)) ^ (-213614430);
                        i3 = 1068127836;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                case 1416630323:
                case 1742658795:
                    C0967.m56074();
                    break;
                case 1608400943:
                case 1770230064:
                    s = sArr[0];
                    s2 = 13252;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("֡᩵") ^ i10;
                        i2 = ((iM55979 ^ i9) * 19521) ^ 1315659468;
                        i3 = -1206579035;
                    } else {
                        iM55979 = (C0946.m55979("֫ܿ") ^ i9) * (-65);
                        i2 = ((iM55979 ^ i10) * 4017) ^ 317514707;
                        i3 = -1920200066;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
                default:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ܶ֡") ^ i10) * (-83);
                        i2 = ((iM55979 ^ i9) * (-27675)) ^ 977696722;
                        i3 = -146059774;
                    } else {
                        iM55979 = (C0873.m55680("ۖ᩶") + i9) * 81;
                        i2 = ((iM55979 ^ i10) * 18225) ^ (-1160599590);
                        i3 = -1812797370;
                    }
                    i12 = iM55979 ^ i3;
                    i11 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m14202(ActivityC6260 activityC6260) {
        C14146 c14146 = activityC6260.f15836;
        c14146.setScrollY(c14146.m32592());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v32 */
    /* JADX WARN: Type inference failed for: r29v35 */
    /* JADX WARN: Type inference failed for: r29v38 */
    /* JADX WARN: Type inference failed for: r29v39 */
    /* JADX WARN: Type inference failed for: r29v40 */
    /* JADX WARN: Type inference failed for: r29v41 */
    /* JADX WARN: Type inference failed for: r29v44 */
    /* JADX WARN: Type inference failed for: r29v45 */
    /* JADX WARN: Type inference failed for: r29v46 */
    /* JADX WARN: Type inference failed for: r29v47 */
    /* JADX WARN: Type inference failed for: r29v48 */
    /* JADX WARN: Type inference failed for: r29v49 */
    /* JADX WARN: Type inference failed for: r29v50 */
    /* JADX WARN: Type inference failed for: r29v51 */
    /* JADX WARN: Type inference failed for: r29v52 */
    /* JADX WARN: Type inference failed for: r29v53 */
    /* JADX WARN: Type inference failed for: r29v54 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v88 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r4v98 */
    /* JADX WARN: Type inference failed for: r4v99 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int iM559711;
        int i6;
        int i7;
        int i8;
        int iM55681;
        int i9;
        int i10;
        int i11;
        boolean z;
        ?? r29;
        int iM55682;
        int i12;
        int iM559712;
        int i13;
        int i14;
        ?? r4;
        int iM559713;
        C20671 c20671;
        C20671 c20672;
        HashSet hashSet;
        String str;
        short[] sArr;
        StringBuilder sb;
        int i15;
        C20671 c20673;
        int i16;
        short[] sArr2;
        int i17;
        int i18;
        List list;
        int iM55683;
        int i19;
        ?? r210;
        String str2;
        HashSet hashSet2;
        short[] sArr3;
        int iM559714;
        int i20;
        int i21;
        ?? r5;
        int i22;
        HashSet hashSet3;
        C20671 c20674;
        int i23;
        short[] sArr4;
        StringBuilder sb2;
        int i24;
        ?? r211;
        ?? r212;
        int i25;
        int iM55684;
        int i26;
        ?? r6;
        ?? r213;
        ?? r214;
        ?? r215;
        ?? r216;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1509354763;
        int i30 = ServiceConnectionC1013.f81940;
        int i31 = C1003.f81929;
        int iM559715 = C0946.m55979("֡ۚ") ^ i30;
        int i32 = ((iM559715 ^ i31) * (-18489)) ^ (-401551606);
        int i33 = iM559715 ^ (-489058679);
        ArrayList arrayList = null;
        HashSet hashSet4 = null;
        Iterator itM55766 = null;
        C20671 c20675 = null;
        StringBuilder sb3 = null;
        C20671 c20676 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        boolean z2 = false;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        short s = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        final List listM34312 = null;
        HashSet hashSet5 = null;
        String str3 = null;
        C18249 c18249 = null;
        int i43 = 0;
        int i44 = 0;
        Iterator itM55767 = null;
        String str4 = null;
        int i45 = 0;
        while (true) {
            i29 = i33 ^ (i32 & (((i29 ^ i31) * (-23883)) >> 31));
            switch (i29) {
                case -2147089996:
                case -196696066:
                    c20676 = c20676;
                    itM55767 = C0894.m55766(listM34312);
                    iM55979 = C0873.m55680("ܰܺ") ^ i30;
                    i3 = ((iM55979 ^ i31) * (-17957)) ^ 2037465487;
                    i4 = 639823934;
                    i33 = iM55979 ^ i4;
                    i32 = i3;
                    str3 = str3;
                    hashSet4 = hashSet4;
                    c20676 = c20676;
                    break;
                case -2124840601:
                case 1302474751:
                    c20676 = c20676;
                    r29 = i43;
                    HashSet hashSet6 = hashSet5;
                    int i46 = i35;
                    c20675 = c20675;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    short[] sArr8 = sArr5;
                    int i47 = i39;
                    int i48 = i40;
                    short[] sArr9 = sArr6;
                    int i49 = i42;
                    short[] sArr10 = sArr7;
                    List list2 = listM34312;
                    StringBuilder sb4 = sb3;
                    int i50 = i41;
                    int iM55998 = C0947.m55998(menuItem);
                    z2 = true;
                    if (iM55998 == (C0946.m55979(C0955.m56029(f81960, 78, 3, i44)) ^ 2120406023)) {
                        iM55682 = C0946.m55979("֨֨") ^ i31;
                        i6 = ((iM55682 ^ i30) * (-15639)) ^ (-1045576804);
                        i12 = 1417393637;
                    } else {
                        iM55682 = C0873.m55680("ۢۛ") ^ i30;
                        i6 = ((iM55682 ^ i31) * (-975)) ^ 671814510;
                        i12 = 758628028;
                    }
                    int i51 = iM55682 ^ i12;
                    i41 = i50;
                    i42 = i49;
                    sArr7 = sArr10;
                    listM34312 = list2;
                    i39 = i47;
                    sb3 = sb4;
                    hashSet5 = hashSet6;
                    sArr6 = sArr9;
                    i35 = i46;
                    i40 = i48;
                    sArr5 = sArr8;
                    i36 = iM55998;
                    i33 = i51;
                    i32 = i6;
                    str3 = str3;
                    c20676 = c20676;
                    i43 = r29;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -2090567743:
                case 1746925975:
                    c20676 = c20676;
                    hashSet4 = hashSet4;
                    String strM41538 = ((C18249) RunnableC0897.m55785(itM55766)).m41538();
                    if (!C1229.m56400(hashSet4, strM41538)) {
                        str3 = strM41538;
                        iM55979 = (C0873.m55680("᩵ۢ") ^ i31) * (-23);
                        i3 = ((iM55979 ^ i30) * (-12079)) ^ 1434535865;
                        i4 = 1340328991;
                        i33 = iM55979 ^ i4;
                        i32 = i3;
                        str3 = str3;
                        hashSet4 = hashSet4;
                        c20676 = c20676;
                    } else {
                        iM559710 = (C0946.m55979("᩻᩶") ^ i30) * 123;
                        str3 = strM41538;
                        i32 = ((iM559710 ^ i31) * (-5237)) ^ (-2125357379);
                        i5 = 413335309;
                        i33 = iM559710 ^ i5;
                        str3 = str3;
                        hashSet4 = hashSet4;
                        c20676 = c20676;
                    }
                    break;
                case -2066698650:
                case -1461527054:
                    HashSet hashSet7 = hashSet4;
                    String str5 = str3;
                    ServiceConnectionC1013.m56151(hashSet7, str5);
                    str2 = str5;
                    hashSet2 = hashSet7;
                    r210 = i43;
                    int iM559716 = C0946.m55979("᩻ۗ") ^ i31;
                    int i52 = i35;
                    i32 = ((iM559716 ^ i30) * 9629) ^ (-529506791);
                    i33 = iM559716 ^ (-1460380572);
                    i36 = i36;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    hashSet5 = hashSet5;
                    sb3 = sb3;
                    c20676 = c20676;
                    c20675 = c20675;
                    sArr6 = sArr6;
                    i35 = i52;
                    str3 = str2;
                    hashSet4 = hashSet2;
                    i43 = r210;
                    break;
                case -1970389072:
                case 1231386429:
                    c20676 = c20676;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    if (C0930.m55886(itM55766)) {
                        iM55979 = (C0946.m55979("᩸ᩳ") ^ i31) * 67;
                        i3 = ((iM55979 ^ i30) * (-32193)) ^ (-1161610911);
                        i4 = -2036883528;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ۫") ^ i31) * (-17);
                        i3 = ((iM55979 ^ i30) * (-22139)) ^ (-121380401);
                        i4 = 903443141;
                    }
                    i33 = iM55979 ^ i4;
                    i32 = i3;
                    str3 = str3;
                    hashSet4 = hashSet4;
                    c20676 = c20676;
                    break;
                case -1911120873:
                case 1050919477:
                    i34++;
                    iM55684 = C0946.m55979("᩻۠") ^ i31;
                    i25 = ((iM55684 ^ i30) * 8571) ^ 1355523203;
                    i26 = -37649168;
                    i33 = iM55684 ^ i26;
                    i32 = i25;
                    break;
                case -1890805587:
                case -891952316:
                    c20676 = c20676;
                    hashSet4 = hashSet4;
                    String str6 = str3;
                    if (!C0866.m55647(itM55767)) {
                        str3 = str6;
                        iM55979 = (C0946.m55979("ۗ᩻") + i30) * (-25);
                        i3 = ((iM55979 ^ i31) * (-9917)) ^ (-1744005463);
                        i4 = -1934245426;
                        i33 = iM55979 ^ i4;
                        i32 = i3;
                        str3 = str3;
                        hashSet4 = hashSet4;
                        c20676 = c20676;
                    } else {
                        iM559710 = C0946.m55979("᩶ۤ") ^ i31;
                        str3 = str6;
                        i32 = ((iM559710 ^ i30) * 32273) ^ (-952808258);
                        i5 = 2129033466;
                        i33 = iM559710 ^ i5;
                        str3 = str3;
                        hashSet4 = hashSet4;
                        c20676 = c20676;
                    }
                    break;
                case -1833746329:
                case 1193429101:
                    C0989.m56095();
                    if (!C0947.f81895) {
                        iM559713 = i37;
                        c20671 = c20676;
                        i14 = i41;
                        r213 = i43;
                        int iM55685 = C0873.m55680("ۛۡ") ^ i31;
                        int i53 = iM559713;
                        i32 = ((iM55685 ^ i30) * 32327) ^ 236690633;
                        i33 = iM55685 ^ (-1173203962);
                        i36 = i36;
                        i41 = i14;
                        i42 = i42;
                        sArr7 = sArr7;
                        c20676 = c20671;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        r6 = r213;
                        sArr6 = sArr6;
                        i37 = i53;
                        str3 = str3;
                        i35 = i35;
                        i43 = r6;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    } else {
                        c20672 = c20676;
                        hashSet = hashSet5;
                        c20673 = c20675;
                        hashSet4 = hashSet4;
                        str = str3;
                        sArr = sArr7;
                        sb = sb3;
                        i15 = i40;
                        r214 = i43;
                        int iM55686 = (i30 - C0873.m55680("ۚܳ")) * (-49);
                        int i54 = ((iM55686 ^ i31) * (-29825)) ^ 576551369;
                        i33 = iM55686 ^ (-598069119);
                        i36 = i36;
                        i39 = i39;
                        i40 = i15;
                        sArr7 = sArr;
                        listM34312 = listM34312;
                        sb3 = sb;
                        c20676 = c20672;
                        i43 = r214;
                        i35 = i35;
                        sArr5 = sArr5;
                        str3 = str;
                        hashSet4 = hashSet4;
                        c20675 = c20673;
                        i32 = i54;
                        hashSet5 = hashSet;
                    }
                    break;
                case -1808514123:
                case 1032423073:
                    ?? r217 = i43;
                    HashSet hashSet8 = hashSet5;
                    i8 = i36;
                    int i55 = i39;
                    int i56 = i42;
                    short[] sArr11 = sArr7;
                    StringBuilder sb5 = sb3;
                    int i57 = i41;
                    int i58 = i27 + i28;
                    short s2 = s;
                    int i59 = s2 + 8816;
                    if ((i58 + i58) - (i59 * i59) >= 0) {
                        iM55681 = (i30 - C0946.m55979("ۡ᩶")) * 71;
                        i9 = ((iM55681 ^ i31) * 16697) ^ (-1815444533);
                        i10 = 1565184395;
                    } else {
                        iM55681 = (i30 - C0873.m55680("᩹ۧ")) * 15;
                        i9 = ((iM55681 ^ i31) * 19327) ^ 1335942383;
                        i10 = -448900535;
                    }
                    i11 = iM55681 ^ i10;
                    s = s2;
                    i41 = i57;
                    i42 = i56;
                    sArr7 = sArr11;
                    i39 = i55;
                    sb3 = sb5;
                    hashSet5 = hashSet8;
                    z = r217 == true ? 1 : 0;
                    sArr6 = sArr6;
                    i40 = i40;
                    sArr5 = sArr5;
                    i33 = i11;
                    i36 = i8;
                    i32 = i9;
                    listM34312 = listM34312;
                    str3 = str3;
                    c20676 = c20676;
                    r6 = z;
                    i35 = i35;
                    i43 = r6;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -1770491784:
                case 356314539:
                    return i43;
                case -1737763064:
                case -240866509:
                    C0892.m55749();
                    RunnableC1014.m56177();
                    return false;
                case -1697950350:
                case 1776693290:
                    C20671 c20677 = c20676;
                    HashSet hashSet9 = hashSet5;
                    c20675 = c20675;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    sArr3 = sArr6;
                    int i60 = i42;
                    short[] sArr12 = sArr7;
                    StringBuilder sb6 = sb3;
                    int i61 = i41;
                    ?? r218 = i43;
                    int i62 = i36;
                    if (i62 == (C0873.m55680(RunnableC1014.m56180(f81960, 93, 3, i44)) ^ 2102423318)) {
                        iM559714 = C0946.m55979("۬᩺") ^ i30;
                        i20 = ((iM559714 ^ i31) * 15583) ^ 2039613213;
                        i21 = 676171364;
                    } else {
                        iM559714 = (i30 - C0946.m55979("ۛۤ")) * 85;
                        i20 = ((iM559714 ^ i31) * 8677) ^ (-165960172);
                        i21 = 947115051;
                    }
                    i33 = iM559714 ^ i21;
                    i36 = i62;
                    i32 = i20;
                    i41 = i61;
                    i42 = i60;
                    sArr7 = sArr12;
                    sb3 = sb6;
                    c20676 = c20677;
                    hashSet5 = hashSet9;
                    r5 = r218 == true ? 1 : 0;
                    sArr6 = sArr3;
                    r4 = r5;
                    str3 = str3;
                    i43 = r4;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -1687738883:
                case 1461018823:
                    int i63 = DialogInterfaceC2564.f4230;
                    c20671 = new C20671(this);
                    iM559713 = C0946.m55979(C1046.m56293(f81960, 131, 3, i44));
                    i38 = 2097430341;
                    if (C0949.f81897 < 0) {
                        int iM559717 = C0946.m55979("ۧܽ") ^ i30;
                        i25 = ((iM559717 ^ i31) * 26671) ^ 483029363;
                        i33 = iM559717 ^ (-1620925185);
                        c20676 = c20671;
                        i37 = iM559713;
                        i32 = i25;
                    } else {
                        i14 = i41;
                        r213 = i43;
                        int iM55687 = C0873.m55680("ۛۡ") ^ i31;
                        int i510 = iM559713;
                        i32 = ((iM55687 ^ i30) * 32327) ^ 236690633;
                        i33 = iM55687 ^ (-1173203962);
                        i36 = i36;
                        i41 = i14;
                        i42 = i42;
                        sArr7 = sArr7;
                        c20676 = c20671;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        r6 = r213;
                        sArr6 = sArr6;
                        i37 = i510;
                        str3 = str3;
                        i35 = i35;
                        i43 = r6;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    }
                    break;
                case -1658532289:
                case -1644497539:
                    i45 = i34 + 2;
                    iM55680 = (C0946.m55979("֡ۤ") ^ i31) * 63;
                    i = ((iM55680 ^ i30) * 19699) ^ 497505221;
                    i2 = 722744690;
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case -1610846997:
                case 2130803428:
                    C1194.m56393(arrayList, c18249.m41538());
                    iM55979 = C0873.m55680("ܰܺ") ^ i30;
                    i3 = ((iM55979 ^ i31) * (-17957)) ^ 2037465487;
                    i4 = 639823934;
                    i33 = iM55979 ^ i4;
                    i32 = i3;
                    str3 = str3;
                    hashSet4 = hashSet4;
                    c20676 = c20676;
                    break;
                case -1555225629:
                case 1128682817:
                    C20671 c20678 = c20675;
                    C1124.m56374(c20678, C0873.m55680(C0937.m55921(sArr7, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 3, i44)) ^ 2099523147, null);
                    C1025.m56221(c20678);
                    return z2;
                case -1498110006:
                case -1044342795:
                    HashSet hashSet10 = hashSet5;
                    i8 = i36;
                    int i64 = i39;
                    int i65 = i42;
                    short[] sArr13 = sArr7;
                    StringBuilder sb7 = sb3;
                    int i66 = i41;
                    z = false;
                    if (i8 == (C0873.m55680(AbstractC0942.m55970(f81960, 81, 3, i44)) ^ 2120366814)) {
                        iM559712 = (i30 - C0873.m55680("ۜ۫")) * 71;
                        i9 = ((iM559712 ^ i31) * 11121) ^ 954389609;
                        i13 = -994404554;
                    } else {
                        iM559712 = C0946.m55979("᩸֨") ^ i31;
                        i9 = ((iM559712 ^ i30) * 30633) ^ 1417778600;
                        i13 = 1218077276;
                    }
                    i11 = iM559712 ^ i13;
                    i41 = i66;
                    i42 = i65;
                    sArr7 = sArr13;
                    i39 = i64;
                    sb3 = sb7;
                    hashSet5 = hashSet10;
                    sArr6 = sArr6;
                    i40 = i40;
                    sArr5 = sArr5;
                    i33 = i11;
                    i36 = i8;
                    i32 = i9;
                    listM34312 = listM34312;
                    str3 = str3;
                    c20676 = c20676;
                    r6 = z;
                    i35 = i35;
                    i43 = r6;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -1494829640:
                case 1939180729:
                    C1012.m56146(c20676, i37 ^ i38);
                    c20676.m46723((CharSequence[]) arrayList.toArray(new String[i43]), i45, new DialogInterface.OnClickListener(this) { // from class: l.ۜܿ᩷

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ ActivityC6260 f24233;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i67) {
                            int i68 = 214054555;
                            int i69 = C0873.f81841;
                            int i70 = ViewOnClickListenerC0939.f81888;
                            int iM559718 = (C0946.m55979("᩷ۖ") + i70) * (-101);
                            int i71 = ((iM559718 ^ i69) * 7799) ^ 1786937999;
                            int i72 = 1807252836;
                            while (true) {
                                i68 = ((((i68 ^ i69) * (-1135)) >> 31) & i71) ^ (iM559718 ^ i72);
                                switch (i68) {
                                    case -1973191692:
                                    case 1572249275:
                                        C0863.m55643();
                                        break;
                                    case -1522070036:
                                    case 1296361418:
                                        if (C0877.f81843 < 0) {
                                            iM559718 = C0946.m55979("ܽᩴ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * (-19841)) ^ 1917629516;
                                            i72 = -1241318555;
                                        } else {
                                            iM559718 = C0873.m55680("ܺۙ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * 24531) ^ (-578494790);
                                            i72 = -510479110;
                                        }
                                        break;
                                    case -1492014314:
                                    case 2013169333:
                                        if (C0930.m55885() <= 0) {
                                            iM559718 = (C0946.m55979("ۡ᩵") + i69) * (-67);
                                            i71 = ((iM559718 ^ i70) * (-7797)) ^ 837072049;
                                            i72 = -432690818;
                                        } else {
                                            iM559718 = (C0873.m55680("ᩴܽ") + i69) * C0254q.f1218h;
                                            i71 = ((iM559718 ^ i70) * 24675) ^ 2049416546;
                                            i72 = 733951428;
                                        }
                                        break;
                                    case -1421239149:
                                    case -501111419:
                                        C0949.m56012();
                                        if (RunnableC0871.f81839 < 0) {
                                            iM559718 = C0873.m55680("ۖܶ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * (-25967)) ^ (-168993882);
                                            i72 = -316323130;
                                        } else {
                                            iM559718 = C0873.m55680("֡ۚ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * (-31185)) ^ (-237405161);
                                            i72 = -791469589;
                                        }
                                        break;
                                    case -1286918743:
                                    case 1448032063:
                                        if (C1036.f81953 >= 0) {
                                            iM559718 = C0873.m55680("֡ۚ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * (-31185)) ^ (-237405161);
                                            i72 = -791469589;
                                        } else {
                                            iM559718 = (C0946.m55979("᩹֨") ^ i69) * 75;
                                            i71 = ((iM559718 ^ i70) * 21699) ^ (-957167061);
                                            i72 = 1833415530;
                                        }
                                        break;
                                    case -1215439949:
                                    case -1155351197:
                                        C0854.m55595();
                                        if (C1404.f82149 < 0) {
                                            iM559718 = C0946.m55979("ܽᩴ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * (-19841)) ^ 1917629516;
                                            i72 = -1241318555;
                                        } else {
                                            iM559718 = C0873.m55680("ۖܶ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * (-25967)) ^ (-168993882);
                                            i72 = -316323130;
                                        }
                                        break;
                                    case -1190775343:
                                    case 989796758:
                                        C1017.m56187();
                                        iM559718 = C0873.m55680("֡ۚ") ^ i69;
                                        i71 = ((iM559718 ^ i70) * (-31185)) ^ (-237405161);
                                        i72 = -791469589;
                                        break;
                                    case -1017589287:
                                    case -372973329:
                                        if (C1929.f83011 != 0) {
                                            iM559718 = C0873.m55680("֡ۚ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * (-31185)) ^ (-237405161);
                                            i72 = -791469589;
                                        } else {
                                            iM559718 = C0873.m55680("ᩴۤ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * 16783) ^ 1355214471;
                                            i72 = -1410033260;
                                        }
                                        break;
                                    case -919777703:
                                    case 1648882199:
                                        if (C0912.f81867 <= 0) {
                                            iM559718 = (C0946.m55979("ۡ᩵") + i69) * (-67);
                                            i71 = ((iM559718 ^ i70) * (-7797)) ^ 837072049;
                                            i72 = -432690818;
                                        } else {
                                            iM559718 = C0946.m55979("ܽ֫") ^ i70;
                                            i71 = ((iM559718 ^ i69) * 19203) ^ 1279425522;
                                            i72 = 1970576578;
                                        }
                                        break;
                                    case -770228312:
                                    case -190904302:
                                        if (C1929.f83011 != 0) {
                                            iM559718 = C0873.m55680("֡ۚ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * (-31185)) ^ (-237405161);
                                            i72 = -791469589;
                                        } else {
                                            iM559718 = (C0873.m55680("ۡۛ") + i70) * (-73);
                                            i71 = ((iM559718 ^ i69) * (-1529)) ^ 1977808369;
                                            i72 = -1294187186;
                                        }
                                        break;
                                    case -714099910:
                                    case 1462392368:
                                        if (C0906.f81862 >= 0) {
                                            iM559718 = (C0946.m55979("ۡ᩵") + i69) * (-67);
                                            i71 = ((iM559718 ^ i70) * (-7797)) ^ 837072049;
                                            i72 = -432690818;
                                        } else {
                                            iM559718 = (C0946.m55979("᩻ۧ") ^ i69) * 99;
                                            i71 = ((iM559718 ^ i70) * 23691) ^ 1488120761;
                                            i72 = -418105012;
                                        }
                                        break;
                                    case -504070683:
                                    case -439126940:
                                        if (C0894.f81854 >= 0) {
                                            iM559718 = C0873.m55680("ۖܶ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * (-25967)) ^ (-168993882);
                                            i72 = -316323130;
                                        } else {
                                            iM559718 = (C0946.m55979("᩵ܳ") + i69) * (-33);
                                            i71 = ((iM559718 ^ i70) * (-5711)) ^ (-2141680527);
                                            i72 = 434951916;
                                        }
                                        break;
                                    case -246985694:
                                    case 1845529258:
                                        if (RunnableC0871.m55672() >= 0) {
                                            iM559718 = C0873.m55680("֡ۚ") ^ i69;
                                            i71 = ((iM559718 ^ i70) * (-31185)) ^ (-237405161);
                                            i72 = -791469589;
                                        } else {
                                            iM559718 = (C0946.m55979("ۖ᩸") + i70) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                            i71 = ((iM559718 ^ i69) * (-26433)) ^ (-605553132);
                                            i72 = -1855616119;
                                        }
                                        break;
                                    case -1516855:
                                    case 1236219742:
                                        if (C0912.f81867 <= 0) {
                                            iM559718 = (C0946.m55979("ۡ᩵") + i69) * (-67);
                                            i71 = ((iM559718 ^ i70) * (-7797)) ^ 837072049;
                                            i72 = -432690818;
                                        } else {
                                            iM559718 = C0946.m55979("ܳۢ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * 12351) ^ (-727790388);
                                            i72 = -1826701895;
                                        }
                                        break;
                                    case 43686004:
                                    case 559406843:
                                        if (C0947.f81895) {
                                            iM559718 = (C0946.m55979("ۡ᩵") + i69) * (-67);
                                            i71 = ((iM559718 ^ i70) * (-7797)) ^ 837072049;
                                            i72 = -432690818;
                                        } else {
                                            iM559718 = C0946.m55979("ۛۢ") ^ i70;
                                            i71 = ((iM559718 ^ i69) * (-25615)) ^ (-1416771712);
                                            i72 = -1108893761;
                                        }
                                        break;
                                    default:
                                        ActivityC6260.m14201(this.f24233, listM34312, dialogInterface, i67);
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i67 = 620249607;
                            int i68 = C0898.f81858;
                            int i69 = ViewOnClickListenerC0939.f81888;
                            int iM55688 = (C0873.m55680("᩹ܶ") ^ i69) * (-99);
                            int i70 = ((iM55688 ^ i68) * (-4423)) ^ (-2010105629);
                            int i71 = -149158226;
                            while (true) {
                                i67 = ((((i67 ^ i68) * (-989)) >> 31) & i70) ^ (iM55688 ^ i71);
                                switch (i67) {
                                    case -2139214292:
                                    case 910880437:
                                        this.f24233 = this;
                                        if (C0947.f81895) {
                                            iM55688 = (C0946.m55979("᩻۫") ^ i69) * 37;
                                            i70 = ((iM55688 ^ i68) * (-3819)) ^ (-1536057188);
                                            i71 = 190372656;
                                        } else {
                                            iM55688 = C0873.m55680("ۗ۠") ^ i68;
                                            i70 = ((iM55688 ^ i69) * (-13673)) ^ 1564060006;
                                            i71 = 969438119;
                                        }
                                        break;
                                    case -1966454907:
                                    case 373501010:
                                        if (C0947.f81895) {
                                            iM55688 = C0946.m55979("۠ۖ") ^ i68;
                                            i70 = ((iM55688 ^ i69) * (-5687)) ^ (-1929829566);
                                            i71 = 1449869410;
                                        } else {
                                            iM55688 = (C0946.m55979("᩷᩻") ^ i69) * (-89);
                                            i70 = ((iM55688 ^ i68) * 32627) ^ 222072164;
                                            i71 = 195641584;
                                        }
                                        break;
                                    case -1504912285:
                                    case 1684321855:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM55688 = (i68 - C0946.m55979("ۙ᩻")) * (-47);
                                            i70 = ((iM55688 ^ i69) * (-18461)) ^ (-1888518818);
                                            i71 = -1121133203;
                                        } else {
                                            iM55688 = C0873.m55680("֫ܽ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-6829)) ^ 1958190993;
                                            i71 = 999282467;
                                        }
                                        break;
                                    case -1469873714:
                                    case 1970220689:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM55688 = C0873.m55680("᩺ۨ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-15139)) ^ (-595985103);
                                            i71 = 25367683;
                                        } else {
                                            iM55688 = (i68 - C0946.m55979("ᩴۧ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i70 = ((iM55688 ^ i69) * 8733) ^ (-932077177);
                                            i71 = -291966417;
                                        }
                                        break;
                                    case -971393594:
                                    case -886629291:
                                        return;
                                    case -758990197:
                                    case 120835718:
                                        C0917.m55854();
                                        iM55688 = C0873.m55680("᩺ۨ") ^ i69;
                                        i70 = ((iM55688 ^ i68) * (-15139)) ^ (-595985103);
                                        i71 = 25367683;
                                        break;
                                    case -341981689:
                                    case 776116266:
                                        if (RunnableC0871.f81839 >= 0) {
                                            iM55688 = (C0946.m55979("᩻۫") ^ i69) * 37;
                                            i70 = ((iM55688 ^ i68) * (-3819)) ^ (-1536057188);
                                            i71 = 190372656;
                                        } else {
                                            iM55688 = C0946.m55979("ۤܿ") ^ i68;
                                            i70 = ((iM55688 ^ i69) * (-10133)) ^ 325001653;
                                            i71 = -164305881;
                                        }
                                        break;
                                    case -272697402:
                                    case 1436781338:
                                        C0866.m55645();
                                        AbstractC0942.m55971();
                                        throw new RuntimeException();
                                    case -22003916:
                                    case 1674287757:
                                        if (C0863.f81833 <= 0) {
                                            iM55688 = (C0946.m55979("᩻۫") ^ i69) * 37;
                                            i70 = ((iM55688 ^ i68) * (-3819)) ^ (-1536057188);
                                            i71 = 190372656;
                                        } else {
                                            iM55688 = C0946.m55979("֡ܶ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * 17701) ^ (-1358937874);
                                            i71 = -227553823;
                                        }
                                        break;
                                    case 81155557:
                                    case 217647816:
                                        C0877.m55696();
                                        if (!RunnableC1014.m56177()) {
                                            iM55688 = (i68 - C0946.m55979("ۙ᩻")) * (-47);
                                            i70 = ((iM55688 ^ i69) * (-18461)) ^ (-1888518818);
                                            i71 = -1121133203;
                                        } else {
                                            iM55688 = C0873.m55680("᩺ۨ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-15139)) ^ (-595985103);
                                            i71 = 25367683;
                                        }
                                        break;
                                    case 283078069:
                                    case 729730464:
                                        if (C1028.f81950 <= 0) {
                                            iM55688 = (i68 - C0946.m55979("ۙ᩻")) * (-47);
                                            i70 = ((iM55688 ^ i69) * (-18461)) ^ (-1888518818);
                                            i71 = -1121133203;
                                        } else {
                                            iM55688 = C0946.m55979("ܶܺ") ^ i68;
                                            i70 = ((iM55688 ^ i69) * 31917) ^ 1041970952;
                                            i71 = -2108774775;
                                        }
                                        break;
                                    case 571221960:
                                    case 602916691:
                                        if (C0863.f81833 > 0) {
                                            iM55688 = (C0946.m55979("ۡۡ") ^ i68) * (-93);
                                            i70 = ((iM55688 ^ i69) * (-25315)) ^ (-1667775458);
                                            i71 = -479573667;
                                        } else {
                                            iM55688 = (i68 - C0946.m55979("ۙ᩻")) * (-47);
                                            i70 = ((iM55688 ^ i69) * (-18461)) ^ (-1888518818);
                                            i71 = -1121133203;
                                        }
                                        break;
                                    case 827108998:
                                    case 1061732378:
                                        if (C1194.f82045 != 0) {
                                            iM55688 = (C0946.m55979("ۡۡ") ^ i68) * (-93);
                                            i70 = ((iM55688 ^ i69) * (-25315)) ^ (-1667775458);
                                            i71 = -479573667;
                                        } else {
                                            iM55688 = (C0946.m55979("ۘܶ") + i69) * (-57);
                                            i70 = ((iM55688 ^ i68) * 26169) ^ (-223183704);
                                            i71 = 1752976076;
                                        }
                                        break;
                                    case 1592761436:
                                    case 1638059791:
                                        C0937.m55918();
                                        if (!C0967.m56074()) {
                                            iM55688 = C0873.m55680("᩺ۨ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-15139)) ^ (-595985103);
                                            i71 = 25367683;
                                        } else {
                                            iM55688 = (C0946.m55979("᩻۫") ^ i69) * 37;
                                            i70 = ((iM55688 ^ i68) * (-3819)) ^ (-1536057188);
                                            i71 = 190372656;
                                        }
                                        break;
                                    case 1873593830:
                                    case 1911041600:
                                        if (C0949.f81897 >= 0) {
                                            iM55688 = C0873.m55680("᩺ۨ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-15139)) ^ (-595985103);
                                            i71 = 25367683;
                                        } else {
                                            iM55688 = C0873.m55680("ܽ᩸") ^ i68;
                                            i70 = ((iM55688 ^ i69) * (-10315)) ^ (-1901403551);
                                            i71 = 603599027;
                                        }
                                        break;
                                    default:
                                        if (C0845.f81821 >= 0) {
                                            iM55688 = C0873.m55680("᩺ۨ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-15139)) ^ (-595985103);
                                            i71 = 25367683;
                                        } else {
                                            iM55688 = C0873.m55680("᩷ۢ") ^ i69;
                                            i70 = ((iM55688 ^ i68) * (-18563)) ^ (-1847618373);
                                            i71 = -62710094;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    C1025.m56221(c20676);
                    return z2;
                case -1442361015:
                case -1375043382:
                    i45 = -1;
                    iM55680 = (C0946.m55979("֡ۤ") ^ i31) * 63;
                    i = ((iM55680 ^ i30) * 19699) ^ 497505221;
                    i2 = 722744690;
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case -1386814289:
                case -1033912872:
                    c20672 = c20676;
                    ?? r219 = i43;
                    hashSet = hashSet5;
                    i35 = i35;
                    i36 = i36;
                    c20675 = c20675;
                    hashSet4 = hashSet4;
                    str = str3;
                    short[] sArr14 = sArr5;
                    i39 = i39;
                    short[] sArr15 = sArr6;
                    int i67 = i42;
                    sArr = sArr7;
                    listM34312 = listM34312;
                    sb = sb3;
                    i15 = i40;
                    int i68 = i41;
                    sArr5 = sArr14;
                    C1194.m56393(arrayList, C0863.m55638(this, C0946.m55979(ServiceConnectionC1013.m56161(sArr14, i39, i15, i44)) ^ 2100566488));
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        int iM55688 = (C0873.m55680("ܰ֨") ^ i31) * 101;
                        i33 = iM55688 ^ (-1095457306);
                        i32 = ((iM55688 ^ i30) * 25019) ^ 548256938;
                        i40 = i15;
                        i41 = i68;
                        i42 = i67;
                        sArr7 = sArr;
                        listM34312 = listM34312;
                        i39 = i39;
                        sb3 = sb;
                        hashSet5 = hashSet;
                        i43 = r219;
                        sArr6 = sArr15;
                        i35 = i35;
                        sArr5 = sArr5;
                        i36 = i36;
                        str3 = str;
                        c20676 = c20672;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    } else {
                        i41 = i68;
                        i42 = i67;
                        c20673 = c20675;
                        sArr6 = sArr15;
                        r214 = r219;
                        int iM55689 = (i30 - C0873.m55680("ۚܳ")) * (-49);
                        int i511 = ((iM55689 ^ i31) * (-29825)) ^ 576551369;
                        i33 = iM55689 ^ (-598069119);
                        i36 = i36;
                        i39 = i39;
                        i40 = i15;
                        sArr7 = sArr;
                        listM34312 = listM34312;
                        sb3 = sb;
                        c20676 = c20672;
                        i43 = r214;
                        i35 = i35;
                        sArr5 = sArr5;
                        str3 = str;
                        hashSet4 = hashSet4;
                        c20675 = c20673;
                        i32 = i511;
                        hashSet5 = hashSet;
                    }
                    break;
                case -1347819293:
                case 1672518677:
                    c20676 = c20676;
                    if (C0906.m55806(str4, C0892.m55750(f81960, 108, 20, i44))) {
                        iM55680 = C0873.m55680("֡ۗ") ^ i30;
                        i = ((iM55680 ^ i31) * 6379) ^ (-1536648620);
                        i2 = -748572605;
                    } else {
                        iM55680 = C0873.m55680("ᩳܽ") ^ i30;
                        i = ((iM55680 ^ i31) * 2249) ^ (-912376357);
                        i2 = -287923269;
                    }
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case -1326029493:
                case 301839104:
                    C0967.m56074();
                    iM559713 = i37;
                    c20671 = c20676;
                    i14 = i41;
                    r213 = i43;
                    int iM556810 = C0873.m55680("ۛۡ") ^ i31;
                    int i512 = iM559713;
                    i32 = ((iM556810 ^ i30) * 32327) ^ 236690633;
                    i33 = iM556810 ^ (-1173203962);
                    i36 = i36;
                    i41 = i14;
                    i42 = i42;
                    sArr7 = sArr7;
                    c20676 = c20671;
                    sb3 = sb3;
                    hashSet5 = hashSet5;
                    r6 = r213;
                    sArr6 = sArr6;
                    i37 = i512;
                    str3 = str3;
                    i35 = i35;
                    i43 = r6;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -1217947255:
                case -46733604:
                    if (!C0861.f81831) {
                        c20676 = c20676;
                        r216 = i43;
                        hashSet5 = hashSet5;
                        i35 = i35;
                        i36 = i36;
                        c20675 = c20675;
                        hashSet4 = hashSet4;
                        str3 = str3;
                        sArr5 = sArr5;
                        i39 = i39;
                        i40 = i40;
                        sArr6 = sArr6;
                        i42 = i42;
                        sArr7 = sArr7;
                        listM34312 = listM34312;
                        sb3 = sb3;
                        i41 = i41;
                        iM559711 = (C0873.m55680("ܺ᩶") + i30) * (-11);
                        i6 = ((iM559711 ^ i31) * 7897) ^ (-1318369038);
                        i7 = 372029851;
                        r215 = r216;
                        int i69 = iM559711 ^ i7;
                        i41 = i41;
                        i42 = i42;
                        sArr7 = sArr7;
                        listM34312 = listM34312;
                        i39 = i39;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        sArr6 = sArr6;
                        i35 = i35;
                        i40 = i40;
                        sArr5 = sArr5;
                        i33 = i69;
                        i36 = i36;
                        r29 = r215;
                        i32 = i6;
                        str3 = str3;
                        c20676 = c20676;
                        i43 = r29;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    } else {
                        iM55684 = C0946.m55979("ۗ۠") ^ i30;
                        i25 = ((iM55684 ^ i31) * 12683) ^ (-849635696);
                        i26 = 1543588562;
                        i33 = iM55684 ^ i26;
                        i32 = i25;
                    }
                    break;
                case -1209114969:
                case 2083699281:
                    C20671 c20679 = c20676;
                    ?? r220 = i43;
                    hashSet5 = hashSet5;
                    i35 = i35;
                    i36 = i36;
                    c20675 = c20675;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    sArr6 = sArr6;
                    i42 = i42;
                    sArr7 = sArr7;
                    sb3 = sb3;
                    i14 = i41;
                    listM34312 = C14976.m34312();
                    arrayList = new ArrayList(C1048.m56303(listM34312) + (z2 ? 1 : 0));
                    sArr5 = f81960;
                    i39 = 87;
                    i40 = 3;
                    if (C1229.f82066 < 0) {
                        int iM559718 = C0946.m55979("֡ۧ") ^ i30;
                        i33 = iM559718 ^ 782826958;
                        i36 = i36;
                        i32 = ((iM559718 ^ i31) * 7141) ^ (-1363645503);
                        i41 = i14;
                        i42 = i42;
                        sArr7 = sArr7;
                        sb3 = sb3;
                        c20676 = c20679;
                        hashSet5 = hashSet5;
                        r4 = r220;
                        sArr6 = sArr6;
                        i35 = i35;
                        str3 = str3;
                        i43 = r4;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    } else {
                        iM559713 = i37;
                        c20671 = c20679;
                        r213 = r220;
                        int iM556811 = C0873.m55680("ۛۡ") ^ i31;
                        int i513 = iM559713;
                        i32 = ((iM556811 ^ i30) * 32327) ^ 236690633;
                        i33 = iM556811 ^ (-1173203962);
                        i36 = i36;
                        i41 = i14;
                        i42 = i42;
                        sArr7 = sArr7;
                        c20676 = c20671;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        r6 = r213;
                        sArr6 = sArr6;
                        i37 = i513;
                        str3 = str3;
                        i35 = i35;
                        i43 = r6;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    }
                    break;
                case -1133606943:
                case 328814884:
                    if (!C1048.f81963) {
                        c20676 = c20676;
                        r216 = i43;
                        hashSet5 = hashSet5;
                        i35 = i35;
                        i36 = i36;
                        c20675 = c20675;
                        hashSet4 = hashSet4;
                        str3 = str3;
                        sArr5 = sArr5;
                        i39 = i39;
                        i40 = i40;
                        sArr6 = sArr6;
                        i42 = i42;
                        sArr7 = sArr7;
                        listM34312 = listM34312;
                        sb3 = sb3;
                        i41 = i41;
                        iM559711 = (C0873.m55680("ܺ᩶") + i30) * (-11);
                        i6 = ((iM559711 ^ i31) * 7897) ^ (-1318369038);
                        i7 = 372029851;
                        r215 = r216;
                        int i610 = iM559711 ^ i7;
                        i41 = i41;
                        i42 = i42;
                        sArr7 = sArr7;
                        listM34312 = listM34312;
                        i39 = i39;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        sArr6 = sArr6;
                        i35 = i35;
                        i40 = i40;
                        sArr5 = sArr5;
                        i33 = i610;
                        i36 = i36;
                        r29 = r215;
                        i32 = i6;
                        str3 = str3;
                        c20676 = c20676;
                        i43 = r29;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    } else {
                        iM55684 = C0873.m55680("ۖۖ") ^ i31;
                        i25 = ((iM55684 ^ i30) * (-22899)) ^ 2076645874;
                        i26 = -1328889137;
                        i33 = iM55684 ^ i26;
                        i32 = i25;
                    }
                    break;
                case -1053323868:
                case 702509778:
                    String str7 = str3;
                    C1044.m56271(hashSet5, str7);
                    hashSet2 = hashSet4;
                    str2 = str7;
                    r210 = i43;
                    int iM559719 = C0946.m55979("᩻ۗ") ^ i31;
                    int i514 = i35;
                    i32 = ((iM559719 ^ i30) * 9629) ^ (-529506791);
                    i33 = iM559719 ^ (-1460380572);
                    i36 = i36;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    hashSet5 = hashSet5;
                    sb3 = sb3;
                    c20676 = c20676;
                    c20675 = c20675;
                    sArr6 = sArr6;
                    i35 = i514;
                    str3 = str2;
                    hashSet4 = hashSet2;
                    i43 = r210;
                    break;
                case -994407910:
                case -155200979:
                    m14204(this.f15837);
                    return z2;
                case -949941945:
                case 756291873:
                    if (!C0917.f81868) {
                        iM559713 = i37;
                        c20671 = c20676;
                        i14 = i41;
                        r213 = i43;
                        int iM556812 = C0873.m55680("ۛۡ") ^ i31;
                        int i515 = iM559713;
                        i32 = ((iM556812 ^ i30) * 32327) ^ 236690633;
                        i33 = iM556812 ^ (-1173203962);
                        i36 = i36;
                        i41 = i14;
                        i42 = i42;
                        sArr7 = sArr7;
                        c20676 = c20671;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        r6 = r213;
                        sArr6 = sArr6;
                        i37 = i515;
                        str3 = str3;
                        i35 = i35;
                        i43 = r6;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    } else {
                        iM55684 = C0946.m55979("ۗ۠") ^ i30;
                        i25 = ((iM55684 ^ i31) * 12683) ^ (-849635696);
                        i26 = 1543588562;
                        i33 = iM55684 ^ i26;
                        i32 = i25;
                    }
                    break;
                case -854393025:
                case 716214477:
                    i45 = 0;
                    iM55680 = (C0946.m55979("֡ۤ") ^ i31) * 63;
                    i = ((iM55680 ^ i30) * 19699) ^ 497505221;
                    i2 = 722744690;
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case -830313157:
                case 915163266:
                    c20676 = c20676;
                    r210 = i43;
                    i35 = i35;
                    i36 = i36;
                    c20675 = c20675;
                    str2 = str3;
                    sArr6 = sArr6;
                    sArr7 = sArr7;
                    sb3 = sb3;
                    i41 = i41;
                    C1194.m56393(arrayList, C0863.m55638(this, i35));
                    hashSet2 = new HashSet();
                    hashSet5 = new HashSet();
                    itM55766 = C0894.m55766(listM34312);
                    int iM5597110 = C0946.m55979("᩻ۗ") ^ i31;
                    int i516 = i35;
                    i32 = ((iM5597110 ^ i30) * 9629) ^ (-529506791);
                    i33 = iM5597110 ^ (-1460380572);
                    i36 = i36;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    hashSet5 = hashSet5;
                    sb3 = sb3;
                    c20676 = c20676;
                    c20675 = c20675;
                    sArr6 = sArr6;
                    i35 = i516;
                    str3 = str2;
                    hashSet4 = hashSet2;
                    i43 = r210;
                    break;
                case -614513685:
                case -466883540:
                    if (!C1048.f81963) {
                        iM55684 = C0946.m55979("᩸ᩴ") ^ i31;
                        i25 = ((iM55684 ^ i30) * 2055) ^ 1599153257;
                        i26 = -548605880;
                        i33 = iM55684 ^ i26;
                        i32 = i25;
                    } else {
                        iM559713 = i37;
                        c20671 = c20676;
                        i14 = i41;
                        r213 = i43;
                        int iM556813 = C0873.m55680("ۛۡ") ^ i31;
                        int i517 = iM559713;
                        i32 = ((iM556813 ^ i30) * 32327) ^ 236690633;
                        i33 = iM556813 ^ (-1173203962);
                        i36 = i36;
                        i41 = i14;
                        i42 = i42;
                        sArr7 = sArr7;
                        c20676 = c20671;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        r6 = r213;
                        sArr6 = sArr6;
                        i37 = i517;
                        str3 = str3;
                        i35 = i35;
                        i43 = r6;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    }
                    break;
                case -548628699:
                case 345070706:
                    C0854.m55595();
                    if (!C0955.f81898) {
                        iM55684 = (C0946.m55979("۠ۖ") + i30) * (-57);
                        i25 = ((iM55684 ^ i31) * (-16115)) ^ (-865751681);
                        i26 = 788541806;
                        i33 = iM55684 ^ i26;
                        i32 = i25;
                    } else {
                        c20676 = c20676;
                        hashSet3 = hashSet5;
                        c20674 = c20675;
                        hashSet4 = hashSet4;
                        str3 = str3;
                        sArr3 = sArr6;
                        i23 = i42;
                        sArr4 = sArr7;
                        sb2 = sb3;
                        i24 = i41;
                        int iM556814 = (C0873.m55680("ۙۢ") ^ i31) * (-69);
                        c20675 = c20674;
                        i32 = ((iM556814 ^ i30) * (-25869)) ^ 670824899;
                        i33 = iM556814 ^ (-305951129);
                        i41 = i24;
                        i42 = i23;
                        sArr7 = sArr4;
                        sb3 = sb2;
                        c20676 = c20676;
                        hashSet5 = hashSet3;
                        r5 = i43;
                        sArr6 = sArr3;
                        r4 = r5;
                        str3 = str3;
                        i43 = r4;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    }
                    break;
                case -541333667:
                case -251020559:
                    if (i34 < C1048.m56303(listM34312)) {
                        iM55684 = (C0873.m55680("ۚۧ") + i30) * 123;
                        i25 = ((iM55684 ^ i31) * 25007) ^ (-391644115);
                        i26 = -1977195073;
                    } else {
                        iM55684 = C0873.m55680("ۛۧ") ^ i31;
                        i25 = ((iM55684 ^ i30) * 21767) ^ (-147582801);
                        i26 = -2004954547;
                    }
                    i33 = iM55684 ^ i26;
                    i32 = i25;
                    break;
                case -439859370:
                case 126762960:
                    i44 = 8823;
                    iM559711 = C0873.m55680("ۡܳ") ^ i31;
                    i6 = ((iM559711 ^ i30) * 21385) ^ 1979425058;
                    i7 = 1876667365;
                    r215 = i43;
                    int i611 = iM559711 ^ i7;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    listM34312 = listM34312;
                    i39 = i39;
                    sb3 = sb3;
                    hashSet5 = hashSet5;
                    sArr6 = sArr6;
                    i35 = i35;
                    i40 = i40;
                    sArr5 = sArr5;
                    i33 = i611;
                    i36 = i36;
                    r29 = r215;
                    i32 = i6;
                    str3 = str3;
                    c20676 = c20676;
                    i43 = r29;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -409488354:
                case 544221383:
                    C1003.m56121(sb3, C0930.m55890(c18249));
                    C1003.m56121(sb3, C1044.m56276(f81960, 130, 1, i44));
                    C0937.m55917(arrayList, C0845.m55591(sb3));
                    iM55979 = C0873.m55680("ܰܺ") ^ i30;
                    i3 = ((iM55979 ^ i31) * (-17957)) ^ 2037465487;
                    i4 = 639823934;
                    i33 = iM55979 ^ i4;
                    i32 = i3;
                    str3 = str3;
                    hashSet4 = hashSet4;
                    c20676 = c20676;
                    break;
                case -347388620:
                case -63462417:
                    c20672 = c20676;
                    c20673 = c20675;
                    hashSet4 = hashSet4;
                    str = str3;
                    short[] sArr16 = sArr7;
                    sb = sb3;
                    hashSet = hashSet5;
                    C1194.m56390(c20673, C0946.m55979(C1048.m56318(f81960, 99, 3, i44)) ^ 2098034019);
                    if (C0854.m55595() < 0) {
                        ViewOnClickListenerC0939.m55953(c20673, C0873.m55680(C0930.m55893(f81960, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i44)) ^ 2123514084, new DialogInterfaceOnClickListenerC22354(i43, this));
                        sArr7 = f81960;
                        if (!RunnableC0897.m55784()) {
                            int iM556815 = C0873.m55680("ۛ֫") ^ i30;
                            i22 = ((iM556815 ^ i31) * 22279) ^ (-261575494);
                            i33 = iM556815 ^ 1337592995;
                            c20676 = c20672;
                            hashSet5 = hashSet;
                            HashSet hashSet11 = hashSet4;
                            c20675 = c20673;
                            i32 = i22;
                            sb3 = sb;
                            str3 = str;
                            hashSet4 = hashSet11;
                            break;
                        }
                    } else {
                        sArr7 = sArr16;
                    }
                    iM55683 = i35;
                    i16 = i36;
                    sArr2 = sArr6;
                    i18 = i41;
                    i17 = i42;
                    list = listM34312;
                    r212 = i43;
                    int iM559720 = C0946.m55979("ۙ᩷") ^ i30;
                    i19 = ((iM559720 ^ i31) * 26357) ^ (-1765332343);
                    i33 = iM559720 ^ 867929323;
                    i36 = i16;
                    i41 = i18;
                    i42 = i17;
                    r211 = r212;
                    sb3 = sb;
                    c20676 = c20672;
                    hashSet5 = hashSet;
                    i43 = r211;
                    sArr6 = sArr2;
                    str3 = str;
                    hashSet4 = hashSet4;
                    c20675 = c20673;
                    List list3 = list;
                    i35 = iM55683;
                    i32 = i19;
                    listM34312 = list3;
                    break;
                case -306950099:
                case 237948576:
                    c20676 = c20676;
                    ?? r221 = i43;
                    hashSet5 = hashSet5;
                    i35 = i35;
                    i36 = i36;
                    c20675 = c20675;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    sArr5 = sArr5;
                    i39 = i39;
                    i40 = i40;
                    sArr6 = sArr6;
                    i42 = i42;
                    sArr7 = sArr7;
                    listM34312 = listM34312;
                    sb3 = sb3;
                    i41 = i41;
                    s = f81960[77];
                    i27 = s * s;
                    i28 = 77721856;
                    r216 = r221;
                    if (C1046.m56302() != 0) {
                        iM559711 = (C0873.m55680("ܺ᩶") + i30) * (-11);
                        i6 = ((iM559711 ^ i31) * 7897) ^ (-1318369038);
                        i7 = 372029851;
                        r215 = r216;
                    } else {
                        iM559711 = C0946.m55979("ۖ֫") ^ i31;
                        i6 = ((iM559711 ^ i30) * (-17429)) ^ (-1629013637);
                        i7 = -1236417976;
                        r215 = r221;
                    }
                    int i612 = iM559711 ^ i7;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    listM34312 = listM34312;
                    i39 = i39;
                    sb3 = sb3;
                    hashSet5 = hashSet5;
                    sArr6 = sArr6;
                    i35 = i35;
                    i40 = i40;
                    sArr5 = sArr5;
                    i33 = i612;
                    i36 = i36;
                    r29 = r215;
                    i32 = i6;
                    str3 = str3;
                    c20676 = c20676;
                    i43 = r29;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case -298861486:
                case 108096822:
                    c20672 = c20676;
                    hashSet = hashSet5;
                    hashSet4 = hashSet4;
                    str = str3;
                    sArr = sArr7;
                    sb = sb3;
                    int i70 = DialogInterfaceC2564.f4230;
                    c20673 = new C20671(this);
                    sArr6 = f81960;
                    i41 = 96;
                    i42 = 3;
                    if (AbstractC0942.f81890 > 0) {
                        int iM559721 = C0946.m55979("ۙۙ") ^ i30;
                        i22 = ((iM559721 ^ i31) * (-18891)) ^ (-2048142026);
                        i33 = iM559721 ^ (-1990829422);
                        sArr7 = sArr;
                        c20676 = c20672;
                        hashSet5 = hashSet;
                        HashSet hashSet12 = hashSet4;
                        c20675 = c20673;
                        i32 = i22;
                        sb3 = sb;
                        str3 = str;
                        hashSet4 = hashSet12;
                    } else {
                        i15 = i40;
                        r214 = i43;
                        int iM556816 = (i30 - C0873.m55680("ۚܳ")) * (-49);
                        int i518 = ((iM556816 ^ i31) * (-29825)) ^ 576551369;
                        i33 = iM556816 ^ (-598069119);
                        i36 = i36;
                        i39 = i39;
                        i40 = i15;
                        sArr7 = sArr;
                        listM34312 = listM34312;
                        sb3 = sb;
                        c20676 = c20672;
                        i43 = r214;
                        i35 = i35;
                        sArr5 = sArr5;
                        str3 = str;
                        hashSet4 = hashSet4;
                        c20675 = c20673;
                        i32 = i518;
                        hashSet5 = hashSet;
                    }
                    break;
                case -50537836:
                case 1553734588:
                    c20676 = c20676;
                    c18249 = (C18249) C0955.m56035(itM55767);
                    if (C1071.m56338(hashSet5, c18249.m41538())) {
                        iM55680 = (i31 - C0946.m55979("֫ᩴ")) * 77;
                        i = ((iM55680 ^ i30) * (-26687)) ^ (-1023264025);
                        i2 = -1484344377;
                    } else {
                        iM55680 = C0946.m55979("֫ܳ") ^ i30;
                        i = ((iM55680 ^ i31) * 23133) ^ 529502271;
                        i2 = -1812579972;
                    }
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case 35810785:
                case 1382034808:
                    i34 = 0;
                    iM55684 = C0946.m55979("᩻۠") ^ i31;
                    i25 = ((iM55684 ^ i30) * 8571) ^ 1355523203;
                    i26 = -37649168;
                    i33 = iM55684 ^ i26;
                    i32 = i25;
                    break;
                case 60085364:
                case 1370107760:
                    if (C0906.m55806(C0930.m55890((C18249) C1964.m56587(listM34312, i34)), this.f15837)) {
                        iM55684 = (i31 - C0873.m55680("ܿܿ")) * (-81);
                        i25 = ((iM55684 ^ i30) * 3467) ^ 1390270362;
                        i26 = -1977708155;
                    } else {
                        iM55684 = (i30 - C0873.m55680("᩸ܳ")) * 59;
                        i25 = ((iM55684 ^ i31) * (-12411)) ^ 173864697;
                        i26 = -1564143998;
                    }
                    i33 = iM55684 ^ i26;
                    i32 = i25;
                    break;
                case 124302967:
                case 454281778:
                    i44 = 36589;
                    iM559711 = C0873.m55680("ۡܳ") ^ i31;
                    i6 = ((iM559711 ^ i30) * 21385) ^ 1979425058;
                    i7 = 1876667365;
                    r215 = i43;
                    int i613 = iM559711 ^ i7;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    listM34312 = listM34312;
                    i39 = i39;
                    sb3 = sb3;
                    hashSet5 = hashSet5;
                    sArr6 = sArr6;
                    i35 = i35;
                    i40 = i40;
                    sArr5 = sArr5;
                    i33 = i613;
                    i36 = i36;
                    r29 = r215;
                    i32 = i6;
                    str3 = str3;
                    c20676 = c20676;
                    i43 = r29;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case 195972743:
                case 1459911906:
                    c20676 = c20676;
                    str4 = this.f15837;
                    if (str4 == null) {
                        iM55680 = (C0946.m55979("ۛᩳ") ^ i30) * 127;
                        i = ((iM55680 ^ i31) * 9461) ^ (-658468702);
                        i2 = -1540998987;
                    } else {
                        iM55680 = (C0873.m55680("ܶܶ") ^ i31) * 11;
                        i = ((iM55680 ^ i30) * 29495) ^ 1429469070;
                        i2 = -728573477;
                    }
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case 316536004:
                case 1793064964:
                    c20676 = c20676;
                    ?? r222 = i43;
                    hashSet5 = hashSet5;
                    i35 = i35;
                    i36 = i36;
                    c20675 = c20675;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    sArr5 = sArr5;
                    i39 = i39;
                    sArr6 = sArr6;
                    i42 = i42;
                    sArr7 = sArr7;
                    listM34312 = listM34312;
                    sb3 = sb3;
                    i41 = i41;
                    i40 = i40;
                    if (i36 == (C0873.m55680(C0898.m55792(f81960, 84, 3, i44)) ^ 2120025737)) {
                        iM559711 = C0946.m55979("᩶۬") ^ i31;
                        i6 = ((iM559711 ^ i30) * (-31867)) ^ (-983277950);
                        i7 = 604704360;
                        r215 = r222;
                    } else {
                        iM559711 = C0873.m55680("ܺۛ") ^ i31;
                        i6 = ((iM559711 ^ i30) * (-31955)) ^ 549953693;
                        i7 = 1268747939;
                        r215 = r222;
                    }
                    int i614 = iM559711 ^ i7;
                    i41 = i41;
                    i42 = i42;
                    sArr7 = sArr7;
                    listM34312 = listM34312;
                    i39 = i39;
                    sb3 = sb3;
                    hashSet5 = hashSet5;
                    sArr6 = sArr6;
                    i35 = i35;
                    i40 = i40;
                    sArr5 = sArr5;
                    i33 = i614;
                    i36 = i36;
                    r29 = r215;
                    i32 = i6;
                    str3 = str3;
                    c20676 = c20676;
                    i43 = r29;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                case 424329084:
                case 615749558:
                    c20672 = c20676;
                    ?? r223 = i43;
                    hashSet = hashSet5;
                    i16 = i36;
                    c20673 = c20675;
                    hashSet4 = hashSet4;
                    str = str3;
                    sArr2 = sArr6;
                    i17 = i42;
                    short[] sArr17 = sArr7;
                    sb = sb3;
                    i18 = i41;
                    list = listM34312;
                    iM55683 = C0873.m55680(RunnableC0897.m55783(f81960, 90, 3, i44)) ^ 2100843645;
                    if (C0946.f81894 != 0) {
                        sArr7 = sArr17;
                        r212 = r223;
                        int iM559722 = C0946.m55979("ۙ᩷") ^ i30;
                        i19 = ((iM559722 ^ i31) * 26357) ^ (-1765332343);
                        i33 = iM559722 ^ 867929323;
                        i36 = i16;
                        i41 = i18;
                        i42 = i17;
                        r211 = r212;
                    } else {
                        int iM559723 = (i30 - C0946.m55979("᩹ᩳ")) * 89;
                        i19 = ((iM559723 ^ i31) * 9095) ^ 2038703195;
                        i33 = iM559723 ^ (-1349533987);
                        i36 = i16;
                        i41 = i18;
                        i42 = i17;
                        sArr7 = sArr17;
                        r211 = r223;
                    }
                    sb3 = sb;
                    c20676 = c20672;
                    hashSet5 = hashSet;
                    i43 = r211;
                    sArr6 = sArr2;
                    str3 = str;
                    hashSet4 = hashSet4;
                    c20675 = c20673;
                    List list4 = list;
                    i35 = iM55683;
                    i32 = i19;
                    listM34312 = list4;
                    break;
                case 570142382:
                case 1492914460:
                    if (C0906.f81862 >= 0) {
                        iM55684 = C0946.m55979("᩸ᩴ") ^ i31;
                        i25 = ((iM55684 ^ i30) * 2055) ^ 1599153257;
                        i26 = -548605880;
                    } else {
                        iM55684 = (C0946.m55979("۠ۖ") + i30) * (-57);
                        i25 = ((iM55684 ^ i31) * (-16115)) ^ (-865751681);
                        i26 = 788541806;
                    }
                    i33 = iM55684 ^ i26;
                    i32 = i25;
                    break;
                case 584156873:
                case 1979865229:
                    this.f15838.mo13664();
                    return z2;
                case 1066856549:
                case 1967781291:
                    i45 = 1;
                    iM55680 = (C0946.m55979("֡ۤ") ^ i31) * 63;
                    i = ((iM55680 ^ i30) * 19699) ^ 497505221;
                    i2 = 722744690;
                    i33 = iM55680 ^ i2;
                    i32 = i;
                    c20676 = c20676;
                    break;
                case 1560336734:
                case 2028879192:
                    if (C1053.f81965 > 0) {
                        iM55684 = (i31 - C0946.m55979("ᩴ۬")) * 123;
                        i25 = ((iM55684 ^ i30) * 30131) ^ 278994215;
                        i26 = 1436510011;
                        i33 = iM55684 ^ i26;
                        i32 = i25;
                    } else {
                        c20676 = c20676;
                        r216 = i43;
                        hashSet5 = hashSet5;
                        i35 = i35;
                        i36 = i36;
                        c20675 = c20675;
                        hashSet4 = hashSet4;
                        str3 = str3;
                        sArr5 = sArr5;
                        i39 = i39;
                        i40 = i40;
                        sArr6 = sArr6;
                        i42 = i42;
                        sArr7 = sArr7;
                        listM34312 = listM34312;
                        sb3 = sb3;
                        i41 = i41;
                        iM559711 = (C0873.m55680("ܺ᩶") + i30) * (-11);
                        i6 = ((iM559711 ^ i31) * 7897) ^ (-1318369038);
                        i7 = 372029851;
                        r215 = r216;
                        int i615 = iM559711 ^ i7;
                        i41 = i41;
                        i42 = i42;
                        sArr7 = sArr7;
                        listM34312 = listM34312;
                        i39 = i39;
                        sb3 = sb3;
                        hashSet5 = hashSet5;
                        sArr6 = sArr6;
                        i35 = i35;
                        i40 = i40;
                        sArr5 = sArr5;
                        i33 = i615;
                        i36 = i36;
                        r29 = r215;
                        i32 = i6;
                        str3 = str3;
                        c20676 = c20676;
                        i43 = r29;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    }
                    break;
                case 1705080002:
                case 1964566636:
                    c20676 = c20676;
                    hashSet3 = hashSet5;
                    c20674 = c20675;
                    hashSet4 = hashSet4;
                    str3 = str3;
                    short[] sArr18 = sArr6;
                    i23 = i42;
                    sArr4 = sArr7;
                    sb2 = sb3;
                    i24 = i41;
                    sArr3 = sArr18;
                    C1012.m56146(c20674, C0873.m55680(C0882.m55717(sArr18, i24, i23, i44)) ^ 2097675209);
                    if (RunnableC0897.f81856) {
                        c20675 = c20674;
                        int iM556817 = C0873.m55680("۫֨") ^ i31;
                        i33 = iM556817 ^ (-565303398);
                        i32 = ((iM556817 ^ i30) * 1413) ^ 256456258;
                    } else {
                        int iM556818 = (C0873.m55680("ۙۢ") ^ i31) * (-69);
                        c20675 = c20674;
                        i32 = ((iM556818 ^ i30) * (-25869)) ^ 670824899;
                        i33 = iM556818 ^ (-305951129);
                    }
                    i41 = i24;
                    i42 = i23;
                    sArr7 = sArr4;
                    sb3 = sb2;
                    c20676 = c20676;
                    hashSet5 = hashSet3;
                    r5 = i43;
                    sArr6 = sArr3;
                    r4 = r5;
                    str3 = str3;
                    i43 = r4;
                    hashSet4 = hashSet4;
                    c20675 = c20675;
                    break;
                default:
                    c20676 = c20676;
                    sb3 = new StringBuilder();
                    C1003.m56121(sb3, c18249.m41538());
                    C1003.m56121(sb3, C0892.m55750(f81960, 128, 2, i44));
                    if (C1024.m56209() < 0) {
                        iM55680 = (C0873.m55680("᩷۫") ^ i31) * (-95);
                        i = ((iM55680 ^ i30) * 28475) ^ 2094021341;
                        i2 = -754804574;
                        i33 = iM55680 ^ i2;
                        i32 = i;
                        c20676 = c20676;
                    } else {
                        hashSet3 = hashSet5;
                        c20674 = c20675;
                        hashSet4 = hashSet4;
                        str3 = str3;
                        sArr3 = sArr6;
                        i23 = i42;
                        sArr4 = sArr7;
                        sb2 = sb3;
                        i24 = i41;
                        int iM556819 = (C0873.m55680("ۙۢ") ^ i31) * (-69);
                        c20675 = c20674;
                        i32 = ((iM556819 ^ i30) * (-25869)) ^ 670824899;
                        i33 = iM556819 ^ (-305951129);
                        i41 = i24;
                        i42 = i23;
                        sArr7 = sArr4;
                        sb3 = sb2;
                        c20676 = c20676;
                        hashSet5 = hashSet3;
                        r5 = i43;
                        sArr6 = sArr3;
                        r4 = r5;
                        str3 = str3;
                        i43 = r4;
                        hashSet4 = hashSet4;
                        c20675 = c20675;
                    }
                    break;
            }
        }
    }
}
