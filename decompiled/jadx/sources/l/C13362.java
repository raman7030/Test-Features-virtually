package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C13362 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10541 m32373(C17714 c17714) {
        c17714.m41478(1);
        int iM41491 = c17714.m41491();
        long jM41485 = ((long) c17714.m41485()) + ((long) iM41491);
        int i = iM41491 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM41487 = c17714.m41487();
            if (jM41487 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM41487;
            jArrCopyOf2[i2] = c17714.m41487();
            c17714.m41478(2);
        }
        c17714.m41478((int) (jM41485 - ((long) c17714.m41485())));
        return new C10541(jArrCopyOf, jArrCopyOf2);
    }
}
