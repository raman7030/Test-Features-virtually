package p067l;

/* JADX INFO: renamed from: l.ۤ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12160 extends C21339 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14152 f33999;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12160(C14152 c14152, C18537 c18537) {
        super(c18537);
        this.f33999 = c14152;
    }

    @Override // p067l.C21339, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13736(C11142 c11142, Object obj) {
        Void r9 = (Void) obj;
        C14171 c14171 = new C14171(c11142.f30886, c11142.f30890, (AbstractC14355) mo10751(c11142.f30891, r9), m48354(r9, c11142.f30893), c11142);
        c14171.f18924 = c11142.f18924;
        return c14171;
    }

    @Override // p067l.C21339, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 mo13736(C11142 c11142, Object obj) {
        Void r9 = (Void) obj;
        C14171 c14171 = new C14171(c11142.f30886, c11142.f30890, (AbstractC14355) mo10751(c11142.f30891, r9), m48354(r9, c11142.f30893), c11142);
        c14171.f18924 = c11142.f18924;
        return c14171;
    }

    @Override // p067l.C21339, p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final C20530 mo9104(C20530 c20530, Void r10) {
        if (C9268.m21415(c20530)) {
            AbstractC14355 abstractC14355 = (AbstractC14355) mo10751(c20530.f63432, r10);
            C4848 c4848M48354 = m48354(r10, c20530.f63431);
            AbstractC14355 abstractC14356 = (AbstractC14355) mo10751(c20530.f63429, r10);
            C4848 c4848M48355 = m48354(r10, c20530.f63430);
            C18537 c18537 = this.f33999.f40357;
            c18537.f55352 = c20530.f18924;
            return c18537.m42182(abstractC14355, c4848M48354, abstractC14356, c4848M48355, (C7650) null, c20530.f63428 != null || c20530.m46331());
        }
        return super.mo9104(c20530, (Object) r10);
    }
}
