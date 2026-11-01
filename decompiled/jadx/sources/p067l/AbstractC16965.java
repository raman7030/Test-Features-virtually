package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܶܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16965 extends AbstractC6238 implements InterfaceC6948, InterfaceC13515 {
    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C12174.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo6348(((Float) obj).floatValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(mo6343(((Float) obj).floatValue(), i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38559(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C19768.m44906(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Index (", ") is greater than list size (");
        sbM34408.append(size());
        sbM34408.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38560(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C19768.m44906(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Index (", ") is greater than or equal to list size (");
        sbM34408.append(size());
        sbM34408.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18327 spliterator() {
        if (this instanceof RandomAccess) {
            return new C10261(this);
        }
        return new C8940(listIterator(0), C6406.m14669(this), 16720);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void sort(Comparator comparator) {
        InterfaceC8960 c22372;
        if (comparator == null || (comparator instanceof InterfaceC8960)) {
            c22372 = (InterfaceC8960) comparator;
        } else {
            c22372 = new C22372(comparator);
        }
        mo15924(c22372);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC12984) {
            return mo6347(i, (InterfaceC12984) collection);
        }
        m38559(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo6348(((Float) it.next()).floatValue(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC5607 interfaceC5607ListIterator = listIterator(0);
        int size = size();
        int iFloatToRawIntBits = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits = (iFloatToRawIntBits * 31) + Float.floatToRawIntBits(interfaceC5607ListIterator.nextFloat());
            size = i;
        }
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public InterfaceC3595 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.InterfaceC6948, java.util.List
    public final InterfaceC5607 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo15925(float f) {
        InterfaceC5607 interfaceC5607ListIterator = listIterator(0);
        while (interfaceC5607ListIterator.hasNext()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(interfaceC5607ListIterator.nextFloat())) {
                return interfaceC5607ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18969(float f) {
        return mo15925(f) >= 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo15923(float f) {
        InterfaceC5607 interfaceC5607ListIterator = listIterator(size());
        while (interfaceC5607ListIterator.hasPrevious()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(interfaceC5607ListIterator.mo4648())) {
                return interfaceC5607ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC2924
    /* JADX INFO: renamed from: ۧ */
    public void mo4794(InterfaceC6278 interfaceC6278) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC6278);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC6278.mo14251(getFloat(i));
        }
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C12826.requireNonNull(unaryOperator);
        InterfaceC11623 interfaceC11623 = unaryOperator instanceof InterfaceC11623 ? (InterfaceC11623) unaryOperator : new InterfaceC11623() { // from class: l.᩶ᩳᩴ
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                return C8626.$default$andThen(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                return C8626.$default$compose(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p067l.InterfaceC11623
            /* JADX INFO: renamed from: ۧ */
            public final float mo26741(float f) {
                return ((Float) unaryOperator.apply(Float.valueOf(f))).floatValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Float.valueOf(mo26741(((Float) obj).floatValue()));
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                return mo26741(C5065.m10797(d));
            }
        };
        InterfaceC5607 interfaceC5607ListIterator = listIterator(0);
        while (interfaceC5607ListIterator.hasNext()) {
            interfaceC5607ListIterator.mo4646(interfaceC11623.mo26741(interfaceC5607ListIterator.nextFloat()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo6344(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo15925(((Float) obj).floatValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return mo15923(((Float) obj).floatValue());
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof InterfaceC6948) {
                    InterfaceC5607 interfaceC5607ListIterator = listIterator(0);
                    InterfaceC5607 interfaceC5607ListIterator2 = ((InterfaceC6948) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC5607ListIterator.nextFloat() != interfaceC5607ListIterator2.nextFloat()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC5607 interfaceC5607ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C12826.equals(interfaceC5607ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC6948) {
                InterfaceC5607 interfaceC5607ListIterator = listIterator(0);
                InterfaceC5607 interfaceC5607ListIterator2 = ((InterfaceC6948) list).listIterator();
                while (interfaceC5607ListIterator.hasNext() && interfaceC5607ListIterator2.hasNext()) {
                    int iCompare = Float.compare(interfaceC5607ListIterator.nextFloat(), interfaceC5607ListIterator2.nextFloat());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC5607ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC5607ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC5607 interfaceC5607ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC5607ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC5607ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC5607ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Float.valueOf(mo6349(i));
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo15924(InterfaceC8960 interfaceC8960) {
        float[] fArr;
        int size = size();
        if (size == 0) {
            fArr = C15624.f44707;
        } else {
            float[] fArr2 = new float[size];
            mo6345(0, 0, size, fArr2);
            fArr = fArr2;
        }
        if (interfaceC8960 == null) {
            C15624.m35506(0, fArr.length, fArr, null);
        } else {
            C15624.m35507(fArr, 0, fArr.length, interfaceC8960, null);
        }
        mo6346(0, fArr.length, fArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo6347(int i, InterfaceC12984 interfaceC12984) {
        m38559(i);
        InterfaceC3595 it = interfaceC12984.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo6348(it.nextFloat(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC6238
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14151(InterfaceC12984 interfaceC12984) {
        return mo6347(size(), interfaceC12984);
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC5607 interfaceC5607ListIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(String.valueOf(interfaceC5607ListIterator.nextFloat()));
                size = i;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
