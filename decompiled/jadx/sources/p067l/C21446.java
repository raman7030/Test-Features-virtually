package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩶ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PCGG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21446 extends AbstractC12293 implements RandomAccess, Serializable, Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸ */
    public final int f67647;

    public final Object clone() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }

    @Override // p067l.AbstractC12293, java.util.List, p067l.InterfaceC13515
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC12293
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28312(InterfaceC3340 interfaceC3340) {
        throw null;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5832(InterfaceC6713 interfaceC6713) {
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public final void mo5834(InterfaceC6713 interfaceC6713) {
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C11583(this.f67647);
    }

    @Override // p067l.AbstractC12293, java.util.List
    public final InterfaceC16750 listIterator() {
        return new C17421(this.f67647);
    }

    public C21446(int i) {
        this.f67647 = i;
    }

    @Override // p067l.InterfaceC3340
    public final int getInt(int i) {
        if (i == 0) {
            return this.f67647;
        }
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

    @Override // p067l.AbstractC12293, p067l.InterfaceC3360
    public final boolean contains(int i) {
        return i == this.f67647;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int indexOf(int i) {
        return i == this.f67647 ? 0 : -1;
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo5873() {
        return new int[]{this.f67647};
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return listIterator();
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC16750 iterator() {
        return listIterator();
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator(int i) {
        if (i > 1 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        InterfaceC16750 interfaceC16750ListIterator = listIterator();
        if (i == 1) {
            ((C17421) interfaceC16750ListIterator).nextInt();
        }
        return interfaceC16750ListIterator;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        m28310(i);
        m28310(i2);
        if (i <= i2) {
            return (i == 0 && i2 == 1) ? this : C14739.f42007;
        }
        throw new IndexOutOfBoundsException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // p067l.AbstractC23022, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    @Deprecated
    public final void forEach(Consumer consumer) {
        consumer.m45213n(Integer.valueOf(this.f67647));
    }

    @Override // p067l.AbstractC12293, java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, java.util.Collection, p067l.InterfaceC3456
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, java.util.List, p067l.InterfaceC13515
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5828(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        intConsumer.accept(this.f67647);
    }

    @Override // p067l.AbstractC12293
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28311(int i, InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18622(InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo23493(InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo23494(InterfaceC3360 interfaceC3360) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5871(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final Object[] toArray() {
        return new Object[]{Integer.valueOf(this.f67647)};
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C19768.m44906(i2, "Offset (", ") is negative"));
        }
        int i4 = i2 + i3;
        if (i4 > iArr.length) {
            throw new ArrayIndexOutOfBoundsException(C5410.m11876(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i4, "End index (", ") is greater than array length (")));
        }
        int i5 = i + i3;
        if (i5 > 1) {
            throw new IndexOutOfBoundsException(C19768.m44906(i5, "End index (", ") is greater than list size (1)"));
        }
        if (i3 <= 0) {
            return;
        }
        iArr[i2] = this.f67647;
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

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5833(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public final void mo5835(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5826(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        throw new UnsupportedOperationException();
    }
}
