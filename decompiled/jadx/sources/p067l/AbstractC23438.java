package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23438 implements Collection {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo16197();

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C13045.m29867(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return mo16197() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo16197();
    }

    public final String toString() {
        return C4187.m8474(this, ", ", "[", "]", new InterfaceC17797() { // from class: l.᩸۠᩵
            @Override // p067l.InterfaceC17797
            public final Object invoke(Object obj) {
                return obj == this.f71784 ? "(this Collection)" : String.valueOf(obj);
            }
        }, 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C13775.m31408(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C13045.m29867(objArr, "array");
        return C13775.m31409(this, objArr);
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C13045.m29864(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }
}
