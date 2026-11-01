package p067l;

/* JADX INFO: renamed from: l.᩵᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2OW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21166 {
    /* JADX INFO: renamed from: ֫ */
    public static long m47773(double d) {
        C6194.m14029("not a normal value", m47774(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m47774(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
