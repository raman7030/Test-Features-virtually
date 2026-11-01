package p067l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.۫᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14380 extends C13710 implements NavigableMap {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ AbstractC17970 f41100;

    @Override // p067l.C13710
    /* JADX INFO: renamed from: ۧ */
    public final NavigableMap mo31170() {
        return (NavigableMap) ((SortedMap) this.f68511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14380(AbstractC17970 abstractC17970, NavigableMap navigableMap) {
        super(abstractC17970, navigableMap);
        this.f41100 = abstractC17970;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = mo31170().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return m49043(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo31170().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = mo31170().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return m49043(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo31170().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = mo31170().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return m49043(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo31170().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = mo31170().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return m49043(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo31170().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = mo31170().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return m49043(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = mo31170().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return m49043(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m32977(((C23098) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m32977(((C23098) ((AbstractC20140) descendingMap()).entrySet()).iterator());
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractMap.SimpleImmutableEntry m32977(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionMo15386 = this.f41100.mo15386();
        collectionMo15386.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), C21562.unmodifiableList((List) collectionMo15386));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C14380(this.f41100, mo31170().descendingMap());
    }

    @Override // p067l.C13710, p067l.C21757, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // p067l.C13710, p067l.C21757, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // p067l.C13710
    /* JADX INFO: renamed from: ֫ */
    public final SortedSet mo31169() {
        return new C12369(this.f41100, mo31170());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // p067l.C13710, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C14380(this.f41100, mo31170().subMap(obj, z, obj2, z2));
    }

    @Override // p067l.C13710, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C14380(this.f41100, mo31170().headMap(obj, z));
    }

    @Override // p067l.C13710, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C14380(this.f41100, mo31170().tailMap(obj, z));
    }
}
