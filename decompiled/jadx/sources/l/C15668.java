package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15668 extends AbstractC3675 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C15668 f48229 = new C15668("");

    public final String toString() {
        return "-∞";
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫ */
    public final int compareTo(AbstractC3675 abstractC3675) {
        return abstractC3675 == this ? 0 : -1;
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7489(Comparable comparable) {
        return true;
    }

    @Override // l.AbstractC3675, java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((AbstractC3675) obj) == this ? 0 : -1;
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫ */
    public final Comparable mo11188() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ۧ */
    public final EnumC3717 mo7490() {
        throw new IllegalStateException();
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ܿ */
    public final EnumC3717 mo7492() {
        throw new AssertionError("this statement should be unreachable");
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫ */
    public final void mo7488(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ۧ */
    public final void mo7491(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3675 mo11189(AbstractC19198 abstractC19198) {
        try {
            abstractC19198.getClass();
            return new C2264(Integer.MIN_VALUE);
        } catch (NoSuchElementException unused) {
            return this;
        }
    }

    @Override // l.AbstractC3675
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    private Object readResolve() {
        return f48229;
    }
}
