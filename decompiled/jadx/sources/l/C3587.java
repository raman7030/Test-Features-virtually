package l;

/* JADX INFO: renamed from: l.ۘ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public final class C3587 extends AbstractC5144 implements InterfaceC20969 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2609 f11376;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C0052 f11377;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f11378;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2176 f11379;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC6857 f11380;

    public C3587(C2176 c2176, EnumC6857 enumC6857, AbstractC12612 abstractC12612, C2609 c2609) {
        this.f11379 = c2176;
        this.f11380 = enumC6857;
        this.f11378 = abstractC12612;
        this.f11376 = c2609;
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1375(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.MODULE;
    }

    @Override // l.InterfaceC20969
    public final C2609 getAnnotations() {
        return this.f11379.f7168;
    }

    @Override // l.InterfaceC20969
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC6857 mo10982() {
        return this.f11380;
    }

    @Override // l.InterfaceC20969
    public final AbstractC12612 getName() {
        return this.f11378;
    }

    @Override // l.InterfaceC20969
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2609 mo10983() {
        return this.f11376;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11788(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57554;
    }
}
