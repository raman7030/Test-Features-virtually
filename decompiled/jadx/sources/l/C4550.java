package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ۙۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes3.dex */
public class C4550 extends C21505 implements InterfaceC1022, InterfaceC11728 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC1022 f14520;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(parallelStream());
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(stream());
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
    public final void mo3548(int[] iArr) {
        throw null;
    }

    @Override // l.InterfaceC1043
    public final boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1043
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo3585(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final int size() {
        return this.f69165.size();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f69165.isEmpty();
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f69165.contains(i);
    }

    @Override // l.C21505, l.InterfaceC1043, java.util.Collection, java.lang.Iterable
    public final InterfaceC16749 spliterator() {
        return this.f69165.spliterator();
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public final InterfaceC17664 stream() {
        return this.f69165.stream();
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public final InterfaceC17664 parallelStream() {
        return this.f69165.parallelStream();
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        return this.f69165.toArray(objArr);
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f69165.toArray();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        return this.f69165.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3584(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C21505, l.InterfaceC1043
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean add(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.f69165.contains(obj);
    }

    @Override // l.InterfaceC1043, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo3586() {
        return this.f69165.mo3586();
    }

    public final String toString() {
        return this.f69165.toString();
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo3540(i, (Integer) obj);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14520.compareTo((List) obj);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4550(InterfaceC1022 interfaceC1022) {
        super(interfaceC1022);
        this.f14520 = interfaceC1022;
    }

    @Override // l.InterfaceC1022
    public final int getInt(int i) {
        return this.f14520.getInt(i);
    }

    @Override // l.InterfaceC1022
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۘ */
    public final int mo3542(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    public final int indexOf(int i) {
        return this.f14520.indexOf(i);
    }

    @Override // l.InterfaceC1022
    public final int lastIndexOf(int i) {
        return this.f14520.lastIndexOf(i);
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
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        this.f14520.mo3538(i, i2, i3, iArr);
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

    @Override // java.util.List
    public final InterfaceC15132 listIterator() {
        return new C2434(this.f14520.listIterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // l.InterfaceC1043, java.util.Collection, java.lang.Iterable, l.InterfaceC14427
    public final InterfaceC6667 iterator() {
        return listIterator();
    }

    @Override // l.InterfaceC1043, java.util.Collection, java.lang.Iterable, l.InterfaceC14427
    public final InterfaceC15132 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final InterfaceC15132 listIterator(int i) {
        return new C2434(this.f14520.listIterator(i));
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.f69165.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f69165.hashCode();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3541(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final Integer get(int i) {
        return this.f14520.get(i);
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        return this.f14520.get(i);
    }

    @Override // l.InterfaceC1022
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo3540(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return this.f14520.indexOf(obj);
    }

    @Override // l.InterfaceC1022, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return this.f14520.lastIndexOf(obj);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public final void mo3547(InterfaceC4571 interfaceC4571) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, l.InterfaceC11728
    @Deprecated
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
