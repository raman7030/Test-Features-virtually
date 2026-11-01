package p067l;

/* JADX INFO: renamed from: l.ۗ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5681 {
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m12663(C19203 c19203, C8363 c8363, int i, C7022 c7022) {
        int iM43731 = c19203.m43731();
        long jM43725 = c19203.m43725();
        long j = jM43725 >>> 16;
        if (j == i) {
            boolean z = (j & 1) == 1;
            int i2 = (int) ((jM43725 >> 12) & 15);
            int i3 = (int) ((jM43725 >> 8) & 15);
            int i4 = (int) (15 & (jM43725 >> 4));
            int i5 = (int) ((jM43725 >> 1) & 7);
            boolean z2 = (jM43725 & 1) == 1;
            if (i4 > 7 ? !(i4 > 10 || c8363.f22405 != 2) : i4 == c8363.f22405 - 1) {
                if ((i5 == 0 || i5 == c8363.f22402) && !z2) {
                    try {
                        long jM43722 = c19203.m43722();
                        if (!z) {
                            jM43722 *= (long) c8363.f22407;
                        }
                        c7022.f18293 = jM43722;
                        int iM12662 = m12662(i2, c19203);
                        if (iM12662 != -1 && iM12662 <= c8363.f22407) {
                            int i6 = c8363.f22408;
                            if (i3 == 0) {
                                if (c19203.m43702() == C5792.m12977(iM43731, c19203.m43731() - 1, c19203.m43728())) {
                                    return true;
                                }
                            } else if (i3 <= 11) {
                                if (i3 == c8363.f22401) {
                                    if (c19203.m43702() == C5792.m12977(iM43731, c19203.m43731() - 1, c19203.m43728())) {
                                        return true;
                                    }
                                }
                            } else if (i3 == 12) {
                                if (c19203.m43702() * 1000 == i6) {
                                    if (c19203.m43702() == C5792.m12977(iM43731, c19203.m43731() - 1, c19203.m43728())) {
                                        return true;
                                    }
                                }
                            } else if (i3 <= 14) {
                                int iM43710 = c19203.m43710();
                                if (i3 == 14) {
                                    iM43710 *= 10;
                                }
                                if (iM43710 == i6) {
                                    if (c19203.m43702() == C5792.m12977(iM43731, c19203.m43731() - 1, c19203.m43728())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m12662(int i, C19203 c19203) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c19203.m43702() + 1;
            case 7:
                return c19203.m43710() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
