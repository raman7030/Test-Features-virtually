package p067l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ᩴۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C20183 implements Collection, Serializable, InterfaceC3456 {
    public static final long serialVersionUID = 1820017752578914078L;

    /* JADX INFO: renamed from: a */
    public final Collection f62465a;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C19828.convert(mo56527parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C19828.convert(mo56528stream());
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C20183(Collection collection) {
        collection.getClass();
        this.f62465a = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f62465a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f62465a.isEmpty();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f62465a.contains(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        return this.f62465a.toArray();
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return this.f62465a.toArray(objArr);
    }

    public final String toString() {
        return this.f62465a.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C4760(this);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        return this.f62465a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public void forEach(Consumer consumer) {
        C7480.m17260a(this.f62465a, consumer);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC16847 spliterator() {
        return C7480.m17261b(this.f62465a);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: stream */
    public InterfaceC19157 mo56528stream() {
        return C7480.stream(this.f62465a);
    }

    @Override // java.util.Collection, p067l.InterfaceC3456
    /* JADX INFO: renamed from: parallelStream */
    public InterfaceC19157 mo56527parallelStream() {
        return C7480.parallelStream(this.f62465a);
    }
}
