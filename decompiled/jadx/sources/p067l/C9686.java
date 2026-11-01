package p067l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C9686 extends AbstractCollection {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AbstractC17970 f26698;

    /* JADX INFO: renamed from: ۙ */
    public final Object f26699;

    /* JADX INFO: renamed from: ᩶ */
    public Collection f26700;

    /* JADX INFO: renamed from: ᩸ */
    public final C9686 f26701;

    /* JADX INFO: renamed from: ᩹ */
    public final Collection f26702;

    public C9686(AbstractC17970 abstractC17970, Object obj, List list, C9686 c9686) {
        this.f26698 = abstractC17970;
        this.f26699 = obj;
        this.f26700 = list;
        this.f26701 = c9686;
        this.f26702 = c9686 == null ? null : c9686.f26700;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22581() {
        Collection collection;
        C9686 c9686 = this.f26701;
        if (c9686 != null) {
            c9686.m22581();
            if (c9686.f26700 != this.f26702) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f26700.isEmpty() || (collection = (Collection) this.f26698.f53668.get(this.f26699)) == null) {
                return;
            }
            this.f26700 = collection;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22582() {
        C9686 c9686 = this.f26701;
        if (c9686 != null) {
            c9686.m22582();
        } else if (this.f26700.isEmpty()) {
            this.f26698.f53668.remove(this.f26699);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22580() {
        C9686 c9686 = this.f26701;
        if (c9686 == null) {
            this.f26698.f53668.put(this.f26699, this.f26700);
        } else {
            c9686.m22580();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m22581();
        return this.f26700.size();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m22581();
        return this.f26700.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m22581();
        return this.f26700.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m22581();
        return this.f26700.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m22581();
        return new C15720(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m22581();
        boolean zIsEmpty = this.f26700.isEmpty();
        boolean zAdd = this.f26700.add(obj);
        if (zAdd) {
            AbstractC17970.m40898(this.f26698);
            if (zIsEmpty) {
                m22580();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f26700.addAll(collection);
        if (zAddAll) {
            AbstractC17970.m40896(this.f26698, this.f26700.size() - size);
            if (size == 0) {
                m22580();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m22581();
        return this.f26700.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m22581();
        return this.f26700.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f26700.clear();
        AbstractC17970.m40899(this.f26698, size);
        m22582();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m22581();
        boolean zRemove = this.f26700.remove(obj);
        if (zRemove) {
            AbstractC17970.m40900(this.f26698);
            m22582();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f26700.removeAll(collection);
        if (zRemoveAll) {
            AbstractC17970.m40896(this.f26698, this.f26700.size() - size);
            m22582();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f26700.retainAll(collection);
        if (zRetainAll) {
            AbstractC17970.m40896(this.f26698, this.f26700.size() - size);
            m22582();
        }
        return zRetainAll;
    }
}
