package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;

/* JADX INFO: renamed from: l.۠᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1QZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10378 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C10378 f28721 = new C10378();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        if (i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
            return 99;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i) {
            byte b = bArr[i2];
            if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == b) {
                i3++;
            } else {
                int i5 = i2 + 1;
                if (i5 >= i || -64 > b || b > -33 || bArr[i5] > -65) {
                    int i6 = i2 + 2;
                    if (i6 >= i || -32 > b || b > -17 || bArr[i5] > -65 || bArr[i6] > -65) {
                        int i7 = i2 + 3;
                        if (i7 < i && (b & 255) == 240 && (bArr[i5] & 255) == 159 && (bArr[i6] & 255) >= 128) {
                            i4 += 4;
                            i2 = i7;
                        }
                    } else {
                        i4 += 3;
                        i2 = i6;
                    }
                } else {
                    i4 += 2;
                    i2 = i5;
                }
            }
            i2++;
        }
        if (i3 == i) {
            return 100;
        }
        int i8 = (int) ((i4 / (i - i3)) * 100.0f);
        if (i8 <= 98 && (i8 <= 95 || i4 <= 30)) {
            return 0;
        }
        return i8;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48248;
    }
}
