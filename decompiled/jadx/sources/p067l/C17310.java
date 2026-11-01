package p067l;

/* JADX INFO: renamed from: l.ܺۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 194T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17310 implements InterfaceC11316 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC21296 f51633;

    /* JADX INFO: renamed from: ۧ */
    public boolean f51634;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC6285 f51635;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC11316 f51636;

    public C17310(AbstractC6285 abstractC6285, InterfaceC11316 interfaceC11316, boolean z) {
        byte[] bArr = C15671.f44805;
        abstractC6285.getClass();
        this.f51635 = abstractC6285;
        this.f51636 = interfaceC11316;
        this.f51634 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39271() {
        this.f51636 = null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC6285 m39272() {
        if (this.f51635 == null) {
            this.f51635 = (AbstractC6285) this.f51633.buildPartial();
        }
        return this.f51635;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6285 m39268() {
        this.f51634 = true;
        return m39272();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC21296 m39273() {
        if (this.f51633 == null) {
            AbstractC21296 abstractC21296 = (AbstractC21296) this.f51635.newBuilderForType(this);
            this.f51633 = abstractC21296;
            abstractC21296.mergeFrom((InterfaceC24548) this.f51635);
            this.f51633.markClean();
        }
        return this.f51633;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC5773 m39270() {
        AbstractC21296 abstractC21296 = this.f51633;
        return abstractC21296 != null ? abstractC21296 : this.f51635;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39269(AbstractC6285 abstractC6285) {
        byte[] bArr = C15671.f44805;
        abstractC6285.getClass();
        this.f51635 = abstractC6285;
        AbstractC21296 abstractC21296 = this.f51633;
        if (abstractC21296 != null) {
            abstractC21296.dispose();
            this.f51633 = null;
        }
        m39266();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: ֫ */
    public final void m39267(AbstractC6285 abstractC6285) {
        if (this.f51633 == null) {
            InterfaceC24548 interfaceC24548 = this.f51635;
            if (interfaceC24548 == interfaceC24548.getDefaultInstanceForType()) {
                this.f51635 = abstractC6285;
            } else {
                m39273().mergeFrom((InterfaceC24548) abstractC6285);
            }
        } else {
            m39273().mergeFrom((InterfaceC24548) abstractC6285);
        }
        m39266();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m39266() {
        InterfaceC11316 interfaceC11316;
        if (this.f51633 != null) {
            this.f51635 = null;
        }
        if (!this.f51634 || (interfaceC11316 = this.f51636) == null) {
            return;
        }
        interfaceC11316.mo26264();
        this.f51634 = false;
    }

    @Override // p067l.InterfaceC11316
    /* JADX INFO: renamed from: ֫ */
    public final void mo26264() {
        m39266();
    }
}
