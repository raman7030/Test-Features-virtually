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
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ܺۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17441 extends AbstractC12293 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸ */
    public transient int[] f52158;

    /* JADX INFO: renamed from: ᩹ */
    public int f52159;

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C17441(int[] iArr) {
        this.f52158 = iArr;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m39767(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C19768.m44906(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f52158 = C20796.f65364;
        } else {
            this.f52158 = new int[i];
        }
    }

    public C17441(int i) {
        m39767(i);
    }

    public C17441() {
        this.f52158 = C20796.f65363;
    }

    public C17441(InterfaceC3340 interfaceC3340) {
        int[] iArrCopyOf;
        if (interfaceC3340 instanceof C17441) {
            C17441 c17441 = (C17441) interfaceC3340;
            int[] iArr = c17441.f52158;
            int i = c17441.f52159;
            if (i == 0) {
                iArrCopyOf = C20796.f65364;
            } else {
                iArrCopyOf = Arrays.copyOf(iArr, i);
            }
            this.f52158 = iArrCopyOf;
            this.f52159 = iArrCopyOf.length;
            return;
        }
        m39767(interfaceC3340.size());
        int[] iArr2 = this.f52158;
        int size = interfaceC3340.size();
        this.f52159 = size;
        interfaceC3340.mo5825(0, 0, size, iArr2);
    }

    public C17441(int[] iArr, int i) {
        this(34);
        System.arraycopy(iArr, 1, this.f52158, 0, 34);
        this.f52159 = 34;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17441 m39765(int[] iArr) {
        int length = iArr.length;
        if (length > iArr.length) {
            throw new IllegalArgumentException(C5410.m11876(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(length, "The specified length (", ") is greater than the array size (")));
        }
        C17441 c17441 = new C17441(iArr);
        c17441.f52159 = length;
        return c17441;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m39766(int i) {
        int[] iArr = this.f52158;
        if (i <= iArr.length) {
            return;
        }
        if (iArr != C20796.f65363) {
            i = (int) Math.max(Math.min(((long) iArr.length) + ((long) (iArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(this.f52158, 0, iArr2, 0, this.f52159);
        this.f52158 = iArr2;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final void add(int i, int i2) {
        m28310(i);
        m39766(this.f52159 + 1);
        int i3 = this.f52159;
        if (i != i3) {
            int[] iArr = this.f52158;
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.f52158[i] = i2;
        this.f52159++;
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        m39766(this.f52159 + 1);
        int[] iArr = this.f52158;
        int i2 = this.f52159;
        this.f52159 = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // p067l.InterfaceC3340
    public final int getInt(int i) {
        if (i < this.f52159) {
            return this.f52158[i];
        }
        throw new IndexOutOfBoundsException(C5410.m11876(this.f52159, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int indexOf(int i) {
        int[] iArr = this.f52158;
        for (int i2 = 0; i2 < this.f52159; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int lastIndexOf(int i) {
        int[] iArr = this.f52158;
        int i2 = this.f52159;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            if (i == iArr[i3]) {
                return i3;
            }
            i2 = i3;
        }
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5825(int i, int i2, int i3, int[] iArr) {
        C11755.m26983(iArr.length, i2, i3);
        System.arraycopy(this.f52158, i, iArr, i2, i3);
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۘ */
    public final int mo5829(int i) {
        int i2 = this.f52159;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f52159, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f52158;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.f52159 = i4;
        if (i != i4) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        }
        return i3;
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo5872(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        mo5829(iIndexOf);
        return true;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    public final int set(int i, int i2) {
        if (i >= this.f52159) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f52159, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f52158;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // p067l.AbstractC12293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f52159 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f52159;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        if (i == 0 && i2 == this.f52159) {
            return this;
        }
        m28310(i);
        m28310(i2);
        if (i <= i2) {
            return new C10737(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f52159 == 0;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5824(int i, int i2) {
        C11755.m26980(this.f52159, i, i2);
        int[] iArr = this.f52158;
        System.arraycopy(iArr, i2, iArr, i, this.f52159 - i2);
        this.f52159 -= i2 - i;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5831(int i, int i2, int[] iArr) {
        m28310(i);
        C11755.m26983(iArr.length, 0, i2);
        m39766(this.f52159 + i2);
        int[] iArr2 = this.f52158;
        System.arraycopy(iArr2, i, iArr2, i + i2, this.f52159 - i);
        System.arraycopy(iArr, 0, this.f52158, i, i2);
        this.f52159 += i2;
    }

    @Override // p067l.InterfaceC3340
    /* JADX INFO: renamed from: ֫ */
    public final void mo5826(int i, int i2, int[] iArr) {
        m28310(i);
        C11755.m26983(iArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f52159) {
            System.arraycopy(iArr, 0, this.f52158, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f52159, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, p067l.InterfaceC16080
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f52158;
        for (int i = 0; i < this.f52159; i++) {
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // p067l.AbstractC12293
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28311(int i, InterfaceC3360 interfaceC3360) {
        if (interfaceC3360 instanceof InterfaceC3340) {
            return m39768(i, (InterfaceC3340) interfaceC3360);
        }
        m28310(i);
        int size = interfaceC3360.size();
        if (size == 0) {
            return false;
        }
        m39766(this.f52159 + size);
        int[] iArr = this.f52158;
        System.arraycopy(iArr, i, iArr, i + size, this.f52159 - i);
        InterfaceC8705 it = interfaceC3360.iterator();
        this.f52159 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f52158[i] = it.nextInt();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39768(int i, InterfaceC3340 interfaceC3340) {
        m28310(i);
        int size = interfaceC3340.size();
        if (size == 0) {
            return false;
        }
        m39766(this.f52159 + size);
        int[] iArr = this.f52158;
        System.arraycopy(iArr, i, iArr, i + size, this.f52159 - i);
        interfaceC3340.mo5825(0, i, size, this.f52158);
        this.f52159 += size;
        return true;
    }

    @Override // p067l.AbstractC23022
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo23493(InterfaceC3360 interfaceC3360) {
        int i;
        int[] iArr = this.f52158;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f52159;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC3360.contains(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f52159 = i3;
        return z;
    }

    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5871(IntPredicate intPredicate) {
        int i;
        int[] iArr = this.f52158;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f52159;
            if (i2 >= i) {
                break;
            }
            if (!intPredicate.test(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f52159 = i3;
        return z;
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC16750 listIterator(int i) {
        m28310(i);
        return new C24818(i, this);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C8725(this);
    }

    @Override // p067l.AbstractC12293, p067l.AbstractC23022, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18287 spliterator() {
        return new C8725(this);
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ܽ */
    public final void mo5834(InterfaceC6713 interfaceC6713) {
        if (interfaceC6713 == null) {
            C20796.m46954(this.f52159, this.f52158);
        } else {
            C20796.m46956(this.f52158, 0, this.f52159, interfaceC6713, (int[]) null);
        }
    }

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340
    /* JADX INFO: renamed from: ۧ */
    public final void mo5832(InterfaceC6713 interfaceC6713) {
        if (interfaceC6713 == null) {
            C20796.m46954(this.f52159, this.f52158);
        } else {
            C20796.m46955(this.f52158, 0, this.f52159, interfaceC6713);
        }
    }

    public final Object clone() {
        int[] iArrCopyOf;
        int[] iArr = this.f52158;
        int i = this.f52159;
        if (i == 0) {
            iArrCopyOf = C20796.f65364;
        } else {
            iArrCopyOf = Arrays.copyOf(iArr, i);
        }
        C17441 c17441 = new C17441(iArrCopyOf);
        c17441.f52159 = this.f52159;
        return c17441;
    }

    @Override // p067l.AbstractC12293, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C17441) {
            C17441 c17441 = (C17441) obj;
            if (c17441 != this) {
                int i = this.f52159;
                int i2 = c17441.f52159;
                if (i == i2) {
                    int[] iArr = this.f52158;
                    int[] iArr2 = c17441.f52158;
                    if (iArr != iArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (iArr[i3] == iArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C10737) {
            return ((C10737) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // p067l.AbstractC12293, java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C17441) {
            C17441 c17441 = (C17441) list;
            int i = this.f52159;
            int i2 = c17441.f52159;
            int[] iArr = this.f52158;
            int[] iArr2 = c17441.f52158;
            if (iArr != iArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Integer.compare(iArr[i3], iArr2[i3]);
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
        if (list instanceof C10737) {
            return -((C10737) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f52158;
        for (int i = 0; i < this.f52159; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f52159];
        this.f52158 = iArr;
        for (int i = 0; i < this.f52159; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
