package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ᩳۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17993 extends AbstractC19904 implements NavigableMap {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient NavigableSet f56133;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient AbstractC10232 f56134;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Set f56135;

    @Override // l.AbstractC4381
    public final String toString() {
        return C19405.m44688(this);
    }

    @Override // l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public final Object mo13120() {
        return ((C23472) this).f75319;
    }

    @Override // l.AbstractC19904, l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public final Map mo13120() {
        return ((C23472) this).f75319;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        AbstractC10232 abstractC10232 = this.f56134;
        if (abstractC10232 != null) {
            return abstractC10232;
        }
        Comparator comparator = ((C23472) this).f75319.comparator();
        if (comparator == null) {
            comparator = C13053.f39070;
        }
        AbstractC10232 abstractC10232Mo22482 = AbstractC10232.m25862(comparator).mo22482();
        this.f56134 = abstractC10232Mo22482;
        return abstractC10232Mo22482;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((C23472) this).f75319.lastKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((C23472) this).f75319.firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return ((C23472) this).f75319.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((C23472) this).f75319.higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return ((C23472) this).f75319.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((C23472) this).f75319.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return ((C23472) this).f75319.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((C23472) this).f75319.floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return ((C23472) this).f75319.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((C23472) this).f75319.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return ((C23472) this).f75319.lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return ((C23472) this).f75319.firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return ((C23472) this).f75319.pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return ((C23472) this).f75319.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return ((C23472) this).f75319;
    }

    @Override // l.AbstractC19904, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        Set set = this.f56135;
        if (set != null) {
            return set;
        }
        C16581 c16581 = new C16581(this);
        this.f56135 = c16581;
        return c16581;
    }

    @Override // l.AbstractC19904, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.f56133;
        if (navigableSet != null) {
            return navigableSet;
        }
        C15875 c15875 = new C15875(this);
        this.f56133 = c15875;
        return c15875;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        AbstractC6539 abstractC6539 = ((C23472) this).f75319;
        abstractC6539.getClass();
        return new C15875(abstractC6539);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return ((C23472) this).f75319.subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return ((C23472) this).f75319.tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return ((C23472) this).f75319.headMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // l.AbstractC19904, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return new C3882(this);
    }
}
