package l;

import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ۚ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53F5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5666 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15977(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            throw new IllegalArgumentException(C18307.m42645(i, "x (", ") must be > 0"));
        }
        switch (C0726.f2735[roundingMode.ordinal()]) {
            case 1:
                C15542.m36642((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15978(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (C0726.f2735[roundingMode.ordinal()]) {
            case 1:
                C15542.m36642(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }
}
