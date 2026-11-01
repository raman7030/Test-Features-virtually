package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩵ */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes.dex */
public final class C1922 implements Set {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC1082 f72470;

    public C1922(AbstractC1082 abstractC1082) {
        this.f72470 = abstractC1082;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f72470.mo14304();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f72470.mo14301(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Map mapMo14308 = this.f72470.mo14308();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!mapMo14308.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f72470.mo14309() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1257(this.f72470, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC1082 abstractC1082 = this.f72470;
        int iMo14301 = abstractC1082.mo14301(obj);
        if (iMo14301 < 0) {
            return false;
        }
        abstractC1082.mo14305(iMo14301);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Map mapMo14308 = this.f72470.mo14308();
        int size = mapMo14308.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mapMo14308.remove(it.next());
        }
        return size != mapMo14308.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC1082.m15966(this.f72470.mo14308(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f72470.mo14309();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f72470.m15968(0, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC1082.m15967((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        AbstractC1082 abstractC1082 = this.f72470;
        int iHashCode = 0;
        for (int iMo14309 = abstractC1082.mo14309() - 1; iMo14309 >= 0; iMo14309--) {
            Object objMo14302 = abstractC1082.mo14302(iMo14309, 0);
            iHashCode += objMo14302 == null ? 0 : objMo14302.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        AbstractC1082 abstractC1082 = this.f72470;
        int iMo14309 = abstractC1082.mo14309();
        Object[] objArr = new Object[iMo14309];
        for (int i = 0; i < iMo14309; i++) {
            objArr[i] = abstractC1082.mo14302(i, 0);
        }
        return objArr;
    }
}
