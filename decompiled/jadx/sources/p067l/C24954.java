package p067l;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.᩻ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24954 extends AbstractC9099 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ IntPredicate f79680s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24954(AbstractC8428 abstractC8428, int i, IntPredicate intPredicate) {
        super(abstractC8428, i);
        this.f79680s = intPredicate;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        return EnumC9335.ORDERED.m21660s(abstractC14463.f41316m) ? mo12124n0(abstractC14463, interfaceC16847, new C24933(25)).spliterator() : new C15625((InterfaceC20202) abstractC14463.mo25631h0(interfaceC16847), this.f79680s);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        return (InterfaceC7324) new C17481(this, abstractC11111, interfaceC16847, intFunction).invoke();
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        return new C8270(this, interfaceC2925);
    }
}
