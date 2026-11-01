package p067l;

/* JADX INFO: renamed from: l.ۚۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7296 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C21378 f19100;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC12224 f19101;

    @Override // p067l.AbstractC6462, p067l.InterfaceC7730
    public final String toString() {
        return "<ProxyType>";
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final AbstractC6462 m16846() {
        AbstractC12224 abstractC12224 = this.f19101;
        byte[] bArrMo5096 = abstractC12224.mo5096();
        int iMo5100 = abstractC12224.mo5100();
        int iMo5098 = abstractC12224.mo5098();
        C21378 c21378 = this.f19100;
        c21378.f67416 = bArrMo5096;
        c21378.f67418 = iMo5100;
        c21378.f67406 = iMo5100 + iMo5098;
        return c21378.m48450();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7296(C21378 c21378, int i) {
        super(c21378.f67412.f69157, C22082.f69463);
        this.f19100 = c21378;
        this.f19101 = c21378.f67409.m48603(i);
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫֫ */
    public final EnumC11353 mo5577() {
        return EnumC11353.NONE;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo3770(C22082 c22082) {
        throw new UnsupportedOperationException();
    }
}
