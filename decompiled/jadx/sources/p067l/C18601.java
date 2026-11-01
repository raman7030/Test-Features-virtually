package p067l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܿۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18601 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Comparator f55565;

    public C18601(Comparator comparator) {
        comparator.getClass();
        this.f55565 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f55565.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18601) {
            return this.f55565.equals(((C18601) obj).f55565);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55565.hashCode();
    }

    public final String toString() {
        return this.f55565.toString();
    }
}
