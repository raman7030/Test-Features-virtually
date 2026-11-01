package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21230 {
    public static InterfaceC16847 spliterator(Iterable iterable) {
        if (iterable instanceof InterfaceC6477) {
            return ((InterfaceC6477) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return C23554.spliterator((LinkedHashSet) iterable, 17);
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            return new C6101(sortedSet, sortedSet);
        }
        if (iterable instanceof Set) {
            return C23554.spliterator((Set) iterable, 1);
        }
        if (iterable instanceof List) {
            return C12174.$default$spliterator((List) iterable);
        }
        return iterable instanceof Collection ? C23554.spliterator((Collection) iterable, 0) : C23554.m52342b(iterable.iterator(), 0);
    }

    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof InterfaceC6477) {
            ((InterfaceC6477) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof Collection)) {
            C23241.$default$forEach(iterable, consumer);
            return;
        }
        C12826.requireNonNull(consumer);
        Iterator it = ((Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
