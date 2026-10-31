package l;

/* JADX INFO: renamed from: l.ۚۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BEJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5252 extends AbstractC14423 {
    public C5252(C3135 c3135, C10191 c10191, C21480 c21480, C20069 c20069, AbstractC13717 abstractC13717) {
        super(c3135, c10191, c21480, c20069, abstractC13717);
        if (c3135.m9558() == 1) {
            return;
        }
        throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10711 mo3533() {
        return C13922.f41594;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8215(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3529(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C5252(m37484(), m37480(), c21480, c20069, m34454());
    }
}
