package p067l;

/* JADX INFO: renamed from: l.᩺۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C24244 extends C19532 {

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f76830;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24244() {
        super(true);
        boolean z = true;
        m44378((InterfaceC12175) null);
        InterfaceC17264 interfaceC17264M44383 = m44383();
        C4525 c4525 = interfaceC17264M44383 instanceof C4525 ? (C4525) interfaceC17264M44383 : null;
        if (c4525 == null) {
            z = false;
            break;
        }
        C19532 c19532M22099 = c4525.m22099();
        while (!c19532M22099.mo44381()) {
            InterfaceC17264 interfaceC17264M44384 = c19532M22099.m44383();
            C4525 c4526 = interfaceC17264M44384 instanceof C4525 ? (C4525) interfaceC17264M44384 : null;
            if (c4526 == null) {
                z = false;
                break;
            }
            c19532M22099 = c4526.m22099();
        }
        this.f76830 = z;
    }

    @Override // p067l.C19532
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo44381() {
        return this.f76830;
    }
}
