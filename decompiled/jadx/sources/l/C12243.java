package l;

/* JADX INFO: renamed from: l.۫ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12243 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f36496 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f36495 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12948 m29741(C16302 c16302, boolean z) {
        int iM38343 = c16302.m38343(5);
        if (iM38343 == 31) {
            iM38343 = c16302.m38343(6) + 32;
        }
        int iM29740 = m29740(c16302);
        int iM38344 = c16302.m38343(4);
        String strM44628 = C19370.m44628(iM38343, "mp4a.40.");
        if (iM38343 == 5 || iM38343 == 29) {
            iM29740 = m29740(c16302);
            int iM38345 = c16302.m38343(5);
            if (iM38345 == 31) {
                iM38345 = c16302.m38343(6) + 32;
            }
            iM38343 = iM38345;
            if (iM38343 == 22) {
                iM38344 = c16302.m38343(4);
            }
        }
        if (z) {
            if (iM38343 != 1 && iM38343 != 2 && iM38343 != 3 && iM38343 != 4 && iM38343 != 6 && iM38343 != 7 && iM38343 != 17) {
                switch (iM38343) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C9080.m23441("Unsupported audio object type: " + iM38343);
                }
            }
            if (c16302.m38352()) {
                C19956.m46037("Unexpected frameLengthFlag = 1");
            }
            if (c16302.m38352()) {
                c16302.m38351(14);
            }
            boolean zM38352 = c16302.m38352();
            if (iM38344 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM38343 == 6 || iM38343 == 20) {
                c16302.m38351(3);
            }
            if (zM38352) {
                if (iM38343 == 22) {
                    c16302.m38351(16);
                }
                if (iM38343 == 17 || iM38343 == 19 || iM38343 == 20 || iM38343 == 23) {
                    c16302.m38351(3);
                }
                c16302.m38351(1);
            }
            switch (iM38343) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM38346 = c16302.m38343(2);
                    if (iM38346 == 2 || iM38346 == 3) {
                        throw C9080.m23441("Unsupported epConfig: " + iM38346);
                    }
                    break;
            }
        }
        int i = f36495[iM38344];
        if (i != -1) {
            return new C12948(iM29740, i, strM44628);
        }
        throw C9080.m23440((String) null, (Throwable) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29740(C16302 c16302) throws C9080 {
        int iM38343 = c16302.m38343(4);
        if (iM38343 == 15) {
            if (c16302.m38339() < 24) {
                throw C9080.m23440("AAC header insufficient data", (Throwable) null);
            }
            return c16302.m38343(24);
        }
        if (iM38343 < 13) {
            return f36496[iM38343];
        }
        throw C9080.m23440("AAC header wrong Sampling Frequency Index", (Throwable) null);
    }
}
