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
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ܺۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C15859 extends AbstractC10442 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient int[] f49020;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49021;

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C15859(int[] iArr) {
        this.f49020 = iArr;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m37595(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C18307.m42645(i, "Initial capacity (", ") is negative"));
        }
        if (i == 0) {
            this.f49020 = C19389.f62753;
        } else {
            this.f49020 = new int[i];
        }
    }

    public C15859(int i) {
        m37595(i);
    }

    public C15859() {
        this.f49020 = C19389.f62752;
    }

    public C15859(InterfaceC1022 interfaceC1022) {
        int[] iArrCopyOf;
        if (interfaceC1022 instanceof C15859) {
            C15859 c15859 = (C15859) interfaceC1022;
            int[] iArr = c15859.f49020;
            int i = c15859.f49021;
            if (i == 0) {
                iArrCopyOf = C19389.f62753;
            } else {
                iArrCopyOf = Arrays.copyOf(iArr, i);
            }
            this.f49020 = iArrCopyOf;
            this.f49021 = iArrCopyOf.length;
            return;
        }
        m37595(interfaceC1022.size());
        int[] iArr2 = this.f49020;
        int size = interfaceC1022.size();
        this.f49021 = size;
        interfaceC1022.mo3538(0, 0, size, iArr2);
    }

    public C15859(int[] iArr, int i) {
        this(34);
        System.arraycopy(iArr, 1, this.f49020, 0, 34);
        this.f49021 = 34;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15859 m37593(int[] iArr) {
        int length = iArr.length;
        if (length > iArr.length) {
            throw new IllegalArgumentException(C3200.m9831(iArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(length, "The specified length (", ") is greater than the array size (")));
        }
        C15859 c15859 = new C15859(iArr);
        c15859.f49021 = length;
        return c15859;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m37594(int i) {
        int[] iArr = this.f49020;
        if (i <= iArr.length) {
            return;
        }
        if (iArr != C19389.f62752) {
            i = (int) Math.max(Math.min(((long) iArr.length) + ((long) (iArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(this.f49020, 0, iArr2, 0, this.f49021);
        this.f49020 = iArr2;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final void add(int i, int i2) {
        m26281(i);
        m37594(this.f49021 + 1);
        int i3 = this.f49021;
        if (i != i3) {
            int[] iArr = this.f49020;
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        }
        this.f49020[i] = i2;
        this.f49021++;
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        m37594(this.f49021 + 1);
        int[] iArr = this.f49020;
        int i2 = this.f49021;
        this.f49021 = i2 + 1;
        iArr[i2] = i;
        return true;
    }

    @Override // l.InterfaceC1022
    public final int getInt(int i) {
        if (i < this.f49021) {
            return this.f49020[i];
        }
        throw new IndexOutOfBoundsException(C3200.m9831(this.f49021, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int indexOf(int i) {
        int[] iArr = this.f49020;
        for (int i2 = 0; i2 < this.f49021; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int lastIndexOf(int i) {
        int[] iArr = this.f49020;
        int i2 = this.f49021;
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

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3538(int i, int i2, int i3, int[] iArr) {
        C9876.m24968(iArr.length, i2, i3);
        System.arraycopy(this.f49020, i, iArr, i2, i3);
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۘ */
    public final int mo3542(int i) {
        int i2 = this.f49021;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f49021, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f49020;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.f49021 = i4;
        if (i != i4) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        }
        return i3;
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo3585(int i) {
        int iIndexOf = indexOf(i);
        if (iIndexOf == -1) {
            return false;
        }
        mo3542(iIndexOf);
        return true;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    public final int set(int i, int i2) {
        if (i >= this.f49021) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f49021, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        int[] iArr = this.f49020;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // l.AbstractC10442, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f49021 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49021;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        if (i == 0 && i2 == this.f49021) {
            return this;
        }
        m26281(i);
        m26281(i2);
        if (i <= i2) {
            return new C8805(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f49021 == 0;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3537(int i, int i2) {
        C9876.m24965(this.f49021, i, i2);
        int[] iArr = this.f49020;
        System.arraycopy(iArr, i2, iArr, i, this.f49021 - i2);
        this.f49021 -= i2 - i;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3544(int i, int i2, int[] iArr) {
        m26281(i);
        C9876.m24968(iArr.length, 0, i2);
        m37594(this.f49021 + i2);
        int[] iArr2 = this.f49020;
        System.arraycopy(iArr2, i, iArr2, i + i2, this.f49021 - i);
        System.arraycopy(iArr, 0, this.f49020, i, i2);
        this.f49021 += i2;
    }

    @Override // l.InterfaceC1022
    /* JADX INFO: renamed from: ֫ */
    public final void mo3539(int i, int i2, int[] iArr) {
        m26281(i);
        C9876.m24968(iArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f49021) {
            System.arraycopy(iArr, 0, this.f49020, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f49021, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC10442, l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        int[] iArr = this.f49020;
        for (int i = 0; i < this.f49021; i++) {
            intConsumer.accept(iArr[i]);
        }
    }

    @Override // l.AbstractC10442
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26282(int i, InterfaceC1043 interfaceC1043) {
        if (interfaceC1043 instanceof InterfaceC1022) {
            return m37596(i, (InterfaceC1022) interfaceC1043);
        }
        m26281(i);
        int size = interfaceC1043.size();
        if (size == 0) {
            return false;
        }
        m37594(this.f49021 + size);
        int[] iArr = this.f49020;
        System.arraycopy(iArr, i, iArr, i + size, this.f49021 - i);
        InterfaceC6667 it = interfaceC1043.iterator();
        this.f49021 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f49020[i] = it.nextInt();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37596(int i, InterfaceC1022 interfaceC1022) {
        m26281(i);
        int size = interfaceC1022.size();
        if (size == 0) {
            return false;
        }
        m37594(this.f49021 + size);
        int[] iArr = this.f49020;
        System.arraycopy(iArr, i, iArr, i + size, this.f49021 - i);
        interfaceC1022.mo3538(0, i, size, this.f49020);
        this.f49021 += size;
        return true;
    }

    @Override // l.AbstractC21731
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo21525(InterfaceC1043 interfaceC1043) {
        int i;
        int[] iArr = this.f49020;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f49021;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC1043.contains(iArr[i2])) {
                iArr[i3] = iArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f49021 = i3;
        return z;
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3584(IntPredicate intPredicate) {
        int i;
        int[] iArr = this.f49020;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f49021;
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
        this.f49021 = i3;
        return z;
    }

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC15132 listIterator(int i) {
        m26281(i);
        return new C23621(i, this);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C6688(this);
    }

    @Override // l.AbstractC10442, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C6688(this);
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ܽ */
    public final void mo3547(InterfaceC4571 interfaceC4571) {
        if (interfaceC4571 == null) {
            C19389.m44660(this.f49021, this.f49020);
        } else {
            C19389.m44662(this.f49020, 0, this.f49021, interfaceC4571, (int[]) null);
        }
    }

    @Override // l.AbstractC10442, l.InterfaceC1022
    /* JADX INFO: renamed from: ۧ */
    public final void mo3545(InterfaceC4571 interfaceC4571) {
        if (interfaceC4571 == null) {
            C19389.m44660(this.f49021, this.f49020);
        } else {
            C19389.m44661(this.f49020, 0, this.f49021, interfaceC4571);
        }
    }

    public final Object clone() {
        int[] iArrCopyOf;
        int[] iArr = this.f49020;
        int i = this.f49021;
        if (i == 0) {
            iArrCopyOf = C19389.f62753;
        } else {
            iArrCopyOf = Arrays.copyOf(iArr, i);
        }
        C15859 c15859 = new C15859(iArrCopyOf);
        c15859.f49021 = this.f49021;
        return c15859;
    }

    @Override // l.AbstractC10442, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C15859) {
            C15859 c15859 = (C15859) obj;
            if (c15859 != this) {
                int i = this.f49021;
                int i2 = c15859.f49021;
                if (i == i2) {
                    int[] iArr = this.f49020;
                    int[] iArr2 = c15859.f49020;
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
        if (obj instanceof C8805) {
            return ((C8805) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC10442, java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C15859) {
            C15859 c15859 = (C15859) list;
            int i = this.f49021;
            int i2 = c15859.f49021;
            int[] iArr = this.f49020;
            int[] iArr2 = c15859.f49020;
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
        if (list instanceof C8805) {
            return -((C8805) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f49020;
        for (int i = 0; i < this.f49021; i++) {
            objectOutputStream.writeInt(iArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int[] iArr = new int[this.f49021];
        this.f49020 = iArr;
        for (int i = 0; i < this.f49021; i++) {
            iArr[i] = objectInputStream.readInt();
        }
    }
}
