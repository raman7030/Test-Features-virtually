package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5663 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Iterator f13779;

    /* JADX INFO: renamed from: ᩸ */
    public Map.Entry f13780;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C15050 f13781;

    public C5663(C15050 c15050, Iterator it) {
        this.f13779 = it;
        this.f13781 = c15050;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13779.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f13779.next();
        this.f13780 = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6194.m14035("no calls to next() since the last call to remove()", this.f13780 != null);
        Collection collection = (Collection) this.f13780.getValue();
        this.f13779.remove();
        AbstractC17970.m40899(this.f13781.f42984, collection.size());
        collection.clear();
        this.f13780 = null;
    }
}
