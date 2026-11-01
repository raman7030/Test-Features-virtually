package p067l;

/* JADX INFO: renamed from: l.᩺ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24363 extends AbstractC25192 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f77142s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24363(AbstractC14463 abstractC14463, int i, int i2) {
        super(abstractC14463, i);
        this.f77142s = i2;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f77142s) {
            case 0:
                return interfaceC2925;
            case 1:
                return new C10953(1, interfaceC2925);
            case 2:
                return new C12193(interfaceC2925);
            default:
                return new C7499(this, interfaceC2925, 3);
        }
    }
}
