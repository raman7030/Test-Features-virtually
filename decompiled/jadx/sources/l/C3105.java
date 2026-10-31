package l;

/* JADX INFO: renamed from: l.ۗ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y23S */
/* JADX INFO: loaded from: classes2.dex */
public final class C3105 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9468(C22155 c22155) {
        return m9469(c22155, true) + m9469(c22155, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9469(C22155 c22155, boolean z) {
        int iM49773 = z ? c22155.m49773() : c22155.m49774();
        int iM49774 = z ? c22155.m49774() : c22155.m49773();
        byte[][] bArrM49772 = c22155.m49772();
        int i = 0;
        for (int i2 = 0; i2 < iM49773; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iM49774; i4++) {
                byte b2 = z ? bArrM49772[i2][i4] : bArrM49772[i4][i2];
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
