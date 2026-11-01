package p067l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۚۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7281 extends C2586 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f39340).comparator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C7281(((SortedSet) this.f39340).subSet(obj, obj2), this.f39339);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C7281(((SortedSet) this.f39340).headSet(obj), this.f39339);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C7281(((SortedSet) this.f39340).tailSet(obj), this.f39339);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f39340.iterator();
        it.getClass();
        InterfaceC20276 interfaceC20276 = this.f39339;
        interfaceC20276.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC20276.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f39340;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f39339.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }
}
