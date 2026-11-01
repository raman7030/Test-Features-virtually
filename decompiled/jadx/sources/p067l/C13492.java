package p067l;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۨ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13492 extends AbstractList implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final List f37908;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC18263 f37909;

    public C13492(List list, InterfaceC18263 interfaceC18263) {
        list.getClass();
        this.f37908 = list;
        interfaceC18263.getClass();
        this.f37909 = interfaceC18263;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f37908.subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f37909.apply(this.f37908.get(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C8127(this, this.f37908.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f37908.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f37909.apply(this.f37908.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37908.size();
    }
}
