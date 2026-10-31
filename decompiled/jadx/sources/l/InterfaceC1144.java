package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֨۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1144 extends InterfaceC4323 {
    @Override // l.InterfaceC1144, l.InterfaceC4323
    void forEach(Consumer consumer);

    /* JADX INFO: renamed from: parallelStream */
    InterfaceC17664 mo42463parallelStream();

    boolean removeIf(Predicate predicate);

    @Override // l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    InterfaceC15234 spliterator();

    /* JADX INFO: renamed from: stream */
    InterfaceC17664 mo42464stream();

    Object[] toArray(IntFunction intFunction);
}
