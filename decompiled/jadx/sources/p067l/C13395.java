package p067l;

/* JADX INFO: renamed from: l.ۨۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13395 extends AbstractC16076 {

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC12548 f37593;

    public C13395(C5348 c5348, C12054 c12054, C21442 c21442, InterfaceC12548 interfaceC12548, AbstractC15405 abstractC15405) {
        super(c5348, c12054, null, c21442, abstractC15405);
        if (c5348.m11601() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c5348.m11601());
        }
        if (interfaceC12548 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f37593 = interfaceC12548;
    }

    @Override // p067l.AbstractC16076, p067l.AbstractC17417
    /* JADX INFO: renamed from: ᩳ */
    public final String mo13526() {
        AbstractC15405 abstractC15405M36587 = m36587();
        String strMo4819 = abstractC15405M36587.mo4819();
        if (abstractC15405M36587 instanceof C14930) {
            strMo4819 = ((C14930) abstractC15405M36587).m34150();
        }
        StringBuilder sbM21133 = C9179.m21133(strMo4819, " ");
        sbM21133.append(C24123.m53368(this.f37593));
        return sbM21133.toString();
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return this.f37593;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10256(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        return new C13395(m39656(), m39652(), m39651(), this.f37593.mo28930(c9566), m36587());
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C13395(m39656(), m39652(), c21442, this.f37593, m36587());
    }
}
