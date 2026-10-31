package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1F5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4302 extends AbstractC11462 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
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

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return C22646.f73151;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ InterfaceC12063 iterator() {
        return C22646.f73151;
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return C10092.f30382;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C7829.f24229;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return C10092.f30382;
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

    @Override // l.AbstractC11462, java.util.Collection, l.InterfaceC1144
    public final boolean removeIf(Predicate predicate) {
        C11003.requireNonNull(predicate);
        return false;
    }
}
