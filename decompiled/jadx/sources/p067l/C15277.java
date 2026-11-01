package p067l;

/* JADX INFO: renamed from: l.ܰۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15277 extends C9243 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f43599;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C11216 f43600;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC14355 f43601;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15277(C11216 c11216, AbstractC14355 abstractC14355, InterfaceC6125 interfaceC6125) {
        super(c11216, interfaceC6125);
        this.f43600 = c11216;
        this.f43601 = abstractC14355;
    }

    @Override // p067l.C9243, p067l.C3442, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final void mo3480(InterfaceC5323 interfaceC5323, C18258 c18258) {
        if (this.f43599) {
            this.f6876.mo3480(interfaceC5323, this.f43600.f31159.m18543(C13665.f38484));
        } else {
            super.mo3480(interfaceC5323, c18258);
        }
    }

    @Override // p067l.C9243, p067l.C3442, p067l.InterfaceC6125
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6100(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C3686 c3686) {
        if (abstractC6463.m14777(EnumC11353.VOID)) {
            this.f43599 = true;
            return C9268.m21413(this.f43601);
        }
        return super.mo6100(abstractC6462, abstractC6463, c3686);
    }
}
