package p067l;

/* JADX INFO: renamed from: l.ۧܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N53S */
/* JADX INFO: loaded from: classes4.dex */
public final class C12921 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        int[] iArr = (int[]) ((C13731) c17613.m40106()).m31229();
        byte[] bArr = (byte[]) ((C13731) c17613.m40106()).m31229();
        C13731 c13731 = new C13731();
        int length = bArr.length >> 2;
        int[] iArr2 = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (((~bArr[i + 1]) & 255) << 8) | (bArr[i] & 255);
            int i4 = i + 3;
            int i5 = i3 | ((bArr[i + 2] & 255) << 16);
            i += 4;
            iArr2[i2] = i5 | (((~bArr[i4]) & 255) << 24);
        }
        int i6 = iArr[0];
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = iArr2[i10];
            int i12 = i10 + 1;
            int i13 = iArr2[i12];
            int i14 = 0;
            for (int i15 = 0; i15 < 64; i15++) {
                i14 -= 1640531527;
                i11 += (((i13 << 4) + i6) ^ (i13 + i14)) ^ ((i13 >> 5) + i7);
                i13 += (((i11 << 4) + i8) ^ (i11 + i14)) ^ ((i11 >> 5) + i9);
            }
            iArr2[i10] = i11;
            iArr2[i12] = i13;
        }
        int i16 = length - 1;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = iArr2[i17];
            int i19 = iArr2[i16];
            int i20 = 0;
            for (int i21 = 0; i21 < 16; i21++) {
                i20 -= 1640531527;
                i18 += (((i19 << 4) + i6) ^ (i19 + i20)) ^ ((i19 >> 5) + i7);
                i19 += (((i18 << 4) + i8) ^ (i18 + i20)) ^ ((i18 >> 5) + i9);
            }
            iArr2[i17] = i18;
            iArr2[i16] = i19;
        }
        c13731.m31208(iArr2);
        c17613.m40105(c13731);
    }
}
