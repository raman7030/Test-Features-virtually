package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3466 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f10978;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Map.Entry f10979;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13343 f10980;

    public C3466(C13343 c13343, Iterator it) {
        this.f10978 = it;
        this.f10980 = c13343;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10978.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f10978.next();
        this.f10979 = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4025.m12115("no calls to next() since the last call to remove()", this.f10979 != null);
        Collection collection = (Collection) this.f10979.getValue();
        this.f10978.remove();
        AbstractC16416.m38683(this.f10980.f39918, collection.size());
        collection.clear();
        this.f10979 = null;
    }
}
