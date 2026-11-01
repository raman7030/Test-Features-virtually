package p067l;

/* JADX INFO: renamed from: l.ۚܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7570 extends AbstractC7783 {

    /* JADX INFO: renamed from: ۛ */
    public final String f19842;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C23663 f19843;

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo17483() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C18258 mo6320(EnumC14710 enumC14710, InterfaceC5323 interfaceC5323, AbstractC7783 abstractC7783, AbstractC6462 abstractC6462, AbstractC12224 abstractC12224, C4848 c4848, C4848 c4849);

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۗ */
    public boolean mo17485() {
        return this instanceof C13194;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7570(C23663 c23663, EnumC3600 enumC3600, String str) {
        super(enumC3600, 0L, null, null, null);
        this.f19843 = c23663;
        this.f19842 = str;
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        throw new AssertionError();
    }

    @Override // p067l.AbstractC7783
    public String toString() {
        return this.f19842;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 mo17484(AbstractC12224 abstractC12224, AbstractC21195 abstractC21195) {
        C23663 c23663 = this.f19843;
        C8374 c8374 = c23663.f75323;
        AbstractC6462 abstractC6462 = c23663.f75331.f69144.f20406;
        c8374.getClass();
        return C8374.m19397(abstractC12224, abstractC21195, abstractC6462).f16705;
    }
}
