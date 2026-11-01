package p067l;

/* JADX INFO: renamed from: l.᩻ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C24958 extends AbstractC15079 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f79691;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6463 = (AbstractC6462) obj;
        boolean zMo14804 = abstractC6463.mo14804();
        C8374 c8374 = this.f79691;
        if (zMo14804) {
            return Boolean.valueOf(c8374.m19444(abstractC6463, abstractC6462));
        }
        return Boolean.valueOf(c8374.m19490(abstractC6462, abstractC6463));
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14564(C3108 c3108, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (!abstractC6462.m14777(EnumC11353.WILDCARD)) {
            return Boolean.valueOf(this.f79691.m19490(c3108, abstractC6462));
        }
        return Boolean.FALSE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo11508(C13956 c13956, Object obj) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        boolean z;
        EnumC17268 enumC17268 = c21215.f66702;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        boolean zMo14804 = abstractC6462.mo14804();
        C8374 c8374 = this.f79691;
        if (zMo14804) {
            return Boolean.valueOf(c8374.m19444(abstractC6462, c21215));
        }
        EnumC11353 enumC11353 = EnumC11353.WILDCARD;
        if (!abstractC6462.m14777(enumC11353)) {
            if (abstractC6462.m14777(EnumC11353.TYPEVAR) || !((C10485) abstractC6462).mo24195()) {
                z = false;
                if ((c21215.mo14786() || c8374.m19486(c8374.m19453(c21215), c8374.m19453(abstractC6462), false)) && (c21215.mo14788() || c8374.m19486(c8374.m19451(abstractC6462), c8374.m19451(c21215), false))) {
                    z = true;
                }
            } else {
                C21215 c21216 = ((C16637) abstractC6462).f48907;
                if (c21216.m14777(enumC11353) && c21216.f66702 == enumC17268 && c21216.f66703 == c21215.f66703) {
                    z = true;
                } else {
                    z = false;
                    if (c21215.mo14786()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            C21215 c21217 = (C21215) abstractC6462;
            if (c21217.f66702 == enumC17268 && c21217.f66703 == c21215.f66703) {
                z = true;
            } else if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
                z = false;
                if (c21215.mo14786()) {
                    z = true;
                } else {
                    z = true;
                }
            } else {
                z = false;
                if (c21215.mo14786()) {
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public C24958(C8374 c8374) {
        this.f79691 = c8374;
    }
}
