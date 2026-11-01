package p067l;

/* JADX INFO: renamed from: l.᩵۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20878 extends C3686 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C16852 f65585;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC6462 f65586;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 f65587;

    /* JADX INFO: renamed from: ᩻ */
    public final String f65588;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20878(C16852 c16852, InterfaceC5323 interfaceC5323, String str, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        super(interfaceC5323);
        this.f65585 = c16852;
        this.f65588 = str;
        this.f65586 = abstractC6462;
        this.f65587 = abstractC6463;
    }

    @Override // p067l.C3686
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7112(EnumC21706 enumC21706) {
        super.mo7112(enumC21706);
        int i = C4784.f10854[enumC21706.ordinal()];
        C16852 c16852 = this.f65585;
        if (i == 1) {
            InterfaceC5323 interfaceC5323M7109 = m7109();
            C18258 c18258M18548 = c16852.f49892.m18548(this.f65588, new Object[0]);
            C12895 c12895 = C15675.f45417;
            c16852.m38339(interfaceC5323M7109, new C12895("compiler", "prob.found.req", c18258M18548, this.f65586, this.f65587));
            return;
        }
        if (i == 2) {
            if (c16852.f49891 == null || c16852.f49891.m17984((AbstractC7783) c16852.f49894.f69186.f16705) == null || !c16852.m38247(c16852.f49891) || c16852.f49912.m19417((AbstractC6462) c16852.f49891.f20406.mo14797().last())) {
                return;
            }
            InterfaceC5323 interfaceC5323M71010 = m7109();
            AbstractC7783 abstractC7783 = (AbstractC7783) c16852.f49891.f14172.last();
            C12895 c12896 = C15675.f45417;
            c16852.m38352(interfaceC5323M71010, new C12895("compiler", "varargs.unsafe.use.varargs.param", abstractC7783));
            return;
        }
        throw new AssertionError("Unexpected lint: " + enumC21706);
    }
}
