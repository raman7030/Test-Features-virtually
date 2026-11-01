package p067l;

/* JADX INFO: renamed from: l.ۚ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7696 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C7696 f20192 = new C7696();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && i4 == 0 && i5 == 0) {
                return 100;
            }
        }
        return 0;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48247;
    }
}
