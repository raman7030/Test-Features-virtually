package p067l;

/* JADX INFO: renamed from: l.ۨۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13273 extends C11532 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C11222 f37278;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13273(C11222 c11222, C18236 c18236) {
        super(c18236);
        this.f37278 = c11222;
    }

    @Override // p067l.C11532, p067l.InterfaceC19837
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12262 mo6575(InterfaceC12262 interfaceC12262) {
        if (interfaceC12262.mo4670() == 29) {
            InterfaceC23661 interfaceC23661 = (InterfaceC23661) interfaceC12262;
            C11222 c11222 = this.f37278;
            if (c11222.f31216.m13142(interfaceC23661.getType())) {
                return new C3845(c11222, this.f32166, interfaceC23661);
            }
        }
        return super.mo6575(interfaceC12262);
    }
}
