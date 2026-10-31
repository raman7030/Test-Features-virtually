package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۚۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: RGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5181 extends AbstractC19293 implements InterfaceC20349, RandomAccess, InterfaceC9934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C5181 f16250 = new C5181(new boolean[0], 0, false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16251;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean[] f16252;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m44492();
        if (i < 0 || i > (i2 = this.f16251)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f16251);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        boolean[] zArr = this.f16252;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f16252, i, zArr2, i + 1, this.f16251 - i);
            this.f16252 = zArr2;
        }
        this.f16252[i] = zBooleanValue;
        this.f16251++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m14935(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m44492();
        m14933(i);
        boolean[] zArr = this.f16252;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C5181 m14934() {
        return f16250;
    }

    public C5181() {
        this(new boolean[10], 0, true);
    }

    public C5181(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f16252 = zArr;
        this.f16251 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m44492();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f16252;
        System.arraycopy(zArr, i2, zArr, i, this.f16251 - i2);
        this.f16251 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5181)) {
            return super.equals(obj);
        }
        C5181 c5181 = (C5181) obj;
        if (this.f16251 != c5181.f16251) {
            return false;
        }
        boolean[] zArr = c5181.f16252;
        for (int i = 0; i < this.f16251; i++) {
            if (this.f16252[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM33481 = 1;
        for (int i = 0; i < this.f16251; i++) {
            iM33481 = (iM33481 * 31) + C13997.m33481(this.f16252[i]);
        }
        return iM33481;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23170 mo8473(int i) {
        if (i < this.f16251) {
            throw new IllegalArgumentException();
        }
        return new C5181(Arrays.copyOf(this.f16252, i), this.f16251, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m14933(i);
        return Boolean.valueOf(this.f16252[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f16251;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16252[i2] == zBooleanValue) {
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
        return this.f16251;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14935(boolean z) {
        m44492();
        int i = this.f16251;
        boolean[] zArr = this.f16252;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C23868.m52580(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f16252 = zArr2;
        }
        boolean[] zArr3 = this.f16252;
        int i2 = this.f16251;
        this.f16251 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // l.AbstractC19293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m44492();
        byte[] bArr = C13997.f41722;
        collection.getClass();
        if (!(collection instanceof C5181)) {
            return super.addAll(collection);
        }
        C5181 c5181 = (C5181) collection;
        int i = c5181.f16251;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16251;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f16252;
        if (i3 > zArr.length) {
            this.f16252 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c5181.f16252, 0, this.f16252, this.f16251, c5181.f16251);
        this.f16251 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        m14933(i);
        boolean[] zArr = this.f16252;
        boolean z = zArr[i];
        int i2 = this.f16251;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f16251--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14933(int i) {
        if (i < 0 || i >= this.f16251) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f16251);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
