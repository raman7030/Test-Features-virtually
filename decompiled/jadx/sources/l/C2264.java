package l;

/* JADX INFO: renamed from: l.ۖۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2264 extends AbstractC3675 {
    public static final long serialVersionUID = 0;

    @Override // l.AbstractC3675, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC3675) obj);
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7489(Comparable comparable) {
        int i = C13758.f41051;
        return this.f11610.compareTo(comparable) <= 0;
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC3717 mo7490() {
        return EnumC3717.CLOSED;
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC3717 mo7492() {
        return EnumC3717.OPEN;
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7488(StringBuilder sb) {
        sb.append('[');
        sb.append(this.f11610);
    }

    @Override // l.AbstractC3675
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7491(StringBuilder sb) {
        sb.append(this.f11610);
        sb.append(')');
    }

    @Override // l.AbstractC3675
    public final int hashCode() {
        return this.f11610.hashCode();
    }

    public final String toString() {
        return "\\" + this.f11610 + "/";
    }
}
