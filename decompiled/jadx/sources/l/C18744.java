package l;

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
public class C18744 implements Collection, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = 1820017752578914078L;
    public final Collection a;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return C18370.convert(mo42463parallelStream());
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        return C18370.convert(mo42464stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    public C18744(Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        return this.a.toArray(objArr);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C2516(this);
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
        return this.a.containsAll(collection);
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
        C5378.a(this.a, consumer);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC15234 spliterator() {
        return C5378.b(this.a);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: stream */
    public InterfaceC17664 mo42464stream() {
        return C5378.stream(this.a);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* JADX INFO: renamed from: parallelStream */
    public InterfaceC17664 mo42463parallelStream() {
        return C5378.parallelStream(this.a);
    }
}
