package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public class C20539 extends AbstractC19709 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353131L;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f63462;

    /* JADX INFO: renamed from: ᩸ */
    public transient Object[] f63463;

    /* JADX INFO: renamed from: ᩹ */
    public int f63464;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C20539(Object[] objArr, boolean z) {
        this.f63463 = objArr;
        this.f63462 = z;
    }

    public C20539(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C19768.m44906(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f63463 = C9809.f27145;
        } else {
            this.f63463 = new Object[i];
        }
        this.f63462 = false;
    }

    public C20539() {
        this.f63463 = C9809.f27144;
        this.f63462 = false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Object[] m46362() {
        return this.f63463;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20539 m46358(Object[] objArr) {
        if (objArr.length < 0) {
            throw new IllegalArgumentException(C5410.m11876(objArr.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("The specified length (0) is greater than the array size (")));
        }
        C20539 c20539 = new C20539(objArr, true);
        c20539.f63464 = 0;
        return c20539;
    }

    static {
        C12136.m28049of(new C24964(1), new C8871(1), new C22283(1), new EnumC8112[0]);
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m46359(int i) {
        Object[] objArr = this.f63463;
        if (i <= objArr.length) {
            return;
        }
        if (objArr != C9809.f27144) {
            i = (int) Math.max(Math.min(((long) objArr.length) + ((long) (objArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        if (this.f63462) {
            this.f63463 = C9809.m22892(i, this.f63464, this.f63463);
        } else {
            Object[] objArr2 = new Object[i];
            System.arraycopy(this.f63463, 0, objArr2, 0, this.f63464);
            this.f63463 = objArr2;
        }
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7735(int i, int i2, int i3, Object[] objArr) {
        C11755.m26983(objArr.length, i2, i3);
        System.arraycopy(this.f63463, i, objArr, i2, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m44783(i);
        m46359(this.f63464 + 1);
        int i2 = this.f63464;
        if (i != i2) {
            Object[] objArr = this.f63463;
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        this.f63463[i] = obj;
        this.f63464++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m46359(this.f63464 + 1);
        Object[] objArr = this.f63463;
        int i = this.f63464;
        this.f63464 = i + 1;
        objArr[i] = obj;
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < this.f63464) {
            return this.f63463[i];
        }
        throw new IndexOutOfBoundsException(C5410.m11876(this.f63464, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // p067l.AbstractC19709, java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.f63463;
        for (int i = 0; i < this.f63464; i++) {
            if (C12826.equals(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC19709, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f63463;
        int i = this.f63464;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C12826.equals(obj, objArr[i2])) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f63464;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f63464, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f63463;
        Object obj = objArr[i];
        int i3 = i2 - 1;
        this.f63464 = i3;
        if (i != i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        }
        objArr[this.f63464] = null;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (i >= this.f63464) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f63464, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f63463;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // p067l.AbstractC19709, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Arrays.fill(this.f63463, 0, this.f63464, (Object) null);
        this.f63464 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f63464;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f63464) {
            return this;
        }
        m44783(i);
        m44783(i2);
        if (i <= i2) {
            return new C19868(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // p067l.AbstractC19709, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = this.f63464;
        if (i == 0) {
            return C9809.f27145;
        }
        return Arrays.copyOf(this.f63463, i, Object[].class);
    }

    @Override // p067l.AbstractC19709, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f63464];
        } else if (objArr.length < this.f63464) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f63464);
        }
        System.arraycopy(this.f63463, 0, objArr, 0, this.f63464);
        int length = objArr.length;
        int i = this.f63464;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m46361(int i) {
        Object[] objArr = this.f63463;
        if (i > objArr.length) {
            this.f63463 = C9809.m22892(i, this.f63464, objArr);
        }
        int i2 = this.f63464;
        if (i > i2) {
            Arrays.fill(this.f63463, i2, i, (Object) null);
        } else {
            Arrays.fill(this.f63463, i, i2, (Object) null);
        }
        this.f63464 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f63464 == 0;
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7734(int i, int i2) {
        C11755.m26980(this.f63464, i, i2);
        Object[] objArr = this.f63463;
        System.arraycopy(objArr, i2, objArr, i, this.f63464 - i2);
        int i3 = i2 - i;
        this.f63464 -= i3;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            this.f63463[this.f63464 + i4] = null;
            i3 = i4;
        }
    }

    @Override // p067l.InterfaceC3913
    /* JADX INFO: renamed from: ֫ */
    public final void mo7736(int i, int i2, Object[] objArr) {
        m44783(i);
        C11755.m26983(objArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f63464) {
            System.arraycopy(objArr, 0, this.f63463, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f63464, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // p067l.AbstractC19709, p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f63463;
        for (int i = 0; i < this.f63464; i++) {
            consumer.accept(objArr[i]);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC3913) {
            return m46360(i, (InterfaceC3913) collection);
        }
        m44783(i);
        int size = collection.size();
        if (size == 0) {
            return false;
        }
        m46359(this.f63464 + size);
        Object[] objArr = this.f63463;
        System.arraycopy(objArr, i, objArr, i + size, this.f63464 - i);
        Iterator it = collection.iterator();
        this.f63464 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f63463[i] = it.next();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46360(int i, InterfaceC3913 interfaceC3913) {
        m44783(i);
        int size = interfaceC3913.size();
        if (size == 0) {
            return false;
        }
        m46359(this.f63464 + size);
        Object[] objArr = this.f63463;
        System.arraycopy(objArr, i, objArr, i + size, this.f63464 - i);
        interfaceC3913.mo7735(0, i, size, this.f63463);
        this.f63464 += size;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr = this.f63463;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f63464;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(objArr[i2])) {
                objArr[i3] = objArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(objArr, i3, i, (Object) null);
        boolean z = this.f63464 != i3;
        this.f63464 = i3;
        return z;
    }

    @Override // p067l.AbstractC13262, java.util.Collection, p067l.InterfaceC3456
    public final boolean removeIf(Predicate predicate) {
        int i;
        Object[] objArr = this.f63463;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f63464;
            if (i2 >= i) {
                break;
            }
            if (!predicate.test(objArr[i2])) {
                objArr[i3] = objArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(objArr, i3, i, (Object) null);
        boolean z = this.f63464 != i3;
        this.f63464 = i3;
        return z;
    }

    @Override // p067l.AbstractC19709, p067l.InterfaceC3913, java.util.List
    public final InterfaceC12631 listIterator(int i) {
        m44783(i);
        return new C10480(this, i);
    }

    @Override // p067l.AbstractC19709, p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC21210, p067l.InterfaceC3456, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C17184(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C17184(this);
    }

    @Override // p067l.AbstractC19709, java.util.List, p067l.InterfaceC13515
    public final void sort(Comparator comparator) {
        if (comparator == null) {
            Arrays.sort(this.f63463, 0, this.f63464);
        } else {
            Arrays.sort(this.f63463, 0, this.f63464, comparator);
        }
    }

    public final Object clone() {
        Class<?> cls = getClass();
        Object[] objArrCopyOf = C9809.f27145;
        if (cls == C20539.class) {
            Object[] objArr = this.f63463;
            int i = this.f63464;
            if (i != 0) {
                objArrCopyOf = Arrays.copyOf(objArr, i, Object[].class);
            }
            C20539 c20539 = new C20539(objArrCopyOf, false);
            c20539.f63464 = this.f63464;
            return c20539;
        }
        try {
            C20539 c205310 = (C20539) super.clone();
            Object[] objArr2 = this.f63463;
            int i2 = this.f63464;
            if (i2 != 0) {
                objArrCopyOf = Arrays.copyOf(objArr2, i2, Object[].class);
            }
            c205310.f63463 = objArrCopyOf;
            return c205310;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // p067l.AbstractC19709, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C20539) {
            C20539 c20539 = (C20539) obj;
            if (c20539 != this) {
                int i = this.f63464;
                int i2 = c20539.f63464;
                if (i == i2) {
                    Object[] objArr = this.f63463;
                    Object[] objArr2 = c20539.f63463;
                    if (objArr != objArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (C12826.equals(objArr[i3], objArr2[i3])) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C19868) {
            return ((C19868) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // p067l.AbstractC19709
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C20539) {
            C20539 c20539 = (C20539) list;
            int i = this.f63464;
            int i2 = c20539.f63464;
            Object[] objArr = this.f63463;
            Object[] objArr2 = c20539.f63463;
            int i3 = 0;
            while (i3 < i && i3 < i2) {
                int iCompareTo = ((Comparable) objArr[i3]).compareTo(objArr2[i3]);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                i3++;
            }
            if (i3 < i2) {
                return -1;
            }
            return i3 < i ? 1 : 0;
        }
        if (list instanceof C19868) {
            return -((C19868) list).compareTo(this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f63463;
        for (int i = 0; i < this.f63464; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f63464];
        this.f63463 = objArr;
        for (int i = 0; i < this.f63464; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
