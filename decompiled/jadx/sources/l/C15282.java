package l;

/* JADX INFO: renamed from: l.ܶܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H86F */
/* JADX INFO: loaded from: classes5.dex */
public final class C15282 extends AbstractC1172 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile AbstractC8333 f46882;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12524 f46883;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f46884;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16469 f46885;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15387 f46886;

    public C15282(InterfaceC17505 interfaceC17505, InterfaceC11819 interfaceC11819, C12524 c12524, C16469 c16469, InterfaceC15387 interfaceC15387, boolean z) {
        this.f46883 = c12524;
        this.f46885 = c16469;
        this.f46886 = interfaceC15387;
        this.f46884 = z;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        AbstractC8333 abstractC8333M30727 = this.f46882;
        if (abstractC8333M30727 == null) {
            abstractC8333M30727 = this.f46883.m30727(this.f46886, this.f46885);
            this.f46882 = abstractC8333M30727;
        }
        return abstractC8333M30727.mo2844(c17175);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        AbstractC8333 abstractC8333M30727 = this.f46882;
        if (abstractC8333M30727 == null) {
            abstractC8333M30727 = this.f46883.m30727(this.f46886, this.f46885);
            this.f46882 = abstractC8333M30727;
        }
        abstractC8333M30727.mo2845(c23525, obj);
    }

    @Override // l.AbstractC1172
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8333 mo3969() {
        AbstractC8333 abstractC8333 = this.f46882;
        if (abstractC8333 != null) {
            return abstractC8333;
        }
        AbstractC8333 abstractC8333M30727 = this.f46883.m30727(this.f46886, this.f46885);
        this.f46882 = abstractC8333M30727;
        return abstractC8333M30727;
    }
}
