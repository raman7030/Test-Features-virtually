package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.ۚ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AQD */
/* JADX INFO: loaded from: classes2.dex */
public final class C7671 {
    /* JADX INFO: renamed from: ֫ */
    public static int m17774(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (str.length() > 1 && str.charAt(0) == '+') {
                str = str.substring(1);
            }
            long j = Long.parseLong(str, 16);
            if ((4294967295L & j) == j) {
                return (int) j;
            }
            throw new NumberFormatException(C6988.m16053("Input ", str, " in base 16 is not in the range of an unsigned integer"));
        }
        int length = str.length();
        if (length <= 0) {
            throw new NumberFormatException(C6988.m16053("For input string: \"", str, "\""));
        }
        if (str.charAt(0) == '-') {
            throw new NumberFormatException(C6988.m16053("Illegal leading minus sign on unsigned string ", str, "."));
        }
        if (length <= 5) {
            return Integer.parseInt(str, 16);
        }
        long j2 = Long.parseLong(str, 16);
        if (((-4294967296L) & j2) == 0) {
            return (int) j2;
        }
        throw new NumberFormatException(C6988.m16053("String value ", str, " exceeds range of unsigned int."));
    }
}
