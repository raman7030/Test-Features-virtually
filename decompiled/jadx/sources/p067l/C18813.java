package p067l;

/* JADX INFO: renamed from: l.ܿۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18813 extends AbstractC10923 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C23663 f56190;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f56191;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18813(C23663 c23663, C11142 c11142, AbstractC6462 abstractC6462, C4848 c4848, C4848 c4849, EnumC18298 enumC18298) {
        super(abstractC6462, enumC18298, c11142, c4848, c4849, c23663.f75320.f21737);
        this.f56190 = c23663;
        if (abstractC6462.mo14784()) {
            this.f6711 = new C21333(abstractC6462.mo7201(), (abstractC6462.f16705.m17988() && abstractC6462.mo7201().mo14784()) ? C4848.m10283() : abstractC6462.f16705.f20406.mo14802(), abstractC6462.f16705, abstractC6462.m14785());
            this.f56191 = true;
        }
    }

    @Override // p067l.AbstractC3390
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7783 mo5930(C4036 c4036, EnumC18298 enumC18298) {
        AbstractC7783 abstractC7783M52646;
        boolean z = this.f56191;
        C23663 c23663 = this.f56190;
        if (z) {
            AbstractC6462 abstractC6462 = this.f6711;
            enumC18298.m41671();
            abstractC7783M52646 = c23663.m52622(c4036, abstractC6462, this.f6707, this.f6710, enumC18298.m41672());
        } else {
            AbstractC6462 abstractC6463 = this.f6711;
            enumC18298.m41671();
            abstractC7783M52646 = c23663.m52646(c4036, abstractC6463, this.f6709, this.f6707, this.f6710, enumC18298.m41672());
        }
        return c23663.m52667(c4036, this.f6711) ? new C9170(abstractC7783M52646, c23663) : abstractC7783M52646;
    }

    @Override // p067l.AbstractC10923
    /* JADX INFO: renamed from: ֫ */
    public final EnumC21871 mo11860(AbstractC7783 abstractC7783) {
        return this.f6711.mo7201().m14777(EnumC11353.NONE) ? EnumC21871.f68797 : EnumC21871.f68801;
    }
}
