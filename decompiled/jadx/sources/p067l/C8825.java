package p067l;

/* JADX INFO: renamed from: l.ۜܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D4MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8825 extends AbstractC11508 implements InterfaceC22321, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC20877 f23960;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20877 f23961;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ String mo4188() {
        throw null;
    }

    public C8825(C14645 c14645, EnumC3167 enumC3167, int i) {
        super(c14645, enumC3167, i);
        this.f23961 = null;
        this.f23960 = null;
    }

    @Override // p067l.InterfaceC8753
    /* JADX INFO: renamed from: ᩻ */
    public final int mo5886() {
        return this.f32111.m33504().m13862(this.f32112 + 1);
    }

    @Override // p067l.InterfaceC18140
    /* JADX INFO: renamed from: ᩴ */
    public final int mo11756() {
        return this.f32111.m33504().m13856(this.f32112 + 4);
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        AbstractC20877 abstractC20877 = this.f23961;
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

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC10250 mo11754() {
        AbstractC20877 abstractC20877 = this.f23960;
        if (abstractC20877 != null) {
            return abstractC20877;
        }
        int i = this.f32110.f6091;
        C14645 c14645 = this.f32111;
        return AbstractC4406.m9164(c14645, i, c14645.m33504().m13856(this.f32112 + 6));
    }

    @Override // p067l.InterfaceC14532
    /* JADX INFO: renamed from: ۠ */
    public final int mo11755() {
        return this.f32110.f6091;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f23961 = (AbstractC20877) c20765.m46903(getReference());
        this.f23960 = (AbstractC20877) c20765.m46903(mo11754());
    }
}
