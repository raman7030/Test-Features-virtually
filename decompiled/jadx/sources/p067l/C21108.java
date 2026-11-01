package p067l;

/* JADX INFO: renamed from: l.᩵᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71QY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21108 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C21108 f66351 = new C21108();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 255 && i3 == 254 && (i4 != 0 || i5 != 0)) {
                return 100;
            }
        }
        return 0;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48236;
    }
}
