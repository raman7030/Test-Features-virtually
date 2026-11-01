package p067l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩶ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CFJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21257 extends AbstractC20704 implements InterfaceC6955, RandomAccess, InterfaceC11809 {

    /* JADX INFO: renamed from: ۙ */
    public static final C21257 f66801 = new C21257(new double[0], 0, false);

    /* JADX INFO: renamed from: ᩶ */
    public int f66802;

    /* JADX INFO: renamed from: ᩹ */
    public double[] f66803;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m46786();
        if (i < 0 || i > (i2 = this.f66802)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f66802);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        double[] dArr = this.f66803;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f66803, i, dArr2, i + 1, this.f66802 - i);
            this.f66803 = dArr2;
        }
        this.f66803[i] = dDoubleValue;
        this.f66802++;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m48019(((Double) obj).doubleValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m46786();
        m48017(i);
        double[] dArr = this.f66803;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C21257 m48018() {
        return f66801;
    }

    public C21257() {
        this(new double[10], 0, true);
    }

    public C21257(double[] dArr, int i, boolean z) {
        super(z);
        this.f66803 = dArr;
        this.f66802 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m46786();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f66803;
        System.arraycopy(dArr, i2, dArr, i, this.f66802 - i2);
        this.f66802 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21257)) {
            return super.equals(obj);
        }
        C21257 c21257 = (C21257) obj;
        if (this.f66802 != c21257.f66802) {
            return false;
        }
        double[] dArr = c21257.f66803;
        for (int i = 0; i < this.f66802; i++) {
            if (Double.doubleToLongBits(this.f66803[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM35600 = 1;
        for (int i = 0; i < this.f66802; i++) {
            iM35600 = (iM35600 * 31) + C15671.m35600(Double.doubleToLongBits(this.f66803[i]));
        }
        return iM35600;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        if (i < this.f66802) {
            throw new IllegalArgumentException();
        }
        return new C21257(Arrays.copyOf(this.f66803, i), this.f66802, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m48017(i);
        return Double.valueOf(this.f66803[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f66802;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f66803[i2] == dDoubleValue) {
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
        return this.f66802;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48019(double d) {
        m46786();
        int i = this.f66802;
        double[] dArr = this.f66803;
        if (i == dArr.length) {
            double[] dArr2 = new double[C25053.m54989(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f66803 = dArr2;
        }
        double[] dArr3 = this.f66803;
        int i2 = this.f66802;
        this.f66802 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m46786();
        byte[] bArr = C15671.f44805;
        collection.getClass();
        if (!(collection instanceof C21257)) {
            return super.addAll(collection);
        }
        C21257 c21257 = (C21257) collection;
        int i = c21257.f66802;
        if (i == 0) {
            return false;
        }
        int i2 = this.f66802;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f66803;
        if (i3 > dArr.length) {
            this.f66803 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c21257.f66803, 0, this.f66803, this.f66802, c21257.f66802);
        this.f66802 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        m48017(i);
        double[] dArr = this.f66803;
        double d = dArr[i];
        int i2 = this.f66802;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f66802--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48017(int i) {
        if (i < 0 || i >= this.f66802) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f66802);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
