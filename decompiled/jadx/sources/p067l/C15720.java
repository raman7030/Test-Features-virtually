package p067l;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܰ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C15720 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C9686 f45544;

    /* JADX INFO: renamed from: ᩸ */
    public final Iterator f45545;

    /* JADX INFO: renamed from: ᩹ */
    public final Collection f45546;

    public C15720(C9686 c9686) {
        Iterator it;
        this.f45544 = c9686;
        Collection collection = c9686.f26700;
        this.f45546 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f45545 = it;
    }

    public C15720(C12607 c12607, ListIterator listIterator) {
        this.f45544 = c12607;
        this.f45546 = c12607.f26700;
        this.f45545 = listIterator;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35776() {
        C9686 c9686 = this.f45544;
        c9686.m22581();
        if (c9686.f26700 != this.f45546) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m35776();
        return this.f45545.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m35776();
        return this.f45545.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f45545.remove();
        C9686 c9686 = this.f45544;
        AbstractC17970.m40900(c9686.f26698);
        c9686.m22582();
    }
}
