package l;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۠ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C7920 extends AbstractC19293 implements InterfaceC10471, RandomAccess, InterfaceC9934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C7920 f24513 = new C7920(new float[0], 0, false);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24514;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float[] f24515;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m44492();
        if (i < 0 || i > (i2 = this.f24514)) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f24514);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
        float[] fArr = this.f24515;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C23868.m52580(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f24515, i, fArr2, i + 1, this.f24514 - i);
            this.f24515 = fArr2;
        }
        this.f24515[i] = fFloatValue;
        this.f24514++;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m21206(((Float) obj).floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m44492();
        m21204(i);
        float[] fArr = this.f24515;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7920 m21205() {
        return f24513;
    }

    public C7920() {
        this(new float[10], 0, true);
    }

    public C7920(float[] fArr, int i, boolean z) {
        super(z);
        this.f24515 = fArr;
        this.f24514 = i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m44492();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f24515;
        System.arraycopy(fArr, i2, fArr, i, this.f24514 - i2);
        this.f24514 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7920)) {
            return super.equals(obj);
        }
        C7920 c7920 = (C7920) obj;
        if (this.f24514 != c7920.f24514) {
            return false;
        }
        float[] fArr = c7920.f24515;
        for (int i = 0; i < this.f24514; i++) {
            if (Float.floatToIntBits(this.f24515[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f24514; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f24515[i]);
        }
        return iFloatToIntBits;
    }

    @Override // l.InterfaceC23170
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC23170 mo8473(int i) {
        if (i < this.f24514) {
            throw new IllegalArgumentException();
        }
        return new C7920(Arrays.copyOf(this.f24515, i), this.f24514, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m21204(i);
        return Float.valueOf(this.f24515[i]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f24514;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f24515[i2] == fFloatValue) {
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
        return this.f24514;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21206(float f) {
        m44492();
        int i = this.f24514;
        float[] fArr = this.f24515;
        if (i == fArr.length) {
            float[] fArr2 = new float[C23868.m52580(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f24515 = fArr2;
        }
        float[] fArr3 = this.f24515;
        int i2 = this.f24514;
        this.f24514 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // l.AbstractC19293, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m44492();
        byte[] bArr = C13997.f41722;
        collection.getClass();
        if (!(collection instanceof C7920)) {
            return super.addAll(collection);
        }
        C7920 c7920 = (C7920) collection;
        int i = c7920.f24514;
        if (i == 0) {
            return false;
        }
        int i2 = this.f24514;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f24515;
        if (i3 > fArr.length) {
            this.f24515 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c7920.f24515, 0, this.f24515, this.f24514, c7920.f24514);
        this.f24514 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // l.AbstractC19293, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m44492();
        m21204(i);
        float[] fArr = this.f24515;
        float f = fArr[i];
        int i2 = this.f24514;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f24514--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21204(int i) {
        if (i < 0 || i >= this.f24514) {
            StringBuilder sbM32308 = C13325.m32308(i, "Index:", ", Size:");
            sbM32308.append(this.f24514);
            throw new IndexOutOfBoundsException(sbM32308.toString());
        }
    }
}
