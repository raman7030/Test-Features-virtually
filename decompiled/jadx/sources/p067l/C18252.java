package p067l;

/* JADX INFO: renamed from: l.ܽܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18252 extends AbstractC6363 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f54515;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11508(C13956 c13956, Object obj) {
        return c13956;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        AbstractC21195 abstractC21195 = c21333.f16705;
        if (abstractC21195 == abstractC7783) {
            return c21333;
        }
        AbstractC6462 abstractC6462 = abstractC7783.f20406;
        C8374 c8374 = this.f54515;
        AbstractC6462 abstractC6462M19467 = c8374.m19467(abstractC21195, abstractC6462);
        if (abstractC6462M19467 != null) {
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            try {
                c8374.m19440(abstractC6462M19467, c21333, c20271, c20272);
                AbstractC6462 abstractC6462M19428 = c8374.m19428(abstractC7783.f20406, c20271.m45783(), c20272.m45783());
                if (c8374.m19486(abstractC6462M19428, (AbstractC6462) c21333, true)) {
                    C20271 c20273 = new C20271();
                    for (C4848 c4848Mo14798 = abstractC7783.f20406.mo14798(); c4848Mo14798.m10293(); c4848Mo14798 = c4848Mo14798.f11035) {
                        if (abstractC6462M19428.mo14776((AbstractC6462) c4848Mo14798.f11034) && !c21333.mo14776((AbstractC6462) c4848Mo14798.f11034)) {
                            c20273.m45777((AbstractC6462) c4848Mo14798.f11034);
                        }
                    }
                    if (!c20273.m45784()) {
                        return abstractC6462M19428;
                    }
                    if (c21333.mo14784()) {
                        return c8374.m19459(abstractC6462M19428);
                    }
                    C4848 c4848M45783 = c20273.m45783();
                    C20271 c20274 = new C20271();
                    for (C4848 c4848 = c4848M45783; c4848.m10293(); c4848 = c4848.f11035) {
                        C22004 c22004 = c8374.f22480;
                        c20274.m45777(new C21215(c22004.f69208, EnumC17268.UNBOUND, c22004.f69162, (C10485) c4848.f11034));
                    }
                    return c8374.m19428(abstractC6462M19428, c4848M45783, c20274.m45783());
                }
            } catch (C10877 unused) {
                return null;
            }
        }
        return null;
    }

    public C18252(C8374 c8374) {
        this.f54515 = c8374;
    }
}
