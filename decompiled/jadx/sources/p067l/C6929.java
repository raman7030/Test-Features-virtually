package p067l;

/* JADX INFO: renamed from: l.ۙܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C6929 extends AbstractC4838 {

    /* JADX INFO: renamed from: c */
    public final Object f18032c;

    public C6929(InterfaceC24758 interfaceC24758, Object obj) {
        super(interfaceC24758);
        this.f18032c = obj;
    }

    public C6929(C6929 c6929, InterfaceC24758 interfaceC24758, int i) {
        super(c6929, interfaceC24758, i);
        this.f18032c = c6929.f18032c;
    }

    @Override // p067l.AbstractC4838
    /* JADX INFO: renamed from: b */
    public final AbstractC4838 mo10265b(int i, int i2) {
        return new C6929(this, ((InterfaceC24758) this.f11003a).mo3496a(i), i2);
    }

    @Override // p067l.AbstractC4838
    /* JADX INFO: renamed from: a */
    public final void mo10264a() {
        ((InterfaceC24758) this.f11003a).mo4232e(this.f11004b, this.f18032c);
    }
}
