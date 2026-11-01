package p067l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۠ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9895 extends AbstractC20704 implements InterfaceC12320, RandomAccess, InterfaceC11809 {

    /* JADX INFO: renamed from: ۙ */
    public static final C9895 f27428 = new C9895(new float[0], 0, false);

    /* JADX INFO: renamed from: ᩶ */
    public int f27429;

    /* JADX INFO: renamed from: ᩹ */
    public float[] f27430;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m46786();
        if (i < 0 || i > (i2 = this.f27429)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f27429);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        float[] fArr = this.f27430;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f27430, i, fArr2, i + 1, this.f27429 - i);
            this.f27430 = fArr2;
        }
        this.f27430[i] = fFloatValue;
        this.f27429++;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m23172(((Float) obj).floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m46786();
        m23170(i);
        float[] fArr = this.f27430;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C9895 m23171() {
        return f27428;
    }

    public C9895() {
        this(new float[10], 0, true);
    }

    public C9895(float[] fArr, int i, boolean z) {
        super(z);
        this.f27430 = fArr;
        this.f27429 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m46786();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f27430;
        System.arraycopy(fArr, i2, fArr, i, this.f27429 - i2);
        this.f27429 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9895)) {
            return super.equals(obj);
        }
        C9895 c9895 = (C9895) obj;
        if (this.f27429 != c9895.f27429) {
            return false;
        }
        float[] fArr = c9895.f27430;
        for (int i = 0; i < this.f27429; i++) {
            if (Float.floatToIntBits(this.f27430[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f27429; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f27430[i]);
        }
        return iFloatToIntBits;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        if (i < this.f27429) {
            throw new IllegalArgumentException();
        }
        return new C9895(Arrays.copyOf(this.f27430, i), this.f27429, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m23170(i);
        return Float.valueOf(this.f27430[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f27429;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f27430[i2] == fFloatValue) {
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
        return this.f27429;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23172(float f) {
        m46786();
        int i = this.f27429;
        float[] fArr = this.f27430;
        if (i == fArr.length) {
            float[] fArr2 = new float[C25053.m54989(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f27430 = fArr2;
        }
        float[] fArr3 = this.f27430;
        int i2 = this.f27429;
        this.f27429 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m46786();
        byte[] bArr = C15671.f44805;
        collection.getClass();
        if (!(collection instanceof C9895)) {
            return super.addAll(collection);
        }
        C9895 c9895 = (C9895) collection;
        int i = c9895.f27429;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27429;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f27430;
        if (i3 > fArr.length) {
            this.f27430 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c9895.f27430, 0, this.f27430, this.f27429, c9895.f27429);
        this.f27429 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        m23170(i);
        float[] fArr = this.f27430;
        float f = fArr[i];
        int i2 = this.f27429;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f27429--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23170(int i) {
        if (i < 0 || i >= this.f27429) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f27429);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
