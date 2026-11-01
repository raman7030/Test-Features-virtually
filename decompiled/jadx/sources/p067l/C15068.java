package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C15068 {
    /* JADX INFO: renamed from: ֫ */
    public static C12387 m34474(C19203 c19203) {
        c19203.m43724(1);
        int iM43737 = c19203.m43737();
        long jM43731 = ((long) c19203.m43731()) + ((long) iM43737);
        int i = iM43737 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM43733 = c19203.m43733();
            if (jM43733 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM43733;
            jArrCopyOf2[i2] = c19203.m43733();
            c19203.m43724(2);
        }
        c19203.m43724((int) (jM43731 - ((long) c19203.m43731())));
        return new C12387(jArrCopyOf, jArrCopyOf2);
    }
}
