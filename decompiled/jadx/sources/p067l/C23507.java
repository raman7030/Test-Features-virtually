package p067l;

/* JADX INFO: renamed from: l.᩹ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C23507 extends AbstractC16800 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C21496 f74899;

    /* JADX INFO: renamed from: ܿ */
    public EnumC22837 f74900;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23507(C21496 c21496, boolean z, C8788 c8788, C3686 c3686, boolean z2) {
        super(c21496.f67801, z, c8788, c3686);
        this.f74899 = c21496;
        this.f74900 = z2 ? EnumC22837.VARARG_MISMATCH : EnumC22837.ARG_MISMATCH;
    }

    @Override // p067l.AbstractC16800, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6100(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        C21496 c21496 = this.f74899;
        AbstractC6462 abstractC6462M4259 = c21496.f67800.m4259(abstractC6462);
        if (abstractC6462M4259.m14777(EnumC11353.UNDETVAR) && abstractC6463.mo14805()) {
            abstractC6463 = c21496.f67801.f75323.m19436(abstractC6463).f20406;
        }
        return super.mo6100(abstractC6462M4259, abstractC6463, c3686);
    }

    @Override // p067l.AbstractC16800, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final void mo3480(InterfaceC5323 interfaceC5323, C18258 c18258) {
        this.f74899.m27162(interfaceC5323, this.f74900, this.f49524.f23843, c18258);
        throw null;
    }
}
