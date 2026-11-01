package p067l;

/* JADX INFO: renamed from: l.֡᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3001 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C3001 f5349 = new C3001();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 0 && i3 == 0 && i4 == 254 && i5 == 255) {
                return 100;
            }
        }
        return 0;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48237;
    }
}
