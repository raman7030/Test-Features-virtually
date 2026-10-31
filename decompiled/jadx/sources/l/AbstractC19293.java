package l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩵ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9P6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19293 extends AbstractList implements InterfaceC23170 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f60698;

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i);

    public AbstractC19293(boolean z) {
        this.f60698 = z;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m44492();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m44492();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        m44492();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m44492();
        super.clear();
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean mo44491() {
        return this.f60698;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void mo44493() {
        if (this.f60698) {
            this.f60698 = false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m44492();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        m44492();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        m44492();
        return super.retainAll(collection);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44492() {
        if (!this.f60698) {
            throw new UnsupportedOperationException();
        }
    }
}
