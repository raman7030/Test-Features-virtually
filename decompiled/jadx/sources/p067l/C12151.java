package p067l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۤ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public class C12151 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final List f33969;

    public C12151(List list) {
        list.getClass();
        this.f33969 = list;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m28076() {
        return this.f33969;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f33969.add(m28074(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f33969.clear();
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m28074(int i) {
        int size = this.f33969.size();
        C6194.m14032(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f33969;
        int size = list.size();
        C6194.m14023(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f33969;
        int size = list.size();
        C6194.m14023(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f33969;
        int size = list.size();
        C6194.m14023(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33969.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f33969;
        C6194.m14024(i, i2, list.size());
        return C9468.m21992(list.subList(m28074(i2), m28074(i)));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C14162(this, this.f33969.listIterator(m28074(i)));
    }
}
