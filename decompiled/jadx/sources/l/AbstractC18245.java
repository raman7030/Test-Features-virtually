package l;

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
public abstract class AbstractC18245 extends AbstractC11462 implements InterfaceC1625, InterfaceC11728 {
    @Override // java.util.List, l.InterfaceC11728
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C10317.$default$replaceAll(this, unaryOperator);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42524(int i) {
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
    public final void m42526(int i) {
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

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC7975 spliterator() {
        if (this instanceof RandomAccess) {
            return new C13577(this);
        }
        return new C12913(listIterator(0), C4248.m12789(this), 16464);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC10798 interfaceC10798ListIterator = listIterator(0);
        int size = size();
        int iHashCode = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            E next = interfaceC10798ListIterator.next();
            iHashCode = (iHashCode * 31) + (next == 0 ? 0 : next.hashCode());
            size = i;
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        InterfaceC10798 interfaceC10798ListIterator = listIterator(0);
        while (interfaceC10798ListIterator.hasNext()) {
            if (C11003.equals(obj, interfaceC10798ListIterator.next())) {
                return interfaceC10798ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC12063 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC1625, java.util.List
    public final InterfaceC10798 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        InterfaceC10798 interfaceC10798ListIterator = listIterator(size());
        while (interfaceC10798ListIterator.hasPrevious()) {
            if (C11003.equals(obj, interfaceC10798ListIterator.previous())) {
                return interfaceC10798ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public void forEach(Consumer consumer) {
        if (this instanceof RandomAccess) {
            int size = size();
            for (int i = 0; i < size; i++) {
                consumer.accept(get(i));
            }
            return;
        }
        C21962.$default$forEach(this, consumer);
    }

    @Override // java.util.List, l.InterfaceC11728
    public void sort(Comparator comparator) {
        Object[] array = toArray();
        if (comparator == null) {
            Arrays.sort(array, 0, array.length);
        } else {
            Arrays.sort(array, 0, array.length, comparator);
        }
        mo5506(0, array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo5504(0, size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int size = size();
        if (size == 0) {
            return C7829.f24229;
        }
        Object[] objArr = new Object[size];
        mo5505(0, 0, size, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = Arrays.copyOf(objArr, size);
        }
        mo5505(0, 0, size, objArr);
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
                InterfaceC10798 interfaceC10798ListIterator = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (true) {
                    int i = size - 1;
                    if (size == 0) {
                        return true;
                    }
                    if (C11003.equals(interfaceC10798ListIterator.next(), listIterator.next())) {
                        size = i;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC1625) {
                InterfaceC10798 interfaceC10798ListIterator = listIterator(0);
                InterfaceC10798 interfaceC10798ListIterator2 = ((InterfaceC1625) list).listIterator();
                while (interfaceC10798ListIterator.hasNext() && interfaceC10798ListIterator2.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC10798ListIterator.next()).compareTo(interfaceC10798ListIterator2.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (interfaceC10798ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC10798ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC10798 interfaceC10798ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC10798ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo2 = ((Comparable) interfaceC10798ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC10798ListIterator3.hasNext()) {
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
        return remove(((C19119) this).f60232 - 1);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m42525() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return get(size() - 1);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC10798 interfaceC10798ListIterator = listIterator(0);
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
                E next = interfaceC10798ListIterator.next();
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
