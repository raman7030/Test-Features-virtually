package p067l;

/* JADX INFO: renamed from: l.᩸ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22812 extends C7389 {

    /* JADX INFO: renamed from: ۜ */
    public C4848 f71870;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C12083 f71871;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f71872;

    @Override // p067l.C7389, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22812(C12083 c12083) {
        super(c12083);
        this.f71871 = c12083;
    }

    @Override // p067l.C7389, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        AbstractC6462 abstractC6462 = c15834.f18925;
        if ((abstractC6462 == null || !abstractC6462.mo14812()) && !this.f71872) {
            C4848 c4848 = this.f19352;
            C4848 c4849 = this.f19353;
            C20271 c20271 = this.f62320;
            this.f71872 = true;
            try {
                this.f62320 = new C20271();
                this.f19352 = C4848.m10276of((Object) this.f71871.f33665.f69161);
                this.f19353 = C4848.m10283();
                mo12739(c15834.f45864);
                this.f71870 = this.f19353;
            } finally {
                this.f62320 = c20271;
                this.f19352 = c4848;
                this.f19353 = c4849;
                this.f71872 = false;
            }
        }
    }
}
