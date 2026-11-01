package p067l;

/* JADX INFO: renamed from: l.ܺۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17314 extends AbstractC14355 implements InterfaceC17900 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC7257 f51641;

    /* JADX INFO: renamed from: ۬ */
    public C20669 f51642;

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3821(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        int i = C18378.f54884[this.f51642.f63851.ordinal()];
        if (i == 1) {
            return EnumC5532.UNBOUNDED_WILDCARD;
        }
        if (i == 2) {
            return EnumC5532.EXTENDS_WILDCARD;
        }
        if (i == 3) {
            return EnumC5532.SUPER_WILDCARD;
        }
        throw new AssertionError("Unknown wildcard bound " + this.f51642);
    }

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13753(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60724;
    }
}
