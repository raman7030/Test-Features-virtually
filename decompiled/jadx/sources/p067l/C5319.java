package p067l;

/* JADX INFO: renamed from: l.ۗ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y23S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5319 {
    /* JADX INFO: renamed from: ֫ */
    public static int m11511(C23424 c23424) {
        return m11512(c23424, true) + m11512(c23424, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m11512(C23424 c23424, boolean z) {
        int iM52111 = z ? c23424.m52111() : c23424.m52112();
        int iM52112 = z ? c23424.m52112() : c23424.m52111();
        byte[][] bArrM52110 = c23424.m52110();
        int i = 0;
        for (int i2 = 0; i2 < iM52111; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iM52112; i4++) {
                byte b2 = z ? bArrM52110[i2][i4] : bArrM52110[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 2) + i;
            }
        }
        return i;
    }
}
