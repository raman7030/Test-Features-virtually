package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y65K */
/* JADX INFO: loaded from: classes4.dex */
public final class C14774 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public static final C14774 f42115 = new C14774();

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // p067l.AbstractC12093
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12093 mo24451() {
        return C10634.f29411;
    }

    private Object readResolve() {
        return f42115;
    }
}
