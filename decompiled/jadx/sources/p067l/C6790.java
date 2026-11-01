package p067l;

/* JADX INFO: renamed from: l.ۙ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6790 {

    /* JADX INFO: renamed from: c */
    public static final C6790 f17582c = new C6790();

    /* JADX INFO: renamed from: a */
    public final boolean f17583a;

    /* JADX INFO: renamed from: b */
    public final double f17584b;

    public C6790() {
        this.f17583a = false;
        this.f17584b = Double.NaN;
    }

    public C6790(double d) {
        this.f17583a = true;
        this.f17584b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6790)) {
            return false;
        }
        C6790 c6790 = (C6790) obj;
        boolean z = c6790.f17583a;
        boolean z2 = this.f17583a;
        if (z2 && z) {
            return Double.compare(this.f17584b, c6790.f17584b) == 0;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.f17583a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f17584b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f17583a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f17584b + "]";
    }
}
