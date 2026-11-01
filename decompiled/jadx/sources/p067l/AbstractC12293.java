package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۤܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12293 extends AbstractC23022 implements InterfaceC3340, InterfaceC13515 {
    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C12174.$default$spliterator(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo5827(i, (Integer) obj);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return remove(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return mo5830(i, (Integer) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28310(int i) {
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
    public final void m28314(int i) {
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

    @Override // p067l.InterfaceC3340
    public void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    public boolean add(int i) {
        add(size(), i);
        return true;
    }

    @Override // p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18287 spliterator() {
        if (this instanceof RandomAccess) {
            return new C21681(this);
        }
        return new C10912(iterator(), C6406.m14669(this), 16720);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public void sort(Comparator comparator) {
        InterfaceC6713 c5372;
        if (comparator == null || (comparator instanceof InterfaceC6713)) {
            c5372 = (InterfaceC6713) comparator;
        } else {
            c5372 = new C5372(comparator);
        }
        mo5834(c5372);
    }

    @Override // p067l.InterfaceC3340
    public int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC3360) {
            return mo28311(i, (InterfaceC3360) collection);
        }
        m28310(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, ((Integer) it.next()).intValue());
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public InterfaceC16750 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public InterfaceC16750 listIterator() {
        return listIterator(0);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public void mo5833(int[] iArr) {
        mo5835(iArr);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public void mo5835(int[] iArr) {
        mo5826(0, iArr.length, iArr);
    }

    @Override // p067l.InterfaceC3360
    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public int indexOf(int i) {
        InterfaceC16750 interfaceC16750ListIterator = listIterator();
        while (interfaceC16750ListIterator.hasNext()) {
            if (i == interfaceC16750ListIterator.nextInt()) {
                return interfaceC16750ListIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(int i) {
        InterfaceC16750 interfaceC16750ListIterator = listIterator(size());
        while (interfaceC16750ListIterator.hasPrevious()) {
            if (i == interfaceC16750ListIterator.mo7885()) {
                return interfaceC16750ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public void mo5827(int i, Integer num) {
        add(i, num.intValue());
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC16080
    public void forEach(IntConsumer intConsumer) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(intConsumer);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            intConsumer.accept(getInt(i));
        }
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public void mo5828(IntUnaryOperator intUnaryOperator) {
        InterfaceC16750 interfaceC16750ListIterator = listIterator();
        while (interfaceC16750ListIterator.hasNext()) {
            interfaceC16750ListIterator.mo7883(intUnaryOperator.applyAsInt(interfaceC16750ListIterator.nextInt()));
        }
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public void replaceAll(final UnaryOperator unaryOperator) {
        C12826.requireNonNull(unaryOperator);
        mo5828(unaryOperator instanceof IntUnaryOperator ? (IntUnaryOperator) unaryOperator : new IntUnaryOperator() { // from class: l.֡ۡᩴ
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C17342.$default$andThen(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return ((Integer) unaryOperator.apply(Integer.valueOf(i))).intValue();
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C17342.$default$compose(this, intUnaryOperator);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo5824(0, size());
    }

    @Override // java.util.List
    public final Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC16750 it = iterator();
        int size = size();
        int iNextInt = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iNextInt;
            }
            iNextInt = (iNextInt * 31) + it.nextInt();
            size = i;
        }
    }

    @Override // p067l.InterfaceC3340, java.util.List
    public final int indexOf(Object obj) {
        return indexOf(((Integer) obj).intValue());
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof InterfaceC3340) {
            InterfaceC16750 interfaceC16750ListIterator = listIterator();
            InterfaceC16750 interfaceC16750ListIterator2 = ((InterfaceC3340) list).listIterator();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (interfaceC16750ListIterator.nextInt() != interfaceC16750ListIterator2.nextInt()) {
                    return false;
                }
                size = i;
            }
        } else {
            InterfaceC16750 interfaceC16750ListIterator3 = listIterator();
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!C12826.equals(interfaceC16750ListIterator3.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // p067l.InterfaceC3340, java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Integer) obj).intValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public int compareTo(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof InterfaceC3340) {
            InterfaceC16750 interfaceC16750ListIterator = listIterator();
            InterfaceC16750 interfaceC16750ListIterator2 = ((InterfaceC3340) list).listIterator();
            while (interfaceC16750ListIterator.hasNext() && interfaceC16750ListIterator2.hasNext()) {
                int iCompare = Integer.compare(interfaceC16750ListIterator.nextInt(), interfaceC16750ListIterator2.nextInt());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (interfaceC16750ListIterator2.hasNext()) {
                return -1;
            }
            return interfaceC16750ListIterator.hasNext() ? 1 : 0;
        }
        InterfaceC16750 interfaceC16750ListIterator3 = listIterator();
        ListIterator listIterator = list.listIterator();
        while (interfaceC16750ListIterator3.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) interfaceC16750ListIterator3.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return interfaceC16750ListIterator3.hasNext() ? 1 : 0;
    }

    @Override // p067l.InterfaceC3340, java.util.List
    public Integer remove(int i) {
        return Integer.valueOf(mo5829(i));
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public Integer mo5830(int i, Integer num) {
        return Integer.valueOf(set(i, num.intValue()));
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m28313() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return mo5829(size() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28312(InterfaceC3340 interfaceC3340) {
        C17441 c17441 = (C17441) this;
        return c17441.m39768(c17441.f52159, interfaceC3340);
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ܶ */
    public int[] mo5873() {
        int size = size();
        if (size == 0) {
            return C20796.f65364;
        }
        int[] iArr = new int[size];
        mo5825(0, 0, size, iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28311(int i, InterfaceC3360 interfaceC3360) {
        m28310(i);
        InterfaceC8705 it = interfaceC3360.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.nextInt());
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ֫ */
    public boolean mo18622(InterfaceC3360 interfaceC3360) {
        return mo28311(size(), interfaceC3360);
    }

    @Override // p067l.AbstractC23022, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC16750 it = iterator();
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
                sb.append(String.valueOf(it.nextInt()));
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

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public void mo5834(InterfaceC6713 interfaceC6713) {
        if (interfaceC6713 == null) {
            mo5832(interfaceC6713);
            return;
        }
        int[] iArrMo5873 = mo5873();
        C20796.m46956(iArrMo5873, 0, iArrMo5873.length, interfaceC6713, (int[]) null);
        mo5833(iArrMo5873);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public void mo5832(InterfaceC6713 interfaceC6713) {
        int[] iArrMo5873 = mo5873();
        if (interfaceC6713 == null) {
            C20796.m46954(iArrMo5873.length, iArrMo5873);
        } else {
            C20796.m46955(iArrMo5873, 0, iArrMo5873.length, interfaceC6713);
        }
        mo5833(iArrMo5873);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
