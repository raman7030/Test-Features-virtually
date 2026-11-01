package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7480 {
    public static /* synthetic */ InterfaceC19157 parallelStream(Collection collection) {
        return collection instanceof InterfaceC3456 ? ((InterfaceC3456) collection).mo56527parallelStream() : C16474.stream(m17261b(collection), true);
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof InterfaceC3456 ? ((InterfaceC3456) collection).removeIf(predicate) : C2785.$default$removeIf(collection, predicate);
    }

    public static /* synthetic */ InterfaceC19157 stream(Collection collection) {
        return collection instanceof InterfaceC3456 ? ((InterfaceC3456) collection).mo56528stream() : C16474.stream(m17261b(collection), false);
    }

    public static /* synthetic */ Object[] toArray(Collection collection, IntFunction intFunction) {
        return collection instanceof InterfaceC3456 ? ((InterfaceC3456) collection).toArray(intFunction) : collection.toArray((Object[]) intFunction.apply(0));
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC16847 m17261b(Collection collection) {
        if (collection instanceof InterfaceC3456) {
            return ((InterfaceC3456) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return C23554.spliterator((LinkedHashSet) collection, 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C6101(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return C23554.spliterator((Set) collection, 1);
        }
        return collection instanceof List ? C12174.$default$spliterator((List) collection) : C23554.spliterator(collection, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m17260a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC3456) {
            ((InterfaceC3456) collection).forEach(consumer);
            return;
        }
        C12826.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
