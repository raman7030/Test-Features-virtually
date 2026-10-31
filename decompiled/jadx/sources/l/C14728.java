package l;

/* JADX INFO: renamed from: l.ܳ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C14728 extends AbstractC12612 implements InterfaceC13727 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f44979;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f44980;

    public C14728(AbstractC12612 abstractC12612, AbstractC12612 abstractC12613) {
        this.f44980 = abstractC12612;
        this.f44979 = abstractC12613;
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1404(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.ARRAY_ACCESS;
    }

    @Override // l.InterfaceC13727
    public final AbstractC12612 getExpression() {
        return this.f44980;
    }

    @Override // l.InterfaceC13727
    public final AbstractC12612 getIndex() {
        return this.f44979;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11813(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57535;
    }
}
