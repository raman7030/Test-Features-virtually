package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7641 extends AbstractC1436 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7641(AbstractC12725 abstractC12725, int i, Object obj, int i2) {
        super(abstractC12725, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C22458(this, interfaceC0585, 1);
            case 1:
                return new C22458(this, interfaceC0585, 2);
            case 2:
                return new C13969(this, interfaceC0585);
            case 3:
                return new C22458(this, interfaceC0585, 5);
            case 4:
                return new C1955(this, interfaceC0585, 4);
            default:
                return new C9448(this, interfaceC0585);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7641(AbstractC6375 abstractC6375, IntConsumer intConsumer) {
        super(abstractC6375, 0);
        this.s = 0;
        this.t = intConsumer;
    }
}
