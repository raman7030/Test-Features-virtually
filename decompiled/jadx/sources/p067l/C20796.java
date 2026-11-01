package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1PH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20796 {

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f65364 = new int[0];

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f65363 = new int[0];

    /* JADX INFO: renamed from: ۧ */
    public static void m46957(int i, int i2, int i3, int[] iArr) {
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
    /* JADX INFO: renamed from: ֫ */
    public static int m46952(int[] iArr, int i, int i2, int i3, InterfaceC6713 interfaceC6713) {
        int iMo11719 = interfaceC6713.mo11719(iArr[i], iArr[i2]);
        int iMo117110 = interfaceC6713.mo11719(iArr[i], iArr[i3]);
        int iMo117111 = interfaceC6713.mo11719(iArr[i2], iArr[i3]);
        if (iMo11719 < 0) {
            if (iMo117111 >= 0) {
                if (iMo117110 < 0) {
                    return i3;
                }
                return i;
            }
            return i2;
        }
        if (iMo117111 <= 0) {
            if (iMo117110 > 0) {
                return i3;
            }
            return i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46955(int[] iArr, int i, int i2, InterfaceC6713 interfaceC6713) {
        int iM46952;
        int iM46953;
        int i3 = i2 - i;
        if (i3 < 16) {
            while (i < i2 - 1) {
                int i4 = i + 1;
                int i5 = i;
                for (int i6 = i4; i6 < i2; i6++) {
                    if (interfaceC6713.mo11719(iArr[i6], iArr[i5]) < 0) {
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
        int iM46954 = (i3 / 2) + i;
        int i8 = i2 - 1;
        if (i3 > 128) {
            int i9 = i3 / 8;
            int i10 = i9 * 2;
            iM46952 = m46952(iArr, i, i + i9, i + i10, interfaceC6713);
            iM46954 = m46952(iArr, iM46954 - i9, iM46954, iM46954 + i9, interfaceC6713);
            iM46953 = m46952(iArr, i8 - i10, i8 - i9, i8, interfaceC6713);
        } else {
            iM46952 = i;
            iM46953 = i8;
        }
        int i11 = iArr[m46952(iArr, iM46952, iM46954, iM46953, interfaceC6713)];
        int i12 = i;
        int i13 = i12;
        int i14 = i8;
        while (true) {
            if (i12 <= i8) {
                int iMo11719 = interfaceC6713.mo11719(iArr[i12], i11);
                if (iMo11719 <= 0) {
                    if (iMo11719 == 0) {
                        int i15 = iArr[i13];
                        iArr[i13] = iArr[i12];
                        iArr[i12] = i15;
                        i13++;
                    }
                    i12++;
                }
            }
            while (i8 >= i12) {
                int iMo117110 = interfaceC6713.mo11719(iArr[i8], i11);
                if (iMo117110 < 0) {
                    break;
                }
                if (iMo117110 == 0) {
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
        m46957(i, i12 - iMin, iMin, iArr);
        int i20 = i14 - i8;
        int iMin2 = Math.min(i20, (i2 - i14) - 1);
        m46957(i12, i2 - iMin2, iMin2, iArr);
        if (i19 > 1) {
            m46955(iArr, i, i19 + i, interfaceC6713);
        }
        if (i20 > 1) {
            m46955(iArr, i2 - i20, i2, interfaceC6713);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46956(int[] iArr, int i, int i2, InterfaceC6713 interfaceC6713, int[] iArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (iArr2 == null) {
                iArr2 = Arrays.copyOf(iArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            m46956(iArr2, i, i4, interfaceC6713, iArr);
            m46956(iArr2, i4, i2, interfaceC6713, iArr);
            if (interfaceC6713.mo11719(iArr2[i4 - 1], iArr2[i4]) <= 0) {
                System.arraycopy(iArr2, i, iArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && interfaceC6713.mo11719(iArr2[i5], iArr2[i6]) <= 0)) {
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
            while (interfaceC6713.mo11719(i9, i10) < 0) {
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
    /* JADX INFO: renamed from: ֫ */
    public static int m46951(int i, int i2, int i3, int[] iArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m46953(int i, int i2, int[] iArr) {
        int iM46951;
        int iM46952;
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
        int iM46953 = (i3 / 2) + i;
        int i8 = i2 - 1;
        if (i3 > 128) {
            int i9 = i3 / 8;
            int i10 = i9 * 2;
            iM46951 = m46951(i, i + i9, i + i10, iArr);
            iM46953 = m46951(iM46953 - i9, iM46953, iM46953 + i9, iArr);
            iM46952 = m46951(i8 - i10, i8 - i9, i8, iArr);
        } else {
            iM46951 = i;
            iM46952 = i8;
        }
        int i11 = iArr[m46951(iM46951, iM46953, iM46952, iArr)];
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
        m46957(i, i12 - iMin, iMin, iArr);
        int i20 = i14 - i8;
        int iMin2 = Math.min(i20, (i2 - i14) - 1);
        m46957(i12, i2 - iMin2, iMin2, iArr);
        if (i19 > 1) {
            m46953(i, i19 + i, iArr);
        }
        if (i20 > 1) {
            m46953(i2 - i20, i2, iArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46954(int i, int[] iArr) {
        int i2;
        if (i < 2000) {
            m46953(0, i, iArr);
            return;
        }
        if (i < 1024) {
            m46953(0, i, iArr);
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
                        m46953(i5, i2 + i5, iArr);
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
