package p067l;

/* JADX INFO: renamed from: l.֫ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L5M2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4131 extends AbstractC11508 implements InterfaceC12933, InterfaceC3132 {

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20877 f9116;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ String mo4188() {
        throw null;
    }

    public C4131(C14645 c14645, EnumC3167 enumC3167, int i) {
        super(c14645, enumC3167, i);
        this.f9116 = null;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return AbstractC12342.m28421(this.f32111.m33504().m13862(this.f32112 + 1));
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5885() {
        return this.f32111.m33504().m13862(this.f32112 + 4) & 15;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܽ */
    public final int mo5883() {
        return AbstractC12342.m28421(this.f32111.m33504().m13862(this.f32112 + 4));
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܳ */
    public final int mo5882() {
        return this.f32111.m33504().m13862(this.f32112 + 5) & 15;
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ܿ */
    public final int mo5884() {
        return AbstractC12342.m28421(this.f32111.m33504().m13862(this.f32112 + 5));
    }

    @Override // p067l.InterfaceC11851
    /* JADX INFO: renamed from: ۧ */
    public final int mo5881() {
        return this.f32111.m33504().m13862(this.f32112 + 1) & 15;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        AbstractC20877 abstractC20877 = this.f9116;
        if (abstractC20877 != null) {
            return abstractC20877;
        }
        int i = this.f32110.f6092;
        C14645 c14645 = this.f32111;
        return AbstractC4406.m9164(c14645, i, c14645.m33504().m13856(this.f32112 + 2));
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        return this.f32110.f6092;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f9116 = (AbstractC20877) c20765.m46903(getReference());
    }
}
