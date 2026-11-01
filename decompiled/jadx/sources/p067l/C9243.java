package p067l;

/* JADX INFO: renamed from: l.۟ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public class C9243 extends C3442 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C11216 f25063;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9243(C11216 c11216, InterfaceC6125 interfaceC6125) {
        super(interfaceC6125);
        this.f25063 = c11216;
    }

    @Override // p067l.C3442, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public boolean mo6100(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        InterfaceC6125 interfaceC6125 = this.f25063.f31163.f49905;
        InterfaceC6125 interfaceC6126 = this.f6876;
        return interfaceC6125.mo6100(interfaceC6126.mo6098().m4259(abstractC6462), interfaceC6126.mo6098().m4259(abstractC6463), c3686);
    }

    @Override // p067l.C3442, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public void mo3480(InterfaceC5323 interfaceC5323, C18258 c18258) {
        C8005 c8005 = this.f25063.f31159;
        C13370 c13370 = C13665.f38450;
        this.f6876.mo3480(interfaceC5323, c8005.m18543(new C13370("compiler", "incompatible.ret.type.in.lambda", c18258)));
    }
}
