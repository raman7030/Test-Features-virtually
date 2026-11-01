package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21111 extends AbstractC3575 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC13399 f66359;

    /* JADX INFO: renamed from: ۙ */
    public transient int[] f66360;

    /* JADX INFO: renamed from: ۛ */
    public transient int f66361;

    /* JADX INFO: renamed from: ۤ */
    public final transient int f66362;

    /* JADX INFO: renamed from: ۨ */
    public int f66363;

    /* JADX INFO: renamed from: ۫ */
    public transient int f66364;

    /* JADX INFO: renamed from: ۬ */
    public transient int f66365;

    /* JADX INFO: renamed from: ܰ */
    public transient InterfaceC21210 f66366;

    /* JADX INFO: renamed from: ᩶ */
    public final float f66367;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f66368;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC24068 f66369;

    /* JADX INFO: renamed from: ᩺ */
    public transient Object[] f66370;

    public C21111(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f66367 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, i);
        this.f66361 = iM34880;
        this.f66362 = iM34880;
        this.f66365 = iM34880 - 1;
        this.f66364 = C15322.m34887(0.75f, iM34880);
        int i2 = this.f66361 + 1;
        this.f66360 = new int[i2];
        this.f66370 = new Object[i2];
    }

    public C21111() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public Object m47738(int i) {
        int i2;
        Object[] objArr = this.f66370;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f66363--;
        int[] iArr = this.f66360;
        loop0: while (true) {
            int i3 = (i + 1) & this.f66365;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM34881 = C15322.m34881(i2);
                    int i4 = this.f66365;
                    int i5 = iM34881 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i5 || i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            objArr[i] = objArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        objArr[i] = null;
        int i6 = this.f66361;
        if (i6 > this.f66362 && this.f66363 < this.f66364 / 4 && i6 > 16) {
            m47741(i6 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public Object m47734() {
        this.f66368 = false;
        Object[] objArr = this.f66370;
        int i = this.f66361;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f66363 - 1;
        this.f66363 = i2;
        if (i > this.f66362 && i2 < this.f66364 / 4 && i > 16) {
            m47741(i / 2);
        }
        return obj;
    }

    @Override // p067l.AbstractC3575, java.util.Map
    public final void putAll(Map map) {
        float f = this.f66367;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, map.size());
            if (iM34880 > this.f66361) {
                m47741(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f66363) / f))));
            if (iMin > this.f66361) {
                m47741(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ܿ */
    private int m47739(int i) {
        int i2;
        if (i == 0) {
            return this.f66368 ? this.f66361 : -(this.f66361 + 1);
        }
        int[] iArr = this.f66360;
        int iM34881 = C15322.m34881(i) & this.f66365;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return -(iM34881 + 1);
        }
        if (i == i3) {
            return iM34881;
        }
        do {
            iM34881 = (iM34881 + 1) & this.f66365;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return -(iM34881 + 1);
            }
        } while (i != i2);
        return iM34881;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47735(int i, int i2, Object obj) {
        if (i == this.f66361) {
            this.f66368 = true;
        }
        this.f66360[i] = i2;
        this.f66370[i] = obj;
        int i3 = this.f66363;
        this.f66363 = i3 + 1;
        if (i3 >= this.f66364) {
            m47741(C15322.m34880(this.f66367, i3 + 2));
        }
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        int iM47739 = m47739(i);
        if (iM47739 < 0) {
            m47735((-iM47739) - 1, i, obj);
            return null;
        }
        Object[] objArr = this.f66370;
        Object obj2 = objArr[iM47739];
        objArr[iM47739] = obj;
        return obj2;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    public final Object remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f66368) {
                return m47734();
            }
            return null;
        }
        int[] iArr = this.f66360;
        int iM34881 = C15322.m34881(i) & this.f66365;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return m47738(iM34881);
        }
        do {
            iM34881 = (iM34881 + 1) & this.f66365;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return m47738(iM34881);
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        int i2;
        if (i == 0) {
            if (this.f66368) {
                return this.f66370[this.f66361];
            }
            return null;
        }
        int[] iArr = this.f66360;
        int iM34881 = C15322.m34881(i) & this.f66365;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return this.f66370[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f66365;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.f66370[iM34881];
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        int i2;
        if (i == 0) {
            return this.f66368;
        }
        int[] iArr = this.f66360;
        int iM34881 = C15322.m34881(i) & this.f66365;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM34881 = (iM34881 + 1) & this.f66365;
                i2 = iArr[iM34881];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int[] iArr = this.f66360;
        Object[] objArr = this.f66370;
        if (this.f66368 && C12826.equals(objArr[this.f66361], obj)) {
            return true;
        }
        int i = this.f66361;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && C12826.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m47740(int i, Object obj) {
        int iM47739 = m47739(i);
        if (iM47739 >= 0) {
            return this.f66370[iM47739];
        }
        m47735((-iM47739) - 1, i, obj);
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f66363 == 0) {
            return;
        }
        this.f66363 = 0;
        this.f66368 = false;
        Arrays.fill(this.f66360, 0);
        Arrays.fill(this.f66370, (Object) null);
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final int size() {
        return this.f66363;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f66363 == 0;
    }

    @Override // p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20007 mo8079() {
        if (this.f66369 == null) {
            this.f66369 = new C11052(this);
        }
        return this.f66369;
    }

    @Override // java.util.Map
    public final InterfaceC13399 keySet() {
        if (this.f66359 == null) {
            this.f66359 = new C9040(this);
        }
        return this.f66359;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f66366 == null) {
            this.f66366 = new C18427(this);
        }
        return this.f66366;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47741(int i) {
        int i2;
        int[] iArr = this.f66360;
        Object[] objArr = this.f66370;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        Object[] objArr2 = new Object[i4];
        int i5 = this.f66361;
        int i6 = this.f66368 ? this.f66363 - 1 : this.f66363;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM34881 = C15322.m34881(i2) & i3;
                if (iArr2[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i3;
                    } while (iArr2[iM34881] != 0);
                }
                iArr2[iM34881] = iArr[i5];
                objArr2[iM34881] = objArr[i5];
                i6 = i7;
            } else {
                objArr2[i] = objArr[this.f66361];
                this.f66361 = i;
                this.f66365 = i3;
                this.f66364 = C15322.m34887(this.f66367, i);
                this.f66360 = iArr2;
                this.f66370 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C21111 c21111 = (C21111) super.clone();
            c21111.f66359 = null;
            c21111.f66366 = null;
            c21111.f66369 = null;
            c21111.f66368 = this.f66368;
            c21111.f66360 = (int[]) this.f66360.clone();
            c21111.f66370 = (Object[]) this.f66370.clone();
            return c21111;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC3575, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int[] iArr = this.f66360;
        Object[] objArr = this.f66370;
        int i = this.f66368 ? this.f66363 - 1 : this.f66363;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                iHashCode = iArr[i2];
                if (iHashCode != 0) {
                    break;
                }
                i2++;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                iHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f66368) {
            return i3;
        }
        Object obj2 = objArr[this.f66361];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f66360;
        Object[] objArr = this.f66370;
        C19769 c19769 = new C19769(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f66363;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM40337 = c19769.m40337();
            objectOutputStream.writeInt(iArr[iM40337]);
            objectOutputStream.writeObject(objArr[iM40337]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f66363;
        float f = this.f66367;
        int iM34880 = C15322.m34880(f, i2);
        this.f66361 = iM34880;
        this.f66364 = C15322.m34887(f, iM34880);
        int i3 = this.f66361;
        this.f66365 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f66360 = iArr;
        Object[] objArr = new Object[i3 + 1];
        this.f66370 = objArr;
        int i4 = this.f66363;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (i6 == 0) {
                i = this.f66361;
                this.f66368 = true;
            } else {
                int iM34881 = C15322.m34881(i6);
                int i7 = this.f66365;
                while (true) {
                    i = iM34881 & i7;
                    if (iArr[i] != 0) {
                        iM34881 = i + 1;
                        i7 = this.f66365;
                    }
                }
            }
            iArr[i] = i6;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
