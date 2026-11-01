package p067l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩸ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23043 extends AbstractC25192 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f72426s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f72427t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23043(AbstractC14463 abstractC14463, int i, Object obj, int i2) {
        super(abstractC14463, i);
        this.f72426s = i2;
        this.f72427t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23043(AbstractC7758 abstractC7758, DoubleConsumer doubleConsumer) {
        super(abstractC7758, 0);
        this.f72426s = 3;
        this.f72427t = doubleConsumer;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f72426s) {
            case 0:
                return new C9591(this, interfaceC2925, 1);
            case 1:
                return new C16986(this, interfaceC2925);
            case 2:
                return new C9591(this, interfaceC2925, 4);
            case 3:
                return new C9591(this, interfaceC2925, 5);
            case 4:
                return new C23713(this, interfaceC2925, 4);
            case 5:
                return new C4227(this, interfaceC2925, 6);
            default:
                return new C16710(this, interfaceC2925);
        }
    }
}
