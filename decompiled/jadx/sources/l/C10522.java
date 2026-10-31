package l;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۤ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10522 extends C23221 implements NavigableSet {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f31548;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10522(AbstractC16416 abstractC16416, NavigableMap navigableMap) {
        super(abstractC16416, navigableMap);
        this.f31548 = abstractC16416;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo26428().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo26428().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo26428().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo26428().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C4648.m13615(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C4648.m13615(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C10522(this.f31548, mo26428().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C13343) descendingSet()).iterator();
    }

    @Override // l.C23221, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C10522(this.f31548, mo26428().headMap(obj, z));
    }

    @Override // l.C23221, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C10522(this.f31548, mo26428().subMap(obj, z, obj2, z2));
    }

    @Override // l.C23221, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C10522(this.f31548, mo26428().tailMap(obj, z));
    }

    @Override // l.C23221
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final NavigableMap mo26428() {
        return (NavigableMap) ((SortedMap) this.f26890);
    }
}
