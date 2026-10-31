package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: l.ۢ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9241 extends AbstractC5817 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18559 f27975;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient Object[] f27976;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f27977;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f27978;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final transient int f27979;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f27980;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f27981;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f27982;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient Object[] f27983;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f27984;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f27985;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC13326 f27986;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC9187 f27987;

    public C9241() {
        throw null;
    }

    public C9241(InterfaceC9187 interfaceC9187) {
        this.f27987 = interfaceC9187;
        this.f27984 = 0.75f;
        int iM32765 = C13630.m32765(0.75f, 16);
        this.f27977 = iM32765;
        this.f27979 = iM32765;
        this.f27982 = iM32765 - 1;
        this.f27981 = C13630.m32772(0.75f, iM32765);
        int i = this.f27977 + 1;
        this.f27976 = new Object[i];
        this.f27983 = new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object m23687(int i) {
        Object obj;
        Object[] objArr = this.f27983;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.f27980--;
        Object[] objArr2 = this.f27976;
        loop0: while (true) {
            int i2 = (i + 1) & this.f27982;
            while (true) {
                obj = objArr2[i2];
                if (obj != null) {
                    int iM32766 = C13630.m32766(this.f27987.mo8733(obj));
                    int i3 = this.f27982;
                    int i4 = iM32766 & i3;
                    if (i > i2) {
                        if (i >= i4 && i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    } else {
                        if (i >= i4 || i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    }
                } else {
                    break loop0;
                }
            }
            objArr2[i] = obj;
            objArr[i] = objArr[i2];
            i = i2;
        }
        objArr2[i] = null;
        objArr[i] = null;
        int i5 = this.f27977;
        if (i5 > this.f27979 && this.f27980 < this.f27981 / 4 && i5 > 16) {
            m23690(i5 / 2);
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object m23686() {
        this.f27985 = false;
        Object[] objArr = this.f27976;
        int i = this.f27977;
        objArr[i] = null;
        Object[] objArr2 = this.f27983;
        Object obj = objArr2[i];
        objArr2[i] = null;
        int i2 = this.f27980 - 1;
        this.f27980 = i2;
        if (i > this.f27979 && i2 < this.f27981 / 4 && i > 16) {
            m23690(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC5817, java.util.Map
    public final void putAll(Map map) {
        float f = this.f27984;
        if (f <= 0.5d) {
            int iM32765 = C13630.m32765(f, map.size());
            if (iM32765 > this.f27977) {
                m23690(iM32765);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f27980) / f))));
            if (iMin > this.f27977) {
                m23690(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23685(Object obj) {
        Object obj2;
        if (this.f27987.mo8734(obj, null)) {
            return this.f27985 ? this.f27977 : -(this.f27977 + 1);
        }
        Object[] objArr = this.f27976;
        int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & this.f27982;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return -(iM32766 + 1);
        }
        if (this.f27987.mo8734(obj, obj3)) {
            return iM32766;
        }
        do {
            iM32766 = (iM32766 + 1) & this.f27982;
            obj2 = objArr[iM32766];
            if (obj2 == null) {
                return -(iM32766 + 1);
            }
        } while (!this.f27987.mo8734(obj, obj2));
        return iM32766;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23682(int i, Object obj, Object obj2) {
        if (i == this.f27977) {
            this.f27985 = true;
        }
        this.f27976[i] = obj;
        this.f27983[i] = obj2;
        int i2 = this.f27980;
        this.f27980 = i2 + 1;
        if (i2 >= this.f27981) {
            m23690(C13630.m32765(this.f27984, i2 + 2));
        }
    }

    @Override // l.InterfaceC12621, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM23685 = m23685(obj);
        if (iM23685 < 0) {
            m23682((-iM23685) - 1, obj, obj2);
            return null;
        }
        Object[] objArr = this.f27983;
        Object obj3 = objArr[iM23685];
        objArr[iM23685] = obj2;
        return obj3;
    }

    @Override // l.InterfaceC12621, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        if (this.f27987.mo8734(obj, null)) {
            if (this.f27985) {
                return m23686();
            }
        } else {
            Object[] objArr = this.f27976;
            int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & this.f27982;
            Object obj3 = objArr[iM32766];
            if (obj3 != null) {
                if (this.f27987.mo8734(obj, obj3)) {
                    return m23687(iM32766);
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f27982;
                    obj2 = objArr[iM32766];
                    if (obj2 == null) {
                    }
                } while (!this.f27987.mo8734(obj, obj2));
                return m23687(iM32766);
            }
        }
        return null;
    }

    @Override // l.InterfaceC9893
    public final Object get(Object obj) {
        Object obj2;
        if (!this.f27987.mo8734(obj, null)) {
            Object[] objArr = this.f27976;
            int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & this.f27982;
            Object obj3 = objArr[iM32766];
            if (obj3 != null) {
                if (this.f27987.mo8734(obj, obj3)) {
                    return this.f27983[iM32766];
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f27982;
                    obj2 = objArr[iM32766];
                    if (obj2 == null) {
                    }
                } while (!this.f27987.mo8734(obj, obj2));
                return this.f27983[iM32766];
            }
        } else if (this.f27985) {
            return this.f27983[this.f27977];
        }
        return null;
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (this.f27987.mo8734(obj, null)) {
            return this.f27985;
        }
        Object[] objArr = this.f27976;
        int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & this.f27982;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return false;
        }
        if (!this.f27987.mo8734(obj, obj3)) {
            do {
                iM32766 = (iM32766 + 1) & this.f27982;
                obj2 = objArr[iM32766];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f27987.mo8734(obj, obj2));
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f27976;
        Object[] objArr2 = this.f27983;
        if (this.f27985 && C11003.equals(objArr2[this.f27977], obj)) {
            return true;
        }
        int i = this.f27977;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (objArr[i2] != null && C11003.equals(objArr2[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        if (!this.f27987.mo8734(obj, null)) {
            Object[] objArr = this.f27976;
            int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & this.f27982;
            Object obj4 = objArr[iM32766];
            if (obj4 != null) {
                if (this.f27987.mo8734(obj, obj4)) {
                    return this.f27983[iM32766];
                }
                do {
                    iM32766 = (iM32766 + 1) & this.f27982;
                    obj3 = objArr[iM32766];
                    if (obj3 == null) {
                    }
                } while (!this.f27987.mo8734(obj, obj3));
                return this.f27983[iM32766];
            }
        } else if (this.f27985) {
            return this.f27983[this.f27977];
        }
        return obj2;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final Object putIfAbsent(Object obj, Object obj2) {
        int iM23685 = m23685(obj);
        if (iM23685 >= 0) {
            return this.f27983[iM23685];
        }
        m23682((-iM23685) - 1, obj, obj2);
        return null;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final boolean remove(Object obj, Object obj2) {
        if (this.f27987.mo8734(obj, null)) {
            if (!this.f27985 || !C11003.equals(obj2, this.f27983[this.f27977])) {
                return false;
            }
            m23686();
            return true;
        }
        Object[] objArr = this.f27976;
        int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & this.f27982;
        Object obj3 = objArr[iM32766];
        if (obj3 == null) {
            return false;
        }
        if (this.f27987.mo8734(obj, obj3) && C11003.equals(obj2, this.f27983[iM32766])) {
            m23687(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & this.f27982;
            Object obj4 = objArr[iM32766];
            if (obj4 == null) {
                return false;
            }
            if (this.f27987.mo8734(obj, obj4) && C11003.equals(obj2, this.f27983[iM32766])) {
                m23687(iM32766);
                return true;
            }
        }
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM23685 = m23685(obj);
        if (iM23685 < 0 || !C11003.equals(obj2, this.f27983[iM23685])) {
            return false;
        }
        this.f27983[iM23685] = obj3;
        return true;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final Object replace(Object obj, Object obj2) {
        int iM23685 = m23685(obj);
        if (iM23685 < 0) {
            return null;
        }
        Object[] objArr = this.f27983;
        Object obj3 = objArr[iM23685];
        objArr[iM23685] = obj2;
        return obj3;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        C11003.requireNonNull(biFunction);
        int iM23685 = m23685(obj);
        if (iM23685 < 0 || (obj2 = this.f27983[iM23685]) == null) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            if (this.f27987.mo8734(obj, null)) {
                m23686();
            } else {
                m23687(iM23685);
            }
            return null;
        }
        this.f27983[iM23685] = objApply;
        return objApply;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final Object compute(Object obj, BiFunction biFunction) {
        C11003.requireNonNull(biFunction);
        int iM23685 = m23685(obj);
        Object objApply = biFunction.apply(obj, iM23685 >= 0 ? this.f27983[iM23685] : null);
        if (objApply == null) {
            if (iM23685 >= 0) {
                if (this.f27987.mo8734(obj, null)) {
                    m23686();
                } else {
                    m23687(iM23685);
                }
            }
            return null;
        }
        if (iM23685 < 0) {
            m23682((-iM23685) - 1, obj, objApply);
            return objApply;
        }
        this.f27983[iM23685] = objApply;
        return objApply;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        C11003.requireNonNull(biFunction);
        C11003.requireNonNull(obj2);
        int iM23685 = m23685(obj);
        if (iM23685 < 0 || (obj3 = this.f27983[iM23685]) == null) {
            if (iM23685 < 0) {
                m23682((-iM23685) - 1, obj, obj2);
                return obj2;
            }
            this.f27983[iM23685] = obj2;
            return obj2;
        }
        Object objApply = biFunction.apply(obj3, obj2);
        if (objApply == null) {
            if (this.f27987.mo8734(obj, null)) {
                m23686();
            } else {
                m23687(iM23685);
            }
            return null;
        }
        this.f27983[iM23685] = objApply;
        return objApply;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f27980 == 0) {
            return;
        }
        this.f27980 = 0;
        this.f27985 = false;
        Arrays.fill(this.f27976, (Object) null);
        Arrays.fill(this.f27983, (Object) null);
    }

    @Override // l.AbstractC10051, l.InterfaceC9893
    public final int size() {
        return this.f27980;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f27980 == 0;
    }

    @Override // l.AbstractC5817, java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        if (this.f27985) {
            Object[] objArr = this.f27976;
            int i = this.f27977;
            biConsumer.accept(objArr[i], this.f27983[i]);
        }
        Object[] objArr2 = this.f27976;
        int i2 = this.f27977;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return;
            }
            Object obj = objArr2[i3];
            if (obj != null) {
                biConsumer.accept(obj, this.f27983[i3]);
            }
            i2 = i3;
        }
    }

    @Override // l.InterfaceC12621
    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18559 mo23689() {
        if (this.f27986 == null) {
            this.f27986 = new C17001(this);
        }
        return this.f27986;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f27975 == null) {
            this.f27975 = new C10652(this);
        }
        return this.f27975;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f27978 == null) {
            this.f27978 = new C11916(this);
        }
        return this.f27978;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23688() {
        float f = this.f27980;
        float f2 = this.f27984;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f27977 || this.f27980 > C13630.m32772(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m23690(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23690(int i) {
        Object obj;
        Object[] objArr = this.f27976;
        Object[] objArr2 = this.f27983;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr3 = new Object[i3];
        Object[] objArr4 = new Object[i3];
        int i4 = this.f27977;
        int i5 = this.f27985 ? this.f27980 - 1 : this.f27980;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM32766 = C13630.m32766(this.f27987.mo8733(obj)) & i2;
                if (objArr3[iM32766] != null) {
                    do {
                        iM32766 = (iM32766 + 1) & i2;
                    } while (objArr3[iM32766] != null);
                }
                objArr3[iM32766] = objArr[i4];
                objArr4[iM32766] = objArr2[i4];
                i5 = i6;
            } else {
                objArr4[i] = objArr2[this.f27977];
                this.f27977 = i;
                this.f27982 = i2;
                this.f27981 = C13630.m32772(this.f27984, i);
                this.f27976 = objArr3;
                this.f27983 = objArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C9241 c9241 = (C9241) super.clone();
            c9241.f27975 = null;
            c9241.f27978 = null;
            c9241.f27986 = null;
            c9241.f27985 = this.f27985;
            c9241.f27976 = (Object[]) this.f27976.clone();
            c9241.f27983 = (Object[]) this.f27983.clone();
            c9241.f27987 = this.f27987;
            return c9241;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC5817, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f27976;
        Object[] objArr2 = this.f27983;
        int i = this.f27985 ? this.f27980 - 1 : this.f27980;
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
                iHashCode = this.f27987.mo8733(obj);
            }
            Object obj2 = objArr2[i2];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f27985) {
            return i3;
        }
        Object obj3 = objArr2[this.f27977];
        return i3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f27976;
        Object[] objArr2 = this.f27983;
        C23204 c23204 = new C23204(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f27980;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM33826 = c23204.m33826();
            objectOutputStream.writeObject(objArr[iM33826]);
            objectOutputStream.writeObject(objArr2[iM33826]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f27980;
        float f = this.f27984;
        int iM32765 = C13630.m32765(f, i2);
        this.f27977 = iM32765;
        this.f27981 = C13630.m32772(f, iM32765);
        int i3 = this.f27977;
        this.f27982 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f27976 = objArr;
        Object[] objArr2 = new Object[i3 + 1];
        this.f27983 = objArr2;
        int i4 = this.f27980;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (this.f27987.mo8734(object, null)) {
                i = this.f27977;
                this.f27985 = true;
            } else {
                int iM32766 = C13630.m32766(this.f27987.mo8733(object));
                int i6 = this.f27982;
                while (true) {
                    i = iM32766 & i6;
                    if (objArr[i] != null) {
                        iM32766 = i + 1;
                        i6 = this.f27982;
                    }
                }
            }
            objArr[i] = object;
            objArr2[i] = object2;
            i4 = i5;
        }
    }
}
