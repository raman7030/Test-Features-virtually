package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9631 extends AbstractC3734 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f26511s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f26512t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9631(AbstractC14463 abstractC14463, int i, Object obj, int i2) {
        super(abstractC14463, i);
        this.f26511s = i2;
        this.f26512t = obj;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f26511s) {
            case 0:
                return new C23713(this, interfaceC2925, 1);
            case 1:
                return new C23713(this, interfaceC2925, 2);
            case 2:
                return new C15645(this, interfaceC2925);
            case 3:
                return new C23713(this, interfaceC2925, 5);
            case 4:
                return new C4227(this, interfaceC2925, 4);
            default:
                return new C11348(this, interfaceC2925);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9631(AbstractC8428 abstractC8428, IntConsumer intConsumer) {
        super(abstractC8428, 0);
        this.f26511s = 0;
        this.f26512t = intConsumer;
    }
}
