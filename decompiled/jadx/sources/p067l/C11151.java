package p067l;

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
public final class C11151 extends AbstractC7897 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC20007 f30921;

    /* JADX INFO: renamed from: ۙ */
    public transient Object[] f30922;

    /* JADX INFO: renamed from: ۛ */
    public transient int f30923;

    /* JADX INFO: renamed from: ۟ */
    public transient InterfaceC21210 f30924;

    /* JADX INFO: renamed from: ۤ */
    public final transient int f30925;

    /* JADX INFO: renamed from: ۨ */
    public int f30926;

    /* JADX INFO: renamed from: ۫ */
    public transient int f30927;

    /* JADX INFO: renamed from: ۬ */
    public transient int f30928;

    /* JADX INFO: renamed from: ܰ */
    public transient Object[] f30929;

    /* JADX INFO: renamed from: ᩶ */
    public final float f30930;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f30931;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC15034 f30932;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC11100 f30933;

    public C11151() {
        throw null;
    }

    public C11151(InterfaceC11100 interfaceC11100) {
        this.f30933 = interfaceC11100;
        this.f30930 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f30923 = iM34880;
        this.f30925 = iM34880;
        this.f30928 = iM34880 - 1;
        this.f30927 = C15322.m34887(0.75f, iM34880);
        int i = this.f30923 + 1;
        this.f30922 = new Object[i];
        this.f30929 = new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public Object m25687(int i) {
        Object obj;
        Object[] objArr = this.f30929;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.f30926--;
        Object[] objArr2 = this.f30922;
        loop0: while (true) {
            int i2 = (i + 1) & this.f30928;
            while (true) {
                obj = objArr2[i2];
                if (obj != null) {
                    int iM34881 = C15322.m34881(this.f30933.mo10800(obj));
                    int i3 = this.f30928;
                    int i4 = iM34881 & i3;
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
        int i5 = this.f30923;
        if (i5 > this.f30925 && this.f30926 < this.f30927 / 4 && i5 > 16) {
            m25690(i5 / 2);
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public Object m25686() {
        this.f30931 = false;
        Object[] objArr = this.f30922;
        int i = this.f30923;
        objArr[i] = null;
        Object[] objArr2 = this.f30929;
        Object obj = objArr2[i];
        objArr2[i] = null;
        int i2 = this.f30926 - 1;
        this.f30926 = i2;
        if (i > this.f30925 && i2 < this.f30927 / 4 && i > 16) {
            m25690(i / 2);
        }
        return obj;
    }

    @Override // p067l.AbstractC7897, java.util.Map
    public final void putAll(Map map) {
        float f = this.f30930;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, map.size());
            if (iM34880 > this.f30923) {
                m25690(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f30926) / f))));
            if (iMin > this.f30923) {
                m25690(iMin);
            }
        }
        super.putAll(map);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m25685(Object obj) {
        Object obj2;
        if (this.f30933.mo10801(obj, null)) {
            return this.f30931 ? this.f30923 : -(this.f30923 + 1);
        }
        Object[] objArr = this.f30922;
        int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & this.f30928;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return -(iM34881 + 1);
        }
        if (this.f30933.mo10801(obj, obj3)) {
            return iM34881;
        }
        do {
            iM34881 = (iM34881 + 1) & this.f30928;
            obj2 = objArr[iM34881];
            if (obj2 == null) {
                return -(iM34881 + 1);
            }
        } while (!this.f30933.mo10801(obj, obj2));
        return iM34881;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25682(int i, Object obj, Object obj2) {
        if (i == this.f30923) {
            this.f30931 = true;
        }
        this.f30922[i] = obj;
        this.f30929[i] = obj2;
        int i2 = this.f30926;
        this.f30926 = i2 + 1;
        if (i2 >= this.f30927) {
            m25690(C15322.m34880(this.f30930, i2 + 2));
        }
    }

    @Override // p067l.InterfaceC14364, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM25685 = m25685(obj);
        if (iM25685 < 0) {
            m25682((-iM25685) - 1, obj, obj2);
            return null;
        }
        Object[] objArr = this.f30929;
        Object obj3 = objArr[iM25685];
        objArr[iM25685] = obj2;
        return obj3;
    }

    @Override // p067l.InterfaceC14364, java.util.Map
    public final Object remove(Object obj) {
        Object obj2;
        if (this.f30933.mo10801(obj, null)) {
            if (this.f30931) {
                return m25686();
            }
        } else {
            Object[] objArr = this.f30922;
            int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & this.f30928;
            Object obj3 = objArr[iM34881];
            if (obj3 != null) {
                if (this.f30933.mo10801(obj, obj3)) {
                    return m25687(iM34881);
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f30928;
                    obj2 = objArr[iM34881];
                    if (obj2 == null) {
                    }
                } while (!this.f30933.mo10801(obj, obj2));
                return m25687(iM34881);
            }
        }
        return null;
    }

    @Override // p067l.InterfaceC11771
    public final Object get(Object obj) {
        Object obj2;
        if (!this.f30933.mo10801(obj, null)) {
            Object[] objArr = this.f30922;
            int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & this.f30928;
            Object obj3 = objArr[iM34881];
            if (obj3 != null) {
                if (this.f30933.mo10801(obj, obj3)) {
                    return this.f30929[iM34881];
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f30928;
                    obj2 = objArr[iM34881];
                    if (obj2 == null) {
                    }
                } while (!this.f30933.mo10801(obj, obj2));
                return this.f30929[iM34881];
            }
        } else if (this.f30931) {
            return this.f30929[this.f30923];
        }
        return null;
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (this.f30933.mo10801(obj, null)) {
            return this.f30931;
        }
        Object[] objArr = this.f30922;
        int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & this.f30928;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (!this.f30933.mo10801(obj, obj3)) {
            do {
                iM34881 = (iM34881 + 1) & this.f30928;
                obj2 = objArr[iM34881];
                if (obj2 == null) {
                    return false;
                }
            } while (!this.f30933.mo10801(obj, obj2));
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f30922;
        Object[] objArr2 = this.f30929;
        if (this.f30931 && C12826.equals(objArr2[this.f30923], obj)) {
            return true;
        }
        int i = this.f30923;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (objArr[i2] != null && C12826.equals(objArr2[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        if (!this.f30933.mo10801(obj, null)) {
            Object[] objArr = this.f30922;
            int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & this.f30928;
            Object obj4 = objArr[iM34881];
            if (obj4 != null) {
                if (this.f30933.mo10801(obj, obj4)) {
                    return this.f30929[iM34881];
                }
                do {
                    iM34881 = (iM34881 + 1) & this.f30928;
                    obj3 = objArr[iM34881];
                    if (obj3 == null) {
                    }
                } while (!this.f30933.mo10801(obj, obj3));
                return this.f30929[iM34881];
            }
        } else if (this.f30931) {
            return this.f30929[this.f30923];
        }
        return obj2;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final Object putIfAbsent(Object obj, Object obj2) {
        int iM25685 = m25685(obj);
        if (iM25685 >= 0) {
            return this.f30929[iM25685];
        }
        m25682((-iM25685) - 1, obj, obj2);
        return null;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final boolean remove(Object obj, Object obj2) {
        if (this.f30933.mo10801(obj, null)) {
            if (!this.f30931 || !C12826.equals(obj2, this.f30929[this.f30923])) {
                return false;
            }
            m25686();
            return true;
        }
        Object[] objArr = this.f30922;
        int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & this.f30928;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (this.f30933.mo10801(obj, obj3) && C12826.equals(obj2, this.f30929[iM34881])) {
            m25687(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & this.f30928;
            Object obj4 = objArr[iM34881];
            if (obj4 == null) {
                return false;
            }
            if (this.f30933.mo10801(obj, obj4) && C12826.equals(obj2, this.f30929[iM34881])) {
                m25687(iM34881);
                return true;
            }
        }
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM25685 = m25685(obj);
        if (iM25685 < 0 || !C12826.equals(obj2, this.f30929[iM25685])) {
            return false;
        }
        this.f30929[iM25685] = obj3;
        return true;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final Object replace(Object obj, Object obj2) {
        int iM25685 = m25685(obj);
        if (iM25685 < 0) {
            return null;
        }
        Object[] objArr = this.f30929;
        Object obj3 = objArr[iM25685];
        objArr[iM25685] = obj2;
        return obj3;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        C12826.requireNonNull(biFunction);
        int iM25685 = m25685(obj);
        if (iM25685 < 0 || (obj2 = this.f30929[iM25685]) == null) {
            return null;
        }
        Object objApply = biFunction.apply(obj, obj2);
        if (objApply == null) {
            if (this.f30933.mo10801(obj, null)) {
                m25686();
            } else {
                m25687(iM25685);
            }
            return null;
        }
        this.f30929[iM25685] = objApply;
        return objApply;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final Object compute(Object obj, BiFunction biFunction) {
        C12826.requireNonNull(biFunction);
        int iM25685 = m25685(obj);
        Object objApply = biFunction.apply(obj, iM25685 >= 0 ? this.f30929[iM25685] : null);
        if (objApply == null) {
            if (iM25685 >= 0) {
                if (this.f30933.mo10801(obj, null)) {
                    m25686();
                } else {
                    m25687(iM25685);
                }
            }
            return null;
        }
        if (iM25685 < 0) {
            m25682((-iM25685) - 1, obj, objApply);
            return objApply;
        }
        this.f30929[iM25685] = objApply;
        return objApply;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object obj3;
        C12826.requireNonNull(biFunction);
        C12826.requireNonNull(obj2);
        int iM25685 = m25685(obj);
        if (iM25685 < 0 || (obj3 = this.f30929[iM25685]) == null) {
            if (iM25685 < 0) {
                m25682((-iM25685) - 1, obj, obj2);
                return obj2;
            }
            this.f30929[iM25685] = obj2;
            return obj2;
        }
        Object objApply = biFunction.apply(obj3, obj2);
        if (objApply == null) {
            if (this.f30933.mo10801(obj, null)) {
                m25686();
            } else {
                m25687(iM25685);
            }
            return null;
        }
        this.f30929[iM25685] = objApply;
        return objApply;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f30926 == 0) {
            return;
        }
        this.f30926 = 0;
        this.f30931 = false;
        Arrays.fill(this.f30922, (Object) null);
        Arrays.fill(this.f30929, (Object) null);
    }

    @Override // p067l.AbstractC11921, p067l.InterfaceC11771
    public final int size() {
        return this.f30926;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f30926 == 0;
    }

    @Override // p067l.AbstractC7897, java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        if (this.f30931) {
            Object[] objArr = this.f30922;
            int i = this.f30923;
            biConsumer.accept(objArr[i], this.f30929[i]);
        }
        Object[] objArr2 = this.f30922;
        int i2 = this.f30923;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return;
            }
            Object obj = objArr2[i3];
            if (obj != null) {
                biConsumer.accept(obj, this.f30929[i3]);
            }
            i2 = i3;
        }
    }

    @Override // p067l.InterfaceC14364
    /* JADX INFO: renamed from: ۢۧ */
    public final InterfaceC20007 mo25689() {
        if (this.f30932 == null) {
            this.f30932 = new C18526(this);
        }
        return this.f30932;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f30921 == null) {
            this.f30921 = new C12492(this);
        }
        return this.f30921;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f30924 == null) {
            this.f30924 = new C13694(this);
        }
        return this.f30924;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25688() {
        float f = this.f30926;
        float f2 = this.f30930;
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(((int) Math.ceil(f / f2)) - 1));
        if (iNumberOfLeadingZeros >= this.f30923 || this.f30926 > C15322.m34887(f2, iNumberOfLeadingZeros)) {
            return;
        }
        try {
            m25690(iNumberOfLeadingZeros);
        } catch (OutOfMemoryError unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m25690(int i) {
        Object obj;
        Object[] objArr = this.f30922;
        Object[] objArr2 = this.f30929;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr3 = new Object[i3];
        Object[] objArr4 = new Object[i3];
        int i4 = this.f30923;
        int i5 = this.f30931 ? this.f30926 - 1 : this.f30926;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int iM34881 = C15322.m34881(this.f30933.mo10800(obj)) & i2;
                if (objArr3[iM34881] != null) {
                    do {
                        iM34881 = (iM34881 + 1) & i2;
                    } while (objArr3[iM34881] != null);
                }
                objArr3[iM34881] = objArr[i4];
                objArr4[iM34881] = objArr2[i4];
                i5 = i6;
            } else {
                objArr4[i] = objArr2[this.f30923];
                this.f30923 = i;
                this.f30928 = i2;
                this.f30927 = C15322.m34887(this.f30930, i);
                this.f30922 = objArr3;
                this.f30929 = objArr4;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C11151 c11151 = (C11151) super.clone();
            c11151.f30921 = null;
            c11151.f30924 = null;
            c11151.f30932 = null;
            c11151.f30931 = this.f30931;
            c11151.f30922 = (Object[]) this.f30922.clone();
            c11151.f30929 = (Object[]) this.f30929.clone();
            c11151.f30933 = this.f30933;
            return c11151;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // p067l.AbstractC7897, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f30922;
        Object[] objArr2 = this.f30929;
        int i = this.f30931 ? this.f30926 - 1 : this.f30926;
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
                iHashCode = this.f30933.mo10800(obj);
            }
            Object obj2 = objArr2[i2];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i3 += iHashCode;
            i2++;
            i = i4;
        }
        if (!this.f30931) {
            return i3;
        }
        Object obj3 = objArr2[this.f30923];
        return i3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object[] objArr = this.f30922;
        Object[] objArr2 = this.f30929;
        C24422 c24422 = new C24422(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f30926;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM35958 = c24422.m35958();
            objectOutputStream.writeObject(objArr[iM35958]);
            objectOutputStream.writeObject(objArr2[iM35958]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f30926;
        float f = this.f30930;
        int iM34880 = C15322.m34880(f, i2);
        this.f30923 = iM34880;
        this.f30927 = C15322.m34887(f, iM34880);
        int i3 = this.f30923;
        this.f30928 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f30922 = objArr;
        Object[] objArr2 = new Object[i3 + 1];
        this.f30929 = objArr2;
        int i4 = this.f30926;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            if (this.f30933.mo10801(object, null)) {
                i = this.f30923;
                this.f30931 = true;
            } else {
                int iM34881 = C15322.m34881(this.f30933.mo10800(object));
                int i6 = this.f30928;
                while (true) {
                    i = iM34881 & i6;
                    if (objArr[i] != null) {
                        iM34881 = i + 1;
                        i6 = this.f30928;
                    }
                }
            }
            objArr[i] = object;
            objArr2[i] = object2;
            i4 = i5;
        }
    }
}
