package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2619 implements Set, Serializable {
    public static final long serialVersionUID = 3406603774387020532L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C2619 f8251 = new C2619();

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C12001.m29350(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C11233.m27805(objArr, "array");
        return C12001.m29351(this, objArr);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C11233.m27805(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C9675.f29278;
    }

    private final Object readResolve() {
        return f8251;
    }
}
