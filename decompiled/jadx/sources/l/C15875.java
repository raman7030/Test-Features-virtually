package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ܺۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public final class C15875 extends C2471 implements NavigableSet {
    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) this.f26890).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return ((NavigableMap) this.f26890).descendingKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) this.f26890).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return ((NavigableMap) this.f26890).headMap(obj, z).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) this.f26890).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) this.f26890).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C19405.m44687(((NavigableMap) this.f26890).pollFirstEntry());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C19405.m44687(((NavigableMap) this.f26890).pollLastEntry());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ((NavigableMap) this.f26890).subMap(obj, z, obj2, z2).navigableKeySet();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return ((NavigableMap) this.f26890).tailMap(obj, z).navigableKeySet();
    }

    @Override // l.C8821
    /* JADX INFO: renamed from: ۧ */
    public final Map mo22794() {
        return (NavigableMap) this.f26890;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
