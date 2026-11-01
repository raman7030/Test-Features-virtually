package p067l;

/* JADX INFO: renamed from: l.ۚۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BEJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7360 extends AbstractC16076 {
    public C7360(C5348 c5348, C12054 c12054, C22783 c22783, C21442 c21442, AbstractC15405 abstractC15405) {
        super(c5348, c12054, c22783, c21442, abstractC15405);
        if (c5348.m11601() == 1) {
            return;
        }
        throw new IllegalArgumentException("opcode with invalid branchingness: " + c5348.m11601());
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return C15600.f44675;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10254(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C7360(m39656(), m39652(), c22783, c21442, m36587());
    }
}
