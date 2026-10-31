package l;

import com.google.android.material.color.ColorResourcesTableCreator;

/* JADX INFO: renamed from: l.᩷᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41PP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21128 implements InterfaceC4194 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C21128 f68141 = new C21128();

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        byte b;
        long j;
        byte b2;
        int[][] iArr = C18305.f56909;
        int[][] iArr2 = C18305.f56911;
        int i2 = 0;
        long j2 = 0;
        long j3 = 1;
        int i3 = 1;
        int i4 = 1;
        while (i2 < i - 1) {
            byte b3 = bArr[i2];
            if (b3 < 0) {
                i4++;
                if (-95 <= b3 && b3 <= -9 && -95 <= (b2 = bArr[i2 + 1]) && b2 <= -2) {
                    i3++;
                    j3 += 500;
                    int i5 = b3 + 95;
                    int i6 = iArr[i5][b2 + 95];
                    if (i6 != 0) {
                        j = i6;
                    } else if (15 <= i5 && i5 < 55) {
                        j = 200;
                    }
                    j2 += j;
                } else if (-127 <= b3 && b3 <= -2 && ((b = bArr[i2 + 1]) <= -2 || (64 <= b && b <= 126))) {
                    i3++;
                    j3 += 500;
                    int i7 = iArr2[b3 + ColorResourcesTableCreator.APPLICATION_PACKAGE_ID][(64 > b || b > 126) ? b + 192 : b - 64];
                    if (i7 != 0) {
                        j = i7;
                        j2 += j;
                    }
                }
                i2++;
            }
            i2++;
        }
        return ((int) (((j2 / j3) * 50.0f) + ((i3 / i4) * 50.0f))) - 1;
    }

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45128;
    }
}
