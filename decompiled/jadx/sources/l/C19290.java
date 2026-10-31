package l;

/* JADX INFO: renamed from: l.᩵ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19290 extends AbstractC5178 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f60696;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f60696 - ((C19290) obj).f60696;
    }

    public C19290() {
        this.f60696 = 0;
    }

    public C19290(int i) {
        this.f60696 = i;
    }

    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515) {
        return abstractC18809.mo24565(this.f60696);
    }

    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC5178 mo11420(AbstractC18809 abstractC18809, C19515 c19515) {
        if (abstractC18809.mo24565(this.f60696)) {
            return C2356.f7548;
        }
        return null;
    }

    public final int hashCode() {
        return this.f60696 + 31;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19290) {
            return this == obj || this.f60696 == ((C19290) obj).f60696;
        }
        return false;
    }

    public final String toString() {
        return C3200.m9831(this.f60696, ">=prec}?", new StringBuilder("{"));
    }
}
