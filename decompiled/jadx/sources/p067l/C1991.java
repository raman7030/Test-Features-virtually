package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩴ */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1991 implements Map.Entry {

    /* JADX INFO: renamed from: ۙ */
    public final Object f77196;

    /* JADX INFO: renamed from: ᩶ */
    public C1991 f77197;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f77198;

    /* JADX INFO: renamed from: ᩹ */
    public C1991 f77199;

    public C1991(Object obj, Object obj2) {
        this.f77198 = obj;
        this.f77196 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f77198;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f77196;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f77198 + "=" + this.f77196;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1991)) {
            return false;
        }
        C1991 c1991 = (C1991) obj;
        return this.f77198.equals(c1991.f77198) && this.f77196.equals(c1991.f77196);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f77198.hashCode() ^ this.f77196.hashCode();
    }
}
