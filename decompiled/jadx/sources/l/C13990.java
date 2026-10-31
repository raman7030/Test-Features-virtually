package l;

/* JADX INFO: renamed from: l.ܰᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13990 extends AbstractC1436 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13990(AbstractC12725 abstractC12725, int i, int i2) {
        super(abstractC12725, i);
        this.s = i2;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C7599(this, interfaceC0585, 2);
            case 1:
                return interfaceC0585;
            default:
                return new C5398(this, interfaceC0585, 2);
        }
    }
}
