package l;

/* JADX INFO: renamed from: l.ۙ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: JALK */
/* JADX INFO: loaded from: classes3.dex */
public final class C4646 implements InterfaceC19410 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6057 f14738;

    public C4646(C6057 c6057) {
        this.f14738 = c6057;
    }

    @Override // l.InterfaceC19410
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7954(Object obj, AbstractC19036 abstractC19036) {
        C8058 c8058;
        InterfaceC14486 interfaceC14486 = (InterfaceC14486) obj;
        InterfaceC20169 interfaceC20169 = this.f14738.f18557;
        if (interfaceC20169 == null) {
            c8058 = null;
        } else {
            C14462 c14462 = ((C11702) interfaceC20169).f34903;
            c14462.f44316 = interfaceC14486;
            C23511 c23511 = new C23511();
            c23511.setDuration(300L);
            c23511.setInterpolator(C8020.m21341(0.2f, 0.0f, 0.0f, 1.0f));
            C23676.m52224(c14462, c23511);
            c14462.requestLayout();
            c8058 = C8058.f24861;
        }
        return c8058 == EnumC7041.COROUTINE_SUSPENDED ? c8058 : C8058.f24861;
    }
}
