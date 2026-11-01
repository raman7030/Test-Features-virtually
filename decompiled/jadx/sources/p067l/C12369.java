package p067l;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۤ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12369 extends C24438 implements NavigableSet {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC17970 f34510;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12369(AbstractC17970 abstractC17970, NavigableMap navigableMap) {
        super(abstractC17970, navigableMap);
        this.f34510 = abstractC17970;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo28461().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo28461().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo28461().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo28461().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C6786.m15490(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C6786.m15490(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C12369(this.f34510, mo28461().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C15050) descendingSet()).iterator();
    }

    @Override // p067l.C24438, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C12369(this.f34510, mo28461().headMap(obj, z));
    }

    @Override // p067l.C24438, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C12369(this.f34510, mo28461().subMap(obj, z, obj2, z2));
    }

    @Override // p067l.C24438, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C12369(this.f34510, mo28461().tailMap(obj, z));
    }

    @Override // p067l.C24438
    /* JADX INFO: renamed from: ܽ */
    public final NavigableMap mo28461() {
        return (NavigableMap) ((SortedMap) this.f29815);
    }
}
