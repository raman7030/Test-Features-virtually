package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public class C2064 implements Set {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f6883 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6884;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f6885;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f6886;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[][] f6887;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f6888;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo6748(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] mo6749(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object[][] mo6751(int i) {
        throw null;
    }

    public C2064(AbstractC2821 abstractC2821, int i) {
        this.f6888 = abstractC2821 == null ? C7003.f21607 : abstractC2821;
        this.f6884 = 16;
        this.f6886 = i;
        this.f6887 = mo6751(16);
        this.f6885 = (int) Math.floor(((double) 16) * 0.75d);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m6754(Object obj) {
        Object[] objArrCopyOf;
        int i = this.f6883;
        int i2 = this.f6885;
        int i3 = this.f6886;
        if (i > i2) {
            Object[][] objArr = this.f6887;
            int length = objArr.length * 2;
            Object[][] objArrMo6751 = mo6751(length);
            int[] iArr = new int[objArrMo6751.length];
            this.f6887 = objArrMo6751;
            this.f6885 = (int) (((double) length) * 0.75d);
            for (Object[] objArr2 : objArr) {
                if (objArr2 != null) {
                    for (Object obj2 : objArr2) {
                        if (obj2 == null) {
                            break;
                        }
                        int iM6752 = m6752(obj2);
                        int i4 = iArr[iM6752];
                        if (i4 == 0) {
                            objArrCopyOf = mo6749(i3);
                            objArrMo6751[iM6752] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArrMo6751[iM6752];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArrMo6751[iM6752] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iM6752] = iArr[iM6752] + 1;
                    }
                }
            }
        }
        int iM6753 = m6752(obj);
        Object[] objArr3 = this.f6887[iM6753];
        if (objArr3 == null) {
            Object[] objArrMo6749 = mo6749(i3);
            objArrMo6749[0] = obj;
            this.f6887[iM6753] = objArrMo6749;
            this.f6883++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr3.length; i5++) {
            Object obj3 = objArr3[i5];
            if (obj3 == null) {
                objArr3[i5] = obj;
                this.f6883++;
                return obj;
            }
            if (this.f6888.mo8715(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length * 2);
        this.f6887[iM6753] = objArrCopyOf2;
        objArrCopyOf2[length2] = obj;
        this.f6883++;
        return obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m6750(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f6887[m6752(obj)];
            Object obj2 = null;
            if (objArr != null) {
                for (Object obj3 : objArr) {
                    if (obj3 == null) {
                        break;
                    }
                    if (this.f6888.mo8715(obj3, obj)) {
                        obj2 = obj3;
                        break;
                    }
                }
            }
            if (obj2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6752(Object obj) {
        return this.f6888.mo8711(obj) & (this.f6887.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM6876 = 0;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iM6876 = C2093.m6876(iM6876, this.f6888.mo8711(obj));
                }
            }
        }
        return C2093.m6873(iM6876, this.f6883);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2064)) {
            return false;
        }
        C2064 c2064 = (C2064) obj;
        if (c2064.f6883 != this.f6883) {
            return false;
        }
        return containsAll(c2064);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return m6754(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f6883;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        Object[] objArrMo6749 = mo6749(this.f6883);
        int i = 0;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    objArrMo6749[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArrMo6749;
    }

    public final String toString() {
        if (this.f6883 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f6883 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m6750(mo6748(obj));
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7294(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f6883;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.f6887) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    if (obj == null) {
                        break;
                    }
                    objArr[i2] = obj;
                    i3++;
                    i2++;
                }
            }
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m6753(mo6748(obj));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m6753(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f6887[m6752(obj)];
            if (objArr != null) {
                for (int i = 0; i < objArr.length && (obj2 = objArr[i]) != null; i++) {
                    if (this.f6888.mo8715(obj2, obj)) {
                        System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                        objArr[objArr.length - 1] = null;
                        this.f6883--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C2064) {
            for (Object[] objArr : ((C2064) collection).f6887) {
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj == null) {
                            break;
                        }
                        if (m6750(mo6748(obj))) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m6750(mo6748(it.next()))) {
            }
        }
        return true;
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m6754(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (collection.contains(obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f6883;
        this.f6883 = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zM6753 = false;
        while (it.hasNext()) {
            zM6753 |= m6753(mo6748(it.next()));
        }
        return zM6753;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f6883 = 0;
        int i = this.f6884;
        this.f6887 = mo6751(i);
        this.f6885 = (int) Math.floor(((double) i) * 0.75d);
    }
}
