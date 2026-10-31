package l;

/* JADX INFO: renamed from: l.ۛۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5957 extends AbstractC15834 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21064 f18263;

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo16681(AbstractC15834 abstractC15834) {
        return false;
    }

    public C5957(C3135 c3135, C10191 c10191, C21480 c21480, C20069 c20069, C21064 c21064) {
        super(c3135, c10191, c21480, c20069);
        if (c3135.m9558() != 5) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (c21064 == null) {
            throw new NullPointerException("cases == null");
        }
        this.f18263 = c21064;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ᩳ */
    public final String mo11590() {
        return this.f18263.toString();
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10711 mo3533() {
        return C13922.f41594;
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final void mo3531(InterfaceC8780 interfaceC8780) {
        interfaceC8780.mo8216(this);
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3529(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // l.AbstractC15834
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15834 mo3530(C21480 c21480, C20069 c20069) {
        return new C5957(m37484(), m37480(), c21480, c20069, this.f18263);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21064 m16682() {
        return this.f18263;
    }
}
