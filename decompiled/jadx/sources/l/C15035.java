package l;

/* JADX INFO: renamed from: l.ܶۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes5.dex */
public final class C15035 extends C8166 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f45819;

    @Override // l.C8166, l.C2086, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return m35559(abstractC4308);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        return this.f45819.f20923.m17519(c19955);
    }

    @Override // l.C8166, l.C2086, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC4308 mo2140(Object obj, AbstractC4308 abstractC4308) {
        return m35559(abstractC4308);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4308 mo2145(C19955 c19955, Object obj) {
        return this.f45819.f20923.m17519(c19955);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15035(C6735 c6735, AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        this.f45819 = c6735;
        C12399 c12399 = c6735.f20929.f72606;
        C11003.requireNonNull(c12399);
        super(c12399, EnumC13829.SPECULATIVE, abstractC5698, enumC16761);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m35559(AbstractC4308 abstractC4308) {
        if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
            return m6856(super.mo2140((Object) null, abstractC4308));
        }
        if (!abstractC4308.m12913(EnumC9454.BOT)) {
            return abstractC4308;
        }
        C6735 c6735 = this.f45819;
        return c6735.f20923.m17496(c6735.f20922.f66501).f17560;
    }
}
