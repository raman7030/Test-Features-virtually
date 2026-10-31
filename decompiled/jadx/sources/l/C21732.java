package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21732 extends AbstractC17044 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21732(AbstractC12725 abstractC12725, int i, Object obj, int i2) {
        super(abstractC12725, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C22458(this, interfaceC0585, 3);
            case 1:
                return new C5398(this, interfaceC0585, 1);
            case 2:
                return new C14385(this, interfaceC0585);
            case 3:
                return new C5398(this, interfaceC0585, 4);
            case 4:
                return new C5398(this, interfaceC0585, 5);
            case 5:
                return new C8926(this, interfaceC0585);
            default:
                return new C1955(this, interfaceC0585, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21732(AbstractC19162 abstractC19162, LongConsumer longConsumer) {
        super(abstractC19162, 0);
        this.s = 4;
        this.t = longConsumer;
    }
}
