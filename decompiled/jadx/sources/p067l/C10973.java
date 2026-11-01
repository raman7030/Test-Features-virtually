package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10973 extends AbstractC9850 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f30391s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f30392t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10973(AbstractC14463 abstractC14463, int i, Object obj, int i2) {
        super(abstractC14463, i);
        this.f30391s = i2;
        this.f30392t = obj;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f30391s) {
            case 0:
                return new C9591(this, interfaceC2925, 0);
            case 1:
                return new C23713(this, interfaceC2925, 0);
            case 2:
                return new C7499(this, interfaceC2925, 0);
            case 3:
                return new C4227(this, interfaceC2925, 1);
            default:
                return new C4227(this, interfaceC2925, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10973(AbstractC13204 abstractC13204, Consumer consumer) {
        super(abstractC13204, 0);
        this.f30391s = 3;
        this.f30392t = consumer;
    }
}
