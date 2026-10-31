package l;

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
public final class C21983 extends AbstractC19499 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient char[] f70388;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f70389;

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C21983(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C18307.m42645(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f70388 = C12810.f38455;
        } else {
            this.f70388 = new char[i];
        }
    }

    public C21983() {
        this.f70388 = C12810.f38454;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21983(char[] cArr) {
        int length = cArr.length;
        this(length);
        System.arraycopy(cArr, 0, this.f70388, 0, length);
        this.f70389 = length;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49466(int i) {
        char[] cArr = this.f70388;
        if (i <= cArr.length) {
            return;
        }
        if (cArr != C12810.f38454) {
            i = (int) Math.max(Math.min(((long) cArr.length) + ((long) (cArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(this.f70388, 0, cArr2, 0, this.f70389);
        this.f70388 = cArr2;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ۧ */
    public final void mo3752(char c, int i) {
        m44912(i);
        m49466(this.f70389 + 1);
        int i2 = this.f70389;
        if (i != i2) {
            char[] cArr = this.f70388;
            System.arraycopy(cArr, i, cArr, i + 1, i2 - i);
        }
        this.f70388[i] = c;
        this.f70389++;
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8955(char c) {
        m49466(this.f70389 + 1);
        char[] cArr = this.f70388;
        int i = this.f70389;
        this.f70389 = i + 1;
        cArr[i] = c;
        return true;
    }

    @Override // l.InterfaceC1084
    public final char getChar(int i) {
        if (i < this.f70389) {
            return this.f70388[i];
        }
        throw new IndexOutOfBoundsException(C3200.m9831(this.f70389, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC19499, l.InterfaceC1084
    public final int indexOf(char c) {
        char[] cArr = this.f70388;
        for (int i = 0; i < this.f70389; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC19499, l.InterfaceC1084
    public final int lastIndexOf(char c) {
        char[] cArr = this.f70388;
        int i = this.f70389;
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

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֡ */
    public final char mo3746(int i) {
        int i2 = this.f70389;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f70389, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f70388;
        char c = cArr[i];
        int i3 = i2 - 1;
        this.f70389 = i3;
        if (i != i3) {
            System.arraycopy(cArr, i + 1, cArr, i, i3 - i);
        }
        return c;
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo2005(char c) {
        int iIndexOf = indexOf(c);
        if (iIndexOf == -1) {
            return false;
        }
        mo3746(iIndexOf);
        return true;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final char mo3747(char c, int i) {
        if (i >= this.f70389) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f70389, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        char[] cArr = this.f70388;
        char c2 = cArr[i];
        cArr[i] = c;
        return c2;
    }

    @Override // l.AbstractC19499, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f70389 = 0;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3749(int i, int i2, char[] cArr, int i3) {
        C9876.m24968(cArr.length, i2, i3);
        System.arraycopy(this.f70388, i, cArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f70389;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f70389) {
            return this;
        }
        m44912(i);
        m44912(i2);
        if (i <= i2) {
            return new C21278(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f70389 == 0;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3748(int i, int i2) {
        C9876.m24965(this.f70389, i, i2);
        char[] cArr = this.f70388;
        System.arraycopy(cArr, i2, cArr, i, this.f70389 - i2);
        this.f70389 -= i2 - i;
    }

    @Override // l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3751(char[] cArr, int i, int i2) {
        m44912(i);
        C9876.m24968(cArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f70389) {
            System.arraycopy(cArr, 0, this.f70388, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f70389, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC19499, l.AbstractC20910, l.InterfaceC9552
    /* JADX INFO: renamed from: ֫ */
    public final void mo10076(InterfaceC23662 interfaceC23662) {
        char[] cArr = this.f70388;
        for (int i = 0; i < this.f70389; i++) {
            interfaceC23662.mo18328(cArr[i]);
        }
    }

    @Override // l.AbstractC19499
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12022(int i, InterfaceC5755 interfaceC5755) {
        if (interfaceC5755 instanceof InterfaceC1084) {
            InterfaceC1084 interfaceC1084 = (InterfaceC1084) interfaceC5755;
            m44912(i);
            int size = interfaceC1084.size();
            if (size != 0) {
                m49466(this.f70389 + size);
                char[] cArr = this.f70388;
                System.arraycopy(cArr, i, cArr, i + size, this.f70389 - i);
                interfaceC1084.mo3749(0, i, this.f70388, size);
                this.f70389 += size;
                return true;
            }
        } else {
            m44912(i);
            int size2 = interfaceC5755.size();
            if (size2 != 0) {
                m49466(this.f70389 + size2);
                char[] cArr2 = this.f70388;
                System.arraycopy(cArr2, i, cArr2, i + size2, this.f70389 - i);
                InterfaceC15900 it = interfaceC5755.iterator();
                this.f70389 += size2;
                while (true) {
                    int i2 = size2 - 1;
                    if (size2 == 0) {
                        return true;
                    }
                    this.f70388[i] = it.mo7691();
                    size2 = i2;
                    i++;
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC20910
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo28163(InterfaceC5755 interfaceC5755) {
        int i;
        char[] cArr = this.f70388;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f70389;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC5755.mo8956(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f70389 = i3;
        return z;
    }

    @Override // l.AbstractC20910, l.InterfaceC5755
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16207(InterfaceC6023 interfaceC6023) {
        int i;
        char[] cArr = this.f70388;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f70389;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC6023.mo9839(cArr[i2])) {
                cArr[i3] = cArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f70389 = i3;
        return z;
    }

    @Override // l.AbstractC19499, l.InterfaceC1084, java.util.List
    public final InterfaceC15194 listIterator(int i) {
        m44912(i);
        return new C5049(this, i);
    }

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C0815(this);
    }

    @Override // l.AbstractC19499, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C0815(this);
    }

    @Override // l.AbstractC19499, l.InterfaceC1084
    /* JADX INFO: renamed from: ֫ */
    public final void mo3750(InterfaceC1790 interfaceC1790) {
        if (interfaceC1790 != null) {
            C12810.m31127(this.f70388, 0, this.f70389, interfaceC1790, (char[]) null);
        } else {
            C12810.m31124(this.f70388, this.f70389);
        }
    }

    @Override // l.AbstractC19499, l.InterfaceC1084
    /* JADX INFO: renamed from: ۧ */
    public final void mo3753(InterfaceC1790 interfaceC1790) {
        if (interfaceC1790 == null) {
            C12810.m31124(this.f70388, this.f70389);
        } else {
            C12810.m31126(this.f70388, 0, this.f70389, interfaceC1790);
        }
    }

    public final Object clone() {
        char[] cArrCopyOf;
        char[] cArr = this.f70388;
        int i = this.f70389;
        if (i == 0) {
            cArrCopyOf = C12810.f38455;
        } else {
            cArrCopyOf = Arrays.copyOf(cArr, i);
        }
        C21983 c21983 = new C21983();
        c21983.f70388 = cArrCopyOf;
        c21983.f70389 = this.f70389;
        return c21983;
    }

    @Override // l.AbstractC19499, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C21983) {
            C21983 c21983 = (C21983) obj;
            if (c21983 != this) {
                int i = this.f70389;
                int i2 = c21983.f70389;
                if (i == i2) {
                    char[] cArr = this.f70388;
                    char[] cArr2 = c21983.f70388;
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
        if (obj instanceof C21278) {
            return ((C21278) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC19499
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C21983) {
            C21983 c21983 = (C21983) list;
            int i = this.f70389;
            int i2 = c21983.f70389;
            char[] cArr = this.f70388;
            char[] cArr2 = c21983.f70388;
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
        if (list instanceof C21278) {
            return -((C21278) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f70388;
        for (int i = 0; i < this.f70389; i++) {
            objectOutputStream.writeChar(cArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        char[] cArr = new char[this.f70389];
        this.f70388 = cArr;
        for (int i = 0; i < this.f70389; i++) {
            cArr[i] = objectInputStream.readChar();
        }
    }
}
