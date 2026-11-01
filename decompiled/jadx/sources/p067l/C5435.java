package p067l;

/* JADX INFO: renamed from: l.ۗ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public class C5435 extends C10129 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14152 f12962;

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ C12497 mo9477(C12497 c12497, Object obj) {
        return (C12497) mo9477(c12497, (AbstractC6462) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5435(C14152 c14152, EnumC15511 enumC15511, AbstractC7783 abstractC7783, EnumC18298 enumC18298) {
        super(c14152, enumC15511, abstractC7783, enumC18298 == null ? EnumC18298.f54635 : enumC18298);
        this.f12962 = c14152;
    }

    @Override // p067l.C10129
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public AbstractC6462 mo4626(C3423 c3423, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462Mo4626 = super.mo4626(c3423, (Object) abstractC6462);
        AbstractC14355 abstractC14355 = c3423.f6819;
        if (abstractC6462Mo4626 != AbstractC6462.f16700) {
            return abstractC6462Mo4626;
        }
        boolean z = abstractC14355.m16617(EnumC19998.f60748) || abstractC14355.m16617(EnumC19998.f60747);
        C14152 c14152 = this.f12962;
        if (abstractC6462 == null || (z && !c14152.f40358.m19498(abstractC6462))) {
            abstractC6462 = AbstractC6462.f16699;
        }
        C11216 c11216 = c14152.f40365;
        C12826.requireNonNull(c11216);
        c3423.m6079((C24626) new C6776(this, c11216, this.f28078, abstractC6462));
        return (AbstractC6462) c3423.mo5291(this, (Object) null);
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo9477(C12497 c12497, AbstractC6462 abstractC6462) {
        EnumC11353 enumC11353 = EnumC11353.METHOD;
        if (c12497.m14777(enumC11353)) {
            C8788 c8788 = this.f28078;
            if (c8788.f23845 == EnumC15511.CHECK) {
                AbstractC6462 abstractC6463 = c8788.f23847.f20406;
                AbstractC6462 abstractC6462Mo14811 = abstractC6463.m14777(EnumC11353.ERROR) ? ((C13956) abstractC6463).mo14811() : null;
                if (abstractC6462Mo14811 != null && abstractC6462Mo14811.m14777(enumC11353)) {
                    C4848 c4848M11946 = m11946(c12497.f35030, abstractC6462Mo14811.mo14797());
                    AbstractC6462 abstractC6464 = (AbstractC6462) c12497.f35031.mo5291(this, abstractC6462Mo14811.mo14787());
                    C4848 c4848M11947 = m11946(c12497.f35032, abstractC6462Mo14811.mo14794());
                    return (c4848M11946 == c12497.f35030 && abstractC6464 == c12497.f35031 && c4848M11947 == c12497.f35032) ? c12497 : new C12497(c4848M11946, abstractC6464, c4848M11947, c12497.f16705);
                }
            }
        }
        return super.mo9477(c12497, (Object) abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    private C4848 m11946(C4848 c4848, C4848 c4849) {
        if (!c4848.m10293()) {
            return c4848;
        }
        AbstractC6462 abstractC6462 = null;
        C4848 c4848M11946 = m11946(c4848.f11035, c4849 != null ? c4849.f11035 : null);
        AbstractC6462 abstractC6463 = (AbstractC6462) c4848.f11034;
        if (c4849 != null && c4849.m10293()) {
            abstractC6462 = (AbstractC6462) c4849.f11034;
        }
        AbstractC6462 abstractC6464 = (AbstractC6462) m23807(abstractC6462, abstractC6463);
        return (c4848M11946 == c4848.f11035 && abstractC6464 == c4848.f11034) ? c4848 : c4848M11946.m10290(abstractC6464);
    }
}
