package l;

/* JADX INFO: renamed from: l.ۤܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes3.dex */
public final class C10368 implements InterfaceC9167 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19814 f31194;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2090 f31195;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC21162 f31196;

    @Override // l.InterfaceC9167
    /* JADX INFO: renamed from: ֫ */
    public final void mo16111(AbstractC11347 abstractC11347, int i) {
    }

    public C10368(C19814 c19814, C2090 c2090, AbstractC21162 abstractC21162) {
        this.f31194 = c19814;
        this.f31195 = c2090;
        this.f31196 = abstractC21162;
    }

    @Override // l.InterfaceC9167
    /* JADX INFO: renamed from: ۧ */
    public final void mo16112(AbstractC11347 abstractC11347, int i) {
        if (abstractC11347 instanceof C19814) {
            C19814 c19814 = (C19814) abstractC11347;
            if (this.f31196.mo2753(this.f31194, c19814)) {
                this.f31195.add(c19814);
            }
        }
    }
}
