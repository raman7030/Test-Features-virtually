package p067l;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V578 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11305 extends AbstractC24891 {

    /* JADX INFO: renamed from: ۫ */
    public static final C11305 f31489;

    /* JADX INFO: renamed from: ۬ */
    public final transient AbstractC16192 f31490;

    static {
        int i = AbstractC16192.f47662;
        f31489 = new C11305(C18009.f53770, C14774.f42115);
    }

    public C11305(AbstractC16192 abstractC16192, Comparator comparator) {
        super(comparator);
        this.f31490 = abstractC16192;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܽ */
    public final Object[] mo26252() {
        return this.f31490.mo26252();
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܿ */
    public final int mo26253() {
        return this.f31490.mo26253();
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ᩳ */
    public final int mo26254() {
        return this.f31490.mo26254();
    }

    @Override // p067l.AbstractC24891, p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        return this.f31490.listIterator(0);
    }

    @Override // p067l.AbstractC24891, java.util.NavigableSet
    public final AbstractC21520 descendingIterator() {
        return this.f31490.mo36886().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f31490.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC5387) {
            collection = ((InterfaceC5387) collection).m11778();
        }
        Comparator comparator = this.f79495;
        if (!C21363.m48385(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC21520 it = iterator();
        Iterator it2 = collection.iterator();
        AbstractC2980 abstractC2980 = (AbstractC2980) it;
        if (!abstractC2980.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractC2980.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!abstractC2980.hasNext()) {
                        return false;
                    }
                    next2 = abstractC2980.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f31490, obj, this.f79495) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return this.f31490.mo21230();
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        return this.f31490.mo26245(i, objArr);
    }

    @Override // p067l.AbstractC8146, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f31490.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f79495;
        if (C21363.m48385(set, comparator)) {
            Iterator it = set.iterator();
            try {
                AbstractC21520 it2 = iterator();
                do {
                    AbstractC2980 abstractC2980 = (AbstractC2980) it2;
                    if (!abstractC2980.hasNext()) {
                        return true;
                    }
                    next = abstractC2980.next();
                    next2 = it.next();
                    if (next2 == null) {
                        break;
                    }
                } while (comparator.compare(next, next2) == 0);
                return false;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // p067l.AbstractC24891, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f31490.get(0);
    }

    @Override // p067l.AbstractC24891, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            AbstractC16192 abstractC16192 = this.f31490;
            return abstractC16192.get(abstractC16192.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // p067l.AbstractC24891, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM26251 = m26251(obj, false) - 1;
        if (iM26251 == -1) {
            return null;
        }
        return this.f31490.get(iM26251);
    }

    @Override // p067l.AbstractC24891, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM26251 = m26251(obj, true) - 1;
        if (iM26251 == -1) {
            return null;
        }
        return this.f31490.get(iM26251);
    }

    @Override // p067l.AbstractC24891, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM26255 = m26255(obj, true);
        AbstractC16192 abstractC16192 = this.f31490;
        if (iM26255 == abstractC16192.size()) {
            return null;
        }
        return abstractC16192.get(iM26255);
    }

    @Override // p067l.AbstractC24891, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM26255 = m26255(obj, false);
        AbstractC16192 abstractC16192 = this.f31490;
        if (iM26255 == abstractC16192.size()) {
            return null;
        }
        return abstractC16192.get(iM26255);
    }

    @Override // p067l.AbstractC24891
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC24891 mo26246(Object obj, boolean z) {
        return m26249(0, m26251(obj, z));
    }

    @Override // p067l.AbstractC24891
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC24891 mo26247(Object obj, boolean z, Object obj2, boolean z2) {
        return mo26250(obj, z).mo26246(obj2, z2);
    }

    @Override // p067l.AbstractC24891
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC24891 mo26250(Object obj, boolean z) {
        return m26249(m26255(obj, z), this.f31490.size());
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11305 m26249(int i, int i2) {
        AbstractC16192 abstractC16192 = this.f31490;
        if (i == 0 && i2 == abstractC16192.size()) {
            return this;
        }
        Comparator comparator = this.f79495;
        if (i < i2) {
            return new C11305(abstractC16192.subList(i, i2), comparator);
        }
        return AbstractC24891.m54645(comparator);
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 mo18927() {
        return this.f31490;
    }

    @Override // p067l.AbstractC24891
    /* JADX INFO: renamed from: ۢ */
    public final AbstractC24891 mo26248() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f79495);
        if (isEmpty()) {
            return AbstractC24891.m54645(comparatorReverseOrder);
        }
        return new C11305(this.f31490.mo36886(), comparatorReverseOrder);
    }

    @Override // p067l.AbstractC24891, p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m26251(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f31490, obj, this.f79495);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m26255(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f31490, obj, this.f79495);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
