package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.᩵ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QUZ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20900 extends AbstractC22241 implements InterfaceC3399, InterfaceC13515 {
    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C12174.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo6023(((Character) obj).charValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Character.valueOf(mo6018(((Character) obj).charValue(), i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47210(int i) {
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
    public final void m47211(int i) {
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

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC18307 spliterator() {
        if (this instanceof RandomAccess) {
            return new C20229(this);
        }
        return new C11603(listIterator(0), C6406.m14669(this), 16720);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void sort(Comparator comparator) {
        InterfaceC4070 c12788;
        if (comparator == null || (comparator instanceof InterfaceC4070)) {
            c12788 = (InterfaceC4070) comparator;
        } else {
            c12788 = new C12788(comparator);
        }
        mo6021(c12788);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC7838) {
            return mo13946(i, (InterfaceC7838) collection);
        }
        m47210(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo6023(((Character) it.next()).charValue(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC16809 interfaceC16809ListIterator = listIterator(0);
        int size = size();
        int iMo9752 = 1;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iMo9752;
            }
            iMo9752 = (iMo9752 * 31) + interfaceC16809ListIterator.mo9752();
            size = i;
        }
    }

    @Override // p067l.InterfaceC3399
    public int indexOf(char c) {
        InterfaceC16809 interfaceC16809ListIterator = listIterator(0);
        while (interfaceC16809ListIterator.hasNext()) {
            if (c == interfaceC16809ListIterator.mo9752()) {
                return interfaceC16809ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC17480 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.InterfaceC3399, java.util.List
    public final InterfaceC16809 listIterator() {
        return listIterator(0);
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        return indexOf(c) >= 0;
    }

    @Override // p067l.InterfaceC3399
    public int lastIndexOf(char c) {
        InterfaceC16809 interfaceC16809ListIterator = listIterator(size());
        while (interfaceC16809ListIterator.hasPrevious()) {
            if (c == interfaceC16809ListIterator.mo9758()) {
                return interfaceC16809ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public void mo12109(InterfaceC24857 interfaceC24857) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC24857);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC24857.mo20276(getChar(i));
        }
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C12826.requireNonNull(unaryOperator);
        InterfaceC4897 interfaceC4897 = unaryOperator instanceof InterfaceC4897 ? (InterfaceC4897) unaryOperator : new InterfaceC4897() { // from class: l.ۚۧᩴ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C17342.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C17342.$default$compose(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p067l.InterfaceC4897
            /* JADX INFO: renamed from: ᩻ */
            public final char mo10391(char c) {
                return ((Character) unaryOperator.apply(Character.valueOf(c))).charValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Character.valueOf(mo10391(((Character) obj).charValue()));
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return mo10391(C5065.m10799(i));
            }
        };
        InterfaceC16809 interfaceC16809ListIterator = listIterator(0);
        while (interfaceC16809ListIterator.hasNext()) {
            interfaceC16809ListIterator.mo9757(interfaceC4897.mo10391(interfaceC16809ListIterator.mo9752()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Character.valueOf(getChar(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo6019(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return indexOf(((Character) obj).charValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Character) obj).charValue());
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
                if (list instanceof InterfaceC3399) {
                    InterfaceC16809 interfaceC16809ListIterator = listIterator(0);
                    InterfaceC16809 interfaceC16809ListIterator2 = ((InterfaceC3399) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC16809ListIterator.mo9752() != interfaceC16809ListIterator2.mo9752()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC16809 interfaceC16809ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C12826.equals(interfaceC16809ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
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
            if (list instanceof InterfaceC3399) {
                InterfaceC16809 interfaceC16809ListIterator = listIterator(0);
                InterfaceC16809 interfaceC16809ListIterator2 = ((InterfaceC3399) list).listIterator();
                while (interfaceC16809ListIterator.hasNext() && interfaceC16809ListIterator2.hasNext()) {
                    int iCompare = Character.compare(interfaceC16809ListIterator.mo9752(), interfaceC16809ListIterator2.mo9752());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC16809ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC16809ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC16809 interfaceC16809ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC16809ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC16809ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC16809ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Character.valueOf(mo6017(i));
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ۧ */
    public void mo6024(InterfaceC4070 interfaceC4070) {
        char[] cArr;
        int size = size();
        if (size == 0) {
            cArr = C14543.f41497;
        } else {
            char[] cArr2 = new char[size];
            mo6020(0, 0, cArr2, size);
            cArr = cArr2;
        }
        if (interfaceC4070 == null) {
            C14543.m33209(cArr, cArr.length);
        } else {
            C14543.m33211(cArr, 0, cArr.length, interfaceC4070);
        }
        mo6022(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo13946(int i, InterfaceC7838 interfaceC7838) {
        m47210(i);
        InterfaceC17480 it = interfaceC7838.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo6023(it.mo9752(), i);
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30205(InterfaceC7838 interfaceC7838) {
        return mo13946(size(), interfaceC7838);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC16809 interfaceC16809ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC16809ListIterator.mo9752()));
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

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public void mo6021(InterfaceC4070 interfaceC4070) {
        char[] cArr;
        if (interfaceC4070 != null) {
            int size = size();
            if (size == 0) {
                cArr = C14543.f41497;
            } else {
                char[] cArr2 = new char[size];
                mo6020(0, 0, cArr2, size);
                cArr = cArr2;
            }
            C14543.m33212(cArr, 0, cArr.length, interfaceC4070, (char[]) null);
            mo6022(cArr, 0, cArr.length);
            return;
        }
        mo6024(interfaceC4070);
    }
}
