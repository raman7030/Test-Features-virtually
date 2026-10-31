package l;

/* JADX INFO: renamed from: l.ۢ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1QK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9839 implements InterfaceC4194 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9839 f29727 = new C9839();

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        int i2;
        int i3;
        byte b;
        long j;
        int i4;
        int i5;
        byte b2;
        long j2;
        int[][] iArr = C18305.f56909;
        int[][] iArr2 = C18305.f56908;
        int i6 = 0;
        long j3 = 0;
        long j4 = 1;
        int i7 = 1;
        int i8 = 1;
        while (i6 < i - 1) {
            byte b3 = 27;
            if (bArr[i6] == 27 && (i2 = i6 + 3) < i) {
                byte b4 = bArr[i6 + 1];
                if (b4 != 36 || bArr[i6 + 2] != 41 || bArr[i2] != 65) {
                    if (i2 < i && b4 == 36 && bArr[i6 + 2] == 41 && bArr[i2] == 71) {
                        i6 += 4;
                        while (true) {
                            byte b5 = bArr[i6];
                            if (b5 == 27) {
                                break;
                            }
                            i8++;
                            if (33 <= b5 && b5 <= 126 && 33 <= (b = bArr[(i3 = i6 + 1)]) && b <= 126) {
                                i7++;
                                j4 += 500;
                                int i9 = b5 - 33;
                                int i10 = iArr2[i9][b - 33];
                                if (i10 != 0) {
                                    j = i10;
                                } else {
                                    if (35 <= i9 && i9 <= 92) {
                                        j = 150;
                                    }
                                    i6 = i3;
                                }
                                j3 += j;
                                i6 = i3;
                            }
                            i6++;
                        }
                    }
                } else {
                    i6 += 4;
                    while (true) {
                        byte b6 = bArr[i6];
                        if (b6 == b3) {
                            break;
                        }
                        i8++;
                        if (33 <= b6 && b6 <= 119 && 33 <= (b2 = bArr[(i5 = i6 + 1)]) && b2 <= 119) {
                            i7++;
                            int i11 = b6 - 33;
                            j4 += 500;
                            int i12 = iArr[i11][b2 - 33];
                            if (i12 != 0) {
                                j2 = i12;
                            } else {
                                if (15 <= i11 && i11 < 55) {
                                    j2 = 200;
                                }
                                i6 = i5;
                            }
                            j3 += j2;
                            i6 = i5;
                        }
                        i6++;
                        b3 = 27;
                    }
                }
                if (bArr[i6] == 27 && (i4 = i6 + 2) < i && bArr[i6 + 1] == 40 && bArr[i4] == 66) {
                    i6 = i4;
                }
            }
            i6++;
        }
        return (int) (((j3 / j4) * 50.0f) + ((i7 / i8) * 50.0f));
    }

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45136;
    }
}
