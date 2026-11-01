package p067l;

/* JADX INFO: renamed from: l.ۡܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: IPI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10896 extends Number implements Comparable {
    public static final long serialVersionUID = 512176391864L;

    /* JADX INFO: renamed from: ᩸ */
    public int f30194;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i = this.f30194;
        int i2 = ((C10896) obj).f30194;
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    public final Integer getValue() {
        return Integer.valueOf(this.f30194);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25125(int i) {
        this.f30194 = i;
    }

    @Override // java.lang.Number
    public final int intValue() {
        return this.f30194;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f30194;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f30194;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f30194;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10896) && this.f30194 == ((C10896) obj).f30194;
    }

    public final int hashCode() {
        return this.f30194;
    }

    public final String toString() {
        return String.valueOf(this.f30194);
    }
}
