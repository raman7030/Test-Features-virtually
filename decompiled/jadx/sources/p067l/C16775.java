package p067l;

/* JADX INFO: renamed from: l.ܶۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16775 extends C22142 {

    /* JADX INFO: renamed from: ֨ */
    public AbstractC15689 f49440;

    /* JADX INFO: renamed from: ۠ */
    public boolean f49441;

    @Override // p067l.C22142, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
    }

    @Override // p067l.C22142, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        if (this.f49441) {
            return;
        }
        this.f49441 = true;
        try {
            super.mo3619(c15834);
        } finally {
            this.f49441 = false;
        }
    }

    @Override // p067l.C22142, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        this.f49440.mo28415(c11281.f31438);
        super.mo3805(c11281);
    }

    @Override // p067l.C22142
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo38020(C13818 c13818) {
        return this.f49440.mo22462(c13818) && c13818.f20407.f20405 == EnumC3600.f7343;
    }
}
