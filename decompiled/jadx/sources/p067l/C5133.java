package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5133 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f12067;

    static {
        int[] iArrCopyOf = new int[1024];
        int i = 0;
        for (int i2 = 65536; i2 <= 1114111; i2++) {
            int upperCase = Character.toUpperCase(i2);
            if (upperCase != i2 || Character.toLowerCase(upperCase) != i2) {
                if (i == iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
                }
                iArrCopyOf[i] = i2;
                i++;
            }
        }
        f12067 = Arrays.copyOf(iArrCopyOf, i);
    }
}
