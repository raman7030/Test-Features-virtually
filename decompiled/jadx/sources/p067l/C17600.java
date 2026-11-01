package p067l;

/* JADX INFO: renamed from: l.ܺܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: JJ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17600 extends Number implements Comparable {
    public static final long serialVersionUID = 62986528375L;

    /* JADX INFO: renamed from: ᩸ */
    public long f52609;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f52609;
        long j2 = ((C17600) obj).f52609;
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public final Long getValue() {
        return Long.valueOf(this.f52609);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40081(Long l2) {
        this.f52609 = l2.longValue() + this.f52609;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f52609;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f52609;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f52609;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f52609;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17600) && this.f52609 == ((C17600) obj).f52609;
    }

    public final int hashCode() {
        long j = this.f52609;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return String.valueOf(this.f52609);
    }
}
