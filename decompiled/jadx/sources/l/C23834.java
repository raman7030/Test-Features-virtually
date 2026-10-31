package l;

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
public final class C23834 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Comparator f77117 = new C7627();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18190 f77118;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14661 f77119;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f77120;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14661 f77121;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f77122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11135 f77123;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f77124;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Comparator f77125;

    public C23834() {
        this(true);
    }

    public C23834(boolean z) {
        this.f77120 = 0;
        this.f77122 = 0;
        this.f77125 = f77117;
        this.f77124 = z;
        this.f77119 = new C14661(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f77120;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f77124) {
            throw new NullPointerException("value == null");
        }
        C14661 c14661M52529 = m52529(obj, true);
        Object obj3 = c14661M52529.f44806;
        c14661M52529.f44806 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f77121 = null;
        this.f77120 = 0;
        this.f77122++;
        C14661 c14661 = this.f77119;
        c14661.f44808 = c14661;
        c14661.f44804 = c14661;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14661 m52529(Object obj, boolean z) {
        int iCompare;
        C14661 c14661;
        C14661 c14662 = this.f77121;
        Comparator comparator = f77117;
        Comparator comparator2 = this.f77125;
        if (c14662 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c14662.f44810;
                if (comparable != null) {
                    iCompare = comparable.compareTo(obj2);
                } else {
                    iCompare = comparator2.compare(obj, obj2);
                }
                if (iCompare == 0) {
                    return c14662;
                }
                C14661 c14663 = iCompare < 0 ? c14662.f44805 : c14662.f44807;
                if (c14663 == null) {
                    break;
                }
                c14662 = c14663;
            }
        } else {
            iCompare = 0;
        }
        if (!z) {
            return null;
        }
        C14661 c14664 = this.f77119;
        if (c14662 == null) {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c14661 = new C14661(this.f77124, c14662, obj, c14664, c14664.f44808);
            this.f77121 = c14661;
        } else {
            c14661 = new C14661(this.f77124, c14662, obj, c14664, c14664.f44808);
            if (iCompare < 0) {
                c14662.f44805 = c14661;
            } else {
                c14662.f44807 = c14661;
            }
            m52528(c14662, true);
        }
        this.f77120++;
        this.f77122++;
        return c14661;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C14661 c14661M52529 = null;
        if (obj != null) {
            try {
                c14661M52529 = m52529(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c14661M52529 != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C14661 c14661M52529;
        if (obj != null) {
            try {
                c14661M52529 = m52529(obj, false);
            } catch (ClassCastException unused) {
                c14661M52529 = null;
            }
        } else {
            c14661M52529 = null;
        }
        if (c14661M52529 != null) {
            return c14661M52529.f44806;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        C14661 c14661M52529;
        if (obj != null) {
            try {
                c14661M52529 = m52529(obj, false);
            } catch (ClassCastException unused) {
                c14661M52529 = null;
            }
        } else {
            c14661M52529 = null;
        }
        if (c14661M52529 != null) {
            m52530(c14661M52529, true);
        }
        if (c14661M52529 != null) {
            return c14661M52529.f44806;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52530(C14661 c14661, boolean z) {
        int i;
        if (z) {
            C14661 c14662 = c14661.f44808;
            c14662.f44804 = c14661.f44804;
            c14661.f44804.f44808 = c14662;
        }
        C14661 c14663 = c14661.f44805;
        C14661 c14664 = c14661.f44807;
        C14661 c14665 = c14661.f44809;
        int i2 = 0;
        if (c14663 != null && c14664 != null) {
            if (c14663.f44812 <= c14664.f44812) {
                for (C14661 c14666 = c14664.f44805; c14666 != null; c14666 = c14666.f44805) {
                    c14664 = c14666;
                }
            } else {
                C14661 c14667 = c14663.f44807;
                while (true) {
                    C14661 c14668 = c14667;
                    c14664 = c14663;
                    c14663 = c14668;
                    if (c14663 == null) {
                        break;
                    } else {
                        c14667 = c14663.f44807;
                    }
                }
            }
            m52530(c14664, false);
            C14661 c14669 = c14661.f44805;
            if (c14669 != null) {
                i = c14669.f44812;
                c14664.f44805 = c14669;
                c14669.f44809 = c14664;
                c14661.f44805 = null;
            } else {
                i = 0;
            }
            C14661 c146610 = c14661.f44807;
            if (c146610 != null) {
                i2 = c146610.f44812;
                c14664.f44807 = c146610;
                c146610.f44809 = c14664;
                c14661.f44807 = null;
            }
            c14664.f44812 = Math.max(i, i2) + 1;
            m52526(c14661, c14664);
            return;
        }
        if (c14663 != null) {
            m52526(c14661, c14663);
            c14661.f44805 = null;
        } else if (c14664 != null) {
            m52526(c14661, c14664);
            c14661.f44807 = null;
        } else {
            m52526(c14661, (C14661) null);
        }
        m52528(c14665, false);
        this.f77120--;
        this.f77122++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52526(C14661 c14661, C14661 c14662) {
        C14661 c14663 = c14661.f44809;
        c14661.f44809 = null;
        if (c14662 != null) {
            c14662.f44809 = c14663;
        }
        if (c14663 != null) {
            if (c14663.f44805 == c14661) {
                c14663.f44805 = c14662;
                return;
            } else {
                c14663.f44807 = c14662;
                return;
            }
        }
        this.f77121 = c14662;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52528(C14661 c14661, boolean z) {
        while (c14661 != null) {
            C14661 c14662 = c14661.f44805;
            C14661 c14663 = c14661.f44807;
            int i = c14662 != null ? c14662.f44812 : 0;
            int i2 = c14663 != null ? c14663.f44812 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C14661 c14664 = c14663.f44805;
                C14661 c14665 = c14663.f44807;
                int i4 = (c14664 != null ? c14664.f44812 : 0) - (c14665 != null ? c14665.f44812 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m52525(c14661);
                } else {
                    m52527(c14663);
                    m52525(c14661);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C14661 c14666 = c14662.f44805;
                C14661 c14667 = c14662.f44807;
                int i5 = (c14666 != null ? c14666.f44812 : 0) - (c14667 != null ? c14667.f44812 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m52527(c14661);
                } else {
                    m52525(c14662);
                    m52527(c14661);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c14661.f44812 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c14661.f44812 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c14661 = c14661.f44809;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52525(C14661 c14661) {
        C14661 c14662 = c14661.f44805;
        C14661 c14663 = c14661.f44807;
        C14661 c14664 = c14663.f44805;
        C14661 c14665 = c14663.f44807;
        c14661.f44807 = c14664;
        if (c14664 != null) {
            c14664.f44809 = c14661;
        }
        m52526(c14661, c14663);
        c14663.f44805 = c14661;
        c14661.f44809 = c14663;
        int iMax = Math.max(c14662 != null ? c14662.f44812 : 0, c14664 != null ? c14664.f44812 : 0) + 1;
        c14661.f44812 = iMax;
        c14663.f44812 = Math.max(iMax, c14665 != null ? c14665.f44812 : 0) + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52527(C14661 c14661) {
        C14661 c14662 = c14661.f44805;
        C14661 c14663 = c14661.f44807;
        C14661 c14664 = c14662.f44805;
        C14661 c14665 = c14662.f44807;
        c14661.f44805 = c14665;
        if (c14665 != null) {
            c14665.f44809 = c14661;
        }
        m52526(c14661, c14662);
        c14662.f44807 = c14661;
        c14661.f44809 = c14662;
        int iMax = Math.max(c14663 != null ? c14663.f44812 : 0, c14665 != null ? c14665.f44812 : 0) + 1;
        c14661.f44812 = iMax;
        c14662.f44812 = Math.max(iMax, c14664 != null ? c14664.f44812 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C11135 c11135 = this.f77123;
        if (c11135 != null) {
            return c11135;
        }
        C11135 c11136 = new C11135(this);
        this.f77123 = c11136;
        return c11136;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C18190 c18190 = this.f77118;
        if (c18190 != null) {
            return c18190;
        }
        C18190 c18191 = new C18190(this);
        this.f77118 = c18191;
        return c18191;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
