package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩹ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes.dex */
public final class C22465 extends AbstractC19293 implements InterfaceC6237, RandomAccess, InterfaceC9934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22465 f72758 = new C22465(0, false, new int[0]);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72759;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f72760;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m44492();
        if (i < 0 || i > (i2 = this.f72759)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f72759);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        int[] iArr = this.f72760;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f72760, i, iArr2, i + 1, this.f72759 - i);
            this.f72760 = iArr2;
        }
        this.f72760[i] = iIntValue;
        this.f72759++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mo17174(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m44492();
        m50402(i);
        int[] iArr = this.f72760;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C22465 m50403() {
        return f72758;
    }

    public C22465() {
        this(0, true, new int[10]);
    }

    public C22465(int i, boolean z, int[] iArr) {
        super(z);
        this.f72760 = iArr;
        this.f72759 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m44492();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f72760;
        System.arraycopy(iArr, i2, iArr, i, this.f72759 - i2);
        this.f72759 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22465)) {
            return super.equals(obj);
        }
        C22465 c22465 = (C22465) obj;
        if (this.f72759 != c22465.f72759) {
            return false;
        }
        int[] iArr = c22465.f72760;
        for (int i = 0; i < this.f72759; i++) {
            if (this.f72760[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f72759; i2++) {
            i = (i * 31) + this.f72760[i2];
        }
        return i;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23170 mo8473(int i) {
        if (i < this.f72759) {
            throw new IllegalArgumentException();
        }
        return new C22465(this.f72759, true, Arrays.copyOf(this.f72760, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // l.InterfaceC6237
    public final int getInt(int i) {
        m50402(i);
        return this.f72760[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f72759;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f72760[i2] == iIntValue) {
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
        return this.f72759;
    }

    @Override // l.InterfaceC6237
    /* JADX INFO: renamed from: ۢ */
    public final void mo17174(int i) {
        m44492();
        int i2 = this.f72759;
        int[] iArr = this.f72760;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f72760 = iArr2;
        }
        int[] iArr3 = this.f72760;
        int i3 = this.f72759;
        this.f72759 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // l.AbstractC19293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m44492();
        byte[] bArr = C13997.f41722;
        collection.getClass();
        if (!(collection instanceof C22465)) {
            return super.addAll(collection);
        }
        C22465 c22465 = (C22465) collection;
        int i = c22465.f72759;
        if (i == 0) {
            return false;
        }
        int i2 = this.f72759;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f72760;
        if (i3 > iArr.length) {
            this.f72760 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c22465.f72760, 0, this.f72760, this.f72759, c22465.f72759);
        this.f72759 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        m50402(i);
        int[] iArr = this.f72760;
        int i2 = iArr[i];
        int i3 = this.f72759;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f72759--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50402(int i) {
        if (i < 0 || i >= this.f72759) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f72759);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
