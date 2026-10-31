package l;

/* JADX INFO: renamed from: l.ܺۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C15726 extends AbstractC12612 implements InterfaceC16343 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f48501;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19256 f48502;

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1408(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        int i = C16845.f51704[this.f48502.f60620.ordinal()];
        if (i == 1) {
            return EnumC3329.UNBOUNDED_WILDCARD;
        }
        if (i == 2) {
            return EnumC3329.EXTENDS_WILDCARD;
        }
        if (i == 3) {
            return EnumC3329.SUPER_WILDCARD;
        }
        throw new AssertionError("Unknown wildcard bound " + this.f48502);
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11817(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57500;
    }
}
