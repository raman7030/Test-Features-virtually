package p067l;

import android.os.Build;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۗ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7HY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5329 {

    /* JADX INFO: renamed from: ֫ */
    public static final boolean[][] f12540 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 15, 15);

    /* JADX INFO: renamed from: ֫ */
    public static int m11539(CharSequence charSequence, int i, int i2, InterfaceC6670 interfaceC6670) {
        C12826.checkFromToIndex(i, i2, charSequence.length());
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        int iM11538 = m11538(iCodePointAt);
        int i3 = iM11538 == 6 ? 1 : 0;
        boolean z = iM11538 == 14;
        while (iCharCount < i2) {
            int iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
            int iM11539 = m11538(iCodePointAt2);
            if (interfaceC6670 != null && ((C10023) interfaceC6670).m23374()) {
                return -2;
            }
            if ((!z || iM11538 != 5 || iM11539 != 14) && ((i3 % 2 != 1 || iM11538 != 6 || iM11539 != 6) && f12540[iM11538][iM11539])) {
                if (iCharCount > i) {
                    break;
                }
                i3 = 0;
                z = iM11539 == 14;
            }
            i3 += iM11539 == 6 ? 1 : 0;
            iCharCount += Character.charCount(iCodePointAt2);
            iM11538 = iM11539;
        }
        if (interfaceC6670 == null || !(((C10023) interfaceC6670).m23374() || Thread.currentThread().isInterrupted())) {
            return iCharCount;
        }
        return -2;
    }

    static {
        for (int i = 0; i <= 14; i++) {
            for (int i2 = 0; i2 <= 14; i2++) {
                f12540[i][i2] = true;
            }
        }
        boolean[][] zArr = f12540;
        boolean[] zArr2 = zArr[9];
        zArr2[9] = false;
        zArr2[10] = false;
        zArr2[12] = false;
        zArr2[13] = false;
        boolean[] zArr3 = zArr[12];
        zArr3[10] = false;
        zArr3[11] = false;
        boolean[] zArr4 = zArr[10];
        zArr4[10] = false;
        zArr4[11] = false;
        zArr[13][11] = false;
        zArr[11][11] = false;
        for (int i3 = 0; i3 <= 14; i3++) {
            boolean[][] zArr5 = f12540;
            boolean[] zArr6 = zArr5[i3];
            zArr6[4] = false;
            zArr6[5] = false;
            zArr6[8] = false;
            zArr5[7][i3] = false;
        }
        for (int i4 = 0; i4 <= 14; i4++) {
            for (int i5 = 1; i5 <= 3; i5++) {
                boolean[][] zArr7 = f12540;
                zArr7[i4][i5] = true;
                zArr7[i5][i4] = true;
            }
        }
        boolean[][] zArr8 = f12540;
        zArr8[1][2] = false;
        boolean[] zArr9 = zArr8[14];
        zArr9[4] = false;
        zArr9[5] = false;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x00f7 A[FALL_THROUGH, RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x0138 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static int m11538(int i) {
        if (i < 127) {
            if (i >= 32) {
                return 0;
            }
            if (i == 13) {
                return 1;
            }
            return i == 10 ? 2 : 3;
        }
        if (Build.VERSION.SDK_INT >= 36) {
            if (Character.isExtendedPictographic(i)) {
                return 14;
            }
        } else if (C12810.m29356(i)) {
            return 14;
        }
        int iM9241 = C4426.m9241(i);
        if (iM9241 != 0) {
            if (iM9241 != 19) {
                if (iM9241 != 27) {
                    if (iM9241 == 28) {
                        return (i < 127462 || i > 127487) ? 0 : 6;
                    }
                    switch (iM9241) {
                        case 4:
                            break;
                        case 5:
                            if (i == 3635 || i == 3763) {
                                return 8;
                            }
                            if (i >= 4352 && i <= 4607) {
                                if (i <= 4447) {
                                    return 9;
                                }
                                return i <= 4519 ? 10 : 11;
                            }
                            int i2 = i - 44032;
                            if (i2 >= 0 && i2 < 11172) {
                                return i2 % 28 == 0 ? 12 : 13;
                            }
                            if (i >= 43360 && i <= 43388) {
                                return 9;
                            }
                            if (i >= 55216 && i <= 55238) {
                                return 10;
                            }
                            if (i >= 55243 && i <= 55291) {
                                return 11;
                            }
                            switch (i) {
                                default:
                                    switch (i) {
                                        default:
                                            switch (i) {
                                                case 72324:
                                                case 72325:
                                                case 72326:
                                                case 72327:
                                                case 72328:
                                                case 72329:
                                                    break;
                                                default:
                                                    return 0;
                                            }
                                        case 70082:
                                        case 70083:
                                            return 7;
                                    }
                                case 3406:
                                case 71999:
                                case 72001:
                                case 72250:
                                case 73030:
                                case 73474:
                                    return 7;
                            }
                            break;
                        case 6:
                        case 7:
                            return 4;
                        case 8:
                            return (i == 4139 || i == 4140 || i == 4152 || (i >= 4194 && i <= 4196) || ((i >= 4199 && i <= 4205) || i == 4227 || ((i >= 4231 && i <= 4236) || i == 4239 || ((i >= 4250 && i <= 4252) || i == 6753 || i == 6755 || i == 6756 || i == 43643 || i == 43645)))) ? 0 : 8;
                        default:
                            switch (iM9241) {
                                case 13:
                                case 14:
                                case 15:
                                    break;
                                case 16:
                                    if (i == 8204 || (i >= 917536 && i <= 917631)) {
                                        return 4;
                                    }
                                    if (i == 8205) {
                                        return 5;
                                    }
                                    return ((i >= 1536 && i <= 1541) || i == 1757 || i == 1807 || i == 2192 || i == 2193 || i == 2274 || i == 69821 || i == 69837) ? 7 : 3;
                                default:
                                    return 0;
                            }
                            break;
                    }
                }
                return (i == 65438 || i == 65439 || (i >= 127995 && i <= 127999)) ? 4 : 0;
            }
        } else if (i == 888) {
            return 0;
        }
        return 3;
    }
}
