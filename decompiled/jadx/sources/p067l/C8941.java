package p067l;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۜܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8941 extends AbstractC21921 implements InterfaceC4486 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f24231s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Predicate f24232t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8941(AbstractC13204 abstractC13204, int i, Predicate predicate, int i2) {
        super(abstractC13204, i);
        this.f24231s = i2;
        this.f24232t = predicate;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        switch (this.f24231s) {
            case 0:
                return EnumC9335.ORDERED.m21660s(abstractC14463.f41316m) ? mo12124n0(abstractC14463, interfaceC16847, new C24933(11)).spliterator() : new C10282(abstractC14463.mo25631h0(interfaceC16847), this.f24232t, 1);
            default:
                return EnumC9335.ORDERED.m21660s(abstractC14463.f41316m) ? mo12124n0(abstractC14463, interfaceC16847, new C24933(11)).spliterator() : new C10282(abstractC14463.mo25631h0(interfaceC16847), this.f24232t, 0);
        }
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        switch (this.f24231s) {
            case 0:
                return (InterfaceC7324) new C17481(this, abstractC11111, interfaceC16847, intFunction).invoke();
            default:
                return (InterfaceC7324) new C4071(this, abstractC11111, interfaceC16847, intFunction).invoke();
        }
    }

    @Override // p067l.InterfaceC4486
    /* JADX INFO: renamed from: d */
    public InterfaceC21251 mo9492d(InterfaceC10873 interfaceC10873, boolean z) {
        return new C3576(this, interfaceC10873, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f24231s) {
            case 0:
                return new C21506(this, interfaceC2925);
            default:
                return new C3576(this, interfaceC2925, false);
        }
    }
}
