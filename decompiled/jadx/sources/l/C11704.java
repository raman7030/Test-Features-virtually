package l;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۨ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11704 extends AbstractList implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f34909;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC16724 f34910;

    public C11704(List list, InterfaceC16724 interfaceC16724) {
        list.getClass();
        this.f34909 = list;
        interfaceC16724.getClass();
        this.f34910 = interfaceC16724;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f34909.subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f34910.apply(this.f34909.get(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C6059(this, this.f34909.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f34909.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f34910.apply(this.f34909.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34909.size();
    }
}
