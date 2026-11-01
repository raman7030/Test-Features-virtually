package p067l;

/* JADX INFO: renamed from: l.ܶۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16800 implements InterfaceC6125 {

    /* JADX INFO: renamed from: ֫ */
    public C8788 f49524;

    /* JADX INFO: renamed from: ۧ */
    public C3686 f49525;

    /* JADX INFO: renamed from: ܽ */
    public boolean f49526;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C23663 f49527;

    public final String toString() {
        return "MethodCheckContext";
    }

    public AbstractC16800(C23663 c23663, boolean z, C8788 c8788, C3686 c3686) {
        this.f49527 = c23663;
        this.f49526 = z;
        this.f49524 = c8788;
        this.f49525 = c3686;
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public boolean mo6100(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        C2733 c2733 = this.f49524.f23843;
        boolean z = this.f49526;
        C23663 c23663 = this.f49527;
        if (z) {
            return c23663.f75323.m19491(c2733.m4259(abstractC6462), c2733.m4259(abstractC6463), c3686);
        }
        return c23663.f75323.m19496(c2733.m4259(abstractC6462), c2733.m4259(abstractC6463), c3686);
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public void mo3480(InterfaceC5323 interfaceC5323, C18258 c18258) {
        throw new C24848(c18258);
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final C3686 mo6099(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        return this.f49525;
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final C2733 mo6098() {
        return this.f49524.f23843;
    }

    @Override // p067l.InterfaceC6125
    /* JADX INFO: renamed from: ۧ */
    public final C8788 mo6101() {
        return this.f49524;
    }
}
