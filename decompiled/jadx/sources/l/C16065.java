package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܺܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16065 extends AbstractC20573 {
    public static C12106 u0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        C3639 c3639 = new C3639(7);
        C10964 c10964 = new C10964(2);
        C10964 c10965 = new C10964(3);
        C11003.requireNonNull(c3639);
        C11003.requireNonNull(c10964);
        C11003.requireNonNull(c10965);
        return new C12106((Collection) new C23036(EnumC8578.REFERENCE, c10965, c10964, c3639, 3).e(abstractC9198, interfaceC15234));
    }

    @Override // l.AbstractC12725
    public final InterfaceC5214 n0(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234, IntFunction intFunction) {
        AbstractC12725 abstractC12725 = (AbstractC12725) abstractC9198;
        if (EnumC7330.DISTINCT.s(abstractC12725.m)) {
            return abstractC9198.Q(interfaceC15234, false, intFunction);
        }
        if (EnumC7330.ORDERED.s(abstractC12725.m)) {
            return u0(abstractC9198, interfaceC15234);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        C10379 c10379 = new C10379(5, atomicBoolean, concurrentMapC10942);
        C11003.requireNonNull(c10379);
        new C2661(c10379, false).a(abstractC9198, interfaceC15234);
        Collection collectionKeySet = concurrentMapC10942.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new C12106(collectionKeySet);
    }

    @Override // l.AbstractC12725
    public final InterfaceC15234 o0(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        if (EnumC7330.DISTINCT.s(abstractC12725.m)) {
            return abstractC12725.h0(interfaceC15234);
        }
        if (EnumC7330.ORDERED.s(abstractC12725.m)) {
            return u0(abstractC12725, interfaceC15234).spliterator();
        }
        return new C11833(abstractC12725.h0(interfaceC15234), new ConcurrentMapC10942());
    }

    @Override // l.AbstractC12725
    public final InterfaceC0585 q0(int i, InterfaceC0585 interfaceC0585) {
        C11003.requireNonNull(interfaceC0585);
        if (EnumC7330.DISTINCT.s(i)) {
            return interfaceC0585;
        }
        if (EnumC7330.SORTED.s(i)) {
            return new C20136(interfaceC0585);
        }
        return new C1955(interfaceC0585);
    }
}
