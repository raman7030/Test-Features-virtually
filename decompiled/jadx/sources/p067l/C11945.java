package p067l;

/* JADX INFO: renamed from: l.ۤۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C11945 extends AbstractC6580 {

    /* JADX INFO: renamed from: ۨ */
    public C4848 f33323;

    public C11945(AbstractC6462 abstractC6462, C4848 c4848) {
        super(EnumC11353.FORALL, (C12497) abstractC6462);
        this.f33323 = c4848;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo3770(C22082 c22082) {
        throw new AssertionError("Cannot add metadata to a forall type");
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5291(InterfaceC22556 interfaceC22556, Object obj) {
        return interfaceC22556.mo5083(this, obj);
    }

    @Override // p067l.AbstractC6580, p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m14775(sb, false);
        sb.append('<');
        sb.append(this.f33323);
        sb.append('>');
        sb.append(this.f16992);
        return sb.toString();
    }

    @Override // p067l.AbstractC6580, p067l.AbstractC6462
    /* JADX INFO: renamed from: ܽ֫ */
    public final C4848 mo14802() {
        return this.f33323;
    }

    @Override // p067l.AbstractC6580, p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo14812() {
        return this.f16992.mo14812();
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14776(AbstractC6462 abstractC6462) {
        return this.f16992.mo14776(abstractC6462);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ᩹ */
    public final C12497 mo14809() {
        return (C12497) this.f16992;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo14782() {
        for (C4848 c4848 = this.f33323; c4848.m10293(); c4848 = c4848.f11035) {
            ((C10485) c4848.f11034).mo14803().mo14782();
        }
        this.f16992.mo14782();
    }

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3035 mo5575() {
        return EnumC3035.EXECUTABLE;
    }
}
