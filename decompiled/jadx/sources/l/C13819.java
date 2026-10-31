package l;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܰ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13819 extends AbstractSequentialList implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f41217;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC16724 f41218;

    public C13819(List list, InterfaceC16724 interfaceC16724) {
        list.getClass();
        this.f41217 = list;
        interfaceC16724.getClass();
        this.f41218 = interfaceC16724;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f41217.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41217.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f41217.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C22992(this, this.f41217.listIterator(i));
    }
}
