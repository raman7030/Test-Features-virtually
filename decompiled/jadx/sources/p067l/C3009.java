package p067l;

/* JADX INFO: renamed from: l.֡᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3009 extends AbstractC21885 {

    /* JADX INFO: renamed from: ᩶ */
    public C4848 f5370;

    /* JADX INFO: renamed from: ᩸ */
    public C4848 f5371;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f5372;

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        C4848 c4848 = this.f5371;
        C4848 c4849 = this.f5370;
        while (c4848.m10293()) {
            if (!c10485.m14793((AbstractC6462) c4848.f11034)) {
                c4848 = c4848.f11035;
                c4849 = c4849.f11035;
            } else {
                return ((AbstractC6462) c4849.f11034).mo14801(c10485);
            }
        }
        return c10485;
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo5083(C11945 c11945, Object obj) {
        return m5086(c11945);
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC6462 mo5083(C11945 c11945, Object obj) {
        return m5086(c11945);
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo4512(C21333 c21333, Void r5) {
        if (!c21333.mo7388()) {
            return super.mo4512(c21333, (Object) r5);
        }
        C8374 c8374 = this.f5372;
        AbstractC6462 abstractC6462M8982 = m8982(c8374.m19502(c21333));
        C4848 c4848M7099 = m7099(r5, c8374.m19450(c21333));
        return (abstractC6462M8982 == c8374.m19502(c21333) && c4848M7099 == c8374.m19450(c21333)) ? c21333 : c8374.m19474(c4848M7099.m10290(abstractC6462M8982));
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo4511(C21215 c21215, Void r3) {
        C21215 c21216 = (C21215) super.mo4511(c21215, (Object) r3);
        if (c21216 != c21215 && c21215.mo14786() && c21216.f66703.mo14786()) {
            c21216.f66703 = this.f5372.m19451(c21216.f66703);
        }
        return c21216;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11945 m5086(C11945 c11945) {
        C4848 c4848 = c11945.f33323;
        C4848 c4849 = this.f5370;
        boolean zM14767 = AbstractC6462.m14767(c4849, c4848);
        C8374 c8374 = this.f5372;
        if (zM14767) {
            C4848 c4848M19504 = c8374.m19504(c4848);
            c11945 = new C11945(c8374.m19428(c11945.f16992, c4848, c4848M19504), c4848M19504);
        }
        AbstractC6462 abstractC6462 = c11945.f16992;
        C4848 c48410 = c11945.f33323;
        C4848 c4848M19461 = c8374.m19461(c48410, this.f5371, c4849);
        AbstractC6462 abstractC6462M8982 = m8982(abstractC6462);
        if (c4848M19461 == c48410 && abstractC6462M8982 == abstractC6462) {
            return c11945;
        }
        if (c4848M19461 == c48410) {
            return new C20445(abstractC6462M8982, c4848M19461);
        }
        return new C21116(c8374.m19428(abstractC6462M8982, c48410, c4848M19461), c4848M19461);
    }

    public C3009(C8374 c8374, C4848 c4848, C4848 c4849) {
        this.f5372 = c8374;
        int iM10289 = c4848.m10289();
        int iM102810 = c4849.m10289();
        while (iM10289 > iM102810) {
            iM10289--;
            c4848 = c4848.f11035;
        }
        while (iM10289 < iM102810) {
            iM102810--;
            c4849 = c4849.f11035;
        }
        this.f5371 = c4848;
        this.f5370 = c4849;
    }
}
