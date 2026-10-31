package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C5R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4718 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13817(C3438 c3438, long j) throws IOException {
        if (j < 0) {
            c3438.getClass();
            c3438.write("-0x", 0, 3);
            c3438.mo10511(-j);
            if (j < -2147483648L) {
                c3438.write(76);
                return;
            }
            return;
        }
        c3438.getClass();
        c3438.write("0x", 0, 2);
        c3438.mo10511(j);
        if (j > 2147483647L) {
            c3438.write(76);
        }
    }
}
