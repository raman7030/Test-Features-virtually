package p067l;

/* JADX INFO: renamed from: l.ۗۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5431 extends AbstractC5050 {

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC5050 f12957 = new C5431(5);

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final int mo10771(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C8377.m19512(0, i, bArr);
        C8377.m19512(0, i2, bArr2);
        if (i2 == 0) {
            if (i == 1 && bArr[0] == 0) {
                return 0;
            }
            throw new C6102("Output buffer too small");
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            byte b = bArr[i7];
            i3 = i7 + 1;
            i4 = (b & 255) >>> 4;
            if (i4 == 15) {
                byte b2 = -1;
                while (i3 < i) {
                    int i9 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 != -1) {
                        b2 = b3;
                        i3 = i9;
                        break;
                    }
                    i4 += 255;
                    b2 = b3;
                    i3 = i9;
                }
                i4 += b2 & 255;
            }
            i5 = i8 + i4;
            int i10 = i2 - 8;
            if (i5 > i10 || (i6 = i3 + i4) > i - 8) {
                break;
            }
            C14818.m33850(i3, bArr, i8, bArr2, i4);
            int i11 = (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8);
            int i12 = i6 + 2;
            int i13 = i5 - i11;
            if (i13 < 0) {
                throw new C6102(C20778.m46922(i12, "Malformed input at "));
            }
            int i14 = b & 15;
            if (i14 == 15) {
                byte b4 = -1;
                while (i12 < i) {
                    int i15 = i12 + 1;
                    byte b5 = bArr[i12];
                    if (b5 != -1) {
                        i12 = i15;
                        b4 = b5;
                        break;
                    }
                    i14 += 255;
                    i12 = i15;
                    b4 = b5;
                }
                i14 += b4 & 255;
            }
            int i16 = i14;
            int i17 = i12;
            int i18 = i16 + 4;
            int i19 = i5 + i18;
            if (i19 <= i10) {
                do {
                    for (int i20 = 0; i20 < 8; i20++) {
                        bArr2[i5 + i20] = bArr2[i13 + i20];
                    }
                    i13 += 8;
                    i5 += 8;
                } while (i5 < i19);
            } else {
                if (i19 > i2) {
                    throw new C6102(C20778.m46922(i17, "Malformed input at "));
                }
                for (int i21 = 0; i21 < i18; i21++) {
                    bArr2[i5 + i21] = bArr2[i13 + i21];
                }
            }
            i7 = i17;
            i8 = i19;
        }
        if (i5 > i2) {
            throw new C6102();
        }
        if (i3 + i4 != i) {
            throw new C6102(C20778.m46922(i3, "Malformed input at "));
        }
        System.arraycopy(bArr, i3, bArr2, i8, i4);
        return i5;
    }
}
