package p067l;

/* JADX INFO: renamed from: l.᩷֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21884 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final int f68820;

    /* JADX INFO: renamed from: ᩹ */
    public final int f68821;

    public C21884(int i, int i2) {
        this.f68821 = i;
        this.f68820 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21884)) {
            return false;
        }
        C21884 c21884 = (C21884) obj;
        return this.f68821 == c21884.f68821 && this.f68820 == c21884.f68820;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f68821), Integer.valueOf(this.f68820));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C21884 c21884) {
        int iCompare = Integer.compare(this.f68821, c21884.f68821);
        return iCompare != 0 ? iCompare : Integer.compare(this.f68820, c21884.f68820);
    }
}
