package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11683 extends AbstractC13932 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC20007 f32576;

    /* JADX INFO: renamed from: ۙ */
    public transient Object[] f32577;

    /* JADX INFO: renamed from: ۛ */
    public transient int f32578;

    /* JADX INFO: renamed from: ۤ */
    public final transient int f32579;

    /* JADX INFO: renamed from: ۨ */
    public int f32580;

    /* JADX INFO: renamed from: ۫ */
    public transient int f32581;

    /* JADX INFO: renamed from: ۬ */
    public transient int f32582;

    /* JADX INFO: renamed from: ܰ */
    public transient InterfaceC3360 f32583;

    /* JADX INFO: renamed from: ᩶ */
    public final float f32584;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f32585;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC15014 f32586;

    /* JADX INFO: renamed from: ᩺ */
    public transient int[] f32587;

    public C11683(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f32584 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, i);
        this.f32578 = iM34880;
        this.f32579 = iM34880;
        this.f32582 = iM34880 - 1;
        this.f32581 = C15322.m34887(0.75f, iM34880);
        int i2 = this.f32578 + 1;
        this.f32577 = new Object[i2];
        this.f32587 = new int[i2];
    }

    public C11683() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public int m26851(int i) {
        Object obj;
        int[] iArr = this.f32587;
        int i2 = iArr[i];
        this.f32580--;
        Object[] objArr = this.f32577;
        loop0: while (true) {
            int i3 = (i + 1) & this.f32582;
            while (true) {
                obj = objArr[i3];
                if (obj != null) {
                    int iM34881 = C15322.m34881(obj.hashCode());
                    int i4 = this.f32582;
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
            objArr[i] = obj;
            iArr[i] = iArr[i3];
            i = i3;
        }
        objArr[i] = null;
        int i6 = this.f32578;
        if (i6 > this.f32579 && this.f32580 < this.f32581 / 4 && i6 > 16) {
            m26854(i6 / 2);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m26846() {
        this.f32585 = false;
        Object[] objArr = this.f32577;
        int i = this.f32578;
        objArr[i] = null;
        int i2 = this.f32587[i];
        int i3 = this.f32580 - 1;
        this.f32580 = i3;
        if (i > this.f32579 && i3 < this.f32581 / 4 && i > 16) {
            m26854(i / 2);
        }
        return i2;
    }

    @Override // p067l.AbstractC13932, java.util.Map
    public final void putAll(Map map) {
        float f = this.f32584;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, map.size());
            if (iM34880 > this.f32578) {
                m26854(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f32580) / f))));
            if (iMin > this.f32578) {
                m26854(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m26850(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f32585 ? this.f32578 : -(this.f32578 + 1);
        }
        Object[] objArr = this.f32577;
        int iM34881 = C15322.m34881(obj.hashCode()) & this.f32582;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return -(iM34881 + 1);
        }
        if (obj.equals(obj3)) {
            return iM34881;
        }
        do {
            iM34881 = (iM34881 + 1) & this.f32582;
            obj2 = objArr[iM34881];
            if (obj2 == null) {
                return -(iM34881 + 1);
            }
        } while (!obj.equals(obj2));
        return iM34881;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26847(int i, int i2, Object obj) {
        if (i == this.f32578) {
            this.f32585 = true;
        }
        this.f32577[i] = obj;
        this.f32587[i] = i2;
        int i3 = this.f32580;
        this.f32580 = i3 + 1;
        if (i3 >= this.f32581) {
            m26854(C15322.m34880(this.f32584, i3 + 2));
        }
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public final int mo23936(int i, Object obj) {
        int iM26850 = m26850(obj);
        if (iM26850 < 0) {
            m26847((-iM26850) - 1, i, obj);
            return 0;
        }
        int[] iArr = this.f32587;
        int i2 = iArr[iM26850];
        iArr[iM26850] = i;
        return i2;
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public final int mo23937(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f32585) {
                return m26846();
            }
            return 0;
        }
        Object[] objArr = this.f32577;
        int iM34881 = C15322.m34881(obj.hashCode()) & this.f32582;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return m26851(iM34881);
        }
        do {
            iM34881 = (iM34881 + 1) & this.f32582;
            obj2 = objArr[iM34881];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return m26851(iM34881);
    }

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ۧ */
    public final int mo23939(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f32585) {
                return this.f32587[this.f32578];
            }
            return 0;
        }
        Object[] objArr = this.f32577;
        int iM34881 = C15322.m34881(obj.hashCode()) & this.f32582;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return this.f32587[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f32582;
            obj2 = objArr[iM34881];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return this.f32587[iM34881];
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f32585;
        }
        Object[] objArr = this.f32577;
        int iM34881 = C15322.m34881(obj.hashCode()) & this.f32582;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                iM34881 = (iM34881 + 1) & this.f32582;
                obj2 = objArr[iM34881];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo23940(int i) {
        Object[] objArr = this.f32577;
        int[] iArr = this.f32587;
        if (this.f32585 && iArr[this.f32578] == i) {
            return true;
        }
        int i2 = this.f32578;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (objArr[i3] != null && iArr[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    @Override // p067l.AbstractC13932
    /* JADX INFO: renamed from: ֫ */
    public final int mo26852(int i, String str) {
        Object obj;
        if (str == null) {
            if (this.f32585) {
                return this.f32587[this.f32578];
            }
        } else {
            Object[] objArr = this.f32577;
            int iM34881 = C15322.m34881(str.hashCode()) & this.f32582;
            Object obj2 = objArr[iM34881];
            if (obj2 != null) {
                if (str.equals(obj2)) {
                    return this.f32587[iM34881];
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f32582;
                    obj = objArr[iM34881];
                    if (obj == null) {
                    }
                } while (!str.equals(obj));
                return this.f32587[iM34881];
            }
        }
        return i;
    }

    @Override // p067l.AbstractC13932, p067l.InterfaceC14344
    /* JADX INFO: renamed from: ֫ */
    public final int mo26853(String str, C16102 c16102) {
        int iM26850 = m26850(str);
        if (iM26850 >= 0) {
            return this.f32587[iM26850];
        }
        int iMo23939 = c16102.mo23939(str);
        m26847((-iM26850) - 1, iMo23939, str);
        return iMo23939;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f32580 == 0) {
            return;
        }
        this.f32580 = 0;
        this.f32585 = false;
        Arrays.fill(this.f32577, (Object) null);
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC11771
    public final int size() {
        return this.f32580;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f32580 == 0;
    }

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC20007 mo23938() {
        if (this.f32586 == null) {
            this.f32586 = new C19058(this);
        }
        return this.f32586;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f32576 == null) {
            this.f32576 = new C13024(this);
        }
        return this.f32576;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f32583 == null) {
            this.f32583 = new C13674(this);
        }
        return this.f32583;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26854(int i) {
        Object obj;
        Object[] objArr = this.f32577;
        int[] iArr = this.f32587;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr2 = new int[i3];
        int i4 = this.f32578;
        int i5 = this.f32585 ? this.f32580 - 1 : this.f32580;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM34881 = C15322.m34881(obj.hashCode()) & i2;
                if (objArr2[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + 1) & i2;
                    } while (objArr2[iM34881] != null);
                }
                objArr2[iM34881] = objArr[i4];
                iArr2[iM34881] = iArr[i4];
                i5 = i6;
            } else {
                iArr2[i] = iArr[this.f32578];
                this.f32578 = i;
                this.f32582 = i2;
                this.f32581 = C15322.m34887(this.f32584, i);
                this.f32577 = objArr2;
                this.f32587 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C11683 c11683 = (C11683) super.clone();
            c11683.f32576 = null;
            c11683.f32583 = null;
            c11683.f32586 = null;
            c11683.f32585 = this.f32585;
            c11683.f32577 = (Object[]) this.f32577.clone();
            c11683.f32587 = (int[]) this.f32587.clone();
            return c11683;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC13932, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f32577;
        int[] iArr = this.f32587;
        int i = this.f32585 ? this.f32580 - 1 : this.f32580;
        int i2 = 0;
        int i3 = 0;
        int iHashCode = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                iHashCode = obj.hashCode();
            }
            iHashCode ^= iArr[i2];
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        return this.f32585 ? i3 + iArr[this.f32578] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f32577;
        int[] iArr = this.f32587;
        C24402 c24402 = new C24402(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f32580;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM37188 = c24402.m37188();
            objectOutputStream.writeObject(objArr[iM37188]);
            objectOutputStream.writeInt(iArr[iM37188]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f32580;
        float f = this.f32584;
        int iM34880 = C15322.m34880(f, i2);
        this.f32578 = iM34880;
        this.f32581 = C15322.m34887(f, iM34880);
        int i3 = this.f32578;
        this.f32582 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f32577 = objArr;
        int[] iArr = new int[i3 + 1];
        this.f32587 = iArr;
        int i4 = this.f32580;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            int i6 = objectInputStream.readInt();
            if (object == null) {
                i = this.f32578;
                this.f32585 = true;
            } else {
                int iM34881 = C15322.m34881(object.hashCode());
                int i7 = this.f32582;
                while (true) {
                    i = iM34881 & i7;
                    if (objArr[i] != null) {
                        iM34881 = i + 1;
                        i7 = this.f32582;
                    }
                }
            }
            objArr[i] = object;
            iArr[i] = i6;
            i4 = i5;
        }
    }
}
