package l;

/* JADX INFO: renamed from: l.ۢۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C9378 extends AbstractC11349 implements InterfaceC1527 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f28482;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f28483;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f28484;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f28485 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2176 f28486;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f28487;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f28488;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12048 f28489;

    public C9378(C2176 c2176, AbstractC10370 abstractC10370, AbstractC12612 abstractC12612, AbstractC12612 abstractC12613, C12048 c12048, boolean z) {
        this.f28486 = c2176;
        this.f28484 = abstractC10370;
        this.f28488 = abstractC12612;
        this.f28487 = abstractC12613;
        this.f28489 = c12048;
        this.f28482 = z;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24209() {
        return this.f28488 == null;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24210() {
        return this.f28482;
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1392(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.VARIABLE;
    }

    @Override // l.InterfaceC1527
    /* JADX INFO: renamed from: ܳ */
    public final C2176 mo5211() {
        return this.f28486;
    }

    @Override // l.InterfaceC1527
    public final AbstractC10370 getName() {
        return this.f28484;
    }

    @Override // l.InterfaceC1527
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC12612 mo5212() {
        return this.f28483;
    }

    @Override // l.InterfaceC1527
    public final InterfaceC13206 getType() {
        return this.f28488;
    }

    @Override // l.InterfaceC1527
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12612 mo5210() {
        return this.f28487;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo8689(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57578;
    }
}
