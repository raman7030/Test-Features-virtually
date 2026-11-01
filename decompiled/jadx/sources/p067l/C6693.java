package p067l;

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
public class C6693 extends C22807 implements InterfaceC3340, InterfaceC13515 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC3340 f17350;

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C19828.convert(parallelStream());
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final Integer remove(int i) {
        throw null;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C19828.convert(stream());
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
    public final void mo5835(int[] iArr) {
        throw null;
    }

    @Override // p067l.InterfaceC3360
    public final boolean add(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3360
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5872(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final int size() {
        return this.f71862.size();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f71862.isEmpty();
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        return this.f71862.contains(i);
    }

    @Override // p067l.C22807, p067l.InterfaceC3360, java.util.Collection, java.lang.Iterable
    public final InterfaceC18287 spliterator() {
        return this.f71862.spliterator();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public final InterfaceC19157 stream() {
        return this.f71862.stream();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public final InterfaceC19157 parallelStream() {
        return this.f71862.parallelStream();
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        return this.f71862.toArray(objArr);
    }

    @Override // java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f71862.toArray();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        return this.f71862.containsAll(collection);
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

    @Override // p067l.InterfaceC3360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5871(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.C22807, p067l.InterfaceC3360
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final boolean add(Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public final boolean contains(Object obj) {
        return this.f71862.contains(obj);
    }

    @Override // p067l.InterfaceC3360, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo5873() {
        return this.f71862.mo5873();
    }

    public final String toString() {
        return this.f71862.toString();
    }

    @Override // java.util.List
    @Deprecated
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo5827(i, (Integer) obj);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17350.compareTo((List) obj);
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public C6693(InterfaceC3340 interfaceC3340) {
        super(interfaceC3340);
        this.f17350 = interfaceC3340;
    }

    @Override // p067l.InterfaceC3340
    public final int getInt(int i) {
        return this.f17350.getInt(i);
    }

    @Override // p067l.InterfaceC3340
    public final int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    public final void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۘ */
    public final int mo5829(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    public final int indexOf(int i) {
        return this.f17350.indexOf(i);
    }

    @Override // p067l.InterfaceC3340
    public final int lastIndexOf(int i) {
        return this.f17350.lastIndexOf(i);
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
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        this.f17350.mo5825(i, i2, i3, iArr);
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

    @Override // java.util.List
    public final InterfaceC16750 listIterator() {
        return new C4682(this.f17350.listIterator());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection, java.lang.Iterable, p067l.InterfaceC16080
    public final InterfaceC8705 iterator() {
        return listIterator();
    }

    @Override // p067l.InterfaceC3360, java.util.Collection, java.lang.Iterable, p067l.InterfaceC16080
    public final InterfaceC16750 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final InterfaceC16750 listIterator(int i) {
        return new C4682(this.f17350.listIterator(i));
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.f71862.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f71862.hashCode();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5828(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final Integer get(int i) {
        return this.f17350.get(i);
    }

    @Override // java.util.List
    @Deprecated
    public final Object get(int i) {
        return this.f17350.get(i);
    }

    @Override // p067l.InterfaceC3340
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo5827(int i, Integer num) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final int indexOf(Object obj) {
        return this.f17350.indexOf(obj);
    }

    @Override // p067l.InterfaceC3340, java.util.List
    @Deprecated
    public final int lastIndexOf(Object obj) {
        return this.f17350.lastIndexOf(obj);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public final void mo5834(InterfaceC6713 interfaceC6713) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, p067l.InterfaceC13515
    @Deprecated
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
