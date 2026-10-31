package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T9A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22169 implements Collection {
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
    public abstract int mo14300();

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        C11233.m27805(collection, "elements");
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
        return mo14300() == 0;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo14300();
    }

    public final String toString() {
        return C1913.m6272(this, ", ", "[", "]", new InterfaceC16233() { // from class: l.᩸۠᩵
            @Override // l.InterfaceC16233
            public final Object invoke(Object obj) {
                return obj == this.f69086 ? "(this Collection)" : String.valueOf(obj);
            }
        }, 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C12001.m29350(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C11233.m27805(objArr, "array");
        return C12001.m29351(this, objArr);
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C11233.m27802(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }
}
