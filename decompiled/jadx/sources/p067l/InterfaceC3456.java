package p067l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3456 extends InterfaceC6477 {
    @Override // p067l.InterfaceC3456, p067l.InterfaceC6477
    void forEach(Consumer consumer);

    /* JADX INFO: renamed from: parallelStream */
    InterfaceC19157 mo56527parallelStream();

    boolean removeIf(Predicate predicate);

    @Override // p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    InterfaceC16847 spliterator();

    /* JADX INFO: renamed from: stream */
    InterfaceC19157 mo56528stream();

    Object[] toArray(IntFunction intFunction);
}
