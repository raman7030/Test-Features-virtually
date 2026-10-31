package l;

/* JADX INFO: renamed from: l.᩺ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23142 extends AbstractC24014 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23142(AbstractC12725 abstractC12725, int i, int i2) {
        super(abstractC12725, i);
        this.s = i2;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return interfaceC0585;
            case 1:
                return new C9032(1, interfaceC0585);
            case 2:
                return new C10337(interfaceC0585);
            default:
                return new C5398(this, interfaceC0585, 3);
        }
    }
}
