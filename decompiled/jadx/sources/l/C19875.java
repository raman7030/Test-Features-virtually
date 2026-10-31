package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩶ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CFJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19875 extends AbstractC19293 implements InterfaceC4826, RandomAccess, InterfaceC9934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C19875 f64165 = new C19875(new double[0], 0, false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64166;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double[] f64167;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m44492();
        if (i < 0 || i > (i2 = this.f64166)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f64166);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        double[] dArr = this.f64167;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f64167, i, dArr2, i + 1, this.f64166 - i);
            this.f64167 = dArr2;
        }
        this.f64167[i] = dDoubleValue;
        this.f64166++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m45708(((Double) obj).doubleValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m44492();
        m45706(i);
        double[] dArr = this.f64167;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19875 m45707() {
        return f64165;
    }

    public C19875() {
        this(new double[10], 0, true);
    }

    public C19875(double[] dArr, int i, boolean z) {
        super(z);
        this.f64167 = dArr;
        this.f64166 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m44492();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f64167;
        System.arraycopy(dArr, i2, dArr, i, this.f64166 - i2);
        this.f64166 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19875)) {
            return super.equals(obj);
        }
        C19875 c19875 = (C19875) obj;
        if (this.f64166 != c19875.f64166) {
            return false;
        }
        double[] dArr = c19875.f64167;
        for (int i = 0; i < this.f64166; i++) {
            if (Double.doubleToLongBits(this.f64167[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM33480 = 1;
        for (int i = 0; i < this.f64166; i++) {
            iM33480 = (iM33480 * 31) + C13997.m33480(Double.doubleToLongBits(this.f64167[i]));
        }
        return iM33480;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23170 mo8473(int i) {
        if (i < this.f64166) {
            throw new IllegalArgumentException();
        }
        return new C19875(Arrays.copyOf(this.f64167, i), this.f64166, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m45706(i);
        return Double.valueOf(this.f64167[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f64166;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64167[i2] == dDoubleValue) {
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
        return this.f64166;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45708(double d) {
        m44492();
        int i = this.f64166;
        double[] dArr = this.f64167;
        if (i == dArr.length) {
            double[] dArr2 = new double[C23868.m52580(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f64167 = dArr2;
        }
        double[] dArr3 = this.f64167;
        int i2 = this.f64166;
        this.f64166 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // l.AbstractC19293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m44492();
        byte[] bArr = C13997.f41722;
        collection.getClass();
        if (!(collection instanceof C19875)) {
            return super.addAll(collection);
        }
        C19875 c19875 = (C19875) collection;
        int i = c19875.f64166;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64166;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f64167;
        if (i3 > dArr.length) {
            this.f64167 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c19875.f64167, 0, this.f64167, this.f64166, c19875.f64166);
        this.f64166 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        m45706(i);
        double[] dArr = this.f64167;
        double d = dArr[i];
        int i2 = this.f64166;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f64166--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45706(int i) {
        if (i < 0 || i >= this.f64166) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f64166);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
