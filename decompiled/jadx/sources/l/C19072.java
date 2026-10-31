package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ᩴ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2N2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19072 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60053 = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m43937(double d) {
        boolean zM43936;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        C4025.m12109("x must be positive and finite", d > 0.0d && C19778.m45463(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return m43937(d * 4.503599627370496E15d) - 52;
        }
        switch (C4255.f13780[roundingMode.ordinal()]) {
            case 1:
                C15542.m36642(m43936(d));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !m43936(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zM43936 = m43936(d);
                z &= !zM43936;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zM43936 = m43936(d);
                z &= !zM43936;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0097, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m43934(double d, RoundingMode roundingMode) {
        double dRint;
        long j;
        boolean z;
        if (!C19778.m45463(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C4255.f13780[roundingMode.ordinal()]) {
            case 1:
                C15542.m36642(m43935(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 2:
                if (d >= 0.0d || m43935(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) - 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 3:
                if (d <= 0.0d || m43935(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) + 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 5:
                if (m43935(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + ((long) (d > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d) + d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43936(double d) {
        if (d > 0.0d && C19778.m45463(d)) {
            long jM45462 = C19778.m45462(d);
            if ((jM45462 & (jM45462 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43935(double d) {
        if (C19778.m45463(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(C19778.m45462(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
