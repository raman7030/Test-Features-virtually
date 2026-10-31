package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6258 implements Set {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Set f19381;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14018 f19382;

    public C6258(C14018 c14018, Set set) {
        this.f19382 = c14018;
        this.f19381 = set;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f19381.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f19381.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f19381.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C10492(this.f19382, this.f19381.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f19381.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f19381.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        this.f19382.m33618();
        return this.f19381.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        this.f19382.m33618();
        return this.f19381.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f19381.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f19382.m33618();
        return this.f19381.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.f19382.m33618();
        return this.f19381.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.f19382.m33618();
        return this.f19381.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f19382.m33618();
        this.f19381.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f19381.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f19381.hashCode();
    }

    public final String toString() {
        return this.f19381.toString();
    }
}
