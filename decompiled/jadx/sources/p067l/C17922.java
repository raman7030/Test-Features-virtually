package p067l;

/* JADX INFO: renamed from: l.ܽۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17922 extends C21808 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C7726 f53528;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC3880 f53529;

    public C17922(C7726 c7726, AbstractC3880 abstractC3880) {
        this.f53528 = c7726;
        this.f53529 = abstractC3880;
    }

    @Override // p067l.C21808
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo27265(AbstractC10348 abstractC10348) {
        switch (C19264.f57582[abstractC10348.f28658.ordinal()]) {
            case 1:
            case 2:
            case 3:
                AbstractC10348[] abstractC10348ArrMo17753 = abstractC10348.mo17753();
                if (C15910.m36027(abstractC10348ArrMo17753[0])) {
                    for (int i = 1; i < abstractC10348ArrMo17753.length; i++) {
                        mo27265(abstractC10348ArrMo17753[i]);
                    }
                    throw C15910.f46029;
                }
                break;
            case 4:
                if (C15910.m36027(abstractC10348.mo4921())) {
                    mo27265(abstractC10348.mo4923());
                    throw C15910.f46029;
                }
                break;
            case 5:
                if (C15910.m36027(abstractC10348.mo23968())) {
                    throw C15910.f46029;
                }
                break;
            case 6:
                if (abstractC10348.mo4923().f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10348.mo4923()).f38899).intValue() == 0) {
                    mo27265(abstractC10348.mo4921());
                    throw C15910.f46027;
                }
                break;
            case 7:
                if (abstractC10348.mo4923().f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10348.mo4923()).f38899).longValue() == 0) {
                    mo27265(abstractC10348.mo4921());
                    throw C15910.f46027;
                }
                break;
            case 8:
                if (abstractC10348.mo23968().f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10348.mo23968()).f38899).intValue() < 0) {
                    throw C15910.f46028;
                }
                break;
            case 9:
                for (AbstractC10348 abstractC10349 : abstractC10348.mo17753()) {
                    if (abstractC10349.f28658 == EnumC3642.CONSTANT) {
                        if (((Number) ((C13761) abstractC10349).f38899).intValue() < 0) {
                            throw C15910.f46028;
                        }
                        mo27265(abstractC10349);
                    }
                }
                break;
        }
        super.mo27265(abstractC10348);
        EnumC3642 enumC3642 = abstractC10348.f28658;
        if (enumC3642 == EnumC3642.LOCAL || enumC3642 == EnumC3642.CONSTANT) {
            return abstractC10348;
        }
        C19736 c19736 = new C19736();
        C7726 c7726 = this.f53528;
        c7726.f20261.add(c19736);
        c7726.f20257.m40882(this.f53529, C19303.m43990(c19736, abstractC10348));
        return c19736;
    }
}
