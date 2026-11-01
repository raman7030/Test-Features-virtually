package p067l;

/* JADX INFO: renamed from: l.ܶ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16715 extends AbstractC6363 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f49293;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return ((AbstractC7783) obj).f20406;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        return this.f49293.m19483((AbstractC7783) obj, c10485.mo14803());
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11508(C13956 c13956, Object obj) {
        return c13956;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        C8374 c8374 = this.f49293;
        return c8374.m19483((AbstractC7783) obj, c8374.m19451(c21215));
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        AbstractC7783 abstractC7784 = abstractC7783.f20407;
        if ((abstractC7783.mo18003() & 8) == 0 && abstractC7784.f20406.mo14781()) {
            C8374 c8374 = this.f49293;
            AbstractC6462 abstractC6462M19430 = c8374.m19430(abstractC7784, c21333);
            if (c21333.mo7388()) {
                abstractC6462M19430 = c8374.m19463(abstractC6462M19430);
            }
            if (abstractC6462M19430 != null) {
                C4848 c4848Mo14798 = abstractC7784.f20406.mo14798();
                C4848 c4848Mo14799 = abstractC6462M19430.mo14798();
                if (c4848Mo14798.m10293()) {
                    if (c4848Mo14799.isEmpty()) {
                        return c8374.m19459(abstractC7783.f20406);
                    }
                    return c8374.m19428(abstractC7783.f20406, c4848Mo14798, c4848Mo14799);
                }
            }
        }
        return abstractC7783.f20406;
    }

    public C16715(C8374 c8374) {
        this.f49293 = c8374;
    }
}
