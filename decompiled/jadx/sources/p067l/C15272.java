package p067l;

/* JADX INFO: renamed from: l.ܰۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15272 extends AbstractC5254 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3913 f43585;

    public C15272(AbstractC19709 abstractC19709) {
        super(0);
        this.f43585 = abstractC19709;
    }

    public C15272(InterfaceC3913 interfaceC3913, int i, int i2) {
        super(i, i2);
        this.f43585 = interfaceC3913;
    }

    @Override // p067l.AbstractC5254
    /* JADX INFO: renamed from: ۧ */
    public final int mo11329() {
        return this.f43585.size();
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f43585.get(i);
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C15272(this.f43585, i, i2);
    }
}
