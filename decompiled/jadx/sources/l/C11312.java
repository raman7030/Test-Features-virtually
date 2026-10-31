package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۧ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11312 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f33861;

    /* JADX INFO: renamed from: ۧ۟۫, reason: not valid java name and contains not printable characters */
    private static final short[] f33862 = {9864, -23538, 27874, -21010, -27079, -25795, -30700, -31898, 27764, -23561, 25369, 30096, 25930, 27771, -32032, -27148, -18887, -30599, 32651, -30693, -23838, -27521, -18912, 30282, -22523, 9243, -5298, -5311, -5308, -5299, -5307, -5305, -5300, -5299, -5305, -5288, -5284, -5309, -5299, -5299, -5288, -5271, -5288, -5309, -5253, -5311, -5297, -5270, -5308, -5305, -5301, -5309, 3017, -2665, -1047, 374, 3089, 2464, -708, -4376, 7819, -4229, -10061, 6447, -6326, 556, 10268, -3505, 14662, -1832, -13754, -13839, -22629, -22629, -22575, -22576, -22579, 9362, -4349, 6799, 1547, 30513, 30521, 30520, 7642, -2953, -7701, 5849, -2743, 6344, 11816, 4247, -7807, 4848, 6962, -4306, 2108, -7708, -2051, 3851, 11338, 11341, 11343, 11339, 11339, 11339, 3426, 22579, -18869, -25836, -24072, 22398, 23687, -17643, 23977, 20017, 20343, 18122, -16436};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String f33863;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EditText f33864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f33865;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16560 f33866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f33867;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33868;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f33869;

    /* JADX WARN: Code duplicated, block: B:18:0x008b A[PHI: r2
      0x008b: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:17:0x0089, B:7:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[PHI: r4 r5 r17
      0x00ef: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int), (r4v1 int) binds: [B:31:0x00ed, B:29:0x00df, B:21:0x00ab, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:31:0x00ed, B:29:0x00df, B:21:0x00ab, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r17v20 int) = (r17v14 int), (r17v15 int), (r17v18 int), (r17v22 int) binds: [B:31:0x00ed, B:29:0x00df, B:21:0x00ab, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c0 A[PHI: r8 r9 r11 r12 r13 r17
      0x01c0: PHI (r8v3 short[]) = (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:51:0x01be, B:43:0x0176, B:21:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:51:0x01be, B:43:0x0176, B:21:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r11v3 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:51:0x01be, B:43:0x0176, B:21:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:51:0x01be, B:43:0x0176, B:21:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r13v3 int) = (r13v2 int), (r13v1 int), (r13v1 int) binds: [B:51:0x01be, B:43:0x0176, B:21:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01c0: PHI (r17v17 int) = (r17v8 int), (r17v11 int), (r17v18 int) binds: [B:51:0x01be, B:43:0x0176, B:21:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01f7 A[PHI: r1 r2 r3 r10 r17
      0x01f7: PHI (r1v3 short) = (r1v2 short), (r1v1 short), (r1v1 short), (r1v1 short) binds: [B:55:0x01f5, B:39:0x0155, B:24:0x00b9, B:18:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v3 int) binds: [B:55:0x01f5, B:39:0x0155, B:24:0x00b9, B:18:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r3v3 int) = (r3v1 int), (r3v1 int), (r3v2 int), (r3v1 int) binds: [B:55:0x01f5, B:39:0x0155, B:24:0x00b9, B:18:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:55:0x01f5, B:39:0x0155, B:24:0x00b9, B:18:0x008b] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r17v23 int) = (r17v7 int), (r17v12 int), (r17v16 int), (r17v24 int) binds: [B:55:0x01f5, B:39:0x0155, B:24:0x00b9, B:18:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x022d A[PHI: r17
      0x022d: PHI (r17v21 int) = (r17v6 int), (r17v22 int) binds: [B:59:0x022b, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x024e A[PHI: r6 r17 r18 r19
      0x024e: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:62:0x024c, B:59:0x022b, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r17v9 int) = (r17v5 int), (r17v6 int), (r17v10 int) binds: [B:62:0x024c, B:59:0x022b, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r18v2 char) = (r18v1 char), (r18v1 char), (r18v3 char) binds: [B:62:0x024c, B:59:0x022b, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r19v4 short[]) = (r19v3 short[]), (r19v3 short[]), (r19v5 short[]) binds: [B:62:0x024c, B:59:0x022b, B:47:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i;
        int iM6981;
        int i2;
        int i3;
        int i4;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 0;
        int i11 = 0;
        short[] sArr2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1409561227;
        int i15 = RunnableC0588.f2309;
        int i16 = C1773.f6144;
        int iM6982 = C2105.m6981("ۜ֫") ^ i16;
        int i17 = ((iM6982 ^ i15) * (-6727)) ^ 864356697;
        int i18 = iM6982 ^ (-1247070737);
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-1295)) >> 31));
            switch (i14) {
                case -2080212902:
                case -971160927:
                    i = i9;
                    i8 = s + s2;
                    if (C3746.m11369() >= 0) {
                        iM6981 = (i15 - C2105.m6981("ۡۚ")) * (-39);
                        i2 = ((iM6981 ^ i16) * (-19011)) ^ (-1484387747);
                        i3 = -1654916202;
                    } else {
                        iM6981 = C2105.m6981("۫ۗ") ^ i15;
                        i2 = ((iM6981 ^ i16) * (-4207)) ^ (-1054231902);
                        i3 = -749593321;
                    }
                    int i19 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i19;
                    break;
                case -1994116309:
                case -891991865:
                    i = i9;
                    ServiceConnectionC3453.m10564();
                    if (C3746.f11829 > 0) {
                        iM6981 = (i16 - C2105.m6981("ۨ᩵")) * 67;
                        i2 = ((iM6981 ^ i15) * (-5053)) ^ (-1362314736);
                        i3 = -174059077;
                    } else {
                        iM6981 = (i15 - C2105.m6981("ۡۚ")) * (-39);
                        i2 = ((iM6981 ^ i16) * (-19011)) ^ (-1484387747);
                        i3 = -1654916202;
                    }
                    int i110 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i110;
                    break;
                case -1825085608:
                case 1672214228:
                    i = i9;
                    s = sArr3[c];
                    if (C1773.m5908() <= 0) {
                        iM6981 = (C2105.m6981("ᩴ֡") + i16) * 35;
                        i2 = ((iM6981 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM6981 = C2105.m6981("᩶֨") ^ i15;
                        i2 = ((iM6981 ^ i16) * 17739) ^ 1491942244;
                        i3 = -1467574718;
                    }
                    int i111 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i111;
                    break;
                case -1734858748:
                case 797547343:
                    i = i9;
                    sArr2 = f33862;
                    i12 = 101;
                    i13 = 5;
                    if (C1504.f5354) {
                        iM6981 = C2105.m6981("ᩴۨ") ^ i15;
                        i2 = ((iM6981 ^ i16) * (-1239)) ^ 977621144;
                        i3 = -455221657;
                    } else {
                        iM6981 = (C0630.m2566("֡ۜ") ^ i16) * (-17);
                        i2 = ((iM6981 ^ i15) * 5025) ^ (-987892637);
                        i3 = -29428237;
                    }
                    int i112 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i112;
                    break;
                case -1693020586:
                case -1609865495:
                    i = i9;
                    sArr3 = f33862;
                    c = 'c';
                    if (C2167.f7158 >= 0) {
                        iM6981 = (i15 - C2105.m6981("ۡۚ")) * (-39);
                        i2 = ((iM6981 ^ i16) * (-19011)) ^ (-1484387747);
                        i3 = -1654916202;
                    } else {
                        iM6981 = (i16 - C2105.m6981("᩶᩸")) * (-17);
                        i2 = ((iM6981 ^ i15) * (-6407)) ^ (-1156105337);
                        i3 = -2045817000;
                    }
                    int i113 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i113;
                    break;
                case -1672236308:
                case -955469612:
                    i = i9;
                    sArr = f33862;
                    i10 = 100;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C2105.m6981("ᩴۨ") ^ i15;
                        i2 = ((iM6981 ^ i16) * (-1239)) ^ 977621144;
                        i3 = -455221657;
                    } else {
                        iM6981 = (i15 - C2105.m6981("ܶۚ")) * (-41);
                        i2 = ((iM6981 ^ i16) * 10497) ^ 130615897;
                        i3 = -1212903824;
                    }
                    int i114 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i114;
                    break;
                case -1414061857:
                case -511935347:
                    i = i9;
                    i11 = 1;
                    if (C1916.m6308() >= 0) {
                        iM6981 = (C2105.m6981("ᩴ֡") + i16) * 35;
                        i2 = ((iM6981 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM6981 = C2105.m6981("ܿ᩻") ^ i15;
                        i2 = ((iM6981 ^ i16) * 4753) ^ (-75767750);
                        i3 = 1189939362;
                    }
                    int i115 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i115;
                    break;
                case -1344858957:
                case 1252605940:
                    i = i9;
                    if ((i8 * i8) - i7 <= 0) {
                        iM6981 = C0630.m2566("۟۟") ^ i15;
                        i2 = ((iM6981 ^ i16) * (-20507)) ^ 1235875381;
                        i3 = 89612277;
                    } else {
                        iM6981 = C0630.m2566("ۨ۫") ^ i16;
                        i2 = ((iM6981 ^ i15) * 8295) ^ (-1658446113);
                        i3 = 869638095;
                    }
                    int i116 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i116;
                    break;
                case -1192954410:
                case 1692479007:
                    i = i9;
                    i7 = i6 + i6;
                    s2 = 11862;
                    if (C4263.f13799 <= 0) {
                        iM6981 = C2105.m6981("ۧۖ") ^ i15;
                        i2 = ((iM6981 ^ i16) * 29981) ^ 1271887238;
                        i3 = 648718102;
                    } else {
                        iM6981 = (C2105.m6981("᩸ۗ") + i16) * 101;
                        i2 = ((iM6981 ^ i15) * (-6021)) ^ (-1367188551);
                        i3 = -168006957;
                    }
                    int i117 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i117;
                    break;
                case -1164987119:
                case 2099583804:
                    i = i9;
                    C1916.m6308();
                    iM6981 = C2105.m6981("ۧۖ") ^ i15;
                    i2 = ((iM6981 ^ i16) * 29981) ^ 1271887238;
                    i3 = 648718102;
                    int i118 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i118;
                    break;
                case -1085176714:
                case 737863950:
                    C2958.m9034();
                    C3746.m11369();
                    throw new RuntimeException();
                case -1051877825:
                case 164169152:
                    i = i9;
                    i6 = i5 + 140707044;
                    if (C3746.m11369() >= 0) {
                        iM6981 = (C2105.m6981("ᩴ֡") + i16) * 35;
                        i2 = ((iM6981 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM6981 = C2105.m6981("ۖܿ") ^ i16;
                        i2 = ((iM6981 ^ i15) * (-3493)) ^ (-1842653927);
                        i3 = -1772531959;
                    }
                    int i119 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i119;
                    break;
                case -823017536:
                case 605282220:
                    i = i9;
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۧۖ") ^ i15;
                        i2 = ((iM6981 ^ i16) * 29981) ^ 1271887238;
                        i3 = 648718102;
                    } else {
                        iM6981 = C2105.m6981("ᩴۨ") ^ i15;
                        i2 = ((iM6981 ^ i16) * (-1239)) ^ 977621144;
                        i3 = -455221657;
                    }
                    int i1110 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i1110;
                    break;
                case -552203247:
                case -443295170:
                    f33861 = C5695.m16034(sArr, i10, i11, i9);
                    if (C0964.f3626 != 0) {
                        i = i9;
                        iM6981 = (C2105.m6981("ᩴ֡") + i16) * 35;
                        i2 = ((iM6981 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM6981 = C2105.m6981("ۙܽ") ^ i16;
                        i = i9;
                        i2 = ((iM6981 ^ i15) * (-21755)) ^ (-2009247974);
                        i3 = -1239051658;
                    }
                    int i1111 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i1111;
                    break;
                case -249217089:
                case 458888560:
                    f33863 = C4263.m12817(sArr2, i12, i13, i9);
                    return;
                case 100558035:
                case 493364026:
                    i4 = 16946;
                    int iM2566 = (C0630.m2566("ܽܰ") ^ i16) * (-107);
                    i = i4;
                    i3 = -1312529635;
                    i2 = ((iM2566 ^ i15) * 23749) ^ 755683398;
                    iM6981 = iM2566;
                    int i1112 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i1112;
                    break;
                case 400977840:
                case 2094133117:
                    i = i9;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("ۧۖ") ^ i15;
                        i2 = ((iM6981 ^ i16) * 29981) ^ 1271887238;
                        i3 = 648718102;
                    } else {
                        iM6981 = (i16 - C2105.m6981("ۨ᩵")) * 67;
                        i2 = ((iM6981 ^ i15) * (-5053)) ^ (-1362314736);
                        i3 = -174059077;
                    }
                    int i1113 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i1113;
                    break;
                case 503995746:
                case 830361631:
                    i5 = s * s;
                    if (C3683.f11629 >= 0) {
                        i = i9;
                        iM6981 = (C2105.m6981("ᩴ֡") + i16) * 35;
                        i2 = ((iM6981 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM6981 = (i15 - C2105.m6981("ᩴܿ")) * (-117);
                        i3 = 1610850419;
                        int i20 = i9;
                        i2 = ((iM6981 ^ i16) * (-6557)) ^ 1004649233;
                        i5 = i5;
                        i = i20;
                    }
                    int i1114 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i1114;
                    break;
                default:
                    i4 = 11387;
                    int iM2567 = (C0630.m2566("ܽܰ") ^ i16) * (-107);
                    i = i4;
                    i3 = -1312529635;
                    i2 = ((iM2567 ^ i15) * 23749) ^ 755683398;
                    iM6981 = iM2567;
                    int i1115 = i;
                    i18 = iM6981 ^ i3;
                    i17 = i2;
                    i9 = i1115;
                    break;
            }
        }
    }

    public C11312(AbstractC15440 abstractC15440, final C16560 c16560, final String str) {
        int i;
        short[] sArr;
        short[] sArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr3;
        EditText editText;
        short[] sArr4;
        View view;
        short[] sArr5;
        int i6;
        int i7;
        int i8;
        View view2;
        short[] sArr6;
        int i9;
        short[] sArr7;
        View view3;
        int i10;
        View view4;
        int iM6981;
        int i11;
        int i12;
        EditText editText2;
        View view5;
        int iM6982;
        int i13;
        int i14;
        int iM6983;
        int i15;
        int iM2566;
        int i16;
        int i17;
        DialogInterfaceC0206 dialogInterfaceC0206M16343 = null;
        int i18 = -1496847620;
        int i19 = C3911.f12484;
        int i20 = C0483.f2088;
        short s = f33862[0];
        int i21 = ((s * s) + 23716) - (s * 308) < 0 ? 64469 : 63850;
        int iM6984 = (i19 - C2105.m6981("֫᩹")) * 27;
        EditText editText3 = null;
        C19258 c19258M2130 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i22 = 0;
        int i23 = 0;
        int iM6985 = 0;
        int iM6986 = 0;
        int i24 = 0;
        Main mainM49336 = null;
        int iM2567 = 0;
        int i25 = 0;
        int i26 = 0;
        View view6 = null;
        int i27 = 0;
        Spinner spinner = null;
        View viewM28028 = null;
        String str2 = null;
        int i28 = 0;
        int i29 = ((iM6984 ^ i20) * (-4073)) ^ (-2081617154);
        DialogInterface.OnClickListener onClickListener = null;
        short[] sArr12 = null;
        int i30 = 0;
        int i31 = iM6984 ^ 974363826;
        short[] sArr13 = null;
        int i32 = 0;
        while (true) {
            i18 = i31 ^ (i29 & (((i18 ^ i20) * 3975) >> 31));
            switch (i18) {
                case -2094422850:
                case -2063583909:
                    iM6986 = C2105.m6981(str2) ^ 2124896992;
                    sArr12 = f33862;
                    i22 = 22;
                    if (C4263.f13799 > 0) {
                        iM2566 = (C0630.m2566("ۡ᩷") + i20) * (-3);
                        i16 = ((iM2566 ^ i19) * 22177) ^ (-1186889029);
                        i17 = 168870521;
                        i31 = iM2566 ^ i17;
                        i29 = i16;
                    } else {
                        i8 = i28;
                        editText2 = editText3;
                        view5 = view6;
                        sArr6 = sArr13;
                        iM6983 = (C0630.m2566("֡ۨ") ^ i19) * 41;
                        i29 = ((iM6983 ^ i20) * (-7351)) ^ (-921442944);
                        i15 = -1506538537;
                        i14 = iM6983 ^ i15;
                        editText3 = editText2;
                        i28 = i8;
                        View view7 = view5;
                        i31 = i14;
                        sArr13 = sArr6;
                        view6 = view7;
                    }
                    break;
                case -1888785038:
                case 1560009024:
                    sArr7 = sArr13;
                    int i33 = i28;
                    short[] sArr14 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    i4 = i25;
                    i5 = i32;
                    sArr3 = sArr10;
                    editText = editText3;
                    sArr4 = sArr14;
                    View viewM10739 = C3537.m10739(mainM49336, iM2567);
                    int iM2568 = C0630.m2566(RunnableC1937.m6385(f33862, 4, 3, i21));
                    int iM6987 = (C2105.m6981("᩸֫") + i19) * (-89);
                    int i34 = ((iM6987 ^ i20) * (-4003)) ^ (-599998473);
                    i31 = iM6987 ^ 913162391;
                    sArr9 = sArr9;
                    i29 = i34;
                    i28 = i33;
                    view3 = viewM10739;
                    i24 = iM2568;
                    sArr13 = sArr7;
                    view6 = view3;
                    int i35 = i4;
                    i30 = i3;
                    i22 = i2;
                    sArr11 = sArr4;
                    editText3 = editText;
                    sArr10 = sArr3;
                    i32 = i5;
                    i25 = i35;
                    break;
                case -1887091089:
                case -918371657:
                    i10 = i28;
                    view4 = view6;
                    sArr7 = sArr13;
                    short[] sArr15 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    i4 = i25;
                    i5 = i32;
                    sArr3 = sArr10;
                    editText = editText3;
                    sArr4 = sArr15;
                    spinner = (Spinner) C1005.m3507(view4, i24 ^ 2124694985);
                    sArr9 = f33862;
                    if (C7811.f24123 >= 0) {
                        iM6981 = C0630.m2566("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM6981 ^ i19) * (-10861));
                        i11 = -494399169;
                    } else {
                        iM6981 = C2105.m6981("ۗᩴ") ^ i20;
                        i29 = (-665096781) ^ ((iM6981 ^ i19) * 14203);
                        i11 = 513155912;
                    }
                    i12 = iM6981 ^ i11;
                    i28 = i10;
                    view3 = view4;
                    i31 = i12;
                    sArr13 = sArr7;
                    view6 = view3;
                    int i36 = i4;
                    i30 = i3;
                    i22 = i2;
                    sArr11 = sArr4;
                    editText3 = editText;
                    sArr10 = sArr3;
                    i32 = i5;
                    i25 = i36;
                    break;
                case -1358501687:
                case 378689423:
                    AbstractC2021.m6574();
                    ViewOnClickListenerC1958.m6429();
                    i21 = i21;
                    i8 = i28;
                    sArr9 = sArr9;
                    view2 = view6;
                    sArr6 = sArr13;
                    i9 = i32;
                    sArr3 = sArr10;
                    editText = editText3;
                    sArr4 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    int iM2569 = C0630.m2566("᩷۬") ^ i19;
                    int i37 = ((iM2569 ^ i20) * 20559) ^ (-531544991);
                    i31 = iM2569 ^ 738241993;
                    i30 = i3;
                    i22 = i2;
                    sArr11 = sArr4;
                    i21 = i21;
                    editText3 = editText;
                    sArr10 = sArr3;
                    i32 = i9;
                    sArr13 = sArr6;
                    view6 = view2;
                    sArr9 = sArr9;
                    i29 = i37;
                    i28 = i8;
                    break;
                case -1331791759:
                case 1667777087:
                    i8 = i28;
                    int i38 = i26;
                    editText2 = editText3;
                    view5 = view6;
                    sArr6 = sArr13;
                    short[] sArr16 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    sArr4 = sArr16;
                    this.f33867 = (TextView) C1005.m3507(view5, C2105.m6981(C1005.m3502(sArr16, i38, i3, i21)) ^ 2100621979);
                    if (!C1711.f5919) {
                        iM6982 = C2105.m6981("ۗ۬") ^ i20;
                        i26 = i38;
                        i29 = ((iM6982 ^ i19) * 31389) ^ 1700508261;
                        i13 = -1970252200;
                        i14 = iM6982 ^ i13;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText2;
                        i28 = i8;
                        View view8 = view5;
                        i31 = i14;
                        sArr13 = sArr6;
                        view6 = view8;
                    } else {
                        i26 = i38;
                        i9 = i32;
                        view2 = view5;
                        sArr3 = sArr10;
                        editText = editText2;
                        int iM25610 = C0630.m2566("᩷۬") ^ i19;
                        int i39 = ((iM25610 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM25610 ^ 738241993;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        i21 = i21;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i9;
                        sArr13 = sArr6;
                        view6 = view2;
                        sArr9 = sArr9;
                        i29 = i39;
                        i28 = i8;
                    }
                    break;
                case -1302081949:
                case 1674325487:
                    i21 = i21;
                    i8 = i28;
                    sArr9 = sArr9;
                    view2 = view6;
                    sArr6 = sArr13;
                    short[] sArr17 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    i4 = i25;
                    i5 = i32;
                    sArr3 = sArr10;
                    editText = editText3;
                    sArr4 = sArr17;
                    this.f33868 = 0;
                    this.f33866 = c16560;
                    this.f33869 = abstractC15440;
                    mainM49336 = C21923.m49336(c16560);
                    sArr8 = f33862;
                    i27 = 1;
                    if (C3746.f11829 > 0) {
                        int iM25611 = (C0630.m2566("۫֨") + i19) * 43;
                        int i40 = ((iM25611 ^ i20) * (-15513)) ^ (-1922369405);
                        i28 = i8;
                        i21 = i21;
                        i31 = iM25611 ^ (-1648119174);
                        sArr13 = sArr6;
                        view6 = view2;
                        sArr9 = sArr9;
                        i29 = i40;
                        int i310 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i310;
                    } else {
                        i9 = i5;
                        i25 = i4;
                        int iM25612 = C0630.m2566("᩷۬") ^ i19;
                        int i311 = ((iM25612 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM25612 ^ 738241993;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        i21 = i21;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i9;
                        sArr13 = sArr6;
                        view6 = view2;
                        sArr9 = sArr9;
                        i29 = i311;
                        i28 = i8;
                    }
                    break;
                case -1105853470:
                case 1034422618:
                    C0798.m2998();
                    if (C22628.f73083 <= 0) {
                        i21 = i21;
                        i8 = i28;
                        sArr9 = sArr9;
                        view2 = view6;
                        sArr6 = sArr13;
                        i9 = i32;
                        sArr3 = sArr10;
                        editText = editText3;
                        sArr4 = sArr11;
                        i2 = i22;
                        i3 = i30;
                        int iM25613 = C0630.m2566("᩷۬") ^ i19;
                        int i312 = ((iM25613 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM25613 ^ 738241993;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        i21 = i21;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i9;
                        sArr13 = sArr6;
                        view6 = view2;
                        sArr9 = sArr9;
                        i29 = i312;
                        i28 = i8;
                    } else {
                        int iM6988 = C2105.m6981("۬֡") ^ i19;
                        i29 = ((iM6988 ^ i20) * 7289) ^ 1612395422;
                        i31 = iM6988 ^ 564565797;
                    }
                    break;
                case -1045062858:
                case 947645676:
                    i10 = i28;
                    int i41 = i25;
                    i5 = i32;
                    EditText editText4 = editText3;
                    view4 = view6;
                    sArr7 = sArr13;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    editText = editText4;
                    i4 = i41;
                    short[] sArr18 = sArr9;
                    viewM28028 = C11340.m28028(view4, C0630.m2566(C3683.m11225(sArr18, 7, 3, i21)) ^ 2127991790);
                    if (C22628.m50615() != 0) {
                        sArr9 = sArr18;
                        iM6981 = C0630.m2566("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM6981 ^ i19) * (-10861));
                        i11 = -494399169;
                        i12 = iM6981 ^ i11;
                    } else {
                        int iM25614 = C0630.m2566("᩸᩹") ^ i20;
                        int i42 = ((iM25614 ^ i19) * (-22473)) ^ 1949735007;
                        i12 = iM25614 ^ (-1789907975);
                        sArr9 = sArr18;
                        i29 = i42;
                    }
                    i28 = i10;
                    view3 = view4;
                    i31 = i12;
                    sArr13 = sArr7;
                    view6 = view3;
                    int i313 = i4;
                    i30 = i3;
                    i22 = i2;
                    sArr11 = sArr4;
                    editText3 = editText;
                    sArr10 = sArr3;
                    i32 = i5;
                    i25 = i313;
                    break;
                case -951751419:
                case -105157104:
                    ServiceConnectionC3453.m10564();
                    if (RunnableC0588.f2309 < 0) {
                        i = i28;
                        sArr = sArr9;
                        view = view6;
                        sArr5 = sArr8;
                        i6 = i27;
                        sArr2 = sArr13;
                        short[] sArr19 = sArr11;
                        i2 = i22;
                        i3 = i30;
                        i4 = i25;
                        i5 = i32;
                        sArr3 = sArr10;
                        editText = editText3;
                        sArr4 = sArr19;
                        int iM25615 = (C0630.m2566("۟۠") ^ i20) * (-67);
                        int i43 = i21;
                        int i44 = ((iM25615 ^ i19) * (-1373)) ^ (-1501837941);
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM25615 ^ 917976339;
                        sArr13 = sArr2;
                        view6 = view;
                        sArr9 = sArr;
                        i29 = i44;
                        i21 = i43;
                        i7 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i7;
                    } else {
                        i21 = i21;
                        i8 = i28;
                        sArr9 = sArr9;
                        view2 = view6;
                        sArr6 = sArr13;
                        i9 = i32;
                        sArr3 = sArr10;
                        editText = editText3;
                        sArr4 = sArr11;
                        i2 = i22;
                        i3 = i30;
                        int iM25616 = C0630.m2566("᩷۬") ^ i19;
                        int i314 = ((iM25616 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM25616 ^ 738241993;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        i21 = i21;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i9;
                        sArr13 = sArr6;
                        view6 = view2;
                        sArr9 = sArr9;
                        i29 = i314;
                        i28 = i8;
                    }
                    break;
                case -891244407:
                case -260514491:
                    C2105.m6982();
                    throw new RuntimeException();
                case -713656685:
                case 1495689848:
                    int i45 = i28;
                    int i46 = i25;
                    int i47 = i32;
                    View view9 = view6;
                    short[] sArr20 = sArr13;
                    short[] sArr21 = sArr10;
                    EditText editText5 = (EditText) C11340.m28028(view9, C2105.m6981(C0798.m3005(sArr21, i46, i47, i21)) ^ 2103408996);
                    int iM25617 = C0630.m2566("֫᩸") ^ i20;
                    i30 = i30;
                    i22 = i22;
                    sArr11 = sArr11;
                    editText3 = editText5;
                    sArr10 = sArr21;
                    i32 = i47;
                    i28 = i45;
                    i7 = i46;
                    i29 = ((iM25617 ^ i19) * (-21433)) ^ (-77960099);
                    sArr13 = sArr20;
                    view6 = view9;
                    i31 = iM25617 ^ (-989593391);
                    i25 = i7;
                    break;
                case -71170379:
                case 1906858832:
                    iM6985 = C2105.m6981(RunnableC0588.m2436(sArr13, i28, i23, i21)) ^ 2116417995;
                    if (!C0483.m2121()) {
                        i10 = i28;
                        view4 = view6;
                        sArr7 = sArr13;
                        short[] sArr22 = sArr11;
                        i2 = i22;
                        i3 = i30;
                        i4 = i25;
                        i5 = i32;
                        sArr3 = sArr10;
                        editText = editText3;
                        sArr4 = sArr22;
                        iM6981 = C0630.m2566("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM6981 ^ i19) * (-10861));
                        i11 = -494399169;
                        i12 = iM6981 ^ i11;
                        i28 = i10;
                        view3 = view4;
                        i31 = i12;
                        sArr13 = sArr7;
                        view6 = view3;
                        int i315 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i315;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۙ") ^ i20) * (-97);
                        i16 = ((iM2566 ^ i19) * 28655) ^ (-1437607192);
                        i17 = 301800133;
                        i31 = iM2566 ^ i17;
                        i29 = i16;
                    }
                    break;
                case 208704508:
                case 1437850286:
                    view5 = view6;
                    spinner.setOnItemSelectedListener(this);
                    sArr6 = sArr13;
                    i8 = i28;
                    editText2 = editText3;
                    C1047.m3601(editText2, f33863);
                    editText2.setSelection(RunnableC1937.m6384(editText2));
                    if (AbstractC2021.f6743 <= 0) {
                        iM6983 = (C0630.m2566("֡ۨ") ^ i19) * 41;
                        i29 = ((iM6983 ^ i20) * (-7351)) ^ (-921442944);
                        i15 = -1506538537;
                    } else {
                        iM6983 = (C2105.m6981("۫۠") + i19) * 75;
                        i29 = ((iM6983 ^ i20) * (-6483)) ^ (-1581396786);
                        i15 = -459881238;
                    }
                    i14 = iM6983 ^ i15;
                    editText3 = editText2;
                    i28 = i8;
                    View view10 = view5;
                    i31 = i14;
                    sArr13 = sArr6;
                    view6 = view10;
                    break;
                case 438803711:
                case 640006911:
                    i8 = i28;
                    int i48 = i22;
                    editText2 = editText3;
                    view5 = view6;
                    sArr6 = sArr13;
                    this.f33864 = editText2;
                    short[] sArr23 = f33862;
                    i26 = 13;
                    i30 = 3;
                    if (C4159.m12565() >= 0) {
                        i22 = i48;
                        sArr11 = sArr23;
                        iM6983 = (C0630.m2566("֡ۨ") ^ i19) * 41;
                        i29 = ((iM6983 ^ i20) * (-7351)) ^ (-921442944);
                        i15 = -1506538537;
                        i14 = iM6983 ^ i15;
                        editText3 = editText2;
                        i28 = i8;
                        View view11 = view5;
                        i31 = i14;
                        sArr13 = sArr6;
                        view6 = view11;
                    } else {
                        int iM6989 = (C2105.m6981("᩻֫") ^ i19) * 83;
                        editText3 = editText2;
                        i28 = i8;
                        sArr11 = sArr23;
                        sArr13 = sArr6;
                        view6 = view5;
                        i31 = iM6989 ^ (-1178501856);
                        i29 = ((iM6989 ^ i20) * 17971) ^ 547791578;
                        i22 = i48;
                    }
                    break;
                case 541678396:
                case 1435495452:
                    i = i28;
                    sArr = sArr9;
                    View view12 = view6;
                    sArr2 = sArr13;
                    short[] sArr24 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    i4 = i25;
                    i5 = i32;
                    sArr3 = sArr10;
                    editText = editText3;
                    sArr4 = sArr24;
                    view = view12;
                    sArr5 = sArr8;
                    i6 = i27;
                    iM2567 = C0630.m2566(C0964.m3396(sArr5, i6, 3, i21)) ^ 2122056733;
                    if (!RunnableC1108.f4040) {
                        int iM25618 = (C0630.m2566("۟۠") ^ i20) * (-67);
                        int i49 = i21;
                        int i410 = ((iM25618 ^ i19) * (-1373)) ^ (-1501837941);
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM25618 ^ 917976339;
                        sArr13 = sArr2;
                        view6 = view;
                        sArr9 = sArr;
                        i29 = i410;
                        i21 = i49;
                        i7 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i7;
                    } else {
                        int i50 = i21;
                        int iM25619 = C0630.m2566("ܶ᩷") ^ i20;
                        int i51 = ((iM25619 ^ i19) * 11767) ^ 1117516547;
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM25619 ^ 1346945392;
                        i21 = i50;
                        i29 = i51;
                        sArr13 = sArr2;
                        view6 = view;
                        sArr9 = sArr;
                        int i316 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i316;
                    }
                    break;
                case 818140803:
                case 2091899763:
                    C10025.m25199(c16560, dialogInterfaceC0206M16343, str);
                    final Spinner spinner2 = spinner;
                    final DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M16343;
                    C4159.m12564(C21923.m49343(dialogInterfaceC0206M16343), new View.OnClickListener(this) { // from class: l.᩶ۨܽ

                        /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C11312 f65258;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view13) {
                            C16560 c16561 = null;
                            String str3 = null;
                            C11312 c11312 = null;
                            Spinner spinner3 = null;
                            int i52 = 851280034;
                            int i53 = AbstractC2021.f6743;
                            int i54 = C1294.f4556;
                            int iM69810 = C2105.m6981("ܳܽ") ^ i53;
                            int i55 = ((iM69810 ^ i54) * 18029) ^ (-876731044);
                            int i56 = 946134294;
                            while (true) {
                                i52 = ((((i52 ^ i54) * (-20057)) >> 31) & i55) ^ (iM69810 ^ i56);
                                switch (i52) {
                                    case -2112435227:
                                    case -1539390723:
                                        if (C1128.f4106 <= 0) {
                                            iM69810 = (C2105.m6981("֨۟") ^ i53) * (-73);
                                            i55 = ((iM69810 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        } else {
                                            iM69810 = C2105.m6981("ۨ۠") ^ i53;
                                            i55 = ((iM69810 ^ i54) * (-31531)) ^ 12755921;
                                            i56 = 488219046;
                                        }
                                        break;
                                    case -2046338404:
                                    case 1270084317:
                                        c16561 = c16560;
                                        if (C3663.f11553) {
                                            iM69810 = C2105.m6981("ܿ֡") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 14627) ^ (-1653079156);
                                            i56 = 687448885;
                                        } else {
                                            iM69810 = C2105.m6981("ۤۜ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 22089) ^ (-1031773551);
                                            i56 = 1884524861;
                                        }
                                        break;
                                    case -2014186660:
                                    case 2140554798:
                                        AbstractC2021.m6574();
                                        if (C1294.f4556 >= 0) {
                                            iM69810 = (i53 - C2105.m6981("ۙܺ")) * (-79);
                                            i55 = ((iM69810 ^ i54) * (-10687)) ^ 1938794522;
                                            i56 = 771606959;
                                        } else {
                                            iM69810 = (C2105.m6981("֨۟") ^ i53) * (-73);
                                            i55 = ((iM69810 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        }
                                        break;
                                    case -1927573466:
                                    case -363581365:
                                        c11312 = this.f65258;
                                        spinner3 = spinner2;
                                        if (RunnableC1108.f4040) {
                                            iM69810 = C2105.m6981("ܶܰ") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 11309) ^ (-1315576306);
                                            i56 = -135887262;
                                        } else {
                                            iM69810 = C0630.m2566("ۗᩳ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        }
                                        break;
                                    case -1588793509:
                                    case -819902593:
                                        C11312.m27957(c11312, spinner3, dialogInterfaceC0206, c16561, str3);
                                        break;
                                    case -1586622626:
                                    case 1818016461:
                                        RunnableC0588.m2441();
                                        if (C0050.f910 >= 0) {
                                            iM69810 = (i54 - C0630.m2566("ۙܿ")) * 31;
                                            i55 = ((iM69810 ^ i53) * 25509) ^ 1009115181;
                                            i56 = -705975307;
                                        } else {
                                            iM69810 = C0630.m2566("ۗᩳ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        }
                                        break;
                                    case -1562837002:
                                    case -1072240864:
                                        C3911.m11924();
                                        break;
                                    case -1291207407:
                                    case -720381637:
                                        if (C0422.f1886 <= 0) {
                                            iM69810 = C0630.m2566("ۗᩳ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        } else {
                                            iM69810 = C2105.m6981("۟ۛ") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 27833) ^ 1017342699;
                                            i56 = 158671548;
                                        }
                                        break;
                                    case -767901069:
                                    case -287786886:
                                        if (C2167.f7158 >= 0) {
                                            iM69810 = C2105.m6981("ܿ֡") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 14627) ^ (-1653079156);
                                            i56 = 687448885;
                                        } else {
                                            iM69810 = C2105.m6981("ܿ᩻") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 10205) ^ 1795393660;
                                            i56 = -225135006;
                                        }
                                        break;
                                    case -547619986:
                                    case -176361041:
                                        str3 = str;
                                        if (C1294.m4372() <= 0) {
                                            iM69810 = C2105.m6981("ܿ֡") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 14627) ^ (-1653079156);
                                            i56 = 687448885;
                                        } else {
                                            iM69810 = (C0630.m2566("᩹᩻") ^ i54) * (-37);
                                            i55 = ((iM69810 ^ i53) * 28145) ^ 289467229;
                                            i56 = 1046385045;
                                        }
                                        break;
                                    case 952813712:
                                    case 1418781913:
                                        C4117.m12364();
                                        iM69810 = (C2105.m6981("֨۟") ^ i53) * (-73);
                                        i55 = ((iM69810 ^ i54) * 501) ^ 1909944805;
                                        i56 = -340954022;
                                        break;
                                    case 1392600203:
                                    case 1437354639:
                                        if (C4075.m12263() <= 0) {
                                            iM69810 = (C2105.m6981("֨۟") ^ i53) * (-73);
                                            i55 = ((iM69810 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        } else {
                                            iM69810 = C2105.m6981("᩻֡") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 15175) ^ 828710888;
                                            i56 = -2086245314;
                                        }
                                        break;
                                    case 1567322010:
                                    case 1955426104:
                                        if (C0964.f3626 != 0) {
                                            iM69810 = C0630.m2566("ۗᩳ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        } else {
                                            iM69810 = C0630.m2566("ۚܶ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * (-25969)) ^ (-1220945659);
                                            i56 = 2100473796;
                                        }
                                        break;
                                    case 1608480483:
                                    case 2101512668:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            iM69810 = (i54 - C0630.m2566("ۙܿ")) * 31;
                                            i55 = ((iM69810 ^ i53) * 25509) ^ 1009115181;
                                            i56 = -705975307;
                                        } else {
                                            iM69810 = (C2105.m6981("ۤۚ") ^ i54) * 33;
                                            i55 = ((iM69810 ^ i53) * 21261) ^ 1045091012;
                                            i56 = -459744571;
                                        }
                                        break;
                                    case 1859040511:
                                    case 1996013625:
                                        if (C2958.f9394 >= 0) {
                                            iM69810 = (i53 - C2105.m6981("ۙܺ")) * (-79);
                                            i55 = ((iM69810 ^ i54) * (-10687)) ^ 1938794522;
                                            i56 = 771606959;
                                        } else {
                                            iM69810 = (C2105.m6981("᩺֨") + i54) * (-127);
                                            i55 = ((iM69810 ^ i53) * 30829) ^ 686485142;
                                            i56 = 2092953238;
                                        }
                                        break;
                                    default:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM69810 = C0630.m2566("ۗᩳ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        } else {
                                            iM69810 = (C2105.m6981("֨۟") ^ i53) * (-73);
                                            i55 = ((iM69810 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i52 = 1619383248;
                            int i53 = C2167.f7158;
                            int i54 = ServiceConnectionC3453.f10921;
                            int iM69810 = C2105.m6981("ۙۙ") ^ i53;
                            int i55 = ((iM69810 ^ i54) * (-16421)) ^ 1441730123;
                            int i56 = -1554038497;
                            while (true) {
                                i52 = ((((i52 ^ i54) * 3081) >> 31) & i55) ^ (iM69810 ^ i56);
                                switch (i52) {
                                    case -2140208615:
                                    case 1273927896:
                                        C0422.m1963();
                                        if (C2958.f9394 >= 0) {
                                            iM69810 = (C0630.m2566("᩷۬") + i54) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i55 = ((iM69810 ^ i53) * 13741) ^ 1316137150;
                                            i56 = -1056018144;
                                        } else {
                                            iM69810 = C2105.m6981("᩵᩶") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        }
                                        break;
                                    case -1876174523:
                                    case 1820023624:
                                        if (C4263.m12819() >= 0) {
                                            iM69810 = C0630.m2566("֡۬") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 15157) ^ 142328022;
                                            i56 = -1445088621;
                                        } else {
                                            iM69810 = (i53 - C2105.m6981("᩷ۢ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i55 = ((iM69810 ^ i54) * 7265) ^ 1504766761;
                                            i56 = 423585647;
                                        }
                                        break;
                                    case -1742803357:
                                    case -416071012:
                                        if (C7106.f21815 == 0) {
                                            iM69810 = C2105.m6981("᩵᩶") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM69810 = C0630.m2566("֡۬") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 15157) ^ 142328022;
                                            i56 = -1445088621;
                                        }
                                        break;
                                    case -1552272475:
                                    case 1327932673:
                                        if (C0798.f2919) {
                                            iM69810 = (C0630.m2566("᩷۬") + i54) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i55 = ((iM69810 ^ i53) * 13741) ^ 1316137150;
                                            i56 = -1056018144;
                                        } else {
                                            iM69810 = (C0630.m2566("ܺۜ") + i53) * (-77);
                                            i55 = ((iM69810 ^ i54) * (-21883)) ^ (-2100982855);
                                            i56 = 1211253289;
                                        }
                                        break;
                                    case -1430869769:
                                    case -764531610:
                                        if (C1005.f3721) {
                                            iM69810 = C0630.m2566("ܰ۟") ^ i53;
                                            i55 = ((iM69810 ^ i54) * (-4263)) ^ 1342680149;
                                            i56 = 466151575;
                                        } else {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM69810 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        }
                                        break;
                                    case -1029799650:
                                    case 2069505242:
                                        if (RunnableC3474.f10992 <= 0) {
                                            iM69810 = C2105.m6981("᩵᩶") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM69810 = C2105.m6981("ᩳܿ") ^ i53;
                                            i55 = ((iM69810 ^ i54) * 22417) ^ 1766532052;
                                            i56 = 1050637816;
                                        }
                                        break;
                                    case -406142222:
                                    case 201260092:
                                        if (C1128.m3851() <= 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM69810 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM69810 = C2105.m6981("ۢᩴ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 807) ^ 953179597;
                                            i56 = -1992471163;
                                        }
                                        break;
                                    case -394255183:
                                    case 707807360:
                                        if (C3019.f9544 >= 0) {
                                            iM69810 = C2105.m6981("᩵᩶") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM69810 = C2105.m6981("᩸ۙ") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 2515) ^ (-1849162044);
                                            i56 = 1178756838;
                                        }
                                        break;
                                    case -119530336:
                                    case 2047415833:
                                        this.f65258 = this;
                                        if (C4075.f12947 >= 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM69810 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM69810 = C0630.m2566("ۚۨ") ^ i53;
                                            i55 = ((iM69810 ^ i54) * (-17715)) ^ (-892006076);
                                            i56 = -1526644510;
                                        }
                                        break;
                                    case 141114185:
                                    case 1552070848:
                                        if (C0964.m3413()) {
                                            iM69810 = (C2105.m6981("ܿ᩸") + i54) * (-41);
                                            i55 = ((iM69810 ^ i53) * (-32323)) ^ (-366811320);
                                            i56 = 1616519495;
                                        } else {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM69810 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        }
                                        break;
                                    case 334978006:
                                    case 572483994:
                                        if (C0964.f3626 != 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM69810 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM69810 = (C0630.m2566("ܳۚ") + i54) * 91;
                                            i55 = ((iM69810 ^ i53) * (-16771)) ^ (-1750014053);
                                            i56 = -1626591000;
                                        }
                                        break;
                                    case 476126377:
                                    case 1888193502:
                                        C2126.m7040();
                                        throw new RuntimeException();
                                    case 1299935478:
                                    case 1707759399:
                                        return;
                                    case 1676891016:
                                    case 1893373828:
                                        if (C0382.f1805) {
                                            iM69810 = C2105.m6981("᩵᩶") ^ i54;
                                            i55 = ((iM69810 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM69810 = (C2105.m6981("᩶ۜ") ^ i53) * 83;
                                            i55 = ((iM69810 ^ i54) * (-17965)) ^ (-1026705775);
                                            i56 = 1025822168;
                                        }
                                        break;
                                    case 1990081526:
                                    case 2086082442:
                                        if (C4263.f13799 <= 0) {
                                            iM69810 = (C2105.m6981("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM69810 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM69810 = (C0630.m2566("ۤܶ") + i54) * (-77);
                                            i55 = ((iM69810 ^ i53) * 30513) ^ 2055564681;
                                            i56 = -441812250;
                                        }
                                        break;
                                    default:
                                        C4117.m12364();
                                        C21923.m49329();
                                        iM69810 = C0630.m2566("֡۬") ^ i53;
                                        i55 = ((iM69810 ^ i54) * 15157) ^ 142328022;
                                        i56 = -1445088621;
                                        break;
                                }
                            }
                        }
                    });
                    return;
                case 1017409239:
                case 1753476268:
                    dialogInterfaceC0206M16343 = C5834.m16343(c19258M2130, iM6986, onClickListener, C2105.m6981(C4616.m13542(sArr12, i22, 3, i21)) ^ 2116636572, onClickListener);
                    iM2566 = (C0630.m2566("֨᩻") ^ i20) * 79;
                    i16 = ((iM2566 ^ i19) * (-24707)) ^ (-514710047);
                    i17 = -1487828413;
                    i31 = iM2566 ^ i17;
                    i29 = i16;
                    break;
                case 1079756004:
                case 1790237923:
                    c19258M2130 = C0483.m2130(C22628.m50612(c16560));
                    View view13 = view6;
                    C1711.m5727(c19258M2130, view13);
                    sArr13 = f33862;
                    i23 = 3;
                    int iM25620 = (C0630.m2566("ܳۤ") + i19) * (-39);
                    view6 = view13;
                    i29 = ((iM25620 ^ i20) * (-11137)) ^ (-278408274);
                    i31 = iM25620 ^ 679485571;
                    i28 = 16;
                    break;
                case 1248867067:
                case 1963200341:
                    i8 = i28;
                    editText2 = editText3;
                    view5 = view6;
                    sArr6 = sArr13;
                    sArr4 = sArr11;
                    i2 = i22;
                    i3 = i30;
                    this.f33865 = (TextView) viewM28028;
                    sArr10 = f33862;
                    i25 = 10;
                    i32 = 3;
                    if (C4075.f12947 < 0) {
                        iM6982 = C2105.m6981("ۧ۠") ^ i19;
                        i29 = ((iM6982 ^ i20) * 12627) ^ 383498998;
                        i13 = -1077571404;
                        i14 = iM6982 ^ i13;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText2;
                        i28 = i8;
                        View view14 = view5;
                        i31 = i14;
                        sArr13 = sArr6;
                        view6 = view14;
                    } else {
                        sArr3 = sArr10;
                        i9 = 3;
                        view2 = view5;
                        editText = editText2;
                        int iM256110 = C0630.m2566("᩷۬") ^ i19;
                        int i317 = ((iM256110 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM256110 ^ 738241993;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        i21 = i21;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i9;
                        sArr13 = sArr6;
                        view6 = view2;
                        sArr9 = sArr9;
                        i29 = i317;
                        i28 = i8;
                    }
                    break;
                case 1699457692:
                case 1964389504:
                    C1294.m4380(c19258M2130, iM6985, null);
                    String strM12252 = C4075.m12252(f33862, 19, 3, i21);
                    int iM25621 = (i19 - C0630.m2566("ۡۖ")) * 89;
                    str2 = strM12252;
                    i31 = iM25621 ^ (-1045721253);
                    i29 = ((iM25621 ^ i20) * (-8753)) ^ 224132232;
                    onClickListener = null;
                    break;
                default:
                    C0964.m3413();
                    if (C21923.f70183 != 0) {
                        i10 = i28;
                        view4 = view6;
                        sArr7 = sArr13;
                        short[] sArr25 = sArr11;
                        i2 = i22;
                        i3 = i30;
                        i4 = i25;
                        i5 = i32;
                        sArr3 = sArr10;
                        editText = editText3;
                        sArr4 = sArr25;
                        iM6981 = C0630.m2566("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM6981 ^ i19) * (-10861));
                        i11 = -494399169;
                        i12 = iM6981 ^ i11;
                        i28 = i10;
                        view3 = view4;
                        i31 = i12;
                        sArr13 = sArr7;
                        view6 = view3;
                        int i318 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i318;
                    } else {
                        i = i28;
                        sArr = sArr9;
                        view = view6;
                        sArr5 = sArr8;
                        i6 = i27;
                        sArr2 = sArr13;
                        short[] sArr110 = sArr11;
                        i2 = i22;
                        i3 = i30;
                        i4 = i25;
                        i5 = i32;
                        sArr3 = sArr10;
                        editText = editText3;
                        sArr4 = sArr110;
                        int iM256111 = (C0630.m2566("۟۠") ^ i20) * (-67);
                        int i411 = i21;
                        int i412 = ((iM256111 ^ i19) * (-1373)) ^ (-1501837941);
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM256111 ^ 917976339;
                        sArr13 = sArr2;
                        view6 = view;
                        sArr9 = sArr;
                        i29 = i412;
                        i21 = i411;
                        i7 = i4;
                        i30 = i3;
                        i22 = i2;
                        sArr11 = sArr4;
                        editText3 = editText;
                        sArr10 = sArr3;
                        i32 = i5;
                        i25 = i7;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0481 A[PHI: r5 r16
      0x0481: PHI (r5v5 java.lang.String) = (r5v2 java.lang.String), (r5v4 java.lang.String), (r5v2 java.lang.String) binds: [B:111:0x047f, B:68:0x0249, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0481: PHI (r16v31 int) = (r16v3 int), (r16v15 int), (r16v32 int) binds: [B:111:0x047f, B:68:0x0249, B:11:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x04db A[PHI: r3 r6 r16
      0x04db: PHI (r3v6 java.lang.String) = 
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
      (r3v5 java.lang.String)
      (r3v2 java.lang.String)
      (r3v2 java.lang.String)
     binds: [B:119:0x04d9, B:115:0x04ba, B:84:0x0308, B:58:0x01df, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x04db: PHI (r6v5 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v4 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:119:0x04d9, B:115:0x04ba, B:84:0x0308, B:58:0x01df, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x04db: PHI (r16v30 int) = (r16v1 int), (r16v2 int), (r16v12 int), (r16v17 int), (r16v33 int) binds: [B:119:0x04d9, B:115:0x04ba, B:84:0x0308, B:58:0x01df, B:12:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x018c A[PHI: r16
      0x018c: PHI (r16v21 int) = (r16v19 int), (r16v22 int) binds: [B:49:0x0173, B:45:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0217 A[PHI: r16
      0x0217: PHI (r16v20 int) = (r16v16 int), (r16v18 int), (r16v22 int) binds: [B:62:0x0200, B:53:0x01a9, B:45:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (l.C0422.f1886 <= 0) goto L27;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m27957(final C11312 c11312, final Spinner spinner, DialogInterfaceC0206 dialogInterfaceC0206, C16560 c16560, String str) {
        int iM6981;
        int i;
        int i2;
        EditText editText = null;
        final int iM10632 = 0;
        String strM948 = null;
        String strM2816 = null;
        String strM10748 = null;
        String strM1840 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -2134599107;
        int i6 = C1047.f3863;
        int i7 = C4075.f12947;
        int iM6982 = (C2105.m6981("۬۬") ^ i7) * q.h;
        int i8 = ((iM6982 ^ i6) * 18517) ^ 1703723741;
        int i9 = -1123740887;
        while (true) {
            int i10 = iM6982 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * (-3345)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2045802989:
                    case -903008198:
                        i5 = i5;
                        if (iM10632 > 2000) {
                            iM6981 = C0630.m2566("᩷ۗ") ^ i6;
                            i = ((iM6981 ^ i7) * 2701) ^ (-805517933);
                            i2 = 1853614355;
                        } else {
                            iM6981 = C0630.m2566("ۨۧ") ^ i6;
                            i = ((iM6981 ^ i7) * (-29169)) ^ (-610529394);
                            i2 = 1135807766;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1993747156:
                    case -848130347:
                        i5 = i5;
                        s = f33862[52];
                        if (RunnableC3474.m10630()) {
                            iM6981 = (C0630.m2566("ۡܿ") ^ i6) * 71;
                            i = ((iM6981 ^ i7) * (-13927)) ^ 756474362;
                            i2 = -752859726;
                        } else {
                            iM6981 = (C2105.m6981("᩸֫") ^ i7) * 73;
                            i = ((iM6981 ^ i6) * (-30807)) ^ (-404748645);
                            i2 = -237691822;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1767879799:
                    case -980828414:
                        i5 = i5;
                        int i11 = s + 1;
                        if (i3 - (i11 * i11) > 0) {
                            iM6981 = (i6 - C0630.m2566("ۤ᩹")) * (-61);
                            i = ((iM6981 ^ i7) * 22395) ^ (-1073794980);
                            i2 = 1932148724;
                        } else {
                            iM6981 = C0630.m2566("ᩳ᩵") ^ i7;
                            i = ((iM6981 ^ i6) * (-14517)) ^ (-1871596790);
                            i2 = 1089648749;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1751661343:
                    case 1261000268:
                        i5 = i5;
                        strM10748 = C3537.m10748(f33862, 59, 3, i4);
                        if (C0422.f1886 <= 0) {
                            iM6981 = (C0630.m2566("۫֡") ^ i6) * (-57);
                            i = ((iM6981 ^ i7) * (-5127)) ^ (-1952642564);
                            i2 = -1313439002;
                        } else {
                            iM6981 = (C0630.m2566("ܿ۬") ^ i7) * 51;
                            i = ((iM6981 ^ i6) * 12355) ^ (-609827064);
                            i2 = 812035403;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1729813904:
                    case 1354374965:
                        i5 = i5;
                        try {
                            iM10632 = RunnableC3474.m10632(C0050.m947(C4117.m12350(editText)));
                            iM6981 = C2105.m6981("֨᩻") ^ i6;
                            i = ((iM6981 ^ i7) * (-18083)) ^ 1223198805;
                            i2 = 1354288406;
                        } catch (NumberFormatException unused) {
                            iM6981 = C2105.m6981("ۖۖ") ^ i6;
                            i = ((iM6981 ^ i7) * 31521) ^ 24343868;
                            i2 = -967734811;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1575668213:
                    case -1187089921:
                        C0483.m2121();
                        if (RunnableC0588.f2309 >= 0) {
                            iM6982 = (C2105.m6981("ۧ֫") + i7) * 49;
                            i8 = ((iM6982 ^ i6) * (-7135)) ^ 446647733;
                            i9 = 383377878;
                        }
                        i5 = i5;
                        iM6981 = (C0630.m2566("᩷᩶") + i7) * (-9);
                        i = ((iM6981 ^ i6) * 25951) ^ (-574318176);
                        i2 = 1014653960;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1533737639:
                    case 1117656384:
                        C1504.m5167(C0630.m2566(strM948) ^ 2127953504);
                        break;
                    case -1467563976:
                    case -1081089985:
                        i5 = i5;
                        if (C3537.f11231 >= 0) {
                            iM6981 = (C0630.m2566("۫֡") ^ i6) * (-57);
                            i = ((iM6981 ^ i7) * (-5127)) ^ (-1952642564);
                            i2 = -1313439002;
                        } else {
                            iM6981 = (i7 - C2105.m6981("ۨۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i = ((iM6981 ^ i6) * 28457) ^ 2078354723;
                            i2 = 1432526095;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1376789582:
                    case 466420342:
                        i5 = i5;
                        if (iM10632 <= 65536) {
                            iM6981 = C2105.m6981("ۨ֨") ^ i6;
                            i = ((iM6981 ^ i7) * (-31353)) ^ 1864580033;
                            i2 = -627336063;
                        } else {
                            iM6981 = C0630.m2566("᩷ۗ") ^ i6;
                            i = ((iM6981 ^ i7) * 2701) ^ (-805517933);
                            i2 = 1853614355;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1314539350:
                    case 255956330:
                        C1005.m3501();
                        break;
                    case -1174970242:
                    case 1474511400:
                        i5 = i5;
                        if (c11312.f33868 == 1) {
                            iM6981 = (C2105.m6981("ۖ۟") + i7) * (-55);
                            i = ((iM6981 ^ i6) * 6983) ^ (-2028305879);
                            i2 = 2121079123;
                        } else {
                            iM6981 = C0630.m2566("ۨۧ") ^ i6;
                            i = ((iM6981 ^ i7) * (-29169)) ^ (-610529394);
                            i2 = 1135807766;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1144431216:
                    case -667894006:
                        C4616.m13552();
                        if (!C1504.f5354) {
                            i5 = i5;
                            iM6981 = (i7 - C2105.m6981("ۢᩴ")) * 35;
                            i = ((iM6981 ^ i6) * 21959) ^ (-792665722);
                            i2 = 1769934667;
                            i10 = iM6981 ^ i2;
                            i8 = i;
                            i5 = i5;
                        } else {
                            iM6982 = (i7 - C2105.m6981("᩻ۖ")) * 73;
                            i8 = ((iM6982 ^ i6) * (-2543)) ^ (-972307846);
                            i9 = -758330851;
                        }
                        break;
                    case -1058496471:
                    case 702010833:
                        i5 = i5;
                        if (C2272.f7362) {
                            iM6981 = (i7 - C2105.m6981("ۢᩴ")) * 35;
                            i = ((iM6981 ^ i6) * 21959) ^ (-792665722);
                            i2 = 1769934667;
                        } else {
                            iM6981 = C2105.m6981("۬ۧ") ^ i6;
                            i = ((iM6981 ^ i7) * (-18835)) ^ 1816918210;
                            i2 = -942547109;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -996219459:
                    case 1583463528:
                        C1711.m5736();
                        if (C3537.m10746() <= 0) {
                            i5 = i5;
                            iM6981 = (C2105.m6981("᩷ܺ") ^ i6) * (-119);
                            i = ((iM6981 ^ i7) * 16961) ^ 1584059608;
                            i2 = -477794544;
                            i10 = iM6981 ^ i2;
                            i8 = i;
                            i5 = i5;
                        } else {
                            iM6982 = C0630.m2566("ۖۜ") ^ i6;
                            i8 = ((iM6982 ^ i7) * (-21337)) ^ (-2118654891);
                            i9 = 795732388;
                        }
                        break;
                    case -932285132:
                    case 1482479437:
                        i5 = i5;
                        editText = c11312.f33864;
                        if (RunnableC1937.m6373()) {
                            iM6981 = (i7 - C0630.m2566("᩷᩻")) * 123;
                            i = ((iM6981 ^ i6) * (-13349)) ^ 1373946382;
                            i2 = 1952040480;
                        } else {
                            iM6981 = C2105.m6981("ܶۙ") ^ i6;
                            i = ((iM6981 ^ i7) * 3889) ^ (-1982079269);
                            i2 = -548228908;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -928323625:
                    case 345699340:
                        i4 = 32971;
                        iM6981 = (i6 - C0630.m2566("֡ܺ")) * 95;
                        i = ((iM6981 ^ i7) * (-17513)) ^ 1573277505;
                        i2 = 656033053;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -889461783:
                    case -771297026:
                        C1504.m5167(C2105.m6981(strM2816) ^ 2100552787);
                        break;
                    case -857062089:
                    case 1378505694:
                        i5 = i5;
                        strM948 = C0050.m948(f33862, 53, 3, i4);
                        if (C3911.f12484 >= 0) {
                            iM6981 = (C0630.m2566("᩺ۡ") + i6) * 91;
                            i = ((iM6981 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM6981 = C0630.m2566("۠ۙ") ^ i7;
                            i = ((iM6981 ^ i6) * (-19897)) ^ 1707973857;
                            i2 = 751751032;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -852645479:
                    case 896472386:
                        C3537.m10746();
                        if (C1128.f4106 > 0) {
                            iM6982 = C0630.m2566("ۖۜ") ^ i6;
                            i8 = ((iM6982 ^ i7) * (-21337)) ^ (-2118654891);
                            i9 = 795732388;
                        }
                        i5 = i5;
                        iM6981 = (C0630.m2566("۫֡") ^ i6) * (-57);
                        i = ((iM6981 ^ i7) * (-5127)) ^ (-1952642564);
                        i2 = -1313439002;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -712769813:
                    case 90134090:
                        C1504.m5172(dialogInterfaceC0206);
                        C10025.m25197(new InterfaceC12846(c11312) { // from class: l.ۙۨܽ

                            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C11312 f14701;

                            {
                                int i12 = -255708961;
                                int i13 = C4117.f13076;
                                int i14 = AbstractC2021.f6743;
                                int iM6983 = (C2105.m6981("ۨۢ") ^ i13) * (-61);
                                int i15 = ((iM6983 ^ i14) * 25065) ^ (-246186794);
                                int i16 = 1383238910;
                                while (true) {
                                    i12 = ((((i12 ^ i14) * 12819) >> 31) & i15) ^ (iM6983 ^ i16);
                                    switch (i12) {
                                        case -2006928832:
                                        case -592002416:
                                            if (C1128.m3851() <= 0) {
                                                iM6983 = C0630.m2566("᩻۠") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM6983 = C0630.m2566("۟ܳ") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-19713)) ^ 37426065;
                                                i16 = -1725344529;
                                            }
                                            break;
                                        case -1506850805:
                                        case -804031302:
                                            C0630.m2564();
                                            iM6983 = (C0630.m2566("ۗۙ") + i14) * (-79);
                                            i15 = ((iM6983 ^ i13) * (-26633)) ^ (-718267711);
                                            i16 = -909718847;
                                            break;
                                        case -1498337081:
                                        case 334762038:
                                            return;
                                        case -1433059557:
                                        case 1719265014:
                                            if (C1005.f3721) {
                                                iM6983 = (C0630.m2566("ۚ֫") ^ i13) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i15 = ((iM6983 ^ i14) * 19183) ^ 1942724270;
                                                i16 = 1441405988;
                                            } else {
                                                iM6983 = C0630.m2566("ۨ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            }
                                            break;
                                        case -1417947859:
                                        case -784436332:
                                            if (C2126.m7040()) {
                                                iM6983 = (C2105.m6981("ܿᩴ") + i13) * (-57);
                                                i15 = ((iM6983 ^ i14) * (-8243)) ^ 2111420746;
                                                i16 = -1446328955;
                                            } else {
                                                iM6983 = (i13 - C0630.m2566("۫᩵")) * 89;
                                                i15 = ((iM6983 ^ i14) * 6105) ^ (-77173911);
                                                i16 = 1922272209;
                                            }
                                            break;
                                        case -1399016882:
                                        case 853580630:
                                            if (C5695.m16023() >= 0) {
                                                iM6983 = C0630.m2566("ۨ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            } else {
                                                iM6983 = C0630.m2566("֨ᩴ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * 25947) ^ (-579764568);
                                                i16 = -557124593;
                                            }
                                            break;
                                        case -1272815500:
                                        case -372287689:
                                            if (C4263.m12819() >= 0) {
                                                iM6983 = C0630.m2566("᩻۠") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM6983 = (C2105.m6981("۬ܳ") + i14) * 41;
                                                i15 = ((iM6983 ^ i13) * (-23189)) ^ 1549068611;
                                                i16 = 1418436474;
                                            }
                                            break;
                                        case -1241571424:
                                        case 2050250204:
                                            if (C1128.f4106 <= 0) {
                                                iM6983 = C0630.m2566("ۨ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            } else {
                                                iM6983 = (i13 - C2105.m6981("۠ۗ")) * 47;
                                                i15 = ((iM6983 ^ i14) * (-23051)) ^ (-1187081993);
                                                i16 = 1111994398;
                                            }
                                            break;
                                        case -1078343228:
                                        case -984645279:
                                            if (C3746.f11829 > 0) {
                                                iM6983 = C2105.m6981("ۛ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            } else {
                                                iM6983 = (C0630.m2566("ۗۙ") + i14) * (-79);
                                                i15 = ((iM6983 ^ i13) * (-26633)) ^ (-718267711);
                                                i16 = -909718847;
                                            }
                                            break;
                                        case -807398788:
                                        case 838428445:
                                            if (C21923.m49329()) {
                                                iM6983 = C0630.m2566("ۨ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            } else {
                                                iM6983 = C2105.m6981("ܺܺ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-27095)) ^ (-723293944);
                                                i16 = 570739802;
                                            }
                                            break;
                                        case -339984501:
                                        case 7911209:
                                            this.f14701 = c11312;
                                            if (C0422.f1886 <= 0) {
                                                iM6983 = C2105.m6981("ۛ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            } else {
                                                iM6983 = C0630.m2566("ۖܳ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * 19767) ^ 1614665094;
                                                i16 = -36601421;
                                            }
                                            break;
                                        case 86928545:
                                        case 628013392:
                                            C0237.m1481();
                                            if (C1128.m3851() <= 0) {
                                                iM6983 = C0630.m2566("᩻۠") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM6983 = C2105.m6981("ۛ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            }
                                            break;
                                        case 233416597:
                                        case 1957602457:
                                            if (C0382.f1805) {
                                                iM6983 = C2105.m6981("ۡ֨") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-24595)) ^ 1178774890;
                                                i16 = 819180434;
                                            } else {
                                                iM6983 = C0630.m2566("᩻۠") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            }
                                            break;
                                        case 1498450276:
                                        case 1746824907:
                                            if (C22628.f73083 <= 0) {
                                                iM6983 = C0630.m2566("᩻۠") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM6983 = (C0630.m2566("ᩴۚ") + i13) * (-127);
                                                i15 = ((iM6983 ^ i14) * (-23215)) ^ 575866285;
                                                i16 = 1145073529;
                                            }
                                            break;
                                        case 1615411078:
                                        case 2084209797:
                                            C0630.m2564();
                                            if (C0483.f2088 >= 0) {
                                                iM6983 = (C2105.m6981("ܿᩴ") + i13) * (-57);
                                                i15 = ((iM6983 ^ i14) * (-8243)) ^ 2111420746;
                                                i16 = -1446328955;
                                            } else {
                                                iM6983 = C2105.m6981("ۛ۫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            }
                                            break;
                                        default:
                                            C4263.m12819();
                                            throw new RuntimeException();
                                    }
                                }
                            }

                            @Override // l.InterfaceC12846
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // l.InterfaceC12846
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ boolean mo3777(Exception exc) {
                                return false;
                            }

                            @Override // l.InterfaceC12846
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo3776(C11667 c11667, boolean z) {
                                Spinner spinner2 = null;
                                int i12 = 808916233;
                                int i13 = C4263.f13799;
                                int i14 = C3746.f11829;
                                int iM6983 = (C2105.m6981("֡ۜ") + i14) * 81;
                                int i15 = ((iM6983 ^ i13) * 20203) ^ 2122693533;
                                int i16 = 2125473830;
                                while (true) {
                                    i12 = ((((i12 ^ i13) * (-10091)) >> 31) & i15) ^ (iM6983 ^ i16);
                                    switch (i12) {
                                        case -1998358505:
                                        case -1631228664:
                                            if (C5695.f17556 >= 0) {
                                                iM6983 = (i13 - C2105.m6981("ܶ᩵")) * (-81);
                                                i15 = ((iM6983 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            } else {
                                                iM6983 = C0630.m2566("۫ۢ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-13977)) ^ (-2105830672);
                                                i16 = -747069113;
                                            }
                                            break;
                                        case -1978679658:
                                        case -39222706:
                                            if (!C3663.f11553) {
                                                iM6983 = (i14 - C2105.m6981("֫᩻")) * (-33);
                                                i15 = ((iM6983 ^ i13) * 24631) ^ (-1409727577);
                                                i16 = -2013492157;
                                            } else {
                                                iM6983 = C0630.m2566("ܰܿ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-15807)) ^ 188434124;
                                                i16 = -1178748301;
                                            }
                                            break;
                                        case -1875379815:
                                        case 221231998:
                                            C11312.m27956(this.f14701, spinner2, iM10632, c11667, z);
                                            break;
                                        case -1785199510:
                                        case 971712232:
                                            if (C3746.m11369() < 0) {
                                                iM6983 = C2105.m6981("᩺֫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-28725)) ^ 84636662;
                                                i16 = -1014257402;
                                            } else {
                                                iM6983 = (i13 - C2105.m6981("ܶ᩵")) * (-81);
                                                i15 = ((iM6983 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            }
                                            break;
                                        case -1548920165:
                                        case -324874272:
                                            if (C0422.f1886 <= 0) {
                                                iM6983 = (i13 - C2105.m6981("ܶ᩵")) * (-81);
                                                i15 = ((iM6983 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            } else {
                                                iM6983 = C2105.m6981("۫֡") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-3903)) ^ (-689464617);
                                                i16 = -1951838556;
                                            }
                                            break;
                                        case -1440276445:
                                        case -783709035:
                                            C1294.m4372();
                                            break;
                                        case -1276882090:
                                        case -1074414694:
                                            if (C0382.m1848()) {
                                                iM6983 = (i13 - C0630.m2566("᩺ۨ")) * (-39);
                                                i15 = ((iM6983 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            } else {
                                                iM6983 = (i14 - C0630.m2566("ۖ᩸")) * (-103);
                                                i15 = ((iM6983 ^ i13) * 6809) ^ (-1069747355);
                                                i16 = 1899599350;
                                            }
                                            break;
                                        case -1247726347:
                                        case 1335062003:
                                            if (C0630.f2410 <= 0) {
                                                iM6983 = (i13 - C0630.m2566("᩺ۨ")) * (-39);
                                                i15 = ((iM6983 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            } else {
                                                iM6983 = C2105.m6981("ۗ֫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 23915) ^ (-424621343);
                                                i16 = 113802190;
                                            }
                                            break;
                                        case -791475267:
                                        case -137053601:
                                            if (C1294.f4556 >= 0) {
                                                iM6983 = C0630.m2566("ܰܿ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-15807)) ^ 188434124;
                                                i16 = -1178748301;
                                            } else {
                                                iM6983 = (i13 - C2105.m6981("ܶ᩵")) * (-81);
                                                i15 = ((iM6983 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            }
                                            break;
                                        case -547089255:
                                        case 1230581271:
                                            AbstractC2021.m6574();
                                            iM6983 = (i13 - C2105.m6981("ܶ᩵")) * (-81);
                                            i15 = ((iM6983 ^ i14) * (-4683)) ^ 1724467580;
                                            i16 = -1099982702;
                                            break;
                                        case -419870963:
                                        case -192556800:
                                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                                iM6983 = (i14 - C2105.m6981("֫᩻")) * (-33);
                                                i15 = ((iM6983 ^ i13) * 24631) ^ (-1409727577);
                                                i16 = -2013492157;
                                            } else {
                                                iM6983 = C0630.m2566("ܽ۟") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-14537)) ^ (-375651162);
                                                i16 = -1128286595;
                                            }
                                            break;
                                        case -379029117:
                                        case -196519322:
                                            if (C1047.f3863 >= 0) {
                                                iM6983 = (i13 - C2105.m6981("ܶ᩵")) * (-81);
                                                i15 = ((iM6983 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            } else {
                                                iM6983 = C2105.m6981("ܰۘ") ^ i13;
                                                i15 = ((iM6983 ^ i14) * 7107) ^ (-397794174);
                                                i16 = 1149789651;
                                            }
                                            break;
                                        case -271974211:
                                        case -203467021:
                                            if (C3911.m11924() <= 0) {
                                                iM6983 = C2105.m6981("᩺֫") ^ i13;
                                                i15 = ((iM6983 ^ i14) * (-28725)) ^ 84636662;
                                                i16 = -1014257402;
                                            } else {
                                                iM6983 = (C2105.m6981("ܳܶ") ^ i13) * 15;
                                                i15 = ((iM6983 ^ i14) * (-15727)) ^ (-686882207);
                                                i16 = 1161547588;
                                            }
                                            break;
                                        case 1027009984:
                                        case 1414261281:
                                            spinner2 = spinner;
                                            if (RunnableC1108.f4040) {
                                                iM6983 = C2105.m6981("ۧۜ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-8075)) ^ 1650731295;
                                                i16 = -152146519;
                                            } else {
                                                iM6983 = (i13 - C0630.m2566("᩺ۨ")) * (-39);
                                                i15 = ((iM6983 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            }
                                            break;
                                        case 1748300350:
                                        case 1892985171:
                                            if (AbstractC2021.f6743 <= 0) {
                                                iM6983 = (i13 - C0630.m2566("᩺ۨ")) * (-39);
                                                i15 = ((iM6983 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            } else {
                                                iM6983 = C2105.m6981("᩵ܳ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-6823)) ^ (-1755616746);
                                                i16 = -2145176394;
                                            }
                                            break;
                                        default:
                                            if (AbstractC2021.m6574()) {
                                                iM6983 = C0630.m2566("ܰܿ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * (-15807)) ^ 188434124;
                                                i16 = -1178748301;
                                            } else {
                                                iM6983 = C2105.m6981("ۜܶ") ^ i14;
                                                i15 = ((iM6983 ^ i13) * 13935) ^ (-1305273214);
                                                i16 = -1971626785;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        }, C21923.m49336(c16560), str);
                        break;
                    case -574619220:
                    case 2122954595:
                        i5 = i5;
                        if (iM10632 > 0) {
                            iM6981 = C0630.m2566("ۜۧ") ^ i7;
                            i = ((iM6981 ^ i6) * (-3009)) ^ 540778114;
                            i2 = -1818834907;
                        } else {
                            iM6981 = C0630.m2566("᩷ۗ") ^ i6;
                            i = ((iM6981 ^ i7) * 2701) ^ (-805517933);
                            i2 = 1853614355;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -528962997:
                    case 906284316:
                        i5 = i5;
                        strM2816 = C0714.m2816(f33862, 56, 3, i4);
                        if (C0050.f910 >= 0) {
                            iM6981 = (C2105.m6981("᩷ܺ") ^ i6) * (-119);
                            i = ((iM6981 ^ i7) * 16961) ^ 1584059608;
                            i2 = -477794544;
                        } else {
                            iM6981 = C2105.m6981("ᩴܳ") ^ i7;
                            i = ((iM6981 ^ i6) * (-7823)) ^ 1167055033;
                            i2 = 1118030094;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -522864209:
                    case -416890751:
                        f33861 = C0422.m1959(C4117.m12350(editText));
                        int iM6983 = C2105.m6981("۟ۘ") ^ i6;
                        i5 = i5;
                        i8 = ((iM6983 ^ i7) * 15935) ^ 550998585;
                        i10 = iM6983 ^ 1492852827;
                        i5 = i5;
                        break;
                    case -486484166:
                    case 946193172:
                        i5 = i5;
                        strM1840 = C0382.m1840(f33862, 62, 3, i4);
                        if (C2126.m7040()) {
                            iM6981 = (C0630.m2566("᩺ۡ") + i6) * 91;
                            i = ((iM6981 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM6981 = (C2105.m6981("ۧۗ") ^ i7) * (-27);
                            i = ((iM6981 ^ i6) * 18917) ^ (-400383735);
                            i2 = -234876502;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -355753288:
                    case -274435885:
                        i5 = i5;
                        i3 = (s * 2) + 1;
                        if (C0798.f2919) {
                            iM6981 = (C0630.m2566("᩷᩶") + i7) * (-9);
                            i = ((iM6981 ^ i6) * 25951) ^ (-574318176);
                            i2 = 1014653960;
                        } else {
                            iM6981 = (i7 - C0630.m2566("ܶ᩻")) * (-65);
                            i = ((iM6981 ^ i6) * 13257) ^ 9109935;
                            i2 = -1533653905;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -308127085:
                    case 821722840:
                        f33863 = C0422.m1959(C2958.m9028(editText));
                        int iM6984 = C2105.m6981("۟ۘ") ^ i6;
                        i5 = i5;
                        i8 = ((iM6984 ^ i7) * 15935) ^ 550998585;
                        i10 = iM6984 ^ 1492852827;
                        i5 = i5;
                        break;
                    case -250972023:
                    case 1252591433:
                        i5 = i5;
                        if (C5695.f17556 >= 0) {
                            iM6981 = (C0630.m2566("᩺ۡ") + i6) * 91;
                            i = ((iM6981 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM6981 = C0630.m2566("֨ۜ") ^ i7;
                            i = ((iM6981 ^ i6) * (-1557)) ^ 831873609;
                            i2 = 1987336964;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -160207588:
                    case 1513367205:
                        i5 = i5;
                        if (C0798.m3001()) {
                            iM6981 = (i6 - C2105.m6981("ۢܳ")) * 35;
                            i = ((iM6981 ^ i7) * (-12675)) ^ (-1209350571);
                            i2 = 133204669;
                        } else {
                            iM6981 = C2105.m6981("᩹ۧ") ^ i7;
                            i = ((iM6981 ^ i6) * (-15009)) ^ (-1435343818);
                            i2 = -1101207734;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -30409496:
                    case 1912476598:
                        i5 = i5;
                        if (C3432.m10477() <= 0) {
                            iM6981 = (C0630.m2566("᩺ۡ") + i6) * 91;
                            i = ((iM6981 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM6981 = C0630.m2566("֫᩺") ^ i6;
                            i = ((iM6981 ^ i7) * 25373) ^ 1663988193;
                            i2 = 855060345;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 62325528:
                    case 968217864:
                        i4 = 19915;
                        iM6981 = (i6 - C0630.m2566("֡ܺ")) * 95;
                        i = ((iM6981 ^ i7) * (-17513)) ^ 1573277505;
                        i2 = 656033053;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 148176281:
                    case 2005040177:
                        C7811.m20844();
                        C3432.m10477();
                        break;
                    case 284269137:
                    case 971258416:
                        C2958.m9034();
                        if (C7811.f24123 < 0) {
                            i5 = i5;
                            iM6981 = (C0630.m2566("᩺ۡ") + i6) * 91;
                            i = ((iM6981 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                            i10 = iM6981 ^ i2;
                            i8 = i;
                            i5 = i5;
                        }
                        i5 = i5;
                        iM6981 = (C0630.m2566("۫֡") ^ i6) * (-57);
                        i = ((iM6981 ^ i7) * (-5127)) ^ (-1952642564);
                        i2 = -1313439002;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 439664548:
                    case 1711222974:
                        C3663.m11161(C0630.m2566(strM10748) ^ 2124611995);
                        break;
                    case 832639071:
                    case 1905839610:
                        if (C3537.f11231 >= 0) {
                            iM6982 = (i7 - C2105.m6981("᩻ۖ")) * 73;
                            i8 = ((iM6982 ^ i6) * (-2543)) ^ (-972307846);
                            i9 = -758330851;
                        }
                        i5 = i5;
                        iM6981 = (C0630.m2566("᩷᩶") + i7) * (-9);
                        i = ((iM6981 ^ i6) * 25951) ^ (-574318176);
                        i2 = 1014653960;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 868271192:
                    case 1586365390:
                        C4616.m13552();
                        i5 = i5;
                        iM6981 = (C0630.m2566("᩷᩶") + i7) * (-9);
                        i = ((iM6981 ^ i6) * 25951) ^ (-574318176);
                        i2 = 1014653960;
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 1817276802:
                    case 1972685998:
                        C1504.m5167(C2105.m6981(strM1840) ^ 2118985624);
                        break;
                    default:
                        i5 = i5;
                        if (spinner.getSelectedItemPosition() == 0) {
                            iM6981 = C0630.m2566("ۚ᩷") ^ i7;
                            i = ((iM6981 ^ i6) * 26775) ^ 2024583679;
                            i2 = -1197375011;
                        } else {
                            iM6981 = (i6 - C0630.m2566("ۛ֨")) * 109;
                            i = ((iM6981 ^ i7) * 27539) ^ (-1510031854);
                            i2 = -613887709;
                        }
                        i10 = iM6981 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27956(C11312 c11312, Spinner spinner, int i, C11667 c11667, boolean z) {
        int iM6981;
        int i2;
        int i3;
        int iM2566;
        int i4;
        C11312 c11313 = c11312;
        int i5 = C0714.f2697;
        int i6 = ServiceConnectionC3453.f10921;
        int iM2567 = (i5 - C0630.m2566("᩹۟")) * (-75);
        int i7 = ((iM2567 ^ i6) * (-8223)) ^ 612164303;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM2567 ^ 1970596239;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        char c = 0;
        int i11 = -113050739;
        int i12 = 0;
        C16560 c16560 = null;
        short[] sArr4 = null;
        int i13 = 0;
        String strM948 = null;
        String strM2436 = null;
        String strM9025 = null;
        C0994 c0994 = null;
        int selectedItemPosition = 0;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i6) * (-5113)) >> 31));
            switch (i11) {
                case -1914525972:
                case -863505099:
                    selectedItemPosition = selectedItemPosition;
                    sArr = f33862;
                    c = 25;
                    if (!C0798.f2919) {
                        iM2566 = (C2105.m6981("۟ۖ") ^ i5) * 53;
                        i7 = ((iM2566 ^ i6) * 17163) ^ 495872440;
                        i4 = 1263135046;
                        int i14 = iM2566 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i14;
                        c11313 = c11312;
                    }
                    selectedItemPosition = selectedItemPosition;
                    int iM2568 = C0630.m2566("ܺۡ") ^ i5;
                    i7 = ((iM2568 ^ i6) * 5049) ^ (-227687872);
                    i8 = iM2568 ^ (-1647350085);
                    c11313 = c11312;
                    break;
                case -1889459953:
                case 2140732274:
                    if (C1128.m3851() <= 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM6981 = C0630.m2566("ۚ۟") ^ i6;
                        i2 = ((iM6981 ^ i5) * 31695) ^ 1293287960;
                        i3 = 1433921616;
                        int i15 = selectedItemPosition;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i15;
                    } else {
                        int iM6982 = C2105.m6981("֡ۚ") ^ i5;
                        i8 = iM6982 ^ (-1824818231);
                        i7 = ((iM6982 ^ i6) * (-23561)) ^ 1872399067;
                    }
                    break;
                case -1818443720:
                case 1970573588:
                    i10 = 60200;
                    iM2566 = (C0630.m2566("᩹֡") + i5) * 17;
                    i7 = ((iM2566 ^ i6) * (-13105)) ^ 136029372;
                    i4 = 1671719362;
                    int i16 = iM2566 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i16;
                    c11313 = c11312;
                    break;
                case -1600675803:
                case -1182742939:
                    C0483.m2121();
                    if (C3432.f10845 >= 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM2566 = C2105.m6981("ۡܳ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 5389) ^ 1415120266;
                        i4 = -1261856572;
                        int i17 = iM2566 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i17;
                        c11313 = c11312;
                    } else {
                        int iM6983 = C2105.m6981("֡ۚ") ^ i5;
                        i8 = iM6983 ^ (-1824818231);
                        i7 = ((iM6983 ^ i6) * (-23561)) ^ 1872399067;
                    }
                    break;
                case -1510169714:
                case 300606629:
                    c0994.m3470(i, strM948);
                    C16560 c16561 = c11313.f33866;
                    c0994.m3480(c16561);
                    if (C3746.f11829 <= 0) {
                        c16560 = c16561;
                        int iM2569 = C0630.m2566("ܺۡ") ^ i5;
                        i7 = ((iM2569 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM2569 ^ (-1647350085);
                        c11313 = c11312;
                    } else {
                        int iM25610 = (C0630.m2566("ۧܰ") + i6) * (-69);
                        i7 = ((iM25610 ^ i5) * 14687) ^ 479162620;
                        i8 = iM25610 ^ 398821969;
                        c16560 = c16561;
                    }
                    break;
                case -1377957169:
                case 308813180:
                    selectedItemPosition = selectedItemPosition;
                    RunnableC1937.m6379(c0994, C1047.m3603(sArr2, i13, 4, i10), strM9025);
                    sArr4 = f33862;
                    if (C2167.f7158 >= 0) {
                        iM6981 = C0630.m2566("ۚ۟") ^ i6;
                        i2 = ((iM6981 ^ i5) * 31695) ^ 1293287960;
                        i3 = 1433921616;
                    } else {
                        iM6981 = C2105.m6981("ۜۘ") ^ i5;
                        i2 = ((iM6981 ^ i6) * (-23663)) ^ (-833595964);
                        i3 = -174859583;
                    }
                    int i18 = selectedItemPosition;
                    i8 = iM6981 ^ i3;
                    i7 = i2;
                    selectedItemPosition = i18;
                    break;
                case -740652777:
                case 1878975276:
                    selectedItemPosition = selectedItemPosition;
                    if (i12 - (s * 6862) >= 0) {
                        iM2566 = (C0630.m2566("᩻ۗ") ^ i6) * (-119);
                        i7 = ((iM2566 ^ i5) * 21423) ^ (-741212589);
                        i4 = -1354281416;
                    } else {
                        iM2566 = (i6 - C2105.m6981("᩺ᩳ")) * (-55);
                        i7 = ((iM2566 ^ i5) * (-753)) ^ 236273438;
                        i4 = 1991423156;
                    }
                    int i19 = iM2566 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i19;
                    c11313 = c11312;
                    break;
                case -459430635:
                case 1272411475:
                    selectedItemPosition = selectedItemPosition;
                    strM9025 = C2958.m9025(c11313.f33869);
                    sArr2 = f33862;
                    i13 = 26;
                    if (!C3663.f11553) {
                        iM6981 = (i6 - C2105.m6981("֡ᩴ")) * 53;
                        i2 = ((iM6981 ^ i5) * (-11621)) ^ 1004065319;
                        i3 = -1561182418;
                        int i110 = selectedItemPosition;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i110;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        int iM25611 = C0630.m2566("ܺۡ") ^ i5;
                        i7 = ((iM25611 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM25611 ^ (-1647350085);
                        c11313 = c11312;
                    }
                    break;
                case -342260528:
                case 984686668:
                    selectedItemPosition = selectedItemPosition;
                    if (C1420.m4913()) {
                        iM2566 = C2105.m6981("ۡܳ") ^ i5;
                        i7 = ((iM2566 ^ i6) * 5389) ^ 1415120266;
                        i4 = -1261856572;
                    } else {
                        iM2566 = C0630.m2566("᩵֫") ^ i6;
                        i7 = ((iM2566 ^ i5) * 24573) ^ 154650646;
                        i4 = 1628858954;
                    }
                    int i111 = iM2566 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i111;
                    c11313 = c11312;
                    break;
                case -85062784:
                case 282325879:
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    int i20 = C15104.f46193;
                    c0994 = new C0994(C2139.class);
                    if (C4263.f13799 <= 0) {
                        int iM25612 = C0630.m2566("ܺۡ") ^ i5;
                        i7 = ((iM25612 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM25612 ^ (-1647350085);
                    } else {
                        int iM6984 = C2105.m6981("ܺۙ") ^ i5;
                        i8 = iM6984 ^ 1792170455;
                        i7 = ((iM6984 ^ i6) * 24371) ^ 1493707824;
                    }
                    c11313 = c11312;
                    break;
                case 327193153:
                case 509178555:
                    C1005.m3501();
                    if (AbstractC2021.f6743 > 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM2566 = C2105.m6981("ۘۘ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                        int i112 = iM2566 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i112;
                        c11313 = c11312;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        iM6981 = C0630.m2566("ۚ۟") ^ i6;
                        i2 = ((iM6981 ^ i5) * 31695) ^ 1293287960;
                        i3 = 1433921616;
                        int i113 = selectedItemPosition;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i113;
                    }
                    break;
                case 485825498:
                case 1036711828:
                    selectedItemPosition = selectedItemPosition;
                    s = sArr[c];
                    i12 = (s * s) + 11771761;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ۘۘ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                    } else {
                        iM2566 = C2105.m6981("ۧ֨") ^ i5;
                        i7 = ((iM2566 ^ i6) * (-2721)) ^ 70433167;
                        i4 = 1570064555;
                    }
                    int i114 = iM2566 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i114;
                    c11313 = c11312;
                    break;
                case 494195853:
                case 905214586:
                    C4616.m13552();
                    C1047.m3599();
                    break;
                case 925546130:
                case 1571822604:
                    c0994.m3472(C22628.m50612(c16560), c11667);
                    sArr3 = f33862;
                    if (C0050.f910 >= 0) {
                        selectedItemPosition = selectedItemPosition;
                        i9 = 37;
                        iM2566 = C2105.m6981("ۘۘ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                        int i115 = iM2566 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i115;
                        c11313 = c11312;
                    } else {
                        int iM6985 = C2105.m6981("֫ۡ") ^ i6;
                        int i21 = ((iM6985 ^ i5) * 5017) ^ (-274348648);
                        i8 = iM6985 ^ 1118869061;
                        i7 = i21;
                        i9 = 37;
                    }
                    break;
                case 981884587:
                case 1901295794:
                    C11340.m28031();
                    int iM6986 = C2105.m6981("֡ۚ") ^ i5;
                    i8 = iM6986 ^ (-1824818231);
                    i7 = ((iM6986 ^ i6) * (-23561)) ^ 1872399067;
                    break;
                case 1214246123:
                case 1391999347:
                    c0994.m3470(selectedItemPosition, strM2436);
                    selectedItemPosition = selectedItemPosition;
                    strM948 = C0050.m948(f33862, 34, 3, i10);
                    if (C1128.f4106 > 0) {
                        iM6981 = (C0630.m2566("ۖᩴ") + i5) * 79;
                        i2 = ((iM6981 ^ i6) * 31345) ^ 1818543006;
                        i3 = 1330527867;
                        int i116 = selectedItemPosition;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i116;
                    } else {
                        iM2566 = C2105.m6981("ۘۘ") ^ i6;
                        i7 = ((iM2566 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                        int i117 = iM2566 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i117;
                        c11313 = c11312;
                    }
                    break;
                case 1256660677:
                case 2078022560:
                    selectedItemPosition = selectedItemPosition;
                    strM2436 = RunnableC0588.m2436(sArr4, 30, 4, i10);
                    if (!C1916.f6442) {
                        selectedItemPosition = selectedItemPosition;
                        int iM25613 = C0630.m2566("ܺۡ") ^ i5;
                        i7 = ((iM25613 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM25613 ^ (-1647350085);
                        c11313 = c11312;
                    } else {
                        iM6981 = C2105.m6981("֨᩵") ^ i6;
                        i2 = ((iM6981 ^ i5) * (-18851)) ^ (-1155785288);
                        i3 = -1106311730;
                        int i118 = selectedItemPosition;
                        i8 = iM6981 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i118;
                    }
                    break;
                case 1393745259:
                case 1640169115:
                    i10 = 41922;
                    iM2566 = (C0630.m2566("᩹֡") + i5) * 17;
                    i7 = ((iM2566 ^ i6) * (-13105)) ^ 136029372;
                    i4 = 1671719362;
                    int i119 = iM2566 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i119;
                    c11313 = c11312;
                    break;
                default:
                    C0237.m1486(c0994, C0964.m3396(sArr3, i9, 15, i10), z);
                    c0994.m3469();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01a3  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27959(C18090 c18090, C8918 c8918, int i, C2139 c2139) throws Exception {
        int i2;
        int iM6981;
        int i3;
        int i4;
        C18090 c18091;
        int iM2566;
        int i5;
        int i6;
        int i7;
        C2139 c21310;
        int i8;
        int i9;
        Exception exc;
        int i10;
        int i11;
        List list;
        int iM2567;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM2568;
        int i18;
        int i19;
        int iM2569;
        int i20;
        int i21;
        List list2;
        C18090 c18092 = c18090;
        c8918 = c8918;
        c2139 = c2139;
        int i22 = C3683.f11629;
        int i23 = RunnableC0588.f2309;
        int iM6982 = C2105.m6981("ܿ֨") ^ i22;
        int i24 = ((iM6982 ^ i23) * (-9215)) ^ (-327436823);
        C17738[] c17738Arr = null;
        C13800[] c13800Arr = null;
        ArrayList arrayList = null;
        List list3 = null;
        InterfaceC2271[] interfaceC2271ArrM7812 = null;
        Iterator itM9029 = null;
        C3545 c3545 = null;
        Exception exc2 = null;
        int i25 = iM6982 ^ 358091475;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iM12563 = 0;
        char c = 0;
        char c2 = 0;
        int i29 = 0;
        boolean zM7150 = false;
        int i30 = 0;
        boolean zM10754 = false;
        C7897[] c7897Arr = null;
        boolean zM5910 = false;
        int i31 = 0;
        HashSet hashSet = null;
        C17032 c17032 = null;
        int[] iArr = null;
        Iterator itM90210 = null;
        int i32 = 0;
        int i33 = -2021816213;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i33 = i25 ^ (i24 & (((i33 ^ i23) * 9381) >> 31));
            switch (i33) {
                case -2088247309:
                case -1450965979:
                    if (!zM7150) {
                        iM2569 = C0630.m2566("ܽܽ") ^ i23;
                        i5 = ((iM2569 ^ i22) * (-25709)) ^ (-377095232);
                        i20 = 687714618;
                        i25 = i20 ^ iM2569;
                        i24 = i5;
                        i33 = i33;
                    } else {
                        i8 = i34;
                        i9 = i26;
                        exc = exc2;
                        i10 = i27;
                        i11 = iM12563;
                        list = list3;
                        iM2567 = C0630.m2566("֨֨") ^ i23;
                        i12 = ((iM2567 ^ i22) * 13121) ^ (-2011758469);
                        i13 = -1836790105;
                        i25 = i13 ^ iM2567;
                        c8918 = c8918;
                        c2139 = c2139;
                        i24 = i12;
                        list3 = list;
                        i33 = i33;
                        i26 = i9;
                        exc2 = exc;
                        i27 = i10;
                        i34 = i8;
                        iM12563 = i11;
                        c18092 = c18090;
                    }
                    break;
                case -2005332966:
                case 931524154:
                    i28++;
                    c18091 = c18092;
                    i29 = i30;
                    i27 = 1;
                    int iM6983 = (C2105.m6981("ۖ᩺") ^ i23) * (-3);
                    i5 = ((iM6983 ^ i22) * (-27637)) ^ (-788981951);
                    i7 = iM6983 ^ (-362481840);
                    c8918 = c8918;
                    c2139 = c2139;
                    c18092 = c18091;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1632403264:
                case -458509248:
                    C1128.m3849(c2139, C0630.m2566(C0422.m1955(f33862, 96, 3, i34)) ^ 2128753160);
                    RunnableC1937.m6383(arrayList);
                    iArr[i32] = i32;
                    i30 = i31;
                    iM2569 = (i22 - C2105.m6981("᩺᩷")) * (-77);
                    i5 = ((iM2569 ^ i23) * (-13751)) ^ (-709543849);
                    i20 = -61829878;
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1472874600:
                case 20750211:
                    zM5910 = C1773.m5910(itM90210);
                    iM2569 = C2105.m6981("ۡۢ") ^ i23;
                    i5 = ((iM2569 ^ i22) * 9399) ^ (-1812063207);
                    i20 = 907796288;
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1460702211:
                case -69286605:
                    if (zM10754) {
                        i30 = i29;
                        iM2569 = (i22 - C2105.m6981("᩺᩷")) * (-77);
                        i5 = ((iM2569 ^ i23) * (-13751)) ^ (-709543849);
                        i20 = -61829878;
                    } else {
                        iM2569 = C2105.m6981("ܽ۫") ^ i23;
                        i5 = ((iM2569 ^ i22) * 2089) ^ (-1905514619);
                        i20 = 1340449954;
                    }
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1344209714:
                case -402317294:
                    if (zM5910) {
                        iM2569 = C0630.m2566("ۚᩴ") ^ i22;
                        i5 = ((iM2569 ^ i23) * 30479) ^ (-1695790396);
                        i20 = -896894367;
                    } else {
                        iM2569 = (i22 - C2105.m6981("ۖۧ")) * (-103);
                        i5 = ((iM2569 ^ i23) * (-1749)) ^ (-1740380495);
                        i20 = 51020668;
                    }
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1338884250:
                case 777335657:
                    HashSet hashSet2 = new HashSet();
                    C17032 c17033 = new C17032();
                    C17738[] c17738Arr2 = {new C17738()};
                    ArrayList arrayList2 = new ArrayList();
                    c18091 = c18090;
                    List listM42190 = c18091.m42190(false);
                    c7897Arr = new C7897[]{null};
                    arrayList = arrayList2;
                    hashSet = hashSet2;
                    c17032 = c17033;
                    c13800Arr = new C13800[]{null};
                    c17738Arr = c17738Arr2;
                    iArr = new int[]{0};
                    interfaceC2271ArrM7812 = C2405.m7812(c18091, listM42190);
                    iM12563 = C4159.m12563(listM42190);
                    i27 = 1;
                    i28 = 0;
                    i29 = 0;
                    list3 = listM42190;
                    int iM6984 = (C2105.m6981("ۖ᩺") ^ i23) * (-3);
                    i5 = ((iM6984 ^ i22) * (-27637)) ^ (-788981951);
                    i7 = iM6984 ^ (-362481840);
                    c8918 = c8918;
                    c2139 = c2139;
                    c18092 = c18091;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1324963531:
                case -1002856397:
                    i26 = iArr[i32];
                    iM2569 = C0630.m2566("᩺ۙ") ^ i23;
                    i5 = ((iM2569 ^ i22) * 11377) ^ 1886194156;
                    i20 = 2068070051;
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1319850747:
                case 936405909:
                    c21310 = c2139;
                    C1128.m3849(c21310, C2105.m6981(C3746.m11357(f33862, 78, 3, i34)) ^ 2103088848);
                    itM9029 = C2958.m9029(arrayList);
                    i35 = i29;
                    c2 = 0;
                    int iM6985 = C2105.m6981("ۛ᩷") ^ i22;
                    i5 = ((iM6985 ^ i23) * 18805) ^ (-408592274);
                    i7 = iM6985 ^ (-663472836);
                    c2139 = c21310;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM12563 = iM12563;
                    c18092 = c18090;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1305763928:
                case 115357891:
                    zM10754 = C3537.m10754(arrayList);
                    iM2569 = C0630.m2566("۫۟") ^ i23;
                    i5 = ((iM2569 ^ i22) * 18429) ^ (-2074726288);
                    i20 = 823415046;
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1292169089:
                case 192823964:
                    C13800 c13800 = (C13800) C2272.m7513(itM9029);
                    i35++;
                    String strM38762 = C16458.m38762(i35);
                    C2105.m6983(c2139, strM38762);
                    m27955(c8918, c13800.m33113(c2139), strM38762);
                    c21310 = c2139;
                    int iM6986 = C2105.m6981("ۛ᩷") ^ i22;
                    i5 = ((iM6986 ^ i23) * 18805) ^ (-408592274);
                    i7 = iM6986 ^ (-663472836);
                    c2139 = c21310;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM12563 = iM12563;
                    c18092 = c18090;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1195220494:
                case -490931565:
                    if (i26 > 20971520) {
                        iM2569 = C0630.m2566("ۘܰ") ^ i22;
                        i5 = ((iM2569 ^ i23) * (-3009)) ^ (-1573614067);
                        i20 = 1185711389;
                    } else {
                        i30 = i29;
                        iM2569 = (i22 - C2105.m6981("᩺᩷")) * (-77);
                        i5 = ((iM2569 ^ i23) * (-13751)) ^ (-709543849);
                        i20 = -61829878;
                    }
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1188931989:
                case 1834738044:
                    StringBuilder sb = new StringBuilder();
                    C3245.m9923(sb, C4616.m13559(exc2));
                    C3245.m9923(sb, ViewOnClickListenerC1958.m6435(f33862, 81, 2, i34));
                    C3245.m9923(sb, C3746.m11363(c3545));
                    C1420.m4905(sb, RunnableC1108.m3789(f33862, 83, 1, i34));
                    throw new Exception(C0050.m947(sb), exc2);
                case -1080275096:
                case -664126001:
                    int i36 = i26;
                    Exception exc3 = exc2;
                    int i37 = i27;
                    List list4 = list3;
                    C2139 c21311 = c2139;
                    c = 0;
                    if (i28 < iM12563) {
                        iM2566 = C2105.m6981("᩶ۘ") ^ i23;
                        i5 = ((iM2566 ^ i22) * (-16475)) ^ 500913717;
                        i6 = -1890378807;
                    } else {
                        iM2566 = (C0630.m2566("ۗۚ") ^ i22) * (-93);
                        i5 = ((iM2566 ^ i23) * (-12629)) ^ (-733178233);
                        i6 = 490422399;
                    }
                    i7 = iM2566 ^ i6;
                    c2139 = c21311;
                    list3 = list4;
                    i26 = i36;
                    exc2 = exc3;
                    i27 = i37;
                    c18092 = c18090;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1032873710:
                case 1471484650:
                    i2 = 51139;
                    int iM6987 = C2105.m6981("֫ۛ") ^ i22;
                    int i38 = ((iM6987 ^ i23) * (-23645)) ^ (-420356167);
                    c8918 = c8918;
                    c2139 = c2139;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM6987 ^ (-623754220);
                    c18092 = c18092;
                    i33 = i33;
                    i34 = i2;
                    i24 = i38;
                    break;
                case -878182534:
                case 1041061206:
                    try {
                        C13800 c13801 = (C13800) C2272.m7513(itM90210);
                        int i39 = i31 + 1;
                        String strM38763 = C16458.m38762(i39);
                        C0630.m2572(c2139, strM38763);
                        m27955(c8918, c13801.m33113(c2139), strM38763);
                        i31 = i39;
                        iM2569 = C0630.m2566("۟ܳ") ^ i22;
                        i5 = ((iM2569 ^ i23) * 24235) ^ 1419489481;
                        i20 = -172260774;
                        i25 = i20 ^ iM2569;
                        i24 = i5;
                        i33 = i33;
                    } catch (Exception e) {
                        exc2 = e;
                        i14 = i34;
                        i21 = i26;
                        i15 = i27;
                        i16 = i28;
                        i17 = iM12563;
                        list2 = list3;
                        int iM25610 = C0630.m2566("֡۟") ^ i22;
                        i25 = (-1713596977) ^ iM25610;
                        i24 = ((iM25610 ^ i23) * (-25083)) ^ (-1571534693);
                        list3 = list2;
                        i26 = i21;
                        i27 = i15;
                        i34 = i14;
                        iM12563 = i17;
                        i28 = i16;
                        c18092 = c18090;
                    }
                    break;
                case -759180139:
                case -505467529:
                    int i40 = i34;
                    int i41 = i26;
                    Exception exc4 = exc2;
                    int i42 = i27;
                    C2139 c21312 = c2139;
                    C18090 c18093 = c18092;
                    List list5 = list3;
                    short s = f33862[77];
                    int i43 = (s * s) + 47610000;
                    int i44 = s + 6900;
                    if ((i44 * i44) - (i43 + i43) <= 0) {
                        iM6981 = (i23 - C0630.m2566("ۨ۟")) * (-103);
                        i3 = ((iM6981 ^ i22) * 12105) ^ 1266785123;
                        i4 = -895973484;
                    } else {
                        iM6981 = C2105.m6981("۠֨") ^ i22;
                        i3 = ((iM6981 ^ i23) * (-25155)) ^ 487182362;
                        i4 = 921207351;
                    }
                    c8918 = c8918;
                    c2139 = c21312;
                    list3 = list5;
                    i26 = i41;
                    exc2 = exc4;
                    i27 = i42;
                    i25 = iM6981 ^ i4;
                    i24 = i3;
                    c18092 = c18093;
                    i33 = i33;
                    i34 = i40;
                    break;
                case -702628797:
                case 934656298:
                    C3746.m11361(c2139, C0630.m2566(C2167.m7159(f33862, 93, 3, i34)) ^ 2124293635);
                    itM90210 = C2958.m9029(arrayList);
                    i31 = i29;
                    iM2569 = C0630.m2566("۟ܳ") ^ i22;
                    i5 = ((iM2569 ^ i23) * 24235) ^ 1419489481;
                    i20 = -172260774;
                    i25 = i20 ^ iM2569;
                    i24 = i5;
                    i33 = i33;
                    break;
                case 192906248:
                case 523568561:
                    return;
                case 380362564:
                case 1509007249:
                    i8 = i34;
                    i9 = i26;
                    exc = exc2;
                    i10 = i27;
                    i11 = iM12563;
                    list = list3;
                    c3545 = (C3545) C21923.m49339(list, i28);
                    if (C2167.m7150(c2139)) {
                        iM2567 = C0630.m2566("֨֨") ^ i23;
                        i12 = ((iM2567 ^ i22) * 13121) ^ (-2011758469);
                        i13 = -1836790105;
                    } else {
                        iM2567 = C0630.m2566("֫ۢ") ^ i23;
                        i12 = ((iM2567 ^ i22) * 26825) ^ (-748074799);
                        i13 = -1076585808;
                    }
                    i25 = i13 ^ iM2567;
                    c8918 = c8918;
                    c2139 = c2139;
                    i24 = i12;
                    list3 = list;
                    i33 = i33;
                    i26 = i9;
                    exc2 = exc;
                    i27 = i10;
                    i34 = i8;
                    iM12563 = i11;
                    c18092 = c18090;
                    break;
                case 640668552:
                case 2065394788:
                    try {
                        Object[] objArr = new Object[i27];
                        objArr[c] = C3746.m11363(c3545);
                        C2105.m6983(c2139, C1420.m4906(C0630.m2566(C5695.m16034(f33862, 84, 3, i34)) ^ 2125685751, objArr));
                        c2139.mo11538(0);
                        C2105.m6981(C2167.m7159(f33862, 87, 3, i34));
                        try {
                            C2105.m6981(C3663.m11162(f33862, 90, 3, i34));
                            i21 = i26;
                            Exception exc5 = exc2;
                            i15 = i27;
                            i14 = i34;
                            i17 = iM12563;
                            i16 = i28;
                            list2 = list3;
                            try {
                                try {
                                    new C13095(c18090, c3545, interfaceC2271ArrM7812, i28, iArr, c13800Arr, c7897Arr, c2139, hashSet, c17032, c17738Arr, i, arrayList).m31736();
                                    zM7150 = C2167.m7150(c2139);
                                    int iM6988 = (i22 - C2105.m6981("ܽ᩸")) * 67;
                                    i25 = iM6988 ^ 1455562131;
                                    c8918 = c8918;
                                    c2139 = c2139;
                                    i24 = ((iM6988 ^ i23) * (-26547)) ^ (-341322157);
                                    list3 = list2;
                                    i33 = i33;
                                    i26 = i21;
                                    exc2 = exc5;
                                    i27 = i15;
                                    i34 = i14;
                                    iM12563 = i17;
                                    i28 = i16;
                                    i32 = 0;
                                } catch (Exception e2) {
                                    exc2 = e2;
                                    i32 = 0;
                                    int iM25611 = C0630.m2566("֡۟") ^ i22;
                                    i25 = (-1713596977) ^ iM25611;
                                    i24 = ((iM25611 ^ i23) * (-25083)) ^ (-1571534693);
                                    list3 = list2;
                                    i26 = i21;
                                    i27 = i15;
                                    i34 = i14;
                                    iM12563 = i17;
                                    i28 = i16;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i32 = 0;
                                exc2 = e;
                                int iM25612 = C0630.m2566("֡۟") ^ i22;
                                i25 = (-1713596977) ^ iM25612;
                                i24 = ((iM25612 ^ i23) * (-25083)) ^ (-1571534693);
                                list3 = list2;
                                i26 = i21;
                                i27 = i15;
                                i34 = i14;
                                iM12563 = i17;
                                i28 = i16;
                                c18092 = c18090;
                                break;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i14 = i34;
                            i21 = i26;
                            i15 = i27;
                            i16 = i28;
                            i17 = iM12563;
                            list2 = list3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i14 = i34;
                        i21 = i26;
                        i15 = i27;
                        i16 = i28;
                        i17 = iM12563;
                        list2 = list3;
                    }
                    c18092 = c18090;
                    break;
                case 754129453:
                case 1791487637:
                    i14 = i34;
                    int i45 = i26;
                    Exception exc6 = exc2;
                    i15 = i27;
                    i16 = i28;
                    i17 = iM12563;
                    List list6 = list3;
                    if (C0483.m2123(itM9029)) {
                        iM2568 = (C0630.m2566("᩻᩸") ^ i22) * 11;
                        i18 = ((iM2568 ^ i23) * 32367) ^ 1525616050;
                        i19 = -1966316788;
                    } else {
                        iM2568 = C0630.m2566("ܶᩴ") ^ i23;
                        i18 = ((iM2568 ^ i22) * (-28791)) ^ (-2087702781);
                        i19 = -107521947;
                    }
                    i25 = i19 ^ iM2568;
                    i24 = i18;
                    list3 = list6;
                    i26 = i45;
                    exc2 = exc6;
                    i27 = i15;
                    i34 = i14;
                    iM12563 = i17;
                    i28 = i16;
                    c18092 = c18090;
                    break;
                case 1616942763:
                case 1617714740:
                    C1047.m3597(arrayList);
                    C3537.m10749(c13800Arr[c2]);
                    String strM38764 = C16458.m38762(i35 + 1);
                    C0630.m2572(c2139, strM38764);
                    m27955(c8918, c13800Arr[c2].m33113(c2139), strM38764);
                    return;
                default:
                    i2 = 30481;
                    int iM6989 = C2105.m6981("֫ۛ") ^ i22;
                    int i310 = ((iM6989 ^ i23) * (-23645)) ^ (-420356167);
                    c8918 = c8918;
                    c2139 = c2139;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM6989 ^ (-623754220);
                    c18092 = c18092;
                    i33 = i33;
                    i34 = i2;
                    i24 = i310;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27955(C8918 c8918, C19357 c19357, String str) throws Throwable {
        AbstractC15440 abstractC15440M6987 = null;
        Throwable th = null;
        int i = 1325570784;
        int i2 = C0050.f910;
        int i3 = RunnableC0588.f2309;
        int iM6981 = (C2105.m6981("۬᩵") + i2) * 115;
        int i4 = ((iM6981 ^ i3) * (-12097)) ^ 56048500;
        int i5 = -1062198697;
        while (true) {
            i = ((((i ^ i3) * (-25705)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1978955853:
                case 1766209861:
                    RunnableC3474.m10626(abstractC15440M6987);
                    return;
                case -1803050158:
                case -1286445436:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((iM6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩷") ^ i3) * 99;
                        i4 = ((iM6981 ^ i2) * (-13879)) ^ 1186706655;
                        i5 = 1211057445;
                    }
                    break;
                case -1719808363:
                case 1589157736:
                    if (C0422.f1886 <= 0) {
                        iM6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((iM6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܿ᩺")) * (-59);
                        i4 = ((iM6981 ^ i3) * (-8407)) ^ (-592990934);
                        i5 = -1132588661;
                    }
                    break;
                case -1705770367:
                case -1002899908:
                    if (C2105.f7037 != 0) {
                        iM6981 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩸") + i2) * 73;
                        i4 = ((iM6981 ^ i3) * 1627) ^ 1269337927;
                        i5 = -369616892;
                    }
                    break;
                case -1620144238:
                case 1119693790:
                    if (C4263.f13799 <= 0) {
                        iM6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((iM6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((iM6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    }
                    break;
                case -1432620630:
                case 2062531838:
                    C11340.m28031();
                    return;
                case -1206594035:
                case 281893720:
                    RunnableC3474.m10626(abstractC15440M6987);
                    throw th;
                case -1104654869:
                case 1161533618:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((iM6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM6981 = C0630.m2566("ۚۗ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-13671)) ^ (-1364514699);
                        i5 = -565714541;
                    }
                    break;
                case -900660388:
                case 504099822:
                    abstractC15440M6987 = C2105.m6987(C16293.f50111);
                    iM6981 = (i2 - C2105.m6981("ۚ۬")) * 23;
                    i4 = ((iM6981 ^ i3) * (-23045)) ^ (-884935367);
                    i5 = -780769106;
                    break;
                case -693695586:
                case 1204002351:
                    C1916.m6308();
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24031) ^ (-1199266685);
                        i5 = -1105522848;
                    } else {
                        iM6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((iM6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    }
                    break;
                case -114766354:
                case 1363148063:
                    if (RunnableC1108.m3790()) {
                        iM6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((iM6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM6981 = (C0630.m2566("ܿ᩷") ^ i2) * 21;
                        i4 = ((iM6981 ^ i3) * (-26403)) ^ 538832925;
                        i5 = 551955034;
                    }
                    break;
                case 184119041:
                case 1055184995:
                    if (C3663.f11553) {
                        iM6981 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        iM6981 = C2105.m6981("ۜ۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18197) ^ (-1493331339);
                        i5 = -2014259250;
                    }
                    break;
                case 365048216:
                case 1672971761:
                    try {
                        c19357.m48535(abstractC15440M6987);
                        C0422.m1961(c8918, str);
                        abstractC15440M6987.m36495(c8918.m23007(), (InterfaceC1393) null);
                        iM6981 = C2105.m6981("ۙۧ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 29225) ^ (-761361492);
                        i5 = 1991131606;
                    } catch (Throwable th2) {
                        th = th2;
                        iM6981 = (i3 - C2105.m6981("ۧۘ")) * 15;
                        i4 = ((iM6981 ^ i2) * 9949) ^ 456498768;
                        i5 = -1113334513;
                    }
                    break;
                case 407205909:
                case 608859598:
                    if (!C1504.f5354) {
                        iM6981 = (i3 - C2105.m6981("᩷۬")) * 43;
                        i4 = ((iM6981 ^ i2) * (-2835)) ^ 243666405;
                        i5 = 1985153716;
                    } else {
                        iM6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((iM6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    }
                    break;
                case 441496099:
                case 1645390562:
                    C0964.m3413();
                    C3019.m9255();
                    iM6981 = (i3 - C2105.m6981("᩷۬")) * 43;
                    i4 = ((iM6981 ^ i2) * (-2835)) ^ 243666405;
                    i5 = 1985153716;
                    break;
                case 515813245:
                case 1048739678:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24031) ^ (-1199266685);
                        i5 = -1105522848;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ܰ᩵")) * (-79);
                        i4 = ((iM6981 ^ i3) * 26753) ^ 304889195;
                        i5 = 60919079;
                    }
                    break;
                case 594574182:
                case 2052198267:
                    if (C1420.m4913()) {
                        iM6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((iM6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۫ܽ")) * (-7);
                        i4 = ((iM6981 ^ i2) * (-24583)) ^ (-55081907);
                        i5 = -190812853;
                    }
                    break;
                case 1203553537:
                case 1544233413:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        iM6981 = (C0630.m2566("᩷ᩳ") + i2) * (-35);
                        i4 = ((iM6981 ^ i3) * 19401) ^ (-809384462);
                        i5 = -945074129;
                    }
                    break;
                default:
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((iM6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        iM6981 = C0630.m2566("۟᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 32561) ^ (-1479029203);
                        i5 = 1624497465;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27958(C18090 c18090, C8918 c8918, int i, C2139 c2139) throws Throwable {
        int i2;
        List list;
        int i3;
        int i4;
        int i5;
        int i6;
        List list2;
        List listM42190;
        int iM2566;
        int i7;
        int i8;
        boolean z;
        int iM2567;
        int i9;
        int iM6981;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM6982;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iM2568;
        int i20;
        int i21;
        int i22;
        boolean zM7150 = false;
        Iterator itM3596 = null;
        boolean zM2123 = false;
        C13800[] c13800Arr = null;
        List[] listArr = null;
        boolean zM10754 = false;
        int i23 = 259032749;
        int i24 = AbstractC2021.f6743;
        int i25 = C0714.f2697;
        int iM6983 = (C2105.m6981("᩵ܺ") + i25) * (-75);
        int i26 = ((iM6983 ^ i24) * (-17727)) ^ 1588464939;
        int i27 = iM6983 ^ 6660217;
        C17032 c17032 = null;
        C12390 c12390 = null;
        Boolean bool = null;
        List list3 = null;
        Throwable th = null;
        Boolean[] boolArr = null;
        C3545 c3545 = null;
        String strM38762 = null;
        C13800 c13800 = null;
        String strM947 = null;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z2 = false;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean zM2807 = false;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        HashSet hashSet = null;
        InterfaceC2271[] interfaceC2271ArrM7812 = null;
        AbstractC15440 abstractC15440M6987 = null;
        int i39 = 0;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i24) * 27411) >> 31));
            switch (i23) {
                case -2131622870:
                case -1298643069:
                    i29 = i29;
                    strM947 = strM947;
                    i31 = c12390.f37160;
                    iM2568 = C0630.m2566("᩸ܰ") ^ i24;
                    i20 = ((iM2568 ^ i25) * (-27355)) ^ 358523038;
                    i21 = 1435378446;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i40 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i40;
                    break;
                case -1899402072:
                case -751280266:
                    i28 = i28;
                    i29 = i29;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i5 = i39;
                    i6 = i31;
                    int i41 = i37;
                    c13800 = c13800;
                    i2 = i41;
                    List list4 = list3;
                    i33 = i33;
                    list = list4;
                    try {
                        C1128.m3849(c2139, C0630.m2566(C4616.m13542(f33862, 66, 3, i5)) ^ 2100581820);
                        Arrays.fill(c12390.f37165, (Object) null);
                        Runtime.getRuntime().gc();
                        iM2566 = C0630.m2566("ۚۘ") ^ i25;
                        i7 = ((iM2566 ^ i24) * 30603) ^ (-967741994);
                        i8 = 1819189395;
                        i19 = iM2566 ^ i8;
                        i39 = i5;
                        i31 = i6;
                        strM947 = strM947;
                        i28 = i28;
                        i29 = i29;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        z2 = z2;
                        i27 = i19;
                        i26 = i7;
                        strM38762 = strM38762;
                        i38 = i38;
                        C13800 c13801 = c13800;
                        i37 = i2;
                        c13800 = c13801;
                        int i42 = i33;
                        list3 = list;
                        i33 = i42;
                    } catch (Throwable th2) {
                        th = th2;
                        strM38762 = strM38762;
                        th = th;
                        strM38762 = strM38762;
                        z2 = z2;
                        int iM6984 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM6984 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM6984 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i43 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i43;
                        C13800 c13802 = c13800;
                        i37 = i2;
                        c13800 = c13802;
                        int i44 = i33;
                        list3 = list;
                        i33 = i44;
                    }
                    break;
                case -1778287136:
                case 865043694:
                    RunnableC3474.m10626(abstractC15440M6987);
                    return;
                case -1704720070:
                case -1210642509:
                    i29 = i29;
                    strM947 = strM947;
                    zM2123 = C0483.m2123(itM3596);
                    iM2568 = (i24 - C2105.m6981("֡᩸")) * q.h;
                    i20 = ((iM2568 ^ i25) * 9213) ^ (-770023744);
                    i21 = -1570774819;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i45 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i45;
                    break;
                case -1648323969:
                case 90117364:
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i5 = i39;
                    i6 = i31;
                    int i46 = i37;
                    c13800 = c13800;
                    i2 = i46;
                    List list5 = list3;
                    i33 = i33;
                    list = list5;
                    if (zM2807) {
                        iM2567 = (C0630.m2566("ۧܶ") ^ i24) * 33;
                        i7 = ((iM2567 ^ i25) * (-4449)) ^ 171248964;
                        i9 = -1702089705;
                    } else {
                        iM2567 = C2105.m6981("᩶᩺") ^ i24;
                        i7 = ((iM2567 ^ i25) * 31711) ^ 1515662658;
                        i9 = -1998993592;
                    }
                    i19 = iM2567 ^ i9;
                    i39 = i5;
                    i31 = i6;
                    strM947 = strM947;
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i36 = i36;
                    z2 = z2;
                    i27 = i19;
                    i26 = i7;
                    strM38762 = strM38762;
                    i38 = i38;
                    C13800 c13803 = c13800;
                    i37 = i2;
                    c13800 = c13803;
                    int i47 = i33;
                    list3 = list;
                    i33 = i47;
                    break;
                case -1634976166:
                case -197579139:
                    i29 = i29;
                    strM947 = strM947;
                    if (zM7150) {
                        iM2568 = C0630.m2566("ܰ᩻") ^ i24;
                        i20 = ((iM2568 ^ i25) * 31329) ^ 558188475;
                        i21 = -1062532312;
                    } else {
                        iM2568 = (C0630.m2566("᩶ۖ") ^ i25) * 19;
                        i20 = ((iM2568 ^ i24) * (-19117)) ^ (-2012028640);
                        i21 = 1509433725;
                    }
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i48 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i48;
                    break;
                case -1629386727:
                case -844516520:
                    i29 = i29;
                    strM947 = strM947;
                    try {
                        m27955(c8918, c13800.m33113(c2139), strM38762);
                        Runtime.getRuntime().gc();
                        i28 = i35;
                        i29 = i29;
                        iM6981 = (C2105.m6981("ۢܰ") + i25) * 115;
                        i10 = ((iM6981 ^ i24) * (-12033)) ^ (-1369120021);
                        i11 = -139547806;
                        i27 = iM6981 ^ i11;
                        i26 = i10;
                        strM947 = strM947;
                    } catch (Throwable th3) {
                        th = th3;
                        i29 = i29;
                        i28 = i28;
                        i5 = i39;
                        i6 = i31;
                        int i49 = i37;
                        c13800 = c13800;
                        i2 = i49;
                        List list6 = list3;
                        i33 = i33;
                        list = list6;
                        th = th;
                        strM38762 = strM38762;
                        z2 = z2;
                        int iM6985 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM6985 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM6985 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i410 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i410;
                        C13800 c13804 = c13800;
                        i37 = i2;
                        c13800 = c13804;
                        int i411 = i33;
                        list3 = list;
                        i33 = i411;
                    }
                    break;
                case -1397518720:
                case -584152372:
                    i29 = i29;
                    strM947 = strM947;
                    try {
                        c12390.f37163 = z2 ? 1 : 0;
                        Runtime.getRuntime().gc();
                        iM2568 = (i25 - C2105.m6981("ۡ۫")) * 119;
                        i20 = ((iM2568 ^ i24) * 10895) ^ (-786365613);
                        i21 = 212273409;
                        i22 = iM2568 ^ i21;
                        strM947 = strM947;
                        int i412 = i29;
                        i27 = i22;
                        i26 = i20;
                        i29 = i412;
                    } catch (Throwable th4) {
                        th = th4;
                        i29 = i29;
                        i28 = i28;
                        i5 = i39;
                        i6 = i31;
                        int i413 = i37;
                        c13800 = c13800;
                        i2 = i413;
                        List list7 = list3;
                        i33 = i33;
                        list = list7;
                        th = th;
                        strM38762 = strM38762;
                        z2 = z2;
                        int iM6986 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM6986 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM6986 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i414 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i414;
                        C13800 c13805 = c13800;
                        i37 = i2;
                        c13800 = c13805;
                        int i415 = i33;
                        list3 = list;
                        i33 = i415;
                    }
                    break;
                case -1332212385:
                case 1171985773:
                    i2 = i37;
                    list = list3;
                    i39 = 40982;
                    int iM2569 = C0630.m2566("᩹֫") ^ i25;
                    i15 = ((iM2569 ^ i24) * 29613) ^ 650646923;
                    i17 = iM2569 ^ (-993052229);
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C13800 c13806 = c13800;
                    i37 = i2;
                    c13800 = c13806;
                    int i416 = i33;
                    list3 = list;
                    i33 = i416;
                    break;
                case -1317501893:
                case 104968976:
                    RunnableC3474.m10626(abstractC15440M6987);
                    return;
                case -1139597805:
                case 1887435183:
                    i35 = i28 + 1;
                    strM38762 = C16458.m38762(i35);
                    C0630.m2572(c2139, strM38762);
                    c2139.mo11538(z2 ? 1 : 0);
                    C13800[] c13800Arr2 = c12390.f37161;
                    c13800 = c13800Arr2[i28];
                    c13800Arr2[i28] = null;
                    itM3596 = C1047.m3596(c12390.f37164[i28]);
                    iM2568 = C0630.m2566("ۤ᩸") ^ i24;
                    i20 = ((iM2568 ^ i25) * (-3893)) ^ (-1975655705);
                    i21 = -858884435;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i417 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i417;
                    break;
                case -942270608:
                case 475862295:
                    int i50 = i36;
                    i2 = i37;
                    list = list3;
                    c12390.f37165[i50] = new C17738();
                    c12390.f37164[i50] = new ArrayList();
                    i18 = i50 + 1;
                    int iM6987 = C2105.m6981("᩷ۧ") ^ i24;
                    i15 = ((iM6987 ^ i25) * (-1731)) ^ 2004839340;
                    i39 = i39;
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i36 = i18;
                    i27 = iM6987 ^ (-1117552260);
                    i26 = i15;
                    i29 = i29;
                    C13800 c13807 = c13800;
                    i37 = i2;
                    c13800 = c13807;
                    int i418 = i33;
                    list3 = list;
                    i33 = i418;
                    break;
                case -859338090:
                case -698460422:
                    i29 = i29;
                    strM947 = strM947;
                    i32 = c12390.f37163;
                    iM2568 = (C2105.m6981("ۙܽ") + i25) * 87;
                    i20 = ((iM2568 ^ i24) * (-31999)) ^ (-1477115129);
                    i21 = -1184352581;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i419 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i419;
                    break;
                case -839409392:
                case -11334917:
                    i28 = i28;
                    int i51 = i37;
                    c13800 = c13800;
                    i2 = i51;
                    List list8 = list3;
                    i33 = i33;
                    list = list8;
                    abstractC15440M6987 = C2105.m6987(C16293.f50111);
                    int iM6988 = C2105.m6981("ܿܽ") ^ i25;
                    i3 = ((iM6988 ^ i24) * 1331) ^ (-2042002196);
                    i4 = iM6988 ^ (-2123630167);
                    i39 = i39;
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i38 = i38;
                    i32 = i32;
                    i36 = i36;
                    i29 = i29;
                    int i4110 = i28;
                    i27 = i4;
                    i26 = i3;
                    i28 = i4110;
                    C13800 c13808 = c13800;
                    i37 = i2;
                    c13800 = c13808;
                    int i4111 = i33;
                    list3 = list;
                    i33 = i4111;
                    break;
                case -797616051:
                case 721011444:
                    i30++;
                    i12 = 1;
                    i13 = i29;
                    i2 = i37;
                    list = list3;
                    int iM25610 = C0630.m2566("᩹ۡ") ^ i25;
                    i39 = i39;
                    i31 = i31;
                    strM947 = strM947;
                    i29 = i13;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i12;
                    i26 = ((iM25610 ^ i24) * (-30281)) ^ (-145605822);
                    i28 = i28;
                    i27 = iM25610 ^ (-944805179);
                    strM38762 = strM38762;
                    C13800 c13809 = c13800;
                    i37 = i2;
                    c13800 = c13809;
                    int i4112 = i33;
                    list3 = list;
                    i33 = i4112;
                    break;
                case -641780465:
                case 610274875:
                    i33 = 0;
                    iM2568 = (C0630.m2566("᩺۫") + i25) * 57;
                    i20 = ((iM2568 ^ i24) * 29919) ^ 976946090;
                    i21 = 47013213;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i4113 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4113;
                    break;
                case -563083761:
                case 1482324523:
                    strM947 = strM947;
                    try {
                        int i52 = i38;
                        strM38762 = strM38762;
                        try {
                            Object[] objArr = new Object[i52];
                            objArr[z2 ? 1 : 0] = C3746.m11363(c3545);
                            try {
                                i28 = i28;
                                i29 = i29;
                                try {
                                    try {
                                        C0630.m2572(c2139, C3245.m9924(C2105.m6981(C5695.m16034(f33862, 69, 3, i39)) ^ 2120348022, objArr));
                                        C3545 c3546 = c3545;
                                        i38 = i52;
                                        InterfaceC2271[] interfaceC2271Arr = interfaceC2271ArrM7812;
                                        i30 = i30;
                                        i32 = i32;
                                        i5 = i39;
                                        int i53 = i37;
                                        c13800 = c13800;
                                        i2 = i53;
                                        C12390 c12391 = c12390;
                                        List list9 = list3;
                                        i33 = i33;
                                        list = list9;
                                        abstractC15440M6987 = abstractC15440M6987;
                                        HashSet hashSet2 = hashSet;
                                        i36 = i36;
                                        i6 = i31;
                                        C17032 c17033 = c17032;
                                        z2 = z2 ? 1 : 0;
                                        try {
                                            C6040.m16877(new C6040(c18090, c3546, interfaceC2271Arr, i30, c12391, c2139, hashSet2, c17033, boolArr));
                                            zM7150 = C2167.m7150(c2139);
                                            iM2567 = (i24 - C0630.m2566("᩺᩺")) * 49;
                                            i7 = ((iM2567 ^ i25) * 6389) ^ 59208449;
                                            i9 = 143618697;
                                            i19 = iM2567 ^ i9;
                                            i39 = i5;
                                            i31 = i6;
                                            strM947 = strM947;
                                            i28 = i28;
                                            i29 = i29;
                                            i30 = i30;
                                            i32 = i32;
                                            abstractC15440M6987 = abstractC15440M6987;
                                            i36 = i36;
                                            z2 = z2;
                                            i27 = i19;
                                            i26 = i7;
                                            strM38762 = strM38762;
                                            i38 = i38;
                                            C13800 c138010 = c13800;
                                            i37 = i2;
                                            c13800 = c138010;
                                            int i4114 = i33;
                                            list3 = list;
                                            i33 = i4114;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            i30 = i30;
                                            z2 = z2;
                                            int iM6989 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                                            i3 = ((iM6989 ^ i25) * 11671) ^ 1647827904;
                                            i4 = iM6989 ^ 1881445579;
                                            i39 = i5;
                                            i31 = i6;
                                            strM38762 = strM38762;
                                            strM947 = strM947;
                                            i29 = i29;
                                            i38 = i38;
                                            i32 = i32;
                                            abstractC15440M6987 = abstractC15440M6987;
                                            i36 = i36;
                                            int i4115 = i28;
                                            i27 = i4;
                                            i26 = i3;
                                            i28 = i4115;
                                            C13800 c138011 = c13800;
                                            i37 = i2;
                                            c13800 = c138011;
                                            int i4116 = i33;
                                            list3 = list;
                                            i33 = i4116;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i38 = i52;
                                        i5 = i39;
                                        i6 = i31;
                                        int i54 = i37;
                                        c13800 = c13800;
                                        i2 = i54;
                                        List list10 = list3;
                                        i33 = i33;
                                        list2 = list10;
                                        listM42190 = list2;
                                        th = th;
                                        list = listM42190;
                                        int iM69810 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                                        i3 = ((iM69810 ^ i25) * 11671) ^ 1647827904;
                                        i4 = iM69810 ^ 1881445579;
                                        i39 = i5;
                                        i31 = i6;
                                        strM38762 = strM38762;
                                        strM947 = strM947;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC15440M6987 = abstractC15440M6987;
                                        i36 = i36;
                                        int i4117 = i28;
                                        i27 = i4;
                                        i26 = i3;
                                        i28 = i4117;
                                        C13800 c138012 = c13800;
                                        i37 = i2;
                                        c13800 = c138012;
                                        int i4118 = i33;
                                        list3 = list;
                                        i33 = i4118;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    i38 = i52;
                                    int i55 = i30;
                                    abstractC15440M6987 = abstractC15440M6987;
                                    z = z2 ? 1 : 0;
                                    i32 = i32;
                                    i36 = i36;
                                    i5 = i39;
                                    i6 = i31;
                                    int i56 = i37;
                                    c13800 = c13800;
                                    i2 = i56;
                                    List list11 = list3;
                                    i33 = i33;
                                    listM42190 = list11;
                                    i30 = i55;
                                    z2 = z;
                                    th = th;
                                    list = listM42190;
                                    int iM69811 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                                    i3 = ((iM69811 ^ i25) * 11671) ^ 1647827904;
                                    i4 = iM69811 ^ 1881445579;
                                    i39 = i5;
                                    i31 = i6;
                                    strM38762 = strM38762;
                                    strM947 = strM947;
                                    i29 = i29;
                                    i38 = i38;
                                    i32 = i32;
                                    abstractC15440M6987 = abstractC15440M6987;
                                    i36 = i36;
                                    int i4119 = i28;
                                    i27 = i4;
                                    i26 = i3;
                                    i28 = i4119;
                                    C13800 c138013 = c13800;
                                    i37 = i2;
                                    c13800 = c138013;
                                    int i41110 = i33;
                                    list3 = list;
                                    i33 = i41110;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                i28 = i28;
                                i29 = i29;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i28 = i28;
                            i29 = i29;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        i28 = i28;
                        i29 = i29;
                        i38 = i38;
                        strM38762 = strM38762;
                    }
                    break;
                case -501128784:
                case 2021530758:
                    strM947 = strM947;
                    i28 = 0;
                    iM6981 = (C2105.m6981("ۢܰ") + i25) * 115;
                    i10 = ((iM6981 ^ i24) * (-12033)) ^ (-1369120021);
                    i11 = -139547806;
                    i27 = iM6981 ^ i11;
                    i26 = i10;
                    strM947 = strM947;
                    break;
                case -465285364:
                case 1727979071:
                    i29 = i29;
                    strM947 = strM947;
                    if (i32 > 5242880) {
                        iM2568 = (C0630.m2566("۠ۢ") + i25) * 35;
                        i20 = ((iM2568 ^ i24) * 17191) ^ 82355589;
                        i21 = -2110567972;
                    } else {
                        iM2568 = (i25 - C2105.m6981("ۡ۫")) * 119;
                        i20 = ((iM2568 ^ i24) * 10895) ^ (-786365613);
                        i21 = 212273409;
                    }
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i41111 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41111;
                    break;
                case -356585159:
                case 568686878:
                    i29 = i29;
                    strM947 = strM947;
                    if (zM10754) {
                        iM2568 = C0630.m2566("᩻ۖ") ^ i25;
                        i20 = ((iM2568 ^ i24) * (-4245)) ^ 389426906;
                        i21 = -1704275584;
                    } else {
                        iM2568 = (i24 - C2105.m6981("۫ܿ")) * (-83);
                        i20 = ((iM2568 ^ i25) * (-17917)) ^ 1242231346;
                        i21 = 297040987;
                    }
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i41112 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41112;
                    break;
                case -339069521:
                case -58369259:
                    i28 = i28;
                    i29 = i29;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i14 = i39;
                    i31 = i31;
                    int i57 = i37;
                    c13800 = c13800;
                    i2 = i57;
                    List list12 = list3;
                    i33 = i33;
                    list = list12;
                    if (i36 < i) {
                        iM6982 = (C0630.m2566("ۢۨ") ^ i24) * 45;
                        i15 = ((iM6982 ^ i25) * (-7197)) ^ (-1461001773);
                        i16 = 665693366;
                    } else {
                        iM6982 = (C2105.m6981("ᩳۧ") + i25) * 15;
                        i15 = ((iM6982 ^ i24) * 23589) ^ 1762239591;
                        i16 = -1451101980;
                    }
                    i17 = iM6982 ^ i16;
                    i39 = i14;
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C13800 c138014 = c13800;
                    i37 = i2;
                    c13800 = c138014;
                    int i41113 = i33;
                    list3 = list;
                    i33 = i41113;
                    break;
                case -222686591:
                case 1275602812:
                    i29 = i29;
                    strM947 = strM947;
                    if (zM2123) {
                        iM2568 = C2105.m6981("۟֨") ^ i25;
                        i20 = ((iM2568 ^ i24) * 9573) ^ (-609051709);
                        i21 = -1667571660;
                    } else {
                        iM2568 = (i24 - C2105.m6981("ۙ۟")) * 75;
                        i20 = ((iM2568 ^ i25) * 25045) ^ 385135627;
                        i21 = -44671194;
                    }
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i41114 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41114;
                    break;
                case -153227295:
                case -42311786:
                    i29 = i29;
                    strM947 = strM947;
                    C13800[] c13800Arr3 = c12390.f37161;
                    try {
                        List[] listArr2 = c12390.f37164;
                        int iM69812 = C2105.m6981("ۧۧ") ^ i24;
                        i26 = ((iM69812 ^ i25) * (-14649)) ^ 1514844102;
                        listArr = listArr2;
                        strM947 = strM947;
                        c13800Arr = c13800Arr3;
                        i29 = i29;
                        i27 = iM69812 ^ 1925864792;
                    } catch (Throwable th11) {
                        th = th11;
                        c13800Arr = c13800Arr3;
                        i29 = i29;
                        i5 = i39;
                        i6 = i31;
                        int i58 = i37;
                        c13800 = c13800;
                        i2 = i58;
                        List list13 = list3;
                        i33 = i33;
                        list = list13;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM69813 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM69813 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM69813 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i41115 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i41115;
                        C13800 c138015 = c13800;
                        i37 = i2;
                        c13800 = c138015;
                        int i41116 = i33;
                        list3 = list;
                        i33 = i41116;
                    }
                    break;
                case -145807944:
                case 1388347504:
                    try {
                        StringBuilder sb = new StringBuilder();
                        try {
                            strM947 = strM947;
                            i29 = i29;
                            try {
                                C1420.m4905(sb, C3663.m11162(f33862, 72, 1, i39));
                                C0050.m945(sb, i33);
                                C3245.m9923(sb, C4075.m12252(f33862, 73, 4, i39));
                                strM947 = C0050.m947(sb);
                                int iM25611 = C0630.m2566("۟۫") ^ i24;
                                i20 = ((iM25611 ^ i25) * 4395) ^ (-307676640);
                                i22 = iM25611 ^ 260328774;
                                int i41117 = i29;
                                i27 = i22;
                                i26 = i20;
                                i29 = i41117;
                            } catch (Throwable th12) {
                                th = th12;
                                i29 = i29;
                                i5 = i39;
                                i6 = i31;
                                int i59 = i37;
                                c13800 = c13800;
                                i2 = i59;
                                List list14 = list3;
                                i33 = i33;
                                list = list14;
                                th = th;
                                i30 = i30;
                                z2 = z2;
                                int iM69814 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                                i3 = ((iM69814 ^ i25) * 11671) ^ 1647827904;
                                i4 = iM69814 ^ 1881445579;
                                i39 = i5;
                                i31 = i6;
                                strM38762 = strM38762;
                                strM947 = strM947;
                                i29 = i29;
                                i38 = i38;
                                i32 = i32;
                                abstractC15440M6987 = abstractC15440M6987;
                                i36 = i36;
                                int i41118 = i28;
                                i27 = i4;
                                i26 = i3;
                                i28 = i41118;
                                C13800 c138016 = c13800;
                                i37 = i2;
                                c13800 = c138016;
                                int i41119 = i33;
                                list3 = list;
                                i33 = i41119;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            i29 = i29;
                            strM947 = strM947;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        i29 = i29;
                        strM947 = strM947;
                        i5 = i39;
                        i6 = i31;
                        int i510 = i37;
                        c13800 = c13800;
                        i2 = i510;
                        List list15 = list3;
                        i33 = i33;
                        list = list15;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM69815 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM69815 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM69815 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i411110 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i411110;
                        C13800 c138017 = c13800;
                        i37 = i2;
                        c13800 = c138017;
                        int i411111 = i33;
                        list3 = list;
                        i33 = i411111;
                    }
                    break;
                case -118194475:
                case 52926261:
                    i29 = i29;
                    strM947 = strM947;
                    if (i33 < i31) {
                        iM2568 = C2105.m6981("֨ᩴ") ^ i25;
                        i20 = ((iM2568 ^ i24) * 25731) ^ (-1055654813);
                        i21 = -1094011076;
                    } else {
                        iM2568 = C0630.m2566("ۚ᩹") ^ i25;
                        i20 = ((iM2568 ^ i24) * (-16837)) ^ (-1568562761);
                        i21 = 1398898190;
                    }
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i411112 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411112;
                    break;
                case -88658495:
                case 1795040228:
                    RunnableC3474.m10626(abstractC15440M6987);
                    return;
                case -35571722:
                case 440755635:
                    strM947 = strM947;
                    try {
                        i29 = c12390.f37160;
                        iM6981 = C2105.m6981("ܳۗ") ^ i24;
                        i10 = ((iM6981 ^ i25) * (-9203)) ^ (-1623814137);
                        i11 = 1302770789;
                        i27 = iM6981 ^ i11;
                        i26 = i10;
                        strM947 = strM947;
                    } catch (Throwable th15) {
                        th = th15;
                        i5 = i39;
                        i6 = i31;
                        int i4120 = i37;
                        c13800 = c13800;
                        i2 = i4120;
                        List list16 = list3;
                        i33 = i33;
                        list = list16;
                        th = th;
                        strM38762 = strM38762;
                        z2 = z2;
                        int iM69816 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM69816 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM69816 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i411113 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i411113;
                        C13800 c138018 = c13800;
                        i37 = i2;
                        c13800 = c138018;
                        int i411114 = i33;
                        list3 = list;
                        i33 = i411114;
                    }
                    break;
                case 21451322:
                case 87769806:
                    AbstractC2021.m6569(abstractC15440M6987);
                    throw th;
                case 240577981:
                case 857156939:
                    i28 = i28;
                    i29 = i29;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    z = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i5 = i39;
                    i6 = i31;
                    int i60 = i37;
                    c13800 = c13800;
                    i2 = i60;
                    List list17 = list3;
                    i33 = i33;
                    list = list17;
                    try {
                        C3545 c3547 = (C3545) C22628.m50605(list, i30);
                        try {
                            zM2807 = C0714.m2807(c2139);
                            int iM69817 = C2105.m6981("ܶۜ") ^ i25;
                            i3 = ((iM69817 ^ i24) * (-20055)) ^ (-131104717);
                            i4 = iM69817 ^ (-1961826161);
                            c3545 = c3547;
                            i39 = i5;
                            i31 = i6;
                            strM38762 = strM38762;
                            strM947 = strM947;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC15440M6987 = abstractC15440M6987;
                            i36 = i36;
                            z2 = z ? 1 : 0;
                        } catch (Throwable th16) {
                            th = th16;
                            c3545 = c3547;
                            listM42190 = list;
                            z2 = z ? 1 : 0;
                            th = th;
                            list = listM42190;
                            int iM69818 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                            i3 = ((iM69818 ^ i25) * 11671) ^ 1647827904;
                            i4 = iM69818 ^ 1881445579;
                            i39 = i5;
                            i31 = i6;
                            strM38762 = strM38762;
                            strM947 = strM947;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC15440M6987 = abstractC15440M6987;
                            i36 = i36;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        listM42190 = list;
                        z2 = z;
                        th = th;
                        list = listM42190;
                        int iM69819 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM69819 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM69819 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i411115 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i411115;
                        C13800 c138019 = c13800;
                        i37 = i2;
                        c13800 = c138019;
                        int i411116 = i33;
                        list3 = list;
                        i33 = i411116;
                        break;
                    }
                    int i411117 = i28;
                    i27 = i4;
                    i26 = i3;
                    i28 = i411117;
                    C13800 c1380110 = c13800;
                    i37 = i2;
                    c13800 = c1380110;
                    int i411118 = i33;
                    list3 = list;
                    i33 = i411118;
                    break;
                case 254018666:
                case 966558278:
                    i28 = i28;
                    i29 = i29;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    Object[] objArr2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i5 = i39;
                    i6 = i31;
                    int i61 = i37;
                    c13800 = c13800;
                    i2 = i61;
                    List list18 = list3;
                    i33 = i33;
                    list2 = list18;
                    try {
                        C1711.m5735(abstractC15440M6987);
                        try {
                            listM42190 = c18090.m42190(z2);
                            try {
                                interfaceC2271ArrM7812 = C2405.m7812(c18090, listM42190);
                                try {
                                    Boolean[] boolArr2 = new Boolean[1];
                                    try {
                                        boolArr2[z2 ? 1 : 0] = bool;
                                        int iM7032 = C2126.m7032(listM42190);
                                        int iM25612 = (i24 - C0630.m2566("ܽۨ")) * (-37);
                                        boolArr = boolArr2;
                                        i31 = i6;
                                        i33 = i33;
                                        c13800 = c13800;
                                        strM38762 = strM38762;
                                        i29 = i29;
                                        i38 = i38;
                                        abstractC15440M6987 = abstractC15440M6987;
                                        i36 = i36;
                                        i34 = 1;
                                        i37 = iM7032;
                                        list3 = listM42190;
                                        i26 = ((iM25612 ^ i25) * (-22859)) ^ (-649183343);
                                        strM947 = strM947;
                                        i28 = i28;
                                        i27 = iM25612 ^ (-1327960614);
                                        i39 = i5;
                                        i32 = i32;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        boolArr = boolArr2;
                                        i34 = 1;
                                        th = th;
                                        list = listM42190;
                                        int iM698110 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                                        i3 = ((iM698110 ^ i25) * 11671) ^ 1647827904;
                                        i4 = iM698110 ^ 1881445579;
                                        i39 = i5;
                                        i31 = i6;
                                        strM38762 = strM38762;
                                        strM947 = strM947;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC15440M6987 = abstractC15440M6987;
                                        i36 = i36;
                                        int i411119 = i28;
                                        i27 = i4;
                                        i26 = i3;
                                        i28 = i411119;
                                        C13800 c1380111 = c13800;
                                        i37 = i2;
                                        c13800 = c1380111;
                                        int i4111110 = i33;
                                        list3 = list;
                                        i33 = i4111110;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                listM42190 = listM42190;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            listM42190 = list2;
                            th = th;
                            list = listM42190;
                            int iM698111 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                            i3 = ((iM698111 ^ i25) * 11671) ^ 1647827904;
                            i4 = iM698111 ^ 1881445579;
                            i39 = i5;
                            i31 = i6;
                            strM38762 = strM38762;
                            strM947 = strM947;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC15440M6987 = abstractC15440M6987;
                            i36 = i36;
                            int i4111111 = i28;
                            i27 = i4;
                            i26 = i3;
                            i28 = i4111111;
                            C13800 c1380112 = c13800;
                            i37 = i2;
                            c13800 = c1380112;
                            int i4111112 = i33;
                            list3 = list;
                            i33 = i4111112;
                            break;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        z2 = objArr2 == true ? 1 : 0;
                    }
                    break;
                case 315957376:
                case 2139916528:
                    c13800.f41126.addAll(C3432.m10491(C0237.m1494(ViewOnClickListenerC1958.m6430((AbstractC15440) C2272.m7513(itM3596)))));
                    iM2568 = C0630.m2566("ۤ᩸") ^ i24;
                    i20 = ((iM2568 ^ i25) * (-3893)) ^ (-1975655705);
                    i21 = -858884435;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i4111113 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4111113;
                    break;
                case 338096166:
                case 1439337099:
                    i33++;
                    iM2568 = (C0630.m2566("᩺۫") + i25) * 57;
                    i20 = ((iM2568 ^ i24) * 29919) ^ 976946090;
                    i21 = 47013213;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i4111114 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4111114;
                    break;
                case 453828066:
                case 996113207:
                    strM947 = strM947;
                    if (i28 < i29) {
                        iM6981 = (i24 - C2105.m6981("᩶ܿ")) * 51;
                        i10 = ((iM6981 ^ i25) * 24243) ^ (-54064587);
                        i11 = -12147491;
                    } else {
                        iM6981 = (i25 - C0630.m2566("۠ۙ")) * (-113);
                        i10 = ((iM6981 ^ i24) * (-4185)) ^ 1893125532;
                        i11 = 1166586360;
                    }
                    i27 = iM6981 ^ i11;
                    i26 = i10;
                    strM947 = strM947;
                    break;
                case 473865263:
                case 1496193321:
                    try {
                        AbstractC15440 abstractC15440M36535 = abstractC15440M6987.m36535(strM947);
                        c13800Arr[i33].m33112().m48535(abstractC15440M36535);
                        C2167.m7153(listArr[i33], abstractC15440M36535);
                        c13800Arr[i33] = new C13800(c12390.f37162);
                        i29 = i29;
                        strM947 = strM947;
                        iM2568 = C0630.m2566("᩻ۖ") ^ i25;
                        i20 = ((iM2568 ^ i24) * (-4245)) ^ 389426906;
                        i21 = -1704275584;
                        i22 = iM2568 ^ i21;
                        strM947 = strM947;
                        int i4111115 = i29;
                        i27 = i22;
                        i26 = i20;
                        i29 = i4111115;
                    } catch (Throwable th23) {
                        th = th23;
                        strM947 = strM947;
                        i5 = i39;
                        i6 = i31;
                        int i4121 = i37;
                        c13800 = c13800;
                        i2 = i4121;
                        List list19 = list3;
                        i33 = i33;
                        list = list19;
                        th = th;
                        strM38762 = strM38762;
                        z2 = z2;
                        int iM698112 = (C2105.m6981("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM698112 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM698112 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM38762 = strM38762;
                        strM947 = strM947;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC15440M6987 = abstractC15440M6987;
                        i36 = i36;
                        int i4111116 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i4111116;
                        C13800 c1380113 = c13800;
                        i37 = i2;
                        c13800 = c1380113;
                        int i4111117 = i33;
                        list3 = list;
                        i33 = i4111117;
                    }
                    break;
                case 670468497:
                case 1300583059:
                    i28 = i28;
                    i29 = i29;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i14 = i39;
                    i31 = i31;
                    int i62 = i37;
                    c13800 = c13800;
                    i2 = i62;
                    List list20 = list3;
                    i33 = i33;
                    list = list20;
                    short s = f33862[65];
                    int i63 = (s * s) + 62884900;
                    int i64 = s + 7930;
                    if ((i63 + i63) - (i64 * i64) < 0) {
                        iM6982 = C2105.m6981("ۙۖ") ^ i24;
                        i15 = ((iM6982 ^ i25) * (-13963)) ^ 699245805;
                        i16 = -432907839;
                    } else {
                        iM6982 = (i25 - C2105.m6981("ܿܰ")) * 93;
                        i15 = ((iM6982 ^ i24) * (-25049)) ^ 1791832882;
                        i16 = -235211174;
                    }
                    i17 = iM6982 ^ i16;
                    i39 = i14;
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C13800 c1380114 = c13800;
                    i37 = i2;
                    c13800 = c1380114;
                    int i411120 = i33;
                    list3 = list;
                    i33 = i411120;
                    break;
                case 814048493:
                case 1694031224:
                    i29 = i29;
                    strM947 = strM947;
                    zM10754 = C3537.m10754(c13800Arr[i33].f41126);
                    iM2568 = C2105.m6981("֨֫") ^ i24;
                    i20 = ((iM2568 ^ i25) * (-8859)) ^ (-173281578);
                    i21 = 2001683358;
                    i22 = iM2568 ^ i21;
                    strM947 = strM947;
                    int i4111118 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4111118;
                    break;
                case 1133687750:
                case 1628662861:
                    i2 = i37;
                    list = list3;
                    i39 = 42933;
                    int iM25613 = C0630.m2566("᩹֫") ^ i25;
                    i15 = ((iM25613 ^ i24) * 29613) ^ 650646923;
                    i17 = iM25613 ^ (-993052229);
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C13800 c1380115 = c13800;
                    i37 = i2;
                    c13800 = c1380115;
                    int i411121 = i33;
                    list3 = list;
                    i33 = i411121;
                    break;
                case 1239632720:
                case 1867204520:
                    i28 = i28;
                    i29 = i29;
                    strM947 = strM947;
                    abstractC15440M6987 = abstractC15440M6987;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM38762 = strM38762;
                    i5 = i39;
                    i6 = i31;
                    int i65 = i37;
                    c13800 = c13800;
                    i2 = i65;
                    List list21 = list3;
                    i33 = i33;
                    list = list21;
                    if (i30 < i2) {
                        iM2566 = (C2105.m6981("ᩳ۫") ^ i25) * (-49);
                        i7 = ((iM2566 ^ i24) * (-8697)) ^ (-1643370354);
                        i8 = -851748874;
                    } else {
                        iM2566 = (C2105.m6981("ۜۡ") + i24) * (-41);
                        i7 = ((iM2566 ^ i25) * (-13323)) ^ (-1916331465);
                        i8 = -1874675952;
                    }
                    i19 = iM2566 ^ i8;
                    i39 = i5;
                    i31 = i6;
                    strM947 = strM947;
                    i28 = i28;
                    i29 = i29;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i36 = i36;
                    z2 = z2;
                    i27 = i19;
                    i26 = i7;
                    strM38762 = strM38762;
                    i38 = i38;
                    C13800 c1380116 = c13800;
                    i37 = i2;
                    c13800 = c1380116;
                    int i411122 = i33;
                    list3 = list;
                    i33 = i411122;
                    break;
                case 1250105844:
                case 1486257315:
                    i2 = i37;
                    list = list3;
                    HashSet hashSet3 = new HashSet();
                    C17032 c17034 = new C17032();
                    C12390 c12392 = new C12390();
                    c12392.f37162 = null;
                    c12392.f37163 = 0;
                    c12392.f37160 = i;
                    c12392.f37161 = new C13800[i];
                    c12392.f37164 = new List[i];
                    c12392.f37165 = new C17738[i];
                    hashSet = hashSet3;
                    c17032 = c17034;
                    c12390 = c12392;
                    bool = null;
                    i18 = 0;
                    z2 = false;
                    int iM69820 = C2105.m6981("᩷ۧ") ^ i24;
                    i15 = ((iM69820 ^ i25) * (-1731)) ^ 2004839340;
                    i39 = i39;
                    i31 = i31;
                    strM38762 = strM38762;
                    strM947 = strM947;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i36 = i18;
                    i27 = iM69820 ^ (-1117552260);
                    i26 = i15;
                    i29 = i29;
                    C13800 c1380117 = c13800;
                    i37 = i2;
                    c13800 = c1380117;
                    int i411123 = i33;
                    list3 = list;
                    i33 = i411123;
                    break;
                default:
                    i13 = i29;
                    i2 = i37;
                    list = list3;
                    i12 = i34;
                    i30 = 0;
                    int iM25614 = C0630.m2566("᩹ۡ") ^ i25;
                    i39 = i39;
                    i31 = i31;
                    strM947 = strM947;
                    i29 = i13;
                    i32 = i32;
                    abstractC15440M6987 = abstractC15440M6987;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i12;
                    i26 = ((iM25614 ^ i24) * (-30281)) ^ (-145605822);
                    i28 = i28;
                    i27 = iM25614 ^ (-944805179);
                    strM38762 = strM38762;
                    C13800 c1380118 = c13800;
                    i37 = i2;
                    c13800 = c1380118;
                    int i4111119 = i33;
                    list3 = list;
                    i33 = i4111119;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x037e A[PHI: r8 r10
      0x037e: PHI (r8v7 int) = (r8v4 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:103:0x037e, B:102:0x037e, B:84:0x037c, B:11:0x0063, B:7:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x037e: PHI (r10v6 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:103:0x037e, B:102:0x037e, B:84:0x037c, B:11:0x0063, B:7:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x03ac A[PHI: r6 r7
      0x03ac: PHI (r6v6 int) = (r6v4 int), (r6v2 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:105:0x03ac, B:104:0x03ac, B:101:0x03ac, B:88:0x03aa, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r7v6 int) = (r7v2 int), (r7v4 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:105:0x03ac, B:104:0x03ac, B:101:0x03ac, B:88:0x03aa, B:11:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0057, code lost:
    
        if (l.C1005.f3721 != false) goto L85;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int iM2566;
        int i2;
        int i3;
        int iM6981;
        int i4;
        short[] sArr;
        char c;
        C11312 c11312 = this;
        int i5 = 260863092;
        int i6 = C22628.f73083;
        int i7 = C0422.f1886;
        int iM2567 = (i7 - C0630.m2566("ۚܺ")) * 93;
        int i8 = ((iM2567 ^ i6) * (-25199)) ^ 1041412768;
        int i9 = iM2567 ^ (-1813686533);
        EditText editText = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        char c2 = 0;
        int iM6982 = 0;
        int iM6983 = 0;
        int iM2568 = 0;
        int iM2569 = 0;
        short s = 0;
        int i10 = 0;
        TextView textView = null;
        short[] sArr4 = null;
        TextView textView2 = null;
        int i11 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i6) * 2957) >> 31));
            switch (i5) {
                case -2035039784:
                case -1631397690:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("᩹᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                    } else {
                        iM6981 = C2105.m6981("ۖۚ") ^ i7;
                        i8 = ((iM6981 ^ i6) * (-6951)) ^ (-547963555);
                        i4 = -74974650;
                    }
                    i9 = iM6981 ^ i4;
                    c11312 = this;
                    break;
                case -1741260189:
                case -151837393:
                    c11312.f33868 = i;
                    textView2 = c11312.f33867;
                    textView = c11312.f33865;
                    editText = c11312.f33864;
                    if (i == 0) {
                        iM2566 = (i7 - C0630.m2566("۫ۚ")) * 85;
                        i2 = ((iM2566 ^ i6) * (-11181)) ^ 836480402;
                        i3 = 1636382506;
                    } else {
                        iM2566 = C0630.m2566("ۢ֡") ^ i7;
                        i2 = ((iM2566 ^ i6) * 14677) ^ (-69006737);
                        i3 = -328244527;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -1738195249:
                case 2025631912:
                    C2272.m7503();
                    break;
                case -1705696604:
                case -1570372616:
                    C3663.m11168();
                    iM2566 = (C2105.m6981("ܶۡ") ^ i6) * (-71);
                    i2 = ((iM2566 ^ i7) * (-6383)) ^ 1620501182;
                    i3 = 1970277088;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -1565695629:
                case -298755022:
                    iM6983 = C2105.m6981(C1047.m3603(sArr4, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i11));
                    if (!RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("᩹᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                        i9 = iM6981 ^ i4;
                        c11312 = this;
                    } else {
                        iM2566 = C2105.m6981("᩹ۚ") ^ i6;
                        i2 = ((iM2566 ^ i7) * 28261) ^ 954686990;
                        i3 = -1612141266;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -1442279348:
                case 658024781:
                    C0630.m2570(textView2, 2125735616 ^ iM6983);
                    if (RunnableC1937.m6384(editText) > 0) {
                        iM2566 = C2105.m6981("᩻ᩴ") ^ i7;
                        i2 = ((iM2566 ^ i6) * 25717) ^ 1511602726;
                        i3 = -1464397735;
                    } else {
                        iM2566 = (C2105.m6981("᩻ۧ") + i7) * 65;
                        i2 = ((iM2566 ^ i6) * (-13709)) ^ (-842571718);
                        i3 = -1768918717;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -1424954560:
                case 110900891:
                    i11 = 18521;
                    iM2566 = C2105.m6981("ۘܽ") ^ i6;
                    i2 = ((iM2566 ^ i7) * (-29967)) ^ (-1621321981);
                    i3 = -120182552;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -1335944191:
                case 209376592:
                    f33863 = C0422.m1959(C4117.m12350(editText));
                    iM2566 = (C2105.m6981("᩻ۧ") + i7) * 65;
                    i2 = ((iM2566 ^ i6) * (-13709)) ^ (-842571718);
                    i3 = -1768918717;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -1242615283:
                case 311188441:
                    C0630.m2570(textView2, 2098554468 ^ iM2569);
                    if (C1047.m3600(editText) > 0) {
                        iM2566 = C2105.m6981("֡᩻") ^ i7;
                        i2 = ((iM2566 ^ i6) * (-25131)) ^ 280753272;
                        i3 = -734850529;
                    } else {
                        iM2566 = C2105.m6981("ܰۙ") ^ i6;
                        i2 = ((iM2566 ^ i7) * 23589) ^ 1323591859;
                        i3 = -94734011;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -1214059389:
                case 1520444680:
                    C0382.m1848();
                    break;
                case -919789717:
                case 1583803890:
                    i11 = 51918;
                    iM2566 = C2105.m6981("ۘܽ") ^ i6;
                    i2 = ((iM2566 ^ i7) * (-29967)) ^ (-1621321981);
                    i3 = -120182552;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -858220060:
                case -168922780:
                    f33861 = C0050.m947(C2958.m9028(editText));
                    iM2566 = C2105.m6981("ܰۙ") ^ i6;
                    i2 = ((iM2566 ^ i7) * 23589) ^ 1323591859;
                    i3 = -94734011;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -852101778:
                case 1046634874:
                    if (c11312.f33868 == i) {
                        iM2566 = (i6 - C2105.m6981("ᩳۢ")) * (-37);
                        i2 = ((iM2566 ^ i7) * (-1417)) ^ (-1169080951);
                        i3 = 2140199113;
                    } else {
                        iM2566 = (C0630.m2566("ᩳۚ") ^ i7) * (-25);
                        i2 = ((iM2566 ^ i6) * 13023) ^ (-964191269);
                        i3 = 159015369;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -809919985:
                case 445115499:
                    RunnableC1937.m6377(editText, f33863);
                    iM2566 = (i6 - C2105.m6981("ۧ۠")) * (-65);
                    i2 = ((iM2566 ^ i7) * 3561) ^ (-21134445);
                    i3 = 262470853;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -802309919:
                case -192611537:
                    iM6982 = C2105.m6981(C4075.m12252(f33862, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i11));
                    if (C4075.f12947 < 0) {
                        iM2566 = (C2105.m6981("᩵ۚ") + i7) * 91;
                        i2 = ((iM2566 ^ i6) * 16945) ^ (-1696006716);
                        i3 = 16665513;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        iM6981 = C2105.m6981("᩹᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                        i9 = iM6981 ^ i4;
                        c11312 = this;
                    }
                    break;
                case -600275061:
                case 408021694:
                    C0630.m2570(textView, 2099588898 ^ iM6982);
                    sArr4 = f33862;
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("᩶֡") ^ i6;
                        i2 = ((iM2566 ^ i7) * (-8313)) ^ (-1424755148);
                        i3 = -2109549685;
                    } else {
                        iM2566 = (i6 - C0630.m2566("᩹ۛ")) * (-3);
                        i2 = ((iM2566 ^ i7) * (-11201)) ^ 511849829;
                        i3 = -1336819217;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case -479435901:
                case 115106280:
                    if (RunnableC1108.f4040) {
                        iM6981 = C0630.m2566("ۢۡ") ^ i6;
                        i8 = ((iM6981 ^ i7) * 22289) ^ (-1906034868);
                        i4 = 1649150919;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۘ") + i7) * (-75);
                        i8 = ((iM6981 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                    }
                    i9 = iM6981 ^ i4;
                    c11312 = this;
                    break;
                case -476498626:
                case 633069732:
                    if (C7106.f21815 == 0) {
                        iM6981 = C2105.m6981("᩹᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                        i9 = iM6981 ^ i4;
                        c11312 = this;
                    } else {
                        iM2566 = (C2105.m6981("ܶۡ") ^ i6) * (-71);
                        i2 = ((iM2566 ^ i7) * (-6383)) ^ 1620501182;
                        i3 = 1970277088;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -338873319:
                case 609940272:
                    iM2568 = C0630.m2566(C1773.m5917(f33862, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i11));
                    if (C1128.m3851() > 0) {
                        iM2566 = (i6 - C2105.m6981("۬᩹")) * (-37);
                        i2 = ((iM2566 ^ i7) * (-29309)) ^ (-1639653743);
                        i3 = 838468996;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۘ") + i7) * (-75);
                        i8 = ((iM6981 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                        i9 = iM6981 ^ i4;
                        c11312 = this;
                    }
                    break;
                case -104369813:
                case 208360357:
                    s = sArr2[c2];
                    i10 = (s * s) + 34480384;
                    if (C11340.f33930 < 0) {
                        iM2566 = (C0630.m2566("ۖ᩶") ^ i7) * 53;
                        i2 = ((iM2566 ^ i6) * 5081) ^ (-1270833210);
                        i3 = 1635088913;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        sArr = sArr2;
                        c = c2;
                        int iM6984 = (i6 - C2105.m6981("᩸֫")) * 7;
                        int i12 = ((iM6984 ^ i7) * (-5359)) ^ (-241276759);
                        i9 = iM6984 ^ (-2049534458);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i12;
                        c11312 = this;
                    }
                    break;
                case -53997866:
                case 1528632734:
                    if (C3746.f11829 > 0) {
                        iM6981 = C2105.m6981("᩹᩻") ^ i7;
                        i8 = ((iM6981 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۘ") + i7) * (-75);
                        i8 = ((iM6981 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                    }
                    i9 = iM6981 ^ i4;
                    c11312 = this;
                    break;
                case 104822255:
                case 1902746093:
                    iM2569 = C0630.m2566(C3537.m10748(sArr3, 116, 3, i11));
                    if (C4159.f13567) {
                        iM2566 = (C0630.m2566("ܳ᩸") ^ i6) * (-5);
                        i2 = ((iM2566 ^ i7) * (-4951)) ^ 176129615;
                        i3 = 1197683119;
                    } else {
                        iM2566 = (C2105.m6981("ܶۡ") ^ i6) * (-71);
                        i2 = ((iM2566 ^ i7) * (-6383)) ^ 1620501182;
                        i3 = 1970277088;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case 128507286:
                case 297587390:
                    C0630.m2570(textView, 2125218567 ^ iM2568);
                    sArr3 = f33862;
                    if (C3683.f11629 < 0) {
                        iM2566 = (C0630.m2566("᩶᩸") ^ i7) * (-69);
                        i2 = ((iM2566 ^ i6) * (-21099)) ^ 23779064;
                        i3 = 941478812;
                        i9 = iM2566 ^ i3;
                        i8 = i2;
                    } else {
                        iM6981 = (C2105.m6981("᩻ۘ") + i7) * (-75);
                        i8 = ((iM6981 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                        i9 = iM6981 ^ i4;
                        c11312 = this;
                    }
                    break;
                case 697466180:
                case 1237294852:
                    if (i10 - (s * 11744) >= 0) {
                        iM2566 = (C0630.m2566("᩷ۨ") + i7) * (-51);
                        i2 = ((iM2566 ^ i6) * 7965) ^ (-1023724324);
                        i3 = -1051604287;
                    } else {
                        iM2566 = (C0630.m2566("ۧ᩻") + i6) * 85;
                        i2 = ((iM2566 ^ i7) * 13759) ^ 1361759045;
                        i3 = 1336013987;
                    }
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
                case 806860026:
                case 1471140123:
                    sArr = f33862;
                    if (C7106.f21815 != 0) {
                        c = 'j';
                        int iM6985 = (i6 - C2105.m6981("᩸֫")) * 7;
                        int i13 = ((iM6985 ^ i7) * (-5359)) ^ (-241276759);
                        i9 = iM6985 ^ (-2049534458);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i13;
                        c11312 = this;
                    } else {
                        int iM25610 = (C0630.m2566("۟ܰ") ^ i6) * (-49);
                        int i14 = ((iM25610 ^ i7) * (-9749)) ^ 1175543243;
                        i9 = iM25610 ^ (-1559736725);
                        c11312 = this;
                        sArr2 = sArr;
                        i8 = i14;
                        c2 = 'j';
                    }
                    break;
                case 1228364245:
                case 1246226727:
                    break;
                case 1469524847:
                case 1580707763:
                    editText.setSelection(RunnableC1937.m6384(editText));
                    break;
                default:
                    C1047.m3601(editText, f33861);
                    iM2566 = (i6 - C2105.m6981("ۧ۠")) * (-65);
                    i2 = ((iM2566 ^ i7) * 3561) ^ (-21134445);
                    i3 = 262470853;
                    i9 = iM2566 ^ i3;
                    i8 = i2;
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        adapterView.setSelection(0);
    }
}
