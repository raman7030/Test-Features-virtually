package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩺֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G93V */
/* JADX INFO: loaded from: classes.dex */
public final class C22633 extends AbstractC19293 implements RandomAccess {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22633 f73095 = new C22633(new Object[0], 0, false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73096;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object[] f73097;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C22633 m50636() {
        return f73095;
    }

    public C22633(Object[] objArr, int i, boolean z) {
        super(z);
        this.f73097 = objArr;
        this.f73096 = i;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23170 mo8473(int i) {
        if (i < this.f73096) {
            throw new IllegalArgumentException();
        }
        return new C22633(Arrays.copyOf(this.f73097, i), this.f73096, true);
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m44492();
        int i = this.f73096;
        Object[] objArr = this.f73097;
        if (i == objArr.length) {
            this.f73097 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f73097;
        int i2 = this.f73096;
        this.f73096 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m44492();
        if (i < 0 || i > (i2 = this.f73096)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f73096);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        Object[] objArr = this.f73097;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f73097, i, objArr2, i + 1, this.f73096 - i);
            this.f73097 = objArr2;
        }
        this.f73097[i] = obj;
        this.f73096++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m50635(i);
        return this.f73097[i];
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        m50635(i);
        Object[] objArr = this.f73097;
        Object obj = objArr[i];
        int i2 = this.f73096;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f73096--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m44492();
        m50635(i);
        Object[] objArr = this.f73097;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f73096;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50635(int i) {
        if (i < 0 || i >= this.f73096) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f73096);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
