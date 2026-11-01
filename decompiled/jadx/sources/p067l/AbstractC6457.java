package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6457 extends AbstractC13262 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
    }

    @Override // java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return C23891.f75877;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC13833 iterator() {
        return C23891.f75877;
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final /* bridge */ /* synthetic */ InterfaceC16847 spliterator() {
        return C11960.f33342;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C9809.f27145;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return C11960.f33342;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC13262, java.util.Collection, p067l.InterfaceC3456
    public final boolean removeIf(Predicate predicate) {
        C12826.requireNonNull(predicate);
        return false;
    }
}
