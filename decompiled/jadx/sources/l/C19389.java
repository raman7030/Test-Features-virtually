package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1PH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19389 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f62753 = new int[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f62752 = new int[0];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44663(int i, int i2, int i3, int[] iArr) {
        int i4 = 0;
        while (i4 < i3) {
            int i5 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i5;
            i4++;
            i++;
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44658(int[] iArr, int i, int i2, int i3, InterfaceC4571 interfaceC4571) {
        int iMo9675 = interfaceC4571.mo9675(iArr[i], iArr[i2]);
        int iMo9676 = interfaceC4571.mo9675(iArr[i], iArr[i3]);
        int iMo9677 = interfaceC4571.mo9675(iArr[i2], iArr[i3]);
        if (iMo9675 < 0) {
            if (iMo9677 >= 0) {
                if (iMo9676 < 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        if (iMo9677 <= 0) {
            if (iMo9676 > 0) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44661(int[] iArr, int i, int i2, InterfaceC4571 interfaceC4571) {
        int iM44658;
        int iM44659;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (interfaceC4571.mo9675(iArr[i6], iArr[i5]) < 0) {
                        i5 = i6;
                    }
                }
                if (i5 != i) {
                    int i7 = iArr[i];
                    iArr[i] = iArr[i5];
                    iArr[i5] = i7;
                }
                i = i4;
            }
            return;
        }
        int iM446510 = (i3 / 2) + i;
        int i8 = i2 - 1;
        if (i3 > 128) {
            int i9 = i3 / 8;
            int i10 = i9 * 2;
            iM44658 = m44658(iArr, i, i + i9, i + i10, interfaceC4571);
            iM446510 = m44658(iArr, iM446510 - i9, iM446510, iM446510 + i9, interfaceC4571);
            iM44659 = m44658(iArr, i8 - i10, i8 - i9, i8, interfaceC4571);
        } else {
            iM44658 = i;
            iM44659 = i8;
        }
        int i11 = iArr[m44658(iArr, iM44658, iM446510, iM44659, interfaceC4571)];
        int i12 = i;
        int i13 = i12;
        int i14 = i8;
        while (true) {
            if (i12 <= i8) {
                int iMo9675 = interfaceC4571.mo9675(iArr[i12], i11);
                if (iMo9675 <= 0) {
                    if (iMo9675 == 0) {
                        int i15 = iArr[i13];
                        iArr[i13] = iArr[i12];
                        iArr[i12] = i15;
                        i13++;
                    }
                    i12++;
                }
            }
            while (i8 >= i12) {
                int iMo9676 = interfaceC4571.mo9675(iArr[i8], i11);
                if (iMo9676 < 0) {
                    break;
                }
                if (iMo9676 == 0) {
                    int i16 = iArr[i8];
                    iArr[i8] = iArr[i14];
                    iArr[i14] = i16;
                    i14--;
                }
                i8--;
            }
            if (i12 > i8) {
                break;
            }
            int i17 = iArr[i12];
            iArr[i12] = iArr[i8];
            iArr[i8] = i17;
            i12++;
            i8--;
        }
        int i18 = i13 - i;
        int i19 = i12 - i13;
        int iMin = Math.min(i18, i19);
        m44663(i, i12 - iMin, iMin, iArr);
        int i20 = i14 - i8;
        int iMin2 = Math.min(i20, (i2 - i14) - 1);
        m44663(i12, i2 - iMin2, iMin2, iArr);
        if (i19 > 1) {
            m44661(iArr, i, i19 + i, interfaceC4571);
        }
        if (i20 > 1) {
            m44661(iArr, i2 - i20, i2, interfaceC4571);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44662(int[] iArr, int i, int i2, InterfaceC4571 interfaceC4571, int[] iArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (iArr2 == null) {
                iArr2 = Arrays.copyOf(iArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m44662(iArr2, i, i4, interfaceC4571, iArr);
            m44662(iArr2, i4, i2, interfaceC4571, iArr);
            if (interfaceC4571.mo9675(iArr2[i4 - 1], iArr2[i4]) <= 0) {
                System.arraycopy(iArr2, i, iArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC4571.mo9675(iArr2[i5], iArr2[i6]) <= 0)) {
                    iArr[i] = iArr2[i5];
                    i5++;
                } else {
                    iArr[i] = iArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            int i9 = iArr[i8];
            int i10 = iArr[i7];
            int i11 = i8;
            while (interfaceC4571.mo9675(i9, i10) < 0) {
                iArr[i11] = i10;
                if (i == i11 - 1) {
                    i11--;
                    break;
                }
                int i12 = i11 - 1;
                int i13 = iArr[i11 - 2];
                i11 = i12;
                i10 = i13;
            }
            iArr[i11] = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44657(int i, int i2, int i3, int[] iArr) {
        int iCompare = Integer.compare(iArr[i], iArr[i2]);
        int iCompare2 = Integer.compare(iArr[i], iArr[i3]);
        int iCompare3 = Integer.compare(iArr[i2], iArr[i3]);
        if (iCompare < 0) {
            if (iCompare3 >= 0) {
                if (iCompare2 < 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        if (iCompare3 <= 0) {
            if (iCompare2 > 0) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44659(int i, int i2, int[] iArr) {
        int iM44657;
        int iM44658;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (iArr[i6] < iArr[i5]) {
                        i5 = i6;
                    }
                }
                if (i5 != i) {
                    int i7 = iArr[i];
                    iArr[i] = iArr[i5];
                    iArr[i5] = i7;
                }
                i = i4;
            }
            return;
        }
        int iM44659 = (i3 / 2) + i;
        int i8 = i2 - 1;
        if (i3 > 128) {
            int i9 = i3 / 8;
            int i10 = i9 * 2;
            iM44657 = m44657(i, i + i9, i + i10, iArr);
            iM44659 = m44657(iM44659 - i9, iM44659, iM44659 + i9, iArr);
            iM44658 = m44657(i8 - i10, i8 - i9, i8, iArr);
        } else {
            iM44657 = i;
            iM44658 = i8;
        }
        int i11 = iArr[m44657(iM44657, iM44659, iM44658, iArr)];
        int i12 = i;
        int i13 = i12;
        int i14 = i8;
        while (true) {
            if (i12 <= i8) {
                int iCompare = Integer.compare(iArr[i12], i11);
                if (iCompare <= 0) {
                    if (iCompare == 0) {
                        int i15 = iArr[i13];
                        iArr[i13] = iArr[i12];
                        iArr[i12] = i15;
                        i13++;
                    }
                    i12++;
                }
            }
            while (i8 >= i12) {
                int iCompare2 = Integer.compare(iArr[i8], i11);
                if (iCompare2 < 0) {
                    break;
                }
                if (iCompare2 == 0) {
                    int i16 = iArr[i8];
                    iArr[i8] = iArr[i14];
                    iArr[i14] = i16;
                    i14--;
                }
                i8--;
            }
            if (i12 > i8) {
                break;
            }
            int i17 = iArr[i12];
            iArr[i12] = iArr[i8];
            iArr[i8] = i17;
            i12++;
            i8--;
        }
        int i18 = i13 - i;
        int i19 = i12 - i13;
        int iMin = Math.min(i18, i19);
        m44663(i, i12 - iMin, iMin, iArr);
        int i20 = i14 - i8;
        int iMin2 = Math.min(i20, (i2 - i14) - 1);
        m44663(i12, i2 - iMin2, iMin2, iArr);
        if (i19 > 1) {
            m44659(i, i19 + i, iArr);
        }
        if (i20 > 1) {
            m44659(i2 - i20, i2, iArr);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44660(int i, int[] iArr) {
        int i2;
        if (i < 2000) {
            m44659(0, i, iArr);
            return;
        }
        if (i < 1024) {
            m44659(0, i, iArr);
            return;
        }
        int[] iArr2 = new int[766];
        int[] iArr3 = new int[766];
        int[] iArr4 = new int[766];
        iArr2[0] = 0;
        iArr3[0] = i;
        iArr4[0] = 0;
        int i3 = 256;
        int[] iArr5 = new int[256];
        int[] iArr6 = new int[256];
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            int i5 = iArr2[i4];
            int i6 = iArr3[i4];
            int i7 = iArr4[i4];
            int i8 = i7 % 4;
            int i9 = i8 == 0 ? 128 : 0;
            int i10 = (3 - i8) * 8;
            int i11 = i6 + i5;
            int i12 = i11;
            while (true) {
                int i13 = i12 - 1;
                if (i12 == i5) {
                    break;
                }
                int i14 = ((iArr[i13] >>> i10) & 255) ^ i9;
                iArr5[i14] = iArr5[i14] + 1;
                i12 = i13;
            }
            int i15 = -1;
            int i16 = i5;
            for (int i17 = 0; i17 < i3; i17++) {
                int i18 = iArr5[i17];
                if (i18 != 0) {
                    i15 = i17;
                }
                i16 += i18;
                iArr6[i17] = i16;
            }
            int i19 = i11 - iArr5[i15];
            while (i5 <= i19) {
                int i20 = iArr[i5];
                int i21 = ((i20 >>> i10) & 255) ^ i9;
                if (i5 < i19) {
                    while (true) {
                        int i22 = iArr6[i21] - 1;
                        iArr6[i21] = i22;
                        if (i22 <= i5) {
                            break;
                        }
                        int i23 = iArr[i22];
                        iArr[i22] = i20;
                        i21 = ((i23 >>> i10) & 255) ^ i9;
                        i20 = i23;
                    }
                    iArr[i5] = i20;
                }
                if (i7 < 3 && (i2 = iArr5[i21]) > 1) {
                    if (i2 < 1024) {
                        m44659(i5, i2 + i5, iArr);
                    } else {
                        iArr2[i4] = i5;
                        iArr3[i4] = iArr5[i21];
                        iArr4[i4] = i7 + 1;
                        i4++;
                    }
                }
                i5 += iArr5[i21];
                iArr5[i21] = 0;
                i3 = 256;
            }
        }
    }
}
