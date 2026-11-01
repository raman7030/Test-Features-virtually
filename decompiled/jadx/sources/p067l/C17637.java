package p067l;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܺܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17637 extends AbstractC21921 {
    /* JADX INFO: renamed from: u0 */
    public static C13874 m40163u0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        C5827 c5827 = new C5827(7);
        C12789 c12789 = new C12789(2);
        C12789 c127810 = new C12789(3);
        C12826.requireNonNull(c5827);
        C12826.requireNonNull(c12789);
        C12826.requireNonNull(c127810);
        return new C13874((Collection) new C24262(EnumC10521.REFERENCE, c127810, c12789, c5827, 3).mo10393e(abstractC11111, interfaceC16847));
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC7324 mo12124n0(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847, IntFunction intFunction) {
        AbstractC14463 abstractC14463 = (AbstractC14463) abstractC11111;
        if (EnumC9335.DISTINCT.m21660s(abstractC14463.f41316m)) {
            return abstractC11111.mo25627Q(interfaceC16847, false, intFunction);
        }
        if (EnumC9335.ORDERED.m21660s(abstractC14463.f41316m)) {
            return m40163u0(abstractC11111, interfaceC16847);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768();
        C12233 c12233 = new C12233(5, atomicBoolean, concurrentMapC12768);
        C12826.requireNonNull(c12233);
        new C4898(c12233, false).m48868a(abstractC11111, interfaceC16847);
        Collection collectionKeySet = concurrentMapC12768.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new C13874(collectionKeySet);
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC16847 mo12125o0(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        if (EnumC9335.DISTINCT.m21660s(abstractC14463.f41316m)) {
            return abstractC14463.mo25631h0(interfaceC16847);
        }
        if (EnumC9335.ORDERED.m21660s(abstractC14463.f41316m)) {
            return m40163u0(abstractC14463, interfaceC16847).spliterator();
        }
        return new C13615(abstractC14463.mo25631h0(interfaceC16847), new ConcurrentMapC12768());
    }

    @Override // p067l.AbstractC14463
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2925 mo4008q0(int i, InterfaceC2925 interfaceC2925) {
        C12826.requireNonNull(interfaceC2925);
        if (EnumC9335.DISTINCT.m21660s(i)) {
            return interfaceC2925;
        }
        if (EnumC9335.SORTED.m21660s(i)) {
            return new C21506(interfaceC2925);
        }
        return new C4227(interfaceC2925);
    }
}
