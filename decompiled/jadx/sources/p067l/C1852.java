package p067l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵ */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C1852 implements Collection {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC1082 f68417;

    public C1852(AbstractC1082 abstractC1082) {
        this.f68417 = abstractC1082;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f68417.mo14304();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f68417.mo14307(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
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
        return this.f68417.mo14309() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1257(this.f68417, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC1082 abstractC1082 = this.f68417;
        int iMo14307 = abstractC1082.mo14307(obj);
        if (iMo14307 < 0) {
            return false;
        }
        abstractC1082.mo14305(iMo14307);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC1082 abstractC1082 = this.f68417;
        int iMo14309 = abstractC1082.mo14309();
        int i = 0;
        boolean z = false;
        while (i < iMo14309) {
            if (collection.contains(abstractC1082.mo14302(i, 1))) {
                abstractC1082.mo14305(i);
                i--;
                iMo14309--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC1082 abstractC1082 = this.f68417;
        int iMo14309 = abstractC1082.mo14309();
        int i = 0;
        boolean z = false;
        while (i < iMo14309) {
            if (!collection.contains(abstractC1082.mo14302(i, 1))) {
                abstractC1082.mo14305(i);
                i--;
                iMo14309--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f68417.mo14309();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f68417.m15968(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        AbstractC1082 abstractC1082 = this.f68417;
        int iMo14309 = abstractC1082.mo14309();
        Object[] objArr = new Object[iMo14309];
        for (int i = 0; i < iMo14309; i++) {
            objArr[i] = abstractC1082.mo14302(i, 1);
        }
        return objArr;
    }
}
