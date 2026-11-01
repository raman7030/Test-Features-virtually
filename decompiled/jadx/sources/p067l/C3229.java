package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.֨ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3229 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public Object f6255;

    /* JADX INFO: renamed from: ᩸ */
    public final Comparable f6256;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22676 f6257;

    public C3229() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6256.compareTo(((C3229) obj).f6256);
    }

    public C3229(C22676 c22676, Comparable comparable, Object obj) {
        this.f6257 = c22676;
        this.f6256 = comparable;
        this.f6255 = obj;
    }

    @Override // java.util.Map.Entry
    public final Comparable getKey() {
        return this.f6256;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6256;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6255;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6257.m50760();
        Object obj2 = this.f6255;
        this.f6255 = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6256;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f6255;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6256;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6255;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return this.f6256 + "=" + this.f6255;
    }
}
