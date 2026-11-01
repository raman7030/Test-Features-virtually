package p067l;

/* JADX INFO: renamed from: l.ܺ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1QD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17753 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C17753 f53022 = new C17753();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 3;
            if (i3 < i && bArr[i2] == 27 && ((char) bArr[i2 + 1]) == '$' && ((char) bArr[i2 + 2]) == ')' && ((char) bArr[i3]) == 'C') {
                return 100;
            }
        }
        return 0;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48249;
    }
}
