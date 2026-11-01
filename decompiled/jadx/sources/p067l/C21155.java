package p067l;

/* JADX INFO: renamed from: l.᩵᩺֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4WX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21155 extends AbstractC11508 implements InterfaceC2717, InterfaceC3132 {

    /* JADX INFO: renamed from: ۗ */
    public int f66464;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC20877 f66465;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        throw null;
    }

    public C21155(C14645 c14645, EnumC3167 enumC3167, int i) {
        super(c14645, enumC3167, i);
        this.f66465 = null;
        this.f66464 = -1;
    }

    @Override // p067l.InterfaceC2717
    /* JADX INFO: renamed from: ᩵ */
    public final int mo4220() {
        return this.f32111.m33504().m13862(this.f32112 + 1) & 63;
    }

    @Override // p067l.InterfaceC12777
    public final InterfaceC10250 getReference() {
        AbstractC20877 abstractC20877 = this.f66465;
        if (abstractC20877 != null) {
            return abstractC20877;
        }
        C14645 c14645 = this.f32111;
        int iM13856 = c14645.m33504().m13856(this.f32112 + 2);
        try {
            return AbstractC4406.m9164(c14645, mo5880(), iM13856);
        } catch (C16578 e) {
            return new C20484(e, iM13856);
        }
    }

    @Override // p067l.InterfaceC12777
    /* JADX INFO: renamed from: ֡ */
    public final int mo5880() {
        int i = this.f66464;
        if (i != -1) {
            return i;
        }
        int iM13862 = (this.f32111.m33504().m13862(this.f32112 + 1) >>> 6) + 1;
        if (iM13862 < 0 || iM13862 > 4) {
            throw new C16578(iM13862);
        }
        this.f66464 = iM13862;
        return iM13862;
    }

    @Override // p067l.InterfaceC3132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5343(C20765 c20765) {
        this.f66465 = (AbstractC20877) c20765.m46903(getReference());
    }
}
