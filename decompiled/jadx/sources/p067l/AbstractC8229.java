package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.LongConsumer;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۛܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8229 extends AbstractC23652 implements InterfaceC4544, InterfaceC13515 {
    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C12174.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo9607(i, ((Long) obj).longValue());
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(set(i, ((Long) obj).longValue()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19001(int i) {
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
    public final void m19005(int i) {
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

    @Override // p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public InterfaceC3202 spliterator() {
        if (this instanceof RandomAccess) {
            return new C6888(this);
        }
        return new C6556(listIterator(0), C6406.m14669(this), 16720);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void sort(Comparator comparator) {
        InterfaceC3873 c12591;
        if (comparator == null || (comparator instanceof InterfaceC3873)) {
            c12591 = (InterfaceC3873) comparator;
        } else {
            c12591 = new C12591(comparator);
        }
        mo9608(c12591);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC13223) {
            return mo14948(i, (InterfaceC13223) collection);
        }
        m19001(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo9607(i, ((Long) it.next()).longValue());
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC23652, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC5885 interfaceC5885ListIterator = listIterator(0);
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = interfaceC5885ListIterator.nextLong();
            i = (i * 31) + ((int) (jNextLong ^ (jNextLong >>> 32)));
            size = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p067l.InterfaceC13223, p067l.InterfaceC18625, java.util.List
    public InterfaceC24660 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.InterfaceC4544, java.util.List
    public final InterfaceC5885 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ᩻ */
    public int mo9614(long j) {
        InterfaceC5885 interfaceC5885ListIterator = listIterator(0);
        while (interfaceC5885ListIterator.hasNext()) {
            if (j == interfaceC5885ListIterator.nextLong()) {
                return interfaceC5885ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // p067l.InterfaceC13223
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo19003(long j) {
        return mo9614(j) >= 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo9611(long j) {
        InterfaceC5885 interfaceC5885ListIterator = listIterator(size());
        while (interfaceC5885ListIterator.hasPrevious()) {
            if (j == interfaceC5885ListIterator.mo13233()) {
                return interfaceC5885ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC18625
    public void forEach(LongConsumer longConsumer) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(longConsumer);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            longConsumer.accept(getLong(i));
        }
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C12826.requireNonNull(unaryOperator);
        LongUnaryOperator longUnaryOperator = unaryOperator instanceof LongUnaryOperator ? (LongUnaryOperator) unaryOperator : new LongUnaryOperator() { // from class: l.ܺۘᩴ
            public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator2) {
                return C20026.$default$andThen(this, longUnaryOperator2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j) {
                return ((Long) unaryOperator.apply(Long.valueOf(j))).longValue();
            }

            public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator2) {
                return C20026.$default$compose(this, longUnaryOperator2);
            }
        };
        InterfaceC5885 interfaceC5885ListIterator = listIterator(0);
        while (interfaceC5885ListIterator.hasNext()) {
            interfaceC5885ListIterator.mo13234(longUnaryOperator.applyAsLong(interfaceC5885ListIterator.nextLong()));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo9605(0, size());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo9614(((Long) obj).longValue());
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
                if (list instanceof InterfaceC4544) {
                    InterfaceC5885 interfaceC5885ListIterator = listIterator(0);
                    InterfaceC5885 interfaceC5885ListIterator2 = ((InterfaceC4544) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC5885ListIterator.nextLong() != interfaceC5885ListIterator2.nextLong()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC5885 interfaceC5885ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C12826.equals(interfaceC5885ListIterator3.next(), listIterator.next())) {
                            size = i2;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return mo9611(((Long) obj).longValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC4544) {
                InterfaceC5885 interfaceC5885ListIterator = listIterator(0);
                InterfaceC5885 interfaceC5885ListIterator2 = ((InterfaceC4544) list).listIterator();
                while (interfaceC5885ListIterator.hasNext() && interfaceC5885ListIterator2.hasNext()) {
                    int iCompare = Long.compare(interfaceC5885ListIterator.nextLong(), interfaceC5885ListIterator2.nextLong());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC5885ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC5885ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC5885 interfaceC5885ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC5885ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC5885ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC5885ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Long.valueOf(mo9613(i));
    }

    /* JADX INFO: renamed from: ܿ */
    public final long[] m19004() {
        int size = size();
        if (size == 0) {
            return C11882.f33108;
        }
        long[] jArr = new long[size];
        mo9609(jArr, 0, 0, size);
        return jArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo14948(int i, InterfaceC13223 interfaceC13223) {
        m19001(i);
        InterfaceC24660 it = interfaceC13223.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo9607(i, it.nextLong());
            i++;
        }
        return zHasNext;
    }

    @Override // p067l.AbstractC23652
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19002(InterfaceC13223 interfaceC13223) {
        return mo14948(size(), interfaceC13223);
    }

    @Override // p067l.AbstractC23652, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC5885 interfaceC5885ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC5885ListIterator.nextLong()));
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

    /* JADX INFO: renamed from: ֫ */
    public void mo9608(InterfaceC3873 interfaceC3873) {
        if (interfaceC3873 == null) {
            mo9612(interfaceC3873);
            return;
        }
        long[] jArrM19004 = m19004();
        C11882.m27200(jArrM19004, 0, jArrM19004.length, interfaceC3873, (long[]) null);
        mo9606(0, jArrM19004.length, jArrM19004);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo9612(InterfaceC3873 interfaceC3873) {
        long[] jArrM19004 = m19004();
        if (interfaceC3873 == null) {
            C11882.m27198(jArrM19004.length, jArrM19004);
        } else {
            C11882.m27199(jArrM19004, 0, jArrM19004.length, interfaceC3873);
        }
        mo9606(0, jArrM19004.length, jArrM19004);
    }
}
