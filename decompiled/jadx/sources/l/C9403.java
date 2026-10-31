package l;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V578 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9403 extends AbstractC23698 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C9403 f28540;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f28541;

    static {
        int i = AbstractC14545.f44556;
        f28540 = new C9403(C16457.f50591, C13053.f39070);
    }

    public C9403(AbstractC14545 abstractC14545, Comparator comparator) {
        super(comparator);
        this.f28541 = abstractC14545;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object[] mo24242() {
        return this.f28541.mo24242();
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo24243() {
        return this.f28541.mo24243();
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo24244() {
        return this.f28541.mo24244();
    }

    @Override // l.AbstractC23698, l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return this.f28541.listIterator(0);
    }

    @Override // l.AbstractC23698, java.util.NavigableSet
    public final AbstractC20151 descendingIterator() {
        return this.f28541.mo34737().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f28541.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC3176) {
            collection = ((InterfaceC3176) collection).m9734();
        }
        Comparator comparator = this.f76745;
        if (!C19986.m46071(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC20151 it = iterator();
        Iterator it2 = collection.iterator();
        AbstractC0643 abstractC0643 = (AbstractC0643) it;
        if (!abstractC0643.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = abstractC0643.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!abstractC0643.hasNext()) {
                        return false;
                    }
                    next2 = abstractC0643.next();
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

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f28541, obj, this.f76745) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return this.f28541.mo19283();
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo24235(int i, Object[] objArr) {
        return this.f28541.mo24235(i, objArr);
    }

    @Override // l.AbstractC6079, java.util.Collection, java.util.Set
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
        if (this.f28541.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f76745;
        if (C19986.m46071(set, comparator)) {
            Iterator it = set.iterator();
            try {
                AbstractC20151 it2 = iterator();
                do {
                    AbstractC0643 abstractC0643 = (AbstractC0643) it2;
                    if (!abstractC0643.hasNext()) {
                        return true;
                    }
                    next = abstractC0643.next();
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

    @Override // l.AbstractC23698, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f28541.get(0);
    }

    @Override // l.AbstractC23698, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            AbstractC14545 abstractC14545 = this.f28541;
            return abstractC14545.get(abstractC14545.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // l.AbstractC23698, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM24241 = m24241(obj, false) - 1;
        if (iM24241 == -1) {
            return null;
        }
        return this.f28541.get(iM24241);
    }

    @Override // l.AbstractC23698, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM24241 = m24241(obj, true) - 1;
        if (iM24241 == -1) {
            return null;
        }
        return this.f28541.get(iM24241);
    }

    @Override // l.AbstractC23698, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM24245 = m24245(obj, true);
        AbstractC14545 abstractC14545 = this.f28541;
        if (iM24245 == abstractC14545.size()) {
            return null;
        }
        return abstractC14545.get(iM24245);
    }

    @Override // l.AbstractC23698, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM24245 = m24245(obj, false);
        AbstractC14545 abstractC14545 = this.f28541;
        if (iM24245 == abstractC14545.size()) {
            return null;
        }
        return abstractC14545.get(iM24245);
    }

    @Override // l.AbstractC23698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 mo24236(Object obj, boolean z) {
        return m24239(0, m24241(obj, z));
    }

    @Override // l.AbstractC23698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 mo24237(Object obj, boolean z, Object obj2, boolean z2) {
        return mo24240(obj, z).mo24236(obj2, z2);
    }

    @Override // l.AbstractC23698
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 mo24240(Object obj, boolean z) {
        return m24239(m24245(obj, z), this.f28541.size());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9403 m24239(int i, int i2) {
        AbstractC14545 abstractC14545 = this.f28541;
        if (i == 0 && i2 == abstractC14545.size()) {
            return this;
        }
        Comparator comparator = this.f76745;
        if (i < i2) {
            return new C9403(abstractC14545.subList(i, i2), comparator);
        }
        return AbstractC23698.m52241(comparator);
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14545 mo16996() {
        return this.f28541;
    }

    @Override // l.AbstractC23698
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 mo24238() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f76745);
        if (isEmpty()) {
            return AbstractC23698.m52241(comparatorReverseOrder);
        }
        return new C9403(this.f28541.mo34737(), comparatorReverseOrder);
    }

    @Override // l.AbstractC23698, l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m24241(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f28541, obj, this.f76745);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m24245(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f28541, obj, this.f76745);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
