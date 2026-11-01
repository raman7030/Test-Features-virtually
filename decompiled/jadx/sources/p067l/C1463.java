package p067l;

/* JADX INFO: renamed from: l.۫ܽ */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1463 implements InterfaceC1070 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC0868 f40645;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1428 f40646;

    public C1463(C1428 c1428, AbstractC0868 abstractC0868) {
        C13045.m29867(abstractC0868, "onBackPressedCallback");
        this.f40646 = c1428;
        this.f40645 = abstractC0868;
    }

    @Override // p067l.InterfaceC1070
    public final void cancel() {
        C1428 c1428 = this.f40646;
        C13380 c13380 = c1428.f38248;
        AbstractC0868 abstractC0868 = this.f40645;
        c13380.remove(abstractC0868);
        if (C13045.m29864(c1428.f38247, abstractC0868)) {
            abstractC0868.getClass();
            c1428.f38247 = null;
        }
        abstractC0868.m4608(this);
        InterfaceC4387 interfaceC4387M4604 = abstractC0868.m4604();
        if (interfaceC4387M4604 != null) {
            interfaceC4387M4604.mo6293();
        }
        abstractC0868.m4605((InterfaceC4387) null);
    }
}
