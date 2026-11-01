package p067l;

/* JADX INFO: renamed from: l.֨ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBEJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3571 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final int f7251;

    /* JADX INFO: renamed from: ᩸ */
    public final int f7252;

    /* JADX INFO: renamed from: ᩹ */
    public final C7595 f7253;

    public C3571(int i, int i2, C7595 c7595) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c7595.m46000()) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f7251 = i;
        this.f7252 = i2;
        this.f7253 = c7595;
    }

    public final int hashCode() {
        return this.f7253.hashCode() + (((this.f7251 * 31) + this.f7252) * 31);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3571) && compareTo((C3571) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3571 c3571) {
        int i = c3571.f7251;
        int i2 = this.f7251;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c3571.f7252;
        int i4 = this.f7252;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f7253.compareTo(c3571.f7253);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m6572() {
        return this.f7251;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m6569() {
        return this.f7252;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7595 m6571() {
        return this.f7253;
    }
}
