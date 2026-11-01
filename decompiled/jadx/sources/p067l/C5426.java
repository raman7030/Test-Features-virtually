package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4WR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5426 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public static final C5426 f12924 = new C5426();

    public final String toString() {
        return "Ordering.usingToString()";
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    private Object readResolve() {
        return f12924;
    }
}
