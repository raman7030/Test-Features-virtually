package p067l;

/* JADX INFO: renamed from: l.ۚۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9I4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7273 implements InterfaceC7155 {

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f18968 = {-4, 83, 77, 66};

    /* JADX INFO: renamed from: ֫ */
    public int f18969;

    /* JADX INFO: renamed from: ۧ */
    public int f18970;

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ֫ */
    public final void mo16457(C2460 c2460) throws C14862 {
        this.f18969 = c2460.m28108();
        C24864.m54596(c2460, f18968);
        c2460.m28124();
        EnumC6089 enumC6089 = (EnumC6089) C16873.m38440(c2460.m28125(), EnumC6089.class, null);
        if (!((enumC6089 == null || enumC6089 == EnumC6089.NONE) ? false : true)) {
            throw new IllegalStateException("The CompressionAlgorithm field of the SMB2_COMPRESSION_TRANSFORM_HEADER should contain a valid value.");
        }
        c2460.m28121(2);
        c2460.m28124();
        this.f18970 = c2460.m28116();
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ֫ */
    public final int mo16456() {
        return this.f18969;
    }

    @Override // p067l.InterfaceC7155
    /* JADX INFO: renamed from: ۧ */
    public final int mo16458() {
        return this.f18970;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16653(byte[] bArr) {
        return C24864.m54598(bArr, f18968);
    }
}
