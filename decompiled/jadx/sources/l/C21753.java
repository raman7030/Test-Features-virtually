package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩸ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21753 extends AbstractC24014 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21753(AbstractC12725 abstractC12725, int i, Object obj, int i2) {
        super(abstractC12725, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21753(AbstractC5670 abstractC5670, DoubleConsumer doubleConsumer) {
        super(abstractC5670, 0);
        this.s = 3;
        this.t = doubleConsumer;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C7599(this, interfaceC0585, 1);
            case 1:
                return new C15380(this, interfaceC0585);
            case 2:
                return new C7599(this, interfaceC0585, 4);
            case 3:
                return new C7599(this, interfaceC0585, 5);
            case 4:
                return new C22458(this, interfaceC0585, 4);
            case 5:
                return new C1955(this, interfaceC0585, 6);
            default:
                return new C15090(this, interfaceC0585);
        }
    }
}
