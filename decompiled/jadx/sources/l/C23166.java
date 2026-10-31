package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23166 implements Map.Entry {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f74451;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23166 f74452;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f74453;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23166 f74454;

    public C23166(Object obj, Object obj2) {
        this.f74453 = obj;
        this.f74451 = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f74453;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f74451;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f74453 + "=" + this.f74451;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23166)) {
            return false;
        }
        C23166 c23166 = (C23166) obj;
        return this.f74453.equals(c23166.f74453) && this.f74451.equals(c23166.f74451);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f74453.hashCode() ^ this.f74451.hashCode();
    }
}
