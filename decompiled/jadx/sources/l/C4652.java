package l;

/* JADX INFO: renamed from: l.ۙ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4652 {
    public static final C4652 c = new C4652();
    public final boolean a;
    public final double b;

    public C4652() {
        this.a = false;
        this.b = Double.NaN;
    }

    public C4652(double d) {
        this.a = true;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4652)) {
            return false;
        }
        C4652 c4652 = (C4652) obj;
        boolean z = c4652.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return Double.compare(this.b, c4652.b) == 0;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.b + "]";
    }
}
