package p067l;

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
public abstract class AbstractC24891 extends AbstractC8146 implements NavigableSet, InterfaceC23374, InterfaceC17518 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ۗ */
    public transient AbstractC24891 f79494;

    /* JADX INFO: renamed from: ۙ */
    public final transient Comparator f79495;

    @Override // java.util.NavigableSet
    public abstract AbstractC21520 descendingIterator();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC24891 mo26246(Object obj, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC24891 mo26247(Object obj, boolean z, Object obj2, boolean z2);

    /* JADX INFO: renamed from: ۢ */
    public abstract AbstractC24891 mo26248();

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC24891 mo26250(Object obj, boolean z);

    @Override // p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC24891 m54644of() {
        return C11305.f31489;
    }

    public static AbstractC24891 copyOf(Collection collection) {
        return m54647(collection, C14774.f42115);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11305 m54645(Comparator comparator) {
        if (C14774.f42115.equals(comparator)) {
            return C11305.f31489;
        }
        return new C11305(C18009.f53770, comparator);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24891 m54646(Iterable iterable) {
        return m54647(iterable, C14774.f42115);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24891 m54648(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return m54645(comparator);
        }
        C14104.m32027(i, objArr);
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
        return new C11305(AbstractC16192.m36884(i2, objArr), comparator);
    }

    public AbstractC24891(Comparator comparator) {
        this.f79495 = comparator;
    }

    @Override // java.util.SortedSet, p067l.InterfaceC23374
    public final Comparator comparator() {
        return this.f79495;
    }

    public Object first() {
        return iterator().next();
    }

    public Object last() {
        return ((AbstractC2980) descendingIterator()).next();
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
        AbstractC24891 abstractC24891 = this.f79494;
        if (abstractC24891 != null) {
            return abstractC24891;
        }
        AbstractC24891 abstractC24891Mo26248 = mo26248();
        this.f79494 = abstractC24891Mo26248;
        abstractC24891Mo26248.f79494 = this;
        return abstractC24891Mo26248;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return new C16173(this.f79495, toArray());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC24891 m54647(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        if (C21363.m48385(iterable, comparator) && (iterable instanceof AbstractC24891)) {
            AbstractC24891 abstractC24891 = (AbstractC24891) iterable;
            if (!abstractC24891.mo21230()) {
                return abstractC24891;
            }
        }
        Object[] objArrM24929 = C10810.m24929(iterable);
        return m54648(comparator, objArrM24929.length, objArrM24929);
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        return C6786.m15484(mo26250(obj, true).iterator(), (String) null);
    }

    public Object floor(Object obj) {
        obj.getClass();
        return C6786.m15484(mo26246(obj, true).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return mo26246(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return mo26246(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        return C6786.m15484(mo26250(obj, false).iterator(), (String) null);
    }

    public Object lower(Object obj) {
        obj.getClass();
        return C6786.m15484(mo26246(obj, false).descendingIterator(), (String) null);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C6194.m14030(this.f79495.compare(obj, obj2) <= 0);
        return mo26247(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        C6194.m14030(this.f79495.compare(obj, obj2) <= 0);
        return mo26247(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return mo26250(obj, z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return mo26250(obj, true);
    }
}
