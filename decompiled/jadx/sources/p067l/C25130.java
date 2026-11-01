package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;

/* JADX INFO: renamed from: l.᩻᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QI */
/* JADX INFO: loaded from: classes.dex */
public final class C25130 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C25130 f80417 = new C25130();

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r11 != 0) goto L41;
     */
    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo5050(int i, byte[] bArr) {
        int i2;
        byte b;
        byte b2;
        byte b3;
        int i3;
        byte b4;
        int i4;
        long j;
        int i5;
        byte b5;
        int[][] iArr = C19766.f60127;
        int[][] iArr2 = C19766.f60129;
        int i6 = 0;
        long j2 = 0;
        long j3 = 1;
        int i7 = 1;
        int i8 = 1;
        while (i6 < i - 1) {
            byte b6 = bArr[i6];
            if (b6 < 0) {
                i8++;
                if (-95 <= b6 && b6 <= -9 && (i5 = i6 + 1) < i && -95 <= (b5 = bArr[i5]) && b5 <= -2) {
                    i7++;
                    j3 += 500;
                    int i9 = b6 + 95;
                    i4 = iArr[i9][b5 + 95];
                    if (i4 != 0) {
                        j = i4;
                    } else if (15 <= i9 && i9 < 55) {
                        j = 200;
                    }
                    j2 += j;
                } else if (-127 <= b6 && b6 <= -2 && (i3 = i6 + 1) < i && ((b4 = bArr[i3]) <= -2 || (64 <= b4 && b4 <= 126))) {
                    i7++;
                    j3 += 500;
                    i4 = iArr2[b6 + ColorResourcesTableCreator.APPLICATION_PACKAGE_ID][(64 > b4 || b4 > 126) ? b4 + 192 : b4 - 64];
                } else if (-127 <= b6 && b6 <= -2 && (i2 = i6 + 3) < i && 48 <= (b = bArr[i6 + 1]) && b <= 57 && -127 <= (b2 = bArr[i6 + 2]) && b2 <= -2 && 48 <= (b3 = bArr[i2]) && b3 <= 57) {
                    i7++;
                }
                i6++;
            }
            i6++;
        }
        return ((int) (((j2 / j3) * 50.0f) + ((i7 / i8) * 50.0f))) - 1;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48246;
    }
}
