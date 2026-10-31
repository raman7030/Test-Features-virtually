package l;

/* JADX INFO: renamed from: l.۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12520 implements InterfaceC4595 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0525 f37621;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11815 f37622;

    public C12520(C11815 c11815, AbstractC0525 abstractC0525) {
        C11233.m27805(abstractC0525, "onBackPressedCallback");
        this.f37622 = c11815;
        this.f37621 = abstractC0525;
    }

    @Override // l.InterfaceC4595
    public final void cancel() {
        C11815 c11815 = this.f37622;
        C11586 c11586 = c11815.f35246;
        AbstractC0525 abstractC0525 = this.f37621;
        c11586.remove(abstractC0525);
        if (C11233.m27802(c11815.f35245, abstractC0525)) {
            abstractC0525.getClass();
            c11815.f35245 = null;
        }
        abstractC0525.m2241(this);
        InterfaceC2123 interfaceC2123M2237 = abstractC0525.m2237();
        if (interfaceC2123M2237 != null) {
            interfaceC2123M2237.mo4049();
        }
        abstractC0525.m2238((InterfaceC2123) null);
    }
}
