package l;

/* JADX INFO: renamed from: l.ۗ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68JC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3485 {
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10668(C17714 c17714, C6307 c6307, int i, C4896 c4896) {
        int iM41485 = c17714.m41485();
        long jM41479 = c17714.m41479();
        long j = jM41479 >>> 16;
        if (j == i) {
            boolean z = (j & 1) == 1;
            int i2 = (int) ((jM41479 >> 12) & 15);
            int i3 = (int) ((jM41479 >> 8) & 15);
            int i4 = (int) (15 & (jM41479 >> 4));
            int i5 = (int) ((jM41479 >> 1) & 7);
            boolean z2 = (jM41479 & 1) == 1;
            if (i4 > 7 ? !(i4 > 10 || c6307.f19534 != 2) : i4 == c6307.f19534 - 1) {
                if ((i5 == 0 || i5 == c6307.f19531) && !z2) {
                    try {
                        long jM41476 = c17714.m41476();
                        if (!z) {
                            jM41476 *= (long) c6307.f19536;
                        }
                        c4896.f15458 = jM41476;
                        int iM10667 = m10667(i2, c17714);
                        if (iM10667 != -1 && iM10667 <= c6307.f19536) {
                            int i6 = c6307.f19537;
                            if (i3 == 0) {
                                if (c17714.m41456() == C3603.m11001(iM41485, c17714.m41485() - 1, c17714.m41482())) {
                                    return true;
                                }
                            } else if (i3 <= 11) {
                                if (i3 == c6307.f19530) {
                                    if (c17714.m41456() == C3603.m11001(iM41485, c17714.m41485() - 1, c17714.m41482())) {
                                        return true;
                                    }
                                }
                            } else if (i3 == 12) {
                                if (c17714.m41456() * 1000 == i6) {
                                    if (c17714.m41456() == C3603.m11001(iM41485, c17714.m41485() - 1, c17714.m41482())) {
                                        return true;
                                    }
                                }
                            } else if (i3 <= 14) {
                                int iM41464 = c17714.m41464();
                                if (i3 == 14) {
                                    iM41464 *= 10;
                                }
                                if (iM41464 == i6) {
                                    if (c17714.m41456() == C3603.m11001(iM41485, c17714.m41485() - 1, c17714.m41482())) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10667(int i, C17714 c17714) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c17714.m41456() + 1;
            case 7:
                return c17714.m41464() + 1;
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
