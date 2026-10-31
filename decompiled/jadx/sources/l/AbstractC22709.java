package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6CN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22709 extends AbstractC22394 {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
    }

    @Override // l.AbstractC22394, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    @Deprecated
    public final void forEach(Consumer consumer) {
    }

    @Override // l.AbstractC22394, l.InterfaceC17105
    public final void forEach(LongConsumer longConsumer) {
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }

    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.InterfaceC11421
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo17071(long j) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C8639.f26375;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC11421, l.InterfaceC17105, java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC23455 iterator() {
        return C8639.f26375;
    }

    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return C2995.f9443;
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

    @Override // l.AbstractC22394, java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override // l.AbstractC22394, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22394, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22394, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22394, java.util.Collection, l.InterfaceC1144
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        C11003.requireNonNull(predicate);
        return false;
    }

    @Override // l.AbstractC22394
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo50259(InterfaceC11421 interfaceC11421) {
        return interfaceC11421.isEmpty();
    }

    @Override // l.AbstractC22394
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo17070(InterfaceC11421 interfaceC11421) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22394
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo13086(InterfaceC11421 interfaceC11421) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22394
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo50260(InterfaceC11421 interfaceC11421) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22394, l.InterfaceC11421
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13085(LongPredicate longPredicate) {
        C11003.requireNonNull(longPredicate);
        return false;
    }
}
