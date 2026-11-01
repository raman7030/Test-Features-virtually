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
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۙۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6517 extends AbstractC8229 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸ */
    public transient long[] f16849;

    /* JADX INFO: renamed from: ᩹ */
    public int f16850;

    @Override // p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C6517(int i) {
        this.f16849 = new long[100];
    }

    public C6517() {
        this.f16849 = C11882.f33107;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m14946(int i) {
        long[] jArr = this.f16849;
        if (i <= jArr.length) {
            return;
        }
        if (jArr != C11882.f33107) {
            i = (int) Math.max(Math.min(((long) jArr.length) + ((long) (jArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        long[] jArr2 = new long[i];
        System.arraycopy(this.f16849, 0, jArr2, 0, this.f16850);
        this.f16849 = jArr2;
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9607(int i, long j) {
        m19001(i);
        m14946(this.f16850 + 1);
        int i2 = this.f16850;
        if (i != i2) {
            long[] jArr = this.f16849;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.f16849[i] = j;
        this.f16850++;
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC13223
    public final boolean add(long j) {
        m14946(this.f16850 + 1);
        long[] jArr = this.f16849;
        int i = this.f16850;
        this.f16850 = i + 1;
        jArr[i] = j;
        return true;
    }

    @Override // p067l.InterfaceC4544
    public final long getLong(int i) {
        if (i < this.f16850) {
            return this.f16849[i];
        }
        throw new IndexOutOfBoundsException(C5410.m11876(this.f16850, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544
    /* JADX INFO: renamed from: ᩻ */
    public final int mo9614(long j) {
        long[] jArr = this.f16849;
        for (int i = 0; i < this.f16850; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544
    /* JADX INFO: renamed from: ۧ */
    public final int mo9611(long j) {
        long[] jArr = this.f16849;
        int i = this.f16850;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (j == jArr[i2]) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9609(long[] jArr, int i, int i2, int i3) {
        C11755.m26983(jArr.length, i2, i3);
        System.arraycopy(this.f16849, i, jArr, i2, i3);
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ܽ */
    public final long mo9613(int i) {
        int i2 = this.f16850;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f16850, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f16849;
        long j = jArr[i];
        int i3 = i2 - 1;
        this.f16850 = i3;
        if (i != i3) {
            System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
        }
        return j;
    }

    @Override // p067l.InterfaceC13223
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo14952(long j) {
        int iMo9614 = mo9614(j);
        if (iMo9614 == -1) {
            return false;
        }
        mo9613(iMo9614);
        return true;
    }

    @Override // p067l.InterfaceC4544
    public final long set(int i, long j) {
        if (i >= this.f16850) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f16850, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f16849;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // p067l.AbstractC8229, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f16850 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16850;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f16850) {
            return this;
        }
        m19001(i);
        m19001(i2);
        if (i <= i2) {
            return new C21270(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f16850 == 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m14951() {
        int i;
        long[] jArr = this.f16849;
        if (jArr.length <= 0 || (i = this.f16850) == jArr.length) {
            return;
        }
        long[] jArr2 = new long[Math.max(0, i)];
        System.arraycopy(this.f16849, 0, jArr2, 0, this.f16850);
        this.f16849 = jArr2;
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9605(int i, int i2) {
        C11755.m26980(this.f16850, i, i2);
        long[] jArr = this.f16849;
        System.arraycopy(jArr, i2, jArr, i, this.f16850 - i2);
        this.f16850 -= i2 - i;
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9606(int i, int i2, long[] jArr) {
        m19001(i);
        C11755.m26983(jArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f16850) {
            System.arraycopy(jArr, 0, this.f16849, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f16850, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // p067l.AbstractC8229, p067l.AbstractC23652, p067l.InterfaceC18625
    public final void forEach(LongConsumer longConsumer) {
        long[] jArr = this.f16849;
        for (int i = 0; i < this.f16850; i++) {
            longConsumer.accept(jArr[i]);
        }
    }

    @Override // p067l.AbstractC8229
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14948(int i, InterfaceC13223 interfaceC13223) {
        if (interfaceC13223 instanceof InterfaceC4544) {
            return mo9610(i, (InterfaceC4544) interfaceC13223);
        }
        m19001(i);
        int size = interfaceC13223.size();
        if (size == 0) {
            return false;
        }
        m14946(this.f16850 + size);
        long[] jArr = this.f16849;
        System.arraycopy(jArr, i, jArr, i + size, this.f16850 - i);
        InterfaceC24660 it = interfaceC13223.iterator();
        this.f16850 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f16849[i] = it.nextLong();
            size = i2;
            i++;
        }
    }

    @Override // p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9610(int i, InterfaceC4544 interfaceC4544) {
        m19001(i);
        int size = interfaceC4544.size();
        if (size == 0) {
            return false;
        }
        m14946(this.f16850 + size);
        long[] jArr = this.f16849;
        System.arraycopy(jArr, i, jArr, i + size, this.f16850 - i);
        interfaceC4544.mo9609(this.f16849, 0, i, size);
        this.f16850 += size;
        return true;
    }

    @Override // p067l.AbstractC23652
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14950(InterfaceC13223 interfaceC13223) {
        int i;
        long[] jArr = this.f16849;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f16850;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC13223.mo19003(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f16850 = i3;
        return z;
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC13223
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14949(LongPredicate longPredicate) {
        int i;
        long[] jArr = this.f16849;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f16850;
            if (i2 >= i) {
                break;
            }
            if (!longPredicate.test(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f16850 = i3;
        return z;
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544, java.util.List
    public final InterfaceC5885 listIterator(int i) {
        m19001(i);
        return new C9869(this, i);
    }

    @Override // p067l.AbstractC8229, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C16574(this);
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544
    /* JADX INFO: renamed from: ֫ */
    public final void mo9608(InterfaceC3873 interfaceC3873) {
        if (interfaceC3873 == null) {
            C11882.m27198(this.f16850, this.f16849);
        } else {
            C11882.m27200(this.f16849, 0, this.f16850, interfaceC3873, (long[]) null);
        }
    }

    @Override // p067l.AbstractC8229, p067l.InterfaceC4544
    /* JADX INFO: renamed from: ۧ */
    public final void mo9612(InterfaceC3873 interfaceC3873) {
        if (interfaceC3873 == null) {
            C11882.m27198(this.f16850, this.f16849);
        } else {
            C11882.m27199(this.f16849, 0, this.f16850, interfaceC3873);
        }
    }

    public final Object clone() {
        long[] jArrCopyOf;
        long[] jArr = this.f16849;
        int i = this.f16850;
        if (i == 0) {
            jArrCopyOf = C11882.f33108;
        } else {
            jArrCopyOf = Arrays.copyOf(jArr, i);
        }
        C6517 c6517 = new C6517();
        c6517.f16849 = jArrCopyOf;
        c6517.f16850 = this.f16850;
        return c6517;
    }

    @Override // p067l.AbstractC8229, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C6517) {
            C6517 c6517 = (C6517) obj;
            if (c6517 != this) {
                int i = this.f16850;
                int i2 = c6517.f16850;
                if (i == i2) {
                    long[] jArr = this.f16849;
                    long[] jArr2 = c6517.f16849;
                    if (jArr != jArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (jArr[i3] == jArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C21270) {
            return ((C21270) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // p067l.AbstractC8229
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C6517) {
            C6517 c6517 = (C6517) list;
            int i = this.f16850;
            int i2 = c6517.f16850;
            long[] jArr = this.f16849;
            long[] jArr2 = c6517.f16849;
            if (jArr != jArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Long.compare(jArr[i3], jArr2[i3]);
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
        if (list instanceof C21270) {
            return -((C21270) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f16849;
        for (int i = 0; i < this.f16850; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f16850];
        this.f16849 = jArr;
        for (int i = 0; i < this.f16850; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
