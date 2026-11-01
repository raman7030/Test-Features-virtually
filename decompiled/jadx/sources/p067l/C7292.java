package p067l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۚۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: RGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7292 extends AbstractC20704 implements InterfaceC21708, RandomAccess, InterfaceC11809 {

    /* JADX INFO: renamed from: ۙ */
    public static final C7292 f19091 = new C7292(new boolean[0], 0, false);

    /* JADX INFO: renamed from: ᩶ */
    public int f19092;

    /* JADX INFO: renamed from: ᩹ */
    public boolean[] f19093;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m46786();
        if (i < 0 || i > (i2 = this.f19092)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f19092);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        boolean[] zArr = this.f19093;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f19093, i, zArr2, i + 1, this.f19092 - i);
            this.f19093 = zArr2;
        }
        this.f19093[i] = zBooleanValue;
        this.f19092++;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m16845(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m46786();
        m16843(i);
        boolean[] zArr = this.f19093;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C7292 m16844() {
        return f19091;
    }

    public C7292() {
        this(new boolean[10], 0, true);
    }

    public C7292(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f19093 = zArr;
        this.f19092 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m46786();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f19093;
        System.arraycopy(zArr, i2, zArr, i, this.f19092 - i2);
        this.f19092 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7292)) {
            return super.equals(obj);
        }
        C7292 c7292 = (C7292) obj;
        if (this.f19092 != c7292.f19092) {
            return false;
        }
        boolean[] zArr = c7292.f19093;
        for (int i = 0; i < this.f19092; i++) {
            if (this.f19093[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM35601 = 1;
        for (int i = 0; i < this.f19092; i++) {
            iM35601 = (iM35601 * 31) + C15671.m35601(this.f19093[i]);
        }
        return iM35601;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        if (i < this.f19092) {
            throw new IllegalArgumentException();
        }
        return new C7292(Arrays.copyOf(this.f19093, i), this.f19092, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m16843(i);
        return Boolean.valueOf(this.f19093[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f19092;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f19093[i2] == zBooleanValue) {
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
        return this.f19092;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16845(boolean z) {
        m46786();
        int i = this.f19092;
        boolean[] zArr = this.f19093;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C25053.m54989(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f19093 = zArr2;
        }
        boolean[] zArr3 = this.f19093;
        int i2 = this.f19092;
        this.f19092 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m46786();
        byte[] bArr = C15671.f44805;
        collection.getClass();
        if (!(collection instanceof C7292)) {
            return super.addAll(collection);
        }
        C7292 c7292 = (C7292) collection;
        int i = c7292.f19092;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19092;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f19093;
        if (i3 > zArr.length) {
            this.f19093 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c7292.f19093, 0, this.f19093, this.f19092, c7292.f19092);
        this.f19092 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        m16843(i);
        boolean[] zArr = this.f19093;
        boolean z = zArr[i];
        int i2 = this.f19092;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f19092--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16843(int i) {
        if (i < 0 || i >= this.f19092) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f19092);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
