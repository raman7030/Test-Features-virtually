package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܳܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16302 implements Map.Entry {

    /* JADX INFO: renamed from: ۗ */
    public C16302 f47914;

    /* JADX INFO: renamed from: ۙ */
    public C16302 f47915;

    /* JADX INFO: renamed from: ۛ */
    public Object f47916;

    /* JADX INFO: renamed from: ۤ */
    public C16302 f47917;

    /* JADX INFO: renamed from: ۫ */
    public C16302 f47918;

    /* JADX INFO: renamed from: ۬ */
    public C16302 f47919;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f47920;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f47921;

    /* JADX INFO: renamed from: ᩹ */
    public int f47922;

    public C16302(boolean z) {
        this.f47920 = null;
        this.f47921 = z;
        this.f47918 = this;
        this.f47914 = this;
    }

    public C16302(boolean z, C16302 c16302, Object obj, C16302 c16303, C16302 c16304) {
        this.f47919 = c16302;
        this.f47920 = obj;
        this.f47921 = z;
        this.f47922 = 1;
        this.f47914 = c16303;
        this.f47918 = c16304;
        c16304.f47914 = this;
        c16303.f47918 = this;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f47920;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f47916;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f47921) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f47916;
        this.f47916 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f47920;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f47916;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f47920;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f47916;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f47920 + "=" + this.f47916;
    }
}
