package p067l;

/* JADX INFO: renamed from: l.ۧۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12559 extends C23149 {
    @Override // p067l.C23149
    /* JADX INFO: renamed from: ֫ */
    public final void mo28949(AbstractC3880 abstractC3880) {
        if (abstractC3880.f8417 == EnumC9677.FILL_ARRAY_DATA && C15910.m36027(abstractC3880.mo7675())) {
            throw C15910.f46029;
        }
        super.mo28949(abstractC3880);
    }

    @Override // p067l.C23149
    /* JADX INFO: renamed from: ֫ */
    public final void mo28950(AbstractC10348 abstractC10348) {
        switch (C19264.f57582[abstractC10348.f28658.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (C15910.m36027(abstractC10348.mo17753()[0])) {
                    throw C15910.f46029;
                }
                return;
            case 4:
                if (C15910.m36027(abstractC10348.mo4921())) {
                    throw C15910.f46029;
                }
                return;
            case 5:
                if (C15910.m36027(abstractC10348.mo23968())) {
                    throw C15910.f46029;
                }
                return;
            case 6:
                if (abstractC10348.mo4923().f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10348.mo4923()).f38899).intValue() == 0) {
                    throw C15910.f46027;
                }
                return;
            case 7:
                if (abstractC10348.mo4923().f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10348.mo4923()).f38899).longValue() == 0) {
                    throw C15910.f46027;
                }
                return;
            case 8:
                if (abstractC10348.mo23968().f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10348.mo23968()).f38899).intValue() < 0) {
                    throw C15910.f46028;
                }
                return;
            case 9:
                for (AbstractC10348 abstractC10349 : abstractC10348.mo17753()) {
                    if (abstractC10349.f28658 == EnumC3642.CONSTANT && ((Number) ((C13761) abstractC10349).f38899).intValue() < 0) {
                        throw C15910.f46028;
                    }
                }
                return;
            default:
                return;
        }
    }
}
