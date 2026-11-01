package p067l;

/* JADX INFO: renamed from: l.֨ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B9F */
/* JADX INFO: loaded from: classes3.dex */
public final class C3336 extends AbstractC17417 {
    public C3336(C5348 c5348, C12054 c12054, C22783 c22783, C21442 c21442) {
        super(c5348, c12054, c22783, c21442);
        int iM11601 = c5348.m11601();
        if (iM11601 == 5 || iM11601 == 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c5348.m11601());
        }
        if (c22783 != null && c5348.m11601() != 1) {
            throw new IllegalArgumentException("can't mix branchingness with result");
        }
    }

    public C3336(C5348 c5348, C12054 c12054, C22783 c22783, C22783 c22784) {
        this(c5348, c12054, c22783, C21442.m48568(c22784));
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return C15600.f44675;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10251(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC17417 mo5819() {
        C21442 c21442M39651 = m39651();
        int size = c21442M39651.size();
        if (size != 0) {
            InterfaceC3830 interfaceC3830M50974 = c21442M39651.m56524get(size - 1).m50974();
            if (!interfaceC3830M50974.mo7482()) {
                InterfaceC3830 interfaceC3830M50975 = c21442M39651.m56524get(0).m50974();
                if (size == 2 && interfaceC3830M50975.mo7482()) {
                    AbstractC15405 abstractC15405 = (AbstractC15405) interfaceC3830M50975;
                    C21442 c21442M48573 = c21442M39651.m48573();
                    return new C7360(C14065.m31914(m39656().m11605(), m39655(), c21442M48573, abstractC15405), m39652(), m39655(), c21442M48573, abstractC15405);
                }
            } else {
                AbstractC15405 abstractC15405M10335 = (AbstractC15405) interfaceC3830M50974;
                C21442 c21442M48574 = c21442M39651.m48574();
                try {
                    int iM11605 = m39656().m11605();
                    if (iM11605 == 15 && (abstractC15405M10335 instanceof C4873)) {
                        abstractC15405M10335 = C4873.m10335(-((C4873) abstractC15405M10335).mo4598());
                        iM11605 = 14;
                    }
                    AbstractC15405 abstractC15406 = abstractC15405M10335;
                    return new C7360(C14065.m31914(iM11605, m39655(), c21442M48574, abstractC15406), m39652(), m39655(), c21442M48574, abstractC15406);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return this;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C3336(m39656(), m39652(), c22783, c21442);
    }
}
