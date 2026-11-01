package p067l;

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
public abstract class AbstractC16192 extends AbstractC23966 implements List, RandomAccess, InterfaceC13515 {
    public static final long serialVersionUID = -889275714;

    /* JADX INFO: renamed from: ᩶ */
    public static final AbstractC6767 f47661 = new C12841(0, C18009.f53770);

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f47662 = 0;

    @Override // java.util.List, p067l.InterfaceC13515
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        C12174.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, p067l.InterfaceC13515
    public /* synthetic */ void sort(Comparator comparator) {
        C12174.$default$sort(this, comparator);
    }

    @Override // p067l.AbstractC23966
    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 mo18927() {
        return this;
    }

    /* JADX INFO: renamed from: ۜ */
    public static AbstractC16192 m36883() {
        Object[] objArr = {2, 5, 6};
        C14104.m32027(3, objArr);
        return m36884(3, objArr);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static InterfaceC13477 m36885() {
        return C22665.m50729();
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC16192 m36872of() {
        return C18009.f53770;
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC16192 m36884(int i, Object[] objArr) {
        if (i == 0) {
            return C18009.f53770;
        }
        return new C18009(i, objArr);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static AbstractC16192 m36877of(Object... objArr) {
        C6194.m14029("the total number of elements must fit in an int", objArr.length <= 2147483635);
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
        C14104.m32027(length, objArr2);
        return m36884(length, objArr2);
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC16192 m36873of(Object obj) {
        Object[] objArr = {obj};
        C14104.m32027(1, objArr);
        return m36884(1, objArr);
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC16192 m36874of(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C14104.m32027(2, objArr);
        return m36884(2, objArr);
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC16192 m36875of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        C14104.m32027(5, objArr);
        return m36884(5, objArr);
    }

    /* JADX INFO: renamed from: of */
    public static AbstractC16192 m36876of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7};
        C14104.m32027(7, objArr);
        return m36884(7, objArr);
    }

    public static AbstractC16192 copyOf(Collection collection) {
        if (collection instanceof AbstractC23966) {
            AbstractC16192 abstractC16192Mo18927 = ((AbstractC23966) collection).mo18927();
            if (!abstractC16192Mo18927.mo21230()) {
                return abstractC16192Mo18927;
            }
            Object[] array = abstractC16192Mo18927.toArray();
            return m36884(array.length, array);
        }
        Object[] array2 = collection.toArray();
        C14104.m32027(array2.length, array2);
        return m36884(array2.length, array2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m36881(Iterator it) {
        if (!it.hasNext()) {
            return C18009.f53770;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m36873of(next);
        }
        C4123 c4123 = new C4123();
        while (true) {
            c4123.m18182(next);
            if (!it.hasNext()) {
                return c4123.m8329();
            }
            next = it.next();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m36882(Object[] objArr) {
        if (objArr.length == 0) {
            return C18009.f53770;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        C14104.m32027(objArr2.length, objArr2);
        return m36884(objArr2.length, objArr2);
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final AbstractC21520 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final AbstractC6767 listIterator(int i) {
        C6194.m14032(i, size());
        if (isEmpty()) {
            return f47661;
        }
        return new C12841(i, this);
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public AbstractC16192 subList(int i, int i2) {
        C6194.m14024(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C18009.f53770;
        }
        return new C18875(this, i, i3);
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

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public int mo26245(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC16192 mo36886() {
        return size() <= 1 ? this : new C18204(this);
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

    @Override // p067l.AbstractC23966
    public Object writeReplace() {
        return new C19546(toArray());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4123 m36878(int i) {
        C23335.m51956(i, "expectedSize");
        return new C4123(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m36879(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return m36881(iterable.iterator());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m36880(Comparator comparator, Collection collection) {
        comparator.getClass();
        Object[] objArrM24929 = C10810.m24929(collection);
        C14104.m32027(objArrM24929.length, objArrM24929);
        Arrays.sort(objArrM24929, comparator);
        return m36884(objArrM24929.length, objArrM24929);
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
                            if (it2.hasNext() && C12826.equals(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (C12826.equals(get(i), list.get(i))) {
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
