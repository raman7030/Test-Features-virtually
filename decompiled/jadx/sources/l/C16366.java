package l;

/* JADX INFO: renamed from: l.ܽۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16366 extends C20454 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5637 f50355;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1591 f50356;

    public C16366(C5637 c5637, AbstractC1591 abstractC1591) {
        this.f50355 = c5637;
        this.f50356 = abstractC1591;
    }

    @Override // l.C20454
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8396 mo25248(AbstractC8396 abstractC8396) {
        switch (C17778.f54388[abstractC8396.f25745.ordinal()]) {
            case 1:
            case 2:
            case 3:
                AbstractC8396[] abstractC8396ArrMo15838 = abstractC8396.mo15838();
                if (C14249.m33895(abstractC8396ArrMo15838[0])) {
                    for (int i = 1; i < abstractC8396ArrMo15838.length; i++) {
                        mo25248(abstractC8396ArrMo15838[i]);
                    }
                    throw C14249.f42937;
                }
                break;
            case 4:
                if (C14249.m33895(abstractC8396.mo2581())) {
                    mo25248(abstractC8396.mo2583());
                    throw C14249.f42937;
                }
                break;
            case 5:
                if (C14249.m33895(abstractC8396.mo21997())) {
                    throw C14249.f42937;
                }
                break;
            case 6:
                if (abstractC8396.mo2583().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo2583()).f35889).intValue() == 0) {
                    mo25248(abstractC8396.mo2581());
                    throw C14249.f42935;
                }
                break;
            case 7:
                if (abstractC8396.mo2583().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo2583()).f35889).longValue() == 0) {
                    mo25248(abstractC8396.mo2581());
                    throw C14249.f42935;
                }
                break;
            case 8:
                if (abstractC8396.mo21997().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo21997()).f35889).intValue() < 0) {
                    throw C14249.f42936;
                }
                break;
            case 9:
                for (AbstractC8396 abstractC8397 : abstractC8396.mo15838()) {
                    if (abstractC8397.f25745 == EnumC1340.CONSTANT) {
                        if (((Number) ((C11987) abstractC8397).f35889).intValue() < 0) {
                            throw C14249.f42936;
                        }
                        mo25248(abstractC8397);
                    }
                }
                break;
        }
        super.mo25248(abstractC8396);
        EnumC1340 enumC1340 = abstractC8396.f25745;
        if (enumC1340 == EnumC1340.LOCAL || enumC1340 == EnumC1340.CONSTANT) {
            return abstractC8396;
        }
        C18274 c18274 = new C18274();
        C5637 c5637 = this.f50355;
        c5637.f17415.add(c18274);
        c5637.f17411.m38666(this.f50356, C17819.m41744(c18274, abstractC8396));
        return c18274;
    }
}
