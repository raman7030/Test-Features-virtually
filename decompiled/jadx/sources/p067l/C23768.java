package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23768 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21757 f75589;

    /* JADX INFO: renamed from: ᩸ */
    public Collection f75590;

    /* JADX INFO: renamed from: ᩹ */
    public final Iterator f75591;

    public C23768(C21757 c21757) {
        this.f75589 = c21757;
        this.f75591 = c21757.f68511.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75591.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f75591.next();
        this.f75590 = (Collection) entry.getValue();
        return this.f75589.m49043(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6194.m14035("no calls to next() since the last call to remove()", this.f75590 != null);
        this.f75591.remove();
        AbstractC17970.m40899(this.f75589.f68510, this.f75590.size());
        this.f75590.clear();
        this.f75590 = null;
    }
}
