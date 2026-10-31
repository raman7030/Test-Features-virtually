package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes.dex */
public final class C21777 implements Set {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4843 f69762;

    public C21777(AbstractC4843 abstractC4843) {
        this.f69762 = abstractC4843;
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
        this.f69762.mo12414();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f69762.mo12411(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Map mapMo12418 = this.f69762.mo12418();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!mapMo12418.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f69762.mo12419() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C8371(this.f69762, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC4843 abstractC4843 = this.f69762;
        int iMo12411 = abstractC4843.mo12411(obj);
        if (iMo12411 < 0) {
            return false;
        }
        abstractC4843.mo12415(iMo12411);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Map mapMo12418 = this.f69762.mo12418();
        int size = mapMo12418.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mapMo12418.remove(it.next());
        }
        return size != mapMo12418.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC4843.m14086(this.f69762.mo12418(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f69762.mo12419();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f69762.m14088(0, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC4843.m14087((Set) this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        AbstractC4843 abstractC4843 = this.f69762;
        int iHashCode = 0;
        for (int iMo12419 = abstractC4843.mo12419() - 1; iMo12419 >= 0; iMo12419--) {
            Object objMo12412 = abstractC4843.mo12412(iMo12419, 0);
            iHashCode += objMo12412 == null ? 0 : objMo12412.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        AbstractC4843 abstractC4843 = this.f69762;
        int iMo12419 = abstractC4843.mo12419();
        Object[] objArr = new Object[iMo12419];
        for (int i = 0; i < iMo12419; i++) {
            objArr[i] = abstractC4843.mo12412(i, 0);
        }
        return objArr;
    }
}
