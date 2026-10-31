package l;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۤ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NR */
/* JADX INFO: loaded from: classes3.dex */
public class C10293 extends AbstractList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f31006;

    public C10293(List list) {
        list.getClass();
        this.f31006 = list;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m26052() {
        return this.f31006;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f31006.add(m26050(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f31006.clear();
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m26050(int i) {
        int size = this.f31006.size();
        C4025.m12112(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f31006;
        int size = list.size();
        C4025.m12103(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.f31006;
        int size = list.size();
        C4025.m12103(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.f31006;
        int size = list.size();
        C4025.m12103(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31006.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.f31006;
        C4025.m12104(i, i2, list.size());
        return C7470.m20017(list.subList(m26050(i2), m26050(i)));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C12409(this, this.f31006.listIterator(m26050(i)));
    }
}
