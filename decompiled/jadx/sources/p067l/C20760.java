package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H7IS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20760 {
    @SafeVarargs
    /* JADX INFO: renamed from: ֫ */
    public static void m46868(final InterfaceC2653 interfaceC2653, Object... objArr) {
        InterfaceC16734 interfaceC16734M50953 = C22771.m50953(C18486.m42024of(objArr));
        final C23441 c23441 = new C23441();
        C22771 c22771 = (C22771) interfaceC16734M50953;
        c22771.getClass();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        ((InterfaceC19157) c22771.m50954()).forEach(new Consumer() { // from class: l.۠ۡ֡
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC2653 interfaceC2654 = interfaceC2653;
                AtomicInteger atomicInteger2 = atomicInteger;
                try {
                    interfaceC2654.accept(obj);
                } catch (IOException e) {
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() == null) {
                        atomicReference2.set(new ArrayList());
                    }
                    ((List) atomicReference2.get()).add((IOException) c23441.apply(Integer.valueOf(atomicInteger2.get()), e));
                }
                atomicInteger2.incrementAndGet();
            }
        });
        List list = (List) atomicReference.get();
        int i = C6027.f15090;
        if (!((list != null ? list.size() : 0) == 0)) {
            throw new C6027(null, list);
        }
    }
}
