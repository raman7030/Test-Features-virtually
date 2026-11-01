package p067l;

/* JADX INFO: renamed from: l.᩹۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C23422 extends AbstractC14409 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f74621;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return AbstractC6462.f16700;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        boolean zMo14805 = c7251.f18916.mo14805();
        C8374 c8374 = this.f74621;
        if (zMo14805 || c8374.m19490(c7251.f18916, c8374.f22480.f69208)) {
            return c8374.m19410();
        }
        return new C7251(c8374.m19502(c7251.f18916), c7251.f16705);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        if (c10485.mo14803().m14777(EnumC11353.TYPEVAR) || (!c10485.mo14803().mo7388() && !c10485.mo14803().mo14789())) {
            return c10485.mo14803();
        }
        return this.f74621.m19502(c10485.mo14803());
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11508(C13956 c13956, Object obj) {
        return AbstractC6462.f16700;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        if (c21333.f67259 == null) {
            AbstractC6462 abstractC6462Mo25528 = ((C15828) c21333.f16705).mo25528();
            if (c21333.mo14789()) {
                abstractC6462Mo25528 = ((C21333) c21333.f16705.f20406).f67259;
            }
            if (c21333.f67259 == null) {
                C8374 c8374 = this.f74621;
                C4848 c4848Mo14798 = c8374.m19494(c21333).mo14798();
                C4848 c4848Mo14799 = c21333.f16705.f20406.mo14798();
                if (c21333.mo11307()) {
                    c21333.f67259 = c8374.m19458(abstractC6462Mo25528);
                } else if (c4848Mo14799.m10293()) {
                    c21333.f67259 = c8374.m19428(abstractC6462Mo25528, c4848Mo14799, c4848Mo14798);
                } else {
                    c21333.f67259 = abstractC6462Mo25528;
                }
            }
        }
        return c21333.f67259;
    }

    public C23422(C8374 c8374) {
        this.f74621 = c8374;
    }
}
