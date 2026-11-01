package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ᩵ */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C1607 implements Set {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC1082 f50360;

    public C1607(AbstractC1082 abstractC1082) {
        this.f50360 = abstractC1082;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1082 abstractC1082 = this.f50360;
        int iMo14309 = abstractC1082.mo14309();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC1082.mo14306(entry.getKey(), entry.getValue());
        }
        return iMo14309 != abstractC1082.mo14309();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f50360.mo14304();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AbstractC1082 abstractC1082 = this.f50360;
            int iMo14301 = abstractC1082.mo14301(key);
            if (iMo14301 >= 0) {
                Object objMo14302 = abstractC1082.mo14302(iMo14301, 1);
                Object value = entry.getValue();
                return objMo14302 == value || (objMo14302 != null && objMo14302.equals(value));
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f50360.mo14309() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1957(this.f50360);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f50360.mo14309();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC1082.m15967((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        AbstractC1082 abstractC1082 = this.f50360;
        int iHashCode = 0;
        for (int iMo14309 = abstractC1082.mo14309() - 1; iMo14309 >= 0; iMo14309--) {
            Object objMo14302 = abstractC1082.mo14302(iMo14309, 0);
            Object objMo14303 = abstractC1082.mo14302(iMo14309, 1);
            iHashCode += (objMo14302 == null ? 0 : objMo14302.hashCode()) ^ (objMo14303 == null ? 0 : objMo14303.hashCode());
        }
        return iHashCode;
    }
}
