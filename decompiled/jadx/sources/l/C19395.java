package l;

/* JADX INFO: renamed from: l.᩵ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19395 extends AbstractC18689 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f62760;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f62761;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
    }

    @Override // l.AbstractC18689
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15215() {
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44669(AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC5144M19471 = C7260.m19471(abstractC5144);
        if (abstractC5144M19471.m14709(EnumC18550.f57566) || abstractC5144M19471.m14709(EnumC18550.f57581)) {
            AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC5144M19471);
            AbstractC5144 abstractC5145 = this.f62760;
            if (abstractC5145 == null || abstractC5698M19472.f17559 != EnumC1296.f4567 || abstractC5698M19472.f17561.f17559 != EnumC1296.f4571 || ((C12048) abstractC5698M19472).f36040 >= C7260.m19455(abstractC5145)) {
                return;
            }
            switch (C10928.f32841[this.f62760.mo989().ordinal()]) {
                case 8:
                    C10222 c10222 = this.f62761;
                    if (!c10222.f30701) {
                        C22364 c22364 = c10222.f30706;
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(abstractC5144M19471, new C12281("compiler", "local.var.accessed.from.icls.needs.final", abstractC5698M19472));
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            m44668(abstractC5698M19472, abstractC5144M19471);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44668(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        C11576 c11576;
        switch (C10928.f32841[this.f62760.mo989().ordinal()]) {
            case 8:
                c11576 = C11886.f35444;
                break;
            case 9:
                c11576 = C11886.f35504;
                break;
            case 10:
                c11576 = C11886.f35448;
                break;
            default:
                throw new AssertionError("Unexpected tree kind: " + this.f62760.mo989());
        }
        C10222 c10222 = this.f62761;
        C22364 c22364 = c10222.f30706;
        C16719 c16719M16617 = c10222.f30709.m16617(c11576);
        C12281 c12281 = C6241.f19132;
        c22364.m7273(abstractC5144, new C12281("compiler", "cant.ref.non.effectively.final.var", abstractC5698, c16719M16617));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        AbstractC5144 abstractC5144 = this.f62760;
        try {
            this.f62760 = c5557.f17186.m16077() ? c5557 : null;
            super.mo1215(c5557);
        } finally {
            this.f62760 = abstractC5144;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        AbstractC5144 abstractC5144 = this.f62760;
        try {
            this.f62760 = c14169;
            super.mo1217(c14169);
        } finally {
            this.f62760 = abstractC5144;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1402(C14022 c14022) {
        mo10758(c14022.f42404);
        AbstractC5144 abstractC5144 = this.f62760;
        try {
            this.f62760 = c14022;
            mo10758(c14022.f42403);
        } finally {
            this.f62760 = abstractC5144;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        AbstractC5698 abstractC5698 = c7673.f23697;
        if (abstractC5698.f17559 == EnumC1296.f4567) {
            C12048 c12048 = (C12048) abstractC5698;
            AbstractC5144 abstractC5144 = this.f62760;
            if (abstractC5144 == null || c12048.f17561.f17559 != EnumC1296.f4571 || c12048.f36040 >= C7260.m19455(abstractC5144)) {
                return;
            }
            switch (C10928.f32841[this.f62760.mo989().ordinal()]) {
                case 8:
                    C10222 c10222 = this.f62761;
                    if (!c10222.f30701) {
                        if ((c12048.f17563 & 16) == 0) {
                            C22364 c22364 = c10222.f30706;
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(c7673, new C12281("compiler", "local.var.accessed.from.icls.needs.final", c12048));
                            return;
                        }
                        return;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
            if ((c12048.f17563 & 2199023255568L) == 0) {
                m44668(c12048, c7673);
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        AbstractC12612 abstractC12612M19458 = C7260.m19458(c21080.f67987);
        if (!(abstractC12612M19458 instanceof C7673)) {
            mo10758(abstractC12612M19458);
        }
        mo10758(c21080.f67988);
        m44669(abstractC12612M19458);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        mo10758(c9791.f29619);
        mo10758(c9791.f29618);
        m44669(c9791.f29619);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        int i = C10928.f32841[c6555.mo989().ordinal()];
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            mo10758(c6555.f20226);
            m44669(c6555.f20226);
        } else {
            mo10758(c6555.f20226);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        AbstractC5698 abstractC5698M19472;
        for (AbstractC5144 abstractC5144 : c10789.f32446) {
            if (!abstractC5144.m14709(EnumC18550.f57578) && (abstractC5698M19472 = C7260.m19472(abstractC5144)) != null && (abstractC5698M19472.mo16084() & 2199023255568L) == 0) {
                C22364 c22364 = this.f62761.f30706;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(abstractC5144, new C12281("compiler", "try.with.resources.expr.effectively.final.var", abstractC5698M19472));
            }
        }
        super.mo1396(c10789);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        mo10758(c2322.f7456);
    }

    public C19395(C10222 c10222) {
        this.f62761 = c10222;
    }
}
