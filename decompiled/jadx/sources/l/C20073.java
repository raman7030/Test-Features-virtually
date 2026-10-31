package l;

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
public final class C20073 extends AbstractC10442 implements RandomAccess, Serializable, Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f65006;

    public final Object clone() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }

    @Override // l.AbstractC10442, java.util.List, l.InterfaceC11728
    @Deprecated
    public final void sort(Comparator comparator) {
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC10442
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26283(InterfaceC1022 interfaceC1022) {
        throw null;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3545(InterfaceC4571 interfaceC4571) {
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public final void mo3547(InterfaceC4571 interfaceC4571) {
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C9695(this.f65006);
    }

    @Override // l.AbstractC10442, java.util.List
    public final InterfaceC15132 listIterator() {
        return new C15838(this.f65006);
    }

    public C20073(int i) {
        this.f65006 = i;
    }

    @Override // l.InterfaceC1022
    public final int getInt(int i) {
        if (i == 0) {
            return this.f65006;
        }
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

    @Override // l.AbstractC10442, l.InterfaceC1043
    public final boolean contains(int i) {
        return i == this.f65006;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int indexOf(int i) {
        return i == this.f65006 ? 0 : -1;
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public final int[] mo3586() {
        return new int[]{this.f65006};
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return listIterator();
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC15132 iterator() {
        return listIterator();
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator(int i) {
        if (i > 1 || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        InterfaceC15132 interfaceC15132ListIterator = listIterator();
        if (i == 1) {
            ((C15838) interfaceC15132ListIterator).nextInt();
        }
        return interfaceC15132ListIterator;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        m26281(i);
        m26281(i2);
        if (i <= i2) {
            return (i == 0 && i2 == 1) ? this : C13016.f38960;
        }
        throw new IndexOutOfBoundsException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // l.AbstractC21731, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    @Deprecated
    public final void forEach(Consumer consumer) {
        consumer.n(Integer.valueOf(this.f65006));
    }

    @Override // l.AbstractC10442, java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, java.util.Collection, l.InterfaceC1144
    @Deprecated
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, java.util.List, l.InterfaceC11728
    @Deprecated
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3541(IntUnaryOperator intUnaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        intConsumer.accept(this.f65006);
    }

    @Override // l.AbstractC10442
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26282(int i, InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, l.AbstractC21731
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16696(InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo21525(InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo21526(InterfaceC1043 interfaceC1043) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3584(IntPredicate intPredicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public final Object[] toArray() {
        return new Object[]{Integer.valueOf(this.f65006)};
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C18307.m42645(i2, "Offset (", ") is negative"));
        }
        int i4 = i2 + i3;
        if (i4 > iArr.length) {
            throw new ArrayIndexOutOfBoundsException(C3200.m9831(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i4, "End index (", ") is greater than array length (")));
        }
        int i5 = i + i3;
        if (i5 > 1) {
            throw new IndexOutOfBoundsException(C18307.m42645(i5, "End index (", ") is greater than list size (1)"));
        }
        if (i3 <= 0) {
            return;
        }
        iArr[i2] = this.f65006;
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

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3546(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public final void mo3548(int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3539(int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10442, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        throw new UnsupportedOperationException();
    }
}
