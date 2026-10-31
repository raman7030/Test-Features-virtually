package l;

/* JADX INFO: renamed from: l.᩶᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94VR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20391 extends AbstractC11924 implements InterfaceC3457 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C13334 f65790;

    @Override // l.InterfaceC3457
    /* JADX INFO: renamed from: ֫ */
    public final C13334 mo10582() {
        return this.f65790;
    }

    public C20391(C13334 c13334) {
        super(EnumC7690.GOTO);
        this.f65790 = c13334;
    }

    @Override // l.AbstractC1591
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1591 mo5437(C1403 c1403) {
        return new C20391(c1403.mo4896(this.f65790));
    }

    public final String toString() {
        return "GOTO ".concat(this.f65790.m32315());
    }
}
