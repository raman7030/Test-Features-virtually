package p067l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܽۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 52O */
/* JADX INFO: loaded from: classes5.dex */
public final class C17994 extends AbstractC6457 implements InterfaceC3913, RandomAccess, Serializable, Cloneable, InterfaceC13515 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // p067l.AbstractC6457, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void sort(Comparator comparator) {
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        List list = (List) obj;
        return (list == this || list.isEmpty()) ? 0 : -1;
    }

    @Override // p067l.AbstractC6457, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C23891.f75877;
    }

    @Override // p067l.AbstractC6457, p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ InterfaceC13833 iterator() {
        return C23891.f75877;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return C23891.f75877;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        listIterator(i);
        return C23891.f75877;
    }

    @Override // java.util.List
    public final Object get(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3913, java.util.List
    public final InterfaceC12631 listIterator() {
        return C23891.f75877;
    }

    @Override // p067l.InterfaceC3913, java.util.List
    public final InterfaceC12631 listIterator(int i) {
        if (i == 0) {
            return C23891.f75877;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7735(int i, int i2, int i3, Object[] objArr) {
        if (i != 0 || i3 != 0 || i2 < 0 || i2 > objArr.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7734(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7736(int i, int i2, Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C19336.f57728;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    private Object readResolve() {
        return C19336.f57728;
    }
}
