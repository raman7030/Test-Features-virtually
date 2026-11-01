package p067l;

/* JADX INFO: renamed from: l.ۙ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6442 extends AbstractC21195 implements InterfaceC17787 {
    public C6442(long j, AbstractC12224 abstractC12224, C10485 c10485, AbstractC7783 abstractC7783) {
        super(EnumC3600.f7354, j, abstractC12224, c10485, abstractC7783);
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final EnumC24473 mo3347() {
        return EnumC24473.TYPE_PARAMETER;
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ۤ */
    public final C4848 mo9259() {
        C4848<C8552> c4848Mo18000 = this.f20407.mo18000();
        int iIndexOf = this.f20407.mo9257().indexOf(this);
        C4848 c4848M10283 = C4848.m10283();
        for (C8552 c8552 : c4848Mo18000) {
            C11827 c11827 = c8552.f53587;
            EnumC11275 enumC11275 = c11827.f33002;
            if (enumC11275 == EnumC11275.CLASS_TYPE_PARAMETER || enumC11275 == EnumC11275.METHOD_TYPE_PARAMETER) {
                if (c11827.f33005 == iIndexOf) {
                    c4848M10283 = c4848M10283.m10290(c8552);
                }
            }
        }
        return c4848M10283.m10294();
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        return abstractC10412.mo12427(this, obj);
    }
}
