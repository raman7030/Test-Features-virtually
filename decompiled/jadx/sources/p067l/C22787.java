package p067l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩸ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes5.dex */
public final class C22787 extends AbstractC10066 implements InterfaceC3340, RandomAccess, Serializable, Cloneable, InterfaceC13515 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // p067l.AbstractC10066, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // p067l.InterfaceC3340
    public final int indexOf(int i) {
        return -1;
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // p067l.InterfaceC3340
    public final int lastIndexOf(int i) {
        return -1;
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.List, p067l.InterfaceC13515
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // p067l.InterfaceC3340
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final Integer mo5830(int i, Integer num) {
        throw null;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5832(InterfaceC6713 interfaceC6713) {
        throw null;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public final void mo5834(InterfaceC6713 interfaceC6713) {
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public final void mo5835(int[] iArr) {
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo5827(i, (Integer) obj);
        throw null;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        List list = (List) obj;
        return (list == this || list.isEmpty()) ? 0 : -1;
    }

    @Override // p067l.AbstractC10066, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C6023.f15086;
    }

    @Override // p067l.AbstractC10066, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ InterfaceC8705 iterator() {
        return C6023.f15086;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return C6023.f15086;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        listIterator(i);
        return C6023.f15086;
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        subList(i, i2);
        return this;
    }

    @Override // p067l.InterfaceC3340
    public final int getInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5872(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۘ */
    public final int mo5829(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p067l.InterfaceC13515
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5828(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo5827(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final Integer get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean add(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator() {
        return C6023.f15086;
    }

    @Override // p067l.AbstractC10066, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC16750 iterator() {
        return C6023.f15086;
    }

    @Override // p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator(int i) {
        if (i == 0) {
            return C6023.f15086;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        if (i != 0 || i3 != 0 || i2 < 0 || i2 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5824(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5831(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5833(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5826(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C14739.f42007;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    private Object readResolve() {
        return C14739.f42007;
    }
}
