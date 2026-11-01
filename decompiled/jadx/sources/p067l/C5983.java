package p067l;

import java.util.function.DoublePredicate;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۘ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5983 extends AbstractC3496 implements InterfaceC4486 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f14797s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ DoublePredicate f14798t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5983(AbstractC7758 abstractC7758, int i, DoublePredicate doublePredicate, int i2) {
        super(abstractC7758, i);
        this.f14797s = i2;
        this.f14798t = doublePredicate;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        switch (this.f14797s) {
            case 0:
                return EnumC9335.ORDERED.m21660s(abstractC14463.f41316m) ? mo12124n0(abstractC14463, interfaceC16847, new C24933(29)).spliterator() : new C9435((InterfaceC10124) abstractC14463.mo25631h0(interfaceC16847), this.f14798t);
            default:
                return EnumC9335.ORDERED.m21660s(abstractC14463.f41316m) ? mo12124n0(abstractC14463, interfaceC16847, new C6653()).spliterator() : new C23517((InterfaceC10124) abstractC14463.mo25631h0(interfaceC16847), this.f14798t);
        }
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        switch (this.f14797s) {
            case 0:
                return (InterfaceC7324) new C17481(this, abstractC11111, interfaceC16847, intFunction).invoke();
            default:
                return (InterfaceC7324) new C4071(this, abstractC11111, interfaceC16847, intFunction).invoke();
        }
    }

    @Override // p067l.InterfaceC4486
    /* JADX INFO: renamed from: d */
    public InterfaceC21251 mo9492d(InterfaceC10873 interfaceC10873, boolean z) {
        return new C12533(this, interfaceC10873, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        switch (this.f14797s) {
            case 0:
                return new C18052(this, interfaceC2925);
            default:
                return new C12533(this, interfaceC2925, false);
        }
    }
}
