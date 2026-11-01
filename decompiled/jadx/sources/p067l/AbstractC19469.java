package p067l;

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
public abstract class AbstractC19469 extends AbstractC21285 implements NavigableMap {

    /* JADX INFO: renamed from: ᩶ */
    public transient NavigableSet f59330;

    /* JADX INFO: renamed from: ᩸ */
    public transient AbstractC12093 f59331;

    /* JADX INFO: renamed from: ᩹ */
    public transient Set f59332;

    @Override // p067l.AbstractC6532
    public final String toString() {
        return C20811.m46982(this);
    }

    @Override // p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public final Object mo14984() {
        return ((C24676) this).f78066;
    }

    @Override // p067l.AbstractC21285, p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public final Map mo14984() {
        return ((C24676) this).f78066;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        AbstractC12093 abstractC12093 = this.f59331;
        if (abstractC12093 != null) {
            return abstractC12093;
        }
        Comparator comparator = ((C24676) this).f78066.comparator();
        if (comparator == null) {
            comparator = C14774.f42115;
        }
        AbstractC12093 abstractC12093Mo24451 = AbstractC12093.m27884(comparator).mo24451();
        this.f59331 = abstractC12093Mo24451;
        return abstractC12093Mo24451;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return ((C24676) this).f78066.lastKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return ((C24676) this).f78066.firstKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return ((C24676) this).f78066.higherEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((C24676) this).f78066.higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return ((C24676) this).f78066.ceilingEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((C24676) this).f78066.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return ((C24676) this).f78066.floorEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((C24676) this).f78066.floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return ((C24676) this).f78066.lowerEntry(obj);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((C24676) this).f78066.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return ((C24676) this).f78066.lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return ((C24676) this).f78066.firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return ((C24676) this).f78066.pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return ((C24676) this).f78066.pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return ((C24676) this).f78066;
    }

    @Override // p067l.AbstractC21285, java.util.Map, java.util.SortedMap
    public final Set entrySet() {
        Set set = this.f59332;
        if (set != null) {
            return set;
        }
        C18127 c18127 = new C18127(this);
        this.f59332 = c18127;
        return c18127;
    }

    @Override // p067l.AbstractC21285, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        NavigableSet navigableSet = this.f59330;
        if (navigableSet != null) {
            return navigableSet;
        }
        C17456 c17456 = new C17456(this);
        this.f59330 = c17456;
        return c17456;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        AbstractC8583 abstractC8583 = ((C24676) this).f78066;
        abstractC8583.getClass();
        return new C17456(abstractC8583);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return ((C24676) this).f78066.subMap(obj2, z2, obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return ((C24676) this).f78066.tailMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return ((C24676) this).f78066.headMap(obj, z).descendingMap();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // p067l.AbstractC21285, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return new C6058(this);
    }
}
