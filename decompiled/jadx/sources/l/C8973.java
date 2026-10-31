package l;

/* JADX INFO: renamed from: l.ۡܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: IPI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8973 extends Number implements Comparable {
    public static final long serialVersionUID = 512176391864L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f27259;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f27259;
        int i2 = ((C8973) obj).f27259;
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public final Integer getValue() {
        return Integer.valueOf(this.f27259);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23181(int i) {
        this.f27259 = i;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f27259;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f27259;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f27259;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f27259;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8973) && this.f27259 == ((C8973) obj).f27259;
    }

    public final int hashCode() {
        return this.f27259;
    }

    public final String toString() {
        return String.valueOf(this.f27259);
    }
}
