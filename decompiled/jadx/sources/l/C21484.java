package l;

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
public final class C21484 extends AbstractC8099 implements InterfaceC1022, RandomAccess, Serializable, Cloneable, InterfaceC11728 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.AbstractC8099, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // l.InterfaceC1022
    public final int indexOf(int i) {
        return -1;
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // l.InterfaceC1022
    public final int lastIndexOf(int i) {
        return -1;
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.List, l.InterfaceC11728
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // l.InterfaceC1022
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final Integer mo3543(int i, Integer num) {
        throw null;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3545(InterfaceC4571 interfaceC4571) {
        throw null;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public final void mo3547(InterfaceC4571 interfaceC4571) {
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public final void mo3548(int[] iArr) {
        throw null;
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo3540(i, (Integer) obj);
        throw null;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        List list = (List) obj;
        return (list == this || list.isEmpty()) ? 0 : -1;
    }

    @Override // l.AbstractC8099, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return C3845.f12278;
    }

    @Override // l.AbstractC8099, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ InterfaceC6667 iterator() {
        return C3845.f12278;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return C3845.f12278;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        listIterator(i);
        return C3845.f12278;
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

    @Override // l.InterfaceC1022
    public final int getInt(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo3585(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۘ */
    public final int mo3542(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC11728
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3541(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo3540(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final Integer get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
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

    @Override // l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator() {
        return C3845.f12278;
    }

    @Override // l.AbstractC8099, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC15132 iterator() {
        return C3845.f12278;
    }

    @Override // l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator(int i) {
        if (i == 0) {
            return C3845.f12278;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        if (i != 0 || i3 != 0 || i2 < 0 || i2 > iArr.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3537(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3544(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3546(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3539(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C13016.f38960;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    private Object readResolve() {
        return C13016.f38960;
    }
}
