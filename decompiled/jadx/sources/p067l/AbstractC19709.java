package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ᩳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19709 extends AbstractC13262 implements InterfaceC3913, InterfaceC13515 {
    @Override // java.util.List, p067l.InterfaceC13515
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C12174.$default$replaceAll(this, unaryOperator);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44783(int i) {
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
    public final void m44785(int i) {
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

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC9948 spliterator() {
        if (this instanceof RandomAccess) {
            return new C15272(this);
        }
        return new C14641(listIterator(0), C6406.m14669(this), 16464);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC12631 interfaceC12631ListIterator = listIterator(0);
        int size = size();
        int iHashCode = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            E next = interfaceC12631ListIterator.next();
            iHashCode = (iHashCode * 31) + (next == 0 ? 0 : next.hashCode());
            size = i;
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        InterfaceC12631 interfaceC12631ListIterator = listIterator(0);
        while (interfaceC12631ListIterator.hasNext()) {
            if (C12826.equals(obj, interfaceC12631ListIterator.next())) {
                return interfaceC12631ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC13833 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.InterfaceC3913, java.util.List
    public final InterfaceC12631 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        InterfaceC12631 interfaceC12631ListIterator = listIterator(size());
        while (interfaceC12631ListIterator.hasPrevious()) {
            if (C12826.equals(obj, interfaceC12631ListIterator.previous())) {
                return interfaceC12631ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public void forEach(Consumer consumer) {
        if (this instanceof RandomAccess) {
            int size = size();
            for (int i = 0; i < size; i++) {
                consumer.accept(get(i));
            }
            return;
        }
        C23241.$default$forEach(this, consumer);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public void sort(Comparator comparator) {
        Object[] array = toArray();
        if (comparator == null) {
            Arrays.sort(array, 0, array.length);
        } else {
            Arrays.sort(array, 0, array.length, comparator);
        }
        mo7736(0, array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo7734(0, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int size = size();
        if (size == 0) {
            return C9809.f27145;
        }
        Object[] objArr = new Object[size];
        mo7735(0, 0, size, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = Arrays.copyOf(objArr, size);
        }
        mo7735(0, 0, size, objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
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
                InterfaceC12631 interfaceC12631ListIterator = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (true) {
                    int i = size - 1;
                    if (size == 0) {
                        return true;
                    }
                    if (C12826.equals(interfaceC12631ListIterator.next(), listIterator.next())) {
                        size = i;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC3913) {
                InterfaceC12631 interfaceC12631ListIterator = listIterator(0);
                InterfaceC12631 interfaceC12631ListIterator2 = ((InterfaceC3913) list).listIterator();
                while (interfaceC12631ListIterator.hasNext() && interfaceC12631ListIterator2.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC12631ListIterator.next()).compareTo(interfaceC12631ListIterator2.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (interfaceC12631ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC12631ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC12631 interfaceC12631ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC12631ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo2 = ((Comparable) interfaceC12631ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC12631ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return remove(((C20539) this).f63464 - 1);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m44784() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size() - 1);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC12631 interfaceC12631ListIterator = listIterator(0);
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
                E next = interfaceC12631ListIterator.next();
                if (this == next) {
                    sb.append("(this list)");
                } else {
                    sb.append(String.valueOf(next));
                }
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
