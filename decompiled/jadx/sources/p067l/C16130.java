package p067l;

/* JADX INFO: renamed from: l.ܳۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16130 extends C8755 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C23663 f47467;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC7783 f47468;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16130(C23663 c23663, AbstractC7783 abstractC7783, C14119 c14119) {
        super(c23663, abstractC7783.f20405, "diamondError", c14119);
        this.f47467 = c23663;
        this.f47468 = abstractC7783;
    }

    @Override // p067l.C8755, p067l.AbstractC7570
    /* JADX INFO: renamed from: ֫ */
    public final C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849) {
        C18258 c18258M8564;
        AbstractC7783 abstractC7784 = this.f47468;
        C18258 c18258 = abstractC7784.f20405 == EnumC3600.f7352 ? (C18258) ((C8755) abstractC7784.mo9143()).mo3723().f76953 : null;
        C23663 c23663 = this.f47467;
        if (c18258 != null && c23663.f75303 && (c18258M8564 = C4217.m8564(c23663.f75333, interfaceC5323, c23663.f75324.m9345(), enumC14710, c18258)) != null) {
            return c18258M8564;
        }
        String str = c18258 == null ? "cant.apply.diamond" : "cant.apply.diamond.1";
        C8005 c8005 = c23663.f75333;
        C16051 c16051M9345 = c23663.f75324.m9345();
        AbstractC21195 abstractC21195 = abstractC6462.f16705;
        C13370 c13370 = C13665.f38450;
        return c8005.m18545(enumC14710, c16051M9345, interfaceC5323, str, new C13370("compiler", "diamond", abstractC21195), c18258);
    }
}
