package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۬᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C15050 extends C10752 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC17970 f42984;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15050(AbstractC17970 abstractC17970, Map map) {
        super(map);
        this.f42984 = abstractC17970;
    }

    @Override // p067l.C10752, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C5663 c5663 = (C5663) it;
            if (!c5663.hasNext()) {
                return;
            }
            c5663.next();
            c5663.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f29815.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f29815.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29815.keySet().hashCode();
    }

    @Override // p067l.C10752, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5663(this, this.f29815.entrySet().iterator());
    }

    @Override // p067l.C10752, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f29815.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            AbstractC17970.m40899(this.f42984, size);
        } else {
            size = 0;
        }
        return size > 0;
    }
}
