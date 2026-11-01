package p067l;

/* JADX INFO: renamed from: l.ۛۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7908 extends C8258 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C11222 f20735;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7908(C11222 c11222, C18236 c18236) {
        super(c18236);
        this.f20735 = c11222;
    }

    @Override // p067l.C8258, p067l.InterfaceC19837
    /* JADX INFO: renamed from: ֫ */
    public final C12282 mo6575(InterfaceC10509 interfaceC10509) {
        String type = interfaceC10509.getType();
        C11222 c11222 = this.f20735;
        c11222.f31215 = C11419.m26418(C11222.m25997(c11222, type));
        return new C12282(this, interfaceC10509);
    }
}
