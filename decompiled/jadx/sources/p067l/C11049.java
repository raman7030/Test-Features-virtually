package p067l;

/* JADX INFO: renamed from: l.ۡ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1QD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11049 implements InterfaceC6355 {

    /* JADX INFO: renamed from: ۧ */
    public static final C11049 f30601 = new C11049();

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5050(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 2;
            if (i3 < i && bArr[i2] == 27 && ((char) bArr[i2 + 1]) == '$' && ((char) bArr[i3]) == 'B') {
                return 100;
            }
        }
        return 0;
    }

    @Override // p067l.InterfaceC6355
    /* JADX INFO: renamed from: ֫ */
    public final int mo5049() {
        return C16412.f48238;
    }
}
