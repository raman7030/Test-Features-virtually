package p067l;

/* JADX INFO: renamed from: l.ۡ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C11057 extends AbstractC14409 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C8374 f30620;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f30621;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f30622;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return abstractC6462;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        AbstractC6462 abstractC6462M19459;
        if (!this.f30622) {
            return c10485;
        }
        if (c10485.mo14803().mo14776((AbstractC6462) c10485)) {
            abstractC6462M19459 = this.f30620.m19459(c10485.mo14803());
        } else {
            abstractC6462M19459 = (AbstractC6462) c10485.mo14803().mo5291(this, (Object) null);
        }
        return m25460(abstractC6462M19459, c10485, EnumC17268.EXTENDS);
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4510(C16637 c16637, Object obj) {
        AbstractC6462 abstractC6462M19459;
        C21215 c21215 = c16637.f48907;
        AbstractC6462 abstractC6462 = c21215.f66703;
        if (abstractC6462.mo14776((AbstractC6462) c16637)) {
            abstractC6462M19459 = this.f30620.m19459(abstractC6462);
        } else {
            abstractC6462M19459 = (AbstractC6462) abstractC6462.mo5291(this, (Object) null);
        }
        return m25460((AbstractC6462) abstractC6462M19459.mo5291(this, (Object) null), c21215.f66701, c21215.f66702);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) c21215.f66703.mo5291(this, (Object) null);
        return c21215.f66703 == abstractC6462 ? c21215 : m25460(abstractC6462, c21215.f66701, c21215.f66702);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        C20271 c20271 = new C20271();
        boolean z = false;
        for (AbstractC6462 abstractC6462 : c21333.mo14798()) {
            AbstractC6462 abstractC6463 = (AbstractC6462) abstractC6462.mo5291(this, (Object) null);
            if (abstractC6462 != abstractC6463) {
                z = true;
            }
            c20271.m45777(abstractC6463);
        }
        if (!z) {
            return c21333;
        }
        AbstractC6462 abstractC6464 = c21333.f16705.f20406;
        return this.f30620.m19428(abstractC6464, abstractC6464.mo14798(), c20271.m45783());
    }

    /* JADX INFO: renamed from: ֫ */
    private C21215 m25460(AbstractC6462 abstractC6462, C10485 c10485, EnumC17268 enumC17268) {
        C8374 c8374 = this.f30620;
        C22004 c22004 = c8374.f22480;
        int i = C12889.f36248[enumC17268.ordinal()];
        boolean z = this.f30621;
        if (i == 1) {
            if (z) {
                return C8374.m19398(c8374, m25461(abstractC6462), c10485);
            }
            return C8374.m19398(c8374, c22004.f69208, c10485);
        }
        if (i == 2) {
            if (z) {
                return C8374.m19411(c8374, c22004.f69204, c10485);
            }
            return C8374.m19411(c8374, m25461(abstractC6462), c10485);
        }
        if (i == 3) {
            return C8374.m19398(c8374, c22004.f69208, c10485);
        }
        C1446.m31702("Invalid bound kind " + enumC17268);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 m25461(AbstractC6462 abstractC6462) {
        C22004 c22004 = this.f30620.f22480;
        while (abstractC6462.m14777(EnumC11353.WILDCARD)) {
            C21215 c21215 = (C21215) abstractC6462;
            EnumC17268 enumC17268 = c21215.f66702;
            boolean z = this.f30621;
            if (z) {
                if (enumC17268 == EnumC17268.EXTENDS) {
                    abstractC6462 = c21215.f66703;
                } else {
                    abstractC6462 = null;
                }
            } else if (enumC17268 == EnumC17268.SUPER) {
                abstractC6462 = c21215.f66703;
            } else {
                abstractC6462 = null;
            }
            if (abstractC6462 == null) {
                abstractC6462 = z ? c22004.f69208 : c22004.f69204;
            }
        }
        return abstractC6462;
    }

    public C11057(C8374 c8374, boolean z, boolean z2) {
        this.f30620 = c8374;
        this.f30621 = z;
        this.f30622 = z2;
    }
}
