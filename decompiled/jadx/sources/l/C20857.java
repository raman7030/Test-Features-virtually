package l;

import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20857 {
    @SafeVarargs
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m47676(InterfaceC17664... interfaceC17664Arr) {
        C1846 c1846 = new C1846(interfaceC17664Arr.length);
        long j = 0;
        int iCharacteristics = 336;
        boolean zIsParallel = false;
        for (InterfaceC17664 interfaceC17664 : interfaceC17664Arr) {
            zIsParallel |= interfaceC17664.isParallel();
            InterfaceC15234 interfaceC15234Spliterator = interfaceC17664.spliterator();
            c1846.m16262((Object) interfaceC15234Spliterator);
            iCharacteristics &= interfaceC15234Spliterator.characteristics();
            long jEstimateSize = interfaceC15234Spliterator.estimateSize();
            long j2 = j + jEstimateSize;
            j = (((jEstimateSize ^ j) > 0L ? 1 : ((jEstimateSize ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j2) >= 0) ? j2 : ((j2 >>> 63) ^ 1) + C13132.FOREVER_NS;
        }
        AbstractC14545 abstractC14545M6131 = c1846.m6131();
        abstractC14545M6131.getClass();
        InterfaceC15234 interfaceC15234Spliterator2 = C22291.spliterator(abstractC14545M6131, 1296);
        C7033 c7033 = new C7033(4);
        interfaceC15234Spliterator2.getClass();
        return (InterfaceC17664) C14841.stream(new C12888(null, interfaceC15234Spliterator2, c7033, iCharacteristics, j), zIsParallel).onClose(new RunnableC16622(0, interfaceC17664Arr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16646 m47674(InterfaceC17664 interfaceC17664) {
        InterfaceC15234 interfaceC15234TrySplit;
        final C17328 c17328 = new C17328();
        c17328.f53076 = false;
        c17328.f53077 = null;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(interfaceC17664.spliterator());
        while (!arrayDeque.isEmpty()) {
            InterfaceC15234 interfaceC15234 = (InterfaceC15234) arrayDeque.removeLast();
            if (interfaceC15234.getExactSizeIfKnown() != 0) {
                if (interfaceC15234.hasCharacteristics(16384)) {
                    do {
                        interfaceC15234TrySplit = interfaceC15234.trySplit();
                        if (interfaceC15234TrySplit == null || interfaceC15234TrySplit.getExactSizeIfKnown() == 0) {
                        }
                        interfaceC15234.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void n(Object obj) {
                                C17328 c17329 = c17328;
                                c17329.f53076 = true;
                                c17329.f53077 = obj;
                            }
                        });
                        Object obj = c17328.f53077;
                        C11003.requireNonNull(obj);
                        return C16646.of(obj);
                    } while (interfaceC15234.getExactSizeIfKnown() != 0);
                    interfaceC15234 = interfaceC15234TrySplit;
                    interfaceC15234.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj2) {
                            C17328 c17329 = c17328;
                            c17329.f53076 = true;
                            c17329.f53077 = obj2;
                        }
                    });
                    Object obj2 = c17328.f53077;
                    C11003.requireNonNull(obj2);
                    return C16646.of(obj2);
                }
                InterfaceC15234 interfaceC15234TrySplit2 = interfaceC15234.trySplit();
                if (interfaceC15234TrySplit2 == null || interfaceC15234TrySplit2.getExactSizeIfKnown() == 0) {
                    interfaceC15234.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj3) {
                            C17328 c17329 = c17328;
                            c17329.f53076 = true;
                            c17329.f53077 = obj3;
                        }
                    });
                    if (c17328.f53076) {
                        Object obj3 = c17328.f53077;
                        C11003.requireNonNull(obj3);
                        return C16646.of(obj3);
                    }
                } else {
                    arrayDeque.addLast(interfaceC15234TrySplit2);
                    arrayDeque.addLast(interfaceC15234);
                }
            }
        }
        return C16646.empty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m47675(InterfaceC17664 interfaceC17664, C2144 c2144) {
        interfaceC17664.getClass();
        boolean zIsParallel = interfaceC17664.isParallel();
        InterfaceC15234 interfaceC15234Spliterator = interfaceC17664.spliterator();
        if (!interfaceC15234Spliterator.hasCharacteristics(16384)) {
            return (InterfaceC17664) C14841.stream(new C23678(interfaceC15234Spliterator.estimateSize(), interfaceC15234Spliterator.characteristics() & 80, C22291.iterator(interfaceC15234Spliterator), c2144), zIsParallel).onClose(new RunnableC5622(3, interfaceC17664));
        }
        return (InterfaceC17664) C14841.stream(new C14505(interfaceC15234Spliterator, 0L, c2144), zIsParallel).onClose(new RunnableC5622(3, interfaceC17664));
    }
}
