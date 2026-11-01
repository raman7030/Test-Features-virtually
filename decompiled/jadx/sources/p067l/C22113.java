package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBB2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22113 extends AbstractC17417 {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC15405 f69966;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f69967;

    public C22113(C5348 c5348, C12054 c12054, C21442 c21442, ArrayList arrayList, AbstractC15405 abstractC15405) {
        super(c5348, c12054, null, c21442);
        if (c5348.m11601() != 1) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c5348.m11601());
        }
        this.f69967 = arrayList;
        this.f69966 = abstractC15405;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12548 mo5820() {
        return C15600.f44675;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList m49803() {
        return this.f69967;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC15405 m49802() {
        return this.f69966;
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final void mo5818(InterfaceC10713 interfaceC10713) {
        interfaceC10713.mo10258(this);
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5816(C9566 c9566) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // p067l.AbstractC17417
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17417 mo5817(C22783 c22783, C21442 c21442) {
        return new C22113(m39656(), m39652(), c21442, this.f69967, this.f69966);
    }
}
