package p067l;

import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final class C22191 {
    @SafeVarargs
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC19157 m50004(InterfaceC19157... interfaceC19157Arr) {
        C4123 c4123 = new C4123(interfaceC19157Arr.length);
        long j = 0;
        int iCharacteristics = 336;
        boolean zIsParallel = false;
        for (InterfaceC19157 interfaceC19157 : interfaceC19157Arr) {
            zIsParallel |= interfaceC19157.isParallel();
            InterfaceC16847 interfaceC16847Spliterator = interfaceC19157.spliterator();
            c4123.m18182((Object) interfaceC16847Spliterator);
            iCharacteristics &= interfaceC16847Spliterator.characteristics();
            long jEstimateSize = interfaceC16847Spliterator.estimateSize();
            long j2 = j + jEstimateSize;
            j = (((jEstimateSize ^ j) > 0L ? 1 : ((jEstimateSize ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j2) >= 0) ? j2 : ((j2 >>> 63) ^ 1) + C14849.FOREVER_NS;
        }
        AbstractC16192 abstractC16192M8329 = c4123.m8329();
        abstractC16192M8329.getClass();
        InterfaceC16847 interfaceC16847Spliterator2 = C23554.spliterator(abstractC16192M8329, 1296);
        C9053 c9053 = new C9053(4);
        interfaceC16847Spliterator2.getClass();
        return (InterfaceC19157) C16474.stream(new C14617(null, interfaceC16847Spliterator2, c9053, iCharacteristics, j), zIsParallel).onClose(new RunnableC18166(0, interfaceC19157Arr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18189 m50002(InterfaceC19157 interfaceC19157) {
        InterfaceC16847 interfaceC16847TrySplit;
        final C18837 c18837 = new C18837();
        c18837.f56258 = false;
        c18837.f56259 = null;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(interfaceC19157.spliterator());
        while (!arrayDeque.isEmpty()) {
            InterfaceC16847 interfaceC16847 = (InterfaceC16847) arrayDeque.removeLast();
            if (interfaceC16847.getExactSizeIfKnown() != 0) {
                if (interfaceC16847.hasCharacteristics(16384)) {
                    do {
                        interfaceC16847TrySplit = interfaceC16847.trySplit();
                        if (interfaceC16847TrySplit == null || interfaceC16847TrySplit.getExactSizeIfKnown() == 0) {
                        }
                        interfaceC16847.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C24719.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            /* JADX INFO: renamed from: accept */
                            public final void m45213n(Object obj) {
                                C18837 c18838 = c18837;
                                c18838.f56258 = true;
                                c18838.f56259 = obj;
                            }
                        });
                        Object obj = c18837.f56259;
                        C12826.requireNonNull(obj);
                        return C18189.m41402of(obj);
                    } while (interfaceC16847.getExactSizeIfKnown() != 0);
                    interfaceC16847 = interfaceC16847TrySplit;
                    interfaceC16847.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void m45213n(Object obj2) {
                            C18837 c18838 = c18837;
                            c18838.f56258 = true;
                            c18838.f56259 = obj2;
                        }
                    });
                    Object obj2 = c18837.f56259;
                    C12826.requireNonNull(obj2);
                    return C18189.m41402of(obj2);
                }
                InterfaceC16847 interfaceC16847TrySplit2 = interfaceC16847.trySplit();
                if (interfaceC16847TrySplit2 == null || interfaceC16847TrySplit2.getExactSizeIfKnown() == 0) {
                    interfaceC16847.forEachRemaining(new Consumer() { // from class: l.ᩳۨܺ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void m45213n(Object obj3) {
                            C18837 c18838 = c18837;
                            c18838.f56258 = true;
                            c18838.f56259 = obj3;
                        }
                    });
                    if (c18837.f56258) {
                        Object obj3 = c18837.f56259;
                        C12826.requireNonNull(obj3);
                        return C18189.m41402of(obj3);
                    }
                } else {
                    arrayDeque.addLast(interfaceC16847TrySplit2);
                    arrayDeque.addLast(interfaceC16847);
                }
            }
        }
        return C18189.empty();
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC19157 m50003(InterfaceC19157 interfaceC19157, C4407 c4407) {
        interfaceC19157.getClass();
        boolean zIsParallel = interfaceC19157.isParallel();
        InterfaceC16847 interfaceC16847Spliterator = interfaceC19157.spliterator();
        if (!interfaceC16847Spliterator.hasCharacteristics(16384)) {
            return (InterfaceC19157) C16474.stream(new C24872(interfaceC16847Spliterator.estimateSize(), interfaceC16847Spliterator.characteristics() & 80, C23554.iterator(interfaceC16847Spliterator), c4407), zIsParallel).onClose(new RunnableC7712(3, interfaceC19157));
        }
        return (InterfaceC19157) C16474.stream(new C16154(interfaceC16847Spliterator, 0L, c4407), zIsParallel).onClose(new RunnableC7712(3, interfaceC19157));
    }
}
