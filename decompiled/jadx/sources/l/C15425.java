package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15425 implements Set {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4843 f47231;

    public C15425(AbstractC4843 abstractC4843) {
        this.f47231 = abstractC4843;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC4843 abstractC4843 = this.f47231;
        int iMo12419 = abstractC4843.mo12419();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC4843.mo12416(entry.getKey(), entry.getValue());
        }
        return iMo12419 != abstractC4843.mo12419();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f47231.mo12414();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            AbstractC4843 abstractC4843 = this.f47231;
            int iMo12411 = abstractC4843.mo12411(key);
            if (iMo12411 >= 0) {
                Object objMo12412 = abstractC4843.mo12412(iMo12411, 1);
                Object value = entry.getValue();
                return objMo12412 == value || (objMo12412 != null && objMo12412.equals(value));
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
        return this.f47231.mo12419() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C22482(this.f47231);
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
        return this.f47231.mo12419();
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
        return AbstractC4843.m14087((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        AbstractC4843 abstractC4843 = this.f47231;
        int iHashCode = 0;
        for (int iMo12419 = abstractC4843.mo12419() - 1; iMo12419 >= 0; iMo12419--) {
            Object objMo12412 = abstractC4843.mo12412(iMo12419, 0);
            Object objMo12413 = abstractC4843.mo12412(iMo12419, 1);
            iHashCode += (objMo12412 == null ? 0 : objMo12412.hashCode()) ^ (objMo12413 == null ? 0 : objMo12413.hashCode());
        }
        return iHashCode;
    }
}
