package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4Q9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23296 extends AbstractC6532 implements Collection {
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((C20179) this).f62446.iterator();
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C20179) this).f62446.size();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((C20179) this).f62446.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((C20179) this).f62446.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C20179) this).f62446.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return ((C20179) this).f62446.add(obj);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((C20179) this).f62446.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C20179) this).f62446.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return ((C20179) this).f62446.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((C20179) this).f62446.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        ((C20179) this).f62446.clear();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ((C20179) this).f62446.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((C20179) this).f62446.toArray(objArr);
    }
}
