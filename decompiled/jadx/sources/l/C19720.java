package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19720 extends AbstractC1269 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11606 f63728;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient int[] f63729;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f63730;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final transient int f63731;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f63732;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f63733;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f63734;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f63735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f63736;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f63737;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22832 f63738;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public transient Object[] f63739;

    public C19720(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f63736 = 0.75f;
        int iM32765 = C13630.m32765(0.75f, i);
        this.f63730 = iM32765;
        this.f63731 = iM32765;
        this.f63734 = iM32765 - 1;
        this.f63733 = C13630.m32772(0.75f, iM32765);
        int i2 = this.f63730 + 1;
        this.f63729 = new int[i2];
        this.f63739 = new Object[i2];
    }

    public C19720() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object m45434(int i) {
        int i2;
        Object[] objArr = this.f63739;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f63732--;
        int[] iArr = this.f63729;
        loop0: while (true) {
            int i3 = (i + 1) & this.f63734;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM32766 = C13630.m32766(i2);
                    int i4 = this.f63734;
                    int i5 = iM32766 & i4;
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
        int i6 = this.f63730;
        if (i6 > this.f63731 && this.f63732 < this.f63733 / 4 && i6 > 16) {
            m45437(i6 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m45430() {
        this.f63737 = false;
        Object[] objArr = this.f63739;
        int i = this.f63730;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f63732 - 1;
        this.f63732 = i2;
        if (i > this.f63731 && i2 < this.f63733 / 4 && i > 16) {
            m45437(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC1269, java.util.Map
    public final void putAll(Map map) {
        float f = this.f63736;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, map.size());
            if (iM32765 > this.f63730) {
                m45437(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f63732) / f))));
            if (iMin > this.f63730) {
                m45437(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m45435(int i) {
        int i2;
        if (i == 0) {
            return this.f63737 ? this.f63730 : -(this.f63730 + 1);
        }
        int[] iArr = this.f63729;
        int iM32766 = C13630.m32766(i) & this.f63734;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return -(iM32766 + 1);
        }
        if (i == i3) {
            return iM32766;
        }
        do {
            iM32766 = (iM32766 + 1) & this.f63734;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return -(iM32766 + 1);
            }
        } while (i != i2);
        return iM32766;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45431(int i, int i2, Object obj) {
        if (i == this.f63730) {
            this.f63737 = true;
        }
        this.f63729[i] = i2;
        this.f63739[i] = obj;
        int i3 = this.f63732;
        this.f63732 = i3 + 1;
        if (i3 >= this.f63733) {
            m45437(C13630.m32765(this.f63736, i3 + 2));
        }
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        int iM45435 = m45435(i);
        if (iM45435 < 0) {
            m45431((-iM45435) - 1, i, obj);
            return null;
        }
        Object[] objArr = this.f63739;
        Object obj2 = objArr[iM45435];
        objArr[iM45435] = obj;
        return obj2;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    public final Object remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f63737) {
                return m45430();
            }
            return null;
        }
        int[] iArr = this.f63729;
        int iM32766 = C13630.m32766(i) & this.f63734;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return m45434(iM32766);
        }
        do {
            iM32766 = (iM32766 + 1) & this.f63734;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return m45434(iM32766);
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        int i2;
        if (i == 0) {
            if (this.f63737) {
                return this.f63739[this.f63730];
            }
            return null;
        }
        int[] iArr = this.f63729;
        int iM32766 = C13630.m32766(i) & this.f63734;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return null;
        }
        if (i == i3) {
            return this.f63739[iM32766];
        }
        do {
            iM32766 = (iM32766 + 1) & this.f63734;
            i2 = iArr[iM32766];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.f63739[iM32766];
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        int i2;
        if (i == 0) {
            return this.f63737;
        }
        int[] iArr = this.f63729;
        int iM32766 = C13630.m32766(i) & this.f63734;
        int i3 = iArr[iM32766];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM32766 = (iM32766 + 1) & this.f63734;
                i2 = iArr[iM32766];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int[] iArr = this.f63729;
        Object[] objArr = this.f63739;
        if (this.f63737 && C11003.equals(objArr[this.f63730], obj)) {
            return true;
        }
        int i = this.f63730;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && C11003.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m45436(int i, Object obj) {
        int iM45435 = m45435(i);
        if (iM45435 >= 0) {
            return this.f63739[iM45435];
        }
        m45431((-iM45435) - 1, i, obj);
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f63732 == 0) {
            return;
        }
        this.f63732 = 0;
        this.f63737 = false;
        Arrays.fill(this.f63729, 0);
        Arrays.fill(this.f63739, (Object) null);
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        return this.f63732;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f63732 == 0;
    }

    @Override // l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC18559 mo5869() {
        if (this.f63738 == null) {
            this.f63738 = new C9136(this);
        }
        return this.f63738;
    }

    @Override // java.util.Map
    public final InterfaceC11606 keySet() {
        if (this.f63728 == null) {
            this.f63728 = new C7019(this);
        }
        return this.f63728;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f63735 == null) {
            this.f63735 = new C16896(this);
        }
        return this.f63735;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45437(int i) {
        int i2;
        int[] iArr = this.f63729;
        Object[] objArr = this.f63739;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        Object[] objArr2 = new Object[i4];
        int i5 = this.f63730;
        int i6 = this.f63737 ? this.f63732 - 1 : this.f63732;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM32766 = C13630.m32766(i2) & i3;
                if (iArr2[iM32766] != 0) {
                    do {
                        iM32766 = (iM32766 + 1) & i3;
                    } while (iArr2[iM32766] != 0);
                }
                iArr2[iM32766] = iArr[i5];
                objArr2[iM32766] = objArr[i5];
                i6 = i7;
            } else {
                objArr2[i] = objArr[this.f63730];
                this.f63730 = i;
                this.f63734 = i3;
                this.f63733 = C13630.m32772(this.f63736, i);
                this.f63729 = iArr2;
                this.f63739 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C19720 c19720 = (C19720) super.clone();
            c19720.f63728 = null;
            c19720.f63735 = null;
            c19720.f63738 = null;
            c19720.f63737 = this.f63737;
            c19720.f63729 = (int[]) this.f63729.clone();
            c19720.f63739 = (Object[]) this.f63739.clone();
            return c19720;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC1269, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int[] iArr = this.f63729;
        Object[] objArr = this.f63739;
        int i = this.f63737 ? this.f63732 - 1 : this.f63732;
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
        if (!this.f63737) {
            return i3;
        }
        Object obj2 = objArr[this.f63730];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f63729;
        Object[] objArr = this.f63739;
        C18308 c18308 = new C18308(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f63732;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM38125 = c18308.m38125();
            objectOutputStream.writeInt(iArr[iM38125]);
            objectOutputStream.writeObject(objArr[iM38125]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f63732;
        float f = this.f63736;
        int iM32765 = C13630.m32765(f, i2);
        this.f63730 = iM32765;
        this.f63733 = C13630.m32772(f, iM32765);
        int i3 = this.f63730;
        this.f63734 = i3 - 1;
        int[] iArr = new int[i3 + 1];
        this.f63729 = iArr;
        Object[] objArr = new Object[i3 + 1];
        this.f63739 = objArr;
        int i4 = this.f63732;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            Object object = objectInputStream.readObject();
            if (i6 == 0) {
                i = this.f63730;
                this.f63737 = true;
            } else {
                int iM32766 = C13630.m32766(i6);
                int i7 = this.f63734;
                while (true) {
                    i = iM32766 & i7;
                    if (iArr[i] != 0) {
                        iM32766 = i + 1;
                        i7 = this.f63734;
                    }
                }
            }
            iArr[i] = i6;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
