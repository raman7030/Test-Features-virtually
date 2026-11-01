package p067l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩵ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9P6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20704 extends AbstractList implements InterfaceC24389 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f63928;

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i);

    public AbstractC20704(boolean z) {
        this.f63928 = z;
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
        m46786();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m46786();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        m46786();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m46786();
        super.clear();
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ۤ֫ */
    public boolean mo46785() {
        return this.f63928;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩶ */
    public void mo46787() {
        if (this.f63928) {
            this.f63928 = false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m46786();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        m46786();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        m46786();
        return super.retainAll(collection);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46786() {
        if (!this.f63928) {
            throw new UnsupportedOperationException();
        }
    }
}
