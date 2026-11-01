package p067l;

/* JADX INFO: renamed from: l.ۢܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11624 extends AbstractC18567 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f32443s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11624(AbstractC14463 abstractC14463, int i, int i2) {
        super(abstractC14463, i);
        this.f32443s = i2;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f32443s) {
            case 0:
                return new C9591(this, interfaceC2925, 3);
            case 1:
                return new C10953(0, interfaceC2925);
            default:
                return interfaceC2925;
        }
    }
}
