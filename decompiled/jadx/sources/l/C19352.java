package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H7IS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19352 {
    @SafeVarargs
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44574(final InterfaceC0300 interfaceC0300, Object... objArr) {
        InterfaceC15116 interfaceC15116M48616 = C21468.m48616(C16958.of(objArr));
        final C22173 c22173 = new C22173();
        C21468 c21468 = (C21468) interfaceC15116M48616;
        c21468.getClass();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        ((InterfaceC17664) c21468.m48617()).forEach(new Consumer() { // from class: l.۠ۡ֡
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC0300 interfaceC0301 = interfaceC0300;
                AtomicInteger atomicInteger2 = atomicInteger;
                try {
                    interfaceC0301.accept(obj);
                } catch (IOException e) {
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() == null) {
                        atomicReference2.set(new ArrayList());
                    }
                    ((List) atomicReference2.get()).add((IOException) c22173.apply(Integer.valueOf(atomicInteger2.get()), e));
                }
                atomicInteger2.incrementAndGet();
            }
        });
        List list = (List) atomicReference.get();
        int i = C3850.f12283;
        if (!((list != null ? list.size() : 0) == 0)) {
            throw new C3850(null, list);
        }
    }
}
