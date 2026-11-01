package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C14351 implements Collection {

    /* JADX INFO: renamed from: ᩸ */
    public final Collection f41041;

    /* JADX INFO: renamed from: ᩹ */
    public final C15691 f41042;

    public C14351(C15691 c15691, Collection collection) {
        this.f41042 = c15691;
        this.f41041 = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f41041.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f41041.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f41041.contains(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C12340(this.f41042, this.f41041.iterator());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f41041.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f41041.toArray(objArr);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f41042.m35738();
        return this.f41041.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f41041.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f41042.m35738();
        return this.f41041.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f41042.m35738();
        return this.f41041.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f41042.m35738();
        this.f41041.clear();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f41041.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f41041.hashCode();
    }

    public final String toString() {
        return this.f41041.toString();
    }
}
