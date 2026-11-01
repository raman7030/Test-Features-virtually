package p067l;

/* JADX INFO: renamed from: l.ܰᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15665 extends AbstractC3734 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f44794s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15665(AbstractC14463 abstractC14463, int i, int i2) {
        super(abstractC14463, i);
        this.f44794s = i2;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f44794s) {
            case 0:
                return new C9591(this, interfaceC2925, 2);
            case 1:
                return interfaceC2925;
            default:
                return new C7499(this, interfaceC2925, 2);
        }
    }
}
