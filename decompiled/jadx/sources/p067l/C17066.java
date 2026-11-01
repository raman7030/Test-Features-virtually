package p067l;

/* JADX INFO: renamed from: l.ܶ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JAXP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17066 {
    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(0.0d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(0.0d);
        return (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "0.0..0.0";
    }

    public final boolean equals(Object obj) {
        return obj instanceof C17066;
    }
}
