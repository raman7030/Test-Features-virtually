package l;

/* JADX INFO: renamed from: l.ۚ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: L2ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5231 extends AbstractC2614 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C5231 f16384 = new C5231();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // l.AbstractC2614
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8254(AbstractC21315 abstractC21315) {
        return abstractC21315;
    }

    private Object readResolve() {
        return f16384;
    }
}
