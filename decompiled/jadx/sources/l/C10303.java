package l;

/* JADX INFO: renamed from: l.ۤ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10303 extends C19961 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12399 f31036;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10303(C12399 c12399, C17013 c17013) {
        super(c17013);
        this.f31036 = c12399;
    }

    @Override // l.C19961, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11800(C9232 c9232, Object obj) {
        Void r9 = (Void) obj;
        C12419 c12419 = new C12419(c9232.f27940, c9232.f27944, (AbstractC12612) mo8690(c9232.f27945, r9), m46040(r9, c9232.f27947), c9232);
        c12419.f16085 = c9232.f16085;
        return c12419;
    }

    @Override // l.C19961, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5144 mo11800(C9232 c9232, Object obj) {
        Void r9 = (Void) obj;
        C12419 c12419 = new C12419(c9232.f27940, c9232.f27944, (AbstractC12612) mo8690(c9232.f27945, r9), m46040(r9, c9232.f27947), c9232);
        c12419.f16085 = c9232.f16085;
        return c12419;
    }

    @Override // l.C19961, l.InterfaceC12501
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C19110 mo6993(C19110 c19110, Void r10) {
        if (C7260.m19449(c19110)) {
            AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c19110.f60199, r10);
            C2609 c2609M46040 = m46040(r10, c19110.f60198);
            AbstractC12612 abstractC12613 = (AbstractC12612) mo8690(c19110.f60196, r10);
            C2609 c2609M46041 = m46040(r10, c19110.f60197);
            C17013 c17013 = this.f31036.f37342;
            c17013.f52172 = c19110.f16085;
            return c17013.m39939(abstractC12612, c2609M46040, abstractC12613, c2609M46041, (C5557) null, c19110.f60195 != null || c19110.m44037());
        }
        return super.mo6993(c19110, (Object) r10);
    }
}
