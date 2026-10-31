package l;

/* JADX INFO: renamed from: l.۟ۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public class C7234 extends C1130 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f22180;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7234(C9310 c9310, InterfaceC3953 interfaceC3953) {
        super(interfaceC3953);
        this.f22180 = c9310;
    }

    @Override // l.C1130, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        InterfaceC3953 interfaceC3953 = this.f22180.f28214.f46781;
        InterfaceC3953 interfaceC3954 = this.f4107;
        return interfaceC3953.mo3859(interfaceC3954.mo3857().m1868(abstractC4308), interfaceC3954.mo3857().m1868(abstractC4309), c1386);
    }

    @Override // l.C1130, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public void mo1084(InterfaceC3109 interfaceC3109, C16719 c16719) {
        C5931 c5931 = this.f22180.f28210;
        C11576 c11576 = C11886.f35440;
        this.f4107.mo1084(interfaceC3109, c5931.m16617(new C11576("compiler", "incompatible.ret.type.in.lambda", c16719)));
    }
}
