package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۚۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5169 extends C0229 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f36329).comparator();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new C5169(((SortedSet) this.f36329).subSet(obj, obj2), this.f36328);
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new C5169(((SortedSet) this.f36329).headSet(obj), this.f36328);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new C5169(((SortedSet) this.f36329).tailSet(obj), this.f36328);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f36329.iterator();
        it.getClass();
        InterfaceC18842 interfaceC18842 = this.f36328;
        interfaceC18842.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC18842.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f36329;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f36328.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }
}
