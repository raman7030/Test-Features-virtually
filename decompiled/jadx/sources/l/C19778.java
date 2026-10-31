package l;

/* JADX INFO: renamed from: l.᩵᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2OW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19778 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m45462(double d) {
        C4025.m12109("not a normal value", m45463(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m45463(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
