package l;

/* JADX INFO: renamed from: l.ܺ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes5.dex */
public final class C15946 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4824 f49233;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f49234;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1323 f49235;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5557 f49236;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
    }

    public C15946(C15240 c15240, C1755 c1755, C5557 c5557, C1323 c1323) {
        this.f49234 = c15240;
        this.f49236 = c5557;
        this.f49235 = c1323;
        this.f49233 = ((C8604) c1755.f6073).f26289;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        if (C15240.m36077(this.f49234, (AbstractC5698) c8526.f26045)) {
            C4824 c4824 = this.f49233;
            try {
                C4824 c4824M14053 = c4824.m14053(c8526.f26045);
                this.f49233 = c4824M14053;
                if (c4824M14053.m14055(EnumC20347.EXPORTS)) {
                    super.mo1388(c8526);
                }
            } finally {
                this.f49233 = c4824;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        if (C15240.m36077(this.f49234, c9378.f28489) || c9378.f28489.f17561.f17559 == EnumC1296.f4571) {
            C4824 c4824 = this.f49233;
            try {
                C4824 c4824M14053 = c4824.m14053(c9378.f28489);
                this.f49233 = c4824M14053;
                if (c4824M14053.m14055(EnumC20347.EXPORTS)) {
                    mo10758(c9378.f28486);
                    mo10758(c9378.f28488);
                }
            } finally {
                this.f49233 = c4824;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        if (c5557 == this.f49236 && C15240.m36077(this.f49234, c5557.f17186)) {
            C4824 c4824 = this.f49233;
            try {
                C4824 c4824M14053 = c4824.m14053(c5557.f17186);
                this.f49233 = c4824M14053;
                if (c4824M14053.m14055(EnumC20347.EXPORTS)) {
                    mo10758(c5557.f17181);
                    m33860(c5557.f17185);
                    try {
                        this.f49232 = true;
                        mo10758(c5557.f17184);
                        m33860(c5557.f17183);
                        this.f49232 = false;
                        m33860(c5557.f17179);
                    } catch (Throwable th) {
                        this.f49232 = false;
                        throw th;
                    }
                }
                this.f49233 = c4824;
            } catch (Throwable th2) {
                this.f49233 = c4824;
                throw th2;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        mo10758(c16432.f50542);
        boolean z = this.f49232;
        try {
            this.f49232 = false;
            m33860(c16432.f50541);
        } finally {
            this.f49232 = z;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        AbstractC5698 abstractC5698M19472 = C7260.m19472(c7673);
        if (abstractC5698M19472.f17559 != EnumC1296.f4582 || abstractC5698M19472.f17560.m12913(EnumC9454.TYPEVAR)) {
            return;
        }
        C15240.m36071(this.f49234, c7673, abstractC5698M19472, this.f49235.f4746, this.f49232);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        AbstractC5698 abstractC5698M19472 = C7260.m19472(c6262);
        AbstractC5698 abstractC5698M19473 = C7260.m19472(c6262.f19397);
        if (abstractC5698M19472.f17559 != EnumC1296.f4582 || abstractC5698M19473.f17559 != EnumC1296.f4579) {
            mo10758(c6262.f19397);
            return;
        }
        C15240.m36071(this.f49234, c6262, abstractC5698M19472, this.f49235.f4746, this.f49232);
    }
}
