package p067l;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܰ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C15502 extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final List f44295;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18263 f44296;

    public C15502(List list, InterfaceC18263 interfaceC18263) {
        list.getClass();
        this.f44295 = list;
        interfaceC18263.getClass();
        this.f44296 = interfaceC18263;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f44295.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44295.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f44295.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C24220(this, this.f44295.listIterator(i));
    }
}
