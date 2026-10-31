package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۤܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10421 extends AbstractC15358 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient float[] f31324;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31325;

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C10421(float[] fArr) {
        this.f31324 = fArr;
    }

    public C10421() {
        this.f31324 = C13947.f41625;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float[] m26267() {
        return this.f31324;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10421 m26262(float[] fArr) {
        int length = fArr.length;
        if (length > fArr.length) {
            throw new IllegalArgumentException(C3200.m9831(fArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(length, "The specified length (", ") is greater than the array size (")));
        }
        C10421 c10421 = new C10421(fArr);
        c10421.f31325 = length;
        return c10421;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26266(int i) {
        float[] fArr = this.f31324;
        if (i > fArr.length) {
            if (fArr != C13947.f41625 || i > 10) {
                int i2 = this.f31325;
                if (i > fArr.length) {
                    float[] fArr2 = new float[i];
                    System.arraycopy(fArr, 0, fArr2, 0, i2);
                    fArr = fArr2;
                }
                this.f31324 = fArr;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m26263(int i) {
        float[] fArr = this.f31324;
        if (i <= fArr.length) {
            return;
        }
        if (fArr != C13947.f41625) {
            i = (int) Math.max(Math.min(((long) fArr.length) + ((long) (fArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        float[] fArr2 = new float[i];
        System.arraycopy(this.f31324, 0, fArr2, 0, this.f31325);
        this.f31324 = fArr2;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ۧ */
    public final void mo4104(float f, int i) {
        m36401(i);
        m26263(this.f31325 + 1);
        int i2 = this.f31325;
        if (i != i2) {
            float[] fArr = this.f31324;
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        }
        this.f31324[i] = f;
        this.f31325++;
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    public final boolean add(float f) {
        m26263(this.f31325 + 1);
        float[] fArr = this.f31324;
        int i = this.f31325;
        this.f31325 = i + 1;
        fArr[i] = f;
        return true;
    }

    @Override // l.InterfaceC4818
    public final float getFloat(int i) {
        if (i < this.f31325) {
            return this.f31324[i];
        }
        throw new IndexOutOfBoundsException(C3200.m9831(this.f31325, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // l.AbstractC15358, l.InterfaceC4818
    /* JADX INFO: renamed from: ᩳ */
    public final int mo14045(float f) {
        float[] fArr = this.f31324;
        for (int i = 0; i < this.f31325; i++) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(fArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // l.AbstractC15358, l.InterfaceC4818
    /* JADX INFO: renamed from: ۧ */
    public final int mo14043(float f) {
        float[] fArr = this.f31324;
        int i = this.f31325;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(fArr[i2])) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ܺ */
    public final float mo4105(int i) {
        int i2 = this.f31325;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f31325, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f31324;
        float f = fArr[i];
        int i3 = i2 - 1;
        this.f31325 = i3;
        if (i != i3) {
            System.arraycopy(fArr, i + 1, fArr, i, i3 - i);
        }
        return f;
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4106(float f) {
        int iMo14045 = mo14045(f);
        if (iMo14045 == -1) {
            return false;
        }
        mo4105(iMo14045);
        return true;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫ */
    public final float mo4099(float f, int i) {
        if (i >= this.f31325) {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f31325, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f31324;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // l.AbstractC15358, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f31325 = 0;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫ */
    public final void mo4101(int i, int i2, int i3, float[] fArr) {
        C9876.m24968(fArr.length, i2, i3);
        System.arraycopy(this.f31324, i, fArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31325;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f31325) {
            return this;
        }
        m36401(i);
        m36401(i2);
        if (i <= i2) {
            return new C12537(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f31325 == 0;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫ */
    public final void mo4100(int i, int i2) {
        C9876.m24965(this.f31325, i, i2);
        float[] fArr = this.f31324;
        System.arraycopy(fArr, i2, fArr, i, this.f31325 - i2);
        this.f31325 -= i2 - i;
    }

    @Override // l.InterfaceC4818
    /* JADX INFO: renamed from: ֫ */
    public final void mo4102(int i, int i2, float[] fArr) {
        m36401(i);
        C9876.m24968(fArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f31325) {
            System.arraycopy(fArr, 0, this.f31324, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C3200.m9831(this.f31325, MotionUtils.EASING_TYPE_FORMAT_END, C13325.m32308(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // l.AbstractC15358, l.AbstractC4071, l.InterfaceC0584
    /* JADX INFO: renamed from: ۧ */
    public final void mo2423(InterfaceC4113 interfaceC4113) {
        float[] fArr = this.f31324;
        for (int i = 0; i < this.f31325; i++) {
            interfaceC4113.mo12346(fArr[i]);
        }
    }

    @Override // l.AbstractC15358
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4103(int i, InterfaceC11169 interfaceC11169) {
        if (interfaceC11169 instanceof InterfaceC4818) {
            return m26265(i, (InterfaceC4818) interfaceC11169);
        }
        m36401(i);
        int size = interfaceC11169.size();
        if (size == 0) {
            return false;
        }
        m26263(this.f31325 + size);
        float[] fArr = this.f31324;
        System.arraycopy(fArr, i, fArr, i + size, this.f31325 - i);
        InterfaceC1290 it = interfaceC11169.iterator();
        this.f31325 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f31324[i] = it.nextFloat();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26265(int i, InterfaceC4818 interfaceC4818) {
        m36401(i);
        int size = interfaceC4818.size();
        if (size == 0) {
            return false;
        }
        m26263(this.f31325 + size);
        float[] fArr = this.f31324;
        System.arraycopy(fArr, i, fArr, i + size, this.f31325 - i);
        interfaceC4818.mo4101(0, i, size, this.f31324);
        this.f31325 += size;
        return true;
    }

    @Override // l.AbstractC4071
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12234(InterfaceC11169 interfaceC11169) {
        int i;
        float[] fArr = this.f31324;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f31325;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC11169.mo17038(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f31325 = i3;
        return z;
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12231(InterfaceC23162 interfaceC23162) {
        int i;
        float[] fArr = this.f31324;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f31325;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC23162.mo17154(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f31325 = i3;
        return z;
    }

    @Override // l.AbstractC15358, l.InterfaceC4818, java.util.List
    public final InterfaceC3407 listIterator(int i) {
        m36401(i);
        return new C20299(this, i);
    }

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C4776(this);
    }

    @Override // l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16791 spliterator() {
        return new C4776(this);
    }

    @Override // l.AbstractC15358, l.InterfaceC4818
    /* JADX INFO: renamed from: ۧ */
    public final void mo14044(InterfaceC6935 interfaceC6935) {
        if (interfaceC6935 == null) {
            C13947.m33387(0, this.f31325, this.f31324, null);
        } else {
            C13947.m33388(this.f31324, 0, this.f31325, interfaceC6935, null);
        }
    }

    public final Object clone() {
        float[] fArrCopyOf;
        float[] fArr = this.f31324;
        int i = this.f31325;
        if (i == 0) {
            fArrCopyOf = C13947.f41626;
        } else {
            fArrCopyOf = Arrays.copyOf(fArr, i);
        }
        C10421 c10421 = new C10421(fArrCopyOf);
        c10421.f31325 = this.f31325;
        return c10421;
    }

    @Override // l.AbstractC15358, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C10421) {
            C10421 c10421 = (C10421) obj;
            if (c10421 != this) {
                int i = this.f31325;
                int i2 = c10421.f31325;
                if (i == i2) {
                    float[] fArr = this.f31324;
                    float[] fArr2 = c10421.f31324;
                    if (fArr != fArr2 || i != i2) {
                        while (true) {
                            int i3 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            if (fArr[i3] == fArr2[i3]) {
                                i = i3;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if (obj instanceof C12537) {
            return ((C12537) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // l.AbstractC15358
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int compareTo(List list) {
        if (list instanceof C10421) {
            C10421 c10421 = (C10421) list;
            int i = this.f31325;
            int i2 = c10421.f31325;
            float[] fArr = this.f31324;
            float[] fArr2 = c10421.f31324;
            if (fArr != fArr2 || i != i2) {
                int i3 = 0;
                while (i3 < i && i3 < i2) {
                    int iCompare = Float.compare(fArr[i3], fArr2[i3]);
                    if (iCompare != 0) {
                        return iCompare;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    return -1;
                }
                if (i3 < i) {
                    return 1;
                }
            }
            return 0;
        }
        if (list instanceof C12537) {
            return -((C12537) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f31324;
        for (int i = 0; i < this.f31325; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f31325];
        this.f31324 = fArr;
        for (int i = 0; i < this.f31325; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
