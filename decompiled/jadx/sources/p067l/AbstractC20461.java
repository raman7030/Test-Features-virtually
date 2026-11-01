package p067l;

/* JADX INFO: renamed from: l.ᩴ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20461 extends AbstractC5038 {

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC13575 f63197;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16436 f63198;

    public AbstractC20461(InterfaceC13575 interfaceC13575, InterfaceC16436 interfaceC16436) {
        super(interfaceC13575);
        this.f63198 = interfaceC16436;
    }

    public AbstractC20461(InterfaceC13575 interfaceC13575) {
        this(interfaceC13575, interfaceC13575 != null ? interfaceC13575.getContext() : null);
    }

    @Override // p067l.InterfaceC13575
    public InterfaceC16436 getContext() {
        InterfaceC16436 interfaceC16436 = this.f63198;
        C13045.m29861(interfaceC16436);
        return interfaceC16436;
    }

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC13575 m46156() {
        InterfaceC13575 interfaceC13575Mo11133 = this.f63197;
        if (interfaceC13575Mo11133 == null) {
            InterfaceC9551 interfaceC9551 = (InterfaceC9551) getContext().mo11134(InterfaceC9551.f26257);
            interfaceC13575Mo11133 = interfaceC9551 != null ? interfaceC9551.mo11133(this) : this;
            this.f63197 = interfaceC13575Mo11133;
        }
        return interfaceC13575Mo11133;
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ᩻ */
    public void mo10748() {
        InterfaceC13575 interfaceC13575 = this.f63197;
        if (interfaceC13575 != null && interfaceC13575 != this) {
            InterfaceC19790 interfaceC19790Mo11134 = getContext().mo11134(InterfaceC9551.f26257);
            C13045.m29861(interfaceC19790Mo11134);
            ((InterfaceC9551) interfaceC19790Mo11134).mo11135(interfaceC13575);
        }
        this.f63197 = C6379.f16506;
    }
}
