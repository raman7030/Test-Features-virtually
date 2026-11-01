package p067l;

/* JADX INFO: renamed from: l.᩸۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C22752 extends AbstractC21885 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f71759;

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC6462 m50920(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        if (abstractC6463.f16704 == C22082.f69463) {
            return abstractC6462;
        }
        switch (C12889.f36250[abstractC6462.mo5575().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return abstractC6462;
            default:
                return abstractC6462.mo3770(abstractC6462.f16704.m49704(EnumC24763.ANNOTATIONS));
        }
    }

    @Override // p067l.C4351, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return abstractC6462.mo14805() ? abstractC6462 : m50920(abstractC6462, abstractC6462);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        return m50920(this.f71759.m19416(c10485.mo14803(), ((Boolean) obj).booleanValue()), (AbstractC6462) c10485);
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        C8374 c8374 = this.f71759;
        return m50920(c8374.m19416(c8374.m19451(c21215), ((Boolean) obj).booleanValue()), (AbstractC6462) c21215);
    }

    @Override // p067l.C4351, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo4507(Object obj, AbstractC6462 abstractC6462) {
        return abstractC6462.mo14805() ? abstractC6462 : m50920(abstractC6462, abstractC6462);
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo4511(C21215 c21215, Object obj) {
        C8374 c8374 = this.f71759;
        return m50920(c8374.m19416(c8374.m19451(c21215), ((Boolean) obj).booleanValue()), (AbstractC6462) c21215);
    }

    @Override // p067l.AbstractC21885, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final AbstractC6462 mo4512(C21333 c21333, Boolean bool) {
        AbstractC6462 abstractC6462Mo18010 = c21333.f16705.mo18010(this.f71759);
        if (bool.booleanValue()) {
            return new C5239(abstractC6462Mo18010.mo7201(), C4848.m10283(), abstractC6462Mo18010.f16705, c21333.f16704.m49704(EnumC24763.ANNOTATIONS));
        }
        return m50920(abstractC6462Mo18010, (AbstractC6462) c21333);
    }

    public C22752(C8374 c8374) {
        this.f71759 = c8374;
    }
}
