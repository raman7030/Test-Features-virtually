package l;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۧۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes4.dex */
public class C10773 extends C7699 implements List {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f32423;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10773(AbstractC16416 abstractC16416, Object obj, List list, C7699 c7699) {
        super(abstractC16416, obj, list, c7699);
        this.f32423 = abstractC16416;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f23787).addAll(i, collection);
        if (zAddAll) {
            AbstractC16416.m38680(this.f32423, this.f23787.size() - size);
            if (size == 0) {
                m20600();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m20601();
        return ((List) this.f23787).get(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m20601();
        return ((List) this.f23787).set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m20601();
        boolean zIsEmpty = this.f23787.isEmpty();
        ((List) this.f23787).add(i, obj);
        AbstractC16416.m38682(this.f32423);
        if (zIsEmpty) {
            m20600();
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m20601();
        Object objRemove = ((List) this.f23787).remove(i);
        AbstractC16416.m38684(this.f32423);
        m20602();
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m20601();
        return ((List) this.f23787).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m20601();
        return ((List) this.f23787).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m20601();
        return new C1600(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m20601();
        return new C1600(this, i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m20601();
        List listSubList = ((List) this.f23787).subList(i, i2);
        C7699 c7699 = this.f23788;
        if (c7699 == null) {
            c7699 = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractC16416 abstractC16416 = this.f32423;
        Object obj = this.f23786;
        if (!z) {
            return new C10773(abstractC16416, obj, listSubList, c7699);
        }
        return new C6288(abstractC16416, obj, listSubList, c7699);
    }
}
