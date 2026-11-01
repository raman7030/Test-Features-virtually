package p067l;

/* JADX INFO: renamed from: l.ܽ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1PJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18424 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C18424 f55060 = new C18424();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        byte b;
        long j;
        int[][] iArr = C19766.f60125;
        int i2 = 0;
        long j2 = 0;
        long j3 = 1;
        int i3 = 1;
        int i4 = 1;
        while (i2 < i - 1) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                i4++;
                if (-95 <= b2 && b2 <= -7 && ((64 <= (b = bArr[i2 + 1]) && b <= 126) || (-95 <= b && b <= -2))) {
                    i3++;
                    j3 += 500;
                    int i5 = b2 + 95;
                    int i6 = iArr[i5][(64 > b || b > 126) ? b + 159 : b - 64];
                    if (i6 != 0) {
                        j = i6;
                    } else if (3 <= i5 && i5 <= 37) {
                        j = 200;
                    }
                    j2 += j;
                }
                i2++;
            }
            i2++;
        }
        return (int) (((j2 / j3) * 50.0f) + ((i3 / i4) * 50.0f));
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48235;
    }
}
