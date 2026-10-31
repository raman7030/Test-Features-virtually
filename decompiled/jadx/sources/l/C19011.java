package l;

/* JADX INFO: renamed from: l.ᩴ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1RZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19011 implements InterfaceC4194 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C19011 f59907 = new C19011();

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        if (i >= 4) {
            int i2 = bArr[0] & 255;
            int i3 = bArr[1] & 255;
            int i4 = bArr[2] & 255;
            int i5 = bArr[3] & 255;
            if (i2 == 254 && i3 == 255 && (i4 != 0 || i5 != 0)) {
                return 100;
            }
        }
        return 0;
    }

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45129;
    }
}
