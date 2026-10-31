package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A5X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18955 implements Collection, Set {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static Object[] f59778;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f59779;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int f59780;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Object[] f59781;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59783;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f59784;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f59785;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4138 f59786;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int[] f59777 = new int[0];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object[] f59782 = new Object[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43747(int i, Object obj) {
        int i2 = this.f59783;
        if (i2 == 0) {
            return -1;
        }
        int iM2486 = C0609.m2486(i2, i, this.f59784);
        if (iM2486 < 0 || obj.equals(this.f59785[iM2486])) {
            return iM2486;
        }
        int i3 = iM2486 + 1;
        while (i3 < i2 && this.f59784[i3] == i) {
            if (obj.equals(this.f59785[i3])) {
                return i3;
            }
            i3++;
        }
        do {
            iM2486--;
            if (iM2486 < 0 || this.f59784[iM2486] != i) {
                return ~i3;
            }
        } while (!obj.equals(this.f59785[iM2486]));
        return iM2486;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m43749() {
        int i = this.f59783;
        if (i == 0) {
            return -1;
        }
        int iM2486 = C0609.m2486(i, 0, this.f59784);
        if (iM2486 < 0 || this.f59785[iM2486] == null) {
            return iM2486;
        }
        int i2 = iM2486 + 1;
        while (i2 < i && this.f59784[i2] == 0) {
            if (this.f59785[i2] == null) {
                return i2;
            }
            i2++;
        }
        do {
            iM2486--;
            if (iM2486 < 0 || this.f59784[iM2486] != 0) {
                return ~i2;
            }
        } while (this.f59785[iM2486] != null);
        return iM2486;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m43750(int i) {
        if (i == 8) {
            synchronized (C18955.class) {
                Object[] objArr = f59778;
                if (objArr != null) {
                    this.f59785 = objArr;
                    f59778 = (Object[]) objArr[0];
                    this.f59784 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f59780--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C18955.class) {
                Object[] objArr2 = f59781;
                if (objArr2 != null) {
                    this.f59785 = objArr2;
                    f59781 = (Object[]) objArr2[0];
                    this.f59784 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f59779--;
                    return;
                }
            }
        }
        this.f59784 = new int[i];
        this.f59785 = new Object[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43748(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C18955.class) {
                if (f59780 < 10) {
                    objArr[0] = f59778;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f59778 = objArr;
                    f59780++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C18955.class) {
                if (f59779 < 10) {
                    objArr[0] = f59781;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f59781 = objArr;
                    f59779++;
                }
            }
        }
    }

    public C18955() {
        this(0);
    }

    public C18955(int i) {
        if (i == 0) {
            this.f59784 = f59777;
            this.f59785 = f59782;
        } else {
            m43750(i);
        }
        this.f59783 = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f59783;
        if (i != 0) {
            m43748(this.f59784, this.f59785, i);
            this.f59784 = f59777;
            this.f59785 = f59782;
            this.f59783 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m43749() : m43747(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f59783 <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iHashCode;
        int iM43747;
        if (obj == null) {
            iM43747 = m43749();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM43747 = m43747(iHashCode, obj);
        }
        if (iM43747 >= 0) {
            return false;
        }
        int i = ~iM43747;
        int i2 = this.f59783;
        int[] iArr = this.f59784;
        if (i2 >= iArr.length) {
            int i3 = 8;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i3 = 4;
            }
            Object[] objArr = this.f59785;
            m43750(i3);
            int[] iArr2 = this.f59784;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f59785, 0, objArr.length);
            }
            m43748(iArr, objArr, this.f59783);
        }
        int i4 = this.f59783;
        if (i < i4) {
            int[] iArr3 = this.f59784;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.f59785;
            System.arraycopy(objArr2, i, objArr2, i5, this.f59783 - i);
        }
        this.f59784[i] = iHashCode;
        this.f59785[i] = obj;
        this.f59783++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m43751(iIndexOf);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43751(int i) {
        Object[] objArr = this.f59785;
        Object obj = objArr[i];
        int i2 = this.f59783;
        if (i2 <= 1) {
            m43748(this.f59784, objArr, i2);
            this.f59784 = f59777;
            this.f59785 = f59782;
            this.f59783 = 0;
            return;
        }
        int[] iArr = this.f59784;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            m43750(i2 > 8 ? i2 + (i2 >> 1) : 8);
            this.f59783--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f59784, 0, i);
                System.arraycopy(objArr, 0, this.f59785, 0, i);
            }
            int i3 = this.f59783;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, this.f59784, i, i3 - i);
                System.arraycopy(objArr, i4, this.f59785, i, this.f59783 - i);
                return;
            }
            return;
        }
        int i5 = i2 - 1;
        this.f59783 = i5;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, iArr, i, i5 - i);
            Object[] objArr2 = this.f59785;
            System.arraycopy(objArr2, i6, objArr2, i, this.f59783 - i);
        }
        this.f59785[this.f59783] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f59783;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f59783;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f59785, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f59783) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f59783);
        }
        System.arraycopy(this.f59785, 0, objArr, 0, this.f59783);
        int length = objArr.length;
        int i = this.f59783;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f59783 != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f59783; i++) {
                try {
                    if (!set.contains(this.f59785[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f59784;
        int i = this.f59783;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f59783 * 14);
        sb.append('{');
        for (int i = 0; i < this.f59783; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f59785[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f59786 == null) {
            this.f59786 = new C4138(this);
        }
        C4138 c4138 = this.f59786;
        if (c4138.f15301 == null) {
            c4138.f15301 = new C21777(c4138);
        }
        return c4138.f15301.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f59783;
        int[] iArr = this.f59784;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f59785;
            m43750(size);
            int i = this.f59783;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f59784, 0, i);
                System.arraycopy(objArr, 0, this.f59785, 0, this.f59783);
            }
            m43748(iArr, objArr, this.f59783);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f59783 - 1; i >= 0; i--) {
            if (!collection.contains(this.f59785[i])) {
                m43751(i);
                z = true;
            }
        }
        return z;
    }
}
