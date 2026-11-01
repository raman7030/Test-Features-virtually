package p067l;

/* JADX INFO: renamed from: l.ۛۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8030 extends AbstractC17417 {

    /* JADX INFO: renamed from: ۗ */
    public final C22388 f21117;

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18607(AbstractC17417 abstractC17417) {
        return false;
    }

    public C8030(C5348 c5348, C12054 c12054, C22783 c22783, C21442 c21442, C22388 c22388) {
        super(c5348, c12054, c22783, c21442);
        if (c5348.m11601() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c22388 == null) {
            throw new NullPointerException("cases == null");
        }
        this.f21117 = c22388;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ᩳ */
    public final String mo13526() {
        return this.f21117.toString();
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return C15600.f44675;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10255(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C8030(m39656(), m39652(), c22783, c21442, this.f21117);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C22388 m18608() {
        return this.f21117;
    }
}
