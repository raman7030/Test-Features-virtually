package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4Q9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22020 extends AbstractC4381 implements Collection {
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((C18740) this).f59223.iterator();
    }

    @Override // java.util.Collection
    public final int size() {
        return ((C18740) this).f59223.size();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((C18740) this).f59223.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((C18740) this).f59223.isEmpty();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((C18740) this).f59223.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return ((C18740) this).f59223.add(obj);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((C18740) this).f59223.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((C18740) this).f59223.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return ((C18740) this).f59223.addAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((C18740) this).f59223.retainAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        ((C18740) this).f59223.clear();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ((C18740) this).f59223.toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((C18740) this).f59223.toArray(objArr);
    }
}
