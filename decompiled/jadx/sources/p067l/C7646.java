package p067l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۚ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7646 extends AbstractC20704 implements InterfaceC13661, RandomAccess, InterfaceC11809 {

    /* JADX INFO: renamed from: ۙ */
    public static final C7646 f20016 = new C7646(new long[0], 0, false);

    /* JADX INFO: renamed from: ᩶ */
    public int f20017;

    /* JADX INFO: renamed from: ᩹ */
    public long[] f20018;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m46786();
        if (i < 0 || i > (i2 = this.f20017)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f20017);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        long[] jArr = this.f20018;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f20018, i, jArr2, i + 1, this.f20017 - i);
            this.f20018 = jArr2;
        }
        this.f20018[i] = jLongValue;
        this.f20017++;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m17622(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m46786();
        m17620(i);
        long[] jArr = this.f20018;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C7646 m17621() {
        return f20016;
    }

    public C7646() {
        this(new long[10], 0, true);
    }

    public C7646(long[] jArr, int i, boolean z) {
        super(z);
        this.f20018 = jArr;
        this.f20017 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m46786();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f20018;
        System.arraycopy(jArr, i2, jArr, i, this.f20017 - i2);
        this.f20017 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7646)) {
            return super.equals(obj);
        }
        C7646 c7646 = (C7646) obj;
        if (this.f20017 != c7646.f20017) {
            return false;
        }
        long[] jArr = c7646.f20018;
        for (int i = 0; i < this.f20017; i++) {
            if (this.f20018[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM35600 = 1;
        for (int i = 0; i < this.f20017; i++) {
            iM35600 = (iM35600 * 31) + C15671.m35600(this.f20018[i]);
        }
        return iM35600;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        if (i < this.f20017) {
            throw new IllegalArgumentException();
        }
        return new C7646(Arrays.copyOf(this.f20018, i), this.f20017, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m17620(i);
        return this.f20018[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f20017;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20018[i2] == jLongValue) {
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
        return this.f20017;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17622(long j) {
        m46786();
        int i = this.f20017;
        long[] jArr = this.f20018;
        if (i == jArr.length) {
            long[] jArr2 = new long[C25053.m54989(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f20018 = jArr2;
        }
        long[] jArr3 = this.f20018;
        int i2 = this.f20017;
        this.f20017 = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m46786();
        byte[] bArr = C15671.f44805;
        collection.getClass();
        if (!(collection instanceof C7646)) {
            return super.addAll(collection);
        }
        C7646 c7646 = (C7646) collection;
        int i = c7646.f20017;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20017;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f20018;
        if (i3 > jArr.length) {
            this.f20018 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c7646.f20018, 0, this.f20018, this.f20017, c7646.f20017);
        this.f20017 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        m17620(i);
        long[] jArr = this.f20018;
        long j = jArr[i];
        int i2 = this.f20017;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f20017--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17620(int i) {
        if (i < 0 || i >= this.f20017) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f20017);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
