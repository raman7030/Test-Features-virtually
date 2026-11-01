package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes.dex */
public final class C25020 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ۛ */
    public static final Comparator f79868 = new C9617();

    /* JADX INFO: renamed from: ۗ */
    public C19656 f79869;

    /* JADX INFO: renamed from: ۙ */
    public final C16302 f79870;

    /* JADX INFO: renamed from: ۤ */
    public int f79871;

    /* JADX INFO: renamed from: ۫ */
    public C16302 f79872;

    /* JADX INFO: renamed from: ۬ */
    public int f79873;

    /* JADX INFO: renamed from: ᩶ */
    public C12951 f79874;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f79875;

    /* JADX INFO: renamed from: ᩹ */
    public final Comparator f79876;

    public C25020() {
        this(true);
    }

    public C25020(boolean z) {
        this.f79871 = 0;
        this.f79873 = 0;
        this.f79876 = f79868;
        this.f79875 = z;
        this.f79870 = new C16302(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f79871;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f79875) {
            throw new NullPointerException("value == null");
        }
        C16302 c16302M54938 = m54938(obj, true);
        Object obj3 = c16302M54938.f47916;
        c16302M54938.f47916 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f79872 = null;
        this.f79871 = 0;
        this.f79873++;
        C16302 c16302 = this.f79870;
        c16302.f47918 = c16302;
        c16302.f47914 = c16302;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16302 m54938(Object obj, boolean z) {
        int iCompare;
        C16302 c16302;
        C16302 c16303 = this.f79872;
        Comparator comparator = f79868;
        Comparator comparator2 = this.f79876;
        if (c16303 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c16303.f47920;
                if (comparable != null) {
                    iCompare = comparable.compareTo(obj2);
                } else {
                    iCompare = comparator2.compare(obj, obj2);
                }
                if (iCompare == 0) {
                    return c16303;
                }
                C16302 c16304 = iCompare < 0 ? c16303.f47915 : c16303.f47917;
                if (c16304 == null) {
                    break;
                }
                c16303 = c16304;
            }
        } else {
            iCompare = 0;
        }
        if (!z) {
            return null;
        }
        C16302 c16305 = this.f79870;
        if (c16303 == null) {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c16302 = new C16302(this.f79875, c16303, obj, c16305, c16305.f47918);
            this.f79872 = c16302;
        } else {
            c16302 = new C16302(this.f79875, c16303, obj, c16305, c16305.f47918);
            if (iCompare < 0) {
                c16303.f47915 = c16302;
            } else {
                c16303.f47917 = c16302;
            }
            m54937(c16303, true);
        }
        this.f79871++;
        this.f79873++;
        return c16302;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C16302 c16302M54938 = null;
        if (obj != null) {
            try {
                c16302M54938 = m54938(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c16302M54938 != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C16302 c16302M54938;
        if (obj != null) {
            try {
                c16302M54938 = m54938(obj, false);
            } catch (ClassCastException unused) {
                c16302M54938 = null;
            }
        } else {
            c16302M54938 = null;
        }
        if (c16302M54938 != null) {
            return c16302M54938.f47916;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C16302 c16302M54938;
        if (obj != null) {
            try {
                c16302M54938 = m54938(obj, false);
            } catch (ClassCastException unused) {
                c16302M54938 = null;
            }
        } else {
            c16302M54938 = null;
        }
        if (c16302M54938 != null) {
            m54939(c16302M54938, true);
        }
        if (c16302M54938 != null) {
            return c16302M54938.f47916;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54939(C16302 c16302, boolean z) {
        int i;
        if (z) {
            C16302 c16303 = c16302.f47918;
            c16303.f47914 = c16302.f47914;
            c16302.f47914.f47918 = c16303;
        }
        C16302 c16304 = c16302.f47915;
        C16302 c16305 = c16302.f47917;
        C16302 c16306 = c16302.f47919;
        int i2 = 0;
        if (c16304 != null && c16305 != null) {
            if (c16304.f47922 <= c16305.f47922) {
                for (C16302 c16307 = c16305.f47915; c16307 != null; c16307 = c16307.f47915) {
                    c16305 = c16307;
                }
            } else {
                C16302 c16308 = c16304.f47917;
                while (true) {
                    C16302 c16309 = c16308;
                    c16305 = c16304;
                    c16304 = c16309;
                    if (c16304 == null) {
                        break;
                    } else {
                        c16308 = c16304.f47917;
                    }
                }
            }
            m54939(c16305, false);
            C16302 c163010 = c16302.f47915;
            if (c163010 != null) {
                i = c163010.f47922;
                c16305.f47915 = c163010;
                c163010.f47919 = c16305;
                c16302.f47915 = null;
            } else {
                i = 0;
            }
            C16302 c163011 = c16302.f47917;
            if (c163011 != null) {
                i2 = c163011.f47922;
                c16305.f47917 = c163011;
                c163011.f47919 = c16305;
                c16302.f47917 = null;
            }
            c16305.f47922 = Math.max(i, i2) + 1;
            m54935(c16302, c16305);
            return;
        }
        if (c16304 != null) {
            m54935(c16302, c16304);
            c16302.f47915 = null;
        } else if (c16305 != null) {
            m54935(c16302, c16305);
            c16302.f47917 = null;
        } else {
            m54935(c16302, (C16302) null);
        }
        m54937(c16306, false);
        this.f79871--;
        this.f79873++;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54935(C16302 c16302, C16302 c16303) {
        C16302 c16304 = c16302.f47919;
        c16302.f47919 = null;
        if (c16303 != null) {
            c16303.f47919 = c16304;
        }
        if (c16304 != null) {
            if (c16304.f47915 == c16302) {
                c16304.f47915 = c16303;
                return;
            } else {
                c16304.f47917 = c16303;
                return;
            }
        }
        this.f79872 = c16303;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m54937(C16302 c16302, boolean z) {
        while (c16302 != null) {
            C16302 c16303 = c16302.f47915;
            C16302 c16304 = c16302.f47917;
            int i = c16303 != null ? c16303.f47922 : 0;
            int i2 = c16304 != null ? c16304.f47922 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C16302 c16305 = c16304.f47915;
                C16302 c16306 = c16304.f47917;
                int i4 = (c16305 != null ? c16305.f47922 : 0) - (c16306 != null ? c16306.f47922 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m54934(c16302);
                } else {
                    m54936(c16304);
                    m54934(c16302);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C16302 c16307 = c16303.f47915;
                C16302 c16308 = c16303.f47917;
                int i5 = (c16307 != null ? c16307.f47922 : 0) - (c16308 != null ? c16308.f47922 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m54936(c16302);
                } else {
                    m54934(c16303);
                    m54936(c16302);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c16302.f47922 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c16302.f47922 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c16302 = c16302.f47919;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54934(C16302 c16302) {
        C16302 c16303 = c16302.f47915;
        C16302 c16304 = c16302.f47917;
        C16302 c16305 = c16304.f47915;
        C16302 c16306 = c16304.f47917;
        c16302.f47917 = c16305;
        if (c16305 != null) {
            c16305.f47919 = c16302;
        }
        m54935(c16302, c16304);
        c16304.f47915 = c16302;
        c16302.f47919 = c16304;
        int iMax = Math.max(c16303 != null ? c16303.f47922 : 0, c16305 != null ? c16305.f47922 : 0) + 1;
        c16302.f47922 = iMax;
        c16304.f47922 = Math.max(iMax, c16306 != null ? c16306.f47922 : 0) + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m54936(C16302 c16302) {
        C16302 c16303 = c16302.f47915;
        C16302 c16304 = c16302.f47917;
        C16302 c16305 = c16303.f47915;
        C16302 c16306 = c16303.f47917;
        c16302.f47915 = c16306;
        if (c16306 != null) {
            c16306.f47919 = c16302;
        }
        m54935(c16302, c16303);
        c16303.f47917 = c16302;
        c16302.f47919 = c16303;
        int iMax = Math.max(c16304 != null ? c16304.f47922 : 0, c16306 != null ? c16306.f47922 : 0) + 1;
        c16302.f47922 = iMax;
        c16303.f47922 = Math.max(iMax, c16305 != null ? c16305.f47922 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C12951 c12951 = this.f79874;
        if (c12951 != null) {
            return c12951;
        }
        C12951 c12952 = new C12951(this);
        this.f79874 = c12952;
        return c12952;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C19656 c19656 = this.f79869;
        if (c19656 != null) {
            return c19656;
        }
        C19656 c19657 = new C19656(this);
        this.f79869 = c19657;
        return c19657;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
