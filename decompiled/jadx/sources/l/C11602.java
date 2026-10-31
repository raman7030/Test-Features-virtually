package l;

/* JADX INFO: renamed from: l.ۨۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11602 extends AbstractC14423 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f34596;

    public C11602(C3135 c3135, C10191 c10191, C20069 c20069, InterfaceC10711 interfaceC10711, AbstractC13717 abstractC13717) {
        super(c3135, c10191, null, c20069, abstractC13717);
        if (c3135.m9558() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c3135.m9558());
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f34596 = interfaceC10711;
    }

    @Override // l.AbstractC14423, l.AbstractC15834
    /* JADX INFO: renamed from: ᩳ */
    public final String mo11590() {
        AbstractC13717 abstractC13717M34454 = m34454();
        String strMo2463 = abstractC13717M34454.mo2463();
        if (abstractC13717M34454 instanceof C13217) {
            strMo2463 = ((C13217) abstractC13717M34454).m32052();
        }
        StringBuilder sbM19190 = C7166.m19190(strMo2463, " ");
        sbM19190.append(C22890.m50977(this.f34596));
        return sbM19190.toString();
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10711 mo3533() {
        return this.f34596;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8217(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3529(C7573 c7573) {
        return new C11602(m37484(), m37480(), m37479(), this.f34596.mo26890(c7573), m34454());
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C11602(m37484(), m37480(), c20069, this.f34596, m34454());
    }
}
