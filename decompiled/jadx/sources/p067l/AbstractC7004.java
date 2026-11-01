package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7004 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC17970 f18253;

    /* JADX INFO: renamed from: ᩶ */
    public final Iterator f18254;

    /* JADX INFO: renamed from: ᩹ */
    public Object f18256 = null;

    /* JADX INFO: renamed from: ᩸ */
    public Collection f18255 = null;

    /* JADX INFO: renamed from: ۗ */
    public Iterator f18252 = EnumC3433.INSTANCE;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo16115(Object obj, Object obj2);

    public AbstractC7004(AbstractC17970 abstractC17970) {
        this.f18253 = abstractC17970;
        this.f18254 = abstractC17970.f53668.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18254.hasNext() || this.f18252.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18252.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f18254.next();
            this.f18256 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f18255 = collection;
            this.f18252 = collection.iterator();
        }
        return this.f18252.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18252.remove();
        Collection collection = this.f18255;
        C12826.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f18254.remove();
        }
        AbstractC17970.m40900(this.f18253);
    }
}
