package l;

/* JADX INFO: renamed from: l.֡᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0665 implements InterfaceC4194 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C0665 f2576 = new C0665();

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo2711(int i, byte[] bArr) {
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

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo2710() {
        return C14776.f45123;
    }
}
