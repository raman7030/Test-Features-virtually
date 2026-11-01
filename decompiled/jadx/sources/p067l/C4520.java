package p067l;

/* JADX INFO: renamed from: l.ۖۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75HT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4520 extends AbstractC5861 {
    public static final long serialVersionUID = 0;

    @Override // p067l.AbstractC5861, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((AbstractC5861) obj);
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9571(Comparable comparable) {
        int i = C15444.f44129;
        return this.f14414.compareTo(comparable) <= 0;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ۧ */
    public final EnumC5901 mo9572() {
        return EnumC5901.CLOSED;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ܿ */
    public final EnumC5901 mo9574() {
        return EnumC5901.OPEN;
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ֫ */
    public final void mo9570(StringBuilder sb) {
        sb.append('[');
        sb.append(this.f14414);
    }

    @Override // p067l.AbstractC5861
    /* JADX INFO: renamed from: ۧ */
    public final void mo9573(StringBuilder sb) {
        sb.append(this.f14414);
        sb.append(')');
    }

    @Override // p067l.AbstractC5861
    public final int hashCode() {
        return this.f14414.hashCode();
    }

    public final String toString() {
        return "\\" + this.f14414 + "/";
    }
}
