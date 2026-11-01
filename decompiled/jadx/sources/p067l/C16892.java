package p067l;

/* JADX INFO: renamed from: l.ܶܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H86F */
/* JADX INFO: loaded from: classes5.dex */
public final class C16892 extends AbstractC3482 {

    /* JADX INFO: renamed from: ֫ */
    public volatile AbstractC10288 f50009;

    /* JADX INFO: renamed from: ۧ */
    public final C14271 f50010;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f50011;

    /* JADX INFO: renamed from: ܿ */
    public final C18020 f50012;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC16992 f50013;

    public C16892(InterfaceC19005 interfaceC19005, InterfaceC13601 interfaceC13601, C14271 c14271, C18020 c18020, InterfaceC16992 interfaceC16992, boolean z) {
        this.f50010 = c14271;
        this.f50012 = c18020;
        this.f50013 = interfaceC16992;
        this.f50011 = z;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        AbstractC10288 abstractC10288M32799 = this.f50009;
        if (abstractC10288M32799 == null) {
            abstractC10288M32799 = this.f50010.m32799(this.f50013, this.f50012);
            this.f50009 = abstractC10288M32799;
        }
        return abstractC10288M32799.mo5173(c18691);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        AbstractC10288 abstractC10288M32799 = this.f50009;
        if (abstractC10288M32799 == null) {
            abstractC10288M32799 = this.f50010.m32799(this.f50013, this.f50012);
            this.f50009 = abstractC10288M32799;
        }
        abstractC10288M32799.mo5174(c24726, obj);
    }

    @Override // p067l.AbstractC3482
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10288 mo6211() {
        AbstractC10288 abstractC10288 = this.f50009;
        if (abstractC10288 != null) {
            return abstractC10288;
        }
        AbstractC10288 abstractC10288M32799 = this.f50010.m32799(this.f50013, this.f50012);
        this.f50009 = abstractC10288M32799;
        return abstractC10288M32799;
    }
}
