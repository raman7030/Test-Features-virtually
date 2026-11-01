package p067l;

/* JADX INFO: renamed from: l.᩵ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20701 extends AbstractC7289 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final int f63926;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f63926 - ((C20701) obj).f63926;
    }

    public C20701() {
        this.f63926 = 0;
    }

    public C20701(int i) {
        this.f63926 = i;
    }

    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3894(AbstractC20244 abstractC20244, C20915 c20915) {
        return abstractC20244.mo26579(this.f63926);
    }

    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7289 mo13356(AbstractC20244 abstractC20244, C20915 c20915) {
        if (abstractC20244.mo26579(this.f63926)) {
            return C4607.f10339;
        }
        return null;
    }

    public final int hashCode() {
        return this.f63926 + 31;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20701) {
            return this == obj || this.f63926 == ((C20701) obj).f63926;
        }
        return false;
    }

    public final String toString() {
        return C5410.m11876(this.f63926, ">=prec}?", new StringBuilder("{"));
    }
}
