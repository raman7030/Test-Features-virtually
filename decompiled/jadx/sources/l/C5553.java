package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۚ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5553 extends AbstractC19293 implements InterfaceC11882, RandomAccess, InterfaceC9934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5553 f17175 = new C5553(new long[0], 0, false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17176;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long[] f17177;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m44492();
        if (i < 0 || i > (i2 = this.f17176)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f17176);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        long[] jArr = this.f17177;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f17177, i, jArr2, i + 1, this.f17176 - i);
            this.f17177 = jArr2;
        }
        this.f17177[i] = jLongValue;
        this.f17176++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m15708(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m44492();
        m15706(i);
        long[] jArr = this.f17177;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C5553 m15707() {
        return f17175;
    }

    public C5553() {
        this(new long[10], 0, true);
    }

    public C5553(long[] jArr, int i, boolean z) {
        super(z);
        this.f17177 = jArr;
        this.f17176 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m44492();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f17177;
        System.arraycopy(jArr, i2, jArr, i, this.f17176 - i2);
        this.f17176 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5553)) {
            return super.equals(obj);
        }
        C5553 c5553 = (C5553) obj;
        if (this.f17176 != c5553.f17176) {
            return false;
        }
        long[] jArr = c5553.f17177;
        for (int i = 0; i < this.f17176; i++) {
            if (this.f17177[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM33480 = 1;
        for (int i = 0; i < this.f17176; i++) {
            iM33480 = (iM33480 * 31) + C13997.m33480(this.f17177[i]);
        }
        return iM33480;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23170 mo8473(int i) {
        if (i < this.f17176) {
            throw new IllegalArgumentException();
        }
        return new C5553(Arrays.copyOf(this.f17177, i), this.f17176, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m15706(i);
        return this.f17177[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f17176;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f17177[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17176;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15708(long j) {
        m44492();
        int i = this.f17176;
        long[] jArr = this.f17177;
        if (i == jArr.length) {
            long[] jArr2 = new long[C23868.m52580(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f17177 = jArr2;
        }
        long[] jArr3 = this.f17177;
        int i2 = this.f17176;
        this.f17176 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // l.AbstractC19293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m44492();
        byte[] bArr = C13997.f41722;
        collection.getClass();
        if (!(collection instanceof C5553)) {
            return super.addAll(collection);
        }
        C5553 c5553 = (C5553) collection;
        int i = c5553.f17176;
        if (i == 0) {
            return false;
        }
        int i2 = this.f17176;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f17177;
        if (i3 > jArr.length) {
            this.f17177 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c5553.f17177, 0, this.f17177, this.f17176, c5553.f17176);
        this.f17176 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        m15706(i);
        long[] jArr = this.f17177;
        long j = jArr[i];
        int i2 = this.f17176;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f17176--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15706(int i) {
        if (i < 0 || i >= this.f17176) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f17176);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
