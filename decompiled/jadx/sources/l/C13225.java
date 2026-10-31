package l;

/* JADX INFO: renamed from: l.۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13225 implements InterfaceC17236, InterfaceC4595 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11815 f39589;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC0525 f39590;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4595 f39591;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC7379 f39592;

    public C13225(C11815 c11815, AbstractC7379 abstractC7379, AbstractC0525 abstractC0525) {
        C11233.m27805(abstractC0525, "onBackPressedCallback");
        this.f39589 = c11815;
        this.f39592 = abstractC7379;
        this.f39590 = abstractC0525;
        abstractC7379.mo19833(this);
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_START) {
            this.f39591 = this.f39589.m28891(this.f39590);
            return;
        }
        if (enumC22901 == EnumC22901.ON_STOP) {
            InterfaceC4595 interfaceC4595 = this.f39591;
            if (interfaceC4595 != null) {
                ((C12520) interfaceC4595).cancel();
                return;
            }
            return;
        }
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            cancel();
        }
    }

    @Override // l.InterfaceC4595
    public final void cancel() {
        this.f39592.mo19834(this);
        this.f39590.m2241(this);
        InterfaceC4595 interfaceC4595 = this.f39591;
        if (interfaceC4595 != null) {
            ((C12520) interfaceC4595).cancel();
        }
        this.f39591 = null;
    }
}
