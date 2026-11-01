package p067l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֫᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public class C4330 implements Set {

    /* JADX INFO: renamed from: ۗ */
    public int f9667 = 0;

    /* JADX INFO: renamed from: ۙ */
    public final int f9668;

    /* JADX INFO: renamed from: ۬ */
    public int f9669;

    /* JADX INFO: renamed from: ᩶ */
    public final int f9670;

    /* JADX INFO: renamed from: ᩸ */
    public Object[][] f9671;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC5050 f9672;

    /* JADX INFO: renamed from: ֫ */
    public Object mo8874(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public Object[] mo8875(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public Object[][] mo8877(int i) {
        throw null;
    }

    public C4330(AbstractC5050 abstractC5050, int i) {
        this.f9672 = abstractC5050 == null ? C9024.f24488 : abstractC5050;
        this.f9668 = 16;
        this.f9670 = i;
        this.f9671 = mo8877(16);
        this.f9669 = (int) Math.floor(((double) 16) * 0.75d);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m8880(Object obj) {
        Object[] objArrCopyOf;
        int i = this.f9667;
        int i2 = this.f9669;
        int i3 = this.f9670;
        if (i > i2) {
            Object[][] objArr = this.f9671;
            int length = objArr.length * 2;
            Object[][] objArrMo8877 = mo8877(length);
            int[] iArr = new int[objArrMo8877.length];
            this.f9671 = objArrMo8877;
            this.f9669 = (int) (((double) length) * 0.75d);
            for (Object[] objArr2 : objArr) {
                if (objArr2 != null) {
                    for (Object obj2 : objArr2) {
                        if (obj2 == null) {
                            break;
                        }
                        int iM8878 = m8878(obj2);
                        int i4 = iArr[iM8878];
                        if (i4 == 0) {
                            objArrCopyOf = mo8875(i3);
                            objArrMo8877[iM8878] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArrMo8877[iM8878];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArrMo8877[iM8878] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iM8878] = iArr[iM8878] + 1;
                    }
                }
            }
        }
        int iM8879 = m8878(obj);
        Object[] objArr3 = this.f9671[iM8879];
        if (objArr3 == null) {
            Object[] objArrMo8875 = mo8875(i3);
            objArrMo8875[0] = obj;
            this.f9671[iM8879] = objArrMo8875;
            this.f9667++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr3.length; i5++) {
            Object obj3 = objArr3[i5];
            if (obj3 == null) {
                objArr3[i5] = obj;
                this.f9667++;
                return obj;
            }
            if (this.f9672.mo10776(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length * 2);
        this.f9671[iM8879] = objArrCopyOf2;
        objArrCopyOf2[length2] = obj;
        this.f9667++;
        return obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m8876(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9671[m8878(obj)];
            Object obj2 = null;
            if (objArr != null) {
                for (Object obj3 : objArr) {
                    if (obj3 == null) {
                        break;
                    }
                    if (this.f9672.mo10776(obj3, obj)) {
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

    /* JADX INFO: renamed from: ܽ */
    public final int m8878(Object obj) {
        return this.f9672.mo10772(obj) & (this.f9671.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM9002 = 0;
        for (Object[] objArr : this.f9671) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iM9002 = C4358.m9002(iM9002, this.f9672.mo10772(obj));
                }
            }
        }
        return C4358.m8999(iM9002, this.f9667);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4330)) {
            return false;
        }
        C4330 c4330 = (C4330) obj;
        if (c4330.f9667 != this.f9667) {
            return false;
        }
        return containsAll(c4330);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return m8880(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f9667;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        Object[] objArrMo8875 = mo8875(this.f9667);
        int i = 0;
        for (Object[] objArr : this.f9671) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    objArrMo8875[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArrMo8875;
    }

    public final String toString() {
        if (this.f9667 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.f9671) {
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
        return this.f9667 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m8876(mo8874(obj));
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C9300(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f9667;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.f9671) {
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
        return m8879(mo8874(obj));
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m8879(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f9671[m8878(obj)];
            if (objArr != null) {
                for (int i = 0; i < objArr.length && (obj2 = objArr[i]) != null; i++) {
                    if (this.f9672.mo10776(obj2, obj)) {
                        System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                        objArr[objArr.length - 1] = null;
                        this.f9667--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C4330) {
            for (Object[] objArr : ((C4330) collection).f9671) {
                if (objArr != null) {
                    for (Object obj : objArr) {
                        if (obj == null) {
                            break;
                        }
                        if (m8876(mo8874(obj))) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m8876(mo8874(it.next()))) {
            }
        }
        return true;
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m8880(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.f9671) {
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
        boolean z = i != this.f9667;
        this.f9667 = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zM8879 = false;
        while (it.hasNext()) {
            zM8879 |= m8879(mo8874(it.next()));
        }
        return zM8879;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f9667 = 0;
        int i = this.f9668;
        this.f9671 = mo8877(i);
        this.f9669 = (int) Math.floor(((double) i) * 0.75d);
    }
}
