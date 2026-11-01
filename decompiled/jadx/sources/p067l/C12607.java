package p067l;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۧۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C12607 extends C9686 implements List {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractC17970 f35398;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12607(AbstractC17970 abstractC17970, Object obj, List list, C9686 c9686) {
        super(abstractC17970, obj, list, c9686);
        this.f35398 = abstractC17970;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f26700).addAll(i, collection);
        if (zAddAll) {
            AbstractC17970.m40896(this.f35398, this.f26700.size() - size);
            if (size == 0) {
                m22580();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m22581();
        return ((List) this.f26700).get(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m22581();
        return ((List) this.f26700).set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m22581();
        boolean zIsEmpty = this.f26700.isEmpty();
        ((List) this.f26700).add(i, obj);
        AbstractC17970.m40898(this.f35398);
        if (zIsEmpty) {
            m22580();
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m22581();
        Object objRemove = ((List) this.f26700).remove(i);
        AbstractC17970.m40900(this.f35398);
        m22582();
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m22581();
        return ((List) this.f26700).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m22581();
        return ((List) this.f26700).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m22581();
        return new C3889(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m22581();
        return new C3889(this, i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m22581();
        List listSubList = ((List) this.f26700).subList(i, i2);
        C9686 c9686 = this.f26701;
        if (c9686 == null) {
            c9686 = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractC17970 abstractC17970 = this.f35398;
        Object obj = this.f26699;
        if (!z) {
            return new C12607(abstractC17970, obj, listSubList, c9686);
        }
        return new C8345(abstractC17970, obj, listSubList, c9686);
    }
}
