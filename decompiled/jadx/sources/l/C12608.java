package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12608 implements Collection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collection f38014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14018 f38015;

    public C12608(C14018 c14018, Collection collection) {
        this.f38015 = c14018;
        this.f38014 = collection;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f38014.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f38014.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f38014.contains(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C10492(this.f38015, this.f38014.iterator());
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f38014.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f38014.toArray(objArr);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        this.f38015.m33618();
        return this.f38014.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f38014.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f38015.m33618();
        return this.f38014.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f38015.m33618();
        return this.f38014.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f38015.m33618();
        this.f38014.clear();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f38014.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f38014.hashCode();
    }

    public final String toString() {
        return this.f38014.toString();
    }
}
