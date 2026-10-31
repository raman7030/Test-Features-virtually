package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܿۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5H5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17080 extends AbstractC10232 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparator f52383;

    public C17080(Comparator comparator) {
        comparator.getClass();
        this.f52383 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f52383.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17080) {
            return this.f52383.equals(((C17080) obj).f52383);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52383.hashCode();
    }

    public final String toString() {
        return this.f52383.toString();
    }
}
