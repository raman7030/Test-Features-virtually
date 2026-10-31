package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22516 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20400 f72863;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Collection f72864;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f72865;

    public C22516(C20400 c20400) {
        this.f72863 = c20400;
        this.f72865 = c20400.f65835.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72865.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f72865.next();
        this.f72864 = (Collection) entry.getValue();
        return this.f72863.m46720(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C4025.m12115("no calls to next() since the last call to remove()", this.f72864 != null);
        this.f72865.remove();
        AbstractC16416.m38683(this.f72863.f65834, this.f72864.size());
        this.f72864.clear();
        this.f72864 = null;
    }
}
