package p067l;

import java.util.function.IntFunction;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۗܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5487 extends AbstractC14029 implements InterfaceC4486 {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ LongPredicate f13131s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5487(AbstractC20580 abstractC20580, int i, LongPredicate longPredicate) {
        super(abstractC20580, i);
        this.f13131s = longPredicate;
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        return EnumC9335.ORDERED.m21660s(abstractC14463.f41316m) ? mo12124n0(abstractC14463, interfaceC16847, new C24933(28)).spliterator() : new C17006((InterfaceC2766) abstractC14463.mo25631h0(interfaceC16847), this.f13131s);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        return (InterfaceC7324) new C4071(this, abstractC11111, interfaceC16847, intFunction).invoke();
    }

    @Override // p067l.InterfaceC4486
    /* JADX INFO: renamed from: d */
    public final InterfaceC21251 mo9492d(InterfaceC10873 interfaceC10873, boolean z) {
        return new C20240(this, interfaceC10873, z);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        return new C20240(this, interfaceC2925, false);
    }
}
