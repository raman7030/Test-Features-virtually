package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ܳ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14545 extends AbstractC22725 implements List, RandomAccess, InterfaceC11728 {
    public static final long serialVersionUID = -889275714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC4628 f44555 = new C11019(0, C16457.f50591);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44556 = 0;

    @Override // java.util.List, l.InterfaceC11728
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C10317.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, l.InterfaceC11728
    public /* synthetic */ void sort(Comparator comparator) {
        C10317.$default$sort(this, comparator);
    }

    @Override // l.AbstractC22725
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14545 mo16996() {
        return this;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m34734() {
        Object[] objArr = {2, 5, 6};
        C12348.m29967(3, objArr);
        return m34735(3, objArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC11688 m34736() {
        return C21356.m48394();
    }

    public static AbstractC14545 of() {
        return C16457.f50591;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m34735(int i, Object[] objArr) {
        if (i == 0) {
            return C16457.f50591;
        }
        return new C16457(i, objArr);
    }

    @SafeVarargs
    public static AbstractC14545 of(Object... objArr) {
        C4025.m12109("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = "Blues";
        objArr2[1] = "Classic Rock";
        objArr2[2] = "Country";
        objArr2[3] = "Dance";
        objArr2[4] = "Disco";
        objArr2[5] = "Funk";
        objArr2[6] = "Grunge";
        objArr2[7] = "Hip-Hop";
        objArr2[8] = "Jazz";
        objArr2[9] = "Metal";
        objArr2[10] = "New Age";
        objArr2[11] = "Oldies";
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        C12348.m29967(length, objArr2);
        return m34735(length, objArr2);
    }

    public static AbstractC14545 of(Object obj) {
        Object[] objArr = {obj};
        C12348.m29967(1, objArr);
        return m34735(1, objArr);
    }

    public static AbstractC14545 of(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C12348.m29967(2, objArr);
        return m34735(2, objArr);
    }

    public static AbstractC14545 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        C12348.m29967(5, objArr);
        return m34735(5, objArr);
    }

    public static AbstractC14545 of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        C12348.m29967(7, objArr);
        return m34735(7, objArr);
    }

    public static AbstractC14545 copyOf(Collection collection) {
        if (collection instanceof AbstractC22725) {
            AbstractC14545 abstractC14545Mo16996 = ((AbstractC22725) collection).mo16996();
            if (!abstractC14545Mo16996.mo19283()) {
                return abstractC14545Mo16996;
            }
            Object[] array = abstractC14545Mo16996.toArray();
            return m34735(array.length, array);
        }
        Object[] array2 = collection.toArray();
        C12348.m29967(array2.length, array2);
        return m34735(array2.length, array2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m34732(Iterator it) {
        if (!it.hasNext()) {
            return C16457.f50591;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        C1846 c1846 = new C1846();
        while (true) {
            c1846.m16262(next);
            if (!it.hasNext()) {
                return c1846.m6131();
            }
            next = it.next();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m34733(Object[] objArr) {
        if (objArr.length == 0) {
            return C16457.f50591;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        C12348.m29967(objArr2.length, objArr2);
        return m34735(objArr2.length, objArr2);
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC20151 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final AbstractC4628 listIterator(int i) {
        C4025.m12112(i, size());
        if (isEmpty()) {
            return f44555;
        }
        return new C11019(i, this);
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public AbstractC14545 subList(int i, int i2) {
        C4025.m12104(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C16457.f50591;
        }
        return new C17368(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫ */
    public int mo24235(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC14545 mo34737() {
        return size() <= 1 ? this : new C16662(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // l.AbstractC22725
    public Object writeReplace() {
        return new C18074(toArray());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1846 m34729(int i) {
        C22061.m49620(i, "expectedSize");
        return new C1846(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m34730(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return m34732(iterable.iterator());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m34731(Comparator comparator, Collection collection) {
        comparator.getClass();
        Object[] objArrM22958 = C8882.m22958(collection);
        C12348.m29967(objArrM22958.length, objArrM22958);
        Arrays.sort(objArrM22958, comparator);
        return m34735(objArrM22958.length, objArrM22958);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && C11003.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (C11003.equals(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!obj.equals(get(size)));
        return size;
    }
}
