package p067l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴ᩵ */
/* JADX INFO: compiled from: A5X5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1782 implements Collection, Set {

    /* JADX INFO: renamed from: ۛ */
    public static Object[] f63007;

    /* JADX INFO: renamed from: ۤ */
    public static int f63008;

    /* JADX INFO: renamed from: ۨ */
    public static int f63009;

    /* JADX INFO: renamed from: ۫ */
    public static Object[] f63010;

    /* JADX INFO: renamed from: ۙ */
    public int f63012;

    /* JADX INFO: renamed from: ᩶ */
    public int[] f63013;

    /* JADX INFO: renamed from: ᩸ */
    public Object[] f63014;

    /* JADX INFO: renamed from: ᩹ */
    public C1047 f63015;

    /* JADX INFO: renamed from: ۗ */
    public static final int[] f63006 = new int[0];

    /* JADX INFO: renamed from: ۬ */
    public static final Object[] f63011 = new Object[0];

    /* JADX INFO: renamed from: ֫ */
    private int m46014(int i, Object obj) {
        int i2 = this.f63012;
        if (i2 == 0) {
            return -1;
        }
        int iM4842 = C0872.m4842(i2, i, this.f63013);
        if (iM4842 < 0 || obj.equals(this.f63014[iM4842])) {
            return iM4842;
        }
        int i3 = iM4842 + 1;
        while (i3 < i2 && this.f63013[i3] == i) {
            if (obj.equals(this.f63014[i3])) {
                return i3;
            }
            i3++;
        }
        do {
            iM4842--;
            if (iM4842 < 0 || this.f63013[iM4842] != i) {
                return ~i3;
            }
        } while (!obj.equals(this.f63014[iM4842]));
        return iM4842;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m46016() {
        int i = this.f63012;
        if (i == 0) {
            return -1;
        }
        int iM4842 = C0872.m4842(i, 0, this.f63013);
        if (iM4842 < 0 || this.f63014[iM4842] == null) {
            return iM4842;
        }
        int i2 = iM4842 + 1;
        while (i2 < i && this.f63013[i2] == 0) {
            if (this.f63014[i2] == null) {
                return i2;
            }
            i2++;
        }
        do {
            iM4842--;
            if (iM4842 < 0 || this.f63013[iM4842] != 0) {
                return ~i2;
            }
        } while (this.f63014[iM4842] != null);
        return iM4842;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m46017(int i) {
        if (i == 8) {
            synchronized (C1782.class) {
                Object[] objArr = f63007;
                if (objArr != null) {
                    this.f63014 = objArr;
                    f63007 = (Object[]) objArr[0];
                    this.f63013 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f63009--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1782.class) {
                Object[] objArr2 = f63010;
                if (objArr2 != null) {
                    this.f63014 = objArr2;
                    f63010 = (Object[]) objArr2[0];
                    this.f63013 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f63008--;
                    return;
                }
            }
        }
        this.f63013 = new int[i];
        this.f63014 = new Object[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46015(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1782.class) {
                if (f63009 < 10) {
                    objArr[0] = f63007;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f63007 = objArr;
                    f63009++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1782.class) {
                if (f63008 < 10) {
                    objArr[0] = f63010;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f63010 = objArr;
                    f63008++;
                }
            }
        }
    }

    public C1782() {
        this(0);
    }

    public C1782(int i) {
        if (i == 0) {
            this.f63013 = f63006;
            this.f63014 = f63011;
        } else {
            m46017(i);
        }
        this.f63012 = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f63012;
        if (i != 0) {
            m46015(this.f63013, this.f63014, i);
            this.f63013 = f63006;
            this.f63014 = f63011;
            this.f63012 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m46016() : m46014(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f63012 <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iHashCode;
        int iM46014;
        if (obj == null) {
            iM46014 = m46016();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iM46014 = m46014(iHashCode, obj);
        }
        if (iM46014 >= 0) {
            return false;
        }
        int i = ~iM46014;
        int i2 = this.f63012;
        int[] iArr = this.f63013;
        if (i2 >= iArr.length) {
            int i3 = 8;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i3 = 4;
            }
            Object[] objArr = this.f63014;
            m46017(i3);
            int[] iArr2 = this.f63013;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f63014, 0, objArr.length);
            }
            m46015(iArr, objArr, this.f63012);
        }
        int i4 = this.f63012;
        if (i < i4) {
            int[] iArr3 = this.f63013;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.f63014;
            System.arraycopy(objArr2, i, objArr2, i5, this.f63012 - i);
        }
        this.f63013[i] = iHashCode;
        this.f63014[i] = obj;
        this.f63012++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m46018(iIndexOf);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46018(int i) {
        Object[] objArr = this.f63014;
        Object obj = objArr[i];
        int i2 = this.f63012;
        if (i2 <= 1) {
            m46015(this.f63013, objArr, i2);
            this.f63013 = f63006;
            this.f63014 = f63011;
            this.f63012 = 0;
            return;
        }
        int[] iArr = this.f63013;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            m46017(i2 > 8 ? i2 + (i2 >> 1) : 8);
            this.f63012--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f63013, 0, i);
                System.arraycopy(objArr, 0, this.f63014, 0, i);
            }
            int i3 = this.f63012;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, this.f63013, i, i3 - i);
                System.arraycopy(objArr, i4, this.f63014, i, this.f63012 - i);
                return;
            }
            return;
        }
        int i5 = i2 - 1;
        this.f63012 = i5;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, iArr, i, i5 - i);
            Object[] objArr2 = this.f63014;
            System.arraycopy(objArr2, i6, objArr2, i, this.f63012 - i);
        }
        this.f63014[this.f63012] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f63012;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f63012;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f63014, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f63012) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f63012);
        }
        System.arraycopy(this.f63014, 0, objArr, 0, this.f63012);
        int length = objArr.length;
        int i = this.f63012;
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
            if (this.f63012 != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f63012; i++) {
                try {
                    if (!set.contains(this.f63014[i])) {
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
        int[] iArr = this.f63013;
        int i = this.f63012;
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
        StringBuilder sb = new StringBuilder(this.f63012 * 14);
        sb.append('{');
        for (int i = 0; i < this.f63012; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f63014[i];
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
        if (this.f63015 == null) {
            this.f63015 = new C1047(this);
        }
        C1047 c1047 = this.f63015;
        if (c1047.f18133 == null) {
            c1047.f18133 = new C1922(c1047);
        }
        return c1047.f18133.iterator();
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
        int size = collection.size() + this.f63012;
        int[] iArr = this.f63013;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f63014;
            m46017(size);
            int i = this.f63012;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f63013, 0, i);
                System.arraycopy(objArr, 0, this.f63014, 0, this.f63012);
            }
            m46015(iArr, objArr, this.f63012);
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
        for (int i = this.f63012 - 1; i >= 0; i--) {
            if (!collection.contains(this.f63014[i])) {
                m46018(i);
                z = true;
            }
        }
        return z;
    }
}
