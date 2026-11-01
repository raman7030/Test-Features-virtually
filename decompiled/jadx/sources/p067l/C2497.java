package p067l;

/* JADX INFO: renamed from: l.֡ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2497 extends C24572 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9874 f4025;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C15834 f4026;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean f4027;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C20271 f4028;

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(final C11813 c11813) {
        this.f77797 = c11813;
        boolean z = this.f4027;
        C20271 c20271 = this.f4028;
        C9874 c9874 = this.f4025;
        if (z) {
            if (c11813.f32975 != null) {
                final C5638 c5638M42192 = c9874.f27388.m42192(C4848.m10276of((Object) c11813));
                this.f77797 = c5638M42192;
                final C15834 c15834 = this.f4026;
                c20271.m45777(new Runnable(this) { // from class: l.ۘۗ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C20604 c20604 = new C20604(c5638M42192, c11813);
                        C15834 c15835 = c15834;
                        c15835.f45864 = c20604.mo25569(c15835.f45864);
                    }
                });
                return;
            }
            return;
        }
        if (c11813.f32975 == null) {
            C5638 c5638M42191 = c9874.f27388.m42191();
            c5638M42191.f18925 = c9874.f27389.f69139;
            c11813.f32975 = c5638M42191;
            c20271.m45777(new Runnable() { // from class: l.ᩴۗ֨
                @Override // java.lang.Runnable
                public final void run() {
                    c11813.f32975 = null;
                }
            });
        }
    }

    public C2497(C9874 c9874, boolean z, C20271 c20271, C15834 c15834) {
        this.f4025 = c9874;
        this.f4027 = z;
        this.f4028 = c20271;
        this.f4026 = c15834;
    }
}
