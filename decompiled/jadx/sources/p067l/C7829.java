package p067l;

/* JADX INFO: renamed from: l.ۛ֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7829 extends AbstractC20155 {

    /* JADX INFO: renamed from: ֫֫ */
    public AbstractC6462 f20520;

    /* JADX INFO: renamed from: ۟ */
    public C4036 f20521;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C23663 f20522;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7829(C23663 c23663, C4036 c4036, AbstractC6462 abstractC6462, AbstractC7783 abstractC7783) {
        super(c23663, EnumC3600.f7347, abstractC7783, "access error");
        this.f20522 = c23663;
        this.f20521 = c4036;
        this.f20520 = abstractC6462;
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        AbstractC6462 abstractC6463;
        AbstractC7783 abstractC7784 = this.f62394;
        AbstractC12224 abstractC12225 = abstractC7784.f20408;
        C23663 c23663 = this.f20522;
        C8200 c8200 = c23663.f75320;
        C23623 c23623 = c23663.f75324;
        if (abstractC12225 == c8200.f21737 && abstractC7784.f20407 != abstractC6462.f16705) {
            return new C10252(c23663, EnumC3600.f7346).mo6320(enumC14710, interfaceC5323, abstractC7783, abstractC6462, abstractC12224, c4848, c4849);
        }
        long jMo18003 = abstractC7784.mo18003() & 1;
        C4036 c4036 = this.f20521;
        if (jMo18003 == 0 && (c4036 == null || (abstractC6463 = this.f20520) == null || c23663.m52669(c4036, abstractC6463, false))) {
            if ((abstractC7784.mo18003() & 6) != 0) {
                return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "report.access", abstractC7784, C21036.m47446(abstractC7784.mo18003() & 6), abstractC7784.m17991());
            }
            return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "not.def.public.cant.access", abstractC7784, abstractC7784.m17991());
        }
        if (abstractC7784.f20407.f20405 == EnumC3600.f7351) {
            return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "not.def.access.package.cant.access", abstractC7784, abstractC7784.m17991(), c23663.m52664(c4036, abstractC7784.m18008()));
        }
        if (abstractC7784.m18008() != c23663.f75331.f69155) {
            C2417 c2417 = c4036.f8851.f7510;
            C9794 c9794M18008 = abstractC7784.m18008();
            if (c2417 != c9794M18008.f27063 && !c2417.f3689.containsKey(c9794M18008.f27059)) {
                return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "not.def.access.class.intf.cant.access.reason", abstractC7784, abstractC7784.m17991(), abstractC7784.m17991().m18008(), c23663.m52664(c4036, abstractC7784.m18008()));
            }
        }
        return c23663.f75333.m18545(enumC14710, c23623.m9345(), interfaceC5323, "not.def.access.class.intf.cant.access", abstractC7784, abstractC7784.m17991());
    }
}
