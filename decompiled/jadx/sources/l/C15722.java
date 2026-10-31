package l;

/* JADX INFO: renamed from: l.ܺۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 194T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15722 implements InterfaceC9415 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19916 f48493;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48494;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC4121 f48495;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9415 f48496;

    public C15722(AbstractC4121 abstractC4121, InterfaceC9415 interfaceC9415, boolean z) {
        byte[] bArr = C13997.f41722;
        abstractC4121.getClass();
        this.f48495 = abstractC4121;
        this.f48496 = interfaceC9415;
        this.f48494 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37102() {
        this.f48496 = null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC4121 m37103() {
        if (this.f48495 == null) {
            this.f48495 = (AbstractC4121) this.f48493.buildPartial();
        }
        return this.f48495;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4121 m37099() {
        this.f48494 = true;
        return m37103();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC19916 m37104() {
        if (this.f48493 == null) {
            AbstractC19916 abstractC19916 = (AbstractC19916) this.f48495.newBuilderForType(this);
            this.f48493 = abstractC19916;
            abstractC19916.mergeFrom((InterfaceC23338) this.f48495);
            this.f48493.markClean();
        }
        return this.f48493;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3583 m37101() {
        AbstractC19916 abstractC19916 = this.f48493;
        return abstractC19916 != null ? abstractC19916 : this.f48495;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37100(AbstractC4121 abstractC4121) {
        byte[] bArr = C13997.f41722;
        abstractC4121.getClass();
        this.f48495 = abstractC4121;
        AbstractC19916 abstractC19916 = this.f48493;
        if (abstractC19916 != null) {
            abstractC19916.dispose();
            this.f48493 = null;
        }
        m37097();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37098(AbstractC4121 abstractC4121) {
        if (this.f48493 == null) {
            InterfaceC23338 interfaceC23338 = this.f48495;
            if (interfaceC23338 == interfaceC23338.getDefaultInstanceForType()) {
                this.f48495 = abstractC4121;
            } else {
                m37104().mergeFrom((InterfaceC23338) abstractC4121);
            }
        } else {
            m37104().mergeFrom((InterfaceC23338) abstractC4121);
        }
        m37097();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m37097() {
        InterfaceC9415 interfaceC9415;
        if (this.f48493 != null) {
            this.f48495 = null;
        }
        if (!this.f48494 || (interfaceC9415 = this.f48496) == null) {
            return;
        }
        interfaceC9415.mo24254();
        this.f48494 = false;
    }

    @Override // l.InterfaceC9415
    /* JADX INFO: renamed from: ֫ */
    public final void mo24254() {
        m37097();
    }
}
