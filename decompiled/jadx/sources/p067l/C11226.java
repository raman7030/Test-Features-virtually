package p067l;

/* JADX INFO: renamed from: l.ۢۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11226 extends AbstractC5861 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹ */
    public static final C11226 f31218 = new C11226("");

    public final String toString() {
        return "+∞";
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final int mo13147(AbstractC5861 abstractC5861) {
        return abstractC5861 == this ? 0 : 1;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9571(Comparable comparable) {
        return false;
    }

    @Override // p067l.AbstractC5861, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((AbstractC5861) obj) == this ? 0 : 1;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final Comparable mo13148() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ۧ */
    public final EnumC5901 mo9572() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ܿ */
    public final EnumC5901 mo9574() {
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final void mo9570(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ۧ */
    public final void mo9573(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // p067l.AbstractC5861
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    private Object readResolve() {
        return f31218;
    }
}
