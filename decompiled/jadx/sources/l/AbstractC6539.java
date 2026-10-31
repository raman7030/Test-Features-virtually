package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ۜۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S60L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6539 extends AbstractC9527 implements NavigableMap {
    /* JADX INFO: renamed from: ۧ */
    public abstract Iterator mo15282();

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return (Map.Entry) C4648.m13609(mo15281(), (String) null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return (Map.Entry) C4648.m13609(mo15282(), (String) null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return (Map.Entry) C4648.m13615(mo15281());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return (Map.Entry) C4648.m13615(mo15282());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Map.Entry entryFirstEntry = firstEntry();
        if (entryFirstEntry == null) {
            throw new NoSuchElementException();
        }
        return entryFirstEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Map.Entry entryLastEntry = lastEntry();
        if (entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return entryLastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return C19405.m44687(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C19405.m44687(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C19405.m44687(ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return C19405.m44687(higherEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return new C15875(this);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return new C15875(this);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return new C23472(this).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C23472(this);
    }
}
