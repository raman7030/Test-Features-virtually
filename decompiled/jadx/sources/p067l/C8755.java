package p067l;

/* JADX INFO: renamed from: l.ۜۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class C8755 extends AbstractC7570 {

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C23663 f23734;

    /* JADX INFO: renamed from: ᩺ */
    public C14119 f23735;

    @Override // p067l.AbstractC7570, p067l.AbstractC7783
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo17485() {
        return true;
    }

    @Override // p067l.AbstractC7570, p067l.AbstractC7783
    public final String toString() {
        return this.f19842;
    }

    public C8755(C23663 c23663, C14119 c14119) {
        this(c23663, EnumC3600.f7352, "inapplicable symbol error", c14119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8755(C23663 c23663, EnumC3600 enumC3600, String str, C14119 c14119) {
        super(c23663, enumC3600, str);
        this.f23734 = c23663;
        this.f23735 = c14119;
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        C18258 c18258M8564;
        C23663 c23663 = this.f23734;
        C8200 c8200 = c23663.f75320;
        C23623 c23623 = c23663.f75324;
        if (abstractC12224 == c8200.f21713) {
            return null;
        }
        C24293 c24293Mo3723 = mo3723();
        if (c23663.f75303 && (c18258M8564 = C4217.m8564(c23663.f75333, interfaceC5323, c23623.m9345(), enumC14710, (C18258) c24293Mo3723.f76953)) != null) {
            return c18258M8564;
        }
        AbstractC7783 abstractC7783Mo12936 = ((AbstractC7783) c24293Mo3723.f76952).mo12936(abstractC6462, c23663.f75323);
        C8005 c8005 = c23663.f75333;
        C16051 c16051M9345 = c23623.m9345();
        EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783Mo12936);
        AbstractC12224 abstractC12225 = abstractC7783Mo12936.f20408;
        if (abstractC12225 == c23663.f75320.f21737) {
            abstractC12225 = abstractC7783Mo12936.f20407.f20408;
        }
        return c8005.m18545(enumC14710, c16051M9345, interfaceC5323, "cant.apply.symbol", enumC10306M51425, abstractC12225, c23663.m52638(abstractC7783Mo12936.f20406.mo14797()), c23663.m52638(c4848), C23047.m51425(abstractC7783Mo12936.f20407), abstractC7783Mo12936.f20407.f20406, c24293Mo3723.f76953);
    }

    @Override // p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo17484(AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        C24293 c24293Mo3723 = mo3723();
        C23663 c23663 = this.f23734;
        C8374 c8374 = c23663.f75323;
        AbstractC6462 abstractC6462 = (c24293Mo3723 != null ? (AbstractC7783) c24293Mo3723.f76952 : c23663.f75331.f69144).f20406;
        c8374.getClass();
        AbstractC21195 abstractC21196 = C8374.m19397(abstractC12224, abstractC21195, abstractC6462).f16705;
        if (c24293Mo3723 != null) {
            C9874 c9874 = c23663.f75309;
            AbstractC7783 abstractC7783 = (AbstractC7783) c24293Mo3723.f76952;
            C18258 c18258 = (C18258) c24293Mo3723.f76953;
            c9874.getClass();
            C4848 c4848M10276of = C4848.m10276of((Object) c18258);
            while (c4848M10276of.m10293()) {
                C18258 c18259 = (C18258) c4848M10276of.f11034;
                c4848M10276of = c4848M10276of.f11035;
                String strMo31353 = c18259.mo31353();
                strMo31353.getClass();
                switch (strMo31353) {
                    case "compiler.misc.infer.arg.length.mismatch":
                    case "compiler.misc.missing.ret.val":
                    case "compiler.misc.unexpected.ret.val":
                    case "compiler.misc.arg.length.mismatch":
                        abstractC21196.f20406 = new C3168((C13956) abstractC21196.f20406, abstractC7783);
                        abstractC21196.f20409 |= 1099511627776L;
                        break;
                    default:
                        for (Object obj : c18259.m41590()) {
                            if (obj instanceof C18258) {
                                c4848M10276of = c4848M10276of.m10290((C18258) obj);
                            }
                        }
                        break;
                }
            }
        }
        return abstractC21196;
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public C24293 mo3723() {
        C14789 c14789 = null;
        for (C14789 c147810 : this.f23735.f40074) {
            if (!c147810.m33755()) {
                c14789 = c147810;
            }
        }
        C1446.m31699(c14789);
        return new C24293(c14789.f42190, c14789.f42187);
    }
}
