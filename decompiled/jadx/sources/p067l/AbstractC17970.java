package p067l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: l.ܽۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17970 extends AbstractC15958 implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: ۗ */
    public transient int f53667;

    /* JADX INFO: renamed from: ۙ */
    public transient Map f53668;

    /* JADX INFO: renamed from: ᩻ */
    public abstract Collection mo15386();

    public AbstractC17970(Map map) {
        C6194.m14030(map.isEmpty());
        this.f53668 = map;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40896(AbstractC17970 abstractC17970, int i) {
        abstractC17970.f53667 += i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m40898(AbstractC17970 abstractC17970) {
        abstractC17970.f53667++;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m40899(AbstractC17970 abstractC17970, int i) {
        abstractC17970.f53667 -= i;
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m40900(AbstractC17970 abstractC17970) {
        abstractC17970.f53667--;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40901(Map map) {
        this.f53668 = map;
        this.f53667 = 0;
        for (Collection collection : map.values()) {
            C6194.m14030(!collection.isEmpty());
            this.f53667 = collection.size() + this.f53667;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final Map m40903() {
        return this.f53668;
    }

    @Override // p067l.InterfaceC2704
    public int size() {
        return this.f53667;
    }

    @Override // p067l.InterfaceC2704
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f53668.get(obj);
        if (collection == null) {
            Collection collectionMo15386 = mo15386();
            if (collectionMo15386.add(obj2)) {
                this.f53667++;
                this.f53668.put(obj, collectionMo15386);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f53667++;
        return true;
    }

    @Override // p067l.InterfaceC2704
    public void clear() {
        Iterator it = this.f53668.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f53668.clear();
        this.f53667 = 0;
    }

    @Override // p067l.InterfaceC2704
    public Collection get(Object obj) {
        Collection collectionMo15386 = (Collection) this.f53668.get(obj);
        if (collectionMo15386 == null) {
            collectionMo15386 = mo15386();
        }
        AbstractC10357 abstractC10357 = (AbstractC10357) this;
        List list = (List) collectionMo15386;
        if (!(list instanceof RandomAccess)) {
            return new C12607(abstractC10357, obj, list, null);
        }
        return new C8345(abstractC10357, obj, list, null);
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ܽ */
    public Set mo4367() {
        return new C15050(this, this.f53668);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Set m40904() {
        Map map = this.f53668;
        if (map instanceof NavigableMap) {
            return new C12369(this, (NavigableMap) this.f53668);
        }
        if (map instanceof SortedMap) {
            return new C24438(this, (SortedMap) this.f53668);
        }
        return new C15050(this, this.f53668);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40897(AbstractC17970 abstractC17970, Object obj) {
        Object objRemove;
        Map map = abstractC17970.f53668;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC17970.f53667 -= size;
        }
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo4368() {
        return new C18641(this);
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ۧ */
    public Map mo4366() {
        return new C21757(this, this.f53668);
    }

    /* JADX INFO: renamed from: ۜ */
    public final Map m40902() {
        Map map = this.f53668;
        if (map instanceof NavigableMap) {
            return new C14380(this, (NavigableMap) this.f53668);
        }
        if (map instanceof SortedMap) {
            return new C13710(this, (SortedMap) this.f53668);
        }
        return new C21757(this, this.f53668);
    }
}
