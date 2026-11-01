package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C8316 implements Set {

    /* JADX INFO: renamed from: ᩸ */
    public final Set f22245;

    /* JADX INFO: renamed from: ᩹ */
    public final C15691 f22246;

    public C8316(C15691 c15691, Set set) {
        this.f22246 = c15691;
        this.f22245 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f22245.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f22245.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22245.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C12340(this.f22246, this.f22245.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f22245.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f22245.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        this.f22246.m35738();
        return this.f22245.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        this.f22246.m35738();
        return this.f22245.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f22245.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f22246.m35738();
        return this.f22245.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f22246.m35738();
        return this.f22245.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f22246.m35738();
        return this.f22245.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f22246.m35738();
        this.f22245.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f22245.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f22245.hashCode();
    }

    public final String toString() {
        return this.f22245.toString();
    }
}
