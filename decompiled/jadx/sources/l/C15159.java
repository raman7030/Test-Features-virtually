package l;

/* JADX INFO: renamed from: l.ܶۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15159 extends C20806 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f46322;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f46323;

    @Override // l.C20806, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
    }

    @Override // l.C20806, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        if (this.f46323) {
            return;
        }
        this.f46323 = true;
        try {
            super.mo1217(c14169);
        } finally {
            this.f46323 = false;
        }
    }

    @Override // l.C20806, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        this.f46322.mo26382(c9378.f28489);
        super.mo1392(c9378);
    }

    @Override // l.C20806
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo35862(C12048 c12048) {
        return this.f46322.mo20482(c12048) && c12048.f17561.f17559 == EnumC1296.f4571;
    }
}
