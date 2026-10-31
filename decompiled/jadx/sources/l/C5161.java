package l;

/* JADX INFO: renamed from: l.ۚۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9I4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5161 implements InterfaceC5037 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f16129 = {-4, 83, 77, 66};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16130;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16131;

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ֫ */
    public final void mo14553(C0097 c0097) throws C13146 {
        this.f16130 = c0097.m26083();
        C23670.m52193(c0097, f16129);
        c0097.m26099();
        EnumC3915 enumC3915 = (EnumC3915) C15262.m36279(c0097.m26100(), EnumC3915.class, null);
        if (!((enumC3915 == null || enumC3915 == EnumC3915.NONE) ? false : true)) {
            throw new IllegalStateException("The CompressionAlgorithm field of the SMB2_COMPRESSION_TRANSFORM_HEADER should contain a valid value.");
        }
        c0097.m26096(2);
        c0097.m26099();
        this.f16131 = c0097.m26091();
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ֫ */
    public final int mo14552() {
        return this.f16130;
    }

    @Override // l.InterfaceC5037
    /* JADX INFO: renamed from: ۧ */
    public final int mo14554() {
        return this.f16131;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14745(byte[] bArr) {
        return C23670.m52195(bArr, f16129);
    }
}
