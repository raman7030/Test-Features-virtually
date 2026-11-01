package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D2BE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14706 {

    /* JADX INFO: renamed from: ܽ */
    public static final int[][] f41936 = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: ֫ */
    public static final int[][] f41934 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: ۧ */
    public static final int[][] f41935 = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, IShizukuService.Stub.TRANSACTION_attachUserService, -1, -1}, new int[]{6, 28, 54, 80, IShizukuService.Stub.TRANSACTION_getFlagsForUid, -1, -1}, new int[]{6, 32, 58, 84, UMErrorCode.E_UM_BE_JSON_FAILED, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, IShizukuService.Stub.TRANSACTION_attachUserService, 126, -1}, new int[]{6, 26, 52, 78, IShizukuService.Stub.TRANSACTION_isHidden, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, IShizukuService.Stub.TRANSACTION_attachUserService, 126, 150}, new int[]{6, 24, 50, 76, IShizukuService.Stub.TRANSACTION_attachUserService, 128, EnumC19222.f57460}, new int[]{6, 28, 54, 80, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 132, 158}, new int[]{6, 32, 58, 84, UMErrorCode.E_UM_BE_JSON_FAILED, 136, 162}, new int[]{6, 26, 54, 82, UMErrorCode.E_UM_BE_JSON_FAILED, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: ᩳ */
    public static final int[][] f41937 = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33633(int i) {
        return i == -1;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x022f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0231  */
    /* JADX WARN: Code duplicated, block: B:94:0x0234  */
    /* JADX INFO: renamed from: ֫ */
    public static void m33632(C10684 c10684, EnumC2636 enumC2636, C16717 c16717, int i, C23424 c23424) {
        boolean zM24603;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int iM52111;
        int iM52112;
        c23424.m52107();
        int i6 = 0;
        int length = f41936[0].length;
        m33634(0, 0, c23424);
        m33634(c23424.m52112() - length, 0, c23424);
        m33634(0, c23424.m52112() - length, c23424);
        m33631(0, 7, c23424);
        m33631(c23424.m52112() - 8, 7, c23424);
        m33631(0, c23424.m52112() - 8, c23424);
        m33635(7, 0, c23424);
        m33635(c23424.m52111() - 8, 0, c23424);
        m33635(7, c23424.m52111() - 7, c23424);
        if (c23424.m52106(8, c23424.m52111() - 8) == 0) {
            throw new C11355();
        }
        c23424.m52108(8, c23424.m52111() - 8, 1);
        int i7 = 5;
        if (c16717.m37940() >= 2) {
            int[] iArr = f41935[c16717.m37940() - 1];
            int length2 = iArr.length;
            int i8 = 0;
            while (i8 < length2) {
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    int length3 = iArr.length;
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        if (i11 >= 0 && m33633(c23424.m52106(i11, i9))) {
                            int i12 = i11 - 2;
                            int i13 = i9 - 2;
                            while (i6 < i7) {
                                int[] iArr2 = f41934[i6];
                                int i14 = 0;
                                while (i14 < i7) {
                                    c23424.m52108(i12 + i14, i13 + i6, iArr2[i14]);
                                    i14++;
                                    i7 = 5;
                                }
                                i6++;
                                i7 = 5;
                            }
                        }
                        i10++;
                        i6 = 0;
                        i7 = 5;
                    }
                }
                i8++;
                i6 = 0;
                i7 = 5;
            }
        }
        int i15 = 8;
        while (i15 < c23424.m52112() - 8) {
            int i16 = i15 + 1;
            int i17 = i16 % 2;
            if (m33633(c23424.m52106(i15, 6))) {
                c23424.m52108(i15, 6, i17);
            }
            if (m33633(c23424.m52106(6, i15))) {
                c23424.m52108(6, i15, i17);
            }
            i15 = i16;
        }
        C10684 c10685 = new C10684();
        if (i < 0 || i >= 8) {
            throw new C11355("Invalid mask pattern");
        }
        int iM4024 = (enumC2636.m4024() << 3) | i;
        c10685.m24600(iM4024, 5);
        c10685.m24600(m33630(iM4024, 1335), 10);
        C10684 c10686 = new C10684();
        c10686.m24600(21522, 15);
        c10685.m24604(c10686);
        if (c10685.getSize() != 15) {
            throw new C11355("should not happen but we got: " + c10685.getSize());
        }
        for (int i18 = 0; i18 < c10685.getSize(); i18++) {
            boolean zM24604 = c10685.m24603((c10685.getSize() - 1) - i18);
            int[] iArr3 = f41937[i18];
            c23424.m52109(iArr3[0], iArr3[1], zM24604);
            if (i18 < 8) {
                iM52112 = (c23424.m52112() - i18) - 1;
                iM52111 = 8;
            } else {
                iM52111 = (i18 - 8) + (c23424.m52111() - 7);
                iM52112 = 8;
            }
            c23424.m52109(iM52112, iM52111, zM24604);
        }
        if (c16717.m37940() >= 7) {
            C10684 c10687 = new C10684();
            c10687.m24600(c16717.m37940(), 6);
            c10687.m24600(m33630(c16717.m37940(), 7973), 12);
            if (c10687.getSize() != 18) {
                throw new C11355("should not happen but we got: " + c10687.getSize());
            }
            int i19 = 17;
            for (int i20 = 0; i20 < 6; i20++) {
                for (int i21 = 0; i21 < 3; i21++) {
                    boolean zM24605 = c10687.m24603(i19);
                    i19--;
                    c23424.m52109(i20, (c23424.m52111() - 11) + i21, zM24605);
                    c23424.m52109((c23424.m52111() - 11) + i21, i20, zM24605);
                }
            }
        }
        int iM52113 = c23424.m52112() - 1;
        int iM52114 = c23424.m52111() - 1;
        int i22 = 0;
        int i23 = -1;
        while (iM52113 > 0) {
            if (iM52113 == 6) {
                iM52113--;
            }
            while (iM52114 >= 0 && iM52114 < c23424.m52111()) {
                for (int i24 = 0; i24 < 2; i24++) {
                    int i25 = iM52113 - i24;
                    if (m33633(c23424.m52106(i25, iM52114))) {
                        if (i22 < c10684.getSize()) {
                            zM24603 = c10684.m24603(i22);
                            i22++;
                        } else {
                            zM24603 = false;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i2 = iM52114 + i25;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 1:
                                    i3 = iM52114 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 2:
                                    i3 = i25 % 3;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 3:
                                    i3 = (iM52114 + i25) % 3;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 4:
                                    i3 = ((i25 / 3) + (iM52114 / 2)) & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 5:
                                    int i26 = iM52114 * i25;
                                    i3 = (i26 % 3) + (i26 & 1);
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 6:
                                    int i27 = iM52114 * i25;
                                    i4 = i27 & 1;
                                    i5 = i27 % 3;
                                    i2 = i5 + i4;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                case 7:
                                    i5 = (iM52114 * i25) % 3;
                                    i4 = (iM52114 + i25) & 1;
                                    i2 = i5 + i4;
                                    i3 = i2 & 1;
                                    if (i3 == 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        zM24603 = !zM24603;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(C20778.m46922(i, "Invalid mask pattern: "));
                            }
                        }
                        c23424.m52109(i25, iM52114, zM24603);
                    }
                }
                iM52114 += i23;
            }
            i23 = -i23;
            iM52114 += i23;
            iM52113 -= 2;
        }
        if (i22 == c10684.getSize()) {
            return;
        }
        throw new C11355("Not all bits consumed: " + i22 + '/' + c10684.getSize());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33630(int i, int i2) {
        if (i2 != 0) {
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
            int i3 = 32 - iNumberOfLeadingZeros;
            int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
                iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
            }
            return iNumberOfLeadingZeros2;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33631(int i, int i2, C23424 c23424) throws C11355 {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m33633(c23424.m52106(i4, i2))) {
                throw new C11355();
            }
            c23424.m52108(i4, i2, 0);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m33635(int i, int i2, C23424 c23424) throws C11355 {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m33633(c23424.m52106(i, i4))) {
                throw new C11355();
            }
            c23424.m52108(i, i4, 0);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33634(int i, int i2, C23424 c23424) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f41936[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                c23424.m52108(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }
}
