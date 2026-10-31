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
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۙۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4365 extends AbstractC6166 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient long[] f14034;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f14035;

    @Override // l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C4365(int i) {
        this.f14034 = new long[100];
    }

    public C4365() {
        this.f14034 = C10010.f30147;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m13082(int i) {
        long[] jArr = this.f14034;
        if (i <= jArr.length) {
            return;
        }
        if (jArr != C10010.f30147) {
            i = (int) Math.max(Math.min(((long) jArr.length) + ((long) (jArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        long[] jArr2 = new long[i];
        System.arraycopy(this.f14034, 0, jArr2, 0, this.f14035);
        this.f14034 = jArr2;
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7539(int i, long j) {
        m17069(i);
        m13082(this.f14035 + 1);
        int i2 = this.f14035;
        if (i != i2) {
            long[] jArr = this.f14034;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.f14034[i] = j;
        this.f14035++;
    }

    @Override // l.AbstractC22394, l.InterfaceC11421
    public final boolean add(long j) {
        m13082(this.f14035 + 1);
        long[] jArr = this.f14034;
        int i = this.f14035;
        this.f14035 = i + 1;
        jArr[i] = j;
        return true;
    }

    @Override // l.InterfaceC2289
    public final long getLong(int i) {
        if (i < this.f14035) {
            return this.f14034[i];
        }
        throw new IndexOutOfBoundsException(C3200.m9831(this.f14035, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC6166, l.InterfaceC2289
    /* JADX INFO: renamed from: ᩻ */
    public final int mo7546(long j) {
        long[] jArr = this.f14034;
        for (int i = 0; i < this.f14035; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC6166, l.InterfaceC2289
    /* JADX INFO: renamed from: ۧ */
    public final int mo7543(long j) {
        long[] jArr = this.f14034;
        int i = this.f14035;
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

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7541(long[] jArr, int i, int i2, int i3) {
        C9876.m24968(jArr.length, i2, i3);
        System.arraycopy(this.f14034, i, jArr, i2, i3);
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ܽ */
    public final long mo7545(int i) {
        int i2 = this.f14035;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f14035, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f14034;
        long j = jArr[i];
        int i3 = i2 - 1;
        this.f14035 = i3;
        if (i != i3) {
            System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
        }
        return j;
    }

    @Override // l.InterfaceC11421
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo13088(long j) {
        int iMo7546 = mo7546(j);
        if (iMo7546 == -1) {
            return false;
        }
        mo7545(iMo7546);
        return true;
    }

    @Override // l.InterfaceC2289
    public final long set(int i, long j) {
        if (i >= this.f14035) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f14035, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        long[] jArr = this.f14034;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // l.AbstractC6166, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14035 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14035;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f14035) {
            return this;
        }
        m17069(i);
        m17069(i2);
        if (i <= i2) {
            return new C19888(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14035 == 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13087() {
        int i;
        long[] jArr = this.f14034;
        if (jArr.length <= 0 || (i = this.f14035) == jArr.length) {
            return;
        }
        long[] jArr2 = new long[Math.max(0, i)];
        System.arraycopy(this.f14034, 0, jArr2, 0, this.f14035);
        this.f14034 = jArr2;
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7537(int i, int i2) {
        C9876.m24965(this.f14035, i, i2);
        long[] jArr = this.f14034;
        System.arraycopy(jArr, i2, jArr, i, this.f14035 - i2);
        this.f14035 -= i2 - i;
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7538(int i, int i2, long[] jArr) {
        m17069(i);
        C9876.m24968(jArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f14035) {
            System.arraycopy(jArr, 0, this.f14034, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f14035, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC6166, l.AbstractC22394, l.InterfaceC17105
    public final void forEach(LongConsumer longConsumer) {
        long[] jArr = this.f14034;
        for (int i = 0; i < this.f14035; i++) {
            longConsumer.accept(jArr[i]);
        }
    }

    @Override // l.AbstractC6166
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo13084(int i, InterfaceC11421 interfaceC11421) {
        if (interfaceC11421 instanceof InterfaceC2289) {
            return mo7542(i, (InterfaceC2289) interfaceC11421);
        }
        m17069(i);
        int size = interfaceC11421.size();
        if (size == 0) {
            return false;
        }
        m13082(this.f14035 + size);
        long[] jArr = this.f14034;
        System.arraycopy(jArr, i, jArr, i + size, this.f14035 - i);
        InterfaceC23455 it = interfaceC11421.iterator();
        this.f14035 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f14034[i] = it.nextLong();
            size = i2;
            i++;
        }
    }

    @Override // l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7542(int i, InterfaceC2289 interfaceC2289) {
        m17069(i);
        int size = interfaceC2289.size();
        if (size == 0) {
            return false;
        }
        m13082(this.f14035 + size);
        long[] jArr = this.f14034;
        System.arraycopy(jArr, i, jArr, i + size, this.f14035 - i);
        interfaceC2289.mo7541(this.f14034, 0, i, size);
        this.f14035 += size;
        return true;
    }

    @Override // l.AbstractC22394
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo13086(InterfaceC11421 interfaceC11421) {
        int i;
        long[] jArr = this.f14034;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f14035;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC11421.mo17071(jArr[i2])) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f14035 = i3;
        return z;
    }

    @Override // l.AbstractC22394, l.InterfaceC11421
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo13085(LongPredicate longPredicate) {
        int i;
        long[] jArr = this.f14034;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f14035;
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
        this.f14035 = i3;
        return z;
    }

    @Override // l.AbstractC6166, l.InterfaceC2289, java.util.List
    public final InterfaceC3700 listIterator(int i) {
        m17069(i);
        return new C7892(this, i);
    }

    @Override // l.AbstractC6166, l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C14947(this);
    }

    @Override // l.AbstractC6166, l.InterfaceC2289
    /* JADX INFO: renamed from: ֫ */
    public final void mo7540(InterfaceC1583 interfaceC1583) {
        if (interfaceC1583 == null) {
            C10010.m25181(this.f14035, this.f14034);
        } else {
            C10010.m25183(this.f14034, 0, this.f14035, interfaceC1583, (long[]) null);
        }
    }

    @Override // l.AbstractC6166, l.InterfaceC2289
    /* JADX INFO: renamed from: ۧ */
    public final void mo7544(InterfaceC1583 interfaceC1583) {
        if (interfaceC1583 == null) {
            C10010.m25181(this.f14035, this.f14034);
        } else {
            C10010.m25182(this.f14034, 0, this.f14035, interfaceC1583);
        }
    }

    public final Object clone() {
        long[] jArrCopyOf;
        long[] jArr = this.f14034;
        int i = this.f14035;
        if (i == 0) {
            jArrCopyOf = C10010.f30148;
        } else {
            jArrCopyOf = Arrays.copyOf(jArr, i);
        }
        C4365 c4365 = new C4365();
        c4365.f14034 = jArrCopyOf;
        c4365.f14035 = this.f14035;
        return c4365;
    }

    @Override // l.AbstractC6166, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C4365) {
            C4365 c4365 = (C4365) obj;
            if (c4365 != this) {
                int i = this.f14035;
                int i2 = c4365.f14035;
                if (i == i2) {
                    long[] jArr = this.f14034;
                    long[] jArr2 = c4365.f14034;
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
        if (obj instanceof C19888) {
            return ((C19888) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC6166
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C4365) {
            C4365 c4365 = (C4365) list;
            int i = this.f14035;
            int i2 = c4365.f14035;
            long[] jArr = this.f14034;
            long[] jArr2 = c4365.f14034;
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
        if (list instanceof C19888) {
            return -((C19888) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f14034;
        for (int i = 0; i < this.f14035; i++) {
            objectOutputStream.writeLong(jArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long[] jArr = new long[this.f14035];
        this.f14034 = jArr;
        for (int i = 0; i < this.f14035; i++) {
            jArr[i] = objectInputStream.readLong();
        }
    }
}
