package p067l;

/* JADX INFO: renamed from: l.ܳ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C16366 extends AbstractC14355 implements InterfaceC15414 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC14355 f48092;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC14355 f48093;

    public C16366(AbstractC14355 abstractC14355, AbstractC14355 abstractC14356) {
        this.f48093 = abstractC14355;
        this.f48092 = abstractC14356;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3817(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.ARRAY_ACCESS;
    }

    @Override // p067l.InterfaceC15414
    public final AbstractC14355 getExpression() {
        return this.f48093;
    }

    @Override // p067l.InterfaceC15414
    public final AbstractC14355 getIndex() {
        return this.f48092;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13749(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60759;
    }
}
