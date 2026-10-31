package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9053 extends AbstractC7872 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9053(AbstractC12725 abstractC12725, int i, Object obj, int i2) {
        super(abstractC12725, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        switch (this.s) {
            case 0:
                return new C7599(this, interfaceC0585, 0);
            case 1:
                return new C22458(this, interfaceC0585, 0);
            case 2:
                return new C5398(this, interfaceC0585, 0);
            case 3:
                return new C1955(this, interfaceC0585, 1);
            default:
                return new C1955(this, interfaceC0585, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9053(AbstractC11401 abstractC11401, Consumer consumer) {
        super(abstractC11401, 0);
        this.s = 3;
        this.t = consumer;
    }
}
