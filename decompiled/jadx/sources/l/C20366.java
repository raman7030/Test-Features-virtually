package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20366 implements Collection {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4843 f65741;

    public C20366(AbstractC4843 abstractC4843) {
        this.f65741 = abstractC4843;
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
        this.f65741.mo12414();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f65741.mo12417(obj) >= 0;
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
        return this.f65741.mo12419() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C8371(this.f65741, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        AbstractC4843 abstractC4843 = this.f65741;
        int iMo12417 = abstractC4843.mo12417(obj);
        if (iMo12417 < 0) {
            return false;
        }
        abstractC4843.mo12415(iMo12417);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC4843 abstractC4843 = this.f65741;
        int iMo12419 = abstractC4843.mo12419();
        int i = 0;
        boolean z = false;
        while (i < iMo12419) {
            if (collection.contains(abstractC4843.mo12412(i, 1))) {
                abstractC4843.mo12415(i);
                i--;
                iMo12419--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC4843 abstractC4843 = this.f65741;
        int iMo12419 = abstractC4843.mo12419();
        int i = 0;
        boolean z = false;
        while (i < iMo12419) {
            if (!collection.contains(abstractC4843.mo12412(i, 1))) {
                abstractC4843.mo12415(i);
                i--;
                iMo12419--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f65741.mo12419();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f65741.m14088(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        AbstractC4843 abstractC4843 = this.f65741;
        int iMo12419 = abstractC4843.mo12419();
        Object[] objArr = new Object[iMo12419];
        for (int i = 0; i < iMo12419; i++) {
            objArr[i] = abstractC4843.mo12412(i, 1);
        }
        return objArr;
    }
}
