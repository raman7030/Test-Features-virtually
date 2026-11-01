package p067l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45HA */
/* JADX INFO: loaded from: classes3.dex */
public class C13947 extends AbstractCollection {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC20276 f39339;

    /* JADX INFO: renamed from: ᩹ */
    public final Collection f39340;

    public C13947(Collection collection, InterfaceC20276 interfaceC20276) {
        this.f39340 = collection;
        this.f39339 = interfaceC20276;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        C6194.m14030(this.f39339.apply(obj));
        return this.f39340.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6194.m14030(this.f39339.apply(it.next()));
        }
        return this.f39340.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C10810.m24927(this.f39340, this.f39339);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !C10810.m24923(this.f39340, this.f39339);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f39340.iterator();
        it.getClass();
        InterfaceC20276 interfaceC20276 = this.f39339;
        interfaceC20276.getClass();
        return new C6116(it, interfaceC20276);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f39340.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f39340.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f39339.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f39340.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f39339.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f39340.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f39339.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return C9468.m21990(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return C9468.m21990(iterator()).toArray(objArr);
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
        Collection collection = this.f39340;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f39339.apply(obj);
        }
        return false;
    }
}
