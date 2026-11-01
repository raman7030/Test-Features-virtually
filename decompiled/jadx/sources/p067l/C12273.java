package p067l;

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
public final class C12273 extends AbstractC16965 implements RandomAccess, Cloneable, Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ᩸ */
    public transient float[] f34289;

    /* JADX INFO: renamed from: ᩹ */
    public int f34290;

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C12273(float[] fArr) {
        this.f34289 = fArr;
    }

    public C12273() {
        this.f34289 = C15624.f44706;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float[] m28296() {
        return this.f34289;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12273 m28291(float[] fArr) {
        int length = fArr.length;
        if (length > fArr.length) {
            throw new IllegalArgumentException(C5410.m11876(fArr.length, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(length, "The specified length (", ") is greater than the array size (")));
        }
        C12273 c12273 = new C12273(fArr);
        c12273.f34290 = length;
        return c12273;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28295(int i) {
        float[] fArr = this.f34289;
        if (i > fArr.length) {
            if (fArr != C15624.f44706 || i > 10) {
                int i2 = this.f34290;
                if (i > fArr.length) {
                    float[] fArr2 = new float[i];
                    System.arraycopy(fArr, 0, fArr2, 0, i2);
                    fArr = fArr2;
                }
                this.f34289 = fArr;
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m28292(int i) {
        float[] fArr = this.f34289;
        if (i <= fArr.length) {
            return;
        }
        if (fArr != C15624.f44706) {
            i = (int) Math.max(Math.min(((long) fArr.length) + ((long) (fArr.length >> 1)), 2147483639L), i);
        } else if (i < 10) {
            i = 10;
        }
        float[] fArr2 = new float[i];
        System.arraycopy(this.f34289, 0, fArr2, 0, this.f34290);
        this.f34289 = fArr2;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ۧ */
    public final void mo6348(float f, int i) {
        m38559(i);
        m28292(this.f34290 + 1);
        int i2 = this.f34290;
        if (i != i2) {
            float[] fArr = this.f34289;
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        }
        this.f34289[i] = f;
        this.f34290++;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    public final boolean add(float f) {
        m28292(this.f34290 + 1);
        float[] fArr = this.f34289;
        int i = this.f34290;
        this.f34290 = i + 1;
        fArr[i] = f;
        return true;
    }

    @Override // p067l.InterfaceC6948
    public final float getFloat(int i) {
        if (i < this.f34290) {
            return this.f34289[i];
        }
        throw new IndexOutOfBoundsException(C5410.m11876(this.f34290, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
    }

    @Override // p067l.AbstractC16965, p067l.InterfaceC6948
    /* JADX INFO: renamed from: ᩳ */
    public final int mo15925(float f) {
        float[] fArr = this.f34289;
        for (int i = 0; i < this.f34290; i++) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(fArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // p067l.AbstractC16965, p067l.InterfaceC6948
    /* JADX INFO: renamed from: ۧ */
    public final int mo15923(float f) {
        float[] fArr = this.f34289;
        int i = this.f34290;
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

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ܺ */
    public final float mo6349(int i) {
        int i2 = this.f34290;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f34290, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f34289;
        float f = fArr[i];
        int i3 = i2 - 1;
        this.f34290 = i3;
        if (i != i3) {
            System.arraycopy(fArr, i + 1, fArr, i, i3 - i);
        }
        return f;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6350(float f) {
        int iMo15925 = mo15925(f);
        if (iMo15925 == -1) {
            return false;
        }
        mo6349(iMo15925);
        return true;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final float mo6343(float f, int i) {
        if (i >= this.f34290) {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f34290, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i, "Index (", ") is greater than or equal to list size (")));
        }
        float[] fArr = this.f34289;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // p067l.AbstractC16965, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f34290 = 0;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final void mo6345(int i, int i2, int i3, float[] fArr) {
        C11755.m26983(fArr.length, i2, i3);
        System.arraycopy(this.f34289, i, fArr, i2, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34290;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == this.f34290) {
            return this;
        }
        m38559(i);
        m38559(i2);
        if (i <= i2) {
            return new C14284(this, i, i2);
        }
        throw new IndexOutOfBoundsException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f34290 == 0;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final void mo6344(int i, int i2) {
        C11755.m26980(this.f34290, i, i2);
        float[] fArr = this.f34289;
        System.arraycopy(fArr, i2, fArr, i, this.f34290 - i2);
        this.f34290 -= i2 - i;
    }

    @Override // p067l.InterfaceC6948
    /* JADX INFO: renamed from: ֫ */
    public final void mo6346(int i, int i2, float[] fArr) {
        m38559(i);
        C11755.m26983(fArr.length, 0, i2);
        int i3 = i + i2;
        if (i3 <= this.f34290) {
            System.arraycopy(fArr, 0, this.f34289, i, i2);
        } else {
            throw new IndexOutOfBoundsException(C5410.m11876(this.f34290, MotionUtils.EASING_TYPE_FORMAT_END, C15033.m34408(i3, "End index (", ") is greater than list size (")));
        }
    }

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, p067l.InterfaceC2924
    /* JADX INFO: renamed from: ۧ */
    public final void mo4794(InterfaceC6278 interfaceC6278) {
        float[] fArr = this.f34289;
        for (int i = 0; i < this.f34290; i++) {
            interfaceC6278.mo14251(fArr[i]);
        }
    }

    @Override // p067l.AbstractC16965
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6347(int i, InterfaceC12984 interfaceC12984) {
        if (interfaceC12984 instanceof InterfaceC6948) {
            return m28294(i, (InterfaceC6948) interfaceC12984);
        }
        m38559(i);
        int size = interfaceC12984.size();
        if (size == 0) {
            return false;
        }
        m28292(this.f34290 + size);
        float[] fArr = this.f34289;
        System.arraycopy(fArr, i, fArr, i + size, this.f34290 - i);
        InterfaceC3595 it = interfaceC12984.iterator();
        this.f34290 += size;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return true;
            }
            this.f34289[i] = it.nextFloat();
            size = i2;
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28294(int i, InterfaceC6948 interfaceC6948) {
        m38559(i);
        int size = interfaceC6948.size();
        if (size == 0) {
            return false;
        }
        m28292(this.f34290 + size);
        float[] fArr = this.f34289;
        System.arraycopy(fArr, i, fArr, i + size, this.f34290 - i);
        interfaceC6948.mo6345(0, i, size, this.f34289);
        this.f34290 += size;
        return true;
    }

    @Override // p067l.AbstractC6238
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14155(InterfaceC12984 interfaceC12984) {
        int i;
        float[] fArr = this.f34289;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f34290;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC12984.mo18969(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f34290 = i3;
        return z;
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14152(InterfaceC24382 interfaceC24382) {
        int i;
        float[] fArr = this.f34289;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f34290;
            if (i2 >= i) {
                break;
            }
            if (!interfaceC24382.mo19088(fArr[i2])) {
                fArr[i3] = fArr[i2];
                i3++;
            }
            i2++;
        }
        boolean z = i != i3;
        this.f34290 = i3;
        return z;
    }

    @Override // p067l.AbstractC16965, p067l.InterfaceC6948, java.util.List
    public final InterfaceC5607 listIterator(int i) {
        m38559(i);
        return new C21661(this, i);
    }

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C6908(this);
    }

    @Override // p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18327 spliterator() {
        return new C6908(this);
    }

    @Override // p067l.AbstractC16965, p067l.InterfaceC6948
    /* JADX INFO: renamed from: ۧ */
    public final void mo15924(InterfaceC8960 interfaceC8960) {
        if (interfaceC8960 == null) {
            C15624.m35506(0, this.f34290, this.f34289, null);
        } else {
            C15624.m35507(this.f34289, 0, this.f34290, interfaceC8960, null);
        }
    }

    public final Object clone() {
        float[] fArrCopyOf;
        float[] fArr = this.f34289;
        int i = this.f34290;
        if (i == 0) {
            fArrCopyOf = C15624.f44707;
        } else {
            fArrCopyOf = Arrays.copyOf(fArr, i);
        }
        C12273 c12273 = new C12273(fArrCopyOf);
        c12273.f34290 = this.f34290;
        return c12273;
    }

    @Override // p067l.AbstractC16965, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C12273) {
            C12273 c12273 = (C12273) obj;
            if (c12273 != this) {
                int i = this.f34290;
                int i2 = c12273.f34290;
                if (i == i2) {
                    float[] fArr = this.f34289;
                    float[] fArr2 = c12273.f34289;
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
        if (obj instanceof C14284) {
            return ((C14284) obj).equals(this);
        }
        return super.equals(obj);
    }

    @Override // p067l.AbstractC16965
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(List list) {
        if (list instanceof C12273) {
            C12273 c12273 = (C12273) list;
            int i = this.f34290;
            int i2 = c12273.f34290;
            float[] fArr = this.f34289;
            float[] fArr2 = c12273.f34289;
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
        if (list instanceof C14284) {
            return -((C14284) list).compareTo((List) this);
        }
        return super.compareTo(list);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        float[] fArr = this.f34289;
        for (int i = 0; i < this.f34290; i++) {
            objectOutputStream.writeFloat(fArr[i]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        float[] fArr = new float[this.f34290];
        this.f34289 = fArr;
        for (int i = 0; i < this.f34290; i++) {
            fArr[i] = objectInputStream.readFloat();
        }
    }
}
