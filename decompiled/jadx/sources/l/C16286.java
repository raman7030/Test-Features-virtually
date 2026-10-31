package l;

/* JADX INFO: renamed from: l.ܽ֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C16286 extends AbstractC12612 implements InterfaceC5946 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f50075;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f50076;

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1410(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return EnumC3329.INSTANCE_OF;
    }

    public final InterfaceC13206 getType() {
        AbstractC5144 abstractC5144 = this.f50076;
        if (!(abstractC5144 instanceof AbstractC21932)) {
            return abstractC5144;
        }
        if (abstractC5144.m14709(EnumC18550.f57504)) {
            return ((C16139) this.f50076).f49721.f28488;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21932 m38309() {
        AbstractC5144 abstractC5144 = this.f50076;
        if (abstractC5144 instanceof AbstractC21932) {
            return (AbstractC21932) abstractC5144;
        }
        return null;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11819(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57480;
    }
}
