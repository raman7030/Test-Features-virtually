package l;

/* JADX INFO: renamed from: l.ۧۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10723 extends C21865 {
    @Override // l.C21865
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26909(AbstractC1591 abstractC1591) {
        if (abstractC1591.f5638 == EnumC7690.FILL_ARRAY_DATA && C14249.m33895(abstractC1591.mo5445())) {
            throw C14249.f42937;
        }
        super.mo26909(abstractC1591);
    }

    @Override // l.C21865
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26910(AbstractC8396 abstractC8396) {
        switch (C17778.f54388[abstractC8396.f25745.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (C14249.m33895(abstractC8396.mo15838()[0])) {
                    throw C14249.f42937;
                }
                return;
            case 4:
                if (C14249.m33895(abstractC8396.mo2581())) {
                    throw C14249.f42937;
                }
                return;
            case 5:
                if (C14249.m33895(abstractC8396.mo21997())) {
                    throw C14249.f42937;
                }
                return;
            case 6:
                if (abstractC8396.mo2583().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo2583()).f35889).intValue() == 0) {
                    throw C14249.f42935;
                }
                return;
            case 7:
                if (abstractC8396.mo2583().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo2583()).f35889).longValue() == 0) {
                    throw C14249.f42935;
                }
                return;
            case 8:
                if (abstractC8396.mo21997().f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8396.mo21997()).f35889).intValue() < 0) {
                    throw C14249.f42936;
                }
                return;
            case 9:
                for (AbstractC8396 abstractC8397 : abstractC8396.mo15838()) {
                    if (abstractC8397.f25745 == EnumC1340.CONSTANT && ((Number) ((C11987) abstractC8397).f35889).intValue() < 0) {
                        throw C14249.f42936;
                    }
                }
                return;
            default:
                return;
        }
    }
}
