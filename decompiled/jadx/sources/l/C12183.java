package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45HA */
/* JADX INFO: loaded from: classes3.dex */
public class C12183 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18842 f36328;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Collection f36329;

    public C12183(Collection collection, InterfaceC18842 interfaceC18842) {
        this.f36329 = collection;
        this.f36328 = interfaceC18842;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        C4025.m12110(this.f36328.apply(obj));
        return this.f36329.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C4025.m12110(this.f36328.apply(it.next()));
        }
        return this.f36329.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C8882.m22956(this.f36329, this.f36328);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !C8882.m22952(this.f36329, this.f36328);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f36329.iterator();
        it.getClass();
        InterfaceC18842 interfaceC18842 = this.f36328;
        interfaceC18842.getClass();
        return new C3943(it, interfaceC18842);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f36329.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f36329.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f36328.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f36329.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f36328.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f36329.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f36328.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C7470.m20015(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return C7470.m20015(iterator()).toArray(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.f36329;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f36328.apply(obj);
        }
        return false;
    }
}
