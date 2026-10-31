package l;

/* JADX INFO: renamed from: l.֨ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1265 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f4481;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4482;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5499 f4483;

    public C1265(int i, int i2, C5499 c5499) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c5499.m43733()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f4481 = i;
        this.f4482 = i2;
        this.f4483 = c5499;
    }

    public final int hashCode() {
        return this.f4483.hashCode() + (((this.f4481 * 31) + this.f4482) * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1265) && compareTo((C1265) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1265 c1265) {
        int i = c1265.f4481;
        int i2 = this.f4481;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c1265.f4482;
        int i4 = this.f4482;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f4483.compareTo(c1265.f4483);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m4328() {
        return this.f4481;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4325() {
        return this.f4482;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5499 m4327() {
        return this.f4483;
    }
}
