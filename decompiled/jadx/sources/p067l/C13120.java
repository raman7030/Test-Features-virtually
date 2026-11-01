package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
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
public final class C13120 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۤ */
    public static String f36861;

    /* JADX INFO: renamed from: ۧ۟۫, reason: not valid java name and contains not printable characters */
    private static final short[] f82148 = {9864, -23538, 27874, -21010, -27079, -25795, -30700, -31898, 27764, -23561, 25369, 30096, 25930, 27771, -32032, -27148, -18887, -30599, 32651, -30693, -23838, -27521, -18912, 30282, -22523, 9243, -5298, -5311, -5308, -5299, -5307, -5305, -5300, -5299, -5305, -5288, -5284, -5309, -5299, -5299, -5288, -5271, -5288, -5309, -5253, -5311, -5297, -5270, -5308, -5305, -5301, -5309, 3017, -2665, -1047, 374, 3089, 2464, -708, -4376, 7819, -4229, -10061, 6447, -6326, 556, 10268, -3505, 14662, -1832, -13754, -13839, -22629, -22629, -22575, -22576, -22579, 9362, -4349, 6799, 1547, 30513, 30521, 30520, 7642, -2953, -7701, 5849, -2743, 6344, 11816, 4247, -7807, 4848, 6962, -4306, 2108, -7708, -2051, 3851, 11338, 11341, 11343, 11339, 11339, 11339, 3426, 22579, -18869, -25836, -24072, 22398, 23687, -17643, 23977, 20017, 20343, 18122, -16436};

    /* JADX INFO: renamed from: ۫ */
    public static String f36862;

    /* JADX INFO: renamed from: ۗ */
    public EditText f36863;

    /* JADX INFO: renamed from: ۙ */
    public TextView f36864;

    /* JADX INFO: renamed from: ۬ */
    public C18107 f36865;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f36866;

    /* JADX INFO: renamed from: ᩸ */
    public int f36867;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC17043 f36868;

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
        int iM55979;
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
        int i15 = RunnableC0871.f81839;
        int i16 = C0930.f81879;
        int iM559710 = C0946.m55979("ۜ֫") ^ i16;
        int i17 = ((iM559710 ^ i15) * (-6727)) ^ 864356697;
        int i18 = iM559710 ^ (-1247070737);
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-1295)) >> 31));
            switch (i14) {
                case -2080212902:
                case -971160927:
                    i = i9;
                    i8 = s + s2;
                    if (C1028.m56247() >= 0) {
                        iM55979 = (i15 - C0946.m55979("ۡۚ")) * (-39);
                        i2 = ((iM55979 ^ i16) * (-19011)) ^ (-1484387747);
                        i3 = -1654916202;
                    } else {
                        iM55979 = C0946.m55979("۫ۗ") ^ i15;
                        i2 = ((iM55979 ^ i16) * (-4207)) ^ (-1054231902);
                        i3 = -749593321;
                    }
                    int i19 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i19;
                    break;
                case -1994116309:
                case -891991865:
                    i = i9;
                    ServiceConnectionC1013.m56157();
                    if (C1028.f81950 > 0) {
                        iM55979 = (i16 - C0946.m55979("ۨ᩵")) * 67;
                        i2 = ((iM55979 ^ i15) * (-5053)) ^ (-1362314736);
                        i3 = -174059077;
                    } else {
                        iM55979 = (i15 - C0946.m55979("ۡۚ")) * (-39);
                        i2 = ((iM55979 ^ i16) * (-19011)) ^ (-1484387747);
                        i3 = -1654916202;
                    }
                    int i110 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i110;
                    break;
                case -1825085608:
                case 1672214228:
                    i = i9;
                    s = sArr3[c];
                    if (C0930.m55885() <= 0) {
                        iM55979 = (C0946.m55979("ᩴ֡") + i16) * 35;
                        i2 = ((iM55979 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM55979 = C0946.m55979("᩶֨") ^ i15;
                        i2 = ((iM55979 ^ i16) * 17739) ^ 1491942244;
                        i3 = -1467574718;
                    }
                    int i111 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i111;
                    break;
                case -1734858748:
                case 797547343:
                    i = i9;
                    sArr2 = f82148;
                    i12 = 101;
                    i13 = 5;
                    if (C0917.f81868) {
                        iM55979 = C0946.m55979("ᩴۨ") ^ i15;
                        i2 = ((iM55979 ^ i16) * (-1239)) ^ 977621144;
                        i3 = -455221657;
                    } else {
                        iM55979 = (C0873.m55680("֡ۜ") ^ i16) * (-17);
                        i2 = ((iM55979 ^ i15) * 5025) ^ (-987892637);
                        i3 = -29428237;
                    }
                    int i112 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i112;
                    break;
                case -1693020586:
                case -1609865495:
                    i = i9;
                    sArr3 = f82148;
                    c = 'c';
                    if (C0949.f81897 >= 0) {
                        iM55979 = (i15 - C0946.m55979("ۡۚ")) * (-39);
                        i2 = ((iM55979 ^ i16) * (-19011)) ^ (-1484387747);
                        i3 = -1654916202;
                    } else {
                        iM55979 = (i16 - C0946.m55979("᩶᩸")) * (-17);
                        i2 = ((iM55979 ^ i15) * (-6407)) ^ (-1156105337);
                        i3 = -2045817000;
                    }
                    int i113 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i113;
                    break;
                case -1672236308:
                case -955469612:
                    i = i9;
                    sArr = f82148;
                    i10 = 100;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0946.m55979("ᩴۨ") ^ i15;
                        i2 = ((iM55979 ^ i16) * (-1239)) ^ 977621144;
                        i3 = -455221657;
                    } else {
                        iM55979 = (i15 - C0946.m55979("ܶۚ")) * (-41);
                        i2 = ((iM55979 ^ i16) * 10497) ^ 130615897;
                        i3 = -1212903824;
                    }
                    int i114 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i114;
                    break;
                case -1414061857:
                case -511935347:
                    i = i9;
                    i11 = 1;
                    if (C0937.m55918() >= 0) {
                        iM55979 = (C0946.m55979("ᩴ֡") + i16) * 35;
                        i2 = ((iM55979 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩻") ^ i15;
                        i2 = ((iM55979 ^ i16) * 4753) ^ (-75767750);
                        i3 = 1189939362;
                    }
                    int i115 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i115;
                    break;
                case -1344858957:
                case 1252605940:
                    i = i9;
                    if ((i8 * i8) - i7 <= 0) {
                        iM55979 = C0873.m55680("۟۟") ^ i15;
                        i2 = ((iM55979 ^ i16) * (-20507)) ^ 1235875381;
                        i3 = 89612277;
                    } else {
                        iM55979 = C0873.m55680("ۨ۫") ^ i16;
                        i2 = ((iM55979 ^ i15) * 8295) ^ (-1658446113);
                        i3 = 869638095;
                    }
                    int i116 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i116;
                    break;
                case -1192954410:
                case 1692479007:
                    i = i9;
                    i7 = i6 + i6;
                    s2 = 11862;
                    if (C1053.f81965 <= 0) {
                        iM55979 = C0946.m55979("ۧۖ") ^ i15;
                        i2 = ((iM55979 ^ i16) * 29981) ^ 1271887238;
                        i3 = 648718102;
                    } else {
                        iM55979 = (C0946.m55979("᩸ۗ") + i16) * 101;
                        i2 = ((iM55979 ^ i15) * (-6021)) ^ (-1367188551);
                        i3 = -168006957;
                    }
                    int i117 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i117;
                    break;
                case -1164987119:
                case 2099583804:
                    i = i9;
                    C0937.m55918();
                    iM55979 = C0946.m55979("ۧۖ") ^ i15;
                    i2 = ((iM55979 ^ i16) * 29981) ^ 1271887238;
                    i3 = 648718102;
                    int i118 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i118;
                    break;
                case -1085176714:
                case 737863950:
                    C0989.m56095();
                    C1028.m56247();
                    throw new RuntimeException();
                case -1051877825:
                case 164169152:
                    i = i9;
                    i6 = i5 + 140707044;
                    if (C1028.m56247() >= 0) {
                        iM55979 = (C0946.m55979("ᩴ֡") + i16) * 35;
                        i2 = ((iM55979 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM55979 = C0946.m55979("ۖܿ") ^ i16;
                        i2 = ((iM55979 ^ i15) * (-3493)) ^ (-1842653927);
                        i3 = -1772531959;
                    }
                    int i119 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i119;
                    break;
                case -823017536:
                case 605282220:
                    i = i9;
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ۧۖ") ^ i15;
                        i2 = ((iM55979 ^ i16) * 29981) ^ 1271887238;
                        i3 = 648718102;
                    } else {
                        iM55979 = C0946.m55979("ᩴۨ") ^ i15;
                        i2 = ((iM55979 ^ i16) * (-1239)) ^ 977621144;
                        i3 = -455221657;
                    }
                    int i1110 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i1110;
                    break;
                case -552203247:
                case -443295170:
                    f36861 = C1124.m56373(sArr, i10, i11, i9);
                    if (C0890.f81849 != 0) {
                        i = i9;
                        iM55979 = (C0946.m55979("ᩴ֡") + i16) * 35;
                        i2 = ((iM55979 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM55979 = C0946.m55979("ۙܽ") ^ i16;
                        i = i9;
                        i2 = ((iM55979 ^ i15) * (-21755)) ^ (-2009247974);
                        i3 = -1239051658;
                    }
                    int i1111 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i1111;
                    break;
                case -249217089:
                case 458888560:
                    f36862 = C1053.m56325(sArr2, i12, i13, i9);
                    return;
                case 100558035:
                case 493364026:
                    i4 = 16946;
                    int iM55680 = (C0873.m55680("ܽܰ") ^ i16) * (-107);
                    i = i4;
                    i3 = -1312529635;
                    i2 = ((iM55680 ^ i15) * 23749) ^ 755683398;
                    iM55979 = iM55680;
                    int i1112 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i1112;
                    break;
                case 400977840:
                case 2094133117:
                    i = i9;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("ۧۖ") ^ i15;
                        i2 = ((iM55979 ^ i16) * 29981) ^ 1271887238;
                        i3 = 648718102;
                    } else {
                        iM55979 = (i16 - C0946.m55979("ۨ᩵")) * 67;
                        i2 = ((iM55979 ^ i15) * (-5053)) ^ (-1362314736);
                        i3 = -174059077;
                    }
                    int i1113 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i1113;
                    break;
                case 503995746:
                case 830361631:
                    i5 = s * s;
                    if (C1025.f81947 >= 0) {
                        i = i9;
                        iM55979 = (C0946.m55979("ᩴ֡") + i16) * 35;
                        i2 = ((iM55979 ^ i15) * (-23805)) ^ 1007806302;
                        i3 = -311331742;
                    } else {
                        iM55979 = (i15 - C0946.m55979("ᩴܿ")) * (-117);
                        i3 = 1610850419;
                        int i20 = i9;
                        i2 = ((iM55979 ^ i16) * (-6557)) ^ 1004649233;
                        i5 = i5;
                        i = i20;
                    }
                    int i1114 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i1114;
                    break;
                default:
                    i4 = 11387;
                    int iM55681 = (C0873.m55680("ܽܰ") ^ i16) * (-107);
                    i = i4;
                    i3 = -1312529635;
                    i2 = ((iM55681 ^ i15) * 23749) ^ 755683398;
                    iM55979 = iM55681;
                    int i1115 = i;
                    i18 = iM55979 ^ i3;
                    i17 = i2;
                    i9 = i1115;
                    break;
            }
        }
    }

    public C13120(AbstractC17043 abstractC17043, final C18107 c18107, final String str) {
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
        int iM55979;
        int i11;
        int i12;
        EditText editText2;
        View view5;
        int iM559710;
        int i13;
        int i14;
        int iM559711;
        int i15;
        int iM55680;
        int i16;
        int i17;
        DialogInterfaceC2564 dialogInterfaceC2564M18268 = null;
        int i18 = -1496847620;
        int i19 = C1036.f81953;
        int i20 = C0866.f81837;
        short s = f82148[0];
        int i21 = ((s * s) + 23716) - (s * 308) < 0 ? 64469 : 63850;
        int iM559712 = (i19 - C0946.m55979("֫᩹")) * 27;
        EditText editText3 = null;
        C20671 c20671M55654 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i22 = 0;
        int i23 = 0;
        int iM559713 = 0;
        int iM559714 = 0;
        int i24 = 0;
        Main mainM56560 = null;
        int iM55681 = 0;
        int i25 = 0;
        int i26 = 0;
        View view6 = null;
        int i27 = 0;
        Spinner spinner = null;
        View viewM56465 = null;
        String str2 = null;
        int i28 = 0;
        int i29 = ((iM559712 ^ i20) * (-4073)) ^ (-2081617154);
        DialogInterface.OnClickListener onClickListener = null;
        short[] sArr12 = null;
        int i30 = 0;
        int i31 = iM559712 ^ 974363826;
        short[] sArr13 = null;
        int i32 = 0;
        while (true) {
            i18 = i31 ^ (i29 & (((i18 ^ i20) * 3975) >> 31));
            switch (i18) {
                case -2094422850:
                case -2063583909:
                    iM559714 = C0946.m55979(str2) ^ 2124896992;
                    sArr12 = f82148;
                    i22 = 22;
                    if (C1053.f81965 > 0) {
                        iM55680 = (C0873.m55680("ۡ᩷") + i20) * (-3);
                        i16 = ((iM55680 ^ i19) * 22177) ^ (-1186889029);
                        i17 = 168870521;
                        i31 = iM55680 ^ i17;
                        i29 = i16;
                    } else {
                        i8 = i28;
                        editText2 = editText3;
                        view5 = view6;
                        sArr6 = sArr13;
                        iM559711 = (C0873.m55680("֡ۨ") ^ i19) * 41;
                        i29 = ((iM559711 ^ i20) * (-7351)) ^ (-921442944);
                        i15 = -1506538537;
                        i14 = iM559711 ^ i15;
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
                    View viewM56181 = C1017.m56181(mainM56560, iM55681);
                    int iM55682 = C0873.m55680(RunnableC0938.m55936(f82148, 4, 3, i21));
                    int iM559715 = (C0946.m55979("᩸֫") + i19) * (-89);
                    int i34 = ((iM559715 ^ i20) * (-4003)) ^ (-599998473);
                    i31 = iM559715 ^ 913162391;
                    sArr9 = sArr9;
                    i29 = i34;
                    i28 = i33;
                    view3 = viewM56181;
                    i24 = iM55682;
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
                    spinner = (Spinner) C0892.m55755(view4, i24 ^ 2124694985);
                    sArr9 = f82148;
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM55979 ^ i19) * (-10861));
                        i11 = -494399169;
                    } else {
                        iM55979 = C0946.m55979("ۗᩴ") ^ i20;
                        i29 = (-665096781) ^ ((iM55979 ^ i19) * 14203);
                        i11 = 513155912;
                    }
                    i12 = iM55979 ^ i11;
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
                    AbstractC0942.m55971();
                    ViewOnClickListenerC0939.m55941();
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
                    int iM55683 = C0873.m55680("᩷۬") ^ i19;
                    int i37 = ((iM55683 ^ i20) * 20559) ^ (-531544991);
                    i31 = iM55683 ^ 738241993;
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
                    this.f36866 = (TextView) C0892.m55755(view5, C0946.m55979(C0892.m55750(sArr16, i38, i3, i21)) ^ 2100621979);
                    if (!C0927.f81875) {
                        iM559710 = C0946.m55979("ۗ۬") ^ i20;
                        i26 = i38;
                        i29 = ((iM559710 ^ i19) * 31389) ^ 1700508261;
                        i13 = -1970252200;
                        i14 = iM559710 ^ i13;
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
                        int iM55684 = C0873.m55680("᩷۬") ^ i19;
                        int i39 = ((iM55684 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM55684 ^ 738241993;
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
                    this.f36867 = 0;
                    this.f36865 = c18107;
                    this.f36868 = abstractC17043;
                    mainM56560 = C1929.m56560(c18107);
                    sArr8 = f82148;
                    i27 = 1;
                    if (C1028.f81950 > 0) {
                        int iM55685 = (C0873.m55680("۫֨") + i19) * 43;
                        int i40 = ((iM55685 ^ i20) * (-15513)) ^ (-1922369405);
                        i28 = i8;
                        i21 = i21;
                        i31 = iM55685 ^ (-1648119174);
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
                        int iM55686 = C0873.m55680("᩷۬") ^ i19;
                        int i311 = ((iM55686 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM55686 ^ 738241993;
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
                    C0882.m55710();
                    if (C1964.f83032 <= 0) {
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
                        int iM55687 = C0873.m55680("᩷۬") ^ i19;
                        int i312 = ((iM55687 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM55687 ^ 738241993;
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
                        int iM559716 = C0946.m55979("۬֡") ^ i19;
                        i29 = ((iM559716 ^ i20) * 7289) ^ 1612395422;
                        i31 = iM559716 ^ 564565797;
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
                    viewM56465 = C1404.m56465(view4, C0873.m55680(C1025.m56233(sArr18, 7, 3, i21)) ^ 2127991790);
                    if (C1964.m56597() != 0) {
                        sArr9 = sArr18;
                        iM55979 = C0873.m55680("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM55979 ^ i19) * (-10861));
                        i11 = -494399169;
                        i12 = iM55979 ^ i11;
                    } else {
                        int iM55688 = C0873.m55680("᩸᩹") ^ i20;
                        int i42 = ((iM55688 ^ i19) * (-22473)) ^ 1949735007;
                        i12 = iM55688 ^ (-1789907975);
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
                    ServiceConnectionC1013.m56157();
                    if (RunnableC0871.f81839 < 0) {
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
                        int iM55689 = (C0873.m55680("۟۠") ^ i20) * (-67);
                        int i43 = i21;
                        int i44 = ((iM55689 ^ i19) * (-1373)) ^ (-1501837941);
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM55689 ^ 917976339;
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
                        int iM556810 = C0873.m55680("᩷۬") ^ i19;
                        int i314 = ((iM556810 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM556810 ^ 738241993;
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
                    C0946.m55980();
                    throw new RuntimeException();
                case -713656685:
                case 1495689848:
                    int i45 = i28;
                    int i46 = i25;
                    int i47 = i32;
                    View view9 = view6;
                    short[] sArr20 = sArr13;
                    short[] sArr21 = sArr10;
                    EditText editText5 = (EditText) C1404.m56465(view9, C0946.m55979(C0882.m55717(sArr21, i46, i47, i21)) ^ 2103408996);
                    int iM556811 = C0873.m55680("֫᩸") ^ i20;
                    i30 = i30;
                    i22 = i22;
                    sArr11 = sArr11;
                    editText3 = editText5;
                    sArr10 = sArr21;
                    i32 = i47;
                    i28 = i45;
                    i7 = i46;
                    i29 = ((iM556811 ^ i19) * (-21433)) ^ (-77960099);
                    sArr13 = sArr20;
                    view6 = view9;
                    i31 = iM556811 ^ (-989593391);
                    i25 = i7;
                    break;
                case -71170379:
                case 1906858832:
                    iM559713 = C0946.m55979(RunnableC0871.m55667(sArr13, i28, i23, i21)) ^ 2116417995;
                    if (!C0866.m55645()) {
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
                        iM55979 = C0873.m55680("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM55979 ^ i19) * (-10861));
                        i11 = -494399169;
                        i12 = iM55979 ^ i11;
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
                        iM55680 = (C0873.m55680("᩵ۙ") ^ i20) * (-97);
                        i16 = ((iM55680 ^ i19) * 28655) ^ (-1437607192);
                        i17 = 301800133;
                        i31 = iM55680 ^ i17;
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
                    C0894.m55771(editText2, f36862);
                    editText2.setSelection(RunnableC0938.m55935(editText2));
                    if (AbstractC0942.f81890 <= 0) {
                        iM559711 = (C0873.m55680("֡ۨ") ^ i19) * 41;
                        i29 = ((iM559711 ^ i20) * (-7351)) ^ (-921442944);
                        i15 = -1506538537;
                    } else {
                        iM559711 = (C0946.m55979("۫۠") + i19) * 75;
                        i29 = ((iM559711 ^ i20) * (-6483)) ^ (-1581396786);
                        i15 = -459881238;
                    }
                    i14 = iM559711 ^ i15;
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
                    this.f36863 = editText2;
                    short[] sArr23 = f82148;
                    i26 = 13;
                    i30 = 3;
                    if (C1048.m56305() >= 0) {
                        i22 = i48;
                        sArr11 = sArr23;
                        iM559711 = (C0873.m55680("֡ۨ") ^ i19) * 41;
                        i29 = ((iM559711 ^ i20) * (-7351)) ^ (-921442944);
                        i15 = -1506538537;
                        i14 = iM559711 ^ i15;
                        editText3 = editText2;
                        i28 = i8;
                        View view11 = view5;
                        i31 = i14;
                        sArr13 = sArr6;
                        view6 = view11;
                    } else {
                        int iM559717 = (C0946.m55979("᩻֫") ^ i19) * 83;
                        editText3 = editText2;
                        i28 = i8;
                        sArr11 = sArr23;
                        sArr13 = sArr6;
                        view6 = view5;
                        i31 = iM559717 ^ (-1178501856);
                        i29 = ((iM559717 ^ i20) * 17971) ^ 547791578;
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
                    iM55681 = C0873.m55680(C0890.m55726(sArr5, i6, 3, i21)) ^ 2122056733;
                    if (!RunnableC0897.f81856) {
                        int iM556812 = (C0873.m55680("۟۠") ^ i20) * (-67);
                        int i49 = i21;
                        int i410 = ((iM556812 ^ i19) * (-1373)) ^ (-1501837941);
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM556812 ^ 917976339;
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
                        int iM556813 = C0873.m55680("ܶ᩷") ^ i20;
                        int i51 = ((iM556813 ^ i19) * 11767) ^ 1117516547;
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM556813 ^ 1346945392;
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
                    C11896.m27216(c18107, dialogInterfaceC2564M18268, str);
                    final Spinner spinner2 = spinner;
                    final DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M18268;
                    C1048.m56304(C1929.m56567(dialogInterfaceC2564M18268), new View.OnClickListener(this) { // from class: l.᩶ۨܽ

                        /* JADX INFO: renamed from: ᩸ */
                        public final /* synthetic */ C13120 f67900;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view13) {
                            C18107 c18108 = null;
                            String str3 = null;
                            C13120 c13120 = null;
                            Spinner spinner3 = null;
                            int i52 = 851280034;
                            int i53 = AbstractC0942.f81890;
                            int i54 = C0906.f81862;
                            int iM559718 = C0946.m55979("ܳܽ") ^ i53;
                            int i55 = ((iM559718 ^ i54) * 18029) ^ (-876731044);
                            int i56 = 946134294;
                            while (true) {
                                i52 = ((((i52 ^ i54) * (-20057)) >> 31) & i55) ^ (iM559718 ^ i56);
                                switch (i52) {
                                    case -2112435227:
                                    case -1539390723:
                                        if (C0898.f81858 <= 0) {
                                            iM559718 = (C0946.m55979("֨۟") ^ i53) * (-73);
                                            i55 = ((iM559718 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        } else {
                                            iM559718 = C0946.m55979("ۨ۠") ^ i53;
                                            i55 = ((iM559718 ^ i54) * (-31531)) ^ 12755921;
                                            i56 = 488219046;
                                        }
                                        break;
                                    case -2046338404:
                                    case 1270084317:
                                        c18108 = c18107;
                                        if (C1024.f81946) {
                                            iM559718 = C0946.m55979("ܿ֡") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 14627) ^ (-1653079156);
                                            i56 = 687448885;
                                        } else {
                                            iM559718 = C0946.m55979("ۤۜ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 22089) ^ (-1031773551);
                                            i56 = 1884524861;
                                        }
                                        break;
                                    case -2014186660:
                                    case 2140554798:
                                        AbstractC0942.m55971();
                                        if (C0906.f81862 >= 0) {
                                            iM559718 = (i53 - C0946.m55979("ۙܺ")) * (-79);
                                            i55 = ((iM559718 ^ i54) * (-10687)) ^ 1938794522;
                                            i56 = 771606959;
                                        } else {
                                            iM559718 = (C0946.m55979("֨۟") ^ i53) * (-73);
                                            i55 = ((iM559718 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        }
                                        break;
                                    case -1927573466:
                                    case -363581365:
                                        c13120 = this.f67900;
                                        spinner3 = spinner2;
                                        if (RunnableC0897.f81856) {
                                            iM559718 = C0946.m55979("ܶܰ") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 11309) ^ (-1315576306);
                                            i56 = -135887262;
                                        } else {
                                            iM559718 = C0873.m55680("ۗᩳ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        }
                                        break;
                                    case -1588793509:
                                    case -819902593:
                                        C13120.m30018(c13120, spinner3, dialogInterfaceC2564, c18108, str3);
                                        break;
                                    case -1586622626:
                                    case 1818016461:
                                        RunnableC0871.m55672();
                                        if (C0845.f81821 >= 0) {
                                            iM559718 = (i54 - C0873.m55680("ۙܿ")) * 31;
                                            i55 = ((iM559718 ^ i53) * 25509) ^ 1009115181;
                                            i56 = -705975307;
                                        } else {
                                            iM559718 = C0873.m55680("ۗᩳ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        }
                                        break;
                                    case -1562837002:
                                    case -1072240864:
                                        C1036.m56257();
                                        break;
                                    case -1291207407:
                                    case -720381637:
                                        if (C0863.f81833 <= 0) {
                                            iM559718 = C0873.m55680("ۗᩳ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        } else {
                                            iM559718 = C0946.m55979("۟ۛ") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 27833) ^ 1017342699;
                                            i56 = 158671548;
                                        }
                                        break;
                                    case -767901069:
                                    case -287786886:
                                        if (C0949.f81897 >= 0) {
                                            iM559718 = C0946.m55979("ܿ֡") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 14627) ^ (-1653079156);
                                            i56 = 687448885;
                                        } else {
                                            iM559718 = C0946.m55979("ܿ᩻") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 10205) ^ 1795393660;
                                            i56 = -225135006;
                                        }
                                        break;
                                    case -547619986:
                                    case -176361041:
                                        str3 = str;
                                        if (C0906.m55809() <= 0) {
                                            iM559718 = C0946.m55979("ܿ֡") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 14627) ^ (-1653079156);
                                            i56 = 687448885;
                                        } else {
                                            iM559718 = (C0873.m55680("᩹᩻") ^ i54) * (-37);
                                            i55 = ((iM559718 ^ i53) * 28145) ^ 289467229;
                                            i56 = 1046385045;
                                        }
                                        break;
                                    case 952813712:
                                    case 1418781913:
                                        C1046.m56302();
                                        iM559718 = (C0946.m55979("֨۟") ^ i53) * (-73);
                                        i55 = ((iM559718 ^ i54) * 501) ^ 1909944805;
                                        i56 = -340954022;
                                        break;
                                    case 1392600203:
                                    case 1437354639:
                                        if (C1044.m56286() <= 0) {
                                            iM559718 = (C0946.m55979("֨۟") ^ i53) * (-73);
                                            i55 = ((iM559718 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        } else {
                                            iM559718 = C0946.m55979("᩻֡") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 15175) ^ 828710888;
                                            i56 = -2086245314;
                                        }
                                        break;
                                    case 1567322010:
                                    case 1955426104:
                                        if (C0890.f81849 != 0) {
                                            iM559718 = C0873.m55680("ۗᩳ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        } else {
                                            iM559718 = C0873.m55680("ۚܶ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * (-25969)) ^ (-1220945659);
                                            i56 = 2100473796;
                                        }
                                        break;
                                    case 1608480483:
                                    case 2101512668:
                                        if (ServiceConnectionC1013.f81940 >= 0) {
                                            iM559718 = (i54 - C0873.m55680("ۙܿ")) * 31;
                                            i55 = ((iM559718 ^ i53) * 25509) ^ 1009115181;
                                            i56 = -705975307;
                                        } else {
                                            iM559718 = (C0946.m55979("ۤۚ") ^ i54) * 33;
                                            i55 = ((iM559718 ^ i53) * 21261) ^ 1045091012;
                                            i56 = -459744571;
                                        }
                                        break;
                                    case 1859040511:
                                    case 1996013625:
                                        if (C0989.f81920 >= 0) {
                                            iM559718 = (i53 - C0946.m55979("ۙܺ")) * (-79);
                                            i55 = ((iM559718 ^ i54) * (-10687)) ^ 1938794522;
                                            i56 = 771606959;
                                        } else {
                                            iM559718 = (C0946.m55979("᩺֨") + i54) * (-127);
                                            i55 = ((iM559718 ^ i53) * 30829) ^ 686485142;
                                            i56 = 2092953238;
                                        }
                                        break;
                                    default:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM559718 = C0873.m55680("ۗᩳ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 6069) ^ 1306298541;
                                            i56 = -73876338;
                                        } else {
                                            iM559718 = (C0946.m55979("֨۟") ^ i53) * (-73);
                                            i55 = ((iM559718 ^ i54) * 501) ^ 1909944805;
                                            i56 = -340954022;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i52 = 1619383248;
                            int i53 = C0949.f81897;
                            int i54 = ServiceConnectionC1013.f81940;
                            int iM559718 = C0946.m55979("ۙۙ") ^ i53;
                            int i55 = ((iM559718 ^ i54) * (-16421)) ^ 1441730123;
                            int i56 = -1554038497;
                            while (true) {
                                i52 = ((((i52 ^ i54) * 3081) >> 31) & i55) ^ (iM559718 ^ i56);
                                switch (i52) {
                                    case -2140208615:
                                    case 1273927896:
                                        C0863.m55643();
                                        if (C0989.f81920 >= 0) {
                                            iM559718 = (C0873.m55680("᩷۬") + i54) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i55 = ((iM559718 ^ i53) * 13741) ^ 1316137150;
                                            i56 = -1056018144;
                                        } else {
                                            iM559718 = C0946.m55979("᩵᩶") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        }
                                        break;
                                    case -1876174523:
                                    case 1820023624:
                                        if (C1053.m56327() >= 0) {
                                            iM559718 = C0873.m55680("֡۬") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 15157) ^ 142328022;
                                            i56 = -1445088621;
                                        } else {
                                            iM559718 = (i53 - C0946.m55979("᩷ۢ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i55 = ((iM559718 ^ i54) * 7265) ^ 1504766761;
                                            i56 = 423585647;
                                        }
                                        break;
                                    case -1742803357:
                                    case -416071012:
                                        if (C1194.f82045 == 0) {
                                            iM559718 = C0946.m55979("᩵᩶") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM559718 = C0873.m55680("֡۬") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 15157) ^ 142328022;
                                            i56 = -1445088621;
                                        }
                                        break;
                                    case -1552272475:
                                    case 1327932673:
                                        if (C0882.f81846) {
                                            iM559718 = (C0873.m55680("᩷۬") + i54) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i55 = ((iM559718 ^ i53) * 13741) ^ 1316137150;
                                            i56 = -1056018144;
                                        } else {
                                            iM559718 = (C0873.m55680("ܺۜ") + i53) * (-77);
                                            i55 = ((iM559718 ^ i54) * (-21883)) ^ (-2100982855);
                                            i56 = 1211253289;
                                        }
                                        break;
                                    case -1430869769:
                                    case -764531610:
                                        if (C0892.f81851) {
                                            iM559718 = C0873.m55680("ܰ۟") ^ i53;
                                            i55 = ((iM559718 ^ i54) * (-4263)) ^ 1342680149;
                                            i56 = 466151575;
                                        } else {
                                            iM559718 = (C0946.m55979("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM559718 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        }
                                        break;
                                    case -1029799650:
                                    case 2069505242:
                                        if (RunnableC1014.f81941 <= 0) {
                                            iM559718 = C0946.m55979("᩵᩶") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM559718 = C0946.m55979("ᩳܿ") ^ i53;
                                            i55 = ((iM559718 ^ i54) * 22417) ^ 1766532052;
                                            i56 = 1050637816;
                                        }
                                        break;
                                    case -406142222:
                                    case 201260092:
                                        if (C0898.m55800() <= 0) {
                                            iM559718 = (C0946.m55979("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM559718 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM559718 = C0946.m55979("ۢᩴ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 807) ^ 953179597;
                                            i56 = -1992471163;
                                        }
                                        break;
                                    case -394255183:
                                    case 707807360:
                                        if (C0992.f81922 >= 0) {
                                            iM559718 = C0946.m55979("᩵᩶") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM559718 = C0946.m55979("᩸ۙ") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 2515) ^ (-1849162044);
                                            i56 = 1178756838;
                                        }
                                        break;
                                    case -119530336:
                                    case 2047415833:
                                        this.f67900 = this;
                                        if (C1044.f81959 >= 0) {
                                            iM559718 = (C0946.m55979("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM559718 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM559718 = C0873.m55680("ۚۨ") ^ i53;
                                            i55 = ((iM559718 ^ i54) * (-17715)) ^ (-892006076);
                                            i56 = -1526644510;
                                        }
                                        break;
                                    case 141114185:
                                    case 1552070848:
                                        if (C0890.m55740()) {
                                            iM559718 = (C0946.m55979("ܿ᩸") + i54) * (-41);
                                            i55 = ((iM559718 ^ i53) * (-32323)) ^ (-366811320);
                                            i56 = 1616519495;
                                        } else {
                                            iM559718 = (C0946.m55979("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM559718 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        }
                                        break;
                                    case 334978006:
                                    case 572483994:
                                        if (C0890.f81849 != 0) {
                                            iM559718 = (C0946.m55979("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM559718 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM559718 = (C0873.m55680("ܳۚ") + i54) * 91;
                                            i55 = ((iM559718 ^ i53) * (-16771)) ^ (-1750014053);
                                            i56 = -1626591000;
                                        }
                                        break;
                                    case 476126377:
                                    case 1888193502:
                                        C0947.m55997();
                                        throw new RuntimeException();
                                    case 1299935478:
                                    case 1707759399:
                                        return;
                                    case 1676891016:
                                    case 1893373828:
                                        if (C0861.f81831) {
                                            iM559718 = C0946.m55979("᩵᩶") ^ i54;
                                            i55 = ((iM559718 ^ i53) * 9395) ^ (-384634026);
                                            i56 = 690485445;
                                        } else {
                                            iM559718 = (C0946.m55979("᩶ۜ") ^ i53) * 83;
                                            i55 = ((iM559718 ^ i54) * (-17965)) ^ (-1026705775);
                                            i56 = 1025822168;
                                        }
                                        break;
                                    case 1990081526:
                                    case 2086082442:
                                        if (C1053.f81965 <= 0) {
                                            iM559718 = (C0946.m55979("ۗۜ") ^ i54) * 27;
                                            i55 = ((iM559718 ^ i53) * 9117) ^ 1620727777;
                                            i56 = -1899457741;
                                        } else {
                                            iM559718 = (C0873.m55680("ۤܶ") + i54) * (-77);
                                            i55 = ((iM559718 ^ i53) * 30513) ^ 2055564681;
                                            i56 = -441812250;
                                        }
                                        break;
                                    default:
                                        C1046.m56302();
                                        C1929.m56553();
                                        iM559718 = C0873.m55680("֡۬") ^ i53;
                                        i55 = ((iM559718 ^ i54) * 15157) ^ 142328022;
                                        i56 = -1445088621;
                                        break;
                                }
                            }
                        }
                    });
                    return;
                case 1017409239:
                case 1753476268:
                    dialogInterfaceC2564M18268 = C7913.m18268(c20671M55654, iM559714, onClickListener, C0946.m55979(C1071.m56336(sArr12, i22, 3, i21)) ^ 2116636572, onClickListener);
                    iM55680 = (C0873.m55680("֨᩻") ^ i20) * 79;
                    i16 = ((iM55680 ^ i19) * (-24707)) ^ (-514710047);
                    i17 = -1487828413;
                    i31 = iM55680 ^ i17;
                    i29 = i16;
                    break;
                case 1079756004:
                case 1790237923:
                    c20671M55654 = C0866.m55654(C1964.m56594(c18107));
                    View view13 = view6;
                    C0927.m55864(c20671M55654, view13);
                    sArr13 = f82148;
                    i23 = 3;
                    int iM556814 = (C0873.m55680("ܳۤ") + i19) * (-39);
                    view6 = view13;
                    i29 = ((iM556814 ^ i20) * (-11137)) ^ (-278408274);
                    i31 = iM556814 ^ 679485571;
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
                    this.f36864 = (TextView) viewM56465;
                    sArr10 = f82148;
                    i25 = 10;
                    i32 = 3;
                    if (C1044.f81959 < 0) {
                        iM559710 = C0946.m55979("ۧ۠") ^ i19;
                        i29 = ((iM559710 ^ i20) * 12627) ^ 383498998;
                        i13 = -1077571404;
                        i14 = iM559710 ^ i13;
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
                        int iM556815 = C0873.m55680("᩷۬") ^ i19;
                        int i317 = ((iM556815 ^ i20) * 20559) ^ (-531544991);
                        i31 = iM556815 ^ 738241993;
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
                    C0906.m55817(c20671M55654, iM559713, null);
                    String strM56276 = C1044.m56276(f82148, 19, 3, i21);
                    int iM556816 = (i19 - C0873.m55680("ۡۖ")) * 89;
                    str2 = strM56276;
                    i31 = iM556816 ^ (-1045721253);
                    i29 = ((iM556816 ^ i20) * (-8753)) ^ 224132232;
                    onClickListener = null;
                    break;
                default:
                    C0890.m55740();
                    if (C1929.f83011 != 0) {
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
                        iM55979 = C0873.m55680("ᩳ᩹") ^ i20;
                        i29 = (-602013464) ^ ((iM55979 ^ i19) * (-10861));
                        i11 = -494399169;
                        i12 = iM55979 ^ i11;
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
                        int iM556817 = (C0873.m55680("۟۠") ^ i20) * (-67);
                        int i411 = i21;
                        int i412 = ((iM556817 ^ i19) * (-1373)) ^ (-1501837941);
                        i27 = i6;
                        sArr8 = sArr5;
                        i28 = i;
                        i31 = iM556817 ^ 917976339;
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
    
        if (p067l.C0863.f81833 <= 0) goto L27;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m30018(final C13120 c13120, final Spinner spinner, DialogInterfaceC2564 dialogInterfaceC2564, C18107 c18107, String str) {
        int iM55979;
        int i;
        int i2;
        EditText editText = null;
        final int iM56179 = 0;
        String strM55592 = null;
        String strM55707 = null;
        String strM56189 = null;
        String strM55618 = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -2134599107;
        int i6 = C0894.f81854;
        int i7 = C1044.f81959;
        int iM559710 = (C0946.m55979("۬۬") ^ i7) * C0254q.f1218h;
        int i8 = ((iM559710 ^ i6) * 18517) ^ 1703723741;
        int i9 = -1123740887;
        while (true) {
            int i10 = iM559710 ^ i9;
            while (true) {
                i5 = ((((i5 ^ i6) * (-3345)) >> 31) & i8) ^ i10;
                switch (i5) {
                    case -2045802989:
                    case -903008198:
                        i5 = i5;
                        if (iM56179 > 2000) {
                            iM55979 = C0873.m55680("᩷ۗ") ^ i6;
                            i = ((iM55979 ^ i7) * 2701) ^ (-805517933);
                            i2 = 1853614355;
                        } else {
                            iM55979 = C0873.m55680("ۨۧ") ^ i6;
                            i = ((iM55979 ^ i7) * (-29169)) ^ (-610529394);
                            i2 = 1135807766;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1993747156:
                    case -848130347:
                        i5 = i5;
                        s = f82148[52];
                        if (RunnableC1014.m56177()) {
                            iM55979 = (C0873.m55680("ۡܿ") ^ i6) * 71;
                            i = ((iM55979 ^ i7) * (-13927)) ^ 756474362;
                            i2 = -752859726;
                        } else {
                            iM55979 = (C0946.m55979("᩸֫") ^ i7) * 73;
                            i = ((iM55979 ^ i6) * (-30807)) ^ (-404748645);
                            i2 = -237691822;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1767879799:
                    case -980828414:
                        i5 = i5;
                        int i11 = s + 1;
                        if (i3 - (i11 * i11) > 0) {
                            iM55979 = (i6 - C0873.m55680("ۤ᩹")) * (-61);
                            i = ((iM55979 ^ i7) * 22395) ^ (-1073794980);
                            i2 = 1932148724;
                        } else {
                            iM55979 = C0873.m55680("ᩳ᩵") ^ i7;
                            i = ((iM55979 ^ i6) * (-14517)) ^ (-1871596790);
                            i2 = 1089648749;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1751661343:
                    case 1261000268:
                        i5 = i5;
                        strM56189 = C1017.m56189(f82148, 59, 3, i4);
                        if (C0863.f81833 <= 0) {
                            iM55979 = (C0873.m55680("۫֡") ^ i6) * (-57);
                            i = ((iM55979 ^ i7) * (-5127)) ^ (-1952642564);
                            i2 = -1313439002;
                        } else {
                            iM55979 = (C0873.m55680("ܿ۬") ^ i7) * 51;
                            i = ((iM55979 ^ i6) * 12355) ^ (-609827064);
                            i2 = 812035403;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1729813904:
                    case 1354374965:
                        i5 = i5;
                        try {
                            iM56179 = RunnableC1014.m56179(C0845.m55591(C1046.m56288(editText)));
                            iM55979 = C0946.m55979("֨᩻") ^ i6;
                            i = ((iM55979 ^ i7) * (-18083)) ^ 1223198805;
                            i2 = 1354288406;
                        } catch (NumberFormatException unused) {
                            iM55979 = C0946.m55979("ۖۖ") ^ i6;
                            i = ((iM55979 ^ i7) * 31521) ^ 24343868;
                            i2 = -967734811;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1575668213:
                    case -1187089921:
                        C0866.m55645();
                        if (RunnableC0871.f81839 >= 0) {
                            iM559710 = (C0946.m55979("ۧ֫") + i7) * 49;
                            i8 = ((iM559710 ^ i6) * (-7135)) ^ 446647733;
                            i9 = 383377878;
                        }
                        i5 = i5;
                        iM55979 = (C0873.m55680("᩷᩶") + i7) * (-9);
                        i = ((iM55979 ^ i6) * 25951) ^ (-574318176);
                        i2 = 1014653960;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1533737639:
                    case 1117656384:
                        C0917.m55842(C0873.m55680(strM55592) ^ 2127953504);
                        break;
                    case -1467563976:
                    case -1081089985:
                        i5 = i5;
                        if (C1017.f81942 >= 0) {
                            iM55979 = (C0873.m55680("۫֡") ^ i6) * (-57);
                            i = ((iM55979 ^ i7) * (-5127)) ^ (-1952642564);
                            i2 = -1313439002;
                        } else {
                            iM55979 = (i7 - C0946.m55979("ۨۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i = ((iM55979 ^ i6) * 28457) ^ 2078354723;
                            i2 = 1432526095;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1376789582:
                    case 466420342:
                        i5 = i5;
                        if (iM56179 <= 65536) {
                            iM55979 = C0946.m55979("ۨ֨") ^ i6;
                            i = ((iM55979 ^ i7) * (-31353)) ^ 1864580033;
                            i2 = -627336063;
                        } else {
                            iM55979 = C0873.m55680("᩷ۗ") ^ i6;
                            i = ((iM55979 ^ i7) * 2701) ^ (-805517933);
                            i2 = 1853614355;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1314539350:
                    case 255956330:
                        C0892.m55749();
                        break;
                    case -1174970242:
                    case 1474511400:
                        i5 = i5;
                        if (c13120.f36867 == 1) {
                            iM55979 = (C0946.m55979("ۖ۟") + i7) * (-55);
                            i = ((iM55979 ^ i6) * 6983) ^ (-2028305879);
                            i2 = 2121079123;
                        } else {
                            iM55979 = C0873.m55680("ۨۧ") ^ i6;
                            i = ((iM55979 ^ i7) * (-29169)) ^ (-610529394);
                            i2 = 1135807766;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -1144431216:
                    case -667894006:
                        C1071.m56343();
                        if (!C0917.f81868) {
                            i5 = i5;
                            iM55979 = (i7 - C0946.m55979("ۢᩴ")) * 35;
                            i = ((iM55979 ^ i6) * 21959) ^ (-792665722);
                            i2 = 1769934667;
                            i10 = iM55979 ^ i2;
                            i8 = i;
                            i5 = i5;
                        } else {
                            iM559710 = (i7 - C0946.m55979("᩻ۖ")) * 73;
                            i8 = ((iM559710 ^ i6) * (-2543)) ^ (-972307846);
                            i9 = -758330851;
                        }
                        break;
                    case -1058496471:
                    case 702010833:
                        i5 = i5;
                        if (C0955.f81898) {
                            iM55979 = (i7 - C0946.m55979("ۢᩴ")) * 35;
                            i = ((iM55979 ^ i6) * 21959) ^ (-792665722);
                            i2 = 1769934667;
                        } else {
                            iM55979 = C0946.m55979("۬ۧ") ^ i6;
                            i = ((iM55979 ^ i7) * (-18835)) ^ 1816918210;
                            i2 = -942547109;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -996219459:
                    case 1583463528:
                        C0927.m55873();
                        if (C1017.m56187() <= 0) {
                            i5 = i5;
                            iM55979 = (C0946.m55979("᩷ܺ") ^ i6) * (-119);
                            i = ((iM55979 ^ i7) * 16961) ^ 1584059608;
                            i2 = -477794544;
                            i10 = iM55979 ^ i2;
                            i8 = i;
                            i5 = i5;
                        } else {
                            iM559710 = C0873.m55680("ۖۜ") ^ i6;
                            i8 = ((iM559710 ^ i7) * (-21337)) ^ (-2118654891);
                            i9 = 795732388;
                        }
                        break;
                    case -932285132:
                    case 1482479437:
                        i5 = i5;
                        editText = c13120.f36863;
                        if (RunnableC0938.m55924()) {
                            iM55979 = (i7 - C0873.m55680("᩷᩻")) * 123;
                            i = ((iM55979 ^ i6) * (-13349)) ^ 1373946382;
                            i2 = 1952040480;
                        } else {
                            iM55979 = C0946.m55979("ܶۙ") ^ i6;
                            i = ((iM55979 ^ i7) * 3889) ^ (-1982079269);
                            i2 = -548228908;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -928323625:
                    case 345699340:
                        i4 = 32971;
                        iM55979 = (i6 - C0873.m55680("֡ܺ")) * 95;
                        i = ((iM55979 ^ i7) * (-17513)) ^ 1573277505;
                        i2 = 656033053;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -889461783:
                    case -771297026:
                        C0917.m55842(C0946.m55979(strM55707) ^ 2100552787);
                        break;
                    case -857062089:
                    case 1378505694:
                        i5 = i5;
                        strM55592 = C0845.m55592(f82148, 53, 3, i4);
                        if (C1036.f81953 >= 0) {
                            iM55979 = (C0873.m55680("᩺ۡ") + i6) * 91;
                            i = ((iM55979 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM55979 = C0873.m55680("۠ۙ") ^ i7;
                            i = ((iM55979 ^ i6) * (-19897)) ^ 1707973857;
                            i2 = 751751032;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -852645479:
                    case 896472386:
                        C1017.m56187();
                        if (C0898.f81858 > 0) {
                            iM559710 = C0873.m55680("ۖۜ") ^ i6;
                            i8 = ((iM559710 ^ i7) * (-21337)) ^ (-2118654891);
                            i9 = 795732388;
                        }
                        i5 = i5;
                        iM55979 = (C0873.m55680("۫֡") ^ i6) * (-57);
                        i = ((iM55979 ^ i7) * (-5127)) ^ (-1952642564);
                        i2 = -1313439002;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -712769813:
                    case 90134090:
                        C0917.m55847(dialogInterfaceC2564);
                        C11896.m27214(new InterfaceC14577(c13120) { // from class: l.ۙۨܽ

                            /* JADX INFO: renamed from: ᩸ */
                            public final /* synthetic */ C13120 f17529;

                            {
                                int i12 = -255708961;
                                int i13 = C1046.f81962;
                                int i14 = AbstractC0942.f81890;
                                int iM559711 = (C0946.m55979("ۨۢ") ^ i13) * (-61);
                                int i15 = ((iM559711 ^ i14) * 25065) ^ (-246186794);
                                int i16 = 1383238910;
                                while (true) {
                                    i12 = ((((i12 ^ i14) * 12819) >> 31) & i15) ^ (iM559711 ^ i16);
                                    switch (i12) {
                                        case -2006928832:
                                        case -592002416:
                                            if (C0898.m55800() <= 0) {
                                                iM559711 = C0873.m55680("᩻۠") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM559711 = C0873.m55680("۟ܳ") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-19713)) ^ 37426065;
                                                i16 = -1725344529;
                                            }
                                            break;
                                        case -1506850805:
                                        case -804031302:
                                            C0873.m55678();
                                            iM559711 = (C0873.m55680("ۗۙ") + i14) * (-79);
                                            i15 = ((iM559711 ^ i13) * (-26633)) ^ (-718267711);
                                            i16 = -909718847;
                                            break;
                                        case -1498337081:
                                        case 334762038:
                                            return;
                                        case -1433059557:
                                        case 1719265014:
                                            if (C0892.f81851) {
                                                iM559711 = (C0873.m55680("ۚ֫") ^ i13) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i15 = ((iM559711 ^ i14) * 19183) ^ 1942724270;
                                                i16 = 1441405988;
                                            } else {
                                                iM559711 = C0873.m55680("ۨ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            }
                                            break;
                                        case -1417947859:
                                        case -784436332:
                                            if (C0947.m55997()) {
                                                iM559711 = (C0946.m55979("ܿᩴ") + i13) * (-57);
                                                i15 = ((iM559711 ^ i14) * (-8243)) ^ 2111420746;
                                                i16 = -1446328955;
                                            } else {
                                                iM559711 = (i13 - C0873.m55680("۫᩵")) * 89;
                                                i15 = ((iM559711 ^ i14) * 6105) ^ (-77173911);
                                                i16 = 1922272209;
                                            }
                                            break;
                                        case -1399016882:
                                        case 853580630:
                                            if (C1124.m56367() >= 0) {
                                                iM559711 = C0873.m55680("ۨ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            } else {
                                                iM559711 = C0873.m55680("֨ᩴ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * 25947) ^ (-579764568);
                                                i16 = -557124593;
                                            }
                                            break;
                                        case -1272815500:
                                        case -372287689:
                                            if (C1053.m56327() >= 0) {
                                                iM559711 = C0873.m55680("᩻۠") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM559711 = (C0946.m55979("۬ܳ") + i14) * 41;
                                                i15 = ((iM559711 ^ i13) * (-23189)) ^ 1549068611;
                                                i16 = 1418436474;
                                            }
                                            break;
                                        case -1241571424:
                                        case 2050250204:
                                            if (C0898.f81858 <= 0) {
                                                iM559711 = C0873.m55680("ۨ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            } else {
                                                iM559711 = (i13 - C0946.m55979("۠ۗ")) * 47;
                                                i15 = ((iM559711 ^ i14) * (-23051)) ^ (-1187081993);
                                                i16 = 1111994398;
                                            }
                                            break;
                                        case -1078343228:
                                        case -984645279:
                                            if (C1028.f81950 > 0) {
                                                iM559711 = C0946.m55979("ۛ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            } else {
                                                iM559711 = (C0873.m55680("ۗۙ") + i14) * (-79);
                                                i15 = ((iM559711 ^ i13) * (-26633)) ^ (-718267711);
                                                i16 = -909718847;
                                            }
                                            break;
                                        case -807398788:
                                        case 838428445:
                                            if (C1929.m56553()) {
                                                iM559711 = C0873.m55680("ۨ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-31675)) ^ (-645808768);
                                                i16 = 720618273;
                                            } else {
                                                iM559711 = C0946.m55979("ܺܺ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-27095)) ^ (-723293944);
                                                i16 = 570739802;
                                            }
                                            break;
                                        case -339984501:
                                        case 7911209:
                                            this.f17529 = c13120;
                                            if (C0863.f81833 <= 0) {
                                                iM559711 = C0946.m55979("ۛ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            } else {
                                                iM559711 = C0873.m55680("ۖܳ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * 19767) ^ 1614665094;
                                                i16 = -36601421;
                                            }
                                            break;
                                        case 86928545:
                                        case 628013392:
                                            C0854.m55595();
                                            if (C0898.m55800() <= 0) {
                                                iM559711 = C0873.m55680("᩻۠") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM559711 = C0946.m55979("ۛ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            }
                                            break;
                                        case 233416597:
                                        case 1957602457:
                                            if (C0861.f81831) {
                                                iM559711 = C0946.m55979("ۡ֨") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-24595)) ^ 1178774890;
                                                i16 = 819180434;
                                            } else {
                                                iM559711 = C0873.m55680("᩻۠") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            }
                                            break;
                                        case 1498450276:
                                        case 1746824907:
                                            if (C1964.f83032 <= 0) {
                                                iM559711 = C0873.m55680("᩻۠") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-28425)) ^ 851215282;
                                                i16 = -384795262;
                                            } else {
                                                iM559711 = (C0873.m55680("ᩴۚ") + i13) * (-127);
                                                i15 = ((iM559711 ^ i14) * (-23215)) ^ 575866285;
                                                i16 = 1145073529;
                                            }
                                            break;
                                        case 1615411078:
                                        case 2084209797:
                                            C0873.m55678();
                                            if (C0866.f81837 >= 0) {
                                                iM559711 = (C0946.m55979("ܿᩴ") + i13) * (-57);
                                                i15 = ((iM559711 ^ i14) * (-8243)) ^ 2111420746;
                                                i16 = -1446328955;
                                            } else {
                                                iM559711 = C0946.m55979("ۛ۫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-1921)) ^ 1697416989;
                                                i16 = -2032519827;
                                            }
                                            break;
                                        default:
                                            C1053.m56327();
                                            throw new RuntimeException();
                                    }
                                }
                            }

                            @Override // p067l.InterfaceC14577
                            public final /* synthetic */ void onCanceled() {
                            }

                            @Override // p067l.InterfaceC14577
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ boolean mo6050(Exception exc) {
                                return false;
                            }

                            @Override // p067l.InterfaceC14577
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo6049(C13457 c13457, boolean z) {
                                Spinner spinner2 = null;
                                int i12 = 808916233;
                                int i13 = C1053.f81965;
                                int i14 = C1028.f81950;
                                int iM559711 = (C0946.m55979("֡ۜ") + i14) * 81;
                                int i15 = ((iM559711 ^ i13) * 20203) ^ 2122693533;
                                int i16 = 2125473830;
                                while (true) {
                                    i12 = ((((i12 ^ i13) * (-10091)) >> 31) & i15) ^ (iM559711 ^ i16);
                                    switch (i12) {
                                        case -1998358505:
                                        case -1631228664:
                                            if (C1124.f82007 >= 0) {
                                                iM559711 = (i13 - C0946.m55979("ܶ᩵")) * (-81);
                                                i15 = ((iM559711 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            } else {
                                                iM559711 = C0873.m55680("۫ۢ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-13977)) ^ (-2105830672);
                                                i16 = -747069113;
                                            }
                                            break;
                                        case -1978679658:
                                        case -39222706:
                                            if (!C1024.f81946) {
                                                iM559711 = (i14 - C0946.m55979("֫᩻")) * (-33);
                                                i15 = ((iM559711 ^ i13) * 24631) ^ (-1409727577);
                                                i16 = -2013492157;
                                            } else {
                                                iM559711 = C0873.m55680("ܰܿ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-15807)) ^ 188434124;
                                                i16 = -1178748301;
                                            }
                                            break;
                                        case -1875379815:
                                        case 221231998:
                                            C13120.m30017(this.f17529, spinner2, iM56179, c13457, z);
                                            break;
                                        case -1785199510:
                                        case 971712232:
                                            if (C1028.m56247() < 0) {
                                                iM559711 = C0946.m55979("᩺֫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-28725)) ^ 84636662;
                                                i16 = -1014257402;
                                            } else {
                                                iM559711 = (i13 - C0946.m55979("ܶ᩵")) * (-81);
                                                i15 = ((iM559711 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            }
                                            break;
                                        case -1548920165:
                                        case -324874272:
                                            if (C0863.f81833 <= 0) {
                                                iM559711 = (i13 - C0946.m55979("ܶ᩵")) * (-81);
                                                i15 = ((iM559711 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            } else {
                                                iM559711 = C0946.m55979("۫֡") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-3903)) ^ (-689464617);
                                                i16 = -1951838556;
                                            }
                                            break;
                                        case -1440276445:
                                        case -783709035:
                                            C0906.m55809();
                                            break;
                                        case -1276882090:
                                        case -1074414694:
                                            if (C0861.m55626()) {
                                                iM559711 = (i13 - C0873.m55680("᩺ۨ")) * (-39);
                                                i15 = ((iM559711 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            } else {
                                                iM559711 = (i14 - C0873.m55680("ۖ᩸")) * (-103);
                                                i15 = ((iM559711 ^ i13) * 6809) ^ (-1069747355);
                                                i16 = 1899599350;
                                            }
                                            break;
                                        case -1247726347:
                                        case 1335062003:
                                            if (C0873.f81841 <= 0) {
                                                iM559711 = (i13 - C0873.m55680("᩺ۨ")) * (-39);
                                                i15 = ((iM559711 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            } else {
                                                iM559711 = C0946.m55979("ۗ֫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 23915) ^ (-424621343);
                                                i16 = 113802190;
                                            }
                                            break;
                                        case -791475267:
                                        case -137053601:
                                            if (C0906.f81862 >= 0) {
                                                iM559711 = C0873.m55680("ܰܿ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-15807)) ^ 188434124;
                                                i16 = -1178748301;
                                            } else {
                                                iM559711 = (i13 - C0946.m55979("ܶ᩵")) * (-81);
                                                i15 = ((iM559711 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            }
                                            break;
                                        case -547089255:
                                        case 1230581271:
                                            AbstractC0942.m55971();
                                            iM559711 = (i13 - C0946.m55979("ܶ᩵")) * (-81);
                                            i15 = ((iM559711 ^ i14) * (-4683)) ^ 1724467580;
                                            i16 = -1099982702;
                                            break;
                                        case -419870963:
                                        case -192556800:
                                            if (ViewOnClickListenerC0939.m55941() >= 0) {
                                                iM559711 = (i14 - C0946.m55979("֫᩻")) * (-33);
                                                i15 = ((iM559711 ^ i13) * 24631) ^ (-1409727577);
                                                i16 = -2013492157;
                                            } else {
                                                iM559711 = C0873.m55680("ܽ۟") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-14537)) ^ (-375651162);
                                                i16 = -1128286595;
                                            }
                                            break;
                                        case -379029117:
                                        case -196519322:
                                            if (C0894.f81854 >= 0) {
                                                iM559711 = (i13 - C0946.m55979("ܶ᩵")) * (-81);
                                                i15 = ((iM559711 ^ i14) * (-4683)) ^ 1724467580;
                                                i16 = -1099982702;
                                            } else {
                                                iM559711 = C0946.m55979("ܰۘ") ^ i13;
                                                i15 = ((iM559711 ^ i14) * 7107) ^ (-397794174);
                                                i16 = 1149789651;
                                            }
                                            break;
                                        case -271974211:
                                        case -203467021:
                                            if (C1036.m56257() <= 0) {
                                                iM559711 = C0946.m55979("᩺֫") ^ i13;
                                                i15 = ((iM559711 ^ i14) * (-28725)) ^ 84636662;
                                                i16 = -1014257402;
                                            } else {
                                                iM559711 = (C0946.m55979("ܳܶ") ^ i13) * 15;
                                                i15 = ((iM559711 ^ i14) * (-15727)) ^ (-686882207);
                                                i16 = 1161547588;
                                            }
                                            break;
                                        case 1027009984:
                                        case 1414261281:
                                            spinner2 = spinner;
                                            if (RunnableC0897.f81856) {
                                                iM559711 = C0946.m55979("ۧۜ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-8075)) ^ 1650731295;
                                                i16 = -152146519;
                                            } else {
                                                iM559711 = (i13 - C0873.m55680("᩺ۨ")) * (-39);
                                                i15 = ((iM559711 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            }
                                            break;
                                        case 1748300350:
                                        case 1892985171:
                                            if (AbstractC0942.f81890 <= 0) {
                                                iM559711 = (i13 - C0873.m55680("᩺ۨ")) * (-39);
                                                i15 = ((iM559711 ^ i14) * 24921) ^ 1215944303;
                                                i16 = -69578716;
                                            } else {
                                                iM559711 = C0946.m55979("᩵ܳ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-6823)) ^ (-1755616746);
                                                i16 = -2145176394;
                                            }
                                            break;
                                        default:
                                            if (AbstractC0942.m55971()) {
                                                iM559711 = C0873.m55680("ܰܿ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * (-15807)) ^ 188434124;
                                                i16 = -1178748301;
                                            } else {
                                                iM559711 = C0946.m55979("ۜܶ") ^ i14;
                                                i15 = ((iM559711 ^ i13) * 13935) ^ (-1305273214);
                                                i16 = -1971626785;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        }, C1929.m56560(c18107), str);
                        break;
                    case -574619220:
                    case 2122954595:
                        i5 = i5;
                        if (iM56179 > 0) {
                            iM55979 = C0873.m55680("ۜۧ") ^ i7;
                            i = ((iM55979 ^ i6) * (-3009)) ^ 540778114;
                            i2 = -1818834907;
                        } else {
                            iM55979 = C0873.m55680("᩷ۗ") ^ i6;
                            i = ((iM55979 ^ i7) * 2701) ^ (-805517933);
                            i2 = 1853614355;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -528962997:
                    case 906284316:
                        i5 = i5;
                        strM55707 = C0877.m55707(f82148, 56, 3, i4);
                        if (C0845.f81821 >= 0) {
                            iM55979 = (C0946.m55979("᩷ܺ") ^ i6) * (-119);
                            i = ((iM55979 ^ i7) * 16961) ^ 1584059608;
                            i2 = -477794544;
                        } else {
                            iM55979 = C0946.m55979("ᩴܳ") ^ i7;
                            i = ((iM55979 ^ i6) * (-7823)) ^ 1167055033;
                            i2 = 1118030094;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -522864209:
                    case -416890751:
                        f36861 = C0863.m55639(C1046.m56288(editText));
                        int iM559711 = C0946.m55979("۟ۘ") ^ i6;
                        i5 = i5;
                        i8 = ((iM559711 ^ i7) * 15935) ^ 550998585;
                        i10 = iM559711 ^ 1492852827;
                        i5 = i5;
                        break;
                    case -486484166:
                    case 946193172:
                        i5 = i5;
                        strM55618 = C0861.m55618(f82148, 62, 3, i4);
                        if (C0947.m55997()) {
                            iM55979 = (C0873.m55680("᩺ۡ") + i6) * 91;
                            i = ((iM55979 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM55979 = (C0946.m55979("ۧۗ") ^ i7) * (-27);
                            i = ((iM55979 ^ i6) * 18917) ^ (-400383735);
                            i2 = -234876502;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -355753288:
                    case -274435885:
                        i5 = i5;
                        i3 = (s * 2) + 1;
                        if (C0882.f81846) {
                            iM55979 = (C0873.m55680("᩷᩶") + i7) * (-9);
                            i = ((iM55979 ^ i6) * 25951) ^ (-574318176);
                            i2 = 1014653960;
                        } else {
                            iM55979 = (i7 - C0873.m55680("ܶ᩻")) * (-65);
                            i = ((iM55979 ^ i6) * 13257) ^ 9109935;
                            i2 = -1533653905;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -308127085:
                    case 821722840:
                        f36862 = C0863.m55639(C0989.m56089(editText));
                        int iM559712 = C0946.m55979("۟ۘ") ^ i6;
                        i5 = i5;
                        i8 = ((iM559712 ^ i7) * 15935) ^ 550998585;
                        i10 = iM559712 ^ 1492852827;
                        i5 = i5;
                        break;
                    case -250972023:
                    case 1252591433:
                        i5 = i5;
                        if (C1124.f82007 >= 0) {
                            iM55979 = (C0873.m55680("᩺ۡ") + i6) * 91;
                            i = ((iM55979 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM55979 = C0873.m55680("֨ۜ") ^ i7;
                            i = ((iM55979 ^ i6) * (-1557)) ^ 831873609;
                            i2 = 1987336964;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -160207588:
                    case 1513367205:
                        i5 = i5;
                        if (C0882.m55713()) {
                            iM55979 = (i6 - C0946.m55979("ۢܳ")) * 35;
                            i = ((iM55979 ^ i7) * (-12675)) ^ (-1209350571);
                            i2 = 133204669;
                        } else {
                            iM55979 = C0946.m55979("᩹ۧ") ^ i7;
                            i = ((iM55979 ^ i6) * (-15009)) ^ (-1435343818);
                            i2 = -1101207734;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case -30409496:
                    case 1912476598:
                        i5 = i5;
                        if (C1012.m56134() <= 0) {
                            iM55979 = (C0873.m55680("᩺ۡ") + i6) * 91;
                            i = ((iM55979 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                        } else {
                            iM55979 = C0873.m55680("֫᩺") ^ i6;
                            i = ((iM55979 ^ i7) * 25373) ^ 1663988193;
                            i2 = 855060345;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 62325528:
                    case 968217864:
                        i4 = 19915;
                        iM55979 = (i6 - C0873.m55680("֡ܺ")) * 95;
                        i = ((iM55979 ^ i7) * (-17513)) ^ 1573277505;
                        i2 = 656033053;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 148176281:
                    case 2005040177:
                        C1229.m56410();
                        C1012.m56134();
                        break;
                    case 284269137:
                    case 971258416:
                        C0989.m56095();
                        if (C1229.f82066 < 0) {
                            i5 = i5;
                            iM55979 = (C0873.m55680("᩺ۡ") + i6) * 91;
                            i = ((iM55979 ^ i7) * 28489) ^ 1323464573;
                            i2 = 347184344;
                            i10 = iM55979 ^ i2;
                            i8 = i;
                            i5 = i5;
                        }
                        i5 = i5;
                        iM55979 = (C0873.m55680("۫֡") ^ i6) * (-57);
                        i = ((iM55979 ^ i7) * (-5127)) ^ (-1952642564);
                        i2 = -1313439002;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 439664548:
                    case 1711222974:
                        C1024.m56202(C0873.m55680(strM56189) ^ 2124611995);
                        break;
                    case 832639071:
                    case 1905839610:
                        if (C1017.f81942 >= 0) {
                            iM559710 = (i7 - C0946.m55979("᩻ۖ")) * 73;
                            i8 = ((iM559710 ^ i6) * (-2543)) ^ (-972307846);
                            i9 = -758330851;
                        }
                        i5 = i5;
                        iM55979 = (C0873.m55680("᩷᩶") + i7) * (-9);
                        i = ((iM55979 ^ i6) * 25951) ^ (-574318176);
                        i2 = 1014653960;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 868271192:
                    case 1586365390:
                        C1071.m56343();
                        i5 = i5;
                        iM55979 = (C0873.m55680("᩷᩶") + i7) * (-9);
                        i = ((iM55979 ^ i6) * 25951) ^ (-574318176);
                        i2 = 1014653960;
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                    case 1817276802:
                    case 1972685998:
                        C0917.m55842(C0946.m55979(strM55618) ^ 2118985624);
                        break;
                    default:
                        i5 = i5;
                        if (spinner.getSelectedItemPosition() == 0) {
                            iM55979 = C0873.m55680("ۚ᩷") ^ i7;
                            i = ((iM55979 ^ i6) * 26775) ^ 2024583679;
                            i2 = -1197375011;
                        } else {
                            iM55979 = (i6 - C0873.m55680("ۛ֨")) * 109;
                            i = ((iM55979 ^ i7) * 27539) ^ (-1510031854);
                            i2 = -613887709;
                        }
                        i10 = iM55979 ^ i2;
                        i8 = i;
                        i5 = i5;
                        break;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30017(C13120 c13120, Spinner spinner, int i, C13457 c13457, boolean z) {
        int iM55979;
        int i2;
        int i3;
        int iM55680;
        int i4;
        C13120 c13121 = c13120;
        int i5 = C0877.f81843;
        int i6 = ServiceConnectionC1013.f81940;
        int iM55681 = (i5 - C0873.m55680("᩹۟")) * (-75);
        int i7 = ((iM55681 ^ i6) * (-8223)) ^ 612164303;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM55681 ^ 1970596239;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        char c = 0;
        int i11 = -113050739;
        int i12 = 0;
        C18107 c18107 = null;
        short[] sArr4 = null;
        int i13 = 0;
        String strM55592 = null;
        String strM55667 = null;
        String strM56086 = null;
        C3313 c3313 = null;
        int selectedItemPosition = 0;
        while (true) {
            i11 = i8 ^ (i7 & (((i11 ^ i6) * (-5113)) >> 31));
            switch (i11) {
                case -1914525972:
                case -863505099:
                    selectedItemPosition = selectedItemPosition;
                    sArr = f82148;
                    c = 25;
                    if (!C0882.f81846) {
                        iM55680 = (C0946.m55979("۟ۖ") ^ i5) * 53;
                        i7 = ((iM55680 ^ i6) * 17163) ^ 495872440;
                        i4 = 1263135046;
                        int i14 = iM55680 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i14;
                        c13121 = c13120;
                    }
                    selectedItemPosition = selectedItemPosition;
                    int iM55682 = C0873.m55680("ܺۡ") ^ i5;
                    i7 = ((iM55682 ^ i6) * 5049) ^ (-227687872);
                    i8 = iM55682 ^ (-1647350085);
                    c13121 = c13120;
                    break;
                case -1889459953:
                case 2140732274:
                    if (C0898.m55800() <= 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM55979 = C0873.m55680("ۚ۟") ^ i6;
                        i2 = ((iM55979 ^ i5) * 31695) ^ 1293287960;
                        i3 = 1433921616;
                        int i15 = selectedItemPosition;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i15;
                    } else {
                        int iM559710 = C0946.m55979("֡ۚ") ^ i5;
                        i8 = iM559710 ^ (-1824818231);
                        i7 = ((iM559710 ^ i6) * (-23561)) ^ 1872399067;
                    }
                    break;
                case -1818443720:
                case 1970573588:
                    i10 = 60200;
                    iM55680 = (C0873.m55680("᩹֡") + i5) * 17;
                    i7 = ((iM55680 ^ i6) * (-13105)) ^ 136029372;
                    i4 = 1671719362;
                    int i16 = iM55680 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i16;
                    c13121 = c13120;
                    break;
                case -1600675803:
                case -1182742939:
                    C0866.m55645();
                    if (C1012.f81938 >= 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM55680 = C0946.m55979("ۡܳ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 5389) ^ 1415120266;
                        i4 = -1261856572;
                        int i17 = iM55680 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i17;
                        c13121 = c13120;
                    } else {
                        int iM559711 = C0946.m55979("֡ۚ") ^ i5;
                        i8 = iM559711 ^ (-1824818231);
                        i7 = ((iM559711 ^ i6) * (-23561)) ^ 1872399067;
                    }
                    break;
                case -1510169714:
                case 300606629:
                    c3313.m5773(i, strM55592);
                    C18107 c18108 = c13121.f36865;
                    c3313.m5783(c18108);
                    if (C1028.f81950 <= 0) {
                        c18107 = c18108;
                        int iM55683 = C0873.m55680("ܺۡ") ^ i5;
                        i7 = ((iM55683 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM55683 ^ (-1647350085);
                        c13121 = c13120;
                    } else {
                        int iM55684 = (C0873.m55680("ۧܰ") + i6) * (-69);
                        i7 = ((iM55684 ^ i5) * 14687) ^ 479162620;
                        i8 = iM55684 ^ 398821969;
                        c18107 = c18108;
                    }
                    break;
                case -1377957169:
                case 308813180:
                    selectedItemPosition = selectedItemPosition;
                    RunnableC0938.m55930(c3313, C0894.m55773(sArr2, i13, 4, i10), strM56086);
                    sArr4 = f82148;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0873.m55680("ۚ۟") ^ i6;
                        i2 = ((iM55979 ^ i5) * 31695) ^ 1293287960;
                        i3 = 1433921616;
                    } else {
                        iM55979 = C0946.m55979("ۜۘ") ^ i5;
                        i2 = ((iM55979 ^ i6) * (-23663)) ^ (-833595964);
                        i3 = -174859583;
                    }
                    int i18 = selectedItemPosition;
                    i8 = iM55979 ^ i3;
                    i7 = i2;
                    selectedItemPosition = i18;
                    break;
                case -740652777:
                case 1878975276:
                    selectedItemPosition = selectedItemPosition;
                    if (i12 - (s * 6862) >= 0) {
                        iM55680 = (C0873.m55680("᩻ۗ") ^ i6) * (-119);
                        i7 = ((iM55680 ^ i5) * 21423) ^ (-741212589);
                        i4 = -1354281416;
                    } else {
                        iM55680 = (i6 - C0946.m55979("᩺ᩳ")) * (-55);
                        i7 = ((iM55680 ^ i5) * (-753)) ^ 236273438;
                        i4 = 1991423156;
                    }
                    int i19 = iM55680 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i19;
                    c13121 = c13120;
                    break;
                case -459430635:
                case 1272411475:
                    selectedItemPosition = selectedItemPosition;
                    strM56086 = C0989.m56086(c13121.f36868);
                    sArr2 = f82148;
                    i13 = 26;
                    if (!C1024.f81946) {
                        iM55979 = (i6 - C0946.m55979("֡ᩴ")) * 53;
                        i2 = ((iM55979 ^ i5) * (-11621)) ^ 1004065319;
                        i3 = -1561182418;
                        int i110 = selectedItemPosition;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i110;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        int iM55685 = C0873.m55680("ܺۡ") ^ i5;
                        i7 = ((iM55685 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM55685 ^ (-1647350085);
                        c13121 = c13120;
                    }
                    break;
                case -342260528:
                case 984686668:
                    selectedItemPosition = selectedItemPosition;
                    if (C0912.m55833()) {
                        iM55680 = C0946.m55979("ۡܳ") ^ i5;
                        i7 = ((iM55680 ^ i6) * 5389) ^ 1415120266;
                        i4 = -1261856572;
                    } else {
                        iM55680 = C0873.m55680("᩵֫") ^ i6;
                        i7 = ((iM55680 ^ i5) * 24573) ^ 154650646;
                        i4 = 1628858954;
                    }
                    int i111 = iM55680 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i111;
                    c13121 = c13120;
                    break;
                case -85062784:
                case 282325879:
                    selectedItemPosition = spinner.getSelectedItemPosition();
                    int i20 = C16723.f49313;
                    c3313 = new C3313(C4402.class);
                    if (C1053.f81965 <= 0) {
                        int iM55686 = C0873.m55680("ܺۡ") ^ i5;
                        i7 = ((iM55686 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM55686 ^ (-1647350085);
                    } else {
                        int iM559712 = C0946.m55979("ܺۙ") ^ i5;
                        i8 = iM559712 ^ 1792170455;
                        i7 = ((iM559712 ^ i6) * 24371) ^ 1493707824;
                    }
                    c13121 = c13120;
                    break;
                case 327193153:
                case 509178555:
                    C0892.m55749();
                    if (AbstractC0942.f81890 > 0) {
                        selectedItemPosition = selectedItemPosition;
                        iM55680 = C0946.m55979("ۘۘ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                        int i112 = iM55680 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i112;
                        c13121 = c13120;
                    } else {
                        selectedItemPosition = selectedItemPosition;
                        iM55979 = C0873.m55680("ۚ۟") ^ i6;
                        i2 = ((iM55979 ^ i5) * 31695) ^ 1293287960;
                        i3 = 1433921616;
                        int i113 = selectedItemPosition;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i113;
                    }
                    break;
                case 485825498:
                case 1036711828:
                    selectedItemPosition = selectedItemPosition;
                    s = sArr[c];
                    i12 = (s * s) + 11771761;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("ۘۘ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                    } else {
                        iM55680 = C0946.m55979("ۧ֨") ^ i5;
                        i7 = ((iM55680 ^ i6) * (-2721)) ^ 70433167;
                        i4 = 1570064555;
                    }
                    int i114 = iM55680 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i114;
                    c13121 = c13120;
                    break;
                case 494195853:
                case 905214586:
                    C1071.m56343();
                    C0894.m55769();
                    break;
                case 925546130:
                case 1571822604:
                    c3313.m5775(C1964.m56594(c18107), c13457);
                    sArr3 = f82148;
                    if (C0845.f81821 >= 0) {
                        selectedItemPosition = selectedItemPosition;
                        i9 = 37;
                        iM55680 = C0946.m55979("ۘۘ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                        int i115 = iM55680 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i115;
                        c13121 = c13120;
                    } else {
                        int iM559713 = C0946.m55979("֫ۡ") ^ i6;
                        int i21 = ((iM559713 ^ i5) * 5017) ^ (-274348648);
                        i8 = iM559713 ^ 1118869061;
                        i7 = i21;
                        i9 = 37;
                    }
                    break;
                case 981884587:
                case 1901295794:
                    C1404.m56468();
                    int iM559714 = C0946.m55979("֡ۚ") ^ i5;
                    i8 = iM559714 ^ (-1824818231);
                    i7 = ((iM559714 ^ i6) * (-23561)) ^ 1872399067;
                    break;
                case 1214246123:
                case 1391999347:
                    c3313.m5773(selectedItemPosition, strM55667);
                    selectedItemPosition = selectedItemPosition;
                    strM55592 = C0845.m55592(f82148, 34, 3, i10);
                    if (C0898.f81858 > 0) {
                        iM55979 = (C0873.m55680("ۖᩴ") + i5) * 79;
                        i2 = ((iM55979 ^ i6) * 31345) ^ 1818543006;
                        i3 = 1330527867;
                        int i116 = selectedItemPosition;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i116;
                    } else {
                        iM55680 = C0946.m55979("ۘۘ") ^ i6;
                        i7 = ((iM55680 ^ i5) * (-3205)) ^ (-483492574);
                        i4 = 1670778751;
                        int i117 = iM55680 ^ i4;
                        selectedItemPosition = selectedItemPosition;
                        i8 = i117;
                        c13121 = c13120;
                    }
                    break;
                case 1256660677:
                case 2078022560:
                    selectedItemPosition = selectedItemPosition;
                    strM55667 = RunnableC0871.m55667(sArr4, 30, 4, i10);
                    if (!C0937.f81884) {
                        selectedItemPosition = selectedItemPosition;
                        int iM55687 = C0873.m55680("ܺۡ") ^ i5;
                        i7 = ((iM55687 ^ i6) * 5049) ^ (-227687872);
                        i8 = iM55687 ^ (-1647350085);
                        c13121 = c13120;
                    } else {
                        iM55979 = C0946.m55979("֨᩵") ^ i6;
                        i2 = ((iM55979 ^ i5) * (-18851)) ^ (-1155785288);
                        i3 = -1106311730;
                        int i118 = selectedItemPosition;
                        i8 = iM55979 ^ i3;
                        i7 = i2;
                        selectedItemPosition = i118;
                    }
                    break;
                case 1393745259:
                case 1640169115:
                    i10 = 41922;
                    iM55680 = (C0873.m55680("᩹֡") + i5) * 17;
                    i7 = ((iM55680 ^ i6) * (-13105)) ^ 136029372;
                    i4 = 1671719362;
                    int i119 = iM55680 ^ i4;
                    selectedItemPosition = selectedItemPosition;
                    i8 = i119;
                    c13121 = c13120;
                    break;
                default:
                    C0854.m55600(c3313, C0890.m55726(sArr3, i9, 15, i10), z);
                    c3313.m5772();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01a3  */
    /* JADX INFO: renamed from: ۧ */
    public static void m30020(C19561 c19561, C10844 c10844, int i, C4402 c4402) throws Exception {
        int i2;
        int iM55979;
        int i3;
        int i4;
        C19561 c19562;
        int iM55680;
        int i5;
        int i6;
        int i7;
        C4402 c4403;
        int i8;
        int i9;
        Exception exc;
        int i10;
        int i11;
        List list;
        int iM55681;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iM55682;
        int i18;
        int i19;
        int iM55683;
        int i20;
        int i21;
        List list2;
        C19561 c19563 = c19561;
        c10844 = c10844;
        c4402 = c4402;
        int i22 = C1025.f81947;
        int i23 = RunnableC0871.f81839;
        int iM559710 = C0946.m55979("ܿ֨") ^ i22;
        int i24 = ((iM559710 ^ i23) * (-9215)) ^ (-327436823);
        C19226[] c19226Arr = null;
        C15484[] c15484Arr = null;
        ArrayList arrayList = null;
        List list3 = null;
        InterfaceC4527[] interfaceC4527ArrM9875 = null;
        Iterator itM56090 = null;
        C5738 c5738 = null;
        Exception exc2 = null;
        int i25 = iM559710 ^ 358091475;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iM56303 = 0;
        char c = 0;
        char c2 = 0;
        int i29 = 0;
        boolean zM56007 = false;
        int i30 = 0;
        boolean zM56195 = false;
        C9873[] c9873Arr = null;
        boolean zM55886 = false;
        int i31 = 0;
        HashSet hashSet = null;
        C18555 c18555 = null;
        int[] iArr = null;
        Iterator itM56091 = null;
        int i32 = 0;
        int i33 = -2021816213;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i33 = i25 ^ (i24 & (((i33 ^ i23) * 9381) >> 31));
            switch (i33) {
                case -2088247309:
                case -1450965979:
                    if (!zM56007) {
                        iM55683 = C0873.m55680("ܽܽ") ^ i23;
                        i5 = ((iM55683 ^ i22) * (-25709)) ^ (-377095232);
                        i20 = 687714618;
                        i25 = i20 ^ iM55683;
                        i24 = i5;
                        i33 = i33;
                    } else {
                        i8 = i34;
                        i9 = i26;
                        exc = exc2;
                        i10 = i27;
                        i11 = iM56303;
                        list = list3;
                        iM55681 = C0873.m55680("֨֨") ^ i23;
                        i12 = ((iM55681 ^ i22) * 13121) ^ (-2011758469);
                        i13 = -1836790105;
                        i25 = i13 ^ iM55681;
                        c10844 = c10844;
                        c4402 = c4402;
                        i24 = i12;
                        list3 = list;
                        i33 = i33;
                        i26 = i9;
                        exc2 = exc;
                        i27 = i10;
                        i34 = i8;
                        iM56303 = i11;
                        c19563 = c19561;
                    }
                    break;
                case -2005332966:
                case 931524154:
                    i28++;
                    c19562 = c19563;
                    i29 = i30;
                    i27 = 1;
                    int iM559711 = (C0946.m55979("ۖ᩺") ^ i23) * (-3);
                    i5 = ((iM559711 ^ i22) * (-27637)) ^ (-788981951);
                    i7 = iM559711 ^ (-362481840);
                    c10844 = c10844;
                    c4402 = c4402;
                    c19563 = c19562;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1632403264:
                case -458509248:
                    C0898.m55798(c4402, C0873.m55680(C0863.m55635(f82148, 96, 3, i34)) ^ 2128753160);
                    RunnableC0938.m55934(arrayList);
                    iArr[i32] = i32;
                    i30 = i31;
                    iM55683 = (i22 - C0946.m55979("᩺᩷")) * (-77);
                    i5 = ((iM55683 ^ i23) * (-13751)) ^ (-709543849);
                    i20 = -61829878;
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1472874600:
                case 20750211:
                    zM55886 = C0930.m55886(itM56091);
                    iM55683 = C0946.m55979("ۡۢ") ^ i23;
                    i5 = ((iM55683 ^ i22) * 9399) ^ (-1812063207);
                    i20 = 907796288;
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1460702211:
                case -69286605:
                    if (zM56195) {
                        i30 = i29;
                        iM55683 = (i22 - C0946.m55979("᩺᩷")) * (-77);
                        i5 = ((iM55683 ^ i23) * (-13751)) ^ (-709543849);
                        i20 = -61829878;
                    } else {
                        iM55683 = C0946.m55979("ܽ۫") ^ i23;
                        i5 = ((iM55683 ^ i22) * 2089) ^ (-1905514619);
                        i20 = 1340449954;
                    }
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1344209714:
                case -402317294:
                    if (zM55886) {
                        iM55683 = C0873.m55680("ۚᩴ") ^ i22;
                        i5 = ((iM55683 ^ i23) * 30479) ^ (-1695790396);
                        i20 = -896894367;
                    } else {
                        iM55683 = (i22 - C0946.m55979("ۖۧ")) * (-103);
                        i5 = ((iM55683 ^ i23) * (-1749)) ^ (-1740380495);
                        i20 = 51020668;
                    }
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1338884250:
                case 777335657:
                    HashSet hashSet2 = new HashSet();
                    C18555 c18556 = new C18555();
                    C19226[] c19226Arr2 = {new C19226()};
                    ArrayList arrayList2 = new ArrayList();
                    c19562 = c19561;
                    List listM44449 = c19562.m44449(false);
                    c9873Arr = new C9873[]{null};
                    arrayList = arrayList2;
                    hashSet = hashSet2;
                    c18555 = c18556;
                    c15484Arr = new C15484[]{null};
                    c19226Arr = c19226Arr2;
                    iArr = new int[]{0};
                    interfaceC4527ArrM9875 = C4654.m9875(c19562, listM44449);
                    iM56303 = C1048.m56303(listM44449);
                    i27 = 1;
                    i28 = 0;
                    i29 = 0;
                    list3 = listM44449;
                    int iM559712 = (C0946.m55979("ۖ᩺") ^ i23) * (-3);
                    i5 = ((iM559712 ^ i22) * (-27637)) ^ (-788981951);
                    i7 = iM559712 ^ (-362481840);
                    c10844 = c10844;
                    c4402 = c4402;
                    c19563 = c19562;
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
                    iM55683 = C0873.m55680("᩺ۙ") ^ i23;
                    i5 = ((iM55683 ^ i22) * 11377) ^ 1886194156;
                    i20 = 2068070051;
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1319850747:
                case 936405909:
                    c4403 = c4402;
                    C0898.m55798(c4403, C0946.m55979(C1028.m56235(f82148, 78, 3, i34)) ^ 2103088848);
                    itM56090 = C0989.m56090(arrayList);
                    i35 = i29;
                    c2 = 0;
                    int iM559713 = C0946.m55979("ۛ᩷") ^ i22;
                    i5 = ((iM559713 ^ i23) * 18805) ^ (-408592274);
                    i7 = iM559713 ^ (-663472836);
                    c4402 = c4403;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM56303 = iM56303;
                    c19563 = c19561;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1305763928:
                case 115357891:
                    zM56195 = C1017.m56195(arrayList);
                    iM55683 = C0873.m55680("۫۟") ^ i23;
                    i5 = ((iM55683 ^ i22) * 18429) ^ (-2074726288);
                    i20 = 823415046;
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1292169089:
                case 192823964:
                    C15484 c15484 = (C15484) C0955.m56035(itM56090);
                    i35++;
                    String strM40987 = C18010.m40987(i35);
                    C0946.m55981(c4402, strM40987);
                    m30016(c10844, c15484.m35229(c4402), strM40987);
                    c4403 = c4402;
                    int iM559714 = C0946.m55979("ۛ᩷") ^ i22;
                    i5 = ((iM559714 ^ i23) * 18805) ^ (-408592274);
                    i7 = iM559714 ^ (-663472836);
                    c4402 = c4403;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM56303 = iM56303;
                    c19563 = c19561;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1195220494:
                case -490931565:
                    if (i26 > 20971520) {
                        iM55683 = C0873.m55680("ۘܰ") ^ i22;
                        i5 = ((iM55683 ^ i23) * (-3009)) ^ (-1573614067);
                        i20 = 1185711389;
                    } else {
                        i30 = i29;
                        iM55683 = (i22 - C0946.m55979("᩺᩷")) * (-77);
                        i5 = ((iM55683 ^ i23) * (-13751)) ^ (-709543849);
                        i20 = -61829878;
                    }
                    i25 = i20 ^ iM55683;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1188931989:
                case 1834738044:
                    StringBuilder sb = new StringBuilder();
                    C1003.m56121(sb, C1071.m56350(exc2));
                    C1003.m56121(sb, ViewOnClickListenerC0939.m55947(f82148, 81, 2, i34));
                    C1003.m56121(sb, C1028.m56241(c5738));
                    C0912.m55825(sb, RunnableC0897.m55783(f82148, 83, 1, i34));
                    throw new Exception(C0845.m55591(sb), exc2);
                case -1080275096:
                case -664126001:
                    int i36 = i26;
                    Exception exc3 = exc2;
                    int i37 = i27;
                    List list4 = list3;
                    C4402 c4404 = c4402;
                    c = 0;
                    if (i28 < iM56303) {
                        iM55680 = C0946.m55979("᩶ۘ") ^ i23;
                        i5 = ((iM55680 ^ i22) * (-16475)) ^ 500913717;
                        i6 = -1890378807;
                    } else {
                        iM55680 = (C0873.m55680("ۗۚ") ^ i22) * (-93);
                        i5 = ((iM55680 ^ i23) * (-12629)) ^ (-733178233);
                        i6 = 490422399;
                    }
                    i7 = iM55680 ^ i6;
                    c4402 = c4404;
                    list3 = list4;
                    i26 = i36;
                    exc2 = exc3;
                    i27 = i37;
                    c19563 = c19561;
                    i25 = i7;
                    i24 = i5;
                    i33 = i33;
                    break;
                case -1032873710:
                case 1471484650:
                    i2 = 51139;
                    int iM559715 = C0946.m55979("֫ۛ") ^ i22;
                    int i38 = ((iM559715 ^ i23) * (-23645)) ^ (-420356167);
                    c10844 = c10844;
                    c4402 = c4402;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM559715 ^ (-623754220);
                    c19563 = c19563;
                    i33 = i33;
                    i34 = i2;
                    i24 = i38;
                    break;
                case -878182534:
                case 1041061206:
                    try {
                        C15484 c15485 = (C15484) C0955.m56035(itM56091);
                        int i39 = i31 + 1;
                        String strM40988 = C18010.m40987(i39);
                        C0873.m55686(c4402, strM40988);
                        m30016(c10844, c15485.m35229(c4402), strM40988);
                        i31 = i39;
                        iM55683 = C0873.m55680("۟ܳ") ^ i22;
                        i5 = ((iM55683 ^ i23) * 24235) ^ 1419489481;
                        i20 = -172260774;
                        i25 = i20 ^ iM55683;
                        i24 = i5;
                        i33 = i33;
                    } catch (Exception e) {
                        exc2 = e;
                        i14 = i34;
                        i21 = i26;
                        i15 = i27;
                        i16 = i28;
                        i17 = iM56303;
                        list2 = list3;
                        int iM55684 = C0873.m55680("֡۟") ^ i22;
                        i25 = (-1713596977) ^ iM55684;
                        i24 = ((iM55684 ^ i23) * (-25083)) ^ (-1571534693);
                        list3 = list2;
                        i26 = i21;
                        i27 = i15;
                        i34 = i14;
                        iM56303 = i17;
                        i28 = i16;
                        c19563 = c19561;
                    }
                    break;
                case -759180139:
                case -505467529:
                    int i40 = i34;
                    int i41 = i26;
                    Exception exc4 = exc2;
                    int i42 = i27;
                    C4402 c4405 = c4402;
                    C19561 c19564 = c19563;
                    List list5 = list3;
                    short s = f82148[77];
                    int i43 = (s * s) + 47610000;
                    int i44 = s + 6900;
                    if ((i44 * i44) - (i43 + i43) <= 0) {
                        iM55979 = (i23 - C0873.m55680("ۨ۟")) * (-103);
                        i3 = ((iM55979 ^ i22) * 12105) ^ 1266785123;
                        i4 = -895973484;
                    } else {
                        iM55979 = C0946.m55979("۠֨") ^ i22;
                        i3 = ((iM55979 ^ i23) * (-25155)) ^ 487182362;
                        i4 = 921207351;
                    }
                    c10844 = c10844;
                    c4402 = c4405;
                    list3 = list5;
                    i26 = i41;
                    exc2 = exc4;
                    i27 = i42;
                    i25 = iM55979 ^ i4;
                    i24 = i3;
                    c19563 = c19564;
                    i33 = i33;
                    i34 = i40;
                    break;
                case -702628797:
                case 934656298:
                    C1028.m56239(c4402, C0873.m55680(C0949.m56016(f82148, 93, 3, i34)) ^ 2124293635);
                    itM56091 = C0989.m56090(arrayList);
                    i31 = i29;
                    iM55683 = C0873.m55680("۟ܳ") ^ i22;
                    i5 = ((iM55683 ^ i23) * 24235) ^ 1419489481;
                    i20 = -172260774;
                    i25 = i20 ^ iM55683;
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
                    i11 = iM56303;
                    list = list3;
                    c5738 = (C5738) C1929.m56563(list, i28);
                    if (C0949.m56007(c4402)) {
                        iM55681 = C0873.m55680("֨֨") ^ i23;
                        i12 = ((iM55681 ^ i22) * 13121) ^ (-2011758469);
                        i13 = -1836790105;
                    } else {
                        iM55681 = C0873.m55680("֫ۢ") ^ i23;
                        i12 = ((iM55681 ^ i22) * 26825) ^ (-748074799);
                        i13 = -1076585808;
                    }
                    i25 = i13 ^ iM55681;
                    c10844 = c10844;
                    c4402 = c4402;
                    i24 = i12;
                    list3 = list;
                    i33 = i33;
                    i26 = i9;
                    exc2 = exc;
                    i27 = i10;
                    i34 = i8;
                    iM56303 = i11;
                    c19563 = c19561;
                    break;
                case 640668552:
                case 2065394788:
                    try {
                        Object[] objArr = new Object[i27];
                        objArr[c] = C1028.m56241(c5738);
                        C0946.m55981(c4402, C0912.m55826(C0873.m55680(C1124.m56373(f82148, 84, 3, i34)) ^ 2125685751, objArr));
                        c4402.mo13474(0);
                        C0946.m55979(C0949.m56016(f82148, 87, 3, i34));
                        try {
                            C0946.m55979(C1024.m56203(f82148, 90, 3, i34));
                            i21 = i26;
                            Exception exc5 = exc2;
                            i15 = i27;
                            i14 = i34;
                            i17 = iM56303;
                            i16 = i28;
                            list2 = list3;
                            try {
                                try {
                                    new C14814(c19561, c5738, interfaceC4527ArrM9875, i28, iArr, c15484Arr, c9873Arr, c4402, hashSet, c18555, c19226Arr, i, arrayList).m33826();
                                    zM56007 = C0949.m56007(c4402);
                                    int iM559716 = (i22 - C0946.m55979("ܽ᩸")) * 67;
                                    i25 = iM559716 ^ 1455562131;
                                    c10844 = c10844;
                                    c4402 = c4402;
                                    i24 = ((iM559716 ^ i23) * (-26547)) ^ (-341322157);
                                    list3 = list2;
                                    i33 = i33;
                                    i26 = i21;
                                    exc2 = exc5;
                                    i27 = i15;
                                    i34 = i14;
                                    iM56303 = i17;
                                    i28 = i16;
                                    i32 = 0;
                                } catch (Exception e2) {
                                    exc2 = e2;
                                    i32 = 0;
                                    int iM55685 = C0873.m55680("֡۟") ^ i22;
                                    i25 = (-1713596977) ^ iM55685;
                                    i24 = ((iM55685 ^ i23) * (-25083)) ^ (-1571534693);
                                    list3 = list2;
                                    i26 = i21;
                                    i27 = i15;
                                    i34 = i14;
                                    iM56303 = i17;
                                    i28 = i16;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i32 = 0;
                                exc2 = e;
                                int iM55686 = C0873.m55680("֡۟") ^ i22;
                                i25 = (-1713596977) ^ iM55686;
                                i24 = ((iM55686 ^ i23) * (-25083)) ^ (-1571534693);
                                list3 = list2;
                                i26 = i21;
                                i27 = i15;
                                i34 = i14;
                                iM56303 = i17;
                                i28 = i16;
                                c19563 = c19561;
                                break;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i14 = i34;
                            i21 = i26;
                            i15 = i27;
                            i16 = i28;
                            i17 = iM56303;
                            list2 = list3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i14 = i34;
                        i21 = i26;
                        i15 = i27;
                        i16 = i28;
                        i17 = iM56303;
                        list2 = list3;
                    }
                    c19563 = c19561;
                    break;
                case 754129453:
                case 1791487637:
                    i14 = i34;
                    int i45 = i26;
                    Exception exc6 = exc2;
                    i15 = i27;
                    i16 = i28;
                    i17 = iM56303;
                    List list6 = list3;
                    if (C0866.m55647(itM56090)) {
                        iM55682 = (C0873.m55680("᩻᩸") ^ i22) * 11;
                        i18 = ((iM55682 ^ i23) * 32367) ^ 1525616050;
                        i19 = -1966316788;
                    } else {
                        iM55682 = C0873.m55680("ܶᩴ") ^ i23;
                        i18 = ((iM55682 ^ i22) * (-28791)) ^ (-2087702781);
                        i19 = -107521947;
                    }
                    i25 = i19 ^ iM55682;
                    i24 = i18;
                    list3 = list6;
                    i26 = i45;
                    exc2 = exc6;
                    i27 = i15;
                    i34 = i14;
                    iM56303 = i17;
                    i28 = i16;
                    c19563 = c19561;
                    break;
                case 1616942763:
                case 1617714740:
                    C0894.m55767(arrayList);
                    C1017.m56190(c15484Arr[c2]);
                    String strM40989 = C18010.m40987(i35 + 1);
                    C0873.m55686(c4402, strM40989);
                    m30016(c10844, c15484Arr[c2].m35229(c4402), strM40989);
                    return;
                default:
                    i2 = 30481;
                    int iM559717 = C0946.m55979("֫ۛ") ^ i22;
                    int i310 = ((iM559717 ^ i23) * (-23645)) ^ (-420356167);
                    c10844 = c10844;
                    c4402 = c4402;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM559717 ^ (-623754220);
                    c19563 = c19563;
                    i33 = i33;
                    i34 = i2;
                    i24 = i310;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30016(C10844 c10844, C20765 c20765, String str) throws Throwable {
        AbstractC17043 abstractC17043M55985 = null;
        Throwable th = null;
        int i = 1325570784;
        int i2 = C0845.f81821;
        int i3 = RunnableC0871.f81839;
        int iM55979 = (C0946.m55979("۬᩵") + i2) * 115;
        int i4 = ((iM55979 ^ i3) * (-12097)) ^ 56048500;
        int i5 = -1062198697;
        while (true) {
            i = ((((i ^ i3) * (-25705)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1978955853:
                case 1766209861:
                    RunnableC1014.m56173(abstractC17043M55985);
                    return;
                case -1803050158:
                case -1286445436:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (C0873.m55680("۟۟") ^ i2) * (-53);
                        i4 = ((iM55979 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩷") ^ i3) * 99;
                        i4 = ((iM55979 ^ i2) * (-13879)) ^ 1186706655;
                        i5 = 1211057445;
                    }
                    break;
                case -1719808363:
                case 1589157736:
                    if (C0863.f81833 <= 0) {
                        iM55979 = (C0946.m55979("ۢۛ") ^ i3) * 27;
                        i4 = ((iM55979 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܿ᩺")) * (-59);
                        i4 = ((iM55979 ^ i3) * (-8407)) ^ (-592990934);
                        i5 = -1132588661;
                    }
                    break;
                case -1705770367:
                case -1002899908:
                    if (C0946.f81894 != 0) {
                        iM55979 = C0873.m55680("᩻ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩸") + i2) * 73;
                        i4 = ((iM55979 ^ i3) * 1627) ^ 1269337927;
                        i5 = -369616892;
                    }
                    break;
                case -1620144238:
                case 1119693790:
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0873.m55680("۟۟") ^ i2) * (-53);
                        i4 = ((iM55979 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM55979 = (C0946.m55979("ۢۛ") ^ i3) * 27;
                        i4 = ((iM55979 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    }
                    break;
                case -1432620630:
                case 2062531838:
                    C1404.m56468();
                    return;
                case -1206594035:
                case 281893720:
                    RunnableC1014.m56173(abstractC17043M55985);
                    throw th;
                case -1104654869:
                case 1161533618:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("۟۟") ^ i2) * (-53);
                        i4 = ((iM55979 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM55979 = C0873.m55680("ۚۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-13671)) ^ (-1364514699);
                        i5 = -565714541;
                    }
                    break;
                case -900660388:
                case 504099822:
                    abstractC17043M55985 = C0946.m55985(C17853.f53278);
                    iM55979 = (i2 - C0946.m55979("ۚ۬")) * 23;
                    i4 = ((iM55979 ^ i3) * (-23045)) ^ (-884935367);
                    i5 = -780769106;
                    break;
                case -693695586:
                case 1204002351:
                    C0937.m55918();
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("᩶֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24031) ^ (-1199266685);
                        i5 = -1105522848;
                    } else {
                        iM55979 = (C0873.m55680("۟۟") ^ i2) * (-53);
                        i4 = ((iM55979 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    }
                    break;
                case -114766354:
                case 1363148063:
                    if (RunnableC0897.m55784()) {
                        iM55979 = (C0873.m55680("۟۟") ^ i2) * (-53);
                        i4 = ((iM55979 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        iM55979 = (C0873.m55680("ܿ᩷") ^ i2) * 21;
                        i4 = ((iM55979 ^ i3) * (-26403)) ^ 538832925;
                        i5 = 551955034;
                    }
                    break;
                case 184119041:
                case 1055184995:
                    if (C1024.f81946) {
                        iM55979 = C0873.m55680("᩻ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        iM55979 = C0946.m55979("ۜ۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18197) ^ (-1493331339);
                        i5 = -2014259250;
                    }
                    break;
                case 365048216:
                case 1672971761:
                    try {
                        c20765.m50871(abstractC17043M55985);
                        C0863.m55641(c10844, str);
                        abstractC17043M55985.m38653(c10844.m24981(), (InterfaceC3693) null);
                        iM55979 = C0946.m55979("ۙۧ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 29225) ^ (-761361492);
                        i5 = 1991131606;
                    } catch (Throwable th2) {
                        th = th2;
                        iM55979 = (i3 - C0946.m55979("ۧۘ")) * 15;
                        i4 = ((iM55979 ^ i2) * 9949) ^ 456498768;
                        i5 = -1113334513;
                    }
                    break;
                case 407205909:
                case 608859598:
                    if (!C0917.f81868) {
                        iM55979 = (i3 - C0946.m55979("᩷۬")) * 43;
                        i4 = ((iM55979 ^ i2) * (-2835)) ^ 243666405;
                        i5 = 1985153716;
                    } else {
                        iM55979 = (C0946.m55979("ۢۛ") ^ i3) * 27;
                        i4 = ((iM55979 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    }
                    break;
                case 441496099:
                case 1645390562:
                    C0890.m55740();
                    C0992.m56107();
                    iM55979 = (i3 - C0946.m55979("᩷۬")) * 43;
                    i4 = ((iM55979 ^ i2) * (-2835)) ^ 243666405;
                    i5 = 1985153716;
                    break;
                case 515813245:
                case 1048739678:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("᩶֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24031) ^ (-1199266685);
                        i5 = -1105522848;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ܰ᩵")) * (-79);
                        i4 = ((iM55979 ^ i3) * 26753) ^ 304889195;
                        i5 = 60919079;
                    }
                    break;
                case 594574182:
                case 2052198267:
                    if (C0912.m55833()) {
                        iM55979 = (C0946.m55979("ۢۛ") ^ i3) * 27;
                        i4 = ((iM55979 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۫ܽ")) * (-7);
                        i4 = ((iM55979 ^ i2) * (-24583)) ^ (-55081907);
                        i5 = -190812853;
                    }
                    break;
                case 1203553537:
                case 1544233413:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("᩻ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        iM55979 = (C0873.m55680("᩷ᩳ") + i2) * (-35);
                        i4 = ((iM55979 ^ i3) * 19401) ^ (-809384462);
                        i5 = -945074129;
                    }
                    break;
                default:
                    if (C0882.f81846) {
                        iM55979 = (C0946.m55979("ۢۛ") ^ i3) * 27;
                        i4 = ((iM55979 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        iM55979 = C0873.m55680("۟᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 32561) ^ (-1479029203);
                        i5 = 1624497465;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m30019(C19561 c19561, C10844 c10844, int i, C4402 c4402) throws Throwable {
        int i2;
        List list;
        int i3;
        int i4;
        int i5;
        int i6;
        List list2;
        List listM44449;
        int iM55680;
        int i7;
        int i8;
        boolean z;
        int iM55681;
        int i9;
        int iM55979;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM559710;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iM55682;
        int i20;
        int i21;
        int i22;
        boolean zM56007 = false;
        Iterator itM55766 = null;
        boolean zM55647 = false;
        C15484[] c15484Arr = null;
        List[] listArr = null;
        boolean zM56195 = false;
        int i23 = 259032749;
        int i24 = AbstractC0942.f81890;
        int i25 = C0877.f81843;
        int iM559711 = (C0946.m55979("᩵ܺ") + i25) * (-75);
        int i26 = ((iM559711 ^ i24) * (-17727)) ^ 1588464939;
        int i27 = iM559711 ^ 6660217;
        C18555 c18555 = null;
        C14144 c14144 = null;
        Boolean bool = null;
        List list3 = null;
        Throwable th = null;
        Boolean[] boolArr = null;
        C5738 c5738 = null;
        String strM40987 = null;
        C15484 c15484 = null;
        String strM55591 = null;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z2 = false;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean zM55698 = false;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        HashSet hashSet = null;
        InterfaceC4527[] interfaceC4527ArrM9875 = null;
        AbstractC17043 abstractC17043M55985 = null;
        int i39 = 0;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i24) * 27411) >> 31));
            switch (i23) {
                case -2131622870:
                case -1298643069:
                    i29 = i29;
                    strM55591 = strM55591;
                    i31 = c14144.f40177;
                    iM55682 = C0873.m55680("᩸ܰ") ^ i24;
                    i20 = ((iM55682 ^ i25) * (-27355)) ^ 358523038;
                    i21 = 1435378446;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i40 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i40;
                    break;
                case -1899402072:
                case -751280266:
                    i28 = i28;
                    i29 = i29;
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i5 = i39;
                    i6 = i31;
                    int i41 = i37;
                    c15484 = c15484;
                    i2 = i41;
                    List list4 = list3;
                    i33 = i33;
                    list = list4;
                    try {
                        C0898.m55798(c4402, C0873.m55680(C1071.m56336(f82148, 66, 3, i5)) ^ 2100581820);
                        Arrays.fill(c14144.f40182, (Object) null);
                        Runtime.getRuntime().gc();
                        iM55680 = C0873.m55680("ۚۘ") ^ i25;
                        i7 = ((iM55680 ^ i24) * 30603) ^ (-967741994);
                        i8 = 1819189395;
                        i19 = iM55680 ^ i8;
                        i39 = i5;
                        i31 = i6;
                        strM55591 = strM55591;
                        i28 = i28;
                        i29 = i29;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        z2 = z2;
                        i27 = i19;
                        i26 = i7;
                        strM40987 = strM40987;
                        i38 = i38;
                        C15484 c15485 = c15484;
                        i37 = i2;
                        c15484 = c15485;
                        int i42 = i33;
                        list3 = list;
                        i33 = i42;
                    } catch (Throwable th2) {
                        th = th2;
                        strM40987 = strM40987;
                        th = th;
                        strM40987 = strM40987;
                        z2 = z2;
                        int iM559712 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM559712 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM559712 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i43 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i43;
                        C15484 c15486 = c15484;
                        i37 = i2;
                        c15484 = c15486;
                        int i44 = i33;
                        list3 = list;
                        i33 = i44;
                    }
                    break;
                case -1778287136:
                case 865043694:
                    RunnableC1014.m56173(abstractC17043M55985);
                    return;
                case -1704720070:
                case -1210642509:
                    i29 = i29;
                    strM55591 = strM55591;
                    zM55647 = C0866.m55647(itM55766);
                    iM55682 = (i24 - C0946.m55979("֡᩸")) * C0254q.f1218h;
                    i20 = ((iM55682 ^ i25) * 9213) ^ (-770023744);
                    i21 = -1570774819;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
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
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i5 = i39;
                    i6 = i31;
                    int i46 = i37;
                    c15484 = c15484;
                    i2 = i46;
                    List list5 = list3;
                    i33 = i33;
                    list = list5;
                    if (zM55698) {
                        iM55681 = (C0873.m55680("ۧܶ") ^ i24) * 33;
                        i7 = ((iM55681 ^ i25) * (-4449)) ^ 171248964;
                        i9 = -1702089705;
                    } else {
                        iM55681 = C0946.m55979("᩶᩺") ^ i24;
                        i7 = ((iM55681 ^ i25) * 31711) ^ 1515662658;
                        i9 = -1998993592;
                    }
                    i19 = iM55681 ^ i9;
                    i39 = i5;
                    i31 = i6;
                    strM55591 = strM55591;
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i36 = i36;
                    z2 = z2;
                    i27 = i19;
                    i26 = i7;
                    strM40987 = strM40987;
                    i38 = i38;
                    C15484 c15487 = c15484;
                    i37 = i2;
                    c15484 = c15487;
                    int i47 = i33;
                    list3 = list;
                    i33 = i47;
                    break;
                case -1634976166:
                case -197579139:
                    i29 = i29;
                    strM55591 = strM55591;
                    if (zM56007) {
                        iM55682 = C0873.m55680("ܰ᩻") ^ i24;
                        i20 = ((iM55682 ^ i25) * 31329) ^ 558188475;
                        i21 = -1062532312;
                    } else {
                        iM55682 = (C0873.m55680("᩶ۖ") ^ i25) * 19;
                        i20 = ((iM55682 ^ i24) * (-19117)) ^ (-2012028640);
                        i21 = 1509433725;
                    }
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i48 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i48;
                    break;
                case -1629386727:
                case -844516520:
                    i29 = i29;
                    strM55591 = strM55591;
                    try {
                        m30016(c10844, c15484.m35229(c4402), strM40987);
                        Runtime.getRuntime().gc();
                        i28 = i35;
                        i29 = i29;
                        iM55979 = (C0946.m55979("ۢܰ") + i25) * 115;
                        i10 = ((iM55979 ^ i24) * (-12033)) ^ (-1369120021);
                        i11 = -139547806;
                        i27 = iM55979 ^ i11;
                        i26 = i10;
                        strM55591 = strM55591;
                    } catch (Throwable th3) {
                        th = th3;
                        i29 = i29;
                        i28 = i28;
                        i5 = i39;
                        i6 = i31;
                        int i49 = i37;
                        c15484 = c15484;
                        i2 = i49;
                        List list6 = list3;
                        i33 = i33;
                        list = list6;
                        th = th;
                        strM40987 = strM40987;
                        z2 = z2;
                        int iM559713 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM559713 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM559713 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i410 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i410;
                        C15484 c15488 = c15484;
                        i37 = i2;
                        c15484 = c15488;
                        int i411 = i33;
                        list3 = list;
                        i33 = i411;
                    }
                    break;
                case -1397518720:
                case -584152372:
                    i29 = i29;
                    strM55591 = strM55591;
                    try {
                        c14144.f40180 = z2 ? 1 : 0;
                        Runtime.getRuntime().gc();
                        iM55682 = (i25 - C0946.m55979("ۡ۫")) * 119;
                        i20 = ((iM55682 ^ i24) * 10895) ^ (-786365613);
                        i21 = 212273409;
                        i22 = iM55682 ^ i21;
                        strM55591 = strM55591;
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
                        c15484 = c15484;
                        i2 = i413;
                        List list7 = list3;
                        i33 = i33;
                        list = list7;
                        th = th;
                        strM40987 = strM40987;
                        z2 = z2;
                        int iM559714 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM559714 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM559714 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i414 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i414;
                        C15484 c15489 = c15484;
                        i37 = i2;
                        c15484 = c15489;
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
                    int iM55683 = C0873.m55680("᩹֫") ^ i25;
                    i15 = ((iM55683 ^ i24) * 29613) ^ 650646923;
                    i17 = iM55683 ^ (-993052229);
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C15484 c154810 = c15484;
                    i37 = i2;
                    c15484 = c154810;
                    int i416 = i33;
                    list3 = list;
                    i33 = i416;
                    break;
                case -1317501893:
                case 104968976:
                    RunnableC1014.m56173(abstractC17043M55985);
                    return;
                case -1139597805:
                case 1887435183:
                    i35 = i28 + 1;
                    strM40987 = C18010.m40987(i35);
                    C0873.m55686(c4402, strM40987);
                    c4402.mo13474(z2 ? 1 : 0);
                    C15484[] c15484Arr2 = c14144.f40178;
                    c15484 = c15484Arr2[i28];
                    c15484Arr2[i28] = null;
                    itM55766 = C0894.m55766(c14144.f40181[i28]);
                    iM55682 = C0873.m55680("ۤ᩸") ^ i24;
                    i20 = ((iM55682 ^ i25) * (-3893)) ^ (-1975655705);
                    i21 = -858884435;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
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
                    c14144.f40182[i50] = new C19226();
                    c14144.f40181[i50] = new ArrayList();
                    i18 = i50 + 1;
                    int iM559715 = C0946.m55979("᩷ۧ") ^ i24;
                    i15 = ((iM559715 ^ i25) * (-1731)) ^ 2004839340;
                    i39 = i39;
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i36 = i18;
                    i27 = iM559715 ^ (-1117552260);
                    i26 = i15;
                    i29 = i29;
                    C15484 c154811 = c15484;
                    i37 = i2;
                    c15484 = c154811;
                    int i418 = i33;
                    list3 = list;
                    i33 = i418;
                    break;
                case -859338090:
                case -698460422:
                    i29 = i29;
                    strM55591 = strM55591;
                    i32 = c14144.f40180;
                    iM55682 = (C0946.m55979("ۙܽ") + i25) * 87;
                    i20 = ((iM55682 ^ i24) * (-31999)) ^ (-1477115129);
                    i21 = -1184352581;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i419 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i419;
                    break;
                case -839409392:
                case -11334917:
                    i28 = i28;
                    int i51 = i37;
                    c15484 = c15484;
                    i2 = i51;
                    List list8 = list3;
                    i33 = i33;
                    list = list8;
                    abstractC17043M55985 = C0946.m55985(C17853.f53278);
                    int iM559716 = C0946.m55979("ܿܽ") ^ i25;
                    i3 = ((iM559716 ^ i24) * 1331) ^ (-2042002196);
                    i4 = iM559716 ^ (-2123630167);
                    i39 = i39;
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i38 = i38;
                    i32 = i32;
                    i36 = i36;
                    i29 = i29;
                    int i4110 = i28;
                    i27 = i4;
                    i26 = i3;
                    i28 = i4110;
                    C15484 c154812 = c15484;
                    i37 = i2;
                    c15484 = c154812;
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
                    int iM55684 = C0873.m55680("᩹ۡ") ^ i25;
                    i39 = i39;
                    i31 = i31;
                    strM55591 = strM55591;
                    i29 = i13;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i12;
                    i26 = ((iM55684 ^ i24) * (-30281)) ^ (-145605822);
                    i28 = i28;
                    i27 = iM55684 ^ (-944805179);
                    strM40987 = strM40987;
                    C15484 c154813 = c15484;
                    i37 = i2;
                    c15484 = c154813;
                    int i4112 = i33;
                    list3 = list;
                    i33 = i4112;
                    break;
                case -641780465:
                case 610274875:
                    i33 = 0;
                    iM55682 = (C0873.m55680("᩺۫") + i25) * 57;
                    i20 = ((iM55682 ^ i24) * 29919) ^ 976946090;
                    i21 = 47013213;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i4113 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4113;
                    break;
                case -563083761:
                case 1482324523:
                    strM55591 = strM55591;
                    try {
                        int i52 = i38;
                        strM40987 = strM40987;
                        try {
                            Object[] objArr = new Object[i52];
                            objArr[z2 ? 1 : 0] = C1028.m56241(c5738);
                            try {
                                i28 = i28;
                                i29 = i29;
                                try {
                                    try {
                                        C0873.m55686(c4402, C1003.m56122(C0946.m55979(C1124.m56373(f82148, 69, 3, i39)) ^ 2120348022, objArr));
                                        C5738 c5739 = c5738;
                                        i38 = i52;
                                        InterfaceC4527[] interfaceC4527Arr = interfaceC4527ArrM9875;
                                        i30 = i30;
                                        i32 = i32;
                                        i5 = i39;
                                        int i53 = i37;
                                        c15484 = c15484;
                                        i2 = i53;
                                        C14144 c14145 = c14144;
                                        List list9 = list3;
                                        i33 = i33;
                                        list = list9;
                                        abstractC17043M55985 = abstractC17043M55985;
                                        HashSet hashSet2 = hashSet;
                                        i36 = i36;
                                        i6 = i31;
                                        C18555 c18556 = c18555;
                                        z2 = z2 ? 1 : 0;
                                        try {
                                            C8109.m18805(new C8109(c19561, c5739, interfaceC4527Arr, i30, c14145, c4402, hashSet2, c18556, boolArr));
                                            zM56007 = C0949.m56007(c4402);
                                            iM55681 = (i24 - C0873.m55680("᩺᩺")) * 49;
                                            i7 = ((iM55681 ^ i25) * 6389) ^ 59208449;
                                            i9 = 143618697;
                                            i19 = iM55681 ^ i9;
                                            i39 = i5;
                                            i31 = i6;
                                            strM55591 = strM55591;
                                            i28 = i28;
                                            i29 = i29;
                                            i30 = i30;
                                            i32 = i32;
                                            abstractC17043M55985 = abstractC17043M55985;
                                            i36 = i36;
                                            z2 = z2;
                                            i27 = i19;
                                            i26 = i7;
                                            strM40987 = strM40987;
                                            i38 = i38;
                                            C15484 c154814 = c15484;
                                            i37 = i2;
                                            c15484 = c154814;
                                            int i4114 = i33;
                                            list3 = list;
                                            i33 = i4114;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                            i30 = i30;
                                            z2 = z2;
                                            int iM559717 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                                            i3 = ((iM559717 ^ i25) * 11671) ^ 1647827904;
                                            i4 = iM559717 ^ 1881445579;
                                            i39 = i5;
                                            i31 = i6;
                                            strM40987 = strM40987;
                                            strM55591 = strM55591;
                                            i29 = i29;
                                            i38 = i38;
                                            i32 = i32;
                                            abstractC17043M55985 = abstractC17043M55985;
                                            i36 = i36;
                                            int i4115 = i28;
                                            i27 = i4;
                                            i26 = i3;
                                            i28 = i4115;
                                            C15484 c154815 = c15484;
                                            i37 = i2;
                                            c15484 = c154815;
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
                                        c15484 = c15484;
                                        i2 = i54;
                                        List list10 = list3;
                                        i33 = i33;
                                        list2 = list10;
                                        listM44449 = list2;
                                        th = th;
                                        list = listM44449;
                                        int iM559718 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                                        i3 = ((iM559718 ^ i25) * 11671) ^ 1647827904;
                                        i4 = iM559718 ^ 1881445579;
                                        i39 = i5;
                                        i31 = i6;
                                        strM40987 = strM40987;
                                        strM55591 = strM55591;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC17043M55985 = abstractC17043M55985;
                                        i36 = i36;
                                        int i4117 = i28;
                                        i27 = i4;
                                        i26 = i3;
                                        i28 = i4117;
                                        C15484 c154816 = c15484;
                                        i37 = i2;
                                        c15484 = c154816;
                                        int i4118 = i33;
                                        list3 = list;
                                        i33 = i4118;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    i38 = i52;
                                    int i55 = i30;
                                    abstractC17043M55985 = abstractC17043M55985;
                                    z = z2 ? 1 : 0;
                                    i32 = i32;
                                    i36 = i36;
                                    i5 = i39;
                                    i6 = i31;
                                    int i56 = i37;
                                    c15484 = c15484;
                                    i2 = i56;
                                    List list11 = list3;
                                    i33 = i33;
                                    listM44449 = list11;
                                    i30 = i55;
                                    z2 = z;
                                    th = th;
                                    list = listM44449;
                                    int iM559719 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                                    i3 = ((iM559719 ^ i25) * 11671) ^ 1647827904;
                                    i4 = iM559719 ^ 1881445579;
                                    i39 = i5;
                                    i31 = i6;
                                    strM40987 = strM40987;
                                    strM55591 = strM55591;
                                    i29 = i29;
                                    i38 = i38;
                                    i32 = i32;
                                    abstractC17043M55985 = abstractC17043M55985;
                                    i36 = i36;
                                    int i4119 = i28;
                                    i27 = i4;
                                    i26 = i3;
                                    i28 = i4119;
                                    C15484 c154817 = c15484;
                                    i37 = i2;
                                    c15484 = c154817;
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
                        strM40987 = strM40987;
                    }
                    break;
                case -501128784:
                case 2021530758:
                    strM55591 = strM55591;
                    i28 = 0;
                    iM55979 = (C0946.m55979("ۢܰ") + i25) * 115;
                    i10 = ((iM55979 ^ i24) * (-12033)) ^ (-1369120021);
                    i11 = -139547806;
                    i27 = iM55979 ^ i11;
                    i26 = i10;
                    strM55591 = strM55591;
                    break;
                case -465285364:
                case 1727979071:
                    i29 = i29;
                    strM55591 = strM55591;
                    if (i32 > 5242880) {
                        iM55682 = (C0873.m55680("۠ۢ") + i25) * 35;
                        i20 = ((iM55682 ^ i24) * 17191) ^ 82355589;
                        i21 = -2110567972;
                    } else {
                        iM55682 = (i25 - C0946.m55979("ۡ۫")) * 119;
                        i20 = ((iM55682 ^ i24) * 10895) ^ (-786365613);
                        i21 = 212273409;
                    }
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i41111 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41111;
                    break;
                case -356585159:
                case 568686878:
                    i29 = i29;
                    strM55591 = strM55591;
                    if (zM56195) {
                        iM55682 = C0873.m55680("᩻ۖ") ^ i25;
                        i20 = ((iM55682 ^ i24) * (-4245)) ^ 389426906;
                        i21 = -1704275584;
                    } else {
                        iM55682 = (i24 - C0946.m55979("۫ܿ")) * (-83);
                        i20 = ((iM55682 ^ i25) * (-17917)) ^ 1242231346;
                        i21 = 297040987;
                    }
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i41112 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41112;
                    break;
                case -339069521:
                case -58369259:
                    i28 = i28;
                    i29 = i29;
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i14 = i39;
                    i31 = i31;
                    int i57 = i37;
                    c15484 = c15484;
                    i2 = i57;
                    List list12 = list3;
                    i33 = i33;
                    list = list12;
                    if (i36 < i) {
                        iM559710 = (C0873.m55680("ۢۨ") ^ i24) * 45;
                        i15 = ((iM559710 ^ i25) * (-7197)) ^ (-1461001773);
                        i16 = 665693366;
                    } else {
                        iM559710 = (C0946.m55979("ᩳۧ") + i25) * 15;
                        i15 = ((iM559710 ^ i24) * 23589) ^ 1762239591;
                        i16 = -1451101980;
                    }
                    i17 = iM559710 ^ i16;
                    i39 = i14;
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C15484 c154818 = c15484;
                    i37 = i2;
                    c15484 = c154818;
                    int i41113 = i33;
                    list3 = list;
                    i33 = i41113;
                    break;
                case -222686591:
                case 1275602812:
                    i29 = i29;
                    strM55591 = strM55591;
                    if (zM55647) {
                        iM55682 = C0946.m55979("۟֨") ^ i25;
                        i20 = ((iM55682 ^ i24) * 9573) ^ (-609051709);
                        i21 = -1667571660;
                    } else {
                        iM55682 = (i24 - C0946.m55979("ۙ۟")) * 75;
                        i20 = ((iM55682 ^ i25) * 25045) ^ 385135627;
                        i21 = -44671194;
                    }
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i41114 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i41114;
                    break;
                case -153227295:
                case -42311786:
                    i29 = i29;
                    strM55591 = strM55591;
                    C15484[] c15484Arr3 = c14144.f40178;
                    try {
                        List[] listArr2 = c14144.f40181;
                        int iM559720 = C0946.m55979("ۧۧ") ^ i24;
                        i26 = ((iM559720 ^ i25) * (-14649)) ^ 1514844102;
                        listArr = listArr2;
                        strM55591 = strM55591;
                        c15484Arr = c15484Arr3;
                        i29 = i29;
                        i27 = iM559720 ^ 1925864792;
                    } catch (Throwable th11) {
                        th = th11;
                        c15484Arr = c15484Arr3;
                        i29 = i29;
                        i5 = i39;
                        i6 = i31;
                        int i58 = i37;
                        c15484 = c15484;
                        i2 = i58;
                        List list13 = list3;
                        i33 = i33;
                        list = list13;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM5597110 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM5597110 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM5597110 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i41115 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i41115;
                        C15484 c154819 = c15484;
                        i37 = i2;
                        c15484 = c154819;
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
                            strM55591 = strM55591;
                            i29 = i29;
                            try {
                                C0912.m55825(sb, C1024.m56203(f82148, 72, 1, i39));
                                C0845.m55589(sb, i33);
                                C1003.m56121(sb, C1044.m56276(f82148, 73, 4, i39));
                                strM55591 = C0845.m55591(sb);
                                int iM55685 = C0873.m55680("۟۫") ^ i24;
                                i20 = ((iM55685 ^ i25) * 4395) ^ (-307676640);
                                i22 = iM55685 ^ 260328774;
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
                                c15484 = c15484;
                                i2 = i59;
                                List list14 = list3;
                                i33 = i33;
                                list = list14;
                                th = th;
                                i30 = i30;
                                z2 = z2;
                                int iM5597111 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                                i3 = ((iM5597111 ^ i25) * 11671) ^ 1647827904;
                                i4 = iM5597111 ^ 1881445579;
                                i39 = i5;
                                i31 = i6;
                                strM40987 = strM40987;
                                strM55591 = strM55591;
                                i29 = i29;
                                i38 = i38;
                                i32 = i32;
                                abstractC17043M55985 = abstractC17043M55985;
                                i36 = i36;
                                int i41118 = i28;
                                i27 = i4;
                                i26 = i3;
                                i28 = i41118;
                                C15484 c1548110 = c15484;
                                i37 = i2;
                                c15484 = c1548110;
                                int i41119 = i33;
                                list3 = list;
                                i33 = i41119;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            i29 = i29;
                            strM55591 = strM55591;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        i29 = i29;
                        strM55591 = strM55591;
                        i5 = i39;
                        i6 = i31;
                        int i510 = i37;
                        c15484 = c15484;
                        i2 = i510;
                        List list15 = list3;
                        i33 = i33;
                        list = list15;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM5597112 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM5597112 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM5597112 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i411110 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i411110;
                        C15484 c1548111 = c15484;
                        i37 = i2;
                        c15484 = c1548111;
                        int i411111 = i33;
                        list3 = list;
                        i33 = i411111;
                    }
                    break;
                case -118194475:
                case 52926261:
                    i29 = i29;
                    strM55591 = strM55591;
                    if (i33 < i31) {
                        iM55682 = C0946.m55979("֨ᩴ") ^ i25;
                        i20 = ((iM55682 ^ i24) * 25731) ^ (-1055654813);
                        i21 = -1094011076;
                    } else {
                        iM55682 = C0873.m55680("ۚ᩹") ^ i25;
                        i20 = ((iM55682 ^ i24) * (-16837)) ^ (-1568562761);
                        i21 = 1398898190;
                    }
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i411112 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i411112;
                    break;
                case -88658495:
                case 1795040228:
                    RunnableC1014.m56173(abstractC17043M55985);
                    return;
                case -35571722:
                case 440755635:
                    strM55591 = strM55591;
                    try {
                        i29 = c14144.f40177;
                        iM55979 = C0946.m55979("ܳۗ") ^ i24;
                        i10 = ((iM55979 ^ i25) * (-9203)) ^ (-1623814137);
                        i11 = 1302770789;
                        i27 = iM55979 ^ i11;
                        i26 = i10;
                        strM55591 = strM55591;
                    } catch (Throwable th15) {
                        th = th15;
                        i5 = i39;
                        i6 = i31;
                        int i4120 = i37;
                        c15484 = c15484;
                        i2 = i4120;
                        List list16 = list3;
                        i33 = i33;
                        list = list16;
                        th = th;
                        strM40987 = strM40987;
                        z2 = z2;
                        int iM5597113 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM5597113 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM5597113 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i411113 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i411113;
                        C15484 c1548112 = c15484;
                        i37 = i2;
                        c15484 = c1548112;
                        int i411114 = i33;
                        list3 = list;
                        i33 = i411114;
                    }
                    break;
                case 21451322:
                case 87769806:
                    AbstractC0942.m55966(abstractC17043M55985);
                    throw th;
                case 240577981:
                case 857156939:
                    i28 = i28;
                    i29 = i29;
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    z = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i5 = i39;
                    i6 = i31;
                    int i60 = i37;
                    c15484 = c15484;
                    i2 = i60;
                    List list17 = list3;
                    i33 = i33;
                    list = list17;
                    try {
                        C5738 c57310 = (C5738) C1964.m56587(list, i30);
                        try {
                            zM55698 = C0877.m55698(c4402);
                            int iM559721 = C0946.m55979("ܶۜ") ^ i25;
                            i3 = ((iM559721 ^ i24) * (-20055)) ^ (-131104717);
                            i4 = iM559721 ^ (-1961826161);
                            c5738 = c57310;
                            i39 = i5;
                            i31 = i6;
                            strM40987 = strM40987;
                            strM55591 = strM55591;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC17043M55985 = abstractC17043M55985;
                            i36 = i36;
                            z2 = z ? 1 : 0;
                        } catch (Throwable th16) {
                            th = th16;
                            c5738 = c57310;
                            listM44449 = list;
                            z2 = z ? 1 : 0;
                            th = th;
                            list = listM44449;
                            int iM5597114 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                            i3 = ((iM5597114 ^ i25) * 11671) ^ 1647827904;
                            i4 = iM5597114 ^ 1881445579;
                            i39 = i5;
                            i31 = i6;
                            strM40987 = strM40987;
                            strM55591 = strM55591;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC17043M55985 = abstractC17043M55985;
                            i36 = i36;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        listM44449 = list;
                        z2 = z;
                        th = th;
                        list = listM44449;
                        int iM5597115 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM5597115 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM5597115 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i411115 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i411115;
                        C15484 c1548113 = c15484;
                        i37 = i2;
                        c15484 = c1548113;
                        int i411116 = i33;
                        list3 = list;
                        i33 = i411116;
                        break;
                    }
                    int i411117 = i28;
                    i27 = i4;
                    i26 = i3;
                    i28 = i411117;
                    C15484 c1548114 = c15484;
                    i37 = i2;
                    c15484 = c1548114;
                    int i411118 = i33;
                    list3 = list;
                    i33 = i411118;
                    break;
                case 254018666:
                case 966558278:
                    i28 = i28;
                    i29 = i29;
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    Object[] objArr2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i5 = i39;
                    i6 = i31;
                    int i61 = i37;
                    c15484 = c15484;
                    i2 = i61;
                    List list18 = list3;
                    i33 = i33;
                    list2 = list18;
                    try {
                        C0927.m55872(abstractC17043M55985);
                        try {
                            listM44449 = c19561.m44449(z2);
                            try {
                                interfaceC4527ArrM9875 = C4654.m9875(c19561, listM44449);
                                try {
                                    Boolean[] boolArr2 = new Boolean[1];
                                    try {
                                        boolArr2[z2 ? 1 : 0] = bool;
                                        int iM55989 = C0947.m55989(listM44449);
                                        int iM55686 = (i24 - C0873.m55680("ܽۨ")) * (-37);
                                        boolArr = boolArr2;
                                        i31 = i6;
                                        i33 = i33;
                                        c15484 = c15484;
                                        strM40987 = strM40987;
                                        i29 = i29;
                                        i38 = i38;
                                        abstractC17043M55985 = abstractC17043M55985;
                                        i36 = i36;
                                        i34 = 1;
                                        i37 = iM55989;
                                        list3 = listM44449;
                                        i26 = ((iM55686 ^ i25) * (-22859)) ^ (-649183343);
                                        strM55591 = strM55591;
                                        i28 = i28;
                                        i27 = iM55686 ^ (-1327960614);
                                        i39 = i5;
                                        i32 = i32;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        boolArr = boolArr2;
                                        i34 = 1;
                                        th = th;
                                        list = listM44449;
                                        int iM5597116 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                                        i3 = ((iM5597116 ^ i25) * 11671) ^ 1647827904;
                                        i4 = iM5597116 ^ 1881445579;
                                        i39 = i5;
                                        i31 = i6;
                                        strM40987 = strM40987;
                                        strM55591 = strM55591;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC17043M55985 = abstractC17043M55985;
                                        i36 = i36;
                                        int i411119 = i28;
                                        i27 = i4;
                                        i26 = i3;
                                        i28 = i411119;
                                        C15484 c1548115 = c15484;
                                        i37 = i2;
                                        c15484 = c1548115;
                                        int i4111110 = i33;
                                        list3 = list;
                                        i33 = i4111110;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                listM44449 = listM44449;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            listM44449 = list2;
                            th = th;
                            list = listM44449;
                            int iM5597117 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                            i3 = ((iM5597117 ^ i25) * 11671) ^ 1647827904;
                            i4 = iM5597117 ^ 1881445579;
                            i39 = i5;
                            i31 = i6;
                            strM40987 = strM40987;
                            strM55591 = strM55591;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC17043M55985 = abstractC17043M55985;
                            i36 = i36;
                            int i4111111 = i28;
                            i27 = i4;
                            i26 = i3;
                            i28 = i4111111;
                            C15484 c1548116 = c15484;
                            i37 = i2;
                            c15484 = c1548116;
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
                    c15484.f44204.addAll(C1012.m56147(C0854.m55608(ViewOnClickListenerC0939.m55942((AbstractC17043) C0955.m56035(itM55766)))));
                    iM55682 = C0873.m55680("ۤ᩸") ^ i24;
                    i20 = ((iM55682 ^ i25) * (-3893)) ^ (-1975655705);
                    i21 = -858884435;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i4111113 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4111113;
                    break;
                case 338096166:
                case 1439337099:
                    i33++;
                    iM55682 = (C0873.m55680("᩺۫") + i25) * 57;
                    i20 = ((iM55682 ^ i24) * 29919) ^ 976946090;
                    i21 = 47013213;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
                    int i4111114 = i29;
                    i27 = i22;
                    i26 = i20;
                    i29 = i4111114;
                    break;
                case 453828066:
                case 996113207:
                    strM55591 = strM55591;
                    if (i28 < i29) {
                        iM55979 = (i24 - C0946.m55979("᩶ܿ")) * 51;
                        i10 = ((iM55979 ^ i25) * 24243) ^ (-54064587);
                        i11 = -12147491;
                    } else {
                        iM55979 = (i25 - C0873.m55680("۠ۙ")) * (-113);
                        i10 = ((iM55979 ^ i24) * (-4185)) ^ 1893125532;
                        i11 = 1166586360;
                    }
                    i27 = iM55979 ^ i11;
                    i26 = i10;
                    strM55591 = strM55591;
                    break;
                case 473865263:
                case 1496193321:
                    try {
                        AbstractC17043 abstractC17043M38693 = abstractC17043M55985.m38693(strM55591);
                        c15484Arr[i33].m35228().m50871(abstractC17043M38693);
                        C0949.m56010(listArr[i33], abstractC17043M38693);
                        c15484Arr[i33] = new C15484(c14144.f40179);
                        i29 = i29;
                        strM55591 = strM55591;
                        iM55682 = C0873.m55680("᩻ۖ") ^ i25;
                        i20 = ((iM55682 ^ i24) * (-4245)) ^ 389426906;
                        i21 = -1704275584;
                        i22 = iM55682 ^ i21;
                        strM55591 = strM55591;
                        int i4111115 = i29;
                        i27 = i22;
                        i26 = i20;
                        i29 = i4111115;
                    } catch (Throwable th23) {
                        th = th23;
                        strM55591 = strM55591;
                        i5 = i39;
                        i6 = i31;
                        int i4121 = i37;
                        c15484 = c15484;
                        i2 = i4121;
                        List list19 = list3;
                        i33 = i33;
                        list = list19;
                        th = th;
                        strM40987 = strM40987;
                        z2 = z2;
                        int iM5597118 = (C0946.m55979("ۙۧ") ^ i24) * (-43);
                        i3 = ((iM5597118 ^ i25) * 11671) ^ 1647827904;
                        i4 = iM5597118 ^ 1881445579;
                        i39 = i5;
                        i31 = i6;
                        strM40987 = strM40987;
                        strM55591 = strM55591;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC17043M55985 = abstractC17043M55985;
                        i36 = i36;
                        int i4111116 = i28;
                        i27 = i4;
                        i26 = i3;
                        i28 = i4111116;
                        C15484 c1548117 = c15484;
                        i37 = i2;
                        c15484 = c1548117;
                        int i4111117 = i33;
                        list3 = list;
                        i33 = i4111117;
                    }
                    break;
                case 670468497:
                case 1300583059:
                    i28 = i28;
                    i29 = i29;
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i14 = i39;
                    i31 = i31;
                    int i62 = i37;
                    c15484 = c15484;
                    i2 = i62;
                    List list20 = list3;
                    i33 = i33;
                    list = list20;
                    short s = f82148[65];
                    int i63 = (s * s) + 62884900;
                    int i64 = s + 7930;
                    if ((i63 + i63) - (i64 * i64) < 0) {
                        iM559710 = C0946.m55979("ۙۖ") ^ i24;
                        i15 = ((iM559710 ^ i25) * (-13963)) ^ 699245805;
                        i16 = -432907839;
                    } else {
                        iM559710 = (i25 - C0946.m55979("ܿܰ")) * 93;
                        i15 = ((iM559710 ^ i24) * (-25049)) ^ 1791832882;
                        i16 = -235211174;
                    }
                    i17 = iM559710 ^ i16;
                    i39 = i14;
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C15484 c1548118 = c15484;
                    i37 = i2;
                    c15484 = c1548118;
                    int i411120 = i33;
                    list3 = list;
                    i33 = i411120;
                    break;
                case 814048493:
                case 1694031224:
                    i29 = i29;
                    strM55591 = strM55591;
                    zM56195 = C1017.m56195(c15484Arr[i33].f44204);
                    iM55682 = C0946.m55979("֨֫") ^ i24;
                    i20 = ((iM55682 ^ i25) * (-8859)) ^ (-173281578);
                    i21 = 2001683358;
                    i22 = iM55682 ^ i21;
                    strM55591 = strM55591;
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
                    int iM55687 = C0873.m55680("᩹֫") ^ i25;
                    i15 = ((iM55687 ^ i24) * 29613) ^ 650646923;
                    i17 = iM55687 ^ (-993052229);
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i27 = i17;
                    i36 = i36;
                    i26 = i15;
                    i29 = i29;
                    C15484 c1548119 = c15484;
                    i37 = i2;
                    c15484 = c1548119;
                    int i411121 = i33;
                    list3 = list;
                    i33 = i411121;
                    break;
                case 1239632720:
                case 1867204520:
                    i28 = i28;
                    i29 = i29;
                    strM55591 = strM55591;
                    abstractC17043M55985 = abstractC17043M55985;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM40987 = strM40987;
                    i5 = i39;
                    i6 = i31;
                    int i65 = i37;
                    c15484 = c15484;
                    i2 = i65;
                    List list21 = list3;
                    i33 = i33;
                    list = list21;
                    if (i30 < i2) {
                        iM55680 = (C0946.m55979("ᩳ۫") ^ i25) * (-49);
                        i7 = ((iM55680 ^ i24) * (-8697)) ^ (-1643370354);
                        i8 = -851748874;
                    } else {
                        iM55680 = (C0946.m55979("ۜۡ") + i24) * (-41);
                        i7 = ((iM55680 ^ i25) * (-13323)) ^ (-1916331465);
                        i8 = -1874675952;
                    }
                    i19 = iM55680 ^ i8;
                    i39 = i5;
                    i31 = i6;
                    strM55591 = strM55591;
                    i28 = i28;
                    i29 = i29;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i36 = i36;
                    z2 = z2;
                    i27 = i19;
                    i26 = i7;
                    strM40987 = strM40987;
                    i38 = i38;
                    C15484 c15481110 = c15484;
                    i37 = i2;
                    c15484 = c15481110;
                    int i411122 = i33;
                    list3 = list;
                    i33 = i411122;
                    break;
                case 1250105844:
                case 1486257315:
                    i2 = i37;
                    list = list3;
                    HashSet hashSet3 = new HashSet();
                    C18555 c18557 = new C18555();
                    C14144 c14146 = new C14144();
                    c14146.f40179 = null;
                    c14146.f40180 = 0;
                    c14146.f40177 = i;
                    c14146.f40178 = new C15484[i];
                    c14146.f40181 = new List[i];
                    c14146.f40182 = new C19226[i];
                    hashSet = hashSet3;
                    c18555 = c18557;
                    c14144 = c14146;
                    bool = null;
                    i18 = 0;
                    z2 = false;
                    int iM5597119 = C0946.m55979("᩷ۧ") ^ i24;
                    i15 = ((iM5597119 ^ i25) * (-1731)) ^ 2004839340;
                    i39 = i39;
                    i31 = i31;
                    strM40987 = strM40987;
                    strM55591 = strM55591;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i36 = i18;
                    i27 = iM5597119 ^ (-1117552260);
                    i26 = i15;
                    i29 = i29;
                    C15484 c15481111 = c15484;
                    i37 = i2;
                    c15484 = c15481111;
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
                    int iM55688 = C0873.m55680("᩹ۡ") ^ i25;
                    i39 = i39;
                    i31 = i31;
                    strM55591 = strM55591;
                    i29 = i13;
                    i32 = i32;
                    abstractC17043M55985 = abstractC17043M55985;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i12;
                    i26 = ((iM55688 ^ i24) * (-30281)) ^ (-145605822);
                    i28 = i28;
                    i27 = iM55688 ^ (-944805179);
                    strM40987 = strM40987;
                    C15484 c15481112 = c15484;
                    i37 = i2;
                    c15484 = c15481112;
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
    
        if (p067l.C0892.f81851 != false) goto L85;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int iM55680;
        int i2;
        int i3;
        int iM55979;
        int i4;
        short[] sArr;
        char c;
        C13120 c13120 = this;
        int i5 = 260863092;
        int i6 = C1964.f83032;
        int i7 = C0863.f81833;
        int iM55681 = (i7 - C0873.m55680("ۚܺ")) * 93;
        int i8 = ((iM55681 ^ i6) * (-25199)) ^ 1041412768;
        int i9 = iM55681 ^ (-1813686533);
        EditText editText = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        char c2 = 0;
        int iM559710 = 0;
        int iM559711 = 0;
        int iM55682 = 0;
        int iM55683 = 0;
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
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("᩹᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                    } else {
                        iM55979 = C0946.m55979("ۖۚ") ^ i7;
                        i8 = ((iM55979 ^ i6) * (-6951)) ^ (-547963555);
                        i4 = -74974650;
                    }
                    i9 = iM55979 ^ i4;
                    c13120 = this;
                    break;
                case -1741260189:
                case -151837393:
                    c13120.f36867 = i;
                    textView2 = c13120.f36866;
                    textView = c13120.f36864;
                    editText = c13120.f36863;
                    if (i == 0) {
                        iM55680 = (i7 - C0873.m55680("۫ۚ")) * 85;
                        i2 = ((iM55680 ^ i6) * (-11181)) ^ 836480402;
                        i3 = 1636382506;
                    } else {
                        iM55680 = C0873.m55680("ۢ֡") ^ i7;
                        i2 = ((iM55680 ^ i6) * 14677) ^ (-69006737);
                        i3 = -328244527;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1738195249:
                case 2025631912:
                    C0955.m56025();
                    break;
                case -1705696604:
                case -1570372616:
                    C1024.m56209();
                    iM55680 = (C0946.m55979("ܶۡ") ^ i6) * (-71);
                    i2 = ((iM55680 ^ i7) * (-6383)) ^ 1620501182;
                    i3 = 1970277088;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1565695629:
                case -298755022:
                    iM559711 = C0946.m55979(C0894.m55773(sArr4, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i11));
                    if (!RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("᩹᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                        i9 = iM55979 ^ i4;
                        c13120 = this;
                    } else {
                        iM55680 = C0946.m55979("᩹ۚ") ^ i6;
                        i2 = ((iM55680 ^ i7) * 28261) ^ 954686990;
                        i3 = -1612141266;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -1442279348:
                case 658024781:
                    C0873.m55684(textView2, 2125735616 ^ iM559711);
                    if (RunnableC0938.m55935(editText) > 0) {
                        iM55680 = C0946.m55979("᩻ᩴ") ^ i7;
                        i2 = ((iM55680 ^ i6) * 25717) ^ 1511602726;
                        i3 = -1464397735;
                    } else {
                        iM55680 = (C0946.m55979("᩻ۧ") + i7) * 65;
                        i2 = ((iM55680 ^ i6) * (-13709)) ^ (-842571718);
                        i3 = -1768918717;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1424954560:
                case 110900891:
                    i11 = 18521;
                    iM55680 = C0946.m55979("ۘܽ") ^ i6;
                    i2 = ((iM55680 ^ i7) * (-29967)) ^ (-1621321981);
                    i3 = -120182552;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1335944191:
                case 209376592:
                    f36862 = C0863.m55639(C1046.m56288(editText));
                    iM55680 = (C0946.m55979("᩻ۧ") + i7) * 65;
                    i2 = ((iM55680 ^ i6) * (-13709)) ^ (-842571718);
                    i3 = -1768918717;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1242615283:
                case 311188441:
                    C0873.m55684(textView2, 2098554468 ^ iM55683);
                    if (C0894.m55770(editText) > 0) {
                        iM55680 = C0946.m55979("֡᩻") ^ i7;
                        i2 = ((iM55680 ^ i6) * (-25131)) ^ 280753272;
                        i3 = -734850529;
                    } else {
                        iM55680 = C0946.m55979("ܰۙ") ^ i6;
                        i2 = ((iM55680 ^ i7) * 23589) ^ 1323591859;
                        i3 = -94734011;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -1214059389:
                case 1520444680:
                    C0861.m55626();
                    break;
                case -919789717:
                case 1583803890:
                    i11 = 51918;
                    iM55680 = C0946.m55979("ۘܽ") ^ i6;
                    i2 = ((iM55680 ^ i7) * (-29967)) ^ (-1621321981);
                    i3 = -120182552;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -858220060:
                case -168922780:
                    f36861 = C0845.m55591(C0989.m56089(editText));
                    iM55680 = C0946.m55979("ܰۙ") ^ i6;
                    i2 = ((iM55680 ^ i7) * 23589) ^ 1323591859;
                    i3 = -94734011;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -852101778:
                case 1046634874:
                    if (c13120.f36867 == i) {
                        iM55680 = (i6 - C0946.m55979("ᩳۢ")) * (-37);
                        i2 = ((iM55680 ^ i7) * (-1417)) ^ (-1169080951);
                        i3 = 2140199113;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۚ") ^ i7) * (-25);
                        i2 = ((iM55680 ^ i6) * 13023) ^ (-964191269);
                        i3 = 159015369;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -809919985:
                case 445115499:
                    RunnableC0938.m55928(editText, f36862);
                    iM55680 = (i6 - C0946.m55979("ۧ۠")) * (-65);
                    i2 = ((iM55680 ^ i7) * 3561) ^ (-21134445);
                    i3 = 262470853;
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -802309919:
                case -192611537:
                    iM559710 = C0946.m55979(C1044.m56276(f82148, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i11));
                    if (C1044.f81959 < 0) {
                        iM55680 = (C0946.m55979("᩵ۚ") + i7) * 91;
                        i2 = ((iM55680 ^ i6) * 16945) ^ (-1696006716);
                        i3 = 16665513;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    } else {
                        iM55979 = C0946.m55979("᩹᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                        i9 = iM55979 ^ i4;
                        c13120 = this;
                    }
                    break;
                case -600275061:
                case 408021694:
                    C0873.m55684(textView, 2099588898 ^ iM559710);
                    sArr4 = f82148;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("᩶֡") ^ i6;
                        i2 = ((iM55680 ^ i7) * (-8313)) ^ (-1424755148);
                        i3 = -2109549685;
                    } else {
                        iM55680 = (i6 - C0873.m55680("᩹ۛ")) * (-3);
                        i2 = ((iM55680 ^ i7) * (-11201)) ^ 511849829;
                        i3 = -1336819217;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case -479435901:
                case 115106280:
                    if (RunnableC0897.f81856) {
                        iM55979 = C0873.m55680("ۢۡ") ^ i6;
                        i8 = ((iM55979 ^ i7) * 22289) ^ (-1906034868);
                        i4 = 1649150919;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۘ") + i7) * (-75);
                        i8 = ((iM55979 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                    }
                    i9 = iM55979 ^ i4;
                    c13120 = this;
                    break;
                case -476498626:
                case 633069732:
                    if (C1194.f82045 == 0) {
                        iM55979 = C0946.m55979("᩹᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                        i9 = iM55979 ^ i4;
                        c13120 = this;
                    } else {
                        iM55680 = (C0946.m55979("ܶۡ") ^ i6) * (-71);
                        i2 = ((iM55680 ^ i7) * (-6383)) ^ 1620501182;
                        i3 = 1970277088;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -338873319:
                case 609940272:
                    iM55682 = C0873.m55680(C0930.m55893(f82148, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i11));
                    if (C0898.m55800() > 0) {
                        iM55680 = (i6 - C0946.m55979("۬᩹")) * (-37);
                        i2 = ((iM55680 ^ i7) * (-29309)) ^ (-1639653743);
                        i3 = 838468996;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۘ") + i7) * (-75);
                        i8 = ((iM55979 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                        i9 = iM55979 ^ i4;
                        c13120 = this;
                    }
                    break;
                case -104369813:
                case 208360357:
                    s = sArr2[c2];
                    i10 = (s * s) + 34480384;
                    if (C1404.f82149 < 0) {
                        iM55680 = (C0873.m55680("ۖ᩶") ^ i7) * 53;
                        i2 = ((iM55680 ^ i6) * 5081) ^ (-1270833210);
                        i3 = 1635088913;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    } else {
                        sArr = sArr2;
                        c = c2;
                        int iM559712 = (i6 - C0946.m55979("᩸֫")) * 7;
                        int i12 = ((iM559712 ^ i7) * (-5359)) ^ (-241276759);
                        i9 = iM559712 ^ (-2049534458);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i12;
                        c13120 = this;
                    }
                    break;
                case -53997866:
                case 1528632734:
                    if (C1028.f81950 > 0) {
                        iM55979 = C0946.m55979("᩹᩻") ^ i7;
                        i8 = ((iM55979 ^ i6) * 5755) ^ (-1358329060);
                        i4 = -2101531001;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۘ") + i7) * (-75);
                        i8 = ((iM55979 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                    }
                    i9 = iM55979 ^ i4;
                    c13120 = this;
                    break;
                case 104822255:
                case 1902746093:
                    iM55683 = C0873.m55680(C1017.m56189(sArr3, 116, 3, i11));
                    if (C1048.f81963) {
                        iM55680 = (C0873.m55680("ܳ᩸") ^ i6) * (-5);
                        i2 = ((iM55680 ^ i7) * (-4951)) ^ 176129615;
                        i3 = 1197683119;
                    } else {
                        iM55680 = (C0946.m55979("ܶۡ") ^ i6) * (-71);
                        i2 = ((iM55680 ^ i7) * (-6383)) ^ 1620501182;
                        i3 = 1970277088;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case 128507286:
                case 297587390:
                    C0873.m55684(textView, 2125218567 ^ iM55682);
                    sArr3 = f82148;
                    if (C1025.f81947 < 0) {
                        iM55680 = (C0873.m55680("᩶᩸") ^ i7) * (-69);
                        i2 = ((iM55680 ^ i6) * (-21099)) ^ 23779064;
                        i3 = 941478812;
                        i9 = iM55680 ^ i3;
                        i8 = i2;
                    } else {
                        iM55979 = (C0946.m55979("᩻ۘ") + i7) * (-75);
                        i8 = ((iM55979 ^ i6) * (-26137)) ^ 1940221385;
                        i4 = -1751433486;
                        i9 = iM55979 ^ i4;
                        c13120 = this;
                    }
                    break;
                case 697466180:
                case 1237294852:
                    if (i10 - (s * 11744) >= 0) {
                        iM55680 = (C0873.m55680("᩷ۨ") + i7) * (-51);
                        i2 = ((iM55680 ^ i6) * 7965) ^ (-1023724324);
                        i3 = -1051604287;
                    } else {
                        iM55680 = (C0873.m55680("ۧ᩻") + i6) * 85;
                        i2 = ((iM55680 ^ i7) * 13759) ^ 1361759045;
                        i3 = 1336013987;
                    }
                    i9 = iM55680 ^ i3;
                    i8 = i2;
                    break;
                case 806860026:
                case 1471140123:
                    sArr = f82148;
                    if (C1194.f82045 != 0) {
                        c = 'j';
                        int iM559713 = (i6 - C0946.m55979("᩸֫")) * 7;
                        int i13 = ((iM559713 ^ i7) * (-5359)) ^ (-241276759);
                        i9 = iM559713 ^ (-2049534458);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i13;
                        c13120 = this;
                    } else {
                        int iM55684 = (C0873.m55680("۟ܰ") ^ i6) * (-49);
                        int i14 = ((iM55684 ^ i7) * (-9749)) ^ 1175543243;
                        i9 = iM55684 ^ (-1559736725);
                        c13120 = this;
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
                    editText.setSelection(RunnableC0938.m55935(editText));
                    break;
                default:
                    C0894.m55771(editText, f36861);
                    iM55680 = (i6 - C0946.m55979("ۧ۠")) * (-65);
                    i2 = ((iM55680 ^ i7) * 3561) ^ (-21134445);
                    i3 = 262470853;
                    i9 = iM55680 ^ i3;
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
