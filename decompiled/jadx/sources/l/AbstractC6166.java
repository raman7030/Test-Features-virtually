package l;

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
public abstract class AbstractC6166 extends AbstractC22394 implements InterfaceC2289, InterfaceC11728 {
    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C10317.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo7539(i, ((Long) obj).longValue());
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(set(i, ((Long) obj).longValue()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17069(int i) {
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
    public final void m17073(int i) {
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

    @Override // l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC0877 spliterator() {
        if (this instanceof RandomAccess) {
            return new C4755(this);
        }
        return new C4406(listIterator(0), C4248.m12789(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void sort(Comparator comparator) {
        InterfaceC1583 c10756;
        if (comparator == null || (comparator instanceof InterfaceC1583)) {
            c10756 = (InterfaceC1583) comparator;
        } else {
            c10756 = new C10756(comparator);
        }
        mo7540(c10756);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC11421) {
            return mo13084(i, (InterfaceC11421) collection);
        }
        m17069(i);
        Iterator it = collection.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo7539(i, ((Long) it.next()).longValue());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC22394, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC3700 interfaceC3700ListIterator = listIterator(0);
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            long jNextLong = interfaceC3700ListIterator.nextLong();
            i = (i * 31) + ((int) (jNextLong ^ (jNextLong >>> 32)));
            size = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC11421, l.InterfaceC17105, java.util.List
    public InterfaceC23455 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC2289, java.util.List
    public final InterfaceC3700 listIterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: ᩻ */
    public int mo7546(long j) {
        InterfaceC3700 interfaceC3700ListIterator = listIterator(0);
        while (interfaceC3700ListIterator.hasNext()) {
            if (j == interfaceC3700ListIterator.nextLong()) {
                return interfaceC3700ListIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC11421
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean mo17071(long j) {
        return mo7546(j) >= 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo7543(long j) {
        InterfaceC3700 interfaceC3700ListIterator = listIterator(size());
        while (interfaceC3700ListIterator.hasPrevious()) {
            if (j == interfaceC3700ListIterator.mo11286()) {
                return interfaceC3700ListIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC22394, l.InterfaceC17105
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

    @Override // java.util.List, l.InterfaceC11728
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C11003.requireNonNull(unaryOperator);
        LongUnaryOperator longUnaryOperator = unaryOperator instanceof LongUnaryOperator ? (LongUnaryOperator) unaryOperator : new LongUnaryOperator() { // from class: l.ܺۘᩴ
            public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator2) {
                return C18579.$default$andThen(this, longUnaryOperator2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j) {
                return ((Long) unaryOperator.apply(Long.valueOf(j))).longValue();
            }

            public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator2) {
                return C18579.$default$compose(this, longUnaryOperator2);
            }
        };
        InterfaceC3700 interfaceC3700ListIterator = listIterator(0);
        while (interfaceC3700ListIterator.hasNext()) {
            interfaceC3700ListIterator.mo11287(longUnaryOperator.applyAsLong(interfaceC3700ListIterator.nextLong()));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo7537(0, size());
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo7546(((Long) obj).longValue());
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
                if (list instanceof InterfaceC2289) {
                    InterfaceC3700 interfaceC3700ListIterator = listIterator(0);
                    InterfaceC3700 interfaceC3700ListIterator2 = ((InterfaceC2289) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (interfaceC3700ListIterator.nextLong() != interfaceC3700ListIterator2.nextLong()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC3700 interfaceC3700ListIterator3 = listIterator(0);
                    ListIterator listIterator = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (C11003.equals(interfaceC3700ListIterator3.next(), listIterator.next())) {
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
        return mo7543(((Long) obj).longValue());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC2289) {
                InterfaceC3700 interfaceC3700ListIterator = listIterator(0);
                InterfaceC3700 interfaceC3700ListIterator2 = ((InterfaceC2289) list).listIterator();
                while (interfaceC3700ListIterator.hasNext() && interfaceC3700ListIterator2.hasNext()) {
                    int iCompare = Long.compare(interfaceC3700ListIterator.nextLong(), interfaceC3700ListIterator2.nextLong());
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                if (interfaceC3700ListIterator2.hasNext()) {
                    return -1;
                }
                if (interfaceC3700ListIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC3700 interfaceC3700ListIterator3 = listIterator(0);
                ListIterator listIterator = list.listIterator();
                while (interfaceC3700ListIterator3.hasNext() && listIterator.hasNext()) {
                    int iCompareTo = ((Comparable) interfaceC3700ListIterator3.next()).compareTo(listIterator.next());
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                if (listIterator.hasNext()) {
                    return -1;
                }
                if (interfaceC3700ListIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Long.valueOf(mo7545(i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long[] m17072() {
        int size = size();
        if (size == 0) {
            return C10010.f30148;
        }
        long[] jArr = new long[size];
        mo7541(jArr, 0, 0, size);
        return jArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo13084(int i, InterfaceC11421 interfaceC11421) {
        m17069(i);
        InterfaceC23455 it = interfaceC11421.iterator();
        boolean zHasNext = it.hasNext();
        while (it.hasNext()) {
            mo7539(i, it.nextLong());
            i++;
        }
        return zHasNext;
    }

    @Override // l.AbstractC22394
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo17070(InterfaceC11421 interfaceC11421) {
        return mo13084(size(), interfaceC11421);
    }

    @Override // l.AbstractC22394, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC3700 interfaceC3700ListIterator = listIterator(0);
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
                sb.append(String.valueOf(interfaceC3700ListIterator.nextLong()));
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
    public void mo7540(InterfaceC1583 interfaceC1583) {
        if (interfaceC1583 == null) {
            mo7544(interfaceC1583);
            return;
        }
        long[] jArrM17072 = m17072();
        C10010.m25183(jArrM17072, 0, jArrM17072.length, interfaceC1583, (long[]) null);
        mo7538(0, jArrM17072.length, jArrM17072);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo7544(InterfaceC1583 interfaceC1583) {
        long[] jArrM17072 = m17072();
        if (interfaceC1583 == null) {
            C10010.m25181(jArrM17072.length, jArrM17072);
        } else {
            C10010.m25182(jArrM17072, 0, jArrM17072.length, interfaceC1583);
        }
        mo7538(0, jArrM17072.length, jArrM17072);
    }
}
