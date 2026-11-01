package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17259 extends AbstractC5861 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹ */
    public static final C17259 f51368 = new C17259("");

    public final String toString() {
        return "-∞";
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(AbstractC5861 abstractC5861) {
        return abstractC5861 == this ? 0 : -1;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9571(Comparable comparable) {
        return true;
    }

    @Override // p067l.AbstractC5861, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((AbstractC5861) obj) == this ? 0 : -1;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final Comparable mo13148() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ۧ */
    public final EnumC5901 mo9572() {
        throw new IllegalStateException();
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ܿ */
    public final EnumC5901 mo9574() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final void mo9570(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ۧ */
    public final void mo9573(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5861 mo13149(AbstractC20614 abstractC20614) {
        try {
            abstractC20614.getClass();
            return new C4520(Integer.MIN_VALUE);
        } catch (NoSuchElementException unused) {
            return this;
        }
    }

    @Override // p067l.AbstractC5861
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    private Object readResolve() {
        return f51368;
    }
}
