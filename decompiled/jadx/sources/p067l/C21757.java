package p067l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public class C21757 extends AbstractC20140 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC17970 f68510;

    /* JADX INFO: renamed from: ᩶ */
    public final transient Map f68511;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f68511;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object c12607;
        Map map = this.f68511;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        AbstractC10357 abstractC10357 = (AbstractC10357) this.f68510;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c12607 = new C12607(abstractC10357, obj, list, null);
        } else {
            c12607 = new C8345(abstractC10357, obj, list, null);
        }
        return c12607;
    }

    public C21757(AbstractC17970 abstractC17970, Map map) {
        this.f68510 = abstractC17970;
        this.f68511 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f68510.m36253();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f68511.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f68511.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC17970 abstractC17970 = this.f68510;
        Collection collectionMo15386 = abstractC17970.mo15386();
        collectionMo15386.addAll(collection);
        AbstractC17970.m40899(abstractC17970, collection.size());
        collection.clear();
        return collectionMo15386;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f68511.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f68511.hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f68511.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC17970 abstractC17970 = this.f68510;
        Map map = abstractC17970.f53668;
        Map map2 = this.f68511;
        if (map2 == map) {
            abstractC17970.clear();
            return;
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection collection = (Collection) entry.getValue();
            m49043(entry);
            C6194.m14035("no calls to next() since the last call to remove()", collection != null);
            it.remove();
            AbstractC17970.m40899(abstractC17970, collection.size());
            collection.clear();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractMap.SimpleImmutableEntry m49043(Map.Entry entry) {
        Object c12607;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC10357 abstractC10357 = (AbstractC10357) this.f68510;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c12607 = new C12607(abstractC10357, key, list, null);
        } else {
            c12607 = new C8345(abstractC10357, key, list, null);
        }
        return new AbstractMap.SimpleImmutableEntry(key, c12607);
    }
}
