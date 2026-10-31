package l;

/* JADX INFO: renamed from: l.᩵۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C19476 extends C1386 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f62968;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f62969;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f62970;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f62971;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19476(C15240 c15240, InterfaceC3109 interfaceC3109, String str, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        super(interfaceC3109);
        this.f62968 = c15240;
        this.f62971 = str;
        this.f62969 = abstractC4308;
        this.f62970 = abstractC4309;
    }

    @Override // l.C1386
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4874(EnumC20347 enumC20347) {
        super.mo4874(enumC20347);
        int i = C2542.f8064[enumC20347.ordinal()];
        C15240 c15240 = this.f62968;
        if (i == 1) {
            InterfaceC3109 interfaceC3109M4871 = m4871();
            C16719 c16719M16622 = c15240.f46768.m16622(this.f62971, new Object[0]);
            C11076 c11076 = C14001.f42334;
            c15240.m36178(interfaceC3109M4871, new C11076("compiler", "prob.found.req", c16719M16622, this.f62969, this.f62970));
            return;
        }
        if (i == 2) {
            if (c15240.f46767 == null || c15240.f46767.m16065((AbstractC5698) c15240.f46770.f66504.f13890) == null || !c15240.m36086(c15240.f46767) || c15240.f46788.m17477((AbstractC4308) c15240.f46767.f17560.mo12933().last())) {
                return;
            }
            InterfaceC3109 interfaceC3109M4872 = m4871();
            AbstractC5698 abstractC5698 = (AbstractC5698) c15240.f46767.f11367.last();
            C11076 c11077 = C14001.f42334;
            c15240.m36191(interfaceC3109M4872, new C11076("compiler", "varargs.unsafe.use.varargs.param", abstractC5698));
            return;
        }
        throw new AssertionError("Unexpected lint: " + enumC20347);
    }
}
