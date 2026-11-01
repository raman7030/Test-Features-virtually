package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۡۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F542 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10634 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public static final C10634 f29411 = new C10634();

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // p067l.AbstractC12093
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24450(Object obj, Object obj2) {
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
        return f29411;
    }

    @Override // p067l.AbstractC12093
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12093 mo24451() {
        return C14774.f42115;
    }
}
