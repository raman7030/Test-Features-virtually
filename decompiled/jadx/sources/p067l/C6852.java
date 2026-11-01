package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C5R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6852 {
    /* JADX INFO: renamed from: ֫ */
    public static void m15693(C5636 c5636, long j) throws IOException {
        if (j < 0) {
            c5636.getClass();
            c5636.write("-0x", 0, 3);
            c5636.mo12535(-j);
            if (j < -2147483648L) {
                c5636.write(76);
                return;
            }
            return;
        }
        c5636.getClass();
        c5636.write("0x", 0, 2);
        c5636.mo12535(j);
        if (j > 2147483647L) {
            c5636.write(76);
        }
    }
}
