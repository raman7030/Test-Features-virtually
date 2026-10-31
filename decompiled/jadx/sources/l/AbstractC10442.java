package l;

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
public abstract class AbstractC10442 extends AbstractC21731 implements InterfaceC1022, InterfaceC11728 {
    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C10317.$default$spliterator(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo3540(i, (Integer) obj);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return remove(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return mo3543(i, (Integer) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26281(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Index (", ") is greater than list size (");
        sbM32308.append(size());
        sbM32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26285(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Index (", ") is greater than or equal to list size (");
        sbM32308.append(size());
        sbM32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }

    @Override // l.InterfaceC1022
    public void add(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    public boolean add(int i) {
        add(size(), i);
        return true;
    }

    @Override // l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16749 spliterator() {
        if (this instanceof RandomAccess) {
            return new C20320(this);
        }
        return new C8989(iterator(), C4248.m12789(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC11728
    public void sort(Comparator comparator) {
        InterfaceC4571 c3160;
        if (comparator == null || (comparator instanceof InterfaceC4571)) {
            c3160 = (InterfaceC4571) comparator;
        } else {
            c3160 = new C3160(comparator);
        }
        mo3547(c3160);
    }

    @Override // l.InterfaceC1022
    public int set(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC1043) {
            return mo26282(i, (InterfaceC1043) collection);
        }
        m26281(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, ((Integer) it.next()).intValue());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public InterfaceC15132 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public InterfaceC15132 listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public void mo3546(int[] iArr) {
        mo3548(iArr);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public void mo3548(int[] iArr) {
        mo3539(0, iArr.length, iArr);
    }

    @Override // l.InterfaceC1043
    public boolean contains(int i) {
        return indexOf(i) >= 0;
    }

    public int indexOf(int i) {
        InterfaceC15132 interfaceC15132ListIterator = listIterator();
        while (interfaceC15132ListIterator.hasNext()) {
            if (i == interfaceC15132ListIterator.nextInt()) {
                return interfaceC15132ListIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(int i) {
        InterfaceC15132 interfaceC15132ListIterator = listIterator(size());
        while (interfaceC15132ListIterator.hasPrevious()) {
            if (i == interfaceC15132ListIterator.mo5655()) {
                return interfaceC15132ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public void mo3540(int i, Integer num) {
        add(i, num.intValue());
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
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

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public void mo3541(IntUnaryOperator intUnaryOperator) {
        InterfaceC15132 interfaceC15132ListIterator = listIterator();
        while (interfaceC15132ListIterator.hasNext()) {
            interfaceC15132ListIterator.mo5653(intUnaryOperator.applyAsInt(interfaceC15132ListIterator.nextInt()));
        }
    }

    @Override // java.util.List, l.InterfaceC11728
    public void replaceAll(final UnaryOperator unaryOperator) {
        C11003.requireNonNull(unaryOperator);
        mo3541(unaryOperator instanceof IntUnaryOperator ? (IntUnaryOperator) unaryOperator : new IntUnaryOperator() { // from class: l.֡ۡᩴ
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C15755.$default$andThen(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return ((Integer) unaryOperator.apply(Integer.valueOf(i))).intValue();
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C15755.$default$compose(this, intUnaryOperator);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo3537(0, size());
    }

    @Override // java.util.List
    public final Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC15132 it = iterator();
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

    @Override // l.InterfaceC1022, java.util.List
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
        if (list instanceof InterfaceC1022) {
            InterfaceC15132 interfaceC15132ListIterator = listIterator();
            InterfaceC15132 interfaceC15132ListIterator2 = ((InterfaceC1022) list).listIterator();
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return true;
                }
                if (interfaceC15132ListIterator.nextInt() != interfaceC15132ListIterator2.nextInt()) {
                    return false;
                }
                size = i;
            }
        } else {
            InterfaceC15132 interfaceC15132ListIterator3 = listIterator();
            ListIterator listIterator = list.listIterator();
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return true;
                }
                if (!C11003.equals(interfaceC15132ListIterator3.next(), listIterator.next())) {
                    return false;
                }
                size = i2;
            }
        }
    }

    @Override // l.InterfaceC1022, java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Integer) obj).intValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫ */
    public int compareTo(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof InterfaceC1022) {
            InterfaceC15132 interfaceC15132ListIterator = listIterator();
            InterfaceC15132 interfaceC15132ListIterator2 = ((InterfaceC1022) list).listIterator();
            while (interfaceC15132ListIterator.hasNext() && interfaceC15132ListIterator2.hasNext()) {
                int iCompare = Integer.compare(interfaceC15132ListIterator.nextInt(), interfaceC15132ListIterator2.nextInt());
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            if (interfaceC15132ListIterator2.hasNext()) {
                return -1;
            }
            return interfaceC15132ListIterator.hasNext() ? 1 : 0;
        }
        InterfaceC15132 interfaceC15132ListIterator3 = listIterator();
        ListIterator listIterator = list.listIterator();
        while (interfaceC15132ListIterator3.hasNext() && listIterator.hasNext()) {
            int iCompareTo = ((Comparable) interfaceC15132ListIterator3.next()).compareTo(listIterator.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (listIterator.hasNext()) {
            return -1;
        }
        return interfaceC15132ListIterator3.hasNext() ? 1 : 0;
    }

    @Override // l.InterfaceC1022, java.util.List
    public Integer remove(int i) {
        return Integer.valueOf(mo3542(i));
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public Integer mo3543(int i, Integer num) {
        return Integer.valueOf(set(i, num.intValue()));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m26284() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return mo3542(size() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo26283(InterfaceC1022 interfaceC1022) {
        C15859 c15859 = (C15859) this;
        return c15859.m37596(c15859.f49021, interfaceC1022);
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ܶ */
    public int[] mo3586() {
        int size = size();
        if (size == 0) {
            return C19389.f62753;
        }
        int[] iArr = new int[size];
        mo3538(0, 0, size, iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo26282(int i, InterfaceC1043 interfaceC1043) {
        m26281(i);
        InterfaceC6667 it = interfaceC1043.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            add(i, it.nextInt());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ֫ */
    public boolean mo16696(InterfaceC1043 interfaceC1043) {
        return mo26282(size(), interfaceC1043);
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC15132 it = iterator();
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

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public void mo3547(InterfaceC4571 interfaceC4571) {
        if (interfaceC4571 == null) {
            mo3545(interfaceC4571);
            return;
        }
        int[] iArrMo3586 = mo3586();
        C19389.m44662(iArrMo3586, 0, iArrMo3586.length, interfaceC4571, (int[]) null);
        mo3546(iArrMo3586);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public void mo3545(InterfaceC4571 interfaceC4571) {
        int[] iArrMo3586 = mo3586();
        if (interfaceC4571 == null) {
            C19389.m44660(iArrMo3586.length, iArrMo3586);
        } else {
            C19389.m44661(iArrMo3586, 0, iArrMo3586.length, interfaceC4571);
        }
        mo3546(iArrMo3586);
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
