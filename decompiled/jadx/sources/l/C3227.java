package l;

/* JADX INFO: renamed from: l.ۗ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public class C3227 extends C8166 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12399 f10155;

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ C10658 mo7394(C10658 c10658, Object obj) {
        return (C10658) mo7394(c10658, (AbstractC4308) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3227(C12399 c12399, EnumC13829 enumC13829, AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        super(c12399, enumC13829, abstractC5698, enumC16761 == null ? EnumC16761.f51453 : enumC16761);
        this.f10155 = c12399;
    }

    @Override // l.C8166
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public AbstractC4308 mo2259(C1110 c1110, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4308Mo2259 = super.mo2259(c1110, (Object) abstractC4308);
        AbstractC12612 abstractC12612 = c1110.f4048;
        if (abstractC4308Mo2259 != AbstractC4308.f13885) {
            return abstractC4308Mo2259;
        }
        boolean z = abstractC12612.m14709(EnumC18550.f57524) || abstractC12612.m14709(EnumC18550.f57523);
        C12399 c12399 = this.f10155;
        if (abstractC4308 == null || (z && !c12399.f37343.m17558(abstractC4308))) {
            abstractC4308 = AbstractC4308.f13884;
        }
        C9310 c9310 = c12399.f37350;
        C11003.requireNonNull(c9310);
        c1110.m3822((C23420) new C4638(this, c9310, this.f25167, abstractC4308));
        return (AbstractC4308) c1110.mo2962(this, (Object) null);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo7394(C10658 c10658, AbstractC4308 abstractC4308) {
        EnumC9454 enumC9454 = EnumC9454.METHOD;
        if (c10658.m12913(enumC9454)) {
            C6755 c6755 = this.f25167;
            if (c6755.f20970 == EnumC13829.CHECK) {
                AbstractC4308 abstractC4309 = c6755.f20972.f17560;
                AbstractC4308 abstractC4308Mo12947 = abstractC4309.m12913(EnumC9454.ERROR) ? ((C12193) abstractC4309).mo12947() : null;
                if (abstractC4308Mo12947 != null && abstractC4308Mo12947.m12913(enumC9454)) {
                    C2609 c2609M9898 = m9898(c10658.f32059, abstractC4308Mo12947.mo12933());
                    AbstractC4308 abstractC43010 = (AbstractC4308) c10658.f32060.mo2962(this, abstractC4308Mo12947.mo12923());
                    C2609 c2609M9899 = m9898(c10658.f32061, abstractC4308Mo12947.mo12930());
                    return (c2609M9898 == c10658.f32059 && abstractC43010 == c10658.f32060 && c2609M9899 == c10658.f32061) ? c10658 : new C10658(c2609M9898, abstractC43010, c2609M9899, c10658.f13890);
                }
            }
        }
        return super.mo7394(c10658, (Object) abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m9898(C2609 c2609, C2609 c26010) {
        if (!c2609.m8249()) {
            return c2609;
        }
        AbstractC4308 abstractC4308 = null;
        C2609 c2609M9898 = m9898(c2609.f8241, c26010 != null ? c26010.f8241 : null);
        AbstractC4308 abstractC4309 = (AbstractC4308) c2609.f8240;
        if (c26010 != null && c26010.m8249()) {
            abstractC4308 = (AbstractC4308) c26010.f8240;
        }
        AbstractC4308 abstractC43010 = (AbstractC4308) m21837(abstractC4308, abstractC4309);
        return (c2609M9898 == c2609.f8241 && abstractC43010 == c2609.f8240) ? c2609 : c2609M9898.m8246(abstractC43010);
    }
}
