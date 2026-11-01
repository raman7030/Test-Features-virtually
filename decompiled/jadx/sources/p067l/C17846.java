package p067l;

/* JADX INFO: renamed from: l.ܽ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17846 extends AbstractC14355 implements InterfaceC8019 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC14355 f53242;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC7257 f53243;

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3823(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return EnumC5532.INSTANCE_OF;
    }

    public final InterfaceC14919 getType() {
        AbstractC7257 abstractC7257 = this.f53243;
        if (!(abstractC7257 instanceof AbstractC23212)) {
            return abstractC7257;
        }
        if (abstractC7257.m16617(EnumC19998.f60728)) {
            return ((C17707) this.f53243).f52887.f31437;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final AbstractC23212 m40523() {
        AbstractC7257 abstractC7257 = this.f53243;
        if (abstractC7257 instanceof AbstractC23212) {
            return (AbstractC23212) abstractC7257;
        }
        return null;
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13755(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60704;
    }
}
