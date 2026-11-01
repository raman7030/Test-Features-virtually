package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23023 extends AbstractC18567 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f72403s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f72404t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23023(AbstractC14463 abstractC14463, int i, Object obj, int i2) {
        super(abstractC14463, i);
        this.f72403s = i2;
        this.f72404t = obj;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f72403s) {
            case 0:
                return new C23713(this, interfaceC2925, 3);
            case 1:
                return new C7499(this, interfaceC2925, 1);
            case 2:
                return new C16040(this, interfaceC2925);
            case 3:
                return new C7499(this, interfaceC2925, 4);
            case 4:
                return new C7499(this, interfaceC2925, 5);
            case 5:
                return new C10852(this, interfaceC2925);
            default:
                return new C4227(this, interfaceC2925, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23023(AbstractC20580 abstractC20580, LongConsumer longConsumer) {
        super(abstractC20580, 0);
        this.f72403s = 4;
        this.f72404t = longConsumer;
    }
}
