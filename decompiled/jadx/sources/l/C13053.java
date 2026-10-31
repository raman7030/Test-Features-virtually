package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y65K */
/* JADX INFO: loaded from: classes4.dex */
public final class C13053 extends AbstractC10232 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13053 f39070 = new C13053();

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

    @Override // l.AbstractC10232
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10232 mo22482() {
        return C8697.f26486;
    }

    private Object readResolve() {
        return f39070;
    }
}
