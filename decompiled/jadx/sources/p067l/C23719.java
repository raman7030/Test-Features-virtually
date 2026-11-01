package p067l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩹ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes.dex */
public final class C23719 extends AbstractC20704 implements InterfaceC8296, RandomAccess, InterfaceC11809 {

    /* JADX INFO: renamed from: ۙ */
    public static final C23719 f75486 = new C23719(0, false, new int[0]);

    /* JADX INFO: renamed from: ᩶ */
    public int f75487;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f75488;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m46786();
        if (i < 0 || i > (i2 = this.f75487)) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f75487);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
        int[] iArr = this.f75488;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f75488, i, iArr2, i + 1, this.f75487 - i);
            this.f75488 = iArr2;
        }
        this.f75488[i] = iIntValue;
        this.f75487++;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        mo19112(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m46786();
        m52743(i);
        int[] iArr = this.f75488;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C23719 m52744() {
        return f75486;
    }

    public C23719() {
        this(0, true, new int[10]);
    }

    public C23719(int i, boolean z, int[] iArr) {
        super(z);
        this.f75488 = iArr;
        this.f75487 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m46786();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f75488;
        System.arraycopy(iArr, i2, iArr, i, this.f75487 - i2);
        this.f75487 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23719)) {
            return super.equals(obj);
        }
        C23719 c23719 = (C23719) obj;
        if (this.f75487 != c23719.f75487) {
            return false;
        }
        int[] iArr = c23719.f75488;
        for (int i = 0; i < this.f75487; i++) {
            if (this.f75488[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f75487; i2++) {
            i = (i * 31) + this.f75488[i2];
        }
        return i;
    }

    @Override // p067l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24389 mo10520(int i) {
        if (i < this.f75487) {
            throw new IllegalArgumentException();
        }
        return new C23719(this.f75487, true, Arrays.copyOf(this.f75488, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // p067l.InterfaceC8296
    public final int getInt(int i) {
        m52743(i);
        return this.f75488[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f75487;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f75488[i2] == iIntValue) {
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
        return this.f75487;
    }

    @Override // p067l.InterfaceC8296
    /* JADX INFO: renamed from: ۢ */
    public final void mo19112(int i) {
        m46786();
        int i2 = this.f75487;
        int[] iArr = this.f75488;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C25053.m54989(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f75488 = iArr2;
        }
        int[] iArr3 = this.f75488;
        int i3 = this.f75487;
        this.f75487 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m46786();
        byte[] bArr = C15671.f44805;
        collection.getClass();
        if (!(collection instanceof C23719)) {
            return super.addAll(collection);
        }
        C23719 c23719 = (C23719) collection;
        int i = c23719.f75487;
        if (i == 0) {
            return false;
        }
        int i2 = this.f75487;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f75488;
        if (i3 > iArr.length) {
            this.f75488 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c23719.f75488, 0, this.f75488, this.f75487, c23719.f75487);
        this.f75487 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p067l.AbstractC20704, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m46786();
        m52743(i);
        int[] iArr = this.f75488;
        int i2 = iArr[i];
        int i3 = this.f75487;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f75487--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52743(int i) {
        if (i < 0 || i >= this.f75487) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index:", ", Size:");
            sbM34408.append(this.f75487);
            throw new IndexOutOfBoundsException(sbM34408.toString());
        }
    }
}
