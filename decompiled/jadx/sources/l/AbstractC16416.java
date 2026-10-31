package l;

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
public abstract class AbstractC16416 extends AbstractC14299 implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f50495;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient Map f50496;

    /* JADX INFO: renamed from: ᩻ */
    public abstract Collection mo13497();

    public AbstractC16416(Map map) {
        C4025.m12110(map.isEmpty());
        this.f50496 = map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38680(AbstractC16416 abstractC16416, int i) {
        abstractC16416.f50495 += i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38682(AbstractC16416 abstractC16416) {
        abstractC16416.f50495++;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38683(AbstractC16416 abstractC16416, int i) {
        abstractC16416.f50495 -= i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38684(AbstractC16416 abstractC16416) {
        abstractC16416.f50495--;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38685(Map map) {
        this.f50496 = map;
        this.f50495 = 0;
        for (Collection collection : map.values()) {
            C4025.m12110(!collection.isEmpty());
            this.f50495 = collection.size() + this.f50495;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map m38687() {
        return this.f50496;
    }

    @Override // l.InterfaceC0353
    public int size() {
        return this.f50495;
    }

    @Override // l.InterfaceC0353
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f50496.get(obj);
        if (collection == null) {
            Collection collectionMo13497 = mo13497();
            if (collectionMo13497.add(obj2)) {
                this.f50495++;
                this.f50496.put(obj, collectionMo13497);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.f50495++;
        return true;
    }

    @Override // l.InterfaceC0353
    public void clear() {
        Iterator it = this.f50496.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f50496.clear();
        this.f50495 = 0;
    }

    @Override // l.InterfaceC0353
    public Collection get(Object obj) {
        Collection collectionMo13497 = (Collection) this.f50496.get(obj);
        if (collectionMo13497 == null) {
            collectionMo13497 = mo13497();
        }
        AbstractC8405 abstractC8405 = (AbstractC8405) this;
        List list = (List) collectionMo13497;
        if (!(list instanceof RandomAccess)) {
            return new C10773(abstractC8405, obj, list, null);
        }
        return new C6288(abstractC8405, obj, list, null);
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ܽ */
    public Set mo1991() {
        return new C13343(this, this.f50496);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set m38688() {
        Map map = this.f50496;
        if (map instanceof NavigableMap) {
            return new C10522(this, (NavigableMap) this.f50496);
        }
        if (map instanceof SortedMap) {
            return new C23221(this, (SortedMap) this.f50496);
        }
        return new C13343(this, this.f50496);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38681(AbstractC16416 abstractC16416, Object obj) {
        Object objRemove;
        Map map = abstractC16416.f50496;
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
            abstractC16416.f50495 -= size;
        }
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo1992() {
        return new C17122(this);
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ۧ */
    public Map mo1990() {
        return new C20400(this, this.f50496);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map m38686() {
        Map map = this.f50496;
        if (map instanceof NavigableMap) {
            return new C12638(this, (NavigableMap) this.f50496);
        }
        if (map instanceof SortedMap) {
            return new C11933(this, (SortedMap) this.f50496);
        }
        return new C20400(this, this.f50496);
    }
}
