package p067l;

/* JADX INFO: renamed from: l.ۤܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes3.dex */
public final class C12222 implements InterfaceC11081 {

    /* JADX INFO: renamed from: ᩶ */
    public final C21199 f34156;

    /* JADX INFO: renamed from: ᩸ */
    public final C4355 f34157;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC22481 f34158;

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ֫ */
    public final void mo18030(AbstractC13152 abstractC13152, int i) {
    }

    public C12222(C21199 c21199, C4355 c4355, AbstractC22481 abstractC22481) {
        this.f34156 = c21199;
        this.f34157 = c4355;
        this.f34158 = abstractC22481;
    }

    @Override // p067l.InterfaceC11081
    /* JADX INFO: renamed from: ۧ */
    public final void mo18031(AbstractC13152 abstractC13152, int i) {
        if (abstractC13152 instanceof C21199) {
            C21199 c21199 = (C21199) abstractC13152;
            if (this.f34158.mo5092(this.f34156, c21199)) {
                this.f34157.add(c21199);
            }
        }
    }
}
