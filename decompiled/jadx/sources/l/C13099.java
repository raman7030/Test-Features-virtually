package l;

/* JADX INFO: renamed from: l.۬ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CY */
/* JADX INFO: loaded from: classes3.dex */
public final class C13099 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31761(int i, int i2, byte[] bArr) {
        return bArr[i] == bArr[i2] && bArr[i + 1] == bArr[i2 + 1] && bArr[i + 2] == bArr[i2 + 2] && bArr[i + 3] == bArr[i2 + 3];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31760(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            int i5 = i + i4;
            int i6 = i2 + i4;
            for (int i7 = 0; i7 < 8; i7++) {
                try {
                    bArr2[i6 + i7] = bArr[i5 + i7];
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new C3928(C19370.m44628(i, "Malformed input at offset "));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31757(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31763(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i > 0 && i2 > i3) {
            i--;
            i2--;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31759(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int iM31762 = i5 + 1;
        if (iM31762 + i9 + 8 + (i9 >>> 8) > i6) {
            throw new C3928("maxDestLen is too small");
        }
        if (i9 >= 15) {
            iM31762 = m31762(i9 - 15, iM31762, bArr2);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        m31760(i, bArr, iM31762, bArr2, i9);
        int i10 = iM31762 + i9;
        int i11 = i2 - i3;
        bArr2[i10] = (byte) i11;
        int iM31763 = i10 + 2;
        bArr2[i10 + 1] = (byte) (i11 >>> 8);
        int i12 = i4 - 4;
        if (i10 + 8 + (i12 >>> 8) > i6) {
            throw new C3928("maxDestLen is too small");
        }
        if (i12 >= 15) {
            i8 = i7 | 15;
            iM31763 = m31762(i4 - 19, iM31763, bArr2);
        } else {
            i8 = i12 | i7;
        }
        bArr2[i5] = (byte) i8;
        return iM31763;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31758(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int iM31762;
        if (((i2 + 240) / 255) + i3 + i2 + 1 > i4) {
            throw new C3928();
        }
        if (i2 >= 15) {
            bArr2[i3] = -16;
            iM31762 = m31762(i2 - 15, i3 + 1, bArr2);
        } else {
            bArr2[i3] = (byte) (i2 << 4);
            iM31762 = i3 + 1;
        }
        System.arraycopy(bArr, i, bArr2, iM31762, i2);
        return iM31762 + i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31762(int i, int i2, byte[] bArr) {
        while (i >= 255) {
            bArr[i2] = -1;
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        return i3;
    }
}
