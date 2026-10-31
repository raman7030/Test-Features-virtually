package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩻۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95IB */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23698 extends AbstractC6079 implements NavigableSet, InterfaceC22102, InterfaceC15940 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient AbstractC23698 f76744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient Comparator f76745;

    @Override // java.util.NavigableSet
    public abstract AbstractC20151 descendingIterator();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC23698 mo24236(Object obj, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC23698 mo24237(Object obj, boolean z, Object obj2, boolean z2);

    /* JADX INFO: renamed from: ۢ */
    public abstract AbstractC23698 mo24238();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC23698 mo24240(Object obj, boolean z);

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static AbstractC23698 of() {
        return C9403.f28540;
    }

    public static AbstractC23698 copyOf(Collection collection) {
        return m52243(collection, C13053.f39070);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9403 m52241(Comparator comparator) {
        if (C13053.f39070.equals(comparator)) {
            return C9403.f28540;
        }
        return new C9403(C16457.f50591, comparator);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23698 m52242(Iterable iterable) {
        return m52243(iterable, C13053.f39070);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23698 m52244(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m52241(comparator);
        }
        C12348.m29967(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new C9403(AbstractC14545.m34735(i2, objArr), comparator);
    }

    public AbstractC23698(Comparator comparator) {
        this.f76745 = comparator;
    }

    @Override // java.util.SortedSet, l.InterfaceC22102
    public final Comparator comparator() {
        return this.f76745;
    }

    public Object first() {
        return iterator().next();
    }

    public Object last() {
        return ((AbstractC0643) descendingIterator()).next();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        AbstractC23698 abstractC23698 = this.f76744;
        if (abstractC23698 != null) {
            return abstractC23698;
        }
        AbstractC23698 abstractC23698Mo24238 = mo24238();
        this.f76744 = abstractC23698Mo24238;
        abstractC23698Mo24238.f76744 = this;
        return abstractC23698Mo24238;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return new C14525(this.f76745, toArray());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23698 m52243(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        if (C19986.m46071(iterable, comparator) && (iterable instanceof AbstractC23698)) {
            AbstractC23698 abstractC23698 = (AbstractC23698) iterable;
            if (!abstractC23698.mo19283()) {
                return abstractC23698;
            }
        }
        Object[] objArrM22958 = C8882.m22958(iterable);
        return m52244(comparator, objArrM22958.length, objArrM22958);
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        return C4648.m13609(mo24240(obj, true).iterator(), (String) null);
    }

    public Object floor(Object obj) {
        obj.getClass();
        return C4648.m13609(mo24236(obj, true).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return mo24236(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return mo24236(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        return C4648.m13609(mo24240(obj, false).iterator(), (String) null);
    }

    public Object lower(Object obj) {
        obj.getClass();
        return C4648.m13609(mo24236(obj, false).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C4025.m12110(this.f76745.compare(obj, obj2) <= 0);
        return mo24237(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        C4025.m12110(this.f76745.compare(obj, obj2) <= 0);
        return mo24237(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return mo24240(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return mo24240(obj, true);
    }
}
