package l;

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
public class C20400 extends AbstractC18699 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f65834;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final transient Map f65835;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f65835;
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
        Object c10773;
        Map map = this.f65835;
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
        AbstractC8405 abstractC8405 = (AbstractC8405) this.f65834;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c10773 = new C10773(abstractC8405, obj, list, null);
        } else {
            c10773 = new C6288(abstractC8405, obj, list, null);
        }
        return c10773;
    }

    public C20400(AbstractC16416 abstractC16416, Map map) {
        this.f65834 = abstractC16416;
        this.f65835 = map;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        return this.f65834.m34120();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f65835.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f65835.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC16416 abstractC16416 = this.f65834;
        Collection collectionMo13497 = abstractC16416.mo13497();
        collectionMo13497.addAll(collection);
        AbstractC16416.m38683(abstractC16416, collection.size());
        collection.clear();
        return collectionMo13497;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f65835.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f65835.hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f65835.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC16416 abstractC16416 = this.f65834;
        Map map = abstractC16416.f50496;
        Map map2 = this.f65835;
        if (map2 == map) {
            abstractC16416.clear();
            return;
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Collection collection = (Collection) entry.getValue();
            m46720(entry);
            C4025.m12115("no calls to next() since the last call to remove()", collection != null);
            it.remove();
            AbstractC16416.m38683(abstractC16416, collection.size());
            collection.clear();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractMap.SimpleImmutableEntry m46720(Map.Entry entry) {
        Object c10773;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        AbstractC8405 abstractC8405 = (AbstractC8405) this.f65834;
        List list = (List) collection;
        if (!(list instanceof RandomAccess)) {
            c10773 = new C10773(abstractC8405, key, list, null);
        } else {
            c10773 = new C6288(abstractC8405, key, list, null);
        }
        return new AbstractMap.SimpleImmutableEntry(key, c10773);
    }
}
