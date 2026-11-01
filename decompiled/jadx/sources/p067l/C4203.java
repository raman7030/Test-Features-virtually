package p067l;

/* JADX INFO: renamed from: l.֫ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N53S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4203 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        byte[] bArr;
        int[] iArr = (int[]) ((C13731) c17613.m40106()).m31229();
        int[] iArr2 = (int[]) ((C13731) c17613.m40106()).m31229();
        C13731 c13731 = new C13731();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int length = iArr2.length;
        int i5 = length - 1;
        for (int i6 = length - 2; i6 >= 0; i6--) {
            int i7 = iArr2[i6];
            int i8 = iArr2[i5];
            int i9 = -478700656;
            for (int i10 = 0; i10 < 16; i10++) {
                i8 -= (((i7 << 4) + i3) ^ (i7 + i9)) ^ ((i7 >> 5) + i4);
                i7 -= (((i8 << 4) + i) ^ (i8 + i9)) ^ ((i8 >> 5) + i2);
                i9 += 1640531527;
            }
            iArr2[i6] = i7;
            iArr2[i5] = i8;
        }
        for (int i11 = 0; i11 < iArr2.length; i11 += 2) {
            int i12 = iArr2[i11];
            int i13 = i11 + 1;
            int i14 = iArr2[i13];
            int i15 = -1914802624;
            for (int i16 = 0; i16 < 64; i16++) {
                i14 -= (((i12 << 4) + i3) ^ (i12 + i15)) ^ ((i12 >> 5) + i4);
                i12 -= (((i14 << 4) + i) ^ (i14 + i15)) ^ ((i14 >> 5) + i2);
                i15 += 1640531527;
            }
            iArr2[i11] = i12;
            iArr2[i13] = i14;
        }
        int i17 = iArr2[0];
        int i18 = ((~i17) & (-16711936)) | (16711935 & i17);
        if (i18 < 0 || i18 > ((iArr2.length - 1) << 2)) {
            bArr = new byte[0];
        } else {
            bArr = new byte[i18];
            int i19 = 0;
            for (int i20 = 1; i20 < iArr2.length && i19 != i18; i20++) {
                int i21 = i19 + 1;
                int i22 = iArr2[i20];
                bArr[i19] = (byte) (i22 & 255);
                if (i21 != i18) {
                    int i23 = i19 + 2;
                    int i24 = ~i22;
                    bArr[i21] = (byte) ((i24 >>> 8) & 255);
                    if (i23 == i18) {
                        i19 = i23;
                        break;
                    }
                    i21 = i19 + 3;
                    bArr[i23] = (byte) ((i22 >>> 16) & 255);
                    if (i21 != i18) {
                        i19 += 4;
                        bArr[i21] = (byte) ((i24 >>> 24) & 255);
                    }
                }
                i19 = i21;
            }
            if (i19 != i18) {
                bArr = new byte[0];
            }
        }
        c13731.m31208(bArr);
        c17613.m40105(c13731);
    }
}
