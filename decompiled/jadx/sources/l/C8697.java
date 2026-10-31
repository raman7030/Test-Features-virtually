package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۡۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F542 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8697 extends AbstractC10232 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C8697 f26486 = new C8697();

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // l.AbstractC10232
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo22481(Object obj, Object obj2) {
        throw null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    private Object readResolve() {
        return f26486;
    }

    @Override // l.AbstractC10232
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10232 mo22482() {
        return C13053.f39070;
    }
}
