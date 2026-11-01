package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩹֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes2.dex */
public final class C23261 extends AbstractC20900 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸ */
    public transient char[] f73099;

    /* JADX INFO: renamed from: ᩹ */
    public int f73100;

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C23261(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C19768.m44906(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f73099 = C14543.f41497;
        } else {
            this.f73099 = new char[i];
        }
    }

    public C23261() {
        this.f73099 = C14543.f41496;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23261(char[] cArr) {
        int length = cArr.length;
        this(length);
        System.arraycopy(cArr, 0, this.f73099, 0, length);
        this.f73100 = length;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m51803(int i) {
        char[] cArr = this.f73099;
        if (i <= cArr.length) {
            return;
        }
        if (cArr != C14543.f41496) {
            i = (int) Math.max(Math.min(((long) cArr.length) + ((long) (cArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(this.f73099, 0, cArr2, 0, this.f73100);
        this.f73099 = cArr2;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ۧ */
    public final void mo6023(char c, int i) {
        m47210(i);
        m51803(this.f73100 + 1);
        int i2 = this.f73100;
        if (i != i2) {
            char[] cArr = this.f73099;
            System.arraycopy(cArr, i, cArr, i + 1, i2 - i);
        }
        this.f73099[i] = c;
        this.f73100++;
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11023(char c) {
        m51803(this.f73100 + 1);
        char[] cArr = this.f73099;
        int i = this.f73100;
        this.f73100 = i + 1;
        cArr[i] = c;
        return true;
    }

    @Override // p067l.InterfaceC3399
    public final char getChar(int i) {
        if (i < this.f73100) {
            return this.f73099[i];
        }
        throw new IndexOutOfBoundsException(C5410.m11876(this.f73100, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399
    public final int indexOf(char c) {
        char[] cArr = this.f73099;
        for (int i = 0; i < this.f73100; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399
    public final int lastIndexOf(char c) {
        char[] cArr = this.f73099;
        int i = this.f73100;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (c == cArr[i2]) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֡ */
    public final char mo6017(int i) {
        int i2 = this.f73100;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f73100, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f73099;
        char c = cArr[i];
        int i3 = i2 - 1;
        this.f73100 = i3;
        if (i != i3) {
            System.arraycopy(cArr, i + 1, cArr, i, i3 - i);
        }
        return c;
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4382(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        mo6017(iIndexOf);
        return true;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final char mo6018(char c, int i) {
        if (i >= this.f73100) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f73100, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f73099;
        char c2 = cArr[i];
        cArr[i] = c;
        return c2;
    }

    @Override // p067l.AbstractC20900, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f73100 = 0;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6020(int i, int i2, char[] cArr, int i3) {
        C11755.m26983(cArr.length, i2, i3);
        System.arraycopy(this.f73099, i, cArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f73100;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f73100) {
            return this;
        }
        m47210(i);
        m47210(i2);
        if (i <= i2) {
            return new C22591(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f73100 == 0;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6019(int i, int i2) {
        C11755.m26980(this.f73100, i, i2);
        char[] cArr = this.f73099;
        System.arraycopy(cArr, i2, cArr, i, this.f73100 - i2);
        this.f73100 -= i2 - i;
    }

    @Override // p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6022(char[] cArr, int i, int i2) {
        m47210(i);
        C11755.m26983(cArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f73100) {
            System.arraycopy(cArr, 0, this.f73099, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f73100, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public final void mo12109(InterfaceC24857 interfaceC24857) {
        char[] cArr = this.f73099;
        for (int i = 0; i < this.f73100; i++) {
            interfaceC24857.mo20276(cArr[i]);
        }
    }

    @Override // p067l.AbstractC20900
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13946(int i, InterfaceC7838 interfaceC7838) {
        if (interfaceC7838 instanceof InterfaceC3399) {
            InterfaceC3399 interfaceC3399 = (InterfaceC3399) interfaceC7838;
            m47210(i);
            int size = interfaceC3399.size();
            if (size != 0) {
                m51803(this.f73100 + size);
                char[] cArr = this.f73099;
                System.arraycopy(cArr, i, cArr, i + size, this.f73100 - i);
                interfaceC3399.mo6020(0, i, this.f73099, size);
                this.f73100 += size;
                return true;
            }
        } else {
            m47210(i);
            int size2 = interfaceC7838.size();
            if (size2 != 0) {
                m51803(this.f73100 + size2);
                char[] cArr2 = this.f73099;
                System.arraycopy(cArr2, i, cArr2, i + size2, this.f73100 - i);
                InterfaceC17480 it = interfaceC7838.iterator();
                this.f73100 += size2;
                while (true) {
                    int i2 = size2 - 1;
                    if (size2 == 0) {
                        return true;
                    }
                    this.f73099[i] = it.mo9752();
                    size2 = i2;
                    i++;
                }
            }
        }
        return false;
    }

    @Override // p067l.AbstractC22241
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo30207(InterfaceC7838 interfaceC7838) {
        int i;
        char[] cArr = this.f73099;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f73100;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC7838.mo11024(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f73100 = i3;
        return z;
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC7838
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18126(InterfaceC8093 interfaceC8093) {
        int i;
        char[] cArr = this.f73099;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f73100;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC8093.mo11886(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f73100 = i3;
        return z;
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399, java.util.List
    public final InterfaceC16809 listIterator(int i) {
        m47210(i);
        return new C7167(this, i);
    }

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C3143(this);
    }

    @Override // p067l.AbstractC20900, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C3143(this);
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399
    /* JADX INFO: renamed from: ֫ */
    public final void mo6021(InterfaceC4070 interfaceC4070) {
        if (interfaceC4070 != null) {
            C14543.m33212(this.f73099, 0, this.f73100, interfaceC4070, (char[]) null);
        } else {
            C14543.m33209(this.f73099, this.f73100);
        }
    }

    @Override // p067l.AbstractC20900, p067l.InterfaceC3399
    /* JADX INFO: renamed from: ۧ */
    public final void mo6024(InterfaceC4070 interfaceC4070) {
        if (interfaceC4070 == null) {
            C14543.m33209(this.f73099, this.f73100);
        } else {
            C14543.m33211(this.f73099, 0, this.f73100, interfaceC4070);
        }
    }

    public final Object clone() {
        char[] cArrCopyOf;
        char[] cArr = this.f73099;
        int i = this.f73100;
        if (i == 0) {
            cArrCopyOf = C14543.f41497;
        } else {
            cArrCopyOf = Arrays.copyOf(cArr, i);
        }
        C23261 c23261 = new C23261();
        c23261.f73099 = cArrCopyOf;
        c23261.f73100 = this.f73100;
        return c23261;
    }

    @Override // p067l.AbstractC20900, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C23261) {
            C23261 c23261 = (C23261) obj;
            if (c23261 != this) {
                int i = this.f73100;
                int i2 = c23261.f73100;
                if (i == i2) {
                    char[] cArr = this.f73099;
                    char[] cArr2 = c23261.f73099;
                    if (cArr != cArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (cArr[i3] == cArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C22591) {
            return ((C22591) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // p067l.AbstractC20900
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C23261) {
            C23261 c23261 = (C23261) list;
            int i = this.f73100;
            int i2 = c23261.f73100;
            char[] cArr = this.f73099;
            char[] cArr2 = c23261.f73099;
            if (cArr != cArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Character.compare(cArr[i3], cArr2[i3]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    return -1;
                }
                if (i3 < i) {
                    return 1;
                }
            }
            return 0;
        }
        if (list instanceof C22591) {
            return -((C22591) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f73099;
        for (int i = 0; i < this.f73100; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f73100];
        this.f73099 = cArr;
        for (int i = 0; i < this.f73100; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
