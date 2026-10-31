package l;

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
public class C19119 extends AbstractC18245 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353131L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f60230;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Object[] f60231;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f60232;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C19119(Object[] objArr, boolean z) {
        this.f60231 = objArr;
        this.f60230 = z;
    }

    public C19119(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C18307.m42645(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f60231 = C7829.f24229;
        } else {
            this.f60231 = new Object[i];
        }
        this.f60230 = false;
    }

    public C19119() {
        this.f60231 = C7829.f24228;
        this.f60230 = false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object[] m44068() {
        return this.f60231;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19119 m44064(Object[] objArr) {
        if (objArr.length < 0) {
            throw new IllegalArgumentException(C3200.m9831(objArr.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("The specified length (0) is greater than the array size (")));
        }
        C19119 c19119 = new C19119(objArr, true);
        c19119.f60232 = 0;
        return c19119;
    }

    static {
        C10277.of(new C23775(1), new C6842(1), new C20954(1), new EnumC6043[0]);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m44065(int i) {
        Object[] objArr = this.f60231;
        if (i <= objArr.length) {
            return;
        }
        if (objArr != C7829.f24228) {
            i = (int) Math.max(Math.min(((long) objArr.length) + ((long) (objArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        if (this.f60230) {
            this.f60231 = C7829.m20927(i, this.f60232, this.f60231);
        } else {
            Object[] objArr2 = new Object[i];
            System.arraycopy(this.f60231, 0, objArr2, 0, this.f60232);
            this.f60231 = objArr2;
        }
    }

    @Override // l.InterfaceC1625
    /* JADX INFO: renamed from: ֫ */
    public final void mo5505(int i, int i2, int i3, Object[] objArr) {
        C9876.m24968(objArr.length, i2, i3);
        System.arraycopy(this.f60231, i, objArr, i2, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m42524(i);
        m44065(this.f60232 + 1);
        int i2 = this.f60232;
        if (i != i2) {
            Object[] objArr = this.f60231;
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        }
        this.f60231[i] = obj;
        this.f60232++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m44065(this.f60232 + 1);
        Object[] objArr = this.f60231;
        int i = this.f60232;
        this.f60232 = i + 1;
        objArr[i] = obj;
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < this.f60232) {
            return this.f60231[i];
        }
        throw new IndexOutOfBoundsException(C3200.m9831(this.f60232, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC18245, java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.f60231;
        for (int i = 0; i < this.f60232; i++) {
            if (C11003.equals(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC18245, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f60231;
        int i = this.f60232;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C11003.equals(obj, objArr[i2])) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f60232;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f60232, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f60231;
        Object obj = objArr[i];
        int i3 = i2 - 1;
        this.f60232 = i3;
        if (i != i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        }
        objArr[this.f60232] = null;
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
        if (i >= this.f60232) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f60232, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        Object[] objArr = this.f60231;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // l.AbstractC18245, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Arrays.fill(this.f60231, 0, this.f60232, (Object) null);
        this.f60232 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f60232;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f60232) {
            return this;
        }
        m42524(i);
        m42524(i2);
        if (i <= i2) {
            return new C18413(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // l.AbstractC18245, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        int i = this.f60232;
        if (i == 0) {
            return C7829.f24229;
        }
        return Arrays.copyOf(this.f60231, i, Object[].class);
    }

    @Override // l.AbstractC18245, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[this.f60232];
        } else if (objArr.length < this.f60232) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f60232);
        }
        System.arraycopy(this.f60231, 0, objArr, 0, this.f60232);
        int length = objArr.length;
        int i = this.f60232;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44067(int i) {
        Object[] objArr = this.f60231;
        if (i > objArr.length) {
            this.f60231 = C7829.m20927(i, this.f60232, objArr);
        }
        int i2 = this.f60232;
        if (i > i2) {
            Arrays.fill(this.f60231, i2, i, (Object) null);
        } else {
            Arrays.fill(this.f60231, i, i2, (Object) null);
        }
        this.f60232 = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f60232 == 0;
    }

    @Override // l.InterfaceC1625
    /* JADX INFO: renamed from: ֫ */
    public final void mo5504(int i, int i2) {
        C9876.m24965(this.f60232, i, i2);
        Object[] objArr = this.f60231;
        System.arraycopy(objArr, i2, objArr, i, this.f60232 - i2);
        int i3 = i2 - i;
        this.f60232 -= i3;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            this.f60231[this.f60232 + i4] = null;
            i3 = i4;
        }
    }

    @Override // l.InterfaceC1625
    /* JADX INFO: renamed from: ֫ */
    public final void mo5506(int i, int i2, Object[] objArr) {
        m42524(i);
        C9876.m24968(objArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f60232) {
            System.arraycopy(objArr, 0, this.f60231, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f60232, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC18245, l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        Object[] objArr = this.f60231;
        for (int i = 0; i < this.f60232; i++) {
            consumer.accept(objArr[i]);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC1625) {
            return m44066(i, (InterfaceC1625) collection);
        }
        m42524(i);
        int size = collection.size();
        if (size == 0) {
            return false;
        }
        m44065(this.f60232 + size);
        Object[] objArr = this.f60231;
        System.arraycopy(objArr, i, objArr, i + size, this.f60232 - i);
        Iterator it = collection.iterator();
        this.f60232 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f60231[i] = it.next();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44066(int i, InterfaceC1625 interfaceC1625) {
        m42524(i);
        int size = interfaceC1625.size();
        if (size == 0) {
            return false;
        }
        m44065(this.f60232 + size);
        Object[] objArr = this.f60231;
        System.arraycopy(objArr, i, objArr, i + size, this.f60232 - i);
        interfaceC1625.mo5505(0, i, size, this.f60231);
        this.f60232 += size;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr = this.f60231;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f60232;
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
        boolean z = this.f60232 != i3;
        this.f60232 = i3;
        return z;
    }

    @Override // l.AbstractC11462, java.util.Collection, l.InterfaceC1144
    public final boolean removeIf(Predicate predicate) {
        int i;
        Object[] objArr = this.f60231;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f60232;
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
        boolean z = this.f60232 != i3;
        this.f60232 = i3;
        return z;
    }

    @Override // l.AbstractC18245, l.InterfaceC1625, java.util.List
    public final InterfaceC10798 listIterator(int i) {
        m42524(i);
        return new C8535(this, i);
    }

    @Override // l.AbstractC18245, l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC19825, l.InterfaceC1144, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C15589(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C15589(this);
    }

    @Override // l.AbstractC18245, java.util.List, l.InterfaceC11728
    public final void sort(Comparator comparator) {
        if (comparator == null) {
            Arrays.sort(this.f60231, 0, this.f60232);
        } else {
            Arrays.sort(this.f60231, 0, this.f60232, comparator);
        }
    }

    public final Object clone() {
        Class<?> cls = getClass();
        Object[] objArrCopyOf = C7829.f24229;
        if (cls == C19119.class) {
            Object[] objArr = this.f60231;
            int i = this.f60232;
            if (i != 0) {
                objArrCopyOf = Arrays.copyOf(objArr, i, Object[].class);
            }
            C19119 c19119 = new C19119(objArrCopyOf, false);
            c19119.f60232 = this.f60232;
            return c19119;
        }
        try {
            C19119 c191110 = (C19119) super.clone();
            Object[] objArr2 = this.f60231;
            int i2 = this.f60232;
            if (i2 != 0) {
                objArrCopyOf = Arrays.copyOf(objArr2, i2, Object[].class);
            }
            c191110.f60231 = objArrCopyOf;
            return c191110;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    @Override // l.AbstractC18245, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C19119) {
            C19119 c19119 = (C19119) obj;
            if (c19119 != this) {
                int i = this.f60232;
                int i2 = c19119.f60232;
                if (i == i2) {
                    Object[] objArr = this.f60231;
                    Object[] objArr2 = c19119.f60231;
                    if (objArr != objArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (C11003.equals(objArr[i3], objArr2[i3])) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C18413) {
            return ((C18413) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC18245
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C19119) {
            C19119 c19119 = (C19119) list;
            int i = this.f60232;
            int i2 = c19119.f60232;
            Object[] objArr = this.f60231;
            Object[] objArr2 = c19119.f60231;
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
        if (list instanceof C18413) {
            return -((C18413) list).compareTo(this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f60231;
        for (int i = 0; i < this.f60232; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object[] objArr = new Object[this.f60232];
        this.f60231 = objArr;
        for (int i = 0; i < this.f60232; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }
}
